/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe;

import com.oracle.bmc.datasafe.internal.http.*;
import com.oracle.bmc.datasafe.requests.*;
import com.oracle.bmc.datasafe.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;
import javax.annotation.Nonnull;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class DataSafeClient implements DataSafe {
    /**
     * Service instance for DataSafe.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DATASAFE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://datasafe.{region}.oci.{secondLevelDomain}")
                    .build();
    // attempt twice if it's instance principals, immediately failures will try to refresh the token
    private static final int MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS = 2;

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DataSafeAsyncClient.class);

    com.oracle.bmc.http.internal.RestClient getClient() {
        return client;
    }

    private final DataSafeWaiters waiters;

    private final DataSafePaginators paginators;
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
    public DataSafeClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DataSafeClient(
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
    public DataSafeClient(
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
    public DataSafeClient(
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
    public DataSafeClient(
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
    public DataSafeClient(
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
    public DataSafeClient(
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
    public DataSafeClient(
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
    protected DataSafeClient(
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
                                    .setNameFormat("DataSafe-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DataSafeWaiters(executorService, this);

        this.paginators = new DataSafePaginators(this);

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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DataSafeClient> {
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
        public DataSafeClient build(
                @Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new DataSafeClient(
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
    public ActivateTargetDatabaseResponse activateTargetDatabase(
            ActivateTargetDatabaseRequest request) {
        LOG.trace("Called activateTargetDatabase");
        final ActivateTargetDatabaseRequest interceptedRequest =
                ActivateTargetDatabaseConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ActivateTargetDatabaseConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ActivateTargetDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/ActivateTargetDatabase");
        com.google.common.base.Function<javax.ws.rs.core.Response, ActivateTargetDatabaseResponse>
                transformer =
                        ActivateTargetDatabaseConverter.fromResponse(
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
                                                retriedRequest.getActivateTargetDatabaseDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public AddMaskingColumnsFromSdmResponse addMaskingColumnsFromSdm(
            AddMaskingColumnsFromSdmRequest request) {
        LOG.trace("Called addMaskingColumnsFromSdm");
        final AddMaskingColumnsFromSdmRequest interceptedRequest =
                AddMaskingColumnsFromSdmConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddMaskingColumnsFromSdmConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "AddMaskingColumnsFromSdm",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/AddMaskingColumnsFromSdm");
        com.google.common.base.Function<javax.ws.rs.core.Response, AddMaskingColumnsFromSdmResponse>
                transformer =
                        AddMaskingColumnsFromSdmConverter.fromResponse(
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
                                        client.post(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ApplyDiscoveryJobResultsResponse applyDiscoveryJobResults(
            ApplyDiscoveryJobResultsRequest request) {
        LOG.trace("Called applyDiscoveryJobResults");
        final ApplyDiscoveryJobResultsRequest interceptedRequest =
                ApplyDiscoveryJobResultsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ApplyDiscoveryJobResultsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ApplyDiscoveryJobResults",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/ApplyDiscoveryJobResults");
        com.google.common.base.Function<javax.ws.rs.core.Response, ApplyDiscoveryJobResultsResponse>
                transformer =
                        ApplyDiscoveryJobResultsConverter.fromResponse(
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
                                                retriedRequest.getApplyDiscoveryJobResultsDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CalculateAuditVolumeAvailableResponse calculateAuditVolumeAvailable(
            CalculateAuditVolumeAvailableRequest request) {
        LOG.trace("Called calculateAuditVolumeAvailable");
        final CalculateAuditVolumeAvailableRequest interceptedRequest =
                CalculateAuditVolumeAvailableConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CalculateAuditVolumeAvailableConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CalculateAuditVolumeAvailable",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/CalculateAuditVolumeAvailable");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CalculateAuditVolumeAvailableResponse>
                transformer =
                        CalculateAuditVolumeAvailableConverter.fromResponse(
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
                                                        .getCalculateAuditVolumeAvailableDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CalculateAuditVolumeCollectedResponse calculateAuditVolumeCollected(
            CalculateAuditVolumeCollectedRequest request) {
        LOG.trace("Called calculateAuditVolumeCollected");
        final CalculateAuditVolumeCollectedRequest interceptedRequest =
                CalculateAuditVolumeCollectedConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CalculateAuditVolumeCollectedConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CalculateAuditVolumeCollected",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/CalculateAuditVolumeCollected");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CalculateAuditVolumeCollectedResponse>
                transformer =
                        CalculateAuditVolumeCollectedConverter.fromResponse(
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
                                                        .getCalculateAuditVolumeCollectedDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request) {
        LOG.trace("Called cancelWorkRequest");
        final CancelWorkRequestRequest interceptedRequest =
                CancelWorkRequestConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CancelWorkRequestConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CancelWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequest/CancelWorkRequest");
        com.google.common.base.Function<javax.ws.rs.core.Response, CancelWorkRequestResponse>
                transformer =
                        CancelWorkRequestConverter.fromResponse(
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
    public ChangeAlertCompartmentResponse changeAlertCompartment(
            ChangeAlertCompartmentRequest request) {
        LOG.trace("Called changeAlertCompartment");
        final ChangeAlertCompartmentRequest interceptedRequest =
                ChangeAlertCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeAlertCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeAlertCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Alert/ChangeAlertCompartment");
        com.google.common.base.Function<javax.ws.rs.core.Response, ChangeAlertCompartmentResponse>
                transformer =
                        ChangeAlertCompartmentConverter.fromResponse(
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
                                                retriedRequest.getChangeAlertCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeAuditArchiveRetrievalCompartmentResponse changeAuditArchiveRetrievalCompartment(
            ChangeAuditArchiveRetrievalCompartmentRequest request) {
        LOG.trace("Called changeAuditArchiveRetrievalCompartment");
        final ChangeAuditArchiveRetrievalCompartmentRequest interceptedRequest =
                ChangeAuditArchiveRetrievalCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeAuditArchiveRetrievalCompartmentConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeAuditArchiveRetrievalCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditArchiveRetrieval/ChangeAuditArchiveRetrievalCompartment");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeAuditArchiveRetrievalCompartmentResponse>
                transformer =
                        ChangeAuditArchiveRetrievalCompartmentConverter.fromResponse(
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
                                                        .getChangeAuditArchiveRetrievalCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeAuditPolicyCompartmentResponse changeAuditPolicyCompartment(
            ChangeAuditPolicyCompartmentRequest request) {
        LOG.trace("Called changeAuditPolicyCompartment");
        final ChangeAuditPolicyCompartmentRequest interceptedRequest =
                ChangeAuditPolicyCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeAuditPolicyCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeAuditPolicyCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicy/ChangeAuditPolicyCompartment");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeAuditPolicyCompartmentResponse>
                transformer =
                        ChangeAuditPolicyCompartmentConverter.fromResponse(
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
                                                        .getChangeAuditPolicyCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeAuditProfileCompartmentResponse changeAuditProfileCompartment(
            ChangeAuditProfileCompartmentRequest request) {
        LOG.trace("Called changeAuditProfileCompartment");
        final ChangeAuditProfileCompartmentRequest interceptedRequest =
                ChangeAuditProfileCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeAuditProfileCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeAuditProfileCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/ChangeAuditProfileCompartment");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeAuditProfileCompartmentResponse>
                transformer =
                        ChangeAuditProfileCompartmentConverter.fromResponse(
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
                                                        .getChangeAuditProfileCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeDataSafePrivateEndpointCompartmentResponse
            changeDataSafePrivateEndpointCompartment(
                    ChangeDataSafePrivateEndpointCompartmentRequest request) {
        LOG.trace("Called changeDataSafePrivateEndpointCompartment");
        final ChangeDataSafePrivateEndpointCompartmentRequest interceptedRequest =
                ChangeDataSafePrivateEndpointCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDataSafePrivateEndpointCompartmentConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeDataSafePrivateEndpointCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafePrivateEndpoint/ChangeDataSafePrivateEndpointCompartment");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeDataSafePrivateEndpointCompartmentResponse>
                transformer =
                        ChangeDataSafePrivateEndpointCompartmentConverter.fromResponse(
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
                                                        .getChangeDataSafePrivateEndpointCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeDiscoveryJobCompartmentResponse changeDiscoveryJobCompartment(
            ChangeDiscoveryJobCompartmentRequest request) {
        LOG.trace("Called changeDiscoveryJobCompartment");
        final ChangeDiscoveryJobCompartmentRequest interceptedRequest =
                ChangeDiscoveryJobCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeDiscoveryJobCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeDiscoveryJobCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJob/ChangeDiscoveryJobCompartment");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeDiscoveryJobCompartmentResponse>
                transformer =
                        ChangeDiscoveryJobCompartmentConverter.fromResponse(
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
                                                        .getChangeDiscoveryJobCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeLibraryMaskingFormatCompartmentResponse changeLibraryMaskingFormatCompartment(
            ChangeLibraryMaskingFormatCompartmentRequest request) {
        LOG.trace("Called changeLibraryMaskingFormatCompartment");
        final ChangeLibraryMaskingFormatCompartmentRequest interceptedRequest =
                ChangeLibraryMaskingFormatCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeLibraryMaskingFormatCompartmentConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeLibraryMaskingFormatCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/LibraryMaskingFormat/ChangeLibraryMaskingFormatCompartment");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeLibraryMaskingFormatCompartmentResponse>
                transformer =
                        ChangeLibraryMaskingFormatCompartmentConverter.fromResponse(
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
                                                        .getChangeLibraryMaskingFormatCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeMaskingPolicyCompartmentResponse changeMaskingPolicyCompartment(
            ChangeMaskingPolicyCompartmentRequest request) {
        LOG.trace("Called changeMaskingPolicyCompartment");
        final ChangeMaskingPolicyCompartmentRequest interceptedRequest =
                ChangeMaskingPolicyCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeMaskingPolicyCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeMaskingPolicyCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/ChangeMaskingPolicyCompartment");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeMaskingPolicyCompartmentResponse>
                transformer =
                        ChangeMaskingPolicyCompartmentConverter.fromResponse(
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
                                                        .getChangeMaskingPolicyCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeOnPremConnectorCompartmentResponse changeOnPremConnectorCompartment(
            ChangeOnPremConnectorCompartmentRequest request) {
        LOG.trace("Called changeOnPremConnectorCompartment");
        final ChangeOnPremConnectorCompartmentRequest interceptedRequest =
                ChangeOnPremConnectorCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeOnPremConnectorCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeOnPremConnectorCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/ChangeOnPremConnectorCompartment");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeOnPremConnectorCompartmentResponse>
                transformer =
                        ChangeOnPremConnectorCompartmentConverter.fromResponse(
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
                                                        .getChangeOnPremConnectorCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeReportCompartmentResponse changeReportCompartment(
            ChangeReportCompartmentRequest request) {
        LOG.trace("Called changeReportCompartment");
        final ChangeReportCompartmentRequest interceptedRequest =
                ChangeReportCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeReportCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeReportCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Report/ChangeReportCompartment");
        com.google.common.base.Function<javax.ws.rs.core.Response, ChangeReportCompartmentResponse>
                transformer =
                        ChangeReportCompartmentConverter.fromResponse(
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
                                                retriedRequest.getChangeReportCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeReportDefinitionCompartmentResponse changeReportDefinitionCompartment(
            ChangeReportDefinitionCompartmentRequest request) {
        LOG.trace("Called changeReportDefinitionCompartment");
        final ChangeReportDefinitionCompartmentRequest interceptedRequest =
                ChangeReportDefinitionCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeReportDefinitionCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeReportDefinitionCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/ChangeReportDefinitionCompartment");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeReportDefinitionCompartmentResponse>
                transformer =
                        ChangeReportDefinitionCompartmentConverter.fromResponse(
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
                                                        .getChangeReportDefinitionCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeRetentionResponse changeRetention(ChangeRetentionRequest request) {
        LOG.trace("Called changeRetention");
        final ChangeRetentionRequest interceptedRequest =
                ChangeRetentionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeRetentionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeRetention",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/ChangeRetention");
        com.google.common.base.Function<javax.ws.rs.core.Response, ChangeRetentionResponse>
                transformer =
                        ChangeRetentionConverter.fromResponse(
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
                                                retriedRequest.getChangeRetentionDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeSecurityAssessmentCompartmentResponse changeSecurityAssessmentCompartment(
            ChangeSecurityAssessmentCompartmentRequest request) {
        LOG.trace("Called changeSecurityAssessmentCompartment");
        final ChangeSecurityAssessmentCompartmentRequest interceptedRequest =
                ChangeSecurityAssessmentCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSecurityAssessmentCompartmentConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeSecurityAssessmentCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/ChangeSecurityAssessmentCompartment");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeSecurityAssessmentCompartmentResponse>
                transformer =
                        ChangeSecurityAssessmentCompartmentConverter.fromResponse(
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
                                                        .getChangeSecurityAssessmentCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeSensitiveDataModelCompartmentResponse changeSensitiveDataModelCompartment(
            ChangeSensitiveDataModelCompartmentRequest request) {
        LOG.trace("Called changeSensitiveDataModelCompartment");
        final ChangeSensitiveDataModelCompartmentRequest interceptedRequest =
                ChangeSensitiveDataModelCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSensitiveDataModelCompartmentConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeSensitiveDataModelCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/ChangeSensitiveDataModelCompartment");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeSensitiveDataModelCompartmentResponse>
                transformer =
                        ChangeSensitiveDataModelCompartmentConverter.fromResponse(
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
                                                        .getChangeSensitiveDataModelCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeSensitiveTypeCompartmentResponse changeSensitiveTypeCompartment(
            ChangeSensitiveTypeCompartmentRequest request) {
        LOG.trace("Called changeSensitiveTypeCompartment");
        final ChangeSensitiveTypeCompartmentRequest interceptedRequest =
                ChangeSensitiveTypeCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSensitiveTypeCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeSensitiveTypeCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveType/ChangeSensitiveTypeCompartment");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeSensitiveTypeCompartmentResponse>
                transformer =
                        ChangeSensitiveTypeCompartmentConverter.fromResponse(
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
                                                        .getChangeSensitiveTypeCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeTargetAlertPolicyAssociationCompartmentResponse
            changeTargetAlertPolicyAssociationCompartment(
                    ChangeTargetAlertPolicyAssociationCompartmentRequest request) {
        LOG.trace("Called changeTargetAlertPolicyAssociationCompartment");
        final ChangeTargetAlertPolicyAssociationCompartmentRequest interceptedRequest =
                ChangeTargetAlertPolicyAssociationCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeTargetAlertPolicyAssociationCompartmentConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeTargetAlertPolicyAssociationCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociation/ChangeTargetAlertPolicyAssociationCompartment");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ChangeTargetAlertPolicyAssociationCompartmentResponse>
                transformer =
                        ChangeTargetAlertPolicyAssociationCompartmentConverter.fromResponse(
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
                                                        .getChangeTargetAlertPolicyAssociationCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeTargetDatabaseCompartmentResponse changeTargetDatabaseCompartment(
            ChangeTargetDatabaseCompartmentRequest request) {
        LOG.trace("Called changeTargetDatabaseCompartment");
        final ChangeTargetDatabaseCompartmentRequest interceptedRequest =
                ChangeTargetDatabaseCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeTargetDatabaseCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeTargetDatabaseCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/ChangeTargetDatabaseCompartment");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeTargetDatabaseCompartmentResponse>
                transformer =
                        ChangeTargetDatabaseCompartmentConverter.fromResponse(
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
                                                        .getChangeTargetDatabaseCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeUserAssessmentCompartmentResponse changeUserAssessmentCompartment(
            ChangeUserAssessmentCompartmentRequest request) {
        LOG.trace("Called changeUserAssessmentCompartment");
        final ChangeUserAssessmentCompartmentRequest interceptedRequest =
                ChangeUserAssessmentCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeUserAssessmentCompartmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ChangeUserAssessmentCompartment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/ChangeUserAssessmentCompartment");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeUserAssessmentCompartmentResponse>
                transformer =
                        ChangeUserAssessmentCompartmentConverter.fromResponse(
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
                                                        .getChangeUserAssessmentCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CompareSecurityAssessmentResponse compareSecurityAssessment(
            CompareSecurityAssessmentRequest request) {
        LOG.trace("Called compareSecurityAssessment");
        final CompareSecurityAssessmentRequest interceptedRequest =
                CompareSecurityAssessmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CompareSecurityAssessmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CompareSecurityAssessment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/CompareSecurityAssessment");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CompareSecurityAssessmentResponse>
                transformer =
                        CompareSecurityAssessmentConverter.fromResponse(
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
                                                        .getCompareSecurityAssessmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CompareUserAssessmentResponse compareUserAssessment(
            CompareUserAssessmentRequest request) {
        LOG.trace("Called compareUserAssessment");
        final CompareUserAssessmentRequest interceptedRequest =
                CompareUserAssessmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CompareUserAssessmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CompareUserAssessment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/CompareUserAssessment");
        com.google.common.base.Function<javax.ws.rs.core.Response, CompareUserAssessmentResponse>
                transformer =
                        CompareUserAssessmentConverter.fromResponse(
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
                                                retriedRequest.getCompareUserAssessmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateAuditArchiveRetrievalResponse createAuditArchiveRetrieval(
            CreateAuditArchiveRetrievalRequest request) {
        LOG.trace("Called createAuditArchiveRetrieval");
        final CreateAuditArchiveRetrievalRequest interceptedRequest =
                CreateAuditArchiveRetrievalConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAuditArchiveRetrievalConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateAuditArchiveRetrieval",
                        ib.getRequestUri().toString(),
                        "");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateAuditArchiveRetrievalResponse>
                transformer =
                        CreateAuditArchiveRetrievalConverter.fromResponse(
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
                                                        .getCreateAuditArchiveRetrievalDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateDataSafePrivateEndpointResponse createDataSafePrivateEndpoint(
            CreateDataSafePrivateEndpointRequest request) {
        LOG.trace("Called createDataSafePrivateEndpoint");
        final CreateDataSafePrivateEndpointRequest interceptedRequest =
                CreateDataSafePrivateEndpointConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDataSafePrivateEndpointConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateDataSafePrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafePrivateEndpoint/CreateDataSafePrivateEndpoint");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateDataSafePrivateEndpointResponse>
                transformer =
                        CreateDataSafePrivateEndpointConverter.fromResponse(
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
                                                        .getCreateDataSafePrivateEndpointDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateDiscoveryJobResponse createDiscoveryJob(CreateDiscoveryJobRequest request) {
        LOG.trace("Called createDiscoveryJob");
        final CreateDiscoveryJobRequest interceptedRequest =
                CreateDiscoveryJobConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDiscoveryJobConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe", "CreateDiscoveryJob", ib.getRequestUri().toString(), "");
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateDiscoveryJobResponse>
                transformer =
                        CreateDiscoveryJobConverter.fromResponse(
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
                                                retriedRequest.getCreateDiscoveryJobDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateLibraryMaskingFormatResponse createLibraryMaskingFormat(
            CreateLibraryMaskingFormatRequest request) {
        LOG.trace("Called createLibraryMaskingFormat");
        final CreateLibraryMaskingFormatRequest interceptedRequest =
                CreateLibraryMaskingFormatConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateLibraryMaskingFormatConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateLibraryMaskingFormat",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/LibraryMaskingFormat/CreateLibraryMaskingFormat");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateLibraryMaskingFormatResponse>
                transformer =
                        CreateLibraryMaskingFormatConverter.fromResponse(
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
                                                        .getCreateLibraryMaskingFormatDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateMaskingColumnResponse createMaskingColumn(CreateMaskingColumnRequest request) {
        LOG.trace("Called createMaskingColumn");
        final CreateMaskingColumnRequest interceptedRequest =
                CreateMaskingColumnConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMaskingColumnConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateMaskingColumn",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/CreateMaskingColumn");
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateMaskingColumnResponse>
                transformer =
                        CreateMaskingColumnConverter.fromResponse(
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
                                                retriedRequest.getCreateMaskingColumnDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateMaskingPolicyResponse createMaskingPolicy(CreateMaskingPolicyRequest request) {
        LOG.trace("Called createMaskingPolicy");
        final CreateMaskingPolicyRequest interceptedRequest =
                CreateMaskingPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMaskingPolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateMaskingPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/CreateMaskingPolicy");
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateMaskingPolicyResponse>
                transformer =
                        CreateMaskingPolicyConverter.fromResponse(
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
                                                retriedRequest.getCreateMaskingPolicyDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateOnPremConnectorResponse createOnPremConnector(
            CreateOnPremConnectorRequest request) {
        LOG.trace("Called createOnPremConnector");
        final CreateOnPremConnectorRequest interceptedRequest =
                CreateOnPremConnectorConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateOnPremConnectorConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateOnPremConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/CreateOnPremConnector");
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateOnPremConnectorResponse>
                transformer =
                        CreateOnPremConnectorConverter.fromResponse(
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
                                                retriedRequest.getCreateOnPremConnectorDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateReportDefinitionResponse createReportDefinition(
            CreateReportDefinitionRequest request) {
        LOG.trace("Called createReportDefinition");
        final CreateReportDefinitionRequest interceptedRequest =
                CreateReportDefinitionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateReportDefinitionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateReportDefinition",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/CreateReportDefinition");
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateReportDefinitionResponse>
                transformer =
                        CreateReportDefinitionConverter.fromResponse(
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
                                                retriedRequest.getCreateReportDefinitionDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateSecurityAssessmentResponse createSecurityAssessment(
            CreateSecurityAssessmentRequest request) {
        LOG.trace("Called createSecurityAssessment");
        final CreateSecurityAssessmentRequest interceptedRequest =
                CreateSecurityAssessmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSecurityAssessmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateSecurityAssessment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/CreateSecurityAssessment");
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateSecurityAssessmentResponse>
                transformer =
                        CreateSecurityAssessmentConverter.fromResponse(
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
                                                retriedRequest.getCreateSecurityAssessmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateSensitiveColumnResponse createSensitiveColumn(
            CreateSensitiveColumnRequest request) {
        LOG.trace("Called createSensitiveColumn");
        final CreateSensitiveColumnRequest interceptedRequest =
                CreateSensitiveColumnConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSensitiveColumnConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateSensitiveColumn",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveColumn/CreateSensitiveColumn");
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateSensitiveColumnResponse>
                transformer =
                        CreateSensitiveColumnConverter.fromResponse(
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
                                                retriedRequest.getCreateSensitiveColumnDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateSensitiveDataModelResponse createSensitiveDataModel(
            CreateSensitiveDataModelRequest request) {
        LOG.trace("Called createSensitiveDataModel");
        final CreateSensitiveDataModelRequest interceptedRequest =
                CreateSensitiveDataModelConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSensitiveDataModelConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateSensitiveDataModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/CreateSensitiveDataModel");
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateSensitiveDataModelResponse>
                transformer =
                        CreateSensitiveDataModelConverter.fromResponse(
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
                                                retriedRequest.getCreateSensitiveDataModelDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateSensitiveTypeResponse createSensitiveType(CreateSensitiveTypeRequest request) {
        LOG.trace("Called createSensitiveType");
        final CreateSensitiveTypeRequest interceptedRequest =
                CreateSensitiveTypeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSensitiveTypeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe", "CreateSensitiveType", ib.getRequestUri().toString(), "");
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateSensitiveTypeResponse>
                transformer =
                        CreateSensitiveTypeConverter.fromResponse(
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
                                                retriedRequest.getCreateSensitiveTypeDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateTargetAlertPolicyAssociationResponse createTargetAlertPolicyAssociation(
            CreateTargetAlertPolicyAssociationRequest request) {
        LOG.trace("Called createTargetAlertPolicyAssociation");
        final CreateTargetAlertPolicyAssociationRequest interceptedRequest =
                CreateTargetAlertPolicyAssociationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTargetAlertPolicyAssociationConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateTargetAlertPolicyAssociation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociation/CreateTargetAlertPolicyAssociation");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateTargetAlertPolicyAssociationResponse>
                transformer =
                        CreateTargetAlertPolicyAssociationConverter.fromResponse(
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
                                                        .getCreateTargetAlertPolicyAssociationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateTargetDatabaseResponse createTargetDatabase(CreateTargetDatabaseRequest request) {
        LOG.trace("Called createTargetDatabase");
        final CreateTargetDatabaseRequest interceptedRequest =
                CreateTargetDatabaseConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateTargetDatabaseConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateTargetDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/CreateTargetDatabase");
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateTargetDatabaseResponse>
                transformer =
                        CreateTargetDatabaseConverter.fromResponse(
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
                                                retriedRequest.getCreateTargetDatabaseDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateUserAssessmentResponse createUserAssessment(CreateUserAssessmentRequest request) {
        LOG.trace("Called createUserAssessment");
        final CreateUserAssessmentRequest interceptedRequest =
                CreateUserAssessmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateUserAssessmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "CreateUserAssessment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/CreateUserAssessment");
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateUserAssessmentResponse>
                transformer =
                        CreateUserAssessmentConverter.fromResponse(
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
                                                retriedRequest.getCreateUserAssessmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeactivateTargetDatabaseResponse deactivateTargetDatabase(
            DeactivateTargetDatabaseRequest request) {
        LOG.trace("Called deactivateTargetDatabase");
        final DeactivateTargetDatabaseRequest interceptedRequest =
                DeactivateTargetDatabaseConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeactivateTargetDatabaseConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeactivateTargetDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/DeactivateTargetDatabase");
        com.google.common.base.Function<javax.ws.rs.core.Response, DeactivateTargetDatabaseResponse>
                transformer =
                        DeactivateTargetDatabaseConverter.fromResponse(
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
                                        client.post(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteAuditArchiveRetrievalResponse deleteAuditArchiveRetrieval(
            DeleteAuditArchiveRetrievalRequest request) {
        LOG.trace("Called deleteAuditArchiveRetrieval");
        final DeleteAuditArchiveRetrievalRequest interceptedRequest =
                DeleteAuditArchiveRetrievalConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAuditArchiveRetrievalConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteAuditArchiveRetrieval",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditArchiveRetrieval/DeleteAuditArchiveRetrieval");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteAuditArchiveRetrievalResponse>
                transformer =
                        DeleteAuditArchiveRetrievalConverter.fromResponse(
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
    public DeleteAuditTrailResponse deleteAuditTrail(DeleteAuditTrailRequest request) {
        LOG.trace("Called deleteAuditTrail");
        final DeleteAuditTrailRequest interceptedRequest =
                DeleteAuditTrailConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAuditTrailConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteAuditTrail",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/DeleteAuditTrail");
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteAuditTrailResponse>
                transformer =
                        DeleteAuditTrailConverter.fromResponse(
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
    public DeleteDataSafePrivateEndpointResponse deleteDataSafePrivateEndpoint(
            DeleteDataSafePrivateEndpointRequest request) {
        LOG.trace("Called deleteDataSafePrivateEndpoint");
        final DeleteDataSafePrivateEndpointRequest interceptedRequest =
                DeleteDataSafePrivateEndpointConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDataSafePrivateEndpointConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteDataSafePrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafePrivateEndpoint/DeleteDataSafePrivateEndpoint");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteDataSafePrivateEndpointResponse>
                transformer =
                        DeleteDataSafePrivateEndpointConverter.fromResponse(
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
    public DeleteDiscoveryJobResponse deleteDiscoveryJob(DeleteDiscoveryJobRequest request) {
        LOG.trace("Called deleteDiscoveryJob");
        final DeleteDiscoveryJobRequest interceptedRequest =
                DeleteDiscoveryJobConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDiscoveryJobConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteDiscoveryJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJob/DeleteDiscoveryJob");
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDiscoveryJobResponse>
                transformer =
                        DeleteDiscoveryJobConverter.fromResponse(
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
    public DeleteDiscoveryJobResultResponse deleteDiscoveryJobResult(
            DeleteDiscoveryJobResultRequest request) {
        LOG.trace("Called deleteDiscoveryJobResult");
        final DeleteDiscoveryJobResultRequest interceptedRequest =
                DeleteDiscoveryJobResultConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDiscoveryJobResultConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteDiscoveryJobResult",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJobResult/DeleteDiscoveryJobResult");
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteDiscoveryJobResultResponse>
                transformer =
                        DeleteDiscoveryJobResultConverter.fromResponse(
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
    public DeleteLibraryMaskingFormatResponse deleteLibraryMaskingFormat(
            DeleteLibraryMaskingFormatRequest request) {
        LOG.trace("Called deleteLibraryMaskingFormat");
        final DeleteLibraryMaskingFormatRequest interceptedRequest =
                DeleteLibraryMaskingFormatConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteLibraryMaskingFormatConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteLibraryMaskingFormat",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/LibraryMaskingFormat/DeleteLibraryMaskingFormat");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteLibraryMaskingFormatResponse>
                transformer =
                        DeleteLibraryMaskingFormatConverter.fromResponse(
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
    public DeleteMaskingColumnResponse deleteMaskingColumn(DeleteMaskingColumnRequest request) {
        LOG.trace("Called deleteMaskingColumn");
        final DeleteMaskingColumnRequest interceptedRequest =
                DeleteMaskingColumnConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMaskingColumnConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteMaskingColumn",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/DeleteMaskingColumn");
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteMaskingColumnResponse>
                transformer =
                        DeleteMaskingColumnConverter.fromResponse(
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
    public DeleteMaskingPolicyResponse deleteMaskingPolicy(DeleteMaskingPolicyRequest request) {
        LOG.trace("Called deleteMaskingPolicy");
        final DeleteMaskingPolicyRequest interceptedRequest =
                DeleteMaskingPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMaskingPolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteMaskingPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/DeleteMaskingPolicy");
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteMaskingPolicyResponse>
                transformer =
                        DeleteMaskingPolicyConverter.fromResponse(
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
    public DeleteOnPremConnectorResponse deleteOnPremConnector(
            DeleteOnPremConnectorRequest request) {
        LOG.trace("Called deleteOnPremConnector");
        final DeleteOnPremConnectorRequest interceptedRequest =
                DeleteOnPremConnectorConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteOnPremConnectorConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteOnPremConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/DeleteOnPremConnector");
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteOnPremConnectorResponse>
                transformer =
                        DeleteOnPremConnectorConverter.fromResponse(
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
    public DeleteReportDefinitionResponse deleteReportDefinition(
            DeleteReportDefinitionRequest request) {
        LOG.trace("Called deleteReportDefinition");
        final DeleteReportDefinitionRequest interceptedRequest =
                DeleteReportDefinitionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteReportDefinitionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteReportDefinition",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/DeleteReportDefinition");
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteReportDefinitionResponse>
                transformer =
                        DeleteReportDefinitionConverter.fromResponse(
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
    public DeleteSecurityAssessmentResponse deleteSecurityAssessment(
            DeleteSecurityAssessmentRequest request) {
        LOG.trace("Called deleteSecurityAssessment");
        final DeleteSecurityAssessmentRequest interceptedRequest =
                DeleteSecurityAssessmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSecurityAssessmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteSecurityAssessment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/DeleteSecurityAssessment");
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteSecurityAssessmentResponse>
                transformer =
                        DeleteSecurityAssessmentConverter.fromResponse(
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
    public DeleteSensitiveColumnResponse deleteSensitiveColumn(
            DeleteSensitiveColumnRequest request) {
        LOG.trace("Called deleteSensitiveColumn");
        final DeleteSensitiveColumnRequest interceptedRequest =
                DeleteSensitiveColumnConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSensitiveColumnConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteSensitiveColumn",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveColumn/DeleteSensitiveColumn");
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteSensitiveColumnResponse>
                transformer =
                        DeleteSensitiveColumnConverter.fromResponse(
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
    public DeleteSensitiveDataModelResponse deleteSensitiveDataModel(
            DeleteSensitiveDataModelRequest request) {
        LOG.trace("Called deleteSensitiveDataModel");
        final DeleteSensitiveDataModelRequest interceptedRequest =
                DeleteSensitiveDataModelConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSensitiveDataModelConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteSensitiveDataModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/DeleteSensitiveDataModel");
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteSensitiveDataModelResponse>
                transformer =
                        DeleteSensitiveDataModelConverter.fromResponse(
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
    public DeleteSensitiveTypeResponse deleteSensitiveType(DeleteSensitiveTypeRequest request) {
        LOG.trace("Called deleteSensitiveType");
        final DeleteSensitiveTypeRequest interceptedRequest =
                DeleteSensitiveTypeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSensitiveTypeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteSensitiveType",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveType/DeleteSensitiveType");
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteSensitiveTypeResponse>
                transformer =
                        DeleteSensitiveTypeConverter.fromResponse(
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
    public DeleteTargetAlertPolicyAssociationResponse deleteTargetAlertPolicyAssociation(
            DeleteTargetAlertPolicyAssociationRequest request) {
        LOG.trace("Called deleteTargetAlertPolicyAssociation");
        final DeleteTargetAlertPolicyAssociationRequest interceptedRequest =
                DeleteTargetAlertPolicyAssociationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTargetAlertPolicyAssociationConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteTargetAlertPolicyAssociation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociation/DeleteTargetAlertPolicyAssociation");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteTargetAlertPolicyAssociationResponse>
                transformer =
                        DeleteTargetAlertPolicyAssociationConverter.fromResponse(
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
    public DeleteTargetDatabaseResponse deleteTargetDatabase(DeleteTargetDatabaseRequest request) {
        LOG.trace("Called deleteTargetDatabase");
        final DeleteTargetDatabaseRequest interceptedRequest =
                DeleteTargetDatabaseConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteTargetDatabaseConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteTargetDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/DeleteTargetDatabase");
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteTargetDatabaseResponse>
                transformer =
                        DeleteTargetDatabaseConverter.fromResponse(
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
    public DeleteUserAssessmentResponse deleteUserAssessment(DeleteUserAssessmentRequest request) {
        LOG.trace("Called deleteUserAssessment");
        final DeleteUserAssessmentRequest interceptedRequest =
                DeleteUserAssessmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteUserAssessmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DeleteUserAssessment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/DeleteUserAssessment");
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteUserAssessmentResponse>
                transformer =
                        DeleteUserAssessmentConverter.fromResponse(
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
    public DiscoverAuditTrailsResponse discoverAuditTrails(DiscoverAuditTrailsRequest request) {
        LOG.trace("Called discoverAuditTrails");
        final DiscoverAuditTrailsRequest interceptedRequest =
                DiscoverAuditTrailsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DiscoverAuditTrailsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DiscoverAuditTrails",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/DiscoverAuditTrails");
        com.google.common.base.Function<javax.ws.rs.core.Response, DiscoverAuditTrailsResponse>
                transformer =
                        DiscoverAuditTrailsConverter.fromResponse(
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
                                        client.post(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DownloadDiscoveryReportResponse downloadDiscoveryReport(
            DownloadDiscoveryReportRequest request) {
        LOG.trace("Called downloadDiscoveryReport");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "downloadDiscoveryReport returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final DownloadDiscoveryReportRequest interceptedRequest =
                DownloadDiscoveryReportConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadDiscoveryReportConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DownloadDiscoveryReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/DownloadDiscoveryReport");
        com.google.common.base.Function<javax.ws.rs.core.Response, DownloadDiscoveryReportResponse>
                transformer =
                        DownloadDiscoveryReportConverter.fromResponse(
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
                                                retriedRequest.getDownloadDiscoveryReportDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DownloadMaskingLogResponse downloadMaskingLog(DownloadMaskingLogRequest request) {
        LOG.trace("Called downloadMaskingLog");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "downloadMaskingLog returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final DownloadMaskingLogRequest interceptedRequest =
                DownloadMaskingLogConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadMaskingLogConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DownloadMaskingLog",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/DownloadMaskingLog");
        com.google.common.base.Function<javax.ws.rs.core.Response, DownloadMaskingLogResponse>
                transformer =
                        DownloadMaskingLogConverter.fromResponse(
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
                                                retriedRequest.getDownloadMaskingLogDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DownloadMaskingPolicyResponse downloadMaskingPolicy(
            DownloadMaskingPolicyRequest request) {
        LOG.trace("Called downloadMaskingPolicy");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "downloadMaskingPolicy returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final DownloadMaskingPolicyRequest interceptedRequest =
                DownloadMaskingPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadMaskingPolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DownloadMaskingPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/DownloadMaskingPolicy");
        com.google.common.base.Function<javax.ws.rs.core.Response, DownloadMaskingPolicyResponse>
                transformer =
                        DownloadMaskingPolicyConverter.fromResponse(
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
                                                retriedRequest.getDownloadMaskingPolicyDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DownloadMaskingReportResponse downloadMaskingReport(
            DownloadMaskingReportRequest request) {
        LOG.trace("Called downloadMaskingReport");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "downloadMaskingReport returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final DownloadMaskingReportRequest interceptedRequest =
                DownloadMaskingReportConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadMaskingReportConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DownloadMaskingReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/DownloadMaskingReport");
        com.google.common.base.Function<javax.ws.rs.core.Response, DownloadMaskingReportResponse>
                transformer =
                        DownloadMaskingReportConverter.fromResponse(
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
                                                retriedRequest.getDownloadMaskingReportDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DownloadPrivilegeScriptResponse downloadPrivilegeScript(
            DownloadPrivilegeScriptRequest request) {
        LOG.trace("Called downloadPrivilegeScript");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "downloadPrivilegeScript returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final DownloadPrivilegeScriptRequest interceptedRequest =
                DownloadPrivilegeScriptConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadPrivilegeScriptConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DownloadPrivilegeScript",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/DownloadPrivilegeScript");
        com.google.common.base.Function<javax.ws.rs.core.Response, DownloadPrivilegeScriptResponse>
                transformer =
                        DownloadPrivilegeScriptConverter.fromResponse(
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
                                        client.post(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DownloadSecurityAssessmentReportResponse downloadSecurityAssessmentReport(
            DownloadSecurityAssessmentReportRequest request) {
        LOG.trace("Called downloadSecurityAssessmentReport");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "downloadSecurityAssessmentReport returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final DownloadSecurityAssessmentReportRequest interceptedRequest =
                DownloadSecurityAssessmentReportConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadSecurityAssessmentReportConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DownloadSecurityAssessmentReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/DownloadSecurityAssessmentReport");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DownloadSecurityAssessmentReportResponse>
                transformer =
                        DownloadSecurityAssessmentReportConverter.fromResponse(
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
                                                        .getDownloadSecurityAssessmentReportDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DownloadSensitiveDataModelResponse downloadSensitiveDataModel(
            DownloadSensitiveDataModelRequest request) {
        LOG.trace("Called downloadSensitiveDataModel");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "downloadSensitiveDataModel returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final DownloadSensitiveDataModelRequest interceptedRequest =
                DownloadSensitiveDataModelConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadSensitiveDataModelConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DownloadSensitiveDataModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/DownloadSensitiveDataModel");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DownloadSensitiveDataModelResponse>
                transformer =
                        DownloadSensitiveDataModelConverter.fromResponse(
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
                                                        .getDownloadSensitiveDataModelDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DownloadUserAssessmentReportResponse downloadUserAssessmentReport(
            DownloadUserAssessmentReportRequest request) {
        LOG.trace("Called downloadUserAssessmentReport");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "downloadUserAssessmentReport returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final DownloadUserAssessmentReportRequest interceptedRequest =
                DownloadUserAssessmentReportConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DownloadUserAssessmentReportConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "DownloadUserAssessmentReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/DownloadUserAssessmentReport");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DownloadUserAssessmentReportResponse>
                transformer =
                        DownloadUserAssessmentReportConverter.fromResponse(
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
                                                        .getDownloadUserAssessmentReportDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public EnableDataSafeConfigurationResponse enableDataSafeConfiguration(
            EnableDataSafeConfigurationRequest request) {
        LOG.trace("Called enableDataSafeConfiguration");
        final EnableDataSafeConfigurationRequest interceptedRequest =
                EnableDataSafeConfigurationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                EnableDataSafeConfigurationConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "EnableDataSafeConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafeConfiguration/EnableDataSafeConfiguration");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, EnableDataSafeConfigurationResponse>
                transformer =
                        EnableDataSafeConfigurationConverter.fromResponse(
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
                                                        .getEnableDataSafeConfigurationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GenerateDiscoveryReportForDownloadResponse generateDiscoveryReportForDownload(
            GenerateDiscoveryReportForDownloadRequest request) {
        LOG.trace("Called generateDiscoveryReportForDownload");
        final GenerateDiscoveryReportForDownloadRequest interceptedRequest =
                GenerateDiscoveryReportForDownloadConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateDiscoveryReportForDownloadConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GenerateDiscoveryReportForDownload",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/GenerateDiscoveryReportForDownload");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GenerateDiscoveryReportForDownloadResponse>
                transformer =
                        GenerateDiscoveryReportForDownloadConverter.fromResponse(
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
                                                        .getGenerateDiscoveryReportForDownloadDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GenerateMaskingPolicyForDownloadResponse generateMaskingPolicyForDownload(
            GenerateMaskingPolicyForDownloadRequest request) {
        LOG.trace("Called generateMaskingPolicyForDownload");
        final GenerateMaskingPolicyForDownloadRequest interceptedRequest =
                GenerateMaskingPolicyForDownloadConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateMaskingPolicyForDownloadConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GenerateMaskingPolicyForDownload",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/GenerateMaskingPolicyForDownload");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GenerateMaskingPolicyForDownloadResponse>
                transformer =
                        GenerateMaskingPolicyForDownloadConverter.fromResponse(
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
                                                        .getGenerateMaskingPolicyForDownloadDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GenerateMaskingReportForDownloadResponse generateMaskingReportForDownload(
            GenerateMaskingReportForDownloadRequest request) {
        LOG.trace("Called generateMaskingReportForDownload");
        final GenerateMaskingReportForDownloadRequest interceptedRequest =
                GenerateMaskingReportForDownloadConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateMaskingReportForDownloadConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GenerateMaskingReportForDownload",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/GenerateMaskingReportForDownload");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GenerateMaskingReportForDownloadResponse>
                transformer =
                        GenerateMaskingReportForDownloadConverter.fromResponse(
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
                                                        .getGenerateMaskingReportForDownloadDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GenerateOnPremConnectorConfigurationResponse generateOnPremConnectorConfiguration(
            GenerateOnPremConnectorConfigurationRequest request) {
        LOG.trace("Called generateOnPremConnectorConfiguration");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "generateOnPremConnectorConfiguration returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final GenerateOnPremConnectorConfigurationRequest interceptedRequest =
                GenerateOnPremConnectorConfigurationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateOnPremConnectorConfigurationConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GenerateOnPremConnectorConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/GenerateOnPremConnectorConfiguration");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GenerateOnPremConnectorConfigurationResponse>
                transformer =
                        GenerateOnPremConnectorConfigurationConverter.fromResponse(
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
                                                        .getGenerateOnPremConnectorConfigurationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GenerateReportResponse generateReport(GenerateReportRequest request) {
        LOG.trace("Called generateReport");
        final GenerateReportRequest interceptedRequest =
                GenerateReportConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateReportConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GenerateReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/GenerateReport");
        com.google.common.base.Function<javax.ws.rs.core.Response, GenerateReportResponse>
                transformer =
                        GenerateReportConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getGenerateReportDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GenerateSecurityAssessmentReportResponse generateSecurityAssessmentReport(
            GenerateSecurityAssessmentReportRequest request) {
        LOG.trace("Called generateSecurityAssessmentReport");
        final GenerateSecurityAssessmentReportRequest interceptedRequest =
                GenerateSecurityAssessmentReportConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateSecurityAssessmentReportConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GenerateSecurityAssessmentReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/GenerateSecurityAssessmentReport");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GenerateSecurityAssessmentReportResponse>
                transformer =
                        GenerateSecurityAssessmentReportConverter.fromResponse(
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
                                                        .getGenerateSecurityAssessmentReportDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GenerateSensitiveDataModelForDownloadResponse generateSensitiveDataModelForDownload(
            GenerateSensitiveDataModelForDownloadRequest request) {
        LOG.trace("Called generateSensitiveDataModelForDownload");
        final GenerateSensitiveDataModelForDownloadRequest interceptedRequest =
                GenerateSensitiveDataModelForDownloadConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateSensitiveDataModelForDownloadConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GenerateSensitiveDataModelForDownload",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/GenerateSensitiveDataModelForDownload");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GenerateSensitiveDataModelForDownloadResponse>
                transformer =
                        GenerateSensitiveDataModelForDownloadConverter.fromResponse(
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
                                                        .getGenerateSensitiveDataModelForDownloadDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GenerateUserAssessmentReportResponse generateUserAssessmentReport(
            GenerateUserAssessmentReportRequest request) {
        LOG.trace("Called generateUserAssessmentReport");
        final GenerateUserAssessmentReportRequest interceptedRequest =
                GenerateUserAssessmentReportConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GenerateUserAssessmentReportConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GenerateUserAssessmentReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/GenerateUserAssessmentReport");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GenerateUserAssessmentReportResponse>
                transformer =
                        GenerateUserAssessmentReportConverter.fromResponse(
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
                                                        .getGenerateUserAssessmentReportDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetAlertResponse getAlert(GetAlertRequest request) {
        LOG.trace("Called getAlert");
        final GetAlertRequest interceptedRequest = GetAlertConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAlertConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetAlert",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Alert/GetAlert");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetAlertResponse> transformer =
                GetAlertConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetAlertPolicyResponse getAlertPolicy(GetAlertPolicyRequest request) {
        LOG.trace("Called getAlertPolicy");
        final GetAlertPolicyRequest interceptedRequest =
                GetAlertPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAlertPolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetAlertPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertPolicy/GetAlertPolicy");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetAlertPolicyResponse>
                transformer =
                        GetAlertPolicyConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetAuditArchiveRetrievalResponse getAuditArchiveRetrieval(
            GetAuditArchiveRetrievalRequest request) {
        LOG.trace("Called getAuditArchiveRetrieval");
        final GetAuditArchiveRetrievalRequest interceptedRequest =
                GetAuditArchiveRetrievalConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAuditArchiveRetrievalConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetAuditArchiveRetrieval",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditArchiveRetrieval/GetAuditArchiveRetrieval");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetAuditArchiveRetrievalResponse>
                transformer =
                        GetAuditArchiveRetrievalConverter.fromResponse(
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
    public GetAuditPolicyResponse getAuditPolicy(GetAuditPolicyRequest request) {
        LOG.trace("Called getAuditPolicy");
        final GetAuditPolicyRequest interceptedRequest =
                GetAuditPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAuditPolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetAuditPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicy/GetAuditPolicy");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetAuditPolicyResponse>
                transformer =
                        GetAuditPolicyConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetAuditProfileResponse getAuditProfile(GetAuditProfileRequest request) {
        LOG.trace("Called getAuditProfile");
        final GetAuditProfileRequest interceptedRequest =
                GetAuditProfileConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAuditProfileConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetAuditProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/GetAuditProfile");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetAuditProfileResponse>
                transformer =
                        GetAuditProfileConverter.fromResponse(
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
    public GetAuditTrailResponse getAuditTrail(GetAuditTrailRequest request) {
        LOG.trace("Called getAuditTrail");
        final GetAuditTrailRequest interceptedRequest =
                GetAuditTrailConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAuditTrailConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetAuditTrail",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/GetAuditTrail");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetAuditTrailResponse>
                transformer =
                        GetAuditTrailConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetCompatibleFormatsForDataTypesResponse getCompatibleFormatsForDataTypes(
            GetCompatibleFormatsForDataTypesRequest request) {
        LOG.trace("Called getCompatibleFormatsForDataTypes");
        final GetCompatibleFormatsForDataTypesRequest interceptedRequest =
                GetCompatibleFormatsForDataTypesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCompatibleFormatsForDataTypesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetCompatibleFormatsForDataTypes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/GetCompatibleFormatsForDataTypes");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetCompatibleFormatsForDataTypesResponse>
                transformer =
                        GetCompatibleFormatsForDataTypesConverter.fromResponse(
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
    public GetCompatibleFormatsForSensitiveTypesResponse getCompatibleFormatsForSensitiveTypes(
            GetCompatibleFormatsForSensitiveTypesRequest request) {
        LOG.trace("Called getCompatibleFormatsForSensitiveTypes");
        final GetCompatibleFormatsForSensitiveTypesRequest interceptedRequest =
                GetCompatibleFormatsForSensitiveTypesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCompatibleFormatsForSensitiveTypesConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetCompatibleFormatsForSensitiveTypes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/GetCompatibleFormatsForSensitiveTypes");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetCompatibleFormatsForSensitiveTypesResponse>
                transformer =
                        GetCompatibleFormatsForSensitiveTypesConverter.fromResponse(
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
    public GetDataSafeConfigurationResponse getDataSafeConfiguration(
            GetDataSafeConfigurationRequest request) {
        LOG.trace("Called getDataSafeConfiguration");
        final GetDataSafeConfigurationRequest interceptedRequest =
                GetDataSafeConfigurationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataSafeConfigurationConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetDataSafeConfiguration",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafeConfiguration/GetDataSafeConfiguration");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDataSafeConfigurationResponse>
                transformer =
                        GetDataSafeConfigurationConverter.fromResponse(
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
    public GetDataSafePrivateEndpointResponse getDataSafePrivateEndpoint(
            GetDataSafePrivateEndpointRequest request) {
        LOG.trace("Called getDataSafePrivateEndpoint");
        final GetDataSafePrivateEndpointRequest interceptedRequest =
                GetDataSafePrivateEndpointConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDataSafePrivateEndpointConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetDataSafePrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafePrivateEndpoint/GetDataSafePrivateEndpoint");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDataSafePrivateEndpointResponse>
                transformer =
                        GetDataSafePrivateEndpointConverter.fromResponse(
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
    public GetDiscoveryJobResponse getDiscoveryJob(GetDiscoveryJobRequest request) {
        LOG.trace("Called getDiscoveryJob");
        final GetDiscoveryJobRequest interceptedRequest =
                GetDiscoveryJobConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDiscoveryJobConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetDiscoveryJob",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJob/GetDiscoveryJob");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDiscoveryJobResponse>
                transformer =
                        GetDiscoveryJobConverter.fromResponse(
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
    public GetDiscoveryJobResultResponse getDiscoveryJobResult(
            GetDiscoveryJobResultRequest request) {
        LOG.trace("Called getDiscoveryJobResult");
        final GetDiscoveryJobResultRequest interceptedRequest =
                GetDiscoveryJobResultConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDiscoveryJobResultConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetDiscoveryJobResult",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJobResult/GetDiscoveryJobResult");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetDiscoveryJobResultResponse>
                transformer =
                        GetDiscoveryJobResultConverter.fromResponse(
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
    public GetLibraryMaskingFormatResponse getLibraryMaskingFormat(
            GetLibraryMaskingFormatRequest request) {
        LOG.trace("Called getLibraryMaskingFormat");
        final GetLibraryMaskingFormatRequest interceptedRequest =
                GetLibraryMaskingFormatConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetLibraryMaskingFormatConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetLibraryMaskingFormat",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/LibraryMaskingFormat/GetLibraryMaskingFormat");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetLibraryMaskingFormatResponse>
                transformer =
                        GetLibraryMaskingFormatConverter.fromResponse(
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
    public GetMaskingColumnResponse getMaskingColumn(GetMaskingColumnRequest request) {
        LOG.trace("Called getMaskingColumn");
        final GetMaskingColumnRequest interceptedRequest =
                GetMaskingColumnConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMaskingColumnConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetMaskingColumn",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/GetMaskingColumn");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetMaskingColumnResponse>
                transformer =
                        GetMaskingColumnConverter.fromResponse(
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
    public GetMaskingPolicyResponse getMaskingPolicy(GetMaskingPolicyRequest request) {
        LOG.trace("Called getMaskingPolicy");
        final GetMaskingPolicyRequest interceptedRequest =
                GetMaskingPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMaskingPolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetMaskingPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/GetMaskingPolicy");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetMaskingPolicyResponse>
                transformer =
                        GetMaskingPolicyConverter.fromResponse(
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
    public GetMaskingReportResponse getMaskingReport(GetMaskingReportRequest request) {
        LOG.trace("Called getMaskingReport");
        final GetMaskingReportRequest interceptedRequest =
                GetMaskingReportConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMaskingReportConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetMaskingReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingReport/GetMaskingReport");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetMaskingReportResponse>
                transformer =
                        GetMaskingReportConverter.fromResponse(
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
    public GetOnPremConnectorResponse getOnPremConnector(GetOnPremConnectorRequest request) {
        LOG.trace("Called getOnPremConnector");
        final GetOnPremConnectorRequest interceptedRequest =
                GetOnPremConnectorConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOnPremConnectorConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetOnPremConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/GetOnPremConnector");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetOnPremConnectorResponse>
                transformer =
                        GetOnPremConnectorConverter.fromResponse(
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
    public GetReportResponse getReport(GetReportRequest request) {
        LOG.trace("Called getReport");
        final GetReportRequest interceptedRequest = GetReportConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetReportConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetReport",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Report/GetReport");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetReportResponse> transformer =
                GetReportConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetReportContentResponse getReportContent(GetReportContentRequest request) {
        LOG.trace("Called getReportContent");
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    "getReportContent returns a stream, please make sure to close the stream to avoid any indefinite hangs");
            if (this.apacheConnectionClosingStrategy != null) {
                LOG.warn(
                        "ApacheConnectionClosingStrategy set to {}. For large streams with partial reads of stream, please use ImmediateClosingStrategy. "
                                + "For small streams with partial reads of stream, please use GracefulClosingStrategy. More info in ApacheConnectorProperties",
                        this.apacheConnectionClosingStrategy);
            }
        }
        final GetReportContentRequest interceptedRequest =
                GetReportContentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetReportContentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetReportContent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Report/GetReportContent");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetReportContentResponse>
                transformer =
                        GetReportContentConverter.fromResponse(
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
    public GetReportDefinitionResponse getReportDefinition(GetReportDefinitionRequest request) {
        LOG.trace("Called getReportDefinition");
        final GetReportDefinitionRequest interceptedRequest =
                GetReportDefinitionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetReportDefinitionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetReportDefinition",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/GetReportDefinition");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetReportDefinitionResponse>
                transformer =
                        GetReportDefinitionConverter.fromResponse(
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
    public GetSecurityAssessmentResponse getSecurityAssessment(
            GetSecurityAssessmentRequest request) {
        LOG.trace("Called getSecurityAssessment");
        final GetSecurityAssessmentRequest interceptedRequest =
                GetSecurityAssessmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSecurityAssessmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetSecurityAssessment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/GetSecurityAssessment");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetSecurityAssessmentResponse>
                transformer =
                        GetSecurityAssessmentConverter.fromResponse(
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
    public GetSecurityAssessmentComparisonResponse getSecurityAssessmentComparison(
            GetSecurityAssessmentComparisonRequest request) {
        LOG.trace("Called getSecurityAssessmentComparison");
        final GetSecurityAssessmentComparisonRequest interceptedRequest =
                GetSecurityAssessmentComparisonConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSecurityAssessmentComparisonConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetSecurityAssessmentComparison",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/GetSecurityAssessmentComparison");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetSecurityAssessmentComparisonResponse>
                transformer =
                        GetSecurityAssessmentComparisonConverter.fromResponse(
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
    public GetSensitiveColumnResponse getSensitiveColumn(GetSensitiveColumnRequest request) {
        LOG.trace("Called getSensitiveColumn");
        final GetSensitiveColumnRequest interceptedRequest =
                GetSensitiveColumnConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSensitiveColumnConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetSensitiveColumn",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveColumn/GetSensitiveColumn");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetSensitiveColumnResponse>
                transformer =
                        GetSensitiveColumnConverter.fromResponse(
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
    public GetSensitiveDataModelResponse getSensitiveDataModel(
            GetSensitiveDataModelRequest request) {
        LOG.trace("Called getSensitiveDataModel");
        final GetSensitiveDataModelRequest interceptedRequest =
                GetSensitiveDataModelConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSensitiveDataModelConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetSensitiveDataModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/GetSensitiveDataModel");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetSensitiveDataModelResponse>
                transformer =
                        GetSensitiveDataModelConverter.fromResponse(
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
    public GetSensitiveTypeResponse getSensitiveType(GetSensitiveTypeRequest request) {
        LOG.trace("Called getSensitiveType");
        final GetSensitiveTypeRequest interceptedRequest =
                GetSensitiveTypeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSensitiveTypeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetSensitiveType",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveType/GetSensitiveType");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetSensitiveTypeResponse>
                transformer =
                        GetSensitiveTypeConverter.fromResponse(
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
    public GetTargetAlertPolicyAssociationResponse getTargetAlertPolicyAssociation(
            GetTargetAlertPolicyAssociationRequest request) {
        LOG.trace("Called getTargetAlertPolicyAssociation");
        final GetTargetAlertPolicyAssociationRequest interceptedRequest =
                GetTargetAlertPolicyAssociationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTargetAlertPolicyAssociationConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetTargetAlertPolicyAssociation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociation/GetTargetAlertPolicyAssociation");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetTargetAlertPolicyAssociationResponse>
                transformer =
                        GetTargetAlertPolicyAssociationConverter.fromResponse(
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
    public GetTargetDatabaseResponse getTargetDatabase(GetTargetDatabaseRequest request) {
        LOG.trace("Called getTargetDatabase");
        final GetTargetDatabaseRequest interceptedRequest =
                GetTargetDatabaseConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetTargetDatabaseConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetTargetDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/GetTargetDatabase");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetTargetDatabaseResponse>
                transformer =
                        GetTargetDatabaseConverter.fromResponse(
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
    public GetUserAssessmentResponse getUserAssessment(GetUserAssessmentRequest request) {
        LOG.trace("Called getUserAssessment");
        final GetUserAssessmentRequest interceptedRequest =
                GetUserAssessmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserAssessmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetUserAssessment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/GetUserAssessment");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetUserAssessmentResponse>
                transformer =
                        GetUserAssessmentConverter.fromResponse(
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
    public GetUserAssessmentComparisonResponse getUserAssessmentComparison(
            GetUserAssessmentComparisonRequest request) {
        LOG.trace("Called getUserAssessmentComparison");
        final GetUserAssessmentComparisonRequest interceptedRequest =
                GetUserAssessmentComparisonConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserAssessmentComparisonConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetUserAssessmentComparison",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/GetUserAssessmentComparison");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetUserAssessmentComparisonResponse>
                transformer =
                        GetUserAssessmentComparisonConverter.fromResponse(
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
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {
        LOG.trace("Called getWorkRequest");
        final GetWorkRequestRequest interceptedRequest =
                GetWorkRequestConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWorkRequestConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "GetWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequest/GetWorkRequest");
        com.google.common.base.Function<javax.ws.rs.core.Response, GetWorkRequestResponse>
                transformer =
                        GetWorkRequestConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListAlertAnalyticsResponse listAlertAnalytics(ListAlertAnalyticsRequest request) {
        LOG.trace("Called listAlertAnalytics");
        final ListAlertAnalyticsRequest interceptedRequest =
                ListAlertAnalyticsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAlertAnalyticsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAlertAnalytics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertSummary/ListAlertAnalytics");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListAlertAnalyticsResponse>
                transformer =
                        ListAlertAnalyticsConverter.fromResponse(
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
    public ListAlertPoliciesResponse listAlertPolicies(ListAlertPoliciesRequest request) {
        LOG.trace("Called listAlertPolicies");
        final ListAlertPoliciesRequest interceptedRequest =
                ListAlertPoliciesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAlertPoliciesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAlertPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertPolicy/ListAlertPolicies");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListAlertPoliciesResponse>
                transformer =
                        ListAlertPoliciesConverter.fromResponse(
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
    public ListAlertPolicyRulesResponse listAlertPolicyRules(ListAlertPolicyRulesRequest request) {
        LOG.trace("Called listAlertPolicyRules");
        final ListAlertPolicyRulesRequest interceptedRequest =
                ListAlertPolicyRulesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAlertPolicyRulesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAlertPolicyRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertPolicy/ListAlertPolicyRules");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListAlertPolicyRulesResponse>
                transformer =
                        ListAlertPolicyRulesConverter.fromResponse(
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
    public ListAlertsResponse listAlerts(ListAlertsRequest request) {
        LOG.trace("Called listAlerts");
        final ListAlertsRequest interceptedRequest = ListAlertsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAlertsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAlerts",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AlertSummary/ListAlerts");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListAlertsResponse> transformer =
                ListAlertsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListAuditArchiveRetrievalsResponse listAuditArchiveRetrievals(
            ListAuditArchiveRetrievalsRequest request) {
        LOG.trace("Called listAuditArchiveRetrievals");
        final ListAuditArchiveRetrievalsRequest interceptedRequest =
                ListAuditArchiveRetrievalsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditArchiveRetrievalsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAuditArchiveRetrievals",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditArchiveRetrieval/ListAuditArchiveRetrievals");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAuditArchiveRetrievalsResponse>
                transformer =
                        ListAuditArchiveRetrievalsConverter.fromResponse(
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
    public ListAuditEventAnalyticsResponse listAuditEventAnalytics(
            ListAuditEventAnalyticsRequest request) {
        LOG.trace("Called listAuditEventAnalytics");
        final ListAuditEventAnalyticsRequest interceptedRequest =
                ListAuditEventAnalyticsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditEventAnalyticsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAuditEventAnalytics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditEventSummary/ListAuditEventAnalytics");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListAuditEventAnalyticsResponse>
                transformer =
                        ListAuditEventAnalyticsConverter.fromResponse(
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
    public ListAuditEventsResponse listAuditEvents(ListAuditEventsRequest request) {
        LOG.trace("Called listAuditEvents");
        final ListAuditEventsRequest interceptedRequest =
                ListAuditEventsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditEventsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAuditEvents",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditEventSummary/ListAuditEvents");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListAuditEventsResponse>
                transformer =
                        ListAuditEventsConverter.fromResponse(
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
    public ListAuditPoliciesResponse listAuditPolicies(ListAuditPoliciesRequest request) {
        LOG.trace("Called listAuditPolicies");
        final ListAuditPoliciesRequest interceptedRequest =
                ListAuditPoliciesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditPoliciesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAuditPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicyCollection/ListAuditPolicies");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListAuditPoliciesResponse>
                transformer =
                        ListAuditPoliciesConverter.fromResponse(
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
    public ListAuditProfileAnalyticsResponse listAuditProfileAnalytics(
            ListAuditProfileAnalyticsRequest request) {
        LOG.trace("Called listAuditProfileAnalytics");
        final ListAuditProfileAnalyticsRequest interceptedRequest =
                ListAuditProfileAnalyticsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditProfileAnalyticsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAuditProfileAnalytics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfileAnalyticCollection/ListAuditProfileAnalytics");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAuditProfileAnalyticsResponse>
                transformer =
                        ListAuditProfileAnalyticsConverter.fromResponse(
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
    public ListAuditProfilesResponse listAuditProfiles(ListAuditProfilesRequest request) {
        LOG.trace("Called listAuditProfiles");
        final ListAuditProfilesRequest interceptedRequest =
                ListAuditProfilesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditProfilesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAuditProfiles",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/ListAuditProfiles");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListAuditProfilesResponse>
                transformer =
                        ListAuditProfilesConverter.fromResponse(
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
    public ListAuditTrailAnalyticsResponse listAuditTrailAnalytics(
            ListAuditTrailAnalyticsRequest request) {
        LOG.trace("Called listAuditTrailAnalytics");
        final ListAuditTrailAnalyticsRequest interceptedRequest =
                ListAuditTrailAnalyticsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditTrailAnalyticsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAuditTrailAnalytics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrailAnalyticCollection/ListAuditTrailAnalytics");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListAuditTrailAnalyticsResponse>
                transformer =
                        ListAuditTrailAnalyticsConverter.fromResponse(
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
    public ListAuditTrailsResponse listAuditTrails(ListAuditTrailsRequest request) {
        LOG.trace("Called listAuditTrails");
        final ListAuditTrailsRequest interceptedRequest =
                ListAuditTrailsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuditTrailsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAuditTrails",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/ListAuditTrails");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListAuditTrailsResponse>
                transformer =
                        ListAuditTrailsConverter.fromResponse(
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
    public ListAvailableAuditVolumesResponse listAvailableAuditVolumes(
            ListAvailableAuditVolumesRequest request) {
        LOG.trace("Called listAvailableAuditVolumes");
        final ListAvailableAuditVolumesRequest interceptedRequest =
                ListAvailableAuditVolumesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAvailableAuditVolumesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListAvailableAuditVolumes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/ListAvailableAuditVolumes");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAvailableAuditVolumesResponse>
                transformer =
                        ListAvailableAuditVolumesConverter.fromResponse(
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
    public ListCollectedAuditVolumesResponse listCollectedAuditVolumes(
            ListCollectedAuditVolumesRequest request) {
        LOG.trace("Called listCollectedAuditVolumes");
        final ListCollectedAuditVolumesRequest interceptedRequest =
                ListCollectedAuditVolumesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCollectedAuditVolumesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListCollectedAuditVolumes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/ListCollectedAuditVolumes");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListCollectedAuditVolumesResponse>
                transformer =
                        ListCollectedAuditVolumesConverter.fromResponse(
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
    public ListColumnsResponse listColumns(ListColumnsRequest request) {
        LOG.trace("Called listColumns");
        final ListColumnsRequest interceptedRequest =
                ListColumnsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListColumnsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListColumns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/ListColumns");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListColumnsResponse>
                transformer =
                        ListColumnsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListDataSafePrivateEndpointsResponse listDataSafePrivateEndpoints(
            ListDataSafePrivateEndpointsRequest request) {
        LOG.trace("Called listDataSafePrivateEndpoints");
        final ListDataSafePrivateEndpointsRequest interceptedRequest =
                ListDataSafePrivateEndpointsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDataSafePrivateEndpointsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListDataSafePrivateEndpoints",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafePrivateEndpointSummary/ListDataSafePrivateEndpoints");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListDataSafePrivateEndpointsResponse>
                transformer =
                        ListDataSafePrivateEndpointsConverter.fromResponse(
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
    public ListDiscoveryAnalyticsResponse listDiscoveryAnalytics(
            ListDiscoveryAnalyticsRequest request) {
        LOG.trace("Called listDiscoveryAnalytics");
        final ListDiscoveryAnalyticsRequest interceptedRequest =
                ListDiscoveryAnalyticsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDiscoveryAnalyticsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListDiscoveryAnalytics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/ListDiscoveryAnalytics");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDiscoveryAnalyticsResponse>
                transformer =
                        ListDiscoveryAnalyticsConverter.fromResponse(
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
    public ListDiscoveryJobResultsResponse listDiscoveryJobResults(
            ListDiscoveryJobResultsRequest request) {
        LOG.trace("Called listDiscoveryJobResults");
        final ListDiscoveryJobResultsRequest interceptedRequest =
                ListDiscoveryJobResultsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDiscoveryJobResultsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListDiscoveryJobResults",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJob/ListDiscoveryJobResults");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDiscoveryJobResultsResponse>
                transformer =
                        ListDiscoveryJobResultsConverter.fromResponse(
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
    public ListDiscoveryJobsResponse listDiscoveryJobs(ListDiscoveryJobsRequest request) {
        LOG.trace("Called listDiscoveryJobs");
        final ListDiscoveryJobsRequest interceptedRequest =
                ListDiscoveryJobsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDiscoveryJobsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListDiscoveryJobs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJob/ListDiscoveryJobs");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListDiscoveryJobsResponse>
                transformer =
                        ListDiscoveryJobsConverter.fromResponse(
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
    public ListFindingsResponse listFindings(ListFindingsRequest request) {
        LOG.trace("Called listFindings");
        final ListFindingsRequest interceptedRequest =
                ListFindingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListFindingsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListFindings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/ListFindings");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListFindingsResponse>
                transformer =
                        ListFindingsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListGrantsResponse listGrants(ListGrantsRequest request) {
        LOG.trace("Called listGrants");
        final ListGrantsRequest interceptedRequest = ListGrantsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListGrantsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListGrants",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/ListGrants");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListGrantsResponse> transformer =
                ListGrantsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListLibraryMaskingFormatsResponse listLibraryMaskingFormats(
            ListLibraryMaskingFormatsRequest request) {
        LOG.trace("Called listLibraryMaskingFormats");
        final ListLibraryMaskingFormatsRequest interceptedRequest =
                ListLibraryMaskingFormatsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListLibraryMaskingFormatsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListLibraryMaskingFormats",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/LibraryMaskingFormatSummary/ListLibraryMaskingFormats");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListLibraryMaskingFormatsResponse>
                transformer =
                        ListLibraryMaskingFormatsConverter.fromResponse(
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
    public ListMaskedColumnsResponse listMaskedColumns(ListMaskedColumnsRequest request) {
        LOG.trace("Called listMaskedColumns");
        final ListMaskedColumnsRequest interceptedRequest =
                ListMaskedColumnsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMaskedColumnsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListMaskedColumns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskedColumnSummary/ListMaskedColumns");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListMaskedColumnsResponse>
                transformer =
                        ListMaskedColumnsConverter.fromResponse(
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
    public ListMaskingAnalyticsResponse listMaskingAnalytics(ListMaskingAnalyticsRequest request) {
        LOG.trace("Called listMaskingAnalytics");
        final ListMaskingAnalyticsRequest interceptedRequest =
                ListMaskingAnalyticsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMaskingAnalyticsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListMaskingAnalytics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/ListMaskingAnalytics");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListMaskingAnalyticsResponse>
                transformer =
                        ListMaskingAnalyticsConverter.fromResponse(
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
    public ListMaskingColumnsResponse listMaskingColumns(ListMaskingColumnsRequest request) {
        LOG.trace("Called listMaskingColumns");
        final ListMaskingColumnsRequest interceptedRequest =
                ListMaskingColumnsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMaskingColumnsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListMaskingColumns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/ListMaskingColumns");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListMaskingColumnsResponse>
                transformer =
                        ListMaskingColumnsConverter.fromResponse(
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
    public ListMaskingPoliciesResponse listMaskingPolicies(ListMaskingPoliciesRequest request) {
        LOG.trace("Called listMaskingPolicies");
        final ListMaskingPoliciesRequest interceptedRequest =
                ListMaskingPoliciesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMaskingPoliciesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListMaskingPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/ListMaskingPolicies");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListMaskingPoliciesResponse>
                transformer =
                        ListMaskingPoliciesConverter.fromResponse(
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
    public ListMaskingReportsResponse listMaskingReports(ListMaskingReportsRequest request) {
        LOG.trace("Called listMaskingReports");
        final ListMaskingReportsRequest interceptedRequest =
                ListMaskingReportsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMaskingReportsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListMaskingReports",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/ListMaskingReports");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListMaskingReportsResponse>
                transformer =
                        ListMaskingReportsConverter.fromResponse(
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
    public ListOnPremConnectorsResponse listOnPremConnectors(ListOnPremConnectorsRequest request) {
        LOG.trace("Called listOnPremConnectors");
        final ListOnPremConnectorsRequest interceptedRequest =
                ListOnPremConnectorsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOnPremConnectorsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListOnPremConnectors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnectorSummary/ListOnPremConnectors");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListOnPremConnectorsResponse>
                transformer =
                        ListOnPremConnectorsConverter.fromResponse(
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
    public ListReportDefinitionsResponse listReportDefinitions(
            ListReportDefinitionsRequest request) {
        LOG.trace("Called listReportDefinitions");
        final ListReportDefinitionsRequest interceptedRequest =
                ListReportDefinitionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListReportDefinitionsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListReportDefinitions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/ListReportDefinitions");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListReportDefinitionsResponse>
                transformer =
                        ListReportDefinitionsConverter.fromResponse(
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
    public ListReportsResponse listReports(ListReportsRequest request) {
        LOG.trace("Called listReports");
        final ListReportsRequest interceptedRequest =
                ListReportsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListReportsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListReports",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportSummary/ListReports");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListReportsResponse>
                transformer =
                        ListReportsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListRolesResponse listRoles(ListRolesRequest request) {
        LOG.trace("Called listRoles");
        final ListRolesRequest interceptedRequest = ListRolesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRolesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListRoles",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/ListRoles");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListRolesResponse> transformer =
                ListRolesConverter.fromResponse(java.util.Optional.of(serviceDetails));
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

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSchemas",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/ListSchemas");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListSchemasResponse>
                transformer =
                        ListSchemasConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListSecurityAssessmentsResponse listSecurityAssessments(
            ListSecurityAssessmentsRequest request) {
        LOG.trace("Called listSecurityAssessments");
        final ListSecurityAssessmentsRequest interceptedRequest =
                ListSecurityAssessmentsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSecurityAssessmentsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSecurityAssessments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessmentSummary/ListSecurityAssessments");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListSecurityAssessmentsResponse>
                transformer =
                        ListSecurityAssessmentsConverter.fromResponse(
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
    public ListSensitiveColumnsResponse listSensitiveColumns(ListSensitiveColumnsRequest request) {
        LOG.trace("Called listSensitiveColumns");
        final ListSensitiveColumnsRequest interceptedRequest =
                ListSensitiveColumnsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSensitiveColumnsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSensitiveColumns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveColumn/ListSensitiveColumns");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListSensitiveColumnsResponse>
                transformer =
                        ListSensitiveColumnsConverter.fromResponse(
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
    public ListSensitiveDataModelsResponse listSensitiveDataModels(
            ListSensitiveDataModelsRequest request) {
        LOG.trace("Called listSensitiveDataModels");
        final ListSensitiveDataModelsRequest interceptedRequest =
                ListSensitiveDataModelsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSensitiveDataModelsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSensitiveDataModels",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/ListSensitiveDataModels");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListSensitiveDataModelsResponse>
                transformer =
                        ListSensitiveDataModelsConverter.fromResponse(
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
    public ListSensitiveTypesResponse listSensitiveTypes(ListSensitiveTypesRequest request) {
        LOG.trace("Called listSensitiveTypes");
        final ListSensitiveTypesRequest interceptedRequest =
                ListSensitiveTypesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSensitiveTypesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListSensitiveTypes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveType/ListSensitiveTypes");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListSensitiveTypesResponse>
                transformer =
                        ListSensitiveTypesConverter.fromResponse(
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
    public ListTablesResponse listTables(ListTablesRequest request) {
        LOG.trace("Called listTables");
        final ListTablesRequest interceptedRequest = ListTablesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTablesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListTables",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/ListTables");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListTablesResponse> transformer =
                ListTablesConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListTargetAlertPolicyAssociationsResponse listTargetAlertPolicyAssociations(
            ListTargetAlertPolicyAssociationsRequest request) {
        LOG.trace("Called listTargetAlertPolicyAssociations");
        final ListTargetAlertPolicyAssociationsRequest interceptedRequest =
                ListTargetAlertPolicyAssociationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTargetAlertPolicyAssociationsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListTargetAlertPolicyAssociations",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociationSummary/ListTargetAlertPolicyAssociations");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListTargetAlertPolicyAssociationsResponse>
                transformer =
                        ListTargetAlertPolicyAssociationsConverter.fromResponse(
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
    public ListTargetDatabasesResponse listTargetDatabases(ListTargetDatabasesRequest request) {
        LOG.trace("Called listTargetDatabases");
        final ListTargetDatabasesRequest interceptedRequest =
                ListTargetDatabasesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListTargetDatabasesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListTargetDatabases",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabaseSummary/ListTargetDatabases");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListTargetDatabasesResponse>
                transformer =
                        ListTargetDatabasesConverter.fromResponse(
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
    public ListUserAnalyticsResponse listUserAnalytics(ListUserAnalyticsRequest request) {
        LOG.trace("Called listUserAnalytics");
        final ListUserAnalyticsRequest interceptedRequest =
                ListUserAnalyticsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUserAnalyticsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListUserAnalytics",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/ListUserAnalytics");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListUserAnalyticsResponse>
                transformer =
                        ListUserAnalyticsConverter.fromResponse(
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
    public ListUserAssessmentsResponse listUserAssessments(ListUserAssessmentsRequest request) {
        LOG.trace("Called listUserAssessments");
        final ListUserAssessmentsRequest interceptedRequest =
                ListUserAssessmentsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUserAssessmentsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListUserAssessments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessmentSummary/ListUserAssessments");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListUserAssessmentsResponse>
                transformer =
                        ListUserAssessmentsConverter.fromResponse(
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
    public ListUsersResponse listUsers(ListUsersRequest request) {
        LOG.trace("Called listUsers");
        final ListUsersRequest interceptedRequest = ListUsersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUsersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListUsers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/ListUsers");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListUsersResponse> transformer =
                ListUsersConverter.fromResponse(java.util.Optional.of(serviceDetails));
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

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListWorkRequestErrors",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequestError/ListWorkRequestErrors");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWorkRequestErrorsResponse>
                transformer =
                        ListWorkRequestErrorsConverter.fromResponse(
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
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {
        LOG.trace("Called listWorkRequestLogs");
        final ListWorkRequestLogsRequest interceptedRequest =
                ListWorkRequestLogsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkRequestLogsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListWorkRequestLogs",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequestLogEntry/ListWorkRequestLogs");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWorkRequestLogsResponse>
                transformer =
                        ListWorkRequestLogsConverter.fromResponse(
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
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        LOG.trace("Called listWorkRequests");
        final ListWorkRequestsRequest interceptedRequest =
                ListWorkRequestsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWorkRequestsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ListWorkRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequestSummary/ListWorkRequests");
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWorkRequestsResponse>
                transformer =
                        ListWorkRequestsConverter.fromResponse(
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
    public MaskDataResponse maskData(MaskDataRequest request) {
        LOG.trace("Called maskData");
        final MaskDataRequest interceptedRequest = MaskDataConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                MaskDataConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "MaskData",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/MaskData");
        com.google.common.base.Function<javax.ws.rs.core.Response, MaskDataResponse> transformer =
                MaskDataConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getMaskDataDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ModifyGlobalSettingsResponse modifyGlobalSettings(ModifyGlobalSettingsRequest request) {
        LOG.trace("Called modifyGlobalSettings");
        final ModifyGlobalSettingsRequest interceptedRequest =
                ModifyGlobalSettingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ModifyGlobalSettingsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ModifyGlobalSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafeConfiguration/ModifyGlobalSettings");
        com.google.common.base.Function<javax.ws.rs.core.Response, ModifyGlobalSettingsResponse>
                transformer =
                        ModifyGlobalSettingsConverter.fromResponse(
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
                                                retriedRequest.getModifyGlobalSettingsDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchAlertsResponse patchAlerts(PatchAlertsRequest request) {
        LOG.trace("Called patchAlerts");
        final PatchAlertsRequest interceptedRequest =
                PatchAlertsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchAlertsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "PatchAlerts",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Alert/PatchAlerts");
        com.google.common.base.Function<javax.ws.rs.core.Response, PatchAlertsResponse>
                transformer =
                        PatchAlertsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                        client.patch(
                                                ib,
                                                retriedRequest.getPatchAlertsDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchDiscoveryJobResultsResponse patchDiscoveryJobResults(
            PatchDiscoveryJobResultsRequest request) {
        LOG.trace("Called patchDiscoveryJobResults");
        final PatchDiscoveryJobResultsRequest interceptedRequest =
                PatchDiscoveryJobResultsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchDiscoveryJobResultsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "PatchDiscoveryJobResults",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DiscoveryJob/PatchDiscoveryJobResults");
        com.google.common.base.Function<javax.ws.rs.core.Response, PatchDiscoveryJobResultsResponse>
                transformer =
                        PatchDiscoveryJobResultsConverter.fromResponse(
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
                                        client.patch(
                                                ib,
                                                retriedRequest.getPatchDiscoveryJobResultDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchMaskingColumnsResponse patchMaskingColumns(PatchMaskingColumnsRequest request) {
        LOG.trace("Called patchMaskingColumns");
        final PatchMaskingColumnsRequest interceptedRequest =
                PatchMaskingColumnsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchMaskingColumnsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "PatchMaskingColumns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/PatchMaskingColumns");
        com.google.common.base.Function<javax.ws.rs.core.Response, PatchMaskingColumnsResponse>
                transformer =
                        PatchMaskingColumnsConverter.fromResponse(
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
                                        client.patch(
                                                ib,
                                                retriedRequest.getPatchMaskingColumnsDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchSensitiveColumnsResponse patchSensitiveColumns(
            PatchSensitiveColumnsRequest request) {
        LOG.trace("Called patchSensitiveColumns");
        final PatchSensitiveColumnsRequest interceptedRequest =
                PatchSensitiveColumnsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchSensitiveColumnsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "PatchSensitiveColumns",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveColumn/PatchSensitiveColumns");
        com.google.common.base.Function<javax.ws.rs.core.Response, PatchSensitiveColumnsResponse>
                transformer =
                        PatchSensitiveColumnsConverter.fromResponse(
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
                                        client.patch(
                                                ib,
                                                retriedRequest.getPatchSensitiveColumnDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ProvisionAuditPolicyResponse provisionAuditPolicy(ProvisionAuditPolicyRequest request) {
        LOG.trace("Called provisionAuditPolicy");
        final ProvisionAuditPolicyRequest interceptedRequest =
                ProvisionAuditPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ProvisionAuditPolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ProvisionAuditPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicy/ProvisionAuditPolicy");
        com.google.common.base.Function<javax.ws.rs.core.Response, ProvisionAuditPolicyResponse>
                transformer =
                        ProvisionAuditPolicyConverter.fromResponse(
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
                                                retriedRequest.getProvisionAuditPolicyDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public RefreshSecurityAssessmentResponse refreshSecurityAssessment(
            RefreshSecurityAssessmentRequest request) {
        LOG.trace("Called refreshSecurityAssessment");
        final RefreshSecurityAssessmentRequest interceptedRequest =
                RefreshSecurityAssessmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RefreshSecurityAssessmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "RefreshSecurityAssessment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/RefreshSecurityAssessment");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, RefreshSecurityAssessmentResponse>
                transformer =
                        RefreshSecurityAssessmentConverter.fromResponse(
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
                                                retriedRequest.getRunSecurityAssessmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public RefreshUserAssessmentResponse refreshUserAssessment(
            RefreshUserAssessmentRequest request) {
        LOG.trace("Called refreshUserAssessment");
        final RefreshUserAssessmentRequest interceptedRequest =
                RefreshUserAssessmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RefreshUserAssessmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "RefreshUserAssessment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/RefreshUserAssessment");
        com.google.common.base.Function<javax.ws.rs.core.Response, RefreshUserAssessmentResponse>
                transformer =
                        RefreshUserAssessmentConverter.fromResponse(
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
                                                retriedRequest.getRunUserAssessmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ResumeAuditTrailResponse resumeAuditTrail(ResumeAuditTrailRequest request) {
        LOG.trace("Called resumeAuditTrail");
        final ResumeAuditTrailRequest interceptedRequest =
                ResumeAuditTrailConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ResumeAuditTrailConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ResumeAuditTrail",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/ResumeAuditTrail");
        com.google.common.base.Function<javax.ws.rs.core.Response, ResumeAuditTrailResponse>
                transformer =
                        ResumeAuditTrailConverter.fromResponse(
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
                                        client.post(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ResumeWorkRequestResponse resumeWorkRequest(ResumeWorkRequestRequest request) {
        LOG.trace("Called resumeWorkRequest");
        final ResumeWorkRequestRequest interceptedRequest =
                ResumeWorkRequestConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ResumeWorkRequestConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "ResumeWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequest/ResumeWorkRequest");
        com.google.common.base.Function<javax.ws.rs.core.Response, ResumeWorkRequestResponse>
                transformer =
                        ResumeWorkRequestConverter.fromResponse(
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
                                        client.post(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public RetrieveAuditPoliciesResponse retrieveAuditPolicies(
            RetrieveAuditPoliciesRequest request) {
        LOG.trace("Called retrieveAuditPolicies");
        final RetrieveAuditPoliciesRequest interceptedRequest =
                RetrieveAuditPoliciesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RetrieveAuditPoliciesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "RetrieveAuditPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicy/RetrieveAuditPolicies");
        com.google.common.base.Function<javax.ws.rs.core.Response, RetrieveAuditPoliciesResponse>
                transformer =
                        RetrieveAuditPoliciesConverter.fromResponse(
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
                                        client.post(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SetSecurityAssessmentBaselineResponse setSecurityAssessmentBaseline(
            SetSecurityAssessmentBaselineRequest request) {
        LOG.trace("Called setSecurityAssessmentBaseline");
        final SetSecurityAssessmentBaselineRequest interceptedRequest =
                SetSecurityAssessmentBaselineConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SetSecurityAssessmentBaselineConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "SetSecurityAssessmentBaseline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/SetSecurityAssessmentBaseline");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, SetSecurityAssessmentBaselineResponse>
                transformer =
                        SetSecurityAssessmentBaselineConverter.fromResponse(
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
                                                retriedRequest.getBaseLineDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SetUserAssessmentBaselineResponse setUserAssessmentBaseline(
            SetUserAssessmentBaselineRequest request) {
        LOG.trace("Called setUserAssessmentBaseline");
        final SetUserAssessmentBaselineRequest interceptedRequest =
                SetUserAssessmentBaselineConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SetUserAssessmentBaselineConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "SetUserAssessmentBaseline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/SetUserAssessmentBaseline");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, SetUserAssessmentBaselineResponse>
                transformer =
                        SetUserAssessmentBaselineConverter.fromResponse(
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
                                                retriedRequest.getBaseLineDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public StartAuditTrailResponse startAuditTrail(StartAuditTrailRequest request) {
        LOG.trace("Called startAuditTrail");
        final StartAuditTrailRequest interceptedRequest =
                StartAuditTrailConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StartAuditTrailConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "StartAuditTrail",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/StartAuditTrail");
        com.google.common.base.Function<javax.ws.rs.core.Response, StartAuditTrailResponse>
                transformer =
                        StartAuditTrailConverter.fromResponse(
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
                                                retriedRequest.getStartAuditTrailDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public StopAuditTrailResponse stopAuditTrail(StopAuditTrailRequest request) {
        LOG.trace("Called stopAuditTrail");
        final StopAuditTrailRequest interceptedRequest =
                StopAuditTrailConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StopAuditTrailConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "StopAuditTrail",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/StopAuditTrail");
        com.google.common.base.Function<javax.ws.rs.core.Response, StopAuditTrailResponse>
                transformer =
                        StopAuditTrailConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public SuspendWorkRequestResponse suspendWorkRequest(SuspendWorkRequestRequest request) {
        LOG.trace("Called suspendWorkRequest");
        final SuspendWorkRequestRequest interceptedRequest =
                SuspendWorkRequestConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SuspendWorkRequestConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "SuspendWorkRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/WorkRequest/SuspendWorkRequest");
        com.google.common.base.Function<javax.ws.rs.core.Response, SuspendWorkRequestResponse>
                transformer =
                        SuspendWorkRequestConverter.fromResponse(
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
                                        client.post(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UnsetSecurityAssessmentBaselineResponse unsetSecurityAssessmentBaseline(
            UnsetSecurityAssessmentBaselineRequest request) {
        LOG.trace("Called unsetSecurityAssessmentBaseline");
        final UnsetSecurityAssessmentBaselineRequest interceptedRequest =
                UnsetSecurityAssessmentBaselineConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UnsetSecurityAssessmentBaselineConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UnsetSecurityAssessmentBaseline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/UnsetSecurityAssessmentBaseline");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UnsetSecurityAssessmentBaselineResponse>
                transformer =
                        UnsetSecurityAssessmentBaselineConverter.fromResponse(
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
                                        client.post(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UnsetUserAssessmentBaselineResponse unsetUserAssessmentBaseline(
            UnsetUserAssessmentBaselineRequest request) {
        LOG.trace("Called unsetUserAssessmentBaseline");
        final UnsetUserAssessmentBaselineRequest interceptedRequest =
                UnsetUserAssessmentBaselineConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UnsetUserAssessmentBaselineConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UnsetUserAssessmentBaseline",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/UnsetUserAssessmentBaseline");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UnsetUserAssessmentBaselineResponse>
                transformer =
                        UnsetUserAssessmentBaselineConverter.fromResponse(
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
                                        client.post(ib, retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateAlertResponse updateAlert(UpdateAlertRequest request) {
        LOG.trace("Called updateAlert");
        final UpdateAlertRequest interceptedRequest =
                UpdateAlertConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAlertConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateAlert",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/Alert/UpdateAlert");
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateAlertResponse>
                transformer =
                        UpdateAlertConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                                                retriedRequest.getUpdateAlertDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateAuditArchiveRetrievalResponse updateAuditArchiveRetrieval(
            UpdateAuditArchiveRetrievalRequest request) {
        LOG.trace("Called updateAuditArchiveRetrieval");
        final UpdateAuditArchiveRetrievalRequest interceptedRequest =
                UpdateAuditArchiveRetrievalConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAuditArchiveRetrievalConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateAuditArchiveRetrieval",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditArchiveRetrieval/UpdateAuditArchiveRetrieval");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateAuditArchiveRetrievalResponse>
                transformer =
                        UpdateAuditArchiveRetrievalConverter.fromResponse(
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
                                                        .getUpdateAuditArchiveRetrievalDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateAuditPolicyResponse updateAuditPolicy(UpdateAuditPolicyRequest request) {
        LOG.trace("Called updateAuditPolicy");
        final UpdateAuditPolicyRequest interceptedRequest =
                UpdateAuditPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAuditPolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateAuditPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditPolicy/UpdateAuditPolicy");
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateAuditPolicyResponse>
                transformer =
                        UpdateAuditPolicyConverter.fromResponse(
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
                                                retriedRequest.getUpdateAuditPolicyDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateAuditProfileResponse updateAuditProfile(UpdateAuditProfileRequest request) {
        LOG.trace("Called updateAuditProfile");
        final UpdateAuditProfileRequest interceptedRequest =
                UpdateAuditProfileConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAuditProfileConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateAuditProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditProfile/UpdateAuditProfile");
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateAuditProfileResponse>
                transformer =
                        UpdateAuditProfileConverter.fromResponse(
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
                                                retriedRequest.getUpdateAuditProfileDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateAuditTrailResponse updateAuditTrail(UpdateAuditTrailRequest request) {
        LOG.trace("Called updateAuditTrail");
        final UpdateAuditTrailRequest interceptedRequest =
                UpdateAuditTrailConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAuditTrailConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateAuditTrail",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/AuditTrail/UpdateAuditTrail");
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateAuditTrailResponse>
                transformer =
                        UpdateAuditTrailConverter.fromResponse(
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
                                                retriedRequest.getUpdateAuditTrailDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateDataSafePrivateEndpointResponse updateDataSafePrivateEndpoint(
            UpdateDataSafePrivateEndpointRequest request) {
        LOG.trace("Called updateDataSafePrivateEndpoint");
        final UpdateDataSafePrivateEndpointRequest interceptedRequest =
                UpdateDataSafePrivateEndpointConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDataSafePrivateEndpointConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateDataSafePrivateEndpoint",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/DataSafePrivateEndpoint/UpdateDataSafePrivateEndpoint");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateDataSafePrivateEndpointResponse>
                transformer =
                        UpdateDataSafePrivateEndpointConverter.fromResponse(
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
                                                        .getUpdateDataSafePrivateEndpointDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateLibraryMaskingFormatResponse updateLibraryMaskingFormat(
            UpdateLibraryMaskingFormatRequest request) {
        LOG.trace("Called updateLibraryMaskingFormat");
        final UpdateLibraryMaskingFormatRequest interceptedRequest =
                UpdateLibraryMaskingFormatConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateLibraryMaskingFormatConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateLibraryMaskingFormat",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/LibraryMaskingFormat/UpdateLibraryMaskingFormat");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateLibraryMaskingFormatResponse>
                transformer =
                        UpdateLibraryMaskingFormatConverter.fromResponse(
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
                                                        .getUpdateLibraryMaskingFormatDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateMaskingColumnResponse updateMaskingColumn(UpdateMaskingColumnRequest request) {
        LOG.trace("Called updateMaskingColumn");
        final UpdateMaskingColumnRequest interceptedRequest =
                UpdateMaskingColumnConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMaskingColumnConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateMaskingColumn",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingColumn/UpdateMaskingColumn");
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateMaskingColumnResponse>
                transformer =
                        UpdateMaskingColumnConverter.fromResponse(
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
                                                retriedRequest.getUpdateMaskingColumnDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateMaskingPolicyResponse updateMaskingPolicy(UpdateMaskingPolicyRequest request) {
        LOG.trace("Called updateMaskingPolicy");
        final UpdateMaskingPolicyRequest interceptedRequest =
                UpdateMaskingPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateMaskingPolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateMaskingPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/UpdateMaskingPolicy");
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateMaskingPolicyResponse>
                transformer =
                        UpdateMaskingPolicyConverter.fromResponse(
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
                                                retriedRequest.getUpdateMaskingPolicyDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateOnPremConnectorResponse updateOnPremConnector(
            UpdateOnPremConnectorRequest request) {
        LOG.trace("Called updateOnPremConnector");
        final UpdateOnPremConnectorRequest interceptedRequest =
                UpdateOnPremConnectorConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateOnPremConnectorConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateOnPremConnector",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/UpdateOnPremConnector");
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateOnPremConnectorResponse>
                transformer =
                        UpdateOnPremConnectorConverter.fromResponse(
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
                                                retriedRequest.getUpdateOnPremConnectorDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateOnPremConnectorWalletResponse updateOnPremConnectorWallet(
            UpdateOnPremConnectorWalletRequest request) {
        LOG.trace("Called updateOnPremConnectorWallet");
        final UpdateOnPremConnectorWalletRequest interceptedRequest =
                UpdateOnPremConnectorWalletConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateOnPremConnectorWalletConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateOnPremConnectorWallet",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/OnPremConnector/UpdateOnPremConnectorWallet");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateOnPremConnectorWalletResponse>
                transformer =
                        UpdateOnPremConnectorWalletConverter.fromResponse(
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
                                                        .getUpdateOnPremConnectorWalletDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateReportDefinitionResponse updateReportDefinition(
            UpdateReportDefinitionRequest request) {
        LOG.trace("Called updateReportDefinition");
        final UpdateReportDefinitionRequest interceptedRequest =
                UpdateReportDefinitionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateReportDefinitionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateReportDefinition",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/ReportDefinition/UpdateReportDefinition");
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateReportDefinitionResponse>
                transformer =
                        UpdateReportDefinitionConverter.fromResponse(
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
                                                retriedRequest.getUpdateReportDefinitionDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateSecurityAssessmentResponse updateSecurityAssessment(
            UpdateSecurityAssessmentRequest request) {
        LOG.trace("Called updateSecurityAssessment");
        final UpdateSecurityAssessmentRequest interceptedRequest =
                UpdateSecurityAssessmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSecurityAssessmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateSecurityAssessment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SecurityAssessment/UpdateSecurityAssessment");
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateSecurityAssessmentResponse>
                transformer =
                        UpdateSecurityAssessmentConverter.fromResponse(
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
                                                retriedRequest.getUpdateSecurityAssessmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateSensitiveColumnResponse updateSensitiveColumn(
            UpdateSensitiveColumnRequest request) {
        LOG.trace("Called updateSensitiveColumn");
        final UpdateSensitiveColumnRequest interceptedRequest =
                UpdateSensitiveColumnConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSensitiveColumnConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateSensitiveColumn",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveColumn/UpdateSensitiveColumn");
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateSensitiveColumnResponse>
                transformer =
                        UpdateSensitiveColumnConverter.fromResponse(
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
                                                retriedRequest.getUpdateSensitiveColumnDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateSensitiveDataModelResponse updateSensitiveDataModel(
            UpdateSensitiveDataModelRequest request) {
        LOG.trace("Called updateSensitiveDataModel");
        final UpdateSensitiveDataModelRequest interceptedRequest =
                UpdateSensitiveDataModelConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSensitiveDataModelConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateSensitiveDataModel",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/UpdateSensitiveDataModel");
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateSensitiveDataModelResponse>
                transformer =
                        UpdateSensitiveDataModelConverter.fromResponse(
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
                                                retriedRequest.getUpdateSensitiveDataModelDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateSensitiveTypeResponse updateSensitiveType(UpdateSensitiveTypeRequest request) {
        LOG.trace("Called updateSensitiveType");
        final UpdateSensitiveTypeRequest interceptedRequest =
                UpdateSensitiveTypeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSensitiveTypeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateSensitiveType",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveType/UpdateSensitiveType");
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateSensitiveTypeResponse>
                transformer =
                        UpdateSensitiveTypeConverter.fromResponse(
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
                                                retriedRequest.getUpdateSensitiveTypeDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateTargetAlertPolicyAssociationResponse updateTargetAlertPolicyAssociation(
            UpdateTargetAlertPolicyAssociationRequest request) {
        LOG.trace("Called updateTargetAlertPolicyAssociation");
        final UpdateTargetAlertPolicyAssociationRequest interceptedRequest =
                UpdateTargetAlertPolicyAssociationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTargetAlertPolicyAssociationConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateTargetAlertPolicyAssociation",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetAlertPolicyAssociation/UpdateTargetAlertPolicyAssociation");
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateTargetAlertPolicyAssociationResponse>
                transformer =
                        UpdateTargetAlertPolicyAssociationConverter.fromResponse(
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
                                                        .getUpdateTargetAlertPolicyAssociationDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateTargetDatabaseResponse updateTargetDatabase(UpdateTargetDatabaseRequest request) {
        LOG.trace("Called updateTargetDatabase");
        final UpdateTargetDatabaseRequest interceptedRequest =
                UpdateTargetDatabaseConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateTargetDatabaseConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateTargetDatabase",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/TargetDatabase/UpdateTargetDatabase");
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateTargetDatabaseResponse>
                transformer =
                        UpdateTargetDatabaseConverter.fromResponse(
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
                                                retriedRequest.getUpdateTargetDatabaseDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateUserAssessmentResponse updateUserAssessment(UpdateUserAssessmentRequest request) {
        LOG.trace("Called updateUserAssessment");
        final UpdateUserAssessmentRequest interceptedRequest =
                UpdateUserAssessmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateUserAssessmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "DataSafe",
                        "UpdateUserAssessment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/UserAssessment/UpdateUserAssessment");
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateUserAssessmentResponse>
                transformer =
                        UpdateUserAssessmentConverter.fromResponse(
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
                                                retriedRequest.getUpdateUserAssessmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UploadMaskingPolicyResponse uploadMaskingPolicy(UploadMaskingPolicyRequest request) {
        LOG.trace("Called uploadMaskingPolicy");
        try {
            final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                    com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                            request.getRetryConfiguration(), retryConfiguration, true);
            if (request.getRetryConfiguration() != null
                    || retryConfiguration != null
                    || shouldRetryBecauseOfWaiterConfiguration(retrier)
                    || authenticationDetailsProvider
                            instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
                request =
                        com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                                request, UploadMaskingPolicyRequest.builder());
            }
            final UploadMaskingPolicyRequest interceptedRequest =
                    UploadMaskingPolicyConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                    UploadMaskingPolicyConverter.fromRequest(client, interceptedRequest);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails =
                    new com.oracle.bmc.ServiceDetails(
                            "DataSafe",
                            "UploadMaskingPolicy",
                            ib.getRequestUri().toString(),
                            "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/MaskingPolicy/UploadMaskingPolicy");
            com.google.common.base.Function<javax.ws.rs.core.Response, UploadMaskingPolicyResponse>
                    transformer =
                            UploadMaskingPolicyConverter.fromResponse(
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
                                    try {
                                        javax.ws.rs.core.Response response =
                                                client.post(
                                                        ib,
                                                        retriedRequest
                                                                .getUploadMaskingPolicyDetails(),
                                                        retriedRequest);
                                        return transformer.apply(response);
                                    } catch (RuntimeException e) {
                                        if (interceptedRequest.getRetryConfiguration() != null
                                                || retryConfiguration != null
                                                || shouldRetryBecauseOfWaiterConfiguration(retrier)
                                                || (e instanceof com.oracle.bmc.model.BmcException
                                                        && tokenRefreshRetrier
                                                                .getRetryCondition()
                                                                .shouldBeRetried(
                                                                        (com.oracle.bmc.model
                                                                                        .BmcException)
                                                                                e))) {
                                            com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                                                    interceptedRequest
                                                            .getUploadMaskingPolicyDetails(),
                                                    true);
                                        }
                                        throw e; // rethrow
                                    }
                                });
                    });
        } finally {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
                    request.getUploadMaskingPolicyDetails());
        }
    }

    @Override
    public UploadSensitiveDataModelResponse uploadSensitiveDataModel(
            UploadSensitiveDataModelRequest request) {
        LOG.trace("Called uploadSensitiveDataModel");
        try {
            final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                    com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                            request.getRetryConfiguration(), retryConfiguration, true);
            if (request.getRetryConfiguration() != null
                    || retryConfiguration != null
                    || shouldRetryBecauseOfWaiterConfiguration(retrier)
                    || authenticationDetailsProvider
                            instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
                request =
                        com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(
                                request, UploadSensitiveDataModelRequest.builder());
            }
            final UploadSensitiveDataModelRequest interceptedRequest =
                    UploadSensitiveDataModelConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                    UploadSensitiveDataModelConverter.fromRequest(client, interceptedRequest);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails =
                    new com.oracle.bmc.ServiceDetails(
                            "DataSafe",
                            "UploadSensitiveDataModel",
                            ib.getRequestUri().toString(),
                            "https://docs.oracle.com/iaas/api/#/en/data-safe/20181201/SensitiveDataModel/UploadSensitiveDataModel");
            com.google.common.base.Function<
                            javax.ws.rs.core.Response, UploadSensitiveDataModelResponse>
                    transformer =
                            UploadSensitiveDataModelConverter.fromResponse(
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
                                    try {
                                        javax.ws.rs.core.Response response =
                                                client.post(
                                                        ib,
                                                        retriedRequest
                                                                .getUploadSensitiveDataModelDetails(),
                                                        retriedRequest);
                                        return transformer.apply(response);
                                    } catch (RuntimeException e) {
                                        if (interceptedRequest.getRetryConfiguration() != null
                                                || retryConfiguration != null
                                                || shouldRetryBecauseOfWaiterConfiguration(retrier)
                                                || (e instanceof com.oracle.bmc.model.BmcException
                                                        && tokenRefreshRetrier
                                                                .getRetryCondition()
                                                                .shouldBeRetried(
                                                                        (com.oracle.bmc.model
                                                                                        .BmcException)
                                                                                e))) {
                                            com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                                                    interceptedRequest
                                                            .getUploadSensitiveDataModelDetails(),
                                                    true);
                                        }
                                        throw e; // rethrow
                                    }
                                });
                    });
        } finally {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(
                    request.getUploadSensitiveDataModelDetails());
        }
    }

    @Override
    public DataSafeWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DataSafePaginators getPaginators() {
        return paginators;
    }

    private static boolean shouldRetryBecauseOfWaiterConfiguration(
            com.oracle.bmc.retrier.BmcGenericRetrier retrier) {
        boolean hasTerminationStrategy = false;
        boolean isMaxAttemptsTerminationStrategy = false;
        if (retrier.getWaiter() != null && retrier.getWaiter().getWaiterConfiguration() != null) {
            hasTerminationStrategy =
                    retrier.getWaiter().getWaiterConfiguration().getTerminationStrategy() != null;
            if (hasTerminationStrategy) {
                isMaxAttemptsTerminationStrategy =
                        retrier.getWaiter().getWaiterConfiguration().getTerminationStrategy()
                                instanceof com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy;
            }
        }
        final boolean shouldRetry =
                hasTerminationStrategy
                        && (!isMaxAttemptsTerminationStrategy
                                || isMaxAttemptsTerminationStrategy
                                        && ((com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy)
                                                                retrier.getWaiter()
                                                                        .getWaiterConfiguration()
                                                                        .getTerminationStrategy())
                                                        .getMaxAttempts()
                                                > 1);
        return shouldRetry;
    }
}
