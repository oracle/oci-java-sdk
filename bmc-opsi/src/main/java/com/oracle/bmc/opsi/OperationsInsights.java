/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi;

import com.oracle.bmc.opsi.requests.*;
import com.oracle.bmc.opsi.responses.*;

/**
 * Use the Operations Insights API to perform data extraction operations to obtain database
 * resource utilization, performance statistics, and reference information. For more information,
 * see [About Oracle Cloud Infrastructure Operations Insights](https://docs.cloud.oracle.com/en-us/iaas/operations-insights/doc/operations-insights.html).
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public interface OperationsInsights extends AutoCloseable {

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
     * Moves a DatabaseInsight resource from one compartment identifier to another. When provided, If-Match is checked against ETag values of the resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ChangeDatabaseInsightCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeDatabaseInsightCompartment API.
     */
    ChangeDatabaseInsightCompartmentResponse changeDatabaseInsightCompartment(
            ChangeDatabaseInsightCompartmentRequest request);

    /**
     * Moves a EnterpriseManagerBridge resource from one compartment to another. When provided, If-Match is checked against ETag values of the resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ChangeEnterpriseManagerBridgeCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeEnterpriseManagerBridgeCompartment API.
     */
    ChangeEnterpriseManagerBridgeCompartmentResponse changeEnterpriseManagerBridgeCompartment(
            ChangeEnterpriseManagerBridgeCompartmentRequest request);

    /**
     * Moves a HostInsight resource from one compartment identifier to another. When provided, If-Match is checked against ETag values of the resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ChangeHostInsightCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeHostInsightCompartment API.
     */
    ChangeHostInsightCompartmentResponse changeHostInsightCompartment(
            ChangeHostInsightCompartmentRequest request);

    /**
     * Create a Database Insight resource for a database in Operations Insights. The database will be enabled in Operations Insights. Database metric collection and analysis will be started.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/CreateDatabaseInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDatabaseInsight API.
     */
    CreateDatabaseInsightResponse createDatabaseInsight(CreateDatabaseInsightRequest request);

    /**
     * Create a Enterprise Manager bridge in Operations Insights.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/CreateEnterpriseManagerBridgeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateEnterpriseManagerBridge API.
     */
    CreateEnterpriseManagerBridgeResponse createEnterpriseManagerBridge(
            CreateEnterpriseManagerBridgeRequest request);

    /**
     * Create a Host Insight resource for a host in Operations Insights. The host will be enabled in Operations Insights. Host metric collection and analysis will be started.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/CreateHostInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateHostInsight API.
     */
    CreateHostInsightResponse createHostInsight(CreateHostInsightRequest request);

    /**
     * Deletes a database insight. The database insight will be deleted and cannot be enabled again.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/DeleteDatabaseInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDatabaseInsight API.
     */
    DeleteDatabaseInsightResponse deleteDatabaseInsight(DeleteDatabaseInsightRequest request);

    /**
     * Deletes an Operations Insights Enterprise Manager bridge. If any database insight is still referencing this bridge, the operation will fail.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/DeleteEnterpriseManagerBridgeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteEnterpriseManagerBridge API.
     */
    DeleteEnterpriseManagerBridgeResponse deleteEnterpriseManagerBridge(
            DeleteEnterpriseManagerBridgeRequest request);

    /**
     * Deletes a host insight. The host insight will be deleted and cannot be enabled again.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/DeleteHostInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteHostInsight API.
     */
    DeleteHostInsightResponse deleteHostInsight(DeleteHostInsightRequest request);

    /**
     * Disables a database in Operations Insights. Database metric collection and analysis will be stopped.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/DisableDatabaseInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableDatabaseInsight API.
     */
    DisableDatabaseInsightResponse disableDatabaseInsight(DisableDatabaseInsightRequest request);

    /**
     * Disables a host in Operations Insights. Host metric collection and analysis will be stopped.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/DisableHostInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableHostInsight API.
     */
    DisableHostInsightResponse disableHostInsight(DisableHostInsightRequest request);

    /**
     * Enables a database in Operations Insights. Database metric collection and analysis will be started.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/EnableDatabaseInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableDatabaseInsight API.
     */
    EnableDatabaseInsightResponse enableDatabaseInsight(EnableDatabaseInsightRequest request);

    /**
     * Enables a host in Operations Insights. Host metric collection and analysis will be started.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/EnableHostInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableHostInsight API.
     */
    EnableHostInsightResponse enableHostInsight(EnableHostInsightRequest request);

    /**
     * Gets details of a database insight.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/GetDatabaseInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDatabaseInsight API.
     */
    GetDatabaseInsightResponse getDatabaseInsight(GetDatabaseInsightRequest request);

    /**
     * Gets details of an Operations Insights Enterprise Manager bridge.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/GetEnterpriseManagerBridgeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetEnterpriseManagerBridge API.
     */
    GetEnterpriseManagerBridgeResponse getEnterpriseManagerBridge(
            GetEnterpriseManagerBridgeRequest request);

    /**
     * Gets details of a host insight.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/GetHostInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetHostInsight API.
     */
    GetHostInsightResponse getHostInsight(GetHostInsightRequest request);

    /**
     * Gets the status of the work request with the given ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/GetWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * This is a generic ingest endpoint for all database configuration metrics.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/IngestDatabaseConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use IngestDatabaseConfiguration API.
     */
    IngestDatabaseConfigurationResponse ingestDatabaseConfiguration(
            IngestDatabaseConfigurationRequest request);

    /**
     * This is a generic ingest endpoint for all the host configuration metrics
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/IngestHostConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use IngestHostConfiguration API.
     */
    IngestHostConfigurationResponse ingestHostConfiguration(IngestHostConfigurationRequest request);

    /**
     * This is a generic ingest endpoint for all the host performance metrics
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/IngestHostMetricsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use IngestHostMetrics API.
     */
    IngestHostMetricsResponse ingestHostMetrics(IngestHostMetricsRequest request);

    /**
     * The sqlbucket endpoint takes in a JSON payload, persists it in Operations Insights ingest pipeline.
     * Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/IngestSqlBucketExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use IngestSqlBucket API.
     */
    IngestSqlBucketResponse ingestSqlBucket(IngestSqlBucketRequest request);

    /**
     * The SqlPlanLines endpoint takes in a JSON payload, persists it in Operation Insights ingest pipeline.
     * Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/IngestSqlPlanLinesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use IngestSqlPlanLines API.
     */
    IngestSqlPlanLinesResponse ingestSqlPlanLines(IngestSqlPlanLinesRequest request);

    /**
     * The SqlText endpoint takes in a JSON payload, persists it in Operation Insights ingest pipeline.
     * Either databaseId or id must be specified.
     * Disclaimer: SQL text being uploaded explicitly via APIs is not masked. Any sensitive literals contained in the sqlFullText column should be masked prior to ingestion.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/IngestSqlTextExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use IngestSqlText API.
     */
    IngestSqlTextResponse ingestSqlText(IngestSqlTextRequest request);

    /**
     * Gets a list of database insights based on the query parameters specified. Either compartmentId or id query parameter must be specified.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListDatabaseInsightsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDatabaseInsights API.
     */
    ListDatabaseInsightsResponse listDatabaseInsights(ListDatabaseInsightsRequest request);

    /**
     * Gets a list of Operations Insights Enterprise Manager bridges. Either compartmentId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListEnterpriseManagerBridgesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListEnterpriseManagerBridges API.
     */
    ListEnterpriseManagerBridgesResponse listEnterpriseManagerBridges(
            ListEnterpriseManagerBridgesRequest request);

    /**
     * Gets a list of host insights based on the query parameters specified. Either compartmentId or id query parameter must be specified.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListHostInsightsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListHostInsights API.
     */
    ListHostInsightsResponse listHostInsights(ListHostInsightsRequest request);

    /**
     * Get a list of hosted entities details.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListHostedEntitiesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListHostedEntities API.
     */
    ListHostedEntitiesResponse listHostedEntities(ListHostedEntitiesRequest request);

    /**
     * Gets a list of importable entities for an Operations Insights Enterprise Manager bridge that have not been imported before.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListImportableEnterpriseManagerEntitiesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListImportableEnterpriseManagerEntities API.
     */
    ListImportableEnterpriseManagerEntitiesResponse listImportableEnterpriseManagerEntities(
            ListImportableEnterpriseManagerEntitiesRequest request);

    /**
     * Query SQL Warehouse to list the plan xml for a given SQL execution plan. This returns a SqlPlanCollection object, but is currently limited to a single plan.
     * Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListSqlPlansExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSqlPlans API.
     */
    ListSqlPlansResponse listSqlPlans(ListSqlPlansRequest request);

    /**
     * Search SQL by SQL Identifier across databases and get the SQL Text and the details of the databases executing the SQL for a given time period.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListSqlSearchesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSqlSearches API.
     */
    ListSqlSearchesResponse listSqlSearches(ListSqlSearchesRequest request);

    /**
     * Query SQL Warehouse to get the full SQL Text for a SQL.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListSqlTextsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSqlTexts API.
     */
    ListSqlTextsResponse listSqlTexts(ListSqlTextsRequest request);

    /**
     * Return a (paginated) list of errors for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListWorkRequestErrorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Return a (paginated) list of logs for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListWorkRequestLogsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Returns response with time series data (endTimestamp, capacity, baseCapacity) for the time period specified.
     * The maximum time range for analysis is 2 years, hence this is intentionally not paginated.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeDatabaseInsightResourceCapacityTrendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeDatabaseInsightResourceCapacityTrend API.
     */
    SummarizeDatabaseInsightResourceCapacityTrendResponse
            summarizeDatabaseInsightResourceCapacityTrend(
                    SummarizeDatabaseInsightResourceCapacityTrendRequest request);

    /**
     * Get Forecast predictions for CPU and Storage resources since a time in the past.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeDatabaseInsightResourceForecastTrendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeDatabaseInsightResourceForecastTrend API.
     */
    SummarizeDatabaseInsightResourceForecastTrendResponse
            summarizeDatabaseInsightResourceForecastTrend(
                    SummarizeDatabaseInsightResourceForecastTrendRequest request);

    /**
     * Lists the Resource statistics (usage,capacity, usage change percent, utilization percent, base capacity, isAutoScalingEnabled) for each database filtered by utilization level
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeDatabaseInsightResourceStatisticsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeDatabaseInsightResourceStatistics API.
     */
    SummarizeDatabaseInsightResourceStatisticsResponse summarizeDatabaseInsightResourceStatistics(
            SummarizeDatabaseInsightResourceStatisticsRequest request);

    /**
     * A cumulative distribution function is used to rank the usage data points per database within the specified time period.
     * For each database, the minimum data point with a ranking > the percentile value is included in the summation.
     * Linear regression functions are used to calculate the usage change percentage.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeDatabaseInsightResourceUsageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeDatabaseInsightResourceUsage API.
     */
    SummarizeDatabaseInsightResourceUsageResponse summarizeDatabaseInsightResourceUsage(
            SummarizeDatabaseInsightResourceUsageRequest request);

    /**
     * Returns response with time series data (endTimestamp, usage, capacity) for the time period specified.
     * The maximum time range for analysis is 2 years, hence this is intentionally not paginated.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeDatabaseInsightResourceUsageTrendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeDatabaseInsightResourceUsageTrend API.
     */
    SummarizeDatabaseInsightResourceUsageTrendResponse summarizeDatabaseInsightResourceUsageTrend(
            SummarizeDatabaseInsightResourceUsageTrendRequest request);

    /**
     * Gets resources with current utilization (high and low) and projected utilization (high and low) for a resource type over specified time period.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeDatabaseInsightResourceUtilizationInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeDatabaseInsightResourceUtilizationInsight API.
     */
    SummarizeDatabaseInsightResourceUtilizationInsightResponse
            summarizeDatabaseInsightResourceUtilizationInsight(
                    SummarizeDatabaseInsightResourceUtilizationInsightRequest request);

    /**
     * Returns response with usage time series data (endTimestamp, usage, capacity) with breakdown by tablespaceName for the time period specified.
     * The maximum time range for analysis is 2 years, hence this is intentionally not paginated.
     * Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeDatabaseInsightTablespaceUsageTrendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeDatabaseInsightTablespaceUsageTrend API.
     */
    SummarizeDatabaseInsightTablespaceUsageTrendResponse
            summarizeDatabaseInsightTablespaceUsageTrend(
                    SummarizeDatabaseInsightTablespaceUsageTrendRequest request);

    /**
     * Returns response with time series data (endTimestamp, capacity) for the time period specified.
     * The maximum time range for analysis is 2 years, hence this is intentionally not paginated.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeHostInsightResourceCapacityTrendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeHostInsightResourceCapacityTrend API.
     */
    SummarizeHostInsightResourceCapacityTrendResponse summarizeHostInsightResourceCapacityTrend(
            SummarizeHostInsightResourceCapacityTrendRequest request);

    /**
     * Get Forecast predictions for CPU or memory resources since a time in the past.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeHostInsightResourceForecastTrendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeHostInsightResourceForecastTrend API.
     */
    SummarizeHostInsightResourceForecastTrendResponse summarizeHostInsightResourceForecastTrend(
            SummarizeHostInsightResourceForecastTrendRequest request);

    /**
     * Lists the resource statistics (usage, capacity, usage change percent, utilization percent, load) for each host filtered
     * by utilization level.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeHostInsightResourceStatisticsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeHostInsightResourceStatistics API.
     */
    SummarizeHostInsightResourceStatisticsResponse summarizeHostInsightResourceStatistics(
            SummarizeHostInsightResourceStatisticsRequest request);

    /**
     * A cumulative distribution function is used to rank the usage data points per host within the specified time period.
     * For each host, the minimum data point with a ranking > the percentile value is included in the summation.
     * Linear regression functions are used to calculate the usage change percentage.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeHostInsightResourceUsageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeHostInsightResourceUsage API.
     */
    SummarizeHostInsightResourceUsageResponse summarizeHostInsightResourceUsage(
            SummarizeHostInsightResourceUsageRequest request);

    /**
     * Returns response with time series data (endTimestamp, usage, capacity) for the time period specified.
     * The maximum time range for analysis is 2 years, hence this is intentionally not paginated.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeHostInsightResourceUsageTrendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeHostInsightResourceUsageTrend API.
     */
    SummarizeHostInsightResourceUsageTrendResponse summarizeHostInsightResourceUsageTrend(
            SummarizeHostInsightResourceUsageTrendRequest request);

    /**
     * Gets resources with current utilization (high and low) and projected utilization (high and low) for a resource type over specified time period.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeHostInsightResourceUtilizationInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeHostInsightResourceUtilizationInsight API.
     */
    SummarizeHostInsightResourceUtilizationInsightResponse
            summarizeHostInsightResourceUtilizationInsight(
                    SummarizeHostInsightResourceUtilizationInsightRequest request);

    /**
     * Query SQL Warehouse to get the performance insights for SQLs taking greater than X% database time for a given time period across the given databases or database types.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeSqlInsightsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeSqlInsights API.
     */
    SummarizeSqlInsightsResponse summarizeSqlInsights(SummarizeSqlInsightsRequest request);

    /**
     * Query SQL Warehouse to get the performance insights on the execution plans for a given SQL for a given time period.
     * Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeSqlPlanInsightsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeSqlPlanInsights API.
     */
    SummarizeSqlPlanInsightsResponse summarizeSqlPlanInsights(
            SummarizeSqlPlanInsightsRequest request);

    /**
     * Query SQL Warehouse to summarize the response time distribution of query executions for a given SQL for a given time period.
     * Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeSqlResponseTimeDistributionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeSqlResponseTimeDistributions API.
     */
    SummarizeSqlResponseTimeDistributionsResponse summarizeSqlResponseTimeDistributions(
            SummarizeSqlResponseTimeDistributionsRequest request);

    /**
     * Query SQL Warehouse to get the performance statistics for SQLs taking greater than X% database time for a given time period across the given databases or database types.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeSqlStatisticsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeSqlStatistics API.
     */
    SummarizeSqlStatisticsResponse summarizeSqlStatistics(SummarizeSqlStatisticsRequest request);

    /**
     * Query SQL Warehouse to get the performance statistics time series for a given SQL across given databases for a given time period.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeSqlStatisticsTimeSeriesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeSqlStatisticsTimeSeries API.
     */
    SummarizeSqlStatisticsTimeSeriesResponse summarizeSqlStatisticsTimeSeries(
            SummarizeSqlStatisticsTimeSeriesRequest request);

    /**
     * Query SQL Warehouse to get the performance statistics time series for a given SQL by execution plans for a given time period.
     * Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeSqlStatisticsTimeSeriesByPlanExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeSqlStatisticsTimeSeriesByPlan API.
     */
    SummarizeSqlStatisticsTimeSeriesByPlanResponse summarizeSqlStatisticsTimeSeriesByPlan(
            SummarizeSqlStatisticsTimeSeriesByPlanRequest request);

    /**
     * Updates configuration of a database insight.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/UpdateDatabaseInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDatabaseInsight API.
     */
    UpdateDatabaseInsightResponse updateDatabaseInsight(UpdateDatabaseInsightRequest request);

    /**
     * Updates configuration of an Operations Insights Enterprise Manager bridge.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/UpdateEnterpriseManagerBridgeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateEnterpriseManagerBridge API.
     */
    UpdateEnterpriseManagerBridgeResponse updateEnterpriseManagerBridge(
            UpdateEnterpriseManagerBridgeRequest request);

    /**
     * Updates configuration of a host insight.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/UpdateHostInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateHostInsight API.
     */
    UpdateHostInsightResponse updateHostInsight(UpdateHostInsightRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    OperationsInsightsWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    OperationsInsightsPaginators getPaginators();
}
