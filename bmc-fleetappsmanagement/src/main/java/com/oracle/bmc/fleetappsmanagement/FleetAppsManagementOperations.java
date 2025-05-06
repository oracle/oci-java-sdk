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
 *
 * <p>This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by
 * default if no circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public interface FleetAppsManagementOperations extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this Region, however, an
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
     * Moves a Patch into a different compartment within the same tenancy. For information about
     * moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/ChangePatchCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangePatchCompartment API.
     */
    ChangePatchCompartmentResponse changePatchCompartment(ChangePatchCompartmentRequest request);

    /**
     * Creates a new Patch.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/CreatePatchExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreatePatch API.
     */
    CreatePatchResponse createPatch(CreatePatchRequest request);

    /**
     * Create a SchedulerDefinition to perform lifecycle operations.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/CreateSchedulerDefinitionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateSchedulerDefinition API.
     */
    CreateSchedulerDefinitionResponse createSchedulerDefinition(
            CreateSchedulerDefinitionRequest request);

    /**
     * Deletes the patch specified by identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/DeletePatchExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeletePatch API.
     */
    DeletePatchResponse deletePatch(DeletePatchRequest request);

    /**
     * Deletes a SchedulerDefinition resource by identifier
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/DeleteSchedulerDefinitionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteSchedulerDefinition API.
     */
    DeleteSchedulerDefinitionResponse deleteSchedulerDefinition(
            DeleteSchedulerDefinitionRequest request);

    /**
     * Deletes the schedule job specified by an identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/DeleteSchedulerJobExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteSchedulerJob
     *     API.
     */
    DeleteSchedulerJobResponse deleteSchedulerJob(DeleteSchedulerJobRequest request);

    /**
     * Generate Compliance Report
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/ExportComplianceReportExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ExportComplianceReport API.
     */
    ExportComplianceReportResponse exportComplianceReport(ExportComplianceReportRequest request);

    /**
     * Get Task Execution by Identifier for a Resource within an action group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/GetExecutionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExecution API.
     */
    GetExecutionResponse getExecution(GetExecutionRequest request);

    /**
     * Gets activity details by identifier for a job.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/GetJobActivityExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetJobActivity API.
     */
    GetJobActivityResponse getJobActivity(GetJobActivityRequest request);

    /**
     * Gets a Patch by identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/GetPatchExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetPatch API.
     */
    GetPatchResponse getPatch(GetPatchRequest request);

    /**
     * Get the details of a SchedulerDefinition that performs lifecycle management operations.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/GetSchedulerDefinitionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetSchedulerDefinition API.
     */
    GetSchedulerDefinitionResponse getSchedulerDefinition(GetSchedulerDefinitionRequest request);

    /**
     * Get the details of a lifecycle management operations job in Fleet Application Management.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/GetSchedulerJobExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSchedulerJob
     *     API.
     */
    GetSchedulerJobResponse getSchedulerJob(GetSchedulerJobRequest request);

    /**
     * Gets a list of complianceDetails.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/ListComplianceRecordsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListComplianceRecords API.
     */
    ListComplianceRecordsResponse listComplianceRecords(ListComplianceRecordsRequest request);

    /**
     * Returns a list of Task Executions for a Resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/ListExecutionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExecutions API.
     */
    ListExecutionsResponse listExecutions(ListExecutionsRequest request);

    /**
     * Gets a list of inventoryDetails.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/ListInventoryRecordsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListInventoryRecords API.
     */
    ListInventoryRecordsResponse listInventoryRecords(ListInventoryRecordsRequest request);

    /**
     * Returns a list of all the Patches in the specified compartment. The query parameter
     * `compartmentId` is required unless the query parameter `id` is specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/ListPatchesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListPatches API.
     */
    ListPatchesResponse listPatches(ListPatchesRequest request);

    /**
     * Returns a list of resources for an Activity Execution.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/ListResourcesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListResources API.
     */
    ListResourcesResponse listResources(ListResourcesRequest request);

    /**
     * Returns a list of ScheduledFleets.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/ListScheduledFleetsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListScheduledFleets
     *     API.
     */
    ListScheduledFleetsResponse listScheduledFleets(ListScheduledFleetsRequest request);

    /**
     * Returns a list of all the Schedule Definitions in the specified compartment. The query
     * parameter `compartmentId` is required unless the query parameter `id` is specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/ListSchedulerDefinitionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListSchedulerDefinitions API.
     */
    ListSchedulerDefinitionsResponse listSchedulerDefinitions(
            ListSchedulerDefinitionsRequest request);

    /**
     * Returns a list of all Fleets that are scheduled.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/ListSchedulerExecutionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListSchedulerExecutions API.
     */
    ListSchedulerExecutionsResponse listSchedulerExecutions(ListSchedulerExecutionsRequest request);

    /**
     * Returns a list of all schedule jobs in the specified compartment. The query parameter
     * `compartmentId` is required unless the query parameter `id` is specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/ListSchedulerJobsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSchedulerJobs
     *     API.
     */
    ListSchedulerJobsResponse listSchedulerJobs(ListSchedulerJobsRequest request);

    /**
     * Returns a list of Steps for an Activity Execution.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/ListStepsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSteps API.
     */
    ListStepsResponse listSteps(ListStepsRequest request);

    /**
     * Manage execution actions for a Job like retrying or pausing a task.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/ManageJobExecutionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ManageJobExecution
     *     API.
     */
    ManageJobExecutionResponse manageJobExecution(ManageJobExecutionRequest request);

    /**
     * Retrieve aggregated summary information of ComplianceRecords within a Compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/SummarizeComplianceRecordCountsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SummarizeComplianceRecordCounts API.
     */
    SummarizeComplianceRecordCountsResponse summarizeComplianceRecordCounts(
            SummarizeComplianceRecordCountsRequest request);

    /**
     * Retrieve aggregated summary information of Managed entities within a Compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/SummarizeManagedEntityCountsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SummarizeManagedEntityCounts API.
     */
    SummarizeManagedEntityCountsResponse summarizeManagedEntityCounts(
            SummarizeManagedEntityCountsRequest request);

    /**
     * Retrieve aggregated summary information of Scheduler Jobs within a Compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/SummarizeSchedulerJobCountsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SummarizeSchedulerJobCounts API.
     */
    SummarizeSchedulerJobCountsResponse summarizeSchedulerJobCounts(
            SummarizeSchedulerJobCountsRequest request);

    /**
     * Updates the patch specified by the identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/UpdatePatchExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdatePatch API.
     */
    UpdatePatchResponse updatePatch(UpdatePatchRequest request);

    /**
     * Update the details of a SchedulerDefinition that performs lifecycle management operations.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/UpdateSchedulerDefinitionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateSchedulerDefinition API.
     */
    UpdateSchedulerDefinitionResponse updateSchedulerDefinition(
            UpdateSchedulerDefinitionRequest request);

    /**
     * Updates certain attributes for the specified schedule job.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/UpdateSchedulerJobExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateSchedulerJob
     *     API.
     */
    UpdateSchedulerJobResponse updateSchedulerJob(UpdateSchedulerJobRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    FleetAppsManagementOperationsWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    FleetAppsManagementOperationsPaginators getPaginators();
}
