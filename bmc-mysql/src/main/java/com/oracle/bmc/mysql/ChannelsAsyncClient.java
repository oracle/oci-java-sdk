/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.mysql.requests.*;
import com.oracle.bmc.mysql.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Channels service. <br>
 * There are two ways to use async client: 1. Use AsyncHandler: using AsyncHandler, if the response
 * to the call is an {@link java.io.InputStream}, like getObject Api in object storage service,
 * developers need to process the stream in AsyncHandler, and not anywhere else, because the stream
 * will be closed right after the AsyncHandler is invoked. <br>
 * 2. Use Java Future: using Java Future, developers need to close the stream after they are done
 * with the Java Future.<br>
 * Accessing the result should be done in a mutually exclusive manner, either through the Future or
 * the AsyncHandler, but not both. If the Future is used, the caller should pass in null as the
 * AsyncHandler. If the AsyncHandler is used, it is still safe to use the Future to determine
 * whether or not the request was completed via Future.isDone/isCancelled.<br>
 * Please refer to
 * https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ResteasyClientWithObjectStorageExample.java
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public class ChannelsAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ChannelsAsync {
    /** Service instance for Channels. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("CHANNELS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://mysql.{region}.ocp.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ChannelsAsyncClient.class);

    private ChannelsAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(builder, authenticationDetailsProvider);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ChannelsAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public ChannelsAsyncClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ChannelsAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateChannelResponse> createChannel(
            CreateChannelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateChannelRequest, CreateChannelResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteChannelResponse> deleteChannel(
            DeleteChannelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteChannelRequest, DeleteChannelResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetChannelResponse> getChannel(
            GetChannelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetChannelRequest, GetChannelResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListChannelsResponse> listChannels(
            ListChannelsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListChannelsRequest, ListChannelsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ResetChannelResponse> resetChannel(
            ResetChannelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ResetChannelRequest, ResetChannelResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ResumeChannelResponse> resumeChannel(
            ResumeChannelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ResumeChannelRequest, ResumeChannelResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateChannelResponse> updateChannel(
            UpdateChannelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateChannelRequest, UpdateChannelResponse>
                    handler) {

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
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ChannelsAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ChannelsAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider);
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
    public ChannelsAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider);
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
    public ChannelsAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider);
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
    public ChannelsAsyncClient(
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
                authenticationDetailsProvider);
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
    public ChannelsAsyncClient(
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
                authenticationDetailsProvider);
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
    public ChannelsAsyncClient(
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
                authenticationDetailsProvider);
    }
}
