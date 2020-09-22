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
public interface LogAnalytics extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this Region, however, an IllegalArgumentException will be raised.
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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    AddEntityAssociationResponse addEntityAssociation(AddEntityAssociationRequest request);

    /**
     * get basic information about a specified set of labels
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    BatchGetBasicInfoResponse batchGetBasicInfo(BatchGetBasicInfoRequest request);

    /**
     * Cancel/Remove query job work request.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CancelQueryWorkRequestResponse cancelQueryWorkRequest(CancelQueryWorkRequestRequest request);

    /**
     * Update the compartment of the log analytics entity with the given id.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeLogAnalyticsEntityCompartmentResponse changeLogAnalyticsEntityCompartment(
            ChangeLogAnalyticsEntityCompartmentRequest request);

    /**
     * Updates the compartment of the Log-Analytics group with the given id.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeLogAnalyticsLogGroupCompartmentResponse changeLogAnalyticsLogGroupCompartment(
            ChangeLogAnalyticsLogGroupCompartmentRequest request);

    /**
     * Move the rule from it's current compartment to given compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeLogAnalyticsObjectCollectionRuleCompartmentResponse
            changeLogAnalyticsObjectCollectionRuleCompartment(
                    ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest request);

    /**
     * Move the scheduled task into a different compartment within the same tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeScheduledTaskCompartmentResponse changeScheduledTaskCompartment(
            ChangeScheduledTaskCompartmentRequest request);

    /**
     * Clean accumulated acceleration data stored for the accelerated saved search.
     * The ScheduledTask taskType must be ACCELERATION.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CleanResponse clean(CleanRequest request);

    /**
     * Create a new log analytics entity.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateLogAnalyticsEntityResponse createLogAnalyticsEntity(
            CreateLogAnalyticsEntityRequest request);

    /**
     * Add custom log analytics entity type.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateLogAnalyticsEntityTypeResponse createLogAnalyticsEntityType(
            CreateLogAnalyticsEntityTypeRequest request);

    /**
     * Creates a new Log-Analytics group.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateLogAnalyticsLogGroupResponse createLogAnalyticsLogGroup(
            CreateLogAnalyticsLogGroupRequest request);

    /**
     * Create a configuration to collect logs from object storage bucket.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateLogAnalyticsObjectCollectionRuleResponse createLogAnalyticsObjectCollectionRule(
            CreateLogAnalyticsObjectCollectionRuleRequest request);

    /**
     * Schedule a task as specified and return task info.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateScheduledTaskResponse createScheduledTask(CreateScheduledTaskRequest request);

    /**
     * delete associations
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteAssociationsResponse deleteAssociations(DeleteAssociationsRequest request);

    /**
     * delete field with specified name
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteFieldResponse deleteField(DeleteFieldRequest request);

    /**
     * delete a label
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteLabelResponse deleteLabel(DeleteLabelRequest request);

    /**
     * Delete log analytics entity with the given id.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteLogAnalyticsEntityResponse deleteLogAnalyticsEntity(
            DeleteLogAnalyticsEntityRequest request);

    /**
     * Delete the log analytics entity type with the given name.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteLogAnalyticsEntityTypeResponse deleteLogAnalyticsEntityType(
            DeleteLogAnalyticsEntityTypeRequest request);

    /**
     * Deletes the Log-Analytics group with the given id.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteLogAnalyticsLogGroupResponse deleteLogAnalyticsLogGroup(
            DeleteLogAnalyticsLogGroupRequest request);

    /**
     * Deletes a configured object storage bucket based collection rule to stop the log collection of the configured bucket .
     * It will not delete the already collected log data from the configured bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteLogAnalyticsObjectCollectionRuleResponse deleteLogAnalyticsObjectCollectionRule(
            DeleteLogAnalyticsObjectCollectionRuleRequest request);

    /**
     * delete parser with specified name
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteParserResponse deleteParser(DeleteParserRequest request);

    /**
     * Delete the scheduled task.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteScheduledTaskResponse deleteScheduledTask(DeleteScheduledTaskRequest request);

    /**
     * delete source with specified ID
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteSourceResponse deleteSource(DeleteSourceRequest request);

    /**
     * Deletes an Upload by its reference.
     * It deletes all the logs in storage asscoiated with the upload and the corresponding upload metadata.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteUploadResponse deleteUpload(DeleteUploadRequest request);

    /**
     * Deletes a specific log file inside an upload by providing upload file reference.
     * It deletes all the logs in storage asscoiated with the upload file and the corresponding upload metadata.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteUploadFileResponse deleteUploadFile(DeleteUploadFileRequest request);

    /**
     * Suppresses a specific warning inside an upload.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteUploadWarningResponse deleteUploadWarning(DeleteUploadWarningRequest request);

    /**
     * disable archiving
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DisableArchivingResponse disableArchiving(DisableArchivingRequest request);

    /**
     * enable archiving.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    EnableArchivingResponse enableArchiving(EnableArchivingRequest request);

    /**
     * estimate the size of data to be purged based on query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    EstimatePurgeDataSizeResponse estimatePurgeDataSize(EstimatePurgeDataSizeRequest request);

    /**
     * export
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ExportCustomContentResponse exportCustomContent(ExportCustomContentRequest request);

    /**
     * Export data based on query. Endpoint returns a stream of data. Endpoint is synchronous. Queries must deliver first result within 60 seconds or calls are subject to timeout.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ExportQueryResultResponse exportQueryResult(ExportQueryResultRequest request);

    /**
     * structured log fieldpaths
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ExtractStructuredLogFieldPathsResponse extractStructuredLogFieldPaths(
            ExtractStructuredLogFieldPathsRequest request);

    /**
     * structured log header paths
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ExtractStructuredLogHeaderPathsResponse extractStructuredLogHeaderPaths(
            ExtractStructuredLogHeaderPathsRequest request);

    /**
     * Each filter specifies an operator, a field and one or more values.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    FilterResponse filter(FilterRequest request);

    /**
     * association summary
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetAssociationSummaryResponse getAssociationSummary(GetAssociationSummaryRequest request);

    /**
     * extract column names from SQL query
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetColumnNamesResponse getColumnNames(GetColumnNamesRequest request);

    /**
     * association summary by source
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetConfigWorkRequestResponse getConfigWorkRequest(GetConfigWorkRequestRequest request);

    /**
     * get common field with specified name
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetFieldResponse getField(GetFieldRequest request);

    /**
     * get field summary
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetFieldsSummaryResponse getFieldsSummary(GetFieldsSummaryRequest request);

    /**
     * get label with specified name
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetLabelResponse getLabel(GetLabelRequest request);

    /**
     * get total count
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetLabelSummaryResponse getLabelSummary(GetLabelSummaryRequest request);

    /**
     * Returns log analytics entities count summary.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetLogAnalyticsEntitiesSummaryResponse getLogAnalyticsEntitiesSummary(
            GetLogAnalyticsEntitiesSummaryRequest request);

    /**
     * Retrieve the log analytics entity with the given id.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetLogAnalyticsEntityResponse getLogAnalyticsEntity(GetLogAnalyticsEntityRequest request);

    /**
     * Retrieve the log analytics entity type with the given name.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetLogAnalyticsEntityTypeResponse getLogAnalyticsEntityType(
            GetLogAnalyticsEntityTypeRequest request);

    /**
     * Retrieves the Log-Analytics group with the given id.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetLogAnalyticsLogGroupResponse getLogAnalyticsLogGroup(GetLogAnalyticsLogGroupRequest request);

    /**
     * Returns a count of Log-Analytics groups.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetLogAnalyticsLogGroupsSummaryResponse getLogAnalyticsLogGroupsSummary(
            GetLogAnalyticsLogGroupsSummaryRequest request);

    /**
     * Gets a configured object storage based collection rule by given id
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetLogAnalyticsObjectCollectionRuleResponse getLogAnalyticsObjectCollectionRule(
            GetLogAnalyticsObjectCollectionRuleRequest request);

    /**
     * Get Namespace of a tenancy already onboarded in Log Analytics Application
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetNamespaceResponse getNamespace(GetNamespaceRequest request);

    /**
     * get parser with fields by Name
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetParserResponse getParser(GetParserRequest request);

    /**
     * parser summary
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetParserSummaryResponse getParserSummary(GetParserSummaryRequest request);

    /**
     * Returns the intermediate results for a query that was specified to run asynchronously if the query has not completed,
     * otherwise the final query results identified by a queryWorkRequestId returned when submitting the query execute asynchronously.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetQueryResultResponse getQueryResult(GetQueryResultRequest request);

    /**
     * Retrieve work request details by workRequestId. This endpoint can be polled for status tracking of work request. Clients should poll using the interval returned in the retry-after header.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetQueryWorkRequestResponse getQueryWorkRequest(GetQueryWorkRequestRequest request);

    /**
     * Get the scheduled task for the specified task identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetScheduledTaskResponse getScheduledTask(GetScheduledTaskRequest request);

    /**
     * get source with specified name
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetSourceResponse getSource(GetSourceRequest request);

    /**
     * source summary
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetSourceSummaryResponse getSourceSummary(GetSourceSummaryRequest request);

    /**
     * Storage configuration and status.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetStorageResponse getStorage(GetStorageRequest request);

    /**
     * Storage usage info includes active, archived or recalled data.  The unit of return value is in bytes.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetStorageUsageResponse getStorageUsage(GetStorageUsageRequest request);

    /**
     * Retrieve work request details by key. This endpoint can be polled for status tracking of work request.
     * Clients should poll using the interval returned in retry-after header.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetStorageWorkRequestResponse getStorageWorkRequest(GetStorageWorkRequestRequest request);

    /**
     * Gets an On-Demand Upload info by reference
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetUploadResponse getUpload(GetUploadRequest request);

    /**
     * Gets the status of the work request with the given ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * register custom content
     *
     * Note: This operation consumes a stream.
     *
     * If the stream supports {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}, when a retry is
     * necessary, the stream is reset so it starts at the beginning (or whatever the stream's position was at the time this
     * operation is called}.
     *
     * Note this means that if the caller has used {@link java.io.InputStream#mark(int)} before, then the mark
     * will not be the same anymore after this operation, and a subsequent call to {@link java.io.InputStream#reset()} by
     * the caller will reset the stream not to the caller's mark, but to the position the stream was in when this operation
     * was called.
     *
     * If the stream is a {@link java.io.FileInputStream}, and the stream's {@link java.nio.channels.FileChannel} position
     * can be changed (like for a regular file), the stream will be wrapped in such a way that it does provide
     * support for {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}. Then the same procedure as
     * above is followed. If the stream's {@link java.nio.channels.FileChannel} position cannot be changed (like for a
     * named pipe), then the stream's contents will be buffered in memory, as described below.
     *
     * If the stream does not support {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}, then
     * the stream is wrapped in a {@link java.io.BufferedInputStream}, which means the entire contents may
     * be buffered in memory. Then the same procedure as above is followed.
     *
     * The contents of the stream, except when the stream is a {@link java.io.FileInputStream} whose
     * {@link java.nio.channels.FileChannel} position can be changed, should be less than 2 GiB in size if retries are used.
     * This is because streams 2 GiB in size or larger do no guarantee that mark-and-reset can be performed. If the stream
     * is larger, do not use built-in retries and manage retries yourself.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ImportCustomContentResponse importCustomContent(ImportCustomContentRequest request);

    /**
     * list of entities that have been associated to at least one source
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAssociatedEntitiesResponse listAssociatedEntities(ListAssociatedEntitiesRequest request);

    /**
     * association summary by source
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListConfigWorkRequestsResponse listConfigWorkRequests(ListConfigWorkRequestsRequest request);

    /**
     * Return a list of log analytics entities associated with input source log analytics entity.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListEntityAssociationsResponse listEntityAssociations(ListEntityAssociationsRequest request);

    /**
     * entity associations summary
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListEntitySourceAssociationsResponse listEntitySourceAssociations(
            ListEntitySourceAssociationsRequest request);

    /**
     * get all common field with specified display name and description
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListFieldsResponse listFields(ListFieldsRequest request);

    /**
     * get list of priorities
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListLabelPrioritiesResponse listLabelPriorities(ListLabelPrioritiesRequest request);

    /**
     * get details of sources using the label
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListLabelSourceDetailsResponse listLabelSourceDetails(ListLabelSourceDetailsRequest request);

    /**
     * get labels passing specified filter
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListLabelsResponse listLabels(ListLabelsRequest request);

    /**
     * Return a list of log analytics entities.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListLogAnalyticsEntitiesResponse listLogAnalyticsEntities(
            ListLogAnalyticsEntitiesRequest request);

    /**
     * Return a list of log analytics entity types.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListLogAnalyticsEntityTypesResponse listLogAnalyticsEntityTypes(
            ListLogAnalyticsEntityTypesRequest request);

    /**
     * Returns a list of Log-Analytics groups.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListLogAnalyticsLogGroupsResponse listLogAnalyticsLogGroups(
            ListLogAnalyticsLogGroupsRequest request);

    /**
     * Gets list of configuration details of Object Storage based collection rules.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListLogAnalyticsObjectCollectionRulesResponse listLogAnalyticsObjectCollectionRules(
            ListLogAnalyticsObjectCollectionRulesRequest request);

    /**
     * get all meta source types
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListMetaSourceTypesResponse listMetaSourceTypes(ListMetaSourceTypesRequest request);

    /**
     * List Namespaces.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListNamespacesResponse listNamespaces(ListNamespacesRequest request);

    /**
     * get pre-process plugin instance
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListParserFunctionsResponse listParserFunctions(ListParserFunctionsRequest request);

    /**
     * get pre-process Meta plugins
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListParserMetaPluginsResponse listParserMetaPlugins(ListParserMetaPluginsRequest request);

    /**
     * List parsers passing specified filter
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListParsersResponse listParsers(ListParsersRequest request);

    /**
     * List active asynchronous queries.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListQueryWorkRequestsResponse listQueryWorkRequests(ListQueryWorkRequestsRequest request);

    /**
     * Lists scheduled tasks.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListScheduledTasksResponse listScheduledTasks(ListScheduledTasksRequest request);

    /**
     * association summary by source
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListSourceAssociationsResponse listSourceAssociations(ListSourceAssociationsRequest request);

    /**
     * get source extended fields for source with specified Id
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListSourceExtendedFieldDefinitionsResponse listSourceExtendedFieldDefinitions(
            ListSourceExtendedFieldDefinitionsRequest request);

    /**
     * list source label operators
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListSourceLabelOperatorsResponse listSourceLabelOperators(
            ListSourceLabelOperatorsRequest request);

    /**
     * get source meta functions
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListSourceMetaFunctionsResponse listSourceMetaFunctions(ListSourceMetaFunctionsRequest request);

    /**
     * get source patterns for source with specified Id
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListSourcePatternsResponse listSourcePatterns(ListSourcePatternsRequest request);

    /**
     * source list
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListSourcesResponse listSources(ListSourcesRequest request);

    /**
     * Retrieve work request errors if any
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListStorageWorkRequestErrorsResponse listStorageWorkRequestErrors(
            ListStorageWorkRequestErrorsRequest request);

    /**
     * List non-expired storage manager work requests.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListStorageWorkRequestsResponse listStorageWorkRequests(ListStorageWorkRequestsRequest request);

    /**
     * Gets the list of character encodings supported for log files.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListSupportedCharEncodingsResponse listSupportedCharEncodings(
            ListSupportedCharEncodingsRequest request);

    /**
     * Gets timezones that are supported when performing uploads.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListSupportedTimezonesResponse listSupportedTimezones(ListSupportedTimezonesRequest request);

    /**
     * Gets list of files in an upload.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListUploadFilesResponse listUploadFiles(ListUploadFilesRequest request);

    /**
     * Gets list of warnings in an upload explaining the failures due to incorrect configuration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListUploadWarningsResponse listUploadWarnings(ListUploadWarningsRequest request);

    /**
     * Gets a list of all On-demand uploads.
     * To use this and other API operations, you must be authorized in an IAM policy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListUploadsResponse listUploads(ListUploadsRequest request);

    /**
     * Return a (paginated) list of errors for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Return a (paginated) list of logs for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Off-boards a tenant from Logging Analytics
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    OffboardNamespaceResponse offboardNamespace(OffboardNamespaceRequest request);

    /**
     * On-boards a tenant to Logging Analytics.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    OnboardNamespaceResponse onboardNamespace(OnboardNamespaceRequest request);

    /**
     * Describe query
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ParseQueryResponse parseQuery(ParseQueryRequest request);

    /**
     * submit work requests to purge old data based on the type.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    PurgeStorageDataResponse purgeStorageData(PurgeStorageDataRequest request);

    /**
     * Put the work request specified by {workRequestId} into the background.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    PutQueryWorkRequestBackgroundResponse putQueryWorkRequestBackground(
            PutQueryWorkRequestBackgroundRequest request);

    /**
     * Performs a log analytics search, if shouldRunAsync is false returns the query results once they become available subject to 60 second timeout. If a query is subject to exceed that time then it should be run asynchronously. Asynchronous query submissions return the queryWorkRequestId to use for execution tracking, query submission lifecycle actions and to poll for query results.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    QueryResponse query(QueryRequest request);

    /**
     * submit work requests to recall archived data.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    RecallArchivedDataResponse recallArchivedData(RecallArchivedDataRequest request);

    /**
     * register lookup
     *
     * Note: This operation consumes a stream.
     *
     * If the stream supports {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}, when a retry is
     * necessary, the stream is reset so it starts at the beginning (or whatever the stream's position was at the time this
     * operation is called}.
     *
     * Note this means that if the caller has used {@link java.io.InputStream#mark(int)} before, then the mark
     * will not be the same anymore after this operation, and a subsequent call to {@link java.io.InputStream#reset()} by
     * the caller will reset the stream not to the caller's mark, but to the position the stream was in when this operation
     * was called.
     *
     * If the stream is a {@link java.io.FileInputStream}, and the stream's {@link java.nio.channels.FileChannel} position
     * can be changed (like for a regular file), the stream will be wrapped in such a way that it does provide
     * support for {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}. Then the same procedure as
     * above is followed. If the stream's {@link java.nio.channels.FileChannel} position cannot be changed (like for a
     * named pipe), then the stream's contents will be buffered in memory, as described below.
     *
     * If the stream does not support {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}, then
     * the stream is wrapped in a {@link java.io.BufferedInputStream}, which means the entire contents may
     * be buffered in memory. Then the same procedure as above is followed.
     *
     * The contents of the stream, except when the stream is a {@link java.io.FileInputStream} whose
     * {@link java.nio.channels.FileChannel} position can be changed, should be less than 2 GiB in size if retries are used.
     * This is because streams 2 GiB in size or larger do no guarantee that mark-and-reset can be performed. If the stream
     * is larger, do not use built-in retries and manage retries yourself.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    RegisterLookupResponse registerLookup(RegisterLookupRequest request);

    /**
     * submit work requests to release recalled data.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ReleaseRecalledDataResponse releaseRecalledData(ReleaseRecalledDataRequest request);

    /**
     * Delete association between input source log analytics entity and destination entities.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    RemoveEntityAssociationsResponse removeEntityAssociations(
            RemoveEntityAssociationsRequest request);

    /**
     * Execute the saved search acceleration task in the foreground.
     * The ScheduledTask taskType must be ACCELERATION.
     * Optionally specify time range (timeStart and timeEnd). The default is all time.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    RunResponse run(RunRequest request);

    /**
     * Returns a context specific list of either commands, fields, or values to add to the end of the query string.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    SuggestResponse suggest(SuggestRequest request);

    /**
     * test parser
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    TestParserResponse testParser(TestParserRequest request);

    /**
     * Update the log analytics entity with the given id.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateLogAnalyticsEntityResponse updateLogAnalyticsEntity(
            UpdateLogAnalyticsEntityRequest request);

    /**
     * Update custom log analytics entity type. Out of box entity types cannot be udpated.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateLogAnalyticsEntityTypeResponse updateLogAnalyticsEntityType(
            UpdateLogAnalyticsEntityTypeRequest request);

    /**
     * Updates the Log-Analytics group with the given id.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateLogAnalyticsLogGroupResponse updateLogAnalyticsLogGroup(
            UpdateLogAnalyticsLogGroupRequest request);

    /**
     * Update the rule with the given id.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateLogAnalyticsObjectCollectionRuleResponse updateLogAnalyticsObjectCollectionRule(
            UpdateLogAnalyticsObjectCollectionRuleRequest request);

    /**
     * Update the scheduled task. Schedules may be updated only for taskType SAVED_SEARCH and PURGE.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateScheduledTaskResponse updateScheduledTask(UpdateScheduledTaskRequest request);

    /**
     * update the archiving configuration
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateStorageResponse updateStorage(UpdateStorageRequest request);

    /**
     * Accepts log data for processing by Log Analytics.
     *
     *
     * Note: This operation consumes a stream.
     *
     * If the stream supports {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}, when a retry is
     * necessary, the stream is reset so it starts at the beginning (or whatever the stream's position was at the time this
     * operation is called}.
     *
     * Note this means that if the caller has used {@link java.io.InputStream#mark(int)} before, then the mark
     * will not be the same anymore after this operation, and a subsequent call to {@link java.io.InputStream#reset()} by
     * the caller will reset the stream not to the caller's mark, but to the position the stream was in when this operation
     * was called.
     *
     * If the stream is a {@link java.io.FileInputStream}, and the stream's {@link java.nio.channels.FileChannel} position
     * can be changed (like for a regular file), the stream will be wrapped in such a way that it does provide
     * support for {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}. Then the same procedure as
     * above is followed. If the stream's {@link java.nio.channels.FileChannel} position cannot be changed (like for a
     * named pipe), then the stream's contents will be buffered in memory, as described below.
     *
     * If the stream does not support {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}, then
     * the stream is wrapped in a {@link java.io.BufferedInputStream}, which means the entire contents may
     * be buffered in memory. Then the same procedure as above is followed.
     *
     * The contents of the stream, except when the stream is a {@link java.io.FileInputStream} whose
     * {@link java.nio.channels.FileChannel} position can be changed, should be less than 2 GiB in size if retries are used.
     * This is because streams 2 GiB in size or larger do no guarantee that mark-and-reset can be performed. If the stream
     * is larger, do not use built-in retries and manage retries yourself.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UploadLogFileResponse uploadLogFile(UploadLogFileRequest request);

    /**
     * create or update associations for a source
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpsertAssociationsResponse upsertAssociations(UpsertAssociationsRequest request);

    /**
     * Defines or update a field.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpsertFieldResponse upsertField(UpsertFieldRequest request);

    /**
     * Define or update a label.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpsertLabelResponse upsertLabel(UpsertLabelRequest request);

    /**
     * Define or update parser
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpsertParserResponse upsertParser(UpsertParserRequest request);

    /**
     * Define or update a source
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpsertSourceResponse upsertSource(UpsertSourceRequest request);

    /**
     * association parameter validation
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ValidateAssociationParametersResponse validateAssociationParameters(
            ValidateAssociationParametersRequest request);

    /**
     * Validates a log file to check whether it is eligible to upload or not.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ValidateFileResponse validateFile(ValidateFileRequest request);

    /**
     * Pre-define or update a source
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ValidateSourceResponse validateSource(ValidateSourceRequest request);

    /**
     * test extended fields
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ValidateSourceExtendedFieldDetailsResponse validateSourceExtendedFieldDetails(
            ValidateSourceExtendedFieldDetailsRequest request);

    /**
     * Validates the source mapping for given file and provides match status and parsed representation of log data.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ValidateSourceMappingResponse validateSourceMapping(ValidateSourceMappingRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    LogAnalyticsWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    LogAnalyticsPaginators getPaginators();
}
