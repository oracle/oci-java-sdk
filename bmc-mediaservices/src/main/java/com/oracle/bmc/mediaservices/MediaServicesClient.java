/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices;

import com.oracle.bmc.mediaservices.internal.http.*;
import com.oracle.bmc.mediaservices.requests.*;
import com.oracle.bmc.mediaservices.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
public class MediaServicesClient implements MediaServices {
    /**
     * Service instance for MediaServices.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("MEDIASERVICES")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://mediaservices.{region}.oci.{secondLevelDomain}")
                    .build();
    // attempt twice if it's instance principals, immediately failures will try to refresh the token
    private static final int MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS = 2;

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MediaServicesAsyncClient.class);

    com.oracle.bmc.http.internal.RestClient getClient() {
        return client;
    }

    private final MediaServicesWaiters waiters;

    private final MediaServicesPaginators paginators;
    private final com.oracle.bmc.http.internal.RestClient client;
    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;
    private final com.oracle.bmc.retrier.RetryConfiguration retryConfiguration;
    private final org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy
            apacheConnectionClosingStrategy;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public MediaServicesClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public MediaServicesClient(
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
    public MediaServicesClient(
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
    public MediaServicesClient(
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
    public MediaServicesClient(
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
    public MediaServicesClient(
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
    public MediaServicesClient(
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
     * @param signingStrategyRequestSignerFactories The request signer factories for each signing strategy used to create the request signer
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
     * @param executorService ExecutorService used by the client, or null to use the default configured ThreadPoolExecutor
     */
    public MediaServicesClient(
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
            java.util.concurrent.ExecutorService executorService) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                signingStrategyRequestSignerFactories,
                additionalClientConfigurators,
                endpoint,
                executorService,
                com.oracle.bmc.http.internal.RestClientFactoryBuilder.builder());
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * Use the {@link Builder} to get access to all these parameters.
     *
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param signingStrategyRequestSignerFactories The request signer factories for each signing strategy used to create the request signer
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
     * @param executorService ExecutorService used by the client, or null to use the default configured ThreadPoolExecutor
     * @param restClientFactoryBuilder the builder for the {@link com.oracle.bmc.http.internal.RestClientFactory}
     */
    protected MediaServicesClient(
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
            java.util.concurrent.ExecutorService executorService,
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
        com.oracle.bmc.http.internal.RestClientFactory restClientFactory =
                restClientFactoryBuilder
                        .clientConfigurator(clientConfigurator)
                        .additionalClientConfigurators(allConfigurators)
                        .build();
        boolean isNonBufferingApacheClient =
                com.oracle.bmc.http.ApacheUtils.isNonBufferingClientConfigurator(
                        restClientFactory.getClientConfigurator());
        com.oracle.bmc.http.signing.RequestSigner defaultRequestSigner =
                defaultRequestSignerFactory.createRequestSigner(
                        SERVICE, this.authenticationDetailsProvider);
        this.apacheConnectionClosingStrategy =
                com.oracle.bmc.http.ApacheUtils.getApacheConnectionClosingStrategy(
                        restClientFactory.getClientConfigurator());
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
                        signingStrategyRequestSignerFactories
                                .get(s)
                                .createRequestSigner(SERVICE, authenticationDetailsProvider));
            }
        }

        final com.oracle.bmc.ClientConfiguration clientConfigurationToUse =
                (configuration != null)
                        ? configuration
                        : com.oracle.bmc.ClientConfiguration.builder().build();
        this.retryConfiguration = clientConfigurationToUse.getRetryConfiguration();
        CircuitBreakerConfiguration circuitBreakerConfiguration =
                CircuitBreakerUtils.getUserDefinedCircuitBreakerConfiguration(configuration);
        if (circuitBreakerConfiguration == null) {
            circuitBreakerConfiguration = CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION;
        }
        this.client =
                restClientFactory.create(
                        defaultRequestSigner,
                        requestSigners,
                        clientConfigurationToUse,
                        isNonBufferingApacheClient,
                        null,
                        circuitBreakerConfiguration);

        if (executorService == null) {
            // up to 50 (core) threads, time out after 60s idle, all daemon
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor =
                    new java.util.concurrent.ThreadPoolExecutor(
                            50,
                            50,
                            60L,
                            java.util.concurrent.TimeUnit.SECONDS,
                            new java.util.concurrent.LinkedBlockingQueue<Runnable>(),
                            com.oracle.bmc.internal.ClientThreadFactory.builder()
                                    .isDaemon(true)
                                    .nameFormat("MediaServices-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new MediaServicesWaiters(executorService, this);

        this.paginators = new MediaServicesPaginators(this);

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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, MediaServicesClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Set the ExecutorService for the client to be created.
         * @param executorService executorService
         * @return this builder
         */
        public Builder executorService(java.util.concurrent.ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public MediaServicesClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new MediaServicesClient(
                    authenticationDetailsProvider,
                    configuration,
                    clientConfigurator,
                    requestSignerFactory,
                    signingStrategyRequestSignerFactories,
                    additionalClientConfigurators,
                    endpoint,
                    executorService);
        }
    }

    @Override
    public void setEndpoint(String endpoint) {
        LOG.info("Setting endpoint to {}", endpoint);
        client.setEndpoint(endpoint);
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
    public ChangeMediaAssetCompartmentResponse changeMediaAssetCompartment(
            ChangeMediaAssetCompartmentRequest request) {
        LOG.trace("Called changeMediaAssetCompartment");
        final ChangeMediaAssetCompartmentRequest interceptedRequest =
                ChangeMediaAssetCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeMediaAssetCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ChangeMediaAssetCompartment",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, ChangeMediaAssetCompartmentResponse>
                transformer =
                        ChangeMediaAssetCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest
                                                        .getChangeMediaAssetCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeMediaWorkflowCompartmentResponse changeMediaWorkflowCompartment(
            ChangeMediaWorkflowCompartmentRequest request) {
        LOG.trace("Called changeMediaWorkflowCompartment");
        final ChangeMediaWorkflowCompartmentRequest interceptedRequest =
                ChangeMediaWorkflowCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeMediaWorkflowCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ChangeMediaWorkflowCompartment",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeMediaWorkflowCompartmentResponse>
                transformer =
                        ChangeMediaWorkflowCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest
                                                        .getChangeMediaWorkflowCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeMediaWorkflowConfigurationCompartmentResponse
            changeMediaWorkflowConfigurationCompartment(
                    ChangeMediaWorkflowConfigurationCompartmentRequest request) {
        LOG.trace("Called changeMediaWorkflowConfigurationCompartment");
        final ChangeMediaWorkflowConfigurationCompartmentRequest interceptedRequest =
                ChangeMediaWorkflowConfigurationCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeMediaWorkflowConfigurationCompartmentConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ChangeMediaWorkflowConfigurationCompartment",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeMediaWorkflowConfigurationCompartmentResponse>
                transformer =
                        ChangeMediaWorkflowConfigurationCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest
                                                        .getChangeMediaWorkflowConfigurationCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeMediaWorkflowJobCompartmentResponse changeMediaWorkflowJobCompartment(
            ChangeMediaWorkflowJobCompartmentRequest request) {
        LOG.trace("Called changeMediaWorkflowJobCompartment");
        final ChangeMediaWorkflowJobCompartmentRequest interceptedRequest =
                ChangeMediaWorkflowJobCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeMediaWorkflowJobCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ChangeMediaWorkflowJobCompartment",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ChangeMediaWorkflowJobCompartmentResponse>
                transformer =
                        ChangeMediaWorkflowJobCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest
                                                        .getChangeMediaWorkflowJobCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeStreamDistributionChannelCompartmentResponse
            changeStreamDistributionChannelCompartment(
                    ChangeStreamDistributionChannelCompartmentRequest request) {
        LOG.trace("Called changeStreamDistributionChannelCompartment");
        final ChangeStreamDistributionChannelCompartmentRequest interceptedRequest =
                ChangeStreamDistributionChannelCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeStreamDistributionChannelCompartmentConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ChangeStreamDistributionChannelCompartment",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ChangeStreamDistributionChannelCompartmentResponse>
                transformer =
                        ChangeStreamDistributionChannelCompartmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest
                                                        .getChangeStreamDistributionChannelCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateMediaAssetResponse createMediaAsset(CreateMediaAssetRequest request) {
        LOG.trace("Called createMediaAsset");
        final CreateMediaAssetRequest interceptedRequest =
                CreateMediaAssetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMediaAssetConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices", "CreateMediaAsset", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateMediaAssetResponse>
                transformer =
                        CreateMediaAssetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest.getCreateMediaAssetDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateMediaWorkflowResponse createMediaWorkflow(CreateMediaWorkflowRequest request) {
        LOG.trace("Called createMediaWorkflow");
        final CreateMediaWorkflowRequest interceptedRequest =
                CreateMediaWorkflowConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMediaWorkflowConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices", "CreateMediaWorkflow", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateMediaWorkflowResponse>
                transformer =
                        CreateMediaWorkflowConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest.getCreateMediaWorkflowDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateMediaWorkflowConfigurationResponse createMediaWorkflowConfiguration(
            CreateMediaWorkflowConfigurationRequest request) {
        LOG.trace("Called createMediaWorkflowConfiguration");
        final CreateMediaWorkflowConfigurationRequest interceptedRequest =
                CreateMediaWorkflowConfigurationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMediaWorkflowConfigurationConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "CreateMediaWorkflowConfiguration",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, CreateMediaWorkflowConfigurationResponse>
                transformer =
                        CreateMediaWorkflowConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest
                                                        .getCreateMediaWorkflowConfigurationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateMediaWorkflowJobResponse createMediaWorkflowJob(
            CreateMediaWorkflowJobRequest request) {
        LOG.trace("Called createMediaWorkflowJob");
        final CreateMediaWorkflowJobRequest interceptedRequest =
                CreateMediaWorkflowJobConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMediaWorkflowJobConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "CreateMediaWorkflowJob",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateMediaWorkflowJobResponse>
                transformer =
                        CreateMediaWorkflowJobConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest.getCreateMediaWorkflowJobDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateStreamCdnConfigResponse createStreamCdnConfig(
            CreateStreamCdnConfigRequest request) {
        LOG.trace("Called createStreamCdnConfig");
        final CreateStreamCdnConfigRequest interceptedRequest =
                CreateStreamCdnConfigConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateStreamCdnConfigConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "CreateStreamCdnConfig",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateStreamCdnConfigResponse>
                transformer =
                        CreateStreamCdnConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest.getCreateStreamCdnConfigDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateStreamDistributionChannelResponse createStreamDistributionChannel(
            CreateStreamDistributionChannelRequest request) {
        LOG.trace("Called createStreamDistributionChannel");
        final CreateStreamDistributionChannelRequest interceptedRequest =
                CreateStreamDistributionChannelConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateStreamDistributionChannelConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "CreateStreamDistributionChannel",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, CreateStreamDistributionChannelResponse>
                transformer =
                        CreateStreamDistributionChannelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest
                                                        .getCreateStreamDistributionChannelDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateStreamPackagingConfigResponse createStreamPackagingConfig(
            CreateStreamPackagingConfigRequest request) {
        LOG.trace("Called createStreamPackagingConfig");
        final CreateStreamPackagingConfigRequest interceptedRequest =
                CreateStreamPackagingConfigConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateStreamPackagingConfigConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "CreateStreamPackagingConfig",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateStreamPackagingConfigResponse>
                transformer =
                        CreateStreamPackagingConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest
                                                        .getCreateStreamPackagingConfigDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteMediaAssetResponse deleteMediaAsset(DeleteMediaAssetRequest request) {
        LOG.trace("Called deleteMediaAsset");
        final DeleteMediaAssetRequest interceptedRequest =
                DeleteMediaAssetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMediaAssetConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices", "DeleteMediaAsset", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteMediaAssetResponse>
                transformer =
                        DeleteMediaAssetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.delete(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteMediaAssetDistributionChannelAttachmentResponse
            deleteMediaAssetDistributionChannelAttachment(
                    DeleteMediaAssetDistributionChannelAttachmentRequest request) {
        LOG.trace("Called deleteMediaAssetDistributionChannelAttachment");
        final DeleteMediaAssetDistributionChannelAttachmentRequest interceptedRequest =
                DeleteMediaAssetDistributionChannelAttachmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMediaAssetDistributionChannelAttachmentConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "DeleteMediaAssetDistributionChannelAttachment",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        DeleteMediaAssetDistributionChannelAttachmentResponse>
                transformer =
                        DeleteMediaAssetDistributionChannelAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.delete(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteMediaWorkflowResponse deleteMediaWorkflow(DeleteMediaWorkflowRequest request) {
        LOG.trace("Called deleteMediaWorkflow");
        final DeleteMediaWorkflowRequest interceptedRequest =
                DeleteMediaWorkflowConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMediaWorkflowConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices", "DeleteMediaWorkflow", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteMediaWorkflowResponse>
                transformer =
                        DeleteMediaWorkflowConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.delete(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteMediaWorkflowConfigurationResponse deleteMediaWorkflowConfiguration(
            DeleteMediaWorkflowConfigurationRequest request) {
        LOG.trace("Called deleteMediaWorkflowConfiguration");
        final DeleteMediaWorkflowConfigurationRequest interceptedRequest =
                DeleteMediaWorkflowConfigurationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMediaWorkflowConfigurationConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "DeleteMediaWorkflowConfiguration",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteMediaWorkflowConfigurationResponse>
                transformer =
                        DeleteMediaWorkflowConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.delete(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteMediaWorkflowJobResponse deleteMediaWorkflowJob(
            DeleteMediaWorkflowJobRequest request) {
        LOG.trace("Called deleteMediaWorkflowJob");
        final DeleteMediaWorkflowJobRequest interceptedRequest =
                DeleteMediaWorkflowJobConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMediaWorkflowJobConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "DeleteMediaWorkflowJob",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteMediaWorkflowJobResponse>
                transformer =
                        DeleteMediaWorkflowJobConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.delete(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteStreamCdnConfigResponse deleteStreamCdnConfig(
            DeleteStreamCdnConfigRequest request) {
        LOG.trace("Called deleteStreamCdnConfig");
        final DeleteStreamCdnConfigRequest interceptedRequest =
                DeleteStreamCdnConfigConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteStreamCdnConfigConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "DeleteStreamCdnConfig",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteStreamCdnConfigResponse>
                transformer =
                        DeleteStreamCdnConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.delete(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteStreamDistributionChannelResponse deleteStreamDistributionChannel(
            DeleteStreamDistributionChannelRequest request) {
        LOG.trace("Called deleteStreamDistributionChannel");
        final DeleteStreamDistributionChannelRequest interceptedRequest =
                DeleteStreamDistributionChannelConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteStreamDistributionChannelConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "DeleteStreamDistributionChannel",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteStreamDistributionChannelResponse>
                transformer =
                        DeleteStreamDistributionChannelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.delete(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteStreamPackagingConfigResponse deleteStreamPackagingConfig(
            DeleteStreamPackagingConfigRequest request) {
        LOG.trace("Called deleteStreamPackagingConfig");
        final DeleteStreamPackagingConfigRequest interceptedRequest =
                DeleteStreamPackagingConfigConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteStreamPackagingConfigConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "DeleteStreamPackagingConfig",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteStreamPackagingConfigResponse>
                transformer =
                        DeleteStreamPackagingConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.delete(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetMediaAssetResponse getMediaAsset(GetMediaAssetRequest request) {
        LOG.trace("Called getMediaAsset");
        final GetMediaAssetRequest interceptedRequest =
                GetMediaAssetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMediaAssetConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices", "GetMediaAsset", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, GetMediaAssetResponse> transformer =
                GetMediaAssetConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetMediaAssetDistributionChannelAttachmentResponse
            getMediaAssetDistributionChannelAttachment(
                    GetMediaAssetDistributionChannelAttachmentRequest request) {
        LOG.trace("Called getMediaAssetDistributionChannelAttachment");
        final GetMediaAssetDistributionChannelAttachmentRequest interceptedRequest =
                GetMediaAssetDistributionChannelAttachmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMediaAssetDistributionChannelAttachmentConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "GetMediaAssetDistributionChannelAttachment",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        GetMediaAssetDistributionChannelAttachmentResponse>
                transformer =
                        GetMediaAssetDistributionChannelAttachmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetMediaWorkflowResponse getMediaWorkflow(GetMediaWorkflowRequest request) {
        LOG.trace("Called getMediaWorkflow");
        final GetMediaWorkflowRequest interceptedRequest =
                GetMediaWorkflowConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMediaWorkflowConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices", "GetMediaWorkflow", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, GetMediaWorkflowResponse>
                transformer =
                        GetMediaWorkflowConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetMediaWorkflowConfigurationResponse getMediaWorkflowConfiguration(
            GetMediaWorkflowConfigurationRequest request) {
        LOG.trace("Called getMediaWorkflowConfiguration");
        final GetMediaWorkflowConfigurationRequest interceptedRequest =
                GetMediaWorkflowConfigurationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMediaWorkflowConfigurationConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "GetMediaWorkflowConfiguration",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, GetMediaWorkflowConfigurationResponse>
                transformer =
                        GetMediaWorkflowConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetMediaWorkflowJobResponse getMediaWorkflowJob(GetMediaWorkflowJobRequest request) {
        LOG.trace("Called getMediaWorkflowJob");
        final GetMediaWorkflowJobRequest interceptedRequest =
                GetMediaWorkflowJobConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMediaWorkflowJobConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices", "GetMediaWorkflowJob", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, GetMediaWorkflowJobResponse>
                transformer =
                        GetMediaWorkflowJobConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetMediaWorkflowJobFactResponse getMediaWorkflowJobFact(
            GetMediaWorkflowJobFactRequest request) {
        LOG.trace("Called getMediaWorkflowJobFact");
        final GetMediaWorkflowJobFactRequest interceptedRequest =
                GetMediaWorkflowJobFactConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMediaWorkflowJobFactConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "GetMediaWorkflowJobFact",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, GetMediaWorkflowJobFactResponse>
                transformer =
                        GetMediaWorkflowJobFactConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetStreamCdnConfigResponse getStreamCdnConfig(GetStreamCdnConfigRequest request) {
        LOG.trace("Called getStreamCdnConfig");
        final GetStreamCdnConfigRequest interceptedRequest =
                GetStreamCdnConfigConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetStreamCdnConfigConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices", "GetStreamCdnConfig", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, GetStreamCdnConfigResponse>
                transformer =
                        GetStreamCdnConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetStreamDistributionChannelResponse getStreamDistributionChannel(
            GetStreamDistributionChannelRequest request) {
        LOG.trace("Called getStreamDistributionChannel");
        final GetStreamDistributionChannelRequest interceptedRequest =
                GetStreamDistributionChannelConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetStreamDistributionChannelConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "GetStreamDistributionChannel",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, GetStreamDistributionChannelResponse>
                transformer =
                        GetStreamDistributionChannelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetStreamPackagingConfigResponse getStreamPackagingConfig(
            GetStreamPackagingConfigRequest request) {
        LOG.trace("Called getStreamPackagingConfig");
        final GetStreamPackagingConfigRequest interceptedRequest =
                GetStreamPackagingConfigConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetStreamPackagingConfigConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "GetStreamPackagingConfig",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, GetStreamPackagingConfigResponse>
                transformer =
                        GetStreamPackagingConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public IngestStreamDistributionChannelResponse ingestStreamDistributionChannel(
            IngestStreamDistributionChannelRequest request) {
        LOG.trace("Called ingestStreamDistributionChannel");
        final IngestStreamDistributionChannelRequest interceptedRequest =
                IngestStreamDistributionChannelConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                IngestStreamDistributionChannelConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "IngestStreamDistributionChannel",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, IngestStreamDistributionChannelResponse>
                transformer =
                        IngestStreamDistributionChannelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(
                                                ib,
                                                retriedRequest
                                                        .getIngestStreamDistributionChannelDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListMediaAssetDistributionChannelAttachmentsResponse
            listMediaAssetDistributionChannelAttachments(
                    ListMediaAssetDistributionChannelAttachmentsRequest request) {
        LOG.trace("Called listMediaAssetDistributionChannelAttachments");
        final ListMediaAssetDistributionChannelAttachmentsRequest interceptedRequest =
                ListMediaAssetDistributionChannelAttachmentsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMediaAssetDistributionChannelAttachmentsConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ListMediaAssetDistributionChannelAttachments",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response,
                        ListMediaAssetDistributionChannelAttachmentsResponse>
                transformer =
                        ListMediaAssetDistributionChannelAttachmentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListMediaAssetsResponse listMediaAssets(ListMediaAssetsRequest request) {
        LOG.trace("Called listMediaAssets");
        final ListMediaAssetsRequest interceptedRequest =
                ListMediaAssetsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMediaAssetsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices", "ListMediaAssets", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, ListMediaAssetsResponse>
                transformer =
                        ListMediaAssetsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListMediaWorkflowConfigurationsResponse listMediaWorkflowConfigurations(
            ListMediaWorkflowConfigurationsRequest request) {
        LOG.trace("Called listMediaWorkflowConfigurations");
        final ListMediaWorkflowConfigurationsRequest interceptedRequest =
                ListMediaWorkflowConfigurationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMediaWorkflowConfigurationsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ListMediaWorkflowConfigurations",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ListMediaWorkflowConfigurationsResponse>
                transformer =
                        ListMediaWorkflowConfigurationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListMediaWorkflowJobFactsResponse listMediaWorkflowJobFacts(
            ListMediaWorkflowJobFactsRequest request) {
        LOG.trace("Called listMediaWorkflowJobFacts");
        final ListMediaWorkflowJobFactsRequest interceptedRequest =
                ListMediaWorkflowJobFactsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMediaWorkflowJobFactsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ListMediaWorkflowJobFacts",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, ListMediaWorkflowJobFactsResponse>
                transformer =
                        ListMediaWorkflowJobFactsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListMediaWorkflowJobsResponse listMediaWorkflowJobs(
            ListMediaWorkflowJobsRequest request) {
        LOG.trace("Called listMediaWorkflowJobs");
        final ListMediaWorkflowJobsRequest interceptedRequest =
                ListMediaWorkflowJobsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMediaWorkflowJobsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ListMediaWorkflowJobs",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, ListMediaWorkflowJobsResponse>
                transformer =
                        ListMediaWorkflowJobsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListMediaWorkflowTaskDeclarationsResponse listMediaWorkflowTaskDeclarations(
            ListMediaWorkflowTaskDeclarationsRequest request) {
        LOG.trace("Called listMediaWorkflowTaskDeclarations");
        final ListMediaWorkflowTaskDeclarationsRequest interceptedRequest =
                ListMediaWorkflowTaskDeclarationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMediaWorkflowTaskDeclarationsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ListMediaWorkflowTaskDeclarations",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ListMediaWorkflowTaskDeclarationsResponse>
                transformer =
                        ListMediaWorkflowTaskDeclarationsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListMediaWorkflowsResponse listMediaWorkflows(ListMediaWorkflowsRequest request) {
        LOG.trace("Called listMediaWorkflows");
        final ListMediaWorkflowsRequest interceptedRequest =
                ListMediaWorkflowsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMediaWorkflowsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices", "ListMediaWorkflows", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, ListMediaWorkflowsResponse>
                transformer =
                        ListMediaWorkflowsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListStreamCdnConfigsResponse listStreamCdnConfigs(ListStreamCdnConfigsRequest request) {
        LOG.trace("Called listStreamCdnConfigs");
        final ListStreamCdnConfigsRequest interceptedRequest =
                ListStreamCdnConfigsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListStreamCdnConfigsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices", "ListStreamCdnConfigs", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, ListStreamCdnConfigsResponse>
                transformer =
                        ListStreamCdnConfigsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListStreamDistributionChannelsResponse listStreamDistributionChannels(
            ListStreamDistributionChannelsRequest request) {
        LOG.trace("Called listStreamDistributionChannels");
        final ListStreamDistributionChannelsRequest interceptedRequest =
                ListStreamDistributionChannelsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListStreamDistributionChannelsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ListStreamDistributionChannels",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ListStreamDistributionChannelsResponse>
                transformer =
                        ListStreamDistributionChannelsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListStreamPackagingConfigsResponse listStreamPackagingConfigs(
            ListStreamPackagingConfigsRequest request) {
        LOG.trace("Called listStreamPackagingConfigs");
        final ListStreamPackagingConfigsRequest interceptedRequest =
                ListStreamPackagingConfigsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListStreamPackagingConfigsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ListStreamPackagingConfigs",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, ListStreamPackagingConfigsResponse>
                transformer =
                        ListStreamPackagingConfigsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ListSystemMediaWorkflowsResponse listSystemMediaWorkflows(
            ListSystemMediaWorkflowsRequest request) {
        LOG.trace("Called listSystemMediaWorkflows");
        final ListSystemMediaWorkflowsRequest interceptedRequest =
                ListSystemMediaWorkflowsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSystemMediaWorkflowsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "ListSystemMediaWorkflows",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, ListSystemMediaWorkflowsResponse>
                transformer =
                        ListSystemMediaWorkflowsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateMediaAssetResponse updateMediaAsset(UpdateMediaAssetRequest request) {
        LOG.trace("Called updateMediaAsset");
        final UpdateMediaAssetRequest interceptedRequest =
                UpdateMediaAssetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMediaAssetConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices", "UpdateMediaAsset", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateMediaAssetResponse>
                transformer =
                        UpdateMediaAssetConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.put(
                                                ib,
                                                retriedRequest.getUpdateMediaAssetDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateMediaWorkflowResponse updateMediaWorkflow(UpdateMediaWorkflowRequest request) {
        LOG.trace("Called updateMediaWorkflow");
        final UpdateMediaWorkflowRequest interceptedRequest =
                UpdateMediaWorkflowConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMediaWorkflowConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices", "UpdateMediaWorkflow", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateMediaWorkflowResponse>
                transformer =
                        UpdateMediaWorkflowConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.put(
                                                ib,
                                                retriedRequest.getUpdateMediaWorkflowDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateMediaWorkflowConfigurationResponse updateMediaWorkflowConfiguration(
            UpdateMediaWorkflowConfigurationRequest request) {
        LOG.trace("Called updateMediaWorkflowConfiguration");
        final UpdateMediaWorkflowConfigurationRequest interceptedRequest =
                UpdateMediaWorkflowConfigurationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMediaWorkflowConfigurationConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "UpdateMediaWorkflowConfiguration",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateMediaWorkflowConfigurationResponse>
                transformer =
                        UpdateMediaWorkflowConfigurationConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.put(
                                                ib,
                                                retriedRequest
                                                        .getUpdateMediaWorkflowConfigurationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateMediaWorkflowJobResponse updateMediaWorkflowJob(
            UpdateMediaWorkflowJobRequest request) {
        LOG.trace("Called updateMediaWorkflowJob");
        final UpdateMediaWorkflowJobRequest interceptedRequest =
                UpdateMediaWorkflowJobConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMediaWorkflowJobConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "UpdateMediaWorkflowJob",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateMediaWorkflowJobResponse>
                transformer =
                        UpdateMediaWorkflowJobConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.put(
                                                ib,
                                                retriedRequest.getUpdateMediaWorkflowJobDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateStreamCdnConfigResponse updateStreamCdnConfig(
            UpdateStreamCdnConfigRequest request) {
        LOG.trace("Called updateStreamCdnConfig");
        final UpdateStreamCdnConfigRequest interceptedRequest =
                UpdateStreamCdnConfigConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateStreamCdnConfigConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "UpdateStreamCdnConfig",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateStreamCdnConfigResponse>
                transformer =
                        UpdateStreamCdnConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.put(
                                                ib,
                                                retriedRequest.getUpdateStreamCdnConfigDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateStreamDistributionChannelResponse updateStreamDistributionChannel(
            UpdateStreamDistributionChannelRequest request) {
        LOG.trace("Called updateStreamDistributionChannel");
        final UpdateStreamDistributionChannelRequest interceptedRequest =
                UpdateStreamDistributionChannelConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateStreamDistributionChannelConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "UpdateStreamDistributionChannel",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, UpdateStreamDistributionChannelResponse>
                transformer =
                        UpdateStreamDistributionChannelConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.put(
                                                ib,
                                                retriedRequest
                                                        .getUpdateStreamDistributionChannelDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateStreamPackagingConfigResponse updateStreamPackagingConfig(
            UpdateStreamPackagingConfigRequest request) {
        LOG.trace("Called updateStreamPackagingConfig");
        final UpdateStreamPackagingConfigRequest interceptedRequest =
                UpdateStreamPackagingConfigConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateStreamPackagingConfigConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "MediaServices",
                        "UpdateStreamPackagingConfig",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, UpdateStreamPackagingConfigResponse>
                transformer =
                        UpdateStreamPackagingConfigConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.put(
                                                ib,
                                                retriedRequest
                                                        .getUpdateStreamPackagingConfigDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public MediaServicesWaiters getWaiters() {
        return waiters;
    }

    @Override
    public MediaServicesPaginators getPaginators() {
        return paginators;
    }
}
