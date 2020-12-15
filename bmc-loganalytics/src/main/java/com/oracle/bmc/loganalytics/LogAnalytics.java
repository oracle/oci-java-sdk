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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/AddEntityAssociationExample.java.html">here</a> to see how to use AddEntityAssociation API.
     */
    AddEntityAssociationResponse addEntityAssociation(AddEntityAssociationRequest request);

    /**
     * get basic information about a specified set of labels
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/BatchGetBasicInfoExample.java.html">here</a> to see how to use BatchGetBasicInfo API.
     */
    BatchGetBasicInfoResponse batchGetBasicInfo(BatchGetBasicInfoRequest request);

    /**
     * Cancel/Remove query job work request.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/CancelQueryWorkRequestExample.java.html">here</a> to see how to use CancelQueryWorkRequest API.
     */
    CancelQueryWorkRequestResponse cancelQueryWorkRequest(CancelQueryWorkRequestRequest request);

    /**
     * Update the compartment of the log analytics entity with the given id.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ChangeLogAnalyticsEntityCompartmentExample.java.html">here</a> to see how to use ChangeLogAnalyticsEntityCompartment API.
     */
    ChangeLogAnalyticsEntityCompartmentResponse changeLogAnalyticsEntityCompartment(
            ChangeLogAnalyticsEntityCompartmentRequest request);

    /**
     * Updates the compartment of the Log-Analytics group with the given id.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ChangeLogAnalyticsLogGroupCompartmentExample.java.html">here</a> to see how to use ChangeLogAnalyticsLogGroupCompartment API.
     */
    ChangeLogAnalyticsLogGroupCompartmentResponse changeLogAnalyticsLogGroupCompartment(
            ChangeLogAnalyticsLogGroupCompartmentRequest request);

    /**
     * Move the rule from it's current compartment to given compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ChangeLogAnalyticsObjectCollectionRuleCompartmentExample.java.html">here</a> to see how to use ChangeLogAnalyticsObjectCollectionRuleCompartment API.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ChangeScheduledTaskCompartmentExample.java.html">here</a> to see how to use ChangeScheduledTaskCompartment API.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/CleanExample.java.html">here</a> to see how to use Clean API.
     */
    CleanResponse clean(CleanRequest request);

    /**
     * Create a new log analytics entity.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/CreateLogAnalyticsEntityExample.java.html">here</a> to see how to use CreateLogAnalyticsEntity API.
     */
    CreateLogAnalyticsEntityResponse createLogAnalyticsEntity(
            CreateLogAnalyticsEntityRequest request);

    /**
     * Add custom log analytics entity type.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/CreateLogAnalyticsEntityTypeExample.java.html">here</a> to see how to use CreateLogAnalyticsEntityType API.
     */
    CreateLogAnalyticsEntityTypeResponse createLogAnalyticsEntityType(
            CreateLogAnalyticsEntityTypeRequest request);

    /**
     * Creates a new Log-Analytics group.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/CreateLogAnalyticsLogGroupExample.java.html">here</a> to see how to use CreateLogAnalyticsLogGroup API.
     */
    CreateLogAnalyticsLogGroupResponse createLogAnalyticsLogGroup(
            CreateLogAnalyticsLogGroupRequest request);

    /**
     * Create a configuration to collect logs from object storage bucket.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/CreateLogAnalyticsObjectCollectionRuleExample.java.html">here</a> to see how to use CreateLogAnalyticsObjectCollectionRule API.
     */
    CreateLogAnalyticsObjectCollectionRuleResponse createLogAnalyticsObjectCollectionRule(
            CreateLogAnalyticsObjectCollectionRuleRequest request);

    /**
     * Schedule a task as specified and return task info.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/CreateScheduledTaskExample.java.html">here</a> to see how to use CreateScheduledTask API.
     */
    CreateScheduledTaskResponse createScheduledTask(CreateScheduledTaskRequest request);

    /**
     * delete associations
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/DeleteAssociationsExample.java.html">here</a> to see how to use DeleteAssociations API.
     */
    DeleteAssociationsResponse deleteAssociations(DeleteAssociationsRequest request);

    /**
     * delete field with specified name
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/DeleteFieldExample.java.html">here</a> to see how to use DeleteField API.
     */
    DeleteFieldResponse deleteField(DeleteFieldRequest request);

    /**
     * delete a label
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/DeleteLabelExample.java.html">here</a> to see how to use DeleteLabel API.
     */
    DeleteLabelResponse deleteLabel(DeleteLabelRequest request);

    /**
     * Delete log analytics entity with the given id.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/DeleteLogAnalyticsEntityExample.java.html">here</a> to see how to use DeleteLogAnalyticsEntity API.
     */
    DeleteLogAnalyticsEntityResponse deleteLogAnalyticsEntity(
            DeleteLogAnalyticsEntityRequest request);

    /**
     * Delete the log analytics entity type with the given name.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/DeleteLogAnalyticsEntityTypeExample.java.html">here</a> to see how to use DeleteLogAnalyticsEntityType API.
     */
    DeleteLogAnalyticsEntityTypeResponse deleteLogAnalyticsEntityType(
            DeleteLogAnalyticsEntityTypeRequest request);

    /**
     * Deletes the Log-Analytics group with the given id.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/DeleteLogAnalyticsLogGroupExample.java.html">here</a> to see how to use DeleteLogAnalyticsLogGroup API.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/DeleteLogAnalyticsObjectCollectionRuleExample.java.html">here</a> to see how to use DeleteLogAnalyticsObjectCollectionRule API.
     */
    DeleteLogAnalyticsObjectCollectionRuleResponse deleteLogAnalyticsObjectCollectionRule(
            DeleteLogAnalyticsObjectCollectionRuleRequest request);

    /**
     * delete parser with specified name
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/DeleteParserExample.java.html">here</a> to see how to use DeleteParser API.
     */
    DeleteParserResponse deleteParser(DeleteParserRequest request);

    /**
     * Delete the scheduled task.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/DeleteScheduledTaskExample.java.html">here</a> to see how to use DeleteScheduledTask API.
     */
    DeleteScheduledTaskResponse deleteScheduledTask(DeleteScheduledTaskRequest request);

    /**
     * delete source with specified ID
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/DeleteSourceExample.java.html">here</a> to see how to use DeleteSource API.
     */
    DeleteSourceResponse deleteSource(DeleteSourceRequest request);

    /**
     * Deletes an Upload by its reference.
     * It deletes all the logs in storage asscoiated with the upload and the corresponding upload metadata.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/DeleteUploadExample.java.html">here</a> to see how to use DeleteUpload API.
     */
    DeleteUploadResponse deleteUpload(DeleteUploadRequest request);

    /**
     * Deletes a specific log file inside an upload by providing upload file reference.
     * It deletes all the logs in storage asscoiated with the upload file and the corresponding upload metadata.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/DeleteUploadFileExample.java.html">here</a> to see how to use DeleteUploadFile API.
     */
    DeleteUploadFileResponse deleteUploadFile(DeleteUploadFileRequest request);

    /**
     * Suppresses a specific warning inside an upload.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/DeleteUploadWarningExample.java.html">here</a> to see how to use DeleteUploadWarning API.
     */
    DeleteUploadWarningResponse deleteUploadWarning(DeleteUploadWarningRequest request);

    /**
     * This API disables archiving.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/DisableArchivingExample.java.html">here</a> to see how to use DisableArchiving API.
     */
    DisableArchivingResponse disableArchiving(DisableArchivingRequest request);

    /**
     * THis API enables archiving.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/EnableArchivingExample.java.html">here</a> to see how to use EnableArchiving API.
     */
    EnableArchivingResponse enableArchiving(EnableArchivingRequest request);

    /**
     * This API estimates the size of data to be purged based based on time interval, purge query etc.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/EstimatePurgeDataSizeExample.java.html">here</a> to see how to use EstimatePurgeDataSize API.
     */
    EstimatePurgeDataSizeResponse estimatePurgeDataSize(EstimatePurgeDataSizeRequest request);

    /**
     * export
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ExportCustomContentExample.java.html">here</a> to see how to use ExportCustomContent API.
     */
    ExportCustomContentResponse exportCustomContent(ExportCustomContentRequest request);

    /**
     * Export data based on query. Endpoint returns a stream of data. Endpoint is synchronous. Queries must deliver first result within 60 seconds or calls are subject to timeout.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ExportQueryResultExample.java.html">here</a> to see how to use ExportQueryResult API.
     */
    ExportQueryResultResponse exportQueryResult(ExportQueryResultRequest request);

    /**
     * structured log fieldpaths
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ExtractStructuredLogFieldPathsExample.java.html">here</a> to see how to use ExtractStructuredLogFieldPaths API.
     */
    ExtractStructuredLogFieldPathsResponse extractStructuredLogFieldPaths(
            ExtractStructuredLogFieldPathsRequest request);

    /**
     * structured log header paths
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ExtractStructuredLogHeaderPathsExample.java.html">here</a> to see how to use ExtractStructuredLogHeaderPaths API.
     */
    ExtractStructuredLogHeaderPathsResponse extractStructuredLogHeaderPaths(
            ExtractStructuredLogHeaderPathsRequest request);

    /**
     * Each filter specifies an operator, a field and one or more values to be inserted into the provided query as criteria.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/FilterExample.java.html">here</a> to see how to use Filter API.
     */
    FilterResponse filter(FilterRequest request);

    /**
     * association summary
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetAssociationSummaryExample.java.html">here</a> to see how to use GetAssociationSummary API.
     */
    GetAssociationSummaryResponse getAssociationSummary(GetAssociationSummaryRequest request);

    /**
     * extract column names from SQL query
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetColumnNamesExample.java.html">here</a> to see how to use GetColumnNames API.
     */
    GetColumnNamesResponse getColumnNames(GetColumnNamesRequest request);

    /**
     * association summary by source
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetConfigWorkRequestExample.java.html">here</a> to see how to use GetConfigWorkRequest API.
     */
    GetConfigWorkRequestResponse getConfigWorkRequest(GetConfigWorkRequestRequest request);

    /**
     * get common field with specified name
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetFieldExample.java.html">here</a> to see how to use GetField API.
     */
    GetFieldResponse getField(GetFieldRequest request);

    /**
     * get field summary
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetFieldsSummaryExample.java.html">here</a> to see how to use GetFieldsSummary API.
     */
    GetFieldsSummaryResponse getFieldsSummary(GetFieldsSummaryRequest request);

    /**
     * get label with specified name
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetLabelExample.java.html">here</a> to see how to use GetLabel API.
     */
    GetLabelResponse getLabel(GetLabelRequest request);

    /**
     * get total count
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetLabelSummaryExample.java.html">here</a> to see how to use GetLabelSummary API.
     */
    GetLabelSummaryResponse getLabelSummary(GetLabelSummaryRequest request);

    /**
     * Returns log analytics entities count summary.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetLogAnalyticsEntitiesSummaryExample.java.html">here</a> to see how to use GetLogAnalyticsEntitiesSummary API.
     */
    GetLogAnalyticsEntitiesSummaryResponse getLogAnalyticsEntitiesSummary(
            GetLogAnalyticsEntitiesSummaryRequest request);

    /**
     * Retrieve the log analytics entity with the given id.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetLogAnalyticsEntityExample.java.html">here</a> to see how to use GetLogAnalyticsEntity API.
     */
    GetLogAnalyticsEntityResponse getLogAnalyticsEntity(GetLogAnalyticsEntityRequest request);

    /**
     * Retrieve the log analytics entity type with the given name.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetLogAnalyticsEntityTypeExample.java.html">here</a> to see how to use GetLogAnalyticsEntityType API.
     */
    GetLogAnalyticsEntityTypeResponse getLogAnalyticsEntityType(
            GetLogAnalyticsEntityTypeRequest request);

    /**
     * Retrieves the Log-Analytics group with the given id.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetLogAnalyticsLogGroupExample.java.html">here</a> to see how to use GetLogAnalyticsLogGroup API.
     */
    GetLogAnalyticsLogGroupResponse getLogAnalyticsLogGroup(GetLogAnalyticsLogGroupRequest request);

    /**
     * Returns a count of Log-Analytics groups.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetLogAnalyticsLogGroupsSummaryExample.java.html">here</a> to see how to use GetLogAnalyticsLogGroupsSummary API.
     */
    GetLogAnalyticsLogGroupsSummaryResponse getLogAnalyticsLogGroupsSummary(
            GetLogAnalyticsLogGroupsSummaryRequest request);

    /**
     * Gets a configured object storage based collection rule by given id
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetLogAnalyticsObjectCollectionRuleExample.java.html">here</a> to see how to use GetLogAnalyticsObjectCollectionRule API.
     */
    GetLogAnalyticsObjectCollectionRuleResponse getLogAnalyticsObjectCollectionRule(
            GetLogAnalyticsObjectCollectionRuleRequest request);

    /**
     * This API gets the namespace details of a tenancy already onboarded in Logging Analytics Application
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetNamespaceExample.java.html">here</a> to see how to use GetNamespace API.
     */
    GetNamespaceResponse getNamespace(GetNamespaceRequest request);

    /**
     * get parser with fields by Name
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetParserExample.java.html">here</a> to see how to use GetParser API.
     */
    GetParserResponse getParser(GetParserRequest request);

    /**
     * parser summary
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetParserSummaryExample.java.html">here</a> to see how to use GetParserSummary API.
     */
    GetParserSummaryResponse getParserSummary(GetParserSummaryRequest request);

    /**
     * Returns the intermediate results for a query that was specified to run asynchronously if the query has not completed,
     * otherwise the final query results identified by a queryWorkRequestId returned when submitting the query execute asynchronously.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetQueryResultExample.java.html">here</a> to see how to use GetQueryResult API.
     */
    GetQueryResultResponse getQueryResult(GetQueryResultRequest request);

    /**
     * Retrieve work request details by workRequestId. This endpoint can be polled for status tracking of work request. Clients should poll using the interval returned in the retry-after header.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetQueryWorkRequestExample.java.html">here</a> to see how to use GetQueryWorkRequest API.
     */
    GetQueryWorkRequestResponse getQueryWorkRequest(GetQueryWorkRequestRequest request);

    /**
     * Get the scheduled task for the specified task identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetScheduledTaskExample.java.html">here</a> to see how to use GetScheduledTask API.
     */
    GetScheduledTaskResponse getScheduledTask(GetScheduledTaskRequest request);

    /**
     * get source with specified name
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetSourceExample.java.html">here</a> to see how to use GetSource API.
     */
    GetSourceResponse getSource(GetSourceRequest request);

    /**
     * source summary
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetSourceSummaryExample.java.html">here</a> to see how to use GetSourceSummary API.
     */
    GetSourceSummaryResponse getSourceSummary(GetSourceSummaryRequest request);

    /**
     * This API gets the storage configuration of a tenancy
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetStorageExample.java.html">here</a> to see how to use GetStorage API.
     */
    GetStorageResponse getStorage(GetStorageRequest request);

    /**
     * This API gets storage usage information of a tenancy.  Storage usage information includes active, archived or recalled
     * data.  The unit of return data is in bytes.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetStorageUsageExample.java.html">here</a> to see how to use GetStorageUsage API.
     */
    GetStorageUsageResponse getStorageUsage(GetStorageUsageRequest request);

    /**
     * This API returns work request details specified by {workRequestId}. This API can be polled for status tracking of
     * work request.  Clients should poll using the interval returned in retry-after header.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetStorageWorkRequestExample.java.html">here</a> to see how to use GetStorageWorkRequest API.
     */
    GetStorageWorkRequestResponse getStorageWorkRequest(GetStorageWorkRequestRequest request);

    /**
     * Gets an On-Demand Upload info by reference
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetUploadExample.java.html">here</a> to see how to use GetUpload API.
     */
    GetUploadResponse getUpload(GetUploadRequest request);

    /**
     * Gets the status of the work request with the given ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetWorkRequestExample.java.html">here</a> to see how to use GetWorkRequest API.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ImportCustomContentExample.java.html">here</a> to see how to use ImportCustomContent API.
     */
    ImportCustomContentResponse importCustomContent(ImportCustomContentRequest request);

    /**
     * list of entities that have been associated to at least one source
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListAssociatedEntitiesExample.java.html">here</a> to see how to use ListAssociatedEntities API.
     */
    ListAssociatedEntitiesResponse listAssociatedEntities(ListAssociatedEntitiesRequest request);

    /**
     * association summary by source
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListConfigWorkRequestsExample.java.html">here</a> to see how to use ListConfigWorkRequests API.
     */
    ListConfigWorkRequestsResponse listConfigWorkRequests(ListConfigWorkRequestsRequest request);

    /**
     * Return a list of log analytics entities associated with input source log analytics entity.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListEntityAssociationsExample.java.html">here</a> to see how to use ListEntityAssociations API.
     */
    ListEntityAssociationsResponse listEntityAssociations(ListEntityAssociationsRequest request);

    /**
     * entity associations summary
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListEntitySourceAssociationsExample.java.html">here</a> to see how to use ListEntitySourceAssociations API.
     */
    ListEntitySourceAssociationsResponse listEntitySourceAssociations(
            ListEntitySourceAssociationsRequest request);

    /**
     * get all common field with specified display name and description
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListFieldsExample.java.html">here</a> to see how to use ListFields API.
     */
    ListFieldsResponse listFields(ListFieldsRequest request);

    /**
     * get list of priorities
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListLabelPrioritiesExample.java.html">here</a> to see how to use ListLabelPriorities API.
     */
    ListLabelPrioritiesResponse listLabelPriorities(ListLabelPrioritiesRequest request);

    /**
     * get details of sources using the label
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListLabelSourceDetailsExample.java.html">here</a> to see how to use ListLabelSourceDetails API.
     */
    ListLabelSourceDetailsResponse listLabelSourceDetails(ListLabelSourceDetailsRequest request);

    /**
     * get labels passing specified filter
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListLabelsExample.java.html">here</a> to see how to use ListLabels API.
     */
    ListLabelsResponse listLabels(ListLabelsRequest request);

    /**
     * Return a list of log analytics entities.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListLogAnalyticsEntitiesExample.java.html">here</a> to see how to use ListLogAnalyticsEntities API.
     */
    ListLogAnalyticsEntitiesResponse listLogAnalyticsEntities(
            ListLogAnalyticsEntitiesRequest request);

    /**
     * Return a list of log analytics entity types.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListLogAnalyticsEntityTypesExample.java.html">here</a> to see how to use ListLogAnalyticsEntityTypes API.
     */
    ListLogAnalyticsEntityTypesResponse listLogAnalyticsEntityTypes(
            ListLogAnalyticsEntityTypesRequest request);

    /**
     * Returns a list of Log-Analytics groups.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListLogAnalyticsLogGroupsExample.java.html">here</a> to see how to use ListLogAnalyticsLogGroups API.
     */
    ListLogAnalyticsLogGroupsResponse listLogAnalyticsLogGroups(
            ListLogAnalyticsLogGroupsRequest request);

    /**
     * Gets list of configuration details of Object Storage based collection rules.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListLogAnalyticsObjectCollectionRulesExample.java.html">here</a> to see how to use ListLogAnalyticsObjectCollectionRules API.
     */
    ListLogAnalyticsObjectCollectionRulesResponse listLogAnalyticsObjectCollectionRules(
            ListLogAnalyticsObjectCollectionRulesRequest request);

    /**
     * get all meta source types
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListMetaSourceTypesExample.java.html">here</a> to see how to use ListMetaSourceTypes API.
     */
    ListMetaSourceTypesResponse listMetaSourceTypes(ListMetaSourceTypesRequest request);

    /**
     * Given a tenancy OCID, this API returns the namespace of the tenancy if it is valid and subscribed to the region.  The
     * result also indicates if the tenancy is onboarded with Logging Analytics.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListNamespacesExample.java.html">here</a> to see how to use ListNamespaces API.
     */
    ListNamespacesResponse listNamespaces(ListNamespacesRequest request);

    /**
     * get pre-process plugin instance
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListParserFunctionsExample.java.html">here</a> to see how to use ListParserFunctions API.
     */
    ListParserFunctionsResponse listParserFunctions(ListParserFunctionsRequest request);

    /**
     * get pre-process Meta plugins
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListParserMetaPluginsExample.java.html">here</a> to see how to use ListParserMetaPlugins API.
     */
    ListParserMetaPluginsResponse listParserMetaPlugins(ListParserMetaPluginsRequest request);

    /**
     * List parsers passing specified filter
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListParsersExample.java.html">here</a> to see how to use ListParsers API.
     */
    ListParsersResponse listParsers(ListParsersRequest request);

    /**
     * List active asynchronous queries.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListQueryWorkRequestsExample.java.html">here</a> to see how to use ListQueryWorkRequests API.
     */
    ListQueryWorkRequestsResponse listQueryWorkRequests(ListQueryWorkRequestsRequest request);

    /**
     * Lists scheduled tasks.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListScheduledTasksExample.java.html">here</a> to see how to use ListScheduledTasks API.
     */
    ListScheduledTasksResponse listScheduledTasks(ListScheduledTasksRequest request);

    /**
     * association summary by source
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListSourceAssociationsExample.java.html">here</a> to see how to use ListSourceAssociations API.
     */
    ListSourceAssociationsResponse listSourceAssociations(ListSourceAssociationsRequest request);

    /**
     * get source extended fields for source with specified Id
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListSourceExtendedFieldDefinitionsExample.java.html">here</a> to see how to use ListSourceExtendedFieldDefinitions API.
     */
    ListSourceExtendedFieldDefinitionsResponse listSourceExtendedFieldDefinitions(
            ListSourceExtendedFieldDefinitionsRequest request);

    /**
     * list source label operators
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListSourceLabelOperatorsExample.java.html">here</a> to see how to use ListSourceLabelOperators API.
     */
    ListSourceLabelOperatorsResponse listSourceLabelOperators(
            ListSourceLabelOperatorsRequest request);

    /**
     * get source meta functions
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListSourceMetaFunctionsExample.java.html">here</a> to see how to use ListSourceMetaFunctions API.
     */
    ListSourceMetaFunctionsResponse listSourceMetaFunctions(ListSourceMetaFunctionsRequest request);

    /**
     * get source patterns for source with specified Id
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListSourcePatternsExample.java.html">here</a> to see how to use ListSourcePatterns API.
     */
    ListSourcePatternsResponse listSourcePatterns(ListSourcePatternsRequest request);

    /**
     * source list
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListSourcesExample.java.html">here</a> to see how to use ListSources API.
     */
    ListSourcesResponse listSources(ListSourcesRequest request);

    /**
     * This API returns the list of work request errors if any.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListStorageWorkRequestErrorsExample.java.html">here</a> to see how to use ListStorageWorkRequestErrors API.
     */
    ListStorageWorkRequestErrorsResponse listStorageWorkRequestErrors(
            ListStorageWorkRequestErrorsRequest request);

    /**
     * This API lists storage work requests.  Use query parameters to narrow down or sort the result list.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListStorageWorkRequestsExample.java.html">here</a> to see how to use ListStorageWorkRequests API.
     */
    ListStorageWorkRequestsResponse listStorageWorkRequests(ListStorageWorkRequestsRequest request);

    /**
     * Gets the list of character encodings supported for log files.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListSupportedCharEncodingsExample.java.html">here</a> to see how to use ListSupportedCharEncodings API.
     */
    ListSupportedCharEncodingsResponse listSupportedCharEncodings(
            ListSupportedCharEncodingsRequest request);

    /**
     * Gets timezones that are supported when performing uploads.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListSupportedTimezonesExample.java.html">here</a> to see how to use ListSupportedTimezones API.
     */
    ListSupportedTimezonesResponse listSupportedTimezones(ListSupportedTimezonesRequest request);

    /**
     * Gets list of files in an upload.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListUploadFilesExample.java.html">here</a> to see how to use ListUploadFiles API.
     */
    ListUploadFilesResponse listUploadFiles(ListUploadFilesRequest request);

    /**
     * Gets list of warnings in an upload explaining the failures due to incorrect configuration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListUploadWarningsExample.java.html">here</a> to see how to use ListUploadWarnings API.
     */
    ListUploadWarningsResponse listUploadWarnings(ListUploadWarningsRequest request);

    /**
     * Gets a list of all On-demand uploads.
     * To use this and other API operations, you must be authorized in an IAM policy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListUploadsExample.java.html">here</a> to see how to use ListUploads API.
     */
    ListUploadsResponse listUploads(ListUploadsRequest request);

    /**
     * Return a (paginated) list of errors for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListWorkRequestErrorsExample.java.html">here</a> to see how to use ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Return a (paginated) list of logs for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListWorkRequestLogsExample.java.html">here</a> to see how to use ListWorkRequestLogs API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListWorkRequestsExample.java.html">here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Off-boards a tenant from Logging Analytics
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/OffboardNamespaceExample.java.html">here</a> to see how to use OffboardNamespace API.
     */
    OffboardNamespaceResponse offboardNamespace(OffboardNamespaceRequest request);

    /**
     * On-boards a tenant to Logging Analytics.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/OnboardNamespaceExample.java.html">here</a> to see how to use OnboardNamespace API.
     */
    OnboardNamespaceResponse onboardNamespace(OnboardNamespaceRequest request);

    /**
     * Describe query
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ParseQueryExample.java.html">here</a> to see how to use ParseQuery API.
     */
    ParseQueryResponse parseQuery(ParseQueryRequest request);

    /**
     * This API submits a work request to purge data. Only data from log groups that the user has permission to delete
     * will be purged.  To purge all data, the user must have permission to all log groups.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/PurgeStorageDataExample.java.html">here</a> to see how to use PurgeStorageData API.
     */
    PurgeStorageDataResponse purgeStorageData(PurgeStorageDataRequest request);

    /**
     * Put the work request specified by {workRequestId} into the background. Backgrounded queries will preserve query results on query completion for up to 7 days for recall. After 7 days the results and query expire.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/PutQueryWorkRequestBackgroundExample.java.html">here</a> to see how to use PutQueryWorkRequestBackground API.
     */
    PutQueryWorkRequestBackgroundResponse putQueryWorkRequestBackground(
            PutQueryWorkRequestBackgroundRequest request);

    /**
     * Performs a log analytics search, if shouldRunAsync is false returns the query results once they become available subject to 60 second timeout. If a query is subject to exceed that time then it should be run asynchronously. Asynchronous query submissions return the queryWorkRequestId to use for execution tracking, query submission lifecycle actions and to poll for query results.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/QueryExample.java.html">here</a> to see how to use Query API.
     */
    QueryResponse query(QueryRequest request);

    /**
     * This API submits a work request to recall archived data based on time interval and data type.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/RecallArchivedDataExample.java.html">here</a> to see how to use RecallArchivedData API.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/RegisterLookupExample.java.html">here</a> to see how to use RegisterLookup API.
     */
    RegisterLookupResponse registerLookup(RegisterLookupRequest request);

    /**
     * This API submits a work request to release recalled data based on time interval and data type.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ReleaseRecalledDataExample.java.html">here</a> to see how to use ReleaseRecalledData API.
     */
    ReleaseRecalledDataResponse releaseRecalledData(ReleaseRecalledDataRequest request);

    /**
     * Delete association between input source log analytics entity and destination entities.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/RemoveEntityAssociationsExample.java.html">here</a> to see how to use RemoveEntityAssociations API.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/RunExample.java.html">here</a> to see how to use Run API.
     */
    RunResponse run(RunRequest request);

    /**
     * Returns a context specific list of either commands, fields, or values to append to the end of the specified query string if applicable.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/SuggestExample.java.html">here</a> to see how to use Suggest API.
     */
    SuggestResponse suggest(SuggestRequest request);

    /**
     * test parser
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/TestParserExample.java.html">here</a> to see how to use TestParser API.
     */
    TestParserResponse testParser(TestParserRequest request);

    /**
     * Update the log analytics entity with the given id.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/UpdateLogAnalyticsEntityExample.java.html">here</a> to see how to use UpdateLogAnalyticsEntity API.
     */
    UpdateLogAnalyticsEntityResponse updateLogAnalyticsEntity(
            UpdateLogAnalyticsEntityRequest request);

    /**
     * Update custom log analytics entity type. Out of box entity types cannot be udpated.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/UpdateLogAnalyticsEntityTypeExample.java.html">here</a> to see how to use UpdateLogAnalyticsEntityType API.
     */
    UpdateLogAnalyticsEntityTypeResponse updateLogAnalyticsEntityType(
            UpdateLogAnalyticsEntityTypeRequest request);

    /**
     * Updates the Log-Analytics group with the given id.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/UpdateLogAnalyticsLogGroupExample.java.html">here</a> to see how to use UpdateLogAnalyticsLogGroup API.
     */
    UpdateLogAnalyticsLogGroupResponse updateLogAnalyticsLogGroup(
            UpdateLogAnalyticsLogGroupRequest request);

    /**
     * Update the rule with the given id.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/UpdateLogAnalyticsObjectCollectionRuleExample.java.html">here</a> to see how to use UpdateLogAnalyticsObjectCollectionRule API.
     */
    UpdateLogAnalyticsObjectCollectionRuleResponse updateLogAnalyticsObjectCollectionRule(
            UpdateLogAnalyticsObjectCollectionRuleRequest request);

    /**
     * Update the scheduled task. Schedules may be updated only for taskType SAVED_SEARCH and PURGE.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/UpdateScheduledTaskExample.java.html">here</a> to see how to use UpdateScheduledTask API.
     */
    UpdateScheduledTaskResponse updateScheduledTask(UpdateScheduledTaskRequest request);

    /**
     * This API updates the archiving configuration
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/UpdateStorageExample.java.html">here</a> to see how to use UpdateStorage API.
     */
    UpdateStorageResponse updateStorage(UpdateStorageRequest request);

    /**
     * Accepts log data for processing by Logging Analytics.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/UploadLogFileExample.java.html">here</a> to see how to use UploadLogFile API.
     */
    UploadLogFileResponse uploadLogFile(UploadLogFileRequest request);

    /**
     * create or update associations for a source
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/UpsertAssociationsExample.java.html">here</a> to see how to use UpsertAssociations API.
     */
    UpsertAssociationsResponse upsertAssociations(UpsertAssociationsRequest request);

    /**
     * Defines or update a field.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/UpsertFieldExample.java.html">here</a> to see how to use UpsertField API.
     */
    UpsertFieldResponse upsertField(UpsertFieldRequest request);

    /**
     * Define or update a label.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/UpsertLabelExample.java.html">here</a> to see how to use UpsertLabel API.
     */
    UpsertLabelResponse upsertLabel(UpsertLabelRequest request);

    /**
     * Define or update parser
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/UpsertParserExample.java.html">here</a> to see how to use UpsertParser API.
     */
    UpsertParserResponse upsertParser(UpsertParserRequest request);

    /**
     * Define or update a source
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/UpsertSourceExample.java.html">here</a> to see how to use UpsertSource API.
     */
    UpsertSourceResponse upsertSource(UpsertSourceRequest request);

    /**
     * association parameter validation
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ValidateAssociationParametersExample.java.html">here</a> to see how to use ValidateAssociationParameters API.
     */
    ValidateAssociationParametersResponse validateAssociationParameters(
            ValidateAssociationParametersRequest request);

    /**
     * Validates a log file to check whether it is eligible to upload or not.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ValidateFileExample.java.html">here</a> to see how to use ValidateFile API.
     */
    ValidateFileResponse validateFile(ValidateFileRequest request);

    /**
     * Pre-define or update a source
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ValidateSourceExample.java.html">here</a> to see how to use ValidateSource API.
     */
    ValidateSourceResponse validateSource(ValidateSourceRequest request);

    /**
     * test extended fields
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ValidateSourceExtendedFieldDetailsExample.java.html">here</a> to see how to use ValidateSourceExtendedFieldDetails API.
     */
    ValidateSourceExtendedFieldDetailsResponse validateSourceExtendedFieldDetails(
            ValidateSourceExtendedFieldDetailsRequest request);

    /**
     * Validates the source mapping for given file and provides match status and parsed representation of log data.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ValidateSourceMappingExample.java.html">here</a> to see how to use ValidateSourceMapping API.
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
