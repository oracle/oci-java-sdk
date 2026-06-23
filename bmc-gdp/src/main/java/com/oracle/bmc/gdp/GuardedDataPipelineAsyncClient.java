/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.gdp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.gdp.requests.*;
import com.oracle.bmc.gdp.responses.*;

import java.util.Objects;

/**
 * Async client implementation for GuardedDataPipeline service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230301")
public class GuardedDataPipelineAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements GuardedDataPipelineAsync {
    /** Service instance for GuardedDataPipeline. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(GuardedDataPipelineClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://gdp.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GuardedDataPipelineAsyncClient.class);

    GuardedDataPipelineAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, GuardedDataPipelineAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "gdp";
            com.oracle.bmc.internal.DeveloperToolConfiguration
                    .throwDisabledServiceExceptionIfAppropriate(packageName);
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
        public GuardedDataPipelineAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new GuardedDataPipelineAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeGdpPipelineCompartmentResponse>
            changeGdpPipelineCompartment(
                    ChangeGdpPipelineCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeGdpPipelineCompartmentRequest,
                                    ChangeGdpPipelineCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getGdpPipelineId(), "gdpPipelineId must not be blank");
        Objects.requireNonNull(
                request.getChangeGdpPipelineCompartmentDetails(),
                "changeGdpPipelineCompartmentDetails is required");

        return clientCall(request, ChangeGdpPipelineCompartmentResponse::builder)
                .logger(LOG, "changeGdpPipelineCompartment")
                .serviceDetails("GuardedDataPipeline", "ChangeGdpPipelineCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeGdpPipelineCompartmentRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpPipelines")
                .appendPathParam(request.getGdpPipelineId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeGdpPipelineCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeGdpPipelineCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateGdpPipelineResponse> createGdpPipeline(
            CreateGdpPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateGdpPipelineRequest, CreateGdpPipelineResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateGdpPipelineDetails(), "createGdpPipelineDetails is required");

        return clientCall(request, CreateGdpPipelineResponse::builder)
                .logger(LOG, "createGdpPipeline")
                .serviceDetails("GuardedDataPipeline", "CreateGdpPipeline", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateGdpPipelineRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpPipelines")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateGdpPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateGdpPipelineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteGdpPipelineResponse> deleteGdpPipeline(
            DeleteGdpPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteGdpPipelineRequest, DeleteGdpPipelineResponse>
                    handler) {

        Validate.notBlank(request.getGdpPipelineId(), "gdpPipelineId must not be blank");

        return clientCall(request, DeleteGdpPipelineResponse::builder)
                .logger(LOG, "deleteGdpPipeline")
                .serviceDetails("GuardedDataPipeline", "DeleteGdpPipeline", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteGdpPipelineRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpPipelines")
                .appendPathParam(request.getGdpPipelineId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteGdpPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteGdpPipelineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetGdpPipelineResponse> getGdpPipeline(
            GetGdpPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetGdpPipelineRequest, GetGdpPipelineResponse>
                    handler) {

        Validate.notBlank(request.getGdpPipelineId(), "gdpPipelineId must not be blank");

        return clientCall(request, GetGdpPipelineResponse::builder)
                .logger(LOG, "getGdpPipeline")
                .serviceDetails("GuardedDataPipeline", "GetGdpPipeline", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGdpPipelineRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpPipelines")
                .appendPathParam(request.getGdpPipelineId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.gdp.model.GdpPipeline.class,
                        GetGdpPipelineResponse.Builder::gdpPipeline)
                .handleResponseHeaderString("etag", GetGdpPipelineResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetGdpPipelineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetGdpWorkRequestResponse> getGdpWorkRequest(
            GetGdpWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetGdpWorkRequestRequest, GetGdpWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetGdpWorkRequestResponse::builder)
                .logger(LOG, "getGdpWorkRequest")
                .serviceDetails("GuardedDataPipeline", "GetGdpWorkRequest", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGdpWorkRequestRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.gdp.model.GdpWorkRequest.class,
                        GetGdpWorkRequestResponse.Builder::gdpWorkRequest)
                .handleResponseHeaderString("etag", GetGdpWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetGdpWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetGdpWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListGdpPipelinesResponse> listGdpPipelines(
            ListGdpPipelinesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListGdpPipelinesRequest, ListGdpPipelinesResponse>
                    handler) {

        return clientCall(request, ListGdpPipelinesResponse::builder)
                .logger(LOG, "listGdpPipelines")
                .serviceDetails("GuardedDataPipeline", "ListGdpPipelines", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGdpPipelinesRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpPipelines")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("gdpPipelineId", request.getGdpPipelineId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.gdp.model.GdpPipelineCollection.class,
                        ListGdpPipelinesResponse.Builder::gdpPipelineCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListGdpPipelinesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListGdpPipelinesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListGdpWorkRequestErrorsResponse> listGdpWorkRequestErrors(
            ListGdpWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListGdpWorkRequestErrorsRequest, ListGdpWorkRequestErrorsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListGdpWorkRequestErrorsResponse::builder)
                .logger(LOG, "listGdpWorkRequestErrors")
                .serviceDetails("GuardedDataPipeline", "ListGdpWorkRequestErrors", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGdpWorkRequestErrorsRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.gdp.model.WorkRequestErrorCollection.class,
                        ListGdpWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListGdpWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListGdpWorkRequestErrorsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListGdpWorkRequestLogsResponse> listGdpWorkRequestLogs(
            ListGdpWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListGdpWorkRequestLogsRequest, ListGdpWorkRequestLogsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListGdpWorkRequestLogsResponse::builder)
                .logger(LOG, "listGdpWorkRequestLogs")
                .serviceDetails("GuardedDataPipeline", "ListGdpWorkRequestLogs", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGdpWorkRequestLogsRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.gdp.model.WorkRequestLogEntryCollection.class,
                        ListGdpWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListGdpWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListGdpWorkRequestLogsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListGdpWorkRequestsResponse> listGdpWorkRequests(
            ListGdpWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListGdpWorkRequestsRequest, ListGdpWorkRequestsResponse>
                    handler) {

        return clientCall(request, ListGdpWorkRequestsResponse::builder)
                .logger(LOG, "listGdpWorkRequests")
                .serviceDetails("GuardedDataPipeline", "ListGdpWorkRequests", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGdpWorkRequestsRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpWorkRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.gdp.model.GdpWorkRequestSummaryCollection.class,
                        ListGdpWorkRequestsResponse.Builder::gdpWorkRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListGdpWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListGdpWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PeerGdpPipelineResponse> peerGdpPipeline(
            PeerGdpPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PeerGdpPipelineRequest, PeerGdpPipelineResponse>
                    handler) {
        Objects.requireNonNull(
                request.getPeerGdpPipelineDetails(), "peerGdpPipelineDetails is required");

        Validate.notBlank(request.getGdpPipelineId(), "gdpPipelineId must not be blank");

        return clientCall(request, PeerGdpPipelineResponse::builder)
                .logger(LOG, "peerGdpPipeline")
                .serviceDetails("GuardedDataPipeline", "PeerGdpPipeline", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PeerGdpPipelineRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpPipelines")
                .appendPathParam(request.getGdpPipelineId())
                .appendPathParam("actions")
                .appendPathParam("peer")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", PeerGdpPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PeerGdpPipelineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RotateGdpPipelineKeysResponse> rotateGdpPipelineKeys(
            RotateGdpPipelineKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RotateGdpPipelineKeysRequest, RotateGdpPipelineKeysResponse>
                    handler) {

        Validate.notBlank(request.getGdpPipelineId(), "gdpPipelineId must not be blank");

        return clientCall(request, RotateGdpPipelineKeysResponse::builder)
                .logger(LOG, "rotateGdpPipelineKeys")
                .serviceDetails("GuardedDataPipeline", "RotateGdpPipelineKeys", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotateGdpPipelineKeysRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpPipelines")
                .appendPathParam(request.getGdpPipelineId())
                .appendPathParam("actions")
                .appendPathParam("rotateKeys")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RotateGdpPipelineKeysResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RotateGdpPipelineKeysResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartGdpPipelineResponse> startGdpPipeline(
            StartGdpPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartGdpPipelineRequest, StartGdpPipelineResponse>
                    handler) {

        Validate.notBlank(request.getGdpPipelineId(), "gdpPipelineId must not be blank");

        return clientCall(request, StartGdpPipelineResponse::builder)
                .logger(LOG, "startGdpPipeline")
                .serviceDetails("GuardedDataPipeline", "StartGdpPipeline", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartGdpPipelineRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpPipelines")
                .appendPathParam(request.getGdpPipelineId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", StartGdpPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartGdpPipelineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopGdpPipelineResponse> stopGdpPipeline(
            StopGdpPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopGdpPipelineRequest, StopGdpPipelineResponse>
                    handler) {

        Validate.notBlank(request.getGdpPipelineId(), "gdpPipelineId must not be blank");

        return clientCall(request, StopGdpPipelineResponse::builder)
                .logger(LOG, "stopGdpPipeline")
                .serviceDetails("GuardedDataPipeline", "StopGdpPipeline", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopGdpPipelineRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpPipelines")
                .appendPathParam(request.getGdpPipelineId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", StopGdpPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StopGdpPipelineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateGdpPipelineResponse> updateGdpPipeline(
            UpdateGdpPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateGdpPipelineRequest, UpdateGdpPipelineResponse>
                    handler) {

        Validate.notBlank(request.getGdpPipelineId(), "gdpPipelineId must not be blank");
        Objects.requireNonNull(
                request.getUpdateGdpPipelineDetails(), "updateGdpPipelineDetails is required");

        return clientCall(request, UpdateGdpPipelineResponse::builder)
                .logger(LOG, "updateGdpPipeline")
                .serviceDetails("GuardedDataPipeline", "UpdateGdpPipeline", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateGdpPipelineRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpPipelines")
                .appendPathParam(request.getGdpPipelineId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateGdpPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateGdpPipelineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public GuardedDataPipelineAsyncClient(
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
    public GuardedDataPipelineAsyncClient(
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
    public GuardedDataPipelineAsyncClient(
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
    public GuardedDataPipelineAsyncClient(
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
    public GuardedDataPipelineAsyncClient(
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
    public GuardedDataPipelineAsyncClient(
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
    public GuardedDataPipelineAsyncClient(
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
