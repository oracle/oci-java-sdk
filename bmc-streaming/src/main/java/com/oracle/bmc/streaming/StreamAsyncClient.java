/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming;

import com.oracle.bmc.streaming.internal.http.*;
import com.oracle.bmc.streaming.requests.*;
import com.oracle.bmc.streaming.responses.*;

/**
 * Async client implementation for Stream service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
public class StreamAsyncClient implements StreamAsync {
    /**
     * Service instance for Stream.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("STREAM")
                    .serviceEndpointPrefix("streams")
                    .serviceEndpointTemplate("https://streaming.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(StreamAsyncClient.class);

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
    public StreamAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public StreamAsyncClient(
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
    public StreamAsyncClient(
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
    public StreamAsyncClient(
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
    public StreamAsyncClient(
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
    public StreamAsyncClient(
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
    public StreamAsyncClient(
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
    public StreamAsyncClient(
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
    public static com.oracle.bmc.streaming.StreamAsyncClientBuilder builder() {
        return new com.oracle.bmc.streaming.StreamAsyncClientBuilder(SERVICE);
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
    public java.util.concurrent.Future<ConsumerCommitResponse> consumerCommit(
            ConsumerCommitRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ConsumerCommitRequest, ConsumerCommitResponse>
                    handler) {
        LOG.trace("Called async consumerCommit");
        final ConsumerCommitRequest interceptedRequest =
                ConsumerCommitConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ConsumerCommitConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Stream",
                        "ConsumerCommit",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/Group/ConsumerCommit");
        final java.util.function.Function<javax.ws.rs.core.Response, ConsumerCommitResponse>
                transformer =
                        ConsumerCommitConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ConsumerCommitRequest, ConsumerCommitResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ConsumerCommitRequest, ConsumerCommitResponse>,
                        java.util.concurrent.Future<ConsumerCommitResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ConsumerCommitRequest, ConsumerCommitResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ConsumerHeartbeatResponse> consumerHeartbeat(
            ConsumerHeartbeatRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ConsumerHeartbeatRequest, ConsumerHeartbeatResponse>
                    handler) {
        LOG.trace("Called async consumerHeartbeat");
        final ConsumerHeartbeatRequest interceptedRequest =
                ConsumerHeartbeatConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ConsumerHeartbeatConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Stream",
                        "ConsumerHeartbeat",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/Group/ConsumerHeartbeat");
        final java.util.function.Function<javax.ws.rs.core.Response, ConsumerHeartbeatResponse>
                transformer =
                        ConsumerHeartbeatConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<ConsumerHeartbeatRequest, ConsumerHeartbeatResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                ConsumerHeartbeatRequest, ConsumerHeartbeatResponse>,
                        java.util.concurrent.Future<ConsumerHeartbeatResponse>>
                futureSupplier = client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    ConsumerHeartbeatRequest, ConsumerHeartbeatResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateCursorResponse> createCursor(
            CreateCursorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateCursorRequest, CreateCursorResponse>
                    handler) {
        LOG.trace("Called async createCursor");
        final CreateCursorRequest interceptedRequest =
                CreateCursorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateCursorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Stream",
                        "CreateCursor",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/Cursor/CreateCursor");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateCursorResponse>
                transformer =
                        CreateCursorConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateCursorRequest, CreateCursorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateCursorRequest, CreateCursorResponse>,
                        java.util.concurrent.Future<CreateCursorResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateCursorDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateCursorRequest, CreateCursorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateGroupCursorResponse> createGroupCursor(
            CreateGroupCursorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateGroupCursorRequest, CreateGroupCursorResponse>
                    handler) {
        LOG.trace("Called async createGroupCursor");
        final CreateGroupCursorRequest interceptedRequest =
                CreateGroupCursorConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateGroupCursorConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Stream",
                        "CreateGroupCursor",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/Cursor/CreateGroupCursor");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateGroupCursorResponse>
                transformer =
                        CreateGroupCursorConverter.fromResponse(
                                java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<CreateGroupCursorRequest, CreateGroupCursorResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                CreateGroupCursorRequest, CreateGroupCursorResponse>,
                        java.util.concurrent.Future<CreateGroupCursorResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getCreateGroupCursorDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    CreateGroupCursorRequest, CreateGroupCursorResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
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
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Stream",
                        "GetGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/Group/GetGroup");
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
    public java.util.concurrent.Future<GetMessagesResponse> getMessages(
            GetMessagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetMessagesRequest, GetMessagesResponse>
                    handler) {
        LOG.trace("Called async getMessages");
        final GetMessagesRequest interceptedRequest =
                GetMessagesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetMessagesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Stream",
                        "GetMessages",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/Message/GetMessages");
        final java.util.function.Function<javax.ws.rs.core.Response, GetMessagesResponse>
                transformer =
                        GetMessagesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<GetMessagesRequest, GetMessagesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                GetMessagesRequest, GetMessagesResponse>,
                        java.util.concurrent.Future<GetMessagesResponse>>
                futureSupplier = client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    GetMessagesRequest, GetMessagesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PutMessagesResponse> putMessages(
            PutMessagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PutMessagesRequest, PutMessagesResponse>
                    handler) {
        LOG.trace("Called async putMessages");
        final PutMessagesRequest interceptedRequest =
                PutMessagesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutMessagesConverter.fromRequest(client, interceptedRequest);

        ib.property(
                com.oracle.bmc.http.internal.AuthnClientFilter.SIGNING_STRATEGY_PROPERTY_NAME,
                com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Stream",
                        "PutMessages",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/Message/PutMessages");
        final java.util.function.Function<javax.ws.rs.core.Response, PutMessagesResponse>
                transformer =
                        PutMessagesConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<PutMessagesRequest, PutMessagesResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                PutMessagesRequest, PutMessagesResponse>,
                        java.util.concurrent.Future<PutMessagesResponse>>
                futureSupplier =
                        client.postFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getPutMessagesDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    PutMessagesRequest, PutMessagesResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
                    handlerToUse,
                    futureSupplier) {
                @Override
                protected void beforeRetryAction() {}
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupResponse> updateGroup(
            UpdateGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateGroupRequest, UpdateGroupResponse>
                    handler) {
        LOG.trace("Called async updateGroup");
        final UpdateGroupRequest interceptedRequest =
                UpdateGroupConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateGroupConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails =
                new com.oracle.bmc.ServiceDetails(
                        "Stream",
                        "UpdateGroup",
                        ib.getRequestUri().toString(),
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/Group/UpdateGroup");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateGroupResponse>
                transformer =
                        UpdateGroupConverter.fromResponse(java.util.Optional.of(serviceDetails));
        com.oracle.bmc.responses.AsyncHandler<UpdateGroupRequest, UpdateGroupResponse>
                handlerToUse = handler;

        java.util.function.Function<
                        com.oracle.bmc.responses.AsyncHandler<
                                UpdateGroupRequest, UpdateGroupResponse>,
                        java.util.concurrent.Future<UpdateGroupResponse>>
                futureSupplier =
                        client.putFutureSupplier(
                                interceptedRequest,
                                interceptedRequest.getUpdateGroupDetails(),
                                ib,
                                transformer);

        if (this.authenticationDetailsProvider
                instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<
                    UpdateGroupRequest, UpdateGroupResponse>(
                    (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider)
                            this.authenticationDetailsProvider,
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
