/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql;

import com.oracle.bmc.mysql.requests.*;
import com.oracle.bmc.mysql.responses.*;

/**
 * The API for the MySQL Database Service
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public interface DbSystemAsync extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

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
     * Determines whether realm specific endpoint should be used or not.
     * Set realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm specific endpoint template, otherwise set it to "false"
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * DEPRECATED -- please use HeatWave API instead.
     * Adds an Analytics Cluster to the DB System.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddAnalyticsClusterResponse> addAnalyticsCluster(
            AddAnalyticsClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddAnalyticsClusterRequest, AddAnalyticsClusterResponse>
                    handler);

    /**
     * Adds a HeatWave cluster to the DB System.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddHeatWaveClusterResponse> addHeatWaveCluster(
            AddHeatWaveClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddHeatWaveClusterRequest, AddHeatWaveClusterResponse>
                    handler);

    /**
     * Creates and launches a DB System.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDbSystemResponse> createDbSystem(
            CreateDbSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateDbSystemRequest, CreateDbSystemResponse>
                    handler);

    /**
     * DEPRECATED -- please use HeatWave API instead.
     * Deletes the Analytics Cluster including terminating, detaching, removing, finalizing and
     * otherwise deleting all related resources.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAnalyticsClusterResponse> deleteAnalyticsCluster(
            DeleteAnalyticsClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteAnalyticsClusterRequest, DeleteAnalyticsClusterResponse>
                    handler);

    /**
     * Delete a DB System, including terminating, detaching,
     * removing, finalizing and otherwise deleting all related resources.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDbSystemResponse> deleteDbSystem(
            DeleteDbSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteDbSystemRequest, DeleteDbSystemResponse>
                    handler);

    /**
     * Deletes the HeatWave cluster including terminating, detaching, removing, finalizing and
     * otherwise deleting all related resources.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteHeatWaveClusterResponse> deleteHeatWaveCluster(
            DeleteHeatWaveClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteHeatWaveClusterRequest, DeleteHeatWaveClusterResponse>
                    handler);

    /**
     * DEPRECATED -- please use HeatWave API instead.
     * Sends a request to estimate the memory footprints of user tables when loaded to Analytics Cluster memory.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GenerateAnalyticsClusterMemoryEstimateResponse>
            generateAnalyticsClusterMemoryEstimate(
                    GenerateAnalyticsClusterMemoryEstimateRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GenerateAnalyticsClusterMemoryEstimateRequest,
                                    GenerateAnalyticsClusterMemoryEstimateResponse>
                            handler);

    /**
     * Sends a request to estimate the memory footprints of user tables when loaded to HeatWave cluster memory.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GenerateHeatWaveClusterMemoryEstimateResponse>
            generateHeatWaveClusterMemoryEstimate(
                    GenerateHeatWaveClusterMemoryEstimateRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GenerateHeatWaveClusterMemoryEstimateRequest,
                                    GenerateHeatWaveClusterMemoryEstimateResponse>
                            handler);

    /**
     * DEPRECATED -- please use HeatWave API instead.
     * Gets information about the Analytics Cluster.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAnalyticsClusterResponse> getAnalyticsCluster(
            GetAnalyticsClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAnalyticsClusterRequest, GetAnalyticsClusterResponse>
                    handler);

    /**
     * DEPRECATED -- please use HeatWave API instead.
     * Gets the most recent Analytics Cluster memory estimate that can be used to determine a suitable
     * Analytics Cluster size.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAnalyticsClusterMemoryEstimateResponse>
            getAnalyticsClusterMemoryEstimate(
                    GetAnalyticsClusterMemoryEstimateRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetAnalyticsClusterMemoryEstimateRequest,
                                    GetAnalyticsClusterMemoryEstimateResponse>
                            handler);

    /**
     * Get information about the specified DB System.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDbSystemResponse> getDbSystem(
            GetDbSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDbSystemRequest, GetDbSystemResponse> handler);

    /**
     * Gets information about the HeatWave cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetHeatWaveClusterResponse> getHeatWaveCluster(
            GetHeatWaveClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetHeatWaveClusterRequest, GetHeatWaveClusterResponse>
                    handler);

    /**
     * Gets the most recent HeatWave cluster memory estimate that can be used to determine a suitable
     * HeatWave cluster size.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetHeatWaveClusterMemoryEstimateResponse>
            getHeatWaveClusterMemoryEstimate(
                    GetHeatWaveClusterMemoryEstimateRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetHeatWaveClusterMemoryEstimateRequest,
                                    GetHeatWaveClusterMemoryEstimateResponse>
                            handler);

    /**
     * Get a list of DB Systems in the specified compartment.
     * The default sort order is by timeUpdated, descending.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDbSystemsResponse> listDbSystems(
            ListDbSystemsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDbSystemsRequest, ListDbSystemsResponse>
                    handler);

    /**
     * DEPRECATED -- please use HeatWave API instead.
     * Restarts the Analytics Cluster.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RestartAnalyticsClusterResponse> restartAnalyticsCluster(
            RestartAnalyticsClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RestartAnalyticsClusterRequest, RestartAnalyticsClusterResponse>
                    handler);

    /**
     * Restarts the specified DB System.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RestartDbSystemResponse> restartDbSystem(
            RestartDbSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<RestartDbSystemRequest, RestartDbSystemResponse>
                    handler);

    /**
     * Restarts the HeatWave cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RestartHeatWaveClusterResponse> restartHeatWaveCluster(
            RestartHeatWaveClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RestartHeatWaveClusterRequest, RestartHeatWaveClusterResponse>
                    handler);

    /**
     * DEPRECATED -- please use HeatWave API instead.
     * Starts the Analytics Cluster.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<StartAnalyticsClusterResponse> startAnalyticsCluster(
            StartAnalyticsClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StartAnalyticsClusterRequest, StartAnalyticsClusterResponse>
                    handler);

    /**
     * Start the specified DB System.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<StartDbSystemResponse> startDbSystem(
            StartDbSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<StartDbSystemRequest, StartDbSystemResponse>
                    handler);

    /**
     * Starts the HeatWave cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<StartHeatWaveClusterResponse> startHeatWaveCluster(
            StartHeatWaveClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StartHeatWaveClusterRequest, StartHeatWaveClusterResponse>
                    handler);

    /**
     * DEPRECATED -- please use HeatWave API instead.
     * Stops the Analytics Cluster.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<StopAnalyticsClusterResponse> stopAnalyticsCluster(
            StopAnalyticsClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StopAnalyticsClusterRequest, StopAnalyticsClusterResponse>
                    handler);

    /**
     * Stops the specified DB System.
     * <p>
     * A stopped DB System is not billed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<StopDbSystemResponse> stopDbSystem(
            StopDbSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<StopDbSystemRequest, StopDbSystemResponse>
                    handler);

    /**
     * Stops the HeatWave cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<StopHeatWaveClusterResponse> stopHeatWaveCluster(
            StopHeatWaveClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StopHeatWaveClusterRequest, StopHeatWaveClusterResponse>
                    handler);

    /**
     * DEPRECATED -- please use HeatWave API instead.
     * Updates the Analytics Cluster.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAnalyticsClusterResponse> updateAnalyticsCluster(
            UpdateAnalyticsClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateAnalyticsClusterRequest, UpdateAnalyticsClusterResponse>
                    handler);

    /**
     * Update the configuration of a DB System.
     * <p>
     * Updating different fields in the DB System will have different results
     * on the uptime of the DB System. For example, changing the displayName of
     * a DB System will take effect immediately, but changing the shape of a
     * DB System is an asynchronous operation that involves provisioning new
     * Compute resources, pausing the DB System and migrating storage
     * before making the DB System available again.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDbSystemResponse> updateDbSystem(
            UpdateDbSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateDbSystemRequest, UpdateDbSystemResponse>
                    handler);

    /**
     * Updates the HeatWave cluster.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateHeatWaveClusterResponse> updateHeatWaveCluster(
            UpdateHeatWaveClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateHeatWaveClusterRequest, UpdateHeatWaveClusterResponse>
                    handler);
}
