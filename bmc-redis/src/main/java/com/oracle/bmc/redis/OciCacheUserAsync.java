/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis;

import com.oracle.bmc.redis.requests.*;
import com.oracle.bmc.redis.responses.*;

/**
 * Use the OCI Cache API to create and manage clusters. A cluster is a memory-based storage
 * solution. For more information, see [OCI
 * Cache](https://docs.oracle.com/iaas/Content/ocicache/home.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220315")
public interface OciCacheUserAsync extends AutoCloseable {

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
     * Moves an OCI Cache User from one compartment to another within the same tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeOciCacheUserCompartmentResponse>
            changeOciCacheUserCompartment(
                    ChangeOciCacheUserCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOciCacheUserCompartmentRequest,
                                    ChangeOciCacheUserCompartmentResponse>
                            handler);

    /**
     * Creates a new OCI Cache user. OCI Cache user is required to authenticate to OCI Cache
     * cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOciCacheUserResponse> createOciCacheUser(
            CreateOciCacheUserRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateOciCacheUserRequest, CreateOciCacheUserResponse>
                    handler);

    /**
     * Deletes an existing OCI Cache User based on the OCI cache user unique ID (OCID).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOciCacheUserResponse> deleteOciCacheUser(
            DeleteOciCacheUserRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteOciCacheUserRequest, DeleteOciCacheUserResponse>
                    handler);

    /**
     * Get an existing OCI Cache users based on the ID (OCID).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOciCacheUserResponse> getOciCacheUser(
            GetOciCacheUserRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetOciCacheUserRequest, GetOciCacheUserResponse>
                    handler);

    /**
     * Gets a list of associated redis cluster for an OCI cache user.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAttachedRedisClustersResponse> listAttachedRedisClusters(
            ListAttachedRedisClustersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAttachedRedisClustersRequest, ListAttachedRedisClustersResponse>
                    handler);

    /**
     * Lists the OCI Cache users based on the supplied parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOciCacheUsersResponse> listOciCacheUsers(
            ListOciCacheUsersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListOciCacheUsersRequest, ListOciCacheUsersResponse>
                    handler);

    /**
     * Update an existing OCI Cache User with new details.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOciCacheUserResponse> updateOciCacheUser(
            UpdateOciCacheUserRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateOciCacheUserRequest, UpdateOciCacheUserResponse>
                    handler);
}
