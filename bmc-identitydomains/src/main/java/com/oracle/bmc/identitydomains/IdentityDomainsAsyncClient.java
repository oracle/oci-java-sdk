/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains;

import com.oracle.bmc.identitydomains.internal.http.*;
import com.oracle.bmc.identitydomains.requests.*;
import com.oracle.bmc.identitydomains.responses.*;

/**
 * Async client implementation for IdentityDomains service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
public class IdentityDomainsAsyncClient implements IdentityDomainsAsync {
    /**
     * Service instance for IdentityDomains.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("IDENTITYDOMAINS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://identity.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(IdentityDomainsAsyncClient.class);

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
    public IdentityDomainsAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public IdentityDomainsAsyncClient(
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
    public IdentityDomainsAsyncClient(
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
    public IdentityDomainsAsyncClient(
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
    public IdentityDomainsAsyncClient(
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
    public IdentityDomainsAsyncClient(
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
    public IdentityDomainsAsyncClient(
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
    public IdentityDomainsAsyncClient(
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
            extends com.oracle.bmc.common.ClientBuilderBase<Builder, IdentityDomainsAsyncClient> {
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
        public IdentityDomainsAsyncClient build(
                @javax.annotation.Nonnull
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException(
                        "authenticationDetailsProvider is marked non-null but is null");
            }
            return new IdentityDomainsAsyncClient(
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
    public void close() {
        client.close();
    }

    @Override
    public java.util.concurrent.Future<CreateApiKeyResponse> createApiKey(
            CreateApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateApiKeyRequest, CreateApiKeyResponse>
                    handler) {
        LOG.trace("Called async createApiKey");
        final CreateApiKeyRequest interceptedRequest =
                CreateApiKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateApiKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateApiKey", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateApiKeyResponse>
                transformer =
                        CreateApiKeyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateApiKeyRequest, CreateApiKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateApiKeyRequest, CreateApiKeyResponse>,
                        java.util.concurrent.Future<CreateApiKeyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getApiKey(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateApiKeyRequest, CreateApiKeyResponse>(
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
    public java.util.concurrent.Future<CreateAuthTokenResponse> createAuthToken(
            CreateAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAuthTokenRequest, CreateAuthTokenResponse>
                    handler) {
        LOG.trace("Called async createAuthToken");
        final CreateAuthTokenRequest interceptedRequest =
                CreateAuthTokenConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAuthTokenConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateAuthToken", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateAuthTokenResponse>
                transformer =
                        CreateAuthTokenConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateAuthTokenRequest, CreateAuthTokenResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateAuthTokenRequest, CreateAuthTokenResponse>,
                        java.util.concurrent.Future<CreateAuthTokenResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAuthToken(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateAuthTokenRequest, CreateAuthTokenResponse>(
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
    public java.util.concurrent.Future<CreateAuthenticationFactorsRemoverResponse>
            createAuthenticationFactorsRemover(
                    CreateAuthenticationFactorsRemoverRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateAuthenticationFactorsRemoverRequest,
                                    CreateAuthenticationFactorsRemoverResponse>
                            handler) {
        LOG.trace("Called async createAuthenticationFactorsRemover");
        final CreateAuthenticationFactorsRemoverRequest interceptedRequest =
                CreateAuthenticationFactorsRemoverConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAuthenticationFactorsRemoverConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateAuthenticationFactorsRemover",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateAuthenticationFactorsRemoverResponse>
                transformer =
                        CreateAuthenticationFactorsRemoverConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateAuthenticationFactorsRemoverRequest,
                        CreateAuthenticationFactorsRemoverResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateAuthenticationFactorsRemoverRequest,
                                CreateAuthenticationFactorsRemoverResponse>,
                        java.util.concurrent.Future<CreateAuthenticationFactorsRemoverResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAuthenticationFactorsRemover(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateAuthenticationFactorsRemoverRequest,
                    CreateAuthenticationFactorsRemoverResponse>(
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
    public java.util.concurrent.Future<CreateCustomerSecretKeyResponse> createCustomerSecretKey(
            CreateCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCustomerSecretKeyRequest, CreateCustomerSecretKeyResponse>
                    handler) {
        LOG.trace("Called async createCustomerSecretKey");
        final CreateCustomerSecretKeyRequest interceptedRequest =
                CreateCustomerSecretKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCustomerSecretKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateCustomerSecretKey",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateCustomerSecretKeyResponse>
                transformer =
                        CreateCustomerSecretKeyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateCustomerSecretKeyRequest, CreateCustomerSecretKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCustomerSecretKeyRequest, CreateCustomerSecretKeyResponse>,
                        java.util.concurrent.Future<CreateCustomerSecretKeyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCustomerSecretKey(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCustomerSecretKeyRequest, CreateCustomerSecretKeyResponse>(
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
    public java.util.concurrent.Future<CreateDynamicResourceGroupResponse>
            createDynamicResourceGroup(
                    CreateDynamicResourceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDynamicResourceGroupRequest,
                                    CreateDynamicResourceGroupResponse>
                            handler) {
        LOG.trace("Called async createDynamicResourceGroup");
        final CreateDynamicResourceGroupRequest interceptedRequest =
                CreateDynamicResourceGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateDynamicResourceGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateDynamicResourceGroup",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateDynamicResourceGroupResponse>
                transformer =
                        CreateDynamicResourceGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateDynamicResourceGroupRequest, CreateDynamicResourceGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateDynamicResourceGroupRequest,
                                CreateDynamicResourceGroupResponse>,
                        java.util.concurrent.Future<CreateDynamicResourceGroupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDynamicResourceGroup(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateDynamicResourceGroupRequest, CreateDynamicResourceGroupResponse>(
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
    public java.util.concurrent.Future<CreateGroupResponse> createGroup(
            CreateGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateGroupRequest, CreateGroupResponse>
                    handler) {
        LOG.trace("Called async createGroup");
        final CreateGroupRequest interceptedRequest =
                CreateGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateGroup", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateGroupResponse>
                transformer =
                        CreateGroupConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateGroupRequest, CreateGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateGroupRequest, CreateGroupResponse>,
                        java.util.concurrent.Future<CreateGroupResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest, interceptedRequest.getGroup(), ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateGroupRequest, CreateGroupResponse>(
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
    public java.util.concurrent.Future<CreateIdentityProviderResponse> createIdentityProvider(
            CreateIdentityProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateIdentityProviderRequest, CreateIdentityProviderResponse>
                    handler) {
        LOG.trace("Called async createIdentityProvider");
        final CreateIdentityProviderRequest interceptedRequest =
                CreateIdentityProviderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateIdentityProviderConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateIdentityProvider",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateIdentityProviderResponse>
                transformer =
                        CreateIdentityProviderConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateIdentityProviderRequest, CreateIdentityProviderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateIdentityProviderRequest, CreateIdentityProviderResponse>,
                        java.util.concurrent.Future<CreateIdentityProviderResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getIdentityProvider(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateIdentityProviderRequest, CreateIdentityProviderResponse>(
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
    public java.util.concurrent.Future<CreateMeResponse> createMe(
            CreateMeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateMeRequest, CreateMeResponse>
                    handler) {
        LOG.trace("Called async createMe");
        final CreateMeRequest interceptedRequest = CreateMeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateMe", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateMeResponse> transformer =
                CreateMeConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateMeRequest, CreateMeResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<CreateMeRequest, CreateMeResponse>,
                        java.util.concurrent.Future<CreateMeResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest, interceptedRequest.getMe(), ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMeRequest, CreateMeResponse>(
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
    public java.util.concurrent.Future<CreateMyApiKeyResponse> createMyApiKey(
            CreateMyApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMyApiKeyRequest, CreateMyApiKeyResponse>
                    handler) {
        LOG.trace("Called async createMyApiKey");
        final CreateMyApiKeyRequest interceptedRequest =
                CreateMyApiKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMyApiKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateMyApiKey", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateMyApiKeyResponse>
                transformer =
                        CreateMyApiKeyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateMyApiKeyRequest, CreateMyApiKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMyApiKeyRequest, CreateMyApiKeyResponse>,
                        java.util.concurrent.Future<CreateMyApiKeyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getMyApiKey(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMyApiKeyRequest, CreateMyApiKeyResponse>(
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
    public java.util.concurrent.Future<CreateMyAuthTokenResponse> createMyAuthToken(
            CreateMyAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMyAuthTokenRequest, CreateMyAuthTokenResponse>
                    handler) {
        LOG.trace("Called async createMyAuthToken");
        final CreateMyAuthTokenRequest interceptedRequest =
                CreateMyAuthTokenConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMyAuthTokenConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateMyAuthToken", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateMyAuthTokenResponse>
                transformer =
                        CreateMyAuthTokenConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateMyAuthTokenRequest, CreateMyAuthTokenResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMyAuthTokenRequest, CreateMyAuthTokenResponse>,
                        java.util.concurrent.Future<CreateMyAuthTokenResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getMyAuthToken(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMyAuthTokenRequest, CreateMyAuthTokenResponse>(
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
    public java.util.concurrent.Future<CreateMyAuthenticationFactorInitiatorResponse>
            createMyAuthenticationFactorInitiator(
                    CreateMyAuthenticationFactorInitiatorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateMyAuthenticationFactorInitiatorRequest,
                                    CreateMyAuthenticationFactorInitiatorResponse>
                            handler) {
        LOG.trace("Called async createMyAuthenticationFactorInitiator");
        final CreateMyAuthenticationFactorInitiatorRequest interceptedRequest =
                CreateMyAuthenticationFactorInitiatorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMyAuthenticationFactorInitiatorConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateMyAuthenticationFactorInitiator",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateMyAuthenticationFactorInitiatorResponse>
                transformer =
                        CreateMyAuthenticationFactorInitiatorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateMyAuthenticationFactorInitiatorRequest,
                        CreateMyAuthenticationFactorInitiatorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMyAuthenticationFactorInitiatorRequest,
                                CreateMyAuthenticationFactorInitiatorResponse>,
                        java.util.concurrent.Future<CreateMyAuthenticationFactorInitiatorResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getMyAuthenticationFactorInitiator(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMyAuthenticationFactorInitiatorRequest,
                    CreateMyAuthenticationFactorInitiatorResponse>(
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
    public java.util.concurrent.Future<CreateMyAuthenticationFactorValidatorResponse>
            createMyAuthenticationFactorValidator(
                    CreateMyAuthenticationFactorValidatorRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateMyAuthenticationFactorValidatorRequest,
                                    CreateMyAuthenticationFactorValidatorResponse>
                            handler) {
        LOG.trace("Called async createMyAuthenticationFactorValidator");
        final CreateMyAuthenticationFactorValidatorRequest interceptedRequest =
                CreateMyAuthenticationFactorValidatorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMyAuthenticationFactorValidatorConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateMyAuthenticationFactorValidator",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateMyAuthenticationFactorValidatorResponse>
                transformer =
                        CreateMyAuthenticationFactorValidatorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateMyAuthenticationFactorValidatorRequest,
                        CreateMyAuthenticationFactorValidatorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMyAuthenticationFactorValidatorRequest,
                                CreateMyAuthenticationFactorValidatorResponse>,
                        java.util.concurrent.Future<CreateMyAuthenticationFactorValidatorResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getMyAuthenticationFactorValidator(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMyAuthenticationFactorValidatorRequest,
                    CreateMyAuthenticationFactorValidatorResponse>(
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
    public java.util.concurrent.Future<CreateMyAuthenticationFactorsRemoverResponse>
            createMyAuthenticationFactorsRemover(
                    CreateMyAuthenticationFactorsRemoverRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateMyAuthenticationFactorsRemoverRequest,
                                    CreateMyAuthenticationFactorsRemoverResponse>
                            handler) {
        LOG.trace("Called async createMyAuthenticationFactorsRemover");
        final CreateMyAuthenticationFactorsRemoverRequest interceptedRequest =
                CreateMyAuthenticationFactorsRemoverConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMyAuthenticationFactorsRemoverConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateMyAuthenticationFactorsRemover",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateMyAuthenticationFactorsRemoverResponse>
                transformer =
                        CreateMyAuthenticationFactorsRemoverConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateMyAuthenticationFactorsRemoverRequest,
                        CreateMyAuthenticationFactorsRemoverResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMyAuthenticationFactorsRemoverRequest,
                                CreateMyAuthenticationFactorsRemoverResponse>,
                        java.util.concurrent.Future<CreateMyAuthenticationFactorsRemoverResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getMyAuthenticationFactorsRemover(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMyAuthenticationFactorsRemoverRequest,
                    CreateMyAuthenticationFactorsRemoverResponse>(
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
    public java.util.concurrent.Future<CreateMyCustomerSecretKeyResponse> createMyCustomerSecretKey(
            CreateMyCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMyCustomerSecretKeyRequest, CreateMyCustomerSecretKeyResponse>
                    handler) {
        LOG.trace("Called async createMyCustomerSecretKey");
        final CreateMyCustomerSecretKeyRequest interceptedRequest =
                CreateMyCustomerSecretKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMyCustomerSecretKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateMyCustomerSecretKey",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateMyCustomerSecretKeyResponse>
                transformer =
                        CreateMyCustomerSecretKeyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateMyCustomerSecretKeyRequest, CreateMyCustomerSecretKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMyCustomerSecretKeyRequest,
                                CreateMyCustomerSecretKeyResponse>,
                        java.util.concurrent.Future<CreateMyCustomerSecretKeyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getMyCustomerSecretKey(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMyCustomerSecretKeyRequest, CreateMyCustomerSecretKeyResponse>(
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
    public java.util.concurrent.Future<CreateMyOAuth2ClientCredentialResponse>
            createMyOAuth2ClientCredential(
                    CreateMyOAuth2ClientCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateMyOAuth2ClientCredentialRequest,
                                    CreateMyOAuth2ClientCredentialResponse>
                            handler) {
        LOG.trace("Called async createMyOAuth2ClientCredential");
        final CreateMyOAuth2ClientCredentialRequest interceptedRequest =
                CreateMyOAuth2ClientCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMyOAuth2ClientCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateMyOAuth2ClientCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateMyOAuth2ClientCredentialResponse>
                transformer =
                        CreateMyOAuth2ClientCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateMyOAuth2ClientCredentialRequest,
                        CreateMyOAuth2ClientCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMyOAuth2ClientCredentialRequest,
                                CreateMyOAuth2ClientCredentialResponse>,
                        java.util.concurrent.Future<CreateMyOAuth2ClientCredentialResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getMyOAuth2ClientCredential(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMyOAuth2ClientCredentialRequest, CreateMyOAuth2ClientCredentialResponse>(
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
    public java.util.concurrent.Future<CreateMySmtpCredentialResponse> createMySmtpCredential(
            CreateMySmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMySmtpCredentialRequest, CreateMySmtpCredentialResponse>
                    handler) {
        LOG.trace("Called async createMySmtpCredential");
        final CreateMySmtpCredentialRequest interceptedRequest =
                CreateMySmtpCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMySmtpCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateMySmtpCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateMySmtpCredentialResponse>
                transformer =
                        CreateMySmtpCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateMySmtpCredentialRequest, CreateMySmtpCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMySmtpCredentialRequest, CreateMySmtpCredentialResponse>,
                        java.util.concurrent.Future<CreateMySmtpCredentialResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getMySmtpCredential(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMySmtpCredentialRequest, CreateMySmtpCredentialResponse>(
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
    public java.util.concurrent.Future<CreateMySupportAccountResponse> createMySupportAccount(
            CreateMySupportAccountRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMySupportAccountRequest, CreateMySupportAccountResponse>
                    handler) {
        LOG.trace("Called async createMySupportAccount");
        final CreateMySupportAccountRequest interceptedRequest =
                CreateMySupportAccountConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMySupportAccountConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateMySupportAccount",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateMySupportAccountResponse>
                transformer =
                        CreateMySupportAccountConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateMySupportAccountRequest, CreateMySupportAccountResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMySupportAccountRequest, CreateMySupportAccountResponse>,
                        java.util.concurrent.Future<CreateMySupportAccountResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getMySupportAccount(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMySupportAccountRequest, CreateMySupportAccountResponse>(
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
    public java.util.concurrent.Future<CreateMyUserDbCredentialResponse> createMyUserDbCredential(
            CreateMyUserDbCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMyUserDbCredentialRequest, CreateMyUserDbCredentialResponse>
                    handler) {
        LOG.trace("Called async createMyUserDbCredential");
        final CreateMyUserDbCredentialRequest interceptedRequest =
                CreateMyUserDbCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMyUserDbCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateMyUserDbCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateMyUserDbCredentialResponse>
                transformer =
                        CreateMyUserDbCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateMyUserDbCredentialRequest, CreateMyUserDbCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMyUserDbCredentialRequest, CreateMyUserDbCredentialResponse>,
                        java.util.concurrent.Future<CreateMyUserDbCredentialResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getMyUserDbCredential(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMyUserDbCredentialRequest, CreateMyUserDbCredentialResponse>(
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
    public java.util.concurrent.Future<CreateOAuth2ClientCredentialResponse>
            createOAuth2ClientCredential(
                    CreateOAuth2ClientCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateOAuth2ClientCredentialRequest,
                                    CreateOAuth2ClientCredentialResponse>
                            handler) {
        LOG.trace("Called async createOAuth2ClientCredential");
        final CreateOAuth2ClientCredentialRequest interceptedRequest =
                CreateOAuth2ClientCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateOAuth2ClientCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateOAuth2ClientCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateOAuth2ClientCredentialResponse>
                transformer =
                        CreateOAuth2ClientCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateOAuth2ClientCredentialRequest, CreateOAuth2ClientCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateOAuth2ClientCredentialRequest,
                                CreateOAuth2ClientCredentialResponse>,
                        java.util.concurrent.Future<CreateOAuth2ClientCredentialResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getOAuth2ClientCredential(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateOAuth2ClientCredentialRequest, CreateOAuth2ClientCredentialResponse>(
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
    public java.util.concurrent.Future<CreatePasswordPolicyResponse> createPasswordPolicy(
            CreatePasswordPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePasswordPolicyRequest, CreatePasswordPolicyResponse>
                    handler) {
        LOG.trace("Called async createPasswordPolicy");
        final CreatePasswordPolicyRequest interceptedRequest =
                CreatePasswordPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePasswordPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreatePasswordPolicy",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreatePasswordPolicyResponse>
                transformer =
                        CreatePasswordPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreatePasswordPolicyRequest, CreatePasswordPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreatePasswordPolicyRequest, CreatePasswordPolicyResponse>,
                        java.util.concurrent.Future<CreatePasswordPolicyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPasswordPolicy(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreatePasswordPolicyRequest, CreatePasswordPolicyResponse>(
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
    public java.util.concurrent.Future<CreateSmtpCredentialResponse> createSmtpCredential(
            CreateSmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSmtpCredentialRequest, CreateSmtpCredentialResponse>
                    handler) {
        LOG.trace("Called async createSmtpCredential");
        final CreateSmtpCredentialRequest interceptedRequest =
                CreateSmtpCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSmtpCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateSmtpCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateSmtpCredentialResponse>
                transformer =
                        CreateSmtpCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateSmtpCredentialRequest, CreateSmtpCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSmtpCredentialRequest, CreateSmtpCredentialResponse>,
                        java.util.concurrent.Future<CreateSmtpCredentialResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSmtpCredential(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSmtpCredentialRequest, CreateSmtpCredentialResponse>(
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
    public java.util.concurrent.Future<CreateUserResponse> createUser(
            CreateUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateUserRequest, CreateUserResponse>
                    handler) {
        LOG.trace("Called async createUser");
        final CreateUserRequest interceptedRequest = CreateUserConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateUserConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateUser", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateUserResponse>
                transformer =
                        CreateUserConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateUserRequest, CreateUserResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateUserRequest, CreateUserResponse>,
                        java.util.concurrent.Future<CreateUserResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest, interceptedRequest.getUser(), ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateUserRequest, CreateUserResponse>(
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
    public java.util.concurrent.Future<CreateUserDbCredentialResponse> createUserDbCredential(
            CreateUserDbCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateUserDbCredentialRequest, CreateUserDbCredentialResponse>
                    handler) {
        LOG.trace("Called async createUserDbCredential");
        final CreateUserDbCredentialRequest interceptedRequest =
                CreateUserDbCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateUserDbCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateUserDbCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateUserDbCredentialResponse>
                transformer =
                        CreateUserDbCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateUserDbCredentialRequest, CreateUserDbCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateUserDbCredentialRequest, CreateUserDbCredentialResponse>,
                        java.util.concurrent.Future<CreateUserDbCredentialResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUserDbCredential(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateUserDbCredentialRequest, CreateUserDbCredentialResponse>(
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
    public java.util.concurrent.Future<DeleteApiKeyResponse> deleteApiKey(
            DeleteApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteApiKeyRequest, DeleteApiKeyResponse>
                    handler) {
        LOG.trace("Called async deleteApiKey");
        final DeleteApiKeyRequest interceptedRequest =
                DeleteApiKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteApiKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "DeleteApiKey", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteApiKeyResponse>
                transformer =
                        DeleteApiKeyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteApiKeyRequest, DeleteApiKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteApiKeyRequest, DeleteApiKeyResponse>,
                        java.util.concurrent.Future<DeleteApiKeyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteApiKeyRequest, DeleteApiKeyResponse>(
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
    public java.util.concurrent.Future<DeleteAuthTokenResponse> deleteAuthToken(
            DeleteAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAuthTokenRequest, DeleteAuthTokenResponse>
                    handler) {
        LOG.trace("Called async deleteAuthToken");
        final DeleteAuthTokenRequest interceptedRequest =
                DeleteAuthTokenConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAuthTokenConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "DeleteAuthToken", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAuthTokenResponse>
                transformer =
                        DeleteAuthTokenConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteAuthTokenRequest, DeleteAuthTokenResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteAuthTokenRequest, DeleteAuthTokenResponse>,
                        java.util.concurrent.Future<DeleteAuthTokenResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteAuthTokenRequest, DeleteAuthTokenResponse>(
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
    public java.util.concurrent.Future<DeleteCustomerSecretKeyResponse> deleteCustomerSecretKey(
            DeleteCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCustomerSecretKeyRequest, DeleteCustomerSecretKeyResponse>
                    handler) {
        LOG.trace("Called async deleteCustomerSecretKey");
        final DeleteCustomerSecretKeyRequest interceptedRequest =
                DeleteCustomerSecretKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCustomerSecretKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteCustomerSecretKey",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteCustomerSecretKeyResponse>
                transformer =
                        DeleteCustomerSecretKeyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteCustomerSecretKeyRequest, DeleteCustomerSecretKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCustomerSecretKeyRequest, DeleteCustomerSecretKeyResponse>,
                        java.util.concurrent.Future<DeleteCustomerSecretKeyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCustomerSecretKeyRequest, DeleteCustomerSecretKeyResponse>(
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
    public java.util.concurrent.Future<DeleteDynamicResourceGroupResponse>
            deleteDynamicResourceGroup(
                    DeleteDynamicResourceGroupRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDynamicResourceGroupRequest,
                                    DeleteDynamicResourceGroupResponse>
                            handler) {
        LOG.trace("Called async deleteDynamicResourceGroup");
        final DeleteDynamicResourceGroupRequest interceptedRequest =
                DeleteDynamicResourceGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteDynamicResourceGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteDynamicResourceGroup",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteDynamicResourceGroupResponse>
                transformer =
                        DeleteDynamicResourceGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteDynamicResourceGroupRequest, DeleteDynamicResourceGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteDynamicResourceGroupRequest,
                                DeleteDynamicResourceGroupResponse>,
                        java.util.concurrent.Future<DeleteDynamicResourceGroupResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteDynamicResourceGroupRequest, DeleteDynamicResourceGroupResponse>(
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
    public java.util.concurrent.Future<DeleteGroupResponse> deleteGroup(
            DeleteGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteGroupRequest, DeleteGroupResponse>
                    handler) {
        LOG.trace("Called async deleteGroup");
        final DeleteGroupRequest interceptedRequest =
                DeleteGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "DeleteGroup", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteGroupResponse>
                transformer =
                        DeleteGroupConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteGroupRequest, DeleteGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteGroupRequest, DeleteGroupResponse>,
                        java.util.concurrent.Future<DeleteGroupResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteGroupRequest, DeleteGroupResponse>(
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
    public java.util.concurrent.Future<DeleteIdentityProviderResponse> deleteIdentityProvider(
            DeleteIdentityProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteIdentityProviderRequest, DeleteIdentityProviderResponse>
                    handler) {
        LOG.trace("Called async deleteIdentityProvider");
        final DeleteIdentityProviderRequest interceptedRequest =
                DeleteIdentityProviderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteIdentityProviderConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteIdentityProvider",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteIdentityProviderResponse>
                transformer =
                        DeleteIdentityProviderConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteIdentityProviderRequest, DeleteIdentityProviderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteIdentityProviderRequest, DeleteIdentityProviderResponse>,
                        java.util.concurrent.Future<DeleteIdentityProviderResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteIdentityProviderRequest, DeleteIdentityProviderResponse>(
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
    public java.util.concurrent.Future<DeleteMyApiKeyResponse> deleteMyApiKey(
            DeleteMyApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMyApiKeyRequest, DeleteMyApiKeyResponse>
                    handler) {
        LOG.trace("Called async deleteMyApiKey");
        final DeleteMyApiKeyRequest interceptedRequest =
                DeleteMyApiKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMyApiKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "DeleteMyApiKey", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteMyApiKeyResponse>
                transformer =
                        DeleteMyApiKeyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteMyApiKeyRequest, DeleteMyApiKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMyApiKeyRequest, DeleteMyApiKeyResponse>,
                        java.util.concurrent.Future<DeleteMyApiKeyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMyApiKeyRequest, DeleteMyApiKeyResponse>(
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
    public java.util.concurrent.Future<DeleteMyAuthTokenResponse> deleteMyAuthToken(
            DeleteMyAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMyAuthTokenRequest, DeleteMyAuthTokenResponse>
                    handler) {
        LOG.trace("Called async deleteMyAuthToken");
        final DeleteMyAuthTokenRequest interceptedRequest =
                DeleteMyAuthTokenConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMyAuthTokenConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "DeleteMyAuthToken", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteMyAuthTokenResponse>
                transformer =
                        DeleteMyAuthTokenConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteMyAuthTokenRequest, DeleteMyAuthTokenResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMyAuthTokenRequest, DeleteMyAuthTokenResponse>,
                        java.util.concurrent.Future<DeleteMyAuthTokenResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMyAuthTokenRequest, DeleteMyAuthTokenResponse>(
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
    public java.util.concurrent.Future<DeleteMyCustomerSecretKeyResponse> deleteMyCustomerSecretKey(
            DeleteMyCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMyCustomerSecretKeyRequest, DeleteMyCustomerSecretKeyResponse>
                    handler) {
        LOG.trace("Called async deleteMyCustomerSecretKey");
        final DeleteMyCustomerSecretKeyRequest interceptedRequest =
                DeleteMyCustomerSecretKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMyCustomerSecretKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteMyCustomerSecretKey",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteMyCustomerSecretKeyResponse>
                transformer =
                        DeleteMyCustomerSecretKeyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteMyCustomerSecretKeyRequest, DeleteMyCustomerSecretKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMyCustomerSecretKeyRequest,
                                DeleteMyCustomerSecretKeyResponse>,
                        java.util.concurrent.Future<DeleteMyCustomerSecretKeyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMyCustomerSecretKeyRequest, DeleteMyCustomerSecretKeyResponse>(
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
    public java.util.concurrent.Future<DeleteMyDeviceResponse> deleteMyDevice(
            DeleteMyDeviceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMyDeviceRequest, DeleteMyDeviceResponse>
                    handler) {
        LOG.trace("Called async deleteMyDevice");
        final DeleteMyDeviceRequest interceptedRequest =
                DeleteMyDeviceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMyDeviceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "DeleteMyDevice", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteMyDeviceResponse>
                transformer =
                        DeleteMyDeviceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteMyDeviceRequest, DeleteMyDeviceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMyDeviceRequest, DeleteMyDeviceResponse>,
                        java.util.concurrent.Future<DeleteMyDeviceResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMyDeviceRequest, DeleteMyDeviceResponse>(
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
    public java.util.concurrent.Future<DeleteMyOAuth2ClientCredentialResponse>
            deleteMyOAuth2ClientCredential(
                    DeleteMyOAuth2ClientCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteMyOAuth2ClientCredentialRequest,
                                    DeleteMyOAuth2ClientCredentialResponse>
                            handler) {
        LOG.trace("Called async deleteMyOAuth2ClientCredential");
        final DeleteMyOAuth2ClientCredentialRequest interceptedRequest =
                DeleteMyOAuth2ClientCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMyOAuth2ClientCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteMyOAuth2ClientCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteMyOAuth2ClientCredentialResponse>
                transformer =
                        DeleteMyOAuth2ClientCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteMyOAuth2ClientCredentialRequest,
                        DeleteMyOAuth2ClientCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMyOAuth2ClientCredentialRequest,
                                DeleteMyOAuth2ClientCredentialResponse>,
                        java.util.concurrent.Future<DeleteMyOAuth2ClientCredentialResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMyOAuth2ClientCredentialRequest, DeleteMyOAuth2ClientCredentialResponse>(
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
    public java.util.concurrent.Future<DeleteMySmtpCredentialResponse> deleteMySmtpCredential(
            DeleteMySmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMySmtpCredentialRequest, DeleteMySmtpCredentialResponse>
                    handler) {
        LOG.trace("Called async deleteMySmtpCredential");
        final DeleteMySmtpCredentialRequest interceptedRequest =
                DeleteMySmtpCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMySmtpCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteMySmtpCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteMySmtpCredentialResponse>
                transformer =
                        DeleteMySmtpCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteMySmtpCredentialRequest, DeleteMySmtpCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMySmtpCredentialRequest, DeleteMySmtpCredentialResponse>,
                        java.util.concurrent.Future<DeleteMySmtpCredentialResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMySmtpCredentialRequest, DeleteMySmtpCredentialResponse>(
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
    public java.util.concurrent.Future<DeleteMySupportAccountResponse> deleteMySupportAccount(
            DeleteMySupportAccountRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMySupportAccountRequest, DeleteMySupportAccountResponse>
                    handler) {
        LOG.trace("Called async deleteMySupportAccount");
        final DeleteMySupportAccountRequest interceptedRequest =
                DeleteMySupportAccountConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMySupportAccountConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteMySupportAccount",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteMySupportAccountResponse>
                transformer =
                        DeleteMySupportAccountConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteMySupportAccountRequest, DeleteMySupportAccountResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMySupportAccountRequest, DeleteMySupportAccountResponse>,
                        java.util.concurrent.Future<DeleteMySupportAccountResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMySupportAccountRequest, DeleteMySupportAccountResponse>(
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
    public java.util.concurrent.Future<DeleteMyTrustedUserAgentResponse> deleteMyTrustedUserAgent(
            DeleteMyTrustedUserAgentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMyTrustedUserAgentRequest, DeleteMyTrustedUserAgentResponse>
                    handler) {
        LOG.trace("Called async deleteMyTrustedUserAgent");
        final DeleteMyTrustedUserAgentRequest interceptedRequest =
                DeleteMyTrustedUserAgentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMyTrustedUserAgentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteMyTrustedUserAgent",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteMyTrustedUserAgentResponse>
                transformer =
                        DeleteMyTrustedUserAgentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteMyTrustedUserAgentRequest, DeleteMyTrustedUserAgentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMyTrustedUserAgentRequest, DeleteMyTrustedUserAgentResponse>,
                        java.util.concurrent.Future<DeleteMyTrustedUserAgentResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMyTrustedUserAgentRequest, DeleteMyTrustedUserAgentResponse>(
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
    public java.util.concurrent.Future<DeleteMyUserDbCredentialResponse> deleteMyUserDbCredential(
            DeleteMyUserDbCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMyUserDbCredentialRequest, DeleteMyUserDbCredentialResponse>
                    handler) {
        LOG.trace("Called async deleteMyUserDbCredential");
        final DeleteMyUserDbCredentialRequest interceptedRequest =
                DeleteMyUserDbCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteMyUserDbCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteMyUserDbCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteMyUserDbCredentialResponse>
                transformer =
                        DeleteMyUserDbCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteMyUserDbCredentialRequest, DeleteMyUserDbCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteMyUserDbCredentialRequest, DeleteMyUserDbCredentialResponse>,
                        java.util.concurrent.Future<DeleteMyUserDbCredentialResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteMyUserDbCredentialRequest, DeleteMyUserDbCredentialResponse>(
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
    public java.util.concurrent.Future<DeleteOAuth2ClientCredentialResponse>
            deleteOAuth2ClientCredential(
                    DeleteOAuth2ClientCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOAuth2ClientCredentialRequest,
                                    DeleteOAuth2ClientCredentialResponse>
                            handler) {
        LOG.trace("Called async deleteOAuth2ClientCredential");
        final DeleteOAuth2ClientCredentialRequest interceptedRequest =
                DeleteOAuth2ClientCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteOAuth2ClientCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteOAuth2ClientCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteOAuth2ClientCredentialResponse>
                transformer =
                        DeleteOAuth2ClientCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteOAuth2ClientCredentialRequest, DeleteOAuth2ClientCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteOAuth2ClientCredentialRequest,
                                DeleteOAuth2ClientCredentialResponse>,
                        java.util.concurrent.Future<DeleteOAuth2ClientCredentialResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteOAuth2ClientCredentialRequest, DeleteOAuth2ClientCredentialResponse>(
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
    public java.util.concurrent.Future<DeletePasswordPolicyResponse> deletePasswordPolicy(
            DeletePasswordPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePasswordPolicyRequest, DeletePasswordPolicyResponse>
                    handler) {
        LOG.trace("Called async deletePasswordPolicy");
        final DeletePasswordPolicyRequest interceptedRequest =
                DeletePasswordPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePasswordPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeletePasswordPolicy",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeletePasswordPolicyResponse>
                transformer =
                        DeletePasswordPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeletePasswordPolicyRequest, DeletePasswordPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeletePasswordPolicyRequest, DeletePasswordPolicyResponse>,
                        java.util.concurrent.Future<DeletePasswordPolicyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeletePasswordPolicyRequest, DeletePasswordPolicyResponse>(
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
    public java.util.concurrent.Future<DeleteSmtpCredentialResponse> deleteSmtpCredential(
            DeleteSmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSmtpCredentialRequest, DeleteSmtpCredentialResponse>
                    handler) {
        LOG.trace("Called async deleteSmtpCredential");
        final DeleteSmtpCredentialRequest interceptedRequest =
                DeleteSmtpCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSmtpCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteSmtpCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteSmtpCredentialResponse>
                transformer =
                        DeleteSmtpCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSmtpCredentialRequest, DeleteSmtpCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSmtpCredentialRequest, DeleteSmtpCredentialResponse>,
                        java.util.concurrent.Future<DeleteSmtpCredentialResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSmtpCredentialRequest, DeleteSmtpCredentialResponse>(
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
    public java.util.concurrent.Future<DeleteUserResponse> deleteUser(
            DeleteUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteUserRequest, DeleteUserResponse>
                    handler) {
        LOG.trace("Called async deleteUser");
        final DeleteUserRequest interceptedRequest = DeleteUserConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteUserConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "DeleteUser", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteUserResponse>
                transformer =
                        DeleteUserConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteUserRequest, DeleteUserResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteUserRequest, DeleteUserResponse>,
                        java.util.concurrent.Future<DeleteUserResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteUserRequest, DeleteUserResponse>(
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
    public java.util.concurrent.Future<DeleteUserDbCredentialResponse> deleteUserDbCredential(
            DeleteUserDbCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteUserDbCredentialRequest, DeleteUserDbCredentialResponse>
                    handler) {
        LOG.trace("Called async deleteUserDbCredential");
        final DeleteUserDbCredentialRequest interceptedRequest =
                DeleteUserDbCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteUserDbCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteUserDbCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteUserDbCredentialResponse>
                transformer =
                        DeleteUserDbCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteUserDbCredentialRequest, DeleteUserDbCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteUserDbCredentialRequest, DeleteUserDbCredentialResponse>,
                        java.util.concurrent.Future<DeleteUserDbCredentialResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteUserDbCredentialRequest, DeleteUserDbCredentialResponse>(
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
    public java.util.concurrent.Future<GetApiKeyResponse> getApiKey(
            GetApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetApiKeyRequest, GetApiKeyResponse>
                    handler) {
        LOG.trace("Called async getApiKey");
        final GetApiKeyRequest interceptedRequest = GetApiKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetApiKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "GetApiKey", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetApiKeyResponse>
                transformer =
                        GetApiKeyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetApiKeyRequest, GetApiKeyResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetApiKeyRequest, GetApiKeyResponse>,
                        java.util.concurrent.Future<GetApiKeyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetApiKeyRequest, GetApiKeyResponse>(
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
    public java.util.concurrent.Future<GetAuthTokenResponse> getAuthToken(
            GetAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAuthTokenRequest, GetAuthTokenResponse>
                    handler) {
        LOG.trace("Called async getAuthToken");
        final GetAuthTokenRequest interceptedRequest =
                GetAuthTokenConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAuthTokenConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "GetAuthToken", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAuthTokenResponse>
                transformer =
                        GetAuthTokenConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetAuthTokenRequest, GetAuthTokenResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAuthTokenRequest, GetAuthTokenResponse>,
                        java.util.concurrent.Future<GetAuthTokenResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAuthTokenRequest, GetAuthTokenResponse>(
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
    public java.util.concurrent.Future<GetAuthenticationFactorSettingResponse>
            getAuthenticationFactorSetting(
                    GetAuthenticationFactorSettingRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAuthenticationFactorSettingRequest,
                                    GetAuthenticationFactorSettingResponse>
                            handler) {
        LOG.trace("Called async getAuthenticationFactorSetting");
        final GetAuthenticationFactorSettingRequest interceptedRequest =
                GetAuthenticationFactorSettingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAuthenticationFactorSettingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetAuthenticationFactorSetting",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetAuthenticationFactorSettingResponse>
                transformer =
                        GetAuthenticationFactorSettingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetAuthenticationFactorSettingRequest,
                        GetAuthenticationFactorSettingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAuthenticationFactorSettingRequest,
                                GetAuthenticationFactorSettingResponse>,
                        java.util.concurrent.Future<GetAuthenticationFactorSettingResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAuthenticationFactorSettingRequest, GetAuthenticationFactorSettingResponse>(
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
    public java.util.concurrent.Future<GetCustomerSecretKeyResponse> getCustomerSecretKey(
            GetCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCustomerSecretKeyRequest, GetCustomerSecretKeyResponse>
                    handler) {
        LOG.trace("Called async getCustomerSecretKey");
        final GetCustomerSecretKeyRequest interceptedRequest =
                GetCustomerSecretKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCustomerSecretKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetCustomerSecretKey",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetCustomerSecretKeyResponse>
                transformer =
                        GetCustomerSecretKeyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetCustomerSecretKeyRequest, GetCustomerSecretKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCustomerSecretKeyRequest, GetCustomerSecretKeyResponse>,
                        java.util.concurrent.Future<GetCustomerSecretKeyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCustomerSecretKeyRequest, GetCustomerSecretKeyResponse>(
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
    public java.util.concurrent.Future<GetDynamicResourceGroupResponse> getDynamicResourceGroup(
            GetDynamicResourceGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDynamicResourceGroupRequest, GetDynamicResourceGroupResponse>
                    handler) {
        LOG.trace("Called async getDynamicResourceGroup");
        final GetDynamicResourceGroupRequest interceptedRequest =
                GetDynamicResourceGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetDynamicResourceGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetDynamicResourceGroup",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetDynamicResourceGroupResponse>
                transformer =
                        GetDynamicResourceGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetDynamicResourceGroupRequest, GetDynamicResourceGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetDynamicResourceGroupRequest, GetDynamicResourceGroupResponse>,
                        java.util.concurrent.Future<GetDynamicResourceGroupResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetDynamicResourceGroupRequest, GetDynamicResourceGroupResponse>(
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
    public java.util.concurrent.Future<GetGroupResponse> getGroup(
            GetGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetGroupRequest, GetGroupResponse>
                    handler) {
        LOG.trace("Called async getGroup");
        final GetGroupRequest interceptedRequest = GetGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "GetGroup", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetGroupResponse> transformer =
                GetGroupConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetGroupRequest, GetGroupResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetGroupRequest, GetGroupResponse>,
                        java.util.concurrent.Future<GetGroupResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetGroupRequest, GetGroupResponse>(
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
    public java.util.concurrent.Future<GetIdentityProviderResponse> getIdentityProvider(
            GetIdentityProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetIdentityProviderRequest, GetIdentityProviderResponse>
                    handler) {
        LOG.trace("Called async getIdentityProvider");
        final GetIdentityProviderRequest interceptedRequest =
                GetIdentityProviderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIdentityProviderConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetIdentityProvider",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetIdentityProviderResponse>
                transformer =
                        GetIdentityProviderConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetIdentityProviderRequest, GetIdentityProviderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetIdentityProviderRequest, GetIdentityProviderResponse>,
                        java.util.concurrent.Future<GetIdentityProviderResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetIdentityProviderRequest, GetIdentityProviderResponse>(
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
    public java.util.concurrent.Future<GetKmsiSettingResponse> getKmsiSetting(
            GetKmsiSettingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetKmsiSettingRequest, GetKmsiSettingResponse>
                    handler) {
        LOG.trace("Called async getKmsiSetting");
        final GetKmsiSettingRequest interceptedRequest =
                GetKmsiSettingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetKmsiSettingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "GetKmsiSetting", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetKmsiSettingResponse>
                transformer =
                        GetKmsiSettingConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetKmsiSettingRequest, GetKmsiSettingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetKmsiSettingRequest, GetKmsiSettingResponse>,
                        java.util.concurrent.Future<GetKmsiSettingResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetKmsiSettingRequest, GetKmsiSettingResponse>(
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
    public java.util.concurrent.Future<GetMeResponse> getMe(
            GetMeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetMeRequest, GetMeResponse> handler) {
        LOG.trace("Called async getMe");
        final GetMeRequest interceptedRequest = GetMeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "GetMe", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMeResponse> transformer =
                GetMeConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetMeRequest, GetMeResponse> handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetMeRequest, GetMeResponse>,
                        java.util.concurrent.Future<GetMeResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMeRequest, GetMeResponse>(
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
    public java.util.concurrent.Future<GetMyApiKeyResponse> getMyApiKey(
            GetMyApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetMyApiKeyRequest, GetMyApiKeyResponse>
                    handler) {
        LOG.trace("Called async getMyApiKey");
        final GetMyApiKeyRequest interceptedRequest =
                GetMyApiKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMyApiKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "GetMyApiKey", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMyApiKeyResponse>
                transformer =
                        GetMyApiKeyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetMyApiKeyRequest, GetMyApiKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMyApiKeyRequest, GetMyApiKeyResponse>,
                        java.util.concurrent.Future<GetMyApiKeyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMyApiKeyRequest, GetMyApiKeyResponse>(
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
    public java.util.concurrent.Future<GetMyAuthTokenResponse> getMyAuthToken(
            GetMyAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMyAuthTokenRequest, GetMyAuthTokenResponse>
                    handler) {
        LOG.trace("Called async getMyAuthToken");
        final GetMyAuthTokenRequest interceptedRequest =
                GetMyAuthTokenConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMyAuthTokenConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "GetMyAuthToken", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMyAuthTokenResponse>
                transformer =
                        GetMyAuthTokenConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetMyAuthTokenRequest, GetMyAuthTokenResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMyAuthTokenRequest, GetMyAuthTokenResponse>,
                        java.util.concurrent.Future<GetMyAuthTokenResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMyAuthTokenRequest, GetMyAuthTokenResponse>(
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
    public java.util.concurrent.Future<GetMyCustomerSecretKeyResponse> getMyCustomerSecretKey(
            GetMyCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMyCustomerSecretKeyRequest, GetMyCustomerSecretKeyResponse>
                    handler) {
        LOG.trace("Called async getMyCustomerSecretKey");
        final GetMyCustomerSecretKeyRequest interceptedRequest =
                GetMyCustomerSecretKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMyCustomerSecretKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetMyCustomerSecretKey",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMyCustomerSecretKeyResponse>
                transformer =
                        GetMyCustomerSecretKeyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetMyCustomerSecretKeyRequest, GetMyCustomerSecretKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMyCustomerSecretKeyRequest, GetMyCustomerSecretKeyResponse>,
                        java.util.concurrent.Future<GetMyCustomerSecretKeyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMyCustomerSecretKeyRequest, GetMyCustomerSecretKeyResponse>(
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
    public java.util.concurrent.Future<GetMyDeviceResponse> getMyDevice(
            GetMyDeviceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetMyDeviceRequest, GetMyDeviceResponse>
                    handler) {
        LOG.trace("Called async getMyDevice");
        final GetMyDeviceRequest interceptedRequest =
                GetMyDeviceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMyDeviceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "GetMyDevice", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMyDeviceResponse>
                transformer =
                        GetMyDeviceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetMyDeviceRequest, GetMyDeviceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMyDeviceRequest, GetMyDeviceResponse>,
                        java.util.concurrent.Future<GetMyDeviceResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMyDeviceRequest, GetMyDeviceResponse>(
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
    public java.util.concurrent.Future<GetMyOAuth2ClientCredentialResponse>
            getMyOAuth2ClientCredential(
                    GetMyOAuth2ClientCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetMyOAuth2ClientCredentialRequest,
                                    GetMyOAuth2ClientCredentialResponse>
                            handler) {
        LOG.trace("Called async getMyOAuth2ClientCredential");
        final GetMyOAuth2ClientCredentialRequest interceptedRequest =
                GetMyOAuth2ClientCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMyOAuth2ClientCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetMyOAuth2ClientCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetMyOAuth2ClientCredentialResponse>
                transformer =
                        GetMyOAuth2ClientCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetMyOAuth2ClientCredentialRequest, GetMyOAuth2ClientCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMyOAuth2ClientCredentialRequest,
                                GetMyOAuth2ClientCredentialResponse>,
                        java.util.concurrent.Future<GetMyOAuth2ClientCredentialResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMyOAuth2ClientCredentialRequest, GetMyOAuth2ClientCredentialResponse>(
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
    public java.util.concurrent.Future<GetMySmtpCredentialResponse> getMySmtpCredential(
            GetMySmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMySmtpCredentialRequest, GetMySmtpCredentialResponse>
                    handler) {
        LOG.trace("Called async getMySmtpCredential");
        final GetMySmtpCredentialRequest interceptedRequest =
                GetMySmtpCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMySmtpCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetMySmtpCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMySmtpCredentialResponse>
                transformer =
                        GetMySmtpCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetMySmtpCredentialRequest, GetMySmtpCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMySmtpCredentialRequest, GetMySmtpCredentialResponse>,
                        java.util.concurrent.Future<GetMySmtpCredentialResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMySmtpCredentialRequest, GetMySmtpCredentialResponse>(
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
    public java.util.concurrent.Future<GetMySupportAccountResponse> getMySupportAccount(
            GetMySupportAccountRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMySupportAccountRequest, GetMySupportAccountResponse>
                    handler) {
        LOG.trace("Called async getMySupportAccount");
        final GetMySupportAccountRequest interceptedRequest =
                GetMySupportAccountConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMySupportAccountConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetMySupportAccount",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMySupportAccountResponse>
                transformer =
                        GetMySupportAccountConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetMySupportAccountRequest, GetMySupportAccountResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMySupportAccountRequest, GetMySupportAccountResponse>,
                        java.util.concurrent.Future<GetMySupportAccountResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMySupportAccountRequest, GetMySupportAccountResponse>(
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
    public java.util.concurrent.Future<GetMyTrustedUserAgentResponse> getMyTrustedUserAgent(
            GetMyTrustedUserAgentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMyTrustedUserAgentRequest, GetMyTrustedUserAgentResponse>
                    handler) {
        LOG.trace("Called async getMyTrustedUserAgent");
        final GetMyTrustedUserAgentRequest interceptedRequest =
                GetMyTrustedUserAgentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMyTrustedUserAgentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetMyTrustedUserAgent",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMyTrustedUserAgentResponse>
                transformer =
                        GetMyTrustedUserAgentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetMyTrustedUserAgentRequest, GetMyTrustedUserAgentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMyTrustedUserAgentRequest, GetMyTrustedUserAgentResponse>,
                        java.util.concurrent.Future<GetMyTrustedUserAgentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMyTrustedUserAgentRequest, GetMyTrustedUserAgentResponse>(
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
    public java.util.concurrent.Future<GetMyUserDbCredentialResponse> getMyUserDbCredential(
            GetMyUserDbCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMyUserDbCredentialRequest, GetMyUserDbCredentialResponse>
                    handler) {
        LOG.trace("Called async getMyUserDbCredential");
        final GetMyUserDbCredentialRequest interceptedRequest =
                GetMyUserDbCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMyUserDbCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetMyUserDbCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMyUserDbCredentialResponse>
                transformer =
                        GetMyUserDbCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetMyUserDbCredentialRequest, GetMyUserDbCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMyUserDbCredentialRequest, GetMyUserDbCredentialResponse>,
                        java.util.concurrent.Future<GetMyUserDbCredentialResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMyUserDbCredentialRequest, GetMyUserDbCredentialResponse>(
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
    public java.util.concurrent.Future<GetOAuth2ClientCredentialResponse> getOAuth2ClientCredential(
            GetOAuth2ClientCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOAuth2ClientCredentialRequest, GetOAuth2ClientCredentialResponse>
                    handler) {
        LOG.trace("Called async getOAuth2ClientCredential");
        final GetOAuth2ClientCredentialRequest interceptedRequest =
                GetOAuth2ClientCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOAuth2ClientCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetOAuth2ClientCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetOAuth2ClientCredentialResponse>
                transformer =
                        GetOAuth2ClientCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetOAuth2ClientCredentialRequest, GetOAuth2ClientCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetOAuth2ClientCredentialRequest,
                                GetOAuth2ClientCredentialResponse>,
                        java.util.concurrent.Future<GetOAuth2ClientCredentialResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetOAuth2ClientCredentialRequest, GetOAuth2ClientCredentialResponse>(
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
    public java.util.concurrent.Future<GetPasswordPolicyResponse> getPasswordPolicy(
            GetPasswordPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPasswordPolicyRequest, GetPasswordPolicyResponse>
                    handler) {
        LOG.trace("Called async getPasswordPolicy");
        final GetPasswordPolicyRequest interceptedRequest =
                GetPasswordPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPasswordPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "GetPasswordPolicy", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetPasswordPolicyResponse>
                transformer =
                        GetPasswordPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetPasswordPolicyRequest, GetPasswordPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetPasswordPolicyRequest, GetPasswordPolicyResponse>,
                        java.util.concurrent.Future<GetPasswordPolicyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPasswordPolicyRequest, GetPasswordPolicyResponse>(
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
    public java.util.concurrent.Future<GetSmtpCredentialResponse> getSmtpCredential(
            GetSmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSmtpCredentialRequest, GetSmtpCredentialResponse>
                    handler) {
        LOG.trace("Called async getSmtpCredential");
        final GetSmtpCredentialRequest interceptedRequest =
                GetSmtpCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSmtpCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "GetSmtpCredential", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSmtpCredentialResponse>
                transformer =
                        GetSmtpCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSmtpCredentialRequest, GetSmtpCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSmtpCredentialRequest, GetSmtpCredentialResponse>,
                        java.util.concurrent.Future<GetSmtpCredentialResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSmtpCredentialRequest, GetSmtpCredentialResponse>(
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
    public java.util.concurrent.Future<GetUserResponse> getUser(
            GetUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetUserRequest, GetUserResponse> handler) {
        LOG.trace("Called async getUser");
        final GetUserRequest interceptedRequest = GetUserConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "GetUser", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetUserResponse> transformer =
                GetUserConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetUserRequest, GetUserResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetUserRequest, GetUserResponse>,
                        java.util.concurrent.Future<GetUserResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetUserRequest, GetUserResponse>(
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
    public java.util.concurrent.Future<GetUserDbCredentialResponse> getUserDbCredential(
            GetUserDbCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetUserDbCredentialRequest, GetUserDbCredentialResponse>
                    handler) {
        LOG.trace("Called async getUserDbCredential");
        final GetUserDbCredentialRequest interceptedRequest =
                GetUserDbCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserDbCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetUserDbCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetUserDbCredentialResponse>
                transformer =
                        GetUserDbCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetUserDbCredentialRequest, GetUserDbCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetUserDbCredentialRequest, GetUserDbCredentialResponse>,
                        java.util.concurrent.Future<GetUserDbCredentialResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetUserDbCredentialRequest, GetUserDbCredentialResponse>(
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
    public java.util.concurrent.Future<ListApiKeysResponse> listApiKeys(
            ListApiKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListApiKeysRequest, ListApiKeysResponse>
                    handler) {
        LOG.trace("Called async listApiKeys");
        final ListApiKeysRequest interceptedRequest =
                ListApiKeysConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListApiKeysConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "ListApiKeys", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListApiKeysResponse>
                transformer =
                        ListApiKeysConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListApiKeysRequest, ListApiKeysResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListApiKeysRequest, ListApiKeysResponse>,
                        java.util.concurrent.Future<ListApiKeysResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListApiKeysRequest, ListApiKeysResponse>(
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
    public java.util.concurrent.Future<ListAuthTokensResponse> listAuthTokens(
            ListAuthTokensRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAuthTokensRequest, ListAuthTokensResponse>
                    handler) {
        LOG.trace("Called async listAuthTokens");
        final ListAuthTokensRequest interceptedRequest =
                ListAuthTokensConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuthTokensConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "ListAuthTokens", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAuthTokensResponse>
                transformer =
                        ListAuthTokensConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListAuthTokensRequest, ListAuthTokensResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAuthTokensRequest, ListAuthTokensResponse>,
                        java.util.concurrent.Future<ListAuthTokensResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAuthTokensRequest, ListAuthTokensResponse>(
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
    public java.util.concurrent.Future<ListAuthenticationFactorSettingsResponse>
            listAuthenticationFactorSettings(
                    ListAuthenticationFactorSettingsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAuthenticationFactorSettingsRequest,
                                    ListAuthenticationFactorSettingsResponse>
                            handler) {
        LOG.trace("Called async listAuthenticationFactorSettings");
        final ListAuthenticationFactorSettingsRequest interceptedRequest =
                ListAuthenticationFactorSettingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAuthenticationFactorSettingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListAuthenticationFactorSettings",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListAuthenticationFactorSettingsResponse>
                transformer =
                        ListAuthenticationFactorSettingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListAuthenticationFactorSettingsRequest,
                        ListAuthenticationFactorSettingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAuthenticationFactorSettingsRequest,
                                ListAuthenticationFactorSettingsResponse>,
                        java.util.concurrent.Future<ListAuthenticationFactorSettingsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAuthenticationFactorSettingsRequest,
                    ListAuthenticationFactorSettingsResponse>(
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
    public java.util.concurrent.Future<ListCustomerSecretKeysResponse> listCustomerSecretKeys(
            ListCustomerSecretKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCustomerSecretKeysRequest, ListCustomerSecretKeysResponse>
                    handler) {
        LOG.trace("Called async listCustomerSecretKeys");
        final ListCustomerSecretKeysRequest interceptedRequest =
                ListCustomerSecretKeysConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCustomerSecretKeysConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListCustomerSecretKeys",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListCustomerSecretKeysResponse>
                transformer =
                        ListCustomerSecretKeysConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListCustomerSecretKeysRequest, ListCustomerSecretKeysResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCustomerSecretKeysRequest, ListCustomerSecretKeysResponse>,
                        java.util.concurrent.Future<ListCustomerSecretKeysResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCustomerSecretKeysRequest, ListCustomerSecretKeysResponse>(
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
    public java.util.concurrent.Future<ListDynamicResourceGroupsResponse> listDynamicResourceGroups(
            ListDynamicResourceGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDynamicResourceGroupsRequest, ListDynamicResourceGroupsResponse>
                    handler) {
        LOG.trace("Called async listDynamicResourceGroups");
        final ListDynamicResourceGroupsRequest interceptedRequest =
                ListDynamicResourceGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListDynamicResourceGroupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListDynamicResourceGroups",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListDynamicResourceGroupsResponse>
                transformer =
                        ListDynamicResourceGroupsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListDynamicResourceGroupsRequest, ListDynamicResourceGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListDynamicResourceGroupsRequest,
                                ListDynamicResourceGroupsResponse>,
                        java.util.concurrent.Future<ListDynamicResourceGroupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListDynamicResourceGroupsRequest, ListDynamicResourceGroupsResponse>(
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
    public java.util.concurrent.Future<ListGroupsResponse> listGroups(
            ListGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListGroupsRequest, ListGroupsResponse>
                    handler) {
        LOG.trace("Called async listGroups");
        final ListGroupsRequest interceptedRequest = ListGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListGroupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "ListGroups", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListGroupsResponse>
                transformer =
                        ListGroupsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListGroupsRequest, ListGroupsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListGroupsRequest, ListGroupsResponse>,
                        java.util.concurrent.Future<ListGroupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListGroupsRequest, ListGroupsResponse>(
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
    public java.util.concurrent.Future<ListIdentityProvidersResponse> listIdentityProviders(
            ListIdentityProvidersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIdentityProvidersRequest, ListIdentityProvidersResponse>
                    handler) {
        LOG.trace("Called async listIdentityProviders");
        final ListIdentityProvidersRequest interceptedRequest =
                ListIdentityProvidersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIdentityProvidersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListIdentityProviders",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListIdentityProvidersResponse>
                transformer =
                        ListIdentityProvidersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListIdentityProvidersRequest, ListIdentityProvidersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListIdentityProvidersRequest, ListIdentityProvidersResponse>,
                        java.util.concurrent.Future<ListIdentityProvidersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListIdentityProvidersRequest, ListIdentityProvidersResponse>(
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
    public java.util.concurrent.Future<ListKmsiSettingsResponse> listKmsiSettings(
            ListKmsiSettingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListKmsiSettingsRequest, ListKmsiSettingsResponse>
                    handler) {
        LOG.trace("Called async listKmsiSettings");
        final ListKmsiSettingsRequest interceptedRequest =
                ListKmsiSettingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListKmsiSettingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "ListKmsiSettings", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListKmsiSettingsResponse>
                transformer =
                        ListKmsiSettingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListKmsiSettingsRequest, ListKmsiSettingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListKmsiSettingsRequest, ListKmsiSettingsResponse>,
                        java.util.concurrent.Future<ListKmsiSettingsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListKmsiSettingsRequest, ListKmsiSettingsResponse>(
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
    public java.util.concurrent.Future<ListMyApiKeysResponse> listMyApiKeys(
            ListMyApiKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListMyApiKeysRequest, ListMyApiKeysResponse>
                    handler) {
        LOG.trace("Called async listMyApiKeys");
        final ListMyApiKeysRequest interceptedRequest =
                ListMyApiKeysConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyApiKeysConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "ListMyApiKeys", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMyApiKeysResponse>
                transformer =
                        ListMyApiKeysConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListMyApiKeysRequest, ListMyApiKeysResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMyApiKeysRequest, ListMyApiKeysResponse>,
                        java.util.concurrent.Future<ListMyApiKeysResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMyApiKeysRequest, ListMyApiKeysResponse>(
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
    public java.util.concurrent.Future<ListMyAuthTokensResponse> listMyAuthTokens(
            ListMyAuthTokensRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMyAuthTokensRequest, ListMyAuthTokensResponse>
                    handler) {
        LOG.trace("Called async listMyAuthTokens");
        final ListMyAuthTokensRequest interceptedRequest =
                ListMyAuthTokensConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyAuthTokensConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "ListMyAuthTokens", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMyAuthTokensResponse>
                transformer =
                        ListMyAuthTokensConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListMyAuthTokensRequest, ListMyAuthTokensResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMyAuthTokensRequest, ListMyAuthTokensResponse>,
                        java.util.concurrent.Future<ListMyAuthTokensResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMyAuthTokensRequest, ListMyAuthTokensResponse>(
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
    public java.util.concurrent.Future<ListMyCustomerSecretKeysResponse> listMyCustomerSecretKeys(
            ListMyCustomerSecretKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMyCustomerSecretKeysRequest, ListMyCustomerSecretKeysResponse>
                    handler) {
        LOG.trace("Called async listMyCustomerSecretKeys");
        final ListMyCustomerSecretKeysRequest interceptedRequest =
                ListMyCustomerSecretKeysConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyCustomerSecretKeysConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMyCustomerSecretKeys",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListMyCustomerSecretKeysResponse>
                transformer =
                        ListMyCustomerSecretKeysConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMyCustomerSecretKeysRequest, ListMyCustomerSecretKeysResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMyCustomerSecretKeysRequest, ListMyCustomerSecretKeysResponse>,
                        java.util.concurrent.Future<ListMyCustomerSecretKeysResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMyCustomerSecretKeysRequest, ListMyCustomerSecretKeysResponse>(
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
    public java.util.concurrent.Future<ListMyDevicesResponse> listMyDevices(
            ListMyDevicesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListMyDevicesRequest, ListMyDevicesResponse>
                    handler) {
        LOG.trace("Called async listMyDevices");
        final ListMyDevicesRequest interceptedRequest =
                ListMyDevicesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyDevicesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "ListMyDevices", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMyDevicesResponse>
                transformer =
                        ListMyDevicesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListMyDevicesRequest, ListMyDevicesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMyDevicesRequest, ListMyDevicesResponse>,
                        java.util.concurrent.Future<ListMyDevicesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMyDevicesRequest, ListMyDevicesResponse>(
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
    public java.util.concurrent.Future<ListMyGroupsResponse> listMyGroups(
            ListMyGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListMyGroupsRequest, ListMyGroupsResponse>
                    handler) {
        LOG.trace("Called async listMyGroups");
        final ListMyGroupsRequest interceptedRequest =
                ListMyGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyGroupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "ListMyGroups", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMyGroupsResponse>
                transformer =
                        ListMyGroupsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListMyGroupsRequest, ListMyGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMyGroupsRequest, ListMyGroupsResponse>,
                        java.util.concurrent.Future<ListMyGroupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMyGroupsRequest, ListMyGroupsResponse>(
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
    public java.util.concurrent.Future<ListMyOAuth2ClientCredentialsResponse>
            listMyOAuth2ClientCredentials(
                    ListMyOAuth2ClientCredentialsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListMyOAuth2ClientCredentialsRequest,
                                    ListMyOAuth2ClientCredentialsResponse>
                            handler) {
        LOG.trace("Called async listMyOAuth2ClientCredentials");
        final ListMyOAuth2ClientCredentialsRequest interceptedRequest =
                ListMyOAuth2ClientCredentialsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyOAuth2ClientCredentialsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMyOAuth2ClientCredentials",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListMyOAuth2ClientCredentialsResponse>
                transformer =
                        ListMyOAuth2ClientCredentialsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMyOAuth2ClientCredentialsRequest, ListMyOAuth2ClientCredentialsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMyOAuth2ClientCredentialsRequest,
                                ListMyOAuth2ClientCredentialsResponse>,
                        java.util.concurrent.Future<ListMyOAuth2ClientCredentialsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMyOAuth2ClientCredentialsRequest, ListMyOAuth2ClientCredentialsResponse>(
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
    public java.util.concurrent.Future<ListMySmtpCredentialsResponse> listMySmtpCredentials(
            ListMySmtpCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMySmtpCredentialsRequest, ListMySmtpCredentialsResponse>
                    handler) {
        LOG.trace("Called async listMySmtpCredentials");
        final ListMySmtpCredentialsRequest interceptedRequest =
                ListMySmtpCredentialsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMySmtpCredentialsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMySmtpCredentials",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMySmtpCredentialsResponse>
                transformer =
                        ListMySmtpCredentialsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMySmtpCredentialsRequest, ListMySmtpCredentialsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMySmtpCredentialsRequest, ListMySmtpCredentialsResponse>,
                        java.util.concurrent.Future<ListMySmtpCredentialsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMySmtpCredentialsRequest, ListMySmtpCredentialsResponse>(
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
    public java.util.concurrent.Future<ListMySupportAccountsResponse> listMySupportAccounts(
            ListMySupportAccountsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMySupportAccountsRequest, ListMySupportAccountsResponse>
                    handler) {
        LOG.trace("Called async listMySupportAccounts");
        final ListMySupportAccountsRequest interceptedRequest =
                ListMySupportAccountsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMySupportAccountsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMySupportAccounts",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMySupportAccountsResponse>
                transformer =
                        ListMySupportAccountsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMySupportAccountsRequest, ListMySupportAccountsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMySupportAccountsRequest, ListMySupportAccountsResponse>,
                        java.util.concurrent.Future<ListMySupportAccountsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMySupportAccountsRequest, ListMySupportAccountsResponse>(
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
    public java.util.concurrent.Future<ListMyTrustedUserAgentsResponse> listMyTrustedUserAgents(
            ListMyTrustedUserAgentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMyTrustedUserAgentsRequest, ListMyTrustedUserAgentsResponse>
                    handler) {
        LOG.trace("Called async listMyTrustedUserAgents");
        final ListMyTrustedUserAgentsRequest interceptedRequest =
                ListMyTrustedUserAgentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyTrustedUserAgentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMyTrustedUserAgents",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListMyTrustedUserAgentsResponse>
                transformer =
                        ListMyTrustedUserAgentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMyTrustedUserAgentsRequest, ListMyTrustedUserAgentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMyTrustedUserAgentsRequest, ListMyTrustedUserAgentsResponse>,
                        java.util.concurrent.Future<ListMyTrustedUserAgentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMyTrustedUserAgentsRequest, ListMyTrustedUserAgentsResponse>(
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
    public java.util.concurrent.Future<ListMyUserDbCredentialsResponse> listMyUserDbCredentials(
            ListMyUserDbCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMyUserDbCredentialsRequest, ListMyUserDbCredentialsResponse>
                    handler) {
        LOG.trace("Called async listMyUserDbCredentials");
        final ListMyUserDbCredentialsRequest interceptedRequest =
                ListMyUserDbCredentialsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyUserDbCredentialsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMyUserDbCredentials",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListMyUserDbCredentialsResponse>
                transformer =
                        ListMyUserDbCredentialsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMyUserDbCredentialsRequest, ListMyUserDbCredentialsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMyUserDbCredentialsRequest, ListMyUserDbCredentialsResponse>,
                        java.util.concurrent.Future<ListMyUserDbCredentialsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMyUserDbCredentialsRequest, ListMyUserDbCredentialsResponse>(
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
    public java.util.concurrent.Future<ListOAuth2ClientCredentialsResponse>
            listOAuth2ClientCredentials(
                    ListOAuth2ClientCredentialsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOAuth2ClientCredentialsRequest,
                                    ListOAuth2ClientCredentialsResponse>
                            handler) {
        LOG.trace("Called async listOAuth2ClientCredentials");
        final ListOAuth2ClientCredentialsRequest interceptedRequest =
                ListOAuth2ClientCredentialsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOAuth2ClientCredentialsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListOAuth2ClientCredentials",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListOAuth2ClientCredentialsResponse>
                transformer =
                        ListOAuth2ClientCredentialsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListOAuth2ClientCredentialsRequest, ListOAuth2ClientCredentialsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListOAuth2ClientCredentialsRequest,
                                ListOAuth2ClientCredentialsResponse>,
                        java.util.concurrent.Future<ListOAuth2ClientCredentialsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListOAuth2ClientCredentialsRequest, ListOAuth2ClientCredentialsResponse>(
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
    public java.util.concurrent.Future<ListPasswordPoliciesResponse> listPasswordPolicies(
            ListPasswordPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPasswordPoliciesRequest, ListPasswordPoliciesResponse>
                    handler) {
        LOG.trace("Called async listPasswordPolicies");
        final ListPasswordPoliciesRequest interceptedRequest =
                ListPasswordPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPasswordPoliciesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListPasswordPolicies",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListPasswordPoliciesResponse>
                transformer =
                        ListPasswordPoliciesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListPasswordPoliciesRequest, ListPasswordPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPasswordPoliciesRequest, ListPasswordPoliciesResponse>,
                        java.util.concurrent.Future<ListPasswordPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPasswordPoliciesRequest, ListPasswordPoliciesResponse>(
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
    public java.util.concurrent.Future<ListSmtpCredentialsResponse> listSmtpCredentials(
            ListSmtpCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSmtpCredentialsRequest, ListSmtpCredentialsResponse>
                    handler) {
        LOG.trace("Called async listSmtpCredentials");
        final ListSmtpCredentialsRequest interceptedRequest =
                ListSmtpCredentialsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSmtpCredentialsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListSmtpCredentials",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSmtpCredentialsResponse>
                transformer =
                        ListSmtpCredentialsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSmtpCredentialsRequest, ListSmtpCredentialsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSmtpCredentialsRequest, ListSmtpCredentialsResponse>,
                        java.util.concurrent.Future<ListSmtpCredentialsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSmtpCredentialsRequest, ListSmtpCredentialsResponse>(
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
    public java.util.concurrent.Future<ListUserDbCredentialsResponse> listUserDbCredentials(
            ListUserDbCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUserDbCredentialsRequest, ListUserDbCredentialsResponse>
                    handler) {
        LOG.trace("Called async listUserDbCredentials");
        final ListUserDbCredentialsRequest interceptedRequest =
                ListUserDbCredentialsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUserDbCredentialsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListUserDbCredentials",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListUserDbCredentialsResponse>
                transformer =
                        ListUserDbCredentialsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListUserDbCredentialsRequest, ListUserDbCredentialsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListUserDbCredentialsRequest, ListUserDbCredentialsResponse>,
                        java.util.concurrent.Future<ListUserDbCredentialsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListUserDbCredentialsRequest, ListUserDbCredentialsResponse>(
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
    public java.util.concurrent.Future<ListUsersResponse> listUsers(
            ListUsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListUsersRequest, ListUsersResponse>
                    handler) {
        LOG.trace("Called async listUsers");
        final ListUsersRequest interceptedRequest = ListUsersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUsersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "ListUsers", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListUsersResponse>
                transformer =
                        ListUsersConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListUsersRequest, ListUsersResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListUsersRequest, ListUsersResponse>,
                        java.util.concurrent.Future<ListUsersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListUsersRequest, ListUsersResponse>(
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
    public java.util.concurrent.Future<PatchApiKeyResponse> patchApiKey(
            PatchApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchApiKeyRequest, PatchApiKeyResponse>
                    handler) {
        LOG.trace("Called async patchApiKey");
        final PatchApiKeyRequest interceptedRequest =
                PatchApiKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchApiKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "PatchApiKey", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchApiKeyResponse>
                transformer =
                        PatchApiKeyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PatchApiKeyRequest, PatchApiKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchApiKeyRequest, PatchApiKeyResponse>,
                        java.util.concurrent.Future<PatchApiKeyResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchApiKeyRequest, PatchApiKeyResponse>(
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
    public java.util.concurrent.Future<PatchAuthTokenResponse> patchAuthToken(
            PatchAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchAuthTokenRequest, PatchAuthTokenResponse>
                    handler) {
        LOG.trace("Called async patchAuthToken");
        final PatchAuthTokenRequest interceptedRequest =
                PatchAuthTokenConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchAuthTokenConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "PatchAuthToken", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchAuthTokenResponse>
                transformer =
                        PatchAuthTokenConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PatchAuthTokenRequest, PatchAuthTokenResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchAuthTokenRequest, PatchAuthTokenResponse>,
                        java.util.concurrent.Future<PatchAuthTokenResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchAuthTokenRequest, PatchAuthTokenResponse>(
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
    public java.util.concurrent.Future<PatchCustomerSecretKeyResponse> patchCustomerSecretKey(
            PatchCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchCustomerSecretKeyRequest, PatchCustomerSecretKeyResponse>
                    handler) {
        LOG.trace("Called async patchCustomerSecretKey");
        final PatchCustomerSecretKeyRequest interceptedRequest =
                PatchCustomerSecretKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchCustomerSecretKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchCustomerSecretKey",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchCustomerSecretKeyResponse>
                transformer =
                        PatchCustomerSecretKeyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchCustomerSecretKeyRequest, PatchCustomerSecretKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchCustomerSecretKeyRequest, PatchCustomerSecretKeyResponse>,
                        java.util.concurrent.Future<PatchCustomerSecretKeyResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchCustomerSecretKeyRequest, PatchCustomerSecretKeyResponse>(
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
    public java.util.concurrent.Future<PatchDynamicResourceGroupResponse> patchDynamicResourceGroup(
            PatchDynamicResourceGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchDynamicResourceGroupRequest, PatchDynamicResourceGroupResponse>
                    handler) {
        LOG.trace("Called async patchDynamicResourceGroup");
        final PatchDynamicResourceGroupRequest interceptedRequest =
                PatchDynamicResourceGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchDynamicResourceGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchDynamicResourceGroup",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PatchDynamicResourceGroupResponse>
                transformer =
                        PatchDynamicResourceGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchDynamicResourceGroupRequest, PatchDynamicResourceGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchDynamicResourceGroupRequest,
                                PatchDynamicResourceGroupResponse>,
                        java.util.concurrent.Future<PatchDynamicResourceGroupResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchDynamicResourceGroupRequest, PatchDynamicResourceGroupResponse>(
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
    public java.util.concurrent.Future<PatchGroupResponse> patchGroup(
            PatchGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchGroupRequest, PatchGroupResponse>
                    handler) {
        LOG.trace("Called async patchGroup");
        final PatchGroupRequest interceptedRequest = PatchGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "PatchGroup", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchGroupResponse>
                transformer =
                        PatchGroupConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PatchGroupRequest, PatchGroupResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchGroupRequest, PatchGroupResponse>,
                        java.util.concurrent.Future<PatchGroupResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchGroupRequest, PatchGroupResponse>(
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
    public java.util.concurrent.Future<PatchIdentityProviderResponse> patchIdentityProvider(
            PatchIdentityProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchIdentityProviderRequest, PatchIdentityProviderResponse>
                    handler) {
        LOG.trace("Called async patchIdentityProvider");
        final PatchIdentityProviderRequest interceptedRequest =
                PatchIdentityProviderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchIdentityProviderConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchIdentityProvider",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchIdentityProviderResponse>
                transformer =
                        PatchIdentityProviderConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchIdentityProviderRequest, PatchIdentityProviderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchIdentityProviderRequest, PatchIdentityProviderResponse>,
                        java.util.concurrent.Future<PatchIdentityProviderResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchIdentityProviderRequest, PatchIdentityProviderResponse>(
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
    public java.util.concurrent.Future<PatchKmsiSettingResponse> patchKmsiSetting(
            PatchKmsiSettingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchKmsiSettingRequest, PatchKmsiSettingResponse>
                    handler) {
        LOG.trace("Called async patchKmsiSetting");
        final PatchKmsiSettingRequest interceptedRequest =
                PatchKmsiSettingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchKmsiSettingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "PatchKmsiSetting", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchKmsiSettingResponse>
                transformer =
                        PatchKmsiSettingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PatchKmsiSettingRequest, PatchKmsiSettingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchKmsiSettingRequest, PatchKmsiSettingResponse>,
                        java.util.concurrent.Future<PatchKmsiSettingResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchKmsiSettingRequest, PatchKmsiSettingResponse>(
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
    public java.util.concurrent.Future<PatchMeResponse> patchMe(
            PatchMeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchMeRequest, PatchMeResponse> handler) {
        LOG.trace("Called async patchMe");
        final PatchMeRequest interceptedRequest = PatchMeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchMeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "PatchMe", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchMeResponse> transformer =
                PatchMeConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PatchMeRequest, PatchMeResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<PatchMeRequest, PatchMeResponse>,
                        java.util.concurrent.Future<PatchMeResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchMeRequest, PatchMeResponse>(
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
    public java.util.concurrent.Future<PatchMyApiKeyResponse> patchMyApiKey(
            PatchMyApiKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchMyApiKeyRequest, PatchMyApiKeyResponse>
                    handler) {
        LOG.trace("Called async patchMyApiKey");
        final PatchMyApiKeyRequest interceptedRequest =
                PatchMyApiKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchMyApiKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "PatchMyApiKey", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchMyApiKeyResponse>
                transformer =
                        PatchMyApiKeyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PatchMyApiKeyRequest, PatchMyApiKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchMyApiKeyRequest, PatchMyApiKeyResponse>,
                        java.util.concurrent.Future<PatchMyApiKeyResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchMyApiKeyRequest, PatchMyApiKeyResponse>(
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
    public java.util.concurrent.Future<PatchMyAuthTokenResponse> patchMyAuthToken(
            PatchMyAuthTokenRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchMyAuthTokenRequest, PatchMyAuthTokenResponse>
                    handler) {
        LOG.trace("Called async patchMyAuthToken");
        final PatchMyAuthTokenRequest interceptedRequest =
                PatchMyAuthTokenConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchMyAuthTokenConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "PatchMyAuthToken", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchMyAuthTokenResponse>
                transformer =
                        PatchMyAuthTokenConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PatchMyAuthTokenRequest, PatchMyAuthTokenResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchMyAuthTokenRequest, PatchMyAuthTokenResponse>,
                        java.util.concurrent.Future<PatchMyAuthTokenResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchMyAuthTokenRequest, PatchMyAuthTokenResponse>(
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
    public java.util.concurrent.Future<PatchMyCustomerSecretKeyResponse> patchMyCustomerSecretKey(
            PatchMyCustomerSecretKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchMyCustomerSecretKeyRequest, PatchMyCustomerSecretKeyResponse>
                    handler) {
        LOG.trace("Called async patchMyCustomerSecretKey");
        final PatchMyCustomerSecretKeyRequest interceptedRequest =
                PatchMyCustomerSecretKeyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchMyCustomerSecretKeyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchMyCustomerSecretKey",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PatchMyCustomerSecretKeyResponse>
                transformer =
                        PatchMyCustomerSecretKeyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchMyCustomerSecretKeyRequest, PatchMyCustomerSecretKeyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchMyCustomerSecretKeyRequest, PatchMyCustomerSecretKeyResponse>,
                        java.util.concurrent.Future<PatchMyCustomerSecretKeyResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchMyCustomerSecretKeyRequest, PatchMyCustomerSecretKeyResponse>(
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
    public java.util.concurrent.Future<PatchMyDeviceResponse> patchMyDevice(
            PatchMyDeviceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchMyDeviceRequest, PatchMyDeviceResponse>
                    handler) {
        LOG.trace("Called async patchMyDevice");
        final PatchMyDeviceRequest interceptedRequest =
                PatchMyDeviceConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchMyDeviceConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "PatchMyDevice", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchMyDeviceResponse>
                transformer =
                        PatchMyDeviceConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PatchMyDeviceRequest, PatchMyDeviceResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchMyDeviceRequest, PatchMyDeviceResponse>,
                        java.util.concurrent.Future<PatchMyDeviceResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchMyDeviceRequest, PatchMyDeviceResponse>(
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
    public java.util.concurrent.Future<PatchMyOAuth2ClientCredentialResponse>
            patchMyOAuth2ClientCredential(
                    PatchMyOAuth2ClientCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PatchMyOAuth2ClientCredentialRequest,
                                    PatchMyOAuth2ClientCredentialResponse>
                            handler) {
        LOG.trace("Called async patchMyOAuth2ClientCredential");
        final PatchMyOAuth2ClientCredentialRequest interceptedRequest =
                PatchMyOAuth2ClientCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchMyOAuth2ClientCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchMyOAuth2ClientCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PatchMyOAuth2ClientCredentialResponse>
                transformer =
                        PatchMyOAuth2ClientCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchMyOAuth2ClientCredentialRequest, PatchMyOAuth2ClientCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchMyOAuth2ClientCredentialRequest,
                                PatchMyOAuth2ClientCredentialResponse>,
                        java.util.concurrent.Future<PatchMyOAuth2ClientCredentialResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchMyOAuth2ClientCredentialRequest, PatchMyOAuth2ClientCredentialResponse>(
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
    public java.util.concurrent.Future<PatchMySmtpCredentialResponse> patchMySmtpCredential(
            PatchMySmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchMySmtpCredentialRequest, PatchMySmtpCredentialResponse>
                    handler) {
        LOG.trace("Called async patchMySmtpCredential");
        final PatchMySmtpCredentialRequest interceptedRequest =
                PatchMySmtpCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchMySmtpCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchMySmtpCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchMySmtpCredentialResponse>
                transformer =
                        PatchMySmtpCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchMySmtpCredentialRequest, PatchMySmtpCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchMySmtpCredentialRequest, PatchMySmtpCredentialResponse>,
                        java.util.concurrent.Future<PatchMySmtpCredentialResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchMySmtpCredentialRequest, PatchMySmtpCredentialResponse>(
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
    public java.util.concurrent.Future<PatchOAuth2ClientCredentialResponse>
            patchOAuth2ClientCredential(
                    PatchOAuth2ClientCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PatchOAuth2ClientCredentialRequest,
                                    PatchOAuth2ClientCredentialResponse>
                            handler) {
        LOG.trace("Called async patchOAuth2ClientCredential");
        final PatchOAuth2ClientCredentialRequest interceptedRequest =
                PatchOAuth2ClientCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchOAuth2ClientCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchOAuth2ClientCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PatchOAuth2ClientCredentialResponse>
                transformer =
                        PatchOAuth2ClientCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchOAuth2ClientCredentialRequest, PatchOAuth2ClientCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchOAuth2ClientCredentialRequest,
                                PatchOAuth2ClientCredentialResponse>,
                        java.util.concurrent.Future<PatchOAuth2ClientCredentialResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchOAuth2ClientCredentialRequest, PatchOAuth2ClientCredentialResponse>(
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
    public java.util.concurrent.Future<PatchPasswordPolicyResponse> patchPasswordPolicy(
            PatchPasswordPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchPasswordPolicyRequest, PatchPasswordPolicyResponse>
                    handler) {
        LOG.trace("Called async patchPasswordPolicy");
        final PatchPasswordPolicyRequest interceptedRequest =
                PatchPasswordPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchPasswordPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchPasswordPolicy",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchPasswordPolicyResponse>
                transformer =
                        PatchPasswordPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchPasswordPolicyRequest, PatchPasswordPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchPasswordPolicyRequest, PatchPasswordPolicyResponse>,
                        java.util.concurrent.Future<PatchPasswordPolicyResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchPasswordPolicyRequest, PatchPasswordPolicyResponse>(
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
    public java.util.concurrent.Future<PatchSmtpCredentialResponse> patchSmtpCredential(
            PatchSmtpCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchSmtpCredentialRequest, PatchSmtpCredentialResponse>
                    handler) {
        LOG.trace("Called async patchSmtpCredential");
        final PatchSmtpCredentialRequest interceptedRequest =
                PatchSmtpCredentialConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchSmtpCredentialConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchSmtpCredential",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchSmtpCredentialResponse>
                transformer =
                        PatchSmtpCredentialConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchSmtpCredentialRequest, PatchSmtpCredentialResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchSmtpCredentialRequest, PatchSmtpCredentialResponse>,
                        java.util.concurrent.Future<PatchSmtpCredentialResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchSmtpCredentialRequest, PatchSmtpCredentialResponse>(
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
    public java.util.concurrent.Future<PatchUserResponse> patchUser(
            PatchUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchUserRequest, PatchUserResponse>
                    handler) {
        LOG.trace("Called async patchUser");
        final PatchUserRequest interceptedRequest = PatchUserConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchUserConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "PatchUser", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchUserResponse>
                transformer =
                        PatchUserConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PatchUserRequest, PatchUserResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<PatchUserRequest, PatchUserResponse>,
                        java.util.concurrent.Future<PatchUserResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchUserRequest, PatchUserResponse>(
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
    public java.util.concurrent.Future<PutAuthenticationFactorSettingResponse>
            putAuthenticationFactorSetting(
                    PutAuthenticationFactorSettingRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PutAuthenticationFactorSettingRequest,
                                    PutAuthenticationFactorSettingResponse>
                            handler) {
        LOG.trace("Called async putAuthenticationFactorSetting");
        final PutAuthenticationFactorSettingRequest interceptedRequest =
                PutAuthenticationFactorSettingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutAuthenticationFactorSettingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutAuthenticationFactorSetting",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PutAuthenticationFactorSettingResponse>
                transformer =
                        PutAuthenticationFactorSettingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PutAuthenticationFactorSettingRequest,
                        PutAuthenticationFactorSettingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutAuthenticationFactorSettingRequest,
                                PutAuthenticationFactorSettingResponse>,
                        java.util.concurrent.Future<PutAuthenticationFactorSettingResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAuthenticationFactorSetting(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutAuthenticationFactorSettingRequest, PutAuthenticationFactorSettingResponse>(
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
    public java.util.concurrent.Future<PutDynamicResourceGroupResponse> putDynamicResourceGroup(
            PutDynamicResourceGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutDynamicResourceGroupRequest, PutDynamicResourceGroupResponse>
                    handler) {
        LOG.trace("Called async putDynamicResourceGroup");
        final PutDynamicResourceGroupRequest interceptedRequest =
                PutDynamicResourceGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutDynamicResourceGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutDynamicResourceGroup",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PutDynamicResourceGroupResponse>
                transformer =
                        PutDynamicResourceGroupConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PutDynamicResourceGroupRequest, PutDynamicResourceGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutDynamicResourceGroupRequest, PutDynamicResourceGroupResponse>,
                        java.util.concurrent.Future<PutDynamicResourceGroupResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDynamicResourceGroup(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutDynamicResourceGroupRequest, PutDynamicResourceGroupResponse>(
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
    public java.util.concurrent.Future<PutGroupResponse> putGroup(
            PutGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PutGroupRequest, PutGroupResponse>
                    handler) {
        LOG.trace("Called async putGroup");
        final PutGroupRequest interceptedRequest = PutGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "PutGroup", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, PutGroupResponse> transformer =
                PutGroupConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PutGroupRequest, PutGroupResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<PutGroupRequest, PutGroupResponse>,
                        java.util.concurrent.Future<PutGroupResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest, interceptedRequest.getGroup(), ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutGroupRequest, PutGroupResponse>(
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
    public java.util.concurrent.Future<PutIdentityProviderResponse> putIdentityProvider(
            PutIdentityProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutIdentityProviderRequest, PutIdentityProviderResponse>
                    handler) {
        LOG.trace("Called async putIdentityProvider");
        final PutIdentityProviderRequest interceptedRequest =
                PutIdentityProviderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutIdentityProviderConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutIdentityProvider",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, PutIdentityProviderResponse>
                transformer =
                        PutIdentityProviderConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PutIdentityProviderRequest, PutIdentityProviderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutIdentityProviderRequest, PutIdentityProviderResponse>,
                        java.util.concurrent.Future<PutIdentityProviderResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getIdentityProvider(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutIdentityProviderRequest, PutIdentityProviderResponse>(
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
    public java.util.concurrent.Future<PutKmsiSettingResponse> putKmsiSetting(
            PutKmsiSettingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutKmsiSettingRequest, PutKmsiSettingResponse>
                    handler) {
        LOG.trace("Called async putKmsiSetting");
        final PutKmsiSettingRequest interceptedRequest =
                PutKmsiSettingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutKmsiSettingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "PutKmsiSetting", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, PutKmsiSettingResponse>
                transformer =
                        PutKmsiSettingConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PutKmsiSettingRequest, PutKmsiSettingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutKmsiSettingRequest, PutKmsiSettingResponse>,
                        java.util.concurrent.Future<PutKmsiSettingResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getKmsiSetting(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutKmsiSettingRequest, PutKmsiSettingResponse>(
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
    public java.util.concurrent.Future<PutMeResponse> putMe(
            PutMeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PutMeRequest, PutMeResponse> handler) {
        LOG.trace("Called async putMe");
        final PutMeRequest interceptedRequest = PutMeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutMeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "PutMe", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, PutMeResponse> transformer =
                PutMeConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PutMeRequest, PutMeResponse> handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<PutMeRequest, PutMeResponse>,
                        java.util.concurrent.Future<PutMeResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest, interceptedRequest.getMe(), ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutMeRequest, PutMeResponse>(
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
    public java.util.concurrent.Future<PutMePasswordChangerResponse> putMePasswordChanger(
            PutMePasswordChangerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutMePasswordChangerRequest, PutMePasswordChangerResponse>
                    handler) {
        LOG.trace("Called async putMePasswordChanger");
        final PutMePasswordChangerRequest interceptedRequest =
                PutMePasswordChangerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutMePasswordChangerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutMePasswordChanger",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, PutMePasswordChangerResponse>
                transformer =
                        PutMePasswordChangerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PutMePasswordChangerRequest, PutMePasswordChangerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutMePasswordChangerRequest, PutMePasswordChangerResponse>,
                        java.util.concurrent.Future<PutMePasswordChangerResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getMePasswordChanger(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutMePasswordChangerRequest, PutMePasswordChangerResponse>(
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
    public java.util.concurrent.Future<PutPasswordPolicyResponse> putPasswordPolicy(
            PutPasswordPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutPasswordPolicyRequest, PutPasswordPolicyResponse>
                    handler) {
        LOG.trace("Called async putPasswordPolicy");
        final PutPasswordPolicyRequest interceptedRequest =
                PutPasswordPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutPasswordPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "PutPasswordPolicy", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, PutPasswordPolicyResponse>
                transformer =
                        PutPasswordPolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PutPasswordPolicyRequest, PutPasswordPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutPasswordPolicyRequest, PutPasswordPolicyResponse>,
                        java.util.concurrent.Future<PutPasswordPolicyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPasswordPolicy(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutPasswordPolicyRequest, PutPasswordPolicyResponse>(
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
    public java.util.concurrent.Future<PutUserResponse> putUser(
            PutUserRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PutUserRequest, PutUserResponse> handler) {
        LOG.trace("Called async putUser");
        final PutUserRequest interceptedRequest = PutUserConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutUserConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "PutUser", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, PutUserResponse> transformer =
                PutUserConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PutUserRequest, PutUserResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<PutUserRequest, PutUserResponse>,
                        java.util.concurrent.Future<PutUserResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest, interceptedRequest.getUser(), ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutUserRequest, PutUserResponse>(
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
    public java.util.concurrent.Future<PutUserCapabilitiesChangerResponse>
            putUserCapabilitiesChanger(
                    PutUserCapabilitiesChangerRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PutUserCapabilitiesChangerRequest,
                                    PutUserCapabilitiesChangerResponse>
                            handler) {
        LOG.trace("Called async putUserCapabilitiesChanger");
        final PutUserCapabilitiesChangerRequest interceptedRequest =
                PutUserCapabilitiesChangerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutUserCapabilitiesChangerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutUserCapabilitiesChanger",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PutUserCapabilitiesChangerResponse>
                transformer =
                        PutUserCapabilitiesChangerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PutUserCapabilitiesChangerRequest, PutUserCapabilitiesChangerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutUserCapabilitiesChangerRequest,
                                PutUserCapabilitiesChangerResponse>,
                        java.util.concurrent.Future<PutUserCapabilitiesChangerResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUserCapabilitiesChanger(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutUserCapabilitiesChangerRequest, PutUserCapabilitiesChangerResponse>(
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
    public java.util.concurrent.Future<PutUserPasswordChangerResponse> putUserPasswordChanger(
            PutUserPasswordChangerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutUserPasswordChangerRequest, PutUserPasswordChangerResponse>
                    handler) {
        LOG.trace("Called async putUserPasswordChanger");
        final PutUserPasswordChangerRequest interceptedRequest =
                PutUserPasswordChangerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutUserPasswordChangerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutUserPasswordChanger",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, PutUserPasswordChangerResponse>
                transformer =
                        PutUserPasswordChangerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PutUserPasswordChangerRequest, PutUserPasswordChangerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutUserPasswordChangerRequest, PutUserPasswordChangerResponse>,
                        java.util.concurrent.Future<PutUserPasswordChangerResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUserPasswordChanger(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutUserPasswordChangerRequest, PutUserPasswordChangerResponse>(
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
    public java.util.concurrent.Future<PutUserPasswordResetterResponse> putUserPasswordResetter(
            PutUserPasswordResetterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutUserPasswordResetterRequest, PutUserPasswordResetterResponse>
                    handler) {
        LOG.trace("Called async putUserPasswordResetter");
        final PutUserPasswordResetterRequest interceptedRequest =
                PutUserPasswordResetterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutUserPasswordResetterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutUserPasswordResetter",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PutUserPasswordResetterResponse>
                transformer =
                        PutUserPasswordResetterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PutUserPasswordResetterRequest, PutUserPasswordResetterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutUserPasswordResetterRequest, PutUserPasswordResetterResponse>,
                        java.util.concurrent.Future<PutUserPasswordResetterResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUserPasswordResetter(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutUserPasswordResetterRequest, PutUserPasswordResetterResponse>(
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
    public java.util.concurrent.Future<PutUserStatusChangerResponse> putUserStatusChanger(
            PutUserStatusChangerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutUserStatusChangerRequest, PutUserStatusChangerResponse>
                    handler) {
        LOG.trace("Called async putUserStatusChanger");
        final PutUserStatusChangerRequest interceptedRequest =
                PutUserStatusChangerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutUserStatusChangerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutUserStatusChanger",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, PutUserStatusChangerResponse>
                transformer =
                        PutUserStatusChangerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PutUserStatusChangerRequest, PutUserStatusChangerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutUserStatusChangerRequest, PutUserStatusChangerResponse>,
                        java.util.concurrent.Future<PutUserStatusChangerResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUserStatusChanger(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutUserStatusChangerRequest, PutUserStatusChangerResponse>(
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
    public java.util.concurrent.Future<SearchApiKeysResponse> searchApiKeys(
            SearchApiKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<SearchApiKeysRequest, SearchApiKeysResponse>
                    handler) {
        LOG.trace("Called async searchApiKeys");
        final SearchApiKeysRequest interceptedRequest =
                SearchApiKeysConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchApiKeysConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "SearchApiKeys", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, SearchApiKeysResponse>
                transformer =
                        SearchApiKeysConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<SearchApiKeysRequest, SearchApiKeysResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchApiKeysRequest, SearchApiKeysResponse>,
                        java.util.concurrent.Future<SearchApiKeysResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getApiKeySearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchApiKeysRequest, SearchApiKeysResponse>(
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
    public java.util.concurrent.Future<SearchAuthTokensResponse> searchAuthTokens(
            SearchAuthTokensRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchAuthTokensRequest, SearchAuthTokensResponse>
                    handler) {
        LOG.trace("Called async searchAuthTokens");
        final SearchAuthTokensRequest interceptedRequest =
                SearchAuthTokensConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchAuthTokensConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "SearchAuthTokens", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, SearchAuthTokensResponse>
                transformer =
                        SearchAuthTokensConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<SearchAuthTokensRequest, SearchAuthTokensResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchAuthTokensRequest, SearchAuthTokensResponse>,
                        java.util.concurrent.Future<SearchAuthTokensResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAuthTokenSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchAuthTokensRequest, SearchAuthTokensResponse>(
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
    public java.util.concurrent.Future<SearchAuthenticationFactorSettingsResponse>
            searchAuthenticationFactorSettings(
                    SearchAuthenticationFactorSettingsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchAuthenticationFactorSettingsRequest,
                                    SearchAuthenticationFactorSettingsResponse>
                            handler) {
        LOG.trace("Called async searchAuthenticationFactorSettings");
        final SearchAuthenticationFactorSettingsRequest interceptedRequest =
                SearchAuthenticationFactorSettingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchAuthenticationFactorSettingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchAuthenticationFactorSettings",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchAuthenticationFactorSettingsResponse>
                transformer =
                        SearchAuthenticationFactorSettingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchAuthenticationFactorSettingsRequest,
                        SearchAuthenticationFactorSettingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchAuthenticationFactorSettingsRequest,
                                SearchAuthenticationFactorSettingsResponse>,
                        java.util.concurrent.Future<SearchAuthenticationFactorSettingsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAuthenticationFactorSettingsSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchAuthenticationFactorSettingsRequest,
                    SearchAuthenticationFactorSettingsResponse>(
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
    public java.util.concurrent.Future<SearchCustomerSecretKeysResponse> searchCustomerSecretKeys(
            SearchCustomerSecretKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchCustomerSecretKeysRequest, SearchCustomerSecretKeysResponse>
                    handler) {
        LOG.trace("Called async searchCustomerSecretKeys");
        final SearchCustomerSecretKeysRequest interceptedRequest =
                SearchCustomerSecretKeysConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchCustomerSecretKeysConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchCustomerSecretKeys",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchCustomerSecretKeysResponse>
                transformer =
                        SearchCustomerSecretKeysConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchCustomerSecretKeysRequest, SearchCustomerSecretKeysResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchCustomerSecretKeysRequest, SearchCustomerSecretKeysResponse>,
                        java.util.concurrent.Future<SearchCustomerSecretKeysResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCustomerSecretKeySearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchCustomerSecretKeysRequest, SearchCustomerSecretKeysResponse>(
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
    public java.util.concurrent.Future<SearchDynamicResourceGroupsResponse>
            searchDynamicResourceGroups(
                    SearchDynamicResourceGroupsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchDynamicResourceGroupsRequest,
                                    SearchDynamicResourceGroupsResponse>
                            handler) {
        LOG.trace("Called async searchDynamicResourceGroups");
        final SearchDynamicResourceGroupsRequest interceptedRequest =
                SearchDynamicResourceGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchDynamicResourceGroupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchDynamicResourceGroups",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchDynamicResourceGroupsResponse>
                transformer =
                        SearchDynamicResourceGroupsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchDynamicResourceGroupsRequest, SearchDynamicResourceGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchDynamicResourceGroupsRequest,
                                SearchDynamicResourceGroupsResponse>,
                        java.util.concurrent.Future<SearchDynamicResourceGroupsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getDynamicResourceGroupSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchDynamicResourceGroupsRequest, SearchDynamicResourceGroupsResponse>(
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
    public java.util.concurrent.Future<SearchGroupsResponse> searchGroups(
            SearchGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<SearchGroupsRequest, SearchGroupsResponse>
                    handler) {
        LOG.trace("Called async searchGroups");
        final SearchGroupsRequest interceptedRequest =
                SearchGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchGroupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "SearchGroups", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, SearchGroupsResponse>
                transformer =
                        SearchGroupsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<SearchGroupsRequest, SearchGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchGroupsRequest, SearchGroupsResponse>,
                        java.util.concurrent.Future<SearchGroupsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGroupSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchGroupsRequest, SearchGroupsResponse>(
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
    public java.util.concurrent.Future<SearchIdentityProvidersResponse> searchIdentityProviders(
            SearchIdentityProvidersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchIdentityProvidersRequest, SearchIdentityProvidersResponse>
                    handler) {
        LOG.trace("Called async searchIdentityProviders");
        final SearchIdentityProvidersRequest interceptedRequest =
                SearchIdentityProvidersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchIdentityProvidersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchIdentityProviders",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchIdentityProvidersResponse>
                transformer =
                        SearchIdentityProvidersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchIdentityProvidersRequest, SearchIdentityProvidersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchIdentityProvidersRequest, SearchIdentityProvidersResponse>,
                        java.util.concurrent.Future<SearchIdentityProvidersResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getIdentityProviderSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchIdentityProvidersRequest, SearchIdentityProvidersResponse>(
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
    public java.util.concurrent.Future<SearchKmsiSettingsResponse> searchKmsiSettings(
            SearchKmsiSettingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchKmsiSettingsRequest, SearchKmsiSettingsResponse>
                    handler) {
        LOG.trace("Called async searchKmsiSettings");
        final SearchKmsiSettingsRequest interceptedRequest =
                SearchKmsiSettingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchKmsiSettingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "SearchKmsiSettings", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, SearchKmsiSettingsResponse>
                transformer =
                        SearchKmsiSettingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<SearchKmsiSettingsRequest, SearchKmsiSettingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchKmsiSettingsRequest, SearchKmsiSettingsResponse>,
                        java.util.concurrent.Future<SearchKmsiSettingsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getKmsiSettingsSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchKmsiSettingsRequest, SearchKmsiSettingsResponse>(
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
    public java.util.concurrent.Future<SearchMyGroupsResponse> searchMyGroups(
            SearchMyGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchMyGroupsRequest, SearchMyGroupsResponse>
                    handler) {
        LOG.trace("Called async searchMyGroups");
        final SearchMyGroupsRequest interceptedRequest =
                SearchMyGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchMyGroupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "SearchMyGroups", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, SearchMyGroupsResponse>
                transformer =
                        SearchMyGroupsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<SearchMyGroupsRequest, SearchMyGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchMyGroupsRequest, SearchMyGroupsResponse>,
                        java.util.concurrent.Future<SearchMyGroupsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getMyGroupSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchMyGroupsRequest, SearchMyGroupsResponse>(
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
    public java.util.concurrent.Future<SearchOAuth2ClientCredentialsResponse>
            searchOAuth2ClientCredentials(
                    SearchOAuth2ClientCredentialsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchOAuth2ClientCredentialsRequest,
                                    SearchOAuth2ClientCredentialsResponse>
                            handler) {
        LOG.trace("Called async searchOAuth2ClientCredentials");
        final SearchOAuth2ClientCredentialsRequest interceptedRequest =
                SearchOAuth2ClientCredentialsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchOAuth2ClientCredentialsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchOAuth2ClientCredentials",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchOAuth2ClientCredentialsResponse>
                transformer =
                        SearchOAuth2ClientCredentialsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchOAuth2ClientCredentialsRequest, SearchOAuth2ClientCredentialsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchOAuth2ClientCredentialsRequest,
                                SearchOAuth2ClientCredentialsResponse>,
                        java.util.concurrent.Future<SearchOAuth2ClientCredentialsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getOAuth2ClientCredentialSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchOAuth2ClientCredentialsRequest, SearchOAuth2ClientCredentialsResponse>(
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
    public java.util.concurrent.Future<SearchPasswordPoliciesResponse> searchPasswordPolicies(
            SearchPasswordPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchPasswordPoliciesRequest, SearchPasswordPoliciesResponse>
                    handler) {
        LOG.trace("Called async searchPasswordPolicies");
        final SearchPasswordPoliciesRequest interceptedRequest =
                SearchPasswordPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchPasswordPoliciesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchPasswordPolicies",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, SearchPasswordPoliciesResponse>
                transformer =
                        SearchPasswordPoliciesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchPasswordPoliciesRequest, SearchPasswordPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchPasswordPoliciesRequest, SearchPasswordPoliciesResponse>,
                        java.util.concurrent.Future<SearchPasswordPoliciesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPasswordPolicySearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchPasswordPoliciesRequest, SearchPasswordPoliciesResponse>(
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
    public java.util.concurrent.Future<SearchSmtpCredentialsResponse> searchSmtpCredentials(
            SearchSmtpCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchSmtpCredentialsRequest, SearchSmtpCredentialsResponse>
                    handler) {
        LOG.trace("Called async searchSmtpCredentials");
        final SearchSmtpCredentialsRequest interceptedRequest =
                SearchSmtpCredentialsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchSmtpCredentialsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchSmtpCredentials",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, SearchSmtpCredentialsResponse>
                transformer =
                        SearchSmtpCredentialsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchSmtpCredentialsRequest, SearchSmtpCredentialsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchSmtpCredentialsRequest, SearchSmtpCredentialsResponse>,
                        java.util.concurrent.Future<SearchSmtpCredentialsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSmtpCredentialSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchSmtpCredentialsRequest, SearchSmtpCredentialsResponse>(
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
    public java.util.concurrent.Future<SearchUserDbCredentialsResponse> searchUserDbCredentials(
            SearchUserDbCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchUserDbCredentialsRequest, SearchUserDbCredentialsResponse>
                    handler) {
        LOG.trace("Called async searchUserDbCredentials");
        final SearchUserDbCredentialsRequest interceptedRequest =
                SearchUserDbCredentialsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchUserDbCredentialsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchUserDbCredentials",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchUserDbCredentialsResponse>
                transformer =
                        SearchUserDbCredentialsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchUserDbCredentialsRequest, SearchUserDbCredentialsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchUserDbCredentialsRequest, SearchUserDbCredentialsResponse>,
                        java.util.concurrent.Future<SearchUserDbCredentialsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUserDbCredentialsSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchUserDbCredentialsRequest, SearchUserDbCredentialsResponse>(
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
    public java.util.concurrent.Future<SearchUsersResponse> searchUsers(
            SearchUsersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<SearchUsersRequest, SearchUsersResponse>
                    handler) {
        LOG.trace("Called async searchUsers");
        final SearchUsersRequest interceptedRequest =
                SearchUsersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchUsersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "SearchUsers", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, SearchUsersResponse>
                transformer =
                        SearchUsersConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<SearchUsersRequest, SearchUsersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchUsersRequest, SearchUsersResponse>,
                        java.util.concurrent.Future<SearchUsersResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUserSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchUsersRequest, SearchUsersResponse>(
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
