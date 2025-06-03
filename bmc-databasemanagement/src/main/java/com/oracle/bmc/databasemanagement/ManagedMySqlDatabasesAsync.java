/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement;

import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;

/**
 * Use the Database Management API to monitor and manage resources such as Oracle Databases, MySQL
 * Databases, and External Database Systems. For more information, see [Database
 * Management](https://docs.oracle.com/iaas/database-management/home.htm).
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
     * Changes the management type for a HeatWave MySQL instance, from BASIC to FULL and vice versa.
     * It can also be used to enable or disable database management.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeMysqlDatabaseManagementTypeResponse>
            changeMysqlDatabaseManagementType(
                    ChangeMysqlDatabaseManagementTypeRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMysqlDatabaseManagementTypeRequest,
                                    ChangeMysqlDatabaseManagementTypeResponse>
                            handler);

    /**
     * Retrieves information pertaining to binary log of a specific MySQL server.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetBinaryLogInformationResponse> getBinaryLogInformation(
            GetBinaryLogInformationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetBinaryLogInformationRequest, GetBinaryLogInformationResponse>
                    handler);

    /**
     * Retrieves general information regarding replication of a specific MySQL server.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetGeneralReplicationInformationResponse>
            getGeneralReplicationInformation(
                    GetGeneralReplicationInformationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetGeneralReplicationInformationRequest,
                                    GetGeneralReplicationInformationResponse>
                            handler);

    /**
     * Gets the health metrics for a fleet of HeatWave clusters in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetHeatWaveFleetMetricResponse> getHeatWaveFleetMetric(
            GetHeatWaveFleetMetricRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetHeatWaveFleetMetricRequest, GetHeatWaveFleetMetricResponse>
                    handler);

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
     * Retrieves query sample details, explain plan and potential warnings for a given digest.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetMySqlQueryDetailsResponse> getMySqlQueryDetails(
            GetMySqlQueryDetailsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetMySqlQueryDetailsRequest, GetMySqlQueryDetailsResponse>
                    handler);

    /**
     * Information about high availability members of a specific MySQL server's replication group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListHighAvailabilityMembersResponse> listHighAvailabilityMembers(
            ListHighAvailabilityMembersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListHighAvailabilityMembersRequest, ListHighAvailabilityMembersResponse>
                    handler);

    /**
     * Retrieves information about the inbound replications of a specific MySQL server.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListInboundReplicationsResponse> listInboundReplications(
            ListInboundReplicationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListInboundReplicationsRequest, ListInboundReplicationsResponse>
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
     * Retrieves any potential errors for a given digest.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListMySqlDigestErrorsResponse> listMySqlDigestErrors(
            ListMySqlDigestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMySqlDigestErrorsRequest, ListMySqlDigestErrorsResponse>
                    handler);

    /**
     * Retrieves information pertaining to outbound replications of a specific MySQL server.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOutboundReplicationsResponse> listOutboundReplications(
            ListOutboundReplicationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListOutboundReplicationsRequest, ListOutboundReplicationsResponse>
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
