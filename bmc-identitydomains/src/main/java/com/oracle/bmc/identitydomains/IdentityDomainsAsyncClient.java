/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
                    .serviceEndpointTemplate("https://idcs-guid.identity.oraclecloud.com")
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
    public java.util.concurrent.Future<CreateAppResponse> createApp(
            CreateAppRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateAppRequest, CreateAppResponse>
                    handler) {
        LOG.trace("Called async createApp");
        final CreateAppRequest interceptedRequest = CreateAppConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAppConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateApp", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateAppResponse>
                transformer =
                        CreateAppConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateAppRequest, CreateAppResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<CreateAppRequest, CreateAppResponse>,
                        java.util.concurrent.Future<CreateAppResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest, interceptedRequest.getApp(), ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateAppRequest, CreateAppResponse>(
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
    public java.util.concurrent.Future<CreateAppRoleResponse> createAppRole(
            CreateAppRoleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateAppRoleRequest, CreateAppRoleResponse>
                    handler) {
        LOG.trace("Called async createAppRole");
        final CreateAppRoleRequest interceptedRequest =
                CreateAppRoleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateAppRoleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateAppRole", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateAppRoleResponse>
                transformer =
                        CreateAppRoleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateAppRoleRequest, CreateAppRoleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateAppRoleRequest, CreateAppRoleResponse>,
                        java.util.concurrent.Future<CreateAppRoleResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAppRole(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateAppRoleRequest, CreateAppRoleResponse>(
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
    public java.util.concurrent.Future<CreateApprovalWorkflowResponse> createApprovalWorkflow(
            CreateApprovalWorkflowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateApprovalWorkflowRequest, CreateApprovalWorkflowResponse>
                    handler) {
        LOG.trace("Called async createApprovalWorkflow");
        final CreateApprovalWorkflowRequest interceptedRequest =
                CreateApprovalWorkflowConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateApprovalWorkflowConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateApprovalWorkflow",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateApprovalWorkflowResponse>
                transformer =
                        CreateApprovalWorkflowConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateApprovalWorkflowRequest, CreateApprovalWorkflowResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateApprovalWorkflowRequest, CreateApprovalWorkflowResponse>,
                        java.util.concurrent.Future<CreateApprovalWorkflowResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getApprovalWorkflow(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateApprovalWorkflowRequest, CreateApprovalWorkflowResponse>(
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
    public java.util.concurrent.Future<CreateApprovalWorkflowAssignmentResponse>
            createApprovalWorkflowAssignment(
                    CreateApprovalWorkflowAssignmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateApprovalWorkflowAssignmentRequest,
                                    CreateApprovalWorkflowAssignmentResponse>
                            handler) {
        LOG.trace("Called async createApprovalWorkflowAssignment");
        final CreateApprovalWorkflowAssignmentRequest interceptedRequest =
                CreateApprovalWorkflowAssignmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateApprovalWorkflowAssignmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateApprovalWorkflowAssignment",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateApprovalWorkflowAssignmentResponse>
                transformer =
                        CreateApprovalWorkflowAssignmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateApprovalWorkflowAssignmentRequest,
                        CreateApprovalWorkflowAssignmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateApprovalWorkflowAssignmentRequest,
                                CreateApprovalWorkflowAssignmentResponse>,
                        java.util.concurrent.Future<CreateApprovalWorkflowAssignmentResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getApprovalWorkflowAssignment(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateApprovalWorkflowAssignmentRequest,
                    CreateApprovalWorkflowAssignmentResponse>(
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
    public java.util.concurrent.Future<CreateApprovalWorkflowStepResponse>
            createApprovalWorkflowStep(
                    CreateApprovalWorkflowStepRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateApprovalWorkflowStepRequest,
                                    CreateApprovalWorkflowStepResponse>
                            handler) {
        LOG.trace("Called async createApprovalWorkflowStep");
        final CreateApprovalWorkflowStepRequest interceptedRequest =
                CreateApprovalWorkflowStepConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateApprovalWorkflowStepConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateApprovalWorkflowStep",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateApprovalWorkflowStepResponse>
                transformer =
                        CreateApprovalWorkflowStepConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateApprovalWorkflowStepRequest, CreateApprovalWorkflowStepResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateApprovalWorkflowStepRequest,
                                CreateApprovalWorkflowStepResponse>,
                        java.util.concurrent.Future<CreateApprovalWorkflowStepResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getApprovalWorkflowStep(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateApprovalWorkflowStepRequest, CreateApprovalWorkflowStepResponse>(
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
    public java.util.concurrent.Future<CreateCloudGateResponse> createCloudGate(
            CreateCloudGateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCloudGateRequest, CreateCloudGateResponse>
                    handler) {
        LOG.trace("Called async createCloudGate");
        final CreateCloudGateRequest interceptedRequest =
                CreateCloudGateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCloudGateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateCloudGate", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateCloudGateResponse>
                transformer =
                        CreateCloudGateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateCloudGateRequest, CreateCloudGateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCloudGateRequest, CreateCloudGateResponse>,
                        java.util.concurrent.Future<CreateCloudGateResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCloudGate(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCloudGateRequest, CreateCloudGateResponse>(
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
    public java.util.concurrent.Future<CreateCloudGateMappingResponse> createCloudGateMapping(
            CreateCloudGateMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCloudGateMappingRequest, CreateCloudGateMappingResponse>
                    handler) {
        LOG.trace("Called async createCloudGateMapping");
        final CreateCloudGateMappingRequest interceptedRequest =
                CreateCloudGateMappingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCloudGateMappingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateCloudGateMapping",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateCloudGateMappingResponse>
                transformer =
                        CreateCloudGateMappingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateCloudGateMappingRequest, CreateCloudGateMappingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCloudGateMappingRequest, CreateCloudGateMappingResponse>,
                        java.util.concurrent.Future<CreateCloudGateMappingResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCloudGateMapping(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCloudGateMappingRequest, CreateCloudGateMappingResponse>(
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
    public java.util.concurrent.Future<CreateCloudGateServerResponse> createCloudGateServer(
            CreateCloudGateServerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCloudGateServerRequest, CreateCloudGateServerResponse>
                    handler) {
        LOG.trace("Called async createCloudGateServer");
        final CreateCloudGateServerRequest interceptedRequest =
                CreateCloudGateServerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCloudGateServerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateCloudGateServer",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateCloudGateServerResponse>
                transformer =
                        CreateCloudGateServerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateCloudGateServerRequest, CreateCloudGateServerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCloudGateServerRequest, CreateCloudGateServerResponse>,
                        java.util.concurrent.Future<CreateCloudGateServerResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCloudGateServer(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCloudGateServerRequest, CreateCloudGateServerResponse>(
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
    public java.util.concurrent.Future<CreateConditionResponse> createCondition(
            CreateConditionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateConditionRequest, CreateConditionResponse>
                    handler) {
        LOG.trace("Called async createCondition");
        final CreateConditionRequest interceptedRequest =
                CreateConditionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateConditionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateCondition", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateConditionResponse>
                transformer =
                        CreateConditionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateConditionRequest, CreateConditionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateConditionRequest, CreateConditionResponse>,
                        java.util.concurrent.Future<CreateConditionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCondition(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateConditionRequest, CreateConditionResponse>(
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
    public java.util.concurrent.Future<CreateGrantResponse> createGrant(
            CreateGrantRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateGrantRequest, CreateGrantResponse>
                    handler) {
        LOG.trace("Called async createGrant");
        final CreateGrantRequest interceptedRequest =
                CreateGrantConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateGrantConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateGrant", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateGrantResponse>
                transformer =
                        CreateGrantConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateGrantRequest, CreateGrantResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateGrantRequest, CreateGrantResponse>,
                        java.util.concurrent.Future<CreateGrantResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest, interceptedRequest.getGrant(), ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateGrantRequest, CreateGrantResponse>(
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
    public java.util.concurrent.Future<CreateIdentityPropagationTrustResponse>
            createIdentityPropagationTrust(
                    CreateIdentityPropagationTrustRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateIdentityPropagationTrustRequest,
                                    CreateIdentityPropagationTrustResponse>
                            handler) {
        LOG.trace("Called async createIdentityPropagationTrust");
        final CreateIdentityPropagationTrustRequest interceptedRequest =
                CreateIdentityPropagationTrustConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateIdentityPropagationTrustConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateIdentityPropagationTrust",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateIdentityPropagationTrustResponse>
                transformer =
                        CreateIdentityPropagationTrustConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateIdentityPropagationTrustRequest,
                        CreateIdentityPropagationTrustResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateIdentityPropagationTrustRequest,
                                CreateIdentityPropagationTrustResponse>,
                        java.util.concurrent.Future<CreateIdentityPropagationTrustResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getIdentityPropagationTrust(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateIdentityPropagationTrustRequest, CreateIdentityPropagationTrustResponse>(
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
    public java.util.concurrent.Future<CreateMyRequestResponse> createMyRequest(
            CreateMyRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMyRequestRequest, CreateMyRequestResponse>
                    handler) {
        LOG.trace("Called async createMyRequest");
        final CreateMyRequestRequest interceptedRequest =
                CreateMyRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMyRequestConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateMyRequest", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateMyRequestResponse>
                transformer =
                        CreateMyRequestConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateMyRequestRequest, CreateMyRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateMyRequestRequest, CreateMyRequestResponse>,
                        java.util.concurrent.Future<CreateMyRequestResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getMyRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateMyRequestRequest, CreateMyRequestResponse>(
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
    public java.util.concurrent.Future<CreateNetworkPerimeterResponse> createNetworkPerimeter(
            CreateNetworkPerimeterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateNetworkPerimeterRequest, CreateNetworkPerimeterResponse>
                    handler) {
        LOG.trace("Called async createNetworkPerimeter");
        final CreateNetworkPerimeterRequest interceptedRequest =
                CreateNetworkPerimeterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateNetworkPerimeterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateNetworkPerimeter",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateNetworkPerimeterResponse>
                transformer =
                        CreateNetworkPerimeterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateNetworkPerimeterRequest, CreateNetworkPerimeterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateNetworkPerimeterRequest, CreateNetworkPerimeterResponse>,
                        java.util.concurrent.Future<CreateNetworkPerimeterResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getNetworkPerimeter(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateNetworkPerimeterRequest, CreateNetworkPerimeterResponse>(
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
    public java.util.concurrent.Future<CreateOAuthClientCertificateResponse>
            createOAuthClientCertificate(
                    CreateOAuthClientCertificateRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateOAuthClientCertificateRequest,
                                    CreateOAuthClientCertificateResponse>
                            handler) {
        LOG.trace("Called async createOAuthClientCertificate");
        final CreateOAuthClientCertificateRequest interceptedRequest =
                CreateOAuthClientCertificateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateOAuthClientCertificateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateOAuthClientCertificate",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateOAuthClientCertificateResponse>
                transformer =
                        CreateOAuthClientCertificateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateOAuthClientCertificateRequest, CreateOAuthClientCertificateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateOAuthClientCertificateRequest,
                                CreateOAuthClientCertificateResponse>,
                        java.util.concurrent.Future<CreateOAuthClientCertificateResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getOAuthClientCertificate(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateOAuthClientCertificateRequest, CreateOAuthClientCertificateResponse>(
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
    public java.util.concurrent.Future<CreateOAuthPartnerCertificateResponse>
            createOAuthPartnerCertificate(
                    CreateOAuthPartnerCertificateRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateOAuthPartnerCertificateRequest,
                                    CreateOAuthPartnerCertificateResponse>
                            handler) {
        LOG.trace("Called async createOAuthPartnerCertificate");
        final CreateOAuthPartnerCertificateRequest interceptedRequest =
                CreateOAuthPartnerCertificateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateOAuthPartnerCertificateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateOAuthPartnerCertificate",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateOAuthPartnerCertificateResponse>
                transformer =
                        CreateOAuthPartnerCertificateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateOAuthPartnerCertificateRequest, CreateOAuthPartnerCertificateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateOAuthPartnerCertificateRequest,
                                CreateOAuthPartnerCertificateResponse>,
                        java.util.concurrent.Future<CreateOAuthPartnerCertificateResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getOAuthPartnerCertificate(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateOAuthPartnerCertificateRequest, CreateOAuthPartnerCertificateResponse>(
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
    public java.util.concurrent.Future<CreatePolicyResponse> createPolicy(
            CreatePolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreatePolicyRequest, CreatePolicyResponse>
                    handler) {
        LOG.trace("Called async createPolicy");
        final CreatePolicyRequest interceptedRequest =
                CreatePolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreatePolicy", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreatePolicyResponse>
                transformer =
                        CreatePolicyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreatePolicyRequest, CreatePolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreatePolicyRequest, CreatePolicyResponse>,
                        java.util.concurrent.Future<CreatePolicyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPolicy(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreatePolicyRequest, CreatePolicyResponse>(
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
    public java.util.concurrent.Future<CreateRestoreOciConsolePolicyResponse>
            createRestoreOciConsolePolicy(
                    CreateRestoreOciConsolePolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateRestoreOciConsolePolicyRequest,
                                    CreateRestoreOciConsolePolicyResponse>
                            handler) {
        LOG.trace("Called async createRestoreOciConsolePolicy");
        final CreateRestoreOciConsolePolicyRequest interceptedRequest =
                CreateRestoreOciConsolePolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateRestoreOciConsolePolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateRestoreOciConsolePolicy",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateRestoreOciConsolePolicyResponse>
                transformer =
                        CreateRestoreOciConsolePolicyConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateRestoreOciConsolePolicyRequest, CreateRestoreOciConsolePolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateRestoreOciConsolePolicyRequest,
                                CreateRestoreOciConsolePolicyResponse>,
                        java.util.concurrent.Future<CreateRestoreOciConsolePolicyResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRestoreOciConsolePolicy(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateRestoreOciConsolePolicyRequest, CreateRestoreOciConsolePolicyResponse>(
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
    public java.util.concurrent.Future<CreateRuleResponse> createRule(
            CreateRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateRuleRequest, CreateRuleResponse>
                    handler) {
        LOG.trace("Called async createRule");
        final CreateRuleRequest interceptedRequest = CreateRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains", "CreateRule", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateRuleResponse>
                transformer =
                        CreateRuleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateRuleRequest, CreateRuleResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateRuleRequest, CreateRuleResponse>,
                        java.util.concurrent.Future<CreateRuleResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest, interceptedRequest.getRule(), ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateRuleRequest, CreateRuleResponse>(
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
    public java.util.concurrent.Future<CreateSecurityQuestionResponse> createSecurityQuestion(
            CreateSecurityQuestionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSecurityQuestionRequest, CreateSecurityQuestionResponse>
                    handler) {
        LOG.trace("Called async createSecurityQuestion");
        final CreateSecurityQuestionRequest interceptedRequest =
                CreateSecurityQuestionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSecurityQuestionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateSecurityQuestion",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateSecurityQuestionResponse>
                transformer =
                        CreateSecurityQuestionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateSecurityQuestionRequest, CreateSecurityQuestionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSecurityQuestionRequest, CreateSecurityQuestionResponse>,
                        java.util.concurrent.Future<CreateSecurityQuestionResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSecurityQuestion(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSecurityQuestionRequest, CreateSecurityQuestionResponse>(
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
    public java.util.concurrent.Future<CreateSelfRegistrationProfileResponse>
            createSelfRegistrationProfile(
                    CreateSelfRegistrationProfileRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateSelfRegistrationProfileRequest,
                                    CreateSelfRegistrationProfileResponse>
                            handler) {
        LOG.trace("Called async createSelfRegistrationProfile");
        final CreateSelfRegistrationProfileRequest interceptedRequest =
                CreateSelfRegistrationProfileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSelfRegistrationProfileConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateSelfRegistrationProfile",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateSelfRegistrationProfileResponse>
                transformer =
                        CreateSelfRegistrationProfileConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateSelfRegistrationProfileRequest, CreateSelfRegistrationProfileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSelfRegistrationProfileRequest,
                                CreateSelfRegistrationProfileResponse>,
                        java.util.concurrent.Future<CreateSelfRegistrationProfileResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSelfRegistrationProfile(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSelfRegistrationProfileRequest, CreateSelfRegistrationProfileResponse>(
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
    public java.util.concurrent.Future<CreateSocialIdentityProviderResponse>
            createSocialIdentityProvider(
                    CreateSocialIdentityProviderRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateSocialIdentityProviderRequest,
                                    CreateSocialIdentityProviderResponse>
                            handler) {
        LOG.trace("Called async createSocialIdentityProvider");
        final CreateSocialIdentityProviderRequest interceptedRequest =
                CreateSocialIdentityProviderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateSocialIdentityProviderConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "CreateSocialIdentityProvider",
                        ib.getRequestUri().toString(),
                        "");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, CreateSocialIdentityProviderResponse>
                transformer =
                        CreateSocialIdentityProviderConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        CreateSocialIdentityProviderRequest, CreateSocialIdentityProviderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateSocialIdentityProviderRequest,
                                CreateSocialIdentityProviderResponse>,
                        java.util.concurrent.Future<CreateSocialIdentityProviderResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSocialIdentityProvider(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateSocialIdentityProviderRequest, CreateSocialIdentityProviderResponse>(
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
                        "IdentityDomains",
                        "DeleteApiKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApiKey/DeleteApiKey");
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
    public java.util.concurrent.Future<DeleteAppResponse> deleteApp(
            DeleteAppRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteAppRequest, DeleteAppResponse>
                    handler) {
        LOG.trace("Called async deleteApp");
        final DeleteAppRequest interceptedRequest = DeleteAppConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAppConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteApp",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/App/DeleteApp");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAppResponse>
                transformer =
                        DeleteAppConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteAppRequest, DeleteAppResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<DeleteAppRequest, DeleteAppResponse>,
                        java.util.concurrent.Future<DeleteAppResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteAppRequest, DeleteAppResponse>(
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
    public java.util.concurrent.Future<DeleteAppRoleResponse> deleteAppRole(
            DeleteAppRoleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteAppRoleRequest, DeleteAppRoleResponse>
                    handler) {
        LOG.trace("Called async deleteAppRole");
        final DeleteAppRoleRequest interceptedRequest =
                DeleteAppRoleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteAppRoleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteAppRole",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AppRole/DeleteAppRole");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAppRoleResponse>
                transformer =
                        DeleteAppRoleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteAppRoleRequest, DeleteAppRoleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteAppRoleRequest, DeleteAppRoleResponse>,
                        java.util.concurrent.Future<DeleteAppRoleResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteAppRoleRequest, DeleteAppRoleResponse>(
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
    public java.util.concurrent.Future<DeleteApprovalWorkflowResponse> deleteApprovalWorkflow(
            DeleteApprovalWorkflowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteApprovalWorkflowRequest, DeleteApprovalWorkflowResponse>
                    handler) {
        LOG.trace("Called async deleteApprovalWorkflow");
        final DeleteApprovalWorkflowRequest interceptedRequest =
                DeleteApprovalWorkflowConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteApprovalWorkflowConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteApprovalWorkflow",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflow/DeleteApprovalWorkflow");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteApprovalWorkflowResponse>
                transformer =
                        DeleteApprovalWorkflowConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteApprovalWorkflowRequest, DeleteApprovalWorkflowResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteApprovalWorkflowRequest, DeleteApprovalWorkflowResponse>,
                        java.util.concurrent.Future<DeleteApprovalWorkflowResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteApprovalWorkflowRequest, DeleteApprovalWorkflowResponse>(
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
    public java.util.concurrent.Future<DeleteApprovalWorkflowAssignmentResponse>
            deleteApprovalWorkflowAssignment(
                    DeleteApprovalWorkflowAssignmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteApprovalWorkflowAssignmentRequest,
                                    DeleteApprovalWorkflowAssignmentResponse>
                            handler) {
        LOG.trace("Called async deleteApprovalWorkflowAssignment");
        final DeleteApprovalWorkflowAssignmentRequest interceptedRequest =
                DeleteApprovalWorkflowAssignmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteApprovalWorkflowAssignmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteApprovalWorkflowAssignment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflowAssignment/DeleteApprovalWorkflowAssignment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteApprovalWorkflowAssignmentResponse>
                transformer =
                        DeleteApprovalWorkflowAssignmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteApprovalWorkflowAssignmentRequest,
                        DeleteApprovalWorkflowAssignmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteApprovalWorkflowAssignmentRequest,
                                DeleteApprovalWorkflowAssignmentResponse>,
                        java.util.concurrent.Future<DeleteApprovalWorkflowAssignmentResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteApprovalWorkflowAssignmentRequest,
                    DeleteApprovalWorkflowAssignmentResponse>(
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
    public java.util.concurrent.Future<DeleteApprovalWorkflowStepResponse>
            deleteApprovalWorkflowStep(
                    DeleteApprovalWorkflowStepRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteApprovalWorkflowStepRequest,
                                    DeleteApprovalWorkflowStepResponse>
                            handler) {
        LOG.trace("Called async deleteApprovalWorkflowStep");
        final DeleteApprovalWorkflowStepRequest interceptedRequest =
                DeleteApprovalWorkflowStepConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteApprovalWorkflowStepConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteApprovalWorkflowStep",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflowStep/DeleteApprovalWorkflowStep");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteApprovalWorkflowStepResponse>
                transformer =
                        DeleteApprovalWorkflowStepConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteApprovalWorkflowStepRequest, DeleteApprovalWorkflowStepResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteApprovalWorkflowStepRequest,
                                DeleteApprovalWorkflowStepResponse>,
                        java.util.concurrent.Future<DeleteApprovalWorkflowStepResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteApprovalWorkflowStepRequest, DeleteApprovalWorkflowStepResponse>(
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
                        "IdentityDomains",
                        "DeleteAuthToken",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthToken/DeleteAuthToken");
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
    public java.util.concurrent.Future<DeleteCloudGateResponse> deleteCloudGate(
            DeleteCloudGateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCloudGateRequest, DeleteCloudGateResponse>
                    handler) {
        LOG.trace("Called async deleteCloudGate");
        final DeleteCloudGateRequest interceptedRequest =
                DeleteCloudGateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCloudGateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteCloudGate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGate/DeleteCloudGate");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteCloudGateResponse>
                transformer =
                        DeleteCloudGateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteCloudGateRequest, DeleteCloudGateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCloudGateRequest, DeleteCloudGateResponse>,
                        java.util.concurrent.Future<DeleteCloudGateResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCloudGateRequest, DeleteCloudGateResponse>(
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
    public java.util.concurrent.Future<DeleteCloudGateMappingResponse> deleteCloudGateMapping(
            DeleteCloudGateMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCloudGateMappingRequest, DeleteCloudGateMappingResponse>
                    handler) {
        LOG.trace("Called async deleteCloudGateMapping");
        final DeleteCloudGateMappingRequest interceptedRequest =
                DeleteCloudGateMappingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCloudGateMappingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteCloudGateMapping",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateMapping/DeleteCloudGateMapping");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteCloudGateMappingResponse>
                transformer =
                        DeleteCloudGateMappingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteCloudGateMappingRequest, DeleteCloudGateMappingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCloudGateMappingRequest, DeleteCloudGateMappingResponse>,
                        java.util.concurrent.Future<DeleteCloudGateMappingResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCloudGateMappingRequest, DeleteCloudGateMappingResponse>(
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
    public java.util.concurrent.Future<DeleteCloudGateServerResponse> deleteCloudGateServer(
            DeleteCloudGateServerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCloudGateServerRequest, DeleteCloudGateServerResponse>
                    handler) {
        LOG.trace("Called async deleteCloudGateServer");
        final DeleteCloudGateServerRequest interceptedRequest =
                DeleteCloudGateServerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteCloudGateServerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteCloudGateServer",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateServer/DeleteCloudGateServer");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteCloudGateServerResponse>
                transformer =
                        DeleteCloudGateServerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteCloudGateServerRequest, DeleteCloudGateServerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteCloudGateServerRequest, DeleteCloudGateServerResponse>,
                        java.util.concurrent.Future<DeleteCloudGateServerResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteCloudGateServerRequest, DeleteCloudGateServerResponse>(
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
    public java.util.concurrent.Future<DeleteConditionResponse> deleteCondition(
            DeleteConditionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteConditionRequest, DeleteConditionResponse>
                    handler) {
        LOG.trace("Called async deleteCondition");
        final DeleteConditionRequest interceptedRequest =
                DeleteConditionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteConditionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteCondition",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Condition/DeleteCondition");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteConditionResponse>
                transformer =
                        DeleteConditionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteConditionRequest, DeleteConditionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteConditionRequest, DeleteConditionResponse>,
                        java.util.concurrent.Future<DeleteConditionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteConditionRequest, DeleteConditionResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CustomerSecretKey/DeleteCustomerSecretKey");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/DynamicResourceGroup/DeleteDynamicResourceGroup");
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
    public java.util.concurrent.Future<DeleteGrantResponse> deleteGrant(
            DeleteGrantRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteGrantRequest, DeleteGrantResponse>
                    handler) {
        LOG.trace("Called async deleteGrant");
        final DeleteGrantRequest interceptedRequest =
                DeleteGrantConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteGrantConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteGrant",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Grant/DeleteGrant");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteGrantResponse>
                transformer =
                        DeleteGrantConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteGrantRequest, DeleteGrantResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteGrantRequest, DeleteGrantResponse>,
                        java.util.concurrent.Future<DeleteGrantResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteGrantRequest, DeleteGrantResponse>(
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
                        "IdentityDomains",
                        "DeleteGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Group/DeleteGroup");
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
    public java.util.concurrent.Future<DeleteIdentityPropagationTrustResponse>
            deleteIdentityPropagationTrust(
                    DeleteIdentityPropagationTrustRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteIdentityPropagationTrustRequest,
                                    DeleteIdentityPropagationTrustResponse>
                            handler) {
        LOG.trace("Called async deleteIdentityPropagationTrust");
        final DeleteIdentityPropagationTrustRequest interceptedRequest =
                DeleteIdentityPropagationTrustConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteIdentityPropagationTrustConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteIdentityPropagationTrust",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityPropagationTrust/DeleteIdentityPropagationTrust");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteIdentityPropagationTrustResponse>
                transformer =
                        DeleteIdentityPropagationTrustConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteIdentityPropagationTrustRequest,
                        DeleteIdentityPropagationTrustResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteIdentityPropagationTrustRequest,
                                DeleteIdentityPropagationTrustResponse>,
                        java.util.concurrent.Future<DeleteIdentityPropagationTrustResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteIdentityPropagationTrustRequest, DeleteIdentityPropagationTrustResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityProvider/DeleteIdentityProvider");
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
                        "IdentityDomains",
                        "DeleteMyApiKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyApiKey/DeleteMyApiKey");
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
                        "IdentityDomains",
                        "DeleteMyAuthToken",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyAuthToken/DeleteMyAuthToken");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyCustomerSecretKey/DeleteMyCustomerSecretKey");
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
                        "IdentityDomains",
                        "DeleteMyDevice",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyDevice/DeleteMyDevice");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyOAuth2ClientCredential/DeleteMyOAuth2ClientCredential");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MySmtpCredential/DeleteMySmtpCredential");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MySupportAccount/DeleteMySupportAccount");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyTrustedUserAgent/DeleteMyTrustedUserAgent");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyUserDbCredential/DeleteMyUserDbCredential");
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
    public java.util.concurrent.Future<DeleteNetworkPerimeterResponse> deleteNetworkPerimeter(
            DeleteNetworkPerimeterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteNetworkPerimeterRequest, DeleteNetworkPerimeterResponse>
                    handler) {
        LOG.trace("Called async deleteNetworkPerimeter");
        final DeleteNetworkPerimeterRequest interceptedRequest =
                DeleteNetworkPerimeterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteNetworkPerimeterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteNetworkPerimeter",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NetworkPerimeter/DeleteNetworkPerimeter");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteNetworkPerimeterResponse>
                transformer =
                        DeleteNetworkPerimeterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteNetworkPerimeterRequest, DeleteNetworkPerimeterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteNetworkPerimeterRequest, DeleteNetworkPerimeterResponse>,
                        java.util.concurrent.Future<DeleteNetworkPerimeterResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteNetworkPerimeterRequest, DeleteNetworkPerimeterResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuth2ClientCredential/DeleteOAuth2ClientCredential");
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
    public java.util.concurrent.Future<DeleteOAuthClientCertificateResponse>
            deleteOAuthClientCertificate(
                    DeleteOAuthClientCertificateRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOAuthClientCertificateRequest,
                                    DeleteOAuthClientCertificateResponse>
                            handler) {
        LOG.trace("Called async deleteOAuthClientCertificate");
        final DeleteOAuthClientCertificateRequest interceptedRequest =
                DeleteOAuthClientCertificateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteOAuthClientCertificateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteOAuthClientCertificate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuthClientCertificate/DeleteOAuthClientCertificate");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteOAuthClientCertificateResponse>
                transformer =
                        DeleteOAuthClientCertificateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteOAuthClientCertificateRequest, DeleteOAuthClientCertificateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteOAuthClientCertificateRequest,
                                DeleteOAuthClientCertificateResponse>,
                        java.util.concurrent.Future<DeleteOAuthClientCertificateResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteOAuthClientCertificateRequest, DeleteOAuthClientCertificateResponse>(
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
    public java.util.concurrent.Future<DeleteOAuthPartnerCertificateResponse>
            deleteOAuthPartnerCertificate(
                    DeleteOAuthPartnerCertificateRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOAuthPartnerCertificateRequest,
                                    DeleteOAuthPartnerCertificateResponse>
                            handler) {
        LOG.trace("Called async deleteOAuthPartnerCertificate");
        final DeleteOAuthPartnerCertificateRequest interceptedRequest =
                DeleteOAuthPartnerCertificateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteOAuthPartnerCertificateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteOAuthPartnerCertificate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuthPartnerCertificate/DeleteOAuthPartnerCertificate");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteOAuthPartnerCertificateResponse>
                transformer =
                        DeleteOAuthPartnerCertificateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteOAuthPartnerCertificateRequest, DeleteOAuthPartnerCertificateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteOAuthPartnerCertificateRequest,
                                DeleteOAuthPartnerCertificateResponse>,
                        java.util.concurrent.Future<DeleteOAuthPartnerCertificateResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteOAuthPartnerCertificateRequest, DeleteOAuthPartnerCertificateResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/PasswordPolicy/DeletePasswordPolicy");
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
    public java.util.concurrent.Future<DeletePolicyResponse> deletePolicy(
            DeletePolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeletePolicyRequest, DeletePolicyResponse>
                    handler) {
        LOG.trace("Called async deletePolicy");
        final DeletePolicyRequest interceptedRequest =
                DeletePolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeletePolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Policy/DeletePolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, DeletePolicyResponse>
                transformer =
                        DeletePolicyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeletePolicyRequest, DeletePolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeletePolicyRequest, DeletePolicyResponse>,
                        java.util.concurrent.Future<DeletePolicyResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeletePolicyRequest, DeletePolicyResponse>(
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
    public java.util.concurrent.Future<DeleteRuleResponse> deleteRule(
            DeleteRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteRuleRequest, DeleteRuleResponse>
                    handler) {
        LOG.trace("Called async deleteRule");
        final DeleteRuleRequest interceptedRequest = DeleteRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Rule/DeleteRule");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteRuleResponse>
                transformer =
                        DeleteRuleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<DeleteRuleRequest, DeleteRuleResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteRuleRequest, DeleteRuleResponse>,
                        java.util.concurrent.Future<DeleteRuleResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteRuleRequest, DeleteRuleResponse>(
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
    public java.util.concurrent.Future<DeleteSecurityQuestionResponse> deleteSecurityQuestion(
            DeleteSecurityQuestionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSecurityQuestionRequest, DeleteSecurityQuestionResponse>
                    handler) {
        LOG.trace("Called async deleteSecurityQuestion");
        final DeleteSecurityQuestionRequest interceptedRequest =
                DeleteSecurityQuestionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSecurityQuestionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteSecurityQuestion",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestion/DeleteSecurityQuestion");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteSecurityQuestionResponse>
                transformer =
                        DeleteSecurityQuestionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSecurityQuestionRequest, DeleteSecurityQuestionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSecurityQuestionRequest, DeleteSecurityQuestionResponse>,
                        java.util.concurrent.Future<DeleteSecurityQuestionResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSecurityQuestionRequest, DeleteSecurityQuestionResponse>(
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
    public java.util.concurrent.Future<DeleteSelfRegistrationProfileResponse>
            deleteSelfRegistrationProfile(
                    DeleteSelfRegistrationProfileRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteSelfRegistrationProfileRequest,
                                    DeleteSelfRegistrationProfileResponse>
                            handler) {
        LOG.trace("Called async deleteSelfRegistrationProfile");
        final DeleteSelfRegistrationProfileRequest interceptedRequest =
                DeleteSelfRegistrationProfileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSelfRegistrationProfileConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteSelfRegistrationProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SelfRegistrationProfile/DeleteSelfRegistrationProfile");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteSelfRegistrationProfileResponse>
                transformer =
                        DeleteSelfRegistrationProfileConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSelfRegistrationProfileRequest, DeleteSelfRegistrationProfileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSelfRegistrationProfileRequest,
                                DeleteSelfRegistrationProfileResponse>,
                        java.util.concurrent.Future<DeleteSelfRegistrationProfileResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSelfRegistrationProfileRequest, DeleteSelfRegistrationProfileResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SmtpCredential/DeleteSmtpCredential");
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
    public java.util.concurrent.Future<DeleteSocialIdentityProviderResponse>
            deleteSocialIdentityProvider(
                    DeleteSocialIdentityProviderRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteSocialIdentityProviderRequest,
                                    DeleteSocialIdentityProviderResponse>
                            handler) {
        LOG.trace("Called async deleteSocialIdentityProvider");
        final DeleteSocialIdentityProviderRequest interceptedRequest =
                DeleteSocialIdentityProviderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteSocialIdentityProviderConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "DeleteSocialIdentityProvider",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SocialIdentityProvider/DeleteSocialIdentityProvider");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, DeleteSocialIdentityProviderResponse>
                transformer =
                        DeleteSocialIdentityProviderConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        DeleteSocialIdentityProviderRequest, DeleteSocialIdentityProviderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                DeleteSocialIdentityProviderRequest,
                                DeleteSocialIdentityProviderResponse>,
                        java.util.concurrent.Future<DeleteSocialIdentityProviderResponse>>
                futureSupplier = client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    DeleteSocialIdentityProviderRequest, DeleteSocialIdentityProviderResponse>(
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
                        "IdentityDomains",
                        "DeleteUser",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/User/DeleteUser");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserDbCredential/DeleteUserDbCredential");
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
    public java.util.concurrent.Future<GetAccountMgmtInfoResponse> getAccountMgmtInfo(
            GetAccountMgmtInfoRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAccountMgmtInfoRequest, GetAccountMgmtInfoResponse>
                    handler) {
        LOG.trace("Called async getAccountMgmtInfo");
        final GetAccountMgmtInfoRequest interceptedRequest =
                GetAccountMgmtInfoConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAccountMgmtInfoConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetAccountMgmtInfo",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AccountMgmtInfo/GetAccountMgmtInfo");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAccountMgmtInfoResponse>
                transformer =
                        GetAccountMgmtInfoConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetAccountMgmtInfoRequest, GetAccountMgmtInfoResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAccountMgmtInfoRequest, GetAccountMgmtInfoResponse>,
                        java.util.concurrent.Future<GetAccountMgmtInfoResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAccountMgmtInfoRequest, GetAccountMgmtInfoResponse>(
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
    public java.util.concurrent.Future<GetAccountRecoverySettingResponse> getAccountRecoverySetting(
            GetAccountRecoverySettingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAccountRecoverySettingRequest, GetAccountRecoverySettingResponse>
                    handler) {
        LOG.trace("Called async getAccountRecoverySetting");
        final GetAccountRecoverySettingRequest interceptedRequest =
                GetAccountRecoverySettingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAccountRecoverySettingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetAccountRecoverySetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AccountRecoverySetting/GetAccountRecoverySetting");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetAccountRecoverySettingResponse>
                transformer =
                        GetAccountRecoverySettingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetAccountRecoverySettingRequest, GetAccountRecoverySettingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAccountRecoverySettingRequest,
                                GetAccountRecoverySettingResponse>,
                        java.util.concurrent.Future<GetAccountRecoverySettingResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAccountRecoverySettingRequest, GetAccountRecoverySettingResponse>(
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
                        "IdentityDomains",
                        "GetApiKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApiKey/GetApiKey");
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
    public java.util.concurrent.Future<GetAppResponse> getApp(
            GetAppRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAppRequest, GetAppResponse> handler) {
        LOG.trace("Called async getApp");
        final GetAppRequest interceptedRequest = GetAppConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAppConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetApp",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/App/GetApp");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAppResponse> transformer =
                GetAppConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetAppRequest, GetAppResponse> handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetAppRequest, GetAppResponse>,
                        java.util.concurrent.Future<GetAppResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAppRequest, GetAppResponse>(
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
    public java.util.concurrent.Future<GetAppRoleResponse> getAppRole(
            GetAppRoleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAppRoleRequest, GetAppRoleResponse>
                    handler) {
        LOG.trace("Called async getAppRole");
        final GetAppRoleRequest interceptedRequest = GetAppRoleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetAppRoleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetAppRole",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AppRole/GetAppRole");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAppRoleResponse>
                transformer =
                        GetAppRoleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetAppRoleRequest, GetAppRoleResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetAppRoleRequest, GetAppRoleResponse>,
                        java.util.concurrent.Future<GetAppRoleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetAppRoleRequest, GetAppRoleResponse>(
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
    public java.util.concurrent.Future<GetApprovalWorkflowResponse> getApprovalWorkflow(
            GetApprovalWorkflowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetApprovalWorkflowRequest, GetApprovalWorkflowResponse>
                    handler) {
        LOG.trace("Called async getApprovalWorkflow");
        final GetApprovalWorkflowRequest interceptedRequest =
                GetApprovalWorkflowConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetApprovalWorkflowConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetApprovalWorkflow",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflow/GetApprovalWorkflow");
        final java.util.function.Function<javax.ws.rs.core.Response, GetApprovalWorkflowResponse>
                transformer =
                        GetApprovalWorkflowConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetApprovalWorkflowRequest, GetApprovalWorkflowResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetApprovalWorkflowRequest, GetApprovalWorkflowResponse>,
                        java.util.concurrent.Future<GetApprovalWorkflowResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetApprovalWorkflowRequest, GetApprovalWorkflowResponse>(
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
    public java.util.concurrent.Future<GetApprovalWorkflowAssignmentResponse>
            getApprovalWorkflowAssignment(
                    GetApprovalWorkflowAssignmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetApprovalWorkflowAssignmentRequest,
                                    GetApprovalWorkflowAssignmentResponse>
                            handler) {
        LOG.trace("Called async getApprovalWorkflowAssignment");
        final GetApprovalWorkflowAssignmentRequest interceptedRequest =
                GetApprovalWorkflowAssignmentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetApprovalWorkflowAssignmentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetApprovalWorkflowAssignment",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflowAssignment/GetApprovalWorkflowAssignment");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetApprovalWorkflowAssignmentResponse>
                transformer =
                        GetApprovalWorkflowAssignmentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetApprovalWorkflowAssignmentRequest, GetApprovalWorkflowAssignmentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetApprovalWorkflowAssignmentRequest,
                                GetApprovalWorkflowAssignmentResponse>,
                        java.util.concurrent.Future<GetApprovalWorkflowAssignmentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetApprovalWorkflowAssignmentRequest, GetApprovalWorkflowAssignmentResponse>(
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
    public java.util.concurrent.Future<GetApprovalWorkflowStepResponse> getApprovalWorkflowStep(
            GetApprovalWorkflowStepRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetApprovalWorkflowStepRequest, GetApprovalWorkflowStepResponse>
                    handler) {
        LOG.trace("Called async getApprovalWorkflowStep");
        final GetApprovalWorkflowStepRequest interceptedRequest =
                GetApprovalWorkflowStepConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetApprovalWorkflowStepConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetApprovalWorkflowStep",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflowStep/GetApprovalWorkflowStep");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetApprovalWorkflowStepResponse>
                transformer =
                        GetApprovalWorkflowStepConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetApprovalWorkflowStepRequest, GetApprovalWorkflowStepResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetApprovalWorkflowStepRequest, GetApprovalWorkflowStepResponse>,
                        java.util.concurrent.Future<GetApprovalWorkflowStepResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetApprovalWorkflowStepRequest, GetApprovalWorkflowStepResponse>(
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
                        "IdentityDomains",
                        "GetAuthToken",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthToken/GetAuthToken");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthenticationFactorSetting/GetAuthenticationFactorSetting");
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
    public java.util.concurrent.Future<GetBrandingSettingResponse> getBrandingSetting(
            GetBrandingSettingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBrandingSettingRequest, GetBrandingSettingResponse>
                    handler) {
        LOG.trace("Called async getBrandingSetting");
        final GetBrandingSettingRequest interceptedRequest =
                GetBrandingSettingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBrandingSettingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetBrandingSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/BrandingSetting/GetBrandingSetting");
        final java.util.function.Function<javax.ws.rs.core.Response, GetBrandingSettingResponse>
                transformer =
                        GetBrandingSettingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetBrandingSettingRequest, GetBrandingSettingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetBrandingSettingRequest, GetBrandingSettingResponse>,
                        java.util.concurrent.Future<GetBrandingSettingResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetBrandingSettingRequest, GetBrandingSettingResponse>(
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
    public java.util.concurrent.Future<GetCloudGateResponse> getCloudGate(
            GetCloudGateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetCloudGateRequest, GetCloudGateResponse>
                    handler) {
        LOG.trace("Called async getCloudGate");
        final GetCloudGateRequest interceptedRequest =
                GetCloudGateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCloudGateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetCloudGate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGate/GetCloudGate");
        final java.util.function.Function<javax.ws.rs.core.Response, GetCloudGateResponse>
                transformer =
                        GetCloudGateConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetCloudGateRequest, GetCloudGateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCloudGateRequest, GetCloudGateResponse>,
                        java.util.concurrent.Future<GetCloudGateResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCloudGateRequest, GetCloudGateResponse>(
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
    public java.util.concurrent.Future<GetCloudGateMappingResponse> getCloudGateMapping(
            GetCloudGateMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCloudGateMappingRequest, GetCloudGateMappingResponse>
                    handler) {
        LOG.trace("Called async getCloudGateMapping");
        final GetCloudGateMappingRequest interceptedRequest =
                GetCloudGateMappingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCloudGateMappingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetCloudGateMapping",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateMapping/GetCloudGateMapping");
        final java.util.function.Function<javax.ws.rs.core.Response, GetCloudGateMappingResponse>
                transformer =
                        GetCloudGateMappingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetCloudGateMappingRequest, GetCloudGateMappingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCloudGateMappingRequest, GetCloudGateMappingResponse>,
                        java.util.concurrent.Future<GetCloudGateMappingResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCloudGateMappingRequest, GetCloudGateMappingResponse>(
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
    public java.util.concurrent.Future<GetCloudGateServerResponse> getCloudGateServer(
            GetCloudGateServerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCloudGateServerRequest, GetCloudGateServerResponse>
                    handler) {
        LOG.trace("Called async getCloudGateServer");
        final GetCloudGateServerRequest interceptedRequest =
                GetCloudGateServerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetCloudGateServerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetCloudGateServer",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateServer/GetCloudGateServer");
        final java.util.function.Function<javax.ws.rs.core.Response, GetCloudGateServerResponse>
                transformer =
                        GetCloudGateServerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetCloudGateServerRequest, GetCloudGateServerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetCloudGateServerRequest, GetCloudGateServerResponse>,
                        java.util.concurrent.Future<GetCloudGateServerResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetCloudGateServerRequest, GetCloudGateServerResponse>(
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
    public java.util.concurrent.Future<GetConditionResponse> getCondition(
            GetConditionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetConditionRequest, GetConditionResponse>
                    handler) {
        LOG.trace("Called async getCondition");
        final GetConditionRequest interceptedRequest =
                GetConditionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetConditionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetCondition",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Condition/GetCondition");
        final java.util.function.Function<javax.ws.rs.core.Response, GetConditionResponse>
                transformer =
                        GetConditionConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetConditionRequest, GetConditionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetConditionRequest, GetConditionResponse>,
                        java.util.concurrent.Future<GetConditionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetConditionRequest, GetConditionResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CustomerSecretKey/GetCustomerSecretKey");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/DynamicResourceGroup/GetDynamicResourceGroup");
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
    public java.util.concurrent.Future<GetGrantResponse> getGrant(
            GetGrantRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetGrantRequest, GetGrantResponse>
                    handler) {
        LOG.trace("Called async getGrant");
        final GetGrantRequest interceptedRequest = GetGrantConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetGrantConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetGrant",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Grant/GetGrant");
        final java.util.function.Function<javax.ws.rs.core.Response, GetGrantResponse> transformer =
                GetGrantConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetGrantRequest, GetGrantResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetGrantRequest, GetGrantResponse>,
                        java.util.concurrent.Future<GetGrantResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetGrantRequest, GetGrantResponse>(
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
                        "IdentityDomains",
                        "GetGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Group/GetGroup");
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
    public java.util.concurrent.Future<GetIdentityPropagationTrustResponse>
            getIdentityPropagationTrust(
                    GetIdentityPropagationTrustRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetIdentityPropagationTrustRequest,
                                    GetIdentityPropagationTrustResponse>
                            handler) {
        LOG.trace("Called async getIdentityPropagationTrust");
        final GetIdentityPropagationTrustRequest interceptedRequest =
                GetIdentityPropagationTrustConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIdentityPropagationTrustConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetIdentityPropagationTrust",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityPropagationTrust/GetIdentityPropagationTrust");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetIdentityPropagationTrustResponse>
                transformer =
                        GetIdentityPropagationTrustConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetIdentityPropagationTrustRequest, GetIdentityPropagationTrustResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetIdentityPropagationTrustRequest,
                                GetIdentityPropagationTrustResponse>,
                        java.util.concurrent.Future<GetIdentityPropagationTrustResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetIdentityPropagationTrustRequest, GetIdentityPropagationTrustResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityProvider/GetIdentityProvider");
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
    public java.util.concurrent.Future<GetIdentitySettingResponse> getIdentitySetting(
            GetIdentitySettingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetIdentitySettingRequest, GetIdentitySettingResponse>
                    handler) {
        LOG.trace("Called async getIdentitySetting");
        final GetIdentitySettingRequest interceptedRequest =
                GetIdentitySettingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetIdentitySettingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetIdentitySetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentitySetting/GetIdentitySetting");
        final java.util.function.Function<javax.ws.rs.core.Response, GetIdentitySettingResponse>
                transformer =
                        GetIdentitySettingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetIdentitySettingRequest, GetIdentitySettingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetIdentitySettingRequest, GetIdentitySettingResponse>,
                        java.util.concurrent.Future<GetIdentitySettingResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetIdentitySettingRequest, GetIdentitySettingResponse>(
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
                        "IdentityDomains",
                        "GetKmsiSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/KmsiSetting/GetKmsiSetting");
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
                        "IdentityDomains",
                        "GetMe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Me/GetMe");
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
                        "IdentityDomains",
                        "GetMyApiKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyApiKey/GetMyApiKey");
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
                        "IdentityDomains",
                        "GetMyAuthToken",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyAuthToken/GetMyAuthToken");
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
    public java.util.concurrent.Future<GetMyCompletedApprovalResponse> getMyCompletedApproval(
            GetMyCompletedApprovalRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMyCompletedApprovalRequest, GetMyCompletedApprovalResponse>
                    handler) {
        LOG.trace("Called async getMyCompletedApproval");
        final GetMyCompletedApprovalRequest interceptedRequest =
                GetMyCompletedApprovalConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMyCompletedApprovalConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetMyCompletedApproval",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyCompletedApproval/GetMyCompletedApproval");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMyCompletedApprovalResponse>
                transformer =
                        GetMyCompletedApprovalConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetMyCompletedApprovalRequest, GetMyCompletedApprovalResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMyCompletedApprovalRequest, GetMyCompletedApprovalResponse>,
                        java.util.concurrent.Future<GetMyCompletedApprovalResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMyCompletedApprovalRequest, GetMyCompletedApprovalResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyCustomerSecretKey/GetMyCustomerSecretKey");
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
                        "IdentityDomains",
                        "GetMyDevice",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyDevice/GetMyDevice");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyOAuth2ClientCredential/GetMyOAuth2ClientCredential");
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
    public java.util.concurrent.Future<GetMyPendingApprovalResponse> getMyPendingApproval(
            GetMyPendingApprovalRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMyPendingApprovalRequest, GetMyPendingApprovalResponse>
                    handler) {
        LOG.trace("Called async getMyPendingApproval");
        final GetMyPendingApprovalRequest interceptedRequest =
                GetMyPendingApprovalConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMyPendingApprovalConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetMyPendingApproval",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyPendingApproval/GetMyPendingApproval");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMyPendingApprovalResponse>
                transformer =
                        GetMyPendingApprovalConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetMyPendingApprovalRequest, GetMyPendingApprovalResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMyPendingApprovalRequest, GetMyPendingApprovalResponse>,
                        java.util.concurrent.Future<GetMyPendingApprovalResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMyPendingApprovalRequest, GetMyPendingApprovalResponse>(
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
    public java.util.concurrent.Future<GetMyRequestResponse> getMyRequest(
            GetMyRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetMyRequestRequest, GetMyRequestResponse>
                    handler) {
        LOG.trace("Called async getMyRequest");
        final GetMyRequestRequest interceptedRequest =
                GetMyRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMyRequestConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetMyRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyRequest/GetMyRequest");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMyRequestResponse>
                transformer =
                        GetMyRequestConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetMyRequestRequest, GetMyRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMyRequestRequest, GetMyRequestResponse>,
                        java.util.concurrent.Future<GetMyRequestResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMyRequestRequest, GetMyRequestResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MySmtpCredential/GetMySmtpCredential");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MySupportAccount/GetMySupportAccount");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyTrustedUserAgent/GetMyTrustedUserAgent");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyUserDbCredential/GetMyUserDbCredential");
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
    public java.util.concurrent.Future<GetNetworkPerimeterResponse> getNetworkPerimeter(
            GetNetworkPerimeterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetNetworkPerimeterRequest, GetNetworkPerimeterResponse>
                    handler) {
        LOG.trace("Called async getNetworkPerimeter");
        final GetNetworkPerimeterRequest interceptedRequest =
                GetNetworkPerimeterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNetworkPerimeterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetNetworkPerimeter",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NetworkPerimeter/GetNetworkPerimeter");
        final java.util.function.Function<javax.ws.rs.core.Response, GetNetworkPerimeterResponse>
                transformer =
                        GetNetworkPerimeterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetNetworkPerimeterRequest, GetNetworkPerimeterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetNetworkPerimeterRequest, GetNetworkPerimeterResponse>,
                        java.util.concurrent.Future<GetNetworkPerimeterResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetNetworkPerimeterRequest, GetNetworkPerimeterResponse>(
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
    public java.util.concurrent.Future<GetNotificationSettingResponse> getNotificationSetting(
            GetNotificationSettingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetNotificationSettingRequest, GetNotificationSettingResponse>
                    handler) {
        LOG.trace("Called async getNotificationSetting");
        final GetNotificationSettingRequest interceptedRequest =
                GetNotificationSettingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNotificationSettingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetNotificationSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NotificationSetting/GetNotificationSetting");
        final java.util.function.Function<javax.ws.rs.core.Response, GetNotificationSettingResponse>
                transformer =
                        GetNotificationSettingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetNotificationSettingRequest, GetNotificationSettingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetNotificationSettingRequest, GetNotificationSettingResponse>,
                        java.util.concurrent.Future<GetNotificationSettingResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetNotificationSettingRequest, GetNotificationSettingResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuth2ClientCredential/GetOAuth2ClientCredential");
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
    public java.util.concurrent.Future<GetOAuthClientCertificateResponse> getOAuthClientCertificate(
            GetOAuthClientCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOAuthClientCertificateRequest, GetOAuthClientCertificateResponse>
                    handler) {
        LOG.trace("Called async getOAuthClientCertificate");
        final GetOAuthClientCertificateRequest interceptedRequest =
                GetOAuthClientCertificateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOAuthClientCertificateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetOAuthClientCertificate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuthClientCertificate/GetOAuthClientCertificate");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetOAuthClientCertificateResponse>
                transformer =
                        GetOAuthClientCertificateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetOAuthClientCertificateRequest, GetOAuthClientCertificateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetOAuthClientCertificateRequest,
                                GetOAuthClientCertificateResponse>,
                        java.util.concurrent.Future<GetOAuthClientCertificateResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetOAuthClientCertificateRequest, GetOAuthClientCertificateResponse>(
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
    public java.util.concurrent.Future<GetOAuthPartnerCertificateResponse>
            getOAuthPartnerCertificate(
                    GetOAuthPartnerCertificateRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetOAuthPartnerCertificateRequest,
                                    GetOAuthPartnerCertificateResponse>
                            handler) {
        LOG.trace("Called async getOAuthPartnerCertificate");
        final GetOAuthPartnerCertificateRequest interceptedRequest =
                GetOAuthPartnerCertificateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOAuthPartnerCertificateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetOAuthPartnerCertificate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuthPartnerCertificate/GetOAuthPartnerCertificate");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetOAuthPartnerCertificateResponse>
                transformer =
                        GetOAuthPartnerCertificateConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetOAuthPartnerCertificateRequest, GetOAuthPartnerCertificateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetOAuthPartnerCertificateRequest,
                                GetOAuthPartnerCertificateResponse>,
                        java.util.concurrent.Future<GetOAuthPartnerCertificateResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetOAuthPartnerCertificateRequest, GetOAuthPartnerCertificateResponse>(
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
    public java.util.concurrent.Future<GetOciConsoleSignOnPolicyConsentResponse>
            getOciConsoleSignOnPolicyConsent(
                    GetOciConsoleSignOnPolicyConsentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetOciConsoleSignOnPolicyConsentRequest,
                                    GetOciConsoleSignOnPolicyConsentResponse>
                            handler) {
        LOG.trace("Called async getOciConsoleSignOnPolicyConsent");
        final GetOciConsoleSignOnPolicyConsentRequest interceptedRequest =
                GetOciConsoleSignOnPolicyConsentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetOciConsoleSignOnPolicyConsentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetOciConsoleSignOnPolicyConsent",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OciConsoleSignOnPolicyConsent/GetOciConsoleSignOnPolicyConsent");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetOciConsoleSignOnPolicyConsentResponse>
                transformer =
                        GetOciConsoleSignOnPolicyConsentConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetOciConsoleSignOnPolicyConsentRequest,
                        GetOciConsoleSignOnPolicyConsentResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetOciConsoleSignOnPolicyConsentRequest,
                                GetOciConsoleSignOnPolicyConsentResponse>,
                        java.util.concurrent.Future<GetOciConsoleSignOnPolicyConsentResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetOciConsoleSignOnPolicyConsentRequest,
                    GetOciConsoleSignOnPolicyConsentResponse>(
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
                        "IdentityDomains",
                        "GetPasswordPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/PasswordPolicy/GetPasswordPolicy");
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
    public java.util.concurrent.Future<GetPolicyResponse> getPolicy(
            GetPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPolicyRequest, GetPolicyResponse>
                    handler) {
        LOG.trace("Called async getPolicy");
        final GetPolicyRequest interceptedRequest = GetPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Policy/GetPolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, GetPolicyResponse>
                transformer =
                        GetPolicyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetPolicyRequest, GetPolicyResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetPolicyRequest, GetPolicyResponse>,
                        java.util.concurrent.Future<GetPolicyResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetPolicyRequest, GetPolicyResponse>(
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
    public java.util.concurrent.Future<GetRuleResponse> getRule(
            GetRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetRuleRequest, GetRuleResponse> handler) {
        LOG.trace("Called async getRule");
        final GetRuleRequest interceptedRequest = GetRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Rule/GetRule");
        final java.util.function.Function<javax.ws.rs.core.Response, GetRuleResponse> transformer =
                GetRuleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetRuleRequest, GetRuleResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetRuleRequest, GetRuleResponse>,
                        java.util.concurrent.Future<GetRuleResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetRuleRequest, GetRuleResponse>(
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
    public java.util.concurrent.Future<GetSchemaResponse> getSchema(
            GetSchemaRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetSchemaRequest, GetSchemaResponse>
                    handler) {
        LOG.trace("Called async getSchema");
        final GetSchemaRequest interceptedRequest = GetSchemaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSchemaConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetSchema",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Schema/GetSchema");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSchemaResponse>
                transformer =
                        GetSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSchemaRequest, GetSchemaResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<GetSchemaRequest, GetSchemaResponse>,
                        java.util.concurrent.Future<GetSchemaResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSchemaRequest, GetSchemaResponse>(
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
    public java.util.concurrent.Future<GetSecurityQuestionResponse> getSecurityQuestion(
            GetSecurityQuestionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSecurityQuestionRequest, GetSecurityQuestionResponse>
                    handler) {
        LOG.trace("Called async getSecurityQuestion");
        final GetSecurityQuestionRequest interceptedRequest =
                GetSecurityQuestionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSecurityQuestionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetSecurityQuestion",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestion/GetSecurityQuestion");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSecurityQuestionResponse>
                transformer =
                        GetSecurityQuestionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetSecurityQuestionRequest, GetSecurityQuestionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSecurityQuestionRequest, GetSecurityQuestionResponse>,
                        java.util.concurrent.Future<GetSecurityQuestionResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSecurityQuestionRequest, GetSecurityQuestionResponse>(
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
    public java.util.concurrent.Future<GetSecurityQuestionSettingResponse>
            getSecurityQuestionSetting(
                    GetSecurityQuestionSettingRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetSecurityQuestionSettingRequest,
                                    GetSecurityQuestionSettingResponse>
                            handler) {
        LOG.trace("Called async getSecurityQuestionSetting");
        final GetSecurityQuestionSettingRequest interceptedRequest =
                GetSecurityQuestionSettingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSecurityQuestionSettingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetSecurityQuestionSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestionSetting/GetSecurityQuestionSetting");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetSecurityQuestionSettingResponse>
                transformer =
                        GetSecurityQuestionSettingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetSecurityQuestionSettingRequest, GetSecurityQuestionSettingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSecurityQuestionSettingRequest,
                                GetSecurityQuestionSettingResponse>,
                        java.util.concurrent.Future<GetSecurityQuestionSettingResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSecurityQuestionSettingRequest, GetSecurityQuestionSettingResponse>(
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
    public java.util.concurrent.Future<GetSelfRegistrationProfileResponse>
            getSelfRegistrationProfile(
                    GetSelfRegistrationProfileRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetSelfRegistrationProfileRequest,
                                    GetSelfRegistrationProfileResponse>
                            handler) {
        LOG.trace("Called async getSelfRegistrationProfile");
        final GetSelfRegistrationProfileRequest interceptedRequest =
                GetSelfRegistrationProfileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSelfRegistrationProfileConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetSelfRegistrationProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SelfRegistrationProfile/GetSelfRegistrationProfile");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetSelfRegistrationProfileResponse>
                transformer =
                        GetSelfRegistrationProfileConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetSelfRegistrationProfileRequest, GetSelfRegistrationProfileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSelfRegistrationProfileRequest,
                                GetSelfRegistrationProfileResponse>,
                        java.util.concurrent.Future<GetSelfRegistrationProfileResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSelfRegistrationProfileRequest, GetSelfRegistrationProfileResponse>(
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
    public java.util.concurrent.Future<GetSettingResponse> getSetting(
            GetSettingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetSettingRequest, GetSettingResponse>
                    handler) {
        LOG.trace("Called async getSetting");
        final GetSettingRequest interceptedRequest = GetSettingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSettingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Setting/GetSetting");
        final java.util.function.Function<javax.ws.rs.core.Response, GetSettingResponse>
                transformer =
                        GetSettingConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetSettingRequest, GetSettingResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSettingRequest, GetSettingResponse>,
                        java.util.concurrent.Future<GetSettingResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSettingRequest, GetSettingResponse>(
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
                        "IdentityDomains",
                        "GetSmtpCredential",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SmtpCredential/GetSmtpCredential");
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
    public java.util.concurrent.Future<GetSocialIdentityProviderResponse> getSocialIdentityProvider(
            GetSocialIdentityProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSocialIdentityProviderRequest, GetSocialIdentityProviderResponse>
                    handler) {
        LOG.trace("Called async getSocialIdentityProvider");
        final GetSocialIdentityProviderRequest interceptedRequest =
                GetSocialIdentityProviderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetSocialIdentityProviderConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetSocialIdentityProvider",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SocialIdentityProvider/GetSocialIdentityProvider");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetSocialIdentityProviderResponse>
                transformer =
                        GetSocialIdentityProviderConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetSocialIdentityProviderRequest, GetSocialIdentityProviderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetSocialIdentityProviderRequest,
                                GetSocialIdentityProviderResponse>,
                        java.util.concurrent.Future<GetSocialIdentityProviderResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetSocialIdentityProviderRequest, GetSocialIdentityProviderResponse>(
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
                        "IdentityDomains",
                        "GetUser",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/User/GetUser");
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
    public java.util.concurrent.Future<GetUserAttributesSettingResponse> getUserAttributesSetting(
            GetUserAttributesSettingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetUserAttributesSettingRequest, GetUserAttributesSettingResponse>
                    handler) {
        LOG.trace("Called async getUserAttributesSetting");
        final GetUserAttributesSettingRequest interceptedRequest =
                GetUserAttributesSettingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetUserAttributesSettingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "GetUserAttributesSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserAttributesSetting/GetUserAttributesSetting");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, GetUserAttributesSettingResponse>
                transformer =
                        GetUserAttributesSettingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        GetUserAttributesSettingRequest, GetUserAttributesSettingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetUserAttributesSettingRequest, GetUserAttributesSettingResponse>,
                        java.util.concurrent.Future<GetUserAttributesSettingResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetUserAttributesSettingRequest, GetUserAttributesSettingResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserDbCredential/GetUserDbCredential");
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
    public java.util.concurrent.Future<ListAccountMgmtInfosResponse> listAccountMgmtInfos(
            ListAccountMgmtInfosRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAccountMgmtInfosRequest, ListAccountMgmtInfosResponse>
                    handler) {
        LOG.trace("Called async listAccountMgmtInfos");
        final ListAccountMgmtInfosRequest interceptedRequest =
                ListAccountMgmtInfosConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAccountMgmtInfosConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListAccountMgmtInfos",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AccountMgmtInfos/ListAccountMgmtInfos");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAccountMgmtInfosResponse>
                transformer =
                        ListAccountMgmtInfosConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListAccountMgmtInfosRequest, ListAccountMgmtInfosResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAccountMgmtInfosRequest, ListAccountMgmtInfosResponse>,
                        java.util.concurrent.Future<ListAccountMgmtInfosResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAccountMgmtInfosRequest, ListAccountMgmtInfosResponse>(
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
    public java.util.concurrent.Future<ListAccountRecoverySettingsResponse>
            listAccountRecoverySettings(
                    ListAccountRecoverySettingsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAccountRecoverySettingsRequest,
                                    ListAccountRecoverySettingsResponse>
                            handler) {
        LOG.trace("Called async listAccountRecoverySettings");
        final ListAccountRecoverySettingsRequest interceptedRequest =
                ListAccountRecoverySettingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAccountRecoverySettingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListAccountRecoverySettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AccountRecoverySettings/ListAccountRecoverySettings");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListAccountRecoverySettingsResponse>
                transformer =
                        ListAccountRecoverySettingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListAccountRecoverySettingsRequest, ListAccountRecoverySettingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAccountRecoverySettingsRequest,
                                ListAccountRecoverySettingsResponse>,
                        java.util.concurrent.Future<ListAccountRecoverySettingsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAccountRecoverySettingsRequest, ListAccountRecoverySettingsResponse>(
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
                        "IdentityDomains",
                        "ListApiKeys",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApiKeys/ListApiKeys");
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
    public java.util.concurrent.Future<ListAppRolesResponse> listAppRoles(
            ListAppRolesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListAppRolesRequest, ListAppRolesResponse>
                    handler) {
        LOG.trace("Called async listAppRoles");
        final ListAppRolesRequest interceptedRequest =
                ListAppRolesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAppRolesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListAppRoles",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AppRoles/ListAppRoles");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAppRolesResponse>
                transformer =
                        ListAppRolesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListAppRolesRequest, ListAppRolesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListAppRolesRequest, ListAppRolesResponse>,
                        java.util.concurrent.Future<ListAppRolesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAppRolesRequest, ListAppRolesResponse>(
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
    public java.util.concurrent.Future<ListApprovalWorkflowAssignmentsResponse>
            listApprovalWorkflowAssignments(
                    ListApprovalWorkflowAssignmentsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListApprovalWorkflowAssignmentsRequest,
                                    ListApprovalWorkflowAssignmentsResponse>
                            handler) {
        LOG.trace("Called async listApprovalWorkflowAssignments");
        final ListApprovalWorkflowAssignmentsRequest interceptedRequest =
                ListApprovalWorkflowAssignmentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListApprovalWorkflowAssignmentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListApprovalWorkflowAssignments",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflowAssignments/ListApprovalWorkflowAssignments");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListApprovalWorkflowAssignmentsResponse>
                transformer =
                        ListApprovalWorkflowAssignmentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListApprovalWorkflowAssignmentsRequest,
                        ListApprovalWorkflowAssignmentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListApprovalWorkflowAssignmentsRequest,
                                ListApprovalWorkflowAssignmentsResponse>,
                        java.util.concurrent.Future<ListApprovalWorkflowAssignmentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListApprovalWorkflowAssignmentsRequest,
                    ListApprovalWorkflowAssignmentsResponse>(
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
    public java.util.concurrent.Future<ListApprovalWorkflowStepsResponse> listApprovalWorkflowSteps(
            ListApprovalWorkflowStepsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListApprovalWorkflowStepsRequest, ListApprovalWorkflowStepsResponse>
                    handler) {
        LOG.trace("Called async listApprovalWorkflowSteps");
        final ListApprovalWorkflowStepsRequest interceptedRequest =
                ListApprovalWorkflowStepsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListApprovalWorkflowStepsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListApprovalWorkflowSteps",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflowSteps/ListApprovalWorkflowSteps");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListApprovalWorkflowStepsResponse>
                transformer =
                        ListApprovalWorkflowStepsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListApprovalWorkflowStepsRequest, ListApprovalWorkflowStepsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListApprovalWorkflowStepsRequest,
                                ListApprovalWorkflowStepsResponse>,
                        java.util.concurrent.Future<ListApprovalWorkflowStepsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListApprovalWorkflowStepsRequest, ListApprovalWorkflowStepsResponse>(
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
    public java.util.concurrent.Future<ListApprovalWorkflowsResponse> listApprovalWorkflows(
            ListApprovalWorkflowsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListApprovalWorkflowsRequest, ListApprovalWorkflowsResponse>
                    handler) {
        LOG.trace("Called async listApprovalWorkflows");
        final ListApprovalWorkflowsRequest interceptedRequest =
                ListApprovalWorkflowsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListApprovalWorkflowsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListApprovalWorkflows",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflows/ListApprovalWorkflows");
        final java.util.function.Function<javax.ws.rs.core.Response, ListApprovalWorkflowsResponse>
                transformer =
                        ListApprovalWorkflowsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListApprovalWorkflowsRequest, ListApprovalWorkflowsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListApprovalWorkflowsRequest, ListApprovalWorkflowsResponse>,
                        java.util.concurrent.Future<ListApprovalWorkflowsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListApprovalWorkflowsRequest, ListApprovalWorkflowsResponse>(
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
    public java.util.concurrent.Future<ListAppsResponse> listApps(
            ListAppsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListAppsRequest, ListAppsResponse>
                    handler) {
        LOG.trace("Called async listApps");
        final ListAppsRequest interceptedRequest = ListAppsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListAppsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListApps",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Apps/ListApps");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAppsResponse> transformer =
                ListAppsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListAppsRequest, ListAppsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListAppsRequest, ListAppsResponse>,
                        java.util.concurrent.Future<ListAppsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListAppsRequest, ListAppsResponse>(
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
                        "IdentityDomains",
                        "ListAuthTokens",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthTokens/ListAuthTokens");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthenticationFactorSettings/ListAuthenticationFactorSettings");
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
    public java.util.concurrent.Future<ListBrandingSettingsResponse> listBrandingSettings(
            ListBrandingSettingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBrandingSettingsRequest, ListBrandingSettingsResponse>
                    handler) {
        LOG.trace("Called async listBrandingSettings");
        final ListBrandingSettingsRequest interceptedRequest =
                ListBrandingSettingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBrandingSettingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListBrandingSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/BrandingSettings/ListBrandingSettings");
        final java.util.function.Function<javax.ws.rs.core.Response, ListBrandingSettingsResponse>
                transformer =
                        ListBrandingSettingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListBrandingSettingsRequest, ListBrandingSettingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListBrandingSettingsRequest, ListBrandingSettingsResponse>,
                        java.util.concurrent.Future<ListBrandingSettingsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListBrandingSettingsRequest, ListBrandingSettingsResponse>(
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
    public java.util.concurrent.Future<ListCloudGateMappingsResponse> listCloudGateMappings(
            ListCloudGateMappingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCloudGateMappingsRequest, ListCloudGateMappingsResponse>
                    handler) {
        LOG.trace("Called async listCloudGateMappings");
        final ListCloudGateMappingsRequest interceptedRequest =
                ListCloudGateMappingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCloudGateMappingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListCloudGateMappings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateMappings/ListCloudGateMappings");
        final java.util.function.Function<javax.ws.rs.core.Response, ListCloudGateMappingsResponse>
                transformer =
                        ListCloudGateMappingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListCloudGateMappingsRequest, ListCloudGateMappingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCloudGateMappingsRequest, ListCloudGateMappingsResponse>,
                        java.util.concurrent.Future<ListCloudGateMappingsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCloudGateMappingsRequest, ListCloudGateMappingsResponse>(
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
    public java.util.concurrent.Future<ListCloudGateServersResponse> listCloudGateServers(
            ListCloudGateServersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCloudGateServersRequest, ListCloudGateServersResponse>
                    handler) {
        LOG.trace("Called async listCloudGateServers");
        final ListCloudGateServersRequest interceptedRequest =
                ListCloudGateServersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCloudGateServersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListCloudGateServers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateServers/ListCloudGateServers");
        final java.util.function.Function<javax.ws.rs.core.Response, ListCloudGateServersResponse>
                transformer =
                        ListCloudGateServersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListCloudGateServersRequest, ListCloudGateServersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCloudGateServersRequest, ListCloudGateServersResponse>,
                        java.util.concurrent.Future<ListCloudGateServersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCloudGateServersRequest, ListCloudGateServersResponse>(
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
    public java.util.concurrent.Future<ListCloudGatesResponse> listCloudGates(
            ListCloudGatesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCloudGatesRequest, ListCloudGatesResponse>
                    handler) {
        LOG.trace("Called async listCloudGates");
        final ListCloudGatesRequest interceptedRequest =
                ListCloudGatesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListCloudGatesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListCloudGates",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGates/ListCloudGates");
        final java.util.function.Function<javax.ws.rs.core.Response, ListCloudGatesResponse>
                transformer =
                        ListCloudGatesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListCloudGatesRequest, ListCloudGatesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListCloudGatesRequest, ListCloudGatesResponse>,
                        java.util.concurrent.Future<ListCloudGatesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListCloudGatesRequest, ListCloudGatesResponse>(
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
    public java.util.concurrent.Future<ListConditionsResponse> listConditions(
            ListConditionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListConditionsRequest, ListConditionsResponse>
                    handler) {
        LOG.trace("Called async listConditions");
        final ListConditionsRequest interceptedRequest =
                ListConditionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListConditionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListConditions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Condition/ListConditions");
        final java.util.function.Function<javax.ws.rs.core.Response, ListConditionsResponse>
                transformer =
                        ListConditionsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListConditionsRequest, ListConditionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListConditionsRequest, ListConditionsResponse>,
                        java.util.concurrent.Future<ListConditionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListConditionsRequest, ListConditionsResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CustomerSecretKeys/ListCustomerSecretKeys");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/DynamicResourceGroups/ListDynamicResourceGroups");
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
    public java.util.concurrent.Future<ListGrantsResponse> listGrants(
            ListGrantsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListGrantsRequest, ListGrantsResponse>
                    handler) {
        LOG.trace("Called async listGrants");
        final ListGrantsRequest interceptedRequest = ListGrantsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListGrantsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListGrants",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Grants/ListGrants");
        final java.util.function.Function<javax.ws.rs.core.Response, ListGrantsResponse>
                transformer =
                        ListGrantsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListGrantsRequest, ListGrantsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListGrantsRequest, ListGrantsResponse>,
                        java.util.concurrent.Future<ListGrantsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListGrantsRequest, ListGrantsResponse>(
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
                        "IdentityDomains",
                        "ListGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Groups/ListGroups");
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
    public java.util.concurrent.Future<ListIdentityPropagationTrustsResponse>
            listIdentityPropagationTrusts(
                    ListIdentityPropagationTrustsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListIdentityPropagationTrustsRequest,
                                    ListIdentityPropagationTrustsResponse>
                            handler) {
        LOG.trace("Called async listIdentityPropagationTrusts");
        final ListIdentityPropagationTrustsRequest interceptedRequest =
                ListIdentityPropagationTrustsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIdentityPropagationTrustsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListIdentityPropagationTrusts",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityPropagationTrusts/ListIdentityPropagationTrusts");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListIdentityPropagationTrustsResponse>
                transformer =
                        ListIdentityPropagationTrustsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListIdentityPropagationTrustsRequest, ListIdentityPropagationTrustsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListIdentityPropagationTrustsRequest,
                                ListIdentityPropagationTrustsResponse>,
                        java.util.concurrent.Future<ListIdentityPropagationTrustsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListIdentityPropagationTrustsRequest, ListIdentityPropagationTrustsResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityProviders/ListIdentityProviders");
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
    public java.util.concurrent.Future<ListIdentitySettingsResponse> listIdentitySettings(
            ListIdentitySettingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIdentitySettingsRequest, ListIdentitySettingsResponse>
                    handler) {
        LOG.trace("Called async listIdentitySettings");
        final ListIdentitySettingsRequest interceptedRequest =
                ListIdentitySettingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListIdentitySettingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListIdentitySettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentitySettings/ListIdentitySettings");
        final java.util.function.Function<javax.ws.rs.core.Response, ListIdentitySettingsResponse>
                transformer =
                        ListIdentitySettingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListIdentitySettingsRequest, ListIdentitySettingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListIdentitySettingsRequest, ListIdentitySettingsResponse>,
                        java.util.concurrent.Future<ListIdentitySettingsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListIdentitySettingsRequest, ListIdentitySettingsResponse>(
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
                        "IdentityDomains",
                        "ListKmsiSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/KmsiSettings/ListKmsiSettings");
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
                        "IdentityDomains",
                        "ListMyApiKeys",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyApiKeys/ListMyApiKeys");
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
    public java.util.concurrent.Future<ListMyAppsResponse> listMyApps(
            ListMyAppsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListMyAppsRequest, ListMyAppsResponse>
                    handler) {
        LOG.trace("Called async listMyApps");
        final ListMyAppsRequest interceptedRequest = ListMyAppsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyAppsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMyApps",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyApps/ListMyApps");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMyAppsResponse>
                transformer =
                        ListMyAppsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListMyAppsRequest, ListMyAppsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMyAppsRequest, ListMyAppsResponse>,
                        java.util.concurrent.Future<ListMyAppsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMyAppsRequest, ListMyAppsResponse>(
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
                        "IdentityDomains",
                        "ListMyAuthTokens",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyAuthTokens/ListMyAuthTokens");
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
    public java.util.concurrent.Future<ListMyCompletedApprovalsResponse> listMyCompletedApprovals(
            ListMyCompletedApprovalsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMyCompletedApprovalsRequest, ListMyCompletedApprovalsResponse>
                    handler) {
        LOG.trace("Called async listMyCompletedApprovals");
        final ListMyCompletedApprovalsRequest interceptedRequest =
                ListMyCompletedApprovalsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyCompletedApprovalsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMyCompletedApprovals",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyCompletedApprovals/ListMyCompletedApprovals");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListMyCompletedApprovalsResponse>
                transformer =
                        ListMyCompletedApprovalsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMyCompletedApprovalsRequest, ListMyCompletedApprovalsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMyCompletedApprovalsRequest, ListMyCompletedApprovalsResponse>,
                        java.util.concurrent.Future<ListMyCompletedApprovalsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMyCompletedApprovalsRequest, ListMyCompletedApprovalsResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyCustomerSecretKeys/ListMyCustomerSecretKeys");
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
                        "IdentityDomains",
                        "ListMyDevices",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyDevices/ListMyDevices");
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
                        "IdentityDomains",
                        "ListMyGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyGroups/ListMyGroups");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyOAuth2ClientCredentials/ListMyOAuth2ClientCredentials");
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
    public java.util.concurrent.Future<ListMyPendingApprovalsResponse> listMyPendingApprovals(
            ListMyPendingApprovalsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMyPendingApprovalsRequest, ListMyPendingApprovalsResponse>
                    handler) {
        LOG.trace("Called async listMyPendingApprovals");
        final ListMyPendingApprovalsRequest interceptedRequest =
                ListMyPendingApprovalsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyPendingApprovalsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMyPendingApprovals",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyPendingApprovals/ListMyPendingApprovals");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMyPendingApprovalsResponse>
                transformer =
                        ListMyPendingApprovalsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMyPendingApprovalsRequest, ListMyPendingApprovalsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMyPendingApprovalsRequest, ListMyPendingApprovalsResponse>,
                        java.util.concurrent.Future<ListMyPendingApprovalsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMyPendingApprovalsRequest, ListMyPendingApprovalsResponse>(
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
    public java.util.concurrent.Future<ListMyRequestableGroupsResponse> listMyRequestableGroups(
            ListMyRequestableGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMyRequestableGroupsRequest, ListMyRequestableGroupsResponse>
                    handler) {
        LOG.trace("Called async listMyRequestableGroups");
        final ListMyRequestableGroupsRequest interceptedRequest =
                ListMyRequestableGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyRequestableGroupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMyRequestableGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyRequestableGroups/ListMyRequestableGroups");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListMyRequestableGroupsResponse>
                transformer =
                        ListMyRequestableGroupsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListMyRequestableGroupsRequest, ListMyRequestableGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMyRequestableGroupsRequest, ListMyRequestableGroupsResponse>,
                        java.util.concurrent.Future<ListMyRequestableGroupsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMyRequestableGroupsRequest, ListMyRequestableGroupsResponse>(
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
    public java.util.concurrent.Future<ListMyRequestsResponse> listMyRequests(
            ListMyRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMyRequestsRequest, ListMyRequestsResponse>
                    handler) {
        LOG.trace("Called async listMyRequests");
        final ListMyRequestsRequest interceptedRequest =
                ListMyRequestsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMyRequestsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListMyRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyRequests/ListMyRequests");
        final java.util.function.Function<javax.ws.rs.core.Response, ListMyRequestsResponse>
                transformer =
                        ListMyRequestsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListMyRequestsRequest, ListMyRequestsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListMyRequestsRequest, ListMyRequestsResponse>,
                        java.util.concurrent.Future<ListMyRequestsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListMyRequestsRequest, ListMyRequestsResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MySmtpCredentials/ListMySmtpCredentials");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MySupportAccounts/ListMySupportAccounts");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyTrustedUserAgents/ListMyTrustedUserAgents");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyUserDbCredentials/ListMyUserDbCredentials");
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
    public java.util.concurrent.Future<ListNetworkPerimetersResponse> listNetworkPerimeters(
            ListNetworkPerimetersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListNetworkPerimetersRequest, ListNetworkPerimetersResponse>
                    handler) {
        LOG.trace("Called async listNetworkPerimeters");
        final ListNetworkPerimetersRequest interceptedRequest =
                ListNetworkPerimetersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNetworkPerimetersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListNetworkPerimeters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NetworkPerimeters/ListNetworkPerimeters");
        final java.util.function.Function<javax.ws.rs.core.Response, ListNetworkPerimetersResponse>
                transformer =
                        ListNetworkPerimetersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListNetworkPerimetersRequest, ListNetworkPerimetersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListNetworkPerimetersRequest, ListNetworkPerimetersResponse>,
                        java.util.concurrent.Future<ListNetworkPerimetersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListNetworkPerimetersRequest, ListNetworkPerimetersResponse>(
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
    public java.util.concurrent.Future<ListNotificationSettingsResponse> listNotificationSettings(
            ListNotificationSettingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListNotificationSettingsRequest, ListNotificationSettingsResponse>
                    handler) {
        LOG.trace("Called async listNotificationSettings");
        final ListNotificationSettingsRequest interceptedRequest =
                ListNotificationSettingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListNotificationSettingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListNotificationSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NotificationSettings/ListNotificationSettings");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListNotificationSettingsResponse>
                transformer =
                        ListNotificationSettingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListNotificationSettingsRequest, ListNotificationSettingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListNotificationSettingsRequest, ListNotificationSettingsResponse>,
                        java.util.concurrent.Future<ListNotificationSettingsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListNotificationSettingsRequest, ListNotificationSettingsResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuth2ClientCredentials/ListOAuth2ClientCredentials");
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
    public java.util.concurrent.Future<ListOAuthClientCertificatesResponse>
            listOAuthClientCertificates(
                    ListOAuthClientCertificatesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOAuthClientCertificatesRequest,
                                    ListOAuthClientCertificatesResponse>
                            handler) {
        LOG.trace("Called async listOAuthClientCertificates");
        final ListOAuthClientCertificatesRequest interceptedRequest =
                ListOAuthClientCertificatesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOAuthClientCertificatesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListOAuthClientCertificates",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuthClientCertificates/ListOAuthClientCertificates");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListOAuthClientCertificatesResponse>
                transformer =
                        ListOAuthClientCertificatesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListOAuthClientCertificatesRequest, ListOAuthClientCertificatesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListOAuthClientCertificatesRequest,
                                ListOAuthClientCertificatesResponse>,
                        java.util.concurrent.Future<ListOAuthClientCertificatesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListOAuthClientCertificatesRequest, ListOAuthClientCertificatesResponse>(
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
    public java.util.concurrent.Future<ListOAuthPartnerCertificatesResponse>
            listOAuthPartnerCertificates(
                    ListOAuthPartnerCertificatesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOAuthPartnerCertificatesRequest,
                                    ListOAuthPartnerCertificatesResponse>
                            handler) {
        LOG.trace("Called async listOAuthPartnerCertificates");
        final ListOAuthPartnerCertificatesRequest interceptedRequest =
                ListOAuthPartnerCertificatesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOAuthPartnerCertificatesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListOAuthPartnerCertificates",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuthPartnerCertificates/ListOAuthPartnerCertificates");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListOAuthPartnerCertificatesResponse>
                transformer =
                        ListOAuthPartnerCertificatesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListOAuthPartnerCertificatesRequest, ListOAuthPartnerCertificatesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListOAuthPartnerCertificatesRequest,
                                ListOAuthPartnerCertificatesResponse>,
                        java.util.concurrent.Future<ListOAuthPartnerCertificatesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListOAuthPartnerCertificatesRequest, ListOAuthPartnerCertificatesResponse>(
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
    public java.util.concurrent.Future<ListOciConsoleSignOnPolicyConsentsResponse>
            listOciConsoleSignOnPolicyConsents(
                    ListOciConsoleSignOnPolicyConsentsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOciConsoleSignOnPolicyConsentsRequest,
                                    ListOciConsoleSignOnPolicyConsentsResponse>
                            handler) {
        LOG.trace("Called async listOciConsoleSignOnPolicyConsents");
        final ListOciConsoleSignOnPolicyConsentsRequest interceptedRequest =
                ListOciConsoleSignOnPolicyConsentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListOciConsoleSignOnPolicyConsentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListOciConsoleSignOnPolicyConsents",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OciConsoleSignOnPolicyConsent/ListOciConsoleSignOnPolicyConsents");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListOciConsoleSignOnPolicyConsentsResponse>
                transformer =
                        ListOciConsoleSignOnPolicyConsentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListOciConsoleSignOnPolicyConsentsRequest,
                        ListOciConsoleSignOnPolicyConsentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListOciConsoleSignOnPolicyConsentsRequest,
                                ListOciConsoleSignOnPolicyConsentsResponse>,
                        java.util.concurrent.Future<ListOciConsoleSignOnPolicyConsentsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListOciConsoleSignOnPolicyConsentsRequest,
                    ListOciConsoleSignOnPolicyConsentsResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/PasswordPolicies/ListPasswordPolicies");
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
    public java.util.concurrent.Future<ListPoliciesResponse> listPolicies(
            ListPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPoliciesRequest, ListPoliciesResponse>
                    handler) {
        LOG.trace("Called async listPolicies");
        final ListPoliciesRequest interceptedRequest =
                ListPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPoliciesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Policy/ListPolicies");
        final java.util.function.Function<javax.ws.rs.core.Response, ListPoliciesResponse>
                transformer =
                        ListPoliciesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListPoliciesRequest, ListPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListPoliciesRequest, ListPoliciesResponse>,
                        java.util.concurrent.Future<ListPoliciesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListPoliciesRequest, ListPoliciesResponse>(
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
    public java.util.concurrent.Future<ListResourceTypeSchemaAttributesResponse>
            listResourceTypeSchemaAttributes(
                    ListResourceTypeSchemaAttributesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListResourceTypeSchemaAttributesRequest,
                                    ListResourceTypeSchemaAttributesResponse>
                            handler) {
        LOG.trace("Called async listResourceTypeSchemaAttributes");
        final ListResourceTypeSchemaAttributesRequest interceptedRequest =
                ListResourceTypeSchemaAttributesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListResourceTypeSchemaAttributesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListResourceTypeSchemaAttributes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ResourceTypeSchemaAttributes/ListResourceTypeSchemaAttributes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListResourceTypeSchemaAttributesResponse>
                transformer =
                        ListResourceTypeSchemaAttributesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListResourceTypeSchemaAttributesRequest,
                        ListResourceTypeSchemaAttributesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListResourceTypeSchemaAttributesRequest,
                                ListResourceTypeSchemaAttributesResponse>,
                        java.util.concurrent.Future<ListResourceTypeSchemaAttributesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListResourceTypeSchemaAttributesRequest,
                    ListResourceTypeSchemaAttributesResponse>(
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
    public java.util.concurrent.Future<ListRulesResponse> listRules(
            ListRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListRulesRequest, ListRulesResponse>
                    handler) {
        LOG.trace("Called async listRules");
        final ListRulesRequest interceptedRequest = ListRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Rule/ListRules");
        final java.util.function.Function<javax.ws.rs.core.Response, ListRulesResponse>
                transformer =
                        ListRulesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListRulesRequest, ListRulesResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<ListRulesRequest, ListRulesResponse>,
                        java.util.concurrent.Future<ListRulesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListRulesRequest, ListRulesResponse>(
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
    public java.util.concurrent.Future<ListSchemasResponse> listSchemas(
            ListSchemasRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSchemasRequest, ListSchemasResponse>
                    handler) {
        LOG.trace("Called async listSchemas");
        final ListSchemasRequest interceptedRequest =
                ListSchemasConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSchemasConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListSchemas",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Schemas/ListSchemas");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSchemasResponse>
                transformer =
                        ListSchemasConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListSchemasRequest, ListSchemasResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSchemasRequest, ListSchemasResponse>,
                        java.util.concurrent.Future<ListSchemasResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSchemasRequest, ListSchemasResponse>(
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
    public java.util.concurrent.Future<ListSecurityQuestionSettingsResponse>
            listSecurityQuestionSettings(
                    ListSecurityQuestionSettingsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSecurityQuestionSettingsRequest,
                                    ListSecurityQuestionSettingsResponse>
                            handler) {
        LOG.trace("Called async listSecurityQuestionSettings");
        final ListSecurityQuestionSettingsRequest interceptedRequest =
                ListSecurityQuestionSettingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSecurityQuestionSettingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListSecurityQuestionSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestionSettings/ListSecurityQuestionSettings");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListSecurityQuestionSettingsResponse>
                transformer =
                        ListSecurityQuestionSettingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSecurityQuestionSettingsRequest, ListSecurityQuestionSettingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSecurityQuestionSettingsRequest,
                                ListSecurityQuestionSettingsResponse>,
                        java.util.concurrent.Future<ListSecurityQuestionSettingsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSecurityQuestionSettingsRequest, ListSecurityQuestionSettingsResponse>(
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
    public java.util.concurrent.Future<ListSecurityQuestionsResponse> listSecurityQuestions(
            ListSecurityQuestionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityQuestionsRequest, ListSecurityQuestionsResponse>
                    handler) {
        LOG.trace("Called async listSecurityQuestions");
        final ListSecurityQuestionsRequest interceptedRequest =
                ListSecurityQuestionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSecurityQuestionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListSecurityQuestions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestions/ListSecurityQuestions");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSecurityQuestionsResponse>
                transformer =
                        ListSecurityQuestionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSecurityQuestionsRequest, ListSecurityQuestionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSecurityQuestionsRequest, ListSecurityQuestionsResponse>,
                        java.util.concurrent.Future<ListSecurityQuestionsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSecurityQuestionsRequest, ListSecurityQuestionsResponse>(
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
    public java.util.concurrent.Future<ListSelfRegistrationProfilesResponse>
            listSelfRegistrationProfiles(
                    ListSelfRegistrationProfilesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSelfRegistrationProfilesRequest,
                                    ListSelfRegistrationProfilesResponse>
                            handler) {
        LOG.trace("Called async listSelfRegistrationProfiles");
        final ListSelfRegistrationProfilesRequest interceptedRequest =
                ListSelfRegistrationProfilesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSelfRegistrationProfilesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListSelfRegistrationProfiles",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SelfRegistrationProfiles/ListSelfRegistrationProfiles");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListSelfRegistrationProfilesResponse>
                transformer =
                        ListSelfRegistrationProfilesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSelfRegistrationProfilesRequest, ListSelfRegistrationProfilesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSelfRegistrationProfilesRequest,
                                ListSelfRegistrationProfilesResponse>,
                        java.util.concurrent.Future<ListSelfRegistrationProfilesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSelfRegistrationProfilesRequest, ListSelfRegistrationProfilesResponse>(
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
    public java.util.concurrent.Future<ListSettingsResponse> listSettings(
            ListSettingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSettingsRequest, ListSettingsResponse>
                    handler) {
        LOG.trace("Called async listSettings");
        final ListSettingsRequest interceptedRequest =
                ListSettingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSettingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Settings/ListSettings");
        final java.util.function.Function<javax.ws.rs.core.Response, ListSettingsResponse>
                transformer =
                        ListSettingsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ListSettingsRequest, ListSettingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSettingsRequest, ListSettingsResponse>,
                        java.util.concurrent.Future<ListSettingsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSettingsRequest, ListSettingsResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SmtpCredentials/ListSmtpCredentials");
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
    public java.util.concurrent.Future<ListSocialIdentityProvidersResponse>
            listSocialIdentityProviders(
                    ListSocialIdentityProvidersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSocialIdentityProvidersRequest,
                                    ListSocialIdentityProvidersResponse>
                            handler) {
        LOG.trace("Called async listSocialIdentityProviders");
        final ListSocialIdentityProvidersRequest interceptedRequest =
                ListSocialIdentityProvidersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListSocialIdentityProvidersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListSocialIdentityProviders",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SocialIdentityProviders/ListSocialIdentityProviders");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListSocialIdentityProvidersResponse>
                transformer =
                        ListSocialIdentityProvidersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListSocialIdentityProvidersRequest, ListSocialIdentityProvidersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListSocialIdentityProvidersRequest,
                                ListSocialIdentityProvidersResponse>,
                        java.util.concurrent.Future<ListSocialIdentityProvidersResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListSocialIdentityProvidersRequest, ListSocialIdentityProvidersResponse>(
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
    public java.util.concurrent.Future<ListUserAttributesSettingsResponse>
            listUserAttributesSettings(
                    ListUserAttributesSettingsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListUserAttributesSettingsRequest,
                                    ListUserAttributesSettingsResponse>
                            handler) {
        LOG.trace("Called async listUserAttributesSettings");
        final ListUserAttributesSettingsRequest interceptedRequest =
                ListUserAttributesSettingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListUserAttributesSettingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "ListUserAttributesSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserAttributesSetting/ListUserAttributesSettings");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, ListUserAttributesSettingsResponse>
                transformer =
                        ListUserAttributesSettingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        ListUserAttributesSettingsRequest, ListUserAttributesSettingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ListUserAttributesSettingsRequest,
                                ListUserAttributesSettingsResponse>,
                        java.util.concurrent.Future<ListUserAttributesSettingsResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ListUserAttributesSettingsRequest, ListUserAttributesSettingsResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserDbCredentials/ListUserDbCredentials");
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
                        "IdentityDomains",
                        "ListUsers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Users/ListUsers");
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
    public java.util.concurrent.Future<PatchAccountRecoverySettingResponse>
            patchAccountRecoverySetting(
                    PatchAccountRecoverySettingRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PatchAccountRecoverySettingRequest,
                                    PatchAccountRecoverySettingResponse>
                            handler) {
        LOG.trace("Called async patchAccountRecoverySetting");
        final PatchAccountRecoverySettingRequest interceptedRequest =
                PatchAccountRecoverySettingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchAccountRecoverySettingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchAccountRecoverySetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AccountRecoverySetting/PatchAccountRecoverySetting");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PatchAccountRecoverySettingResponse>
                transformer =
                        PatchAccountRecoverySettingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchAccountRecoverySettingRequest, PatchAccountRecoverySettingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchAccountRecoverySettingRequest,
                                PatchAccountRecoverySettingResponse>,
                        java.util.concurrent.Future<PatchAccountRecoverySettingResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchAccountRecoverySettingRequest, PatchAccountRecoverySettingResponse>(
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
                        "IdentityDomains",
                        "PatchApiKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApiKey/PatchApiKey");
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
    public java.util.concurrent.Future<PatchAppResponse> patchApp(
            PatchAppRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchAppRequest, PatchAppResponse>
                    handler) {
        LOG.trace("Called async patchApp");
        final PatchAppRequest interceptedRequest = PatchAppConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchAppConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchApp",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/App/PatchApp");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchAppResponse> transformer =
                PatchAppConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PatchAppRequest, PatchAppResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<PatchAppRequest, PatchAppResponse>,
                        java.util.concurrent.Future<PatchAppResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchAppRequest, PatchAppResponse>(
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
    public java.util.concurrent.Future<PatchAppRoleResponse> patchAppRole(
            PatchAppRoleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchAppRoleRequest, PatchAppRoleResponse>
                    handler) {
        LOG.trace("Called async patchAppRole");
        final PatchAppRoleRequest interceptedRequest =
                PatchAppRoleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchAppRoleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchAppRole",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AppRole/PatchAppRole");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchAppRoleResponse>
                transformer =
                        PatchAppRoleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PatchAppRoleRequest, PatchAppRoleResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchAppRoleRequest, PatchAppRoleResponse>,
                        java.util.concurrent.Future<PatchAppRoleResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchAppRoleRequest, PatchAppRoleResponse>(
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
    public java.util.concurrent.Future<PatchApprovalWorkflowResponse> patchApprovalWorkflow(
            PatchApprovalWorkflowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchApprovalWorkflowRequest, PatchApprovalWorkflowResponse>
                    handler) {
        LOG.trace("Called async patchApprovalWorkflow");
        final PatchApprovalWorkflowRequest interceptedRequest =
                PatchApprovalWorkflowConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchApprovalWorkflowConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchApprovalWorkflow",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflow/PatchApprovalWorkflow");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchApprovalWorkflowResponse>
                transformer =
                        PatchApprovalWorkflowConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchApprovalWorkflowRequest, PatchApprovalWorkflowResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchApprovalWorkflowRequest, PatchApprovalWorkflowResponse>,
                        java.util.concurrent.Future<PatchApprovalWorkflowResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchApprovalWorkflowRequest, PatchApprovalWorkflowResponse>(
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
    public java.util.concurrent.Future<PatchApprovalWorkflowStepResponse> patchApprovalWorkflowStep(
            PatchApprovalWorkflowStepRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchApprovalWorkflowStepRequest, PatchApprovalWorkflowStepResponse>
                    handler) {
        LOG.trace("Called async patchApprovalWorkflowStep");
        final PatchApprovalWorkflowStepRequest interceptedRequest =
                PatchApprovalWorkflowStepConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchApprovalWorkflowStepConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchApprovalWorkflowStep",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflowStep/PatchApprovalWorkflowStep");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PatchApprovalWorkflowStepResponse>
                transformer =
                        PatchApprovalWorkflowStepConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchApprovalWorkflowStepRequest, PatchApprovalWorkflowStepResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchApprovalWorkflowStepRequest,
                                PatchApprovalWorkflowStepResponse>,
                        java.util.concurrent.Future<PatchApprovalWorkflowStepResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchApprovalWorkflowStepRequest, PatchApprovalWorkflowStepResponse>(
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
                        "IdentityDomains",
                        "PatchAuthToken",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthToken/PatchAuthToken");
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
    public java.util.concurrent.Future<PatchCloudGateResponse> patchCloudGate(
            PatchCloudGateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchCloudGateRequest, PatchCloudGateResponse>
                    handler) {
        LOG.trace("Called async patchCloudGate");
        final PatchCloudGateRequest interceptedRequest =
                PatchCloudGateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchCloudGateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchCloudGate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGate/PatchCloudGate");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchCloudGateResponse>
                transformer =
                        PatchCloudGateConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PatchCloudGateRequest, PatchCloudGateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchCloudGateRequest, PatchCloudGateResponse>,
                        java.util.concurrent.Future<PatchCloudGateResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchCloudGateRequest, PatchCloudGateResponse>(
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
    public java.util.concurrent.Future<PatchCloudGateMappingResponse> patchCloudGateMapping(
            PatchCloudGateMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchCloudGateMappingRequest, PatchCloudGateMappingResponse>
                    handler) {
        LOG.trace("Called async patchCloudGateMapping");
        final PatchCloudGateMappingRequest interceptedRequest =
                PatchCloudGateMappingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchCloudGateMappingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchCloudGateMapping",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateMapping/PatchCloudGateMapping");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchCloudGateMappingResponse>
                transformer =
                        PatchCloudGateMappingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchCloudGateMappingRequest, PatchCloudGateMappingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchCloudGateMappingRequest, PatchCloudGateMappingResponse>,
                        java.util.concurrent.Future<PatchCloudGateMappingResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchCloudGateMappingRequest, PatchCloudGateMappingResponse>(
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
    public java.util.concurrent.Future<PatchCloudGateServerResponse> patchCloudGateServer(
            PatchCloudGateServerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchCloudGateServerRequest, PatchCloudGateServerResponse>
                    handler) {
        LOG.trace("Called async patchCloudGateServer");
        final PatchCloudGateServerRequest interceptedRequest =
                PatchCloudGateServerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchCloudGateServerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchCloudGateServer",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateServer/PatchCloudGateServer");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchCloudGateServerResponse>
                transformer =
                        PatchCloudGateServerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchCloudGateServerRequest, PatchCloudGateServerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchCloudGateServerRequest, PatchCloudGateServerResponse>,
                        java.util.concurrent.Future<PatchCloudGateServerResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchCloudGateServerRequest, PatchCloudGateServerResponse>(
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
    public java.util.concurrent.Future<PatchConditionResponse> patchCondition(
            PatchConditionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchConditionRequest, PatchConditionResponse>
                    handler) {
        LOG.trace("Called async patchCondition");
        final PatchConditionRequest interceptedRequest =
                PatchConditionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchConditionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchCondition",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Condition/PatchCondition");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchConditionResponse>
                transformer =
                        PatchConditionConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PatchConditionRequest, PatchConditionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchConditionRequest, PatchConditionResponse>,
                        java.util.concurrent.Future<PatchConditionResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchConditionRequest, PatchConditionResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CustomerSecretKey/PatchCustomerSecretKey");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/DynamicResourceGroup/PatchDynamicResourceGroup");
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
    public java.util.concurrent.Future<PatchGrantResponse> patchGrant(
            PatchGrantRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchGrantRequest, PatchGrantResponse>
                    handler) {
        LOG.trace("Called async patchGrant");
        final PatchGrantRequest interceptedRequest = PatchGrantConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchGrantConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchGrant",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Grant/PatchGrant");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchGrantResponse>
                transformer =
                        PatchGrantConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PatchGrantRequest, PatchGrantResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchGrantRequest, PatchGrantResponse>,
                        java.util.concurrent.Future<PatchGrantResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchGrantRequest, PatchGrantResponse>(
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
                        "IdentityDomains",
                        "PatchGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Group/PatchGroup");
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
    public java.util.concurrent.Future<PatchIdentityPropagationTrustResponse>
            patchIdentityPropagationTrust(
                    PatchIdentityPropagationTrustRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PatchIdentityPropagationTrustRequest,
                                    PatchIdentityPropagationTrustResponse>
                            handler) {
        LOG.trace("Called async patchIdentityPropagationTrust");
        final PatchIdentityPropagationTrustRequest interceptedRequest =
                PatchIdentityPropagationTrustConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchIdentityPropagationTrustConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchIdentityPropagationTrust",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityPropagationTrust/PatchIdentityPropagationTrust");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PatchIdentityPropagationTrustResponse>
                transformer =
                        PatchIdentityPropagationTrustConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchIdentityPropagationTrustRequest, PatchIdentityPropagationTrustResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchIdentityPropagationTrustRequest,
                                PatchIdentityPropagationTrustResponse>,
                        java.util.concurrent.Future<PatchIdentityPropagationTrustResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchIdentityPropagationTrustRequest, PatchIdentityPropagationTrustResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityProvider/PatchIdentityProvider");
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
    public java.util.concurrent.Future<PatchIdentitySettingResponse> patchIdentitySetting(
            PatchIdentitySettingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchIdentitySettingRequest, PatchIdentitySettingResponse>
                    handler) {
        LOG.trace("Called async patchIdentitySetting");
        final PatchIdentitySettingRequest interceptedRequest =
                PatchIdentitySettingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchIdentitySettingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchIdentitySetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentitySetting/PatchIdentitySetting");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchIdentitySettingResponse>
                transformer =
                        PatchIdentitySettingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchIdentitySettingRequest, PatchIdentitySettingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchIdentitySettingRequest, PatchIdentitySettingResponse>,
                        java.util.concurrent.Future<PatchIdentitySettingResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchIdentitySettingRequest, PatchIdentitySettingResponse>(
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
                        "IdentityDomains",
                        "PatchKmsiSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/KmsiSetting/PatchKmsiSetting");
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
                        "IdentityDomains",
                        "PatchMe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Me/PatchMe");
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
                        "IdentityDomains",
                        "PatchMyApiKey",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyApiKey/PatchMyApiKey");
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
                        "IdentityDomains",
                        "PatchMyAuthToken",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyAuthToken/PatchMyAuthToken");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyCustomerSecretKey/PatchMyCustomerSecretKey");
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
                        "IdentityDomains",
                        "PatchMyDevice",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyDevice/PatchMyDevice");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyOAuth2ClientCredential/PatchMyOAuth2ClientCredential");
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
    public java.util.concurrent.Future<PatchMyPendingApprovalResponse> patchMyPendingApproval(
            PatchMyPendingApprovalRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchMyPendingApprovalRequest, PatchMyPendingApprovalResponse>
                    handler) {
        LOG.trace("Called async patchMyPendingApproval");
        final PatchMyPendingApprovalRequest interceptedRequest =
                PatchMyPendingApprovalConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchMyPendingApprovalConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchMyPendingApproval",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyPendingApproval/PatchMyPendingApproval");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchMyPendingApprovalResponse>
                transformer =
                        PatchMyPendingApprovalConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchMyPendingApprovalRequest, PatchMyPendingApprovalResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchMyPendingApprovalRequest, PatchMyPendingApprovalResponse>,
                        java.util.concurrent.Future<PatchMyPendingApprovalResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchMyPendingApprovalRequest, PatchMyPendingApprovalResponse>(
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
    public java.util.concurrent.Future<PatchMyRequestResponse> patchMyRequest(
            PatchMyRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchMyRequestRequest, PatchMyRequestResponse>
                    handler) {
        LOG.trace("Called async patchMyRequest");
        final PatchMyRequestRequest interceptedRequest =
                PatchMyRequestConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchMyRequestConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchMyRequest",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyRequest/PatchMyRequest");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchMyRequestResponse>
                transformer =
                        PatchMyRequestConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PatchMyRequestRequest, PatchMyRequestResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchMyRequestRequest, PatchMyRequestResponse>,
                        java.util.concurrent.Future<PatchMyRequestResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchMyRequestRequest, PatchMyRequestResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MySmtpCredential/PatchMySmtpCredential");
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
    public java.util.concurrent.Future<PatchNetworkPerimeterResponse> patchNetworkPerimeter(
            PatchNetworkPerimeterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchNetworkPerimeterRequest, PatchNetworkPerimeterResponse>
                    handler) {
        LOG.trace("Called async patchNetworkPerimeter");
        final PatchNetworkPerimeterRequest interceptedRequest =
                PatchNetworkPerimeterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchNetworkPerimeterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchNetworkPerimeter",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NetworkPerimeter/PatchNetworkPerimeter");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchNetworkPerimeterResponse>
                transformer =
                        PatchNetworkPerimeterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchNetworkPerimeterRequest, PatchNetworkPerimeterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchNetworkPerimeterRequest, PatchNetworkPerimeterResponse>,
                        java.util.concurrent.Future<PatchNetworkPerimeterResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchNetworkPerimeterRequest, PatchNetworkPerimeterResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuth2ClientCredential/PatchOAuth2ClientCredential");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/PasswordPolicy/PatchPasswordPolicy");
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
    public java.util.concurrent.Future<PatchPolicyResponse> patchPolicy(
            PatchPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchPolicyRequest, PatchPolicyResponse>
                    handler) {
        LOG.trace("Called async patchPolicy");
        final PatchPolicyRequest interceptedRequest =
                PatchPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Policy/PatchPolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchPolicyResponse>
                transformer =
                        PatchPolicyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PatchPolicyRequest, PatchPolicyResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchPolicyRequest, PatchPolicyResponse>,
                        java.util.concurrent.Future<PatchPolicyResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchPolicyRequest, PatchPolicyResponse>(
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
    public java.util.concurrent.Future<PatchRuleResponse> patchRule(
            PatchRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchRuleRequest, PatchRuleResponse>
                    handler) {
        LOG.trace("Called async patchRule");
        final PatchRuleRequest interceptedRequest = PatchRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Rule/PatchRule");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchRuleResponse>
                transformer =
                        PatchRuleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PatchRuleRequest, PatchRuleResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<PatchRuleRequest, PatchRuleResponse>,
                        java.util.concurrent.Future<PatchRuleResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchRuleRequest, PatchRuleResponse>(
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
    public java.util.concurrent.Future<PatchSchemaResponse> patchSchema(
            PatchSchemaRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchSchemaRequest, PatchSchemaResponse>
                    handler) {
        LOG.trace("Called async patchSchema");
        final PatchSchemaRequest interceptedRequest =
                PatchSchemaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchSchemaConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchSchema",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Schema/PatchSchema");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchSchemaResponse>
                transformer =
                        PatchSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PatchSchemaRequest, PatchSchemaResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchSchemaRequest, PatchSchemaResponse>,
                        java.util.concurrent.Future<PatchSchemaResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchSchemaRequest, PatchSchemaResponse>(
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
    public java.util.concurrent.Future<PatchSecurityQuestionResponse> patchSecurityQuestion(
            PatchSecurityQuestionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchSecurityQuestionRequest, PatchSecurityQuestionResponse>
                    handler) {
        LOG.trace("Called async patchSecurityQuestion");
        final PatchSecurityQuestionRequest interceptedRequest =
                PatchSecurityQuestionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchSecurityQuestionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchSecurityQuestion",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestion/PatchSecurityQuestion");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchSecurityQuestionResponse>
                transformer =
                        PatchSecurityQuestionConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchSecurityQuestionRequest, PatchSecurityQuestionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchSecurityQuestionRequest, PatchSecurityQuestionResponse>,
                        java.util.concurrent.Future<PatchSecurityQuestionResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchSecurityQuestionRequest, PatchSecurityQuestionResponse>(
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
    public java.util.concurrent.Future<PatchSecurityQuestionSettingResponse>
            patchSecurityQuestionSetting(
                    PatchSecurityQuestionSettingRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PatchSecurityQuestionSettingRequest,
                                    PatchSecurityQuestionSettingResponse>
                            handler) {
        LOG.trace("Called async patchSecurityQuestionSetting");
        final PatchSecurityQuestionSettingRequest interceptedRequest =
                PatchSecurityQuestionSettingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchSecurityQuestionSettingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchSecurityQuestionSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestionSetting/PatchSecurityQuestionSetting");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PatchSecurityQuestionSettingResponse>
                transformer =
                        PatchSecurityQuestionSettingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchSecurityQuestionSettingRequest, PatchSecurityQuestionSettingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchSecurityQuestionSettingRequest,
                                PatchSecurityQuestionSettingResponse>,
                        java.util.concurrent.Future<PatchSecurityQuestionSettingResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchSecurityQuestionSettingRequest, PatchSecurityQuestionSettingResponse>(
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
    public java.util.concurrent.Future<PatchSelfRegistrationProfileResponse>
            patchSelfRegistrationProfile(
                    PatchSelfRegistrationProfileRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PatchSelfRegistrationProfileRequest,
                                    PatchSelfRegistrationProfileResponse>
                            handler) {
        LOG.trace("Called async patchSelfRegistrationProfile");
        final PatchSelfRegistrationProfileRequest interceptedRequest =
                PatchSelfRegistrationProfileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchSelfRegistrationProfileConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchSelfRegistrationProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SelfRegistrationProfile/PatchSelfRegistrationProfile");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PatchSelfRegistrationProfileResponse>
                transformer =
                        PatchSelfRegistrationProfileConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchSelfRegistrationProfileRequest, PatchSelfRegistrationProfileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchSelfRegistrationProfileRequest,
                                PatchSelfRegistrationProfileResponse>,
                        java.util.concurrent.Future<PatchSelfRegistrationProfileResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchSelfRegistrationProfileRequest, PatchSelfRegistrationProfileResponse>(
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
    public java.util.concurrent.Future<PatchSettingResponse> patchSetting(
            PatchSettingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchSettingRequest, PatchSettingResponse>
                    handler) {
        LOG.trace("Called async patchSetting");
        final PatchSettingRequest interceptedRequest =
                PatchSettingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchSettingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Setting/PatchSetting");
        final java.util.function.Function<javax.ws.rs.core.Response, PatchSettingResponse>
                transformer =
                        PatchSettingConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PatchSettingRequest, PatchSettingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchSettingRequest, PatchSettingResponse>,
                        java.util.concurrent.Future<PatchSettingResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchSettingRequest, PatchSettingResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SmtpCredential/PatchSmtpCredential");
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
    public java.util.concurrent.Future<PatchSocialIdentityProviderResponse>
            patchSocialIdentityProvider(
                    PatchSocialIdentityProviderRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PatchSocialIdentityProviderRequest,
                                    PatchSocialIdentityProviderResponse>
                            handler) {
        LOG.trace("Called async patchSocialIdentityProvider");
        final PatchSocialIdentityProviderRequest interceptedRequest =
                PatchSocialIdentityProviderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchSocialIdentityProviderConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchSocialIdentityProvider",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SocialIdentityProvider/PatchSocialIdentityProvider");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PatchSocialIdentityProviderResponse>
                transformer =
                        PatchSocialIdentityProviderConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchSocialIdentityProviderRequest, PatchSocialIdentityProviderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchSocialIdentityProviderRequest,
                                PatchSocialIdentityProviderResponse>,
                        java.util.concurrent.Future<PatchSocialIdentityProviderResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchSocialIdentityProviderRequest, PatchSocialIdentityProviderResponse>(
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
                        "IdentityDomains",
                        "PatchUser",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/User/PatchUser");
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
    public java.util.concurrent.Future<PatchUserAttributesSettingResponse>
            patchUserAttributesSetting(
                    PatchUserAttributesSettingRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PatchUserAttributesSettingRequest,
                                    PatchUserAttributesSettingResponse>
                            handler) {
        LOG.trace("Called async patchUserAttributesSetting");
        final PatchUserAttributesSettingRequest interceptedRequest =
                PatchUserAttributesSettingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PatchUserAttributesSettingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PatchUserAttributesSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserAttributesSetting/PatchUserAttributesSetting");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PatchUserAttributesSettingResponse>
                transformer =
                        PatchUserAttributesSettingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PatchUserAttributesSettingRequest, PatchUserAttributesSettingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PatchUserAttributesSettingRequest,
                                PatchUserAttributesSettingResponse>,
                        java.util.concurrent.Future<PatchUserAttributesSettingResponse>>
                futureSupplier =
                        client.patchFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPatchOp(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PatchUserAttributesSettingRequest, PatchUserAttributesSettingResponse>(
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
    public java.util.concurrent.Future<PutAccountRecoverySettingResponse> putAccountRecoverySetting(
            PutAccountRecoverySettingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutAccountRecoverySettingRequest, PutAccountRecoverySettingResponse>
                    handler) {
        LOG.trace("Called async putAccountRecoverySetting");
        final PutAccountRecoverySettingRequest interceptedRequest =
                PutAccountRecoverySettingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutAccountRecoverySettingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutAccountRecoverySetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AccountRecoverySetting/PutAccountRecoverySetting");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PutAccountRecoverySettingResponse>
                transformer =
                        PutAccountRecoverySettingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PutAccountRecoverySettingRequest, PutAccountRecoverySettingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutAccountRecoverySettingRequest,
                                PutAccountRecoverySettingResponse>,
                        java.util.concurrent.Future<PutAccountRecoverySettingResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAccountRecoverySetting(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutAccountRecoverySettingRequest, PutAccountRecoverySettingResponse>(
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
    public java.util.concurrent.Future<PutAppResponse> putApp(
            PutAppRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PutAppRequest, PutAppResponse> handler) {
        LOG.trace("Called async putApp");
        final PutAppRequest interceptedRequest = PutAppConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutAppConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutApp",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/App/PutApp");
        final java.util.function.Function<javax.ws.rs.core.Response, PutAppResponse> transformer =
                PutAppConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PutAppRequest, PutAppResponse> handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<PutAppRequest, PutAppResponse>,
                        java.util.concurrent.Future<PutAppResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest, interceptedRequest.getApp(), ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutAppRequest, PutAppResponse>(
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
    public java.util.concurrent.Future<PutAppStatusChangerResponse> putAppStatusChanger(
            PutAppStatusChangerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutAppStatusChangerRequest, PutAppStatusChangerResponse>
                    handler) {
        LOG.trace("Called async putAppStatusChanger");
        final PutAppStatusChangerRequest interceptedRequest =
                PutAppStatusChangerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutAppStatusChangerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutAppStatusChanger",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AppStatusChanger/PutAppStatusChanger");
        final java.util.function.Function<javax.ws.rs.core.Response, PutAppStatusChangerResponse>
                transformer =
                        PutAppStatusChangerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PutAppStatusChangerRequest, PutAppStatusChangerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutAppStatusChangerRequest, PutAppStatusChangerResponse>,
                        java.util.concurrent.Future<PutAppStatusChangerResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAppStatusChanger(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutAppStatusChangerRequest, PutAppStatusChangerResponse>(
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
    public java.util.concurrent.Future<PutApprovalWorkflowResponse> putApprovalWorkflow(
            PutApprovalWorkflowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutApprovalWorkflowRequest, PutApprovalWorkflowResponse>
                    handler) {
        LOG.trace("Called async putApprovalWorkflow");
        final PutApprovalWorkflowRequest interceptedRequest =
                PutApprovalWorkflowConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutApprovalWorkflowConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutApprovalWorkflow",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApprovalWorkflow/PutApprovalWorkflow");
        final java.util.function.Function<javax.ws.rs.core.Response, PutApprovalWorkflowResponse>
                transformer =
                        PutApprovalWorkflowConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PutApprovalWorkflowRequest, PutApprovalWorkflowResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutApprovalWorkflowRequest, PutApprovalWorkflowResponse>,
                        java.util.concurrent.Future<PutApprovalWorkflowResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getApprovalWorkflow(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutApprovalWorkflowRequest, PutApprovalWorkflowResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthenticationFactorSetting/PutAuthenticationFactorSetting");
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
    public java.util.concurrent.Future<PutCloudGateResponse> putCloudGate(
            PutCloudGateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PutCloudGateRequest, PutCloudGateResponse>
                    handler) {
        LOG.trace("Called async putCloudGate");
        final PutCloudGateRequest interceptedRequest =
                PutCloudGateConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutCloudGateConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutCloudGate",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGate/PutCloudGate");
        final java.util.function.Function<javax.ws.rs.core.Response, PutCloudGateResponse>
                transformer =
                        PutCloudGateConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PutCloudGateRequest, PutCloudGateResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutCloudGateRequest, PutCloudGateResponse>,
                        java.util.concurrent.Future<PutCloudGateResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCloudGate(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutCloudGateRequest, PutCloudGateResponse>(
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
    public java.util.concurrent.Future<PutCloudGateMappingResponse> putCloudGateMapping(
            PutCloudGateMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutCloudGateMappingRequest, PutCloudGateMappingResponse>
                    handler) {
        LOG.trace("Called async putCloudGateMapping");
        final PutCloudGateMappingRequest interceptedRequest =
                PutCloudGateMappingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutCloudGateMappingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutCloudGateMapping",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateMapping/PutCloudGateMapping");
        final java.util.function.Function<javax.ws.rs.core.Response, PutCloudGateMappingResponse>
                transformer =
                        PutCloudGateMappingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PutCloudGateMappingRequest, PutCloudGateMappingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutCloudGateMappingRequest, PutCloudGateMappingResponse>,
                        java.util.concurrent.Future<PutCloudGateMappingResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCloudGateMapping(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutCloudGateMappingRequest, PutCloudGateMappingResponse>(
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
    public java.util.concurrent.Future<PutCloudGateServerResponse> putCloudGateServer(
            PutCloudGateServerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutCloudGateServerRequest, PutCloudGateServerResponse>
                    handler) {
        LOG.trace("Called async putCloudGateServer");
        final PutCloudGateServerRequest interceptedRequest =
                PutCloudGateServerConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutCloudGateServerConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutCloudGateServer",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateServer/PutCloudGateServer");
        final java.util.function.Function<javax.ws.rs.core.Response, PutCloudGateServerResponse>
                transformer =
                        PutCloudGateServerConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PutCloudGateServerRequest, PutCloudGateServerResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutCloudGateServerRequest, PutCloudGateServerResponse>,
                        java.util.concurrent.Future<PutCloudGateServerResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCloudGateServer(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutCloudGateServerRequest, PutCloudGateServerResponse>(
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
    public java.util.concurrent.Future<PutConditionResponse> putCondition(
            PutConditionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PutConditionRequest, PutConditionResponse>
                    handler) {
        LOG.trace("Called async putCondition");
        final PutConditionRequest interceptedRequest =
                PutConditionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutConditionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutCondition",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Condition/PutCondition");
        final java.util.function.Function<javax.ws.rs.core.Response, PutConditionResponse>
                transformer =
                        PutConditionConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PutConditionRequest, PutConditionResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutConditionRequest, PutConditionResponse>,
                        java.util.concurrent.Future<PutConditionResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCondition(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutConditionRequest, PutConditionResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/DynamicResourceGroup/PutDynamicResourceGroup");
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
                        "IdentityDomains",
                        "PutGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Group/PutGroup");
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
    public java.util.concurrent.Future<PutIdentityPropagationTrustResponse>
            putIdentityPropagationTrust(
                    PutIdentityPropagationTrustRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PutIdentityPropagationTrustRequest,
                                    PutIdentityPropagationTrustResponse>
                            handler) {
        LOG.trace("Called async putIdentityPropagationTrust");
        final PutIdentityPropagationTrustRequest interceptedRequest =
                PutIdentityPropagationTrustConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutIdentityPropagationTrustConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutIdentityPropagationTrust",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityPropagationTrust/PutIdentityPropagationTrust");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PutIdentityPropagationTrustResponse>
                transformer =
                        PutIdentityPropagationTrustConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PutIdentityPropagationTrustRequest, PutIdentityPropagationTrustResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutIdentityPropagationTrustRequest,
                                PutIdentityPropagationTrustResponse>,
                        java.util.concurrent.Future<PutIdentityPropagationTrustResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getIdentityPropagationTrust(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutIdentityPropagationTrustRequest, PutIdentityPropagationTrustResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityProvider/PutIdentityProvider");
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
    public java.util.concurrent.Future<PutIdentitySettingResponse> putIdentitySetting(
            PutIdentitySettingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutIdentitySettingRequest, PutIdentitySettingResponse>
                    handler) {
        LOG.trace("Called async putIdentitySetting");
        final PutIdentitySettingRequest interceptedRequest =
                PutIdentitySettingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutIdentitySettingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutIdentitySetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentitySetting/PutIdentitySetting");
        final java.util.function.Function<javax.ws.rs.core.Response, PutIdentitySettingResponse>
                transformer =
                        PutIdentitySettingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PutIdentitySettingRequest, PutIdentitySettingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutIdentitySettingRequest, PutIdentitySettingResponse>,
                        java.util.concurrent.Future<PutIdentitySettingResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getIdentitySetting(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutIdentitySettingRequest, PutIdentitySettingResponse>(
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
                        "IdentityDomains",
                        "PutKmsiSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/KmsiSetting/PutKmsiSetting");
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
                        "IdentityDomains",
                        "PutMe",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Me/PutMe");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MePasswordChanger/PutMePasswordChanger");
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
    public java.util.concurrent.Future<PutNetworkPerimeterResponse> putNetworkPerimeter(
            PutNetworkPerimeterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutNetworkPerimeterRequest, PutNetworkPerimeterResponse>
                    handler) {
        LOG.trace("Called async putNetworkPerimeter");
        final PutNetworkPerimeterRequest interceptedRequest =
                PutNetworkPerimeterConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutNetworkPerimeterConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutNetworkPerimeter",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NetworkPerimeter/PutNetworkPerimeter");
        final java.util.function.Function<javax.ws.rs.core.Response, PutNetworkPerimeterResponse>
                transformer =
                        PutNetworkPerimeterConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PutNetworkPerimeterRequest, PutNetworkPerimeterResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutNetworkPerimeterRequest, PutNetworkPerimeterResponse>,
                        java.util.concurrent.Future<PutNetworkPerimeterResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getNetworkPerimeter(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutNetworkPerimeterRequest, PutNetworkPerimeterResponse>(
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
    public java.util.concurrent.Future<PutNotificationSettingResponse> putNotificationSetting(
            PutNotificationSettingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutNotificationSettingRequest, PutNotificationSettingResponse>
                    handler) {
        LOG.trace("Called async putNotificationSetting");
        final PutNotificationSettingRequest interceptedRequest =
                PutNotificationSettingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutNotificationSettingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutNotificationSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NotificationSetting/PutNotificationSetting");
        final java.util.function.Function<javax.ws.rs.core.Response, PutNotificationSettingResponse>
                transformer =
                        PutNotificationSettingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PutNotificationSettingRequest, PutNotificationSettingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutNotificationSettingRequest, PutNotificationSettingResponse>,
                        java.util.concurrent.Future<PutNotificationSettingResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getNotificationSetting(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutNotificationSettingRequest, PutNotificationSettingResponse>(
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
                        "IdentityDomains",
                        "PutPasswordPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/PasswordPolicy/PutPasswordPolicy");
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
    public java.util.concurrent.Future<PutPolicyResponse> putPolicy(
            PutPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PutPolicyRequest, PutPolicyResponse>
                    handler) {
        LOG.trace("Called async putPolicy");
        final PutPolicyRequest interceptedRequest = PutPolicyConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutPolicyConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutPolicy",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Policy/PutPolicy");
        final java.util.function.Function<javax.ws.rs.core.Response, PutPolicyResponse>
                transformer =
                        PutPolicyConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PutPolicyRequest, PutPolicyResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<PutPolicyRequest, PutPolicyResponse>,
                        java.util.concurrent.Future<PutPolicyResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPolicy(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutPolicyRequest, PutPolicyResponse>(
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
    public java.util.concurrent.Future<PutRuleResponse> putRule(
            PutRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PutRuleRequest, PutRuleResponse> handler) {
        LOG.trace("Called async putRule");
        final PutRuleRequest interceptedRequest = PutRuleConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutRuleConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutRule",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Rule/PutRule");
        final java.util.function.Function<javax.ws.rs.core.Response, PutRuleResponse> transformer =
                PutRuleConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PutRuleRequest, PutRuleResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<PutRuleRequest, PutRuleResponse>,
                        java.util.concurrent.Future<PutRuleResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest, interceptedRequest.getRule(), ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutRuleRequest, PutRuleResponse>(
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
    public java.util.concurrent.Future<PutSchemaResponse> putSchema(
            PutSchemaRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PutSchemaRequest, PutSchemaResponse>
                    handler) {
        LOG.trace("Called async putSchema");
        final PutSchemaRequest interceptedRequest = PutSchemaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutSchemaConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutSchema",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Schema/PutSchema");
        final java.util.function.Function<javax.ws.rs.core.Response, PutSchemaResponse>
                transformer =
                        PutSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PutSchemaRequest, PutSchemaResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<PutSchemaRequest, PutSchemaResponse>,
                        java.util.concurrent.Future<PutSchemaResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSchema(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutSchemaRequest, PutSchemaResponse>(
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
    public java.util.concurrent.Future<PutSecurityQuestionSettingResponse>
            putSecurityQuestionSetting(
                    PutSecurityQuestionSettingRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PutSecurityQuestionSettingRequest,
                                    PutSecurityQuestionSettingResponse>
                            handler) {
        LOG.trace("Called async putSecurityQuestionSetting");
        final PutSecurityQuestionSettingRequest interceptedRequest =
                PutSecurityQuestionSettingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutSecurityQuestionSettingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutSecurityQuestionSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestionSetting/PutSecurityQuestionSetting");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PutSecurityQuestionSettingResponse>
                transformer =
                        PutSecurityQuestionSettingConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PutSecurityQuestionSettingRequest, PutSecurityQuestionSettingResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutSecurityQuestionSettingRequest,
                                PutSecurityQuestionSettingResponse>,
                        java.util.concurrent.Future<PutSecurityQuestionSettingResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSecurityQuestionSetting(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutSecurityQuestionSettingRequest, PutSecurityQuestionSettingResponse>(
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
    public java.util.concurrent.Future<PutSelfRegistrationProfileResponse>
            putSelfRegistrationProfile(
                    PutSelfRegistrationProfileRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PutSelfRegistrationProfileRequest,
                                    PutSelfRegistrationProfileResponse>
                            handler) {
        LOG.trace("Called async putSelfRegistrationProfile");
        final PutSelfRegistrationProfileRequest interceptedRequest =
                PutSelfRegistrationProfileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutSelfRegistrationProfileConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutSelfRegistrationProfile",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SelfRegistrationProfile/PutSelfRegistrationProfile");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PutSelfRegistrationProfileResponse>
                transformer =
                        PutSelfRegistrationProfileConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PutSelfRegistrationProfileRequest, PutSelfRegistrationProfileResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutSelfRegistrationProfileRequest,
                                PutSelfRegistrationProfileResponse>,
                        java.util.concurrent.Future<PutSelfRegistrationProfileResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSelfRegistrationProfile(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutSelfRegistrationProfileRequest, PutSelfRegistrationProfileResponse>(
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
    public java.util.concurrent.Future<PutSettingResponse> putSetting(
            PutSettingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PutSettingRequest, PutSettingResponse>
                    handler) {
        LOG.trace("Called async putSetting");
        final PutSettingRequest interceptedRequest = PutSettingConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutSettingConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutSetting",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Setting/PutSetting");
        final java.util.function.Function<javax.ws.rs.core.Response, PutSettingResponse>
                transformer =
                        PutSettingConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PutSettingRequest, PutSettingResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutSettingRequest, PutSettingResponse>,
                        java.util.concurrent.Future<PutSettingResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSetting(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutSettingRequest, PutSettingResponse>(
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
    public java.util.concurrent.Future<PutSocialIdentityProviderResponse> putSocialIdentityProvider(
            PutSocialIdentityProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutSocialIdentityProviderRequest, PutSocialIdentityProviderResponse>
                    handler) {
        LOG.trace("Called async putSocialIdentityProvider");
        final PutSocialIdentityProviderRequest interceptedRequest =
                PutSocialIdentityProviderConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutSocialIdentityProviderConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "PutSocialIdentityProvider",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SocialIdentityProvider/PutSocialIdentityProvider");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, PutSocialIdentityProviderResponse>
                transformer =
                        PutSocialIdentityProviderConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        PutSocialIdentityProviderRequest, PutSocialIdentityProviderResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutSocialIdentityProviderRequest,
                                PutSocialIdentityProviderResponse>,
                        java.util.concurrent.Future<PutSocialIdentityProviderResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSocialIdentityProvider(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutSocialIdentityProviderRequest, PutSocialIdentityProviderResponse>(
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
                        "IdentityDomains",
                        "PutUser",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/User/PutUser");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserCapabilitiesChanger/PutUserCapabilitiesChanger");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserPasswordChanger/PutUserPasswordChanger");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserPasswordResetter/PutUserPasswordResetter");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserStatusChanger/PutUserStatusChanger");
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
    public java.util.concurrent.Future<SearchAccountMgmtInfosResponse> searchAccountMgmtInfos(
            SearchAccountMgmtInfosRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchAccountMgmtInfosRequest, SearchAccountMgmtInfosResponse>
                    handler) {
        LOG.trace("Called async searchAccountMgmtInfos");
        final SearchAccountMgmtInfosRequest interceptedRequest =
                SearchAccountMgmtInfosConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchAccountMgmtInfosConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchAccountMgmtInfos",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AccountMgmtInfos/SearchAccountMgmtInfos");
        final java.util.function.Function<javax.ws.rs.core.Response, SearchAccountMgmtInfosResponse>
                transformer =
                        SearchAccountMgmtInfosConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchAccountMgmtInfosRequest, SearchAccountMgmtInfosResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchAccountMgmtInfosRequest, SearchAccountMgmtInfosResponse>,
                        java.util.concurrent.Future<SearchAccountMgmtInfosResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAccountMgmtInfoSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchAccountMgmtInfosRequest, SearchAccountMgmtInfosResponse>(
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
                        "IdentityDomains",
                        "SearchApiKeys",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ApiKeys/SearchApiKeys");
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
    public java.util.concurrent.Future<SearchAppRolesResponse> searchAppRoles(
            SearchAppRolesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchAppRolesRequest, SearchAppRolesResponse>
                    handler) {
        LOG.trace("Called async searchAppRoles");
        final SearchAppRolesRequest interceptedRequest =
                SearchAppRolesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchAppRolesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchAppRoles",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AppRoles/SearchAppRoles");
        final java.util.function.Function<javax.ws.rs.core.Response, SearchAppRolesResponse>
                transformer =
                        SearchAppRolesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<SearchAppRolesRequest, SearchAppRolesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchAppRolesRequest, SearchAppRolesResponse>,
                        java.util.concurrent.Future<SearchAppRolesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAppRoleSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchAppRolesRequest, SearchAppRolesResponse>(
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
    public java.util.concurrent.Future<SearchAppsResponse> searchApps(
            SearchAppsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<SearchAppsRequest, SearchAppsResponse>
                    handler) {
        LOG.trace("Called async searchApps");
        final SearchAppsRequest interceptedRequest = SearchAppsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchAppsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchApps",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Apps/SearchApps");
        final java.util.function.Function<javax.ws.rs.core.Response, SearchAppsResponse>
                transformer =
                        SearchAppsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<SearchAppsRequest, SearchAppsResponse> handlerToUse =
                handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchAppsRequest, SearchAppsResponse>,
                        java.util.concurrent.Future<SearchAppsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getAppSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchAppsRequest, SearchAppsResponse>(
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
                        "IdentityDomains",
                        "SearchAuthTokens",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthTokens/SearchAuthTokens");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/AuthenticationFactorSettings/SearchAuthenticationFactorSettings");
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
    public java.util.concurrent.Future<SearchCloudGateMappingsResponse> searchCloudGateMappings(
            SearchCloudGateMappingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchCloudGateMappingsRequest, SearchCloudGateMappingsResponse>
                    handler) {
        LOG.trace("Called async searchCloudGateMappings");
        final SearchCloudGateMappingsRequest interceptedRequest =
                SearchCloudGateMappingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchCloudGateMappingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchCloudGateMappings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateMappings/SearchCloudGateMappings");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchCloudGateMappingsResponse>
                transformer =
                        SearchCloudGateMappingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchCloudGateMappingsRequest, SearchCloudGateMappingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchCloudGateMappingsRequest, SearchCloudGateMappingsResponse>,
                        java.util.concurrent.Future<SearchCloudGateMappingsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCloudGateMappingSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchCloudGateMappingsRequest, SearchCloudGateMappingsResponse>(
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
    public java.util.concurrent.Future<SearchCloudGateServersResponse> searchCloudGateServers(
            SearchCloudGateServersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchCloudGateServersRequest, SearchCloudGateServersResponse>
                    handler) {
        LOG.trace("Called async searchCloudGateServers");
        final SearchCloudGateServersRequest interceptedRequest =
                SearchCloudGateServersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchCloudGateServersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchCloudGateServers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGateServers/SearchCloudGateServers");
        final java.util.function.Function<javax.ws.rs.core.Response, SearchCloudGateServersResponse>
                transformer =
                        SearchCloudGateServersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchCloudGateServersRequest, SearchCloudGateServersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchCloudGateServersRequest, SearchCloudGateServersResponse>,
                        java.util.concurrent.Future<SearchCloudGateServersResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCloudGateServerSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchCloudGateServersRequest, SearchCloudGateServersResponse>(
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
    public java.util.concurrent.Future<SearchCloudGatesResponse> searchCloudGates(
            SearchCloudGatesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchCloudGatesRequest, SearchCloudGatesResponse>
                    handler) {
        LOG.trace("Called async searchCloudGates");
        final SearchCloudGatesRequest interceptedRequest =
                SearchCloudGatesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchCloudGatesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchCloudGates",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CloudGates/SearchCloudGates");
        final java.util.function.Function<javax.ws.rs.core.Response, SearchCloudGatesResponse>
                transformer =
                        SearchCloudGatesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<SearchCloudGatesRequest, SearchCloudGatesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchCloudGatesRequest, SearchCloudGatesResponse>,
                        java.util.concurrent.Future<SearchCloudGatesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCloudGateSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchCloudGatesRequest, SearchCloudGatesResponse>(
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
    public java.util.concurrent.Future<SearchConditionsResponse> searchConditions(
            SearchConditionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchConditionsRequest, SearchConditionsResponse>
                    handler) {
        LOG.trace("Called async searchConditions");
        final SearchConditionsRequest interceptedRequest =
                SearchConditionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchConditionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchConditions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Condition/SearchConditions");
        final java.util.function.Function<javax.ws.rs.core.Response, SearchConditionsResponse>
                transformer =
                        SearchConditionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<SearchConditionsRequest, SearchConditionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchConditionsRequest, SearchConditionsResponse>,
                        java.util.concurrent.Future<SearchConditionsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getConditionSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchConditionsRequest, SearchConditionsResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/CustomerSecretKeys/SearchCustomerSecretKeys");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/DynamicResourceGroups/SearchDynamicResourceGroups");
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
    public java.util.concurrent.Future<SearchGrantsResponse> searchGrants(
            SearchGrantsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<SearchGrantsRequest, SearchGrantsResponse>
                    handler) {
        LOG.trace("Called async searchGrants");
        final SearchGrantsRequest interceptedRequest =
                SearchGrantsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchGrantsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchGrants",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Grants/SearchGrants");
        final java.util.function.Function<javax.ws.rs.core.Response, SearchGrantsResponse>
                transformer =
                        SearchGrantsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<SearchGrantsRequest, SearchGrantsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchGrantsRequest, SearchGrantsResponse>,
                        java.util.concurrent.Future<SearchGrantsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getGrantSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchGrantsRequest, SearchGrantsResponse>(
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
                        "IdentityDomains",
                        "SearchGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Groups/SearchGroups");
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentityProviders/SearchIdentityProviders");
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
    public java.util.concurrent.Future<SearchIdentitySettingsResponse> searchIdentitySettings(
            SearchIdentitySettingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchIdentitySettingsRequest, SearchIdentitySettingsResponse>
                    handler) {
        LOG.trace("Called async searchIdentitySettings");
        final SearchIdentitySettingsRequest interceptedRequest =
                SearchIdentitySettingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchIdentitySettingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchIdentitySettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/IdentitySettings/SearchIdentitySettings");
        final java.util.function.Function<javax.ws.rs.core.Response, SearchIdentitySettingsResponse>
                transformer =
                        SearchIdentitySettingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchIdentitySettingsRequest, SearchIdentitySettingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchIdentitySettingsRequest, SearchIdentitySettingsResponse>,
                        java.util.concurrent.Future<SearchIdentitySettingsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getIdentitySettingsSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchIdentitySettingsRequest, SearchIdentitySettingsResponse>(
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
                        "IdentityDomains",
                        "SearchKmsiSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/KmsiSettings/SearchKmsiSettings");
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
    public java.util.concurrent.Future<SearchMyAppsResponse> searchMyApps(
            SearchMyAppsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<SearchMyAppsRequest, SearchMyAppsResponse>
                    handler) {
        LOG.trace("Called async searchMyApps");
        final SearchMyAppsRequest interceptedRequest =
                SearchMyAppsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchMyAppsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchMyApps",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyApps/SearchMyApps");
        final java.util.function.Function<javax.ws.rs.core.Response, SearchMyAppsResponse>
                transformer =
                        SearchMyAppsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<SearchMyAppsRequest, SearchMyAppsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchMyAppsRequest, SearchMyAppsResponse>,
                        java.util.concurrent.Future<SearchMyAppsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getMyAppSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchMyAppsRequest, SearchMyAppsResponse>(
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
                        "IdentityDomains",
                        "SearchMyGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyGroups/SearchMyGroups");
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
    public java.util.concurrent.Future<SearchMyRequestableGroupsResponse> searchMyRequestableGroups(
            SearchMyRequestableGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchMyRequestableGroupsRequest, SearchMyRequestableGroupsResponse>
                    handler) {
        LOG.trace("Called async searchMyRequestableGroups");
        final SearchMyRequestableGroupsRequest interceptedRequest =
                SearchMyRequestableGroupsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchMyRequestableGroupsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchMyRequestableGroups",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyRequestableGroups/SearchMyRequestableGroups");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchMyRequestableGroupsResponse>
                transformer =
                        SearchMyRequestableGroupsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchMyRequestableGroupsRequest, SearchMyRequestableGroupsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchMyRequestableGroupsRequest,
                                SearchMyRequestableGroupsResponse>,
                        java.util.concurrent.Future<SearchMyRequestableGroupsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getMyRequestableGroupSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchMyRequestableGroupsRequest, SearchMyRequestableGroupsResponse>(
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
    public java.util.concurrent.Future<SearchMyRequestsResponse> searchMyRequests(
            SearchMyRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchMyRequestsRequest, SearchMyRequestsResponse>
                    handler) {
        LOG.trace("Called async searchMyRequests");
        final SearchMyRequestsRequest interceptedRequest =
                SearchMyRequestsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchMyRequestsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchMyRequests",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/MyRequests/SearchMyRequests");
        final java.util.function.Function<javax.ws.rs.core.Response, SearchMyRequestsResponse>
                transformer =
                        SearchMyRequestsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<SearchMyRequestsRequest, SearchMyRequestsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchMyRequestsRequest, SearchMyRequestsResponse>,
                        java.util.concurrent.Future<SearchMyRequestsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getMyRequestSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchMyRequestsRequest, SearchMyRequestsResponse>(
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
    public java.util.concurrent.Future<SearchNetworkPerimetersResponse> searchNetworkPerimeters(
            SearchNetworkPerimetersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchNetworkPerimetersRequest, SearchNetworkPerimetersResponse>
                    handler) {
        LOG.trace("Called async searchNetworkPerimeters");
        final SearchNetworkPerimetersRequest interceptedRequest =
                SearchNetworkPerimetersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchNetworkPerimetersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchNetworkPerimeters",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NetworkPerimeters/SearchNetworkPerimeters");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchNetworkPerimetersResponse>
                transformer =
                        SearchNetworkPerimetersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchNetworkPerimetersRequest, SearchNetworkPerimetersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchNetworkPerimetersRequest, SearchNetworkPerimetersResponse>,
                        java.util.concurrent.Future<SearchNetworkPerimetersResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getNetworkPerimeterSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchNetworkPerimetersRequest, SearchNetworkPerimetersResponse>(
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
    public java.util.concurrent.Future<SearchNotificationSettingsResponse>
            searchNotificationSettings(
                    SearchNotificationSettingsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchNotificationSettingsRequest,
                                    SearchNotificationSettingsResponse>
                            handler) {
        LOG.trace("Called async searchNotificationSettings");
        final SearchNotificationSettingsRequest interceptedRequest =
                SearchNotificationSettingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchNotificationSettingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchNotificationSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/NotificationSettings/SearchNotificationSettings");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchNotificationSettingsResponse>
                transformer =
                        SearchNotificationSettingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchNotificationSettingsRequest, SearchNotificationSettingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchNotificationSettingsRequest,
                                SearchNotificationSettingsResponse>,
                        java.util.concurrent.Future<SearchNotificationSettingsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getNotificationSettingsSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchNotificationSettingsRequest, SearchNotificationSettingsResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuth2ClientCredentials/SearchOAuth2ClientCredentials");
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
    public java.util.concurrent.Future<SearchOAuthClientCertificatesResponse>
            searchOAuthClientCertificates(
                    SearchOAuthClientCertificatesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchOAuthClientCertificatesRequest,
                                    SearchOAuthClientCertificatesResponse>
                            handler) {
        LOG.trace("Called async searchOAuthClientCertificates");
        final SearchOAuthClientCertificatesRequest interceptedRequest =
                SearchOAuthClientCertificatesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchOAuthClientCertificatesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchOAuthClientCertificates",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuthClientCertificates/SearchOAuthClientCertificates");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchOAuthClientCertificatesResponse>
                transformer =
                        SearchOAuthClientCertificatesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchOAuthClientCertificatesRequest, SearchOAuthClientCertificatesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchOAuthClientCertificatesRequest,
                                SearchOAuthClientCertificatesResponse>,
                        java.util.concurrent.Future<SearchOAuthClientCertificatesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getOAuthClientCertificateSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchOAuthClientCertificatesRequest, SearchOAuthClientCertificatesResponse>(
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
    public java.util.concurrent.Future<SearchOAuthPartnerCertificatesResponse>
            searchOAuthPartnerCertificates(
                    SearchOAuthPartnerCertificatesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchOAuthPartnerCertificatesRequest,
                                    SearchOAuthPartnerCertificatesResponse>
                            handler) {
        LOG.trace("Called async searchOAuthPartnerCertificates");
        final SearchOAuthPartnerCertificatesRequest interceptedRequest =
                SearchOAuthPartnerCertificatesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchOAuthPartnerCertificatesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchOAuthPartnerCertificates",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OAuthPartnerCertificates/SearchOAuthPartnerCertificates");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchOAuthPartnerCertificatesResponse>
                transformer =
                        SearchOAuthPartnerCertificatesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchOAuthPartnerCertificatesRequest,
                        SearchOAuthPartnerCertificatesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchOAuthPartnerCertificatesRequest,
                                SearchOAuthPartnerCertificatesResponse>,
                        java.util.concurrent.Future<SearchOAuthPartnerCertificatesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getOAuthPartnerCertificateSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchOAuthPartnerCertificatesRequest, SearchOAuthPartnerCertificatesResponse>(
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
    public java.util.concurrent.Future<SearchOciConsoleSignOnPolicyConsentsResponse>
            searchOciConsoleSignOnPolicyConsents(
                    SearchOciConsoleSignOnPolicyConsentsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchOciConsoleSignOnPolicyConsentsRequest,
                                    SearchOciConsoleSignOnPolicyConsentsResponse>
                            handler) {
        LOG.trace("Called async searchOciConsoleSignOnPolicyConsents");
        final SearchOciConsoleSignOnPolicyConsentsRequest interceptedRequest =
                SearchOciConsoleSignOnPolicyConsentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchOciConsoleSignOnPolicyConsentsConverter.fromRequest(
                        client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchOciConsoleSignOnPolicyConsents",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/OciConsoleSignOnPolicyConsent/SearchOciConsoleSignOnPolicyConsents");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchOciConsoleSignOnPolicyConsentsResponse>
                transformer =
                        SearchOciConsoleSignOnPolicyConsentsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchOciConsoleSignOnPolicyConsentsRequest,
                        SearchOciConsoleSignOnPolicyConsentsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchOciConsoleSignOnPolicyConsentsRequest,
                                SearchOciConsoleSignOnPolicyConsentsResponse>,
                        java.util.concurrent.Future<SearchOciConsoleSignOnPolicyConsentsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getOciConsoleSignOnPolicyConsentSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchOciConsoleSignOnPolicyConsentsRequest,
                    SearchOciConsoleSignOnPolicyConsentsResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/PasswordPolicies/SearchPasswordPolicies");
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
    public java.util.concurrent.Future<SearchPoliciesResponse> searchPolicies(
            SearchPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchPoliciesRequest, SearchPoliciesResponse>
                    handler) {
        LOG.trace("Called async searchPolicies");
        final SearchPoliciesRequest interceptedRequest =
                SearchPoliciesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchPoliciesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchPolicies",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Policy/SearchPolicies");
        final java.util.function.Function<javax.ws.rs.core.Response, SearchPoliciesResponse>
                transformer =
                        SearchPoliciesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<SearchPoliciesRequest, SearchPoliciesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchPoliciesRequest, SearchPoliciesResponse>,
                        java.util.concurrent.Future<SearchPoliciesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPolicySearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchPoliciesRequest, SearchPoliciesResponse>(
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
    public java.util.concurrent.Future<SearchResourceTypeSchemaAttributesResponse>
            searchResourceTypeSchemaAttributes(
                    SearchResourceTypeSchemaAttributesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchResourceTypeSchemaAttributesRequest,
                                    SearchResourceTypeSchemaAttributesResponse>
                            handler) {
        LOG.trace("Called async searchResourceTypeSchemaAttributes");
        final SearchResourceTypeSchemaAttributesRequest interceptedRequest =
                SearchResourceTypeSchemaAttributesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchResourceTypeSchemaAttributesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchResourceTypeSchemaAttributes",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/ResourceTypeSchemaAttributes/SearchResourceTypeSchemaAttributes");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchResourceTypeSchemaAttributesResponse>
                transformer =
                        SearchResourceTypeSchemaAttributesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchResourceTypeSchemaAttributesRequest,
                        SearchResourceTypeSchemaAttributesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchResourceTypeSchemaAttributesRequest,
                                SearchResourceTypeSchemaAttributesResponse>,
                        java.util.concurrent.Future<SearchResourceTypeSchemaAttributesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getResourceTypeSchemaAttributeSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchResourceTypeSchemaAttributesRequest,
                    SearchResourceTypeSchemaAttributesResponse>(
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
    public java.util.concurrent.Future<SearchRulesResponse> searchRules(
            SearchRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<SearchRulesRequest, SearchRulesResponse>
                    handler) {
        LOG.trace("Called async searchRules");
        final SearchRulesRequest interceptedRequest =
                SearchRulesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchRulesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchRules",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Rule/SearchRules");
        final java.util.function.Function<javax.ws.rs.core.Response, SearchRulesResponse>
                transformer =
                        SearchRulesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<SearchRulesRequest, SearchRulesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchRulesRequest, SearchRulesResponse>,
                        java.util.concurrent.Future<SearchRulesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getRuleSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchRulesRequest, SearchRulesResponse>(
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
    public java.util.concurrent.Future<SearchSchemasResponse> searchSchemas(
            SearchSchemasRequest request,
            final com.oracle.bmc.responses.AsyncHandler<SearchSchemasRequest, SearchSchemasResponse>
                    handler) {
        LOG.trace("Called async searchSchemas");
        final SearchSchemasRequest interceptedRequest =
                SearchSchemasConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchSchemasConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchSchemas",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Schemas/SearchSchemas");
        final java.util.function.Function<javax.ws.rs.core.Response, SearchSchemasResponse>
                transformer =
                        SearchSchemasConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<SearchSchemasRequest, SearchSchemasResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchSchemasRequest, SearchSchemasResponse>,
                        java.util.concurrent.Future<SearchSchemasResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSchemaSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchSchemasRequest, SearchSchemasResponse>(
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
    public java.util.concurrent.Future<SearchSecurityQuestionSettingsResponse>
            searchSecurityQuestionSettings(
                    SearchSecurityQuestionSettingsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchSecurityQuestionSettingsRequest,
                                    SearchSecurityQuestionSettingsResponse>
                            handler) {
        LOG.trace("Called async searchSecurityQuestionSettings");
        final SearchSecurityQuestionSettingsRequest interceptedRequest =
                SearchSecurityQuestionSettingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchSecurityQuestionSettingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchSecurityQuestionSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestionSettings/SearchSecurityQuestionSettings");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchSecurityQuestionSettingsResponse>
                transformer =
                        SearchSecurityQuestionSettingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchSecurityQuestionSettingsRequest,
                        SearchSecurityQuestionSettingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchSecurityQuestionSettingsRequest,
                                SearchSecurityQuestionSettingsResponse>,
                        java.util.concurrent.Future<SearchSecurityQuestionSettingsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSecurityQuestionSettingsSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchSecurityQuestionSettingsRequest, SearchSecurityQuestionSettingsResponse>(
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
    public java.util.concurrent.Future<SearchSecurityQuestionsResponse> searchSecurityQuestions(
            SearchSecurityQuestionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchSecurityQuestionsRequest, SearchSecurityQuestionsResponse>
                    handler) {
        LOG.trace("Called async searchSecurityQuestions");
        final SearchSecurityQuestionsRequest interceptedRequest =
                SearchSecurityQuestionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchSecurityQuestionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchSecurityQuestions",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SecurityQuestions/SearchSecurityQuestions");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchSecurityQuestionsResponse>
                transformer =
                        SearchSecurityQuestionsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchSecurityQuestionsRequest, SearchSecurityQuestionsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchSecurityQuestionsRequest, SearchSecurityQuestionsResponse>,
                        java.util.concurrent.Future<SearchSecurityQuestionsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSecurityQuestionSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchSecurityQuestionsRequest, SearchSecurityQuestionsResponse>(
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
    public java.util.concurrent.Future<SearchSelfRegistrationProfilesResponse>
            searchSelfRegistrationProfiles(
                    SearchSelfRegistrationProfilesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchSelfRegistrationProfilesRequest,
                                    SearchSelfRegistrationProfilesResponse>
                            handler) {
        LOG.trace("Called async searchSelfRegistrationProfiles");
        final SearchSelfRegistrationProfilesRequest interceptedRequest =
                SearchSelfRegistrationProfilesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchSelfRegistrationProfilesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchSelfRegistrationProfiles",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SelfRegistrationProfiles/SearchSelfRegistrationProfiles");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchSelfRegistrationProfilesResponse>
                transformer =
                        SearchSelfRegistrationProfilesConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchSelfRegistrationProfilesRequest,
                        SearchSelfRegistrationProfilesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchSelfRegistrationProfilesRequest,
                                SearchSelfRegistrationProfilesResponse>,
                        java.util.concurrent.Future<SearchSelfRegistrationProfilesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSelfRegistrationProfileSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchSelfRegistrationProfilesRequest, SearchSelfRegistrationProfilesResponse>(
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
    public java.util.concurrent.Future<SearchSettingsResponse> searchSettings(
            SearchSettingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchSettingsRequest, SearchSettingsResponse>
                    handler) {
        LOG.trace("Called async searchSettings");
        final SearchSettingsRequest interceptedRequest =
                SearchSettingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchSettingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Settings/SearchSettings");
        final java.util.function.Function<javax.ws.rs.core.Response, SearchSettingsResponse>
                transformer =
                        SearchSettingsConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<SearchSettingsRequest, SearchSettingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchSettingsRequest, SearchSettingsResponse>,
                        java.util.concurrent.Future<SearchSettingsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSettingsSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchSettingsRequest, SearchSettingsResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SmtpCredentials/SearchSmtpCredentials");
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
    public java.util.concurrent.Future<SearchSocialIdentityProvidersResponse>
            searchSocialIdentityProviders(
                    SearchSocialIdentityProvidersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchSocialIdentityProvidersRequest,
                                    SearchSocialIdentityProvidersResponse>
                            handler) {
        LOG.trace("Called async searchSocialIdentityProviders");
        final SearchSocialIdentityProvidersRequest interceptedRequest =
                SearchSocialIdentityProvidersConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchSocialIdentityProvidersConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchSocialIdentityProviders",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/SocialIdentityProviders/SearchSocialIdentityProviders");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchSocialIdentityProvidersResponse>
                transformer =
                        SearchSocialIdentityProvidersConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchSocialIdentityProvidersRequest, SearchSocialIdentityProvidersResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchSocialIdentityProvidersRequest,
                                SearchSocialIdentityProvidersResponse>,
                        java.util.concurrent.Future<SearchSocialIdentityProvidersResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getSocialIdentityProviderSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchSocialIdentityProvidersRequest, SearchSocialIdentityProvidersResponse>(
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
    public java.util.concurrent.Future<SearchUserAttributesSettingsResponse>
            searchUserAttributesSettings(
                    SearchUserAttributesSettingsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SearchUserAttributesSettingsRequest,
                                    SearchUserAttributesSettingsResponse>
                            handler) {
        LOG.trace("Called async searchUserAttributesSettings");
        final SearchUserAttributesSettingsRequest interceptedRequest =
                SearchUserAttributesSettingsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                SearchUserAttributesSettingsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "IdentityDomains",
                        "SearchUserAttributesSettings",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserAttributesSetting/SearchUserAttributesSettings");
        final java.util.function.Function<
                        javax.ws.rs.core.Response, SearchUserAttributesSettingsResponse>
                transformer =
                        SearchUserAttributesSettingsConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<
                        SearchUserAttributesSettingsRequest, SearchUserAttributesSettingsResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                SearchUserAttributesSettingsRequest,
                                SearchUserAttributesSettingsResponse>,
                        java.util.concurrent.Future<SearchUserAttributesSettingsResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUserAttributesSettingsSearchRequest(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    SearchUserAttributesSettingsRequest, SearchUserAttributesSettingsResponse>(
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
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/UserDbCredentials/SearchUserDbCredentials");
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
                        "IdentityDomains",
                        "SearchUsers",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/identity-domains/v1/Users/SearchUsers");
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
