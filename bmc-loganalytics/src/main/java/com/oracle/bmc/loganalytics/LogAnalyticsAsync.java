/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
     * Adds association between input source log analytics entity and one or more existing destination entities.
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
     * Add one or more event types to a source. An event type and version can be enabled only on one source.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddSourceEventTypesResponse> addSourceEventTypes(
            AddSourceEventTypesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddSourceEventTypesRequest, AddSourceEventTypesResponse>
                    handler);

    /**
     * Appends data to the lookup content. The csv file containing the content to be appended is passed in as binary data in the request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AppendLookupDataResponse> appendLookupData(
            AppendLookupDataRequest request,
            com.oracle.bmc.responses.AsyncHandler<AppendLookupDataRequest, AppendLookupDataResponse>
                    handler);

    /**
     * Lists basic information about a specified set of labels in batch.
     *
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
     * Update the compartment of the log analytics enterprise manager bridge with the given id.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeLogAnalyticsEmBridgeCompartmentResponse>
            changeLogAnalyticsEmBridgeCompartment(
                    ChangeLogAnalyticsEmBridgeCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLogAnalyticsEmBridgeCompartmentRequest,
                                    ChangeLogAnalyticsEmBridgeCompartmentResponse>
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
     * Moves the specified log group to a different compartment.
     *
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
     * Move the rule from it's current compartment to the given compartment.
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
     * Returns the difference between the two input payloads, including intraline differences.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CompareContentResponse> compareContent(
            CompareContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<CompareContentRequest, CompareContentResponse>
                    handler);

    /**
     * Add configuration for enterprise manager bridge. Enterprise manager bridge is used to automatically add selected entities from enterprise manager cloud control. A corresponding OCI bridge configuration is required in enterprise manager.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateLogAnalyticsEmBridgeResponse> createLogAnalyticsEmBridge(
            CreateLogAnalyticsEmBridgeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateLogAnalyticsEmBridgeRequest, CreateLogAnalyticsEmBridgeResponse>
                    handler);

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
     * Creates a new log group in the specified compartment with the input display name. You may also specify optional information such as description, defined tags, and free-form tags.
     *
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
     * Creates a rule to collect logs from an object storage bucket.
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
     * Deletes the associations between the sources and entities specified.
     *
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
     * Deletes field with the specified name.
     *
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
     * Deletes label with the specified name.
     *
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
     * Delete log analytics enterprise manager bridge with the given id.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteLogAnalyticsEmBridgeResponse> deleteLogAnalyticsEmBridge(
            DeleteLogAnalyticsEmBridgeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteLogAnalyticsEmBridgeRequest, DeleteLogAnalyticsEmBridgeResponse>
                    handler);

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
     * Delete log analytics entity type with the given name.
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
     * Deletes the specified log group. The log group cannot be part of an active association or have an active upload.
     *
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
     * Deletes the configured object storage bucket based collection rule and stop the log collection.
     * It will not delete the existing processed data associated with this bucket from logging analytics storage.
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
     * Deletes lookup with the specified name.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteLookupResponse> deleteLookup(
            DeleteLookupRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteLookupRequest, DeleteLookupResponse>
                    handler);

    /**
     * Deletes parser with the specified name.
     *
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
     * Deletes source with the specified name.
     *
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
     * Deletes a specific log file inside an upload by upload file reference.
     * It deletes all the logs from storage associated with the file and the corresponding metadata.
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
     * This API disables archiving.
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
     * Disables auto association for a log source. In the future, this log source would not be automatically
     * associated with any entity that becomes eligible for association. In addition, you may also optionally
     * remove all existing associations for this log source.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DisableAutoAssociationResponse> disableAutoAssociation(
            DisableAutoAssociationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DisableAutoAssociationRequest, DisableAutoAssociationResponse>
                    handler);

    /**
     * Disable one or more event types in a source.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DisableSourceEventTypesResponse> disableSourceEventTypes(
            DisableSourceEventTypesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DisableSourceEventTypesRequest, DisableSourceEventTypesResponse>
                    handler);

    /**
     * THis API enables archiving.
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
     * Enables auto association for a log source. This would initiate immediate association of the source
     * to any eligible entities it is not already associated with, and would also ensure the log source gets
     * associated with entities that are added or become eligible in the future.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<EnableAutoAssociationResponse> enableAutoAssociation(
            EnableAutoAssociationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            EnableAutoAssociationRequest, EnableAutoAssociationResponse>
                    handler);

    /**
     * Enable one or more event types in a source. An event type and version can be enabled only in one source.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<EnableSourceEventTypesResponse> enableSourceEventTypes(
            EnableSourceEventTypesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            EnableSourceEventTypesRequest, EnableSourceEventTypesResponse>
                    handler);

    /**
     * This API estimates the size of data to be purged based based on time interval, purge query etc.
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
     * This API gives an active storage usage estimate for archived data to be recalled and the time range of such data.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<EstimateRecallDataSizeResponse> estimateRecallDataSize(
            EstimateRecallDataSizeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            EstimateRecallDataSizeRequest, EstimateRecallDataSizeResponse>
                    handler);

    /**
     * This API gives an active storage usage estimate for recalled data to be released and the time range of such data.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<EstimateReleaseDataSizeResponse> estimateReleaseDataSize(
            EstimateReleaseDataSizeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            EstimateReleaseDataSizeRequest, EstimateReleaseDataSizeResponse>
                    handler);

    /**
     * Exports all custom details of the specified sources, parsers, fields and labels, in zip format.
     *
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
     * Extracts the field paths from the example json or xml content.
     *
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
     * Extracts the header paths from the example json or xml content.
     *
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
     * Each filter specifies an operator, a field and one or more values to be inserted into the provided query as criteria.
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
     * Returns the count of source associations for entities in the specified compartment.
     *
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
     * Gets detailed information about the category with the specified name.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCategoryResponse> getCategory(
            GetCategoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetCategoryRequest, GetCategoryResponse> handler);

    /**
     * Extracts column names from the input SQL query.
     *
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
     * Returns detailed information about the configuration work request with the specified id.
     *
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
     * Gets detailed information about the field with the specified name.
     *
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
     * Returns the count of fields. You may optionally specify isShowDetail=true to view a summary of each field data type.
     *
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
     * Gets detailed information about the label with the specified name.
     *
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
     * Returns the count of labels.
     *
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
     * Retrieve the log analytics enterprise manager bridge with the given id.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetLogAnalyticsEmBridgeResponse> getLogAnalyticsEmBridge(
            GetLogAnalyticsEmBridgeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetLogAnalyticsEmBridgeRequest, GetLogAnalyticsEmBridgeResponse>
                    handler);

    /**
     * Returns log analytics enterprise manager bridges summary report.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetLogAnalyticsEmBridgeSummaryResponse>
            getLogAnalyticsEmBridgeSummary(
                    GetLogAnalyticsEmBridgeSummaryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetLogAnalyticsEmBridgeSummaryRequest,
                                    GetLogAnalyticsEmBridgeSummaryResponse>
                            handler);

    /**
     * Returns log analytics entities count summary report.
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
     * Gets detailed information about the specified log group such as display name, description, defined tags, and free-form tags.
     *
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
     * Returns the count of log groups in a compartment.
     *
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
     * This API returns the count of distinct log sets.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetLogSetsCountResponse> getLogSetsCount(
            GetLogSetsCountRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetLogSetsCountRequest, GetLogSetsCountResponse>
                    handler);

    /**
     * Gets detailed information about the lookup with the specified name.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetLookupResponse> getLookup(
            GetLookupRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetLookupRequest, GetLookupResponse> handler);

    /**
     * Returns the count of user created and oracle defined lookups.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetLookupSummaryResponse> getLookupSummary(
            GetLookupSummaryRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetLookupSummaryRequest, GetLookupSummaryResponse>
                    handler);

    /**
     * This API gets the namespace details of a tenancy already onboarded in Logging Analytics Application
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
     * Gets detailed information about the parser with the specified name.
     *
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
     * Returns the count of parsers.
     *
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
     * Lists the preferences of the tenant. Currently, only \"DEFAULT_HOMEPAGE\" is supported.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPreferencesResponse> getPreferences(
            GetPreferencesRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPreferencesRequest, GetPreferencesResponse>
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
     * Gets detailed information about the source with the specified name.
     *
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
     * Returns the count of sources.
     *
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
     * This API gets the storage configuration of a tenancy
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
     * This API gets storage usage information of a tenancy.  Storage usage information includes active, archived or recalled
     * data.  The unit of return data is in bytes.
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
     * This API returns work request details specified by {workRequestId}. This API can be polled for status tracking of
     * work request.  Clients should poll using the interval returned in retry-after header.
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
     * This API retrieves details of the configured bucket that stores unprocessed payloads.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetUnprocessedDataBucketResponse> getUnprocessedDataBucket(
            GetUnprocessedDataBucketRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetUnprocessedDataBucketRequest, GetUnprocessedDataBucketResponse>
                    handler);

    /**
     * Gets an On-Demand Upload info by reference.
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
     * Imports the specified custom content from the input in zip format.
     *
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
     * Lists the entities in the specified compartment which are (in)eligible for association with this source.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAssociableEntitiesResponse> listAssociableEntities(
            ListAssociableEntitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAssociableEntitiesRequest, ListAssociableEntitiesResponse>
                    handler);

    /**
     * Lists the association details of entities in the specified compartment that are associated with at least one source.
     *
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
     * Gets information related to auto association for the source with the specified name.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAutoAssociationsResponse> listAutoAssociations(
            ListAutoAssociationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAutoAssociationsRequest, ListAutoAssociationsResponse>
                    handler);

    /**
     * Returns a list of categories, containing detailed information about them. You may limit the number of results, provide sorting order, and filter by information such as category name or description.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCategoriesResponse> listCategories(
            ListCategoriesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListCategoriesRequest, ListCategoriesResponse>
                    handler);

    /**
     * Returns the list of configuration work requests such as association or lookup operations, containing detailed information about them. You may paginate or limit the number of results.
     *
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
     * Returns the list of source associations for the specified entity.
     *
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
     * Returns a list of log fields, containing detailed information about them. You may limit the number of results, provide sorting order, and filter by specifying various options including parser and source names.
     *
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
     * Lists the available problem priorities that could be associated with a label.
     *
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
     * Lists sources using the label, along with configuration details like base field, operator and condition.
     *
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
     * Returns a list of labels, containing detailed information about them. You may limit the number of results, provide sorting order, and filter by information such as label name, display name, description and priority.
     *
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
     * Return a list of log analytics enterprise manager bridges.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListLogAnalyticsEmBridgesResponse> listLogAnalyticsEmBridges(
            ListLogAnalyticsEmBridgesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListLogAnalyticsEmBridgesRequest, ListLogAnalyticsEmBridgesResponse>
                    handler);

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
     * Return a log analytics entity topology collection that contains a set of log analytics entities and a set of relationships between those, for the input source entity.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListLogAnalyticsEntityTopologyResponse>
            listLogAnalyticsEntityTopology(
                    ListLogAnalyticsEntityTopologyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListLogAnalyticsEntityTopologyRequest,
                                    ListLogAnalyticsEntityTopologyResponse>
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
     * Returns a list of log groups in a compartment. You may limit the number of log groups, provide sorting options, and filter the results by specifying a display name.
     *
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
     * Gets list of collection rules.
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
     * This API returns a list of log sets.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListLogSetsResponse> listLogSets(
            ListLogSetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListLogSetsRequest, ListLogSetsResponse> handler);

    /**
     * Returns a list of lookups, containing detailed information about them. You may limit the number of results, provide sorting order, and filter by information such as lookup name, description and type.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListLookupsResponse> listLookups(
            ListLookupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListLookupsRequest, ListLookupsResponse> handler);

    /**
     * Lists the types of log sources supported.
     *
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
     * Given a tenancy OCID, this API returns the namespace of the tenancy if it is valid and subscribed to the region.  The
     * result also indicates if the tenancy is onboarded with Logging Analytics.
     *
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
     * Lists the parser functions defined for the specified parser.
     *
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
     * Lists the parser meta plugins available for defining parser functions.
     *
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
     * Returns a list of parsers, containing detailed information about them. You may limit the number of results, provide sorting order, and filter by information such as parser name, type, display name and description.
     *
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
     * This API returns the list of recalled data of a tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListRecalledDataResponse> listRecalledData(
            ListRecalledDataRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListRecalledDataRequest, ListRecalledDataResponse>
                    handler);

    /**
     * Returns a list of resources and their category assignments.
     * You may limit the number of results, provide sorting order, and filter by information such as resource type.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListResourceCategoriesResponse> listResourceCategories(
            ListResourceCategoriesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListResourceCategoriesRequest, ListResourceCategoriesResponse>
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
     * Returns the list of entity associations in the input compartment for the specified source.
     *
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
     * Lists the event types mapped to the source with the specified name. The event type string could be the fully qualified name or a prefix that matches the event type.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSourceEventTypesResponse> listSourceEventTypes(
            ListSourceEventTypesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSourceEventTypesRequest, ListSourceEventTypesResponse>
                    handler);

    /**
     * Lists the extended field definitions for the source with the specified name.
     *
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
     * Lists the supported conditional operators that could be used for matching log field values to generate a label. You may use patterns to specify a condition. If a log entry matches that condition, it is tagged with the corresponding label.
     *
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
     * Lists the functions that could be used to enrich log entries based on meaningful information extracted from the log fields.
     *
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
     * Lists the source patterns for the source with the specified name.
     *
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
     * Returns a list of sources, containing detailed information about them. You may limit the number of results, provide sorting order, and filter by information such as display name, description and entity type.
     *
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
     * This API returns the list of work request errors if any.
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
     * This API lists storage work requests.  Use query parameters to narrow down or sort the result list.
     *
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
     * Gets list of character encodings which are supported by on-demand upload.
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
     * Gets list of timezones which are supported by on-demand upload.
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
     * Gets list of files in an upload along with its processing state.
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
     * Gets list of warnings in an upload caused by incorrect configuration.
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
     * Returns a list of collection warnings, containing detailed information about them. You may limit the number of results, provide sorting order, and filter by information such as start time, end time, warning type, warning state, source name, source pattern and entity name.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWarningsResponse> listWarnings(
            ListWarningsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWarningsRequest, ListWarningsResponse>
                    handler);

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
     * Pause the scheduled task specified by {scheduledTaskId}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<PauseScheduledTaskResponse> pauseScheduledTask(
            PauseScheduledTaskRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            PauseScheduledTaskRequest, PauseScheduledTaskResponse>
                    handler);

    /**
     * This API submits a work request to purge data. Only data from log groups that the user has permission to delete
     * will be purged.  To purge all data, the user must have permission to all log groups.
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
     * Put the work request specified by {workRequestId} into the background. Backgrounded queries will preserve query results on query completion for up to 7 days for recall. After 7 days the results and query expire.
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
     * This API submits a work request to recall archived data based on time interval and data type.
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
     * Creates a lookup with the specified name, type and description. The csv file containing the lookup content is passed in as binary data in the request.
     *
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
     * This API submits a work request to release recalled data based on time interval and data type.
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
     * Removes the tenant preferences. Currently, only \"DEFAULT_HOMEPAGE\" is supported.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemovePreferencesResponse> removePreferences(
            RemovePreferencesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemovePreferencesRequest, RemovePreferencesResponse>
                    handler);

    /**
     * Removes the category assignments of DASHBOARD and SAVEDSEARCH resources.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveResourceCategoriesResponse> removeResourceCategories(
            RemoveResourceCategoriesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemoveResourceCategoriesRequest, RemoveResourceCategoriesResponse>
                    handler);

    /**
     * Remove one or more event types from a source.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveSourceEventTypesResponse> removeSourceEventTypes(
            RemoveSourceEventTypesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemoveSourceEventTypesRequest, RemoveSourceEventTypesResponse>
                    handler);

    /**
     * Resume the scheduled task specified by {scheduledTaskId}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ResumeScheduledTaskResponse> resumeScheduledTask(
            ResumeScheduledTaskRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ResumeScheduledTaskRequest, ResumeScheduledTaskResponse>
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
     * This API configures a bucket to store unprocessed payloads.
     * While processing there could be reasons a payload cannot be processed (mismatched structure, corrupted archive format, etc),
     * if configured the payload would be uploaded to the bucket for verification.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SetUnprocessedDataBucketResponse> setUnprocessedDataBucket(
            SetUnprocessedDataBucketRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SetUnprocessedDataBucketRequest, SetUnprocessedDataBucketResponse>
                    handler);

    /**
     * Returns a context specific list of either commands, fields, or values to append to the end of the specified query string if applicable.
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
     * Supresses a list of warnings. Any unsuppressed warnings in the input list would be suppressed. Warnings in the input list which are already suppressed will not be modified.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SuppressWarningResponse> suppressWarning(
            SuppressWarningRequest request,
            com.oracle.bmc.responses.AsyncHandler<SuppressWarningRequest, SuppressWarningResponse>
                    handler);

    /**
     * Tests the parser definition against the specified example content to ensure fields are successfully extracted.
     *
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
     * Unsupresses a list of warnings. Any suppressed warnings in the input list would be unsuppressed. Warnings in the input list which are already unsuppressed will not be modified.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UnsuppressWarningResponse> unsuppressWarning(
            UnsuppressWarningRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UnsuppressWarningRequest, UnsuppressWarningResponse>
                    handler);

    /**
     * Update log analytics enterprise manager bridge with the given id.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateLogAnalyticsEmBridgeResponse> updateLogAnalyticsEmBridge(
            UpdateLogAnalyticsEmBridgeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateLogAnalyticsEmBridgeRequest, UpdateLogAnalyticsEmBridgeResponse>
                    handler);

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
     * Updates the specified log group's display name, description, defined tags, and free-form tags.
     *
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
     * Updates configuration of the object collection rule for the given id.
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
     * Updates the metadata of the specified lookup, such as the lookup description.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateLookupResponse> updateLookup(
            UpdateLookupRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateLookupRequest, UpdateLookupResponse>
                    handler);

    /**
     * Updates the lookup content. The csv file containing the content to be updated is passed in as binary data in the request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateLookupDataResponse> updateLookupData(
            UpdateLookupDataRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateLookupDataRequest, UpdateLookupDataResponse>
                    handler);

    /**
     * Updates the tenant preferences. Currently, only \"DEFAULT_HOMEPAGE\" is supported.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePreferencesResponse> updatePreferences(
            UpdatePreferencesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdatePreferencesRequest, UpdatePreferencesResponse>
                    handler);

    /**
     * Updates the category assignments of DASHBOARD and SAVEDSEARCH resources.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateResourceCategoriesResponse> updateResourceCategories(
            UpdateResourceCategoriesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateResourceCategoriesRequest, UpdateResourceCategoriesResponse>
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
     * This API updates the archiving configuration
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
     * Accepts log events for processing by Logging Analytics.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UploadLogEventsFileResponse> uploadLogEventsFile(
            UploadLogEventsFileRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UploadLogEventsFileRequest, UploadLogEventsFileResponse>
                    handler);

    /**
     * Accepts log data for processing by Logging Analytics.
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
     * Creates or updates associations between sources and entities. All entities should belong to the specified input compartment.
     *
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
     * Creates or updates a field that could be used in parser expressions to extract and assign value. To create a field, specify its display name. A name would be generated for the field. For subsequent calls to update the field, include the name attribute.
     *
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
     * Creates or updates a label that could be used to tag a log entry. You may optionally designate the label as a problem, and assign it a priority. You may also provide its related terms (aliases). To create a label, specify its display name. A name would be generated for the label. For subsequent calls to update the label, include the name attribute.
     *
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
     * Creates or updates a parser, which defines how fields are extracted from a log entry.
     *
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
     * Creates or updates a log source. You may also specify parsers, labels, extended fields etc., for the source.
     *
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
     * Checks if the passed in entities could be associated with the specified sources. The validation is performed to ensure that the entities have the relevant property values that are used in the corresponding source patterns.
     *
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
     * Validates a log file to check whether it is eligible to be uploaded or not.
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
     * Checks if the specified input is a valid log source definition.
     *
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
     * Checks if the specified input contains valid extended field definitions against the provided example content.
     *
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
     * Validates the source mapping for a given file and provides match status and the parsed representation of log data.
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

    /**
     * Verify the accelerated saved search task specified by {scheduledTaskId}.
     * For internal use only.
     * Optionally specify whether to return accelerated search results; the default is false.
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
    java.util.concurrent.Future<VerifyResponse> verify(
            VerifyRequest request,
            com.oracle.bmc.responses.AsyncHandler<VerifyRequest, VerifyResponse> handler);
}
