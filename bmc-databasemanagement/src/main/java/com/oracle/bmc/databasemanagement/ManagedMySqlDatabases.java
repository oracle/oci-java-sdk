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
 *
 * <p>This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by
 * default if no circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public interface ManagedMySqlDatabases extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this Region, however, an
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
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ChangeMysqlDatabaseManagementTypeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeMysqlDatabaseManagementType API.
     */
    ChangeMysqlDatabaseManagementTypeResponse changeMysqlDatabaseManagementType(
            ChangeMysqlDatabaseManagementTypeRequest request);

    /**
     * Retrieves information pertaining to the binary log of a specific MySQL server.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetBinaryLogInformationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetBinaryLogInformation API.
     */
    GetBinaryLogInformationResponse getBinaryLogInformation(GetBinaryLogInformationRequest request);

    /**
     * Retrieves general information regarding the replication of a specific MySQL server.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetGeneralReplicationInformationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetGeneralReplicationInformation API.
     */
    GetGeneralReplicationInformationResponse getGeneralReplicationInformation(
            GetGeneralReplicationInformationRequest request);

    /**
     * Gets the health metrics for a fleet of HeatWave clusters in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetHeatWaveFleetMetricExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetHeatWaveFleetMetric API.
     */
    GetHeatWaveFleetMetricResponse getHeatWaveFleetMetric(GetHeatWaveFleetMetricRequest request);

    /**
     * Retrieves the general information for a specific MySQL Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetManagedMySqlDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetManagedMySqlDatabase API.
     */
    GetManagedMySqlDatabaseResponse getManagedMySqlDatabase(GetManagedMySqlDatabaseRequest request);

    /**
     * Gets the health metrics for a fleet of MySQL Databases in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetMySqlFleetMetricExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetMySqlFleetMetric
     *     API.
     */
    GetMySqlFleetMetricResponse getMySqlFleetMetric(GetMySqlFleetMetricRequest request);

    /**
     * Retrieves query sample details, explain plan and potential warnings for a given digest.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetMySqlQueryDetailsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetMySqlQueryDetails API.
     */
    GetMySqlQueryDetailsResponse getMySqlQueryDetails(GetMySqlQueryDetailsRequest request);

    /**
     * Retrieves information about the high availability members of a specific MySQL server's
     * replication group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListHighAvailabilityMembersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListHighAvailabilityMembers API.
     */
    ListHighAvailabilityMembersResponse listHighAvailabilityMembers(
            ListHighAvailabilityMembersRequest request);

    /**
     * Retrieves information about the inbound replications of a specific MySQL server.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListInboundReplicationsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListInboundReplications API.
     */
    ListInboundReplicationsResponse listInboundReplications(ListInboundReplicationsRequest request);

    /**
     * Retrieves configuration data for a specific MySQL database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListManagedMySqlDatabaseConfigurationDataExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListManagedMySqlDatabaseConfigurationData API.
     */
    ListManagedMySqlDatabaseConfigurationDataResponse listManagedMySqlDatabaseConfigurationData(
            ListManagedMySqlDatabaseConfigurationDataRequest request);

    /**
     * Retrieves the SQL performance data for a specific MySQL database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListManagedMySqlDatabaseSqlDataExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListManagedMySqlDatabaseSqlData API.
     */
    ListManagedMySqlDatabaseSqlDataResponse listManagedMySqlDatabaseSqlData(
            ListManagedMySqlDatabaseSqlDataRequest request);

    /**
     * Gets the list of Managed MySQL Databases in a specific compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListManagedMySqlDatabasesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListManagedMySqlDatabases API.
     */
    ListManagedMySqlDatabasesResponse listManagedMySqlDatabases(
            ListManagedMySqlDatabasesRequest request);

    /**
     * Retrieves any potential errors for a given digest.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListMySqlDigestErrorsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListMySqlDigestErrors API.
     */
    ListMySqlDigestErrorsResponse listMySqlDigestErrors(ListMySqlDigestErrorsRequest request);

    /**
     * Retrieves information pertaining to the outbound replications of a specific MySQL server.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListOutboundReplicationsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListOutboundReplications API.
     */
    ListOutboundReplicationsResponse listOutboundReplications(
            ListOutboundReplicationsRequest request);

    /**
     * Gets the availability metrics for the MySQL Database specified by managedMySqlDatabaseId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeManagedMySqlDatabaseAvailabilityMetricsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SummarizeManagedMySqlDatabaseAvailabilityMetrics API.
     */
    SummarizeManagedMySqlDatabaseAvailabilityMetricsResponse
            summarizeManagedMySqlDatabaseAvailabilityMetrics(
                    SummarizeManagedMySqlDatabaseAvailabilityMetricsRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    ManagedMySqlDatabasesWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    ManagedMySqlDatabasesPaginators getPaginators();
}
