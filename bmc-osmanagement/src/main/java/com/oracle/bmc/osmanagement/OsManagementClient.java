/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement;

import com.oracle.bmc.osmanagement.internal.http.*;
import com.oracle.bmc.osmanagement.requests.*;
import com.oracle.bmc.osmanagement.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@lombok.extern.slf4j.Slf4j
public class OsManagementClient implements OsManagement {
    /**
     * Service instance for OsManagement.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("OSMANAGEMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://osms.{region}.oci.{secondLevelDomain}")
                    .build();
    // attempt twice if it's instance principals, immediately failures will try to refresh the token
    private static final int MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS = 2;

    private final OsManagementWaiters waiters;

    private final OsManagementPaginators paginators;

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
    public OsManagementClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public OsManagementClient(
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
    public OsManagementClient(
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
    public OsManagementClient(
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
    public OsManagementClient(
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
    public OsManagementClient(
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
    public OsManagementClient(
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
    public OsManagementClient(
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
    protected OsManagementClient(
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
                                    .setNameFormat("OsManagement-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new OsManagementWaiters(executorService, this);

        this.paginators = new OsManagementPaginators(this);

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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OsManagementClient> {
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
        public OsManagementClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new OsManagementClient(
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
    public AddPackagesToSoftwareSourceResponse addPackagesToSoftwareSource(
            AddPackagesToSoftwareSourceRequest request) {
        LOG.trace("Called addPackagesToSoftwareSource");
        final AddPackagesToSoftwareSourceRequest interceptedRequest =
                AddPackagesToSoftwareSourceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AddPackagesToSoftwareSourceConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, AddPackagesToSoftwareSourceResponse>
                transformer = AddPackagesToSoftwareSourceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "AddPackagesToSoftwareSource",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/AddPackagesToSoftwareSource");
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
                                                        .getAddPackagesToSoftwareSourceDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public AttachChildSoftwareSourceToManagedInstanceResponse
            attachChildSoftwareSourceToManagedInstance(
                    AttachChildSoftwareSourceToManagedInstanceRequest request) {
        LOG.trace("Called attachChildSoftwareSourceToManagedInstance");
        final AttachChildSoftwareSourceToManagedInstanceRequest interceptedRequest =
                AttachChildSoftwareSourceToManagedInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AttachChildSoftwareSourceToManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        AttachChildSoftwareSourceToManagedInstanceResponse>
                transformer = AttachChildSoftwareSourceToManagedInstanceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "AttachChildSoftwareSourceToManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/AttachChildSoftwareSourceToManagedInstance");
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
                                                        .getAttachChildSoftwareSourceToManagedInstanceDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public AttachManagedInstanceToManagedInstanceGroupResponse
            attachManagedInstanceToManagedInstanceGroup(
                    AttachManagedInstanceToManagedInstanceGroupRequest request) {
        LOG.trace("Called attachManagedInstanceToManagedInstanceGroup");
        final AttachManagedInstanceToManagedInstanceGroupRequest interceptedRequest =
                AttachManagedInstanceToManagedInstanceGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AttachManagedInstanceToManagedInstanceGroupConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        AttachManagedInstanceToManagedInstanceGroupResponse>
                transformer = AttachManagedInstanceToManagedInstanceGroupConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "AttachManagedInstanceToManagedInstanceGroup",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroup/AttachManagedInstanceToManagedInstanceGroup");
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
    public AttachParentSoftwareSourceToManagedInstanceResponse
            attachParentSoftwareSourceToManagedInstance(
                    AttachParentSoftwareSourceToManagedInstanceRequest request) {
        LOG.trace("Called attachParentSoftwareSourceToManagedInstance");
        final AttachParentSoftwareSourceToManagedInstanceRequest interceptedRequest =
                AttachParentSoftwareSourceToManagedInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AttachParentSoftwareSourceToManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        AttachParentSoftwareSourceToManagedInstanceResponse>
                transformer = AttachParentSoftwareSourceToManagedInstanceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "AttachParentSoftwareSourceToManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/AttachParentSoftwareSourceToManagedInstance");
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
                                                        .getAttachParentSoftwareSourceToManagedInstanceDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeManagedInstanceGroupCompartmentResponse changeManagedInstanceGroupCompartment(
            ChangeManagedInstanceGroupCompartmentRequest request) {
        LOG.trace("Called changeManagedInstanceGroupCompartment");
        final ChangeManagedInstanceGroupCompartmentRequest interceptedRequest =
                ChangeManagedInstanceGroupCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeManagedInstanceGroupCompartmentConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeManagedInstanceGroupCompartmentResponse>
                transformer = ChangeManagedInstanceGroupCompartmentConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ChangeManagedInstanceGroupCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroup/ChangeManagedInstanceGroupCompartment");
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
                                                        .getChangeManagedInstanceGroupCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeScheduledJobCompartmentResponse changeScheduledJobCompartment(
            ChangeScheduledJobCompartmentRequest request) {
        LOG.trace("Called changeScheduledJobCompartment");
        final ChangeScheduledJobCompartmentRequest interceptedRequest =
                ChangeScheduledJobCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeScheduledJobCompartmentConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeScheduledJobCompartmentResponse>
                transformer = ChangeScheduledJobCompartmentConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ChangeScheduledJobCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/ChangeScheduledJobCompartment");
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
                                                        .getChangeScheduledJobCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public ChangeSoftwareSourceCompartmentResponse changeSoftwareSourceCompartment(
            ChangeSoftwareSourceCompartmentRequest request) {
        LOG.trace("Called changeSoftwareSourceCompartment");
        final ChangeSoftwareSourceCompartmentRequest interceptedRequest =
                ChangeSoftwareSourceCompartmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ChangeSoftwareSourceCompartmentConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ChangeSoftwareSourceCompartmentResponse>
                transformer = ChangeSoftwareSourceCompartmentConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ChangeSoftwareSourceCompartment",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/ChangeSoftwareSourceCompartment");
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
                                                        .getChangeSoftwareSourceCompartmentDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateManagedInstanceGroupResponse createManagedInstanceGroup(
            CreateManagedInstanceGroupRequest request) {
        LOG.trace("Called createManagedInstanceGroup");
        final CreateManagedInstanceGroupRequest interceptedRequest =
                CreateManagedInstanceGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateManagedInstanceGroupConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateManagedInstanceGroupResponse>
                transformer = CreateManagedInstanceGroupConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "CreateManagedInstanceGroup",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroup/CreateManagedInstanceGroup");
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
                                                        .getCreateManagedInstanceGroupDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateScheduledJobResponse createScheduledJob(CreateScheduledJobRequest request) {
        LOG.trace("Called createScheduledJob");
        final CreateScheduledJobRequest interceptedRequest =
                CreateScheduledJobConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateScheduledJobConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateScheduledJobResponse>
                transformer = CreateScheduledJobConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "CreateScheduledJob",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/CreateScheduledJob");
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
                                                retriedRequest.getCreateScheduledJobDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateSoftwareSourceResponse createSoftwareSource(CreateSoftwareSourceRequest request) {
        LOG.trace("Called createSoftwareSource");
        final CreateSoftwareSourceRequest interceptedRequest =
                CreateSoftwareSourceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSoftwareSourceConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateSoftwareSourceResponse>
                transformer = CreateSoftwareSourceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "CreateSoftwareSource",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/CreateSoftwareSource");
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
                                                retriedRequest.getCreateSoftwareSourceDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteManagedInstanceGroupResponse deleteManagedInstanceGroup(
            DeleteManagedInstanceGroupRequest request) {
        LOG.trace("Called deleteManagedInstanceGroup");
        final DeleteManagedInstanceGroupRequest interceptedRequest =
                DeleteManagedInstanceGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteManagedInstanceGroupConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteManagedInstanceGroupResponse>
                transformer = DeleteManagedInstanceGroupConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "DeleteManagedInstanceGroup",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroup/DeleteManagedInstanceGroup");
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
    public DeleteScheduledJobResponse deleteScheduledJob(DeleteScheduledJobRequest request) {
        LOG.trace("Called deleteScheduledJob");
        final DeleteScheduledJobRequest interceptedRequest =
                DeleteScheduledJobConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteScheduledJobConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteScheduledJobResponse>
                transformer = DeleteScheduledJobConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "DeleteScheduledJob",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/DeleteScheduledJob");
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
    public DeleteSoftwareSourceResponse deleteSoftwareSource(DeleteSoftwareSourceRequest request) {
        LOG.trace("Called deleteSoftwareSource");
        final DeleteSoftwareSourceRequest interceptedRequest =
                DeleteSoftwareSourceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSoftwareSourceConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteSoftwareSourceResponse>
                transformer = DeleteSoftwareSourceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "DeleteSoftwareSource",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/DeleteSoftwareSource");
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
    public DetachChildSoftwareSourceFromManagedInstanceResponse
            detachChildSoftwareSourceFromManagedInstance(
                    DetachChildSoftwareSourceFromManagedInstanceRequest request) {
        LOG.trace("Called detachChildSoftwareSourceFromManagedInstance");
        final DetachChildSoftwareSourceFromManagedInstanceRequest interceptedRequest =
                DetachChildSoftwareSourceFromManagedInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetachChildSoftwareSourceFromManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        DetachChildSoftwareSourceFromManagedInstanceResponse>
                transformer = DetachChildSoftwareSourceFromManagedInstanceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "DetachChildSoftwareSourceFromManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/DetachChildSoftwareSourceFromManagedInstance");
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
                                                        .getDetachChildSoftwareSourceFromManagedInstanceDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DetachManagedInstanceFromManagedInstanceGroupResponse
            detachManagedInstanceFromManagedInstanceGroup(
                    DetachManagedInstanceFromManagedInstanceGroupRequest request) {
        LOG.trace("Called detachManagedInstanceFromManagedInstanceGroup");
        final DetachManagedInstanceFromManagedInstanceGroupRequest interceptedRequest =
                DetachManagedInstanceFromManagedInstanceGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetachManagedInstanceFromManagedInstanceGroupConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        DetachManagedInstanceFromManagedInstanceGroupResponse>
                transformer = DetachManagedInstanceFromManagedInstanceGroupConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "DetachManagedInstanceFromManagedInstanceGroup",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroup/DetachManagedInstanceFromManagedInstanceGroup");
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
    public DetachParentSoftwareSourceFromManagedInstanceResponse
            detachParentSoftwareSourceFromManagedInstance(
                    DetachParentSoftwareSourceFromManagedInstanceRequest request) {
        LOG.trace("Called detachParentSoftwareSourceFromManagedInstance");
        final DetachParentSoftwareSourceFromManagedInstanceRequest interceptedRequest =
                DetachParentSoftwareSourceFromManagedInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetachParentSoftwareSourceFromManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        DetachParentSoftwareSourceFromManagedInstanceResponse>
                transformer = DetachParentSoftwareSourceFromManagedInstanceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "DetachParentSoftwareSourceFromManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/DetachParentSoftwareSourceFromManagedInstance");
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
                                                        .getDetachParentSoftwareSourceFromManagedInstanceDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public GetErratumResponse getErratum(GetErratumRequest request) {
        LOG.trace("Called getErratum");
        final GetErratumRequest interceptedRequest = GetErratumConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetErratumConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetErratumResponse> transformer =
                GetErratumConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "GetErratum",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/Erratum/GetErratum");
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
    public GetManagedInstanceResponse getManagedInstance(GetManagedInstanceRequest request) {
        LOG.trace("Called getManagedInstance");
        final GetManagedInstanceRequest interceptedRequest =
                GetManagedInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetManagedInstanceConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetManagedInstanceResponse>
                transformer = GetManagedInstanceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "GetManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/GetManagedInstance");
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
    public GetManagedInstanceGroupResponse getManagedInstanceGroup(
            GetManagedInstanceGroupRequest request) {
        LOG.trace("Called getManagedInstanceGroup");
        final GetManagedInstanceGroupRequest interceptedRequest =
                GetManagedInstanceGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetManagedInstanceGroupConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetManagedInstanceGroupResponse>
                transformer = GetManagedInstanceGroupConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "GetManagedInstanceGroup",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroup/GetManagedInstanceGroup");
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
    public GetScheduledJobResponse getScheduledJob(GetScheduledJobRequest request) {
        LOG.trace("Called getScheduledJob");
        final GetScheduledJobRequest interceptedRequest =
                GetScheduledJobConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetScheduledJobConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetScheduledJobResponse>
                transformer = GetScheduledJobConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "GetScheduledJob",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/GetScheduledJob");
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
    public GetSoftwarePackageResponse getSoftwarePackage(GetSoftwarePackageRequest request) {
        LOG.trace("Called getSoftwarePackage");
        final GetSoftwarePackageRequest interceptedRequest =
                GetSoftwarePackageConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSoftwarePackageConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetSoftwarePackageResponse>
                transformer = GetSoftwarePackageConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "GetSoftwarePackage",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/GetSoftwarePackage");
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
    public GetSoftwareSourceResponse getSoftwareSource(GetSoftwareSourceRequest request) {
        LOG.trace("Called getSoftwareSource");
        final GetSoftwareSourceRequest interceptedRequest =
                GetSoftwareSourceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSoftwareSourceConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetSoftwareSourceResponse>
                transformer = GetSoftwareSourceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "GetSoftwareSource",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/GetSoftwareSource");
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
    public GetWindowsUpdateResponse getWindowsUpdate(GetWindowsUpdateRequest request) {
        LOG.trace("Called getWindowsUpdate");
        final GetWindowsUpdateRequest interceptedRequest =
                GetWindowsUpdateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetWindowsUpdateConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetWindowsUpdateResponse>
                transformer = GetWindowsUpdateConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "GetWindowsUpdate",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/WindowsUpdate/GetWindowsUpdate");
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
                "OsManagement",
                "GetWorkRequest",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/WorkRequest/GetWorkRequest");
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
    public InstallAllPackageUpdatesOnManagedInstanceResponse
            installAllPackageUpdatesOnManagedInstance(
                    InstallAllPackageUpdatesOnManagedInstanceRequest request) {
        LOG.trace("Called installAllPackageUpdatesOnManagedInstance");
        final InstallAllPackageUpdatesOnManagedInstanceRequest interceptedRequest =
                InstallAllPackageUpdatesOnManagedInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                InstallAllPackageUpdatesOnManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        InstallAllPackageUpdatesOnManagedInstanceResponse>
                transformer = InstallAllPackageUpdatesOnManagedInstanceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "InstallAllPackageUpdatesOnManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/InstallAllPackageUpdatesOnManagedInstance");
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
    public InstallAllUpdatesOnManagedInstanceGroupResponse installAllUpdatesOnManagedInstanceGroup(
            InstallAllUpdatesOnManagedInstanceGroupRequest request) {
        LOG.trace("Called installAllUpdatesOnManagedInstanceGroup");
        final InstallAllUpdatesOnManagedInstanceGroupRequest interceptedRequest =
                InstallAllUpdatesOnManagedInstanceGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                InstallAllUpdatesOnManagedInstanceGroupConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, InstallAllUpdatesOnManagedInstanceGroupResponse>
                transformer = InstallAllUpdatesOnManagedInstanceGroupConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "InstallAllUpdatesOnManagedInstanceGroup",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroup/InstallAllUpdatesOnManagedInstanceGroup");
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
    public InstallAllWindowsUpdatesOnManagedInstanceResponse
            installAllWindowsUpdatesOnManagedInstance(
                    InstallAllWindowsUpdatesOnManagedInstanceRequest request) {
        LOG.trace("Called installAllWindowsUpdatesOnManagedInstance");
        final InstallAllWindowsUpdatesOnManagedInstanceRequest interceptedRequest =
                InstallAllWindowsUpdatesOnManagedInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                InstallAllWindowsUpdatesOnManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        InstallAllWindowsUpdatesOnManagedInstanceResponse>
                transformer = InstallAllWindowsUpdatesOnManagedInstanceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "InstallAllWindowsUpdatesOnManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/InstallAllWindowsUpdatesOnManagedInstance");
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
    public InstallPackageOnManagedInstanceResponse installPackageOnManagedInstance(
            InstallPackageOnManagedInstanceRequest request) {
        LOG.trace("Called installPackageOnManagedInstance");
        final InstallPackageOnManagedInstanceRequest interceptedRequest =
                InstallPackageOnManagedInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                InstallPackageOnManagedInstanceConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, InstallPackageOnManagedInstanceResponse>
                transformer = InstallPackageOnManagedInstanceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "InstallPackageOnManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/InstallPackageOnManagedInstance");
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
    public InstallPackageUpdateOnManagedInstanceResponse installPackageUpdateOnManagedInstance(
            InstallPackageUpdateOnManagedInstanceRequest request) {
        LOG.trace("Called installPackageUpdateOnManagedInstance");
        final InstallPackageUpdateOnManagedInstanceRequest interceptedRequest =
                InstallPackageUpdateOnManagedInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                InstallPackageUpdateOnManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, InstallPackageUpdateOnManagedInstanceResponse>
                transformer = InstallPackageUpdateOnManagedInstanceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "InstallPackageUpdateOnManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/InstallPackageUpdateOnManagedInstance");
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
    public InstallWindowsUpdateOnManagedInstanceResponse installWindowsUpdateOnManagedInstance(
            InstallWindowsUpdateOnManagedInstanceRequest request) {
        LOG.trace("Called installWindowsUpdateOnManagedInstance");
        final InstallWindowsUpdateOnManagedInstanceRequest interceptedRequest =
                InstallWindowsUpdateOnManagedInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                InstallWindowsUpdateOnManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, InstallWindowsUpdateOnManagedInstanceResponse>
                transformer = InstallWindowsUpdateOnManagedInstanceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "InstallWindowsUpdateOnManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/InstallWindowsUpdateOnManagedInstance");
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
    public ListAvailablePackagesForManagedInstanceResponse listAvailablePackagesForManagedInstance(
            ListAvailablePackagesForManagedInstanceRequest request) {
        LOG.trace("Called listAvailablePackagesForManagedInstance");
        final ListAvailablePackagesForManagedInstanceRequest interceptedRequest =
                ListAvailablePackagesForManagedInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAvailablePackagesForManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAvailablePackagesForManagedInstanceResponse>
                transformer = ListAvailablePackagesForManagedInstanceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListAvailablePackagesForManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListAvailablePackagesForManagedInstance");
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
    public ListAvailableSoftwareSourcesForManagedInstanceResponse
            listAvailableSoftwareSourcesForManagedInstance(
                    ListAvailableSoftwareSourcesForManagedInstanceRequest request) {
        LOG.trace("Called listAvailableSoftwareSourcesForManagedInstance");
        final ListAvailableSoftwareSourcesForManagedInstanceRequest interceptedRequest =
                ListAvailableSoftwareSourcesForManagedInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAvailableSoftwareSourcesForManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ListAvailableSoftwareSourcesForManagedInstanceResponse>
                transformer =
                        ListAvailableSoftwareSourcesForManagedInstanceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListAvailableSoftwareSourcesForManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListAvailableSoftwareSourcesForManagedInstance");
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
    public ListAvailableUpdatesForManagedInstanceResponse listAvailableUpdatesForManagedInstance(
            ListAvailableUpdatesForManagedInstanceRequest request) {
        LOG.trace("Called listAvailableUpdatesForManagedInstance");
        final ListAvailableUpdatesForManagedInstanceRequest interceptedRequest =
                ListAvailableUpdatesForManagedInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAvailableUpdatesForManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListAvailableUpdatesForManagedInstanceResponse>
                transformer = ListAvailableUpdatesForManagedInstanceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListAvailableUpdatesForManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListAvailableUpdatesForManagedInstance");
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
    public ListAvailableWindowsUpdatesForManagedInstanceResponse
            listAvailableWindowsUpdatesForManagedInstance(
                    ListAvailableWindowsUpdatesForManagedInstanceRequest request) {
        LOG.trace("Called listAvailableWindowsUpdatesForManagedInstance");
        final ListAvailableWindowsUpdatesForManagedInstanceRequest interceptedRequest =
                ListAvailableWindowsUpdatesForManagedInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAvailableWindowsUpdatesForManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ListAvailableWindowsUpdatesForManagedInstanceResponse>
                transformer = ListAvailableWindowsUpdatesForManagedInstanceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListAvailableWindowsUpdatesForManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListAvailableWindowsUpdatesForManagedInstance");
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
    public ListErrataResponse listErrata(ListErrataRequest request) {
        LOG.trace("Called listErrata");
        final ListErrataRequest interceptedRequest = ListErrataConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListErrataConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListErrataResponse> transformer =
                ListErrataConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListErrata",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ErratumSummary/ListErrata");
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
    public ListManagedInstanceErrataResponse listManagedInstanceErrata(
            ListManagedInstanceErrataRequest request) {
        LOG.trace("Called listManagedInstanceErrata");
        final ListManagedInstanceErrataRequest interceptedRequest =
                ListManagedInstanceErrataConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedInstanceErrataConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListManagedInstanceErrataResponse>
                transformer = ListManagedInstanceErrataConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListManagedInstanceErrata",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListManagedInstanceErrata");
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
    public ListManagedInstanceGroupsResponse listManagedInstanceGroups(
            ListManagedInstanceGroupsRequest request) {
        LOG.trace("Called listManagedInstanceGroups");
        final ListManagedInstanceGroupsRequest interceptedRequest =
                ListManagedInstanceGroupsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedInstanceGroupsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListManagedInstanceGroupsResponse>
                transformer = ListManagedInstanceGroupsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListManagedInstanceGroups",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroupSummary/ListManagedInstanceGroups");
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
    public ListManagedInstancesResponse listManagedInstances(ListManagedInstancesRequest request) {
        LOG.trace("Called listManagedInstances");
        final ListManagedInstancesRequest interceptedRequest =
                ListManagedInstancesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListManagedInstancesConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListManagedInstancesResponse>
                transformer = ListManagedInstancesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListManagedInstances",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceSummary/ListManagedInstances");
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
    public ListPackagesInstalledOnManagedInstanceResponse listPackagesInstalledOnManagedInstance(
            ListPackagesInstalledOnManagedInstanceRequest request) {
        LOG.trace("Called listPackagesInstalledOnManagedInstance");
        final ListPackagesInstalledOnManagedInstanceRequest interceptedRequest =
                ListPackagesInstalledOnManagedInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPackagesInstalledOnManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListPackagesInstalledOnManagedInstanceResponse>
                transformer = ListPackagesInstalledOnManagedInstanceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListPackagesInstalledOnManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListPackagesInstalledOnManagedInstance");
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
    public ListScheduledJobsResponse listScheduledJobs(ListScheduledJobsRequest request) {
        LOG.trace("Called listScheduledJobs");
        final ListScheduledJobsRequest interceptedRequest =
                ListScheduledJobsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListScheduledJobsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListScheduledJobsResponse>
                transformer = ListScheduledJobsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListScheduledJobs",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/ListScheduledJobs");
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
    public ListSoftwareSourcePackagesResponse listSoftwareSourcePackages(
            ListSoftwareSourcePackagesRequest request) {
        LOG.trace("Called listSoftwareSourcePackages");
        final ListSoftwareSourcePackagesRequest interceptedRequest =
                ListSoftwareSourcePackagesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSoftwareSourcePackagesConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListSoftwareSourcePackagesResponse>
                transformer = ListSoftwareSourcePackagesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListSoftwareSourcePackages",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/ListSoftwareSourcePackages");
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
    public ListSoftwareSourcesResponse listSoftwareSources(ListSoftwareSourcesRequest request) {
        LOG.trace("Called listSoftwareSources");
        final ListSoftwareSourcesRequest interceptedRequest =
                ListSoftwareSourcesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSoftwareSourcesConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListSoftwareSourcesResponse>
                transformer = ListSoftwareSourcesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListSoftwareSources",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSourceSummary/ListSoftwareSources");
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
    public ListUpcomingScheduledJobsResponse listUpcomingScheduledJobs(
            ListUpcomingScheduledJobsRequest request) {
        LOG.trace("Called listUpcomingScheduledJobs");
        final ListUpcomingScheduledJobsRequest interceptedRequest =
                ListUpcomingScheduledJobsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUpcomingScheduledJobsConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListUpcomingScheduledJobsResponse>
                transformer = ListUpcomingScheduledJobsConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListUpcomingScheduledJobs",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/ListUpcomingScheduledJobs");
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
    public ListWindowsUpdatesResponse listWindowsUpdates(ListWindowsUpdatesRequest request) {
        LOG.trace("Called listWindowsUpdates");
        final ListWindowsUpdatesRequest interceptedRequest =
                ListWindowsUpdatesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWindowsUpdatesConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListWindowsUpdatesResponse>
                transformer = ListWindowsUpdatesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListWindowsUpdates",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/WindowsUpdateSummary/ListWindowsUpdates");
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
    public ListWindowsUpdatesInstalledOnManagedInstanceResponse
            listWindowsUpdatesInstalledOnManagedInstance(
                    ListWindowsUpdatesInstalledOnManagedInstanceRequest request) {
        LOG.trace("Called listWindowsUpdatesInstalledOnManagedInstance");
        final ListWindowsUpdatesInstalledOnManagedInstanceRequest interceptedRequest =
                ListWindowsUpdatesInstalledOnManagedInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListWindowsUpdatesInstalledOnManagedInstanceConverter.fromRequest(
                        client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        ListWindowsUpdatesInstalledOnManagedInstanceResponse>
                transformer = ListWindowsUpdatesInstalledOnManagedInstanceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "ListWindowsUpdatesInstalledOnManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/ListWindowsUpdatesInstalledOnManagedInstance");
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
                "OsManagement",
                "ListWorkRequestErrors",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/WorkRequest/ListWorkRequestErrors");
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
                "OsManagement",
                "ListWorkRequestLogs",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/WorkRequest/ListWorkRequestLogs");
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
                "OsManagement",
                "ListWorkRequests",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/WorkRequestSummary/ListWorkRequests");
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
    public RemovePackageFromManagedInstanceResponse removePackageFromManagedInstance(
            RemovePackageFromManagedInstanceRequest request) {
        LOG.trace("Called removePackageFromManagedInstance");
        final RemovePackageFromManagedInstanceRequest interceptedRequest =
                RemovePackageFromManagedInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemovePackageFromManagedInstanceConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, RemovePackageFromManagedInstanceResponse>
                transformer = RemovePackageFromManagedInstanceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "RemovePackageFromManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstance/RemovePackageFromManagedInstance");
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
    public RemovePackagesFromSoftwareSourceResponse removePackagesFromSoftwareSource(
            RemovePackagesFromSoftwareSourceRequest request) {
        LOG.trace("Called removePackagesFromSoftwareSource");
        final RemovePackagesFromSoftwareSourceRequest interceptedRequest =
                RemovePackagesFromSoftwareSourceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RemovePackagesFromSoftwareSourceConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, RemovePackagesFromSoftwareSourceResponse>
                transformer = RemovePackagesFromSoftwareSourceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "RemovePackagesFromSoftwareSource",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/RemovePackagesFromSoftwareSource");
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
                                                        .getRemovePackagesFromSoftwareSourceDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public RunScheduledJobNowResponse runScheduledJobNow(RunScheduledJobNowRequest request) {
        LOG.trace("Called runScheduledJobNow");
        final RunScheduledJobNowRequest interceptedRequest =
                RunScheduledJobNowConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RunScheduledJobNowConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, RunScheduledJobNowResponse>
                transformer = RunScheduledJobNowConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "RunScheduledJobNow",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/RunScheduledJobNow");
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
    public SearchSoftwarePackagesResponse searchSoftwarePackages(
            SearchSoftwarePackagesRequest request) {
        LOG.trace("Called searchSoftwarePackages");
        final SearchSoftwarePackagesRequest interceptedRequest =
                SearchSoftwarePackagesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchSoftwarePackagesConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, SearchSoftwarePackagesResponse>
                transformer = SearchSoftwarePackagesConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "SearchSoftwarePackages",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/SearchSoftwarePackages");
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
    public SkipNextScheduledJobExecutionResponse skipNextScheduledJobExecution(
            SkipNextScheduledJobExecutionRequest request) {
        LOG.trace("Called skipNextScheduledJobExecution");
        final SkipNextScheduledJobExecutionRequest interceptedRequest =
                SkipNextScheduledJobExecutionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SkipNextScheduledJobExecutionConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, SkipNextScheduledJobExecutionResponse>
                transformer = SkipNextScheduledJobExecutionConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "SkipNextScheduledJobExecution",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/SkipNextScheduledJobExecution");
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
    public UpdateManagedInstanceResponse updateManagedInstance(
            UpdateManagedInstanceRequest request) {
        LOG.trace("Called updateManagedInstance");
        final UpdateManagedInstanceRequest interceptedRequest =
                UpdateManagedInstanceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateManagedInstanceConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateManagedInstanceResponse>
                transformer = UpdateManagedInstanceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "UpdateManagedInstance",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/UpdateManagedInstanceDetails/UpdateManagedInstance");
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
                                                retriedRequest.getUpdateManagedInstanceDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateManagedInstanceGroupResponse updateManagedInstanceGroup(
            UpdateManagedInstanceGroupRequest request) {
        LOG.trace("Called updateManagedInstanceGroup");
        final UpdateManagedInstanceGroupRequest interceptedRequest =
                UpdateManagedInstanceGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateManagedInstanceGroupConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateManagedInstanceGroupResponse>
                transformer = UpdateManagedInstanceGroupConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "UpdateManagedInstanceGroup",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ManagedInstanceGroup/UpdateManagedInstanceGroup");
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
                                                        .getUpdateManagedInstanceGroupDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateScheduledJobResponse updateScheduledJob(UpdateScheduledJobRequest request) {
        LOG.trace("Called updateScheduledJob");
        final UpdateScheduledJobRequest interceptedRequest =
                UpdateScheduledJobConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateScheduledJobConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateScheduledJobResponse>
                transformer = UpdateScheduledJobConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "UpdateScheduledJob",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/ScheduledJob/UpdateScheduledJob");
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
                                                retriedRequest.getUpdateScheduledJobDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public UpdateSoftwareSourceResponse updateSoftwareSource(UpdateSoftwareSourceRequest request) {
        LOG.trace("Called updateSoftwareSource");
        final UpdateSoftwareSourceRequest interceptedRequest =
                UpdateSoftwareSourceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateSoftwareSourceConverter.fromRequest(client, interceptedRequest);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateSoftwareSourceResponse>
                transformer = UpdateSoftwareSourceConverter.fromResponse();

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails.setServiceDetails(
                "OsManagement",
                "UpdateSoftwareSource",
                ib.getRequestUri().toString(),
                "https://docs.oracle.com/iaas/api/#/en/os-management/20190801/SoftwareSource/UpdateSoftwareSource");
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
                                                retriedRequest.getUpdateSoftwareSourceDetails(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public OsManagementWaiters getWaiters() {
        return waiters;
    }

    @Override
    public OsManagementPaginators getPaginators() {
        return paginators;
    }
}
