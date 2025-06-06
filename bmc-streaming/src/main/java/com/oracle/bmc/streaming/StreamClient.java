/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.streaming.requests.*;
import com.oracle.bmc.streaming.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
public class StreamClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Stream {
    /** Service instance for Stream. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("STREAM")
                    .serviceEndpointPrefix("streams")
                    .serviceEndpointTemplate("https://streaming.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(StreamClient.class);

    StreamClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(builder, authenticationDetailsProvider, null);
    }

    /**
     * Create a builder for this client.
     *
     * @return builder
     */
    public static com.oracle.bmc.streaming.StreamClientBuilder builder() {
        return new com.oracle.bmc.streaming.StreamClientBuilder(SERVICE);
    }

    @Override
    public ConsumerCommitResponse consumerCommit(ConsumerCommitRequest request) {

        Validate.notBlank(request.getStreamId(), "streamId must not be blank");
        Objects.requireNonNull(request.getCursor(), "cursor is required");

        return clientCall(request, ConsumerCommitResponse::builder)
                .logger(LOG, "consumerCommit")
                .serviceDetails(
                        "Stream",
                        "ConsumerCommit",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/Group/ConsumerCommit")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConsumerCommitRequest::builder)
                .basePath("/20180418")
                .appendPathParam("streams")
                .appendPathParam(request.getStreamId())
                .appendPathParam("commit")
                .appendQueryParam("cursor", request.getCursor())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.streaming.model.Cursor.class,
                        ConsumerCommitResponse.Builder::cursor)
                .handleResponseHeaderString(
                        "opc-request-id", ConsumerCommitResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ConsumerHeartbeatResponse consumerHeartbeat(ConsumerHeartbeatRequest request) {

        Validate.notBlank(request.getStreamId(), "streamId must not be blank");
        Objects.requireNonNull(request.getCursor(), "cursor is required");

        return clientCall(request, ConsumerHeartbeatResponse::builder)
                .logger(LOG, "consumerHeartbeat")
                .serviceDetails(
                        "Stream",
                        "ConsumerHeartbeat",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/Group/ConsumerHeartbeat")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConsumerHeartbeatRequest::builder)
                .basePath("/20180418")
                .appendPathParam("streams")
                .appendPathParam(request.getStreamId())
                .appendPathParam("heartbeat")
                .appendQueryParam("cursor", request.getCursor())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.streaming.model.Cursor.class,
                        ConsumerHeartbeatResponse.Builder::cursor)
                .handleResponseHeaderString(
                        "opc-request-id", ConsumerHeartbeatResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateCursorResponse createCursor(CreateCursorRequest request) {

        Validate.notBlank(request.getStreamId(), "streamId must not be blank");
        Objects.requireNonNull(request.getCreateCursorDetails(), "createCursorDetails is required");

        return clientCall(request, CreateCursorResponse::builder)
                .logger(LOG, "createCursor")
                .serviceDetails(
                        "Stream",
                        "CreateCursor",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/Cursor/CreateCursor")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCursorRequest::builder)
                .basePath("/20180418")
                .appendPathParam("streams")
                .appendPathParam(request.getStreamId())
                .appendPathParam("cursors")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.streaming.model.Cursor.class,
                        CreateCursorResponse.Builder::cursor)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCursorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateGroupCursorResponse createGroupCursor(CreateGroupCursorRequest request) {

        Validate.notBlank(request.getStreamId(), "streamId must not be blank");
        Objects.requireNonNull(
                request.getCreateGroupCursorDetails(), "createGroupCursorDetails is required");

        return clientCall(request, CreateGroupCursorResponse::builder)
                .logger(LOG, "createGroupCursor")
                .serviceDetails(
                        "Stream",
                        "CreateGroupCursor",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/Cursor/CreateGroupCursor")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateGroupCursorRequest::builder)
                .basePath("/20180418")
                .appendPathParam("streams")
                .appendPathParam(request.getStreamId())
                .appendPathParam("groupCursors")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.streaming.model.Cursor.class,
                        CreateGroupCursorResponse.Builder::cursor)
                .handleResponseHeaderString(
                        "opc-request-id", CreateGroupCursorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetGroupResponse getGroup(GetGroupRequest request) {

        Validate.notBlank(request.getStreamId(), "streamId must not be blank");

        Validate.notBlank(request.getGroupName(), "groupName must not be blank");

        return clientCall(request, GetGroupResponse::builder)
                .logger(LOG, "getGroup")
                .serviceDetails(
                        "Stream",
                        "GetGroup",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/Group/GetGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGroupRequest::builder)
                .basePath("/20180418")
                .appendPathParam("streams")
                .appendPathParam(request.getStreamId())
                .appendPathParam("groups")
                .appendPathParam(request.getGroupName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.streaming.model.Group.class, GetGroupResponse.Builder::group)
                .handleResponseHeaderString(
                        "opc-request-id", GetGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMessagesResponse getMessages(GetMessagesRequest request) {

        Validate.notBlank(request.getStreamId(), "streamId must not be blank");
        Objects.requireNonNull(request.getCursor(), "cursor is required");

        return clientCall(request, GetMessagesResponse::builder)
                .logger(LOG, "getMessages")
                .serviceDetails(
                        "Stream",
                        "GetMessages",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/Message/GetMessages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMessagesRequest::builder)
                .basePath("/20180418")
                .appendPathParam("streams")
                .appendPathParam(request.getStreamId())
                .appendPathParam("messages")
                .appendQueryParam("cursor", request.getCursor())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.streaming.model.Message.class,
                        GetMessagesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-cursor", GetMessagesResponse.Builder::opcNextCursor)
                .handleResponseHeaderString(
                        "opc-request-id", GetMessagesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public PutMessagesResponse putMessages(PutMessagesRequest request) {

        Validate.notBlank(request.getStreamId(), "streamId must not be blank");
        Objects.requireNonNull(request.getPutMessagesDetails(), "putMessagesDetails is required");

        return clientCall(request, PutMessagesResponse::builder)
                .logger(LOG, "putMessages")
                .serviceDetails(
                        "Stream",
                        "PutMessages",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/Message/PutMessages")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PutMessagesRequest::builder)
                .obmcsSigningStrategy(com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY)
                .basePath("/20180418")
                .appendPathParam("streams")
                .appendPathParam(request.getStreamId())
                .appendPathParam("messages")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.streaming.model.PutMessagesResult.class,
                        PutMessagesResponse.Builder::putMessagesResult)
                .handleResponseHeaderString(
                        "opc-request-id", PutMessagesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateGroupResponse updateGroup(UpdateGroupRequest request) {

        Validate.notBlank(request.getStreamId(), "streamId must not be blank");

        Validate.notBlank(request.getGroupName(), "groupName must not be blank");
        Objects.requireNonNull(request.getUpdateGroupDetails(), "updateGroupDetails is required");

        return clientCall(request, UpdateGroupResponse::builder)
                .logger(LOG, "updateGroup")
                .serviceDetails(
                        "Stream",
                        "UpdateGroup",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/Group/UpdateGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateGroupRequest::builder)
                .basePath("/20180418")
                .appendPathParam("streams")
                .appendPathParam(request.getStreamId())
                .appendPathParam("groups")
                .appendPathParam(request.getGroupName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public StreamClient(
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
    public StreamClient(
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
    public StreamClient(
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
    public StreamClient(
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
    public StreamClient(
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
    public StreamClient(
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
    public StreamClient(
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
