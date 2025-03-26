/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement;

import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;

/**
 * Use the Database Management API to monitor and manage resources such as
 * Oracle Databases, MySQL Databases, and External Database Systems.
 * For more information, see [Database Management](https://docs.oracle.com/iaas/database-management/home.htm).
 *
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public interface DbManagement extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

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
     * Determines whether realm specific endpoint should be used or not.
     * Set realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm specific endpoint template, otherwise set it to "false"
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Adds data files or temp files to the tablespace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/AddDataFilesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddDataFiles API.
     */
    AddDataFilesResponse addDataFiles(AddDataFilesRequest request);

    /**
     * Adds a Managed Database to a specific Managed Database Group.
     * After the database is added, it will be included in the
     * management activities performed on the Managed Database Group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/AddManagedDatabaseToManagedDatabaseGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddManagedDatabaseToManagedDatabaseGroup API.
     */
    AddManagedDatabaseToManagedDatabaseGroupResponse addManagedDatabaseToManagedDatabaseGroup(
            AddManagedDatabaseToManagedDatabaseGroupRequest request);

    /**
     * Lists the metadata for each ADDM task who's end snapshot time falls within the provided start and end time. Details include
     * the name of the ADDM task, description, user, status and creation date time.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/AddmTasksExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddmTasks API.
     */
    AddmTasksResponse addmTasks(AddmTasksRequest request);

    /**
     * Changes database parameter values. There are two kinds of database
     * parameters:
     * <p>
     * - Dynamic parameters: They can be changed for the current Oracle
     * Database instance. The changes take effect immediately.
     * - Static parameters: They cannot be changed for the current instance.
     * You must change these parameters and then restart the database before
     * changes take effect.
     * <p>
     **Note:** If the instance is started using a text initialization
     * parameter file, the parameter changes are applicable only for the
     * current instance. You must update them manually to be passed to
     * a future instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ChangeDatabaseParametersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeDatabaseParameters API.
     */
    ChangeDatabaseParametersResponse changeDatabaseParameters(
            ChangeDatabaseParametersRequest request);

    /**
     * Moves the Database Management private endpoint and its dependent resources to the specified compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ChangeDbManagementPrivateEndpointCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeDbManagementPrivateEndpointCompartment API.
     */
    ChangeDbManagementPrivateEndpointCompartmentResponse
            changeDbManagementPrivateEndpointCompartment(
                    ChangeDbManagementPrivateEndpointCompartmentRequest request);

    /**
     * Moves the external DB system and its related resources (excluding databases) to the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ChangeExternalDbSystemCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeExternalDbSystemCompartment API.
     */
    ChangeExternalDbSystemCompartmentResponse changeExternalDbSystemCompartment(
            ChangeExternalDbSystemCompartmentRequest request);

    /**
     * Moves the Exadata infrastructure and its related resources (Exadata storage server, Exadata storage server connectors and Exadata storage server grid) to the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ChangeExternalExadataInfrastructureCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeExternalExadataInfrastructureCompartment API.
     */
    ChangeExternalExadataInfrastructureCompartmentResponse
            changeExternalExadataInfrastructureCompartment(
                    ChangeExternalExadataInfrastructureCompartmentRequest request);

    /**
     * Moves a job.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ChangeJobCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeJobCompartment API.
     */
    ChangeJobCompartmentResponse changeJobCompartment(ChangeJobCompartmentRequest request);

    /**
     * Moves a Managed Database Group to a different compartment.
     * The destination compartment must not have a Managed Database Group
     * with the same name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ChangeManagedDatabaseGroupCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeManagedDatabaseGroupCompartment API.
     */
    ChangeManagedDatabaseGroupCompartmentResponse changeManagedDatabaseGroupCompartment(
            ChangeManagedDatabaseGroupCompartmentRequest request);

    /**
     * Moves a named credential to a different compartment.
     * The destination compartment must not have a named credential
     * with the same name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ChangeNamedCredentialCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeNamedCredentialCompartment API.
     */
    ChangeNamedCredentialCompartmentResponse changeNamedCredentialCompartment(
            ChangeNamedCredentialCompartmentRequest request);

    /**
     * Changes the retention period of unused plans. The period can range
     * between 5 and 523 weeks.
     * <p>
     * The database purges plans that have not been used for longer than
     * the plan retention period.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ChangePlanRetentionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangePlanRetention API.
     */
    ChangePlanRetentionResponse changePlanRetention(ChangePlanRetentionRequest request);

    /**
     * Changes the disk space limit for the SQL Management Base. The allowable
     * range for this limit is between 1% and 50%.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ChangeSpaceBudgetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeSpaceBudget API.
     */
    ChangeSpaceBudgetResponse changeSpaceBudget(ChangeSpaceBudgetRequest request);

    /**
     * Changes one or more attributes of a single plan or all plans associated with a SQL statement.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ChangeSqlPlanBaselinesAttributesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeSqlPlanBaselinesAttributes API.
     */
    ChangeSqlPlanBaselinesAttributesResponse changeSqlPlanBaselinesAttributes(
            ChangeSqlPlanBaselinesAttributesRequest request);

    /**
     * Checks the status of the external DB system component connection specified in this connector.
     * This operation will refresh the connectionStatus and timeConnectionStatusLastUpdated fields.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/CheckExternalDbSystemConnectorConnectionStatusExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CheckExternalDbSystemConnectorConnectionStatus API.
     */
    CheckExternalDbSystemConnectorConnectionStatusResponse
            checkExternalDbSystemConnectorConnectionStatus(
                    CheckExternalDbSystemConnectorConnectionStatusRequest request);

    /**
     * Checks the status of the Exadata storage server connection specified by exadataStorageConnectorId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/CheckExternalExadataStorageConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CheckExternalExadataStorageConnector API.
     */
    CheckExternalExadataStorageConnectorResponse checkExternalExadataStorageConnector(
            CheckExternalExadataStorageConnectorRequest request);

    /**
     * Check the status of the external database connection specified in this connector.
     * This operation will refresh the connectionStatus and timeConnectionStatusLastUpdated fields.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/CheckExternalMySqlDatabaseConnectorConnectionStatusExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CheckExternalMySqlDatabaseConnectorConnectionStatus API.
     */
    CheckExternalMySqlDatabaseConnectorConnectionStatusResponse
            checkExternalMySqlDatabaseConnectorConnectionStatus(
                    CheckExternalMySqlDatabaseConnectorConnectionStatusRequest request);

    /**
     * Configures automatic capture filters to capture only those statements
     * that match the filter criteria.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ConfigureAutomaticCaptureFiltersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ConfigureAutomaticCaptureFilters API.
     */
    ConfigureAutomaticCaptureFiltersResponse configureAutomaticCaptureFilters(
            ConfigureAutomaticCaptureFiltersRequest request);

    /**
     * Configures the Automatic SPM Evolve Advisor task `SYS_AUTO_SPM_EVOLVE_TASK`
     * by specifying task parameters. As the task is owned by `SYS`, only `SYS` can
     * set task parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ConfigureAutomaticSpmEvolveAdvisorTaskExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ConfigureAutomaticSpmEvolveAdvisorTask API.
     */
    ConfigureAutomaticSpmEvolveAdvisorTaskResponse configureAutomaticSpmEvolveAdvisorTask(
            ConfigureAutomaticSpmEvolveAdvisorTaskRequest request);

    /**
     * Creates a new Database Management private endpoint.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/CreateDbManagementPrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDbManagementPrivateEndpoint API.
     */
    CreateDbManagementPrivateEndpointResponse createDbManagementPrivateEndpoint(
            CreateDbManagementPrivateEndpointRequest request);

    /**
     * Creates an external DB system and its related resources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/CreateExternalDbSystemExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateExternalDbSystem API.
     */
    CreateExternalDbSystemResponse createExternalDbSystem(CreateExternalDbSystemRequest request);

    /**
     * Creates a new external connector.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/CreateExternalDbSystemConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateExternalDbSystemConnector API.
     */
    CreateExternalDbSystemConnectorResponse createExternalDbSystemConnector(
            CreateExternalDbSystemConnectorRequest request);

    /**
     * Creates an external DB system discovery resource and initiates the discovery process.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/CreateExternalDbSystemDiscoveryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateExternalDbSystemDiscovery API.
     */
    CreateExternalDbSystemDiscoveryResponse createExternalDbSystemDiscovery(
            CreateExternalDbSystemDiscoveryRequest request);

    /**
     * Creates an OCI resource for the Exadata infrastructure and enables the Monitoring service for the Exadata infrastructure.
     * The following resource/subresources are created:
     *   Infrastructure
     *   Storage server connectors
     *   Storage servers
     *   Storage grids
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/CreateExternalExadataInfrastructureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateExternalExadataInfrastructure API.
     */
    CreateExternalExadataInfrastructureResponse createExternalExadataInfrastructure(
            CreateExternalExadataInfrastructureRequest request);

    /**
     * Creates the Exadata storage server connector after validating the connection information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/CreateExternalExadataStorageConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateExternalExadataStorageConnector API.
     */
    CreateExternalExadataStorageConnectorResponse createExternalExadataStorageConnector(
            CreateExternalExadataStorageConnectorRequest request);

    /**
     * Creates an external MySQL database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/CreateExternalMySqlDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateExternalMySqlDatabase API.
     */
    CreateExternalMySqlDatabaseResponse createExternalMySqlDatabase(
            CreateExternalMySqlDatabaseRequest request);

    /**
     * Creates an external MySQL connector resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/CreateExternalMySqlDatabaseConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateExternalMySqlDatabaseConnector API.
     */
    CreateExternalMySqlDatabaseConnectorResponse createExternalMySqlDatabaseConnector(
            CreateExternalMySqlDatabaseConnectorRequest request);

    /**
     * Creates a job to be executed on a Managed Database or Managed Database Group. Only one
     * of the parameters, managedDatabaseId or managedDatabaseGroupId should be provided as
     * input in CreateJobDetails resource in request body.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/CreateJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateJob API.
     */
    CreateJobResponse createJob(CreateJobRequest request);

    /**
     * Creates a Managed Database Group. The group does not contain any
     * Managed Databases when it is created, and they must be added later.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/CreateManagedDatabaseGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateManagedDatabaseGroup API.
     */
    CreateManagedDatabaseGroupResponse createManagedDatabaseGroup(
            CreateManagedDatabaseGroupRequest request);

    /**
     * Creates a named credential.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/CreateNamedCredentialExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateNamedCredential API.
     */
    CreateNamedCredentialResponse createNamedCredential(CreateNamedCredentialRequest request);

    /**
     * Creates a tablespace within the Managed Database specified by managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/CreateTablespaceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateTablespace API.
     */
    CreateTablespaceResponse createTablespace(CreateTablespaceRequest request);

    /**
     * Deletes a specific Database Management private endpoint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DeleteDbManagementPrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDbManagementPrivateEndpoint API.
     */
    DeleteDbManagementPrivateEndpointResponse deleteDbManagementPrivateEndpoint(
            DeleteDbManagementPrivateEndpointRequest request);

    /**
     * Deletes the external DB system specified by `externalDbSystemId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DeleteExternalDbSystemExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteExternalDbSystem API.
     */
    DeleteExternalDbSystemResponse deleteExternalDbSystem(DeleteExternalDbSystemRequest request);

    /**
     * Deletes the external connector specified by `externalDbSystemConnectorId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DeleteExternalDbSystemConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteExternalDbSystemConnector API.
     */
    DeleteExternalDbSystemConnectorResponse deleteExternalDbSystemConnector(
            DeleteExternalDbSystemConnectorRequest request);

    /**
     * Deletes the external DB system discovery resource specified by `externalDbSystemDiscoveryId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DeleteExternalDbSystemDiscoveryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteExternalDbSystemDiscovery API.
     */
    DeleteExternalDbSystemDiscoveryResponse deleteExternalDbSystemDiscovery(
            DeleteExternalDbSystemDiscoveryRequest request);

    /**
     * Deletes the Exadata infrastructure specified by externalExadataInfrastructureId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DeleteExternalExadataInfrastructureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteExternalExadataInfrastructure API.
     */
    DeleteExternalExadataInfrastructureResponse deleteExternalExadataInfrastructure(
            DeleteExternalExadataInfrastructureRequest request);

    /**
     * Deletes the Exadata storage server connector specified by exadataStorageConnectorId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DeleteExternalExadataStorageConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteExternalExadataStorageConnector API.
     */
    DeleteExternalExadataStorageConnectorResponse deleteExternalExadataStorageConnector(
            DeleteExternalExadataStorageConnectorRequest request);

    /**
     * Deletes the Oracle Cloud Infrastructure resource representing an external MySQL database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DeleteExternalMySqlDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteExternalMySqlDatabase API.
     */
    DeleteExternalMySqlDatabaseResponse deleteExternalMySqlDatabase(
            DeleteExternalMySqlDatabaseRequest request);

    /**
     * Deletes the Oracle Cloud Infrastructure resource representing an external MySQL database connector.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DeleteExternalMySqlDatabaseConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteExternalMySqlDatabaseConnector API.
     */
    DeleteExternalMySqlDatabaseConnectorResponse deleteExternalMySqlDatabaseConnector(
            DeleteExternalMySqlDatabaseConnectorRequest request);

    /**
     * Deletes the job specified by jobId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DeleteJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteJob API.
     */
    DeleteJobResponse deleteJob(DeleteJobRequest request);

    /**
     * Deletes the Managed Database Group specified by managedDatabaseGroupId.
     * If the group contains Managed Databases, then it cannot be deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DeleteManagedDatabaseGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteManagedDatabaseGroup API.
     */
    DeleteManagedDatabaseGroupResponse deleteManagedDatabaseGroup(
            DeleteManagedDatabaseGroupRequest request);

    /**
     * Deletes the named credential specified by namedCredentialId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DeleteNamedCredentialExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteNamedCredential API.
     */
    DeleteNamedCredentialResponse deleteNamedCredential(DeleteNamedCredentialRequest request);

    /**
     * Deletes the preferred credential based on the credentialName.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DeletePreferredCredentialExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeletePreferredCredential API.
     */
    DeletePreferredCredentialResponse deletePreferredCredential(
            DeletePreferredCredentialRequest request);

    /**
     * Disables automatic initial plan capture.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DisableAutomaticInitialPlanCaptureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableAutomaticInitialPlanCapture API.
     */
    DisableAutomaticInitialPlanCaptureResponse disableAutomaticInitialPlanCapture(
            DisableAutomaticInitialPlanCaptureRequest request);

    /**
     * Disables the Automatic SPM Evolve Advisor task.
     * <p>
     * One client controls both Automatic SQL Tuning Advisor and Automatic SPM Evolve Advisor.
     * Thus, the same task enables or disables both.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DisableAutomaticSpmEvolveAdvisorTaskExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableAutomaticSpmEvolveAdvisorTask API.
     */
    DisableAutomaticSpmEvolveAdvisorTaskResponse disableAutomaticSpmEvolveAdvisorTask(
            DisableAutomaticSpmEvolveAdvisorTaskRequest request);

    /**
     * Disables a Database Management feature for the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DisableAutonomousDatabaseManagementFeatureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableAutonomousDatabaseManagementFeature API.
     */
    DisableAutonomousDatabaseManagementFeatureResponse disableAutonomousDatabaseManagementFeature(
            DisableAutonomousDatabaseManagementFeatureRequest request);

    /**
     * Disables a Database Management feature for the specified Oracle cloud database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DisableDatabaseManagementFeatureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableDatabaseManagementFeature API.
     */
    DisableDatabaseManagementFeatureResponse disableDatabaseManagementFeature(
            DisableDatabaseManagementFeatureRequest request);

    /**
     * Disables a Database Management feature for the specified external container database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DisableExternalContainerDatabaseManagementFeatureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableExternalContainerDatabaseManagementFeature API.
     */
    DisableExternalContainerDatabaseManagementFeatureResponse
            disableExternalContainerDatabaseManagementFeature(
                    DisableExternalContainerDatabaseManagementFeatureRequest request);

    /**
     * Disables Database Management service for all the components of the specified
     * external DB system (except databases).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DisableExternalDbSystemDatabaseManagementExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableExternalDbSystemDatabaseManagement API.
     */
    DisableExternalDbSystemDatabaseManagementResponse disableExternalDbSystemDatabaseManagement(
            DisableExternalDbSystemDatabaseManagementRequest request);

    /**
     * Disables Stack Monitoring for all the components of the specified
     * external DB system (except databases).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DisableExternalDbSystemStackMonitoringExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableExternalDbSystemStackMonitoring API.
     */
    DisableExternalDbSystemStackMonitoringResponse disableExternalDbSystemStackMonitoring(
            DisableExternalDbSystemStackMonitoringRequest request);

    /**
     * Disables Database Management for the Exadata infrastructure specified by externalExadataInfrastructureId.
     * It covers the following components:
     * <p>
     * - Exadata infrastructure
     * - Exadata storage grid
     * - Exadata storage server
     * <p>
     * Note that Database Management will not be disabled for the DB systems within the Exadata infrastructure and should be disabled explicitly, if required.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DisableExternalExadataInfrastructureManagementExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableExternalExadataInfrastructureManagement API.
     */
    DisableExternalExadataInfrastructureManagementResponse
            disableExternalExadataInfrastructureManagement(
                    DisableExternalExadataInfrastructureManagementRequest request);

    /**
     * Disables Database Management for an external MySQL Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DisableExternalMySqlDatabaseManagementExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableExternalMySqlDatabaseManagement API.
     */
    DisableExternalMySqlDatabaseManagementResponse disableExternalMySqlDatabaseManagement(
            DisableExternalMySqlDatabaseManagementRequest request);

    /**
     * Disables a Database Management feature for the specified external non-container database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DisableExternalNonContainerDatabaseManagementFeatureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableExternalNonContainerDatabaseManagementFeature API.
     */
    DisableExternalNonContainerDatabaseManagementFeatureResponse
            disableExternalNonContainerDatabaseManagementFeature(
                    DisableExternalNonContainerDatabaseManagementFeatureRequest request);

    /**
     * Disables a Database Management feature for the specified external pluggable database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DisableExternalPluggableDatabaseManagementFeatureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableExternalPluggableDatabaseManagementFeature API.
     */
    DisableExternalPluggableDatabaseManagementFeatureResponse
            disableExternalPluggableDatabaseManagementFeature(
                    DisableExternalPluggableDatabaseManagementFeatureRequest request);

    /**
     * Disables the high-frequency Automatic SPM Evolve Advisor task.
     * <p>
     * It is available only on Oracle Exadata Database Machine, Oracle Database Exadata
     * Cloud Service (ExaCS) and Oracle Database Exadata Cloud@Customer (ExaCC).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableHighFrequencyAutomaticSpmEvolveAdvisorTask API.
     */
    DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse
            disableHighFrequencyAutomaticSpmEvolveAdvisorTask(
                    DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest request);

    /**
     * Disables a Database Management feature for the specified Oracle cloud pluggable database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DisablePluggableDatabaseManagementFeatureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisablePluggableDatabaseManagementFeature API.
     */
    DisablePluggableDatabaseManagementFeatureResponse disablePluggableDatabaseManagementFeature(
            DisablePluggableDatabaseManagementFeatureRequest request);

    /**
     * Disables the use of SQL plan baselines stored in SQL Management Base.
     * <p>
     * When disabled, the optimizer does not use any SQL plan baselines.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DisableSqlPlanBaselinesUsageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableSqlPlanBaselinesUsage API.
     */
    DisableSqlPlanBaselinesUsageResponse disableSqlPlanBaselinesUsage(
            DisableSqlPlanBaselinesUsageRequest request);

    /**
     * Completes the Exadata system prechecking on the following:
     * <p>
     * - Verifies if the DB systems are valid RAC DB systems or return 400 status code with NON_RAC_DATABASE_SYSTEM error code.
     * - Verifies if the ASM connector defined for each DB system or return 400 status code with CONNECTOR_NOT_DEFINED error code.
     * - Verifies if the agents associated with ASM are valid and could be used for the Exadata storage servers or return 400 status code with
     * INVALID_AGENT error code.
     * - Verifies if it is an Exadata system or return 400 status code with INVALID_EXADATA_SYSTEM error code.
     * <p>
     * Starts the discovery process for the Exadata system infrastructure. The following resources/components are discovered
     * <p>
     * - Exadata storage servers from each DB systems
     * - Exadata storage grid for all Exadata storage servers
     * - Exadata infrastructure
     * <p>
     * The same API covers both new discovery and rediscovery cases.
     *   For the new discovery case, new managed resources/sub-resources are created or the existing ones are overridden.
     *   For rediscovery case, the existing managed resources/sub-resources are checked to find out which ones should be added or which ones
     * should be
     *     removed based on the unique key defined for each resource/sub-resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DiscoverExternalExadataInfrastructureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DiscoverExternalExadataInfrastructure API.
     */
    DiscoverExternalExadataInfrastructureResponse discoverExternalExadataInfrastructure(
            DiscoverExternalExadataInfrastructureRequest request);

    /**
     * Drops a single plan or all plans associated with a SQL statement.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DropSqlPlanBaselinesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DropSqlPlanBaselines API.
     */
    DropSqlPlanBaselinesResponse dropSqlPlanBaselines(DropSqlPlanBaselinesRequest request);

    /**
     * Drops the tablespace specified by tablespaceName within the Managed Database specified by managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DropTablespaceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DropTablespace API.
     */
    DropTablespaceResponse dropTablespace(DropTablespaceRequest request);

    /**
     * Enables automatic initial plan capture. When enabled, the database checks whether
     * executed SQL statements are eligible for automatic capture. It creates initial
     * plan baselines for eligible statements.
     * <p>
     * By default, the database creates a SQL plan baseline for every eligible repeatable
     * statement, including all recursive SQL and monitoring SQL. Thus, automatic capture
     * may result in the creation of an extremely large number of plan baselines. To limit
     * the statements that are eligible for plan baselines, configure filters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/EnableAutomaticInitialPlanCaptureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableAutomaticInitialPlanCapture API.
     */
    EnableAutomaticInitialPlanCaptureResponse enableAutomaticInitialPlanCapture(
            EnableAutomaticInitialPlanCaptureRequest request);

    /**
     * Enables the Automatic SPM Evolve Advisor task. By default, the automatic task
     * `SYS_AUTO_SPM_EVOLVE_TASK` runs every day in the scheduled maintenance window.
     * <p>
     * The SPM Evolve Advisor performs the following tasks:
     * <p>
     * - Checks AWR for top SQL
     * - Looks for alternative plans in all available sources
     * - Adds unaccepted plans to the plan history
     * - Tests the execution of as many plans as possible during the maintenance window
     * - Adds the alternative plan to the baseline if it performs better than the current plan
     * <p>
     * One client controls both Automatic SQL Tuning Advisor and Automatic SPM Evolve Advisor.
     * Thus, the same task enables or disables both.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/EnableAutomaticSpmEvolveAdvisorTaskExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableAutomaticSpmEvolveAdvisorTask API.
     */
    EnableAutomaticSpmEvolveAdvisorTaskResponse enableAutomaticSpmEvolveAdvisorTask(
            EnableAutomaticSpmEvolveAdvisorTaskRequest request);

    /**
     * Enables a Database Management feature for the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/EnableAutonomousDatabaseManagementFeatureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableAutonomousDatabaseManagementFeature API.
     */
    EnableAutonomousDatabaseManagementFeatureResponse enableAutonomousDatabaseManagementFeature(
            EnableAutonomousDatabaseManagementFeatureRequest request);

    /**
     * Enables a Database Management feature for the specified cloud database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/EnableDatabaseManagementFeatureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableDatabaseManagementFeature API.
     */
    EnableDatabaseManagementFeatureResponse enableDatabaseManagementFeature(
            EnableDatabaseManagementFeatureRequest request);

    /**
     * Enables a Database Management feature for the specified external container database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/EnableExternalContainerDatabaseManagementFeatureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableExternalContainerDatabaseManagementFeature API.
     */
    EnableExternalContainerDatabaseManagementFeatureResponse
            enableExternalContainerDatabaseManagementFeature(
                    EnableExternalContainerDatabaseManagementFeatureRequest request);

    /**
     * Enables Database Management service for all the components of the specified
     * external DB system (except databases).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/EnableExternalDbSystemDatabaseManagementExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableExternalDbSystemDatabaseManagement API.
     */
    EnableExternalDbSystemDatabaseManagementResponse enableExternalDbSystemDatabaseManagement(
            EnableExternalDbSystemDatabaseManagementRequest request);

    /**
     * Enables Stack Monitoring for all the components of the specified
     * external DB system (except databases).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/EnableExternalDbSystemStackMonitoringExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableExternalDbSystemStackMonitoring API.
     */
    EnableExternalDbSystemStackMonitoringResponse enableExternalDbSystemStackMonitoring(
            EnableExternalDbSystemStackMonitoringRequest request);

    /**
     * Enables Database Management for the Exadata infrastructure specified by externalExadataInfrastructureId. It covers the following
     * components:
     * <p>
     * - Exadata infrastructure
     * - Exadata storage grid
     * - Exadata storage server
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/EnableExternalExadataInfrastructureManagementExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableExternalExadataInfrastructureManagement API.
     */
    EnableExternalExadataInfrastructureManagementResponse
            enableExternalExadataInfrastructureManagement(
                    EnableExternalExadataInfrastructureManagementRequest request);

    /**
     * Enables Database Management for an external MySQL Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/EnableExternalMySqlDatabaseManagementExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableExternalMySqlDatabaseManagement API.
     */
    EnableExternalMySqlDatabaseManagementResponse enableExternalMySqlDatabaseManagement(
            EnableExternalMySqlDatabaseManagementRequest request);

    /**
     * Enables Database Management feature for the specified external non-container database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/EnableExternalNonContainerDatabaseManagementFeatureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableExternalNonContainerDatabaseManagementFeature API.
     */
    EnableExternalNonContainerDatabaseManagementFeatureResponse
            enableExternalNonContainerDatabaseManagementFeature(
                    EnableExternalNonContainerDatabaseManagementFeatureRequest request);

    /**
     * Enables a Database Management feature for the specified external pluggable database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/EnableExternalPluggableDatabaseManagementFeatureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableExternalPluggableDatabaseManagementFeature API.
     */
    EnableExternalPluggableDatabaseManagementFeatureResponse
            enableExternalPluggableDatabaseManagementFeature(
                    EnableExternalPluggableDatabaseManagementFeatureRequest request);

    /**
     * Enables the high-frequency Automatic SPM Evolve Advisor task. The high-frequency
     * task runs every hour and runs for no longer than 30 minutes. These settings
     * are not configurable.
     * <p>
     * The high-frequency task complements the standard Automatic SPM Evolve Advisor task.
     * They are independent and are scheduled through two different frameworks.
     * <p>
     * It is available only on Oracle Exadata Database Machine, Oracle Database Exadata
     * Cloud Service (ExaCS) and Oracle Database Exadata Cloud@Customer (ExaCC).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableHighFrequencyAutomaticSpmEvolveAdvisorTask API.
     */
    EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse
            enableHighFrequencyAutomaticSpmEvolveAdvisorTask(
                    EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest request);

    /**
     * Enables a Database Management feature for the specified Oracle cloud pluggable database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/EnablePluggableDatabaseManagementFeatureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnablePluggableDatabaseManagementFeature API.
     */
    EnablePluggableDatabaseManagementFeatureResponse enablePluggableDatabaseManagementFeature(
            EnablePluggableDatabaseManagementFeatureRequest request);

    /**
     * Enables the use of SQL plan baselines stored in SQL Management Base.
     * <p>
     * When enabled, the optimizer uses SQL plan baselines to select plans
     * to avoid potential performance regressions.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/EnableSqlPlanBaselinesUsageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableSqlPlanBaselinesUsage API.
     */
    EnableSqlPlanBaselinesUsageResponse enableSqlPlanBaselinesUsage(
            EnableSqlPlanBaselinesUsageRequest request);

    /**
     * Creates an AWR snapshot for the target database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GenerateAwrSnapshotExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GenerateAwrSnapshot API.
     */
    GenerateAwrSnapshotResponse generateAwrSnapshot(GenerateAwrSnapshotRequest request);

    /**
     * Gets the AWR report for the specific database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetAwrDbReportExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAwrDbReport API.
     */
    GetAwrDbReportResponse getAwrDbReport(GetAwrDbReportRequest request);

    /**
     * Gets the SQL health check report for one SQL of the specific database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetAwrDbSqlReportExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAwrDbSqlReport API.
     */
    GetAwrDbSqlReportResponse getAwrDbSqlReport(GetAwrDbSqlReportRequest request);

    /**
     * Gets the metrics related to cluster cache for the Oracle
     * Real Application Clusters (Oracle RAC) database specified
     * by managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetClusterCacheMetricExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetClusterCacheMetric API.
     */
    GetClusterCacheMetricResponse getClusterCacheMetric(GetClusterCacheMetricRequest request);

    /**
     * Gets the fleet of container databases (CDBs) and their backup details and metrics, in a compartment or Database Group.
     * The databaseHostedIn query parameter must be provided to list either cloud or external databases.
     * Either the CompartmentId or the ManagedDatabaseGroupId query parameters must be provided to retrieve the HA and backup metrics.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetDatabaseFleetBackupMetricsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDatabaseFleetBackupMetrics API.
     */
    GetDatabaseFleetBackupMetricsResponse getDatabaseFleetBackupMetrics(
            GetDatabaseFleetBackupMetricsRequest request);

    /**
     * Gets the fleet of Oracle Data Guard-enabled container databases (CDBs) along with Data Guard metrics and standby databases, in a compartment or Database Group.
     * Either the CompartmentId or the ManagedDatabaseGroupId query parameters must be provided to retrieve the list of databases and Data Guard metrics.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetDatabaseFleetDataguardMetricsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDatabaseFleetDataguardMetrics API.
     */
    GetDatabaseFleetDataguardMetricsResponse getDatabaseFleetDataguardMetrics(
            GetDatabaseFleetDataguardMetricsRequest request);

    /**
     * Gets the fleet of container databases (CDBs) and their HA and backup metrics in a compartment or in a Database Group.
     * Either the CompartmentId or the ManagedDatabaseGroupId query parameters must be provided to retrieve the HA and backup metrics.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetDatabaseFleetHaOverviewMetricsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDatabaseFleetHaOverviewMetrics API.
     */
    GetDatabaseFleetHaOverviewMetricsResponse getDatabaseFleetHaOverviewMetrics(
            GetDatabaseFleetHaOverviewMetricsRequest request);

    /**
     * Gets the health metrics for a fleet of databases in a compartment or in a Managed Database Group.
     * Either the CompartmentId or the ManagedDatabaseGroupId query parameters must be provided to retrieve the health metrics.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetDatabaseFleetHealthMetricsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDatabaseFleetHealthMetrics API.
     */
    GetDatabaseFleetHealthMetricsResponse getDatabaseFleetHealthMetrics(
            GetDatabaseFleetHealthMetricsRequest request);

    /**
     * Gets HA and backup details with metrics and backup history for a single database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetDatabaseHaBackupDetailsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDatabaseHaBackupDetails API.
     */
    GetDatabaseHaBackupDetailsResponse getDatabaseHaBackupDetails(
            GetDatabaseHaBackupDetailsRequest request);

    /**
     * Gets a summary of the activity and resource usage metrics like DB Time, CPU, User I/O, Wait, Storage, and Memory for a Managed Database.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetDatabaseHomeMetricsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDatabaseHomeMetrics API.
     */
    GetDatabaseHomeMetricsResponse getDatabaseHomeMetrics(GetDatabaseHomeMetricsRequest request);

    /**
     * Gets a historical summary of the Database Guard performance metrics for Managed Databases.
     * If the peerDatabaseCompartmentId is specified, then the metrics are only retrieved from the specified compartment.
     * If the peerDatabaseCompartmentId is not specified, then the metrics are retrieved from the compartment of the Managed Database specified by the ManagedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetDataguardPerformanceMetricsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDataguardPerformanceMetrics API.
     */
    GetDataguardPerformanceMetricsResponse getDataguardPerformanceMetrics(
            GetDataguardPerformanceMetricsRequest request);

    /**
     * Gets the details of a specific Database Management private endpoint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetDbManagementPrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDbManagementPrivateEndpoint API.
     */
    GetDbManagementPrivateEndpointResponse getDbManagementPrivateEndpoint(
            GetDbManagementPrivateEndpointRequest request);

    /**
     * Gets the details for the external ASM specified by `externalAsmId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetExternalAsmExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExternalAsm API.
     */
    GetExternalAsmResponse getExternalAsm(GetExternalAsmRequest request);

    /**
     * Gets configuration details including disk groups for the external ASM specified by `externalAsmId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetExternalAsmConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExternalAsmConfiguration API.
     */
    GetExternalAsmConfigurationResponse getExternalAsmConfiguration(
            GetExternalAsmConfigurationRequest request);

    /**
     * Gets the details for the external ASM instance specified by `externalAsmInstanceId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetExternalAsmInstanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExternalAsmInstance API.
     */
    GetExternalAsmInstanceResponse getExternalAsmInstance(GetExternalAsmInstanceRequest request);

    /**
     * Gets the details for the external cluster specified by `externalClusterId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetExternalClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExternalCluster API.
     */
    GetExternalClusterResponse getExternalCluster(GetExternalClusterRequest request);

    /**
     * Gets the details for the external cluster instance specified by `externalClusterInstanceId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetExternalClusterInstanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExternalClusterInstance API.
     */
    GetExternalClusterInstanceResponse getExternalClusterInstance(
            GetExternalClusterInstanceRequest request);

    /**
     * Gets the details for the external DB home specified by `externalDbHomeId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetExternalDbHomeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExternalDbHome API.
     */
    GetExternalDbHomeResponse getExternalDbHome(GetExternalDbHomeRequest request);

    /**
     * Gets the details for the external DB node specified by `externalDbNodeId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetExternalDbNodeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExternalDbNode API.
     */
    GetExternalDbNodeResponse getExternalDbNode(GetExternalDbNodeRequest request);

    /**
     * Gets the details for the external DB system specified by `externalDbSystemId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetExternalDbSystemExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExternalDbSystem API.
     */
    GetExternalDbSystemResponse getExternalDbSystem(GetExternalDbSystemRequest request);

    /**
     * Gets the details for the external connector specified by `externalDbSystemConnectorId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetExternalDbSystemConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExternalDbSystemConnector API.
     */
    GetExternalDbSystemConnectorResponse getExternalDbSystemConnector(
            GetExternalDbSystemConnectorRequest request);

    /**
     * Gets the details for the external DB system discovery resource specified by `externalDbSystemDiscoveryId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetExternalDbSystemDiscoveryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExternalDbSystemDiscovery API.
     */
    GetExternalDbSystemDiscoveryResponse getExternalDbSystemDiscovery(
            GetExternalDbSystemDiscoveryRequest request);

    /**
     * Gets the details for the Exadata infrastructure specified by externalExadataInfrastructureId. It includes the DB systems and storage grid within the
     * Exadata infrastructure.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetExternalExadataInfrastructureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExternalExadataInfrastructure API.
     */
    GetExternalExadataInfrastructureResponse getExternalExadataInfrastructure(
            GetExternalExadataInfrastructureRequest request);

    /**
     * Gets the details for the Exadata storage server connector specified by exadataStorageConnectorId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetExternalExadataStorageConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExternalExadataStorageConnector API.
     */
    GetExternalExadataStorageConnectorResponse getExternalExadataStorageConnector(
            GetExternalExadataStorageConnectorRequest request);

    /**
     * Gets the details for the Exadata storage server grid specified by exadataStorageGridId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetExternalExadataStorageGridExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExternalExadataStorageGrid API.
     */
    GetExternalExadataStorageGridResponse getExternalExadataStorageGrid(
            GetExternalExadataStorageGridRequest request);

    /**
     * Gets the summary for the Exadata storage server specified by exadataStorageServerId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetExternalExadataStorageServerExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExternalExadataStorageServer API.
     */
    GetExternalExadataStorageServerResponse getExternalExadataStorageServer(
            GetExternalExadataStorageServerRequest request);

    /**
     * Gets the details for the external listener specified by `externalListenerId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetExternalListenerExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExternalListener API.
     */
    GetExternalListenerResponse getExternalListener(GetExternalListenerRequest request);

    /**
     * Retrieves the external MySQL database information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetExternalMySqlDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExternalMySqlDatabase API.
     */
    GetExternalMySqlDatabaseResponse getExternalMySqlDatabase(
            GetExternalMySqlDatabaseRequest request);

    /**
     * Retrieves the MySQL database connector.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetExternalMySqlDatabaseConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExternalMySqlDatabaseConnector API.
     */
    GetExternalMySqlDatabaseConnectorResponse getExternalMySqlDatabaseConnector(
            GetExternalMySqlDatabaseConnectorRequest request);

    /**
     * Get the IORM plan from the specific Exadata storage server.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetIormPlanExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetIormPlan API.
     */
    GetIormPlanResponse getIormPlan(GetIormPlanRequest request);

    /**
     * Gets the details for the job specified by jobId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetJob API.
     */
    GetJobResponse getJob(GetJobRequest request);

    /**
     * Gets the details for the job execution specified by jobExecutionId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetJobExecutionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetJobExecution API.
     */
    GetJobExecutionResponse getJobExecution(GetJobExecutionRequest request);

    /**
     * Gets the details for the job run specified by jobRunId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetJobRunExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetJobRun API.
     */
    GetJobRunResponse getJobRun(GetJobRunRequest request);

    /**
     * Gets the details for the Managed Database specified by managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetManagedDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetManagedDatabase API.
     */
    GetManagedDatabaseResponse getManagedDatabase(GetManagedDatabaseRequest request);

    /**
     * Gets the details for the Managed Database Group specified by managedDatabaseGroupId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetManagedDatabaseGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetManagedDatabaseGroup API.
     */
    GetManagedDatabaseGroupResponse getManagedDatabaseGroup(GetManagedDatabaseGroupRequest request);

    /**
     * Gets the details for the named credential specified by namedCredentialId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetNamedCredentialExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetNamedCredential API.
     */
    GetNamedCredentialResponse getNamedCredential(GetNamedCredentialRequest request);

    /**
     * Gets the open alerts from the specified Exadata storage server.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetOpenAlertHistoryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetOpenAlertHistory API.
     */
    GetOpenAlertHistoryResponse getOpenAlertHistory(GetOpenAlertHistoryRequest request);

    /**
     * Gets a comprehensive report of the Optimizer Statistics Advisor execution, which includes details of the
     * Managed Database, findings, recommendations, rationale, and examples.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetOptimizerStatisticsAdvisorExecutionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetOptimizerStatisticsAdvisorExecution API.
     */
    GetOptimizerStatisticsAdvisorExecutionResponse getOptimizerStatisticsAdvisorExecution(
            GetOptimizerStatisticsAdvisorExecutionRequest request);

    /**
     * Gets the Oracle system-generated script for the specified Optimizer Statistics Advisor execution.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetOptimizerStatisticsAdvisorExecutionScriptExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetOptimizerStatisticsAdvisorExecutionScript API.
     */
    GetOptimizerStatisticsAdvisorExecutionScriptResponse
            getOptimizerStatisticsAdvisorExecutionScript(
                    GetOptimizerStatisticsAdvisorExecutionScriptRequest request);

    /**
     * Gets a detailed report of the Optimizer Statistics Collection operation for the specified Managed Database.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetOptimizerStatisticsCollectionOperationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetOptimizerStatisticsCollectionOperation API.
     */
    GetOptimizerStatisticsCollectionOperationResponse getOptimizerStatisticsCollectionOperation(
            GetOptimizerStatisticsCollectionOperationRequest request);

    /**
     * Gets a summary of the resource usage metrics such as CPU, User I/O, and Storage for each
     * PDB within a specific CDB. If comparmentId is specified, then the metrics for
     * each PDB (within the CDB) in the specified compartment are retrieved.
     * If compartmentId is not specified, then the metrics for all the PDBs within the CDB are retrieved.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetPdbMetricsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetPdbMetrics API.
     */
    GetPdbMetricsResponse getPdbMetrics(GetPdbMetricsRequest request);

    /**
     * Gets a comparative summary of the baseline and target values of the Data Guard performance metrics for Managed Databases.
     * If the peerDatabaseCompartmentId is specified, then the metrics are only retrieved from the specified compartment.
     * If the peerDatabaseCompartmentId is not specified, then the metrics are retrieved from the compartment of the Managed Database specified by the ManagedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetPeerDatabaseMetricsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetPeerDatabaseMetrics API.
     */
    GetPeerDatabaseMetricsResponse getPeerDatabaseMetrics(GetPeerDatabaseMetricsRequest request);

    /**
     * Gets the preferred credential details for a Managed Database based on credentialName.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetPreferredCredentialExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetPreferredCredential API.
     */
    GetPreferredCredentialResponse getPreferredCredential(GetPreferredCredentialRequest request);

    /**
     * Gets the SQL plan baseline details for the specified planName.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetSqlPlanBaselineExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSqlPlanBaseline API.
     */
    GetSqlPlanBaselineResponse getSqlPlanBaseline(GetSqlPlanBaselineRequest request);

    /**
     * Gets the configuration details of SQL plan baselines for the specified
     * Managed Database. The details include the settings for the capture and use of
     * SQL plan baselines, SPM Evolve Advisor task, and SQL Management Base.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetSqlPlanBaselineConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSqlPlanBaselineConfiguration API.
     */
    GetSqlPlanBaselineConfigurationResponse getSqlPlanBaselineConfiguration(
            GetSqlPlanBaselineConfigurationRequest request);

    /**
     * Gets the details of the tablespace specified by tablespaceName within the Managed Database specified by managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetTablespaceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTablespace API.
     */
    GetTablespaceResponse getTablespace(GetTablespaceRequest request);

    /**
     * Gets the SQL IDs with the top CPU activity from the Exadata storage server.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetTopSqlCpuActivityExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTopSqlCpuActivity API.
     */
    GetTopSqlCpuActivityResponse getTopSqlCpuActivity(GetTopSqlCpuActivityRequest request);

    /**
     * Gets the details of the user specified by managedDatabaseId and userName.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetUserExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetUser API.
     */
    GetUserResponse getUser(GetUserRequest request);

    /**
     * Gets the status of the work request with the given Work Request ID
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Asynchronously implements the findings and recommendations of the Optimizer Statistics Advisor execution.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ImplementOptimizerStatisticsAdvisorRecommendationsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ImplementOptimizerStatisticsAdvisorRecommendations API.
     */
    ImplementOptimizerStatisticsAdvisorRecommendationsResponse
            implementOptimizerStatisticsAdvisorRecommendations(
                    ImplementOptimizerStatisticsAdvisorRecommendationsRequest request);

    /**
     * Gets the list of ASM properties for the specified managedDatabaseId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListAsmPropertiesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAsmProperties API.
     */
    ListAsmPropertiesResponse listAsmProperties(ListAsmPropertiesRequest request);

    /**
     * Gets the list of databases using a specific Database Management private endpoint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListAssociatedDatabasesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAssociatedDatabases API.
     */
    ListAssociatedDatabasesResponse listAssociatedDatabases(ListAssociatedDatabasesRequest request);

    /**
     * Lists AWR snapshots for the specified database in the AWR.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListAwrDbSnapshotsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAwrDbSnapshots API.
     */
    ListAwrDbSnapshotsResponse listAwrDbSnapshots(ListAwrDbSnapshotsRequest request);

    /**
     * Gets the list of databases and their snapshot summary details available in the AWR of the specified Managed Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListAwrDbsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAwrDbs API.
     */
    ListAwrDbsResponse listAwrDbs(ListAwrDbsRequest request);

    /**
     * Gets the list of consumer group privileges granted to a specific user.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListConsumerGroupPrivilegesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListConsumerGroupPrivileges API.
     */
    ListConsumerGroupPrivilegesResponse listConsumerGroupPrivileges(
            ListConsumerGroupPrivilegesRequest request);

    /**
     * Lists the SQL statements from shared SQL area, also called the cursor cache.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListCursorCacheStatementsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListCursorCacheStatements API.
     */
    ListCursorCacheStatementsResponse listCursorCacheStatements(
            ListCursorCacheStatementsRequest request);

    /**
     * Gets the list of containers for a specific user. This is only applicable if ALL_CONTAINERS !='Y'.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListDataAccessContainersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDataAccessContainers API.
     */
    ListDataAccessContainersResponse listDataAccessContainers(
            ListDataAccessContainersRequest request);

    /**
     * Gets the list of database parameters for the specified Managed Database. The parameters are listed in alphabetical order, along with their current values.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListDatabaseParametersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDatabaseParameters API.
     */
    ListDatabaseParametersResponse listDatabaseParameters(ListDatabaseParametersRequest request);

    /**
     * Gets a list of Database Management private endpoints.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListDbManagementPrivateEndpointsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDbManagementPrivateEndpoints API.
     */
    ListDbManagementPrivateEndpointsResponse listDbManagementPrivateEndpoints(
            ListDbManagementPrivateEndpointsRequest request);

    /**
     * Lists ASM disk groups for the external ASM specified by `externalAsmId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListExternalAsmDiskGroupsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExternalAsmDiskGroups API.
     */
    ListExternalAsmDiskGroupsResponse listExternalAsmDiskGroups(
            ListExternalAsmDiskGroupsRequest request);

    /**
     * Lists the ASM instances in the specified external ASM.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListExternalAsmInstancesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExternalAsmInstances API.
     */
    ListExternalAsmInstancesResponse listExternalAsmInstances(
            ListExternalAsmInstancesRequest request);

    /**
     * Lists ASM users for the external ASM specified by `externalAsmId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListExternalAsmUsersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExternalAsmUsers API.
     */
    ListExternalAsmUsersResponse listExternalAsmUsers(ListExternalAsmUsersRequest request);

    /**
     * Lists the ASMs in the specified external DB system.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListExternalAsmsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExternalAsms API.
     */
    ListExternalAsmsResponse listExternalAsms(ListExternalAsmsRequest request);

    /**
     * Lists the cluster instances in the specified external cluster.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListExternalClusterInstancesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExternalClusterInstances API.
     */
    ListExternalClusterInstancesResponse listExternalClusterInstances(
            ListExternalClusterInstancesRequest request);

    /**
     * Lists the clusters in the specified external DB system.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListExternalClustersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExternalClusters API.
     */
    ListExternalClustersResponse listExternalClusters(ListExternalClustersRequest request);

    /**
     * Lists the external databases in the specified compartment or in the specified DB system.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListExternalDatabasesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExternalDatabases API.
     */
    ListExternalDatabasesResponse listExternalDatabases(ListExternalDatabasesRequest request);

    /**
     * Lists the DB homes in the specified external DB system.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListExternalDbHomesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExternalDbHomes API.
     */
    ListExternalDbHomesResponse listExternalDbHomes(ListExternalDbHomesRequest request);

    /**
     * Lists the external DB nodes in the specified external DB system.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListExternalDbNodesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExternalDbNodes API.
     */
    ListExternalDbNodesResponse listExternalDbNodes(ListExternalDbNodesRequest request);

    /**
     * Lists the external connectors in the specified external DB system.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListExternalDbSystemConnectorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExternalDbSystemConnectors API.
     */
    ListExternalDbSystemConnectorsResponse listExternalDbSystemConnectors(
            ListExternalDbSystemConnectorsRequest request);

    /**
     * Lists the external DB system discovery resources in the specified compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListExternalDbSystemDiscoveriesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExternalDbSystemDiscoveries API.
     */
    ListExternalDbSystemDiscoveriesResponse listExternalDbSystemDiscoveries(
            ListExternalDbSystemDiscoveriesRequest request);

    /**
     * Lists the external DB systems in the specified compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListExternalDbSystemsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExternalDbSystems API.
     */
    ListExternalDbSystemsResponse listExternalDbSystems(ListExternalDbSystemsRequest request);

    /**
     * Lists the Exadata infrastructure resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListExternalExadataInfrastructuresExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExternalExadataInfrastructures API.
     */
    ListExternalExadataInfrastructuresResponse listExternalExadataInfrastructures(
            ListExternalExadataInfrastructuresRequest request);

    /**
     * Lists the Exadata storage server connectors for the specified Exadata infrastructure.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListExternalExadataStorageConnectorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExternalExadataStorageConnectors API.
     */
    ListExternalExadataStorageConnectorsResponse listExternalExadataStorageConnectors(
            ListExternalExadataStorageConnectorsRequest request);

    /**
     * Lists the Exadata storage servers for the specified Exadata infrastructure.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListExternalExadataStorageServersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExternalExadataStorageServers API.
     */
    ListExternalExadataStorageServersResponse listExternalExadataStorageServers(
            ListExternalExadataStorageServersRequest request);

    /**
     * Lists the database services registered with the specified external listener
     * for the specified Managed Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListExternalListenerServicesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExternalListenerServices API.
     */
    ListExternalListenerServicesResponse listExternalListenerServices(
            ListExternalListenerServicesRequest request);

    /**
     * Lists the listeners in the specified external DB system.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListExternalListenersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExternalListeners API.
     */
    ListExternalListenersResponse listExternalListeners(ListExternalListenersRequest request);

    /**
     * Gets the list of External MySQL Databases.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListExternalMySqlDatabasesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExternalMySqlDatabases API.
     */
    ListExternalMySqlDatabasesResponse listExternalMySqlDatabases(
            ListExternalMySqlDatabasesRequest request);

    /**
     * Gets the job execution for a specific ID or the list of job executions for a job, job run, Managed Database or Managed Database Group
     * in a specific compartment. Only one of the parameters, ID, jobId, jobRunId, managedDatabaseId or managedDatabaseGroupId should be provided.
     * If none of these parameters is provided, all the job executions in the compartment are listed. Job executions can also be filtered
     * based on the name and status parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListJobExecutionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListJobExecutions API.
     */
    ListJobExecutionsResponse listJobExecutions(ListJobExecutionsRequest request);

    /**
     * Gets the job run for a specific ID or the list of job runs for a job, Managed Database or Managed Database Group
     * in a specific compartment. Only one of the parameters, ID, jobId, managedDatabaseId, or managedDatabaseGroupId
     * should be provided. If none of these parameters is provided, all the job runs in the compartment are listed.
     * Job runs can also be filtered based on name and runStatus parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListJobRunsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListJobRuns API.
     */
    ListJobRunsResponse listJobRuns(ListJobRunsRequest request);

    /**
     * Gets the job for a specific ID or the list of jobs for a Managed Database or Managed Database Group
     * in a specific compartment. Only one of the parameters, ID, managedDatabaseId or managedDatabaseGroupId,
     * should be provided. If none of these parameters is provided, all the jobs in the compartment are listed.
     * Jobs can also be filtered based on the name and lifecycleState parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListJobsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListJobs API.
     */
    ListJobsResponse listJobs(ListJobsRequest request);

    /**
     * Gets the Managed Database Group for a specific ID or the list of Managed Database Groups in
     * a specific compartment. Managed Database Groups can also be filtered based on the name parameter.
     * Only one of the parameters, ID or name should be provided. If none of these parameters is provided,
     * all the Managed Database Groups in the compartment are listed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListManagedDatabaseGroupsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListManagedDatabaseGroups API.
     */
    ListManagedDatabaseGroupsResponse listManagedDatabaseGroups(
            ListManagedDatabaseGroupsRequest request);

    /**
     * Gets the Managed Database for a specific ID or the list of Managed Databases in a specific compartment.
     * Managed Databases can be filtered based on the name parameter. Only one of the parameters, ID or name
     * should be provided. If neither of these parameters is provided, all the Managed Databases in the compartment
     * are listed. Managed Databases can also be filtered based on the deployment type and management option.
     * If the deployment type is not specified or if it is `ONPREMISE`, then the management option is not
     * considered and Managed Databases with `ADVANCED` management option are listed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListManagedDatabasesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListManagedDatabases API.
     */
    ListManagedDatabasesResponse listManagedDatabases(ListManagedDatabasesRequest request);

    /**
     * Gets the list of External MySQL Database connectors.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListMySqlDatabaseConnectorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMySqlDatabaseConnectors API.
     */
    ListMySqlDatabaseConnectorsResponse listMySqlDatabaseConnectors(
            ListMySqlDatabaseConnectorsRequest request);

    /**
     * Gets a single named credential specified by the name or all the named credentials in a specific compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListNamedCredentialsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListNamedCredentials API.
     */
    ListNamedCredentialsResponse listNamedCredentials(ListNamedCredentialsRequest request);

    /**
     * Gets the list of object privileges granted to a specific user.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListObjectPrivilegesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListObjectPrivileges API.
     */
    ListObjectPrivilegesResponse listObjectPrivileges(ListObjectPrivilegesRequest request);

    /**
     * Lists the details of the Optimizer Statistics Advisor task executions, such as their duration, and the number of findings, if any.
     * Optionally, you can specify a date-time range (of seven days) to obtain the list of executions that fall within the specified time range.
     * If the date-time range is not specified, then the executions in the last seven days are listed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListOptimizerStatisticsAdvisorExecutionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListOptimizerStatisticsAdvisorExecutions API.
     */
    ListOptimizerStatisticsAdvisorExecutionsResponse listOptimizerStatisticsAdvisorExecutions(
            ListOptimizerStatisticsAdvisorExecutionsRequest request);

    /**
     * Gets a list of the optimizer statistics collection operations per hour, grouped by task or object status for the specified Managed Database.
     * You must specify a value for GroupByQueryParam to determine whether the data should be grouped by task status or task object status.
     * Optionally, you can specify a date-time range (of seven days) to obtain collection aggregations within the specified time range.
     * If the date-time range is not specified, then the operations in the last seven days are listed.
     * You can further filter the results by providing the optional type of TaskTypeQueryParam.
     * If the task type not provided, then both Auto and Manual tasks are considered for aggregation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListOptimizerStatisticsCollectionAggregationsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListOptimizerStatisticsCollectionAggregations API.
     */
    ListOptimizerStatisticsCollectionAggregationsResponse
            listOptimizerStatisticsCollectionAggregations(
                    ListOptimizerStatisticsCollectionAggregationsRequest request);

    /**
     * Lists the Optimizer Statistics Collection (Auto and Manual) task operation summary for the specified Managed Database.
     * The summary includes the details of each operation and the number of tasks grouped by status: Completed, In Progress, Failed, and so on.
     * Optionally, you can specify a date-time range (of seven days) to obtain the list of operations that fall within the specified time range.
     * If the date-time range is not specified, then the operations in the last seven days are listed.
     * This API also enables the pagination of results and the opc-next-page response header indicates whether there is a next page.
     * If you use the same header value in a consecutive request, the next page records are returned.
     * To obtain the required results, you can apply the different types of filters supported by this API.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListOptimizerStatisticsCollectionOperationsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListOptimizerStatisticsCollectionOperations API.
     */
    ListOptimizerStatisticsCollectionOperationsResponse listOptimizerStatisticsCollectionOperations(
            ListOptimizerStatisticsCollectionOperationsRequest request);

    /**
     * Gets the list of preferred credentials for a given Managed Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListPreferredCredentialsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListPreferredCredentials API.
     */
    ListPreferredCredentialsResponse listPreferredCredentials(
            ListPreferredCredentialsRequest request);

    /**
     * Gets the list of users on whose behalf the current user acts as proxy.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListProxiedForUsersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListProxiedForUsers API.
     */
    ListProxiedForUsersResponse listProxiedForUsers(ListProxiedForUsersRequest request);

    /**
     * Gets the list of proxy users for the current user.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListProxyUsersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListProxyUsers API.
     */
    ListProxyUsersResponse listProxyUsers(ListProxyUsersRequest request);

    /**
     * Gets the list of roles granted to a specific user.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListRolesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListRoles API.
     */
    ListRolesResponse listRoles(ListRolesRequest request);

    /**
     * Lists the database jobs used for loading SQL plan baselines in the specified Managed Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListSqlPlanBaselineJobsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSqlPlanBaselineJobs API.
     */
    ListSqlPlanBaselineJobsResponse listSqlPlanBaselineJobs(ListSqlPlanBaselineJobsRequest request);

    /**
     * Lists the SQL plan baselines for the specified Managed Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListSqlPlanBaselinesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSqlPlanBaselines API.
     */
    ListSqlPlanBaselinesResponse listSqlPlanBaselines(ListSqlPlanBaselinesRequest request);

    /**
     * Gets the list of system privileges granted to a specific user.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListSystemPrivilegesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSystemPrivileges API.
     */
    ListSystemPrivilegesResponse listSystemPrivileges(ListSystemPrivilegesRequest request);

    /**
     * Lists the database table statistics grouped by different statuses such as Not Stale Stats, Stale Stats, and No Stats.
     * This also includes the percentage of each status.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListTableStatisticsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTableStatistics API.
     */
    ListTableStatisticsResponse listTableStatistics(ListTableStatisticsRequest request);

    /**
     * Gets the list of tablespaces for the specified managedDatabaseId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListTablespacesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTablespaces API.
     */
    ListTablespacesResponse listTablespaces(ListTablespacesRequest request);

    /**
     * Gets the list of users for the specified managedDatabaseId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListUsersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListUsers API.
     */
    ListUsersResponse listUsers(ListUsersRequest request);

    /**
     * Returns a paginated list of errors for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListWorkRequestErrorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Returns a paginated list of logs for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListWorkRequestLogsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * The list of work requests in a specific compartment was retrieved successfully.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Loads plans from Automatic Workload Repository (AWR) snapshots. You must
     * specify the beginning and ending of the snapshot range. Optionally, you
     * can apply a filter to load only plans that meet specified criteria. By
     * default, the optimizer uses the loaded plans the next time that the database
     * executes the SQL statements.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/LoadSqlPlanBaselinesFromAwrExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use LoadSqlPlanBaselinesFromAwr API.
     */
    LoadSqlPlanBaselinesFromAwrResponse loadSqlPlanBaselinesFromAwr(
            LoadSqlPlanBaselinesFromAwrRequest request);

    /**
     * Loads plans for statements directly from the shared SQL area, also called
     * the cursor cache. By applying a filter on the module name, the schema, or
     * the SQL ID you identify the SQL statement or set of SQL statements to load.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/LoadSqlPlanBaselinesFromCursorCacheExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use LoadSqlPlanBaselinesFromCursorCache API.
     */
    LoadSqlPlanBaselinesFromCursorCacheResponse loadSqlPlanBaselinesFromCursorCache(
            LoadSqlPlanBaselinesFromCursorCacheRequest request);

    /**
     * Modifies the Database Management feature for the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ModifyAutonomousDatabaseManagementFeatureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ModifyAutonomousDatabaseManagementFeature API.
     */
    ModifyAutonomousDatabaseManagementFeatureResponse modifyAutonomousDatabaseManagementFeature(
            ModifyAutonomousDatabaseManagementFeatureRequest request);

    /**
     * Modifies a Database Management feature for the specified Oracle cloud database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ModifyDatabaseManagementFeatureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ModifyDatabaseManagementFeature API.
     */
    ModifyDatabaseManagementFeatureResponse modifyDatabaseManagementFeature(
            ModifyDatabaseManagementFeatureRequest request);

    /**
     * Modifies the Database Management feature for the specified Oracle cloud pluggable database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ModifyPluggableDatabaseManagementFeatureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ModifyPluggableDatabaseManagementFeature API.
     */
    ModifyPluggableDatabaseManagementFeatureResponse modifyPluggableDatabaseManagementFeature(
            ModifyPluggableDatabaseManagementFeatureRequest request);

    /**
     * Patches the external DB system discovery specified by `externalDbSystemDiscoveryId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/PatchExternalDbSystemDiscoveryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use PatchExternalDbSystemDiscovery API.
     */
    PatchExternalDbSystemDiscoveryResponse patchExternalDbSystemDiscovery(
            PatchExternalDbSystemDiscoveryRequest request);

    /**
     * Removes a data file or temp file from the tablespace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/RemoveDataFileExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemoveDataFile API.
     */
    RemoveDataFileResponse removeDataFile(RemoveDataFileRequest request);

    /**
     * Removes a Managed Database from a Managed Database Group. Any management
     * activities that are currently running on this database will continue to
     * run to completion. However, any activities scheduled to run in the future
     * will not be performed on this database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/RemoveManagedDatabaseFromManagedDatabaseGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemoveManagedDatabaseFromManagedDatabaseGroup API.
     */
    RemoveManagedDatabaseFromManagedDatabaseGroupResponse
            removeManagedDatabaseFromManagedDatabaseGroup(
                    RemoveManagedDatabaseFromManagedDatabaseGroupRequest request);

    /**
     * Resets database parameter values to their default or startup values.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ResetDatabaseParametersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ResetDatabaseParameters API.
     */
    ResetDatabaseParametersResponse resetDatabaseParameters(ResetDatabaseParametersRequest request);

    /**
     * Resizes a data file or temp file within the tablespace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ResizeDataFileExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ResizeDataFile API.
     */
    ResizeDataFileResponse resizeDataFile(ResizeDataFileRequest request);

    /**
     * Creates and executes a historic ADDM task using the specified AWR snapshot IDs. If an existing ADDM task
     * uses the provided awr snapshot IDs, the existing task will be returned.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/RunHistoricAddmExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RunHistoricAddm API.
     */
    RunHistoricAddmResponse runHistoricAddm(RunHistoricAddmRequest request);

    /**
     * Summarizes the AWR CPU resource limits and metrics for the specified database in AWR.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeAwrDbCpuUsagesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDbCpuUsages API.
     */
    SummarizeAwrDbCpuUsagesResponse summarizeAwrDbCpuUsages(SummarizeAwrDbCpuUsagesRequest request);

    /**
     * Summarizes the metric samples for the specified database in the AWR. The metric samples are summarized based on the Time dimension for each metric.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeAwrDbMetricsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDbMetrics API.
     */
    SummarizeAwrDbMetricsResponse summarizeAwrDbMetrics(SummarizeAwrDbMetricsRequest request);

    /**
     * Summarizes the database parameter change history for one database parameter of the specified database in AWR. One change history record contains
     * the previous value, the changed value, and the corresponding time range. If the database parameter value was changed multiple times within the time range, then multiple change history records are created for the same parameter.
     * Note that this API only returns information on change history details for one database parameter.
     * To get a list of all the database parameters whose values were changed during a specified time range, use the following API endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbs/{awrDbId}/awrDbParameters
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeAwrDbParameterChangesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDbParameterChanges API.
     */
    SummarizeAwrDbParameterChangesResponse summarizeAwrDbParameterChanges(
            SummarizeAwrDbParameterChangesRequest request);

    /**
     * Summarizes the database parameter history for the specified database in AWR. This includes the list of database
     * parameters, with information on whether the parameter values were modified within the query time range. Note that
     * each database parameter is only listed once. Depending on the optional query parameters, the returned summary gets all the database parameters, which include:
     * <p>
     * - Each parameter whose value was changed during the time range:  (valueChanged =\"Y\")
     * - Each parameter whose value was unchanged during the time range:  (valueChanged =\"N\")
     * - Each parameter whose value was changed at the system level during the time range: (valueChanged =\"Y\"  and valueModified = \"SYSTEM_MOD\")
     * - Each parameter whose value was unchanged during the time range, however, the value is not the default value: (valueChanged =\"N\" and  valueDefault = \"FALSE\")
     * <p>
     * Note that this API does not return information on the number of times each database parameter has been changed within the time range. To get the database parameter value change history for a specific parameter, use the following API endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbs/{awrDbId}/awrDbParameterChanges
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeAwrDbParametersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDbParameters API.
     */
    SummarizeAwrDbParametersResponse summarizeAwrDbParameters(
            SummarizeAwrDbParametersRequest request);

    /**
     * Summarizes the AWR snapshot ranges that contain continuous snapshots, for the specified Managed Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeAwrDbSnapshotRangesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDbSnapshotRanges API.
     */
    SummarizeAwrDbSnapshotRangesResponse summarizeAwrDbSnapshotRanges(
            SummarizeAwrDbSnapshotRangesRequest request);

    /**
     * Summarizes the AWR SYSSTAT sample data for the specified database in AWR. The statistical data is summarized based on the Time dimension for each statistic.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeAwrDbSysstatsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDbSysstats API.
     */
    SummarizeAwrDbSysstatsResponse summarizeAwrDbSysstats(SummarizeAwrDbSysstatsRequest request);

    /**
     * Summarizes the AWR top wait events.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeAwrDbTopWaitEventsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDbTopWaitEvents API.
     */
    SummarizeAwrDbTopWaitEventsResponse summarizeAwrDbTopWaitEvents(
            SummarizeAwrDbTopWaitEventsRequest request);

    /**
     * Summarizes AWR wait event data into value buckets and frequency, for the specified database in the AWR.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeAwrDbWaitEventBucketsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDbWaitEventBuckets API.
     */
    SummarizeAwrDbWaitEventBucketsResponse summarizeAwrDbWaitEventBuckets(
            SummarizeAwrDbWaitEventBucketsRequest request);

    /**
     * Summarizes the AWR wait event sample data for the specified database in the AWR. The event data is summarized based on the Time dimension for each event.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeAwrDbWaitEventsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDbWaitEvents API.
     */
    SummarizeAwrDbWaitEventsResponse summarizeAwrDbWaitEvents(
            SummarizeAwrDbWaitEventsRequest request);

    /**
     * Gets metrics for the external ASM specified by `externalAsmId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeExternalAsmMetricsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeExternalAsmMetrics API.
     */
    SummarizeExternalAsmMetricsResponse summarizeExternalAsmMetrics(
            SummarizeExternalAsmMetricsRequest request);

    /**
     * Gets metrics for the external cluster specified by `externalClusterId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeExternalClusterMetricsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeExternalClusterMetrics API.
     */
    SummarizeExternalClusterMetricsResponse summarizeExternalClusterMetrics(
            SummarizeExternalClusterMetricsRequest request);

    /**
     * Gets metrics for the external DB node specified by `externalDbNodeId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeExternalDbNodeMetricsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeExternalDbNodeMetrics API.
     */
    SummarizeExternalDbNodeMetricsResponse summarizeExternalDbNodeMetrics(
            SummarizeExternalDbNodeMetricsRequest request);

    /**
     * Gets availability metrics for the components present in the external DB system specified by `externalDbSystemId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeExternalDbSystemAvailabilityMetricsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeExternalDbSystemAvailabilityMetrics API.
     */
    SummarizeExternalDbSystemAvailabilityMetricsResponse
            summarizeExternalDbSystemAvailabilityMetrics(
                    SummarizeExternalDbSystemAvailabilityMetricsRequest request);

    /**
     * Gets metrics for the external listener specified by `externalListenerId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeExternalListenerMetricsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeExternalListenerMetrics API.
     */
    SummarizeExternalListenerMetricsResponse summarizeExternalListenerMetrics(
            SummarizeExternalListenerMetricsRequest request);

    /**
     * Gets the number of job executions grouped by status for a job, Managed Database, or Database Group in a specific compartment. Only one of the parameters, jobId, managedDatabaseId, or managedDatabaseGroupId should be provided.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeJobExecutionsStatusesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeJobExecutionsStatuses API.
     */
    SummarizeJobExecutionsStatusesResponse summarizeJobExecutionsStatuses(
            SummarizeJobExecutionsStatusesRequest request);

    /**
     * Gets the availability metrics related to managed database for the Oracle
     * database specified by managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeManagedDatabaseAvailabilityMetricsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeManagedDatabaseAvailabilityMetrics API.
     */
    SummarizeManagedDatabaseAvailabilityMetricsResponse summarizeManagedDatabaseAvailabilityMetrics(
            SummarizeManagedDatabaseAvailabilityMetricsRequest request);

    /**
     * Gets the number of SQL plan baselines aggregated by their attributes.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeSqlPlanBaselinesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeSqlPlanBaselines API.
     */
    SummarizeSqlPlanBaselinesResponse summarizeSqlPlanBaselines(
            SummarizeSqlPlanBaselinesRequest request);

    /**
     * Gets the number of SQL plan baselines aggregated by the age of their last execution in weeks.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeSqlPlanBaselinesByLastExecutionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeSqlPlanBaselinesByLastExecution API.
     */
    SummarizeSqlPlanBaselinesByLastExecutionResponse summarizeSqlPlanBaselinesByLastExecution(
            SummarizeSqlPlanBaselinesByLastExecutionRequest request);

    /**
     * Tests the named credential.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/TestNamedCredentialExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use TestNamedCredential API.
     */
    TestNamedCredentialResponse testNamedCredential(TestNamedCredentialRequest request);

    /**
     * Tests the preferred credential.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/TestPreferredCredentialExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use TestPreferredCredential API.
     */
    TestPreferredCredentialResponse testPreferredCredential(TestPreferredCredentialRequest request);

    /**
     * Updates one or more attributes of a specific Database Management private endpoint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateDbManagementPrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDbManagementPrivateEndpoint API.
     */
    UpdateDbManagementPrivateEndpointResponse updateDbManagementPrivateEndpoint(
            UpdateDbManagementPrivateEndpointRequest request);

    /**
     * Updates the external ASM specified by `externalAsmId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateExternalAsmExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExternalAsm API.
     */
    UpdateExternalAsmResponse updateExternalAsm(UpdateExternalAsmRequest request);

    /**
     * Updates the external ASM instance specified by `externalAsmInstanceId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateExternalAsmInstanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExternalAsmInstance API.
     */
    UpdateExternalAsmInstanceResponse updateExternalAsmInstance(
            UpdateExternalAsmInstanceRequest request);

    /**
     * Updates the external cluster specified by `externalClusterId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateExternalClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExternalCluster API.
     */
    UpdateExternalClusterResponse updateExternalCluster(UpdateExternalClusterRequest request);

    /**
     * Updates the external cluster instance specified by `externalClusterInstanceId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateExternalClusterInstanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExternalClusterInstance API.
     */
    UpdateExternalClusterInstanceResponse updateExternalClusterInstance(
            UpdateExternalClusterInstanceRequest request);

    /**
     * Updates the external DB home specified by `externalDbHomeId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateExternalDbHomeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExternalDbHome API.
     */
    UpdateExternalDbHomeResponse updateExternalDbHome(UpdateExternalDbHomeRequest request);

    /**
     * Updates the external DB node specified by `externalDbNodeId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateExternalDbNodeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExternalDbNode API.
     */
    UpdateExternalDbNodeResponse updateExternalDbNode(UpdateExternalDbNodeRequest request);

    /**
     * Updates the external DB system specified by `externalDbSystemId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateExternalDbSystemExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExternalDbSystem API.
     */
    UpdateExternalDbSystemResponse updateExternalDbSystem(UpdateExternalDbSystemRequest request);

    /**
     * Updates the external connector specified by `externalDbSystemConnectorId`.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateExternalDbSystemConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExternalDbSystemConnector API.
     */
    UpdateExternalDbSystemConnectorResponse updateExternalDbSystemConnector(
            UpdateExternalDbSystemConnectorRequest request);

    /**
     * Updates the external DB system discovery specified by `externalDbSystemDiscoveryId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateExternalDbSystemDiscoveryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExternalDbSystemDiscovery API.
     */
    UpdateExternalDbSystemDiscoveryResponse updateExternalDbSystemDiscovery(
            UpdateExternalDbSystemDiscoveryRequest request);

    /**
     * Updates the details for the Exadata infrastructure specified by externalExadataInfrastructureId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateExternalExadataInfrastructureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExternalExadataInfrastructure API.
     */
    UpdateExternalExadataInfrastructureResponse updateExternalExadataInfrastructure(
            UpdateExternalExadataInfrastructureRequest request);

    /**
     * Updates the Exadata storage server connector specified by exadataStorageConnectorId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateExternalExadataStorageConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExternalExadataStorageConnector API.
     */
    UpdateExternalExadataStorageConnectorResponse updateExternalExadataStorageConnector(
            UpdateExternalExadataStorageConnectorRequest request);

    /**
     * Updates the Exadata storage server grid specified by exadataStorageGridId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateExternalExadataStorageGridExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExternalExadataStorageGrid API.
     */
    UpdateExternalExadataStorageGridResponse updateExternalExadataStorageGrid(
            UpdateExternalExadataStorageGridRequest request);

    /**
     * Updates the Exadata storage server specified by exadataStorageServerId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateExternalExadataStorageServerExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExternalExadataStorageServer API.
     */
    UpdateExternalExadataStorageServerResponse updateExternalExadataStorageServer(
            UpdateExternalExadataStorageServerRequest request);

    /**
     * Updates the external listener specified by `externalListenerId`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateExternalListenerExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExternalListener API.
     */
    UpdateExternalListenerResponse updateExternalListener(UpdateExternalListenerRequest request);

    /**
     * Updates the External Mysql Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateExternalMysqlDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExternalMysqlDatabase API.
     */
    UpdateExternalMysqlDatabaseResponse updateExternalMysqlDatabase(
            UpdateExternalMysqlDatabaseRequest request);

    /**
     * Updates the External Mysql Database Connector.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateExternalMysqlDatabaseConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExternalMysqlDatabaseConnector API.
     */
    UpdateExternalMysqlDatabaseConnectorResponse updateExternalMysqlDatabaseConnector(
            UpdateExternalMysqlDatabaseConnectorRequest request);

    /**
     * Updates the details for the recurring scheduled job specified by jobId. Note that non-recurring (one time) jobs cannot be updated.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateJob API.
     */
    UpdateJobResponse updateJob(UpdateJobRequest request);

    /**
     * Updates the Managed Database specified by managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateManagedDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateManagedDatabase API.
     */
    UpdateManagedDatabaseResponse updateManagedDatabase(UpdateManagedDatabaseRequest request);

    /**
     * Updates the Managed Database Group specified by managedDatabaseGroupId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateManagedDatabaseGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateManagedDatabaseGroup API.
     */
    UpdateManagedDatabaseGroupResponse updateManagedDatabaseGroup(
            UpdateManagedDatabaseGroupRequest request);

    /**
     * Updates the named credential specified by namedCredentialId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateNamedCredentialExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateNamedCredential API.
     */
    UpdateNamedCredentialResponse updateNamedCredential(UpdateNamedCredentialRequest request);

    /**
     * Updates the preferred credential based on the credentialName.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdatePreferredCredentialExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdatePreferredCredential API.
     */
    UpdatePreferredCredentialResponse updatePreferredCredential(
            UpdatePreferredCredentialRequest request);

    /**
     * Updates the attributes of the tablespace specified by tablespaceName within the Managed Database specified by managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateTablespaceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateTablespace API.
     */
    UpdateTablespaceResponse updateTablespace(UpdateTablespaceRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    DbManagementWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DbManagementPaginators getPaginators();
}
