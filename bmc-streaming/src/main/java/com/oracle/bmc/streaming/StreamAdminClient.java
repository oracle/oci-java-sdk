/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
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
public class StreamAdminClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements StreamAdmin {
    /** Service instance for StreamAdmin. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(StreamAdminClient.class.getName())
                    .serviceEndpointPrefix("streams")
                    .serviceEndpointTemplate("https://streaming.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(StreamAdminClient.class);

    private final StreamAdminWaiters waiters;

    private final StreamAdminPaginators paginators;

    StreamAdminClient(
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
                                    .nameFormat("StreamAdmin-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new StreamAdminWaiters(executorService, this);

        this.paginators = new StreamAdminPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, StreamAdminClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "streaming";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
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
        public StreamAdminClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new StreamAdminClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeConnectHarnessCompartmentResponse changeConnectHarnessCompartment(
            ChangeConnectHarnessCompartmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeConnectHarnessCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeStreamCompartmentResponse changeStreamCompartment(
            ChangeStreamCompartmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeStreamCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeStreamPoolCompartmentResponse changeStreamPoolCompartment(
            ChangeStreamPoolCompartmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeStreamPoolCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateConnectHarnessResponse createConnectHarness(CreateConnectHarnessRequest request) {
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.streaming.model.ConnectHarness.class,
                        CreateConnectHarnessResponse.Builder::connectHarness)
                .handleResponseHeaderString(
                        "opc-request-id", CreateConnectHarnessResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateConnectHarnessResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateStreamResponse createStream(CreateStreamRequest request) {
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.streaming.model.Stream.class,
                        CreateStreamResponse.Builder::stream)
                .handleResponseHeaderString(
                        "opc-request-id", CreateStreamResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateStreamResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateStreamPoolResponse createStreamPool(CreateStreamPoolRequest request) {
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.streaming.model.StreamPool.class,
                        CreateStreamPoolResponse.Builder::streamPool)
                .handleResponseHeaderString(
                        "opc-request-id", CreateStreamPoolResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateStreamPoolResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteConnectHarnessResponse deleteConnectHarness(DeleteConnectHarnessRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteConnectHarnessResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteStreamResponse deleteStream(DeleteStreamRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteStreamResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteStreamPoolResponse deleteStreamPool(DeleteStreamPoolRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteStreamPoolResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetConnectHarnessResponse getConnectHarness(GetConnectHarnessRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.streaming.model.ConnectHarness.class,
                        GetConnectHarnessResponse.Builder::connectHarness)
                .handleResponseHeaderString(
                        "opc-request-id", GetConnectHarnessResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetConnectHarnessResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetStreamResponse getStream(GetStreamRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.streaming.model.Stream.class,
                        GetStreamResponse.Builder::stream)
                .handleResponseHeaderString(
                        "opc-request-id", GetStreamResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetStreamResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetStreamPoolResponse getStreamPool(GetStreamPoolRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.streaming.model.StreamPool.class,
                        GetStreamPoolResponse.Builder::streamPool)
                .handleResponseHeaderString(
                        "opc-request-id", GetStreamPoolResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetStreamPoolResponse.Builder::etag)
                .callSync();
    }

    @Override
    public ListConnectHarnessesResponse listConnectHarnesses(ListConnectHarnessesRequest request) {
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
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.streaming.model.ConnectHarnessSummary.class,
                        ListConnectHarnessesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListConnectHarnessesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListConnectHarnessesResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListConnectHarnessesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListStreamPoolsResponse listStreamPools(ListStreamPoolsRequest request) {
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
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.streaming.model.StreamPoolSummary.class,
                        ListStreamPoolsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListStreamPoolsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListStreamPoolsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListStreamPoolsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListStreamsResponse listStreams(ListStreamsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.streaming.model.StreamSummary.class,
                        ListStreamsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListStreamsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListStreamsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListStreamsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateConnectHarnessResponse updateConnectHarness(UpdateConnectHarnessRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.streaming.model.ConnectHarness.class,
                        UpdateConnectHarnessResponse.Builder::connectHarness)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateConnectHarnessResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateConnectHarnessResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateStreamResponse updateStream(UpdateStreamRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.streaming.model.Stream.class,
                        UpdateStreamResponse.Builder::stream)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateStreamResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateStreamResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateStreamPoolResponse updateStreamPool(UpdateStreamPoolRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.streaming.model.StreamPool.class,
                        UpdateStreamPoolResponse.Builder::streamPool)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateStreamPoolResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateStreamPoolResponse.Builder::etag)
                .callSync();
    }

    @Override
    public StreamAdminWaiters getWaiters() {
        return waiters;
    }

    @Override
    public StreamAdminPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public StreamAdminClient(
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
    public StreamAdminClient(
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
    public StreamAdminClient(
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
    public StreamAdminClient(
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
    public StreamAdminClient(
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
    public StreamAdminClient(
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
    public StreamAdminClient(
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
    public StreamAdminClient(
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
