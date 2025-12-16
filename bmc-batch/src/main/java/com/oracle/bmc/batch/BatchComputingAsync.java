/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch;

import com.oracle.bmc.batch.requests.*;
import com.oracle.bmc.batch.responses.*;

/**
 * Use the Batch Control Plane API to encapsulate and manage all aspects of computationally
 * intensive jobs.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
public interface BatchComputingAsync extends AutoCloseable {

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
     * Cancels a batch job.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelBatchJobResponse> cancelBatchJob(
            CancelBatchJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<CancelBatchJobRequest, CancelBatchJobResponse>
                    handler);

    /**
     * Moves a batch context into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeBatchContextCompartmentResponse>
            changeBatchContextCompartment(
                    ChangeBatchContextCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeBatchContextCompartmentRequest,
                                    ChangeBatchContextCompartmentResponse>
                            handler);

    /**
     * Moves a batch job into a different compartment within the same tenancy. For information about
     * moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeBatchJobCompartmentResponse> changeBatchJobCompartment(
            ChangeBatchJobCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeBatchJobCompartmentRequest, ChangeBatchJobCompartmentResponse>
                    handler);

    /**
     * Moves a batch job pool into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeBatchJobPoolCompartmentResponse>
            changeBatchJobPoolCompartment(
                    ChangeBatchJobPoolCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeBatchJobPoolCompartmentRequest,
                                    ChangeBatchJobPoolCompartmentResponse>
                            handler);

    /**
     * Moves a batch task environment into a different compartment within the same tenancy. For
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
    java.util.concurrent.Future<ChangeBatchTaskEnvironmentCompartmentResponse>
            changeBatchTaskEnvironmentCompartment(
                    ChangeBatchTaskEnvironmentCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeBatchTaskEnvironmentCompartmentRequest,
                                    ChangeBatchTaskEnvironmentCompartmentResponse>
                            handler);

    /**
     * Moves a batch task profile into a different compartment within the same tenancy. For
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
    java.util.concurrent.Future<ChangeBatchTaskProfileCompartmentResponse>
            changeBatchTaskProfileCompartment(
                    ChangeBatchTaskProfileCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeBatchTaskProfileCompartmentRequest,
                                    ChangeBatchTaskProfileCompartmentResponse>
                            handler);

    /**
     * Creates a batch context.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateBatchContextResponse> createBatchContext(
            CreateBatchContextRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateBatchContextRequest, CreateBatchContextResponse>
                    handler);

    /**
     * Creates a batch job.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateBatchJobResponse> createBatchJob(
            CreateBatchJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateBatchJobRequest, CreateBatchJobResponse>
                    handler);

    /**
     * Creates a batch job pool.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateBatchJobPoolResponse> createBatchJobPool(
            CreateBatchJobPoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateBatchJobPoolRequest, CreateBatchJobPoolResponse>
                    handler);

    /**
     * Creates a batch task environment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateBatchTaskEnvironmentResponse> createBatchTaskEnvironment(
            CreateBatchTaskEnvironmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateBatchTaskEnvironmentRequest, CreateBatchTaskEnvironmentResponse>
                    handler);

    /**
     * Creates a batch task profile.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateBatchTaskProfileResponse> createBatchTaskProfile(
            CreateBatchTaskProfileRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateBatchTaskProfileRequest, CreateBatchTaskProfileResponse>
                    handler);

    /**
     * Deletes a batch context. All batch job pools associated with the batch context must be
     * deleted beforehand.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteBatchContextResponse> deleteBatchContext(
            DeleteBatchContextRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteBatchContextRequest, DeleteBatchContextResponse>
                    handler);

    /**
     * Deletes a batch job pool. All batch jobs associated with the batch job pool must be canceled
     * beforehand.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteBatchJobPoolResponse> deleteBatchJobPool(
            DeleteBatchJobPoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteBatchJobPoolRequest, DeleteBatchJobPoolResponse>
                    handler);

    /**
     * Deletes a batch task environment. All batch tasks associated with the batch task environment
     * must be canceled beforehand.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteBatchTaskEnvironmentResponse> deleteBatchTaskEnvironment(
            DeleteBatchTaskEnvironmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteBatchTaskEnvironmentRequest, DeleteBatchTaskEnvironmentResponse>
                    handler);

    /**
     * Deletes a batch task profile. All batch tasks associated with the batch task profile must be
     * canceled beforehand.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteBatchTaskProfileResponse> deleteBatchTaskProfile(
            DeleteBatchTaskProfileRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteBatchTaskProfileRequest, DeleteBatchTaskProfileResponse>
                    handler);

    /**
     * Gets information about a batch context.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetBatchContextResponse> getBatchContext(
            GetBatchContextRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetBatchContextRequest, GetBatchContextResponse>
                    handler);

    /**
     * Gets information about a batch job.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetBatchJobResponse> getBatchJob(
            GetBatchJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetBatchJobRequest, GetBatchJobResponse> handler);

    /**
     * Gets information about a batch job pool.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetBatchJobPoolResponse> getBatchJobPool(
            GetBatchJobPoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetBatchJobPoolRequest, GetBatchJobPoolResponse>
                    handler);

    /**
     * Gets a specific batch task associated with a batch job by its name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetBatchTaskResponse> getBatchTask(
            GetBatchTaskRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetBatchTaskRequest, GetBatchTaskResponse>
                    handler);

    /**
     * Gets information about a batch task environment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetBatchTaskEnvironmentResponse> getBatchTaskEnvironment(
            GetBatchTaskEnvironmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetBatchTaskEnvironmentRequest, GetBatchTaskEnvironmentResponse>
                    handler);

    /**
     * Gets information about a batch task profile.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetBatchTaskProfileResponse> getBatchTaskProfile(
            GetBatchTaskProfileRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetBatchTaskProfileRequest, GetBatchTaskProfileResponse>
                    handler);

    /**
     * Gets the details of a work request.
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
     * Lists the shapes allowed to be specified during batch context creation. Ordered by the shape
     * name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListBatchContextShapesResponse> listBatchContextShapes(
            ListBatchContextShapesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListBatchContextShapesRequest, ListBatchContextShapesResponse>
                    handler);

    /**
     * Lists the batch contexts by compartment or context
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). You can filter
     * and sort them by various properties like lifecycle state, name and also ocid. All properties
     * require an exact match. List operation only provides a summary information, use
     * GetBatchContext to get the full details on a specific context
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListBatchContextsResponse> listBatchContexts(
            ListBatchContextsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListBatchContextsRequest, ListBatchContextsResponse>
                    handler);

    /**
     * Lists the batch job pools by compartment or job pool
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). You can filter
     * and sort them by various properties like lifecycle state, display name and also ocid. All
     * properties require an exact match. List operation only provides a summary information, use
     * GetBatchJobPool to get the full details on a specific context
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListBatchJobPoolsResponse> listBatchJobPools(
            ListBatchJobPoolsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListBatchJobPoolsRequest, ListBatchJobPoolsResponse>
                    handler);

    /**
     * Lists the batch tasks by batch job
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). You can filter
     * and sort them by various properties like lifecycle state, name and also ocid. All properties
     * require an exact match. List operation only provides a summary information, use GetBatchTask
     * to get the full details on a specific context List is incomplete until jobs lifecycle is
     * in_progress
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListBatchJobTasksResponse> listBatchJobTasks(
            ListBatchJobTasksRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListBatchJobTasksRequest, ListBatchJobTasksResponse>
                    handler);

    /**
     * Lists the batch jobs by compartment or job
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). You can filter
     * and sort them by various properties like lifecycle state, display name and also ocid. All
     * properties require an exact match. List operation only provides a summary information, use
     * GetBatchJob to get the full details on a specific context
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListBatchJobsResponse> listBatchJobs(
            ListBatchJobsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListBatchJobsRequest, ListBatchJobsResponse>
                    handler);

    /**
     * Lists the task environments by compartment or environment
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). You can filter
     * and sort them by various properties like lifecycle state, display name and also ocid. All
     * properties require an exact match. List operation only provides a summary information, use
     * GetBatchTaskEnvironment to get the full details on a specific context
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListBatchTaskEnvironmentsResponse> listBatchTaskEnvironments(
            ListBatchTaskEnvironmentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListBatchTaskEnvironmentsRequest, ListBatchTaskEnvironmentsResponse>
                    handler);

    /**
     * Lists the task profiles by compartment or profile
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). You can filter
     * and sort them by various properties like lifecycle state, name and also ocid. All properties
     * require an exact match. List operation only provides a summary information, use
     * GetBatchTaskProfile to get the full details on a specific context
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListBatchTaskProfilesResponse> listBatchTaskProfiles(
            ListBatchTaskProfilesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListBatchTaskProfilesRequest, ListBatchTaskProfilesResponse>
                    handler);

    /**
     * Lists the batch tasks associated with batch jobs.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListBatchTasksResponse> listBatchTasks(
            ListBatchTasksRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListBatchTasksRequest, ListBatchTasksResponse>
                    handler);

    /**
     * Lists the errors for a work request.
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
     * Lists the logs for a work request.
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
     * Lists the work requests in a compartment.
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
     * Pauses the batch job and all its tasks.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PauseBatchJobResponse> pauseBatchJob(
            PauseBatchJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<PauseBatchJobRequest, PauseBatchJobResponse>
                    handler);

    /**
     * Activates a batch context to accept new jobs.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StartBatchContextResponse> startBatchContext(
            StartBatchContextRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StartBatchContextRequest, StartBatchContextResponse>
                    handler);

    /**
     * Activates the batch job pool.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StartBatchJobPoolResponse> startBatchJobPool(
            StartBatchJobPoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StartBatchJobPoolRequest, StartBatchJobPoolResponse>
                    handler);

    /**
     * Stops a batch context from accepting new jobs.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StopBatchContextResponse> stopBatchContext(
            StopBatchContextRequest request,
            com.oracle.bmc.responses.AsyncHandler<StopBatchContextRequest, StopBatchContextResponse>
                    handler);

    /**
     * Deactivates the batch job pool.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StopBatchJobPoolResponse> stopBatchJobPool(
            StopBatchJobPoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<StopBatchJobPoolRequest, StopBatchJobPoolResponse>
                    handler);

    /**
     * Resumes the batch job and all its tasks.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UnpauseBatchJobResponse> unpauseBatchJob(
            UnpauseBatchJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<UnpauseBatchJobRequest, UnpauseBatchJobResponse>
                    handler);

    /**
     * Updates a batch context.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateBatchContextResponse> updateBatchContext(
            UpdateBatchContextRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateBatchContextRequest, UpdateBatchContextResponse>
                    handler);

    /**
     * Updates a batch job.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateBatchJobResponse> updateBatchJob(
            UpdateBatchJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateBatchJobRequest, UpdateBatchJobResponse>
                    handler);

    /**
     * Updates a batch job pool.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateBatchJobPoolResponse> updateBatchJobPool(
            UpdateBatchJobPoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateBatchJobPoolRequest, UpdateBatchJobPoolResponse>
                    handler);

    /**
     * Updates a batch task environment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateBatchTaskEnvironmentResponse> updateBatchTaskEnvironment(
            UpdateBatchTaskEnvironmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateBatchTaskEnvironmentRequest, UpdateBatchTaskEnvironmentResponse>
                    handler);

    /**
     * Updates a batch task profile.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateBatchTaskProfileResponse> updateBatchTaskProfile(
            UpdateBatchTaskProfileRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateBatchTaskProfileRequest, UpdateBatchTaskProfileResponse>
                    handler);
}
