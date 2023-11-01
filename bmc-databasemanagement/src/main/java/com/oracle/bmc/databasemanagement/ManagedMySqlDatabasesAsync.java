/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement;

import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;

/**
 * Use the Database Management API to perform tasks such as obtaining performance and resource usage
 * metrics for a fleet of Managed Databases or a specific Managed Database, creating Managed
 * Database Groups, and running a SQL job on a Managed Database or Managed Database Group.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public interface ManagedMySqlDatabasesAsync extends AutoCloseable {

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
     * Retrieves the general information for a specific MySQL Database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetManagedMySqlDatabaseResponse> getManagedMySqlDatabase(
            GetManagedMySqlDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetManagedMySqlDatabaseRequest, GetManagedMySqlDatabaseResponse>
                    handler);

    /**
     * Gets the health metrics for a fleet of MySQL Databases in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetMySqlFleetMetricResponse> getMySqlFleetMetric(
            GetMySqlFleetMetricRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetMySqlFleetMetricRequest, GetMySqlFleetMetricResponse>
                    handler);

    /**
     * Retrieves configuration data for a specific MySQL database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedMySqlDatabaseConfigurationDataResponse>
            listManagedMySqlDatabaseConfigurationData(
                    ListManagedMySqlDatabaseConfigurationDataRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedMySqlDatabaseConfigurationDataRequest,
                                    ListManagedMySqlDatabaseConfigurationDataResponse>
                            handler);

    /**
     * Retrieves the SQL performance data for a specific MySQL database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedMySqlDatabaseSqlDataResponse>
            listManagedMySqlDatabaseSqlData(
                    ListManagedMySqlDatabaseSqlDataRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedMySqlDatabaseSqlDataRequest,
                                    ListManagedMySqlDatabaseSqlDataResponse>
                            handler);

    /**
     * Gets the list of Managed MySQL Databases in a specific compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedMySqlDatabasesResponse> listManagedMySqlDatabases(
            ListManagedMySqlDatabasesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListManagedMySqlDatabasesRequest, ListManagedMySqlDatabasesResponse>
                    handler);

    /**
     * Gets the availability metrics for the MySQL Database specified by managedMySqlDatabaseId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeManagedMySqlDatabaseAvailabilityMetricsResponse>
            summarizeManagedMySqlDatabaseAvailabilityMetrics(
                    SummarizeManagedMySqlDatabaseAvailabilityMetricsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeManagedMySqlDatabaseAvailabilityMetricsRequest,
                                    SummarizeManagedMySqlDatabaseAvailabilityMetricsResponse>
                            handler);
}