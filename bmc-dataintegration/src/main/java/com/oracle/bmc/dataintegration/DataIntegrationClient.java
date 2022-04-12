/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration;

import com.oracle.bmc.dataintegration.internal.http.*;
import com.oracle.bmc.dataintegration.requests.*;
import com.oracle.bmc.dataintegration.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.extern.slf4j.Slf4j
public class DataIntegrationClient implements DataIntegration {
    /**
     * Service instance for DataIntegration.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DATAINTEGRATION")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://dataintegration.{region}.oci.{secondLevelDomain}")
                    .build();
    // attempt twice if it's instance principals, immediately failures will try to refresh the token
    private static final int MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS = 2;

    private final DataIntegrationWaiters waiters;

    private final DataIntegrationPaginators paginators;

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
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
    public DataIntegrationClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DataIntegrationClient(
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
    public DataIntegrationClient(
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
    public DataIntegrationClient(
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
    public DataIntegrationClient(
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
    public DataIntegrationClient(
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
    public DataIntegrationClient(
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
    public DataIntegrationClient(
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
    protected DataIntegrationClient(
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
                            new com.google.common.util.concurrent.ThreadFactoryBuilder()
                                    .setDaemon(true)
                                    .setNameFormat("DataIntegration-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DataIntegrationWaiters(executorService, this);

        this.paginators = new DataIntegrationPaginators(this);

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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DataIntegrationClient> {
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
        public DataIntegrationClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new DataIntegrationClient(
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
        com.google.common.base.Optional<String> endpoint = region.getEndpoint(SERVICE);
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
    public ChangeCompartmentResponse changeCompartment(ChangeCompartmentRequest request) {
        LOG.trace("Called changeCompartment");
        final ChangeCompartmentRequest interceptedRequest =
                ChangeCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeCompartmentConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ChangeCompartmentResponse>
                transformer = ChangeCompartmentConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ChangeCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/ChangeCompartment");
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
                                                retriedRequest.getChangeCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeDisApplicationCompartmentResponse changeDisApplicationCompartment(
            ChangeDisApplicationCompartmentRequest request) {
        LOG.trace("Called changeDisApplicationCompartment");
        final ChangeDisApplicationCompartmentRequest interceptedRequest =
                ChangeDisApplicationCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDisApplicationCompartmentConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeDisApplicationCompartmentResponse>
                transformer = ChangeDisApplicationCompartmentConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ChangeDisApplicationCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DisApplication/ChangeDisApplicationCompartment");
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
                                                        .getChangeDisApplicationCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateApplicationResponse createApplication(CreateApplicationRequest request) {
        LOG.trace("Called createApplication");
        final CreateApplicationRequest interceptedRequest =
                CreateApplicationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateApplicationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateApplicationResponse>
                transformer = CreateApplicationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "CreateApplication",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/CreateApplication");
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
                                                retriedRequest.getCreateApplicationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateConnectionResponse createConnection(CreateConnectionRequest request) {
        LOG.trace("Called createConnection");
        final CreateConnectionRequest interceptedRequest =
                CreateConnectionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateConnectionConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateConnectionResponse>
                transformer = CreateConnectionConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "CreateConnection",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Connection/CreateConnection");
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
                                                retriedRequest.getCreateConnectionDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateConnectionValidationResponse createConnectionValidation(
            CreateConnectionValidationRequest request) {
        LOG.trace("Called createConnectionValidation");
        final CreateConnectionValidationRequest interceptedRequest =
                CreateConnectionValidationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateConnectionValidationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateConnectionValidationResponse>
                transformer = CreateConnectionValidationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "CreateConnectionValidation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ConnectionValidation/CreateConnectionValidation");
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
                                                        .getCreateConnectionValidationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateDataAssetResponse createDataAsset(CreateDataAssetRequest request) {
        LOG.trace("Called createDataAsset");
        final CreateDataAssetRequest interceptedRequest =
                CreateDataAssetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDataAssetConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateDataAssetResponse>
                transformer = CreateDataAssetConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "CreateDataAsset",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataAsset/CreateDataAsset");
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
                                                retriedRequest.getCreateDataAssetDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateDataFlowResponse createDataFlow(CreateDataFlowRequest request) {
        LOG.trace("Called createDataFlow");
        final CreateDataFlowRequest interceptedRequest =
                CreateDataFlowConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDataFlowConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateDataFlowResponse>
                transformer = CreateDataFlowConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "CreateDataFlow",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlow/CreateDataFlow");
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
                                                retriedRequest.getCreateDataFlowDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateDataFlowValidationResponse createDataFlowValidation(
            CreateDataFlowValidationRequest request) {
        LOG.trace("Called createDataFlowValidation");
        final CreateDataFlowValidationRequest interceptedRequest =
                CreateDataFlowValidationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDataFlowValidationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateDataFlowValidationResponse>
                transformer = CreateDataFlowValidationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "CreateDataFlowValidation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlowValidation/CreateDataFlowValidation");
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
                                                retriedRequest.getCreateDataFlowValidationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateDisApplicationResponse createDisApplication(CreateDisApplicationRequest request) {
        LOG.trace("Called createDisApplication");
        final CreateDisApplicationRequest interceptedRequest =
                CreateDisApplicationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDisApplicationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateDisApplicationResponse>
                transformer = CreateDisApplicationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "CreateDisApplication",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DisApplication/CreateDisApplication");
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
                                                retriedRequest.getCreateDisApplicationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateEntityShapeResponse createEntityShape(CreateEntityShapeRequest request) {
        LOG.trace("Called createEntityShape");
        final CreateEntityShapeRequest interceptedRequest =
                CreateEntityShapeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateEntityShapeConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateEntityShapeResponse>
                transformer = CreateEntityShapeConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "CreateEntityShape",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataEntity/CreateEntityShape");
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
                                                retriedRequest.getCreateEntityShapeDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateExternalPublicationResponse createExternalPublication(
            CreateExternalPublicationRequest request) {
        LOG.trace("Called createExternalPublication");
        final CreateExternalPublicationRequest interceptedRequest =
                CreateExternalPublicationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExternalPublicationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateExternalPublicationResponse>
                transformer = CreateExternalPublicationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "CreateExternalPublication",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublication/CreateExternalPublication");
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
                                                        .getCreateExternalPublicationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateExternalPublicationValidationResponse createExternalPublicationValidation(
            CreateExternalPublicationValidationRequest request) {
        LOG.trace("Called createExternalPublicationValidation");
        final CreateExternalPublicationValidationRequest interceptedRequest =
                CreateExternalPublicationValidationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateExternalPublicationValidationConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateExternalPublicationValidationResponse>
                transformer = CreateExternalPublicationValidationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "CreateExternalPublicationValidation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublicationValidation/CreateExternalPublicationValidation");
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
                                                        .getCreateExternalPublicationValidationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateFolderResponse createFolder(CreateFolderRequest request) {
        LOG.trace("Called createFolder");
        final CreateFolderRequest interceptedRequest =
                CreateFolderConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateFolderConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateFolderResponse>
                transformer = CreateFolderConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "CreateFolder",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Folder/CreateFolder");
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
                                                retriedRequest.getCreateFolderDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateFunctionLibraryResponse createFunctionLibrary(
            CreateFunctionLibraryRequest request) {
        LOG.trace("Called createFunctionLibrary");
        final CreateFunctionLibraryRequest interceptedRequest =
                CreateFunctionLibraryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateFunctionLibraryConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateFunctionLibraryResponse>
                transformer = CreateFunctionLibraryConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "CreateFunctionLibrary",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/FunctionLibrary/CreateFunctionLibrary");
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
                                                retriedRequest.getCreateFunctionLibraryDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreatePatchResponse createPatch(CreatePatchRequest request) {
        LOG.trace("Called createPatch");
        final CreatePatchRequest interceptedRequest =
                CreatePatchConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePatchConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreatePatchResponse>
                transformer = CreatePatchConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "CreatePatch",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/CreatePatch");
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
                                                retriedRequest.getCreatePatchDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreatePipelineResponse createPipeline(CreatePipelineRequest request) {
        LOG.trace("Called createPipeline");
        final CreatePipelineRequest interceptedRequest =
                CreatePipelineConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePipelineConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreatePipelineResponse>
                transformer = CreatePipelineConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "CreatePipeline",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Pipeline/CreatePipeline");
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
                                                retriedRequest.getCreatePipelineDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreatePipelineValidationResponse createPipelineValidation(
            CreatePipelineValidationRequest request) {
        LOG.trace("Called createPipelineValidation");
        final CreatePipelineValidationRequest interceptedRequest =
                CreatePipelineValidationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePipelineValidationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreatePipelineValidationResponse>
                transformer = CreatePipelineValidationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "CreatePipelineValidation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/PipelineValidation/CreatePipelineValidation");
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
                                                retriedRequest.getCreatePipelineValidationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateProjectResponse createProject(CreateProjectRequest request) {
        LOG.trace("Called createProject");
        final CreateProjectRequest interceptedRequest =
                CreateProjectConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateProjectConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateProjectResponse>
                transformer = CreateProjectConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "CreateProject",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Project/CreateProject");
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
                                                retriedRequest.getCreateProjectDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateScheduleResponse createSchedule(CreateScheduleRequest request) {
        LOG.trace("Called createSchedule");
        final CreateScheduleRequest interceptedRequest =
                CreateScheduleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateScheduleConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateScheduleResponse>
                transformer = CreateScheduleConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "CreateSchedule",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Schedule/CreateSchedule");
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
                                                retriedRequest.getCreateScheduleDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateTaskResponse createTask(CreateTaskRequest request) {
        LOG.trace("Called createTask");
        final CreateTaskRequest interceptedRequest = CreateTaskConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTaskConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateTaskResponse> transformer =
                CreateTaskConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "CreateTask",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Task/CreateTask");
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
                                                retriedRequest.getCreateTaskDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateTaskRunResponse createTaskRun(CreateTaskRunRequest request) {
        LOG.trace("Called createTaskRun");
        final CreateTaskRunRequest interceptedRequest =
                CreateTaskRunConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTaskRunConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateTaskRunResponse>
                transformer = CreateTaskRunConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "CreateTaskRun",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskRun/CreateTaskRun");
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
                                                retriedRequest.getCreateTaskRunDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateTaskScheduleResponse createTaskSchedule(CreateTaskScheduleRequest request) {
        LOG.trace("Called createTaskSchedule");
        final CreateTaskScheduleRequest interceptedRequest =
                CreateTaskScheduleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTaskScheduleConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateTaskScheduleResponse>
                transformer = CreateTaskScheduleConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "CreateTaskSchedule",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskSchedule/CreateTaskSchedule");
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
                                                retriedRequest.getCreateTaskScheduleDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateTaskValidationResponse createTaskValidation(CreateTaskValidationRequest request) {
        LOG.trace("Called createTaskValidation");
        final CreateTaskValidationRequest interceptedRequest =
                CreateTaskValidationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTaskValidationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateTaskValidationResponse>
                transformer = CreateTaskValidationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "CreateTaskValidation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskValidation/CreateTaskValidation");
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
                                                retriedRequest.getCreateTaskValidationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateUserDefinedFunctionResponse createUserDefinedFunction(
            CreateUserDefinedFunctionRequest request) {
        LOG.trace("Called createUserDefinedFunction");
        final CreateUserDefinedFunctionRequest interceptedRequest =
                CreateUserDefinedFunctionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateUserDefinedFunctionConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateUserDefinedFunctionResponse>
                transformer = CreateUserDefinedFunctionConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "CreateUserDefinedFunction",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunction/CreateUserDefinedFunction");
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
                                                        .getCreateUserDefinedFunctionDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateUserDefinedFunctionValidationResponse createUserDefinedFunctionValidation(
            CreateUserDefinedFunctionValidationRequest request) {
        LOG.trace("Called createUserDefinedFunctionValidation");
        final CreateUserDefinedFunctionValidationRequest interceptedRequest =
                CreateUserDefinedFunctionValidationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateUserDefinedFunctionValidationConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateUserDefinedFunctionValidationResponse>
                transformer = CreateUserDefinedFunctionValidationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "CreateUserDefinedFunctionValidation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunctionValidation/CreateUserDefinedFunctionValidation");
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
                                                        .getCreateUserDefinedFunctionValidationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) {
        LOG.trace("Called createWorkspace");
        final CreateWorkspaceRequest interceptedRequest =
                CreateWorkspaceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateWorkspaceConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateWorkspaceResponse>
                transformer = CreateWorkspaceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "CreateWorkspace",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/CreateWorkspace");
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
                                                retriedRequest.getCreateWorkspaceDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) {
        LOG.trace("Called deleteApplication");
        final DeleteApplicationRequest interceptedRequest =
                DeleteApplicationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteApplicationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteApplicationResponse>
                transformer = DeleteApplicationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "DeleteApplication",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/DeleteApplication");
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
    public DeleteConnectionResponse deleteConnection(DeleteConnectionRequest request) {
        LOG.trace("Called deleteConnection");
        final DeleteConnectionRequest interceptedRequest =
                DeleteConnectionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteConnectionConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteConnectionResponse>
                transformer = DeleteConnectionConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "DeleteConnection",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Connection/DeleteConnection");
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
    public DeleteConnectionValidationResponse deleteConnectionValidation(
            DeleteConnectionValidationRequest request) {
        LOG.trace("Called deleteConnectionValidation");
        final DeleteConnectionValidationRequest interceptedRequest =
                DeleteConnectionValidationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteConnectionValidationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteConnectionValidationResponse>
                transformer = DeleteConnectionValidationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "DeleteConnectionValidation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ConnectionValidation/DeleteConnectionValidation");
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
    public DeleteDataAssetResponse deleteDataAsset(DeleteDataAssetRequest request) {
        LOG.trace("Called deleteDataAsset");
        final DeleteDataAssetRequest interceptedRequest =
                DeleteDataAssetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDataAssetConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDataAssetResponse>
                transformer = DeleteDataAssetConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "DeleteDataAsset",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataAsset/DeleteDataAsset");
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
    public DeleteDataFlowResponse deleteDataFlow(DeleteDataFlowRequest request) {
        LOG.trace("Called deleteDataFlow");
        final DeleteDataFlowRequest interceptedRequest =
                DeleteDataFlowConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDataFlowConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDataFlowResponse>
                transformer = DeleteDataFlowConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "DeleteDataFlow",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlow/DeleteDataFlow");
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
    public DeleteDataFlowValidationResponse deleteDataFlowValidation(
            DeleteDataFlowValidationRequest request) {
        LOG.trace("Called deleteDataFlowValidation");
        final DeleteDataFlowValidationRequest interceptedRequest =
                DeleteDataFlowValidationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDataFlowValidationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDataFlowValidationResponse>
                transformer = DeleteDataFlowValidationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "DeleteDataFlowValidation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlowValidation/DeleteDataFlowValidation");
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
    public DeleteDisApplicationResponse deleteDisApplication(DeleteDisApplicationRequest request) {
        LOG.trace("Called deleteDisApplication");
        final DeleteDisApplicationRequest interceptedRequest =
                DeleteDisApplicationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDisApplicationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDisApplicationResponse>
                transformer = DeleteDisApplicationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "DeleteDisApplication",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DisApplication/DeleteDisApplication");
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
    public DeleteExternalPublicationResponse deleteExternalPublication(
            DeleteExternalPublicationRequest request) {
        LOG.trace("Called deleteExternalPublication");
        final DeleteExternalPublicationRequest interceptedRequest =
                DeleteExternalPublicationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteExternalPublicationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteExternalPublicationResponse>
                transformer = DeleteExternalPublicationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "DeleteExternalPublication",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublication/DeleteExternalPublication");
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
    public DeleteExternalPublicationValidationResponse deleteExternalPublicationValidation(
            DeleteExternalPublicationValidationRequest request) {
        LOG.trace("Called deleteExternalPublicationValidation");
        final DeleteExternalPublicationValidationRequest interceptedRequest =
                DeleteExternalPublicationValidationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteExternalPublicationValidationConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteExternalPublicationValidationResponse>
                transformer = DeleteExternalPublicationValidationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "DeleteExternalPublicationValidation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublicationValidation/DeleteExternalPublicationValidation");
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
    public DeleteFolderResponse deleteFolder(DeleteFolderRequest request) {
        LOG.trace("Called deleteFolder");
        final DeleteFolderRequest interceptedRequest =
                DeleteFolderConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteFolderConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteFolderResponse>
                transformer = DeleteFolderConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "DeleteFolder",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Folder/DeleteFolder");
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
    public DeleteFunctionLibraryResponse deleteFunctionLibrary(
            DeleteFunctionLibraryRequest request) {
        LOG.trace("Called deleteFunctionLibrary");
        final DeleteFunctionLibraryRequest interceptedRequest =
                DeleteFunctionLibraryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteFunctionLibraryConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteFunctionLibraryResponse>
                transformer = DeleteFunctionLibraryConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "DeleteFunctionLibrary",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/FunctionLibrary/DeleteFunctionLibrary");
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
    public DeletePatchResponse deletePatch(DeletePatchRequest request) {
        LOG.trace("Called deletePatch");
        final DeletePatchRequest interceptedRequest =
                DeletePatchConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePatchConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeletePatchResponse>
                transformer = DeletePatchConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "DeletePatch",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/DeletePatch");
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
    public DeletePipelineResponse deletePipeline(DeletePipelineRequest request) {
        LOG.trace("Called deletePipeline");
        final DeletePipelineRequest interceptedRequest =
                DeletePipelineConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePipelineConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeletePipelineResponse>
                transformer = DeletePipelineConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "DeletePipeline",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Pipeline/DeletePipeline");
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
    public DeletePipelineValidationResponse deletePipelineValidation(
            DeletePipelineValidationRequest request) {
        LOG.trace("Called deletePipelineValidation");
        final DeletePipelineValidationRequest interceptedRequest =
                DeletePipelineValidationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePipelineValidationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeletePipelineValidationResponse>
                transformer = DeletePipelineValidationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "DeletePipelineValidation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/PipelineValidation/DeletePipelineValidation");
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
    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) {
        LOG.trace("Called deleteProject");
        final DeleteProjectRequest interceptedRequest =
                DeleteProjectConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteProjectConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteProjectResponse>
                transformer = DeleteProjectConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "DeleteProject",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Project/DeleteProject");
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
    public DeleteScheduleResponse deleteSchedule(DeleteScheduleRequest request) {
        LOG.trace("Called deleteSchedule");
        final DeleteScheduleRequest interceptedRequest =
                DeleteScheduleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteScheduleConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteScheduleResponse>
                transformer = DeleteScheduleConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "DeleteSchedule",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Schedule/DeleteSchedule");
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
    public DeleteTaskResponse deleteTask(DeleteTaskRequest request) {
        LOG.trace("Called deleteTask");
        final DeleteTaskRequest interceptedRequest = DeleteTaskConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTaskConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteTaskResponse> transformer =
                DeleteTaskConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "DeleteTask",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Task/DeleteTask");
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
    public DeleteTaskRunResponse deleteTaskRun(DeleteTaskRunRequest request) {
        LOG.trace("Called deleteTaskRun");
        final DeleteTaskRunRequest interceptedRequest =
                DeleteTaskRunConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTaskRunConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteTaskRunResponse>
                transformer = DeleteTaskRunConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "DeleteTaskRun",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskRun/DeleteTaskRun");
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
    public DeleteTaskScheduleResponse deleteTaskSchedule(DeleteTaskScheduleRequest request) {
        LOG.trace("Called deleteTaskSchedule");
        final DeleteTaskScheduleRequest interceptedRequest =
                DeleteTaskScheduleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTaskScheduleConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteTaskScheduleResponse>
                transformer = DeleteTaskScheduleConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "DeleteTaskSchedule",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskSchedule/DeleteTaskSchedule");
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
    public DeleteTaskValidationResponse deleteTaskValidation(DeleteTaskValidationRequest request) {
        LOG.trace("Called deleteTaskValidation");
        final DeleteTaskValidationRequest interceptedRequest =
                DeleteTaskValidationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTaskValidationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteTaskValidationResponse>
                transformer = DeleteTaskValidationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "DeleteTaskValidation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskValidation/DeleteTaskValidation");
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
    public DeleteUserDefinedFunctionResponse deleteUserDefinedFunction(
            DeleteUserDefinedFunctionRequest request) {
        LOG.trace("Called deleteUserDefinedFunction");
        final DeleteUserDefinedFunctionRequest interceptedRequest =
                DeleteUserDefinedFunctionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteUserDefinedFunctionConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteUserDefinedFunctionResponse>
                transformer = DeleteUserDefinedFunctionConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "DeleteUserDefinedFunction",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunction/DeleteUserDefinedFunction");
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
    public DeleteUserDefinedFunctionValidationResponse deleteUserDefinedFunctionValidation(
            DeleteUserDefinedFunctionValidationRequest request) {
        LOG.trace("Called deleteUserDefinedFunctionValidation");
        final DeleteUserDefinedFunctionValidationRequest interceptedRequest =
                DeleteUserDefinedFunctionValidationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteUserDefinedFunctionValidationConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteUserDefinedFunctionValidationResponse>
                transformer = DeleteUserDefinedFunctionValidationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "DeleteUserDefinedFunctionValidation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunctionValidation/DeleteUserDefinedFunctionValidation");
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
    public DeleteWorkspaceResponse deleteWorkspace(DeleteWorkspaceRequest request) {
        LOG.trace("Called deleteWorkspace");
        final DeleteWorkspaceRequest interceptedRequest =
                DeleteWorkspaceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteWorkspaceConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteWorkspaceResponse>
                transformer = DeleteWorkspaceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "DeleteWorkspace",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/DeleteWorkspace");
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
    public GetApplicationResponse getApplication(GetApplicationRequest request) {
        LOG.trace("Called getApplication");
        final GetApplicationRequest interceptedRequest =
                GetApplicationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetApplicationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetApplicationResponse>
                transformer = GetApplicationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetApplication",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/GetApplication");
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
    public GetConnectionResponse getConnection(GetConnectionRequest request) {
        LOG.trace("Called getConnection");
        final GetConnectionRequest interceptedRequest =
                GetConnectionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetConnectionConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetConnectionResponse>
                transformer = GetConnectionConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetConnection",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Connection/GetConnection");
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
    public GetConnectionValidationResponse getConnectionValidation(
            GetConnectionValidationRequest request) {
        LOG.trace("Called getConnectionValidation");
        final GetConnectionValidationRequest interceptedRequest =
                GetConnectionValidationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetConnectionValidationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetConnectionValidationResponse>
                transformer = GetConnectionValidationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetConnectionValidation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ConnectionValidation/GetConnectionValidation");
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
    public GetCountStatisticResponse getCountStatistic(GetCountStatisticRequest request) {
        LOG.trace("Called getCountStatistic");
        final GetCountStatisticRequest interceptedRequest =
                GetCountStatisticConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCountStatisticConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetCountStatisticResponse>
                transformer = GetCountStatisticConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetCountStatistic",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Project/GetCountStatistic");
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
    public GetDataAssetResponse getDataAsset(GetDataAssetRequest request) {
        LOG.trace("Called getDataAsset");
        final GetDataAssetRequest interceptedRequest =
                GetDataAssetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataAssetConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDataAssetResponse>
                transformer = GetDataAssetConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetDataAsset",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataAsset/GetDataAsset");
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
    public GetDataEntityResponse getDataEntity(GetDataEntityRequest request) {
        LOG.trace("Called getDataEntity");
        final GetDataEntityRequest interceptedRequest =
                GetDataEntityConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataEntityConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDataEntityResponse>
                transformer = GetDataEntityConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetDataEntity",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataEntity/GetDataEntity");
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
    public GetDataFlowResponse getDataFlow(GetDataFlowRequest request) {
        LOG.trace("Called getDataFlow");
        final GetDataFlowRequest interceptedRequest =
                GetDataFlowConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataFlowConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDataFlowResponse>
                transformer = GetDataFlowConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetDataFlow",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlow/GetDataFlow");
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
    public GetDataFlowValidationResponse getDataFlowValidation(
            GetDataFlowValidationRequest request) {
        LOG.trace("Called getDataFlowValidation");
        final GetDataFlowValidationRequest interceptedRequest =
                GetDataFlowValidationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataFlowValidationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDataFlowValidationResponse>
                transformer = GetDataFlowValidationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetDataFlowValidation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlowValidation/GetDataFlowValidation");
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
    public GetDependentObjectResponse getDependentObject(GetDependentObjectRequest request) {
        LOG.trace("Called getDependentObject");
        final GetDependentObjectRequest interceptedRequest =
                GetDependentObjectConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDependentObjectConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDependentObjectResponse>
                transformer = GetDependentObjectConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetDependentObject",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/GetDependentObject");
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
    public GetDisApplicationResponse getDisApplication(GetDisApplicationRequest request) {
        LOG.trace("Called getDisApplication");
        final GetDisApplicationRequest interceptedRequest =
                GetDisApplicationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDisApplicationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDisApplicationResponse>
                transformer = GetDisApplicationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetDisApplication",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DisApplication/GetDisApplication");
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
    public GetExternalPublicationResponse getExternalPublication(
            GetExternalPublicationRequest request) {
        LOG.trace("Called getExternalPublication");
        final GetExternalPublicationRequest interceptedRequest =
                GetExternalPublicationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalPublicationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetExternalPublicationResponse>
                transformer = GetExternalPublicationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetExternalPublication",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublication/GetExternalPublication");
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
    public GetExternalPublicationValidationResponse getExternalPublicationValidation(
            GetExternalPublicationValidationRequest request) {
        LOG.trace("Called getExternalPublicationValidation");
        final GetExternalPublicationValidationRequest interceptedRequest =
                GetExternalPublicationValidationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetExternalPublicationValidationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetExternalPublicationValidationResponse>
                transformer = GetExternalPublicationValidationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetExternalPublicationValidation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublicationValidation/GetExternalPublicationValidation");
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
    public GetFolderResponse getFolder(GetFolderRequest request) {
        LOG.trace("Called getFolder");
        final GetFolderRequest interceptedRequest = GetFolderConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFolderConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetFolderResponse> transformer =
                GetFolderConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetFolder",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Folder/GetFolder");
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
    public GetFunctionLibraryResponse getFunctionLibrary(GetFunctionLibraryRequest request) {
        LOG.trace("Called getFunctionLibrary");
        final GetFunctionLibraryRequest interceptedRequest =
                GetFunctionLibraryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetFunctionLibraryConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetFunctionLibraryResponse>
                transformer = GetFunctionLibraryConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetFunctionLibrary",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/FunctionLibrary/GetFunctionLibrary");
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
    public GetPatchResponse getPatch(GetPatchRequest request) {
        LOG.trace("Called getPatch");
        final GetPatchRequest interceptedRequest = GetPatchConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPatchConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetPatchResponse> transformer =
                GetPatchConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetPatch",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/GetPatch");
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
    public GetPipelineResponse getPipeline(GetPipelineRequest request) {
        LOG.trace("Called getPipeline");
        final GetPipelineRequest interceptedRequest =
                GetPipelineConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPipelineConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetPipelineResponse>
                transformer = GetPipelineConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetPipeline",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Pipeline/GetPipeline");
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
    public GetPipelineValidationResponse getPipelineValidation(
            GetPipelineValidationRequest request) {
        LOG.trace("Called getPipelineValidation");
        final GetPipelineValidationRequest interceptedRequest =
                GetPipelineValidationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPipelineValidationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetPipelineValidationResponse>
                transformer = GetPipelineValidationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetPipelineValidation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/PipelineValidation/GetPipelineValidation");
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
    public GetProjectResponse getProject(GetProjectRequest request) {
        LOG.trace("Called getProject");
        final GetProjectRequest interceptedRequest = GetProjectConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetProjectConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetProjectResponse> transformer =
                GetProjectConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetProject",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Project/GetProject");
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
    public GetPublishedObjectResponse getPublishedObject(GetPublishedObjectRequest request) {
        LOG.trace("Called getPublishedObject");
        final GetPublishedObjectRequest interceptedRequest =
                GetPublishedObjectConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPublishedObjectConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetPublishedObjectResponse>
                transformer = GetPublishedObjectConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetPublishedObject",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/GetPublishedObject");
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
    public GetReferenceResponse getReference(GetReferenceRequest request) {
        LOG.trace("Called getReference");
        final GetReferenceRequest interceptedRequest =
                GetReferenceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetReferenceConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetReferenceResponse>
                transformer = GetReferenceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetReference",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Reference/GetReference");
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
    public GetScheduleResponse getSchedule(GetScheduleRequest request) {
        LOG.trace("Called getSchedule");
        final GetScheduleRequest interceptedRequest =
                GetScheduleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetScheduleConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetScheduleResponse>
                transformer = GetScheduleConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetSchedule",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Schedule/GetSchedule");
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
    public GetSchemaResponse getSchema(GetSchemaRequest request) {
        LOG.trace("Called getSchema");
        final GetSchemaRequest interceptedRequest = GetSchemaConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSchemaConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetSchemaResponse> transformer =
                GetSchemaConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetSchema",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Schema/GetSchema");
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
    public GetTaskResponse getTask(GetTaskRequest request) {
        LOG.trace("Called getTask");
        final GetTaskRequest interceptedRequest = GetTaskConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTaskConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetTaskResponse> transformer =
                GetTaskConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetTask",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Task/GetTask");
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
    public GetTaskRunResponse getTaskRun(GetTaskRunRequest request) {
        LOG.trace("Called getTaskRun");
        final GetTaskRunRequest interceptedRequest = GetTaskRunConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTaskRunConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetTaskRunResponse> transformer =
                GetTaskRunConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetTaskRun",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskRun/GetTaskRun");
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
    public GetTaskScheduleResponse getTaskSchedule(GetTaskScheduleRequest request) {
        LOG.trace("Called getTaskSchedule");
        final GetTaskScheduleRequest interceptedRequest =
                GetTaskScheduleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTaskScheduleConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetTaskScheduleResponse>
                transformer = GetTaskScheduleConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetTaskSchedule",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskSchedule/GetTaskSchedule");
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
    public GetTaskValidationResponse getTaskValidation(GetTaskValidationRequest request) {
        LOG.trace("Called getTaskValidation");
        final GetTaskValidationRequest interceptedRequest =
                GetTaskValidationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTaskValidationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetTaskValidationResponse>
                transformer = GetTaskValidationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetTaskValidation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskValidation/GetTaskValidation");
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
    public GetUserDefinedFunctionResponse getUserDefinedFunction(
            GetUserDefinedFunctionRequest request) {
        LOG.trace("Called getUserDefinedFunction");
        final GetUserDefinedFunctionRequest interceptedRequest =
                GetUserDefinedFunctionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserDefinedFunctionConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetUserDefinedFunctionResponse>
                transformer = GetUserDefinedFunctionConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetUserDefinedFunction",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunction/GetUserDefinedFunction");
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
    public GetUserDefinedFunctionValidationResponse getUserDefinedFunctionValidation(
            GetUserDefinedFunctionValidationRequest request) {
        LOG.trace("Called getUserDefinedFunctionValidation");
        final GetUserDefinedFunctionValidationRequest interceptedRequest =
                GetUserDefinedFunctionValidationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserDefinedFunctionValidationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetUserDefinedFunctionValidationResponse>
                transformer = GetUserDefinedFunctionValidationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetUserDefinedFunctionValidation",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunctionValidation/GetUserDefinedFunctionValidation");
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
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {
        LOG.trace("Called getWorkRequest");
        final GetWorkRequestRequest interceptedRequest =
                GetWorkRequestConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWorkRequestConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetWorkRequestResponse>
                transformer = GetWorkRequestConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetWorkRequest",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/WorkRequest/GetWorkRequest");
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
    public GetWorkspaceResponse getWorkspace(GetWorkspaceRequest request) {
        LOG.trace("Called getWorkspace");
        final GetWorkspaceRequest interceptedRequest =
                GetWorkspaceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWorkspaceConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetWorkspaceResponse>
                transformer = GetWorkspaceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "GetWorkspace",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/GetWorkspace");
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
    public ListApplicationsResponse listApplications(ListApplicationsRequest request) {
        LOG.trace("Called listApplications");
        final ListApplicationsRequest interceptedRequest =
                ListApplicationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListApplicationsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListApplicationsResponse>
                transformer = ListApplicationsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListApplications",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/ListApplications");
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
    public ListConnectionValidationsResponse listConnectionValidations(
            ListConnectionValidationsRequest request) {
        LOG.trace("Called listConnectionValidations");
        final ListConnectionValidationsRequest interceptedRequest =
                ListConnectionValidationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListConnectionValidationsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListConnectionValidationsResponse>
                transformer = ListConnectionValidationsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListConnectionValidations",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ConnectionValidation/ListConnectionValidations");
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
    public ListConnectionsResponse listConnections(ListConnectionsRequest request) {
        LOG.trace("Called listConnections");
        final ListConnectionsRequest interceptedRequest =
                ListConnectionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListConnectionsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListConnectionsResponse>
                transformer = ListConnectionsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListConnections",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Connection/ListConnections");
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
    public ListDataAssetsResponse listDataAssets(ListDataAssetsRequest request) {
        LOG.trace("Called listDataAssets");
        final ListDataAssetsRequest interceptedRequest =
                ListDataAssetsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataAssetsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDataAssetsResponse>
                transformer = ListDataAssetsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListDataAssets",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataAsset/ListDataAssets");
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
    public ListDataEntitiesResponse listDataEntities(ListDataEntitiesRequest request) {
        LOG.trace("Called listDataEntities");
        final ListDataEntitiesRequest interceptedRequest =
                ListDataEntitiesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataEntitiesConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDataEntitiesResponse>
                transformer = ListDataEntitiesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListDataEntities",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataEntity/ListDataEntities");
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
    public ListDataFlowValidationsResponse listDataFlowValidations(
            ListDataFlowValidationsRequest request) {
        LOG.trace("Called listDataFlowValidations");
        final ListDataFlowValidationsRequest interceptedRequest =
                ListDataFlowValidationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataFlowValidationsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDataFlowValidationsResponse>
                transformer = ListDataFlowValidationsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListDataFlowValidations",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlowValidation/ListDataFlowValidations");
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
    public ListDataFlowsResponse listDataFlows(ListDataFlowsRequest request) {
        LOG.trace("Called listDataFlows");
        final ListDataFlowsRequest interceptedRequest =
                ListDataFlowsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataFlowsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDataFlowsResponse>
                transformer = ListDataFlowsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListDataFlows",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlow/ListDataFlows");
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
    public ListDependentObjectsResponse listDependentObjects(ListDependentObjectsRequest request) {
        LOG.trace("Called listDependentObjects");
        final ListDependentObjectsRequest interceptedRequest =
                ListDependentObjectsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDependentObjectsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDependentObjectsResponse>
                transformer = ListDependentObjectsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListDependentObjects",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/ListDependentObjects");
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
    public ListDisApplicationsResponse listDisApplications(ListDisApplicationsRequest request) {
        LOG.trace("Called listDisApplications");
        final ListDisApplicationsRequest interceptedRequest =
                ListDisApplicationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDisApplicationsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDisApplicationsResponse>
                transformer = ListDisApplicationsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListDisApplications",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DisApplication/ListDisApplications");
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
    public ListExternalPublicationValidationsResponse listExternalPublicationValidations(
            ListExternalPublicationValidationsRequest request) {
        LOG.trace("Called listExternalPublicationValidations");
        final ListExternalPublicationValidationsRequest interceptedRequest =
                ListExternalPublicationValidationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalPublicationValidationsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListExternalPublicationValidationsResponse>
                transformer = ListExternalPublicationValidationsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListExternalPublicationValidations",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublicationValidation/ListExternalPublicationValidations");
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
    public ListExternalPublicationsResponse listExternalPublications(
            ListExternalPublicationsRequest request) {
        LOG.trace("Called listExternalPublications");
        final ListExternalPublicationsRequest interceptedRequest =
                ListExternalPublicationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListExternalPublicationsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListExternalPublicationsResponse>
                transformer = ListExternalPublicationsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListExternalPublications",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublication/ListExternalPublications");
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
    public ListFoldersResponse listFolders(ListFoldersRequest request) {
        LOG.trace("Called listFolders");
        final ListFoldersRequest interceptedRequest =
                ListFoldersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFoldersConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListFoldersResponse>
                transformer = ListFoldersConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListFolders",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Folder/ListFolders");
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
    public ListFunctionLibrariesResponse listFunctionLibraries(
            ListFunctionLibrariesRequest request) {
        LOG.trace("Called listFunctionLibraries");
        final ListFunctionLibrariesRequest interceptedRequest =
                ListFunctionLibrariesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFunctionLibrariesConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListFunctionLibrariesResponse>
                transformer = ListFunctionLibrariesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListFunctionLibraries",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/FunctionLibrary/ListFunctionLibraries");
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
    public ListPatchChangesResponse listPatchChanges(ListPatchChangesRequest request) {
        LOG.trace("Called listPatchChanges");
        final ListPatchChangesRequest interceptedRequest =
                ListPatchChangesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPatchChangesConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListPatchChangesResponse>
                transformer = ListPatchChangesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListPatchChanges",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/ListPatchChanges");
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
    public ListPatchesResponse listPatches(ListPatchesRequest request) {
        LOG.trace("Called listPatches");
        final ListPatchesRequest interceptedRequest =
                ListPatchesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPatchesConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListPatchesResponse>
                transformer = ListPatchesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListPatches",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/ListPatches");
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
    public ListPipelineValidationsResponse listPipelineValidations(
            ListPipelineValidationsRequest request) {
        LOG.trace("Called listPipelineValidations");
        final ListPipelineValidationsRequest interceptedRequest =
                ListPipelineValidationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPipelineValidationsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListPipelineValidationsResponse>
                transformer = ListPipelineValidationsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListPipelineValidations",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/PipelineValidation/ListPipelineValidations");
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
    public ListPipelinesResponse listPipelines(ListPipelinesRequest request) {
        LOG.trace("Called listPipelines");
        final ListPipelinesRequest interceptedRequest =
                ListPipelinesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPipelinesConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListPipelinesResponse>
                transformer = ListPipelinesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListPipelines",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Pipeline/ListPipelines");
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
    public ListProjectsResponse listProjects(ListProjectsRequest request) {
        LOG.trace("Called listProjects");
        final ListProjectsRequest interceptedRequest =
                ListProjectsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProjectsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListProjectsResponse>
                transformer = ListProjectsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListProjects",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Project/ListProjects");
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
    public ListPublishedObjectsResponse listPublishedObjects(ListPublishedObjectsRequest request) {
        LOG.trace("Called listPublishedObjects");
        final ListPublishedObjectsRequest interceptedRequest =
                ListPublishedObjectsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPublishedObjectsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListPublishedObjectsResponse>
                transformer = ListPublishedObjectsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListPublishedObjects",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/ListPublishedObjects");
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
    public ListReferencesResponse listReferences(ListReferencesRequest request) {
        LOG.trace("Called listReferences");
        final ListReferencesRequest interceptedRequest =
                ListReferencesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListReferencesConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListReferencesResponse>
                transformer = ListReferencesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListReferences",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Reference/ListReferences");
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
    public ListSchedulesResponse listSchedules(ListSchedulesRequest request) {
        LOG.trace("Called listSchedules");
        final ListSchedulesRequest interceptedRequest =
                ListSchedulesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSchedulesConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListSchedulesResponse>
                transformer = ListSchedulesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListSchedules",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Schedule/ListSchedules");
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
    public ListSchemasResponse listSchemas(ListSchemasRequest request) {
        LOG.trace("Called listSchemas");
        final ListSchemasRequest interceptedRequest =
                ListSchemasConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSchemasConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListSchemasResponse>
                transformer = ListSchemasConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListSchemas",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Schema/ListSchemas");
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
    public ListTaskRunLogsResponse listTaskRunLogs(ListTaskRunLogsRequest request) {
        LOG.trace("Called listTaskRunLogs");
        final ListTaskRunLogsRequest interceptedRequest =
                ListTaskRunLogsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTaskRunLogsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListTaskRunLogsResponse>
                transformer = ListTaskRunLogsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListTaskRunLogs",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskRunLogSummary/ListTaskRunLogs");
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
    public ListTaskRunsResponse listTaskRuns(ListTaskRunsRequest request) {
        LOG.trace("Called listTaskRuns");
        final ListTaskRunsRequest interceptedRequest =
                ListTaskRunsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTaskRunsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListTaskRunsResponse>
                transformer = ListTaskRunsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListTaskRuns",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskRun/ListTaskRuns");
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
    public ListTaskSchedulesResponse listTaskSchedules(ListTaskSchedulesRequest request) {
        LOG.trace("Called listTaskSchedules");
        final ListTaskSchedulesRequest interceptedRequest =
                ListTaskSchedulesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTaskSchedulesConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListTaskSchedulesResponse>
                transformer = ListTaskSchedulesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListTaskSchedules",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskSchedule/ListTaskSchedules");
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
    public ListTaskValidationsResponse listTaskValidations(ListTaskValidationsRequest request) {
        LOG.trace("Called listTaskValidations");
        final ListTaskValidationsRequest interceptedRequest =
                ListTaskValidationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTaskValidationsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListTaskValidationsResponse>
                transformer = ListTaskValidationsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListTaskValidations",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskValidation/ListTaskValidations");
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
    public ListTasksResponse listTasks(ListTasksRequest request) {
        LOG.trace("Called listTasks");
        final ListTasksRequest interceptedRequest = ListTasksConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTasksConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListTasksResponse> transformer =
                ListTasksConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListTasks",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Task/ListTasks");
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
    public ListUserDefinedFunctionValidationsResponse listUserDefinedFunctionValidations(
            ListUserDefinedFunctionValidationsRequest request) {
        LOG.trace("Called listUserDefinedFunctionValidations");
        final ListUserDefinedFunctionValidationsRequest interceptedRequest =
                ListUserDefinedFunctionValidationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUserDefinedFunctionValidationsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListUserDefinedFunctionValidationsResponse>
                transformer = ListUserDefinedFunctionValidationsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListUserDefinedFunctionValidations",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunctionValidation/ListUserDefinedFunctionValidations");
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
    public ListUserDefinedFunctionsResponse listUserDefinedFunctions(
            ListUserDefinedFunctionsRequest request) {
        LOG.trace("Called listUserDefinedFunctions");
        final ListUserDefinedFunctionsRequest interceptedRequest =
                ListUserDefinedFunctionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUserDefinedFunctionsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListUserDefinedFunctionsResponse>
                transformer = ListUserDefinedFunctionsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListUserDefinedFunctions",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunction/ListUserDefinedFunctions");
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
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {
        LOG.trace("Called listWorkRequestErrors");
        final ListWorkRequestErrorsRequest interceptedRequest =
                ListWorkRequestErrorsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkRequestErrorsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWorkRequestErrorsResponse>
                transformer = ListWorkRequestErrorsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListWorkRequestErrors",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/WorkRequest/ListWorkRequestErrors");
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
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {
        LOG.trace("Called listWorkRequestLogs");
        final ListWorkRequestLogsRequest interceptedRequest =
                ListWorkRequestLogsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkRequestLogsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWorkRequestLogsResponse>
                transformer = ListWorkRequestLogsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListWorkRequestLogs",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/WorkRequest/ListWorkRequestLogs");
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
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        LOG.trace("Called listWorkRequests");
        final ListWorkRequestsRequest interceptedRequest =
                ListWorkRequestsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkRequestsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWorkRequestsResponse>
                transformer = ListWorkRequestsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListWorkRequests",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/WorkRequest/ListWorkRequests");
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
    public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request) {
        LOG.trace("Called listWorkspaces");
        final ListWorkspacesRequest interceptedRequest =
                ListWorkspacesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkspacesConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWorkspacesResponse>
                transformer = ListWorkspacesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "ListWorkspaces",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/ListWorkspaces");
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
    public StartWorkspaceResponse startWorkspace(StartWorkspaceRequest request) {
        LOG.trace("Called startWorkspace");
        final StartWorkspaceRequest interceptedRequest =
                StartWorkspaceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StartWorkspaceConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, StartWorkspaceResponse>
                transformer = StartWorkspaceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "StartWorkspace",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/StartWorkspace");
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
                                        client.post(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public StopWorkspaceResponse stopWorkspace(StopWorkspaceRequest request) {
        LOG.trace("Called stopWorkspace");
        final StopWorkspaceRequest interceptedRequest =
                StopWorkspaceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StopWorkspaceConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, StopWorkspaceResponse>
                transformer = StopWorkspaceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "StopWorkspace",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/StopWorkspace");
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
                                        client.post(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateApplicationResponse updateApplication(UpdateApplicationRequest request) {
        LOG.trace("Called updateApplication");
        final UpdateApplicationRequest interceptedRequest =
                UpdateApplicationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateApplicationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateApplicationResponse>
                transformer = UpdateApplicationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "UpdateApplication",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Application/UpdateApplication");
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
                                                retriedRequest.getUpdateApplicationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateConnectionResponse updateConnection(UpdateConnectionRequest request) {
        LOG.trace("Called updateConnection");
        final UpdateConnectionRequest interceptedRequest =
                UpdateConnectionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateConnectionConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateConnectionResponse>
                transformer = UpdateConnectionConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "UpdateConnection",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Connection/UpdateConnection");
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
                                                retriedRequest.getUpdateConnectionDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateDataAssetResponse updateDataAsset(UpdateDataAssetRequest request) {
        LOG.trace("Called updateDataAsset");
        final UpdateDataAssetRequest interceptedRequest =
                UpdateDataAssetConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDataAssetConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDataAssetResponse>
                transformer = UpdateDataAssetConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "UpdateDataAsset",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataAsset/UpdateDataAsset");
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
                                                retriedRequest.getUpdateDataAssetDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateDataFlowResponse updateDataFlow(UpdateDataFlowRequest request) {
        LOG.trace("Called updateDataFlow");
        final UpdateDataFlowRequest interceptedRequest =
                UpdateDataFlowConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDataFlowConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDataFlowResponse>
                transformer = UpdateDataFlowConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "UpdateDataFlow",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DataFlow/UpdateDataFlow");
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
                                                retriedRequest.getUpdateDataFlowDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateDisApplicationResponse updateDisApplication(UpdateDisApplicationRequest request) {
        LOG.trace("Called updateDisApplication");
        final UpdateDisApplicationRequest interceptedRequest =
                UpdateDisApplicationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDisApplicationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateDisApplicationResponse>
                transformer = UpdateDisApplicationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "UpdateDisApplication",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/DisApplication/UpdateDisApplication");
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
                                                retriedRequest.getUpdateDisApplicationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateExternalPublicationResponse updateExternalPublication(
            UpdateExternalPublicationRequest request) {
        LOG.trace("Called updateExternalPublication");
        final UpdateExternalPublicationRequest interceptedRequest =
                UpdateExternalPublicationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateExternalPublicationConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateExternalPublicationResponse>
                transformer = UpdateExternalPublicationConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "UpdateExternalPublication",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/ExternalPublication/UpdateExternalPublication");
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
                                                        .getUpdateExternalPublicationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateFolderResponse updateFolder(UpdateFolderRequest request) {
        LOG.trace("Called updateFolder");
        final UpdateFolderRequest interceptedRequest =
                UpdateFolderConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateFolderConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateFolderResponse>
                transformer = UpdateFolderConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "UpdateFolder",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Folder/UpdateFolder");
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
                                                retriedRequest.getUpdateFolderDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateFunctionLibraryResponse updateFunctionLibrary(
            UpdateFunctionLibraryRequest request) {
        LOG.trace("Called updateFunctionLibrary");
        final UpdateFunctionLibraryRequest interceptedRequest =
                UpdateFunctionLibraryConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateFunctionLibraryConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateFunctionLibraryResponse>
                transformer = UpdateFunctionLibraryConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "UpdateFunctionLibrary",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/FunctionLibrary/UpdateFunctionLibrary");
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
                                                retriedRequest.getUpdateFunctionLibraryDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdatePipelineResponse updatePipeline(UpdatePipelineRequest request) {
        LOG.trace("Called updatePipeline");
        final UpdatePipelineRequest interceptedRequest =
                UpdatePipelineConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePipelineConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdatePipelineResponse>
                transformer = UpdatePipelineConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "UpdatePipeline",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Pipeline/UpdatePipeline");
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
                                                retriedRequest.getUpdatePipelineDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateProjectResponse updateProject(UpdateProjectRequest request) {
        LOG.trace("Called updateProject");
        final UpdateProjectRequest interceptedRequest =
                UpdateProjectConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateProjectConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateProjectResponse>
                transformer = UpdateProjectConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "UpdateProject",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Project/UpdateProject");
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
                                                retriedRequest.getUpdateProjectDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateReferenceResponse updateReference(UpdateReferenceRequest request) {
        LOG.trace("Called updateReference");
        final UpdateReferenceRequest interceptedRequest =
                UpdateReferenceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateReferenceConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateReferenceResponse>
                transformer = UpdateReferenceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "UpdateReference",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Reference/UpdateReference");
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
                                                retriedRequest.getUpdateReferenceDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateScheduleResponse updateSchedule(UpdateScheduleRequest request) {
        LOG.trace("Called updateSchedule");
        final UpdateScheduleRequest interceptedRequest =
                UpdateScheduleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateScheduleConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateScheduleResponse>
                transformer = UpdateScheduleConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "UpdateSchedule",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Schedule/UpdateSchedule");
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
                                                retriedRequest.getUpdateScheduleDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateTaskResponse updateTask(UpdateTaskRequest request) {
        LOG.trace("Called updateTask");
        final UpdateTaskRequest interceptedRequest = UpdateTaskConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTaskConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateTaskResponse> transformer =
                UpdateTaskConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "UpdateTask",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Task/UpdateTask");
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
                                                retriedRequest.getUpdateTaskDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateTaskRunResponse updateTaskRun(UpdateTaskRunRequest request) {
        LOG.trace("Called updateTaskRun");
        final UpdateTaskRunRequest interceptedRequest =
                UpdateTaskRunConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTaskRunConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateTaskRunResponse>
                transformer = UpdateTaskRunConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "UpdateTaskRun",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskRun/UpdateTaskRun");
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
                                                retriedRequest.getUpdateTaskRunDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateTaskScheduleResponse updateTaskSchedule(UpdateTaskScheduleRequest request) {
        LOG.trace("Called updateTaskSchedule");
        final UpdateTaskScheduleRequest interceptedRequest =
                UpdateTaskScheduleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTaskScheduleConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateTaskScheduleResponse>
                transformer = UpdateTaskScheduleConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "UpdateTaskSchedule",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/TaskSchedule/UpdateTaskSchedule");
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
                                                retriedRequest.getUpdateTaskScheduleDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateUserDefinedFunctionResponse updateUserDefinedFunction(
            UpdateUserDefinedFunctionRequest request) {
        LOG.trace("Called updateUserDefinedFunction");
        final UpdateUserDefinedFunctionRequest interceptedRequest =
                UpdateUserDefinedFunctionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateUserDefinedFunctionConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateUserDefinedFunctionResponse>
                transformer = UpdateUserDefinedFunctionConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "UpdateUserDefinedFunction",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/UserDefinedFunction/UpdateUserDefinedFunction");
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
                                                        .getUpdateUserDefinedFunctionDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateWorkspaceResponse updateWorkspace(UpdateWorkspaceRequest request) {
        LOG.trace("Called updateWorkspace");
        final UpdateWorkspaceRequest interceptedRequest =
                UpdateWorkspaceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateWorkspaceConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateWorkspaceResponse>
                transformer = UpdateWorkspaceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "DataIntegration",
                "UpdateWorkspace",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/data-integration/20200430/Workspace/UpdateWorkspace");
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
                                                retriedRequest.getUpdateWorkspaceDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DataIntegrationWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DataIntegrationPaginators getPaginators() {
        return paginators;
    }
}
