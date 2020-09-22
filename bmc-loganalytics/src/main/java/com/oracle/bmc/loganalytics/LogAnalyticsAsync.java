/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics;

import com.oracle.bmc.loganalytics.requests.*;
import com.oracle.bmc.loganalytics.responses.*;

/**
 * The LogAnalytics API for the LogAnalytics service.
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public interface LogAnalyticsAsync extends AutoCloseable {

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
     * Adds association between input source log analytics entity and destination entities.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddEntityAssociationResponse> addEntityAssociation(
            AddEntityAssociationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddEntityAssociationRequest, AddEntityAssociationResponse>
                    handler);

    /**
     * get basic information about a specified set of labels
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<BatchGetBasicInfoResponse> batchGetBasicInfo(
            BatchGetBasicInfoRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BatchGetBasicInfoRequest, BatchGetBasicInfoResponse>
                    handler);

    /**
     * Cancel/Remove query job work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CancelQueryWorkRequestResponse> cancelQueryWorkRequest(
            CancelQueryWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelQueryWorkRequestRequest, CancelQueryWorkRequestResponse>
                    handler);

    /**
     * Update the compartment of the log analytics entity with the given id.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeLogAnalyticsEntityCompartmentResponse>
            changeLogAnalyticsEntityCompartment(
                    ChangeLogAnalyticsEntityCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLogAnalyticsEntityCompartmentRequest,
                                    ChangeLogAnalyticsEntityCompartmentResponse>
                            handler);

    /**
     * Updates the compartment of the Log-Analytics group with the given id.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeLogAnalyticsLogGroupCompartmentResponse>
            changeLogAnalyticsLogGroupCompartment(
                    ChangeLogAnalyticsLogGroupCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLogAnalyticsLogGroupCompartmentRequest,
                                    ChangeLogAnalyticsLogGroupCompartmentResponse>
                            handler);

    /**
     * Move the rule from it's current compartment to given compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeLogAnalyticsObjectCollectionRuleCompartmentResponse>
            changeLogAnalyticsObjectCollectionRuleCompartment(
                    ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest,
                                    ChangeLogAnalyticsObjectCollectionRuleCompartmentResponse>
                            handler);

    /**
     * Move the scheduled task into a different compartment within the same tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeScheduledTaskCompartmentResponse>
            changeScheduledTaskCompartment(
                    ChangeScheduledTaskCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeScheduledTaskCompartmentRequest,
                                    ChangeScheduledTaskCompartmentResponse>
                            handler);

    /**
     * Clean accumulated acceleration data stored for the accelerated saved search.
     * The ScheduledTask taskType must be ACCELERATION.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CleanResponse> clean(
            CleanRequest request,
            com.oracle.bmc.responses.AsyncHandler<CleanRequest, CleanResponse> handler);

    /**
     * Create a new log analytics entity.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateLogAnalyticsEntityResponse> createLogAnalyticsEntity(
            CreateLogAnalyticsEntityRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateLogAnalyticsEntityRequest, CreateLogAnalyticsEntityResponse>
                    handler);

    /**
     * Add custom log analytics entity type.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateLogAnalyticsEntityTypeResponse> createLogAnalyticsEntityType(
            CreateLogAnalyticsEntityTypeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateLogAnalyticsEntityTypeRequest,
                            CreateLogAnalyticsEntityTypeResponse>
                    handler);

    /**
     * Creates a new Log-Analytics group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateLogAnalyticsLogGroupResponse> createLogAnalyticsLogGroup(
            CreateLogAnalyticsLogGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateLogAnalyticsLogGroupRequest, CreateLogAnalyticsLogGroupResponse>
                    handler);

    /**
     * Create a configuration to collect logs from object storage bucket.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateLogAnalyticsObjectCollectionRuleResponse>
            createLogAnalyticsObjectCollectionRule(
                    CreateLogAnalyticsObjectCollectionRuleRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateLogAnalyticsObjectCollectionRuleRequest,
                                    CreateLogAnalyticsObjectCollectionRuleResponse>
                            handler);

    /**
     * Schedule a task as specified and return task info.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateScheduledTaskResponse> createScheduledTask(
            CreateScheduledTaskRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateScheduledTaskRequest, CreateScheduledTaskResponse>
                    handler);

    /**
     * delete associations
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAssociationsResponse> deleteAssociations(
            DeleteAssociationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteAssociationsRequest, DeleteAssociationsResponse>
                    handler);

    /**
     * delete field with specified name
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteFieldResponse> deleteField(
            DeleteFieldRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteFieldRequest, DeleteFieldResponse> handler);

    /**
     * delete a label
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteLabelResponse> deleteLabel(
            DeleteLabelRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteLabelRequest, DeleteLabelResponse> handler);

    /**
     * Delete log analytics entity with the given id.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteLogAnalyticsEntityResponse> deleteLogAnalyticsEntity(
            DeleteLogAnalyticsEntityRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteLogAnalyticsEntityRequest, DeleteLogAnalyticsEntityResponse>
                    handler);

    /**
     * Delete the log analytics entity type with the given name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteLogAnalyticsEntityTypeResponse> deleteLogAnalyticsEntityType(
            DeleteLogAnalyticsEntityTypeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteLogAnalyticsEntityTypeRequest,
                            DeleteLogAnalyticsEntityTypeResponse>
                    handler);

    /**
     * Deletes the Log-Analytics group with the given id.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteLogAnalyticsLogGroupResponse> deleteLogAnalyticsLogGroup(
            DeleteLogAnalyticsLogGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteLogAnalyticsLogGroupRequest, DeleteLogAnalyticsLogGroupResponse>
                    handler);

    /**
     * Deletes a configured object storage bucket based collection rule to stop the log collection of the configured bucket .
     * It will not delete the already collected log data from the configured bucket.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteLogAnalyticsObjectCollectionRuleResponse>
            deleteLogAnalyticsObjectCollectionRule(
                    DeleteLogAnalyticsObjectCollectionRuleRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteLogAnalyticsObjectCollectionRuleRequest,
                                    DeleteLogAnalyticsObjectCollectionRuleResponse>
                            handler);

    /**
     * delete parser with specified name
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteParserResponse> deleteParser(
            DeleteParserRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteParserRequest, DeleteParserResponse>
                    handler);

    /**
     * Delete the scheduled task.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteScheduledTaskResponse> deleteScheduledTask(
            DeleteScheduledTaskRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteScheduledTaskRequest, DeleteScheduledTaskResponse>
                    handler);

    /**
     * delete source with specified ID
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSourceResponse> deleteSource(
            DeleteSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteSourceRequest, DeleteSourceResponse>
                    handler);

    /**
     * Deletes an Upload by its reference.
     * It deletes all the logs in storage asscoiated with the upload and the corresponding upload metadata.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteUploadResponse> deleteUpload(
            DeleteUploadRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteUploadRequest, DeleteUploadResponse>
                    handler);

    /**
     * Deletes a specific log file inside an upload by providing upload file reference.
     * It deletes all the logs in storage asscoiated with the upload file and the corresponding upload metadata.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteUploadFileResponse> deleteUploadFile(
            DeleteUploadFileRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteUploadFileRequest, DeleteUploadFileResponse>
                    handler);

    /**
     * Suppresses a specific warning inside an upload.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteUploadWarningResponse> deleteUploadWarning(
            DeleteUploadWarningRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteUploadWarningRequest, DeleteUploadWarningResponse>
                    handler);

    /**
     * disable archiving
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DisableArchivingResponse> disableArchiving(
            DisableArchivingRequest request,
            com.oracle.bmc.responses.AsyncHandler<DisableArchivingRequest, DisableArchivingResponse>
                    handler);

    /**
     * enable archiving.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<EnableArchivingResponse> enableArchiving(
            EnableArchivingRequest request,
            com.oracle.bmc.responses.AsyncHandler<EnableArchivingRequest, EnableArchivingResponse>
                    handler);

    /**
     * estimate the size of data to be purged based on query parameters.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<EstimatePurgeDataSizeResponse> estimatePurgeDataSize(
            EstimatePurgeDataSizeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            EstimatePurgeDataSizeRequest, EstimatePurgeDataSizeResponse>
                    handler);

    /**
     * export
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ExportCustomContentResponse> exportCustomContent(
            ExportCustomContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ExportCustomContentRequest, ExportCustomContentResponse>
                    handler);

    /**
     * Export data based on query. Endpoint returns a stream of data. Endpoint is synchronous. Queries must deliver first result within 60 seconds or calls are subject to timeout.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ExportQueryResultResponse> exportQueryResult(
            ExportQueryResultRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ExportQueryResultRequest, ExportQueryResultResponse>
                    handler);

    /**
     * structured log fieldpaths
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ExtractStructuredLogFieldPathsResponse>
            extractStructuredLogFieldPaths(
                    ExtractStructuredLogFieldPathsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ExtractStructuredLogFieldPathsRequest,
                                    ExtractStructuredLogFieldPathsResponse>
                            handler);

    /**
     * structured log header paths
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ExtractStructuredLogHeaderPathsResponse>
            extractStructuredLogHeaderPaths(
                    ExtractStructuredLogHeaderPathsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ExtractStructuredLogHeaderPathsRequest,
                                    ExtractStructuredLogHeaderPathsResponse>
                            handler);

    /**
     * Each filter specifies an operator, a field and one or more values.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<FilterResponse> filter(
            FilterRequest request,
            com.oracle.bmc.responses.AsyncHandler<FilterRequest, FilterResponse> handler);

    /**
     * association summary
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAssociationSummaryResponse> getAssociationSummary(
            GetAssociationSummaryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAssociationSummaryRequest, GetAssociationSummaryResponse>
                    handler);

    /**
     * extract column names from SQL query
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetColumnNamesResponse> getColumnNames(
            GetColumnNamesRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetColumnNamesRequest, GetColumnNamesResponse>
                    handler);

    /**
     * association summary by source
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetConfigWorkRequestResponse> getConfigWorkRequest(
            GetConfigWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetConfigWorkRequestRequest, GetConfigWorkRequestResponse>
                    handler);

    /**
     * get common field with specified name
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetFieldResponse> getField(
            GetFieldRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetFieldRequest, GetFieldResponse> handler);

    /**
     * get field summary
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetFieldsSummaryResponse> getFieldsSummary(
            GetFieldsSummaryRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetFieldsSummaryRequest, GetFieldsSummaryResponse>
                    handler);

    /**
     * get label with specified name
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetLabelResponse> getLabel(
            GetLabelRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetLabelRequest, GetLabelResponse> handler);

    /**
     * get total count
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetLabelSummaryResponse> getLabelSummary(
            GetLabelSummaryRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetLabelSummaryRequest, GetLabelSummaryResponse>
                    handler);

    /**
     * Returns log analytics entities count summary.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetLogAnalyticsEntitiesSummaryResponse>
            getLogAnalyticsEntitiesSummary(
                    GetLogAnalyticsEntitiesSummaryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetLogAnalyticsEntitiesSummaryRequest,
                                    GetLogAnalyticsEntitiesSummaryResponse>
                            handler);

    /**
     * Retrieve the log analytics entity with the given id.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetLogAnalyticsEntityResponse> getLogAnalyticsEntity(
            GetLogAnalyticsEntityRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetLogAnalyticsEntityRequest, GetLogAnalyticsEntityResponse>
                    handler);

    /**
     * Retrieve the log analytics entity type with the given name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetLogAnalyticsEntityTypeResponse> getLogAnalyticsEntityType(
            GetLogAnalyticsEntityTypeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetLogAnalyticsEntityTypeRequest, GetLogAnalyticsEntityTypeResponse>
                    handler);

    /**
     * Retrieves the Log-Analytics group with the given id.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetLogAnalyticsLogGroupResponse> getLogAnalyticsLogGroup(
            GetLogAnalyticsLogGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetLogAnalyticsLogGroupRequest, GetLogAnalyticsLogGroupResponse>
                    handler);

    /**
     * Returns a count of Log-Analytics groups.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetLogAnalyticsLogGroupsSummaryResponse>
            getLogAnalyticsLogGroupsSummary(
                    GetLogAnalyticsLogGroupsSummaryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetLogAnalyticsLogGroupsSummaryRequest,
                                    GetLogAnalyticsLogGroupsSummaryResponse>
                            handler);

    /**
     * Gets a configured object storage based collection rule by given id
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetLogAnalyticsObjectCollectionRuleResponse>
            getLogAnalyticsObjectCollectionRule(
                    GetLogAnalyticsObjectCollectionRuleRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetLogAnalyticsObjectCollectionRuleRequest,
                                    GetLogAnalyticsObjectCollectionRuleResponse>
                            handler);

    /**
     * Get Namespace of a tenancy already onboarded in Log Analytics Application
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetNamespaceResponse> getNamespace(
            GetNamespaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetNamespaceRequest, GetNamespaceResponse>
                    handler);

    /**
     * get parser with fields by Name
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetParserResponse> getParser(
            GetParserRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetParserRequest, GetParserResponse> handler);

    /**
     * parser summary
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetParserSummaryResponse> getParserSummary(
            GetParserSummaryRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetParserSummaryRequest, GetParserSummaryResponse>
                    handler);

    /**
     * Returns the intermediate results for a query that was specified to run asynchronously if the query has not completed,
     * otherwise the final query results identified by a queryWorkRequestId returned when submitting the query execute asynchronously.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetQueryResultResponse> getQueryResult(
            GetQueryResultRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetQueryResultRequest, GetQueryResultResponse>
                    handler);

    /**
     * Retrieve work request details by workRequestId. This endpoint can be polled for status tracking of work request. Clients should poll using the interval returned in the retry-after header.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetQueryWorkRequestResponse> getQueryWorkRequest(
            GetQueryWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetQueryWorkRequestRequest, GetQueryWorkRequestResponse>
                    handler);

    /**
     * Get the scheduled task for the specified task identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetScheduledTaskResponse> getScheduledTask(
            GetScheduledTaskRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetScheduledTaskRequest, GetScheduledTaskResponse>
                    handler);

    /**
     * get source with specified name
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetSourceResponse> getSource(
            GetSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSourceRequest, GetSourceResponse> handler);

    /**
     * source summary
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetSourceSummaryResponse> getSourceSummary(
            GetSourceSummaryRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSourceSummaryRequest, GetSourceSummaryResponse>
                    handler);

    /**
     * Storage configuration and status.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetStorageResponse> getStorage(
            GetStorageRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetStorageRequest, GetStorageResponse> handler);

    /**
     * Storage usage info includes active, archived or recalled data.  The unit of return value is in bytes.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetStorageUsageResponse> getStorageUsage(
            GetStorageUsageRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetStorageUsageRequest, GetStorageUsageResponse>
                    handler);

    /**
     * Retrieve work request details by key. This endpoint can be polled for status tracking of work request.
     * Clients should poll using the interval returned in retry-after header.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetStorageWorkRequestResponse> getStorageWorkRequest(
            GetStorageWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetStorageWorkRequestRequest, GetStorageWorkRequestResponse>
                    handler);

    /**
     * Gets an On-Demand Upload info by reference
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetUploadResponse> getUpload(
            GetUploadRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetUploadRequest, GetUploadResponse> handler);

    /**
     * Gets the status of the work request with the given ID.
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
     * register custom content
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ImportCustomContentResponse> importCustomContent(
            ImportCustomContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ImportCustomContentRequest, ImportCustomContentResponse>
                    handler);

    /**
     * list of entities that have been associated to at least one source
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAssociatedEntitiesResponse> listAssociatedEntities(
            ListAssociatedEntitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAssociatedEntitiesRequest, ListAssociatedEntitiesResponse>
                    handler);

    /**
     * association summary by source
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListConfigWorkRequestsResponse> listConfigWorkRequests(
            ListConfigWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListConfigWorkRequestsRequest, ListConfigWorkRequestsResponse>
                    handler);

    /**
     * Return a list of log analytics entities associated with input source log analytics entity.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListEntityAssociationsResponse> listEntityAssociations(
            ListEntityAssociationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListEntityAssociationsRequest, ListEntityAssociationsResponse>
                    handler);

    /**
     * entity associations summary
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListEntitySourceAssociationsResponse> listEntitySourceAssociations(
            ListEntitySourceAssociationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListEntitySourceAssociationsRequest,
                            ListEntitySourceAssociationsResponse>
                    handler);

    /**
     * get all common field with specified display name and description
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListFieldsResponse> listFields(
            ListFieldsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListFieldsRequest, ListFieldsResponse> handler);

    /**
     * get list of priorities
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListLabelPrioritiesResponse> listLabelPriorities(
            ListLabelPrioritiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListLabelPrioritiesRequest, ListLabelPrioritiesResponse>
                    handler);

    /**
     * get details of sources using the label
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListLabelSourceDetailsResponse> listLabelSourceDetails(
            ListLabelSourceDetailsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListLabelSourceDetailsRequest, ListLabelSourceDetailsResponse>
                    handler);

    /**
     * get labels passing specified filter
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListLabelsResponse> listLabels(
            ListLabelsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListLabelsRequest, ListLabelsResponse> handler);

    /**
     * Return a list of log analytics entities.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListLogAnalyticsEntitiesResponse> listLogAnalyticsEntities(
            ListLogAnalyticsEntitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListLogAnalyticsEntitiesRequest, ListLogAnalyticsEntitiesResponse>
                    handler);

    /**
     * Return a list of log analytics entity types.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListLogAnalyticsEntityTypesResponse> listLogAnalyticsEntityTypes(
            ListLogAnalyticsEntityTypesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListLogAnalyticsEntityTypesRequest, ListLogAnalyticsEntityTypesResponse>
                    handler);

    /**
     * Returns a list of Log-Analytics groups.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListLogAnalyticsLogGroupsResponse> listLogAnalyticsLogGroups(
            ListLogAnalyticsLogGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListLogAnalyticsLogGroupsRequest, ListLogAnalyticsLogGroupsResponse>
                    handler);

    /**
     * Gets list of configuration details of Object Storage based collection rules.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListLogAnalyticsObjectCollectionRulesResponse>
            listLogAnalyticsObjectCollectionRules(
                    ListLogAnalyticsObjectCollectionRulesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListLogAnalyticsObjectCollectionRulesRequest,
                                    ListLogAnalyticsObjectCollectionRulesResponse>
                            handler);

    /**
     * get all meta source types
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListMetaSourceTypesResponse> listMetaSourceTypes(
            ListMetaSourceTypesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMetaSourceTypesRequest, ListMetaSourceTypesResponse>
                    handler);

    /**
     * List Namespaces.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListNamespacesResponse> listNamespaces(
            ListNamespacesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListNamespacesRequest, ListNamespacesResponse>
                    handler);

    /**
     * get pre-process plugin instance
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListParserFunctionsResponse> listParserFunctions(
            ListParserFunctionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListParserFunctionsRequest, ListParserFunctionsResponse>
                    handler);

    /**
     * get pre-process Meta plugins
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListParserMetaPluginsResponse> listParserMetaPlugins(
            ListParserMetaPluginsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListParserMetaPluginsRequest, ListParserMetaPluginsResponse>
                    handler);

    /**
     * List parsers passing specified filter
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListParsersResponse> listParsers(
            ListParsersRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListParsersRequest, ListParsersResponse> handler);

    /**
     * List active asynchronous queries.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListQueryWorkRequestsResponse> listQueryWorkRequests(
            ListQueryWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListQueryWorkRequestsRequest, ListQueryWorkRequestsResponse>
                    handler);

    /**
     * Lists scheduled tasks.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListScheduledTasksResponse> listScheduledTasks(
            ListScheduledTasksRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListScheduledTasksRequest, ListScheduledTasksResponse>
                    handler);

    /**
     * association summary by source
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSourceAssociationsResponse> listSourceAssociations(
            ListSourceAssociationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSourceAssociationsRequest, ListSourceAssociationsResponse>
                    handler);

    /**
     * get source extended fields for source with specified Id
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSourceExtendedFieldDefinitionsResponse>
            listSourceExtendedFieldDefinitions(
                    ListSourceExtendedFieldDefinitionsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListSourceExtendedFieldDefinitionsRequest,
                                    ListSourceExtendedFieldDefinitionsResponse>
                            handler);

    /**
     * list source label operators
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSourceLabelOperatorsResponse> listSourceLabelOperators(
            ListSourceLabelOperatorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSourceLabelOperatorsRequest, ListSourceLabelOperatorsResponse>
                    handler);

    /**
     * get source meta functions
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSourceMetaFunctionsResponse> listSourceMetaFunctions(
            ListSourceMetaFunctionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSourceMetaFunctionsRequest, ListSourceMetaFunctionsResponse>
                    handler);

    /**
     * get source patterns for source with specified Id
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSourcePatternsResponse> listSourcePatterns(
            ListSourcePatternsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSourcePatternsRequest, ListSourcePatternsResponse>
                    handler);

    /**
     * source list
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSourcesResponse> listSources(
            ListSourcesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSourcesRequest, ListSourcesResponse> handler);

    /**
     * Retrieve work request errors if any
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListStorageWorkRequestErrorsResponse> listStorageWorkRequestErrors(
            ListStorageWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListStorageWorkRequestErrorsRequest,
                            ListStorageWorkRequestErrorsResponse>
                    handler);

    /**
     * List non-expired storage manager work requests.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListStorageWorkRequestsResponse> listStorageWorkRequests(
            ListStorageWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListStorageWorkRequestsRequest, ListStorageWorkRequestsResponse>
                    handler);

    /**
     * Gets the list of character encodings supported for log files.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSupportedCharEncodingsResponse> listSupportedCharEncodings(
            ListSupportedCharEncodingsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSupportedCharEncodingsRequest, ListSupportedCharEncodingsResponse>
                    handler);

    /**
     * Gets timezones that are supported when performing uploads.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSupportedTimezonesResponse> listSupportedTimezones(
            ListSupportedTimezonesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSupportedTimezonesRequest, ListSupportedTimezonesResponse>
                    handler);

    /**
     * Gets list of files in an upload.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListUploadFilesResponse> listUploadFiles(
            ListUploadFilesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListUploadFilesRequest, ListUploadFilesResponse>
                    handler);

    /**
     * Gets list of warnings in an upload explaining the failures due to incorrect configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListUploadWarningsResponse> listUploadWarnings(
            ListUploadWarningsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListUploadWarningsRequest, ListUploadWarningsResponse>
                    handler);

    /**
     * Gets a list of all On-demand uploads.
     * To use this and other API operations, you must be authorized in an IAM policy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListUploadsResponse> listUploads(
            ListUploadsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListUploadsRequest, ListUploadsResponse> handler);

    /**
     * Return a (paginated) list of errors for a given work request.
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
     * Return a (paginated) list of logs for a given work request.
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
     * Lists the work requests in a compartment.
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
     * Off-boards a tenant from Logging Analytics
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<OffboardNamespaceResponse> offboardNamespace(
            OffboardNamespaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            OffboardNamespaceRequest, OffboardNamespaceResponse>
                    handler);

    /**
     * On-boards a tenant to Logging Analytics.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<OnboardNamespaceResponse> onboardNamespace(
            OnboardNamespaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<OnboardNamespaceRequest, OnboardNamespaceResponse>
                    handler);

    /**
     * Describe query
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ParseQueryResponse> parseQuery(
            ParseQueryRequest request,
            com.oracle.bmc.responses.AsyncHandler<ParseQueryRequest, ParseQueryResponse> handler);

    /**
     * submit work requests to purge old data based on the type.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<PurgeStorageDataResponse> purgeStorageData(
            PurgeStorageDataRequest request,
            com.oracle.bmc.responses.AsyncHandler<PurgeStorageDataRequest, PurgeStorageDataResponse>
                    handler);

    /**
     * Put the work request specified by {workRequestId} into the background.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<PutQueryWorkRequestBackgroundResponse>
            putQueryWorkRequestBackground(
                    PutQueryWorkRequestBackgroundRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    PutQueryWorkRequestBackgroundRequest,
                                    PutQueryWorkRequestBackgroundResponse>
                            handler);

    /**
     * Performs a log analytics search, if shouldRunAsync is false returns the query results once they become available subject to 60 second timeout. If a query is subject to exceed that time then it should be run asynchronously. Asynchronous query submissions return the queryWorkRequestId to use for execution tracking, query submission lifecycle actions and to poll for query results.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<QueryResponse> query(
            QueryRequest request,
            com.oracle.bmc.responses.AsyncHandler<QueryRequest, QueryResponse> handler);

    /**
     * submit work requests to recall archived data.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RecallArchivedDataResponse> recallArchivedData(
            RecallArchivedDataRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RecallArchivedDataRequest, RecallArchivedDataResponse>
                    handler);

    /**
     * register lookup
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RegisterLookupResponse> registerLookup(
            RegisterLookupRequest request,
            com.oracle.bmc.responses.AsyncHandler<RegisterLookupRequest, RegisterLookupResponse>
                    handler);

    /**
     * submit work requests to release recalled data.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ReleaseRecalledDataResponse> releaseRecalledData(
            ReleaseRecalledDataRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ReleaseRecalledDataRequest, ReleaseRecalledDataResponse>
                    handler);

    /**
     * Delete association between input source log analytics entity and destination entities.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveEntityAssociationsResponse> removeEntityAssociations(
            RemoveEntityAssociationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemoveEntityAssociationsRequest, RemoveEntityAssociationsResponse>
                    handler);

    /**
     * Execute the saved search acceleration task in the foreground.
     * The ScheduledTask taskType must be ACCELERATION.
     * Optionally specify time range (timeStart and timeEnd). The default is all time.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RunResponse> run(
            RunRequest request,
            com.oracle.bmc.responses.AsyncHandler<RunRequest, RunResponse> handler);

    /**
     * Returns a context specific list of either commands, fields, or values to add to the end of the query string.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SuggestResponse> suggest(
            SuggestRequest request,
            com.oracle.bmc.responses.AsyncHandler<SuggestRequest, SuggestResponse> handler);

    /**
     * test parser
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<TestParserResponse> testParser(
            TestParserRequest request,
            com.oracle.bmc.responses.AsyncHandler<TestParserRequest, TestParserResponse> handler);

    /**
     * Update the log analytics entity with the given id.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateLogAnalyticsEntityResponse> updateLogAnalyticsEntity(
            UpdateLogAnalyticsEntityRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateLogAnalyticsEntityRequest, UpdateLogAnalyticsEntityResponse>
                    handler);

    /**
     * Update custom log analytics entity type. Out of box entity types cannot be udpated.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateLogAnalyticsEntityTypeResponse> updateLogAnalyticsEntityType(
            UpdateLogAnalyticsEntityTypeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateLogAnalyticsEntityTypeRequest,
                            UpdateLogAnalyticsEntityTypeResponse>
                    handler);

    /**
     * Updates the Log-Analytics group with the given id.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateLogAnalyticsLogGroupResponse> updateLogAnalyticsLogGroup(
            UpdateLogAnalyticsLogGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateLogAnalyticsLogGroupRequest, UpdateLogAnalyticsLogGroupResponse>
                    handler);

    /**
     * Update the rule with the given id.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateLogAnalyticsObjectCollectionRuleResponse>
            updateLogAnalyticsObjectCollectionRule(
                    UpdateLogAnalyticsObjectCollectionRuleRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateLogAnalyticsObjectCollectionRuleRequest,
                                    UpdateLogAnalyticsObjectCollectionRuleResponse>
                            handler);

    /**
     * Update the scheduled task. Schedules may be updated only for taskType SAVED_SEARCH and PURGE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateScheduledTaskResponse> updateScheduledTask(
            UpdateScheduledTaskRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateScheduledTaskRequest, UpdateScheduledTaskResponse>
                    handler);

    /**
     * update the archiving configuration
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateStorageResponse> updateStorage(
            UpdateStorageRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateStorageRequest, UpdateStorageResponse>
                    handler);

    /**
     * Accepts log data for processing by Log Analytics.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UploadLogFileResponse> uploadLogFile(
            UploadLogFileRequest request,
            com.oracle.bmc.responses.AsyncHandler<UploadLogFileRequest, UploadLogFileResponse>
                    handler);

    /**
     * create or update associations for a source
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpsertAssociationsResponse> upsertAssociations(
            UpsertAssociationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpsertAssociationsRequest, UpsertAssociationsResponse>
                    handler);

    /**
     * Defines or update a field.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpsertFieldResponse> upsertField(
            UpsertFieldRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpsertFieldRequest, UpsertFieldResponse> handler);

    /**
     * Define or update a label.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpsertLabelResponse> upsertLabel(
            UpsertLabelRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpsertLabelRequest, UpsertLabelResponse> handler);

    /**
     * Define or update parser
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpsertParserResponse> upsertParser(
            UpsertParserRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpsertParserRequest, UpsertParserResponse>
                    handler);

    /**
     * Define or update a source
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpsertSourceResponse> upsertSource(
            UpsertSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpsertSourceRequest, UpsertSourceResponse>
                    handler);

    /**
     * association parameter validation
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ValidateAssociationParametersResponse>
            validateAssociationParameters(
                    ValidateAssociationParametersRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ValidateAssociationParametersRequest,
                                    ValidateAssociationParametersResponse>
                            handler);

    /**
     * Validates a log file to check whether it is eligible to upload or not.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ValidateFileResponse> validateFile(
            ValidateFileRequest request,
            com.oracle.bmc.responses.AsyncHandler<ValidateFileRequest, ValidateFileResponse>
                    handler);

    /**
     * Pre-define or update a source
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ValidateSourceResponse> validateSource(
            ValidateSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<ValidateSourceRequest, ValidateSourceResponse>
                    handler);

    /**
     * test extended fields
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ValidateSourceExtendedFieldDetailsResponse>
            validateSourceExtendedFieldDetails(
                    ValidateSourceExtendedFieldDetailsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ValidateSourceExtendedFieldDetailsRequest,
                                    ValidateSourceExtendedFieldDetailsResponse>
                            handler);

    /**
     * Validates the source mapping for given file and provides match status and parsed representation of log data.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ValidateSourceMappingResponse> validateSourceMapping(
            ValidateSourceMappingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ValidateSourceMappingRequest, ValidateSourceMappingResponse>
                    handler);
}
