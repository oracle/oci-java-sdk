/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas;

import com.oracle.bmc.waas.internal.http.*;
import com.oracle.bmc.waas.requests.*;
import com.oracle.bmc.waas.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.extern.slf4j.Slf4j
public class WaasClient implements Waas {
    /**
     * Service instance for Waas.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("WAAS")
                    .serviceEndpointPrefix("waas")
                    .serviceEndpointTemplate("https://waas.{region}.oci.{secondLevelDomain}")
                    .build();
    // attempt twice if it's instance principals, immediately failures will try to refresh the token
    private static final int MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS = 2;

    private final WaasWaiters waiters;

    private final WaasPaginators paginators;

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
    public WaasClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public WaasClient(
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
    public WaasClient(
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
    public WaasClient(
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
    public WaasClient(
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
    public WaasClient(
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
    public WaasClient(
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
    public WaasClient(
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
    protected WaasClient(
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
                                    .setNameFormat("Waas-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new WaasWaiters(executorService, this);

        this.paginators = new WaasPaginators(this);

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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, WaasClient> {
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
        public WaasClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new WaasClient(
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
    public AcceptRecommendationsResponse acceptRecommendations(
            AcceptRecommendationsRequest request) {
        LOG.trace("Called acceptRecommendations");
        final AcceptRecommendationsRequest interceptedRequest =
                AcceptRecommendationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AcceptRecommendationsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, AcceptRecommendationsResponse>
                transformer = AcceptRecommendationsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "AcceptRecommendations",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Recommendation/AcceptRecommendations");
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
                                                retriedRequest.getProtectionRuleKeys(),
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
        com.google.common.base.Function<javax.ws.rs.core.Response, CancelWorkRequestResponse>
                transformer = CancelWorkRequestConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "CancelWorkRequest",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WorkRequest/CancelWorkRequest");
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
    public ChangeAddressListCompartmentResponse changeAddressListCompartment(
            ChangeAddressListCompartmentRequest request) {
        LOG.trace("Called changeAddressListCompartment");
        final ChangeAddressListCompartmentRequest interceptedRequest =
                ChangeAddressListCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeAddressListCompartmentConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeAddressListCompartmentResponse>
                transformer = ChangeAddressListCompartmentConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "ChangeAddressListCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AddressList/ChangeAddressListCompartment");
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
                                                        .getChangeAddressListCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeCertificateCompartmentResponse changeCertificateCompartment(
            ChangeCertificateCompartmentRequest request) {
        LOG.trace("Called changeCertificateCompartment");
        final ChangeCertificateCompartmentRequest interceptedRequest =
                ChangeCertificateCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeCertificateCompartmentConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeCertificateCompartmentResponse>
                transformer = ChangeCertificateCompartmentConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "ChangeCertificateCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Certificate/ChangeCertificateCompartment");
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
                                                        .getChangeCertificateCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeCustomProtectionRuleCompartmentResponse changeCustomProtectionRuleCompartment(
            ChangeCustomProtectionRuleCompartmentRequest request) {
        LOG.trace("Called changeCustomProtectionRuleCompartment");
        final ChangeCustomProtectionRuleCompartmentRequest interceptedRequest =
                ChangeCustomProtectionRuleCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeCustomProtectionRuleCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeCustomProtectionRuleCompartmentResponse>
                transformer = ChangeCustomProtectionRuleCompartmentConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "ChangeCustomProtectionRuleCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CustomProtectionRule/ChangeCustomProtectionRuleCompartment");
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
                                                        .getChangeCustomProtectionRuleCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeWaasPolicyCompartmentResponse changeWaasPolicyCompartment(
            ChangeWaasPolicyCompartmentRequest request) {
        LOG.trace("Called changeWaasPolicyCompartment");
        final ChangeWaasPolicyCompartmentRequest interceptedRequest =
                ChangeWaasPolicyCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeWaasPolicyCompartmentConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeWaasPolicyCompartmentResponse>
                transformer = ChangeWaasPolicyCompartmentConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "ChangeWaasPolicyCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WaasPolicy/ChangeWaasPolicyCompartment");
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
                                                        .getChangeWaasPolicyCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateAddressListResponse createAddressList(CreateAddressListRequest request) {
        LOG.trace("Called createAddressList");
        final CreateAddressListRequest interceptedRequest =
                CreateAddressListConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAddressListConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateAddressListResponse>
                transformer = CreateAddressListConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "CreateAddressList",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AddressList/CreateAddressList");
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
                                                retriedRequest.getCreateAddressListDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) {
        LOG.trace("Called createCertificate");
        final CreateCertificateRequest interceptedRequest =
                CreateCertificateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCertificateConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateCertificateResponse>
                transformer = CreateCertificateConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "CreateCertificate",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Certificate/CreateCertificate");
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
                                                retriedRequest.getCreateCertificateDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateCustomProtectionRuleResponse createCustomProtectionRule(
            CreateCustomProtectionRuleRequest request) {
        LOG.trace("Called createCustomProtectionRule");
        final CreateCustomProtectionRuleRequest interceptedRequest =
                CreateCustomProtectionRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCustomProtectionRuleConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateCustomProtectionRuleResponse>
                transformer = CreateCustomProtectionRuleConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "CreateCustomProtectionRule",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CustomProtectionRule/CreateCustomProtectionRule");
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
                                                        .getCreateCustomProtectionRuleDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateWaasPolicyResponse createWaasPolicy(CreateWaasPolicyRequest request) {
        LOG.trace("Called createWaasPolicy");
        final CreateWaasPolicyRequest interceptedRequest =
                CreateWaasPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateWaasPolicyConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateWaasPolicyResponse>
                transformer = CreateWaasPolicyConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "CreateWaasPolicy",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WaasPolicy/CreateWaasPolicy");
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
                                                retriedRequest.getCreateWaasPolicyDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteAddressListResponse deleteAddressList(DeleteAddressListRequest request) {
        LOG.trace("Called deleteAddressList");
        final DeleteAddressListRequest interceptedRequest =
                DeleteAddressListConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAddressListConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteAddressListResponse>
                transformer = DeleteAddressListConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "DeleteAddressList",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AddressList/DeleteAddressList");
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
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {
        LOG.trace("Called deleteCertificate");
        final DeleteCertificateRequest interceptedRequest =
                DeleteCertificateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCertificateConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteCertificateResponse>
                transformer = DeleteCertificateConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "DeleteCertificate",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Certificate/DeleteCertificate");
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
    public DeleteCustomProtectionRuleResponse deleteCustomProtectionRule(
            DeleteCustomProtectionRuleRequest request) {
        LOG.trace("Called deleteCustomProtectionRule");
        final DeleteCustomProtectionRuleRequest interceptedRequest =
                DeleteCustomProtectionRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCustomProtectionRuleConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteCustomProtectionRuleResponse>
                transformer = DeleteCustomProtectionRuleConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "DeleteCustomProtectionRule",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CustomProtectionRule/DeleteCustomProtectionRule");
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
    public DeleteWaasPolicyResponse deleteWaasPolicy(DeleteWaasPolicyRequest request) {
        LOG.trace("Called deleteWaasPolicy");
        final DeleteWaasPolicyRequest interceptedRequest =
                DeleteWaasPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteWaasPolicyConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteWaasPolicyResponse>
                transformer = DeleteWaasPolicyConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "DeleteWaasPolicy",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WaasPolicy/DeleteWaasPolicy");
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
    public GetAddressListResponse getAddressList(GetAddressListRequest request) {
        LOG.trace("Called getAddressList");
        final GetAddressListRequest interceptedRequest =
                GetAddressListConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAddressListConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetAddressListResponse>
                transformer = GetAddressListConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "GetAddressList",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AddressList/GetAddressList");
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
    public GetCertificateResponse getCertificate(GetCertificateRequest request) {
        LOG.trace("Called getCertificate");
        final GetCertificateRequest interceptedRequest =
                GetCertificateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCertificateConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetCertificateResponse>
                transformer = GetCertificateConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "GetCertificate",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Certificate/GetCertificate");
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
    public GetCustomProtectionRuleResponse getCustomProtectionRule(
            GetCustomProtectionRuleRequest request) {
        LOG.trace("Called getCustomProtectionRule");
        final GetCustomProtectionRuleRequest interceptedRequest =
                GetCustomProtectionRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCustomProtectionRuleConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetCustomProtectionRuleResponse>
                transformer = GetCustomProtectionRuleConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "GetCustomProtectionRule",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CustomProtectionRule/GetCustomProtectionRule");
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
    public GetDeviceFingerprintChallengeResponse getDeviceFingerprintChallenge(
            GetDeviceFingerprintChallengeRequest request) {
        LOG.trace("Called getDeviceFingerprintChallenge");
        final GetDeviceFingerprintChallengeRequest interceptedRequest =
                GetDeviceFingerprintChallengeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDeviceFingerprintChallengeConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetDeviceFingerprintChallengeResponse>
                transformer = GetDeviceFingerprintChallengeConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "GetDeviceFingerprintChallenge",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/DeviceFingerprintChallenge/GetDeviceFingerprintChallenge");
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
    public GetHumanInteractionChallengeResponse getHumanInteractionChallenge(
            GetHumanInteractionChallengeRequest request) {
        LOG.trace("Called getHumanInteractionChallenge");
        final GetHumanInteractionChallengeRequest interceptedRequest =
                GetHumanInteractionChallengeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetHumanInteractionChallengeConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetHumanInteractionChallengeResponse>
                transformer = GetHumanInteractionChallengeConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "GetHumanInteractionChallenge",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/HumanInteractionChallenge/GetHumanInteractionChallenge");
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
    public GetJsChallengeResponse getJsChallenge(GetJsChallengeRequest request) {
        LOG.trace("Called getJsChallenge");
        final GetJsChallengeRequest interceptedRequest =
                GetJsChallengeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetJsChallengeConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetJsChallengeResponse>
                transformer = GetJsChallengeConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "GetJsChallenge",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/JsChallenge/GetJsChallenge");
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
    public GetPolicyConfigResponse getPolicyConfig(GetPolicyConfigRequest request) {
        LOG.trace("Called getPolicyConfig");
        final GetPolicyConfigRequest interceptedRequest =
                GetPolicyConfigConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPolicyConfigConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetPolicyConfigResponse>
                transformer = GetPolicyConfigConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "GetPolicyConfig",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/PolicyConfig/GetPolicyConfig");
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
    public GetProtectionRuleResponse getProtectionRule(GetProtectionRuleRequest request) {
        LOG.trace("Called getProtectionRule");
        final GetProtectionRuleRequest interceptedRequest =
                GetProtectionRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetProtectionRuleConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetProtectionRuleResponse>
                transformer = GetProtectionRuleConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "GetProtectionRule",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/ProtectionRule/GetProtectionRule");
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
    public GetProtectionSettingsResponse getProtectionSettings(
            GetProtectionSettingsRequest request) {
        LOG.trace("Called getProtectionSettings");
        final GetProtectionSettingsRequest interceptedRequest =
                GetProtectionSettingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetProtectionSettingsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetProtectionSettingsResponse>
                transformer = GetProtectionSettingsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "GetProtectionSettings",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/ProtectionSettings/GetProtectionSettings");
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
    public GetWaasPolicyResponse getWaasPolicy(GetWaasPolicyRequest request) {
        LOG.trace("Called getWaasPolicy");
        final GetWaasPolicyRequest interceptedRequest =
                GetWaasPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWaasPolicyConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetWaasPolicyResponse>
                transformer = GetWaasPolicyConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "GetWaasPolicy",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WaasPolicy/GetWaasPolicy");
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
    public GetWafAddressRateLimitingResponse getWafAddressRateLimiting(
            GetWafAddressRateLimitingRequest request) {
        LOG.trace("Called getWafAddressRateLimiting");
        final GetWafAddressRateLimitingRequest interceptedRequest =
                GetWafAddressRateLimitingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWafAddressRateLimitingConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetWafAddressRateLimitingResponse>
                transformer = GetWafAddressRateLimitingConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "GetWafAddressRateLimiting",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AddressRateLimiting/GetWafAddressRateLimiting");
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
    public GetWafConfigResponse getWafConfig(GetWafConfigRequest request) {
        LOG.trace("Called getWafConfig");
        final GetWafConfigRequest interceptedRequest =
                GetWafConfigConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWafConfigConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetWafConfigResponse>
                transformer = GetWafConfigConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "GetWafConfig",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WafConfig/GetWafConfig");
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
                "Waas",
                "GetWorkRequest",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WorkRequest/GetWorkRequest");
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
    public ListAccessRulesResponse listAccessRules(ListAccessRulesRequest request) {
        LOG.trace("Called listAccessRules");
        final ListAccessRulesRequest interceptedRequest =
                ListAccessRulesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAccessRulesConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListAccessRulesResponse>
                transformer = ListAccessRulesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "ListAccessRules",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AccessRule/ListAccessRules");
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
    public ListAddressListsResponse listAddressLists(ListAddressListsRequest request) {
        LOG.trace("Called listAddressLists");
        final ListAddressListsRequest interceptedRequest =
                ListAddressListsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAddressListsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListAddressListsResponse>
                transformer = ListAddressListsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "ListAddressLists",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AddressList/ListAddressLists");
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
    public ListCachingRulesResponse listCachingRules(ListCachingRulesRequest request) {
        LOG.trace("Called listCachingRules");
        final ListCachingRulesRequest interceptedRequest =
                ListCachingRulesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCachingRulesConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListCachingRulesResponse>
                transformer = ListCachingRulesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "ListCachingRules",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CachingRuleSummary/ListCachingRules");
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
    public ListCaptchasResponse listCaptchas(ListCaptchasRequest request) {
        LOG.trace("Called listCaptchas");
        final ListCaptchasRequest interceptedRequest =
                ListCaptchasConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCaptchasConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListCaptchasResponse>
                transformer = ListCaptchasConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "ListCaptchas",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Captcha/ListCaptchas");
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
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {
        LOG.trace("Called listCertificates");
        final ListCertificatesRequest interceptedRequest =
                ListCertificatesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCertificatesConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListCertificatesResponse>
                transformer = ListCertificatesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "ListCertificates",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CertificateSummary/ListCertificates");
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
    public ListCustomProtectionRulesResponse listCustomProtectionRules(
            ListCustomProtectionRulesRequest request) {
        LOG.trace("Called listCustomProtectionRules");
        final ListCustomProtectionRulesRequest interceptedRequest =
                ListCustomProtectionRulesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCustomProtectionRulesConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListCustomProtectionRulesResponse>
                transformer = ListCustomProtectionRulesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "ListCustomProtectionRules",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CustomProtectionRule/ListCustomProtectionRules");
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
    public ListEdgeSubnetsResponse listEdgeSubnets(ListEdgeSubnetsRequest request) {
        LOG.trace("Called listEdgeSubnets");
        final ListEdgeSubnetsRequest interceptedRequest =
                ListEdgeSubnetsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListEdgeSubnetsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListEdgeSubnetsResponse>
                transformer = ListEdgeSubnetsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "ListEdgeSubnets",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/EdgeSubnet/ListEdgeSubnets");
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
    public ListGoodBotsResponse listGoodBots(ListGoodBotsRequest request) {
        LOG.trace("Called listGoodBots");
        final ListGoodBotsRequest interceptedRequest =
                ListGoodBotsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListGoodBotsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListGoodBotsResponse>
                transformer = ListGoodBotsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "ListGoodBots",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/GoodBot/ListGoodBots");
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
    public ListProtectionRulesResponse listProtectionRules(ListProtectionRulesRequest request) {
        LOG.trace("Called listProtectionRules");
        final ListProtectionRulesRequest interceptedRequest =
                ListProtectionRulesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListProtectionRulesConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListProtectionRulesResponse>
                transformer = ListProtectionRulesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "ListProtectionRules",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/ProtectionRule/ListProtectionRules");
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
    public ListRecommendationsResponse listRecommendations(ListRecommendationsRequest request) {
        LOG.trace("Called listRecommendations");
        final ListRecommendationsRequest interceptedRequest =
                ListRecommendationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRecommendationsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListRecommendationsResponse>
                transformer = ListRecommendationsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "ListRecommendations",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Recommendation/ListRecommendations");
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
    public ListThreatFeedsResponse listThreatFeeds(ListThreatFeedsRequest request) {
        LOG.trace("Called listThreatFeeds");
        final ListThreatFeedsRequest interceptedRequest =
                ListThreatFeedsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListThreatFeedsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListThreatFeedsResponse>
                transformer = ListThreatFeedsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "ListThreatFeeds",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/ThreatFeed/ListThreatFeeds");
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
    public ListWaasPoliciesResponse listWaasPolicies(ListWaasPoliciesRequest request) {
        LOG.trace("Called listWaasPolicies");
        final ListWaasPoliciesRequest interceptedRequest =
                ListWaasPoliciesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWaasPoliciesConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWaasPoliciesResponse>
                transformer = ListWaasPoliciesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "ListWaasPolicies",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WaasPolicy/ListWaasPolicies");
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
    public ListWaasPolicyCustomProtectionRulesResponse listWaasPolicyCustomProtectionRules(
            ListWaasPolicyCustomProtectionRulesRequest request) {
        LOG.trace("Called listWaasPolicyCustomProtectionRules");
        final ListWaasPolicyCustomProtectionRulesRequest interceptedRequest =
                ListWaasPolicyCustomProtectionRulesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWaasPolicyCustomProtectionRulesConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListWaasPolicyCustomProtectionRulesResponse>
                transformer = ListWaasPolicyCustomProtectionRulesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "ListWaasPolicyCustomProtectionRules",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CustomProtectionRule/ListWaasPolicyCustomProtectionRules");
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
    public ListWafBlockedRequestsResponse listWafBlockedRequests(
            ListWafBlockedRequestsRequest request) {
        LOG.trace("Called listWafBlockedRequests");
        final ListWafBlockedRequestsRequest interceptedRequest =
                ListWafBlockedRequestsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWafBlockedRequestsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWafBlockedRequestsResponse>
                transformer = ListWafBlockedRequestsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "ListWafBlockedRequests",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WafBlockedRequest/ListWafBlockedRequests");
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
    public ListWafLogsResponse listWafLogs(ListWafLogsRequest request) {
        LOG.trace("Called listWafLogs");
        final ListWafLogsRequest interceptedRequest =
                ListWafLogsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWafLogsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWafLogsResponse>
                transformer = ListWafLogsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "ListWafLogs",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WafLog/ListWafLogs");
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
    public ListWafRequestsResponse listWafRequests(ListWafRequestsRequest request) {
        LOG.trace("Called listWafRequests");
        final ListWafRequestsRequest interceptedRequest =
                ListWafRequestsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWafRequestsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWafRequestsResponse>
                transformer = ListWafRequestsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "ListWafRequests",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WafRequest/ListWafRequests");
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
    public ListWafTrafficResponse listWafTraffic(ListWafTrafficRequest request) {
        LOG.trace("Called listWafTraffic");
        final ListWafTrafficRequest interceptedRequest =
                ListWafTrafficConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWafTrafficConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWafTrafficResponse>
                transformer = ListWafTrafficConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "ListWafTraffic",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WafTrafficDatum/ListWafTraffic");
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
    public ListWhitelistsResponse listWhitelists(ListWhitelistsRequest request) {
        LOG.trace("Called listWhitelists");
        final ListWhitelistsRequest interceptedRequest =
                ListWhitelistsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWhitelistsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWhitelistsResponse>
                transformer = ListWhitelistsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "ListWhitelists",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Whitelist/ListWhitelists");
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
                "Waas",
                "ListWorkRequests",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WorkRequestSummary/ListWorkRequests");
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
    public PurgeCacheResponse purgeCache(PurgeCacheRequest request) {
        LOG.trace("Called purgeCache");
        final PurgeCacheRequest interceptedRequest = PurgeCacheConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PurgeCacheConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, PurgeCacheResponse> transformer =
                PurgeCacheConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "PurgeCache",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/PurgeCache/PurgeCache");
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
                                                ib, retriedRequest.getPurgeCache(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateAccessRulesResponse updateAccessRules(UpdateAccessRulesRequest request) {
        LOG.trace("Called updateAccessRules");
        final UpdateAccessRulesRequest interceptedRequest =
                UpdateAccessRulesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAccessRulesConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateAccessRulesResponse>
                transformer = UpdateAccessRulesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "UpdateAccessRules",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AccessRule/UpdateAccessRules");
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
                                                retriedRequest.getAccessRules(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateAddressListResponse updateAddressList(UpdateAddressListRequest request) {
        LOG.trace("Called updateAddressList");
        final UpdateAddressListRequest interceptedRequest =
                UpdateAddressListConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateAddressListConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateAddressListResponse>
                transformer = UpdateAddressListConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "UpdateAddressList",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AddressList/UpdateAddressList");
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
                                                retriedRequest.getUpdateAddressListDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateCachingRulesResponse updateCachingRules(UpdateCachingRulesRequest request) {
        LOG.trace("Called updateCachingRules");
        final UpdateCachingRulesRequest interceptedRequest =
                UpdateCachingRulesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCachingRulesConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateCachingRulesResponse>
                transformer = UpdateCachingRulesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "UpdateCachingRules",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CachingRule/UpdateCachingRules");
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
                                                retriedRequest.getCachingRulesDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateCaptchasResponse updateCaptchas(UpdateCaptchasRequest request) {
        LOG.trace("Called updateCaptchas");
        final UpdateCaptchasRequest interceptedRequest =
                UpdateCaptchasConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCaptchasConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateCaptchasResponse>
                transformer = UpdateCaptchasConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "UpdateCaptchas",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Captcha/UpdateCaptchas");
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
                                                ib, retriedRequest.getCaptchas(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateCertificateResponse updateCertificate(UpdateCertificateRequest request) {
        LOG.trace("Called updateCertificate");
        final UpdateCertificateRequest interceptedRequest =
                UpdateCertificateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCertificateConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateCertificateResponse>
                transformer = UpdateCertificateConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "UpdateCertificate",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Certificate/UpdateCertificate");
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
                                                retriedRequest.getUpdateCertificateDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateCustomProtectionRuleResponse updateCustomProtectionRule(
            UpdateCustomProtectionRuleRequest request) {
        LOG.trace("Called updateCustomProtectionRule");
        final UpdateCustomProtectionRuleRequest interceptedRequest =
                UpdateCustomProtectionRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateCustomProtectionRuleConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateCustomProtectionRuleResponse>
                transformer = UpdateCustomProtectionRuleConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "UpdateCustomProtectionRule",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CustomProtectionRule/UpdateCustomProtectionRule");
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
                                                        .getUpdateCustomProtectionRuleDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateDeviceFingerprintChallengeResponse updateDeviceFingerprintChallenge(
            UpdateDeviceFingerprintChallengeRequest request) {
        LOG.trace("Called updateDeviceFingerprintChallenge");
        final UpdateDeviceFingerprintChallengeRequest interceptedRequest =
                UpdateDeviceFingerprintChallengeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateDeviceFingerprintChallengeConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateDeviceFingerprintChallengeResponse>
                transformer = UpdateDeviceFingerprintChallengeConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "UpdateDeviceFingerprintChallenge",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/DeviceFingerprintChallenge/UpdateDeviceFingerprintChallenge");
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
                                                        .getUpdateDeviceFingerprintChallengeDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateGoodBotsResponse updateGoodBots(UpdateGoodBotsRequest request) {
        LOG.trace("Called updateGoodBots");
        final UpdateGoodBotsRequest interceptedRequest =
                UpdateGoodBotsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateGoodBotsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateGoodBotsResponse>
                transformer = UpdateGoodBotsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "UpdateGoodBots",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/GoodBot/UpdateGoodBots");
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
                                                ib, retriedRequest.getGoodBots(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateHumanInteractionChallengeResponse updateHumanInteractionChallenge(
            UpdateHumanInteractionChallengeRequest request) {
        LOG.trace("Called updateHumanInteractionChallenge");
        final UpdateHumanInteractionChallengeRequest interceptedRequest =
                UpdateHumanInteractionChallengeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateHumanInteractionChallengeConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateHumanInteractionChallengeResponse>
                transformer = UpdateHumanInteractionChallengeConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "UpdateHumanInteractionChallenge",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/HumanInteractionChallenge/UpdateHumanInteractionChallenge");
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
                                                        .getUpdateHumanInteractionChallengeDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateJsChallengeResponse updateJsChallenge(UpdateJsChallengeRequest request) {
        LOG.trace("Called updateJsChallenge");
        final UpdateJsChallengeRequest interceptedRequest =
                UpdateJsChallengeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateJsChallengeConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateJsChallengeResponse>
                transformer = UpdateJsChallengeConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "UpdateJsChallenge",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/JsChallenge/UpdateJsChallenge");
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
                                                retriedRequest.getUpdateJsChallengeDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdatePolicyConfigResponse updatePolicyConfig(UpdatePolicyConfigRequest request) {
        LOG.trace("Called updatePolicyConfig");
        final UpdatePolicyConfigRequest interceptedRequest =
                UpdatePolicyConfigConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdatePolicyConfigConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdatePolicyConfigResponse>
                transformer = UpdatePolicyConfigConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "UpdatePolicyConfig",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/PolicyConfig/UpdatePolicyConfig");
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
                                                retriedRequest.getUpdatePolicyConfigDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateProtectionRulesResponse updateProtectionRules(
            UpdateProtectionRulesRequest request) {
        LOG.trace("Called updateProtectionRules");
        final UpdateProtectionRulesRequest interceptedRequest =
                UpdateProtectionRulesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateProtectionRulesConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateProtectionRulesResponse>
                transformer = UpdateProtectionRulesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "UpdateProtectionRules",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/ProtectionRule/UpdateProtectionRules");
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
                                                retriedRequest.getProtectionRules(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateProtectionSettingsResponse updateProtectionSettings(
            UpdateProtectionSettingsRequest request) {
        LOG.trace("Called updateProtectionSettings");
        final UpdateProtectionSettingsRequest interceptedRequest =
                UpdateProtectionSettingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateProtectionSettingsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateProtectionSettingsResponse>
                transformer = UpdateProtectionSettingsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "UpdateProtectionSettings",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/ProtectionSettings/UpdateProtectionSettings");
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
                                                retriedRequest.getUpdateProtectionSettingsDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateThreatFeedsResponse updateThreatFeeds(UpdateThreatFeedsRequest request) {
        LOG.trace("Called updateThreatFeeds");
        final UpdateThreatFeedsRequest interceptedRequest =
                UpdateThreatFeedsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateThreatFeedsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateThreatFeedsResponse>
                transformer = UpdateThreatFeedsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "UpdateThreatFeeds",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/ThreatFeed/UpdateThreatFeeds");
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
                                                retriedRequest.getThreatFeeds(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateWaasPolicyResponse updateWaasPolicy(UpdateWaasPolicyRequest request) {
        LOG.trace("Called updateWaasPolicy");
        final UpdateWaasPolicyRequest interceptedRequest =
                UpdateWaasPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateWaasPolicyConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateWaasPolicyResponse>
                transformer = UpdateWaasPolicyConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "UpdateWaasPolicy",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WaasPolicy/UpdateWaasPolicy");
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
                                                retriedRequest.getUpdateWaasPolicyDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateWaasPolicyCustomProtectionRulesResponse updateWaasPolicyCustomProtectionRules(
            UpdateWaasPolicyCustomProtectionRulesRequest request) {
        LOG.trace("Called updateWaasPolicyCustomProtectionRules");
        final UpdateWaasPolicyCustomProtectionRulesRequest interceptedRequest =
                UpdateWaasPolicyCustomProtectionRulesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateWaasPolicyCustomProtectionRulesConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateWaasPolicyCustomProtectionRulesResponse>
                transformer = UpdateWaasPolicyCustomProtectionRulesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "UpdateWaasPolicyCustomProtectionRules",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/CustomProtectionRule/UpdateWaasPolicyCustomProtectionRules");
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
                                                        .getUpdateCustomProtectionRulesDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateWafAddressRateLimitingResponse updateWafAddressRateLimiting(
            UpdateWafAddressRateLimitingRequest request) {
        LOG.trace("Called updateWafAddressRateLimiting");
        final UpdateWafAddressRateLimitingRequest interceptedRequest =
                UpdateWafAddressRateLimitingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateWafAddressRateLimitingConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateWafAddressRateLimitingResponse>
                transformer = UpdateWafAddressRateLimitingConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "UpdateWafAddressRateLimiting",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/AddressRateLimiting/UpdateWafAddressRateLimiting");
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
                                                        .getUpdateWafAddressRateLimitingDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateWafConfigResponse updateWafConfig(UpdateWafConfigRequest request) {
        LOG.trace("Called updateWafConfig");
        final UpdateWafConfigRequest interceptedRequest =
                UpdateWafConfigConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateWafConfigConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateWafConfigResponse>
                transformer = UpdateWafConfigConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "UpdateWafConfig",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/WafConfig/UpdateWafConfig");
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
                                                retriedRequest.getUpdateWafConfigDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateWhitelistsResponse updateWhitelists(UpdateWhitelistsRequest request) {
        LOG.trace("Called updateWhitelists");
        final UpdateWhitelistsRequest interceptedRequest =
                UpdateWhitelistsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateWhitelistsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateWhitelistsResponse>
                transformer = UpdateWhitelistsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "Waas",
                "UpdateWhitelists",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/waas/20181116/Whitelist/UpdateWhitelists");
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
                                                ib, retriedRequest.getWhitelists(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public WaasWaiters getWaiters() {
        return waiters;
    }

    @Override
    public WaasPaginators getPaginators() {
        return paginators;
    }
}
