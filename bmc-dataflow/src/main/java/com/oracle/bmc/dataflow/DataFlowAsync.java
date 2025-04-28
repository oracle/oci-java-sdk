/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow;

import com.oracle.bmc.dataflow.requests.*;
import com.oracle.bmc.dataflow.responses.*;

/**
 * Use the Data Flow APIs to run any Apache Spark application at any scale without deploying or
 * managing any infrastructure.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
public interface DataFlowAsync extends AutoCloseable {

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
     * Deletes an application using an `applicationId` and terminates related runs. This operation
     * will timeout in approximate 30 minutes if any related Runs are not terminated successfully.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CascadingDeleteApplicationResponse> cascadingDeleteApplication(
            CascadingDeleteApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CascadingDeleteApplicationRequest, CascadingDeleteApplicationResponse>
                    handler);

    /**
     * Moves an application into a different compartment. When provided, If-Match is checked against
     * ETag values of the resource. Associated resources, like runs, will not be automatically
     * moved.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeApplicationCompartmentResponse> changeApplicationCompartment(
            ChangeApplicationCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeApplicationCompartmentRequest,
                            ChangeApplicationCompartmentResponse>
                    handler);

    /**
     * Moves a pool into a different compartment. When provided, If-Match is checked against ETag
     * values of the resource. Associated resources, like historical metrics, will not be
     * automatically moved. The pool must be in a terminal state (STOPPED, FAILED) in order for it
     * to be moved to a different compartment
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangePoolCompartmentResponse> changePoolCompartment(
            ChangePoolCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangePoolCompartmentRequest, ChangePoolCompartmentResponse>
                    handler);

    /**
     * Moves a private endpoint into a different compartment. When provided, If-Match is checked
     * against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangePrivateEndpointCompartmentResponse>
            changePrivateEndpointCompartment(
                    ChangePrivateEndpointCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangePrivateEndpointCompartmentRequest,
                                    ChangePrivateEndpointCompartmentResponse>
                            handler);

    /**
     * Moves a run into a different compartment. When provided, If-Match is checked against ETag
     * values of the resource. Associated resources, like historical metrics, will not be
     * automatically moved. The run must be in a terminal state (CANCELED, FAILED, SUCCEEDED) in
     * order for it to be moved to a different compartment
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeRunCompartmentResponse> changeRunCompartment(
            ChangeRunCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeRunCompartmentRequest, ChangeRunCompartmentResponse>
                    handler);

    /**
     * Moves an Sql Endpoint from one compartment to another. When provided, If-Match is checked
     * against ETag values of the Sql Endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeSqlEndpointCompartmentResponse> changeSqlEndpointCompartment(
            ChangeSqlEndpointCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeSqlEndpointCompartmentRequest,
                            ChangeSqlEndpointCompartmentResponse>
                    handler);

    /**
     * Creates an application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateApplicationResponse> createApplication(
            CreateApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateApplicationRequest, CreateApplicationResponse>
                    handler);

    /**
     * Create a pool to be used by dataflow runs or applications.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreatePoolResponse> createPool(
            CreatePoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreatePoolRequest, CreatePoolResponse> handler);

    /**
     * Creates a private endpoint to be used by applications.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreatePrivateEndpointResponse> createPrivateEndpoint(
            CreatePrivateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreatePrivateEndpointRequest, CreatePrivateEndpointResponse>
                    handler);

    /**
     * Creates a run for an application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateRunResponse> createRun(
            CreateRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateRunRequest, CreateRunResponse> handler);

    /**
     * Create a new Sql Endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSqlEndpointResponse> createSqlEndpoint(
            CreateSqlEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSqlEndpointRequest, CreateSqlEndpointResponse>
                    handler);

    /**
     * Executes a statement for a Session run.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateStatementResponse> createStatement(
            CreateStatementRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateStatementRequest, CreateStatementResponse>
                    handler);

    /**
     * Deletes an application using an `applicationId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteApplicationResponse> deleteApplication(
            DeleteApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteApplicationRequest, DeleteApplicationResponse>
                    handler);

    /**
     * Deletes a pool using a `poolId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeletePoolResponse> deletePool(
            DeletePoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeletePoolRequest, DeletePoolResponse> handler);

    /**
     * Deletes a private endpoint using a `privateEndpointId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeletePrivateEndpointResponse> deletePrivateEndpoint(
            DeletePrivateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeletePrivateEndpointRequest, DeletePrivateEndpointResponse>
                    handler);

    /**
     * Cancels the specified run if it has not already completed or was previously cancelled. If a
     * run is in progress, the executing job will be killed.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteRunResponse> deleteRun(
            DeleteRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteRunRequest, DeleteRunResponse> handler);

    /**
     * Delete a Sql Endpoint resource, identified by the SqlEndpoint id.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSqlEndpointResponse> deleteSqlEndpoint(
            DeleteSqlEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSqlEndpointRequest, DeleteSqlEndpointResponse>
                    handler);

    /**
     * Cancels the specified statement for a Session run.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteStatementResponse> deleteStatement(
            DeleteStatementRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteStatementRequest, DeleteStatementResponse>
                    handler);

    /**
     * Retrieves an application using an `applicationId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetApplicationResponse> getApplication(
            GetApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetApplicationRequest, GetApplicationResponse>
                    handler);

    /**
     * Retrieves a pool using a `poolId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPoolResponse> getPool(
            GetPoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPoolRequest, GetPoolResponse> handler);

    /**
     * Retrieves an private endpoint using a `privateEndpointId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPrivateEndpointResponse> getPrivateEndpoint(
            GetPrivateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPrivateEndpointRequest, GetPrivateEndpointResponse>
                    handler);

    /**
     * Retrieves the run for the specified `runId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetRunResponse> getRun(
            GetRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetRunRequest, GetRunResponse> handler);

    /**
     * Retrieves the content of an run log.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetRunLogResponse> getRunLog(
            GetRunLogRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetRunLogRequest, GetRunLogResponse> handler);

    /**
     * Retrieves a SQL Endpoint using a sqlEndpointId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSqlEndpointResponse> getSqlEndpoint(
            GetSqlEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSqlEndpointRequest, GetSqlEndpointResponse>
                    handler);

    /**
     * Retrieves the statement corresponding to the `statementId` for a Session run specified by
     * `runId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetStatementResponse> getStatement(
            GetStatementRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetStatementRequest, GetStatementResponse>
                    handler);

    /**
     * Gets the status of the work request with the given OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Lists all applications in the specified compartment. Only one parameter other than
     * compartmentId may also be included in a query. The query must include compartmentId. If the
     * query does not include compartmentId, or includes compartmentId but two or more other
     * parameters an error is returned.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListApplicationsResponse> listApplications(
            ListApplicationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListApplicationsRequest, ListApplicationsResponse>
                    handler);

    /**
     * Lists all pools in the specified compartment. The query must include compartmentId. The query
     * may also include one other parameter. If the query does not include compartmentId, or
     * includes compartmentId, but with two or more other parameters, an error is returned.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPoolsResponse> listPools(
            ListPoolsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPoolsRequest, ListPoolsResponse> handler);

    /**
     * Lists all private endpoints in the specified compartment. The query must include
     * compartmentId. The query may also include one other parameter. If the query does not include
     * compartmentId, or includes compartmentId, but with two or more other parameters, an error is
     * returned.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPrivateEndpointsResponse> listPrivateEndpoints(
            ListPrivateEndpointsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPrivateEndpointsRequest, ListPrivateEndpointsResponse>
                    handler);

    /**
     * Retrieves summaries of the run's logs.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListRunLogsResponse> listRunLogs(
            ListRunLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListRunLogsRequest, ListRunLogsResponse> handler);

    /**
     * Lists all runs of an application in the specified compartment. Only one parameter other than
     * compartmentId may also be included in a query. The query must include compartmentId. If the
     * query does not include compartmentId, or includes compartmentId but two or more other
     * parameters an error is returned.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListRunsResponse> listRuns(
            ListRunsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListRunsRequest, ListRunsResponse> handler);

    /**
     * Lists all Sql Endpoints in the specified compartment. The query must include compartmentId or
     * sqlEndpointId. If the query does not include either compartmentId or sqlEndpointId, an error
     * is returned.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSqlEndpointsResponse> listSqlEndpoints(
            ListSqlEndpointsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSqlEndpointsRequest, ListSqlEndpointsResponse>
                    handler);

    /**
     * Lists all statements for a Session run.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListStatementsResponse> listStatements(
            ListStatementsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListStatementsRequest, ListStatementsResponse>
                    handler);

    /**
     * Return a (paginated) list of errors for a given work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Return a paginated list of logs for a given work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Starts the dataflow pool for a given `poolId`. When provided, If-Match is checked against
     * ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StartPoolResponse> startPool(
            StartPoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<StartPoolRequest, StartPoolResponse> handler);

    /**
     * Starts the SqlEndpoint for a given `SqlEndpointId`. When provided, If-Match is checked
     * against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StartSqlEndpointResponse> startSqlEndpoint(
            StartSqlEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<StartSqlEndpointRequest, StartSqlEndpointResponse>
                    handler);

    /**
     * Stops the dataflow pool for a given `poolId`. When provided, If-Match is checked against ETag
     * values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StopPoolResponse> stopPool(
            StopPoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<StopPoolRequest, StopPoolResponse> handler);

    /**
     * Stops the SqlEndpoint for a given `SqlEndpointId`. When provided, If-Match is checked against
     * ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StopSqlEndpointResponse> stopSqlEndpoint(
            StopSqlEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<StopSqlEndpointRequest, StopSqlEndpointResponse>
                    handler);

    /**
     * Updates an application using an `applicationId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateApplicationResponse> updateApplication(
            UpdateApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateApplicationRequest, UpdateApplicationResponse>
                    handler);

    /**
     * Updates a pool using a `poolId`.If changes to a pool doesn't match a previously defined
     * pool,then a 409 status code will be returned.This indicates that a conflict has been
     * detected.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePoolResponse> updatePool(
            UpdatePoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdatePoolRequest, UpdatePoolResponse> handler);

    /**
     * Updates a private endpoint using a `privateEndpointId`. If changes to a private endpoint
     * match a previously defined private endpoint, then a 409 status code will be returned. This
     * indicates that a conflict has been detected.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePrivateEndpointResponse> updatePrivateEndpoint(
            UpdatePrivateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdatePrivateEndpointRequest, UpdatePrivateEndpointResponse>
                    handler);

    /**
     * Updates a run using a `runId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateRunResponse> updateRun(
            UpdateRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateRunRequest, UpdateRunResponse> handler);

    /**
     * Update a Sql Endpoint resource, identified by the SqlEndpoint id.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSqlEndpointResponse> updateSqlEndpoint(
            UpdateSqlEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSqlEndpointRequest, UpdateSqlEndpointResponse>
                    handler);
}
