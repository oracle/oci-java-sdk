/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics;

import com.oracle.bmc.analytics.requests.*;
import com.oracle.bmc.analytics.responses.*;

/**
 * Analytics API.
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
public interface AnalyticsAsync extends AutoCloseable {

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
     * Change the compartment of an Analytics instance. The operation is long-running
     * and creates a new WorkRequest.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeAnalyticsInstanceCompartmentResponse>
            changeAnalyticsInstanceCompartment(
                    ChangeAnalyticsInstanceCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAnalyticsInstanceCompartmentRequest,
                                    ChangeAnalyticsInstanceCompartmentResponse>
                            handler);

    /**
     * Change an Analytics instance network endpoint. The operation is long-running
     * and creates a new WorkRequest.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeAnalyticsInstanceNetworkEndpointResponse>
            changeAnalyticsInstanceNetworkEndpoint(
                    ChangeAnalyticsInstanceNetworkEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAnalyticsInstanceNetworkEndpointRequest,
                                    ChangeAnalyticsInstanceNetworkEndpointResponse>
                            handler);

    /**
     * Create a new AnalyticsInstance in the specified compartment. The operation is long-running
     * and creates a new WorkRequest.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAnalyticsInstanceResponse> createAnalyticsInstance(
            CreateAnalyticsInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateAnalyticsInstanceRequest, CreateAnalyticsInstanceResponse>
                    handler);

    /**
     * Create an Private access Channel for the Analytics instance. The operation is long-running
     * and creates a new WorkRequest.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreatePrivateAccessChannelResponse> createPrivateAccessChannel(
            CreatePrivateAccessChannelRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreatePrivateAccessChannelRequest, CreatePrivateAccessChannelResponse>
                    handler);

    /**
     * Allows specifying a custom host name to be used to access the analytics instance.  This requires prior setup of DNS entry and certificate
     * for this host.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateVanityUrlResponse> createVanityUrl(
            CreateVanityUrlRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateVanityUrlRequest, CreateVanityUrlResponse>
                    handler);

    /**
     * Terminates the specified Analytics instance. The operation is long-running
     * and creates a new WorkRequest.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAnalyticsInstanceResponse> deleteAnalyticsInstance(
            DeleteAnalyticsInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteAnalyticsInstanceRequest, DeleteAnalyticsInstanceResponse>
                    handler);

    /**
     * Delete an Analytics instance's Private access channel with the given unique identifier key.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeletePrivateAccessChannelResponse> deletePrivateAccessChannel(
            DeletePrivateAccessChannelRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeletePrivateAccessChannelRequest, DeletePrivateAccessChannelResponse>
                    handler);

    /**
     * Allows deleting a previously created vanity url.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteVanityUrlResponse> deleteVanityUrl(
            DeleteVanityUrlRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteVanityUrlRequest, DeleteVanityUrlResponse>
                    handler);

    /**
     * Cancel a work request that has not started yet.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteWorkRequestResponse> deleteWorkRequest(
            DeleteWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteWorkRequestRequest, DeleteWorkRequestResponse>
                    handler);

    /**
     * Info for a specific Analytics instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAnalyticsInstanceResponse> getAnalyticsInstance(
            GetAnalyticsInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAnalyticsInstanceRequest, GetAnalyticsInstanceResponse>
                    handler);

    /**
     * Retrieve private access channel in the specified Analytics Instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPrivateAccessChannelResponse> getPrivateAccessChannel(
            GetPrivateAccessChannelRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPrivateAccessChannelRequest, GetPrivateAccessChannelResponse>
                    handler);

    /**
     * Get the details of a work request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * List Analytics instances.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAnalyticsInstancesResponse> listAnalyticsInstances(
            ListAnalyticsInstancesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAnalyticsInstancesRequest, ListAnalyticsInstancesResponse>
                    handler);

    /**
     * Get the errors of a work request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Get the logs of a work request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * List all work requests in a compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Scale an Analytics instance up or down. The operation is long-running
     * and creates a new WorkRequest.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ScaleAnalyticsInstanceResponse> scaleAnalyticsInstance(
            ScaleAnalyticsInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ScaleAnalyticsInstanceRequest, ScaleAnalyticsInstanceResponse>
                    handler);

    /**
     * Starts the specified Analytics instance. The operation is long-running
     * and creates a new WorkRequest.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<StartAnalyticsInstanceResponse> startAnalyticsInstance(
            StartAnalyticsInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StartAnalyticsInstanceRequest, StartAnalyticsInstanceResponse>
                    handler);

    /**
     * Stop the specified Analytics instance. The operation is long-running
     * and creates a new WorkRequest.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<StopAnalyticsInstanceResponse> stopAnalyticsInstance(
            StopAnalyticsInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StopAnalyticsInstanceRequest, StopAnalyticsInstanceResponse>
                    handler);

    /**
     * Updates certain fields of an Analytics instance. Fields that are not provided in the
     * request will not be updated.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAnalyticsInstanceResponse> updateAnalyticsInstance(
            UpdateAnalyticsInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateAnalyticsInstanceRequest, UpdateAnalyticsInstanceResponse>
                    handler);

    /**
     * Update the Private Access Channel with the given unique identifier key in the specified Analytics Instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePrivateAccessChannelResponse> updatePrivateAccessChannel(
            UpdatePrivateAccessChannelRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdatePrivateAccessChannelRequest, UpdatePrivateAccessChannelResponse>
                    handler);

    /**
     * Allows uploading a new certificate for a vanity url, which will have to be done when the current certificate is expiring.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateVanityUrlResponse> updateVanityUrl(
            UpdateVanityUrlRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateVanityUrlRequest, UpdateVanityUrlResponse>
                    handler);
}
