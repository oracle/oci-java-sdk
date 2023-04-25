/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery;

import com.oracle.bmc.disasterrecovery.requests.*;
import com.oracle.bmc.disasterrecovery.responses.*;

/**
 * Use the Full Stack Disaster Recovery (FSDR) API to manage disaster recovery for business
 * applications. FSDR is an OCI disaster recovery orchestration and management service that provides
 * comprehensive disaster recovery capabilities for all layers of an application stack, including
 * infrastructure, middleware, database, and application.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public interface DisasterRecoveryAsync extends AutoCloseable {

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
     * Create an association the DR Protection Group identified by *drProtectionGroupId* and another
     * DR Protection Group in a different region.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AssociateDrProtectionGroupResponse> associateDrProtectionGroup(
            AssociateDrProtectionGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AssociateDrProtectionGroupRequest, AssociateDrProtectionGroupResponse>
                    handler);

    /**
     * Cancel the DR Plan Execution indentified by *drPlanExecutionId*.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelDrPlanExecutionResponse> cancelDrPlanExecution(
            CancelDrPlanExecutionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelDrPlanExecutionRequest, CancelDrPlanExecutionResponse>
                    handler);

    /**
     * Cancel the work request identified by *workRequestId*.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler);

    /**
     * Move the DR Protection Group identified by *drProtectionGroupId* to a different compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDrProtectionGroupCompartmentResponse>
            changeDrProtectionGroupCompartment(
                    ChangeDrProtectionGroupCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDrProtectionGroupCompartmentRequest,
                                    ChangeDrProtectionGroupCompartmentResponse>
                            handler);

    /**
     * Creates a new DR Plan of the specified DR Plan type.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDrPlanResponse> createDrPlan(
            CreateDrPlanRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateDrPlanRequest, CreateDrPlanResponse>
                    handler);

    /**
     * Execute a DR Plan for a DR Protection Group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDrPlanExecutionResponse> createDrPlanExecution(
            CreateDrPlanExecutionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDrPlanExecutionRequest, CreateDrPlanExecutionResponse>
                    handler);

    /**
     * Create a new DR Protection Group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDrProtectionGroupResponse> createDrProtectionGroup(
            CreateDrProtectionGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDrProtectionGroupRequest, CreateDrProtectionGroupResponse>
                    handler);

    /**
     * Delete the DR Plan identified by *drPlanId*.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDrPlanResponse> deleteDrPlan(
            DeleteDrPlanRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteDrPlanRequest, DeleteDrPlanResponse>
                    handler);

    /**
     * Delete the DR Plan Execution identified by *drPlanExecutionId*.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDrPlanExecutionResponse> deleteDrPlanExecution(
            DeleteDrPlanExecutionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDrPlanExecutionRequest, DeleteDrPlanExecutionResponse>
                    handler);

    /**
     * Delete the DR Protection Group identified by *drProtectionGroupId*.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDrProtectionGroupResponse> deleteDrProtectionGroup(
            DeleteDrProtectionGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDrProtectionGroupRequest, DeleteDrProtectionGroupResponse>
                    handler);

    /**
     * Delete the association between the DR Protection Group identified by *drProtectionGroupId*.
     * and its peer DR Protection Group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisassociateDrProtectionGroupResponse>
            disassociateDrProtectionGroup(
                    DisassociateDrProtectionGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisassociateDrProtectionGroupRequest,
                                    DisassociateDrProtectionGroupResponse>
                            handler);

    /**
     * Get details for the DR Plan identified by *drPlanId*.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDrPlanResponse> getDrPlan(
            GetDrPlanRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDrPlanRequest, GetDrPlanResponse> handler);

    /**
     * Get details for the DR Plan Execution identified by *drPlanExecutionId*.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDrPlanExecutionResponse> getDrPlanExecution(
            GetDrPlanExecutionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDrPlanExecutionRequest, GetDrPlanExecutionResponse>
                    handler);

    /**
     * Get the DR Protection Group identified by *drProtectionGroupId*.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDrProtectionGroupResponse> getDrProtectionGroup(
            GetDrProtectionGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDrProtectionGroupRequest, GetDrProtectionGroupResponse>
                    handler);

    /**
     * Get the status of the work request identified by *workRequestId*.
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
     * Ignore failed group or step in DR Plan Execution identified by *drPlanExecutionId* and resume
     * execution.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<IgnoreDrPlanExecutionResponse> ignoreDrPlanExecution(
            IgnoreDrPlanExecutionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            IgnoreDrPlanExecutionRequest, IgnoreDrPlanExecutionResponse>
                    handler);

    /**
     * Get a summary list of all DR Plan Executions for a DR Protection Group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDrPlanExecutionsResponse> listDrPlanExecutions(
            ListDrPlanExecutionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDrPlanExecutionsRequest, ListDrPlanExecutionsResponse>
                    handler);

    /**
     * Gets a summary list of all DR Plans for a DR Protection Group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDrPlansResponse> listDrPlans(
            ListDrPlansRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDrPlansRequest, ListDrPlansResponse> handler);

    /**
     * Gets a summary list of all DR Protection Groups in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDrProtectionGroupsResponse> listDrProtectionGroups(
            ListDrProtectionGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDrProtectionGroupsRequest, ListDrProtectionGroupsResponse>
                    handler);

    /**
     * Return a (paginated) list of errors for a given work request.
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
     * Return a (paginated) list of logs for the work request identified by *workRequestId*.
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
     * Pause the DR Plan Execution identified by *drPlanExecutionId*.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PauseDrPlanExecutionResponse> pauseDrPlanExecution(
            PauseDrPlanExecutionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            PauseDrPlanExecutionRequest, PauseDrPlanExecutionResponse>
                    handler);

    /**
     * Resume the DR Plan Execution identified by *drPlanExecutionId*.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ResumeDrPlanExecutionResponse> resumeDrPlanExecution(
            ResumeDrPlanExecutionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ResumeDrPlanExecutionRequest, ResumeDrPlanExecutionResponse>
                    handler);

    /**
     * Retry failed group or step in DR Plan Execution identified by *drPlanExecutionId* and resume
     * execution.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RetryDrPlanExecutionResponse> retryDrPlanExecution(
            RetryDrPlanExecutionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RetryDrPlanExecutionRequest, RetryDrPlanExecutionResponse>
                    handler);

    /**
     * Update the DR Plan identified by *drPlanId*.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDrPlanResponse> updateDrPlan(
            UpdateDrPlanRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateDrPlanRequest, UpdateDrPlanResponse>
                    handler);

    /**
     * Update the DR Plan Execution identified by *drPlanExecutionId*.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDrPlanExecutionResponse> updateDrPlanExecution(
            UpdateDrPlanExecutionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDrPlanExecutionRequest, UpdateDrPlanExecutionResponse>
                    handler);

    /**
     * Update the DR Protection Group identified by *drProtectionGroupId*.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDrProtectionGroupResponse> updateDrProtectionGroup(
            UpdateDrProtectionGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDrProtectionGroupRequest, UpdateDrProtectionGroupResponse>
                    handler);

    /**
     * Update the role of the DR Protection Group identified by *drProtectionGroupId*.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDrProtectionGroupRoleResponse> updateDrProtectionGroupRole(
            UpdateDrProtectionGroupRoleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDrProtectionGroupRoleRequest, UpdateDrProtectionGroupRoleResponse>
                    handler);
}
