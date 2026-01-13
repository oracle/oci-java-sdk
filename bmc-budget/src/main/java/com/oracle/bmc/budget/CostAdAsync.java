/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget;

import com.oracle.bmc.budget.requests.*;
import com.oracle.bmc.budget.responses.*;

/**
 * Use the Budgets API to manage budgets and budget alerts. For more information, see [Budgets
 * Overview](https://docs.oracle.com/iaas/Content/Billing/Concepts/budgetsoverview.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public interface CostAdAsync extends AutoCloseable {

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
     * Creates a new CostAlert Subscription.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateCostAlertSubscriptionResponse> createCostAlertSubscription(
            CreateCostAlertSubscriptionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateCostAlertSubscriptionRequest, CreateCostAlertSubscriptionResponse>
                    handler);

    /**
     * Creates a new costAnomaly Monitor.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateCostAnomalyMonitorResponse> createCostAnomalyMonitor(
            CreateCostAnomalyMonitorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateCostAnomalyMonitorRequest, CreateCostAnomalyMonitorResponse>
                    handler);

    /**
     * Deletes a specified CostAlertSubscription resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCostAlertSubscriptionResponse> deleteCostAlertSubscription(
            DeleteCostAlertSubscriptionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteCostAlertSubscriptionRequest, DeleteCostAlertSubscriptionResponse>
                    handler);

    /**
     * Deletes a specified CostAnomalyMonitor resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCostAnomalyMonitorResponse> deleteCostAnomalyMonitor(
            DeleteCostAnomalyMonitorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteCostAnomalyMonitorRequest, DeleteCostAnomalyMonitorResponse>
                    handler);

    /**
     * Disables the cost anomaly monitor. This stops cost anomaly detection for targeted
     * resource(s).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableCostAnomalyMonitorResponse> disableCostAnomalyMonitor(
            DisableCostAnomalyMonitorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DisableCostAnomalyMonitorRequest, DisableCostAnomalyMonitorResponse>
                    handler);

    /**
     * Enables the cost anomaly monitor. This (re)starts the cost anomaly detection for targeted
     * resource(s).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableCostAnomalyMonitorResponse> enableCostAnomalyMonitor(
            EnableCostAnomalyMonitorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            EnableCostAnomalyMonitorRequest, EnableCostAnomalyMonitorResponse>
                    handler);

    /**
     * Gets a CostAlertSubscription by the identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetCostAlertSubscriptionResponse> getCostAlertSubscription(
            GetCostAlertSubscriptionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCostAlertSubscriptionRequest, GetCostAlertSubscriptionResponse>
                    handler);

    /**
     * Gets a CostAnomalyEvent by the identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetCostAnomalyEventResponse> getCostAnomalyEvent(
            GetCostAnomalyEventRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCostAnomalyEventRequest, GetCostAnomalyEventResponse>
                    handler);

    /**
     * Gets a CostAnomalyMonitor by the identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetCostAnomalyMonitorResponse> getCostAnomalyMonitor(
            GetCostAnomalyMonitorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCostAnomalyMonitorRequest, GetCostAnomalyMonitorResponse>
                    handler);

    /**
     * Gets a list of Cost Alert Subscription in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCostAlertSubscriptionsResponse> listCostAlertSubscriptions(
            ListCostAlertSubscriptionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCostAlertSubscriptionsRequest, ListCostAlertSubscriptionsResponse>
                    handler);

    /**
     * Gets a list of Cost Anomaly Event in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCostAnomalyEventsResponse> listCostAnomalyEvents(
            ListCostAnomalyEventsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCostAnomalyEventsRequest, ListCostAnomalyEventsResponse>
                    handler);

    /**
     * Gets a list of Cost Anomaly Monitors in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCostAnomalyMonitorsResponse> listCostAnomalyMonitors(
            ListCostAnomalyMonitorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCostAnomalyMonitorsRequest, ListCostAnomalyMonitorsResponse>
                    handler);

    /**
     * Gets a list of Cost Anomaly Events analytics summary - aggregated metrics for a given time
     * period.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeCostAnomalyEventAnalyticsResponse>
            summarizeCostAnomalyEventAnalytics(
                    SummarizeCostAnomalyEventAnalyticsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeCostAnomalyEventAnalyticsRequest,
                                    SummarizeCostAnomalyEventAnalyticsResponse>
                            handler);

    /**
     * Update a CostAlertSubscription identified by the OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCostAlertSubscriptionResponse> updateCostAlertSubscription(
            UpdateCostAlertSubscriptionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateCostAlertSubscriptionRequest, UpdateCostAlertSubscriptionResponse>
                    handler);

    /**
     * Update a CostAnomalyEvent identified by the OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCostAnomalyEventResponse> updateCostAnomalyEvent(
            UpdateCostAnomalyEventRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateCostAnomalyEventRequest, UpdateCostAnomalyEventResponse>
                    handler);

    /**
     * Update a CostAnomalyMonitor identified by the OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCostAnomalyMonitorResponse> updateCostAnomalyMonitor(
            UpdateCostAnomalyMonitorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateCostAnomalyMonitorRequest, UpdateCostAnomalyMonitorResponse>
                    handler);
}
