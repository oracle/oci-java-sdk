/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge;

import com.oracle.bmc.cloudbridge.requests.*;
import com.oracle.bmc.cloudbridge.responses.*;

/**
 * API for Oracle Cloud Bridge service.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
public interface DiscoveryAsync extends AutoCloseable {

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
     * Moves a resource into a different compartment. When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeAssetSourceCompartmentResponse> changeAssetSourceCompartment(
            ChangeAssetSourceCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeAssetSourceCompartmentRequest,
                            ChangeAssetSourceCompartmentResponse>
                    handler);

    /**
     * Moves the specified discovery schedule into a different compartment. When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDiscoveryScheduleCompartmentResponse>
            changeDiscoveryScheduleCompartment(
                    ChangeDiscoveryScheduleCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDiscoveryScheduleCompartmentRequest,
                                    ChangeDiscoveryScheduleCompartmentResponse>
                            handler);

    /**
     * Creates an asset source.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAssetSourceResponse> createAssetSource(
            CreateAssetSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateAssetSourceRequest, CreateAssetSourceResponse>
                    handler);

    /**
     * Creates the discovery schedule.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDiscoveryScheduleResponse> createDiscoverySchedule(
            CreateDiscoveryScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDiscoveryScheduleRequest, CreateDiscoveryScheduleResponse>
                    handler);

    /**
     * Deletes the asset source by ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAssetSourceResponse> deleteAssetSource(
            DeleteAssetSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteAssetSourceRequest, DeleteAssetSourceResponse>
                    handler);

    /**
     * Deletes the specified discovery schedule.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDiscoveryScheduleResponse> deleteDiscoverySchedule(
            DeleteDiscoveryScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDiscoveryScheduleRequest, DeleteDiscoveryScheduleResponse>
                    handler);

    /**
     * Gets the asset source by ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAssetSourceResponse> getAssetSource(
            GetAssetSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAssetSourceRequest, GetAssetSourceResponse>
                    handler);

    /**
     * Reads information about the specified discovery schedule.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDiscoveryScheduleResponse> getDiscoverySchedule(
            GetDiscoveryScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDiscoveryScheduleRequest, GetDiscoveryScheduleResponse>
                    handler);

    /**
     * Gets known connections to the asset source by the asset source ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAssetSourceConnectionsResponse> listAssetSourceConnections(
            ListAssetSourceConnectionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAssetSourceConnectionsRequest, ListAssetSourceConnectionsResponse>
                    handler);

    /**
     * Returns a list of asset sources.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAssetSourcesResponse> listAssetSources(
            ListAssetSourcesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAssetSourcesRequest, ListAssetSourcesResponse>
                    handler);

    /**
     * Lists discovery schedules.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDiscoverySchedulesResponse> listDiscoverySchedules(
            ListDiscoverySchedulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDiscoverySchedulesRequest, ListDiscoverySchedulesResponse>
                    handler);

    /**
     * Initiates the process of asset metadata synchronization with the related asset source.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RefreshAssetSourceResponse> refreshAssetSource(
            RefreshAssetSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RefreshAssetSourceRequest, RefreshAssetSourceResponse>
                    handler);

    /**
     * Updates the asset source.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAssetSourceResponse> updateAssetSource(
            UpdateAssetSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateAssetSourceRequest, UpdateAssetSourceResponse>
                    handler);

    /**
     * Updates the specified discovery schedule.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDiscoveryScheduleResponse> updateDiscoverySchedule(
            UpdateDiscoveryScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDiscoveryScheduleRequest, UpdateDiscoveryScheduleResponse>
                    handler);
}
