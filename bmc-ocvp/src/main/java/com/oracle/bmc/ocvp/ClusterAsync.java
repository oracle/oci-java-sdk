/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp;

import com.oracle.bmc.ocvp.requests.*;
import com.oracle.bmc.ocvp.responses.*;

/**
 * Use the Oracle Cloud VMware API to create SDDCs and manage ESXi hosts and software.
 * For more information, see [Oracle Cloud VMware Solution](https://docs.oracle.com/iaas/Content/VMware/Concepts/ocvsoverview.htm).
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
public interface ClusterAsync extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this region, however, an IllegalArgumentException will be raised.
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Determines whether realm specific endpoint should be used or not.
     * Set realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm specific endpoint template, otherwise set it to "false"
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Create a vSphere Cluster in software-defined data center (SDDC).
     * <p>
     * Use the {@link WorkRequest} operations to track the
     * creation of the Cluster.
     * <p>
     **Important:** You must configure the Cluster's networking resources with the security rules detailed in [Security Rules for Oracle Cloud VMware Solution SDDCs](https://docs.oracle.com/iaas/Content/VMware/Reference/ocvssecurityrules.htm). Otherwise, provisioning the SDDC will fail. The rules are based on the requirements set by VMware.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateClusterResponse> createCluster(
            CreateClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateClusterRequest, CreateClusterResponse>
                    handler);

    /**
     * Deletes the specified Cluster, along with the other resources that were
     * created with the Cluster. For example: the Compute instances, DNS records,
     * and so on.
     * <p>
     * Use the {@link WorkRequest} operations to track the
     * deletion of the Cluster.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteClusterResponse> deleteCluster(
            DeleteClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteClusterRequest, DeleteClusterResponse>
                    handler);

    /**
     * Gets the specified Cluster's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetClusterResponse> getCluster(
            GetClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetClusterRequest, GetClusterResponse> handler);

    /**
     * Lists the Clusters in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListClustersResponse> listClusters(
            ListClustersRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListClustersRequest, ListClustersResponse>
                    handler);

    /**
     * Updates the specified Cluster.
     * <p>
     **Important:** Updating a Cluster affects only certain attributes in the `Cluster`
     * object and does not affect the VMware environment currently running in
     * the Cluster.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateClusterResponse> updateCluster(
            UpdateClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateClusterRequest, UpdateClusterResponse>
                    handler);
}
