/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import java.util.Locale;
import com.oracle.bmc.core.internal.http.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class ComputeManagementClient implements ComputeManagement {
    /**
     * Service instance for ComputeManagement.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("COMPUTEMANAGEMENT")
                    .serviceEndpointPrefix("iaas")
                    .serviceEndpointTemplate("https://iaas.{region}.{secondLevelDomain}")
                    .build();
    // attempt twice if it's instance principals, immediately failures will try to refresh the token
    private static final int MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS = 2;

    private final ComputeManagementWaiters waiters;
    private final ComputeManagementPaginators paginators;

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public ComputeManagementClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public ComputeManagementClient(
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
    public ComputeManagementClient(
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
    public ComputeManagementClient(
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
    public ComputeManagementClient(
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
    public ComputeManagementClient(
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
    public ComputeManagementClient(
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
    public ComputeManagementClient(
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
        this.authenticationDetailsProvider = authenticationDetailsProvider;
        com.oracle.bmc.http.internal.RestClientFactory restClientFactory =
                com.oracle.bmc.http.internal.RestClientFactoryBuilder.builder()
                        .clientConfigurator(clientConfigurator)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .build();
        com.oracle.bmc.http.signing.RequestSigner defaultRequestSigner =
                defaultRequestSignerFactory.createRequestSigner(
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
                        signingStrategyRequestSignerFactories
                                .get(s)
                                .createRequestSigner(SERVICE, authenticationDetailsProvider));
            }
        }
        this.client = restClientFactory.create(defaultRequestSigner, requestSigners, configuration);
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
                                    .setNameFormat("ComputeManagement-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }

        this.waiters = new ComputeManagementWaiters(executorService, this);

        this.paginators = new ComputeManagementPaginators(this);

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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ComputeManagementClient> {
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
        public ComputeManagementClient build(
                @lombok.NonNull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            return new ComputeManagementClient(
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
        regionId = regionId.toLowerCase(Locale.ENGLISH);
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
    public AttachLoadBalancerResponse attachLoadBalancer(AttachLoadBalancerRequest request) {
        LOG.trace("Called attachLoadBalancer");
        request = AttachLoadBalancerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AttachLoadBalancerConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, AttachLoadBalancerResponse>
                transformer = AttachLoadBalancerConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getAttachLoadBalancerDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public CreateInstanceConfigurationResponse createInstanceConfiguration(
            CreateInstanceConfigurationRequest request) {
        LOG.trace("Called createInstanceConfiguration");
        request = CreateInstanceConfigurationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateInstanceConfigurationConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreateInstanceConfigurationResponse>
                transformer = CreateInstanceConfigurationConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateInstanceConfiguration(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public CreateInstancePoolResponse createInstancePool(CreateInstancePoolRequest request) {
        LOG.trace("Called createInstancePool");
        request = CreateInstancePoolConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateInstancePoolConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateInstancePoolResponse>
                transformer = CreateInstancePoolConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getCreateInstancePoolDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public DeleteInstanceConfigurationResponse deleteInstanceConfiguration(
            DeleteInstanceConfigurationRequest request) {
        LOG.trace("Called deleteInstanceConfiguration");
        request = DeleteInstanceConfigurationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteInstanceConfigurationConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeleteInstanceConfigurationResponse>
                transformer = DeleteInstanceConfigurationConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public DetachLoadBalancerResponse detachLoadBalancer(DetachLoadBalancerRequest request) {
        LOG.trace("Called detachLoadBalancer");
        request = DetachLoadBalancerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DetachLoadBalancerConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DetachLoadBalancerResponse>
                transformer = DetachLoadBalancerConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getDetachLoadBalancerDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public GetInstanceConfigurationResponse getInstanceConfiguration(
            GetInstanceConfigurationRequest request) {
        LOG.trace("Called getInstanceConfiguration");
        request = GetInstanceConfigurationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetInstanceConfigurationConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetInstanceConfigurationResponse>
                transformer = GetInstanceConfigurationConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public GetInstancePoolResponse getInstancePool(GetInstancePoolRequest request) {
        LOG.trace("Called getInstancePool");
        request = GetInstancePoolConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetInstancePoolConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetInstancePoolResponse>
                transformer = GetInstancePoolConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public LaunchInstanceConfigurationResponse launchInstanceConfiguration(
            LaunchInstanceConfigurationRequest request) {
        LOG.trace("Called launchInstanceConfiguration");
        request = LaunchInstanceConfigurationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                LaunchInstanceConfigurationConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, LaunchInstanceConfigurationResponse>
                transformer = LaunchInstanceConfigurationConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.post(ib, request.getInstanceConfiguration(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ListInstanceConfigurationsResponse listInstanceConfigurations(
            ListInstanceConfigurationsRequest request) {
        LOG.trace("Called listInstanceConfigurations");
        request = ListInstanceConfigurationsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListInstanceConfigurationsConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListInstanceConfigurationsResponse>
                transformer = ListInstanceConfigurationsConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ListInstancePoolInstancesResponse listInstancePoolInstances(
            ListInstancePoolInstancesRequest request) {
        LOG.trace("Called listInstancePoolInstances");
        request = ListInstancePoolInstancesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListInstancePoolInstancesConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListInstancePoolInstancesResponse>
                transformer = ListInstancePoolInstancesConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ListInstancePoolsResponse listInstancePools(ListInstancePoolsRequest request) {
        LOG.trace("Called listInstancePools");
        request = ListInstancePoolsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListInstancePoolsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListInstancePoolsResponse>
                transformer = ListInstancePoolsConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.get(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public ResetInstancePoolResponse resetInstancePool(ResetInstancePoolRequest request) {
        LOG.trace("Called resetInstancePool");
        request = ResetInstancePoolConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ResetInstancePoolConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ResetInstancePoolResponse>
                transformer = ResetInstancePoolConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.post(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public SoftresetInstancePoolResponse softresetInstancePool(
            SoftresetInstancePoolRequest request) {
        LOG.trace("Called softresetInstancePool");
        request = SoftresetInstancePoolConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SoftresetInstancePoolConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, SoftresetInstancePoolResponse>
                transformer = SoftresetInstancePoolConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.post(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public StartInstancePoolResponse startInstancePool(StartInstancePoolRequest request) {
        LOG.trace("Called startInstancePool");
        request = StartInstancePoolConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StartInstancePoolConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, StartInstancePoolResponse>
                transformer = StartInstancePoolConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.post(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public StopInstancePoolResponse stopInstancePool(StopInstancePoolRequest request) {
        LOG.trace("Called stopInstancePool");
        request = StopInstancePoolConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                StopInstancePoolConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, StopInstancePoolResponse>
                transformer = StopInstancePoolConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.post(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public TerminateInstancePoolResponse terminateInstancePool(
            TerminateInstancePoolRequest request) {
        LOG.trace("Called terminateInstancePool");
        request = TerminateInstancePoolConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                TerminateInstancePoolConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, TerminateInstancePoolResponse>
                transformer = TerminateInstancePoolConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response = client.delete(ib, request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public UpdateInstanceConfigurationResponse updateInstanceConfiguration(
            UpdateInstanceConfigurationRequest request) {
        LOG.trace("Called updateInstanceConfiguration");
        request = UpdateInstanceConfigurationConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateInstanceConfigurationConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, UpdateInstanceConfigurationResponse>
                transformer = UpdateInstanceConfigurationConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateInstanceConfigurationDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override
    public UpdateInstancePoolResponse updateInstancePool(UpdateInstancePoolRequest request) {
        LOG.trace("Called updateInstancePool");
        request = UpdateInstancePoolConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateInstancePoolConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateInstancePoolResponse>
                transformer = UpdateInstancePoolConverter.fromResponse();

        int attempts = 0;
        while (true) {
            try {
                javax.ws.rs.core.Response response =
                        client.put(ib, request.getUpdateInstancePoolDetails(), request);
                return transformer.apply(response);
            } catch (com.oracle.bmc.model.BmcException e) {
                if (++attempts < MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS
                        && canRetryRequestIfRefreshableAuthTokenUsed(e)) {
                    continue;
                } else {
                    throw e;
                }
            }
        }
    }

    private boolean canRetryRequestIfRefreshableAuthTokenUsed(com.oracle.bmc.model.BmcException e) {
        if (e.getStatusCode() == 401
                && this.authenticationDetailsProvider
                        instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            ((com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider)
                    .refresh();
            return true;
        }
        return false;
    }

    @Override
    public ComputeManagementWaiters getWaiters() {
        return waiters;
    }

    @Override
    public ComputeManagementPaginators getPaginators() {
        return paginators;
    }
}
