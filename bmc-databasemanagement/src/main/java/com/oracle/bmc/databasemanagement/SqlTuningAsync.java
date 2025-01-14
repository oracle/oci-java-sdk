/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement;

import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;

/**
 * Use the Database Management API to monitor and manage resources such as Oracle Databases, MySQL
 * Databases, and External Database Systems. For more information, see [Database
 * Management](https://docs.cloud.oracle.com/iaas/database-management/home.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public interface SqlTuningAsync extends AutoCloseable {

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
     * Clones and runs a SQL tuning task in the database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CloneSqlTuningTaskResponse> cloneSqlTuningTask(
            CloneSqlTuningTaskRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CloneSqlTuningTaskRequest, CloneSqlTuningTaskResponse>
                    handler);

    /**
     * Creates an empty Sql tuning set within the Managed Database specified by managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSqlTuningSetResponse> createSqlTuningSet(
            CreateSqlTuningSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSqlTuningSetRequest, CreateSqlTuningSetResponse>
                    handler);

    /**
     * Drops the Sql tuning set specified by sqlTuningSet within the Managed Database specified by
     * managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DropSqlTuningSetResponse> dropSqlTuningSet(
            DropSqlTuningSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<DropSqlTuningSetRequest, DropSqlTuningSetResponse>
                    handler);

    /**
     * Drops a SQL tuning task and its related results from the database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DropSqlTuningTaskResponse> dropSqlTuningTask(
            DropSqlTuningTaskRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DropSqlTuningTaskRequest, DropSqlTuningTaskResponse>
                    handler);

    /**
     * Deletes the Sqls in the specified Sql tuning set that matches the filter criteria provided in
     * the basicFilter. If basicFilter criteria is not provided, then entire Sqls in the Sql tuning
     * set is deleted.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DropSqlsInSqlTuningSetResponse> dropSqlsInSqlTuningSet(
            DropSqlsInSqlTuningSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DropSqlsInSqlTuningSetRequest, DropSqlsInSqlTuningSetResponse>
                    handler);

    /**
     * Fetch the details of Sql statements in the Sql tuning set specified by name, owner and
     * optional filter parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<FetchSqlTuningSetResponse> fetchSqlTuningSet(
            FetchSqlTuningSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            FetchSqlTuningSetRequest, FetchSqlTuningSetResponse>
                    handler);

    /**
     * Retrieves a comparison of the existing SQL execution plan and a new plan. A SQL tuning task
     * may suggest a new execution plan for a SQL, and this API retrieves the comparison report of
     * the statistics of the two plans.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExecutionPlanStatsComparisionResponse>
            getExecutionPlanStatsComparision(
                    GetExecutionPlanStatsComparisionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetExecutionPlanStatsComparisionRequest,
                                    GetExecutionPlanStatsComparisionResponse>
                            handler);

    /**
     * Retrieves a SQL execution plan for the SQL being tuned.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSqlExecutionPlanResponse> getSqlExecutionPlan(
            GetSqlExecutionPlanRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSqlExecutionPlanRequest, GetSqlExecutionPlanResponse>
                    handler);

    /**
     * Gets the summary report for the specified SQL Tuning Advisor task.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSqlTuningAdvisorTaskSummaryReportResponse>
            getSqlTuningAdvisorTaskSummaryReport(
                    GetSqlTuningAdvisorTaskSummaryReportRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetSqlTuningAdvisorTaskSummaryReportRequest,
                                    GetSqlTuningAdvisorTaskSummaryReportResponse>
                            handler);

    /**
     * Gets an array of the details of the findings that match specific filters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSqlTuningAdvisorTaskFindingsResponse>
            listSqlTuningAdvisorTaskFindings(
                    ListSqlTuningAdvisorTaskFindingsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListSqlTuningAdvisorTaskFindingsRequest,
                                    ListSqlTuningAdvisorTaskFindingsResponse>
                            handler);

    /**
     * Gets the findings and possible actions for a given object in a SQL tuning task. The task ID
     * and object ID are used to retrieve the findings and recommendations.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
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
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSqlTuningAdvisorTasksResponse> listSqlTuningAdvisorTasks(
            ListSqlTuningAdvisorTasksRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSqlTuningAdvisorTasksRequest, ListSqlTuningAdvisorTasksResponse>
                    handler);

    /**
     * Lists the SQL tuning sets for the specified Managed Database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSqlTuningSetsResponse> listSqlTuningSets(
            ListSqlTuningSetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSqlTuningSetsRequest, ListSqlTuningSetsResponse>
                    handler);

    /**
     * Load Sql statements into the Sql tuning set specified by name and optional filter parameters
     * within the Managed Database specified by managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<LoadSqlTuningSetResponse> loadSqlTuningSet(
            LoadSqlTuningSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<LoadSqlTuningSetRequest, LoadSqlTuningSetResponse>
                    handler);

    /**
     * Saves the specified list of Sqls statements into another new Sql tuning set or loads into an
     * existing Sql tuning set'.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SaveSqlTuningSetAsResponse> saveSqlTuningSetAs(
            SaveSqlTuningSetAsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SaveSqlTuningSetAsRequest, SaveSqlTuningSetAsResponse>
                    handler);

    /**
     * Starts a SQL tuning task for a given set of SQL statements from the active session history
     * top SQL statements.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StartSqlTuningTaskResponse> startSqlTuningTask(
            StartSqlTuningTaskRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StartSqlTuningTaskRequest, StartSqlTuningTaskResponse>
                    handler);

    /**
     * Executes a SQL query to check whether user entered basic filter criteria is valid or not.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ValidateBasicFilterResponse> validateBasicFilter(
            ValidateBasicFilterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ValidateBasicFilterRequest, ValidateBasicFilterResponse>
                    handler);
}
