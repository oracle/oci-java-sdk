/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement;

import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;

/**
 * Use the Database Management API to perform tasks such as obtaining performance and resource usage metrics
 * for a fleet of Managed Databases or a specific Managed Database, creating Managed Database Groups, and
 * running a SQL job on a Managed Database or Managed Database Group.
 *
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public interface SqlTuning extends AutoCloseable {

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
     * Clone and start a SQL tuning task for a given SQL tuning task.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/CloneSqlTuningTaskExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CloneSqlTuningTask API.
     */
    CloneSqlTuningTaskResponse cloneSqlTuningTask(CloneSqlTuningTaskRequest request);

    /**
     * Drop a SQL tuning task and its related results from the database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DropSqlTuningTaskExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DropSqlTuningTask API.
     */
    DropSqlTuningTaskResponse dropSqlTuningTask(DropSqlTuningTaskRequest request);

    /**
     * A SQL tuning task may suggest new execution plan for a SQL. The API returns the
     * stats comparison report for the plans.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetExecutionPlanStatsComparisionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExecutionPlanStatsComparision API.
     */
    GetExecutionPlanStatsComparisionResponse getExecutionPlanStatsComparision(
            GetExecutionPlanStatsComparisionRequest request);

    /**
     * Retrieve a SQL execution plan for a SQL being tuned, for original or new plan
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetSqlExecutionPlanExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSqlExecutionPlan API.
     */
    GetSqlExecutionPlanResponse getSqlExecutionPlan(GetSqlExecutionPlanRequest request);

    /**
     * Gets the summary report for the specific SQL Tuning Advisor task.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetSqlTuningAdvisorTaskSummaryReportExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSqlTuningAdvisorTaskSummaryReport API.
     */
    GetSqlTuningAdvisorTaskSummaryReportResponse getSqlTuningAdvisorTaskSummaryReport(
            GetSqlTuningAdvisorTaskSummaryReportRequest request);

    /**
     * Takes in a task id, and a finding/object type filter and applies some SQLs to find return the output.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListSqlTuningAdvisorTaskFindingsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSqlTuningAdvisorTaskFindings API.
     */
    ListSqlTuningAdvisorTaskFindingsResponse listSqlTuningAdvisorTaskFindings(
            ListSqlTuningAdvisorTaskFindingsRequest request);

    /**
     * Takes in a task id and object id and returns the recommendations/findings.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListSqlTuningAdvisorTaskRecommendationsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSqlTuningAdvisorTaskRecommendations API.
     */
    ListSqlTuningAdvisorTaskRecommendationsResponse listSqlTuningAdvisorTaskRecommendations(
            ListSqlTuningAdvisorTaskRecommendationsRequest request);

    /**
     * Lists the SQL Tuning Advisor tasks for the specified Managed Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListSqlTuningAdvisorTasksExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSqlTuningAdvisorTasks API.
     */
    ListSqlTuningAdvisorTasksResponse listSqlTuningAdvisorTasks(
            ListSqlTuningAdvisorTasksRequest request);

    /**
     * Start a SQL tuning task for a given set of SQLs from active session history
     * top SQLs.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/StartSqlTuningTaskExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use StartSqlTuningTask API.
     */
    StartSqlTuningTaskResponse startSqlTuningTask(StartSqlTuningTaskRequest request);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    SqlTuningPaginators getPaginators();
}
