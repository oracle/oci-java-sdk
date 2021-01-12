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
public interface DbSystem extends AutoCloseable {

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
     * Adds an Analytics Cluster to the DB System.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/AddAnalyticsClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddAnalyticsCluster API.
     */
    AddAnalyticsClusterResponse addAnalyticsCluster(AddAnalyticsClusterRequest request);

    /**
     * Creates and launches a DB System.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/CreateDbSystemExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDbSystem API.
     */
    CreateDbSystemResponse createDbSystem(CreateDbSystemRequest request);

    /**
     * Deletes the Analytics Cluster including terminating, detaching, removing, finalizing and
     * otherwise deleting all related resources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/DeleteAnalyticsClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteAnalyticsCluster API.
     */
    DeleteAnalyticsClusterResponse deleteAnalyticsCluster(DeleteAnalyticsClusterRequest request);

    /**
     * Delete a DB System, including terminating, detaching,
     * removing, finalizing and otherwise deleting all related resources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/DeleteDbSystemExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDbSystem API.
     */
    DeleteDbSystemResponse deleteDbSystem(DeleteDbSystemRequest request);

    /**
     * Sends a request to estimate the memory footprints of user tables when loaded to Analytics Cluster memory.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/GenerateAnalyticsClusterMemoryEstimateExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GenerateAnalyticsClusterMemoryEstimate API.
     */
    GenerateAnalyticsClusterMemoryEstimateResponse generateAnalyticsClusterMemoryEstimate(
            GenerateAnalyticsClusterMemoryEstimateRequest request);

    /**
     * Gets information about the Analytics Cluster.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/GetAnalyticsClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAnalyticsCluster API.
     */
    GetAnalyticsClusterResponse getAnalyticsCluster(GetAnalyticsClusterRequest request);

    /**
     * Gets the most recent Analytics Cluster memory estimate that can be used to determine a suitable
     * Analytics Cluster size.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/GetAnalyticsClusterMemoryEstimateExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAnalyticsClusterMemoryEstimate API.
     */
    GetAnalyticsClusterMemoryEstimateResponse getAnalyticsClusterMemoryEstimate(
            GetAnalyticsClusterMemoryEstimateRequest request);

    /**
     * Get information about the specified DB System.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/GetDbSystemExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDbSystem API.
     */
    GetDbSystemResponse getDbSystem(GetDbSystemRequest request);

    /**
     * Get a list of DB Systems in the specified compartment.
     * The default sort order is by timeUpdated, descending.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/ListDbSystemsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDbSystems API.
     */
    ListDbSystemsResponse listDbSystems(ListDbSystemsRequest request);

    /**
     * Restarts the Analytics Cluster.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/RestartAnalyticsClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RestartAnalyticsCluster API.
     */
    RestartAnalyticsClusterResponse restartAnalyticsCluster(RestartAnalyticsClusterRequest request);

    /**
     * Restarts the specified DB System.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/RestartDbSystemExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RestartDbSystem API.
     */
    RestartDbSystemResponse restartDbSystem(RestartDbSystemRequest request);

    /**
     * Starts the Analytics Cluster.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/StartAnalyticsClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use StartAnalyticsCluster API.
     */
    StartAnalyticsClusterResponse startAnalyticsCluster(StartAnalyticsClusterRequest request);

    /**
     * Start the specified DB System.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/StartDbSystemExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use StartDbSystem API.
     */
    StartDbSystemResponse startDbSystem(StartDbSystemRequest request);

    /**
     * Stops the Analytics Cluster.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/StopAnalyticsClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use StopAnalyticsCluster API.
     */
    StopAnalyticsClusterResponse stopAnalyticsCluster(StopAnalyticsClusterRequest request);

    /**
     * Stops the specified DB System.
     * <p>
     * A stopped DB System is not billed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/StopDbSystemExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use StopDbSystem API.
     */
    StopDbSystemResponse stopDbSystem(StopDbSystemRequest request);

    /**
     * Updates the Analytics Cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/UpdateAnalyticsClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateAnalyticsCluster API.
     */
    UpdateAnalyticsClusterResponse updateAnalyticsCluster(UpdateAnalyticsClusterRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/UpdateDbSystemExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDbSystem API.
     */
    UpdateDbSystemResponse updateDbSystem(UpdateDbSystemRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    DbSystemWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DbSystemPaginators getPaginators();
}
