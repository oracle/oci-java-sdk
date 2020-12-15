/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics;

import com.oracle.bmc.analytics.requests.*;
import com.oracle.bmc.analytics.responses.*;

/**
 * Analytics API.
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
public interface Analytics extends AutoCloseable {

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
     * Change the compartment of an Analytics instance. The operation is long-running
     * and creates a new WorkRequest.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/analytics/ChangeAnalyticsInstanceCompartmentExample.java.html">here</a> to see how to use ChangeAnalyticsInstanceCompartment API.
     */
    ChangeAnalyticsInstanceCompartmentResponse changeAnalyticsInstanceCompartment(
            ChangeAnalyticsInstanceCompartmentRequest request);

    /**
     * Change an Analytics instance network endpoint. The operation is long-running
     * and creates a new WorkRequest.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/analytics/ChangeAnalyticsInstanceNetworkEndpointExample.java.html">here</a> to see how to use ChangeAnalyticsInstanceNetworkEndpoint API.
     */
    ChangeAnalyticsInstanceNetworkEndpointResponse changeAnalyticsInstanceNetworkEndpoint(
            ChangeAnalyticsInstanceNetworkEndpointRequest request);

    /**
     * Create a new AnalyticsInstance in the specified compartment. The operation is long-running
     * and creates a new WorkRequest.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/analytics/CreateAnalyticsInstanceExample.java.html">here</a> to see how to use CreateAnalyticsInstance API.
     */
    CreateAnalyticsInstanceResponse createAnalyticsInstance(CreateAnalyticsInstanceRequest request);

    /**
     * Terminates the specified Analytics instance. The operation is long-running
     * and creates a new WorkRequest.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/analytics/DeleteAnalyticsInstanceExample.java.html">here</a> to see how to use DeleteAnalyticsInstance API.
     */
    DeleteAnalyticsInstanceResponse deleteAnalyticsInstance(DeleteAnalyticsInstanceRequest request);

    /**
     * Cancel a work request that has not started yet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/analytics/DeleteWorkRequestExample.java.html">here</a> to see how to use DeleteWorkRequest API.
     */
    DeleteWorkRequestResponse deleteWorkRequest(DeleteWorkRequestRequest request);

    /**
     * Info for a specific Analytics instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/analytics/GetAnalyticsInstanceExample.java.html">here</a> to see how to use GetAnalyticsInstance API.
     */
    GetAnalyticsInstanceResponse getAnalyticsInstance(GetAnalyticsInstanceRequest request);

    /**
     * Get the details of a work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/analytics/GetWorkRequestExample.java.html">here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * List Analytics instances.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/analytics/ListAnalyticsInstancesExample.java.html">here</a> to see how to use ListAnalyticsInstances API.
     */
    ListAnalyticsInstancesResponse listAnalyticsInstances(ListAnalyticsInstancesRequest request);

    /**
     * Get the errors of a work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/analytics/ListWorkRequestErrorsExample.java.html">here</a> to see how to use ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Get the logs of a work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/analytics/ListWorkRequestLogsExample.java.html">here</a> to see how to use ListWorkRequestLogs API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * List all work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/analytics/ListWorkRequestsExample.java.html">here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Scale an Analytics instance up or down. The operation is long-running
     * and creates a new WorkRequest.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/analytics/ScaleAnalyticsInstanceExample.java.html">here</a> to see how to use ScaleAnalyticsInstance API.
     */
    ScaleAnalyticsInstanceResponse scaleAnalyticsInstance(ScaleAnalyticsInstanceRequest request);

    /**
     * Starts the specified Analytics instance. The operation is long-running
     * and creates a new WorkRequest.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/analytics/StartAnalyticsInstanceExample.java.html">here</a> to see how to use StartAnalyticsInstance API.
     */
    StartAnalyticsInstanceResponse startAnalyticsInstance(StartAnalyticsInstanceRequest request);

    /**
     * Stop the specified Analytics instance. The operation is long-running
     * and creates a new WorkRequest.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/analytics/StopAnalyticsInstanceExample.java.html">here</a> to see how to use StopAnalyticsInstance API.
     */
    StopAnalyticsInstanceResponse stopAnalyticsInstance(StopAnalyticsInstanceRequest request);

    /**
     * Updates certain fields of an Analytics instance. Fields that are not provided in the
     * request will not be updated.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/analytics/UpdateAnalyticsInstanceExample.java.html">here</a> to see how to use UpdateAnalyticsInstance API.
     */
    UpdateAnalyticsInstanceResponse updateAnalyticsInstance(UpdateAnalyticsInstanceRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    AnalyticsWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    AnalyticsPaginators getPaginators();
}
