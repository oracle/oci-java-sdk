/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud;

import com.oracle.bmc.dbmulticloud.requests.*;
import com.oracle.bmc.dbmulticloud.responses.*;

/**
 * 1. Oracle Azure Connector Resource: This is for installing Azure Arc Server in ExaCS VM Cluster.
 * There are two way to install Azure Arc Server (Azure Identity) in ExaCS VMCluster. a. Using
 * Bearer Access Token or b. By providing Authentication token
 *
 * <p>2. Oracle Azure Blob Container Resource: This is for to capture Azure Container details and
 * same will be used in multiple ExaCS VMCluster to mount the Azure Container.
 *
 * <p>3. Oracle Azure Blob Mount Resource: This is for to mount Azure Container in ExaCS VMCluster
 * using Oracle Azure Connector and Oracle Azure Blob Container Resource.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
public interface MultiCloudResourceDiscoveryAsync extends AutoCloseable {

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
     * Moves the Oracle Azure Vault resource into a different compartment. When provided, 'If-Match'
     * is checked against 'ETag' values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeMultiCloudResourceDiscoveryCompartmentResponse>
            changeMultiCloudResourceDiscoveryCompartment(
                    ChangeMultiCloudResourceDiscoveryCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMultiCloudResourceDiscoveryCompartmentRequest,
                                    ChangeMultiCloudResourceDiscoveryCompartmentResponse>
                            handler);

    /**
     * Discover Azure Vaults and Keys based on the provided information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateMultiCloudResourceDiscoveryResponse>
            createMultiCloudResourceDiscovery(
                    CreateMultiCloudResourceDiscoveryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateMultiCloudResourceDiscoveryRequest,
                                    CreateMultiCloudResourceDiscoveryResponse>
                            handler);

    /**
     * Delete Multi Cloud Discovery resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMultiCloudResourceDiscoveryResponse>
            deleteMultiCloudResourceDiscovery(
                    DeleteMultiCloudResourceDiscoveryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteMultiCloudResourceDiscoveryRequest,
                                    DeleteMultiCloudResourceDiscoveryResponse>
                            handler);

    /**
     * Get Multi Cloud Discovered Resource Details form a particular resource ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetMultiCloudResourceDiscoveryResponse>
            getMultiCloudResourceDiscovery(
                    GetMultiCloudResourceDiscoveryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetMultiCloudResourceDiscoveryRequest,
                                    GetMultiCloudResourceDiscoveryResponse>
                            handler);

    /**
     * Lists the all Multi Cloud Resource Discovery based on filters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListMultiCloudResourceDiscoveriesResponse>
            listMultiCloudResourceDiscoveries(
                    ListMultiCloudResourceDiscoveriesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListMultiCloudResourceDiscoveriesRequest,
                                    ListMultiCloudResourceDiscoveriesResponse>
                            handler);

    /**
     * Modifies the existing Azure Discovered Resource for a given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMultiCloudResourceDiscoveryResponse>
            updateMultiCloudResourceDiscovery(
                    UpdateMultiCloudResourceDiscoveryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateMultiCloudResourceDiscoveryRequest,
                                    UpdateMultiCloudResourceDiscoveryResponse>
                            handler);
}
