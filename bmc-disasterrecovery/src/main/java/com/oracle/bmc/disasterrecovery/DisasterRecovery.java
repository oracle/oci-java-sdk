/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery;

import com.oracle.bmc.disasterrecovery.requests.*;
import com.oracle.bmc.disasterrecovery.responses.*;

/**
 * Use the Full Stack Disaster Recovery (DR) API to manage disaster recovery for business
 * applications. Full Stack DR is an OCI disaster recovery orchestration and management service that
 * provides comprehensive disaster recovery capabilities for all layers of an application stack,
 * including infrastructure, middleware, database, and application.
 *
 * <p>This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by
 * default if no circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public interface DisasterRecovery extends AutoCloseable {

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
     * Create an association between the DR protection group identified by *drProtectionGroupId* and
     * another DR protection group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/AssociateDrProtectionGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AssociateDrProtectionGroup API.
     */
    AssociateDrProtectionGroupResponse associateDrProtectionGroup(
            AssociateDrProtectionGroupRequest request);

    /**
     * Cancel the DR plan execution identified by *drPlanExecutionId*.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/CancelDrPlanExecutionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CancelDrPlanExecution API.
     */
    CancelDrPlanExecutionResponse cancelDrPlanExecution(CancelDrPlanExecutionRequest request);

    /**
     * Cancel the work request identified by *workRequestId*.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/CancelWorkRequestExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CancelWorkRequest
     *     API.
     */
    CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request);

    /**
     * Move the DR protection group identified by *drProtectionGroupId* to a different compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/ChangeDrProtectionGroupCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeDrProtectionGroupCompartment API.
     */
    ChangeDrProtectionGroupCompartmentResponse changeDrProtectionGroupCompartment(
            ChangeDrProtectionGroupCompartmentRequest request);

    /**
     * Create a DR plan of the specified DR plan type.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/CreateDrPlanExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDrPlan API.
     */
    CreateDrPlanResponse createDrPlan(CreateDrPlanRequest request);

    /**
     * Execute a DR plan for a DR protection group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/CreateDrPlanExecutionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateDrPlanExecution API.
     */
    CreateDrPlanExecutionResponse createDrPlanExecution(CreateDrPlanExecutionRequest request);

    /**
     * Create a DR protection group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/CreateDrProtectionGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateDrProtectionGroup API.
     */
    CreateDrProtectionGroupResponse createDrProtectionGroup(CreateDrProtectionGroupRequest request);

    /**
     * Delete the DR plan identified by *drPlanId*.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/DeleteDrPlanExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDrPlan API.
     */
    DeleteDrPlanResponse deleteDrPlan(DeleteDrPlanRequest request);

    /**
     * Delete the DR plan execution identified by *drPlanExecutionId*.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/DeleteDrPlanExecutionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteDrPlanExecution API.
     */
    DeleteDrPlanExecutionResponse deleteDrPlanExecution(DeleteDrPlanExecutionRequest request);

    /**
     * Delete the DR protection group identified by *drProtectionGroupId*.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/DeleteDrProtectionGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteDrProtectionGroup API.
     */
    DeleteDrProtectionGroupResponse deleteDrProtectionGroup(DeleteDrProtectionGroupRequest request);

    /**
     * Delete the association between the DR protection group identified by *drProtectionGroupId*.
     * and its peer DR protection group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/DisassociateDrProtectionGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DisassociateDrProtectionGroup API.
     */
    DisassociateDrProtectionGroupResponse disassociateDrProtectionGroup(
            DisassociateDrProtectionGroupRequest request);

    /**
     * Get details for the DR plan identified by *drPlanId*.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/GetDrPlanExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDrPlan API.
     */
    GetDrPlanResponse getDrPlan(GetDrPlanRequest request);

    /**
     * Get details for the DR plan execution identified by *drPlanExecutionId*.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/GetDrPlanExecutionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDrPlanExecution
     *     API.
     */
    GetDrPlanExecutionResponse getDrPlanExecution(GetDrPlanExecutionRequest request);

    /**
     * Get the DR protection group identified by *drProtectionGroupId*.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/GetDrProtectionGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetDrProtectionGroup API.
     */
    GetDrProtectionGroupResponse getDrProtectionGroup(GetDrProtectionGroupRequest request);

    /**
     * Get the status of the work request identified by *workRequestId*.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/GetWorkRequestExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Ignore the failed group or step in DR plan execution identified by *drPlanExecutionId* and
     * resume execution.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/IgnoreDrPlanExecutionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     IgnoreDrPlanExecution API.
     */
    IgnoreDrPlanExecutionResponse ignoreDrPlanExecution(IgnoreDrPlanExecutionRequest request);

    /**
     * Get a summary list of all DR plan executions for a DR protection group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/ListDrPlanExecutionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDrPlanExecutions API.
     */
    ListDrPlanExecutionsResponse listDrPlanExecutions(ListDrPlanExecutionsRequest request);

    /**
     * Get a summary list of all DR plans for a DR protection group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/ListDrPlansExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDrPlans API.
     */
    ListDrPlansResponse listDrPlans(ListDrPlansRequest request);

    /**
     * Get a summary list of all DR protection groups in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/ListDrProtectionGroupsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDrProtectionGroups API.
     */
    ListDrProtectionGroupsResponse listDrProtectionGroups(ListDrProtectionGroupsRequest request);

    /**
     * Get a list of work request errors for the work request identified by *workRequestId*.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/ListWorkRequestErrorsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Get a list of logs for the work request identified by *workRequestId*.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/ListWorkRequestLogsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs
     *     API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/ListWorkRequestsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests
     *     API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Pause the DR plan execution identified by *drPlanExecutionId*.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/PauseDrPlanExecutionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     PauseDrPlanExecution API.
     */
    PauseDrPlanExecutionResponse pauseDrPlanExecution(PauseDrPlanExecutionRequest request);

    /**
     * Refresh DR Plan identified by *drPlanId*.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/RefreshDrPlanExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use RefreshDrPlan API.
     */
    RefreshDrPlanResponse refreshDrPlan(RefreshDrPlanRequest request);

    /**
     * Resume the DR plan execution identified by *drPlanExecutionId*.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/ResumeDrPlanExecutionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ResumeDrPlanExecution API.
     */
    ResumeDrPlanExecutionResponse resumeDrPlanExecution(ResumeDrPlanExecutionRequest request);

    /**
     * Retry the failed group or step in DR plan execution identified by *drPlanExecutionId* and
     * resume execution.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/RetryDrPlanExecutionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RetryDrPlanExecution API.
     */
    RetryDrPlanExecutionResponse retryDrPlanExecution(RetryDrPlanExecutionRequest request);

    /**
     * Update the DR plan identified by *drPlanId*.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/UpdateDrPlanExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDrPlan API.
     */
    UpdateDrPlanResponse updateDrPlan(UpdateDrPlanRequest request);

    /**
     * Update the DR plan execution identified by *drPlanExecutionId*.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/UpdateDrPlanExecutionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateDrPlanExecution API.
     */
    UpdateDrPlanExecutionResponse updateDrPlanExecution(UpdateDrPlanExecutionRequest request);

    /**
     * Update the DR protection group identified by *drProtectionGroupId*.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/UpdateDrProtectionGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateDrProtectionGroup API.
     */
    UpdateDrProtectionGroupResponse updateDrProtectionGroup(UpdateDrProtectionGroupRequest request);

    /**
     * Update the role of the DR protection group identified by *drProtectionGroupId*.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/UpdateDrProtectionGroupRoleExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateDrProtectionGroupRole API.
     */
    UpdateDrProtectionGroupRoleResponse updateDrProtectionGroupRole(
            UpdateDrProtectionGroupRoleRequest request);

    /**
     * Verify DR Plan identified by *drPlanId*.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/VerifyDrPlanExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use VerifyDrPlan API.
     */
    VerifyDrPlanResponse verifyDrPlan(VerifyDrPlanRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    DisasterRecoveryWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DisasterRecoveryPaginators getPaginators();
}
