/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains;

import com.oracle.bmc.identitydomains.internal.http.*;
import com.oracle.bmc.identitydomains.requests.*;
import com.oracle.bmc.identitydomains.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
public class IdentityDomainsClient implements IdentityDomains {
    /**
     * Service instance for IdentityDomains.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("IDENTITYDOMAINS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://idcs-guid.identity.oraclecloud.com")
                    .build();
    // attempt twice if it's instance principals, immediately failures will try to refresh the token
    private static final int MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS = 2;

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(IdentityDomainsClient.class);

    com.oracle.bmc.http.internal.RestClient getClient() {
        return client;
    }

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
            authenticationDetailsProvider;
    private final com.oracle.bmc.retrier.RetryConfiguration retryConfiguration;
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
    private final com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration
            circuitBreakerConfiguration;
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
    public IdentityDomainsClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public IdentityDomainsClient(
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
    public IdentityDomainsClient(
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
    public IdentityDomainsClient(
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
    public IdentityDomainsClient(
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
    public IdentityDomainsClient(
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
    public IdentityDomainsClient(
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
     * Use the {@link Builder} to get access to all these parameters.
     *
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param signingStrategyRequestSignerFactories The request signer factories for each signing strategy used to create the request signer
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
     * @param restClientFactoryBuilder the builder for the {@link com.oracle.bmc.http.internal.RestClientFactory}
     */
    protected IdentityDomainsClient(
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
                        this.restClientFactory.getClientConfigurator());
        this.apacheConnectionClosingStrategy =
                com.oracle.bmc.http.ApacheUtils.getApacheConnectionClosingStrategy(
                        restClientFactory.getClientConfigurator());

        this.clientConfigurationToUse =
                (configuration != null)
                        ? configuration
                        : com.oracle.bmc.ClientConfiguration.builder().build();
        this.defaultRequestSignerFactory = defaultRequestSignerFactory;
        this.signingStrategyRequestSignerFactories = signingStrategyRequestSignerFactories;
        this.retryConfiguration = clientConfigurationToUse.getRetryConfiguration();
        final com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration
                userCircuitBreakerConfiguration =
                        CircuitBreakerUtils.getUserDefinedCircuitBreakerConfiguration(
                                configuration);
        if (userCircuitBreakerConfiguration == null) {
            this.circuitBreakerConfiguration =
                    CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION;
        } else {
            this.circuitBreakerConfiguration = userCircuitBreakerConfiguration;
        }

