/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.mysql.requests.*;
import com.oracle.bmc.mysql.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public class ChannelsClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements Channels {
    /** Service instance for Channels. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("CHANNELS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://mysql.{region}.ocp.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ChannelsClient.class);

    private final ChannelsWaiters waiters;

    private final ChannelsPaginators paginators;

    ChannelsClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        if (executorService == null) {
            // up to 50 (core) threads, time out after 60s idle, all daemon
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor =
                    new java.util.concurrent.ThreadPoolExecutor(
                            50,
                            50,
                            60L,
                            java.util.concurrent.TimeUnit.SECONDS,
                            new java.util.concurrent.LinkedBlockingQueue<Runnable>(),
                            com.oracle.bmc.internal.ClientThreadFactory.builder()
                                    .isDaemon(true)
                                    .nameFormat("Channels-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new ChannelsWaiters(executorService, this);

        this.paginators = new ChannelsPaginators(this);
    }

    /**
     * Create a builder for this client.
     *
     * @return builder
     */
    public static Builder builder() {
        return new Builder(SERVICE);
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be
     * passed to the {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ChannelsClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Set the ExecutorService for the client to be created.
         *
         * @param executorService executorService
         * @return this builder
         */
        public Builder executorService(java.util.concurrent.ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public ChannelsClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ChannelsClient(this, authenticationDetailsProvider, executorService);
        }
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        super.setRegion(region);
    }

    @Override
    public void setRegion(String regionId) {
        super.setRegion(regionId);
    }

    @Override
    public CreateChannelResponse createChannel(CreateChannelRequest request) {
        Objects.requireNonNull(
                request.getCreateChannelDetails(), "createChannelDetails is required");

        return clientCall(request, CreateChannelResponse::builder)
                .logger(LOG, "createChannel")
                .serviceDetails("Channels", "CreateChannel", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateChannelRequest::builder)
                .basePath("/20190415")
                .appendPathParam("channels")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mysql.model.Channel.class,
                        CreateChannelResponse.Builder::channel)
                .handleResponseHeaderString("etag", CreateChannelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateChannelResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateChannelResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteChannelResponse deleteChannel(DeleteChannelRequest request) {

        Validate.notBlank(request.getChannelId(), "channelId must not be blank");

        return clientCall(request, DeleteChannelResponse::builder)
                .logger(LOG, "deleteChannel")
                .serviceDetails(
                        "Channels",
                        "DeleteChannel",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/Channel/DeleteChannel")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteChannelRequest::builder)
                .basePath("/20190415")
                .appendPathParam("channels")
                .appendPathParam(request.getChannelId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteChannelResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteChannelResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetChannelResponse getChannel(GetChannelRequest request) {

        Validate.notBlank(request.getChannelId(), "channelId must not be blank");

        return clientCall(request, GetChannelResponse::builder)
                .logger(LOG, "getChannel")
                .serviceDetails(
                        "Channels",
                        "GetChannel",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/Channel/GetChannel")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetChannelRequest::builder)
                .basePath("/20190415")
                .appendPathParam("channels")
                .appendPathParam(request.getChannelId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .handleBody(
                        com.oracle.bmc.mysql.model.Channel.class,
                        GetChannelResponse.Builder::channel)
                .handleResponseHeaderString("etag", GetChannelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetChannelResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListChannelsResponse listChannels(ListChannelsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListChannelsResponse::builder)
                .logger(LOG, "listChannels")
                .serviceDetails(
                        "Channels",
                        "ListChannels",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/ChannelSummary/ListChannels")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListChannelsRequest::builder)
                .basePath("/20190415")
                .appendPathParam("channels")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("dbSystemId", request.getDbSystemId())
                .appendQueryParam("channelId", request.getChannelId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("isEnabled", request.getIsEnabled())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.mysql.model.ChannelSummary.class,
                        ListChannelsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListChannelsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListChannelsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ResetChannelResponse resetChannel(ResetChannelRequest request) {

        Validate.notBlank(request.getChannelId(), "channelId must not be blank");

        return clientCall(request, ResetChannelResponse::builder)
                .logger(LOG, "resetChannel")
                .serviceDetails(
                        "Channels",
                        "ResetChannel",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/Channel/ResetChannel")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ResetChannelRequest::builder)
                .basePath("/20190415")
                .appendPathParam("channels")
                .appendPathParam(request.getChannelId())
                .appendPathParam("actions")
                .appendPathParam("reset")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", ResetChannelResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", ResetChannelResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ResumeChannelResponse resumeChannel(ResumeChannelRequest request) {

        Validate.notBlank(request.getChannelId(), "channelId must not be blank");

        return clientCall(request, ResumeChannelResponse::builder)
                .logger(LOG, "resumeChannel")
                .serviceDetails(
                        "Channels",
                        "ResumeChannel",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/Channel/ResumeChannel")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ResumeChannelRequest::builder)
                .basePath("/20190415")
                .appendPathParam("channels")
                .appendPathParam(request.getChannelId())
                .appendPathParam("actions")
                .appendPathParam("resume")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", ResumeChannelResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", ResumeChannelResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateChannelResponse updateChannel(UpdateChannelRequest request) {

        Validate.notBlank(request.getChannelId(), "channelId must not be blank");
        Objects.requireNonNull(
                request.getUpdateChannelDetails(), "updateChannelDetails is required");

        return clientCall(request, UpdateChannelResponse::builder)
                .logger(LOG, "updateChannel")
                .serviceDetails(
                        "Channels",
                        "UpdateChannel",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/Channel/UpdateChannel")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateChannelRequest::builder)
                .basePath("/20190415")
                .appendPathParam("channels")
                .appendPathParam(request.getChannelId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateChannelResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateChannelResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChannelsWaiters getWaiters() {
        return waiters;
    }

    @Override
    public ChannelsPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ChannelsClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider, null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ChannelsClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider, null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ChannelsClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ChannelsClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ChannelsClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ChannelsClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link
     *     Builder#signingStrategyRequestSignerFactories}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ChannelsClient(
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
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link
     *     Builder#signingStrategyRequestSignerFactories}
     * @param executorService {@link Builder#executorService}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ChannelsClient(
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
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider,
                executorService);
    }
}
