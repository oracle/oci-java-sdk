/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine;

import com.oracle.bmc.containerengine.requests.*;
import com.oracle.bmc.containerengine.responses.*;

/**
 * API for the Kubernetes Engine service (also known as the Container Engine for Kubernetes
 * service). Use this API to build, deploy, and manage cloud-native applications. For more
 * information, see [Overview of Kubernetes
 * Engine](https://docs.oracle.com/iaas/Content/ContEng/Concepts/contengoverview.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
public interface ContainerEngineAsync extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this region, however, an
     * IllegalArgumentException will be raised.
     *
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     *
     * <p>Note, this will first try to map the region ID to a known Region and call {@link
     * #setRegion(Region) setRegion}.
     *
     * <p>If no known Region could be determined, it will create an endpoint based on the default
     * endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     *
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Determines whether realm specific endpoint should be used or not. Set
     * realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm
     * specific endpoint template, otherwise set it to "false"
     *
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint
     *     template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Initiates cluster migration to use native VCN.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ClusterMigrateToNativeVcnResponse> clusterMigrateToNativeVcn(
            ClusterMigrateToNativeVcnRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ClusterMigrateToNativeVcnRequest, ClusterMigrateToNativeVcnResponse>
                    handler);

    /**
     * Complete cluster credential rotation. Retire old credentials from kubernetes components.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CompleteCredentialRotationResponse> completeCredentialRotation(
            CompleteCredentialRotationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CompleteCredentialRotationRequest, CompleteCredentialRotationResponse>
                    handler);

    /**
     * Create a new cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateClusterResponse> createCluster(
            CreateClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateClusterRequest, CreateClusterResponse>
                    handler);

    /**
     * Create the Kubeconfig YAML for a cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateKubeconfigResponse> createKubeconfig(
            CreateKubeconfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateKubeconfigRequest, CreateKubeconfigResponse>
                    handler);

    /**
     * Create a new node pool.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateNodePoolResponse> createNodePool(
            CreateNodePoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateNodePoolRequest, CreateNodePoolResponse>
                    handler);

    /**
     * Create a new virtual node pool.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateVirtualNodePoolResponse> createVirtualNodePool(
            CreateVirtualNodePoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateVirtualNodePoolRequest, CreateVirtualNodePoolResponse>
                    handler);

    /**
     * Create the specified workloadMapping for a cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateWorkloadMappingResponse> createWorkloadMapping(
            CreateWorkloadMappingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateWorkloadMappingRequest, CreateWorkloadMappingResponse>
                    handler);

    /**
     * Delete a cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteClusterResponse> deleteCluster(
            DeleteClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteClusterRequest, DeleteClusterResponse>
                    handler);

    /**
     * Delete node.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteNodeResponse> deleteNode(
            DeleteNodeRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteNodeRequest, DeleteNodeResponse> handler);

    /**
     * Delete a node pool.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteNodePoolResponse> deleteNodePool(
            DeleteNodePoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteNodePoolRequest, DeleteNodePoolResponse>
                    handler);

    /**
     * Delete a virtual node pool.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteVirtualNodePoolResponse> deleteVirtualNodePool(
            DeleteVirtualNodePoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteVirtualNodePoolRequest, DeleteVirtualNodePoolResponse>
                    handler);

    /**
     * Cancel a work request that has not started.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteWorkRequestResponse> deleteWorkRequest(
            DeleteWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteWorkRequestRequest, DeleteWorkRequestResponse>
                    handler);

    /**
     * Delete workloadMapping for a provisioned cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteWorkloadMappingResponse> deleteWorkloadMapping(
            DeleteWorkloadMappingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteWorkloadMappingRequest, DeleteWorkloadMappingResponse>
                    handler);

    /**
     * Disable addon for a provisioned cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableAddonResponse> disableAddon(
            DisableAddonRequest request,
            com.oracle.bmc.responses.AsyncHandler<DisableAddonRequest, DisableAddonResponse>
                    handler);

    /**
     * Get the specified addon for a cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAddonResponse> getAddon(
            GetAddonRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAddonRequest, GetAddonResponse> handler);

    /**
     * Get the details of a cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetClusterResponse> getCluster(
            GetClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetClusterRequest, GetClusterResponse> handler);

    /**
     * Get details on a cluster's migration to native VCN.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetClusterMigrateToNativeVcnStatusResponse>
            getClusterMigrateToNativeVcnStatus(
                    GetClusterMigrateToNativeVcnStatusRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetClusterMigrateToNativeVcnStatusRequest,
                                    GetClusterMigrateToNativeVcnStatusResponse>
                            handler);

    /**
     * Get options available for clusters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetClusterOptionsResponse> getClusterOptions(
            GetClusterOptionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetClusterOptionsRequest, GetClusterOptionsResponse>
                    handler);

    /**
     * Get cluster credential rotation status.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetCredentialRotationStatusResponse> getCredentialRotationStatus(
            GetCredentialRotationStatusRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCredentialRotationStatusRequest, GetCredentialRotationStatusResponse>
                    handler);

    /**
     * Get the details of a node pool.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetNodePoolResponse> getNodePool(
            GetNodePoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetNodePoolRequest, GetNodePoolResponse> handler);

    /**
     * Get options available for node pools.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetNodePoolOptionsResponse> getNodePoolOptions(
            GetNodePoolOptionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetNodePoolOptionsRequest, GetNodePoolOptionsResponse>
                    handler);

    /**
     * Get the details of a virtual node.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetVirtualNodeResponse> getVirtualNode(
            GetVirtualNodeRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetVirtualNodeRequest, GetVirtualNodeResponse>
                    handler);

    /**
     * Get the details of a virtual node pool.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetVirtualNodePoolResponse> getVirtualNodePool(
            GetVirtualNodePoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetVirtualNodePoolRequest, GetVirtualNodePoolResponse>
                    handler);

    /**
     * Get the details of a work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Get the specified workloadMapping for a cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkloadMappingResponse> getWorkloadMapping(
            GetWorkloadMappingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetWorkloadMappingRequest, GetWorkloadMappingResponse>
                    handler);

    /**
     * Install the specified addon for a cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<InstallAddonResponse> installAddon(
            InstallAddonRequest request,
            com.oracle.bmc.responses.AsyncHandler<InstallAddonRequest, InstallAddonResponse>
                    handler);

    /**
     * Get list of supported addons for a specific kubernetes version.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAddonOptionsResponse> listAddonOptions(
            ListAddonOptionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAddonOptionsRequest, ListAddonOptionsResponse>
                    handler);

    /**
     * List addon for a provisioned cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAddonsResponse> listAddons(
            ListAddonsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAddonsRequest, ListAddonsResponse> handler);

    /**
     * List all the cluster objects in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListClustersResponse> listClusters(
            ListClustersRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListClustersRequest, ListClustersResponse>
                    handler);

    /**
     * List all the node pools in a compartment, and optionally filter by cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListNodePoolsResponse> listNodePools(
            ListNodePoolsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListNodePoolsRequest, ListNodePoolsResponse>
                    handler);

    /**
     * List all the Pod Shapes in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPodShapesResponse> listPodShapes(
            ListPodShapesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPodShapesRequest, ListPodShapesResponse>
                    handler);

    /**
     * List all the virtual node pools in a compartment, and optionally filter by cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListVirtualNodePoolsResponse> listVirtualNodePools(
            ListVirtualNodePoolsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListVirtualNodePoolsRequest, ListVirtualNodePoolsResponse>
                    handler);

    /**
     * List virtual nodes in a virtual node pool.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListVirtualNodesResponse> listVirtualNodes(
            ListVirtualNodesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListVirtualNodesRequest, ListVirtualNodesResponse>
                    handler);

    /**
     * Get the errors of a work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Get the logs of a work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * List all work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * List workloadMappings for a provisioned cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkloadMappingsResponse> listWorkloadMappings(
            ListWorkloadMappingsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkloadMappingsRequest, ListWorkloadMappingsResponse>
                    handler);

    /**
     * perform reboot action to node in cluster
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RebootClusterNodeResponse> rebootClusterNode(
            RebootClusterNodeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RebootClusterNodeRequest, RebootClusterNodeResponse>
                    handler);

    /**
     * perform cycle action to node in cluster
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ReplaceBootVolumeClusterNodeResponse> replaceBootVolumeClusterNode(
            ReplaceBootVolumeClusterNodeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ReplaceBootVolumeClusterNodeRequest,
                            ReplaceBootVolumeClusterNodeResponse>
                    handler);

    /**
     * Start cluster credential rotation by adding new credentials, old credentials will still work
     * after this operation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StartCredentialRotationResponse> startCredentialRotation(
            StartCredentialRotationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StartCredentialRotationRequest, StartCredentialRotationResponse>
                    handler);

    /**
     * Update addon details for a cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAddonResponse> updateAddon(
            UpdateAddonRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateAddonRequest, UpdateAddonResponse> handler);

    /**
     * Update the details of a cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateClusterResponse> updateCluster(
            UpdateClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateClusterRequest, UpdateClusterResponse>
                    handler);

    /**
     * Update the details of the cluster endpoint configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateClusterEndpointConfigResponse> updateClusterEndpointConfig(
            UpdateClusterEndpointConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateClusterEndpointConfigRequest, UpdateClusterEndpointConfigResponse>
                    handler);

    /**
     * Update the details of a node pool.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateNodePoolResponse> updateNodePool(
            UpdateNodePoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateNodePoolRequest, UpdateNodePoolResponse>
                    handler);

    /**
     * Update the details of a virtual node pool.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateVirtualNodePoolResponse> updateVirtualNodePool(
            UpdateVirtualNodePoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateVirtualNodePoolRequest, UpdateVirtualNodePoolResponse>
                    handler);

    /**
     * Update workloadMapping details for a cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateWorkloadMappingResponse> updateWorkloadMapping(
            UpdateWorkloadMappingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateWorkloadMappingRequest, UpdateWorkloadMappingResponse>
                    handler);
}
