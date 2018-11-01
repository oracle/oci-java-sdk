/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.resourcesearch;

import com.oracle.bmc.resourcesearch.requests.*;
import com.oracle.bmc.resourcesearch.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.4")
public interface ResourceSearchAsync extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

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
     * Gets detailed information about a resource type by using the resource type name.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetResourceTypeResponse> getResourceType(
            GetResourceTypeRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetResourceTypeRequest, GetResourceTypeResponse>
                    handler);

    /**
     * Lists all resource types that you can search or query for.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListResourceTypesResponse> listResourceTypes(
            ListResourceTypesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListResourceTypesRequest, ListResourceTypesResponse>
                    handler);

    /**
     * Queries any and all compartments in the tenancy to find resources that match the specified criteria.
     * Results include resources that you have permission to view and can span different resource types.
     * You can also sort results based on a specified resource attribute.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SearchResourcesResponse> searchResources(
            SearchResourcesRequest request,
            com.oracle.bmc.responses.AsyncHandler<SearchResourcesRequest, SearchResourcesResponse>
                    handler);
}