        this.refreshClient();

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
            extends com.oracle.bmc.common.ClientBuilderBase<Builder, IdentityDomainsClient> {
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
        public IdentityDomainsClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new IdentityDomainsClient(
                    authenticationDetailsProvider,
                    configuration,
                    clientConfigurator,
                    requestSignerFactory,
                    signingStrategyRequestSignerFactories,
                    additionalClientConfigurators,
                    endpoint,
                    restClientFactoryBuilder);
        }
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
                                .createRequestSigner(SERVICE, this.authenticationDetailsProvider));
            }
        }

        com.oracle.bmc.http.internal.RestClient refreshedClient =
                this.restClientFactory.create(
                        defaultRequestSigner,
                        requestSigners,
                        this.clientConfigurationToUse,
                        this.isNonBufferingApacheClient,
                        null,
                        this.circuitBreakerConfiguration);

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
    public void close() {
        client.close();
    }

    @Override
    public CreateApiKeyResponse createApiKey(CreateApiKeyRequest request) {
        LOG.trace("Called createApiKey");
        final CreateApiKeyRequest interceptedRequest =
                CreateApiKeyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateApiKeyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateApiKey", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateApiKeyResponse> transformer =
                CreateApiKeyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(ib, retriedRequest.getApiKey(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateAppResponse createApp(CreateAppRequest request) {
        LOG.trace("Called createApp");
        final CreateAppRequest interceptedRequest = CreateAppConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAppConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateApp", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateAppResponse> transformer =
                CreateAppConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(ib, retriedRequest.getApp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateAppRoleResponse createAppRole(CreateAppRoleRequest request) {
        LOG.trace("Called createAppRole");
        final CreateAppRoleRequest interceptedRequest =
                CreateAppRoleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAppRoleConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateAppRole", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateAppRoleResponse> transformer =
                CreateAppRoleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                ib, retriedRequest.getAppRole(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateApprovalWorkflowResponse createApprovalWorkflow(
            CreateApprovalWorkflowRequest request) {
        LOG.trace("Called createApprovalWorkflow");
        final CreateApprovalWorkflowRequest interceptedRequest =
                CreateApprovalWorkflowConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateApprovalWorkflowConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateApprovalWorkflow",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateApprovalWorkflowResponse>
                transformer =
                        CreateApprovalWorkflowConverter.fromResponse(
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
                                                retriedRequest.getApprovalWorkflow(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateApprovalWorkflowAssignmentResponse createApprovalWorkflowAssignment(
            CreateApprovalWorkflowAssignmentRequest request) {
        LOG.trace("Called createApprovalWorkflowAssignment");
        final CreateApprovalWorkflowAssignmentRequest interceptedRequest =
                CreateApprovalWorkflowAssignmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateApprovalWorkflowAssignmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateApprovalWorkflowAssignment",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, CreateApprovalWorkflowAssignmentResponse>
                transformer =
                        CreateApprovalWorkflowAssignmentConverter.fromResponse(
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
                                                retriedRequest.getApprovalWorkflowAssignment(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateApprovalWorkflowStepResponse createApprovalWorkflowStep(
            CreateApprovalWorkflowStepRequest request) {
        LOG.trace("Called createApprovalWorkflowStep");
        final CreateApprovalWorkflowStepRequest interceptedRequest =
                CreateApprovalWorkflowStepConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateApprovalWorkflowStepConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateApprovalWorkflowStep",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateApprovalWorkflowStepResponse>
                transformer =
                        CreateApprovalWorkflowStepConverter.fromResponse(
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
                                                retriedRequest.getApprovalWorkflowStep(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateAuthTokenResponse createAuthToken(CreateAuthTokenRequest request) {
        LOG.trace("Called createAuthToken");
        final CreateAuthTokenRequest interceptedRequest =
                CreateAuthTokenConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAuthTokenConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateAuthToken", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateAuthTokenResponse>
                transformer =
                        CreateAuthTokenConverter.fromResponse(
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
                                                ib, retriedRequest.getAuthToken(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateAuthenticationFactorsRemoverResponse createAuthenticationFactorsRemover(
            CreateAuthenticationFactorsRemoverRequest request) {
        LOG.trace("Called createAuthenticationFactorsRemover");
        final CreateAuthenticationFactorsRemoverRequest interceptedRequest =
                CreateAuthenticationFactorsRemoverConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAuthenticationFactorsRemoverConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateAuthenticationFactorsRemover",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, CreateAuthenticationFactorsRemoverResponse>
                transformer =
                        CreateAuthenticationFactorsRemoverConverter.fromResponse(
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
                                                retriedRequest.getAuthenticationFactorsRemover(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateCloudGateResponse createCloudGate(CreateCloudGateRequest request) {
        LOG.trace("Called createCloudGate");
        final CreateCloudGateRequest interceptedRequest =
                CreateCloudGateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCloudGateConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateCloudGate", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateCloudGateResponse>
                transformer =
                        CreateCloudGateConverter.fromResponse(
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
                                                ib, retriedRequest.getCloudGate(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateCloudGateMappingResponse createCloudGateMapping(
            CreateCloudGateMappingRequest request) {
        LOG.trace("Called createCloudGateMapping");
        final CreateCloudGateMappingRequest interceptedRequest =
                CreateCloudGateMappingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCloudGateMappingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateCloudGateMapping",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateCloudGateMappingResponse>
                transformer =
                        CreateCloudGateMappingConverter.fromResponse(
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
                                                retriedRequest.getCloudGateMapping(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateCloudGateServerResponse createCloudGateServer(
            CreateCloudGateServerRequest request) {
        LOG.trace("Called createCloudGateServer");
        final CreateCloudGateServerRequest interceptedRequest =
                CreateCloudGateServerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCloudGateServerConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateCloudGateServer",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateCloudGateServerResponse>
                transformer =
                        CreateCloudGateServerConverter.fromResponse(
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
                                                retriedRequest.getCloudGateServer(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateConditionResponse createCondition(CreateConditionRequest request) {
        LOG.trace("Called createCondition");
        final CreateConditionRequest interceptedRequest =
                CreateConditionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateConditionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateCondition", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateConditionResponse>
                transformer =
                        CreateConditionConverter.fromResponse(
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
                                                ib, retriedRequest.getCondition(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateCustomerSecretKeyResponse createCustomerSecretKey(
            CreateCustomerSecretKeyRequest request) {
        LOG.trace("Called createCustomerSecretKey");
        final CreateCustomerSecretKeyRequest interceptedRequest =
                CreateCustomerSecretKeyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCustomerSecretKeyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateCustomerSecretKey",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateCustomerSecretKeyResponse>
                transformer =
                        CreateCustomerSecretKeyConverter.fromResponse(
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
                                                retriedRequest.getCustomerSecretKey(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateDynamicResourceGroupResponse createDynamicResourceGroup(
            CreateDynamicResourceGroupRequest request) {
        LOG.trace("Called createDynamicResourceGroup");
        final CreateDynamicResourceGroupRequest interceptedRequest =
                CreateDynamicResourceGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDynamicResourceGroupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateDynamicResourceGroup",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateDynamicResourceGroupResponse>
                transformer =
                        CreateDynamicResourceGroupConverter.fromResponse(
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
                                                retriedRequest.getDynamicResourceGroup(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateGrantResponse createGrant(CreateGrantRequest request) {
        LOG.trace("Called createGrant");
        final CreateGrantRequest interceptedRequest =
                CreateGrantConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateGrantConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateGrant", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateGrantResponse> transformer =
                CreateGrantConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(ib, retriedRequest.getGrant(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateGroupResponse createGroup(CreateGroupRequest request) {
        LOG.trace("Called createGroup");
        final CreateGroupRequest interceptedRequest =
                CreateGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateGroupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateGroup", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateGroupResponse> transformer =
                CreateGroupConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(ib, retriedRequest.getGroup(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateIdentityPropagationTrustResponse createIdentityPropagationTrust(
            CreateIdentityPropagationTrustRequest request) {
        LOG.trace("Called createIdentityPropagationTrust");
        final CreateIdentityPropagationTrustRequest interceptedRequest =
                CreateIdentityPropagationTrustConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateIdentityPropagationTrustConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateIdentityPropagationTrust",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, CreateIdentityPropagationTrustResponse>
                transformer =
                        CreateIdentityPropagationTrustConverter.fromResponse(
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
                                                retriedRequest.getIdentityPropagationTrust(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateIdentityProviderResponse createIdentityProvider(
            CreateIdentityProviderRequest request) {
        LOG.trace("Called createIdentityProvider");
        final CreateIdentityProviderRequest interceptedRequest =
                CreateIdentityProviderConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateIdentityProviderConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateIdentityProvider",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateIdentityProviderResponse>
                transformer =
                        CreateIdentityProviderConverter.fromResponse(
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
                                                retriedRequest.getIdentityProvider(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateMeResponse createMe(CreateMeRequest request) {
        LOG.trace("Called createMe");
        final CreateMeRequest interceptedRequest = CreateMeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateMe", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateMeResponse> transformer =
                CreateMeConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(ib, retriedRequest.getMe(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateMyApiKeyResponse createMyApiKey(CreateMyApiKeyRequest request) {
        LOG.trace("Called createMyApiKey");
        final CreateMyApiKeyRequest interceptedRequest =
                CreateMyApiKeyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMyApiKeyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateMyApiKey", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateMyApiKeyResponse> transformer =
                CreateMyApiKeyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                ib, retriedRequest.getMyApiKey(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateMyAuthTokenResponse createMyAuthToken(CreateMyAuthTokenRequest request) {
        LOG.trace("Called createMyAuthToken");
        final CreateMyAuthTokenRequest interceptedRequest =
                CreateMyAuthTokenConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMyAuthTokenConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateMyAuthToken", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateMyAuthTokenResponse>
                transformer =
                        CreateMyAuthTokenConverter.fromResponse(
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
                                                retriedRequest.getMyAuthToken(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateMyAuthenticationFactorInitiatorResponse createMyAuthenticationFactorInitiator(
            CreateMyAuthenticationFactorInitiatorRequest request) {
        LOG.trace("Called createMyAuthenticationFactorInitiator");
        final CreateMyAuthenticationFactorInitiatorRequest interceptedRequest =
                CreateMyAuthenticationFactorInitiatorConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMyAuthenticationFactorInitiatorConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateMyAuthenticationFactorInitiator",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, CreateMyAuthenticationFactorInitiatorResponse>
                transformer =
                        CreateMyAuthenticationFactorInitiatorConverter.fromResponse(
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
                                                retriedRequest.getMyAuthenticationFactorInitiator(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateMyAuthenticationFactorValidatorResponse createMyAuthenticationFactorValidator(
            CreateMyAuthenticationFactorValidatorRequest request) {
        LOG.trace("Called createMyAuthenticationFactorValidator");
        final CreateMyAuthenticationFactorValidatorRequest interceptedRequest =
                CreateMyAuthenticationFactorValidatorConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMyAuthenticationFactorValidatorConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateMyAuthenticationFactorValidator",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, CreateMyAuthenticationFactorValidatorResponse>
                transformer =
                        CreateMyAuthenticationFactorValidatorConverter.fromResponse(
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
                                                retriedRequest.getMyAuthenticationFactorValidator(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateMyAuthenticationFactorsRemoverResponse createMyAuthenticationFactorsRemover(
            CreateMyAuthenticationFactorsRemoverRequest request) {
        LOG.trace("Called createMyAuthenticationFactorsRemover");
        final CreateMyAuthenticationFactorsRemoverRequest interceptedRequest =
                CreateMyAuthenticationFactorsRemoverConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMyAuthenticationFactorsRemoverConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateMyAuthenticationFactorsRemover",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, CreateMyAuthenticationFactorsRemoverResponse>
                transformer =
                        CreateMyAuthenticationFactorsRemoverConverter.fromResponse(
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
                                                retriedRequest.getMyAuthenticationFactorsRemover(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateMyCustomerSecretKeyResponse createMyCustomerSecretKey(
            CreateMyCustomerSecretKeyRequest request) {
        LOG.trace("Called createMyCustomerSecretKey");
        final CreateMyCustomerSecretKeyRequest interceptedRequest =
                CreateMyCustomerSecretKeyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMyCustomerSecretKeyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateMyCustomerSecretKey",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateMyCustomerSecretKeyResponse>
                transformer =
                        CreateMyCustomerSecretKeyConverter.fromResponse(
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
                                                retriedRequest.getMyCustomerSecretKey(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateMyOAuth2ClientCredentialResponse createMyOAuth2ClientCredential(
            CreateMyOAuth2ClientCredentialRequest request) {
        LOG.trace("Called createMyOAuth2ClientCredential");
        final CreateMyOAuth2ClientCredentialRequest interceptedRequest =
                CreateMyOAuth2ClientCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMyOAuth2ClientCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateMyOAuth2ClientCredential",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, CreateMyOAuth2ClientCredentialResponse>
                transformer =
                        CreateMyOAuth2ClientCredentialConverter.fromResponse(
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
                                                retriedRequest.getMyOAuth2ClientCredential(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateMyRequestResponse createMyRequest(CreateMyRequestRequest request) {
        LOG.trace("Called createMyRequest");
        final CreateMyRequestRequest interceptedRequest =
                CreateMyRequestConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMyRequestConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateMyRequest", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateMyRequestResponse>
                transformer =
                        CreateMyRequestConverter.fromResponse(
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
                                                ib, retriedRequest.getMyRequest(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateMySmtpCredentialResponse createMySmtpCredential(
            CreateMySmtpCredentialRequest request) {
        LOG.trace("Called createMySmtpCredential");
        final CreateMySmtpCredentialRequest interceptedRequest =
                CreateMySmtpCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMySmtpCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateMySmtpCredential",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateMySmtpCredentialResponse>
                transformer =
                        CreateMySmtpCredentialConverter.fromResponse(
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
                                                retriedRequest.getMySmtpCredential(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateMySupportAccountResponse createMySupportAccount(
            CreateMySupportAccountRequest request) {
        LOG.trace("Called createMySupportAccount");
        final CreateMySupportAccountRequest interceptedRequest =
                CreateMySupportAccountConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMySupportAccountConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateMySupportAccount",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateMySupportAccountResponse>
                transformer =
                        CreateMySupportAccountConverter.fromResponse(
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
                                                retriedRequest.getMySupportAccount(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateMyUserDbCredentialResponse createMyUserDbCredential(
            CreateMyUserDbCredentialRequest request) {
        LOG.trace("Called createMyUserDbCredential");
        final CreateMyUserDbCredentialRequest interceptedRequest =
                CreateMyUserDbCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMyUserDbCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateMyUserDbCredential",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateMyUserDbCredentialResponse>
                transformer =
                        CreateMyUserDbCredentialConverter.fromResponse(
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
                                                retriedRequest.getMyUserDbCredential(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateNetworkPerimeterResponse createNetworkPerimeter(
            CreateNetworkPerimeterRequest request) {
        LOG.trace("Called createNetworkPerimeter");
        final CreateNetworkPerimeterRequest interceptedRequest =
                CreateNetworkPerimeterConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateNetworkPerimeterConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateNetworkPerimeter",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateNetworkPerimeterResponse>
                transformer =
                        CreateNetworkPerimeterConverter.fromResponse(
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
                                                retriedRequest.getNetworkPerimeter(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateOAuth2ClientCredentialResponse createOAuth2ClientCredential(
            CreateOAuth2ClientCredentialRequest request) {
        LOG.trace("Called createOAuth2ClientCredential");
        final CreateOAuth2ClientCredentialRequest interceptedRequest =
                CreateOAuth2ClientCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateOAuth2ClientCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateOAuth2ClientCredential",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateOAuth2ClientCredentialResponse>
                transformer =
                        CreateOAuth2ClientCredentialConverter.fromResponse(
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
                                                retriedRequest.getOAuth2ClientCredential(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateOAuthClientCertificateResponse createOAuthClientCertificate(
            CreateOAuthClientCertificateRequest request) {
        LOG.trace("Called createOAuthClientCertificate");
        final CreateOAuthClientCertificateRequest interceptedRequest =
                CreateOAuthClientCertificateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateOAuthClientCertificateConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateOAuthClientCertificate",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateOAuthClientCertificateResponse>
                transformer =
                        CreateOAuthClientCertificateConverter.fromResponse(
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
                                                retriedRequest.getOAuthClientCertificate(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateOAuthPartnerCertificateResponse createOAuthPartnerCertificate(
            CreateOAuthPartnerCertificateRequest request) {
        LOG.trace("Called createOAuthPartnerCertificate");
        final CreateOAuthPartnerCertificateRequest interceptedRequest =
                CreateOAuthPartnerCertificateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateOAuthPartnerCertificateConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateOAuthPartnerCertificate",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, CreateOAuthPartnerCertificateResponse>
                transformer =
                        CreateOAuthPartnerCertificateConverter.fromResponse(
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
                                                retriedRequest.getOAuthPartnerCertificate(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreatePasswordPolicyResponse createPasswordPolicy(CreatePasswordPolicyRequest request) {
        LOG.trace("Called createPasswordPolicy");
        final CreatePasswordPolicyRequest interceptedRequest =
                CreatePasswordPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePasswordPolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreatePasswordPolicy",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, CreatePasswordPolicyResponse>
                transformer =
                        CreatePasswordPolicyConverter.fromResponse(
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
                                                retriedRequest.getPasswordPolicy(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) {
        LOG.trace("Called createPolicy");
        final CreatePolicyRequest interceptedRequest =
                CreatePolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreatePolicy", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, CreatePolicyResponse> transformer =
                CreatePolicyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(ib, retriedRequest.getPolicy(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateRestoreOciConsolePolicyResponse createRestoreOciConsolePolicy(
            CreateRestoreOciConsolePolicyRequest request) {
        LOG.trace("Called createRestoreOciConsolePolicy");
        final CreateRestoreOciConsolePolicyRequest interceptedRequest =
                CreateRestoreOciConsolePolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateRestoreOciConsolePolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateRestoreOciConsolePolicy",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, CreateRestoreOciConsolePolicyResponse>
                transformer =
                        CreateRestoreOciConsolePolicyConverter.fromResponse(
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
                                                retriedRequest.getRestoreOciConsolePolicy(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateRuleResponse createRule(CreateRuleRequest request) {
        LOG.trace("Called createRule");
        final CreateRuleRequest interceptedRequest = CreateRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateRuleConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateRule", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateRuleResponse> transformer =
                CreateRuleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(ib, retriedRequest.getRule(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateSecurityQuestionResponse createSecurityQuestion(
            CreateSecurityQuestionRequest request) {
        LOG.trace("Called createSecurityQuestion");
        final CreateSecurityQuestionRequest interceptedRequest =
                CreateSecurityQuestionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSecurityQuestionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateSecurityQuestion",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateSecurityQuestionResponse>
                transformer =
                        CreateSecurityQuestionConverter.fromResponse(
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
                                                retriedRequest.getSecurityQuestion(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateSelfRegistrationProfileResponse createSelfRegistrationProfile(
            CreateSelfRegistrationProfileRequest request) {
        LOG.trace("Called createSelfRegistrationProfile");
        final CreateSelfRegistrationProfileRequest interceptedRequest =
                CreateSelfRegistrationProfileConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSelfRegistrationProfileConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateSelfRegistrationProfile",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<
                        javax.ws.rs.core.Response, CreateSelfRegistrationProfileResponse>
                transformer =
                        CreateSelfRegistrationProfileConverter.fromResponse(
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
                                                retriedRequest.getSelfRegistrationProfile(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateSmtpCredentialResponse createSmtpCredential(CreateSmtpCredentialRequest request) {
        LOG.trace("Called createSmtpCredential");
        final CreateSmtpCredentialRequest interceptedRequest =
                CreateSmtpCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSmtpCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateSmtpCredential",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateSmtpCredentialResponse>
                transformer =
                        CreateSmtpCredentialConverter.fromResponse(
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
                                                retriedRequest.getSmtpCredential(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateSocialIdentityProviderResponse createSocialIdentityProvider(
            CreateSocialIdentityProviderRequest request) {
        LOG.trace("Called createSocialIdentityProvider");
        final CreateSocialIdentityProviderRequest interceptedRequest =
                CreateSocialIdentityProviderConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSocialIdentityProviderConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateSocialIdentityProvider",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateSocialIdentityProviderResponse>
                transformer =
                        CreateSocialIdentityProviderConverter.fromResponse(
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
                                                retriedRequest.getSocialIdentityProvider(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateUserResponse createUser(CreateUserRequest request) {
        LOG.trace("Called createUser");
        final CreateUserRequest interceptedRequest = CreateUserConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateUserConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateUser", ib.getRequestUri().toString(), "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateUserResponse> transformer =
                CreateUserConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.post(ib, retriedRequest.getUser(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public CreateUserDbCredentialResponse createUserDbCredential(
            CreateUserDbCredentialRequest request) {
        LOG.trace("Called createUserDbCredential");
        final CreateUserDbCredentialRequest interceptedRequest =
                CreateUserDbCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateUserDbCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateUserDbCredential",
                        ib.getRequestUri().toString(),
                        "");
        java.util.function.Function<javax.ws.rs.core.Response, CreateUserDbCredentialResponse>
                transformer =
                        CreateUserDbCredentialConverter.fromResponse(
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
                                                retriedRequest.getUserDbCredential(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public DeleteApiKeyResponse deleteApiKey(DeleteApiKeyRequest request) {
        LOG.trace("Called deleteApiKey");
        final DeleteApiKeyRequest interceptedRequest =
                DeleteApiKeyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteApiKeyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteApiKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApiKey/DeleteApiKey");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteApiKeyResponse> transformer =
                DeleteApiKeyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteAppResponse deleteApp(DeleteAppRequest request) {
        LOG.trace("Called deleteApp");
        final DeleteAppRequest interceptedRequest = DeleteAppConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAppConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteApp",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/App/DeleteApp");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteAppResponse> transformer =
                DeleteAppConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteAppRoleResponse deleteAppRole(DeleteAppRoleRequest request) {
        LOG.trace("Called deleteAppRole");
        final DeleteAppRoleRequest interceptedRequest =
                DeleteAppRoleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAppRoleConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteAppRole",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AppRole/DeleteAppRole");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteAppRoleResponse> transformer =
                DeleteAppRoleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteApprovalWorkflowResponse deleteApprovalWorkflow(
            DeleteApprovalWorkflowRequest request) {
        LOG.trace("Called deleteApprovalWorkflow");
        final DeleteApprovalWorkflowRequest interceptedRequest =
                DeleteApprovalWorkflowConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteApprovalWorkflowConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteApprovalWorkflow",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflow/DeleteApprovalWorkflow");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteApprovalWorkflowResponse>
                transformer =
                        DeleteApprovalWorkflowConverter.fromResponse(
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
    public DeleteApprovalWorkflowAssignmentResponse deleteApprovalWorkflowAssignment(
            DeleteApprovalWorkflowAssignmentRequest request) {
        LOG.trace("Called deleteApprovalWorkflowAssignment");
        final DeleteApprovalWorkflowAssignmentRequest interceptedRequest =
                DeleteApprovalWorkflowAssignmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteApprovalWorkflowAssignmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteApprovalWorkflowAssignment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflowAssignment/DeleteApprovalWorkflowAssignment");
        java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteApprovalWorkflowAssignmentResponse>
                transformer =
                        DeleteApprovalWorkflowAssignmentConverter.fromResponse(
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
    public DeleteApprovalWorkflowStepResponse deleteApprovalWorkflowStep(
            DeleteApprovalWorkflowStepRequest request) {
        LOG.trace("Called deleteApprovalWorkflowStep");
        final DeleteApprovalWorkflowStepRequest interceptedRequest =
                DeleteApprovalWorkflowStepConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteApprovalWorkflowStepConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteApprovalWorkflowStep",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflowStep/DeleteApprovalWorkflowStep");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteApprovalWorkflowStepResponse>
                transformer =
                        DeleteApprovalWorkflowStepConverter.fromResponse(
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
    public DeleteAuthTokenResponse deleteAuthToken(DeleteAuthTokenRequest request) {
        LOG.trace("Called deleteAuthToken");
        final DeleteAuthTokenRequest interceptedRequest =
                DeleteAuthTokenConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAuthTokenConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteAuthToken",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthToken/DeleteAuthToken");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteAuthTokenResponse>
                transformer =
                        DeleteAuthTokenConverter.fromResponse(
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
    public DeleteCloudGateResponse deleteCloudGate(DeleteCloudGateRequest request) {
        LOG.trace("Called deleteCloudGate");
        final DeleteCloudGateRequest interceptedRequest =
                DeleteCloudGateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCloudGateConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteCloudGate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGate/DeleteCloudGate");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteCloudGateResponse>
                transformer =
                        DeleteCloudGateConverter.fromResponse(
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
    public DeleteCloudGateMappingResponse deleteCloudGateMapping(
            DeleteCloudGateMappingRequest request) {
        LOG.trace("Called deleteCloudGateMapping");
        final DeleteCloudGateMappingRequest interceptedRequest =
                DeleteCloudGateMappingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCloudGateMappingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteCloudGateMapping",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateMapping/DeleteCloudGateMapping");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteCloudGateMappingResponse>
                transformer =
                        DeleteCloudGateMappingConverter.fromResponse(
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
    public DeleteCloudGateServerResponse deleteCloudGateServer(
            DeleteCloudGateServerRequest request) {
        LOG.trace("Called deleteCloudGateServer");
        final DeleteCloudGateServerRequest interceptedRequest =
                DeleteCloudGateServerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCloudGateServerConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteCloudGateServer",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateServer/DeleteCloudGateServer");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteCloudGateServerResponse>
                transformer =
                        DeleteCloudGateServerConverter.fromResponse(
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
    public DeleteConditionResponse deleteCondition(DeleteConditionRequest request) {
        LOG.trace("Called deleteCondition");
        final DeleteConditionRequest interceptedRequest =
                DeleteConditionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteConditionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteCondition",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Condition/DeleteCondition");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteConditionResponse>
                transformer =
                        DeleteConditionConverter.fromResponse(
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
    public DeleteCustomerSecretKeyResponse deleteCustomerSecretKey(
            DeleteCustomerSecretKeyRequest request) {
        LOG.trace("Called deleteCustomerSecretKey");
        final DeleteCustomerSecretKeyRequest interceptedRequest =
                DeleteCustomerSecretKeyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCustomerSecretKeyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteCustomerSecretKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CustomerSecretKey/DeleteCustomerSecretKey");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteCustomerSecretKeyResponse>
                transformer =
                        DeleteCustomerSecretKeyConverter.fromResponse(
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
    public DeleteDynamicResourceGroupResponse deleteDynamicResourceGroup(
            DeleteDynamicResourceGroupRequest request) {
        LOG.trace("Called deleteDynamicResourceGroup");
        final DeleteDynamicResourceGroupRequest interceptedRequest =
                DeleteDynamicResourceGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDynamicResourceGroupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteDynamicResourceGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/DynamicResourceGroup/DeleteDynamicResourceGroup");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteDynamicResourceGroupResponse>
                transformer =
                        DeleteDynamicResourceGroupConverter.fromResponse(
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
    public DeleteGrantResponse deleteGrant(DeleteGrantRequest request) {
        LOG.trace("Called deleteGrant");
        final DeleteGrantRequest interceptedRequest =
                DeleteGrantConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteGrantConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteGrant",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Grant/DeleteGrant");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteGrantResponse> transformer =
                DeleteGrantConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) {
        LOG.trace("Called deleteGroup");
        final DeleteGroupRequest interceptedRequest =
                DeleteGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteGroupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Group/DeleteGroup");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteGroupResponse> transformer =
                DeleteGroupConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteIdentityPropagationTrustResponse deleteIdentityPropagationTrust(
            DeleteIdentityPropagationTrustRequest request) {
        LOG.trace("Called deleteIdentityPropagationTrust");
        final DeleteIdentityPropagationTrustRequest interceptedRequest =
                DeleteIdentityPropagationTrustConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteIdentityPropagationTrustConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteIdentityPropagationTrust",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityPropagationTrust/DeleteIdentityPropagationTrust");
        java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteIdentityPropagationTrustResponse>
                transformer =
                        DeleteIdentityPropagationTrustConverter.fromResponse(
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
    public DeleteIdentityProviderResponse deleteIdentityProvider(
            DeleteIdentityProviderRequest request) {
        LOG.trace("Called deleteIdentityProvider");
        final DeleteIdentityProviderRequest interceptedRequest =
                DeleteIdentityProviderConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteIdentityProviderConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteIdentityProvider",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityProvider/DeleteIdentityProvider");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteIdentityProviderResponse>
                transformer =
                        DeleteIdentityProviderConverter.fromResponse(
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
    public DeleteMyApiKeyResponse deleteMyApiKey(DeleteMyApiKeyRequest request) {
        LOG.trace("Called deleteMyApiKey");
        final DeleteMyApiKeyRequest interceptedRequest =
                DeleteMyApiKeyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMyApiKeyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteMyApiKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyApiKey/DeleteMyApiKey");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteMyApiKeyResponse> transformer =
                DeleteMyApiKeyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteMyAuthTokenResponse deleteMyAuthToken(DeleteMyAuthTokenRequest request) {
        LOG.trace("Called deleteMyAuthToken");
        final DeleteMyAuthTokenRequest interceptedRequest =
                DeleteMyAuthTokenConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMyAuthTokenConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteMyAuthToken",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyAuthToken/DeleteMyAuthToken");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteMyAuthTokenResponse>
                transformer =
                        DeleteMyAuthTokenConverter.fromResponse(
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
    public DeleteMyCustomerSecretKeyResponse deleteMyCustomerSecretKey(
            DeleteMyCustomerSecretKeyRequest request) {
        LOG.trace("Called deleteMyCustomerSecretKey");
        final DeleteMyCustomerSecretKeyRequest interceptedRequest =
                DeleteMyCustomerSecretKeyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMyCustomerSecretKeyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteMyCustomerSecretKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyCustomerSecretKey/DeleteMyCustomerSecretKey");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteMyCustomerSecretKeyResponse>
                transformer =
                        DeleteMyCustomerSecretKeyConverter.fromResponse(
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
    public DeleteMyDeviceResponse deleteMyDevice(DeleteMyDeviceRequest request) {
        LOG.trace("Called deleteMyDevice");
        final DeleteMyDeviceRequest interceptedRequest =
                DeleteMyDeviceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMyDeviceConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteMyDevice",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyDevice/DeleteMyDevice");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteMyDeviceResponse> transformer =
                DeleteMyDeviceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteMyOAuth2ClientCredentialResponse deleteMyOAuth2ClientCredential(
            DeleteMyOAuth2ClientCredentialRequest request) {
        LOG.trace("Called deleteMyOAuth2ClientCredential");
        final DeleteMyOAuth2ClientCredentialRequest interceptedRequest =
                DeleteMyOAuth2ClientCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMyOAuth2ClientCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteMyOAuth2ClientCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyOAuth2ClientCredential/DeleteMyOAuth2ClientCredential");
        java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteMyOAuth2ClientCredentialResponse>
                transformer =
                        DeleteMyOAuth2ClientCredentialConverter.fromResponse(
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
    public DeleteMySmtpCredentialResponse deleteMySmtpCredential(
            DeleteMySmtpCredentialRequest request) {
        LOG.trace("Called deleteMySmtpCredential");
        final DeleteMySmtpCredentialRequest interceptedRequest =
                DeleteMySmtpCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMySmtpCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteMySmtpCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MySmtpCredential/DeleteMySmtpCredential");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteMySmtpCredentialResponse>
                transformer =
                        DeleteMySmtpCredentialConverter.fromResponse(
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
    public DeleteMySupportAccountResponse deleteMySupportAccount(
            DeleteMySupportAccountRequest request) {
        LOG.trace("Called deleteMySupportAccount");
        final DeleteMySupportAccountRequest interceptedRequest =
                DeleteMySupportAccountConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMySupportAccountConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteMySupportAccount",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MySupportAccount/DeleteMySupportAccount");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteMySupportAccountResponse>
                transformer =
                        DeleteMySupportAccountConverter.fromResponse(
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
    public DeleteMyTrustedUserAgentResponse deleteMyTrustedUserAgent(
            DeleteMyTrustedUserAgentRequest request) {
        LOG.trace("Called deleteMyTrustedUserAgent");
        final DeleteMyTrustedUserAgentRequest interceptedRequest =
                DeleteMyTrustedUserAgentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMyTrustedUserAgentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteMyTrustedUserAgent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyTrustedUserAgent/DeleteMyTrustedUserAgent");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteMyTrustedUserAgentResponse>
                transformer =
                        DeleteMyTrustedUserAgentConverter.fromResponse(
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
    public DeleteMyUserDbCredentialResponse deleteMyUserDbCredential(
            DeleteMyUserDbCredentialRequest request) {
        LOG.trace("Called deleteMyUserDbCredential");
        final DeleteMyUserDbCredentialRequest interceptedRequest =
                DeleteMyUserDbCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMyUserDbCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteMyUserDbCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyUserDbCredential/DeleteMyUserDbCredential");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteMyUserDbCredentialResponse>
                transformer =
                        DeleteMyUserDbCredentialConverter.fromResponse(
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
    public DeleteNetworkPerimeterResponse deleteNetworkPerimeter(
            DeleteNetworkPerimeterRequest request) {
        LOG.trace("Called deleteNetworkPerimeter");
        final DeleteNetworkPerimeterRequest interceptedRequest =
                DeleteNetworkPerimeterConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteNetworkPerimeterConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteNetworkPerimeter",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NetworkPerimeter/DeleteNetworkPerimeter");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteNetworkPerimeterResponse>
                transformer =
                        DeleteNetworkPerimeterConverter.fromResponse(
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
    public DeleteOAuth2ClientCredentialResponse deleteOAuth2ClientCredential(
            DeleteOAuth2ClientCredentialRequest request) {
        LOG.trace("Called deleteOAuth2ClientCredential");
        final DeleteOAuth2ClientCredentialRequest interceptedRequest =
                DeleteOAuth2ClientCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteOAuth2ClientCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteOAuth2ClientCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuth2ClientCredential/DeleteOAuth2ClientCredential");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteOAuth2ClientCredentialResponse>
                transformer =
                        DeleteOAuth2ClientCredentialConverter.fromResponse(
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
    public DeleteOAuthClientCertificateResponse deleteOAuthClientCertificate(
            DeleteOAuthClientCertificateRequest request) {
        LOG.trace("Called deleteOAuthClientCertificate");
        final DeleteOAuthClientCertificateRequest interceptedRequest =
                DeleteOAuthClientCertificateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteOAuthClientCertificateConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteOAuthClientCertificate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuthClientCertificate/DeleteOAuthClientCertificate");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteOAuthClientCertificateResponse>
                transformer =
                        DeleteOAuthClientCertificateConverter.fromResponse(
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
    public DeleteOAuthPartnerCertificateResponse deleteOAuthPartnerCertificate(
            DeleteOAuthPartnerCertificateRequest request) {
        LOG.trace("Called deleteOAuthPartnerCertificate");
        final DeleteOAuthPartnerCertificateRequest interceptedRequest =
                DeleteOAuthPartnerCertificateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteOAuthPartnerCertificateConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteOAuthPartnerCertificate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuthPartnerCertificate/DeleteOAuthPartnerCertificate");
        java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteOAuthPartnerCertificateResponse>
                transformer =
                        DeleteOAuthPartnerCertificateConverter.fromResponse(
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
    public DeletePasswordPolicyResponse deletePasswordPolicy(DeletePasswordPolicyRequest request) {
        LOG.trace("Called deletePasswordPolicy");
        final DeletePasswordPolicyRequest interceptedRequest =
                DeletePasswordPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePasswordPolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeletePasswordPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/PasswordPolicy/DeletePasswordPolicy");
        java.util.function.Function<javax.ws.rs.core.Response, DeletePasswordPolicyResponse>
                transformer =
                        DeletePasswordPolicyConverter.fromResponse(
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
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) {
        LOG.trace("Called deletePolicy");
        final DeletePolicyRequest interceptedRequest =
                DeletePolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeletePolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Policy/DeletePolicy");
        java.util.function.Function<javax.ws.rs.core.Response, DeletePolicyResponse> transformer =
                DeletePolicyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) {
        LOG.trace("Called deleteRule");
        final DeleteRuleRequest interceptedRequest = DeleteRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteRuleConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Rule/DeleteRule");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteRuleResponse> transformer =
                DeleteRuleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteSecurityQuestionResponse deleteSecurityQuestion(
            DeleteSecurityQuestionRequest request) {
        LOG.trace("Called deleteSecurityQuestion");
        final DeleteSecurityQuestionRequest interceptedRequest =
                DeleteSecurityQuestionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSecurityQuestionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteSecurityQuestion",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestion/DeleteSecurityQuestion");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteSecurityQuestionResponse>
                transformer =
                        DeleteSecurityQuestionConverter.fromResponse(
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
    public DeleteSelfRegistrationProfileResponse deleteSelfRegistrationProfile(
            DeleteSelfRegistrationProfileRequest request) {
        LOG.trace("Called deleteSelfRegistrationProfile");
        final DeleteSelfRegistrationProfileRequest interceptedRequest =
                DeleteSelfRegistrationProfileConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSelfRegistrationProfileConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteSelfRegistrationProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SelfRegistrationProfile/DeleteSelfRegistrationProfile");
        java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteSelfRegistrationProfileResponse>
                transformer =
                        DeleteSelfRegistrationProfileConverter.fromResponse(
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
    public DeleteSmtpCredentialResponse deleteSmtpCredential(DeleteSmtpCredentialRequest request) {
        LOG.trace("Called deleteSmtpCredential");
        final DeleteSmtpCredentialRequest interceptedRequest =
                DeleteSmtpCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSmtpCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteSmtpCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SmtpCredential/DeleteSmtpCredential");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteSmtpCredentialResponse>
                transformer =
                        DeleteSmtpCredentialConverter.fromResponse(
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
    public DeleteSocialIdentityProviderResponse deleteSocialIdentityProvider(
            DeleteSocialIdentityProviderRequest request) {
        LOG.trace("Called deleteSocialIdentityProvider");
        final DeleteSocialIdentityProviderRequest interceptedRequest =
                DeleteSocialIdentityProviderConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSocialIdentityProviderConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteSocialIdentityProvider",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SocialIdentityProvider/DeleteSocialIdentityProvider");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteSocialIdentityProviderResponse>
                transformer =
                        DeleteSocialIdentityProviderConverter.fromResponse(
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
    public DeleteUserResponse deleteUser(DeleteUserRequest request) {
        LOG.trace("Called deleteUser");
        final DeleteUserRequest interceptedRequest = DeleteUserConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteUserConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteUser",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/User/DeleteUser");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteUserResponse> transformer =
                DeleteUserConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
    public DeleteUserDbCredentialResponse deleteUserDbCredential(
            DeleteUserDbCredentialRequest request) {
        LOG.trace("Called deleteUserDbCredential");
        final DeleteUserDbCredentialRequest interceptedRequest =
                DeleteUserDbCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteUserDbCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteUserDbCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserDbCredential/DeleteUserDbCredential");
        java.util.function.Function<javax.ws.rs.core.Response, DeleteUserDbCredentialResponse>
                transformer =
                        DeleteUserDbCredentialConverter.fromResponse(
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
    public GetAccountMgmtInfoResponse getAccountMgmtInfo(GetAccountMgmtInfoRequest request) {
        LOG.trace("Called getAccountMgmtInfo");
        final GetAccountMgmtInfoRequest interceptedRequest =
                GetAccountMgmtInfoConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAccountMgmtInfoConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetAccountMgmtInfo",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AccountMgmtInfo/GetAccountMgmtInfo");
        java.util.function.Function<javax.ws.rs.core.Response, GetAccountMgmtInfoResponse>
                transformer =
                        GetAccountMgmtInfoConverter.fromResponse(
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
    public GetAccountRecoverySettingResponse getAccountRecoverySetting(
            GetAccountRecoverySettingRequest request) {
        LOG.trace("Called getAccountRecoverySetting");
        final GetAccountRecoverySettingRequest interceptedRequest =
                GetAccountRecoverySettingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAccountRecoverySettingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetAccountRecoverySetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AccountRecoverySetting/GetAccountRecoverySetting");
        java.util.function.Function<javax.ws.rs.core.Response, GetAccountRecoverySettingResponse>
                transformer =
                        GetAccountRecoverySettingConverter.fromResponse(
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
    public GetApiKeyResponse getApiKey(GetApiKeyRequest request) {
        LOG.trace("Called getApiKey");
        final GetApiKeyRequest interceptedRequest = GetApiKeyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetApiKeyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetApiKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApiKey/GetApiKey");
        java.util.function.Function<javax.ws.rs.core.Response, GetApiKeyResponse> transformer =
                GetApiKeyConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetAppResponse getApp(GetAppRequest request) {
        LOG.trace("Called getApp");
        final GetAppRequest interceptedRequest = GetAppConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAppConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetApp",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/App/GetApp");
        java.util.function.Function<javax.ws.rs.core.Response, GetAppResponse> transformer =
                GetAppConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetAppRoleResponse getAppRole(GetAppRoleRequest request) {
        LOG.trace("Called getAppRole");
        final GetAppRoleRequest interceptedRequest = GetAppRoleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAppRoleConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetAppRole",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AppRole/GetAppRole");
        java.util.function.Function<javax.ws.rs.core.Response, GetAppRoleResponse> transformer =
                GetAppRoleConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetApprovalWorkflowResponse getApprovalWorkflow(GetApprovalWorkflowRequest request) {
        LOG.trace("Called getApprovalWorkflow");
        final GetApprovalWorkflowRequest interceptedRequest =
                GetApprovalWorkflowConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetApprovalWorkflowConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetApprovalWorkflow",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflow/GetApprovalWorkflow");
        java.util.function.Function<javax.ws.rs.core.Response, GetApprovalWorkflowResponse>
                transformer =
                        GetApprovalWorkflowConverter.fromResponse(
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
    public GetApprovalWorkflowAssignmentResponse getApprovalWorkflowAssignment(
            GetApprovalWorkflowAssignmentRequest request) {
        LOG.trace("Called getApprovalWorkflowAssignment");
        final GetApprovalWorkflowAssignmentRequest interceptedRequest =
                GetApprovalWorkflowAssignmentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetApprovalWorkflowAssignmentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetApprovalWorkflowAssignment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflowAssignment/GetApprovalWorkflowAssignment");
        java.util.function.Function<
                        javax.ws.rs.core.Response, GetApprovalWorkflowAssignmentResponse>
                transformer =
                        GetApprovalWorkflowAssignmentConverter.fromResponse(
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
    public GetApprovalWorkflowStepResponse getApprovalWorkflowStep(
            GetApprovalWorkflowStepRequest request) {
        LOG.trace("Called getApprovalWorkflowStep");
        final GetApprovalWorkflowStepRequest interceptedRequest =
                GetApprovalWorkflowStepConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetApprovalWorkflowStepConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetApprovalWorkflowStep",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflowStep/GetApprovalWorkflowStep");
        java.util.function.Function<javax.ws.rs.core.Response, GetApprovalWorkflowStepResponse>
                transformer =
                        GetApprovalWorkflowStepConverter.fromResponse(
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
    public GetAuthTokenResponse getAuthToken(GetAuthTokenRequest request) {
        LOG.trace("Called getAuthToken");
        final GetAuthTokenRequest interceptedRequest =
                GetAuthTokenConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAuthTokenConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetAuthToken",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthToken/GetAuthToken");
        java.util.function.Function<javax.ws.rs.core.Response, GetAuthTokenResponse> transformer =
                GetAuthTokenConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetAuthenticationFactorSettingResponse getAuthenticationFactorSetting(
            GetAuthenticationFactorSettingRequest request) {
        LOG.trace("Called getAuthenticationFactorSetting");
        final GetAuthenticationFactorSettingRequest interceptedRequest =
                GetAuthenticationFactorSettingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAuthenticationFactorSettingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetAuthenticationFactorSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthenticationFactorSetting/GetAuthenticationFactorSetting");
        java.util.function.Function<
                        javax.ws.rs.core.Response, GetAuthenticationFactorSettingResponse>
                transformer =
                        GetAuthenticationFactorSettingConverter.fromResponse(
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
    public GetBrandingSettingResponse getBrandingSetting(GetBrandingSettingRequest request) {
        LOG.trace("Called getBrandingSetting");
        final GetBrandingSettingRequest interceptedRequest =
                GetBrandingSettingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBrandingSettingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetBrandingSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/BrandingSetting/GetBrandingSetting");
        java.util.function.Function<javax.ws.rs.core.Response, GetBrandingSettingResponse>
                transformer =
                        GetBrandingSettingConverter.fromResponse(
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
    public GetCloudGateResponse getCloudGate(GetCloudGateRequest request) {
        LOG.trace("Called getCloudGate");
        final GetCloudGateRequest interceptedRequest =
                GetCloudGateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCloudGateConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetCloudGate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGate/GetCloudGate");
        java.util.function.Function<javax.ws.rs.core.Response, GetCloudGateResponse> transformer =
                GetCloudGateConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetCloudGateMappingResponse getCloudGateMapping(GetCloudGateMappingRequest request) {
        LOG.trace("Called getCloudGateMapping");
        final GetCloudGateMappingRequest interceptedRequest =
                GetCloudGateMappingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCloudGateMappingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetCloudGateMapping",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateMapping/GetCloudGateMapping");
        java.util.function.Function<javax.ws.rs.core.Response, GetCloudGateMappingResponse>
                transformer =
                        GetCloudGateMappingConverter.fromResponse(
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
    public GetCloudGateServerResponse getCloudGateServer(GetCloudGateServerRequest request) {
        LOG.trace("Called getCloudGateServer");
        final GetCloudGateServerRequest interceptedRequest =
                GetCloudGateServerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCloudGateServerConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetCloudGateServer",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateServer/GetCloudGateServer");
        java.util.function.Function<javax.ws.rs.core.Response, GetCloudGateServerResponse>
                transformer =
                        GetCloudGateServerConverter.fromResponse(
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
    public GetConditionResponse getCondition(GetConditionRequest request) {
        LOG.trace("Called getCondition");
        final GetConditionRequest interceptedRequest =
                GetConditionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetConditionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetCondition",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Condition/GetCondition");
        java.util.function.Function<javax.ws.rs.core.Response, GetConditionResponse> transformer =
                GetConditionConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetCustomerSecretKeyResponse getCustomerSecretKey(GetCustomerSecretKeyRequest request) {
        LOG.trace("Called getCustomerSecretKey");
        final GetCustomerSecretKeyRequest interceptedRequest =
                GetCustomerSecretKeyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCustomerSecretKeyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetCustomerSecretKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CustomerSecretKey/GetCustomerSecretKey");
        java.util.function.Function<javax.ws.rs.core.Response, GetCustomerSecretKeyResponse>
                transformer =
                        GetCustomerSecretKeyConverter.fromResponse(
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
    public GetDynamicResourceGroupResponse getDynamicResourceGroup(
            GetDynamicResourceGroupRequest request) {
        LOG.trace("Called getDynamicResourceGroup");
        final GetDynamicResourceGroupRequest interceptedRequest =
                GetDynamicResourceGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDynamicResourceGroupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetDynamicResourceGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/DynamicResourceGroup/GetDynamicResourceGroup");
        java.util.function.Function<javax.ws.rs.core.Response, GetDynamicResourceGroupResponse>
                transformer =
                        GetDynamicResourceGroupConverter.fromResponse(
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
    public GetGrantResponse getGrant(GetGrantRequest request) {
        LOG.trace("Called getGrant");
        final GetGrantRequest interceptedRequest = GetGrantConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetGrantConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetGrant",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Grant/GetGrant");
        java.util.function.Function<javax.ws.rs.core.Response, GetGrantResponse> transformer =
                GetGrantConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetGroupResponse getGroup(GetGroupRequest request) {
        LOG.trace("Called getGroup");
        final GetGroupRequest interceptedRequest = GetGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetGroupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Group/GetGroup");
        java.util.function.Function<javax.ws.rs.core.Response, GetGroupResponse> transformer =
                GetGroupConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetIdentityPropagationTrustResponse getIdentityPropagationTrust(
            GetIdentityPropagationTrustRequest request) {
        LOG.trace("Called getIdentityPropagationTrust");
        final GetIdentityPropagationTrustRequest interceptedRequest =
                GetIdentityPropagationTrustConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIdentityPropagationTrustConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetIdentityPropagationTrust",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityPropagationTrust/GetIdentityPropagationTrust");
        java.util.function.Function<javax.ws.rs.core.Response, GetIdentityPropagationTrustResponse>
                transformer =
                        GetIdentityPropagationTrustConverter.fromResponse(
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
    public GetIdentityProviderResponse getIdentityProvider(GetIdentityProviderRequest request) {
        LOG.trace("Called getIdentityProvider");
        final GetIdentityProviderRequest interceptedRequest =
                GetIdentityProviderConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIdentityProviderConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetIdentityProvider",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityProvider/GetIdentityProvider");
        java.util.function.Function<javax.ws.rs.core.Response, GetIdentityProviderResponse>
                transformer =
                        GetIdentityProviderConverter.fromResponse(
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
    public GetIdentitySettingResponse getIdentitySetting(GetIdentitySettingRequest request) {
        LOG.trace("Called getIdentitySetting");
        final GetIdentitySettingRequest interceptedRequest =
                GetIdentitySettingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIdentitySettingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetIdentitySetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentitySetting/GetIdentitySetting");
        java.util.function.Function<javax.ws.rs.core.Response, GetIdentitySettingResponse>
                transformer =
                        GetIdentitySettingConverter.fromResponse(
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
    public GetKmsiSettingResponse getKmsiSetting(GetKmsiSettingRequest request) {
        LOG.trace("Called getKmsiSetting");
        final GetKmsiSettingRequest interceptedRequest =
                GetKmsiSettingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetKmsiSettingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetKmsiSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/KmsiSetting/GetKmsiSetting");
        java.util.function.Function<javax.ws.rs.core.Response, GetKmsiSettingResponse> transformer =
                GetKmsiSettingConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetMeResponse getMe(GetMeRequest request) {
        LOG.trace("Called getMe");
        final GetMeRequest interceptedRequest = GetMeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetMe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Me/GetMe");
        java.util.function.Function<javax.ws.rs.core.Response, GetMeResponse> transformer =
                GetMeConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetMyApiKeyResponse getMyApiKey(GetMyApiKeyRequest request) {
        LOG.trace("Called getMyApiKey");
        final GetMyApiKeyRequest interceptedRequest =
                GetMyApiKeyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMyApiKeyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetMyApiKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyApiKey/GetMyApiKey");
        java.util.function.Function<javax.ws.rs.core.Response, GetMyApiKeyResponse> transformer =
                GetMyApiKeyConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetMyAuthTokenResponse getMyAuthToken(GetMyAuthTokenRequest request) {
        LOG.trace("Called getMyAuthToken");
        final GetMyAuthTokenRequest interceptedRequest =
                GetMyAuthTokenConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMyAuthTokenConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetMyAuthToken",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyAuthToken/GetMyAuthToken");
        java.util.function.Function<javax.ws.rs.core.Response, GetMyAuthTokenResponse> transformer =
                GetMyAuthTokenConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetMyCompletedApprovalResponse getMyCompletedApproval(
            GetMyCompletedApprovalRequest request) {
        LOG.trace("Called getMyCompletedApproval");
        final GetMyCompletedApprovalRequest interceptedRequest =
                GetMyCompletedApprovalConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMyCompletedApprovalConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetMyCompletedApproval",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyCompletedApproval/GetMyCompletedApproval");
        java.util.function.Function<javax.ws.rs.core.Response, GetMyCompletedApprovalResponse>
                transformer =
                        GetMyCompletedApprovalConverter.fromResponse(
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
    public GetMyCustomerSecretKeyResponse getMyCustomerSecretKey(
            GetMyCustomerSecretKeyRequest request) {
        LOG.trace("Called getMyCustomerSecretKey");
        final GetMyCustomerSecretKeyRequest interceptedRequest =
                GetMyCustomerSecretKeyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMyCustomerSecretKeyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetMyCustomerSecretKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyCustomerSecretKey/GetMyCustomerSecretKey");
        java.util.function.Function<javax.ws.rs.core.Response, GetMyCustomerSecretKeyResponse>
                transformer =
                        GetMyCustomerSecretKeyConverter.fromResponse(
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
    public GetMyDeviceResponse getMyDevice(GetMyDeviceRequest request) {
        LOG.trace("Called getMyDevice");
        final GetMyDeviceRequest interceptedRequest =
                GetMyDeviceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMyDeviceConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetMyDevice",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyDevice/GetMyDevice");
        java.util.function.Function<javax.ws.rs.core.Response, GetMyDeviceResponse> transformer =
                GetMyDeviceConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetMyOAuth2ClientCredentialResponse getMyOAuth2ClientCredential(
            GetMyOAuth2ClientCredentialRequest request) {
        LOG.trace("Called getMyOAuth2ClientCredential");
        final GetMyOAuth2ClientCredentialRequest interceptedRequest =
                GetMyOAuth2ClientCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMyOAuth2ClientCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetMyOAuth2ClientCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyOAuth2ClientCredential/GetMyOAuth2ClientCredential");
        java.util.function.Function<javax.ws.rs.core.Response, GetMyOAuth2ClientCredentialResponse>
                transformer =
                        GetMyOAuth2ClientCredentialConverter.fromResponse(
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
    public GetMyPendingApprovalResponse getMyPendingApproval(GetMyPendingApprovalRequest request) {
        LOG.trace("Called getMyPendingApproval");
        final GetMyPendingApprovalRequest interceptedRequest =
                GetMyPendingApprovalConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMyPendingApprovalConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetMyPendingApproval",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyPendingApproval/GetMyPendingApproval");
        java.util.function.Function<javax.ws.rs.core.Response, GetMyPendingApprovalResponse>
                transformer =
                        GetMyPendingApprovalConverter.fromResponse(
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
    public GetMyRequestResponse getMyRequest(GetMyRequestRequest request) {
        LOG.trace("Called getMyRequest");
        final GetMyRequestRequest interceptedRequest =
                GetMyRequestConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMyRequestConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetMyRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyRequest/GetMyRequest");
        java.util.function.Function<javax.ws.rs.core.Response, GetMyRequestResponse> transformer =
                GetMyRequestConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetMySmtpCredentialResponse getMySmtpCredential(GetMySmtpCredentialRequest request) {
        LOG.trace("Called getMySmtpCredential");
        final GetMySmtpCredentialRequest interceptedRequest =
                GetMySmtpCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMySmtpCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetMySmtpCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MySmtpCredential/GetMySmtpCredential");
        java.util.function.Function<javax.ws.rs.core.Response, GetMySmtpCredentialResponse>
                transformer =
                        GetMySmtpCredentialConverter.fromResponse(
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
    public GetMySupportAccountResponse getMySupportAccount(GetMySupportAccountRequest request) {
        LOG.trace("Called getMySupportAccount");
        final GetMySupportAccountRequest interceptedRequest =
                GetMySupportAccountConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMySupportAccountConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetMySupportAccount",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MySupportAccount/GetMySupportAccount");
        java.util.function.Function<javax.ws.rs.core.Response, GetMySupportAccountResponse>
                transformer =
                        GetMySupportAccountConverter.fromResponse(
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
    public GetMyTrustedUserAgentResponse getMyTrustedUserAgent(
            GetMyTrustedUserAgentRequest request) {
        LOG.trace("Called getMyTrustedUserAgent");
        final GetMyTrustedUserAgentRequest interceptedRequest =
                GetMyTrustedUserAgentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMyTrustedUserAgentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetMyTrustedUserAgent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyTrustedUserAgent/GetMyTrustedUserAgent");
        java.util.function.Function<javax.ws.rs.core.Response, GetMyTrustedUserAgentResponse>
                transformer =
                        GetMyTrustedUserAgentConverter.fromResponse(
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
    public GetMyUserDbCredentialResponse getMyUserDbCredential(
            GetMyUserDbCredentialRequest request) {
        LOG.trace("Called getMyUserDbCredential");
        final GetMyUserDbCredentialRequest interceptedRequest =
                GetMyUserDbCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMyUserDbCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetMyUserDbCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyUserDbCredential/GetMyUserDbCredential");
        java.util.function.Function<javax.ws.rs.core.Response, GetMyUserDbCredentialResponse>
                transformer =
                        GetMyUserDbCredentialConverter.fromResponse(
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
    public GetNetworkPerimeterResponse getNetworkPerimeter(GetNetworkPerimeterRequest request) {
        LOG.trace("Called getNetworkPerimeter");
        final GetNetworkPerimeterRequest interceptedRequest =
                GetNetworkPerimeterConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNetworkPerimeterConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetNetworkPerimeter",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NetworkPerimeter/GetNetworkPerimeter");
        java.util.function.Function<javax.ws.rs.core.Response, GetNetworkPerimeterResponse>
                transformer =
                        GetNetworkPerimeterConverter.fromResponse(
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
    public GetNotificationSettingResponse getNotificationSetting(
            GetNotificationSettingRequest request) {
        LOG.trace("Called getNotificationSetting");
        final GetNotificationSettingRequest interceptedRequest =
                GetNotificationSettingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNotificationSettingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetNotificationSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NotificationSetting/GetNotificationSetting");
        java.util.function.Function<javax.ws.rs.core.Response, GetNotificationSettingResponse>
                transformer =
                        GetNotificationSettingConverter.fromResponse(
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
    public GetOAuth2ClientCredentialResponse getOAuth2ClientCredential(
            GetOAuth2ClientCredentialRequest request) {
        LOG.trace("Called getOAuth2ClientCredential");
        final GetOAuth2ClientCredentialRequest interceptedRequest =
                GetOAuth2ClientCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOAuth2ClientCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetOAuth2ClientCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuth2ClientCredential/GetOAuth2ClientCredential");
        java.util.function.Function<javax.ws.rs.core.Response, GetOAuth2ClientCredentialResponse>
                transformer =
                        GetOAuth2ClientCredentialConverter.fromResponse(
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
    public GetOAuthClientCertificateResponse getOAuthClientCertificate(
            GetOAuthClientCertificateRequest request) {
        LOG.trace("Called getOAuthClientCertificate");
        final GetOAuthClientCertificateRequest interceptedRequest =
                GetOAuthClientCertificateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOAuthClientCertificateConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetOAuthClientCertificate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuthClientCertificate/GetOAuthClientCertificate");
        java.util.function.Function<javax.ws.rs.core.Response, GetOAuthClientCertificateResponse>
                transformer =
                        GetOAuthClientCertificateConverter.fromResponse(
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
    public GetOAuthPartnerCertificateResponse getOAuthPartnerCertificate(
            GetOAuthPartnerCertificateRequest request) {
        LOG.trace("Called getOAuthPartnerCertificate");
        final GetOAuthPartnerCertificateRequest interceptedRequest =
                GetOAuthPartnerCertificateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOAuthPartnerCertificateConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetOAuthPartnerCertificate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuthPartnerCertificate/GetOAuthPartnerCertificate");
        java.util.function.Function<javax.ws.rs.core.Response, GetOAuthPartnerCertificateResponse>
                transformer =
                        GetOAuthPartnerCertificateConverter.fromResponse(
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
    public GetOciConsoleSignOnPolicyConsentResponse getOciConsoleSignOnPolicyConsent(
            GetOciConsoleSignOnPolicyConsentRequest request) {
        LOG.trace("Called getOciConsoleSignOnPolicyConsent");
        final GetOciConsoleSignOnPolicyConsentRequest interceptedRequest =
                GetOciConsoleSignOnPolicyConsentConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOciConsoleSignOnPolicyConsentConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetOciConsoleSignOnPolicyConsent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OciConsoleSignOnPolicyConsent/GetOciConsoleSignOnPolicyConsent");
        java.util.function.Function<
                        javax.ws.rs.core.Response, GetOciConsoleSignOnPolicyConsentResponse>
                transformer =
                        GetOciConsoleSignOnPolicyConsentConverter.fromResponse(
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
    public GetPasswordPolicyResponse getPasswordPolicy(GetPasswordPolicyRequest request) {
        LOG.trace("Called getPasswordPolicy");
        final GetPasswordPolicyRequest interceptedRequest =
                GetPasswordPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPasswordPolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetPasswordPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/PasswordPolicy/GetPasswordPolicy");
        java.util.function.Function<javax.ws.rs.core.Response, GetPasswordPolicyResponse>
                transformer =
                        GetPasswordPolicyConverter.fromResponse(
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
    public GetPolicyResponse getPolicy(GetPolicyRequest request) {
        LOG.trace("Called getPolicy");
        final GetPolicyRequest interceptedRequest = GetPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Policy/GetPolicy");
        java.util.function.Function<javax.ws.rs.core.Response, GetPolicyResponse> transformer =
                GetPolicyConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetRuleResponse getRule(GetRuleRequest request) {
        LOG.trace("Called getRule");
        final GetRuleRequest interceptedRequest = GetRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRuleConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Rule/GetRule");
        java.util.function.Function<javax.ws.rs.core.Response, GetRuleResponse> transformer =
                GetRuleConverter.fromResponse(java.util.Optional.of(serviceDetails));
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

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetSchema",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Schema/GetSchema");
        java.util.function.Function<javax.ws.rs.core.Response, GetSchemaResponse> transformer =
                GetSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetSecurityQuestionResponse getSecurityQuestion(GetSecurityQuestionRequest request) {
        LOG.trace("Called getSecurityQuestion");
        final GetSecurityQuestionRequest interceptedRequest =
                GetSecurityQuestionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSecurityQuestionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetSecurityQuestion",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestion/GetSecurityQuestion");
        java.util.function.Function<javax.ws.rs.core.Response, GetSecurityQuestionResponse>
                transformer =
                        GetSecurityQuestionConverter.fromResponse(
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
    public GetSecurityQuestionSettingResponse getSecurityQuestionSetting(
            GetSecurityQuestionSettingRequest request) {
        LOG.trace("Called getSecurityQuestionSetting");
        final GetSecurityQuestionSettingRequest interceptedRequest =
                GetSecurityQuestionSettingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSecurityQuestionSettingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetSecurityQuestionSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestionSetting/GetSecurityQuestionSetting");
        java.util.function.Function<javax.ws.rs.core.Response, GetSecurityQuestionSettingResponse>
                transformer =
                        GetSecurityQuestionSettingConverter.fromResponse(
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
    public GetSelfRegistrationProfileResponse getSelfRegistrationProfile(
            GetSelfRegistrationProfileRequest request) {
        LOG.trace("Called getSelfRegistrationProfile");
        final GetSelfRegistrationProfileRequest interceptedRequest =
                GetSelfRegistrationProfileConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSelfRegistrationProfileConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetSelfRegistrationProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SelfRegistrationProfile/GetSelfRegistrationProfile");
        java.util.function.Function<javax.ws.rs.core.Response, GetSelfRegistrationProfileResponse>
                transformer =
                        GetSelfRegistrationProfileConverter.fromResponse(
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
    public GetSettingResponse getSetting(GetSettingRequest request) {
        LOG.trace("Called getSetting");
        final GetSettingRequest interceptedRequest = GetSettingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSettingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Setting/GetSetting");
        java.util.function.Function<javax.ws.rs.core.Response, GetSettingResponse> transformer =
                GetSettingConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetSmtpCredentialResponse getSmtpCredential(GetSmtpCredentialRequest request) {
        LOG.trace("Called getSmtpCredential");
        final GetSmtpCredentialRequest interceptedRequest =
                GetSmtpCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSmtpCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetSmtpCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SmtpCredential/GetSmtpCredential");
        java.util.function.Function<javax.ws.rs.core.Response, GetSmtpCredentialResponse>
                transformer =
                        GetSmtpCredentialConverter.fromResponse(
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
    public GetSocialIdentityProviderResponse getSocialIdentityProvider(
            GetSocialIdentityProviderRequest request) {
        LOG.trace("Called getSocialIdentityProvider");
        final GetSocialIdentityProviderRequest interceptedRequest =
                GetSocialIdentityProviderConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSocialIdentityProviderConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetSocialIdentityProvider",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SocialIdentityProvider/GetSocialIdentityProvider");
        java.util.function.Function<javax.ws.rs.core.Response, GetSocialIdentityProviderResponse>
                transformer =
                        GetSocialIdentityProviderConverter.fromResponse(
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
    public GetUserResponse getUser(GetUserRequest request) {
        LOG.trace("Called getUser");
        final GetUserRequest interceptedRequest = GetUserConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetUser",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/User/GetUser");
        java.util.function.Function<javax.ws.rs.core.Response, GetUserResponse> transformer =
                GetUserConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetUserAttributesSettingResponse getUserAttributesSetting(
            GetUserAttributesSettingRequest request) {
        LOG.trace("Called getUserAttributesSetting");
        final GetUserAttributesSettingRequest interceptedRequest =
                GetUserAttributesSettingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserAttributesSettingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetUserAttributesSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserAttributesSetting/GetUserAttributesSetting");
        java.util.function.Function<javax.ws.rs.core.Response, GetUserAttributesSettingResponse>
                transformer =
                        GetUserAttributesSettingConverter.fromResponse(
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
    public GetUserDbCredentialResponse getUserDbCredential(GetUserDbCredentialRequest request) {
        LOG.trace("Called getUserDbCredential");
        final GetUserDbCredentialRequest interceptedRequest =
                GetUserDbCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserDbCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetUserDbCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserDbCredential/GetUserDbCredential");
        java.util.function.Function<javax.ws.rs.core.Response, GetUserDbCredentialResponse>
                transformer =
                        GetUserDbCredentialConverter.fromResponse(
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
    public ListAccountMgmtInfosResponse listAccountMgmtInfos(ListAccountMgmtInfosRequest request) {
        LOG.trace("Called listAccountMgmtInfos");
        final ListAccountMgmtInfosRequest interceptedRequest =
                ListAccountMgmtInfosConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAccountMgmtInfosConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListAccountMgmtInfos",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AccountMgmtInfos/ListAccountMgmtInfos");
        java.util.function.Function<javax.ws.rs.core.Response, ListAccountMgmtInfosResponse>
                transformer =
                        ListAccountMgmtInfosConverter.fromResponse(
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
    public ListAccountRecoverySettingsResponse listAccountRecoverySettings(
            ListAccountRecoverySettingsRequest request) {
        LOG.trace("Called listAccountRecoverySettings");
        final ListAccountRecoverySettingsRequest interceptedRequest =
                ListAccountRecoverySettingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAccountRecoverySettingsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListAccountRecoverySettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AccountRecoverySettings/ListAccountRecoverySettings");
        java.util.function.Function<javax.ws.rs.core.Response, ListAccountRecoverySettingsResponse>
                transformer =
                        ListAccountRecoverySettingsConverter.fromResponse(
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
    public ListApiKeysResponse listApiKeys(ListApiKeysRequest request) {
        LOG.trace("Called listApiKeys");
        final ListApiKeysRequest interceptedRequest =
                ListApiKeysConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListApiKeysConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListApiKeys",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApiKeys/ListApiKeys");
        java.util.function.Function<javax.ws.rs.core.Response, ListApiKeysResponse> transformer =
                ListApiKeysConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListAppRolesResponse listAppRoles(ListAppRolesRequest request) {
        LOG.trace("Called listAppRoles");
        final ListAppRolesRequest interceptedRequest =
                ListAppRolesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAppRolesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListAppRoles",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AppRoles/ListAppRoles");
        java.util.function.Function<javax.ws.rs.core.Response, ListAppRolesResponse> transformer =
                ListAppRolesConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListApprovalWorkflowAssignmentsResponse listApprovalWorkflowAssignments(
            ListApprovalWorkflowAssignmentsRequest request) {
        LOG.trace("Called listApprovalWorkflowAssignments");
        final ListApprovalWorkflowAssignmentsRequest interceptedRequest =
                ListApprovalWorkflowAssignmentsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListApprovalWorkflowAssignmentsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListApprovalWorkflowAssignments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflowAssignments/ListApprovalWorkflowAssignments");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ListApprovalWorkflowAssignmentsResponse>
                transformer =
                        ListApprovalWorkflowAssignmentsConverter.fromResponse(
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
    public ListApprovalWorkflowStepsResponse listApprovalWorkflowSteps(
            ListApprovalWorkflowStepsRequest request) {
        LOG.trace("Called listApprovalWorkflowSteps");
        final ListApprovalWorkflowStepsRequest interceptedRequest =
                ListApprovalWorkflowStepsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListApprovalWorkflowStepsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListApprovalWorkflowSteps",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflowSteps/ListApprovalWorkflowSteps");
        java.util.function.Function<javax.ws.rs.core.Response, ListApprovalWorkflowStepsResponse>
                transformer =
                        ListApprovalWorkflowStepsConverter.fromResponse(
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
    public ListApprovalWorkflowsResponse listApprovalWorkflows(
            ListApprovalWorkflowsRequest request) {
        LOG.trace("Called listApprovalWorkflows");
        final ListApprovalWorkflowsRequest interceptedRequest =
                ListApprovalWorkflowsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListApprovalWorkflowsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListApprovalWorkflows",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflows/ListApprovalWorkflows");
        java.util.function.Function<javax.ws.rs.core.Response, ListApprovalWorkflowsResponse>
                transformer =
                        ListApprovalWorkflowsConverter.fromResponse(
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
    public ListAppsResponse listApps(ListAppsRequest request) {
        LOG.trace("Called listApps");
        final ListAppsRequest interceptedRequest = ListAppsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAppsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListApps",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Apps/ListApps");
        java.util.function.Function<javax.ws.rs.core.Response, ListAppsResponse> transformer =
                ListAppsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListAuthTokensResponse listAuthTokens(ListAuthTokensRequest request) {
        LOG.trace("Called listAuthTokens");
        final ListAuthTokensRequest interceptedRequest =
                ListAuthTokensConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuthTokensConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListAuthTokens",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthTokens/ListAuthTokens");
        java.util.function.Function<javax.ws.rs.core.Response, ListAuthTokensResponse> transformer =
                ListAuthTokensConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListAuthenticationFactorSettingsResponse listAuthenticationFactorSettings(
            ListAuthenticationFactorSettingsRequest request) {
        LOG.trace("Called listAuthenticationFactorSettings");
        final ListAuthenticationFactorSettingsRequest interceptedRequest =
                ListAuthenticationFactorSettingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuthenticationFactorSettingsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListAuthenticationFactorSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthenticationFactorSettings/ListAuthenticationFactorSettings");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ListAuthenticationFactorSettingsResponse>
                transformer =
                        ListAuthenticationFactorSettingsConverter.fromResponse(
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
    public ListBrandingSettingsResponse listBrandingSettings(ListBrandingSettingsRequest request) {
        LOG.trace("Called listBrandingSettings");
        final ListBrandingSettingsRequest interceptedRequest =
                ListBrandingSettingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBrandingSettingsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListBrandingSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/BrandingSettings/ListBrandingSettings");
        java.util.function.Function<javax.ws.rs.core.Response, ListBrandingSettingsResponse>
                transformer =
                        ListBrandingSettingsConverter.fromResponse(
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
    public ListCloudGateMappingsResponse listCloudGateMappings(
            ListCloudGateMappingsRequest request) {
        LOG.trace("Called listCloudGateMappings");
        final ListCloudGateMappingsRequest interceptedRequest =
                ListCloudGateMappingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCloudGateMappingsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListCloudGateMappings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateMappings/ListCloudGateMappings");
        java.util.function.Function<javax.ws.rs.core.Response, ListCloudGateMappingsResponse>
                transformer =
                        ListCloudGateMappingsConverter.fromResponse(
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
    public ListCloudGateServersResponse listCloudGateServers(ListCloudGateServersRequest request) {
        LOG.trace("Called listCloudGateServers");
        final ListCloudGateServersRequest interceptedRequest =
                ListCloudGateServersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCloudGateServersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListCloudGateServers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateServers/ListCloudGateServers");
        java.util.function.Function<javax.ws.rs.core.Response, ListCloudGateServersResponse>
                transformer =
                        ListCloudGateServersConverter.fromResponse(
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
    public ListCloudGatesResponse listCloudGates(ListCloudGatesRequest request) {
        LOG.trace("Called listCloudGates");
        final ListCloudGatesRequest interceptedRequest =
                ListCloudGatesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCloudGatesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListCloudGates",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGates/ListCloudGates");
        java.util.function.Function<javax.ws.rs.core.Response, ListCloudGatesResponse> transformer =
                ListCloudGatesConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListConditionsResponse listConditions(ListConditionsRequest request) {
        LOG.trace("Called listConditions");
        final ListConditionsRequest interceptedRequest =
                ListConditionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListConditionsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListConditions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Condition/ListConditions");
        java.util.function.Function<javax.ws.rs.core.Response, ListConditionsResponse> transformer =
                ListConditionsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListCustomerSecretKeysResponse listCustomerSecretKeys(
            ListCustomerSecretKeysRequest request) {
        LOG.trace("Called listCustomerSecretKeys");
        final ListCustomerSecretKeysRequest interceptedRequest =
                ListCustomerSecretKeysConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCustomerSecretKeysConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListCustomerSecretKeys",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CustomerSecretKeys/ListCustomerSecretKeys");
        java.util.function.Function<javax.ws.rs.core.Response, ListCustomerSecretKeysResponse>
                transformer =
                        ListCustomerSecretKeysConverter.fromResponse(
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
    public ListDynamicResourceGroupsResponse listDynamicResourceGroups(
            ListDynamicResourceGroupsRequest request) {
        LOG.trace("Called listDynamicResourceGroups");
        final ListDynamicResourceGroupsRequest interceptedRequest =
                ListDynamicResourceGroupsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDynamicResourceGroupsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListDynamicResourceGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/DynamicResourceGroups/ListDynamicResourceGroups");
        java.util.function.Function<javax.ws.rs.core.Response, ListDynamicResourceGroupsResponse>
                transformer =
                        ListDynamicResourceGroupsConverter.fromResponse(
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
    public ListGrantsResponse listGrants(ListGrantsRequest request) {
        LOG.trace("Called listGrants");
        final ListGrantsRequest interceptedRequest = ListGrantsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListGrantsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListGrants",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Grants/ListGrants");
        java.util.function.Function<javax.ws.rs.core.Response, ListGrantsResponse> transformer =
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
    public ListGroupsResponse listGroups(ListGroupsRequest request) {
        LOG.trace("Called listGroups");
        final ListGroupsRequest interceptedRequest = ListGroupsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListGroupsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Groups/ListGroups");
        java.util.function.Function<javax.ws.rs.core.Response, ListGroupsResponse> transformer =
                ListGroupsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListIdentityPropagationTrustsResponse listIdentityPropagationTrusts(
            ListIdentityPropagationTrustsRequest request) {
        LOG.trace("Called listIdentityPropagationTrusts");
        final ListIdentityPropagationTrustsRequest interceptedRequest =
                ListIdentityPropagationTrustsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIdentityPropagationTrustsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListIdentityPropagationTrusts",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityPropagationTrusts/ListIdentityPropagationTrusts");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ListIdentityPropagationTrustsResponse>
                transformer =
                        ListIdentityPropagationTrustsConverter.fromResponse(
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
    public ListIdentityProvidersResponse listIdentityProviders(
            ListIdentityProvidersRequest request) {
        LOG.trace("Called listIdentityProviders");
        final ListIdentityProvidersRequest interceptedRequest =
                ListIdentityProvidersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIdentityProvidersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListIdentityProviders",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityProviders/ListIdentityProviders");
        java.util.function.Function<javax.ws.rs.core.Response, ListIdentityProvidersResponse>
                transformer =
                        ListIdentityProvidersConverter.fromResponse(
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
    public ListIdentitySettingsResponse listIdentitySettings(ListIdentitySettingsRequest request) {
        LOG.trace("Called listIdentitySettings");
        final ListIdentitySettingsRequest interceptedRequest =
                ListIdentitySettingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIdentitySettingsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListIdentitySettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentitySettings/ListIdentitySettings");
        java.util.function.Function<javax.ws.rs.core.Response, ListIdentitySettingsResponse>
                transformer =
                        ListIdentitySettingsConverter.fromResponse(
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
    public ListKmsiSettingsResponse listKmsiSettings(ListKmsiSettingsRequest request) {
        LOG.trace("Called listKmsiSettings");
        final ListKmsiSettingsRequest interceptedRequest =
                ListKmsiSettingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListKmsiSettingsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListKmsiSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/KmsiSettings/ListKmsiSettings");
        java.util.function.Function<javax.ws.rs.core.Response, ListKmsiSettingsResponse>
                transformer =
                        ListKmsiSettingsConverter.fromResponse(
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
    public ListMyApiKeysResponse listMyApiKeys(ListMyApiKeysRequest request) {
        LOG.trace("Called listMyApiKeys");
        final ListMyApiKeysRequest interceptedRequest =
                ListMyApiKeysConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyApiKeysConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMyApiKeys",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyApiKeys/ListMyApiKeys");
        java.util.function.Function<javax.ws.rs.core.Response, ListMyApiKeysResponse> transformer =
                ListMyApiKeysConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListMyAppsResponse listMyApps(ListMyAppsRequest request) {
        LOG.trace("Called listMyApps");
        final ListMyAppsRequest interceptedRequest = ListMyAppsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyAppsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMyApps",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyApps/ListMyApps");
        java.util.function.Function<javax.ws.rs.core.Response, ListMyAppsResponse> transformer =
                ListMyAppsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListMyAuthTokensResponse listMyAuthTokens(ListMyAuthTokensRequest request) {
        LOG.trace("Called listMyAuthTokens");
        final ListMyAuthTokensRequest interceptedRequest =
                ListMyAuthTokensConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyAuthTokensConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMyAuthTokens",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyAuthTokens/ListMyAuthTokens");
        java.util.function.Function<javax.ws.rs.core.Response, ListMyAuthTokensResponse>
                transformer =
                        ListMyAuthTokensConverter.fromResponse(
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
    public ListMyCompletedApprovalsResponse listMyCompletedApprovals(
            ListMyCompletedApprovalsRequest request) {
        LOG.trace("Called listMyCompletedApprovals");
        final ListMyCompletedApprovalsRequest interceptedRequest =
                ListMyCompletedApprovalsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyCompletedApprovalsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMyCompletedApprovals",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyCompletedApprovals/ListMyCompletedApprovals");
        java.util.function.Function<javax.ws.rs.core.Response, ListMyCompletedApprovalsResponse>
                transformer =
                        ListMyCompletedApprovalsConverter.fromResponse(
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
    public ListMyCustomerSecretKeysResponse listMyCustomerSecretKeys(
            ListMyCustomerSecretKeysRequest request) {
        LOG.trace("Called listMyCustomerSecretKeys");
        final ListMyCustomerSecretKeysRequest interceptedRequest =
                ListMyCustomerSecretKeysConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyCustomerSecretKeysConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMyCustomerSecretKeys",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyCustomerSecretKeys/ListMyCustomerSecretKeys");
        java.util.function.Function<javax.ws.rs.core.Response, ListMyCustomerSecretKeysResponse>
                transformer =
                        ListMyCustomerSecretKeysConverter.fromResponse(
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
    public ListMyDevicesResponse listMyDevices(ListMyDevicesRequest request) {
        LOG.trace("Called listMyDevices");
        final ListMyDevicesRequest interceptedRequest =
                ListMyDevicesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyDevicesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMyDevices",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyDevices/ListMyDevices");
        java.util.function.Function<javax.ws.rs.core.Response, ListMyDevicesResponse> transformer =
                ListMyDevicesConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListMyGroupsResponse listMyGroups(ListMyGroupsRequest request) {
        LOG.trace("Called listMyGroups");
        final ListMyGroupsRequest interceptedRequest =
                ListMyGroupsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyGroupsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMyGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyGroups/ListMyGroups");
        java.util.function.Function<javax.ws.rs.core.Response, ListMyGroupsResponse> transformer =
                ListMyGroupsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListMyOAuth2ClientCredentialsResponse listMyOAuth2ClientCredentials(
            ListMyOAuth2ClientCredentialsRequest request) {
        LOG.trace("Called listMyOAuth2ClientCredentials");
        final ListMyOAuth2ClientCredentialsRequest interceptedRequest =
                ListMyOAuth2ClientCredentialsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyOAuth2ClientCredentialsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMyOAuth2ClientCredentials",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyOAuth2ClientCredentials/ListMyOAuth2ClientCredentials");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ListMyOAuth2ClientCredentialsResponse>
                transformer =
                        ListMyOAuth2ClientCredentialsConverter.fromResponse(
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
    public ListMyPendingApprovalsResponse listMyPendingApprovals(
            ListMyPendingApprovalsRequest request) {
        LOG.trace("Called listMyPendingApprovals");
        final ListMyPendingApprovalsRequest interceptedRequest =
                ListMyPendingApprovalsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyPendingApprovalsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMyPendingApprovals",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyPendingApprovals/ListMyPendingApprovals");
        java.util.function.Function<javax.ws.rs.core.Response, ListMyPendingApprovalsResponse>
                transformer =
                        ListMyPendingApprovalsConverter.fromResponse(
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
    public ListMyRequestableGroupsResponse listMyRequestableGroups(
            ListMyRequestableGroupsRequest request) {
        LOG.trace("Called listMyRequestableGroups");
        final ListMyRequestableGroupsRequest interceptedRequest =
                ListMyRequestableGroupsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyRequestableGroupsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMyRequestableGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyRequestableGroups/ListMyRequestableGroups");
        java.util.function.Function<javax.ws.rs.core.Response, ListMyRequestableGroupsResponse>
                transformer =
                        ListMyRequestableGroupsConverter.fromResponse(
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
    public ListMyRequestsResponse listMyRequests(ListMyRequestsRequest request) {
        LOG.trace("Called listMyRequests");
        final ListMyRequestsRequest interceptedRequest =
                ListMyRequestsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyRequestsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMyRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyRequests/ListMyRequests");
        java.util.function.Function<javax.ws.rs.core.Response, ListMyRequestsResponse> transformer =
                ListMyRequestsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListMySmtpCredentialsResponse listMySmtpCredentials(
            ListMySmtpCredentialsRequest request) {
        LOG.trace("Called listMySmtpCredentials");
        final ListMySmtpCredentialsRequest interceptedRequest =
                ListMySmtpCredentialsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMySmtpCredentialsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMySmtpCredentials",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MySmtpCredentials/ListMySmtpCredentials");
        java.util.function.Function<javax.ws.rs.core.Response, ListMySmtpCredentialsResponse>
                transformer =
                        ListMySmtpCredentialsConverter.fromResponse(
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
    public ListMySupportAccountsResponse listMySupportAccounts(
            ListMySupportAccountsRequest request) {
        LOG.trace("Called listMySupportAccounts");
        final ListMySupportAccountsRequest interceptedRequest =
                ListMySupportAccountsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMySupportAccountsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMySupportAccounts",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MySupportAccounts/ListMySupportAccounts");
        java.util.function.Function<javax.ws.rs.core.Response, ListMySupportAccountsResponse>
                transformer =
                        ListMySupportAccountsConverter.fromResponse(
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
    public ListMyTrustedUserAgentsResponse listMyTrustedUserAgents(
            ListMyTrustedUserAgentsRequest request) {
        LOG.trace("Called listMyTrustedUserAgents");
        final ListMyTrustedUserAgentsRequest interceptedRequest =
                ListMyTrustedUserAgentsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyTrustedUserAgentsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMyTrustedUserAgents",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyTrustedUserAgents/ListMyTrustedUserAgents");
        java.util.function.Function<javax.ws.rs.core.Response, ListMyTrustedUserAgentsResponse>
                transformer =
                        ListMyTrustedUserAgentsConverter.fromResponse(
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
    public ListMyUserDbCredentialsResponse listMyUserDbCredentials(
            ListMyUserDbCredentialsRequest request) {
        LOG.trace("Called listMyUserDbCredentials");
        final ListMyUserDbCredentialsRequest interceptedRequest =
                ListMyUserDbCredentialsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyUserDbCredentialsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMyUserDbCredentials",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyUserDbCredentials/ListMyUserDbCredentials");
        java.util.function.Function<javax.ws.rs.core.Response, ListMyUserDbCredentialsResponse>
                transformer =
                        ListMyUserDbCredentialsConverter.fromResponse(
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
    public ListNetworkPerimetersResponse listNetworkPerimeters(
            ListNetworkPerimetersRequest request) {
        LOG.trace("Called listNetworkPerimeters");
        final ListNetworkPerimetersRequest interceptedRequest =
                ListNetworkPerimetersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNetworkPerimetersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListNetworkPerimeters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NetworkPerimeters/ListNetworkPerimeters");
        java.util.function.Function<javax.ws.rs.core.Response, ListNetworkPerimetersResponse>
                transformer =
                        ListNetworkPerimetersConverter.fromResponse(
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
    public ListNotificationSettingsResponse listNotificationSettings(
            ListNotificationSettingsRequest request) {
        LOG.trace("Called listNotificationSettings");
        final ListNotificationSettingsRequest interceptedRequest =
                ListNotificationSettingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNotificationSettingsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListNotificationSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NotificationSettings/ListNotificationSettings");
        java.util.function.Function<javax.ws.rs.core.Response, ListNotificationSettingsResponse>
                transformer =
                        ListNotificationSettingsConverter.fromResponse(
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
    public ListOAuth2ClientCredentialsResponse listOAuth2ClientCredentials(
            ListOAuth2ClientCredentialsRequest request) {
        LOG.trace("Called listOAuth2ClientCredentials");
        final ListOAuth2ClientCredentialsRequest interceptedRequest =
                ListOAuth2ClientCredentialsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOAuth2ClientCredentialsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListOAuth2ClientCredentials",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuth2ClientCredentials/ListOAuth2ClientCredentials");
        java.util.function.Function<javax.ws.rs.core.Response, ListOAuth2ClientCredentialsResponse>
                transformer =
                        ListOAuth2ClientCredentialsConverter.fromResponse(
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
    public ListOAuthClientCertificatesResponse listOAuthClientCertificates(
            ListOAuthClientCertificatesRequest request) {
        LOG.trace("Called listOAuthClientCertificates");
        final ListOAuthClientCertificatesRequest interceptedRequest =
                ListOAuthClientCertificatesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOAuthClientCertificatesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListOAuthClientCertificates",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuthClientCertificates/ListOAuthClientCertificates");
        java.util.function.Function<javax.ws.rs.core.Response, ListOAuthClientCertificatesResponse>
                transformer =
                        ListOAuthClientCertificatesConverter.fromResponse(
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
    public ListOAuthPartnerCertificatesResponse listOAuthPartnerCertificates(
            ListOAuthPartnerCertificatesRequest request) {
        LOG.trace("Called listOAuthPartnerCertificates");
        final ListOAuthPartnerCertificatesRequest interceptedRequest =
                ListOAuthPartnerCertificatesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOAuthPartnerCertificatesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListOAuthPartnerCertificates",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuthPartnerCertificates/ListOAuthPartnerCertificates");
        java.util.function.Function<javax.ws.rs.core.Response, ListOAuthPartnerCertificatesResponse>
                transformer =
                        ListOAuthPartnerCertificatesConverter.fromResponse(
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
    public ListOciConsoleSignOnPolicyConsentsResponse listOciConsoleSignOnPolicyConsents(
            ListOciConsoleSignOnPolicyConsentsRequest request) {
        LOG.trace("Called listOciConsoleSignOnPolicyConsents");
        final ListOciConsoleSignOnPolicyConsentsRequest interceptedRequest =
                ListOciConsoleSignOnPolicyConsentsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOciConsoleSignOnPolicyConsentsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListOciConsoleSignOnPolicyConsents",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OciConsoleSignOnPolicyConsent/ListOciConsoleSignOnPolicyConsents");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ListOciConsoleSignOnPolicyConsentsResponse>
                transformer =
                        ListOciConsoleSignOnPolicyConsentsConverter.fromResponse(
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
    public ListPasswordPoliciesResponse listPasswordPolicies(ListPasswordPoliciesRequest request) {
        LOG.trace("Called listPasswordPolicies");
        final ListPasswordPoliciesRequest interceptedRequest =
                ListPasswordPoliciesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPasswordPoliciesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListPasswordPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/PasswordPolicies/ListPasswordPolicies");
        java.util.function.Function<javax.ws.rs.core.Response, ListPasswordPoliciesResponse>
                transformer =
                        ListPasswordPoliciesConverter.fromResponse(
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
    public ListPoliciesResponse listPolicies(ListPoliciesRequest request) {
        LOG.trace("Called listPolicies");
        final ListPoliciesRequest interceptedRequest =
                ListPoliciesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPoliciesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Policy/ListPolicies");
        java.util.function.Function<javax.ws.rs.core.Response, ListPoliciesResponse> transformer =
                ListPoliciesConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListResourceTypeSchemaAttributesResponse listResourceTypeSchemaAttributes(
            ListResourceTypeSchemaAttributesRequest request) {
        LOG.trace("Called listResourceTypeSchemaAttributes");
        final ListResourceTypeSchemaAttributesRequest interceptedRequest =
                ListResourceTypeSchemaAttributesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResourceTypeSchemaAttributesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListResourceTypeSchemaAttributes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ResourceTypeSchemaAttributes/ListResourceTypeSchemaAttributes");
        java.util.function.Function<
                        javax.ws.rs.core.Response, ListResourceTypeSchemaAttributesResponse>
                transformer =
                        ListResourceTypeSchemaAttributesConverter.fromResponse(
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
    public ListRulesResponse listRules(ListRulesRequest request) {
        LOG.trace("Called listRules");
        final ListRulesRequest interceptedRequest = ListRulesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRulesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Rule/ListRules");
        java.util.function.Function<javax.ws.rs.core.Response, ListRulesResponse> transformer =
                ListRulesConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListSchemas",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Schemas/ListSchemas");
        java.util.function.Function<javax.ws.rs.core.Response, ListSchemasResponse> transformer =
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
    public ListSecurityQuestionSettingsResponse listSecurityQuestionSettings(
            ListSecurityQuestionSettingsRequest request) {
        LOG.trace("Called listSecurityQuestionSettings");
        final ListSecurityQuestionSettingsRequest interceptedRequest =
                ListSecurityQuestionSettingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSecurityQuestionSettingsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListSecurityQuestionSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestionSettings/ListSecurityQuestionSettings");
        java.util.function.Function<javax.ws.rs.core.Response, ListSecurityQuestionSettingsResponse>
                transformer =
                        ListSecurityQuestionSettingsConverter.fromResponse(
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
    public ListSecurityQuestionsResponse listSecurityQuestions(
            ListSecurityQuestionsRequest request) {
        LOG.trace("Called listSecurityQuestions");
        final ListSecurityQuestionsRequest interceptedRequest =
                ListSecurityQuestionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSecurityQuestionsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListSecurityQuestions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestions/ListSecurityQuestions");
        java.util.function.Function<javax.ws.rs.core.Response, ListSecurityQuestionsResponse>
                transformer =
                        ListSecurityQuestionsConverter.fromResponse(
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
    public ListSelfRegistrationProfilesResponse listSelfRegistrationProfiles(
            ListSelfRegistrationProfilesRequest request) {
        LOG.trace("Called listSelfRegistrationProfiles");
        final ListSelfRegistrationProfilesRequest interceptedRequest =
                ListSelfRegistrationProfilesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSelfRegistrationProfilesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListSelfRegistrationProfiles",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SelfRegistrationProfiles/ListSelfRegistrationProfiles");
        java.util.function.Function<javax.ws.rs.core.Response, ListSelfRegistrationProfilesResponse>
                transformer =
                        ListSelfRegistrationProfilesConverter.fromResponse(
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
    public ListSettingsResponse listSettings(ListSettingsRequest request) {
        LOG.trace("Called listSettings");
        final ListSettingsRequest interceptedRequest =
                ListSettingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSettingsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Settings/ListSettings");
        java.util.function.Function<javax.ws.rs.core.Response, ListSettingsResponse> transformer =
                ListSettingsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListSmtpCredentialsResponse listSmtpCredentials(ListSmtpCredentialsRequest request) {
        LOG.trace("Called listSmtpCredentials");
        final ListSmtpCredentialsRequest interceptedRequest =
                ListSmtpCredentialsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSmtpCredentialsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListSmtpCredentials",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SmtpCredentials/ListSmtpCredentials");
        java.util.function.Function<javax.ws.rs.core.Response, ListSmtpCredentialsResponse>
                transformer =
                        ListSmtpCredentialsConverter.fromResponse(
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
    public ListSocialIdentityProvidersResponse listSocialIdentityProviders(
            ListSocialIdentityProvidersRequest request) {
        LOG.trace("Called listSocialIdentityProviders");
        final ListSocialIdentityProvidersRequest interceptedRequest =
                ListSocialIdentityProvidersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSocialIdentityProvidersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListSocialIdentityProviders",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SocialIdentityProviders/ListSocialIdentityProviders");
        java.util.function.Function<javax.ws.rs.core.Response, ListSocialIdentityProvidersResponse>
                transformer =
                        ListSocialIdentityProvidersConverter.fromResponse(
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
    public ListUserAttributesSettingsResponse listUserAttributesSettings(
            ListUserAttributesSettingsRequest request) {
        LOG.trace("Called listUserAttributesSettings");
        final ListUserAttributesSettingsRequest interceptedRequest =
                ListUserAttributesSettingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUserAttributesSettingsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListUserAttributesSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserAttributesSetting/ListUserAttributesSettings");
        java.util.function.Function<javax.ws.rs.core.Response, ListUserAttributesSettingsResponse>
                transformer =
                        ListUserAttributesSettingsConverter.fromResponse(
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
    public ListUserDbCredentialsResponse listUserDbCredentials(
            ListUserDbCredentialsRequest request) {
        LOG.trace("Called listUserDbCredentials");
        final ListUserDbCredentialsRequest interceptedRequest =
                ListUserDbCredentialsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUserDbCredentialsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListUserDbCredentials",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserDbCredentials/ListUserDbCredentials");
        java.util.function.Function<javax.ws.rs.core.Response, ListUserDbCredentialsResponse>
                transformer =
                        ListUserDbCredentialsConverter.fromResponse(
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
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListUsers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Users/ListUsers");
        java.util.function.Function<javax.ws.rs.core.Response, ListUsersResponse> transformer =
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
    public PatchAccountRecoverySettingResponse patchAccountRecoverySetting(
            PatchAccountRecoverySettingRequest request) {
        LOG.trace("Called patchAccountRecoverySetting");
        final PatchAccountRecoverySettingRequest interceptedRequest =
                PatchAccountRecoverySettingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchAccountRecoverySettingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchAccountRecoverySetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AccountRecoverySetting/PatchAccountRecoverySetting");
        java.util.function.Function<javax.ws.rs.core.Response, PatchAccountRecoverySettingResponse>
                transformer =
                        PatchAccountRecoverySettingConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchApiKeyResponse patchApiKey(PatchApiKeyRequest request) {
        LOG.trace("Called patchApiKey");
        final PatchApiKeyRequest interceptedRequest =
                PatchApiKeyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchApiKeyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchApiKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApiKey/PatchApiKey");
        java.util.function.Function<javax.ws.rs.core.Response, PatchApiKeyResponse> transformer =
                PatchApiKeyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchAppResponse patchApp(PatchAppRequest request) {
        LOG.trace("Called patchApp");
        final PatchAppRequest interceptedRequest = PatchAppConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchAppConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchApp",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/App/PatchApp");
        java.util.function.Function<javax.ws.rs.core.Response, PatchAppResponse> transformer =
                PatchAppConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchAppRoleResponse patchAppRole(PatchAppRoleRequest request) {
        LOG.trace("Called patchAppRole");
        final PatchAppRoleRequest interceptedRequest =
                PatchAppRoleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchAppRoleConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchAppRole",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AppRole/PatchAppRole");
        java.util.function.Function<javax.ws.rs.core.Response, PatchAppRoleResponse> transformer =
                PatchAppRoleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchApprovalWorkflowResponse patchApprovalWorkflow(
            PatchApprovalWorkflowRequest request) {
        LOG.trace("Called patchApprovalWorkflow");
        final PatchApprovalWorkflowRequest interceptedRequest =
                PatchApprovalWorkflowConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchApprovalWorkflowConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchApprovalWorkflow",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflow/PatchApprovalWorkflow");
        java.util.function.Function<javax.ws.rs.core.Response, PatchApprovalWorkflowResponse>
                transformer =
                        PatchApprovalWorkflowConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchApprovalWorkflowStepResponse patchApprovalWorkflowStep(
            PatchApprovalWorkflowStepRequest request) {
        LOG.trace("Called patchApprovalWorkflowStep");
        final PatchApprovalWorkflowStepRequest interceptedRequest =
                PatchApprovalWorkflowStepConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchApprovalWorkflowStepConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchApprovalWorkflowStep",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflowStep/PatchApprovalWorkflowStep");
        java.util.function.Function<javax.ws.rs.core.Response, PatchApprovalWorkflowStepResponse>
                transformer =
                        PatchApprovalWorkflowStepConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchAuthTokenResponse patchAuthToken(PatchAuthTokenRequest request) {
        LOG.trace("Called patchAuthToken");
        final PatchAuthTokenRequest interceptedRequest =
                PatchAuthTokenConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchAuthTokenConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchAuthToken",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthToken/PatchAuthToken");
        java.util.function.Function<javax.ws.rs.core.Response, PatchAuthTokenResponse> transformer =
                PatchAuthTokenConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchCloudGateResponse patchCloudGate(PatchCloudGateRequest request) {
        LOG.trace("Called patchCloudGate");
        final PatchCloudGateRequest interceptedRequest =
                PatchCloudGateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchCloudGateConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchCloudGate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGate/PatchCloudGate");
        java.util.function.Function<javax.ws.rs.core.Response, PatchCloudGateResponse> transformer =
                PatchCloudGateConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchCloudGateMappingResponse patchCloudGateMapping(
            PatchCloudGateMappingRequest request) {
        LOG.trace("Called patchCloudGateMapping");
        final PatchCloudGateMappingRequest interceptedRequest =
                PatchCloudGateMappingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchCloudGateMappingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchCloudGateMapping",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateMapping/PatchCloudGateMapping");
        java.util.function.Function<javax.ws.rs.core.Response, PatchCloudGateMappingResponse>
                transformer =
                        PatchCloudGateMappingConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchCloudGateServerResponse patchCloudGateServer(PatchCloudGateServerRequest request) {
        LOG.trace("Called patchCloudGateServer");
        final PatchCloudGateServerRequest interceptedRequest =
                PatchCloudGateServerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchCloudGateServerConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchCloudGateServer",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateServer/PatchCloudGateServer");
        java.util.function.Function<javax.ws.rs.core.Response, PatchCloudGateServerResponse>
                transformer =
                        PatchCloudGateServerConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchConditionResponse patchCondition(PatchConditionRequest request) {
        LOG.trace("Called patchCondition");
        final PatchConditionRequest interceptedRequest =
                PatchConditionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchConditionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchCondition",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Condition/PatchCondition");
        java.util.function.Function<javax.ws.rs.core.Response, PatchConditionResponse> transformer =
                PatchConditionConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchCustomerSecretKeyResponse patchCustomerSecretKey(
            PatchCustomerSecretKeyRequest request) {
        LOG.trace("Called patchCustomerSecretKey");
        final PatchCustomerSecretKeyRequest interceptedRequest =
                PatchCustomerSecretKeyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchCustomerSecretKeyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchCustomerSecretKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CustomerSecretKey/PatchCustomerSecretKey");
        java.util.function.Function<javax.ws.rs.core.Response, PatchCustomerSecretKeyResponse>
                transformer =
                        PatchCustomerSecretKeyConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchDynamicResourceGroupResponse patchDynamicResourceGroup(
            PatchDynamicResourceGroupRequest request) {
        LOG.trace("Called patchDynamicResourceGroup");
        final PatchDynamicResourceGroupRequest interceptedRequest =
                PatchDynamicResourceGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchDynamicResourceGroupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchDynamicResourceGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/DynamicResourceGroup/PatchDynamicResourceGroup");
        java.util.function.Function<javax.ws.rs.core.Response, PatchDynamicResourceGroupResponse>
                transformer =
                        PatchDynamicResourceGroupConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchGrantResponse patchGrant(PatchGrantRequest request) {
        LOG.trace("Called patchGrant");
        final PatchGrantRequest interceptedRequest = PatchGrantConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchGrantConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchGrant",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Grant/PatchGrant");
        java.util.function.Function<javax.ws.rs.core.Response, PatchGrantResponse> transformer =
                PatchGrantConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchGroupResponse patchGroup(PatchGroupRequest request) {
        LOG.trace("Called patchGroup");
        final PatchGroupRequest interceptedRequest = PatchGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchGroupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Group/PatchGroup");
        java.util.function.Function<javax.ws.rs.core.Response, PatchGroupResponse> transformer =
                PatchGroupConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchIdentityPropagationTrustResponse patchIdentityPropagationTrust(
            PatchIdentityPropagationTrustRequest request) {
        LOG.trace("Called patchIdentityPropagationTrust");
        final PatchIdentityPropagationTrustRequest interceptedRequest =
                PatchIdentityPropagationTrustConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchIdentityPropagationTrustConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchIdentityPropagationTrust",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityPropagationTrust/PatchIdentityPropagationTrust");
        java.util.function.Function<
                        javax.ws.rs.core.Response, PatchIdentityPropagationTrustResponse>
                transformer =
                        PatchIdentityPropagationTrustConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchIdentityProviderResponse patchIdentityProvider(
            PatchIdentityProviderRequest request) {
        LOG.trace("Called patchIdentityProvider");
        final PatchIdentityProviderRequest interceptedRequest =
                PatchIdentityProviderConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchIdentityProviderConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchIdentityProvider",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityProvider/PatchIdentityProvider");
        java.util.function.Function<javax.ws.rs.core.Response, PatchIdentityProviderResponse>
                transformer =
                        PatchIdentityProviderConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchIdentitySettingResponse patchIdentitySetting(PatchIdentitySettingRequest request) {
        LOG.trace("Called patchIdentitySetting");
        final PatchIdentitySettingRequest interceptedRequest =
                PatchIdentitySettingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchIdentitySettingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchIdentitySetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentitySetting/PatchIdentitySetting");
        java.util.function.Function<javax.ws.rs.core.Response, PatchIdentitySettingResponse>
                transformer =
                        PatchIdentitySettingConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchKmsiSettingResponse patchKmsiSetting(PatchKmsiSettingRequest request) {
        LOG.trace("Called patchKmsiSetting");
        final PatchKmsiSettingRequest interceptedRequest =
                PatchKmsiSettingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchKmsiSettingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchKmsiSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/KmsiSetting/PatchKmsiSetting");
        java.util.function.Function<javax.ws.rs.core.Response, PatchKmsiSettingResponse>
                transformer =
                        PatchKmsiSettingConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchMeResponse patchMe(PatchMeRequest request) {
        LOG.trace("Called patchMe");
        final PatchMeRequest interceptedRequest = PatchMeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchMeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchMe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Me/PatchMe");
        java.util.function.Function<javax.ws.rs.core.Response, PatchMeResponse> transformer =
                PatchMeConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchMyApiKeyResponse patchMyApiKey(PatchMyApiKeyRequest request) {
        LOG.trace("Called patchMyApiKey");
        final PatchMyApiKeyRequest interceptedRequest =
                PatchMyApiKeyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchMyApiKeyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchMyApiKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyApiKey/PatchMyApiKey");
        java.util.function.Function<javax.ws.rs.core.Response, PatchMyApiKeyResponse> transformer =
                PatchMyApiKeyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchMyAuthTokenResponse patchMyAuthToken(PatchMyAuthTokenRequest request) {
        LOG.trace("Called patchMyAuthToken");
        final PatchMyAuthTokenRequest interceptedRequest =
                PatchMyAuthTokenConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchMyAuthTokenConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchMyAuthToken",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyAuthToken/PatchMyAuthToken");
        java.util.function.Function<javax.ws.rs.core.Response, PatchMyAuthTokenResponse>
                transformer =
                        PatchMyAuthTokenConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchMyCustomerSecretKeyResponse patchMyCustomerSecretKey(
            PatchMyCustomerSecretKeyRequest request) {
        LOG.trace("Called patchMyCustomerSecretKey");
        final PatchMyCustomerSecretKeyRequest interceptedRequest =
                PatchMyCustomerSecretKeyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchMyCustomerSecretKeyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchMyCustomerSecretKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyCustomerSecretKey/PatchMyCustomerSecretKey");
        java.util.function.Function<javax.ws.rs.core.Response, PatchMyCustomerSecretKeyResponse>
                transformer =
                        PatchMyCustomerSecretKeyConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchMyDeviceResponse patchMyDevice(PatchMyDeviceRequest request) {
        LOG.trace("Called patchMyDevice");
        final PatchMyDeviceRequest interceptedRequest =
                PatchMyDeviceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchMyDeviceConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchMyDevice",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyDevice/PatchMyDevice");
        java.util.function.Function<javax.ws.rs.core.Response, PatchMyDeviceResponse> transformer =
                PatchMyDeviceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchMyOAuth2ClientCredentialResponse patchMyOAuth2ClientCredential(
            PatchMyOAuth2ClientCredentialRequest request) {
        LOG.trace("Called patchMyOAuth2ClientCredential");
        final PatchMyOAuth2ClientCredentialRequest interceptedRequest =
                PatchMyOAuth2ClientCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchMyOAuth2ClientCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchMyOAuth2ClientCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyOAuth2ClientCredential/PatchMyOAuth2ClientCredential");
        java.util.function.Function<
                        javax.ws.rs.core.Response, PatchMyOAuth2ClientCredentialResponse>
                transformer =
                        PatchMyOAuth2ClientCredentialConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchMyPendingApprovalResponse patchMyPendingApproval(
            PatchMyPendingApprovalRequest request) {
        LOG.trace("Called patchMyPendingApproval");
        final PatchMyPendingApprovalRequest interceptedRequest =
                PatchMyPendingApprovalConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchMyPendingApprovalConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchMyPendingApproval",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyPendingApproval/PatchMyPendingApproval");
        java.util.function.Function<javax.ws.rs.core.Response, PatchMyPendingApprovalResponse>
                transformer =
                        PatchMyPendingApprovalConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchMyRequestResponse patchMyRequest(PatchMyRequestRequest request) {
        LOG.trace("Called patchMyRequest");
        final PatchMyRequestRequest interceptedRequest =
                PatchMyRequestConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchMyRequestConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchMyRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyRequest/PatchMyRequest");
        java.util.function.Function<javax.ws.rs.core.Response, PatchMyRequestResponse> transformer =
                PatchMyRequestConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchMySmtpCredentialResponse patchMySmtpCredential(
            PatchMySmtpCredentialRequest request) {
        LOG.trace("Called patchMySmtpCredential");
        final PatchMySmtpCredentialRequest interceptedRequest =
                PatchMySmtpCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchMySmtpCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchMySmtpCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MySmtpCredential/PatchMySmtpCredential");
        java.util.function.Function<javax.ws.rs.core.Response, PatchMySmtpCredentialResponse>
                transformer =
                        PatchMySmtpCredentialConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchNetworkPerimeterResponse patchNetworkPerimeter(
            PatchNetworkPerimeterRequest request) {
        LOG.trace("Called patchNetworkPerimeter");
        final PatchNetworkPerimeterRequest interceptedRequest =
                PatchNetworkPerimeterConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchNetworkPerimeterConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchNetworkPerimeter",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NetworkPerimeter/PatchNetworkPerimeter");
        java.util.function.Function<javax.ws.rs.core.Response, PatchNetworkPerimeterResponse>
                transformer =
                        PatchNetworkPerimeterConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchOAuth2ClientCredentialResponse patchOAuth2ClientCredential(
            PatchOAuth2ClientCredentialRequest request) {
        LOG.trace("Called patchOAuth2ClientCredential");
        final PatchOAuth2ClientCredentialRequest interceptedRequest =
                PatchOAuth2ClientCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchOAuth2ClientCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchOAuth2ClientCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuth2ClientCredential/PatchOAuth2ClientCredential");
        java.util.function.Function<javax.ws.rs.core.Response, PatchOAuth2ClientCredentialResponse>
                transformer =
                        PatchOAuth2ClientCredentialConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchPasswordPolicyResponse patchPasswordPolicy(PatchPasswordPolicyRequest request) {
        LOG.trace("Called patchPasswordPolicy");
        final PatchPasswordPolicyRequest interceptedRequest =
                PatchPasswordPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchPasswordPolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchPasswordPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/PasswordPolicy/PatchPasswordPolicy");
        java.util.function.Function<javax.ws.rs.core.Response, PatchPasswordPolicyResponse>
                transformer =
                        PatchPasswordPolicyConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchPolicyResponse patchPolicy(PatchPolicyRequest request) {
        LOG.trace("Called patchPolicy");
        final PatchPolicyRequest interceptedRequest =
                PatchPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchPolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Policy/PatchPolicy");
        java.util.function.Function<javax.ws.rs.core.Response, PatchPolicyResponse> transformer =
                PatchPolicyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchRuleResponse patchRule(PatchRuleRequest request) {
        LOG.trace("Called patchRule");
        final PatchRuleRequest interceptedRequest = PatchRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchRuleConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Rule/PatchRule");
        java.util.function.Function<javax.ws.rs.core.Response, PatchRuleResponse> transformer =
                PatchRuleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchSchemaResponse patchSchema(PatchSchemaRequest request) {
        LOG.trace("Called patchSchema");
        final PatchSchemaRequest interceptedRequest =
                PatchSchemaConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchSchemaConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchSchema",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Schema/PatchSchema");
        java.util.function.Function<javax.ws.rs.core.Response, PatchSchemaResponse> transformer =
                PatchSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchSecurityQuestionResponse patchSecurityQuestion(
            PatchSecurityQuestionRequest request) {
        LOG.trace("Called patchSecurityQuestion");
        final PatchSecurityQuestionRequest interceptedRequest =
                PatchSecurityQuestionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchSecurityQuestionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchSecurityQuestion",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestion/PatchSecurityQuestion");
        java.util.function.Function<javax.ws.rs.core.Response, PatchSecurityQuestionResponse>
                transformer =
                        PatchSecurityQuestionConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchSecurityQuestionSettingResponse patchSecurityQuestionSetting(
            PatchSecurityQuestionSettingRequest request) {
        LOG.trace("Called patchSecurityQuestionSetting");
        final PatchSecurityQuestionSettingRequest interceptedRequest =
                PatchSecurityQuestionSettingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchSecurityQuestionSettingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchSecurityQuestionSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestionSetting/PatchSecurityQuestionSetting");
        java.util.function.Function<javax.ws.rs.core.Response, PatchSecurityQuestionSettingResponse>
                transformer =
                        PatchSecurityQuestionSettingConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchSelfRegistrationProfileResponse patchSelfRegistrationProfile(
            PatchSelfRegistrationProfileRequest request) {
        LOG.trace("Called patchSelfRegistrationProfile");
        final PatchSelfRegistrationProfileRequest interceptedRequest =
                PatchSelfRegistrationProfileConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchSelfRegistrationProfileConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchSelfRegistrationProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SelfRegistrationProfile/PatchSelfRegistrationProfile");
        java.util.function.Function<javax.ws.rs.core.Response, PatchSelfRegistrationProfileResponse>
                transformer =
                        PatchSelfRegistrationProfileConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchSettingResponse patchSetting(PatchSettingRequest request) {
        LOG.trace("Called patchSetting");
        final PatchSettingRequest interceptedRequest =
                PatchSettingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchSettingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Setting/PatchSetting");
        java.util.function.Function<javax.ws.rs.core.Response, PatchSettingResponse> transformer =
                PatchSettingConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchSmtpCredentialResponse patchSmtpCredential(PatchSmtpCredentialRequest request) {
        LOG.trace("Called patchSmtpCredential");
        final PatchSmtpCredentialRequest interceptedRequest =
                PatchSmtpCredentialConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchSmtpCredentialConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchSmtpCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SmtpCredential/PatchSmtpCredential");
        java.util.function.Function<javax.ws.rs.core.Response, PatchSmtpCredentialResponse>
                transformer =
                        PatchSmtpCredentialConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchSocialIdentityProviderResponse patchSocialIdentityProvider(
            PatchSocialIdentityProviderRequest request) {
        LOG.trace("Called patchSocialIdentityProvider");
        final PatchSocialIdentityProviderRequest interceptedRequest =
                PatchSocialIdentityProviderConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchSocialIdentityProviderConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchSocialIdentityProvider",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SocialIdentityProvider/PatchSocialIdentityProvider");
        java.util.function.Function<javax.ws.rs.core.Response, PatchSocialIdentityProviderResponse>
                transformer =
                        PatchSocialIdentityProviderConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchUserResponse patchUser(PatchUserRequest request) {
        LOG.trace("Called patchUser");
        final PatchUserRequest interceptedRequest = PatchUserConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchUserConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchUser",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/User/PatchUser");
        java.util.function.Function<javax.ws.rs.core.Response, PatchUserResponse> transformer =
                PatchUserConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PatchUserAttributesSettingResponse patchUserAttributesSetting(
            PatchUserAttributesSettingRequest request) {
        LOG.trace("Called patchUserAttributesSetting");
        final PatchUserAttributesSettingRequest interceptedRequest =
                PatchUserAttributesSettingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchUserAttributesSettingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchUserAttributesSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserAttributesSetting/PatchUserAttributesSetting");
        java.util.function.Function<javax.ws.rs.core.Response, PatchUserAttributesSettingResponse>
                transformer =
                        PatchUserAttributesSettingConverter.fromResponse(
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
                                                ib, retriedRequest.getPatchOp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutAccountRecoverySettingResponse putAccountRecoverySetting(
            PutAccountRecoverySettingRequest request) {
        LOG.trace("Called putAccountRecoverySetting");
        final PutAccountRecoverySettingRequest interceptedRequest =
                PutAccountRecoverySettingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutAccountRecoverySettingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutAccountRecoverySetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AccountRecoverySetting/PutAccountRecoverySetting");
        java.util.function.Function<javax.ws.rs.core.Response, PutAccountRecoverySettingResponse>
                transformer =
                        PutAccountRecoverySettingConverter.fromResponse(
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
                                                retriedRequest.getAccountRecoverySetting(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutAppResponse putApp(PutAppRequest request) {
        LOG.trace("Called putApp");
        final PutAppRequest interceptedRequest = PutAppConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutAppConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutApp",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/App/PutApp");
        java.util.function.Function<javax.ws.rs.core.Response, PutAppResponse> transformer =
                PutAppConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.put(ib, retriedRequest.getApp(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutAppStatusChangerResponse putAppStatusChanger(PutAppStatusChangerRequest request) {
        LOG.trace("Called putAppStatusChanger");
        final PutAppStatusChangerRequest interceptedRequest =
                PutAppStatusChangerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutAppStatusChangerConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutAppStatusChanger",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AppStatusChanger/PutAppStatusChanger");
        java.util.function.Function<javax.ws.rs.core.Response, PutAppStatusChangerResponse>
                transformer =
                        PutAppStatusChangerConverter.fromResponse(
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
                                                retriedRequest.getAppStatusChanger(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutApprovalWorkflowResponse putApprovalWorkflow(PutApprovalWorkflowRequest request) {
        LOG.trace("Called putApprovalWorkflow");
        final PutApprovalWorkflowRequest interceptedRequest =
                PutApprovalWorkflowConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutApprovalWorkflowConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutApprovalWorkflow",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflow/PutApprovalWorkflow");
        java.util.function.Function<javax.ws.rs.core.Response, PutApprovalWorkflowResponse>
                transformer =
                        PutApprovalWorkflowConverter.fromResponse(
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
                                                retriedRequest.getApprovalWorkflow(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutAuthenticationFactorSettingResponse putAuthenticationFactorSetting(
            PutAuthenticationFactorSettingRequest request) {
        LOG.trace("Called putAuthenticationFactorSetting");
        final PutAuthenticationFactorSettingRequest interceptedRequest =
                PutAuthenticationFactorSettingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutAuthenticationFactorSettingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutAuthenticationFactorSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthenticationFactorSetting/PutAuthenticationFactorSetting");
        java.util.function.Function<
                        javax.ws.rs.core.Response, PutAuthenticationFactorSettingResponse>
                transformer =
                        PutAuthenticationFactorSettingConverter.fromResponse(
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
                                                retriedRequest.getAuthenticationFactorSetting(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutCloudGateResponse putCloudGate(PutCloudGateRequest request) {
        LOG.trace("Called putCloudGate");
        final PutCloudGateRequest interceptedRequest =
                PutCloudGateConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutCloudGateConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutCloudGate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGate/PutCloudGate");
        java.util.function.Function<javax.ws.rs.core.Response, PutCloudGateResponse> transformer =
                PutCloudGateConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                ib, retriedRequest.getCloudGate(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutCloudGateMappingResponse putCloudGateMapping(PutCloudGateMappingRequest request) {
        LOG.trace("Called putCloudGateMapping");
        final PutCloudGateMappingRequest interceptedRequest =
                PutCloudGateMappingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutCloudGateMappingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutCloudGateMapping",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateMapping/PutCloudGateMapping");
        java.util.function.Function<javax.ws.rs.core.Response, PutCloudGateMappingResponse>
                transformer =
                        PutCloudGateMappingConverter.fromResponse(
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
                                                retriedRequest.getCloudGateMapping(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutCloudGateServerResponse putCloudGateServer(PutCloudGateServerRequest request) {
        LOG.trace("Called putCloudGateServer");
        final PutCloudGateServerRequest interceptedRequest =
                PutCloudGateServerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutCloudGateServerConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutCloudGateServer",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateServer/PutCloudGateServer");
        java.util.function.Function<javax.ws.rs.core.Response, PutCloudGateServerResponse>
                transformer =
                        PutCloudGateServerConverter.fromResponse(
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
                                                retriedRequest.getCloudGateServer(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutConditionResponse putCondition(PutConditionRequest request) {
        LOG.trace("Called putCondition");
        final PutConditionRequest interceptedRequest =
                PutConditionConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutConditionConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutCondition",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Condition/PutCondition");
        java.util.function.Function<javax.ws.rs.core.Response, PutConditionResponse> transformer =
                PutConditionConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                ib, retriedRequest.getCondition(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutDynamicResourceGroupResponse putDynamicResourceGroup(
            PutDynamicResourceGroupRequest request) {
        LOG.trace("Called putDynamicResourceGroup");
        final PutDynamicResourceGroupRequest interceptedRequest =
                PutDynamicResourceGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutDynamicResourceGroupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutDynamicResourceGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/DynamicResourceGroup/PutDynamicResourceGroup");
        java.util.function.Function<javax.ws.rs.core.Response, PutDynamicResourceGroupResponse>
                transformer =
                        PutDynamicResourceGroupConverter.fromResponse(
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
                                                retriedRequest.getDynamicResourceGroup(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutGroupResponse putGroup(PutGroupRequest request) {
        LOG.trace("Called putGroup");
        final PutGroupRequest interceptedRequest = PutGroupConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutGroupConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Group/PutGroup");
        java.util.function.Function<javax.ws.rs.core.Response, PutGroupResponse> transformer =
                PutGroupConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.put(ib, retriedRequest.getGroup(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutIdentityPropagationTrustResponse putIdentityPropagationTrust(
            PutIdentityPropagationTrustRequest request) {
        LOG.trace("Called putIdentityPropagationTrust");
        final PutIdentityPropagationTrustRequest interceptedRequest =
                PutIdentityPropagationTrustConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutIdentityPropagationTrustConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutIdentityPropagationTrust",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityPropagationTrust/PutIdentityPropagationTrust");
        java.util.function.Function<javax.ws.rs.core.Response, PutIdentityPropagationTrustResponse>
                transformer =
                        PutIdentityPropagationTrustConverter.fromResponse(
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
                                                retriedRequest.getIdentityPropagationTrust(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutIdentityProviderResponse putIdentityProvider(PutIdentityProviderRequest request) {
        LOG.trace("Called putIdentityProvider");
        final PutIdentityProviderRequest interceptedRequest =
                PutIdentityProviderConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutIdentityProviderConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutIdentityProvider",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityProvider/PutIdentityProvider");
        java.util.function.Function<javax.ws.rs.core.Response, PutIdentityProviderResponse>
                transformer =
                        PutIdentityProviderConverter.fromResponse(
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
                                                retriedRequest.getIdentityProvider(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutIdentitySettingResponse putIdentitySetting(PutIdentitySettingRequest request) {
        LOG.trace("Called putIdentitySetting");
        final PutIdentitySettingRequest interceptedRequest =
                PutIdentitySettingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutIdentitySettingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutIdentitySetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentitySetting/PutIdentitySetting");
        java.util.function.Function<javax.ws.rs.core.Response, PutIdentitySettingResponse>
                transformer =
                        PutIdentitySettingConverter.fromResponse(
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
                                                retriedRequest.getIdentitySetting(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutKmsiSettingResponse putKmsiSetting(PutKmsiSettingRequest request) {
        LOG.trace("Called putKmsiSetting");
        final PutKmsiSettingRequest interceptedRequest =
                PutKmsiSettingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutKmsiSettingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutKmsiSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/KmsiSetting/PutKmsiSetting");
        java.util.function.Function<javax.ws.rs.core.Response, PutKmsiSettingResponse> transformer =
                PutKmsiSettingConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getKmsiSetting(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutMeResponse putMe(PutMeRequest request) {
        LOG.trace("Called putMe");
        final PutMeRequest interceptedRequest = PutMeConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutMeConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutMe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Me/PutMe");
        java.util.function.Function<javax.ws.rs.core.Response, PutMeResponse> transformer =
                PutMeConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.put(ib, retriedRequest.getMe(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutMePasswordChangerResponse putMePasswordChanger(PutMePasswordChangerRequest request) {
        LOG.trace("Called putMePasswordChanger");
        final PutMePasswordChangerRequest interceptedRequest =
                PutMePasswordChangerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutMePasswordChangerConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutMePasswordChanger",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MePasswordChanger/PutMePasswordChanger");
        java.util.function.Function<javax.ws.rs.core.Response, PutMePasswordChangerResponse>
                transformer =
                        PutMePasswordChangerConverter.fromResponse(
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
                                                retriedRequest.getMePasswordChanger(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutNetworkPerimeterResponse putNetworkPerimeter(PutNetworkPerimeterRequest request) {
        LOG.trace("Called putNetworkPerimeter");
        final PutNetworkPerimeterRequest interceptedRequest =
                PutNetworkPerimeterConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutNetworkPerimeterConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutNetworkPerimeter",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NetworkPerimeter/PutNetworkPerimeter");
        java.util.function.Function<javax.ws.rs.core.Response, PutNetworkPerimeterResponse>
                transformer =
                        PutNetworkPerimeterConverter.fromResponse(
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
                                                retriedRequest.getNetworkPerimeter(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutNotificationSettingResponse putNotificationSetting(
            PutNotificationSettingRequest request) {
        LOG.trace("Called putNotificationSetting");
        final PutNotificationSettingRequest interceptedRequest =
                PutNotificationSettingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutNotificationSettingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutNotificationSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NotificationSetting/PutNotificationSetting");
        java.util.function.Function<javax.ws.rs.core.Response, PutNotificationSettingResponse>
                transformer =
                        PutNotificationSettingConverter.fromResponse(
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
                                                retriedRequest.getNotificationSetting(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutPasswordPolicyResponse putPasswordPolicy(PutPasswordPolicyRequest request) {
        LOG.trace("Called putPasswordPolicy");
        final PutPasswordPolicyRequest interceptedRequest =
                PutPasswordPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutPasswordPolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutPasswordPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/PasswordPolicy/PutPasswordPolicy");
        java.util.function.Function<javax.ws.rs.core.Response, PutPasswordPolicyResponse>
                transformer =
                        PutPasswordPolicyConverter.fromResponse(
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
                                                retriedRequest.getPasswordPolicy(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutPolicyResponse putPolicy(PutPolicyRequest request) {
        LOG.trace("Called putPolicy");
        final PutPolicyRequest interceptedRequest = PutPolicyConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutPolicyConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Policy/PutPolicy");
        java.util.function.Function<javax.ws.rs.core.Response, PutPolicyResponse> transformer =
                PutPolicyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.put(ib, retriedRequest.getPolicy(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutRuleResponse putRule(PutRuleRequest request) {
        LOG.trace("Called putRule");
        final PutRuleRequest interceptedRequest = PutRuleConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutRuleConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Rule/PutRule");
        java.util.function.Function<javax.ws.rs.core.Response, PutRuleResponse> transformer =
                PutRuleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.put(ib, retriedRequest.getRule(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutSchemaResponse putSchema(PutSchemaRequest request) {
        LOG.trace("Called putSchema");
        final PutSchemaRequest interceptedRequest = PutSchemaConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutSchemaConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutSchema",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Schema/PutSchema");
        java.util.function.Function<javax.ws.rs.core.Response, PutSchemaResponse> transformer =
                PutSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.put(ib, retriedRequest.getSchema(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutSecurityQuestionSettingResponse putSecurityQuestionSetting(
            PutSecurityQuestionSettingRequest request) {
        LOG.trace("Called putSecurityQuestionSetting");
        final PutSecurityQuestionSettingRequest interceptedRequest =
                PutSecurityQuestionSettingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutSecurityQuestionSettingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutSecurityQuestionSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestionSetting/PutSecurityQuestionSetting");
        java.util.function.Function<javax.ws.rs.core.Response, PutSecurityQuestionSettingResponse>
                transformer =
                        PutSecurityQuestionSettingConverter.fromResponse(
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
                                                retriedRequest.getSecurityQuestionSetting(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutSelfRegistrationProfileResponse putSelfRegistrationProfile(
            PutSelfRegistrationProfileRequest request) {
        LOG.trace("Called putSelfRegistrationProfile");
        final PutSelfRegistrationProfileRequest interceptedRequest =
                PutSelfRegistrationProfileConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutSelfRegistrationProfileConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutSelfRegistrationProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SelfRegistrationProfile/PutSelfRegistrationProfile");
        java.util.function.Function<javax.ws.rs.core.Response, PutSelfRegistrationProfileResponse>
                transformer =
                        PutSelfRegistrationProfileConverter.fromResponse(
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
                                                retriedRequest.getSelfRegistrationProfile(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutSettingResponse putSetting(PutSettingRequest request) {
        LOG.trace("Called putSetting");
        final PutSettingRequest interceptedRequest = PutSettingConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutSettingConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Setting/PutSetting");
        java.util.function.Function<javax.ws.rs.core.Response, PutSettingResponse> transformer =
                PutSettingConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.put(ib, retriedRequest.getSetting(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutSocialIdentityProviderResponse putSocialIdentityProvider(
            PutSocialIdentityProviderRequest request) {
        LOG.trace("Called putSocialIdentityProvider");
        final PutSocialIdentityProviderRequest interceptedRequest =
                PutSocialIdentityProviderConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutSocialIdentityProviderConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutSocialIdentityProvider",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SocialIdentityProvider/PutSocialIdentityProvider");
        java.util.function.Function<javax.ws.rs.core.Response, PutSocialIdentityProviderResponse>
                transformer =
                        PutSocialIdentityProviderConverter.fromResponse(
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
                                                retriedRequest.getSocialIdentityProvider(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutUserResponse putUser(PutUserRequest request) {
        LOG.trace("Called putUser");
        final PutUserRequest interceptedRequest = PutUserConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutUserConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutUser",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/User/PutUser");
        java.util.function.Function<javax.ws.rs.core.Response, PutUserResponse> transformer =
                PutUserConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
                interceptedRequest,
                retryRequest -> {
                    final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                            new com.oracle.bmc.retrier.TokenRefreshRetrier(
                                    authenticationDetailsProvider);
                    return tokenRefreshRetrier.execute(
                            retryRequest,
                            retriedRequest -> {
                                javax.ws.rs.core.Response response =
                                        client.put(ib, retriedRequest.getUser(), retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutUserCapabilitiesChangerResponse putUserCapabilitiesChanger(
            PutUserCapabilitiesChangerRequest request) {
        LOG.trace("Called putUserCapabilitiesChanger");
        final PutUserCapabilitiesChangerRequest interceptedRequest =
                PutUserCapabilitiesChangerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutUserCapabilitiesChangerConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutUserCapabilitiesChanger",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserCapabilitiesChanger/PutUserCapabilitiesChanger");
        java.util.function.Function<javax.ws.rs.core.Response, PutUserCapabilitiesChangerResponse>
                transformer =
                        PutUserCapabilitiesChangerConverter.fromResponse(
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
                                                retriedRequest.getUserCapabilitiesChanger(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutUserPasswordChangerResponse putUserPasswordChanger(
            PutUserPasswordChangerRequest request) {
        LOG.trace("Called putUserPasswordChanger");
        final PutUserPasswordChangerRequest interceptedRequest =
                PutUserPasswordChangerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutUserPasswordChangerConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutUserPasswordChanger",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserPasswordChanger/PutUserPasswordChanger");
        java.util.function.Function<javax.ws.rs.core.Response, PutUserPasswordChangerResponse>
                transformer =
                        PutUserPasswordChangerConverter.fromResponse(
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
                                                retriedRequest.getUserPasswordChanger(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutUserPasswordResetterResponse putUserPasswordResetter(
            PutUserPasswordResetterRequest request) {
        LOG.trace("Called putUserPasswordResetter");
        final PutUserPasswordResetterRequest interceptedRequest =
                PutUserPasswordResetterConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutUserPasswordResetterConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutUserPasswordResetter",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserPasswordResetter/PutUserPasswordResetter");
        java.util.function.Function<javax.ws.rs.core.Response, PutUserPasswordResetterResponse>
                transformer =
                        PutUserPasswordResetterConverter.fromResponse(
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
                                                retriedRequest.getUserPasswordResetter(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public PutUserStatusChangerResponse putUserStatusChanger(PutUserStatusChangerRequest request) {
        LOG.trace("Called putUserStatusChanger");
        final PutUserStatusChangerRequest interceptedRequest =
                PutUserStatusChangerConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutUserStatusChangerConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutUserStatusChanger",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserStatusChanger/PutUserStatusChanger");
        java.util.function.Function<javax.ws.rs.core.Response, PutUserStatusChangerResponse>
                transformer =
                        PutUserStatusChangerConverter.fromResponse(
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
                                                retriedRequest.getUserStatusChanger(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchAccountMgmtInfosResponse searchAccountMgmtInfos(
            SearchAccountMgmtInfosRequest request) {
        LOG.trace("Called searchAccountMgmtInfos");
        final SearchAccountMgmtInfosRequest interceptedRequest =
                SearchAccountMgmtInfosConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchAccountMgmtInfosConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchAccountMgmtInfos",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AccountMgmtInfos/SearchAccountMgmtInfos");
        java.util.function.Function<javax.ws.rs.core.Response, SearchAccountMgmtInfosResponse>
                transformer =
                        SearchAccountMgmtInfosConverter.fromResponse(
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
                                                retriedRequest.getAccountMgmtInfoSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchApiKeysResponse searchApiKeys(SearchApiKeysRequest request) {
        LOG.trace("Called searchApiKeys");
        final SearchApiKeysRequest interceptedRequest =
                SearchApiKeysConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchApiKeysConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchApiKeys",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApiKeys/SearchApiKeys");
        java.util.function.Function<javax.ws.rs.core.Response, SearchApiKeysResponse> transformer =
                SearchApiKeysConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getApiKeySearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchAppRolesResponse searchAppRoles(SearchAppRolesRequest request) {
        LOG.trace("Called searchAppRoles");
        final SearchAppRolesRequest interceptedRequest =
                SearchAppRolesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchAppRolesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchAppRoles",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AppRoles/SearchAppRoles");
        java.util.function.Function<javax.ws.rs.core.Response, SearchAppRolesResponse> transformer =
                SearchAppRolesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getAppRoleSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchAppsResponse searchApps(SearchAppsRequest request) {
        LOG.trace("Called searchApps");
        final SearchAppsRequest interceptedRequest = SearchAppsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchAppsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchApps",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Apps/SearchApps");
        java.util.function.Function<javax.ws.rs.core.Response, SearchAppsResponse> transformer =
                SearchAppsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getAppSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchAuthTokensResponse searchAuthTokens(SearchAuthTokensRequest request) {
        LOG.trace("Called searchAuthTokens");
        final SearchAuthTokensRequest interceptedRequest =
                SearchAuthTokensConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchAuthTokensConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchAuthTokens",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthTokens/SearchAuthTokens");
        java.util.function.Function<javax.ws.rs.core.Response, SearchAuthTokensResponse>
                transformer =
                        SearchAuthTokensConverter.fromResponse(
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
                                                retriedRequest.getAuthTokenSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchAuthenticationFactorSettingsResponse searchAuthenticationFactorSettings(
            SearchAuthenticationFactorSettingsRequest request) {
        LOG.trace("Called searchAuthenticationFactorSettings");
        final SearchAuthenticationFactorSettingsRequest interceptedRequest =
                SearchAuthenticationFactorSettingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchAuthenticationFactorSettingsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchAuthenticationFactorSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthenticationFactorSettings/SearchAuthenticationFactorSettings");
        java.util.function.Function<
                        javax.ws.rs.core.Response, SearchAuthenticationFactorSettingsResponse>
                transformer =
                        SearchAuthenticationFactorSettingsConverter.fromResponse(
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
                                                        .getAuthenticationFactorSettingsSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchCloudGateMappingsResponse searchCloudGateMappings(
            SearchCloudGateMappingsRequest request) {
        LOG.trace("Called searchCloudGateMappings");
        final SearchCloudGateMappingsRequest interceptedRequest =
                SearchCloudGateMappingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchCloudGateMappingsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchCloudGateMappings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateMappings/SearchCloudGateMappings");
        java.util.function.Function<javax.ws.rs.core.Response, SearchCloudGateMappingsResponse>
                transformer =
                        SearchCloudGateMappingsConverter.fromResponse(
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
                                                retriedRequest.getCloudGateMappingSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchCloudGateServersResponse searchCloudGateServers(
            SearchCloudGateServersRequest request) {
        LOG.trace("Called searchCloudGateServers");
        final SearchCloudGateServersRequest interceptedRequest =
                SearchCloudGateServersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchCloudGateServersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchCloudGateServers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateServers/SearchCloudGateServers");
        java.util.function.Function<javax.ws.rs.core.Response, SearchCloudGateServersResponse>
                transformer =
                        SearchCloudGateServersConverter.fromResponse(
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
                                                retriedRequest.getCloudGateServerSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchCloudGatesResponse searchCloudGates(SearchCloudGatesRequest request) {
        LOG.trace("Called searchCloudGates");
        final SearchCloudGatesRequest interceptedRequest =
                SearchCloudGatesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchCloudGatesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchCloudGates",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGates/SearchCloudGates");
        java.util.function.Function<javax.ws.rs.core.Response, SearchCloudGatesResponse>
                transformer =
                        SearchCloudGatesConverter.fromResponse(
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
                                                retriedRequest.getCloudGateSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchConditionsResponse searchConditions(SearchConditionsRequest request) {
        LOG.trace("Called searchConditions");
        final SearchConditionsRequest interceptedRequest =
                SearchConditionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchConditionsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchConditions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Condition/SearchConditions");
        java.util.function.Function<javax.ws.rs.core.Response, SearchConditionsResponse>
                transformer =
                        SearchConditionsConverter.fromResponse(
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
                                                retriedRequest.getConditionSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchCustomerSecretKeysResponse searchCustomerSecretKeys(
            SearchCustomerSecretKeysRequest request) {
        LOG.trace("Called searchCustomerSecretKeys");
        final SearchCustomerSecretKeysRequest interceptedRequest =
                SearchCustomerSecretKeysConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchCustomerSecretKeysConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchCustomerSecretKeys",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CustomerSecretKeys/SearchCustomerSecretKeys");
        java.util.function.Function<javax.ws.rs.core.Response, SearchCustomerSecretKeysResponse>
                transformer =
                        SearchCustomerSecretKeysConverter.fromResponse(
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
                                                retriedRequest.getCustomerSecretKeySearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchDynamicResourceGroupsResponse searchDynamicResourceGroups(
            SearchDynamicResourceGroupsRequest request) {
        LOG.trace("Called searchDynamicResourceGroups");
        final SearchDynamicResourceGroupsRequest interceptedRequest =
                SearchDynamicResourceGroupsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchDynamicResourceGroupsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchDynamicResourceGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/DynamicResourceGroups/SearchDynamicResourceGroups");
        java.util.function.Function<javax.ws.rs.core.Response, SearchDynamicResourceGroupsResponse>
                transformer =
                        SearchDynamicResourceGroupsConverter.fromResponse(
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
                                                        .getDynamicResourceGroupSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchGrantsResponse searchGrants(SearchGrantsRequest request) {
        LOG.trace("Called searchGrants");
        final SearchGrantsRequest interceptedRequest =
                SearchGrantsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchGrantsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchGrants",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Grants/SearchGrants");
        java.util.function.Function<javax.ws.rs.core.Response, SearchGrantsResponse> transformer =
                SearchGrantsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getGrantSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchGroupsResponse searchGroups(SearchGroupsRequest request) {
        LOG.trace("Called searchGroups");
        final SearchGroupsRequest interceptedRequest =
                SearchGroupsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchGroupsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Groups/SearchGroups");
        java.util.function.Function<javax.ws.rs.core.Response, SearchGroupsResponse> transformer =
                SearchGroupsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getGroupSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchIdentityProvidersResponse searchIdentityProviders(
            SearchIdentityProvidersRequest request) {
        LOG.trace("Called searchIdentityProviders");
        final SearchIdentityProvidersRequest interceptedRequest =
                SearchIdentityProvidersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchIdentityProvidersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchIdentityProviders",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityProviders/SearchIdentityProviders");
        java.util.function.Function<javax.ws.rs.core.Response, SearchIdentityProvidersResponse>
                transformer =
                        SearchIdentityProvidersConverter.fromResponse(
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
                                                retriedRequest.getIdentityProviderSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchIdentitySettingsResponse searchIdentitySettings(
            SearchIdentitySettingsRequest request) {
        LOG.trace("Called searchIdentitySettings");
        final SearchIdentitySettingsRequest interceptedRequest =
                SearchIdentitySettingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchIdentitySettingsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchIdentitySettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentitySettings/SearchIdentitySettings");
        java.util.function.Function<javax.ws.rs.core.Response, SearchIdentitySettingsResponse>
                transformer =
                        SearchIdentitySettingsConverter.fromResponse(
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
                                                retriedRequest.getIdentitySettingsSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchKmsiSettingsResponse searchKmsiSettings(SearchKmsiSettingsRequest request) {
        LOG.trace("Called searchKmsiSettings");
        final SearchKmsiSettingsRequest interceptedRequest =
                SearchKmsiSettingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchKmsiSettingsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchKmsiSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/KmsiSettings/SearchKmsiSettings");
        java.util.function.Function<javax.ws.rs.core.Response, SearchKmsiSettingsResponse>
                transformer =
                        SearchKmsiSettingsConverter.fromResponse(
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
                                                retriedRequest.getKmsiSettingsSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchMyAppsResponse searchMyApps(SearchMyAppsRequest request) {
        LOG.trace("Called searchMyApps");
        final SearchMyAppsRequest interceptedRequest =
                SearchMyAppsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchMyAppsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchMyApps",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyApps/SearchMyApps");
        java.util.function.Function<javax.ws.rs.core.Response, SearchMyAppsResponse> transformer =
                SearchMyAppsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getMyAppSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchMyGroupsResponse searchMyGroups(SearchMyGroupsRequest request) {
        LOG.trace("Called searchMyGroups");
        final SearchMyGroupsRequest interceptedRequest =
                SearchMyGroupsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchMyGroupsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchMyGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyGroups/SearchMyGroups");
        java.util.function.Function<javax.ws.rs.core.Response, SearchMyGroupsResponse> transformer =
                SearchMyGroupsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getMyGroupSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchMyRequestableGroupsResponse searchMyRequestableGroups(
            SearchMyRequestableGroupsRequest request) {
        LOG.trace("Called searchMyRequestableGroups");
        final SearchMyRequestableGroupsRequest interceptedRequest =
                SearchMyRequestableGroupsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchMyRequestableGroupsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchMyRequestableGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyRequestableGroups/SearchMyRequestableGroups");
        java.util.function.Function<javax.ws.rs.core.Response, SearchMyRequestableGroupsResponse>
                transformer =
                        SearchMyRequestableGroupsConverter.fromResponse(
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
                                                retriedRequest.getMyRequestableGroupSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchMyRequestsResponse searchMyRequests(SearchMyRequestsRequest request) {
        LOG.trace("Called searchMyRequests");
        final SearchMyRequestsRequest interceptedRequest =
                SearchMyRequestsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchMyRequestsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchMyRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyRequests/SearchMyRequests");
        java.util.function.Function<javax.ws.rs.core.Response, SearchMyRequestsResponse>
                transformer =
                        SearchMyRequestsConverter.fromResponse(
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
                                                retriedRequest.getMyRequestSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchNetworkPerimetersResponse searchNetworkPerimeters(
            SearchNetworkPerimetersRequest request) {
        LOG.trace("Called searchNetworkPerimeters");
        final SearchNetworkPerimetersRequest interceptedRequest =
                SearchNetworkPerimetersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchNetworkPerimetersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchNetworkPerimeters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NetworkPerimeters/SearchNetworkPerimeters");
        java.util.function.Function<javax.ws.rs.core.Response, SearchNetworkPerimetersResponse>
                transformer =
                        SearchNetworkPerimetersConverter.fromResponse(
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
                                                retriedRequest.getNetworkPerimeterSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchNotificationSettingsResponse searchNotificationSettings(
            SearchNotificationSettingsRequest request) {
        LOG.trace("Called searchNotificationSettings");
        final SearchNotificationSettingsRequest interceptedRequest =
                SearchNotificationSettingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchNotificationSettingsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchNotificationSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NotificationSettings/SearchNotificationSettings");
        java.util.function.Function<javax.ws.rs.core.Response, SearchNotificationSettingsResponse>
                transformer =
                        SearchNotificationSettingsConverter.fromResponse(
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
                                                        .getNotificationSettingsSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchOAuth2ClientCredentialsResponse searchOAuth2ClientCredentials(
            SearchOAuth2ClientCredentialsRequest request) {
        LOG.trace("Called searchOAuth2ClientCredentials");
        final SearchOAuth2ClientCredentialsRequest interceptedRequest =
                SearchOAuth2ClientCredentialsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchOAuth2ClientCredentialsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchOAuth2ClientCredentials",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuth2ClientCredentials/SearchOAuth2ClientCredentials");
        java.util.function.Function<
                        javax.ws.rs.core.Response, SearchOAuth2ClientCredentialsResponse>
                transformer =
                        SearchOAuth2ClientCredentialsConverter.fromResponse(
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
                                                        .getOAuth2ClientCredentialSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchOAuthClientCertificatesResponse searchOAuthClientCertificates(
            SearchOAuthClientCertificatesRequest request) {
        LOG.trace("Called searchOAuthClientCertificates");
        final SearchOAuthClientCertificatesRequest interceptedRequest =
                SearchOAuthClientCertificatesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchOAuthClientCertificatesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchOAuthClientCertificates",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuthClientCertificates/SearchOAuthClientCertificates");
        java.util.function.Function<
                        javax.ws.rs.core.Response, SearchOAuthClientCertificatesResponse>
                transformer =
                        SearchOAuthClientCertificatesConverter.fromResponse(
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
                                                        .getOAuthClientCertificateSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchOAuthPartnerCertificatesResponse searchOAuthPartnerCertificates(
            SearchOAuthPartnerCertificatesRequest request) {
        LOG.trace("Called searchOAuthPartnerCertificates");
        final SearchOAuthPartnerCertificatesRequest interceptedRequest =
                SearchOAuthPartnerCertificatesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchOAuthPartnerCertificatesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchOAuthPartnerCertificates",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuthPartnerCertificates/SearchOAuthPartnerCertificates");
        java.util.function.Function<
                        javax.ws.rs.core.Response, SearchOAuthPartnerCertificatesResponse>
                transformer =
                        SearchOAuthPartnerCertificatesConverter.fromResponse(
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
                                                        .getOAuthPartnerCertificateSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchOciConsoleSignOnPolicyConsentsResponse searchOciConsoleSignOnPolicyConsents(
            SearchOciConsoleSignOnPolicyConsentsRequest request) {
        LOG.trace("Called searchOciConsoleSignOnPolicyConsents");
        final SearchOciConsoleSignOnPolicyConsentsRequest interceptedRequest =
                SearchOciConsoleSignOnPolicyConsentsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchOciConsoleSignOnPolicyConsentsConverter.fromRequest(
                        client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchOciConsoleSignOnPolicyConsents",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OciConsoleSignOnPolicyConsent/SearchOciConsoleSignOnPolicyConsents");
        java.util.function.Function<
                        javax.ws.rs.core.Response, SearchOciConsoleSignOnPolicyConsentsResponse>
                transformer =
                        SearchOciConsoleSignOnPolicyConsentsConverter.fromResponse(
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
                                                        .getOciConsoleSignOnPolicyConsentSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchPasswordPoliciesResponse searchPasswordPolicies(
            SearchPasswordPoliciesRequest request) {
        LOG.trace("Called searchPasswordPolicies");
        final SearchPasswordPoliciesRequest interceptedRequest =
                SearchPasswordPoliciesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchPasswordPoliciesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchPasswordPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/PasswordPolicies/SearchPasswordPolicies");
        java.util.function.Function<javax.ws.rs.core.Response, SearchPasswordPoliciesResponse>
                transformer =
                        SearchPasswordPoliciesConverter.fromResponse(
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
                                                retriedRequest.getPasswordPolicySearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchPoliciesResponse searchPolicies(SearchPoliciesRequest request) {
        LOG.trace("Called searchPolicies");
        final SearchPoliciesRequest interceptedRequest =
                SearchPoliciesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchPoliciesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Policy/SearchPolicies");
        java.util.function.Function<javax.ws.rs.core.Response, SearchPoliciesResponse> transformer =
                SearchPoliciesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getPolicySearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchResourceTypeSchemaAttributesResponse searchResourceTypeSchemaAttributes(
            SearchResourceTypeSchemaAttributesRequest request) {
        LOG.trace("Called searchResourceTypeSchemaAttributes");
        final SearchResourceTypeSchemaAttributesRequest interceptedRequest =
                SearchResourceTypeSchemaAttributesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchResourceTypeSchemaAttributesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchResourceTypeSchemaAttributes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ResourceTypeSchemaAttributes/SearchResourceTypeSchemaAttributes");
        java.util.function.Function<
                        javax.ws.rs.core.Response, SearchResourceTypeSchemaAttributesResponse>
                transformer =
                        SearchResourceTypeSchemaAttributesConverter.fromResponse(
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
                                                        .getResourceTypeSchemaAttributeSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchRulesResponse searchRules(SearchRulesRequest request) {
        LOG.trace("Called searchRules");
        final SearchRulesRequest interceptedRequest =
                SearchRulesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchRulesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Rule/SearchRules");
        java.util.function.Function<javax.ws.rs.core.Response, SearchRulesResponse> transformer =
                SearchRulesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getRuleSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchSchemasResponse searchSchemas(SearchSchemasRequest request) {
        LOG.trace("Called searchSchemas");
        final SearchSchemasRequest interceptedRequest =
                SearchSchemasConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchSchemasConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchSchemas",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Schemas/SearchSchemas");
        java.util.function.Function<javax.ws.rs.core.Response, SearchSchemasResponse> transformer =
                SearchSchemasConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getSchemaSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchSecurityQuestionSettingsResponse searchSecurityQuestionSettings(
            SearchSecurityQuestionSettingsRequest request) {
        LOG.trace("Called searchSecurityQuestionSettings");
        final SearchSecurityQuestionSettingsRequest interceptedRequest =
                SearchSecurityQuestionSettingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchSecurityQuestionSettingsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchSecurityQuestionSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestionSettings/SearchSecurityQuestionSettings");
        java.util.function.Function<
                        javax.ws.rs.core.Response, SearchSecurityQuestionSettingsResponse>
                transformer =
                        SearchSecurityQuestionSettingsConverter.fromResponse(
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
                                                        .getSecurityQuestionSettingsSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchSecurityQuestionsResponse searchSecurityQuestions(
            SearchSecurityQuestionsRequest request) {
        LOG.trace("Called searchSecurityQuestions");
        final SearchSecurityQuestionsRequest interceptedRequest =
                SearchSecurityQuestionsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchSecurityQuestionsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchSecurityQuestions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestions/SearchSecurityQuestions");
        java.util.function.Function<javax.ws.rs.core.Response, SearchSecurityQuestionsResponse>
                transformer =
                        SearchSecurityQuestionsConverter.fromResponse(
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
                                                retriedRequest.getSecurityQuestionSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchSelfRegistrationProfilesResponse searchSelfRegistrationProfiles(
            SearchSelfRegistrationProfilesRequest request) {
        LOG.trace("Called searchSelfRegistrationProfiles");
        final SearchSelfRegistrationProfilesRequest interceptedRequest =
                SearchSelfRegistrationProfilesConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchSelfRegistrationProfilesConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchSelfRegistrationProfiles",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SelfRegistrationProfiles/SearchSelfRegistrationProfiles");
        java.util.function.Function<
                        javax.ws.rs.core.Response, SearchSelfRegistrationProfilesResponse>
                transformer =
                        SearchSelfRegistrationProfilesConverter.fromResponse(
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
                                                        .getSelfRegistrationProfileSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchSettingsResponse searchSettings(SearchSettingsRequest request) {
        LOG.trace("Called searchSettings");
        final SearchSettingsRequest interceptedRequest =
                SearchSettingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchSettingsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Settings/SearchSettings");
        java.util.function.Function<javax.ws.rs.core.Response, SearchSettingsResponse> transformer =
                SearchSettingsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getSettingsSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchSmtpCredentialsResponse searchSmtpCredentials(
            SearchSmtpCredentialsRequest request) {
        LOG.trace("Called searchSmtpCredentials");
        final SearchSmtpCredentialsRequest interceptedRequest =
                SearchSmtpCredentialsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchSmtpCredentialsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchSmtpCredentials",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SmtpCredentials/SearchSmtpCredentials");
        java.util.function.Function<javax.ws.rs.core.Response, SearchSmtpCredentialsResponse>
                transformer =
                        SearchSmtpCredentialsConverter.fromResponse(
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
                                                retriedRequest.getSmtpCredentialSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchSocialIdentityProvidersResponse searchSocialIdentityProviders(
            SearchSocialIdentityProvidersRequest request) {
        LOG.trace("Called searchSocialIdentityProviders");
        final SearchSocialIdentityProvidersRequest interceptedRequest =
                SearchSocialIdentityProvidersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchSocialIdentityProvidersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchSocialIdentityProviders",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SocialIdentityProviders/SearchSocialIdentityProviders");
        java.util.function.Function<
                        javax.ws.rs.core.Response, SearchSocialIdentityProvidersResponse>
                transformer =
                        SearchSocialIdentityProvidersConverter.fromResponse(
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
                                                        .getSocialIdentityProviderSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchUserAttributesSettingsResponse searchUserAttributesSettings(
            SearchUserAttributesSettingsRequest request) {
        LOG.trace("Called searchUserAttributesSettings");
        final SearchUserAttributesSettingsRequest interceptedRequest =
                SearchUserAttributesSettingsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchUserAttributesSettingsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchUserAttributesSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserAttributesSetting/SearchUserAttributesSettings");
        java.util.function.Function<javax.ws.rs.core.Response, SearchUserAttributesSettingsResponse>
                transformer =
                        SearchUserAttributesSettingsConverter.fromResponse(
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
                                                        .getUserAttributesSettingsSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchUserDbCredentialsResponse searchUserDbCredentials(
            SearchUserDbCredentialsRequest request) {
        LOG.trace("Called searchUserDbCredentials");
        final SearchUserDbCredentialsRequest interceptedRequest =
                SearchUserDbCredentialsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchUserDbCredentialsConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchUserDbCredentials",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserDbCredentials/SearchUserDbCredentials");
        java.util.function.Function<javax.ws.rs.core.Response, SearchUserDbCredentialsResponse>
                transformer =
                        SearchUserDbCredentialsConverter.fromResponse(
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
                                                retriedRequest.getUserDbCredentialsSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }

    @Override
    public SearchUsersResponse searchUsers(SearchUsersRequest request) {
        LOG.trace("Called searchUsers");
        final SearchUsersRequest interceptedRequest =
                SearchUsersConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchUsersConverter.fromRequest(client, interceptedRequest);

        final com.oracle.bmc.retrier.BmcGenericRetrier retrier =
                com.oracle.bmc.retrier.Retriers.createPreferredRetrier(
                        interceptedRequest.getRetryConfiguration(), retryConfiguration, false);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchUsers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Users/SearchUsers");
        java.util.function.Function<javax.ws.rs.core.Response, SearchUsersResponse> transformer =
                SearchUsersConverter.fromResponse(java.util.Optional.of(serviceDetails));
        return retrier.execute(
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
                                                retriedRequest.getUserSearchRequest(),
                                                retriedRequest);
                                return transformer.apply(response);
                            });
                });
    }
}
