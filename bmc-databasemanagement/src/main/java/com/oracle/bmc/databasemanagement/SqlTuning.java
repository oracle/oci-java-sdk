/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement;

import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;

/**
 * Use the Database Management API to monitor and manage resources such as Oracle Databases, MySQL
 * Databases, and External Database Systems. For more information, see [Database
 * Management](https://docs.oracle.com/iaas/database-management/home.htm).
 *
 * <p>This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by
 * default if no circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public interface SqlTuning extends AutoCloseable {

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
     * Clones and runs a SQL tuning task in the database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/CloneSqlTuningTaskExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CloneSqlTuningTask
     *     API.
     */
    CloneSqlTuningTaskResponse cloneSqlTuningTask(CloneSqlTuningTaskRequest request);

    /**
     * Creates an empty Sql tuning set within the Managed Database specified by managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/CreateSqlTuningSetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateSqlTuningSet
     *     API.
     */
    CreateSqlTuningSetResponse createSqlTuningSet(CreateSqlTuningSetRequest request);

    /**
     * Drops the Sql tuning set specified by sqlTuningSet within the Managed Database specified by
     * managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DropSqlTuningSetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DropSqlTuningSet
     *     API.
     */
    DropSqlTuningSetResponse dropSqlTuningSet(DropSqlTuningSetRequest request);

    /**
     * Drops a SQL tuning task and its related results from the database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DropSqlTuningTaskExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DropSqlTuningTask
     *     API.
     */
    DropSqlTuningTaskResponse dropSqlTuningTask(DropSqlTuningTaskRequest request);

    /**
     * Deletes the Sqls in the specified Sql tuning set that matches the filter criteria provided in
     * the basicFilter. If basicFilter criteria is not provided, then entire Sqls in the Sql tuning
     * set is deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DropSqlsInSqlTuningSetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DropSqlsInSqlTuningSet API.
     */
    DropSqlsInSqlTuningSetResponse dropSqlsInSqlTuningSet(DropSqlsInSqlTuningSetRequest request);

    /**
     * Fetch the details of Sql statements in the Sql tuning set specified by name, owner and
     * optional filter parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/FetchSqlTuningSetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use FetchSqlTuningSet
     *     API.
     */
    FetchSqlTuningSetResponse fetchSqlTuningSet(FetchSqlTuningSetRequest request);

    /**
     * Retrieves a comparison of the existing SQL execution plan and a new plan. A SQL tuning task
     * may suggest a new execution plan for a SQL, and this API retrieves the comparison report of
     * the statistics of the two plans.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetExecutionPlanStatsComparisionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetExecutionPlanStatsComparision API.
     */
    GetExecutionPlanStatsComparisionResponse getExecutionPlanStatsComparision(
            GetExecutionPlanStatsComparisionRequest request);

    /**
     * Retrieves a SQL execution plan for the SQL being tuned.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetSqlExecutionPlanExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSqlExecutionPlan
     *     API.
     */
    GetSqlExecutionPlanResponse getSqlExecutionPlan(GetSqlExecutionPlanRequest request);

    /**
     * Gets the summary report for the specified SQL Tuning Advisor task.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetSqlTuningAdvisorTaskSummaryReportExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetSqlTuningAdvisorTaskSummaryReport API.
     */
    GetSqlTuningAdvisorTaskSummaryReportResponse getSqlTuningAdvisorTaskSummaryReport(
            GetSqlTuningAdvisorTaskSummaryReportRequest request);

    /**
     * Gets an array of the details of the findings that match specific filters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListSqlTuningAdvisorTaskFindingsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListSqlTuningAdvisorTaskFindings API.
     */
    ListSqlTuningAdvisorTaskFindingsResponse listSqlTuningAdvisorTaskFindings(
            ListSqlTuningAdvisorTaskFindingsRequest request);

    /**
     * Gets the findings and possible actions for a given object in a SQL tuning task. The task ID
     * and object ID are used to retrieve the findings and recommendations.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListSqlTuningAdvisorTaskRecommendationsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListSqlTuningAdvisorTaskRecommendations API.
     */
    ListSqlTuningAdvisorTaskRecommendationsResponse listSqlTuningAdvisorTaskRecommendations(
            ListSqlTuningAdvisorTaskRecommendationsRequest request);

    /**
     * Lists the SQL Tuning Advisor tasks for the specified Managed Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListSqlTuningAdvisorTasksExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListSqlTuningAdvisorTasks API.
     */
    ListSqlTuningAdvisorTasksResponse listSqlTuningAdvisorTasks(
            ListSqlTuningAdvisorTasksRequest request);

    /**
     * Lists the SQL tuning sets for the specified Managed Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListSqlTuningSetsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSqlTuningSets
     *     API.
     */
    ListSqlTuningSetsResponse listSqlTuningSets(ListSqlTuningSetsRequest request);

    /**
     * Load Sql statements into the Sql tuning set specified by name and optional filter parameters
     * within the Managed Database specified by managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/LoadSqlTuningSetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use LoadSqlTuningSet
     *     API.
     */
    LoadSqlTuningSetResponse loadSqlTuningSet(LoadSqlTuningSetRequest request);

    /**
     * Saves the specified list of Sqls statements into another new Sql tuning set or loads into an
     * existing Sql tuning set'.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SaveSqlTuningSetAsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use SaveSqlTuningSetAs
     *     API.
     */
    SaveSqlTuningSetAsResponse saveSqlTuningSetAs(SaveSqlTuningSetAsRequest request);

    /**
     * Starts a SQL tuning task for a given set of SQL statements from the active session history
     * top SQL statements.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/StartSqlTuningTaskExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use StartSqlTuningTask
     *     API.
     */
    StartSqlTuningTaskResponse startSqlTuningTask(StartSqlTuningTaskRequest request);

    /**
     * Executes a SQL query to check whether user entered basic filter criteria is valid or not.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ValidateBasicFilterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ValidateBasicFilter
     *     API.
     */
    ValidateBasicFilterResponse validateBasicFilter(ValidateBasicFilterRequest request);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    SqlTuningPaginators getPaginators();
}
