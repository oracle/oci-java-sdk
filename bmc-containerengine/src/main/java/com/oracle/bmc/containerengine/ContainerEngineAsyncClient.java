/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.containerengine.requests.*;
import com.oracle.bmc.containerengine.responses.*;

import java.util.Objects;

/**
 * Async client implementation for ContainerEngine service. <br>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
public class ContainerEngineAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ContainerEngineAsync {
    /** Service instance for ContainerEngine. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("CONTAINERENGINE")
                    .serviceEndpointPrefix("containerengine")
                    .serviceEndpointTemplate(
                            "https://containerengine.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ContainerEngineAsyncClient.class);

    private ContainerEngineAsyncClient(
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
                    Builder, ContainerEngineAsyncClient> {
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
        public ContainerEngineAsyncClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ContainerEngineAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ClusterMigrateToNativeVcnResponse> clusterMigrateToNativeVcn(
            ClusterMigrateToNativeVcnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ClusterMigrateToNativeVcnRequest, ClusterMigrateToNativeVcnResponse>
                    handler) {

        Validate.notBlank(request.getClusterId(), "clusterId must not be blank");
        Objects.requireNonNull(
                request.getClusterMigrateToNativeVcnDetails(),
                "clusterMigrateToNativeVcnDetails is required");

        return clientCall(request, ClusterMigrateToNativeVcnResponse::builder)
                .logger(LOG, "clusterMigrateToNativeVcn")
                .serviceDetails(
                        "ContainerEngine",
                        "ClusterMigrateToNativeVcn",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/Cluster/ClusterMigrateToNativeVcn")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ClusterMigrateToNativeVcnRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusters")
                .appendPathParam(request.getClusterId())
                .appendPathParam("actions")
                .appendPathParam("migrateToNativeVcn")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ClusterMigrateToNativeVcnResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ClusterMigrateToNativeVcnResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateClusterResponse> createCluster(
            CreateClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateClusterRequest, CreateClusterResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateClusterDetails(), "createClusterDetails is required");

        return clientCall(request, CreateClusterResponse::builder)
                .logger(LOG, "createCluster")
                .serviceDetails(
                        "ContainerEngine",
                        "CreateCluster",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/Cluster/CreateCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateClusterRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusters")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateKubeconfigResponse> createKubeconfig(
            CreateKubeconfigRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateKubeconfigRequest, CreateKubeconfigResponse>
                    handler) {

        Validate.notBlank(request.getClusterId(), "clusterId must not be blank");

        return clientCall(request, CreateKubeconfigResponse::builder)
                .logger(LOG, "createKubeconfig")
                .serviceDetails(
                        "ContainerEngine",
                        "CreateKubeconfig",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/Cluster/CreateKubeconfig")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateKubeconfigRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusters")
                .appendPathParam(request.getClusterId())
                .appendPathParam("kubeconfig")
                .appendPathParam("content")
                .accept("application/x-yaml")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        java.io.InputStream.class, CreateKubeconfigResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", CreateKubeconfigResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateNodePoolResponse> createNodePool(
            CreateNodePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateNodePoolRequest, CreateNodePoolResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateNodePoolDetails(), "createNodePoolDetails is required");

        return clientCall(request, CreateNodePoolResponse::builder)
                .logger(LOG, "createNodePool")
                .serviceDetails(
                        "ContainerEngine",
                        "CreateNodePool",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/NodePool/CreateNodePool")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateNodePoolRequest::builder)
                .basePath("/20180222")
                .appendPathParam("nodePools")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateNodePoolResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateNodePoolResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterResponse> deleteCluster(
            DeleteClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteClusterRequest, DeleteClusterResponse>
                    handler) {

        Validate.notBlank(request.getClusterId(), "clusterId must not be blank");

        return clientCall(request, DeleteClusterResponse::builder)
                .logger(LOG, "deleteCluster")
                .serviceDetails(
                        "ContainerEngine",
                        "DeleteCluster",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/Cluster/DeleteCluster")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteClusterRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusters")
                .appendPathParam(request.getClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteNodeResponse> deleteNode(
            DeleteNodeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteNodeRequest, DeleteNodeResponse>
                    handler) {

        Validate.notBlank(request.getNodePoolId(), "nodePoolId must not be blank");

        Validate.notBlank(request.getNodeId(), "nodeId must not be blank");

        return clientCall(request, DeleteNodeResponse::builder)
                .logger(LOG, "deleteNode")
                .serviceDetails(
                        "ContainerEngine",
                        "DeleteNode",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/NodePool/DeleteNode")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteNodeRequest::builder)
                .basePath("/20180222")
                .appendPathParam("nodePools")
                .appendPathParam(request.getNodePoolId())
                .appendPathParam("node")
                .appendPathParam(request.getNodeId())
                .appendQueryParam("isDecrementSize", request.getIsDecrementSize())
                .appendQueryParam(
                        "overrideEvictionGraceDuration", request.getOverrideEvictionGraceDuration())
                .appendQueryParam(
                        "isForceDeletionAfterOverrideGraceDuration",
                        request.getIsForceDeletionAfterOverrideGraceDuration())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteNodeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteNodeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteNodePoolResponse> deleteNodePool(
            DeleteNodePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteNodePoolRequest, DeleteNodePoolResponse>
                    handler) {

        Validate.notBlank(request.getNodePoolId(), "nodePoolId must not be blank");

        return clientCall(request, DeleteNodePoolResponse::builder)
                .logger(LOG, "deleteNodePool")
                .serviceDetails(
                        "ContainerEngine",
                        "DeleteNodePool",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/NodePool/DeleteNodePool")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteNodePoolRequest::builder)
                .basePath("/20180222")
                .appendPathParam("nodePools")
                .appendPathParam(request.getNodePoolId())
                .appendQueryParam(
                        "overrideEvictionGraceDuration", request.getOverrideEvictionGraceDuration())
                .appendQueryParam(
                        "isForceDeletionAfterOverrideGraceDuration",
                        request.getIsForceDeletionAfterOverrideGraceDuration())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteNodePoolResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteNodePoolResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkRequestResponse> deleteWorkRequest(
            DeleteWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteWorkRequestRequest, DeleteWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, DeleteWorkRequestResponse::builder)
                .logger(LOG, "deleteWorkRequest")
                .serviceDetails(
                        "ContainerEngine",
                        "DeleteWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/WorkRequest/DeleteWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteWorkRequestRequest::builder)
                .basePath("/20180222")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteWorkRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetClusterResponse> getCluster(
            GetClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetClusterRequest, GetClusterResponse>
                    handler) {

        Validate.notBlank(request.getClusterId(), "clusterId must not be blank");

        return clientCall(request, GetClusterResponse::builder)
                .logger(LOG, "getCluster")
                .serviceDetails(
                        "ContainerEngine",
                        "GetCluster",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/Cluster/GetCluster")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetClusterRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusters")
                .appendPathParam(request.getClusterId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.containerengine.model.Cluster.class,
                        GetClusterResponse.Builder::cluster)
                .handleResponseHeaderString("etag", GetClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetClusterMigrateToNativeVcnStatusResponse>
            getClusterMigrateToNativeVcnStatus(
                    GetClusterMigrateToNativeVcnStatusRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetClusterMigrateToNativeVcnStatusRequest,
                                    GetClusterMigrateToNativeVcnStatusResponse>
                            handler) {

        Validate.notBlank(request.getClusterId(), "clusterId must not be blank");

        return clientCall(request, GetClusterMigrateToNativeVcnStatusResponse::builder)
                .logger(LOG, "getClusterMigrateToNativeVcnStatus")
                .serviceDetails(
                        "ContainerEngine",
                        "GetClusterMigrateToNativeVcnStatus",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/ClusterMigrateToNativeVcnStatus/GetClusterMigrateToNativeVcnStatus")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetClusterMigrateToNativeVcnStatusRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusters")
                .appendPathParam(request.getClusterId())
                .appendPathParam("migrateToNativeVcnStatus")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.containerengine.model.ClusterMigrateToNativeVcnStatus.class,
                        GetClusterMigrateToNativeVcnStatusResponse.Builder
                                ::clusterMigrateToNativeVcnStatus)
                .handleResponseHeaderString(
                        "etag", GetClusterMigrateToNativeVcnStatusResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetClusterMigrateToNativeVcnStatusResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetClusterOptionsResponse> getClusterOptions(
            GetClusterOptionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetClusterOptionsRequest, GetClusterOptionsResponse>
                    handler) {

        Validate.notBlank(request.getClusterOptionId(), "clusterOptionId must not be blank");

        return clientCall(request, GetClusterOptionsResponse::builder)
                .logger(LOG, "getClusterOptions")
                .serviceDetails(
                        "ContainerEngine",
                        "GetClusterOptions",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/ClusterOptions/GetClusterOptions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetClusterOptionsRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusterOptions")
                .appendPathParam(request.getClusterOptionId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.containerengine.model.ClusterOptions.class,
                        GetClusterOptionsResponse.Builder::clusterOptions)
                .handleResponseHeaderString(
                        "opc-request-id", GetClusterOptionsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetNodePoolResponse> getNodePool(
            GetNodePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetNodePoolRequest, GetNodePoolResponse>
                    handler) {

        Validate.notBlank(request.getNodePoolId(), "nodePoolId must not be blank");

        return clientCall(request, GetNodePoolResponse::builder)
                .logger(LOG, "getNodePool")
                .serviceDetails(
                        "ContainerEngine",
                        "GetNodePool",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/NodePool/GetNodePool")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNodePoolRequest::builder)
                .basePath("/20180222")
                .appendPathParam("nodePools")
                .appendPathParam(request.getNodePoolId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.containerengine.model.NodePool.class,
                        GetNodePoolResponse.Builder::nodePool)
                .handleResponseHeaderString("etag", GetNodePoolResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetNodePoolResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetNodePoolOptionsResponse> getNodePoolOptions(
            GetNodePoolOptionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetNodePoolOptionsRequest, GetNodePoolOptionsResponse>
                    handler) {

        Validate.notBlank(request.getNodePoolOptionId(), "nodePoolOptionId must not be blank");

        return clientCall(request, GetNodePoolOptionsResponse::builder)
                .logger(LOG, "getNodePoolOptions")
                .serviceDetails(
                        "ContainerEngine",
                        "GetNodePoolOptions",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/NodePoolOptions/GetNodePoolOptions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNodePoolOptionsRequest::builder)
                .basePath("/20180222")
                .appendPathParam("nodePoolOptions")
                .appendPathParam(request.getNodePoolOptionId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.containerengine.model.NodePoolOptions.class,
                        GetNodePoolOptionsResponse.Builder::nodePoolOptions)
                .handleResponseHeaderString(
                        "opc-request-id", GetNodePoolOptionsResponse.Builder::opcRequestId)
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
                        "ContainerEngine",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20180222")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.containerengine.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListClustersResponse> listClusters(
            ListClustersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListClustersRequest, ListClustersResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListClustersResponse::builder)
                .logger(LOG, "listClusters")
                .serviceDetails(
                        "ContainerEngine",
                        "ListClusters",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/ClusterSummary/ListClusters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListClustersRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusters")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.containerengine.model.ClusterSummary.class,
                        ListClustersResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListClustersResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListClustersResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListNodePoolsResponse> listNodePools(
            ListNodePoolsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListNodePoolsRequest, ListNodePoolsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListNodePoolsResponse::builder)
                .logger(LOG, "listNodePools")
                .serviceDetails(
                        "ContainerEngine",
                        "ListNodePools",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/NodePoolSummary/ListNodePools")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNodePoolsRequest::builder)
                .basePath("/20180222")
                .appendPathParam("nodePools")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("clusterId", request.getClusterId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "lifecycleState",
                        request.getLifecycleState(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.containerengine.model.NodePoolSummary.class,
                        ListNodePoolsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListNodePoolsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListNodePoolsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "ContainerEngine",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20180222")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.containerengine.model.WorkRequestError.class,
                        ListWorkRequestErrorsResponse.Builder::items)
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
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "ContainerEngine",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20180222")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.containerengine.model.WorkRequestLogEntry.class,
                        ListWorkRequestLogsResponse.Builder::items)
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
                        "ContainerEngine",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/WorkRequestSummary/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20180222")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("clusterId", request.getClusterId())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendEnumQueryParam("resourceType", request.getResourceType())
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.containerengine.model.WorkRequestSummary.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateClusterResponse> updateCluster(
            UpdateClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateClusterRequest, UpdateClusterResponse>
                    handler) {

        Validate.notBlank(request.getClusterId(), "clusterId must not be blank");
        Objects.requireNonNull(
                request.getUpdateClusterDetails(), "updateClusterDetails is required");

        return clientCall(request, UpdateClusterResponse::builder)
                .logger(LOG, "updateCluster")
                .serviceDetails(
                        "ContainerEngine",
                        "UpdateCluster",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/Cluster/UpdateCluster")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateClusterRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusters")
                .appendPathParam(request.getClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateClusterEndpointConfigResponse>
            updateClusterEndpointConfig(
                    UpdateClusterEndpointConfigRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateClusterEndpointConfigRequest,
                                    UpdateClusterEndpointConfigResponse>
                            handler) {

        Validate.notBlank(request.getClusterId(), "clusterId must not be blank");
        Objects.requireNonNull(
                request.getUpdateClusterEndpointConfigDetails(),
                "updateClusterEndpointConfigDetails is required");

        return clientCall(request, UpdateClusterEndpointConfigResponse::builder)
                .logger(LOG, "updateClusterEndpointConfig")
                .serviceDetails(
                        "ContainerEngine",
                        "UpdateClusterEndpointConfig",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/Cluster/UpdateClusterEndpointConfig")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpdateClusterEndpointConfigRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusters")
                .appendPathParam(request.getClusterId())
                .appendPathParam("actions")
                .appendPathParam("updateEndpointConfig")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateClusterEndpointConfigResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateClusterEndpointConfigResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateNodePoolResponse> updateNodePool(
            UpdateNodePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateNodePoolRequest, UpdateNodePoolResponse>
                    handler) {

        Validate.notBlank(request.getNodePoolId(), "nodePoolId must not be blank");
        Objects.requireNonNull(
                request.getUpdateNodePoolDetails(), "updateNodePoolDetails is required");

        return clientCall(request, UpdateNodePoolResponse::builder)
                .logger(LOG, "updateNodePool")
                .serviceDetails(
                        "ContainerEngine",
                        "UpdateNodePool",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/NodePool/UpdateNodePool")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateNodePoolRequest::builder)
                .basePath("/20180222")
                .appendPathParam("nodePools")
                .appendPathParam(request.getNodePoolId())
                .appendQueryParam(
                        "overrideEvictionGraceDuration", request.getOverrideEvictionGraceDuration())
                .appendQueryParam(
                        "isForceDeletionAfterOverrideGraceDuration",
                        request.getIsForceDeletionAfterOverrideGraceDuration())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateNodePoolResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateNodePoolResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ContainerEngineAsyncClient(
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
    public ContainerEngineAsyncClient(
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
    public ContainerEngineAsyncClient(
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
    public ContainerEngineAsyncClient(
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
    public ContainerEngineAsyncClient(
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
    public ContainerEngineAsyncClient(
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
    public ContainerEngineAsyncClient(
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
