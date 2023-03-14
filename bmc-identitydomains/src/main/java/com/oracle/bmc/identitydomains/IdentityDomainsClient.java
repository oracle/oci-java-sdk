/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
                    .serviceEndpointTemplate("https://identity.{region}.oci.{secondLevelDomain}")
                    .build();
    // attempt twice if it's instance principals, immediately failures will try to refresh the token
    private static final int MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS = 2;

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(IdentityDomainsAsyncClient.class);

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
                    endpoint);
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
                        "IdentityDomains", "DeleteApiKey", ib.getRequestUri().toString(), "");
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
                        "IdentityDomains", "DeleteAuthToken", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "");
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
                        "IdentityDomains", "DeleteGroup", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "IdentityDomains", "DeleteMyApiKey", ib.getRequestUri().toString(), "");
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
                        "IdentityDomains", "DeleteMyAuthToken", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "IdentityDomains", "DeleteMyDevice", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "");
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
                        "");
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
                        "");
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
                        "");
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
                        "");
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
                        "");
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
                        "");
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
                        "IdentityDomains", "DeleteUser", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "IdentityDomains", "GetApiKey", ib.getRequestUri().toString(), "");
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
                        "IdentityDomains", "GetAuthToken", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "");
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
                        "");
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
                        "IdentityDomains", "GetGroup", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "IdentityDomains", "GetKmsiSetting", ib.getRequestUri().toString(), "");
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
                        "IdentityDomains", "GetMe", ib.getRequestUri().toString(), "");
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
                        "IdentityDomains", "GetMyApiKey", ib.getRequestUri().toString(), "");
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
                        "IdentityDomains", "GetMyAuthToken", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "IdentityDomains", "GetMyDevice", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "");
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
                        "");
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
                        "");
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
                        "");
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
                        "");
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
                        "IdentityDomains", "GetPasswordPolicy", ib.getRequestUri().toString(), "");
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
                        "IdentityDomains", "GetSmtpCredential", ib.getRequestUri().toString(), "");
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
                        "IdentityDomains", "GetUser", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "IdentityDomains", "ListApiKeys", ib.getRequestUri().toString(), "");
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
                        "IdentityDomains", "ListAuthTokens", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "");
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
                        "");
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
                        "IdentityDomains", "ListGroups", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "IdentityDomains", "ListKmsiSettings", ib.getRequestUri().toString(), "");
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
                        "IdentityDomains", "ListMyApiKeys", ib.getRequestUri().toString(), "");
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
                        "IdentityDomains", "ListMyAuthTokens", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "IdentityDomains", "ListMyDevices", ib.getRequestUri().toString(), "");
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
                        "IdentityDomains", "ListMyGroups", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "");
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
                        "");
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
                        "");
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
                        "");
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
                        "");
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
                        "");
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
                        "");
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
                        "");
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
                        "IdentityDomains", "ListUsers", ib.getRequestUri().toString(), "");
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
                        "IdentityDomains", "PatchApiKey", ib.getRequestUri().toString(), "");
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
                        "IdentityDomains", "PatchAuthToken", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "");
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
                        "IdentityDomains", "PatchGroup", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "IdentityDomains", "PatchKmsiSetting", ib.getRequestUri().toString(), "");
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
                        "IdentityDomains", "PatchMe", ib.getRequestUri().toString(), "");
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
                        "IdentityDomains", "PatchMyApiKey", ib.getRequestUri().toString(), "");
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
                        "IdentityDomains", "PatchMyAuthToken", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "IdentityDomains", "PatchMyDevice", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "");
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
                        "");
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
                        "");
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
                        "");
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
                        "IdentityDomains", "PatchUser", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "");
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
                        "IdentityDomains", "PutGroup", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "IdentityDomains", "PutKmsiSetting", ib.getRequestUri().toString(), "");
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
                        "IdentityDomains", "PutMe", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "IdentityDomains", "PutPasswordPolicy", ib.getRequestUri().toString(), "");
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
                        "IdentityDomains", "PutUser", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "");
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
                        "");
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
                        "");
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
                        "IdentityDomains", "SearchApiKeys", ib.getRequestUri().toString(), "");
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
                        "IdentityDomains", "SearchAuthTokens", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "");
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
                        "");
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
                        "IdentityDomains", "SearchGroups", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "IdentityDomains", "SearchKmsiSettings", ib.getRequestUri().toString(), "");
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
                        "IdentityDomains", "SearchMyGroups", ib.getRequestUri().toString(), "");
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
                        "");
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
                        "");
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
                        "");
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
                        "");
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
                        "IdentityDomains", "SearchUsers", ib.getRequestUri().toString(), "");
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
