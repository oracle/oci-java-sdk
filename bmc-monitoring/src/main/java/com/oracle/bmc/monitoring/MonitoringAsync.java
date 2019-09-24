/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.monitoring;

import com.oracle.bmc.monitoring.requests.*;
import com.oracle.bmc.monitoring.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
public interface MonitoringAsync extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

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
     * Moves an alarm into a different compartment within the same tenancy.
     * <p>
     * For information about moving resources between compartments, see [Moving Resources Between Compartments](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeAlarmCompartmentResponse> changeAlarmCompartment(
            ChangeAlarmCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeAlarmCompartmentRequest, ChangeAlarmCompartmentResponse>
                    handler);

    /**
     * Creates a new alarm in the specified compartment.
     * For important limits information, see [Limits on Monitoring](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#Limits).
     * <p>
     * This call is subject to a Monitoring limit that applies to the total number of requests across all alarm operations.
     * Monitoring might throttle this call to reject an otherwise valid request when the total rate of alarm operations exceeds 10 requests,
     * or transactions, per second (TPS) for a given tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAlarmResponse> createAlarm(
            CreateAlarmRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateAlarmRequest, CreateAlarmResponse> handler);

    /**
     * Deletes the specified alarm.
     * For important limits information, see [Limits on Monitoring](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#Limits).
     * <p>
     * This call is subject to a Monitoring limit that applies to the total number of requests across all alarm operations.
     * Monitoring might throttle this call to reject an otherwise valid request when the total rate of alarm operations exceeds 10 requests,
     * or transactions, per second (TPS) for a given tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAlarmResponse> deleteAlarm(
            DeleteAlarmRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteAlarmRequest, DeleteAlarmResponse> handler);

    /**
     * Gets the specified alarm.
     * For important limits information, see [Limits on Monitoring](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#Limits).
     * <p>
     * This call is subject to a Monitoring limit that applies to the total number of requests across all alarm operations.
     * Monitoring might throttle this call to reject an otherwise valid request when the total rate of alarm operations exceeds 10 requests,
     * or transactions, per second (TPS) for a given tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAlarmResponse> getAlarm(
            GetAlarmRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAlarmRequest, GetAlarmResponse> handler);

    /**
     * Get the history of the specified alarm.
     * For important limits information, see [Limits on Monitoring](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#Limits).
     * <p>
     * This call is subject to a Monitoring limit that applies to the total number of requests across all alarm operations.
     * Monitoring might throttle this call to reject an otherwise valid request when the total rate of alarm operations exceeds 10 requests,
     * or transactions, per second (TPS) for a given tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAlarmHistoryResponse> getAlarmHistory(
            GetAlarmHistoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAlarmHistoryRequest, GetAlarmHistoryResponse>
                    handler);

    /**
     * Lists the alarms for the specified compartment.
     * For important limits information, see [Limits on Monitoring](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#Limits).
     * <p>
     * This call is subject to a Monitoring limit that applies to the total number of requests across all alarm operations.
     * Monitoring might throttle this call to reject an otherwise valid request when the total rate of alarm operations exceeds 10 requests,
     * or transactions, per second (TPS) for a given tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAlarmsResponse> listAlarms(
            ListAlarmsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAlarmsRequest, ListAlarmsResponse> handler);

    /**
     * List the status of each alarm in the specified compartment.
     * For important limits information, see [Limits on Monitoring](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#Limits).
     * <p>
     * This call is subject to a Monitoring limit that applies to the total number of requests across all alarm operations.
     * Monitoring might throttle this call to reject an otherwise valid request when the total rate of alarm operations exceeds 10 requests,
     * or transactions, per second (TPS) for a given tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAlarmsStatusResponse> listAlarmsStatus(
            ListAlarmsStatusRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAlarmsStatusRequest, ListAlarmsStatusResponse>
                    handler);

    /**
     * Returns metric definitions that match the criteria specified in the request. Compartment OCID required.
     * For information about metrics, see [Metrics Overview](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#MetricsOverview).
     * For important limits information, see [Limits on Monitoring](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#Limits).
     * <p>
     * Transactions Per Second (TPS) per-tenancy limit for this operation: 10.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListMetricsResponse> listMetrics(
            ListMetricsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListMetricsRequest, ListMetricsResponse> handler);

    /**
     * Publishes raw metric data points to the Monitoring service.
     * For more information about publishing metrics, see [Publishing Custom Metrics](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Tasks/publishingcustommetrics.htm).
     * For important limits information, see [Limits on Monitoring](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#Limits).
     * <p>
     * Per-call limits information follows.
     * <p>
     * Dimensions per metric group*. Maximum: 20. Minimum: 1.
     * * Unique metric streams*. Maximum: 50.
     * * Transactions Per Second (TPS) per-tenancy limit for this operation: 50.
     * <p>
     *A metric group is the combination of a given metric, metric namespace, and tenancy for the purpose of determining limits.
     * A dimension is a qualifier provided in a metric definition.
     * A metric stream is an individual set of aggregated data for a metric, typically specific to a resource.
     * For more information about metric-related concepts, see [Monitoring Concepts](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#concepts).
     * <p>
     * The endpoints for this operation differ from other Monitoring operations. Replace the string `telemetry` with `telemetry-ingestion` in the endpoint, as in the following example:
     * <p>
     * https://telemetry-ingestion.eu-frankfurt-1.oraclecloud.com
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<PostMetricDataResponse> postMetricData(
            PostMetricDataRequest request,
            com.oracle.bmc.responses.AsyncHandler<PostMetricDataRequest, PostMetricDataResponse>
                    handler);

    /**
     * Removes any existing suppression for the specified alarm.
     * For important limits information, see [Limits on Monitoring](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#Limits).
     * <p>
     * This call is subject to a Monitoring limit that applies to the total number of requests across all alarm operations.
     * Monitoring might throttle this call to reject an otherwise valid request when the total rate of alarm operations exceeds 10 requests,
     * or transactions, per second (TPS) for a given tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveAlarmSuppressionResponse> removeAlarmSuppression(
            RemoveAlarmSuppressionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemoveAlarmSuppressionRequest, RemoveAlarmSuppressionResponse>
                    handler);

    /**
     * Returns aggregated data that match the criteria specified in the request. Compartment OCID required.
     * For information on metric queries, see [Building Metric Queries](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Tasks/buildingqueries.htm).
     * For important limits information, see [Limits on Monitoring](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#Limits).
     * <p>
     * Transactions Per Second (TPS) per-tenancy limit for this operation: 10.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeMetricsDataResponse> summarizeMetricsData(
            SummarizeMetricsDataRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeMetricsDataRequest, SummarizeMetricsDataResponse>
                    handler);

    /**
     * Updates the specified alarm.
     * For important limits information, see [Limits on Monitoring](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#Limits).
     * <p>
     * This call is subject to a Monitoring limit that applies to the total number of requests across all alarm operations.
     * Monitoring might throttle this call to reject an otherwise valid request when the total rate of alarm operations exceeds 10 requests,
     * or transactions, per second (TPS) for a given tenancy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAlarmResponse> updateAlarm(
            UpdateAlarmRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateAlarmRequest, UpdateAlarmResponse> handler);
}
