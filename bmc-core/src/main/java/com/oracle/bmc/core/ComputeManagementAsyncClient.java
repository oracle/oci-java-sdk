/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.internal.http.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

/**
 * Async client implementation for ComputeManagement service. <br/>
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
public class ComputeManagementAsyncClient implements ComputeManagementAsync {
    /**
     * Service instance for ComputeManagement.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("COMPUTEMANAGEMENT")
                    .serviceEndpointPrefix("iaas")
                    .serviceEndpointTemplate("https://iaas.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ComputeManagementAsyncClient.class);

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
    public ComputeManagementAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public ComputeManagementAsyncClient(
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
    public ComputeManagementAsyncClient(
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
    public ComputeManagementAsyncClient(
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
    public ComputeManagementAsyncClient(
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
    public ComputeManagementAsyncClient(
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
    public ComputeManagementAsyncClient(
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
    public ComputeManagementAsyncClient(
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
                    Builder, ComputeManagementAsyncClient> {
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
        public ComputeManagementAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new ComputeManagementAsyncClient(
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
    public void close() {
        client.close();
    }

    @Override
    public java.util.concurrent.Future<AttachInstancePoolInstanceResponse>
            attachInstancePoolInstance(
                    AttachInstancePoolInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    AttachInstancePoolInstanceRequest,
                                    AttachInstancePoolInstanceResponse>
                            handler) {
        LOG.trace("Called async attachInstancePoolInstance");
        final AttachInstancePoolInstanceRequest interceptedRequest =
                AttachInstancePoolInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AttachInstancePoolInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "AttachInstancePoolInstance",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, AttachInstancePoolInstanceResponse>
                transformer =
                        AttachInstancePoolInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        AttachInstancePoolInstanceRequest, AttachInstancePoolInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AttachInstancePoolInstanceRequest,
                                AttachInstancePoolInstanceResponse>,
                        java.util.concurrent.Future<AttachInstancePoolInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAttachInstancePoolInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AttachInstancePoolInstanceRequest, AttachInstancePoolInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<AttachLoadBalancerResponse> attachLoadBalancer(
            AttachLoadBalancerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AttachLoadBalancerRequest, AttachLoadBalancerResponse>
                    handler) {
        LOG.trace("Called async attachLoadBalancer");
        final AttachLoadBalancerRequest interceptedRequest =
                AttachLoadBalancerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AttachLoadBalancerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "AttachLoadBalancer",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePool/AttachLoadBalancer");
        final java.util.function.Function<javax.ws.rs.core.Response, AttachLoadBalancerResponse>
                transformer =
                        AttachLoadBalancerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<AttachLoadBalancerRequest, AttachLoadBalancerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                AttachLoadBalancerRequest, AttachLoadBalancerResponse>,
                        java.util.concurrent.Future<AttachLoadBalancerResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAttachLoadBalancerDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    AttachLoadBalancerRequest, AttachLoadBalancerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeClusterNetworkCompartmentResponse>
            changeClusterNetworkCompartment(
                    ChangeClusterNetworkCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeClusterNetworkCompartmentRequest,
                                    ChangeClusterNetworkCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeClusterNetworkCompartment");
        final ChangeClusterNetworkCompartmentRequest interceptedRequest =
                ChangeClusterNetworkCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeClusterNetworkCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "ChangeClusterNetworkCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ClusterNetwork/ChangeClusterNetworkCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeClusterNetworkCompartmentResponse>
                transformer =
                        ChangeClusterNetworkCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeClusterNetworkCompartmentRequest,
                        ChangeClusterNetworkCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeClusterNetworkCompartmentRequest,
                                ChangeClusterNetworkCompartmentResponse>,
                        java.util.concurrent.Future<ChangeClusterNetworkCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeClusterNetworkCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeClusterNetworkCompartmentRequest,
                    ChangeClusterNetworkCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeInstanceConfigurationCompartmentResponse>
            changeInstanceConfigurationCompartment(
                    ChangeInstanceConfigurationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeInstanceConfigurationCompartmentRequest,
                                    ChangeInstanceConfigurationCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeInstanceConfigurationCompartment");
        final ChangeInstanceConfigurationCompartmentRequest interceptedRequest =
                ChangeInstanceConfigurationCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeInstanceConfigurationCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "ChangeInstanceConfigurationCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConfiguration/ChangeInstanceConfigurationCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeInstanceConfigurationCompartmentResponse>
                transformer =
                        ChangeInstanceConfigurationCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeInstanceConfigurationCompartmentRequest,
                        ChangeInstanceConfigurationCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeInstanceConfigurationCompartmentRequest,
                                ChangeInstanceConfigurationCompartmentResponse>,
                        java.util.concurrent.Future<ChangeInstanceConfigurationCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest
                                        .getChangeInstanceConfigurationCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeInstanceConfigurationCompartmentRequest,
                    ChangeInstanceConfigurationCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ChangeInstancePoolCompartmentResponse>
            changeInstancePoolCompartment(
                    ChangeInstancePoolCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeInstancePoolCompartmentRequest,
                                    ChangeInstancePoolCompartmentResponse>
                            handler) {
        LOG.trace("Called async changeInstancePoolCompartment");
        final ChangeInstancePoolCompartmentRequest interceptedRequest =
                ChangeInstancePoolCompartmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeInstancePoolCompartmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "ChangeInstancePoolCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePool/ChangeInstancePoolCompartment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeInstancePoolCompartmentResponse>
                transformer =
                        ChangeInstancePoolCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ChangeInstancePoolCompartmentRequest, ChangeInstancePoolCompartmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ChangeInstancePoolCompartmentRequest,
                                ChangeInstancePoolCompartmentResponse>,
                        java.util.concurrent.Future<ChangeInstancePoolCompartmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getChangeInstancePoolCompartmentDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ChangeInstancePoolCompartmentRequest, ChangeInstancePoolCompartmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateClusterNetworkResponse> createClusterNetwork(
            CreateClusterNetworkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateClusterNetworkRequest, CreateClusterNetworkResponse>
                    handler) {
        LOG.trace("Called async createClusterNetwork");
        final CreateClusterNetworkRequest interceptedRequest =
                CreateClusterNetworkConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateClusterNetworkConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "CreateClusterNetwork",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ClusterNetwork/CreateClusterNetwork");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateClusterNetworkResponse>
                transformer =
                        CreateClusterNetworkConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateClusterNetworkRequest, CreateClusterNetworkResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateClusterNetworkRequest, CreateClusterNetworkResponse>,
                        java.util.concurrent.Future<CreateClusterNetworkResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateClusterNetworkDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateClusterNetworkRequest, CreateClusterNetworkResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceConfigurationResponse>
            createInstanceConfiguration(
                    CreateInstanceConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateInstanceConfigurationRequest,
                                    CreateInstanceConfigurationResponse>
                            handler) {
        LOG.trace("Called async createInstanceConfiguration");
        final CreateInstanceConfigurationRequest interceptedRequest =
                CreateInstanceConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateInstanceConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "CreateInstanceConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConfiguration/CreateInstanceConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateInstanceConfigurationResponse>
                transformer =
                        CreateInstanceConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateInstanceConfigurationRequest, CreateInstanceConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateInstanceConfigurationRequest,
                                CreateInstanceConfigurationResponse>,
                        java.util.concurrent.Future<CreateInstanceConfigurationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateInstanceConfiguration(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateInstanceConfigurationRequest, CreateInstanceConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateInstancePoolResponse> createInstancePool(
            CreateInstancePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateInstancePoolRequest, CreateInstancePoolResponse>
                    handler) {
        LOG.trace("Called async createInstancePool");
        final CreateInstancePoolRequest interceptedRequest =
                CreateInstancePoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateInstancePoolConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "CreateInstancePool",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePool/CreateInstancePool");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateInstancePoolResponse>
                transformer =
                        CreateInstancePoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateInstancePoolRequest, CreateInstancePoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateInstancePoolRequest, CreateInstancePoolResponse>,
                        java.util.concurrent.Future<CreateInstancePoolResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateInstancePoolDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateInstancePoolRequest, CreateInstancePoolResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteInstanceConfigurationResponse>
            deleteInstanceConfiguration(
                    DeleteInstanceConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteInstanceConfigurationRequest,
                                    DeleteInstanceConfigurationResponse>
                            handler) {
        LOG.trace("Called async deleteInstanceConfiguration");
        final DeleteInstanceConfigurationRequest interceptedRequest =
                DeleteInstanceConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteInstanceConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "DeleteInstanceConfiguration",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteInstanceConfigurationResponse>
                transformer =
                        DeleteInstanceConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteInstanceConfigurationRequest, DeleteInstanceConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteInstanceConfigurationRequest,
                                DeleteInstanceConfigurationResponse>,
                        java.util.concurrent.Future<DeleteInstanceConfigurationResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteInstanceConfigurationRequest, DeleteInstanceConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DetachInstancePoolInstanceResponse>
            detachInstancePoolInstance(
                    DetachInstancePoolInstanceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DetachInstancePoolInstanceRequest,
                                    DetachInstancePoolInstanceResponse>
                            handler) {
        LOG.trace("Called async detachInstancePoolInstance");
        final DetachInstancePoolInstanceRequest interceptedRequest =
                DetachInstancePoolInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetachInstancePoolInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "DetachInstancePoolInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePoolInstance/DetachInstancePoolInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DetachInstancePoolInstanceResponse>
                transformer =
                        DetachInstancePoolInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DetachInstancePoolInstanceRequest, DetachInstancePoolInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DetachInstancePoolInstanceRequest,
                                DetachInstancePoolInstanceResponse>,
                        java.util.concurrent.Future<DetachInstancePoolInstanceResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDetachInstancePoolInstanceDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DetachInstancePoolInstanceRequest, DetachInstancePoolInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DetachLoadBalancerResponse> detachLoadBalancer(
            DetachLoadBalancerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DetachLoadBalancerRequest, DetachLoadBalancerResponse>
                    handler) {
        LOG.trace("Called async detachLoadBalancer");
        final DetachLoadBalancerRequest interceptedRequest =
                DetachLoadBalancerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetachLoadBalancerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "DetachLoadBalancer",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePool/DetachLoadBalancer");
        final java.util.function.Function<javax.ws.rs.core.Response, DetachLoadBalancerResponse>
                transformer =
                        DetachLoadBalancerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DetachLoadBalancerRequest, DetachLoadBalancerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DetachLoadBalancerRequest, DetachLoadBalancerResponse>,
                        java.util.concurrent.Future<DetachLoadBalancerResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDetachLoadBalancerDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DetachLoadBalancerRequest, DetachLoadBalancerResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetClusterNetworkResponse> getClusterNetwork(
            GetClusterNetworkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetClusterNetworkRequest, GetClusterNetworkResponse>
                    handler) {
        LOG.trace("Called async getClusterNetwork");
        final GetClusterNetworkRequest interceptedRequest =
                GetClusterNetworkConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetClusterNetworkConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "GetClusterNetwork",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ClusterNetwork/GetClusterNetwork");
        final java.util.function.Function<javax.ws.rs.core.Response, GetClusterNetworkResponse>
                transformer =
                        GetClusterNetworkConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetClusterNetworkRequest, GetClusterNetworkResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetClusterNetworkRequest, GetClusterNetworkResponse>,
                        java.util.concurrent.Future<GetClusterNetworkResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetClusterNetworkRequest, GetClusterNetworkResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetInstanceConfigurationResponse> getInstanceConfiguration(
            GetInstanceConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetInstanceConfigurationRequest, GetInstanceConfigurationResponse>
                    handler) {
        LOG.trace("Called async getInstanceConfiguration");
        final GetInstanceConfigurationRequest interceptedRequest =
                GetInstanceConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetInstanceConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "GetInstanceConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConfiguration/GetInstanceConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetInstanceConfigurationResponse>
                transformer =
                        GetInstanceConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetInstanceConfigurationRequest, GetInstanceConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetInstanceConfigurationRequest, GetInstanceConfigurationResponse>,
                        java.util.concurrent.Future<GetInstanceConfigurationResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetInstanceConfigurationRequest, GetInstanceConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetInstancePoolResponse> getInstancePool(
            GetInstancePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetInstancePoolRequest, GetInstancePoolResponse>
                    handler) {
        LOG.trace("Called async getInstancePool");
        final GetInstancePoolRequest interceptedRequest =
                GetInstancePoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetInstancePoolConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "GetInstancePool",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePool/GetInstancePool");
        final java.util.function.Function<javax.ws.rs.core.Response, GetInstancePoolResponse>
                transformer =
                        GetInstancePoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetInstancePoolRequest, GetInstancePoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetInstancePoolRequest, GetInstancePoolResponse>,
                        java.util.concurrent.Future<GetInstancePoolResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetInstancePoolRequest, GetInstancePoolResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetInstancePoolInstanceResponse> getInstancePoolInstance(
            GetInstancePoolInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetInstancePoolInstanceRequest, GetInstancePoolInstanceResponse>
                    handler) {
        LOG.trace("Called async getInstancePoolInstance");
        final GetInstancePoolInstanceRequest interceptedRequest =
                GetInstancePoolInstanceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetInstancePoolInstanceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "GetInstancePoolInstance",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePoolInstance/GetInstancePoolInstance");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetInstancePoolInstanceResponse>
                transformer =
                        GetInstancePoolInstanceConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetInstancePoolInstanceRequest, GetInstancePoolInstanceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetInstancePoolInstanceRequest, GetInstancePoolInstanceResponse>,
                        java.util.concurrent.Future<GetInstancePoolInstanceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetInstancePoolInstanceRequest, GetInstancePoolInstanceResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetInstancePoolLoadBalancerAttachmentResponse>
            getInstancePoolLoadBalancerAttachment(
                    GetInstancePoolLoadBalancerAttachmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetInstancePoolLoadBalancerAttachmentRequest,
                                    GetInstancePoolLoadBalancerAttachmentResponse>
                            handler) {
        LOG.trace("Called async getInstancePoolLoadBalancerAttachment");
        final GetInstancePoolLoadBalancerAttachmentRequest interceptedRequest =
                GetInstancePoolLoadBalancerAttachmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetInstancePoolLoadBalancerAttachmentConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "GetInstancePoolLoadBalancerAttachment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePoolLoadBalancerAttachment/GetInstancePoolLoadBalancerAttachment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetInstancePoolLoadBalancerAttachmentResponse>
                transformer =
                        GetInstancePoolLoadBalancerAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetInstancePoolLoadBalancerAttachmentRequest,
                        GetInstancePoolLoadBalancerAttachmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetInstancePoolLoadBalancerAttachmentRequest,
                                GetInstancePoolLoadBalancerAttachmentResponse>,
                        java.util.concurrent.Future<GetInstancePoolLoadBalancerAttachmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetInstancePoolLoadBalancerAttachmentRequest,
                    GetInstancePoolLoadBalancerAttachmentResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<LaunchInstanceConfigurationResponse>
            launchInstanceConfiguration(
                    LaunchInstanceConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    LaunchInstanceConfigurationRequest,
                                    LaunchInstanceConfigurationResponse>
                            handler) {
        LOG.trace("Called async launchInstanceConfiguration");
        final LaunchInstanceConfigurationRequest interceptedRequest =
                LaunchInstanceConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                LaunchInstanceConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "LaunchInstanceConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/Instance/LaunchInstanceConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, LaunchInstanceConfigurationResponse>
                transformer =
                        LaunchInstanceConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        LaunchInstanceConfigurationRequest, LaunchInstanceConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                LaunchInstanceConfigurationRequest,
                                LaunchInstanceConfigurationResponse>,
                        java.util.concurrent.Future<LaunchInstanceConfigurationResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getInstanceConfiguration(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    LaunchInstanceConfigurationRequest, LaunchInstanceConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListClusterNetworkInstancesResponse>
            listClusterNetworkInstances(
                    ListClusterNetworkInstancesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListClusterNetworkInstancesRequest,
                                    ListClusterNetworkInstancesResponse>
                            handler) {
        LOG.trace("Called async listClusterNetworkInstances");
        final ListClusterNetworkInstancesRequest interceptedRequest =
                ListClusterNetworkInstancesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListClusterNetworkInstancesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "ListClusterNetworkInstances",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ClusterNetwork/ListClusterNetworkInstances");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListClusterNetworkInstancesResponse>
                transformer =
                        ListClusterNetworkInstancesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListClusterNetworkInstancesRequest, ListClusterNetworkInstancesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListClusterNetworkInstancesRequest,
                                ListClusterNetworkInstancesResponse>,
                        java.util.concurrent.Future<ListClusterNetworkInstancesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListClusterNetworkInstancesRequest, ListClusterNetworkInstancesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListClusterNetworksResponse> listClusterNetworks(
            ListClusterNetworksRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListClusterNetworksRequest, ListClusterNetworksResponse>
                    handler) {
        LOG.trace("Called async listClusterNetworks");
        final ListClusterNetworksRequest interceptedRequest =
                ListClusterNetworksConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListClusterNetworksConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "ListClusterNetworks",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ClusterNetwork/ListClusterNetworks");
        final java.util.function.Function<javax.ws.rs.core.Response, ListClusterNetworksResponse>
                transformer =
                        ListClusterNetworksConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListClusterNetworksRequest, ListClusterNetworksResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListClusterNetworksRequest, ListClusterNetworksResponse>,
                        java.util.concurrent.Future<ListClusterNetworksResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListClusterNetworksRequest, ListClusterNetworksResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListInstanceConfigurationsResponse>
            listInstanceConfigurations(
                    ListInstanceConfigurationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListInstanceConfigurationsRequest,
                                    ListInstanceConfigurationsResponse>
                            handler) {
        LOG.trace("Called async listInstanceConfigurations");
        final ListInstanceConfigurationsRequest interceptedRequest =
                ListInstanceConfigurationsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListInstanceConfigurationsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "ListInstanceConfigurations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConfigurationSummary/ListInstanceConfigurations");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListInstanceConfigurationsResponse>
                transformer =
                        ListInstanceConfigurationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListInstanceConfigurationsRequest, ListInstanceConfigurationsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListInstanceConfigurationsRequest,
                                ListInstanceConfigurationsResponse>,
                        java.util.concurrent.Future<ListInstanceConfigurationsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListInstanceConfigurationsRequest, ListInstanceConfigurationsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListInstancePoolInstancesResponse> listInstancePoolInstances(
            ListInstancePoolInstancesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListInstancePoolInstancesRequest, ListInstancePoolInstancesResponse>
                    handler) {
        LOG.trace("Called async listInstancePoolInstances");
        final ListInstancePoolInstancesRequest interceptedRequest =
                ListInstancePoolInstancesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListInstancePoolInstancesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "ListInstancePoolInstances",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceSummary/ListInstancePoolInstances");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListInstancePoolInstancesResponse>
                transformer =
                        ListInstancePoolInstancesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListInstancePoolInstancesRequest, ListInstancePoolInstancesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListInstancePoolInstancesRequest,
                                ListInstancePoolInstancesResponse>,
                        java.util.concurrent.Future<ListInstancePoolInstancesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListInstancePoolInstancesRequest, ListInstancePoolInstancesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListInstancePoolsResponse> listInstancePools(
            ListInstancePoolsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListInstancePoolsRequest, ListInstancePoolsResponse>
                    handler) {
        LOG.trace("Called async listInstancePools");
        final ListInstancePoolsRequest interceptedRequest =
                ListInstancePoolsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListInstancePoolsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "ListInstancePools",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePoolSummary/ListInstancePools");
        final java.util.function.Function<javax.ws.rs.core.Response, ListInstancePoolsResponse>
                transformer =
                        ListInstancePoolsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListInstancePoolsRequest, ListInstancePoolsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListInstancePoolsRequest, ListInstancePoolsResponse>,
                        java.util.concurrent.Future<ListInstancePoolsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListInstancePoolsRequest, ListInstancePoolsResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ResetInstancePoolResponse> resetInstancePool(
            ResetInstancePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResetInstancePoolRequest, ResetInstancePoolResponse>
                    handler) {
        LOG.trace("Called async resetInstancePool");
        final ResetInstancePoolRequest interceptedRequest =
                ResetInstancePoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ResetInstancePoolConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "ResetInstancePool",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePool/ResetInstancePool");
        final java.util.function.Function<javax.ws.rs.core.Response, ResetInstancePoolResponse>
                transformer =
                        ResetInstancePoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ResetInstancePoolRequest, ResetInstancePoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ResetInstancePoolRequest, ResetInstancePoolResponse>,
                        java.util.concurrent.Future<ResetInstancePoolResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ResetInstancePoolRequest, ResetInstancePoolResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<SoftresetInstancePoolResponse> softresetInstancePool(
            SoftresetInstancePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SoftresetInstancePoolRequest, SoftresetInstancePoolResponse>
                    handler) {
        LOG.trace("Called async softresetInstancePool");
        final SoftresetInstancePoolRequest interceptedRequest =
                SoftresetInstancePoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SoftresetInstancePoolConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "SoftresetInstancePool",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePool/SoftresetInstancePool");
        final java.util.function.Function<javax.ws.rs.core.Response, SoftresetInstancePoolResponse>
                transformer =
                        SoftresetInstancePoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SoftresetInstancePoolRequest, SoftresetInstancePoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SoftresetInstancePoolRequest, SoftresetInstancePoolResponse>,
                        java.util.concurrent.Future<SoftresetInstancePoolResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SoftresetInstancePoolRequest, SoftresetInstancePoolResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StartInstancePoolResponse> startInstancePool(
            StartInstancePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartInstancePoolRequest, StartInstancePoolResponse>
                    handler) {
        LOG.trace("Called async startInstancePool");
        final StartInstancePoolRequest interceptedRequest =
                StartInstancePoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StartInstancePoolConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "StartInstancePool",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePool/StartInstancePool");
        final java.util.function.Function<javax.ws.rs.core.Response, StartInstancePoolResponse>
                transformer =
                        StartInstancePoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<StartInstancePoolRequest, StartInstancePoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StartInstancePoolRequest, StartInstancePoolResponse>,
                        java.util.concurrent.Future<StartInstancePoolResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StartInstancePoolRequest, StartInstancePoolResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<StopInstancePoolResponse> stopInstancePool(
            StopInstancePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopInstancePoolRequest, StopInstancePoolResponse>
                    handler) {
        LOG.trace("Called async stopInstancePool");
        final StopInstancePoolRequest interceptedRequest =
                StopInstancePoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StopInstancePoolConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "StopInstancePool",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePool/StopInstancePool");
        final java.util.function.Function<javax.ws.rs.core.Response, StopInstancePoolResponse>
                transformer =
                        StopInstancePoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<StopInstancePoolRequest, StopInstancePoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                StopInstancePoolRequest, StopInstancePoolResponse>,
                        java.util.concurrent.Future<StopInstancePoolResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    StopInstancePoolRequest, StopInstancePoolResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<TerminateClusterNetworkResponse> terminateClusterNetwork(
            TerminateClusterNetworkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            TerminateClusterNetworkRequest, TerminateClusterNetworkResponse>
                    handler) {
        LOG.trace("Called async terminateClusterNetwork");
        final TerminateClusterNetworkRequest interceptedRequest =
                TerminateClusterNetworkConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TerminateClusterNetworkConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "TerminateClusterNetwork",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ClusterNetwork/TerminateClusterNetwork");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, TerminateClusterNetworkResponse>
                transformer =
                        TerminateClusterNetworkConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        TerminateClusterNetworkRequest, TerminateClusterNetworkResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                TerminateClusterNetworkRequest, TerminateClusterNetworkResponse>,
                        java.util.concurrent.Future<TerminateClusterNetworkResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    TerminateClusterNetworkRequest, TerminateClusterNetworkResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<TerminateInstancePoolResponse> terminateInstancePool(
            TerminateInstancePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            TerminateInstancePoolRequest, TerminateInstancePoolResponse>
                    handler) {
        LOG.trace("Called async terminateInstancePool");
        final TerminateInstancePoolRequest interceptedRequest =
                TerminateInstancePoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TerminateInstancePoolConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "TerminateInstancePool",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, TerminateInstancePoolResponse>
                transformer =
                        TerminateInstancePoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        TerminateInstancePoolRequest, TerminateInstancePoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                TerminateInstancePoolRequest, TerminateInstancePoolResponse>,
                        java.util.concurrent.Future<TerminateInstancePoolResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    TerminateInstancePoolRequest, TerminateInstancePoolResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateClusterNetworkResponse> updateClusterNetwork(
            UpdateClusterNetworkRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateClusterNetworkRequest, UpdateClusterNetworkResponse>
                    handler) {
        LOG.trace("Called async updateClusterNetwork");
        final UpdateClusterNetworkRequest interceptedRequest =
                UpdateClusterNetworkConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateClusterNetworkConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "UpdateClusterNetwork",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/ClusterNetwork/UpdateClusterNetwork");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateClusterNetworkResponse>
                transformer =
                        UpdateClusterNetworkConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateClusterNetworkRequest, UpdateClusterNetworkResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateClusterNetworkRequest, UpdateClusterNetworkResponse>,
                        java.util.concurrent.Future<UpdateClusterNetworkResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateClusterNetworkDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateClusterNetworkRequest, UpdateClusterNetworkResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateInstanceConfigurationResponse>
            updateInstanceConfiguration(
                    UpdateInstanceConfigurationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateInstanceConfigurationRequest,
                                    UpdateInstanceConfigurationResponse>
                            handler) {
        LOG.trace("Called async updateInstanceConfiguration");
        final UpdateInstanceConfigurationRequest interceptedRequest =
                UpdateInstanceConfigurationConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateInstanceConfigurationConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "UpdateInstanceConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConfiguration/UpdateInstanceConfiguration");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateInstanceConfigurationResponse>
                transformer =
                        UpdateInstanceConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateInstanceConfigurationRequest,
                                UpdateInstanceConfigurationResponse>,
                        java.util.concurrent.Future<UpdateInstanceConfigurationResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateInstanceConfigurationDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateInstancePoolResponse> updateInstancePool(
            UpdateInstancePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateInstancePoolRequest, UpdateInstancePoolResponse>
                    handler) {
        LOG.trace("Called async updateInstancePool");
        final UpdateInstancePoolRequest interceptedRequest =
                UpdateInstancePoolConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateInstancePoolConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "ComputeManagement",
                        "UpdateInstancePool",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/iaas/20160918/InstancePool/UpdateInstancePool");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateInstancePoolResponse>
                transformer =
                        UpdateInstancePoolConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateInstancePoolRequest, UpdateInstancePoolResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateInstancePoolRequest, UpdateInstancePoolResponse>,
                        java.util.concurrent.Future<UpdateInstancePoolResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateInstancePoolDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateInstancePoolRequest, UpdateInstancePoolResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
