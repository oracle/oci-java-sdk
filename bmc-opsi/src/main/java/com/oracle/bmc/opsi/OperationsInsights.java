/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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
     * The sqlbucket endpoint takes in a JSON payload, persists it in Operations Insights ingest pipeline.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/IngestSqlBucketExample.java.html">here</a> to see how to use IngestSqlBucket API.
     */
    IngestSqlBucketResponse ingestSqlBucket(IngestSqlBucketRequest request);

    /**
     * The SqlPlanLines endpoint takes in a JSON payload, persists it in Operation Insights ingest pipeline.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/IngestSqlPlanLinesExample.java.html">here</a> to see how to use IngestSqlPlanLines API.
     */
    IngestSqlPlanLinesResponse ingestSqlPlanLines(IngestSqlPlanLinesRequest request);

    /**
     * The SqlText endpoint takes in a JSON payload, persists it in Operation Insights ingest pipeline.
     * Disclaimer: SQL text being uploaded explicitly via APIs is not masked. Any sensitive literals contained in the sqlFullText column should be masked prior to ingestion.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/IngestSqlTextExample.java.html">here</a> to see how to use IngestSqlText API.
     */
    IngestSqlTextResponse ingestSqlText(IngestSqlTextRequest request);

    /**
     * Lists database insight resources
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListDatabaseInsightsExample.java.html">here</a> to see how to use ListDatabaseInsights API.
     */
    ListDatabaseInsightsResponse listDatabaseInsights(ListDatabaseInsightsRequest request);

    /**
     * Query SQL Warehouse to list the plan xml for a given SQL execution plan. This returns a SqlPlanCollection object, but is currently limited to a single plan.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListSqlPlansExample.java.html">here</a> to see how to use ListSqlPlans API.
     */
    ListSqlPlansResponse listSqlPlans(ListSqlPlansRequest request);

    /**
     * Search SQL by SQL Identifier across databases and get the SQL Text and the details of the databases executing the SQL for a given time period.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListSqlSearchesExample.java.html">here</a> to see how to use ListSqlSearches API.
     */
    ListSqlSearchesResponse listSqlSearches(ListSqlSearchesRequest request);

    /**
     * Query SQL Warehouse to get the full SQL Text for a SQL.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListSqlTextsExample.java.html">here</a> to see how to use ListSqlTexts API.
     */
    ListSqlTextsResponse listSqlTexts(ListSqlTextsRequest request);

    /**
     * Returns response with time series data (endTimestamp, capacity, baseCapacity) for the time period specified.
     * The maximum time range for analysis is 2 years, hence this is intentionally not paginated.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeDatabaseInsightResourceCapacityTrendExample.java.html">here</a> to see how to use SummarizeDatabaseInsightResourceCapacityTrend API.
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
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeDatabaseInsightResourceForecastTrendExample.java.html">here</a> to see how to use SummarizeDatabaseInsightResourceForecastTrend API.
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
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeDatabaseInsightResourceStatisticsExample.java.html">here</a> to see how to use SummarizeDatabaseInsightResourceStatistics API.
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
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeDatabaseInsightResourceUsageExample.java.html">here</a> to see how to use SummarizeDatabaseInsightResourceUsage API.
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
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeDatabaseInsightResourceUsageTrendExample.java.html">here</a> to see how to use SummarizeDatabaseInsightResourceUsageTrend API.
     */
    SummarizeDatabaseInsightResourceUsageTrendResponse summarizeDatabaseInsightResourceUsageTrend(
            SummarizeDatabaseInsightResourceUsageTrendRequest request);

    /**
     * Gets resources with current utilization (high and low) and projected utilization (high and low) for a resource type over specified time period.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeDatabaseInsightResourceUtilizationInsightExample.java.html">here</a> to see how to use SummarizeDatabaseInsightResourceUtilizationInsight API.
     */
    SummarizeDatabaseInsightResourceUtilizationInsightResponse
            summarizeDatabaseInsightResourceUtilizationInsight(
                    SummarizeDatabaseInsightResourceUtilizationInsightRequest request);

    /**
     * Query SQL Warehouse to get the performance insights for SQLs taking greater than X% database time for a given time period across the given databases or database types.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeSqlInsightsExample.java.html">here</a> to see how to use SummarizeSqlInsights API.
     */
    SummarizeSqlInsightsResponse summarizeSqlInsights(SummarizeSqlInsightsRequest request);

    /**
     * Query SQL Warehouse to get the performance insights on the execution plans for a given SQL for a given time period.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeSqlPlanInsightsExample.java.html">here</a> to see how to use SummarizeSqlPlanInsights API.
     */
    SummarizeSqlPlanInsightsResponse summarizeSqlPlanInsights(
            SummarizeSqlPlanInsightsRequest request);

    /**
     * Query SQL Warehouse to summarize the response time distribution of query executions for a given SQL for a given time period.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeSqlResponseTimeDistributionsExample.java.html">here</a> to see how to use SummarizeSqlResponseTimeDistributions API.
     */
    SummarizeSqlResponseTimeDistributionsResponse summarizeSqlResponseTimeDistributions(
            SummarizeSqlResponseTimeDistributionsRequest request);

    /**
     * Query SQL Warehouse to get the performance statistics for SQLs taking greater than X% database time for a given time period across the given databases or database types.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeSqlStatisticsExample.java.html">here</a> to see how to use SummarizeSqlStatistics API.
     */
    SummarizeSqlStatisticsResponse summarizeSqlStatistics(SummarizeSqlStatisticsRequest request);

    /**
     * Query SQL Warehouse to get the performance statistics time series for a given SQL across given databases for a given time period.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeSqlStatisticsTimeSeriesExample.java.html">here</a> to see how to use SummarizeSqlStatisticsTimeSeries API.
     */
    SummarizeSqlStatisticsTimeSeriesResponse summarizeSqlStatisticsTimeSeries(
            SummarizeSqlStatisticsTimeSeriesRequest request);

    /**
     * Query SQL Warehouse to get the performance statistics time series for a given SQL by execution plans for a given time period.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeSqlStatisticsTimeSeriesByPlanExample.java.html">here</a> to see how to use SummarizeSqlStatisticsTimeSeriesByPlan API.
     */
    SummarizeSqlStatisticsTimeSeriesByPlanResponse summarizeSqlStatisticsTimeSeriesByPlan(
            SummarizeSqlStatisticsTimeSeriesByPlanRequest request);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    OperationsInsightsPaginators getPaginators();
}
