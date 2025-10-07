/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
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

    ContainerEngineAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    ContainerEngineAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "ContainerEngineAsyncClient", "createKubeconfig"));
        }
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
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "containerengine";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Enable/disable the stream warnings for the client
         *
         * @param isStreamWarningEnabled executorService
         * @return this builder
         */
        public Builder isStreamWarningEnabled(boolean isStreamWarningEnabled) {
            this.isStreamWarningEnabled = isStreamWarningEnabled;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public ContainerEngineAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ContainerEngineAsyncClient(
                    this, authenticationDetailsProvider, isStreamWarningEnabled);
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
    public java.util.concurrent.Future<CompleteCredentialRotationResponse>
            completeCredentialRotation(
                    CompleteCredentialRotationRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CompleteCredentialRotationRequest,
                                    CompleteCredentialRotationResponse>
                            handler) {

        Validate.notBlank(request.getClusterId(), "clusterId must not be blank");

        return clientCall(request, CompleteCredentialRotationResponse::builder)
                .logger(LOG, "completeCredentialRotation")
                .serviceDetails(
                        "ContainerEngine",
                        "CompleteCredentialRotation",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/Cluster/CompleteCredentialRotation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CompleteCredentialRotationRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusters")
                .appendPathParam(request.getClusterId())
                .appendPathParam("actions")
                .appendPathParam("completeCredentialRotation")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CompleteCredentialRotationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CompleteCredentialRotationResponse.Builder::opcRequestId)
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
    public java.util.concurrent.Future<CreateVirtualNodePoolResponse> createVirtualNodePool(
            CreateVirtualNodePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateVirtualNodePoolRequest, CreateVirtualNodePoolResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateVirtualNodePoolDetails(),
                "createVirtualNodePoolDetails is required");

        return clientCall(request, CreateVirtualNodePoolResponse::builder)
                .logger(LOG, "createVirtualNodePool")
                .serviceDetails(
                        "ContainerEngine",
                        "CreateVirtualNodePool",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/VirtualNodePool/CreateVirtualNodePool")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVirtualNodePoolRequest::builder)
                .basePath("/20180222")
                .appendPathParam("virtualNodePools")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateVirtualNodePoolResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVirtualNodePoolResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkloadMappingResponse> createWorkloadMapping(
            CreateWorkloadMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateWorkloadMappingRequest, CreateWorkloadMappingResponse>
                    handler) {

        Validate.notBlank(request.getClusterId(), "clusterId must not be blank");
        Objects.requireNonNull(
                request.getCreateWorkloadMappingDetails(),
                "createWorkloadMappingDetails is required");

        return clientCall(request, CreateWorkloadMappingResponse::builder)
                .logger(LOG, "createWorkloadMapping")
                .serviceDetails(
                        "ContainerEngine",
                        "CreateWorkloadMapping",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/WorkloadMapping/CreateWorkloadMapping")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateWorkloadMappingRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusters")
                .appendPathParam(request.getClusterId())
                .appendPathParam("workloadMappings")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.containerengine.model.WorkloadMapping.class,
                        CreateWorkloadMappingResponse.Builder::workloadMapping)
                .handleResponseHeaderString("etag", CreateWorkloadMappingResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateWorkloadMappingResponse.Builder::opcRequestId)
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
    public java.util.concurrent.Future<DeleteVirtualNodePoolResponse> deleteVirtualNodePool(
            DeleteVirtualNodePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteVirtualNodePoolRequest, DeleteVirtualNodePoolResponse>
                    handler) {

        Validate.notBlank(request.getVirtualNodePoolId(), "virtualNodePoolId must not be blank");

        return clientCall(request, DeleteVirtualNodePoolResponse::builder)
                .logger(LOG, "deleteVirtualNodePool")
                .serviceDetails(
                        "ContainerEngine",
                        "DeleteVirtualNodePool",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/VirtualNodePool/DeleteVirtualNodePool")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVirtualNodePoolRequest::builder)
                .basePath("/20180222")
                .appendPathParam("virtualNodePools")
                .appendPathParam(request.getVirtualNodePoolId())
                .appendQueryParam(
                        "overrideEvictionGraceDurationVnp",
                        request.getOverrideEvictionGraceDurationVnp())
                .appendQueryParam(
                        "isForceDeletionAfterOverrideGraceDurationVnp",
                        request.getIsForceDeletionAfterOverrideGraceDurationVnp())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteVirtualNodePoolResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVirtualNodePoolResponse.Builder::opcRequestId)
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
    public java.util.concurrent.Future<DeleteWorkloadMappingResponse> deleteWorkloadMapping(
            DeleteWorkloadMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteWorkloadMappingRequest, DeleteWorkloadMappingResponse>
                    handler) {

        Validate.notBlank(request.getClusterId(), "clusterId must not be blank");

        Validate.notBlank(request.getWorkloadMappingId(), "workloadMappingId must not be blank");

        return clientCall(request, DeleteWorkloadMappingResponse::builder)
                .logger(LOG, "deleteWorkloadMapping")
                .serviceDetails(
                        "ContainerEngine",
                        "DeleteWorkloadMapping",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/WorkloadMapping/DeleteWorkloadMapping")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteWorkloadMappingRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusters")
                .appendPathParam(request.getClusterId())
                .appendPathParam("workloadMappings")
                .appendPathParam(request.getWorkloadMappingId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteWorkloadMappingResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DisableAddonResponse> disableAddon(
            DisableAddonRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DisableAddonRequest, DisableAddonResponse>
                    handler) {

        Validate.notBlank(request.getClusterId(), "clusterId must not be blank");

        Validate.notBlank(request.getAddonName(), "addonName must not be blank");
        Objects.requireNonNull(
                request.getIsRemoveExistingAddOn(), "isRemoveExistingAddOn is required");

        return clientCall(request, DisableAddonResponse::builder)
                .logger(LOG, "disableAddon")
                .serviceDetails(
                        "ContainerEngine",
                        "DisableAddon",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/Cluster/DisableAddon")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DisableAddonRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusters")
                .appendPathParam(request.getClusterId())
                .appendPathParam("addons")
                .appendPathParam(request.getAddonName())
                .appendQueryParam("isRemoveExistingAddOn", request.getIsRemoveExistingAddOn())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DisableAddonResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DisableAddonResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAddonResponse> getAddon(
            GetAddonRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAddonRequest, GetAddonResponse>
                    handler) {

        Validate.notBlank(request.getClusterId(), "clusterId must not be blank");

        Validate.notBlank(request.getAddonName(), "addonName must not be blank");

        return clientCall(request, GetAddonResponse::builder)
                .logger(LOG, "getAddon")
                .serviceDetails(
                        "ContainerEngine",
                        "GetAddon",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/Cluster/GetAddon")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAddonRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusters")
                .appendPathParam(request.getClusterId())
                .appendPathParam("addons")
                .appendPathParam(request.getAddonName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.containerengine.model.Addon.class,
                        GetAddonResponse.Builder::addon)
                .handleResponseHeaderString("etag", GetAddonResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAddonResponse.Builder::opcRequestId)
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
                .appendQueryParam(
                        "shouldIncludeOidcConfigFile", request.getShouldIncludeOidcConfigFile())
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
    public java.util.concurrent.Future<GetCredentialRotationStatusResponse>
            getCredentialRotationStatus(
                    GetCredentialRotationStatusRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetCredentialRotationStatusRequest,
                                    GetCredentialRotationStatusResponse>
                            handler) {

        Validate.notBlank(request.getClusterId(), "clusterId must not be blank");

        return clientCall(request, GetCredentialRotationStatusResponse::builder)
                .logger(LOG, "getCredentialRotationStatus")
                .serviceDetails(
                        "ContainerEngine",
                        "GetCredentialRotationStatus",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/CredentialRotationStatus/GetCredentialRotationStatus")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCredentialRotationStatusRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusters")
                .appendPathParam(request.getClusterId())
                .appendPathParam("credentialRotationStatus")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.containerengine.model.CredentialRotationStatus.class,
                        GetCredentialRotationStatusResponse.Builder::credentialRotationStatus)
                .handleResponseHeaderString(
                        "etag", GetCredentialRotationStatusResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCredentialRotationStatusResponse.Builder::opcRequestId)
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
    public java.util.concurrent.Future<GetVirtualNodeResponse> getVirtualNode(
            GetVirtualNodeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVirtualNodeRequest, GetVirtualNodeResponse>
                    handler) {

        Validate.notBlank(request.getVirtualNodePoolId(), "virtualNodePoolId must not be blank");

        Validate.notBlank(request.getVirtualNodeId(), "virtualNodeId must not be blank");

        return clientCall(request, GetVirtualNodeResponse::builder)
                .logger(LOG, "getVirtualNode")
                .serviceDetails(
                        "ContainerEngine",
                        "GetVirtualNode",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/VirtualNodePool/GetVirtualNode")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVirtualNodeRequest::builder)
                .basePath("/20180222")
                .appendPathParam("virtualNodePools")
                .appendPathParam(request.getVirtualNodePoolId())
                .appendPathParam("virtualNodes")
                .appendPathParam(request.getVirtualNodeId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.containerengine.model.VirtualNode.class,
                        GetVirtualNodeResponse.Builder::virtualNode)
                .handleResponseHeaderString("etag", GetVirtualNodeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVirtualNodeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetVirtualNodePoolResponse> getVirtualNodePool(
            GetVirtualNodePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVirtualNodePoolRequest, GetVirtualNodePoolResponse>
                    handler) {

        Validate.notBlank(request.getVirtualNodePoolId(), "virtualNodePoolId must not be blank");

        return clientCall(request, GetVirtualNodePoolResponse::builder)
                .logger(LOG, "getVirtualNodePool")
                .serviceDetails(
                        "ContainerEngine",
                        "GetVirtualNodePool",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/VirtualNodePool/GetVirtualNodePool")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVirtualNodePoolRequest::builder)
                .basePath("/20180222")
                .appendPathParam("virtualNodePools")
                .appendPathParam(request.getVirtualNodePoolId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.containerengine.model.VirtualNodePool.class,
                        GetVirtualNodePoolResponse.Builder::virtualNodePool)
                .handleResponseHeaderString("etag", GetVirtualNodePoolResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVirtualNodePoolResponse.Builder::opcRequestId)
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
    public java.util.concurrent.Future<GetWorkloadMappingResponse> getWorkloadMapping(
            GetWorkloadMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWorkloadMappingRequest, GetWorkloadMappingResponse>
                    handler) {

        Validate.notBlank(request.getClusterId(), "clusterId must not be blank");

        Validate.notBlank(request.getWorkloadMappingId(), "workloadMappingId must not be blank");

        return clientCall(request, GetWorkloadMappingResponse::builder)
                .logger(LOG, "getWorkloadMapping")
                .serviceDetails(
                        "ContainerEngine",
                        "GetWorkloadMapping",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/WorkloadMapping/GetWorkloadMapping")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkloadMappingRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusters")
                .appendPathParam(request.getClusterId())
                .appendPathParam("workloadMappings")
                .appendPathParam(request.getWorkloadMappingId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.containerengine.model.WorkloadMapping.class,
                        GetWorkloadMappingResponse.Builder::workloadMapping)
                .handleResponseHeaderString("etag", GetWorkloadMappingResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkloadMappingResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<InstallAddonResponse> installAddon(
            InstallAddonRequest request,
            final com.oracle.bmc.responses.AsyncHandler<InstallAddonRequest, InstallAddonResponse>
                    handler) {

        Validate.notBlank(request.getClusterId(), "clusterId must not be blank");
        Objects.requireNonNull(request.getInstallAddonDetails(), "installAddonDetails is required");

        return clientCall(request, InstallAddonResponse::builder)
                .logger(LOG, "installAddon")
                .serviceDetails(
                        "ContainerEngine",
                        "InstallAddon",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/Cluster/InstallAddon")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(InstallAddonRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusters")
                .appendPathParam(request.getClusterId())
                .appendPathParam("addons")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", InstallAddonResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", InstallAddonResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAddonOptionsResponse> listAddonOptions(
            ListAddonOptionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAddonOptionsRequest, ListAddonOptionsResponse>
                    handler) {
        Objects.requireNonNull(request.getKubernetesVersion(), "kubernetesVersion is required");

        return clientCall(request, ListAddonOptionsResponse::builder)
                .logger(LOG, "listAddonOptions")
                .serviceDetails(
                        "ContainerEngine",
                        "ListAddonOptions",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/AddonOptionSummary/ListAddonOptions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAddonOptionsRequest::builder)
                .basePath("/20180222")
                .appendPathParam("addonOptions")
                .appendQueryParam("kubernetesVersion", request.getKubernetesVersion())
                .appendQueryParam("addonName", request.getAddonName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("shouldShowAllVersions", request.getShouldShowAllVersions())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.containerengine.model.AddonOptionSummary.class,
                        ListAddonOptionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListAddonOptionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListAddonOptionsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAddonsResponse> listAddons(
            ListAddonsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListAddonsRequest, ListAddonsResponse>
                    handler) {

        Validate.notBlank(request.getClusterId(), "clusterId must not be blank");

        return clientCall(request, ListAddonsResponse::builder)
                .logger(LOG, "listAddons")
                .serviceDetails(
                        "ContainerEngine",
                        "ListAddons",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/Cluster/ListAddons")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAddonsRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusters")
                .appendPathParam(request.getClusterId())
                .appendPathParam("addons")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.containerengine.model.AddonSummary.class,
                        ListAddonsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListAddonsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListAddonsResponse.Builder::opcRequestId)
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
    public java.util.concurrent.Future<ListPodShapesResponse> listPodShapes(
            ListPodShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPodShapesRequest, ListPodShapesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListPodShapesResponse::builder)
                .logger(LOG, "listPodShapes")
                .serviceDetails(
                        "ContainerEngine",
                        "ListPodShapes",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/PodShapeSummary/ListPodShapes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPodShapesRequest::builder)
                .basePath("/20180222")
                .appendPathParam("podShapes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.containerengine.model.PodShapeSummary.class,
                        ListPodShapesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListPodShapesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListPodShapesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListVirtualNodePoolsResponse> listVirtualNodePools(
            ListVirtualNodePoolsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVirtualNodePoolsRequest, ListVirtualNodePoolsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVirtualNodePoolsResponse::builder)
                .logger(LOG, "listVirtualNodePools")
                .serviceDetails(
                        "ContainerEngine",
                        "ListVirtualNodePools",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/VirtualNodePoolSummary/ListVirtualNodePools")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVirtualNodePoolsRequest::builder)
                .basePath("/20180222")
                .appendPathParam("virtualNodePools")
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
                        com.oracle.bmc.containerengine.model.VirtualNodePoolSummary.class,
                        ListVirtualNodePoolsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListVirtualNodePoolsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListVirtualNodePoolsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListVirtualNodesResponse> listVirtualNodes(
            ListVirtualNodesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVirtualNodesRequest, ListVirtualNodesResponse>
                    handler) {

        Validate.notBlank(request.getVirtualNodePoolId(), "virtualNodePoolId must not be blank");

        return clientCall(request, ListVirtualNodesResponse::builder)
                .logger(LOG, "listVirtualNodes")
                .serviceDetails(
                        "ContainerEngine",
                        "ListVirtualNodes",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/VirtualNodePool/ListVirtualNodes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVirtualNodesRequest::builder)
                .basePath("/20180222")
                .appendPathParam("virtualNodePools")
                .appendPathParam(request.getVirtualNodePoolId())
                .appendPathParam("virtualNodes")
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.containerengine.model.VirtualNodeSummary.class,
                        ListVirtualNodesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListVirtualNodesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListVirtualNodesResponse.Builder::opcRequestId)
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
    public java.util.concurrent.Future<ListWorkloadMappingsResponse> listWorkloadMappings(
            ListWorkloadMappingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkloadMappingsRequest, ListWorkloadMappingsResponse>
                    handler) {

        Validate.notBlank(request.getClusterId(), "clusterId must not be blank");

        return clientCall(request, ListWorkloadMappingsResponse::builder)
                .logger(LOG, "listWorkloadMappings")
                .serviceDetails(
                        "ContainerEngine",
                        "ListWorkloadMappings",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/WorkloadMapping/ListWorkloadMappings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkloadMappingsRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusters")
                .appendPathParam(request.getClusterId())
                .appendPathParam("workloadMappings")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.containerengine.model.WorkloadMappingSummary.class,
                        ListWorkloadMappingsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkloadMappingsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkloadMappingsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RebootClusterNodeResponse> rebootClusterNode(
            RebootClusterNodeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RebootClusterNodeRequest, RebootClusterNodeResponse>
                    handler) {

        Validate.notBlank(request.getClusterId(), "clusterId must not be blank");

        Validate.notBlank(request.getNodeId(), "nodeId must not be blank");
        Objects.requireNonNull(
                request.getRebootClusterNodeDetails(), "rebootClusterNodeDetails is required");

        return clientCall(request, RebootClusterNodeResponse::builder)
                .logger(LOG, "rebootClusterNode")
                .serviceDetails(
                        "ContainerEngine",
                        "RebootClusterNode",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/Cluster/RebootClusterNode")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RebootClusterNodeRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusters")
                .appendPathParam(request.getClusterId())
                .appendPathParam("nodes")
                .appendPathParam(request.getNodeId())
                .appendPathParam("actions")
                .appendPathParam("reboot")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", RebootClusterNodeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RebootClusterNodeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ReplaceBootVolumeClusterNodeResponse>
            replaceBootVolumeClusterNode(
                    ReplaceBootVolumeClusterNodeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ReplaceBootVolumeClusterNodeRequest,
                                    ReplaceBootVolumeClusterNodeResponse>
                            handler) {

        Validate.notBlank(request.getClusterId(), "clusterId must not be blank");

        Validate.notBlank(request.getNodeId(), "nodeId must not be blank");
        Objects.requireNonNull(
                request.getReplaceBootVolumeClusterNodeDetails(),
                "replaceBootVolumeClusterNodeDetails is required");

        return clientCall(request, ReplaceBootVolumeClusterNodeResponse::builder)
                .logger(LOG, "replaceBootVolumeClusterNode")
                .serviceDetails(
                        "ContainerEngine",
                        "ReplaceBootVolumeClusterNode",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/Cluster/ReplaceBootVolumeClusterNode")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ReplaceBootVolumeClusterNodeRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusters")
                .appendPathParam(request.getClusterId())
                .appendPathParam("nodes")
                .appendPathParam(request.getNodeId())
                .appendPathParam("actions")
                .appendPathParam("replaceBootVolume")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ReplaceBootVolumeClusterNodeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ReplaceBootVolumeClusterNodeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartCredentialRotationResponse> startCredentialRotation(
            StartCredentialRotationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartCredentialRotationRequest, StartCredentialRotationResponse>
                    handler) {

        Validate.notBlank(request.getClusterId(), "clusterId must not be blank");
        Objects.requireNonNull(
                request.getStartCredentialRotationDetails(),
                "startCredentialRotationDetails is required");

        return clientCall(request, StartCredentialRotationResponse::builder)
                .logger(LOG, "startCredentialRotation")
                .serviceDetails(
                        "ContainerEngine",
                        "StartCredentialRotation",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/Cluster/StartCredentialRotation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartCredentialRotationRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusters")
                .appendPathParam(request.getClusterId())
                .appendPathParam("actions")
                .appendPathParam("startCredentialRotation")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StartCredentialRotationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartCredentialRotationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAddonResponse> updateAddon(
            UpdateAddonRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateAddonRequest, UpdateAddonResponse>
                    handler) {

        Validate.notBlank(request.getClusterId(), "clusterId must not be blank");

        Validate.notBlank(request.getAddonName(), "addonName must not be blank");
        Objects.requireNonNull(request.getUpdateAddonDetails(), "updateAddonDetails is required");

        return clientCall(request, UpdateAddonResponse::builder)
                .logger(LOG, "updateAddon")
                .serviceDetails(
                        "ContainerEngine",
                        "UpdateAddon",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/Cluster/UpdateAddon")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAddonRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusters")
                .appendPathParam(request.getClusterId())
                .appendPathParam("addons")
                .appendPathParam(request.getAddonName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateAddonResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAddonResponse.Builder::opcRequestId)
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

    @Override
    public java.util.concurrent.Future<UpdateVirtualNodePoolResponse> updateVirtualNodePool(
            UpdateVirtualNodePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateVirtualNodePoolRequest, UpdateVirtualNodePoolResponse>
                    handler) {

        Validate.notBlank(request.getVirtualNodePoolId(), "virtualNodePoolId must not be blank");
        Objects.requireNonNull(
                request.getUpdateVirtualNodePoolDetails(),
                "updateVirtualNodePoolDetails is required");

        return clientCall(request, UpdateVirtualNodePoolResponse::builder)
                .logger(LOG, "updateVirtualNodePool")
                .serviceDetails(
                        "ContainerEngine",
                        "UpdateVirtualNodePool",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/VirtualNodePool/UpdateVirtualNodePool")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVirtualNodePoolRequest::builder)
                .basePath("/20180222")
                .appendPathParam("virtualNodePools")
                .appendPathParam(request.getVirtualNodePoolId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateVirtualNodePoolResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVirtualNodePoolResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkloadMappingResponse> updateWorkloadMapping(
            UpdateWorkloadMappingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateWorkloadMappingRequest, UpdateWorkloadMappingResponse>
                    handler) {

        Validate.notBlank(request.getClusterId(), "clusterId must not be blank");

        Validate.notBlank(request.getWorkloadMappingId(), "workloadMappingId must not be blank");
        Objects.requireNonNull(
                request.getUpdateWorkloadMappingDetails(),
                "updateWorkloadMappingDetails is required");

        return clientCall(request, UpdateWorkloadMappingResponse::builder)
                .logger(LOG, "updateWorkloadMapping")
                .serviceDetails(
                        "ContainerEngine",
                        "UpdateWorkloadMapping",
                        "https://docs.oracle.com/iaas/api/#/en/containerengine/20180222/WorkloadMapping/UpdateWorkloadMapping")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateWorkloadMappingRequest::builder)
                .basePath("/20180222")
                .appendPathParam("clusters")
                .appendPathParam(request.getClusterId())
                .appendPathParam("workloadMappings")
                .appendPathParam(request.getWorkloadMappingId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.containerengine.model.WorkloadMapping.class,
                        UpdateWorkloadMappingResponse.Builder::workloadMapping)
                .handleResponseHeaderString("etag", UpdateWorkloadMappingResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateWorkloadMappingResponse.Builder::opcRequestId)
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
