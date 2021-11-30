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
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public interface SqlTuningAsync extends AutoCloseable {

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
     * Clone and start a SQL tuning task for a given SQL tuning task.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CloneSqlTuningTaskResponse> cloneSqlTuningTask(
            CloneSqlTuningTaskRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CloneSqlTuningTaskRequest, CloneSqlTuningTaskResponse>
                    handler);

    /**
     * Drop a SQL tuning task and its related results from the database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DropSqlTuningTaskResponse> dropSqlTuningTask(
            DropSqlTuningTaskRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DropSqlTuningTaskRequest, DropSqlTuningTaskResponse>
                    handler);

    /**
     * A SQL tuning task may suggest new execution plan for a SQL. The API returns the
     * stats comparison report for the plans.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetExecutionPlanStatsComparisionResponse>
            getExecutionPlanStatsComparision(
                    GetExecutionPlanStatsComparisionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetExecutionPlanStatsComparisionRequest,
                                    GetExecutionPlanStatsComparisionResponse>
                            handler);

    /**
     * Retrieve a SQL execution plan for a SQL being tuned, for original or new plan
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetSqlExecutionPlanResponse> getSqlExecutionPlan(
            GetSqlExecutionPlanRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSqlExecutionPlanRequest, GetSqlExecutionPlanResponse>
                    handler);

    /**
     * Gets the summary report for the specific SQL Tuning Advisor task.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetSqlTuningAdvisorTaskSummaryReportResponse>
            getSqlTuningAdvisorTaskSummaryReport(
                    GetSqlTuningAdvisorTaskSummaryReportRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetSqlTuningAdvisorTaskSummaryReportRequest,
                                    GetSqlTuningAdvisorTaskSummaryReportResponse>
                            handler);

    /**
     * Takes in a task id, and a finding/object type filter and applies some SQLs to find return the output.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSqlTuningAdvisorTaskFindingsResponse>
            listSqlTuningAdvisorTaskFindings(
                    ListSqlTuningAdvisorTaskFindingsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListSqlTuningAdvisorTaskFindingsRequest,
                                    ListSqlTuningAdvisorTaskFindingsResponse>
                            handler);

    /**
     * Takes in a task id and object id and returns the recommendations/findings.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSqlTuningAdvisorTaskRecommendationsResponse>
            listSqlTuningAdvisorTaskRecommendations(
                    ListSqlTuningAdvisorTaskRecommendationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListSqlTuningAdvisorTaskRecommendationsRequest,
                                    ListSqlTuningAdvisorTaskRecommendationsResponse>
                            handler);

    /**
     * Lists the SQL Tuning Advisor tasks for the specified Managed Database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSqlTuningAdvisorTasksResponse> listSqlTuningAdvisorTasks(
            ListSqlTuningAdvisorTasksRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSqlTuningAdvisorTasksRequest, ListSqlTuningAdvisorTasksResponse>
                    handler);

    /**
     * Start a SQL tuning task for a given set of SQLs from active session history
     * top SQLs.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<StartSqlTuningTaskResponse> startSqlTuningTask(
            StartSqlTuningTaskRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StartSqlTuningTaskRequest, StartSqlTuningTaskResponse>
                    handler);
}
