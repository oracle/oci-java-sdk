/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public interface FleetAppsManagementRunbooksAsync extends AutoCloseable {

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
     * Moves a Runbook into a different compartment within the same tenancy. For information about
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
    java.util.concurrent.Future<ChangeRunbookCompartmentResponse> changeRunbookCompartment(
            ChangeRunbookCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeRunbookCompartmentRequest, ChangeRunbookCompartmentResponse>
                    handler);

    /**
     * Moves a task record into a different compartment within the same tenancy. For information
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
    java.util.concurrent.Future<ChangeTaskRecordCompartmentResponse> changeTaskRecordCompartment(
            ChangeTaskRecordCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeTaskRecordCompartmentRequest, ChangeTaskRecordCompartmentResponse>
                    handler);

    /**
     * Creates a runbook.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateRunbookResponse> createRunbook(
            CreateRunbookRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateRunbookRequest, CreateRunbookResponse>
                    handler);

    /**
     * Add RunbookVersion in Fleet Application Management.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateRunbookVersionResponse> createRunbookVersion(
            CreateRunbookVersionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateRunbookVersionRequest, CreateRunbookVersionResponse>
                    handler);

    /**
     * Creates a new task record.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateTaskRecordResponse> createTaskRecord(
            CreateTaskRecordRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateTaskRecordRequest, CreateTaskRecordResponse>
                    handler);

    /**
     * Deletes a runbook specified by the identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteRunbookResponse> deleteRunbook(
            DeleteRunbookRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteRunbookRequest, DeleteRunbookResponse>
                    handler);

    /**
     * Removes a Runbook Version from the runbook in Fleet Application Management.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteRunbookVersionResponse> deleteRunbookVersion(
            DeleteRunbookVersionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteRunbookVersionRequest, DeleteRunbookVersionResponse>
                    handler);

    /**
     * Deletes the task record specified by an identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTaskRecordResponse> deleteTaskRecord(
            DeleteTaskRecordRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteTaskRecordRequest, DeleteTaskRecordResponse>
                    handler);

    /**
     * Export the specified version of the runbook.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ExportRunbookResponse> exportRunbook(
            ExportRunbookRequest request,
            com.oracle.bmc.responses.AsyncHandler<ExportRunbookRequest, ExportRunbookResponse>
                    handler);

    /**
     * Export the specified version of the runbook.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ExportRunbookVersionResponse> exportRunbookVersion(
            ExportRunbookVersionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ExportRunbookVersionRequest, ExportRunbookVersionResponse>
                    handler);

    /**
     * Find runbook export Dependencies
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<FindRunbookExportDependencyResponse> findRunbookExportDependency(
            FindRunbookExportDependencyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            FindRunbookExportDependencyRequest, FindRunbookExportDependencyResponse>
                    handler);

    /**
     * Find runbook import Dependencies
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<FindRunbookImportDependencyResponse> findRunbookImportDependency(
            FindRunbookImportDependencyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            FindRunbookImportDependencyRequest, FindRunbookImportDependencyResponse>
                    handler);

    /**
     * Get the details of a runbook in Fleet Application Management.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetRunbookResponse> getRunbook(
            GetRunbookRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetRunbookRequest, GetRunbookResponse> handler);

    /**
     * Get the runbook export status for provided runbook and exportId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetRunbookExportResponse> getRunbookExport(
            GetRunbookExportRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetRunbookExportRequest, GetRunbookExportResponse>
                    handler);

    /**
     * Get the runbook import status for provided runbook and importId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetRunbookImportResponse> getRunbookImport(
            GetRunbookImportRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetRunbookImportRequest, GetRunbookImportResponse>
                    handler);

    /**
     * Gets a Runbook Version by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetRunbookVersionResponse> getRunbookVersion(
            GetRunbookVersionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetRunbookVersionRequest, GetRunbookVersionResponse>
                    handler);

    /**
     * Gets information for the specified task record.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTaskRecordResponse> getTaskRecord(
            GetTaskRecordRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTaskRecordRequest, GetTaskRecordResponse>
                    handler);

    /**
     * Import the specified version of the runbook.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ImportRunbookResponse> importRunbook(
            ImportRunbookRequest request,
            com.oracle.bmc.responses.AsyncHandler<ImportRunbookRequest, ImportRunbookResponse>
                    handler);

    /**
     * Precheck for import runbook.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ImportRunbookPrecheckResponse> importRunbookPrecheck(
            ImportRunbookPrecheckRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ImportRunbookPrecheckRequest, ImportRunbookPrecheckResponse>
                    handler);

    /**
     * Export the specified version of the runbook.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ImportRunbookVersionResponse> importRunbookVersion(
            ImportRunbookVersionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ImportRunbookVersionRequest, ImportRunbookVersionResponse>
                    handler);

    /**
     * Returns a list of all the Runbook export status in the specified compartment. The query
     * parameter `compartmentId` is required.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListRunbookExportStatusesResponse> listRunbookExportStatuses(
            ListRunbookExportStatusesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListRunbookExportStatusesRequest, ListRunbookExportStatusesResponse>
                    handler);

    /**
     * Returns a list of all the Runbook import status in the specified compartment. The query
     * parameter `compartmentId` is required.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListRunbookImportStatusesResponse> listRunbookImportStatuses(
            ListRunbookImportStatusesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListRunbookImportStatusesRequest, ListRunbookImportStatusesResponse>
                    handler);

    /**
     * List versions for a runbook in Fleet Application Management.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListRunbookVersionsResponse> listRunbookVersions(
            ListRunbookVersionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListRunbookVersionsRequest, ListRunbookVersionsResponse>
                    handler);

    /**
     * Returns a list of all the runbooks in the specified compartment. The query parameter
     * `compartmentId` is required unless the query parameter `id` is specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListRunbooksResponse> listRunbooks(
            ListRunbooksRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListRunbooksRequest, ListRunbooksResponse>
                    handler);

    /**
     * Returns a list of all the task records in the specified compartment. The query parameter
     * `compartmentId` is required unless the query parameter `id` is specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTaskRecordsResponse> listTaskRecords(
            ListTaskRecordsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTaskRecordsRequest, ListTaskRecordsResponse>
                    handler);

    /**
     * Publish the specified version of the runbook. The specified version of the runbook becomes
     * acitve when it is published.Only active versions of runbook can be used in execution.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PublishRunbookResponse> publishRunbook(
            PublishRunbookRequest request,
            com.oracle.bmc.responses.AsyncHandler<PublishRunbookRequest, PublishRunbookResponse>
                    handler);

    /**
     * Set a runbook as default.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SetDefaultRunbookResponse> setDefaultRunbook(
            SetDefaultRunbookRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SetDefaultRunbookRequest, SetDefaultRunbookResponse>
                    handler);

    /**
     * Updates the runbook specified by the identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateRunbookResponse> updateRunbook(
            UpdateRunbookRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateRunbookRequest, UpdateRunbookResponse>
                    handler);

    /**
     * Updates the RunbookVersion.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateRunbookVersionResponse> updateRunbookVersion(
            UpdateRunbookVersionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateRunbookVersionRequest, UpdateRunbookVersionResponse>
                    handler);

    /**
     * Updates certain attributes for the specified task record.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTaskRecordResponse> updateTaskRecord(
            UpdateTaskRecordRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateTaskRecordRequest, UpdateTaskRecordResponse>
                    handler);
}
