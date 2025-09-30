/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp;

import com.oracle.bmc.ocvp.requests.*;
import com.oracle.bmc.ocvp.responses.*;

/**
 * Use the Oracle Cloud VMware API to create SDDCs and manage ESXi hosts and software. For more
 * information, see [Oracle Cloud VMware
 * Solution](https://docs.oracle.com/iaas/Content/VMware/Concepts/ocvsoverview.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
public interface DatastoreClusterAsync extends AutoCloseable {

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
     * Add the specified Datastore to the provided Datastore Cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddDatastoreToDatastoreClusterResponse>
            addDatastoreToDatastoreCluster(
                    AddDatastoreToDatastoreClusterRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AddDatastoreToDatastoreClusterRequest,
                                    AddDatastoreToDatastoreClusterResponse>
                            handler);

    /**
     * Attach the specified Datastore Cluster to the provided Vmware Cluster.
     *
     * <p>Use the {@link WorkRequest} operations to track the attachment of the Datastore.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AttachDatastoreClusterToClusterResponse>
            attachDatastoreClusterToCluster(
                    AttachDatastoreClusterToClusterRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AttachDatastoreClusterToClusterRequest,
                                    AttachDatastoreClusterToClusterResponse>
                            handler);

    /**
     * Attach the specified Datastore Cluster to the provided ESXi Hosts.
     *
     * <p>Use the {@link WorkRequest} operations to track the attachment of the Datastore.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AttachDatastoreClusterToEsxiHostResponse>
            attachDatastoreClusterToEsxiHost(
                    AttachDatastoreClusterToEsxiHostRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AttachDatastoreClusterToEsxiHostRequest,
                                    AttachDatastoreClusterToEsxiHostResponse>
                            handler);

    /**
     * Moves an Datastore Cluster into a different compartment within the same tenancy. For
     * information about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDatastoreClusterCompartmentResponse>
            changeDatastoreClusterCompartment(
                    ChangeDatastoreClusterCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatastoreClusterCompartmentRequest,
                                    ChangeDatastoreClusterCompartmentResponse>
                            handler);

    /**
     * Creates a Oracle Cloud VMware Solution Datastore Cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDatastoreClusterResponse> createDatastoreCluster(
            CreateDatastoreClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDatastoreClusterRequest, CreateDatastoreClusterResponse>
                    handler);

    /**
     * Deletes the specified Datastore Cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDatastoreClusterResponse> deleteDatastoreCluster(
            DeleteDatastoreClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDatastoreClusterRequest, DeleteDatastoreClusterResponse>
                    handler);

    /**
     * Detach the specified Datastore Cluster from the provided Vmware Cluster.
     *
     * <p>Use the {@link WorkRequest} operations to track the detachment of the Datastore.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DetachDatastoreClusterFromClusterResponse>
            detachDatastoreClusterFromCluster(
                    DetachDatastoreClusterFromClusterRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DetachDatastoreClusterFromClusterRequest,
                                    DetachDatastoreClusterFromClusterResponse>
                            handler);

    /**
     * Detach the specified Datastore Cluster from the provided ESXi Hosts.
     *
     * <p>Use the {@link WorkRequest} operations to track the detachment of the Datastore.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DetachDatastoreClusterFromEsxiHostResponse>
            detachDatastoreClusterFromEsxiHost(
                    DetachDatastoreClusterFromEsxiHostRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DetachDatastoreClusterFromEsxiHostRequest,
                                    DetachDatastoreClusterFromEsxiHostResponse>
                            handler);

    /**
     * Get the specified Datastore Cluster information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDatastoreClusterResponse> getDatastoreCluster(
            GetDatastoreClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDatastoreClusterRequest, GetDatastoreClusterResponse>
                    handler);

    /**
     * List the Datastore Clusters in the specified compartment. The list can be filtered by
     * compartment, Datastore Cluster, Display name and Lifecycle state
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDatastoreClustersResponse> listDatastoreClusters(
            ListDatastoreClustersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDatastoreClustersRequest, ListDatastoreClustersResponse>
                    handler);

    /**
     * Remove the specified Datastore from the provided Datastore Cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemoveDatastoreFromDatastoreClusterResponse>
            removeDatastoreFromDatastoreCluster(
                    RemoveDatastoreFromDatastoreClusterRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveDatastoreFromDatastoreClusterRequest,
                                    RemoveDatastoreFromDatastoreClusterResponse>
                            handler);

    /**
     * Updates the specified Datastore Cluster.
     *
     * <p>*Important:** Updating a Datastore Cluster affects only certain attributes in the
     * `Datastore Cluster` object and does not affect the VMware environment currently running.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDatastoreClusterResponse> updateDatastoreCluster(
            UpdateDatastoreClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDatastoreClusterRequest, UpdateDatastoreClusterResponse>
                    handler);
}
