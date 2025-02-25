/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;

/**
 * Use the OS Management Hub API to manage and monitor updates and patches for instances in OCI, your private data center, or 3rd-party clouds.
 * For more information, see [Overview of OS Management Hub](https://docs.oracle.com/iaas/osmh/doc/overview.htm).
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public interface ScheduledJobAsync extends AutoCloseable {

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
     * Moves a scheduled job to another compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeScheduledJobCompartmentResponse>
            changeScheduledJobCompartment(
                    ChangeScheduledJobCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeScheduledJobCompartmentRequest,
                                    ChangeScheduledJobCompartmentResponse>
                            handler);

    /**
     * Creates a new scheduled job.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateScheduledJobResponse> createScheduledJob(
            CreateScheduledJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateScheduledJobRequest, CreateScheduledJobResponse>
                    handler);

    /**
     * Deletes the specified scheduled job.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteScheduledJobResponse> deleteScheduledJob(
            DeleteScheduledJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteScheduledJobRequest, DeleteScheduledJobResponse>
                    handler);

    /**
     * Gets information about the specified scheduled job.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetScheduledJobResponse> getScheduledJob(
            GetScheduledJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetScheduledJobRequest, GetScheduledJobResponse>
                    handler);

    /**
     * Lists scheduled jobs that match the specified compartment or scheduled job [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListScheduledJobsResponse> listScheduledJobs(
            ListScheduledJobsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListScheduledJobsRequest, ListScheduledJobsResponse>
                    handler);

    /**
     * Triggers an already created recurring scheduled job to run immediately instead of waiting for its next regularly
     * scheduled time. This operation only applies to recurring jobs, not one-time scheduled jobs.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RunScheduledJobNowResponse> runScheduledJobNow(
            RunScheduledJobNowRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RunScheduledJobNowRequest, RunScheduledJobNowResponse>
                    handler);

    /**
     * Updates the specified scheduled job's name, description, and other details, such as next execution and recurrence.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateScheduledJobResponse> updateScheduledJob(
            UpdateScheduledJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateScheduledJobRequest, UpdateScheduledJobResponse>
                    handler);
}
