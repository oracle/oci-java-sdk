/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.streaming.requests.*;
import com.oracle.bmc.streaming.responses.*;

import java.util.Objects;

/**
 * Async client implementation for StreamAdmin service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
public class StreamAdminAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements StreamAdminAsync {
    /** Service instance for StreamAdmin. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("STREAMADMIN")
                    .serviceEndpointPrefix("streams")
                    .serviceEndpointTemplate("https://streaming.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(StreamAdminAsyncClient.class);

    private StreamAdminAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, StreamAdminAsyncClient> {
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
        public StreamAdminAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new StreamAdminAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeConnectHarnessCompartmentResponse>
            changeConnectHarnessCompartment(
                    ChangeConnectHarnessCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeConnectHarnessCompartmentRequest,
                                    ChangeConnectHarnessCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getConnectHarnessId(), "connectHarnessId must not be blank");
        Objects.requireNonNull(
                request.getChangeConnectHarnessCompartmentDetails(),
                "changeConnectHarnessCompartmentDetails is required");

        return clientCall(request, ChangeConnectHarnessCompartmentResponse::builder)
                .logger(LOG, "changeConnectHarnessCompartment")
                .serviceDetails(
                        "StreamAdmin",
                        "ChangeConnectHarnessCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/ConnectHarness/ChangeConnectHarnessCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeConnectHarnessCompartmentRequest::builder)
                .basePath("/20180418")
                .appendPathParam("connectharnesses")
                .appendPathParam(request.getConnectHarnessId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeConnectHarnessCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeStreamCompartmentResponse> changeStreamCompartment(
            ChangeStreamCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeStreamCompartmentRequest, ChangeStreamCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getStreamId(), "streamId must not be blank");
        Objects.requireNonNull(
                request.getChangeStreamCompartmentDetails(),
                "changeStreamCompartmentDetails is required");

        return clientCall(request, ChangeStreamCompartmentResponse::builder)
                .logger(LOG, "changeStreamCompartment")
                .serviceDetails(
                        "StreamAdmin",
                        "ChangeStreamCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/Stream/ChangeStreamCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeStreamCompartmentRequest::builder)
                .basePath("/20180418")
                .appendPathParam("streams")
                .appendPathParam(request.getStreamId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeStreamCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeStreamPoolCompartmentResponse>
            changeStreamPoolCompartment(
                    ChangeStreamPoolCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeStreamPoolCompartmentRequest,
                                    ChangeStreamPoolCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getStreamPoolId(), "streamPoolId must not be blank");
        Objects.requireNonNull(
                request.getChangeStreamPoolCompartmentDetails(),
                "changeStreamPoolCompartmentDetails is required");

        return clientCall(request, ChangeStreamPoolCompartmentResponse::builder)
                .logger(LOG, "changeStreamPoolCompartment")
                .serviceDetails(
                        "StreamAdmin",
                        "ChangeStreamPoolCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/StreamPool/ChangeStreamPoolCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeStreamPoolCompartmentRequest::builder)
                .basePath("/20180418")
                .appendPathParam("streampools")
                .appendPathParam(request.getStreamPoolId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeStreamPoolCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectHarnessResponse> createConnectHarness(
            CreateConnectHarnessRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateConnectHarnessRequest, CreateConnectHarnessResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateConnectHarnessDetails(),
                "createConnectHarnessDetails is required");

        return clientCall(request, CreateConnectHarnessResponse::builder)
                .logger(LOG, "createConnectHarness")
                .serviceDetails(
                        "StreamAdmin",
                        "CreateConnectHarness",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/ConnectHarness/CreateConnectHarness")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateConnectHarnessRequest::builder)
                .basePath("/20180418")
                .appendPathParam("connectharnesses")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.streaming.model.ConnectHarness.class,
                        CreateConnectHarnessResponse.Builder::connectHarness)
                .handleResponseHeaderString(
                        "opc-request-id", CreateConnectHarnessResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateConnectHarnessResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamResponse> createStream(
            CreateStreamRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateStreamRequest, CreateStreamResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateStreamDetails(), "createStreamDetails is required");

        return clientCall(request, CreateStreamResponse::builder)
                .logger(LOG, "createStream")
                .serviceDetails(
                        "StreamAdmin",
                        "CreateStream",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/Stream/CreateStream")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateStreamRequest::builder)
                .basePath("/20180418")
                .appendPathParam("streams")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.streaming.model.Stream.class,
                        CreateStreamResponse.Builder::stream)
                .handleResponseHeaderString(
                        "opc-request-id", CreateStreamResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateStreamResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamPoolResponse> createStreamPool(
            CreateStreamPoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateStreamPoolRequest, CreateStreamPoolResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateStreamPoolDetails(), "createStreamPoolDetails is required");

        return clientCall(request, CreateStreamPoolResponse::builder)
                .logger(LOG, "createStreamPool")
                .serviceDetails(
                        "StreamAdmin",
                        "CreateStreamPool",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/StreamPool/CreateStreamPool")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateStreamPoolRequest::builder)
                .basePath("/20180418")
                .appendPathParam("streampools")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.streaming.model.StreamPool.class,
                        CreateStreamPoolResponse.Builder::streamPool)
                .handleResponseHeaderString(
                        "opc-request-id", CreateStreamPoolResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateStreamPoolResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectHarnessResponse> deleteConnectHarness(
            DeleteConnectHarnessRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteConnectHarnessRequest, DeleteConnectHarnessResponse>
                    handler) {

        Validate.notBlank(request.getConnectHarnessId(), "connectHarnessId must not be blank");

        return clientCall(request, DeleteConnectHarnessResponse::builder)
                .logger(LOG, "deleteConnectHarness")
                .serviceDetails(
                        "StreamAdmin",
                        "DeleteConnectHarness",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/ConnectHarness/DeleteConnectHarness")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteConnectHarnessRequest::builder)
                .basePath("/20180418")
                .appendPathParam("connectharnesses")
                .appendPathParam(request.getConnectHarnessId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteConnectHarnessResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamResponse> deleteStream(
            DeleteStreamRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteStreamRequest, DeleteStreamResponse>
                    handler) {

        Validate.notBlank(request.getStreamId(), "streamId must not be blank");

        return clientCall(request, DeleteStreamResponse::builder)
                .logger(LOG, "deleteStream")
                .serviceDetails(
                        "StreamAdmin",
                        "DeleteStream",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/Stream/DeleteStream")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteStreamRequest::builder)
                .basePath("/20180418")
                .appendPathParam("streams")
                .appendPathParam(request.getStreamId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteStreamResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamPoolResponse> deleteStreamPool(
            DeleteStreamPoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteStreamPoolRequest, DeleteStreamPoolResponse>
                    handler) {

        Validate.notBlank(request.getStreamPoolId(), "streamPoolId must not be blank");

        return clientCall(request, DeleteStreamPoolResponse::builder)
                .logger(LOG, "deleteStreamPool")
                .serviceDetails(
                        "StreamAdmin",
                        "DeleteStreamPool",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/StreamPool/DeleteStreamPool")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteStreamPoolRequest::builder)
                .basePath("/20180418")
                .appendPathParam("streampools")
                .appendPathParam(request.getStreamPoolId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteStreamPoolResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetConnectHarnessResponse> getConnectHarness(
            GetConnectHarnessRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetConnectHarnessRequest, GetConnectHarnessResponse>
                    handler) {

        Validate.notBlank(request.getConnectHarnessId(), "connectHarnessId must not be blank");

        return clientCall(request, GetConnectHarnessResponse::builder)
                .logger(LOG, "getConnectHarness")
                .serviceDetails(
                        "StreamAdmin",
                        "GetConnectHarness",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/ConnectHarness/GetConnectHarness")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConnectHarnessRequest::builder)
                .basePath("/20180418")
                .appendPathParam("connectharnesses")
                .appendPathParam(request.getConnectHarnessId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.streaming.model.ConnectHarness.class,
                        GetConnectHarnessResponse.Builder::connectHarness)
                .handleResponseHeaderString(
                        "opc-request-id", GetConnectHarnessResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetConnectHarnessResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetStreamResponse> getStream(
            GetStreamRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetStreamRequest, GetStreamResponse>
                    handler) {

        Validate.notBlank(request.getStreamId(), "streamId must not be blank");

        return clientCall(request, GetStreamResponse::builder)
                .logger(LOG, "getStream")
                .serviceDetails(
                        "StreamAdmin",
                        "GetStream",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/Stream/GetStream")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetStreamRequest::builder)
                .basePath("/20180418")
                .appendPathParam("streams")
                .appendPathParam(request.getStreamId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.streaming.model.Stream.class,
                        GetStreamResponse.Builder::stream)
                .handleResponseHeaderString(
                        "opc-request-id", GetStreamResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetStreamResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetStreamPoolResponse> getStreamPool(
            GetStreamPoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetStreamPoolRequest, GetStreamPoolResponse>
                    handler) {

        Validate.notBlank(request.getStreamPoolId(), "streamPoolId must not be blank");

        return clientCall(request, GetStreamPoolResponse::builder)
                .logger(LOG, "getStreamPool")
                .serviceDetails(
                        "StreamAdmin",
                        "GetStreamPool",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/StreamPool/GetStreamPool")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetStreamPoolRequest::builder)
                .basePath("/20180418")
                .appendPathParam("streampools")
                .appendPathParam(request.getStreamPoolId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.streaming.model.StreamPool.class,
                        GetStreamPoolResponse.Builder::streamPool)
                .handleResponseHeaderString(
                        "opc-request-id", GetStreamPoolResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetStreamPoolResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListConnectHarnessesResponse> listConnectHarnesses(
            ListConnectHarnessesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListConnectHarnessesRequest, ListConnectHarnessesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListConnectHarnessesResponse::builder)
                .logger(LOG, "listConnectHarnesses")
                .serviceDetails(
                        "StreamAdmin",
                        "ListConnectHarnesses",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/ConnectHarnessSummary/ListConnectHarnesses")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListConnectHarnessesRequest::builder)
                .basePath("/20180418")
                .appendPathParam("connectharnesses")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.streaming.model.ConnectHarnessSummary.class,
                        ListConnectHarnessesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListConnectHarnessesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListConnectHarnessesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListConnectHarnessesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListStreamPoolsResponse> listStreamPools(
            ListStreamPoolsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListStreamPoolsRequest, ListStreamPoolsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListStreamPoolsResponse::builder)
                .logger(LOG, "listStreamPools")
                .serviceDetails(
                        "StreamAdmin",
                        "ListStreamPools",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/StreamPoolSummary/ListStreamPools")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListStreamPoolsRequest::builder)
                .basePath("/20180418")
                .appendPathParam("streampools")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.streaming.model.StreamPoolSummary.class,
                        ListStreamPoolsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListStreamPoolsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListStreamPoolsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListStreamPoolsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListStreamsResponse> listStreams(
            ListStreamsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListStreamsRequest, ListStreamsResponse>
                    handler) {

        return clientCall(request, ListStreamsResponse::builder)
                .logger(LOG, "listStreams")
                .serviceDetails(
                        "StreamAdmin",
                        "ListStreams",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/StreamSummary/ListStreams")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListStreamsRequest::builder)
                .basePath("/20180418")
                .appendPathParam("streams")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("streamPoolId", request.getStreamPoolId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.streaming.model.StreamSummary.class,
                        ListStreamsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListStreamsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListStreamsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListStreamsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectHarnessResponse> updateConnectHarness(
            UpdateConnectHarnessRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateConnectHarnessRequest, UpdateConnectHarnessResponse>
                    handler) {

        Validate.notBlank(request.getConnectHarnessId(), "connectHarnessId must not be blank");
        Objects.requireNonNull(
                request.getUpdateConnectHarnessDetails(),
                "updateConnectHarnessDetails is required");

        return clientCall(request, UpdateConnectHarnessResponse::builder)
                .logger(LOG, "updateConnectHarness")
                .serviceDetails(
                        "StreamAdmin",
                        "UpdateConnectHarness",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/ConnectHarness/UpdateConnectHarness")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateConnectHarnessRequest::builder)
                .basePath("/20180418")
                .appendPathParam("connectharnesses")
                .appendPathParam(request.getConnectHarnessId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.streaming.model.ConnectHarness.class,
                        UpdateConnectHarnessResponse.Builder::connectHarness)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateConnectHarnessResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateConnectHarnessResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateStreamResponse> updateStream(
            UpdateStreamRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateStreamRequest, UpdateStreamResponse>
                    handler) {

        Validate.notBlank(request.getStreamId(), "streamId must not be blank");
        Objects.requireNonNull(request.getUpdateStreamDetails(), "updateStreamDetails is required");

        return clientCall(request, UpdateStreamResponse::builder)
                .logger(LOG, "updateStream")
                .serviceDetails(
                        "StreamAdmin",
                        "UpdateStream",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/Stream/UpdateStream")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateStreamRequest::builder)
                .basePath("/20180418")
                .appendPathParam("streams")
                .appendPathParam(request.getStreamId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.streaming.model.Stream.class,
                        UpdateStreamResponse.Builder::stream)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateStreamResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateStreamResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateStreamPoolResponse> updateStreamPool(
            UpdateStreamPoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateStreamPoolRequest, UpdateStreamPoolResponse>
                    handler) {

        Validate.notBlank(request.getStreamPoolId(), "streamPoolId must not be blank");
        Objects.requireNonNull(
                request.getUpdateStreamPoolDetails(), "updateStreamPoolDetails is required");

        return clientCall(request, UpdateStreamPoolResponse::builder)
                .logger(LOG, "updateStreamPool")
                .serviceDetails(
                        "StreamAdmin",
                        "UpdateStreamPool",
                        "https://docs.oracle.com/iaas/api/#/en/streaming/20180418/StreamPool/UpdateStreamPool")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateStreamPoolRequest::builder)
                .basePath("/20180418")
                .appendPathParam("streampools")
                .appendPathParam(request.getStreamPoolId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.streaming.model.StreamPool.class,
                        UpdateStreamPoolResponse.Builder::streamPool)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateStreamPoolResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateStreamPoolResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public StreamAdminAsyncClient(
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
    public StreamAdminAsyncClient(
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
    public StreamAdminAsyncClient(
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
    public StreamAdminAsyncClient(
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
    public StreamAdminAsyncClient(
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
    public StreamAdminAsyncClient(
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
    public StreamAdminAsyncClient(
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
