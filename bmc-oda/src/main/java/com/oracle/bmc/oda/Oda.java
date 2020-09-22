/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda;

import com.oracle.bmc.oda.requests.*;
import com.oracle.bmc.oda.responses.*;

/**
 * API to create and maintain Oracle Digital Assistant service instances.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public interface Oda extends AutoCloseable {

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
     * Moves an Digital Assistant instance into a different compartment. When provided, If-Match is checked against
     * ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeOdaInstanceCompartmentResponse changeOdaInstanceCompartment(
            ChangeOdaInstanceCompartmentRequest request);

    /**
     * Starts an asynchronous job to create a Digital Assistant instance.
     * <p>
     * To monitor the status of the job, take the `opc-work-request-id` response
     * header value and use it to call `GET /workRequests/{workRequestID}`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateOdaInstanceResponse createOdaInstance(CreateOdaInstanceRequest request);

    /**
     * Starts an asynchronous job to delete the specified Digital Assistant instance.
     * To monitor the status of the job, take the `opc-work-request-id` response header value and use it to call `GET /workRequests/{workRequestID}`.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteOdaInstanceResponse deleteOdaInstance(DeleteOdaInstanceRequest request);

    /**
     * Gets the specified Digital Assistant instance.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetOdaInstanceResponse getOdaInstance(GetOdaInstanceRequest request);

    /**
     * Gets information about the work request with the specified ID, including its status.
     * <p>
     * You can use this operation to monitor the status of jobs that you
     * requested to create, delete, and update instances.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Returns a page of Digital Assistant instances that belong to the specified
     * compartment.
     * <p>
     * If the `opc-next-page` header appears in the response, then
     * there are more items to retrieve. To get the next page in the subsequent
     * GET request, include the header's value as the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListOdaInstancesResponse listOdaInstances(ListOdaInstancesRequest request);

    /**
     * Returns a page of errors for the specified work request.
     * <p>
     * If the `opc-next-page` header appears in the response, then
     * there are more items to retrieve. To get the next page in the subsequent
     * GET request, include the header's value as the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Returns a page of of log messages for a given work request.
     * <p>
     * If the `opc-next-page` header appears in the response, then
     * there are more items to retrieve. To get the next page in the subsequent
     * GET request, include the header's value as the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Returns a page of work requests for the specified compartment.
     * <p>
     * If the `opc-next-page` header appears in the response, then
     * there are more items to retrieve. To get the next page in the subsequent
     * GET request, include the header's value as the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Starts an inactive Digital Assistant instance. Once active, the instance will be accessible and metering
     * of requests will be started again.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    StartOdaInstanceResponse startOdaInstance(StartOdaInstanceRequest request);

    /**
     * Stops an active Digital Assistant instance. Once inactive, the instance will not be accessible and metering
     * of requests will be stopped until the instance is started again. Data associated with the instance
     * is not affected.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    StopOdaInstanceResponse stopOdaInstance(StopOdaInstanceRequest request);

    /**
     * Updates the specified Digital Assistant instance with the information in the request body.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateOdaInstanceResponse updateOdaInstance(UpdateOdaInstanceRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    OdaWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    OdaPaginators getPaginators();
}
