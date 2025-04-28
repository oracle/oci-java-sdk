/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement;

import com.oracle.bmc.fleetappsmanagement.requests.*;
import com.oracle.bmc.fleetappsmanagement.responses.*;

/**
 * Fleet Application Management provides a centralized platform to help you automate resource
 * management tasks, validate patch compliance, and enhance operational efficiency across an
 * enterprise.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
public interface FleetAppsManagementOperationsAsync extends AutoCloseable {

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
     * Creates a new Patch.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreatePatchResponse> createPatch(
            CreatePatchRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreatePatchRequest, CreatePatchResponse> handler);

    /**
     * Create a SchedulerDefinition to perform lifecycle operations.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSchedulerDefinitionResponse> createSchedulerDefinition(
            CreateSchedulerDefinitionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSchedulerDefinitionRequest, CreateSchedulerDefinitionResponse>
                    handler);

    /**
     * Deletes a Patch resource by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeletePatchResponse> deletePatch(
            DeletePatchRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeletePatchRequest, DeletePatchResponse> handler);

    /**
     * Deletes a SchedulerDefinition resource by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSchedulerDefinitionResponse> deleteSchedulerDefinition(
            DeleteSchedulerDefinitionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSchedulerDefinitionRequest, DeleteSchedulerDefinitionResponse>
                    handler);

    /**
     * Delete a lifecycle operation schedule in Fleet Application Management.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSchedulerJobResponse> deleteSchedulerJob(
            DeleteSchedulerJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSchedulerJobRequest, DeleteSchedulerJobResponse>
                    handler);

    /**
     * Generate Compliance Report
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ExportComplianceReportResponse> exportComplianceReport(
            ExportComplianceReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ExportComplianceReportRequest, ExportComplianceReportResponse>
                    handler);

    /**
     * Get Task Execution by Identifier for a Resource within an action group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExecutionResponse> getExecution(
            GetExecutionRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetExecutionRequest, GetExecutionResponse>
                    handler);

    /**
     * Gets activity details by identifier for a job.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetJobActivityResponse> getJobActivity(
            GetJobActivityRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJobActivityRequest, GetJobActivityResponse>
                    handler);

    /**
     * Gets a Patch by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPatchResponse> getPatch(
            GetPatchRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPatchRequest, GetPatchResponse> handler);

    /**
     * Get the details of a SchedulerDefinition that performs lifecycle management operations.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSchedulerDefinitionResponse> getSchedulerDefinition(
            GetSchedulerDefinitionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSchedulerDefinitionRequest, GetSchedulerDefinitionResponse>
                    handler);

    /**
     * Get the details of a lifecycle management operations job in Fleet Application Management.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSchedulerJobResponse> getSchedulerJob(
            GetSchedulerJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSchedulerJobRequest, GetSchedulerJobResponse>
                    handler);

    /**
     * Gets a list of complianceDetails.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListComplianceRecordsResponse> listComplianceRecords(
            ListComplianceRecordsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListComplianceRecordsRequest, ListComplianceRecordsResponse>
                    handler);

    /**
     * Returns a list of Task Executions for a Resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListExecutionsResponse> listExecutions(
            ListExecutionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListExecutionsRequest, ListExecutionsResponse>
                    handler);

    /**
     * Returns a list of Patches.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPatchesResponse> listPatches(
            ListPatchesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPatchesRequest, ListPatchesResponse> handler);

    /**
     * Returns a list of resources for an Activity Execution.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListResourcesResponse> listResources(
            ListResourcesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListResourcesRequest, ListResourcesResponse>
                    handler);

    /**
     * Returns a list of ScheduledFleets.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListScheduledFleetsResponse> listScheduledFleets(
            ListScheduledFleetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListScheduledFleetsRequest, ListScheduledFleetsResponse>
                    handler);

    /**
     * List all lifecycle management schedules in Fleet Application Management.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSchedulerDefinitionsResponse> listSchedulerDefinitions(
            ListSchedulerDefinitionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSchedulerDefinitionsRequest, ListSchedulerDefinitionsResponse>
                    handler);

    /**
     * List scheduled lifecycle operation jobs in Fleet Application Management.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSchedulerJobsResponse> listSchedulerJobs(
            ListSchedulerJobsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSchedulerJobsRequest, ListSchedulerJobsResponse>
                    handler);

    /**
     * Returns a list of Steps for an Activity Execution.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListStepsResponse> listSteps(
            ListStepsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListStepsRequest, ListStepsResponse> handler);

    /**
     * Manage execution actions for a Job like retrying or pausing a task.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ManageJobExecutionResponse> manageJobExecution(
            ManageJobExecutionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ManageJobExecutionRequest, ManageJobExecutionResponse>
                    handler);

    /**
     * Retrieve aggregated summary information of ComplianceRecords within a Tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeComplianceRecordCountsResponse>
            summarizeComplianceRecordCounts(
                    SummarizeComplianceRecordCountsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeComplianceRecordCountsRequest,
                                    SummarizeComplianceRecordCountsResponse>
                            handler);

    /**
     * Retrieve aggregated summary information of Managed Entities within a Tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeManagedEntityCountsResponse> summarizeManagedEntityCounts(
            SummarizeManagedEntityCountsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeManagedEntityCountsRequest,
                            SummarizeManagedEntityCountsResponse>
                    handler);

    /**
     * Retrieve aggregated summary information of Scheduler Jobs within a Tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeSchedulerJobCountsResponse> summarizeSchedulerJobCounts(
            SummarizeSchedulerJobCountsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeSchedulerJobCountsRequest, SummarizeSchedulerJobCountsResponse>
                    handler);

    /**
     * Updates the Patch
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePatchResponse> updatePatch(
            UpdatePatchRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdatePatchRequest, UpdatePatchResponse> handler);

    /**
     * Update the details of a SchedulerDefinition that performs lifecycle management operations.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSchedulerDefinitionResponse> updateSchedulerDefinition(
            UpdateSchedulerDefinitionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSchedulerDefinitionRequest, UpdateSchedulerDefinitionResponse>
                    handler);

    /**
     * Update a lifecycle operation job schedule in Fleet Application Management.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSchedulerJobResponse> updateSchedulerJob(
            UpdateSchedulerJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSchedulerJobRequest, UpdateSchedulerJobResponse>
                    handler);
}
