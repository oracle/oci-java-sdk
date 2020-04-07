/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dataflow;

import com.oracle.bmc.dataflow.requests.*;
import com.oracle.bmc.dataflow.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
public interface DataFlow extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

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
     * Moves an application into a different compartment. When provided, If-Match is checked against ETag values of the resource.
     * Associated resources, like runs, will not be automatically moved.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeApplicationCompartmentResponse changeApplicationCompartment(
            ChangeApplicationCompartmentRequest request);

    /**
     * Moves a run into a different compartment. When provided, If-Match is checked against ETag
     * values of the resource. Associated resources, like historical metrics, will not be
     * automatically moved. The run must be in a terminal state (CANCELED, FAILED, SUCCEEDED) in
     * order for it to be moved to a different compartment
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeRunCompartmentResponse changeRunCompartment(ChangeRunCompartmentRequest request);

    /**
     * Creates an application.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateApplicationResponse createApplication(CreateApplicationRequest request);

    /**
     * Creates a run for an application.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateRunResponse createRun(CreateRunRequest request);

    /**
     * Deletes an application using an `applicationId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request);

    /**
     * Cancels the specified run if it has not already completed or was previously cancelled.
     * If a run is in progress, the executing job will be killed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteRunResponse deleteRun(DeleteRunRequest request);

    /**
     * Retrieves an application using an `applicationId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetApplicationResponse getApplication(GetApplicationRequest request);

    /**
     * Retrieves the run for the specified `runId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetRunResponse getRun(GetRunRequest request);

    /**
     * Retrieves the content of an run log.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetRunLogResponse getRunLog(GetRunLogRequest request);

    /**
     * Lists all applications in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListApplicationsResponse listApplications(ListApplicationsRequest request);

    /**
     * Retrieves summaries of the run's logs.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListRunLogsResponse listRunLogs(ListRunLogsRequest request);

    /**
     * Lists all runs of an application in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListRunsResponse listRuns(ListRunsRequest request);

    /**
     * Updates an application using an `applicationId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateApplicationResponse updateApplication(UpdateApplicationRequest request);

    /**
     * Updates a run using a `runId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateRunResponse updateRun(UpdateRunRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    DataFlowWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DataFlowPaginators getPaginators();
}
