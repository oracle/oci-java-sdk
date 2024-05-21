/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring;

import com.oracle.bmc.stackmonitoring.internal.http.*;
import com.oracle.bmc.stackmonitoring.requests.*;
import com.oracle.bmc.stackmonitoring.responses.*;

/**
 * Async client implementation for StackMonitoring service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public class StackMonitoringAsyncClient implements StackMonitoringAsync {
    /**
     * Service instance for StackMonitoring.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("STACKMONITORING")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://stack-monitoring.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(StackMonitoringAsyncClient.class);

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
    public StackMonitoringAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public StackMonitoringAsyncClient(
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
    public StackMonitoringAsyncClient(
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
    public StackMonitoringAsyncClient(
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
    public StackMonitoringAsyncClient(
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
    public StackMonitoringAsyncClient(
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
    public StackMonitoringAsyncClient(
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
    public StackMonitoringAsyncClient(
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
                            "StackMonitoringAsyncClient", "exportMetricExtension"));
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
                    Builder, StackMonitoringAsyncClient> {
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
        public StackMonitoringAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new StackMonitoringAsyncClient(
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
    public java.util.concurrent.Future<AssociateMonitoredResourcesResponse>
            associateMonitoredResources(
                    AssociateMonitoredResourcesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AssociateMonitoredResourcesRequest,
                                    AssociateMonitoredResourcesResponse>
                            handler) {
        LOG.trace("Called async associateMonitoredResources");
        final AssociateMonitoredResourcesRequest interceptedRequest =
                AssociateMonitoredResourcesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AssociateMonitoredResourcesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "AssociateMonitoredResources",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/AssociateMonitoredResources");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, AssociateMonitoredResourcesResponse>
                transformer =
                        AssociateMonitoredResourcesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AssociateMonitoredResourcesRequest, AssociateMonitoredResourcesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AssociateMonitoredResourcesRequest,
                                AssociateMonitoredResourcesResponse>,
                        java.util.concurrent.Future<AssociateMonitoredResourcesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAssociateMonitoredResourcesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AssociateMonitoredResourcesRequest, AssociateMonitoredResourcesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeConfigCompartmentResponse> changeConfigCompartment(
            ChangeConfigCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeConfigCompartmentRequest, ChangeConfigCompartmentResponse>
                    handler) {
        LOG.trace("Called async changeConfigCompartment");
        final ChangeConfigCompartmentRequest interceptedRequest =
                ChangeConfigCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeConfigCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "ChangeConfigCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/Config/ChangeConfigCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeConfigCompartmentResponse>
                transformer =
                        ChangeConfigCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeConfigCompartmentRequest, ChangeConfigCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeConfigCompartmentRequest, ChangeConfigCompartmentResponse>,
                        java.util.concurrent.Future<ChangeConfigCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeConfigCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeConfigCompartmentRequest, ChangeConfigCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeMetricExtensionCompartmentResponse>
            changeMetricExtensionCompartment(
                    ChangeMetricExtensionCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMetricExtensionCompartmentRequest,
                                    ChangeMetricExtensionCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeMetricExtensionCompartment");
        final ChangeMetricExtensionCompartmentRequest interceptedRequest =
                ChangeMetricExtensionCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeMetricExtensionCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "ChangeMetricExtensionCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MetricExtension/ChangeMetricExtensionCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeMetricExtensionCompartmentResponse>
                transformer =
                        ChangeMetricExtensionCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeMetricExtensionCompartmentRequest,
                        ChangeMetricExtensionCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeMetricExtensionCompartmentRequest,
                                ChangeMetricExtensionCompartmentResponse>,
                        java.util.concurrent.Future<ChangeMetricExtensionCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeMetricExtensionCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeMetricExtensionCompartmentRequest,
                    ChangeMetricExtensionCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeMonitoredResourceCompartmentResponse>
            changeMonitoredResourceCompartment(
                    ChangeMonitoredResourceCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMonitoredResourceCompartmentRequest,
                                    ChangeMonitoredResourceCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeMonitoredResourceCompartment");
        final ChangeMonitoredResourceCompartmentRequest interceptedRequest =
                ChangeMonitoredResourceCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeMonitoredResourceCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "ChangeMonitoredResourceCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/ChangeMonitoredResourceCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeMonitoredResourceCompartmentResponse>
                transformer =
                        ChangeMonitoredResourceCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeMonitoredResourceCompartmentRequest,
                        ChangeMonitoredResourceCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeMonitoredResourceCompartmentRequest,
                                ChangeMonitoredResourceCompartmentResponse>,
                        java.util.concurrent.Future<ChangeMonitoredResourceCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeMonitoredResourceCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeMonitoredResourceCompartmentRequest,
                    ChangeMonitoredResourceCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeMonitoredResourceTaskCompartmentResponse>
            changeMonitoredResourceTaskCompartment(
                    ChangeMonitoredResourceTaskCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMonitoredResourceTaskCompartmentRequest,
                                    ChangeMonitoredResourceTaskCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeMonitoredResourceTaskCompartment");
        final ChangeMonitoredResourceTaskCompartmentRequest interceptedRequest =
                ChangeMonitoredResourceTaskCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeMonitoredResourceTaskCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "ChangeMonitoredResourceTaskCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResourceTask/ChangeMonitoredResourceTaskCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeMonitoredResourceTaskCompartmentResponse>
                transformer =
                        ChangeMonitoredResourceTaskCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeMonitoredResourceTaskCompartmentRequest,
                        ChangeMonitoredResourceTaskCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeMonitoredResourceTaskCompartmentRequest,
                                ChangeMonitoredResourceTaskCompartmentResponse>,
                        java.util.concurrent.Future<ChangeMonitoredResourceTaskCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeMonitoredResourceTaskCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeMonitoredResourceTaskCompartmentRequest,
                    ChangeMonitoredResourceTaskCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeProcessSetCompartmentResponse>
            changeProcessSetCompartment(
                    ChangeProcessSetCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeProcessSetCompartmentRequest,
                                    ChangeProcessSetCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeProcessSetCompartment");
        final ChangeProcessSetCompartmentRequest interceptedRequest =
                ChangeProcessSetCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeProcessSetCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "ChangeProcessSetCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/ProcessSet/ChangeProcessSetCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeProcessSetCompartmentResponse>
                transformer =
                        ChangeProcessSetCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeProcessSetCompartmentRequest, ChangeProcessSetCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeProcessSetCompartmentRequest,
                                ChangeProcessSetCompartmentResponse>,
                        java.util.concurrent.Future<ChangeProcessSetCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeProcessSetCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeProcessSetCompartmentRequest, ChangeProcessSetCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateBaselineableMetricResponse> createBaselineableMetric(
            CreateBaselineableMetricRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBaselineableMetricRequest, CreateBaselineableMetricResponse>
                    handler) {
        LOG.trace("Called async createBaselineableMetric");
        final CreateBaselineableMetricRequest interceptedRequest =
                CreateBaselineableMetricConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBaselineableMetricConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "CreateBaselineableMetric",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/BaselineableMetric/CreateBaselineableMetric");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateBaselineableMetricResponse>
                transformer =
                        CreateBaselineableMetricConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateBaselineableMetricRequest, CreateBaselineableMetricResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateBaselineableMetricRequest, CreateBaselineableMetricResponse>,
                        java.util.concurrent.Future<CreateBaselineableMetricResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateBaselineableMetricDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateBaselineableMetricRequest, CreateBaselineableMetricResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateConfigResponse> createConfig(
            CreateConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateConfigRequest, CreateConfigResponse>
                    handler) {
        LOG.trace("Called async createConfig");
        final CreateConfigRequest interceptedRequest =
                CreateConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "CreateConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/Config/CreateConfig");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateConfigResponse>
                transformer =
                        CreateConfigConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateConfigRequest, CreateConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateConfigRequest, CreateConfigResponse>,
                        java.util.concurrent.Future<CreateConfigResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateConfigDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateConfigRequest, CreateConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateDiscoveryJobResponse> createDiscoveryJob(
            CreateDiscoveryJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDiscoveryJobRequest, CreateDiscoveryJobResponse>
                    handler) {
        LOG.trace("Called async createDiscoveryJob");
        final CreateDiscoveryJobRequest interceptedRequest =
                CreateDiscoveryJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDiscoveryJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "CreateDiscoveryJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/DiscoveryJob/CreateDiscoveryJob");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateDiscoveryJobResponse>
                transformer =
                        CreateDiscoveryJobConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateDiscoveryJobRequest, CreateDiscoveryJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDiscoveryJobRequest, CreateDiscoveryJobResponse>,
                        java.util.concurrent.Future<CreateDiscoveryJobResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateDiscoveryJobDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDiscoveryJobRequest, CreateDiscoveryJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateMetricExtensionResponse> createMetricExtension(
            CreateMetricExtensionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMetricExtensionRequest, CreateMetricExtensionResponse>
                    handler) {
        LOG.trace("Called async createMetricExtension");
        final CreateMetricExtensionRequest interceptedRequest =
                CreateMetricExtensionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMetricExtensionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "CreateMetricExtension",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MetricExtension/CreateMetricExtension");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateMetricExtensionResponse>
                transformer =
                        CreateMetricExtensionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateMetricExtensionRequest, CreateMetricExtensionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMetricExtensionRequest, CreateMetricExtensionResponse>,
                        java.util.concurrent.Future<CreateMetricExtensionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateMetricExtensionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMetricExtensionRequest, CreateMetricExtensionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateMonitoredResourceResponse> createMonitoredResource(
            CreateMonitoredResourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMonitoredResourceRequest, CreateMonitoredResourceResponse>
                    handler) {
        LOG.trace("Called async createMonitoredResource");
        final CreateMonitoredResourceRequest interceptedRequest =
                CreateMonitoredResourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMonitoredResourceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "CreateMonitoredResource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/CreateMonitoredResource");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateMonitoredResourceResponse>
                transformer =
                        CreateMonitoredResourceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateMonitoredResourceRequest, CreateMonitoredResourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMonitoredResourceRequest, CreateMonitoredResourceResponse>,
                        java.util.concurrent.Future<CreateMonitoredResourceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateMonitoredResourceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMonitoredResourceRequest, CreateMonitoredResourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateMonitoredResourceTaskResponse>
            createMonitoredResourceTask(
                    CreateMonitoredResourceTaskRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateMonitoredResourceTaskRequest,
                                    CreateMonitoredResourceTaskResponse>
                            handler) {
        LOG.trace("Called async createMonitoredResourceTask");
        final CreateMonitoredResourceTaskRequest interceptedRequest =
                CreateMonitoredResourceTaskConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMonitoredResourceTaskConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "CreateMonitoredResourceTask",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResourceTask/CreateMonitoredResourceTask");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateMonitoredResourceTaskResponse>
                transformer =
                        CreateMonitoredResourceTaskConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateMonitoredResourceTaskRequest, CreateMonitoredResourceTaskResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMonitoredResourceTaskRequest,
                                CreateMonitoredResourceTaskResponse>,
                        java.util.concurrent.Future<CreateMonitoredResourceTaskResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateMonitoredResourceTaskDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMonitoredResourceTaskRequest, CreateMonitoredResourceTaskResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateMonitoredResourceTypeResponse>
            createMonitoredResourceType(
                    CreateMonitoredResourceTypeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateMonitoredResourceTypeRequest,
                                    CreateMonitoredResourceTypeResponse>
                            handler) {
        LOG.trace("Called async createMonitoredResourceType");
        final CreateMonitoredResourceTypeRequest interceptedRequest =
                CreateMonitoredResourceTypeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMonitoredResourceTypeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "CreateMonitoredResourceType",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResourceType/CreateMonitoredResourceType");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateMonitoredResourceTypeResponse>
                transformer =
                        CreateMonitoredResourceTypeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateMonitoredResourceTypeRequest, CreateMonitoredResourceTypeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMonitoredResourceTypeRequest,
                                CreateMonitoredResourceTypeResponse>,
                        java.util.concurrent.Future<CreateMonitoredResourceTypeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateMonitoredResourceTypeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMonitoredResourceTypeRequest, CreateMonitoredResourceTypeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateProcessSetResponse> createProcessSet(
            CreateProcessSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateProcessSetRequest, CreateProcessSetResponse>
                    handler) {
        LOG.trace("Called async createProcessSet");
        final CreateProcessSetRequest interceptedRequest =
                CreateProcessSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateProcessSetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "CreateProcessSet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/ProcessSet/CreateProcessSet");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateProcessSetResponse>
                transformer =
                        CreateProcessSetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateProcessSetRequest, CreateProcessSetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateProcessSetRequest, CreateProcessSetResponse>,
                        java.util.concurrent.Future<CreateProcessSetResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateProcessSetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateProcessSetRequest, CreateProcessSetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteBaselineableMetricResponse> deleteBaselineableMetric(
            DeleteBaselineableMetricRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBaselineableMetricRequest, DeleteBaselineableMetricResponse>
                    handler) {
        LOG.trace("Called async deleteBaselineableMetric");
        final DeleteBaselineableMetricRequest interceptedRequest =
                DeleteBaselineableMetricConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBaselineableMetricConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "DeleteBaselineableMetric",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/BaselineableMetric/DeleteBaselineableMetric");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteBaselineableMetricResponse>
                transformer =
                        DeleteBaselineableMetricConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteBaselineableMetricRequest, DeleteBaselineableMetricResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteBaselineableMetricRequest, DeleteBaselineableMetricResponse>,
                        java.util.concurrent.Future<DeleteBaselineableMetricResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteBaselineableMetricRequest, DeleteBaselineableMetricResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigResponse> deleteConfig(
            DeleteConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteConfigRequest, DeleteConfigResponse>
                    handler) {
        LOG.trace("Called async deleteConfig");
        final DeleteConfigRequest interceptedRequest =
                DeleteConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "DeleteConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/Config/DeleteConfig");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteConfigResponse>
                transformer =
                        DeleteConfigConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteConfigRequest, DeleteConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteConfigRequest, DeleteConfigResponse>,
                        java.util.concurrent.Future<DeleteConfigResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteConfigRequest, DeleteConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteDiscoveryJobResponse> deleteDiscoveryJob(
            DeleteDiscoveryJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDiscoveryJobRequest, DeleteDiscoveryJobResponse>
                    handler) {
        LOG.trace("Called async deleteDiscoveryJob");
        final DeleteDiscoveryJobRequest interceptedRequest =
                DeleteDiscoveryJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDiscoveryJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "DeleteDiscoveryJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/DiscoveryJob/DeleteDiscoveryJob");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteDiscoveryJobResponse>
                transformer =
                        DeleteDiscoveryJobConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteDiscoveryJobRequest, DeleteDiscoveryJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDiscoveryJobRequest, DeleteDiscoveryJobResponse>,
                        java.util.concurrent.Future<DeleteDiscoveryJobResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDiscoveryJobRequest, DeleteDiscoveryJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteMetricExtensionResponse> deleteMetricExtension(
            DeleteMetricExtensionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMetricExtensionRequest, DeleteMetricExtensionResponse>
                    handler) {
        LOG.trace("Called async deleteMetricExtension");
        final DeleteMetricExtensionRequest interceptedRequest =
                DeleteMetricExtensionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMetricExtensionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "DeleteMetricExtension",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MetricExtension/DeleteMetricExtension");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteMetricExtensionResponse>
                transformer =
                        DeleteMetricExtensionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteMetricExtensionRequest, DeleteMetricExtensionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMetricExtensionRequest, DeleteMetricExtensionResponse>,
                        java.util.concurrent.Future<DeleteMetricExtensionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMetricExtensionRequest, DeleteMetricExtensionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteMonitoredResourceResponse> deleteMonitoredResource(
            DeleteMonitoredResourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMonitoredResourceRequest, DeleteMonitoredResourceResponse>
                    handler) {
        LOG.trace("Called async deleteMonitoredResource");
        final DeleteMonitoredResourceRequest interceptedRequest =
                DeleteMonitoredResourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMonitoredResourceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "DeleteMonitoredResource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/DeleteMonitoredResource");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteMonitoredResourceResponse>
                transformer =
                        DeleteMonitoredResourceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteMonitoredResourceRequest, DeleteMonitoredResourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMonitoredResourceRequest, DeleteMonitoredResourceResponse>,
                        java.util.concurrent.Future<DeleteMonitoredResourceResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMonitoredResourceRequest, DeleteMonitoredResourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteMonitoredResourceTypeResponse>
            deleteMonitoredResourceType(
                    DeleteMonitoredResourceTypeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteMonitoredResourceTypeRequest,
                                    DeleteMonitoredResourceTypeResponse>
                            handler) {
        LOG.trace("Called async deleteMonitoredResourceType");
        final DeleteMonitoredResourceTypeRequest interceptedRequest =
                DeleteMonitoredResourceTypeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMonitoredResourceTypeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "DeleteMonitoredResourceType",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResourceType/DeleteMonitoredResourceType");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteMonitoredResourceTypeResponse>
                transformer =
                        DeleteMonitoredResourceTypeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteMonitoredResourceTypeRequest, DeleteMonitoredResourceTypeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMonitoredResourceTypeRequest,
                                DeleteMonitoredResourceTypeResponse>,
                        java.util.concurrent.Future<DeleteMonitoredResourceTypeResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMonitoredResourceTypeRequest, DeleteMonitoredResourceTypeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteProcessSetResponse> deleteProcessSet(
            DeleteProcessSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteProcessSetRequest, DeleteProcessSetResponse>
                    handler) {
        LOG.trace("Called async deleteProcessSet");
        final DeleteProcessSetRequest interceptedRequest =
                DeleteProcessSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteProcessSetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "DeleteProcessSet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/ProcessSet/DeleteProcessSet");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteProcessSetResponse>
                transformer =
                        DeleteProcessSetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteProcessSetRequest, DeleteProcessSetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteProcessSetRequest, DeleteProcessSetResponse>,
                        java.util.concurrent.Future<DeleteProcessSetResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteProcessSetRequest, DeleteProcessSetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableExternalDatabaseResponse> disableExternalDatabase(
            DisableExternalDatabaseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DisableExternalDatabaseRequest, DisableExternalDatabaseResponse>
                    handler) {
        LOG.trace("Called async disableExternalDatabase");
        final DisableExternalDatabaseRequest interceptedRequest =
                DisableExternalDatabaseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableExternalDatabaseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "DisableExternalDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/DisableExternalDatabase");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DisableExternalDatabaseResponse>
                transformer =
                        DisableExternalDatabaseConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DisableExternalDatabaseRequest, DisableExternalDatabaseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableExternalDatabaseRequest, DisableExternalDatabaseResponse>,
                        java.util.concurrent.Future<DisableExternalDatabaseResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableExternalDatabaseRequest, DisableExternalDatabaseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisableMetricExtensionResponse> disableMetricExtension(
            DisableMetricExtensionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DisableMetricExtensionRequest, DisableMetricExtensionResponse>
                    handler) {
        LOG.trace("Called async disableMetricExtension");
        final DisableMetricExtensionRequest interceptedRequest =
                DisableMetricExtensionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisableMetricExtensionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "DisableMetricExtension",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MetricExtension/DisableMetricExtension");
        final java.util.function.Function<javax.ws.rs.core.Response, DisableMetricExtensionResponse>
                transformer =
                        DisableMetricExtensionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DisableMetricExtensionRequest, DisableMetricExtensionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisableMetricExtensionRequest, DisableMetricExtensionResponse>,
                        java.util.concurrent.Future<DisableMetricExtensionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDisableMetricExtensionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisableMetricExtensionRequest, DisableMetricExtensionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DisassociateMonitoredResourcesResponse>
            disassociateMonitoredResources(
                    DisassociateMonitoredResourcesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DisassociateMonitoredResourcesRequest,
                                    DisassociateMonitoredResourcesResponse>
                            handler) {
        LOG.trace("Called async disassociateMonitoredResources");
        final DisassociateMonitoredResourcesRequest interceptedRequest =
                DisassociateMonitoredResourcesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DisassociateMonitoredResourcesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "DisassociateMonitoredResources",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/DisassociateMonitoredResources");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DisassociateMonitoredResourcesResponse>
                transformer =
                        DisassociateMonitoredResourcesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DisassociateMonitoredResourcesRequest,
                        DisassociateMonitoredResourcesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DisassociateMonitoredResourcesRequest,
                                DisassociateMonitoredResourcesResponse>,
                        java.util.concurrent.Future<DisassociateMonitoredResourcesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDisassociateMonitoredResourcesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DisassociateMonitoredResourcesRequest, DisassociateMonitoredResourcesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EnableMetricExtensionResponse> enableMetricExtension(
            EnableMetricExtensionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EnableMetricExtensionRequest, EnableMetricExtensionResponse>
                    handler) {
        LOG.trace("Called async enableMetricExtension");
        final EnableMetricExtensionRequest interceptedRequest =
                EnableMetricExtensionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableMetricExtensionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "EnableMetricExtension",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MetricExtension/EnableMetricExtension");
        final java.util.function.Function<javax.ws.rs.core.Response, EnableMetricExtensionResponse>
                transformer =
                        EnableMetricExtensionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        EnableMetricExtensionRequest, EnableMetricExtensionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EnableMetricExtensionRequest, EnableMetricExtensionResponse>,
                        java.util.concurrent.Future<EnableMetricExtensionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getEnableMetricExtensionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EnableMetricExtensionRequest, EnableMetricExtensionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<EvaluateBaselineableMetricResponse>
            evaluateBaselineableMetric(
                    EvaluateBaselineableMetricRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    EvaluateBaselineableMetricRequest,
                                    EvaluateBaselineableMetricResponse>
                            handler) {
        LOG.trace("Called async evaluateBaselineableMetric");
        final EvaluateBaselineableMetricRequest interceptedRequest =
                EvaluateBaselineableMetricConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EvaluateBaselineableMetricConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "EvaluateBaselineableMetric",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/BaselineableMetric/EvaluateBaselineableMetric");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, EvaluateBaselineableMetricResponse>
                transformer =
                        EvaluateBaselineableMetricConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        EvaluateBaselineableMetricRequest, EvaluateBaselineableMetricResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                EvaluateBaselineableMetricRequest,
                                EvaluateBaselineableMetricResponse>,
                        java.util.concurrent.Future<EvaluateBaselineableMetricResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getEvaluateBaselineableMetricDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    EvaluateBaselineableMetricRequest, EvaluateBaselineableMetricResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ExportMetricExtensionResponse> exportMetricExtension(
            ExportMetricExtensionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ExportMetricExtensionRequest, ExportMetricExtensionResponse>
                    handler) {
        LOG.trace("Called async exportMetricExtension");
        final ExportMetricExtensionRequest interceptedRequest =
                ExportMetricExtensionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ExportMetricExtensionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "ExportMetricExtension",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MetricExtension/ExportMetricExtension");
        final java.util.function.Function<javax.ws.rs.core.Response, ExportMetricExtensionResponse>
                transformer =
                        ExportMetricExtensionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ExportMetricExtensionRequest, ExportMetricExtensionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ExportMetricExtensionRequest, ExportMetricExtensionResponse>,
                        java.util.concurrent.Future<ExportMetricExtensionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ExportMetricExtensionRequest, ExportMetricExtensionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetBaselineableMetricResponse> getBaselineableMetric(
            GetBaselineableMetricRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBaselineableMetricRequest, GetBaselineableMetricResponse>
                    handler) {
        LOG.trace("Called async getBaselineableMetric");
        final GetBaselineableMetricRequest interceptedRequest =
                GetBaselineableMetricConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBaselineableMetricConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "GetBaselineableMetric",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/BaselineableMetric/GetBaselineableMetric");
        final java.util.function.Function<javax.ws.rs.core.Response, GetBaselineableMetricResponse>
                transformer =
                        GetBaselineableMetricConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetBaselineableMetricRequest, GetBaselineableMetricResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBaselineableMetricRequest, GetBaselineableMetricResponse>,
                        java.util.concurrent.Future<GetBaselineableMetricResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBaselineableMetricRequest, GetBaselineableMetricResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetConfigResponse> getConfig(
            GetConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetConfigRequest, GetConfigResponse>
                    handler) {
        LOG.trace("Called async getConfig");
        final GetConfigRequest interceptedRequest = GetConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "GetConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/Config/GetConfig");
        final java.util.function.Function<javax.ws.rs.core.Response, GetConfigResponse>
                transformer =
                        GetConfigConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetConfigRequest, GetConfigResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetConfigRequest, GetConfigResponse>,
                        java.util.concurrent.Future<GetConfigResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetConfigRequest, GetConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetDiscoveryJobResponse> getDiscoveryJob(
            GetDiscoveryJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDiscoveryJobRequest, GetDiscoveryJobResponse>
                    handler) {
        LOG.trace("Called async getDiscoveryJob");
        final GetDiscoveryJobRequest interceptedRequest =
                GetDiscoveryJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDiscoveryJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "GetDiscoveryJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/DiscoveryJob/GetDiscoveryJob");
        final java.util.function.Function<javax.ws.rs.core.Response, GetDiscoveryJobResponse>
                transformer =
                        GetDiscoveryJobConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetDiscoveryJobRequest, GetDiscoveryJobResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDiscoveryJobRequest, GetDiscoveryJobResponse>,
                        java.util.concurrent.Future<GetDiscoveryJobResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDiscoveryJobRequest, GetDiscoveryJobResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMetricExtensionResponse> getMetricExtension(
            GetMetricExtensionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMetricExtensionRequest, GetMetricExtensionResponse>
                    handler) {
        LOG.trace("Called async getMetricExtension");
        final GetMetricExtensionRequest interceptedRequest =
                GetMetricExtensionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMetricExtensionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "GetMetricExtension",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MetricExtension/GetMetricExtension");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMetricExtensionResponse>
                transformer =
                        GetMetricExtensionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetMetricExtensionRequest, GetMetricExtensionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMetricExtensionRequest, GetMetricExtensionResponse>,
                        java.util.concurrent.Future<GetMetricExtensionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMetricExtensionRequest, GetMetricExtensionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMonitoredResourceResponse> getMonitoredResource(
            GetMonitoredResourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMonitoredResourceRequest, GetMonitoredResourceResponse>
                    handler) {
        LOG.trace("Called async getMonitoredResource");
        final GetMonitoredResourceRequest interceptedRequest =
                GetMonitoredResourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMonitoredResourceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "GetMonitoredResource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/GetMonitoredResource");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMonitoredResourceResponse>
                transformer =
                        GetMonitoredResourceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetMonitoredResourceRequest, GetMonitoredResourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMonitoredResourceRequest, GetMonitoredResourceResponse>,
                        java.util.concurrent.Future<GetMonitoredResourceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMonitoredResourceRequest, GetMonitoredResourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMonitoredResourceTaskResponse> getMonitoredResourceTask(
            GetMonitoredResourceTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMonitoredResourceTaskRequest, GetMonitoredResourceTaskResponse>
                    handler) {
        LOG.trace("Called async getMonitoredResourceTask");
        final GetMonitoredResourceTaskRequest interceptedRequest =
                GetMonitoredResourceTaskConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMonitoredResourceTaskConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "GetMonitoredResourceTask",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResourceTask/GetMonitoredResourceTask");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetMonitoredResourceTaskResponse>
                transformer =
                        GetMonitoredResourceTaskConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetMonitoredResourceTaskRequest, GetMonitoredResourceTaskResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMonitoredResourceTaskRequest, GetMonitoredResourceTaskResponse>,
                        java.util.concurrent.Future<GetMonitoredResourceTaskResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMonitoredResourceTaskRequest, GetMonitoredResourceTaskResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetMonitoredResourceTypeResponse> getMonitoredResourceType(
            GetMonitoredResourceTypeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMonitoredResourceTypeRequest, GetMonitoredResourceTypeResponse>
                    handler) {
        LOG.trace("Called async getMonitoredResourceType");
        final GetMonitoredResourceTypeRequest interceptedRequest =
                GetMonitoredResourceTypeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMonitoredResourceTypeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "GetMonitoredResourceType",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResourceType/GetMonitoredResourceType");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetMonitoredResourceTypeResponse>
                transformer =
                        GetMonitoredResourceTypeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetMonitoredResourceTypeRequest, GetMonitoredResourceTypeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMonitoredResourceTypeRequest, GetMonitoredResourceTypeResponse>,
                        java.util.concurrent.Future<GetMonitoredResourceTypeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMonitoredResourceTypeRequest, GetMonitoredResourceTypeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetProcessSetResponse> getProcessSet(
            GetProcessSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetProcessSetRequest, GetProcessSetResponse>
                    handler) {
        LOG.trace("Called async getProcessSet");
        final GetProcessSetRequest interceptedRequest =
                GetProcessSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetProcessSetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "GetProcessSet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/ProcessSet/GetProcessSet");
        final java.util.function.Function<javax.ws.rs.core.Response, GetProcessSetResponse>
                transformer =
                        GetProcessSetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetProcessSetRequest, GetProcessSetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetProcessSetRequest, GetProcessSetResponse>,
                        java.util.concurrent.Future<GetProcessSetResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetProcessSetRequest, GetProcessSetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "StackMonitoring",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/WorkRequest/GetWorkRequest");
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
    public java.util.concurrent.Future<ListBaselineableMetricsResponse> listBaselineableMetrics(
            ListBaselineableMetricsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBaselineableMetricsRequest, ListBaselineableMetricsResponse>
                    handler) {
        LOG.trace("Called async listBaselineableMetrics");
        final ListBaselineableMetricsRequest interceptedRequest =
                ListBaselineableMetricsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBaselineableMetricsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "ListBaselineableMetrics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/BaselineableMetric/ListBaselineableMetrics");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListBaselineableMetricsResponse>
                transformer =
                        ListBaselineableMetricsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListBaselineableMetricsRequest, ListBaselineableMetricsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBaselineableMetricsRequest, ListBaselineableMetricsResponse>,
                        java.util.concurrent.Future<ListBaselineableMetricsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBaselineableMetricsRequest, ListBaselineableMetricsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListConfigsResponse> listConfigs(
            ListConfigsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListConfigsRequest, ListConfigsResponse>
                    handler) {
        LOG.trace("Called async listConfigs");
        final ListConfigsRequest interceptedRequest =
                ListConfigsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListConfigsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "ListConfigs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/ConfigCollection/ListConfigs");
        final java.util.function.Function<javax.ws.rs.core.Response, ListConfigsResponse>
                transformer =
                        ListConfigsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListConfigsRequest, ListConfigsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListConfigsRequest, ListConfigsResponse>,
                        java.util.concurrent.Future<ListConfigsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListConfigsRequest, ListConfigsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveryJobLogsResponse> listDiscoveryJobLogs(
            ListDiscoveryJobLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDiscoveryJobLogsRequest, ListDiscoveryJobLogsResponse>
                    handler) {
        LOG.trace("Called async listDiscoveryJobLogs");
        final ListDiscoveryJobLogsRequest interceptedRequest =
                ListDiscoveryJobLogsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDiscoveryJobLogsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "ListDiscoveryJobLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/DiscoveryJobLogCollection/ListDiscoveryJobLogs");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDiscoveryJobLogsResponse>
                transformer =
                        ListDiscoveryJobLogsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDiscoveryJobLogsRequest, ListDiscoveryJobLogsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDiscoveryJobLogsRequest, ListDiscoveryJobLogsResponse>,
                        java.util.concurrent.Future<ListDiscoveryJobLogsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDiscoveryJobLogsRequest, ListDiscoveryJobLogsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveryJobsResponse> listDiscoveryJobs(
            ListDiscoveryJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDiscoveryJobsRequest, ListDiscoveryJobsResponse>
                    handler) {
        LOG.trace("Called async listDiscoveryJobs");
        final ListDiscoveryJobsRequest interceptedRequest =
                ListDiscoveryJobsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDiscoveryJobsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "ListDiscoveryJobs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/DiscoveryJobCollection/ListDiscoveryJobs");
        final java.util.function.Function<javax.ws.rs.core.Response, ListDiscoveryJobsResponse>
                transformer =
                        ListDiscoveryJobsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListDiscoveryJobsRequest, ListDiscoveryJobsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDiscoveryJobsRequest, ListDiscoveryJobsResponse>,
                        java.util.concurrent.Future<ListDiscoveryJobsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDiscoveryJobsRequest, ListDiscoveryJobsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMetricExtensionsResponse> listMetricExtensions(
            ListMetricExtensionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMetricExtensionsRequest, ListMetricExtensionsResponse>
                    handler) {
        LOG.trace("Called async listMetricExtensions");
        final ListMetricExtensionsRequest interceptedRequest =
                ListMetricExtensionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMetricExtensionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "ListMetricExtensions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MetricExtension/ListMetricExtensions");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMetricExtensionsResponse>
                transformer =
                        ListMetricExtensionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMetricExtensionsRequest, ListMetricExtensionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMetricExtensionsRequest, ListMetricExtensionsResponse>,
                        java.util.concurrent.Future<ListMetricExtensionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMetricExtensionsRequest, ListMetricExtensionsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMonitoredResourceTasksResponse>
            listMonitoredResourceTasks(
                    ListMonitoredResourceTasksRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListMonitoredResourceTasksRequest,
                                    ListMonitoredResourceTasksResponse>
                            handler) {
        LOG.trace("Called async listMonitoredResourceTasks");
        final ListMonitoredResourceTasksRequest interceptedRequest =
                ListMonitoredResourceTasksConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMonitoredResourceTasksConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "ListMonitoredResourceTasks",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResourceTask/ListMonitoredResourceTasks");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListMonitoredResourceTasksResponse>
                transformer =
                        ListMonitoredResourceTasksConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMonitoredResourceTasksRequest, ListMonitoredResourceTasksResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMonitoredResourceTasksRequest,
                                ListMonitoredResourceTasksResponse>,
                        java.util.concurrent.Future<ListMonitoredResourceTasksResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMonitoredResourceTasksRequest, ListMonitoredResourceTasksResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMonitoredResourceTypesResponse>
            listMonitoredResourceTypes(
                    ListMonitoredResourceTypesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListMonitoredResourceTypesRequest,
                                    ListMonitoredResourceTypesResponse>
                            handler) {
        LOG.trace("Called async listMonitoredResourceTypes");
        final ListMonitoredResourceTypesRequest interceptedRequest =
                ListMonitoredResourceTypesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMonitoredResourceTypesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "ListMonitoredResourceTypes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResourceType/ListMonitoredResourceTypes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListMonitoredResourceTypesResponse>
                transformer =
                        ListMonitoredResourceTypesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMonitoredResourceTypesRequest, ListMonitoredResourceTypesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMonitoredResourceTypesRequest,
                                ListMonitoredResourceTypesResponse>,
                        java.util.concurrent.Future<ListMonitoredResourceTypesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMonitoredResourceTypesRequest, ListMonitoredResourceTypesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListMonitoredResourcesResponse> listMonitoredResources(
            ListMonitoredResourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMonitoredResourcesRequest, ListMonitoredResourcesResponse>
                    handler) {
        LOG.trace("Called async listMonitoredResources");
        final ListMonitoredResourcesRequest interceptedRequest =
                ListMonitoredResourcesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMonitoredResourcesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "ListMonitoredResources",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/ListMonitoredResources");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMonitoredResourcesResponse>
                transformer =
                        ListMonitoredResourcesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMonitoredResourcesRequest, ListMonitoredResourcesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMonitoredResourcesRequest, ListMonitoredResourcesResponse>,
                        java.util.concurrent.Future<ListMonitoredResourcesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMonitoredResourcesRequest, ListMonitoredResourcesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListProcessSetsResponse> listProcessSets(
            ListProcessSetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListProcessSetsRequest, ListProcessSetsResponse>
                    handler) {
        LOG.trace("Called async listProcessSets");
        final ListProcessSetsRequest interceptedRequest =
                ListProcessSetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProcessSetsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "ListProcessSets",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/ProcessSetCollection/ListProcessSets");
        final java.util.function.Function<javax.ws.rs.core.Response, ListProcessSetsResponse>
                transformer =
                        ListProcessSetsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListProcessSetsRequest, ListProcessSetsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListProcessSetsRequest, ListProcessSetsResponse>,
                        java.util.concurrent.Future<ListProcessSetsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListProcessSetsRequest, ListProcessSetsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
                        "StackMonitoring",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/WorkRequestErrorCollection/ListWorkRequestErrors");
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
                        "StackMonitoring",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/WorkRequestLogEntryCollection/ListWorkRequestLogs");
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
                        "StackMonitoring",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/WorkRequestSummaryCollection/ListWorkRequests");
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
    public java.util.concurrent.Future<ManageLicenseResponse> manageLicense(
            ManageLicenseRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ManageLicenseRequest, ManageLicenseResponse>
                    handler) {
        LOG.trace("Called async manageLicense");
        final ManageLicenseRequest interceptedRequest =
                ManageLicenseConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ManageLicenseConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "ManageLicense",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/ManageLicense");
        final java.util.function.Function<javax.ws.rs.core.Response, ManageLicenseResponse>
                transformer =
                        ManageLicenseConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ManageLicenseRequest, ManageLicenseResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ManageLicenseRequest, ManageLicenseResponse>,
                        java.util.concurrent.Future<ManageLicenseResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getManageLicenseDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ManageLicenseRequest, ManageLicenseResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PublishMetricExtensionResponse> publishMetricExtension(
            PublishMetricExtensionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PublishMetricExtensionRequest, PublishMetricExtensionResponse>
                    handler) {
        LOG.trace("Called async publishMetricExtension");
        final PublishMetricExtensionRequest interceptedRequest =
                PublishMetricExtensionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PublishMetricExtensionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "PublishMetricExtension",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MetricExtension/PublishMetricExtension");
        final java.util.function.Function<javax.ws.rs.core.Response, PublishMetricExtensionResponse>
                transformer =
                        PublishMetricExtensionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PublishMetricExtensionRequest, PublishMetricExtensionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PublishMetricExtensionRequest, PublishMetricExtensionResponse>,
                        java.util.concurrent.Future<PublishMetricExtensionResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PublishMetricExtensionRequest, PublishMetricExtensionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RequestMonitoredResourcesSummarizedCountResponse>
            requestMonitoredResourcesSummarizedCount(
                    RequestMonitoredResourcesSummarizedCountRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RequestMonitoredResourcesSummarizedCountRequest,
                                    RequestMonitoredResourcesSummarizedCountResponse>
                            handler) {
        LOG.trace("Called async requestMonitoredResourcesSummarizedCount");
        final RequestMonitoredResourcesSummarizedCountRequest interceptedRequest =
                RequestMonitoredResourcesSummarizedCountConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RequestMonitoredResourcesSummarizedCountConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "RequestMonitoredResourcesSummarizedCount",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/RequestMonitoredResourcesSummarizedCount");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, RequestMonitoredResourcesSummarizedCountResponse>
                transformer =
                        RequestMonitoredResourcesSummarizedCountConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        RequestMonitoredResourcesSummarizedCountRequest,
                        RequestMonitoredResourcesSummarizedCountResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                RequestMonitoredResourcesSummarizedCountRequest,
                                RequestMonitoredResourcesSummarizedCountResponse>,
                        java.util.concurrent.Future<
                                RequestMonitoredResourcesSummarizedCountResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    RequestMonitoredResourcesSummarizedCountRequest,
                    RequestMonitoredResourcesSummarizedCountResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SearchAssociatedResourcesResponse> searchAssociatedResources(
            SearchAssociatedResourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchAssociatedResourcesRequest, SearchAssociatedResourcesResponse>
                    handler) {
        LOG.trace("Called async searchAssociatedResources");
        final SearchAssociatedResourcesRequest interceptedRequest =
                SearchAssociatedResourcesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchAssociatedResourcesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "SearchAssociatedResources",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/SearchAssociatedResources");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchAssociatedResourcesResponse>
                transformer =
                        SearchAssociatedResourcesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchAssociatedResourcesRequest, SearchAssociatedResourcesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchAssociatedResourcesRequest,
                                SearchAssociatedResourcesResponse>,
                        java.util.concurrent.Future<SearchAssociatedResourcesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSearchAssociatedResourcesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchAssociatedResourcesRequest, SearchAssociatedResourcesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SearchMonitoredResourceAssociationsResponse>
            searchMonitoredResourceAssociations(
                    SearchMonitoredResourceAssociationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchMonitoredResourceAssociationsRequest,
                                    SearchMonitoredResourceAssociationsResponse>
                            handler) {
        LOG.trace("Called async searchMonitoredResourceAssociations");
        final SearchMonitoredResourceAssociationsRequest interceptedRequest =
                SearchMonitoredResourceAssociationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchMonitoredResourceAssociationsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "SearchMonitoredResourceAssociations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/SearchMonitoredResourceAssociations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchMonitoredResourceAssociationsResponse>
                transformer =
                        SearchMonitoredResourceAssociationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchMonitoredResourceAssociationsRequest,
                        SearchMonitoredResourceAssociationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchMonitoredResourceAssociationsRequest,
                                SearchMonitoredResourceAssociationsResponse>,
                        java.util.concurrent.Future<SearchMonitoredResourceAssociationsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSearchMonitoredResourceAssociationsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchMonitoredResourceAssociationsRequest,
                    SearchMonitoredResourceAssociationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SearchMonitoredResourceMembersResponse>
            searchMonitoredResourceMembers(
                    SearchMonitoredResourceMembersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchMonitoredResourceMembersRequest,
                                    SearchMonitoredResourceMembersResponse>
                            handler) {
        LOG.trace("Called async searchMonitoredResourceMembers");
        final SearchMonitoredResourceMembersRequest interceptedRequest =
                SearchMonitoredResourceMembersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchMonitoredResourceMembersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "SearchMonitoredResourceMembers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/SearchMonitoredResourceMembers");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchMonitoredResourceMembersResponse>
                transformer =
                        SearchMonitoredResourceMembersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchMonitoredResourceMembersRequest,
                        SearchMonitoredResourceMembersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchMonitoredResourceMembersRequest,
                                SearchMonitoredResourceMembersResponse>,
                        java.util.concurrent.Future<SearchMonitoredResourceMembersResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSearchMonitoredResourceMembersDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchMonitoredResourceMembersRequest, SearchMonitoredResourceMembersResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SearchMonitoredResourcesResponse> searchMonitoredResources(
            SearchMonitoredResourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchMonitoredResourcesRequest, SearchMonitoredResourcesResponse>
                    handler) {
        LOG.trace("Called async searchMonitoredResources");
        final SearchMonitoredResourcesRequest interceptedRequest =
                SearchMonitoredResourcesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchMonitoredResourcesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "SearchMonitoredResources",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/SearchMonitoredResources");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchMonitoredResourcesResponse>
                transformer =
                        SearchMonitoredResourcesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchMonitoredResourcesRequest, SearchMonitoredResourcesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchMonitoredResourcesRequest, SearchMonitoredResourcesResponse>,
                        java.util.concurrent.Future<SearchMonitoredResourcesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSearchMonitoredResourcesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchMonitoredResourcesRequest, SearchMonitoredResourcesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<TestMetricExtensionResponse> testMetricExtension(
            TestMetricExtensionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            TestMetricExtensionRequest, TestMetricExtensionResponse>
                    handler) {
        LOG.trace("Called async testMetricExtension");
        final TestMetricExtensionRequest interceptedRequest =
                TestMetricExtensionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TestMetricExtensionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "TestMetricExtension",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MetricExtension/TestMetricExtension");
        final java.util.function.Function<javax.ws.rs.core.Response, TestMetricExtensionResponse>
                transformer =
                        TestMetricExtensionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        TestMetricExtensionRequest, TestMetricExtensionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                TestMetricExtensionRequest, TestMetricExtensionResponse>,
                        java.util.concurrent.Future<TestMetricExtensionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getTestMetricExtensionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    TestMetricExtensionRequest, TestMetricExtensionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAndPropagateTagsResponse> updateAndPropagateTags(
            UpdateAndPropagateTagsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAndPropagateTagsRequest, UpdateAndPropagateTagsResponse>
                    handler) {
        LOG.trace("Called async updateAndPropagateTags");
        final UpdateAndPropagateTagsRequest interceptedRequest =
                UpdateAndPropagateTagsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAndPropagateTagsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "UpdateAndPropagateTags",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/UpdateAndPropagateTags");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAndPropagateTagsResponse>
                transformer =
                        UpdateAndPropagateTagsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateAndPropagateTagsRequest, UpdateAndPropagateTagsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateAndPropagateTagsRequest, UpdateAndPropagateTagsResponse>,
                        java.util.concurrent.Future<UpdateAndPropagateTagsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateAndPropagateTagsDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateAndPropagateTagsRequest, UpdateAndPropagateTagsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateBaselineableMetricResponse> updateBaselineableMetric(
            UpdateBaselineableMetricRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBaselineableMetricRequest, UpdateBaselineableMetricResponse>
                    handler) {
        LOG.trace("Called async updateBaselineableMetric");
        final UpdateBaselineableMetricRequest interceptedRequest =
                UpdateBaselineableMetricConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBaselineableMetricConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "UpdateBaselineableMetric",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/BaselineableMetric/UpdateBaselineableMetric");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateBaselineableMetricResponse>
                transformer =
                        UpdateBaselineableMetricConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateBaselineableMetricRequest, UpdateBaselineableMetricResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateBaselineableMetricRequest, UpdateBaselineableMetricResponse>,
                        java.util.concurrent.Future<UpdateBaselineableMetricResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateBaselineableMetricDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateBaselineableMetricRequest, UpdateBaselineableMetricResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigResponse> updateConfig(
            UpdateConfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateConfigRequest, UpdateConfigResponse>
                    handler) {
        LOG.trace("Called async updateConfig");
        final UpdateConfigRequest interceptedRequest =
                UpdateConfigConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateConfigConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "UpdateConfig",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/Config/UpdateConfig");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateConfigResponse>
                transformer =
                        UpdateConfigConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateConfigRequest, UpdateConfigResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateConfigRequest, UpdateConfigResponse>,
                        java.util.concurrent.Future<UpdateConfigResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateConfigDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateConfigRequest, UpdateConfigResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateMetricExtensionResponse> updateMetricExtension(
            UpdateMetricExtensionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMetricExtensionRequest, UpdateMetricExtensionResponse>
                    handler) {
        LOG.trace("Called async updateMetricExtension");
        final UpdateMetricExtensionRequest interceptedRequest =
                UpdateMetricExtensionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMetricExtensionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "UpdateMetricExtension",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MetricExtension/UpdateMetricExtension");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateMetricExtensionResponse>
                transformer =
                        UpdateMetricExtensionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateMetricExtensionRequest, UpdateMetricExtensionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMetricExtensionRequest, UpdateMetricExtensionResponse>,
                        java.util.concurrent.Future<UpdateMetricExtensionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateMetricExtensionDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMetricExtensionRequest, UpdateMetricExtensionResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateMonitoredResourceResponse> updateMonitoredResource(
            UpdateMonitoredResourceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMonitoredResourceRequest, UpdateMonitoredResourceResponse>
                    handler) {
        LOG.trace("Called async updateMonitoredResource");
        final UpdateMonitoredResourceRequest interceptedRequest =
                UpdateMonitoredResourceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMonitoredResourceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "UpdateMonitoredResource",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResource/UpdateMonitoredResource");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateMonitoredResourceResponse>
                transformer =
                        UpdateMonitoredResourceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateMonitoredResourceRequest, UpdateMonitoredResourceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMonitoredResourceRequest, UpdateMonitoredResourceResponse>,
                        java.util.concurrent.Future<UpdateMonitoredResourceResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateMonitoredResourceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMonitoredResourceRequest, UpdateMonitoredResourceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateMonitoredResourceTaskResponse>
            updateMonitoredResourceTask(
                    UpdateMonitoredResourceTaskRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateMonitoredResourceTaskRequest,
                                    UpdateMonitoredResourceTaskResponse>
                            handler) {
        LOG.trace("Called async updateMonitoredResourceTask");
        final UpdateMonitoredResourceTaskRequest interceptedRequest =
                UpdateMonitoredResourceTaskConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMonitoredResourceTaskConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "UpdateMonitoredResourceTask",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResourceTask/UpdateMonitoredResourceTask");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateMonitoredResourceTaskResponse>
                transformer =
                        UpdateMonitoredResourceTaskConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateMonitoredResourceTaskRequest, UpdateMonitoredResourceTaskResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMonitoredResourceTaskRequest,
                                UpdateMonitoredResourceTaskResponse>,
                        java.util.concurrent.Future<UpdateMonitoredResourceTaskResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateMonitoredResourceTaskDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMonitoredResourceTaskRequest, UpdateMonitoredResourceTaskResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateMonitoredResourceTypeResponse>
            updateMonitoredResourceType(
                    UpdateMonitoredResourceTypeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateMonitoredResourceTypeRequest,
                                    UpdateMonitoredResourceTypeResponse>
                            handler) {
        LOG.trace("Called async updateMonitoredResourceType");
        final UpdateMonitoredResourceTypeRequest interceptedRequest =
                UpdateMonitoredResourceTypeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMonitoredResourceTypeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "UpdateMonitoredResourceType",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/MonitoredResourceType/UpdateMonitoredResourceType");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateMonitoredResourceTypeResponse>
                transformer =
                        UpdateMonitoredResourceTypeConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateMonitoredResourceTypeRequest, UpdateMonitoredResourceTypeResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateMonitoredResourceTypeRequest,
                                UpdateMonitoredResourceTypeResponse>,
                        java.util.concurrent.Future<UpdateMonitoredResourceTypeResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateMonitoredResourceTypeDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateMonitoredResourceTypeRequest, UpdateMonitoredResourceTypeResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateProcessSetResponse> updateProcessSet(
            UpdateProcessSetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateProcessSetRequest, UpdateProcessSetResponse>
                    handler) {
        LOG.trace("Called async updateProcessSet");
        final UpdateProcessSetRequest interceptedRequest =
                UpdateProcessSetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateProcessSetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "StackMonitoring",
                        "UpdateProcessSet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/stack-monitoring/20210330/ProcessSet/UpdateProcessSet");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateProcessSetResponse>
                transformer =
                        UpdateProcessSetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateProcessSetRequest, UpdateProcessSetResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateProcessSetRequest, UpdateProcessSetResponse>,
                        java.util.concurrent.Future<UpdateProcessSetResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateProcessSetDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateProcessSetRequest, UpdateProcessSetResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
