/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics;

import com.oracle.bmc.apmsynthetics.requests.*;
import com.oracle.bmc.apmsynthetics.responses.*;

/**
 * Use the Application Performance Monitoring Synthetic Monitoring API to query synthetic scripts and monitors.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public interface ApmSynthetic extends AutoCloseable {

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
     * Creates a new monitor.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmsynthetics/CreateMonitorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateMonitor API.
     */
    CreateMonitorResponse createMonitor(CreateMonitorRequest request);

    /**
     * Creates a new script.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmsynthetics/CreateScriptExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateScript API.
     */
    CreateScriptResponse createScript(CreateScriptRequest request);

    /**
     * Deletes the specified monitor.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmsynthetics/DeleteMonitorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteMonitor API.
     */
    DeleteMonitorResponse deleteMonitor(DeleteMonitorRequest request);

    /**
     * Deletes the specified script.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmsynthetics/DeleteScriptExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteScript API.
     */
    DeleteScriptResponse deleteScript(DeleteScriptRequest request);

    /**
     * Gets the configuration of the monitor identified by the OCID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmsynthetics/GetMonitorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetMonitor API.
     */
    GetMonitorResponse getMonitor(GetMonitorRequest request);

    /**
     * Gets the results for a specific execution of a monitor identified by OCID. The results are in a HAR file, Screenshot, or Console Log.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmsynthetics/GetMonitorResultExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetMonitorResult API.
     */
    GetMonitorResultResponse getMonitorResult(GetMonitorResultRequest request);

    /**
     * Gets the configuration of the script identified by the OCID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmsynthetics/GetScriptExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetScript API.
     */
    GetScriptResponse getScript(GetScriptRequest request);

    /**
     * Returns a list of monitors.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmsynthetics/ListMonitorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMonitors API.
     */
    ListMonitorsResponse listMonitors(ListMonitorsRequest request);

    /**
     * Returns a list of public vantage points.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmsynthetics/ListPublicVantagePointsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListPublicVantagePoints API.
     */
    ListPublicVantagePointsResponse listPublicVantagePoints(ListPublicVantagePointsRequest request);

    /**
     * Returns a list of scripts.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmsynthetics/ListScriptsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListScripts API.
     */
    ListScriptsResponse listScripts(ListScriptsRequest request);

    /**
     * Updates the monitor.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmsynthetics/UpdateMonitorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateMonitor API.
     */
    UpdateMonitorResponse updateMonitor(UpdateMonitorRequest request);

    /**
     * Updates the script.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmsynthetics/UpdateScriptExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateScript API.
     */
    UpdateScriptResponse updateScript(UpdateScriptRequest request);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    ApmSyntheticPaginators getPaginators();
}
