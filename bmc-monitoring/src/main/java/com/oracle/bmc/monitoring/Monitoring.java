/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring;

import com.oracle.bmc.monitoring.requests.*;
import com.oracle.bmc.monitoring.responses.*;

/**
 * Use the Monitoring API to manage metric queries and alarms for assessing the health, capacity,
 * and performance of your cloud resources. Endpoints vary by operation. For PostMetric, use the
 * {@code telemetry-ingestion} endpoints; for all other operations, use the {@code telemetry}
 * endpoints. For information about monitoring, see [Monitoring
 * Overview](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm).
 *
 * <p>This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by
 * default if no circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
public interface Monitoring extends AutoCloseable {

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
     * Moves an alarm into a different compartment within the same tenancy.
     *
     * <p>For information about moving resources between compartments, see [Moving Resources Between
     * Compartments](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/monitoring/ChangeAlarmCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeAlarmCompartment API.
     */
    ChangeAlarmCompartmentResponse changeAlarmCompartment(ChangeAlarmCompartmentRequest request);

    /**
     * Creates a new alarm in the specified compartment. For important limits information, see
     * [Limits on
     * Monitoring](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#Limits).
     *
     * <p>This call is subject to a Monitoring limit that applies to the total number of requests
     * across all alarm operations. Monitoring might throttle this call to reject an otherwise valid
     * request when the total rate of alarm operations exceeds 10 requests, or transactions, per
     * second (TPS) for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/monitoring/CreateAlarmExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateAlarm API.
     */
    CreateAlarmResponse createAlarm(CreateAlarmRequest request);

    /**
     * Deletes the specified alarm. For important limits information, see [Limits on
     * Monitoring](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#Limits).
     *
     * <p>This call is subject to a Monitoring limit that applies to the total number of requests
     * across all alarm operations. Monitoring might throttle this call to reject an otherwise valid
     * request when the total rate of alarm operations exceeds 10 requests, or transactions, per
     * second (TPS) for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/monitoring/DeleteAlarmExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteAlarm API.
     */
    DeleteAlarmResponse deleteAlarm(DeleteAlarmRequest request);

    /**
     * Gets the specified alarm. For important limits information, see [Limits on
     * Monitoring](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#Limits).
     *
     * <p>This call is subject to a Monitoring limit that applies to the total number of requests
     * across all alarm operations. Monitoring might throttle this call to reject an otherwise valid
     * request when the total rate of alarm operations exceeds 10 requests, or transactions, per
     * second (TPS) for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/monitoring/GetAlarmExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAlarm API.
     */
    GetAlarmResponse getAlarm(GetAlarmRequest request);

    /**
     * Get the history of the specified alarm. For important limits information, see [Limits on
     * Monitoring](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#Limits).
     *
     * <p>This call is subject to a Monitoring limit that applies to the total number of requests
     * across all alarm operations. Monitoring might throttle this call to reject an otherwise valid
     * request when the total rate of alarm operations exceeds 10 requests, or transactions, per
     * second (TPS) for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/monitoring/GetAlarmHistoryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAlarmHistory
     *     API.
     */
    GetAlarmHistoryResponse getAlarmHistory(GetAlarmHistoryRequest request);

    /**
     * Lists the alarms for the specified compartment. For important limits information, see [Limits
     * on
     * Monitoring](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#Limits).
     *
     * <p>This call is subject to a Monitoring limit that applies to the total number of requests
     * across all alarm operations. Monitoring might throttle this call to reject an otherwise valid
     * request when the total rate of alarm operations exceeds 10 requests, or transactions, per
     * second (TPS) for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/monitoring/ListAlarmsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAlarms API.
     */
    ListAlarmsResponse listAlarms(ListAlarmsRequest request);

    /**
     * List the status of each alarm in the specified compartment. Status is collective, across all
     * metric streams in the alarm. To list alarm status for each metric stream, use {@link
     * #retrieveDimensionStates(RetrieveDimensionStatesRequest) retrieveDimensionStates}. The alarm
     * attribute `isNotificationsPerMetricDimensionEnabled` must be set to `true`. For important
     * limits information, see [Limits on
     * Monitoring](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#Limits).
     *
     * <p>This call is subject to a Monitoring limit that applies to the total number of requests
     * across all alarm operations. Monitoring might throttle this call to reject an otherwise valid
     * request when the total rate of alarm operations exceeds 10 requests, or transactions, per
     * second (TPS) for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/monitoring/ListAlarmsStatusExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAlarmsStatus
     *     API.
     */
    ListAlarmsStatusResponse listAlarmsStatus(ListAlarmsStatusRequest request);

    /**
     * Returns metric definitions that match the criteria specified in the request. Compartment OCID
     * required. For information about metrics, see [Metrics
     * Overview](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#MetricsOverview).
     * For important limits information, see [Limits on
     * Monitoring](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#Limits).
     *
     * <p>Transactions Per Second (TPS) per-tenancy limit for this operation: 10.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/monitoring/ListMetricsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMetrics API.
     */
    ListMetricsResponse listMetrics(ListMetricsRequest request);

    /**
     * Publishes raw metric data points to the Monitoring service. For more information about
     * publishing metrics, see [Publishing Custom
     * Metrics](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Tasks/publishingcustommetrics.htm).
     * For important limits information, see [Limits on
     * Monitoring](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#Limits).
     *
     * <p>Per-call limits information follows.
     *
     * <p>Dimensions per metric group*. Maximum: 20. Minimum: 1. * Unique metric streams*. Maximum:
     * 50. * Transactions Per Second (TPS) per-tenancy limit for this operation: 50.
     *
     * <p>A metric group is the combination of a given metric, metric namespace, and tenancy for the
     * purpose of determining limits. A dimension is a qualifier provided in a metric definition. A
     * metric stream is an individual set of aggregated data for a metric with zero or more
     * dimension values. For more information about metric-related concepts, see [Monitoring
     * Concepts](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#concepts).
     *
     * <p>The endpoints for this operation differ from other Monitoring operations. Replace the
     * string `telemetry` with `telemetry-ingestion` in the endpoint, as in the following example:
     *
     * <p>https://telemetry-ingestion.eu-frankfurt-1.oraclecloud.com
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/monitoring/PostMetricDataExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PostMetricData API.
     */
    PostMetricDataResponse postMetricData(PostMetricDataRequest request);

    /**
     * Removes any existing suppression for the specified alarm. For important limits information,
     * see [Limits on
     * Monitoring](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#Limits).
     *
     * <p>This call is subject to a Monitoring limit that applies to the total number of requests
     * across all alarm operations. Monitoring might throttle this call to reject an otherwise valid
     * request when the total rate of alarm operations exceeds 10 requests, or transactions, per
     * second (TPS) for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/monitoring/RemoveAlarmSuppressionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemoveAlarmSuppression API.
     */
    RemoveAlarmSuppressionResponse removeAlarmSuppression(RemoveAlarmSuppressionRequest request);

    /**
     * Lists the current alarm status of each metric stream, where status is derived from the metric
     * stream's last associated transition. Optionally filter by status value and one or more
     * dimension key-value pairs. This operation is only valid for alarms that have notifications
     * per dimension enabled (`isNotificationsPerMetricDimensionEnabled=true`). If
     * `isNotificationsPerMetricDimensionEnabled` for the alarm is false or null, then no results
     * are returned.
     *
     * <p>For important limits information, see [Limits on
     * Monitoring](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#Limits).
     *
     * <p>This call is subject to a Monitoring limit that applies to the total number of requests
     * across all alarm operations. Monitoring might throttle this call to reject an otherwise valid
     * request when the total rate of alarm operations exceeds 10 requests, or transactions, per
     * second (TPS) for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/monitoring/RetrieveDimensionStatesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RetrieveDimensionStates API.
     */
    RetrieveDimensionStatesResponse retrieveDimensionStates(RetrieveDimensionStatesRequest request);

    /**
     * Returns aggregated data that match the criteria specified in the request. Compartment OCID
     * required. For information on metric queries, see [Building Metric
     * Queries](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Tasks/buildingqueries.htm).
     * For important limits information, see [Limits on
     * Monitoring](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#Limits).
     *
     * <p>Transactions Per Second (TPS) per-tenancy limit for this operation: 10.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/monitoring/SummarizeMetricsDataExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SummarizeMetricsData API.
     */
    SummarizeMetricsDataResponse summarizeMetricsData(SummarizeMetricsDataRequest request);

    /**
     * Updates the specified alarm. For important limits information, see [Limits on
     * Monitoring](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#Limits).
     *
     * <p>This call is subject to a Monitoring limit that applies to the total number of requests
     * across all alarm operations. Monitoring might throttle this call to reject an otherwise valid
     * request when the total rate of alarm operations exceeds 10 requests, or transactions, per
     * second (TPS) for a given tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/monitoring/UpdateAlarmExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateAlarm API.
     */
    UpdateAlarmResponse updateAlarm(UpdateAlarmRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    MonitoringWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    MonitoringPaginators getPaginators();
}
