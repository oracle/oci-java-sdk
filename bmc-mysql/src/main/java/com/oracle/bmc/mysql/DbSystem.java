/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql;

import com.oracle.bmc.mysql.requests.*;
import com.oracle.bmc.mysql.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public interface DbSystem extends AutoCloseable {

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
     * Creates and launches a DB System.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateDbSystemResponse createDbSystem(CreateDbSystemRequest request);

    /**
     * Delete a DB System, including terminating, detaching,
     * removing, finalizing and otherwise deleting all related resources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteDbSystemResponse deleteDbSystem(DeleteDbSystemRequest request);

    /**
     * Get information about the specified DB System.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDbSystemResponse getDbSystem(GetDbSystemRequest request);

    /**
     * Get a list of DB Systems in the specified compartment.
     * The default sort order is by timeUpdated, descending.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDbSystemsResponse listDbSystems(ListDbSystemsRequest request);

    /**
     * Restarts the specified DB System.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    RestartDbSystemResponse restartDbSystem(RestartDbSystemRequest request);

    /**
     * Start the specified DB System.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    StartDbSystemResponse startDbSystem(StartDbSystemRequest request);

    /**
     * Stops the specified DB System.
     * <p>
     * A stopped DB System is not billed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    StopDbSystemResponse stopDbSystem(StopDbSystemRequest request);

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
