/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics;

import com.oracle.bmc.apmsynthetics.requests.*;
import com.oracle.bmc.apmsynthetics.responses.*;

/**
 * Use the APM Availability Monitoring API to query Scripts, Monitors, Dedicated Vantage Points and
 * On-Premise Vantage Points resources. For more information, see [Application Performance
 * Monitoring](https://docs.oracle.com/iaas/application-performance-monitoring/index.html).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public interface ApmSyntheticAsync extends AutoCloseable {

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
     * Gets aggregated network data for given executions.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AggregateNetworkDataResponse> aggregateNetworkData(
            AggregateNetworkDataRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AggregateNetworkDataRequest, AggregateNetworkDataResponse>
                    handler);

    /**
     * Registers a new dedicated vantage point.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDedicatedVantagePointResponse> createDedicatedVantagePoint(
            CreateDedicatedVantagePointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDedicatedVantagePointRequest, CreateDedicatedVantagePointResponse>
                    handler);

    /**
     * Creates a new monitor.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateMonitorResponse> createMonitor(
            CreateMonitorRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateMonitorRequest, CreateMonitorResponse>
                    handler);

    /**
     * Registers a new On-premise vantage point.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOnPremiseVantagePointResponse> createOnPremiseVantagePoint(
            CreateOnPremiseVantagePointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateOnPremiseVantagePointRequest, CreateOnPremiseVantagePointResponse>
                    handler);

    /**
     * Creates a new script.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateScriptResponse> createScript(
            CreateScriptRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateScriptRequest, CreateScriptResponse>
                    handler);

    /**
     * Registers a new worker.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateWorkerResponse> createWorker(
            CreateWorkerRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateWorkerRequest, CreateWorkerResponse>
                    handler);

    /**
     * Deregisters the specified dedicated vantage point.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDedicatedVantagePointResponse> deleteDedicatedVantagePoint(
            DeleteDedicatedVantagePointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDedicatedVantagePointRequest, DeleteDedicatedVantagePointResponse>
                    handler);

    /**
     * Deletes the specified monitor.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMonitorResponse> deleteMonitor(
            DeleteMonitorRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteMonitorRequest, DeleteMonitorResponse>
                    handler);

    /**
     * Deregisters the specified On-premise vantage point.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOnPremiseVantagePointResponse> deleteOnPremiseVantagePoint(
            DeleteOnPremiseVantagePointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteOnPremiseVantagePointRequest, DeleteOnPremiseVantagePointResponse>
                    handler);

    /**
     * Deletes the specified script.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteScriptResponse> deleteScript(
            DeleteScriptRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteScriptRequest, DeleteScriptResponse>
                    handler);

    /**
     * Deregisters the specified worker.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteWorkerResponse> deleteWorker(
            DeleteWorkerRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteWorkerRequest, DeleteWorkerResponse>
                    handler);

    /**
     * Gets the details of the dedicated vantage point identified by the OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDedicatedVantagePointResponse> getDedicatedVantagePoint(
            GetDedicatedVantagePointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDedicatedVantagePointRequest, GetDedicatedVantagePointResponse>
                    handler);

    /**
     * Gets the configuration of the monitor identified by the OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetMonitorResponse> getMonitor(
            GetMonitorRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetMonitorRequest, GetMonitorResponse> handler);

    /**
     * Gets the results for a specific execution of a monitor identified by OCID. The results are in
     * a HAR file, Screenshot, Console Log or Network details.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetMonitorResultResponse> getMonitorResult(
            GetMonitorResultRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetMonitorResultRequest, GetMonitorResultResponse>
                    handler);

    /**
     * Gets the details of the On-premise vantage point identified by the OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOnPremiseVantagePointResponse> getOnPremiseVantagePoint(
            GetOnPremiseVantagePointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetOnPremiseVantagePointRequest, GetOnPremiseVantagePointResponse>
                    handler);

    /**
     * Gets the configuration of the script identified by the OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetScriptResponse> getScript(
            GetScriptRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetScriptRequest, GetScriptResponse> handler);

    /**
     * Gets the details of the worker identified by the OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkerResponse> getWorker(
            GetWorkerRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkerRequest, GetWorkerResponse> handler);

    /**
     * Returns a list of dedicated vantage points.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDedicatedVantagePointsResponse> listDedicatedVantagePoints(
            ListDedicatedVantagePointsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDedicatedVantagePointsRequest, ListDedicatedVantagePointsResponse>
                    handler);

    /**
     * Returns a list of monitors.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListMonitorsResponse> listMonitors(
            ListMonitorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListMonitorsRequest, ListMonitorsResponse>
                    handler);

    /**
     * Returns a list of On-premise vantage points.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOnPremiseVantagePointsResponse> listOnPremiseVantagePoints(
            ListOnPremiseVantagePointsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListOnPremiseVantagePointsRequest, ListOnPremiseVantagePointsResponse>
                    handler);

    /**
     * Returns a list of public vantage points.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPublicVantagePointsResponse> listPublicVantagePoints(
            ListPublicVantagePointsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPublicVantagePointsRequest, ListPublicVantagePointsResponse>
                    handler);

    /**
     * Returns a list of scripts.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListScriptsResponse> listScripts(
            ListScriptsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListScriptsRequest, ListScriptsResponse> handler);

    /**
     * Returns a list of workers.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkersResponse> listWorkers(
            ListWorkersRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkersRequest, ListWorkersResponse> handler);

    /**
     * Updates the dedicated vantage point.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDedicatedVantagePointResponse> updateDedicatedVantagePoint(
            UpdateDedicatedVantagePointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDedicatedVantagePointRequest, UpdateDedicatedVantagePointResponse>
                    handler);

    /**
     * Updates the monitor.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMonitorResponse> updateMonitor(
            UpdateMonitorRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateMonitorRequest, UpdateMonitorResponse>
                    handler);

    /**
     * Updates the On-premise vantage point.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOnPremiseVantagePointResponse> updateOnPremiseVantagePoint(
            UpdateOnPremiseVantagePointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateOnPremiseVantagePointRequest, UpdateOnPremiseVantagePointResponse>
                    handler);

    /**
     * Updates the script.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateScriptResponse> updateScript(
            UpdateScriptRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateScriptRequest, UpdateScriptResponse>
                    handler);

    /**
     * Updates the worker.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateWorkerResponse> updateWorker(
            UpdateWorkerRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateWorkerRequest, UpdateWorkerResponse>
                    handler);
}
