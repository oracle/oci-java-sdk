/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.opensearch.requests.*;
import com.oracle.bmc.opensearch.responses.*;

import java.util.Objects;

/**
 * Async client implementation for OpensearchCluster service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
public class OpensearchClusterAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements OpensearchClusterAsync {
    /** Service instance for OpensearchCluster. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("OPENSEARCHCLUSTER")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://search-indexing.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OpensearchClusterAsyncClient.class);

    OpensearchClusterAsyncClient(
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
                    Builder, OpensearchClusterAsyncClient> {
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
        public OpensearchClusterAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OpensearchClusterAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<BackupOpensearchClusterResponse> backupOpensearchCluster(
            BackupOpensearchClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            BackupOpensearchClusterRequest, BackupOpensearchClusterResponse>
                    handler) {

        Validate.notBlank(
                request.getOpensearchClusterId(), "opensearchClusterId must not be blank");
        Objects.requireNonNull(
                request.getBackupOpensearchClusterDetails(),
                "backupOpensearchClusterDetails is required");

        return clientCall(request, BackupOpensearchClusterResponse::builder)
                .logger(LOG, "backupOpensearchCluster")
                .serviceDetails(
                        "OpensearchCluster",
                        "BackupOpensearchCluster",
                        "https://docs.oracle.com/iaas/api/#/en/opensearch/20180828/OpensearchCluster/BackupOpensearchCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BackupOpensearchClusterRequest::builder)
                .basePath("/20180828")
                .appendPathParam("opensearchClusters")
                .appendPathParam(request.getOpensearchClusterId())
                .appendPathParam("actions")
                .appendPathParam("backup")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        BackupOpensearchClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", BackupOpensearchClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOpensearchClusterResponse> createOpensearchCluster(
            CreateOpensearchClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateOpensearchClusterRequest, CreateOpensearchClusterResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateOpensearchClusterDetails(),
                "createOpensearchClusterDetails is required");

        return clientCall(request, CreateOpensearchClusterResponse::builder)
                .logger(LOG, "createOpensearchCluster")
                .serviceDetails(
                        "OpensearchCluster",
                        "CreateOpensearchCluster",
                        "https://docs.oracle.com/iaas/api/#/en/opensearch/20180828/OpensearchCluster/CreateOpensearchCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOpensearchClusterRequest::builder)
                .basePath("/20180828")
                .appendPathParam("opensearchClusters")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOpensearchClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOpensearchClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOpensearchClusterResponse> deleteOpensearchCluster(
            DeleteOpensearchClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteOpensearchClusterRequest, DeleteOpensearchClusterResponse>
                    handler) {

        Validate.notBlank(
                request.getOpensearchClusterId(), "opensearchClusterId must not be blank");

        return clientCall(request, DeleteOpensearchClusterResponse::builder)
                .logger(LOG, "deleteOpensearchCluster")
                .serviceDetails(
                        "OpensearchCluster",
                        "DeleteOpensearchCluster",
                        "https://docs.oracle.com/iaas/api/#/en/opensearch/20180828/OpensearchCluster/DeleteOpensearchCluster")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOpensearchClusterRequest::builder)
                .basePath("/20180828")
                .appendPathParam("opensearchClusters")
                .appendPathParam(request.getOpensearchClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOpensearchClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOpensearchClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOpensearchClusterResponse> getOpensearchCluster(
            GetOpensearchClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOpensearchClusterRequest, GetOpensearchClusterResponse>
                    handler) {

        Validate.notBlank(
                request.getOpensearchClusterId(), "opensearchClusterId must not be blank");

        return clientCall(request, GetOpensearchClusterResponse::builder)
                .logger(LOG, "getOpensearchCluster")
                .serviceDetails(
                        "OpensearchCluster",
                        "GetOpensearchCluster",
                        "https://docs.oracle.com/iaas/api/#/en/opensearch/20180828/OpensearchCluster/GetOpensearchCluster")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOpensearchClusterRequest::builder)
                .basePath("/20180828")
                .appendPathParam("opensearchClusters")
                .appendPathParam(request.getOpensearchClusterId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opensearch.model.OpensearchCluster.class,
                        GetOpensearchClusterResponse.Builder::opensearchCluster)
                .handleResponseHeaderString("etag", GetOpensearchClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOpensearchClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWorkRequestRequest, GetWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "OpensearchCluster",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/opensearch/20180828/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20180828")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opensearch.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOpensearchClustersResponse> listOpensearchClusters(
            ListOpensearchClustersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOpensearchClustersRequest, ListOpensearchClustersResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOpensearchClustersResponse::builder)
                .logger(LOG, "listOpensearchClusters")
                .serviceDetails(
                        "OpensearchCluster",
                        "ListOpensearchClusters",
                        "https://docs.oracle.com/iaas/api/#/en/opensearch/20180828/OpensearchClusterCollection/ListOpensearchClusters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOpensearchClustersRequest::builder)
                .basePath("/20180828")
                .appendPathParam("opensearchClusters")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opensearch.model.OpensearchClusterCollection.class,
                        ListOpensearchClustersResponse.Builder::opensearchClusterCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOpensearchClustersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOpensearchClustersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOpensearchVersionsResponse> listOpensearchVersions(
            ListOpensearchVersionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOpensearchVersionsRequest, ListOpensearchVersionsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOpensearchVersionsResponse::builder)
                .logger(LOG, "listOpensearchVersions")
                .serviceDetails(
                        "OpensearchCluster",
                        "ListOpensearchVersions",
                        "https://docs.oracle.com/iaas/api/#/en/opensearch/20180828/OpensearchVersionsCollection/ListOpensearchVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOpensearchVersionsRequest::builder)
                .basePath("/20180828")
                .appendPathParam("opensearch")
                .appendPathParam("versions")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.opensearch.model.OpensearchVersionsCollection.class,
                        ListOpensearchVersionsResponse.Builder::opensearchVersionsCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOpensearchVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOpensearchVersionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "OpensearchCluster",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/opensearch/20180828/WorkRequestErrorCollection/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20180828")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opensearch.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "OpensearchCluster",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/opensearch/20180828/WorkRequestLogEntryCollection/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20180828")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opensearch.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "OpensearchCluster",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/opensearch/20180828/WorkRequestCollection/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20180828")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendQueryParam("sourceResourceId", request.getSourceResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opensearch.model.WorkRequestCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<OpensearchClusterRestoreResponse> opensearchClusterRestore(
            OpensearchClusterRestoreRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            OpensearchClusterRestoreRequest, OpensearchClusterRestoreResponse>
                    handler) {

        Validate.notBlank(
                request.getOpensearchClusterId(), "opensearchClusterId must not be blank");
        Objects.requireNonNull(
                request.getRestoreOpensearchClusterDetails(),
                "restoreOpensearchClusterDetails is required");

        return clientCall(request, OpensearchClusterRestoreResponse::builder)
                .logger(LOG, "opensearchClusterRestore")
                .serviceDetails(
                        "OpensearchCluster",
                        "OpensearchClusterRestore",
                        "https://docs.oracle.com/iaas/api/#/en/opensearch/20180828/OpensearchCluster/OpensearchClusterRestore")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(OpensearchClusterRestoreRequest::builder)
                .basePath("/20180828")
                .appendPathParam("opensearchClusters")
                .appendPathParam(request.getOpensearchClusterId())
                .appendPathParam("actions")
                .appendPathParam("restore")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        OpensearchClusterRestoreResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", OpensearchClusterRestoreResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ResizeOpensearchClusterHorizontalResponse>
            resizeOpensearchClusterHorizontal(
                    ResizeOpensearchClusterHorizontalRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ResizeOpensearchClusterHorizontalRequest,
                                    ResizeOpensearchClusterHorizontalResponse>
                            handler) {

        Validate.notBlank(
                request.getOpensearchClusterId(), "opensearchClusterId must not be blank");
        Objects.requireNonNull(
                request.getResizeOpensearchClusterHorizontalDetails(),
                "resizeOpensearchClusterHorizontalDetails is required");

        return clientCall(request, ResizeOpensearchClusterHorizontalResponse::builder)
                .logger(LOG, "resizeOpensearchClusterHorizontal")
                .serviceDetails(
                        "OpensearchCluster",
                        "ResizeOpensearchClusterHorizontal",
                        "https://docs.oracle.com/iaas/api/#/en/opensearch/20180828/OpensearchCluster/ResizeOpensearchClusterHorizontal")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ResizeOpensearchClusterHorizontalRequest::builder)
                .basePath("/20180828")
                .appendPathParam("opensearchClusters")
                .appendPathParam(request.getOpensearchClusterId())
                .appendPathParam("actions")
                .appendPathParam("resizeHorizontal")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ResizeOpensearchClusterHorizontalResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ResizeOpensearchClusterHorizontalResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ResizeOpensearchClusterVerticalResponse>
            resizeOpensearchClusterVertical(
                    ResizeOpensearchClusterVerticalRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ResizeOpensearchClusterVerticalRequest,
                                    ResizeOpensearchClusterVerticalResponse>
                            handler) {

        Validate.notBlank(
                request.getOpensearchClusterId(), "opensearchClusterId must not be blank");
        Objects.requireNonNull(
                request.getResizeOpensearchClusterVerticalDetails(),
                "resizeOpensearchClusterVerticalDetails is required");

        return clientCall(request, ResizeOpensearchClusterVerticalResponse::builder)
                .logger(LOG, "resizeOpensearchClusterVertical")
                .serviceDetails(
                        "OpensearchCluster",
                        "ResizeOpensearchClusterVertical",
                        "https://docs.oracle.com/iaas/api/#/en/opensearch/20180828/OpensearchCluster/ResizeOpensearchClusterVertical")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ResizeOpensearchClusterVerticalRequest::builder)
                .basePath("/20180828")
                .appendPathParam("opensearchClusters")
                .appendPathParam(request.getOpensearchClusterId())
                .appendPathParam("actions")
                .appendPathParam("resizeVertical")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ResizeOpensearchClusterVerticalResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ResizeOpensearchClusterVerticalResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOpensearchClusterResponse> updateOpensearchCluster(
            UpdateOpensearchClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateOpensearchClusterRequest, UpdateOpensearchClusterResponse>
                    handler) {

        Validate.notBlank(
                request.getOpensearchClusterId(), "opensearchClusterId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOpensearchClusterDetails(),
                "updateOpensearchClusterDetails is required");

        return clientCall(request, UpdateOpensearchClusterResponse::builder)
                .logger(LOG, "updateOpensearchCluster")
                .serviceDetails(
                        "OpensearchCluster",
                        "UpdateOpensearchCluster",
                        "https://docs.oracle.com/iaas/api/#/en/opensearch/20180828/OpensearchCluster/UpdateOpensearchCluster")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOpensearchClusterRequest::builder)
                .basePath("/20180828")
                .appendPathParam("opensearchClusters")
                .appendPathParam(request.getOpensearchClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOpensearchClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOpensearchClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OpensearchClusterAsyncClient(
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
    public OpensearchClusterAsyncClient(
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
    public OpensearchClusterAsyncClient(
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
    public OpensearchClusterAsyncClient(
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
    public OpensearchClusterAsyncClient(
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
    public OpensearchClusterAsyncClient(
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
    public OpensearchClusterAsyncClient(
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
