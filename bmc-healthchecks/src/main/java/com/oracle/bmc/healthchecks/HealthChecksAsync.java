/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.healthchecks;

import com.oracle.bmc.healthchecks.requests.*;
import com.oracle.bmc.healthchecks.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
public interface HealthChecksAsync extends AutoCloseable {

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
     * Creates an HTTP monitor. Vantage points will be automatically selected if not specified,
     * and probes will be initiated from each vantage point to each of the targets at the frequency
     * specified by `intervalInSeconds`.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateHttpMonitorResponse> createHttpMonitor(
            CreateHttpMonitorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateHttpMonitorRequest, CreateHttpMonitorResponse>
                    handler);

    /**
     * Creates an on-demand HTTP probe. The location response header contains the URL for
     * fetching the probe results.
     * <p>
     *Note:* On-demand probe configurations are not saved.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateOnDemandHttpProbeResponse> createOnDemandHttpProbe(
            CreateOnDemandHttpProbeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateOnDemandHttpProbeRequest, CreateOnDemandHttpProbeResponse>
                    handler);

    /**
     * Creates an on-demand ping probe. The location response header contains the URL for
     * fetching probe results.
     * <p>
     *Note:* The on-demand probe configuration is not saved.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateOnDemandPingProbeResponse> createOnDemandPingProbe(
            CreateOnDemandPingProbeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateOnDemandPingProbeRequest, CreateOnDemandPingProbeResponse>
                    handler);

    /**
     * Creates a ping monitor. Vantage points will be automatically selected if not specified,
     * and probes will be initiated from each vantage point to each of the targets at the frequency
     * specified by `intervalInSeconds`.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreatePingMonitorResponse> createPingMonitor(
            CreatePingMonitorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreatePingMonitorRequest, CreatePingMonitorResponse>
                    handler);

    /**
     * Deletes the HTTP monitor and its configuration. All future probes of this
     * monitor are stopped. Results associated with the monitor are not deleted.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteHttpMonitorResponse> deleteHttpMonitor(
            DeleteHttpMonitorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteHttpMonitorRequest, DeleteHttpMonitorResponse>
                    handler);

    /**
     * Deletes the ping monitor and its configuration. All future probes of this
     * monitor are stopped. Results associated with the monitor are not deleted.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeletePingMonitorResponse> deletePingMonitor(
            DeletePingMonitorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeletePingMonitorRequest, DeletePingMonitorResponse>
                    handler);

    /**
     * Gets the configuration for the specified monitor.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetHttpMonitorResponse> getHttpMonitor(
            GetHttpMonitorRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetHttpMonitorRequest, GetHttpMonitorResponse>
                    handler);

    /**
     * Gets the configuration for the specified ping monitor.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPingMonitorResponse> getPingMonitor(
            GetPingMonitorRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPingMonitorRequest, GetPingMonitorResponse>
                    handler);

    /**
     * Gets information about all vantage points available to the user.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListHealthChecksVantagePointsResponse>
            listHealthChecksVantagePoints(
                    ListHealthChecksVantagePointsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListHealthChecksVantagePointsRequest,
                                    ListHealthChecksVantagePointsResponse>
                            handler);

    /**
     * Gets a list of HTTP monitors.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListHttpMonitorsResponse> listHttpMonitors(
            ListHttpMonitorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListHttpMonitorsRequest, ListHttpMonitorsResponse>
                    handler);

    /**
     * Gets the HTTP probe results for the specified probe or monitor, where
     * the `probeConfigurationId` is the OCID of either a monitor or an
     * on-demand probe.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListHttpProbeResultsResponse> listHttpProbeResults(
            ListHttpProbeResultsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListHttpProbeResultsRequest, ListHttpProbeResultsResponse>
                    handler);

    /**
     * Gets a list of configured ping monitors.
     * <p>
     * Results are paginated based on `page` and `limit`.  The `opc-next-page` header provides
     * a URL for fetching the next page.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListPingMonitorsResponse> listPingMonitors(
            ListPingMonitorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPingMonitorsRequest, ListPingMonitorsResponse>
                    handler);

    /**
     * Returns the results for the specified probe, where the `probeConfigurationId`
     * is the OCID of either a monitor or an on-demand probe.
     * <p>
     * Results are paginated based on `page` and `limit`.  The `opc-next-page` header provides
     * a URL for fetching the next page.  Use `sortOrder` to set the order of the
     * results.  If `sortOrder` is unspecified, results are sorted in ascending order by
     * `startTime`.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListPingProbeResultsResponse> listPingProbeResults(
            ListPingProbeResultsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPingProbeResultsRequest, ListPingProbeResultsResponse>
                    handler);

    /**
     * Updates the configuration of the specified HTTP monitor. Only the fields
     * specified in the request body will be updated; all other configuration
     * properties will remain unchanged.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateHttpMonitorResponse> updateHttpMonitor(
            UpdateHttpMonitorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateHttpMonitorRequest, UpdateHttpMonitorResponse>
                    handler);

    /**
     * Updates the configuration of the specified ping monitor. Only the fields
     * specified in the request body will be updated; all other configuration properties
     * will remain unchanged.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePingMonitorResponse> updatePingMonitor(
            UpdatePingMonitorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdatePingMonitorRequest, UpdatePingMonitorResponse>
                    handler);
}
