/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
     * Gets information about the Analytics Cluster.
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
     * Restarts the Analytics Cluster.
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
     * Starts the Analytics Cluster.
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
     * Stops the Analytics Cluster.
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
}
