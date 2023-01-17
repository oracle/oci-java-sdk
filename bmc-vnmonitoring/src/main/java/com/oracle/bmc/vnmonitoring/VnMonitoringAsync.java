/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring;

import com.oracle.bmc.vnmonitoring.requests.*;
import com.oracle.bmc.vnmonitoring.responses.*;

/**
 * Use the Network Monitoring API to troubleshoot routing and security issues for resources such as
 * virtual cloud networks (VCNs) and compute instances. For more information, see the console
 * documentation for the [Network Path
 * Analyzer](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/path_analyzer.htm) tool.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface VnMonitoringAsync extends AutoCloseable {

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
     * Moves a `PathAnalyzerTest` resource from one compartment to another based on the identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangePathAnalyzerTestCompartmentResponse>
            changePathAnalyzerTestCompartment(
                    ChangePathAnalyzerTestCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangePathAnalyzerTestCompartmentRequest,
                                    ChangePathAnalyzerTestCompartmentResponse>
                            handler);

    /**
     * Creates a new `PathAnalyzerTest` resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreatePathAnalyzerTestResponse> createPathAnalyzerTest(
            CreatePathAnalyzerTestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreatePathAnalyzerTestRequest, CreatePathAnalyzerTestResponse>
                    handler);

    /**
     * Deletes a `PathAnalyzerTest` resource using its identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeletePathAnalyzerTestResponse> deletePathAnalyzerTest(
            DeletePathAnalyzerTestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeletePathAnalyzerTestRequest, DeletePathAnalyzerTestResponse>
                    handler);

    /**
     * Use this method to initiate a [Network Path
     * Analyzer](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/path_analyzer.htm)
     * analysis. This method returns an opc-work-request-id, and you can poll the status of the work
     * request until it either fails or succeeds.
     *
     * <p>If the work request status is successful, use {@link
     * #listWorkRequestResults(ListWorkRequestResultsRequest, Consumer, Consumer)
     * listWorkRequestResults} with the work request ID to ask for the successful analysis results.
     * If the work request status is failed, use {@link
     * #listWorkRequestErrors(ListWorkRequestErrorsRequest, Consumer, Consumer)
     * listWorkRequestErrors} with the work request ID to ask for the analysis failure information.
     * The information returned from either of these methods can be used to build a final report.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPathAnalysisResponse> getPathAnalysis(
            GetPathAnalysisRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPathAnalysisRequest, GetPathAnalysisResponse>
                    handler);

    /**
     * Gets a `PathAnalyzerTest` using its identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPathAnalyzerTestResponse> getPathAnalyzerTest(
            GetPathAnalyzerTestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPathAnalyzerTestRequest, GetPathAnalyzerTestResponse>
                    handler);

    /**
     * Gets the details of a work request.
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
     * Returns a list of all `PathAnalyzerTests` in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPathAnalyzerTestsResponse> listPathAnalyzerTests(
            ListPathAnalyzerTestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPathAnalyzerTestsRequest, ListPathAnalyzerTestsResponse>
                    handler);

    /**
     * Returns a (paginated) list of errors for the work request with the given ID. This information
     * is used to build the final report output.
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
     * Returns a (paginated) list of logs for the work request with the given ID.
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
     * Returns a (paginated) list of results for a successful work request. This information is used
     * to build the final report output.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestResultsResponse> listWorkRequestResults(
            ListWorkRequestResultsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestResultsRequest, ListWorkRequestResultsResponse>
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
     * Updates a `PathAnalyzerTest` using its identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePathAnalyzerTestResponse> updatePathAnalyzerTest(
            UpdatePathAnalyzerTestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdatePathAnalyzerTestRequest, UpdatePathAnalyzerTestResponse>
                    handler);
}
