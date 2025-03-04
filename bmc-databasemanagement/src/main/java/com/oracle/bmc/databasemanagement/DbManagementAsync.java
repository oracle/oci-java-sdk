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
public interface DbManagementAsync extends AutoCloseable {

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
     * Adds data files or temp files to the tablespace.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddDataFilesResponse> addDataFiles(
            AddDataFilesRequest request,
            com.oracle.bmc.responses.AsyncHandler<AddDataFilesRequest, AddDataFilesResponse>
                    handler);

    /**
     * Adds a Managed Database to a specific Managed Database Group. After the database is added, it
     * will be included in the management activities performed on the Managed Database Group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddManagedDatabaseToManagedDatabaseGroupResponse>
            addManagedDatabaseToManagedDatabaseGroup(
                    AddManagedDatabaseToManagedDatabaseGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AddManagedDatabaseToManagedDatabaseGroupRequest,
                                    AddManagedDatabaseToManagedDatabaseGroupResponse>
                            handler);

    /**
     * Lists the metadata for each ADDM task who's end snapshot time falls within the provided start
     * and end time. Details include the name of the ADDM task, description, user, status and
     * creation date time.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddmTasksResponse> addmTasks(
            AddmTasksRequest request,
            com.oracle.bmc.responses.AsyncHandler<AddmTasksRequest, AddmTasksResponse> handler);

    /**
     * Changes database parameter values. There are two kinds of database parameters:
     *
     * <p>- Dynamic parameters: They can be changed for the current Oracle Database instance. The
     * changes take effect immediately. - Static parameters: They cannot be changed for the current
     * instance. You must change these parameters and then restart the database before changes take
     * effect.
     *
     * <p>*Note:** If the instance is started using a text initialization parameter file, the
     * parameter changes are applicable only for the current instance. You must update them manually
     * to be passed to a future instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDatabaseParametersResponse> changeDatabaseParameters(
            ChangeDatabaseParametersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeDatabaseParametersRequest, ChangeDatabaseParametersResponse>
                    handler);

    /**
     * Moves the Database Management private endpoint and its dependent resources to the specified
     * compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDbManagementPrivateEndpointCompartmentResponse>
            changeDbManagementPrivateEndpointCompartment(
                    ChangeDbManagementPrivateEndpointCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDbManagementPrivateEndpointCompartmentRequest,
                                    ChangeDbManagementPrivateEndpointCompartmentResponse>
                            handler);

    /**
     * Moves the external DB system and its related resources (excluding databases) to the specified
     * compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeExternalDbSystemCompartmentResponse>
            changeExternalDbSystemCompartment(
                    ChangeExternalDbSystemCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeExternalDbSystemCompartmentRequest,
                                    ChangeExternalDbSystemCompartmentResponse>
                            handler);

    /**
     * Moves the Exadata infrastructure and its related resources (Exadata storage server, Exadata
     * storage server connectors and Exadata storage server grid) to the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeExternalExadataInfrastructureCompartmentResponse>
            changeExternalExadataInfrastructureCompartment(
                    ChangeExternalExadataInfrastructureCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeExternalExadataInfrastructureCompartmentRequest,
                                    ChangeExternalExadataInfrastructureCompartmentResponse>
                            handler);

    /**
     * Moves a job.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeJobCompartmentResponse> changeJobCompartment(
            ChangeJobCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeJobCompartmentRequest, ChangeJobCompartmentResponse>
                    handler);

    /**
     * Moves a Managed Database Group to a different compartment. The destination compartment must
     * not have a Managed Database Group with the same name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeManagedDatabaseGroupCompartmentResponse>
            changeManagedDatabaseGroupCompartment(
                    ChangeManagedDatabaseGroupCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeManagedDatabaseGroupCompartmentRequest,
                                    ChangeManagedDatabaseGroupCompartmentResponse>
                            handler);

    /**
     * Moves a named credential to a different compartment. The destination compartment must not
     * have a named credential with the same name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeNamedCredentialCompartmentResponse>
            changeNamedCredentialCompartment(
                    ChangeNamedCredentialCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeNamedCredentialCompartmentRequest,
                                    ChangeNamedCredentialCompartmentResponse>
                            handler);

    /**
     * Changes the retention period of unused plans. The period can range between 5 and 523 weeks.
     *
     * <p>The database purges plans that have not been used for longer than the plan retention
     * period.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangePlanRetentionResponse> changePlanRetention(
            ChangePlanRetentionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangePlanRetentionRequest, ChangePlanRetentionResponse>
                    handler);

    /**
     * Changes the disk space limit for the SQL Management Base. The allowable range for this limit
     * is between 1% and 50%.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeSpaceBudgetResponse> changeSpaceBudget(
            ChangeSpaceBudgetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeSpaceBudgetRequest, ChangeSpaceBudgetResponse>
                    handler);

    /**
     * Changes one or more attributes of a single plan or all plans associated with a SQL statement.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeSqlPlanBaselinesAttributesResponse>
            changeSqlPlanBaselinesAttributes(
                    ChangeSqlPlanBaselinesAttributesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSqlPlanBaselinesAttributesRequest,
                                    ChangeSqlPlanBaselinesAttributesResponse>
                            handler);

    /**
     * Checks the status of the external DB system component connection specified in this connector.
     * This operation will refresh the connectionStatus and timeConnectionStatusLastUpdated fields.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CheckExternalDbSystemConnectorConnectionStatusResponse>
            checkExternalDbSystemConnectorConnectionStatus(
                    CheckExternalDbSystemConnectorConnectionStatusRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CheckExternalDbSystemConnectorConnectionStatusRequest,
                                    CheckExternalDbSystemConnectorConnectionStatusResponse>
                            handler);

    /**
     * Checks the status of the Exadata storage server connection specified by
     * exadataStorageConnectorId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CheckExternalExadataStorageConnectorResponse>
            checkExternalExadataStorageConnector(
                    CheckExternalExadataStorageConnectorRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CheckExternalExadataStorageConnectorRequest,
                                    CheckExternalExadataStorageConnectorResponse>
                            handler);

    /**
     * Check the status of the external database connection specified in this connector. This
     * operation will refresh the connectionStatus and timeConnectionStatusLastUpdated fields.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CheckExternalMySqlDatabaseConnectorConnectionStatusResponse>
            checkExternalMySqlDatabaseConnectorConnectionStatus(
                    CheckExternalMySqlDatabaseConnectorConnectionStatusRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CheckExternalMySqlDatabaseConnectorConnectionStatusRequest,
                                    CheckExternalMySqlDatabaseConnectorConnectionStatusResponse>
                            handler);

    /**
     * Configures automatic capture filters to capture only those statements that match the filter
     * criteria.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ConfigureAutomaticCaptureFiltersResponse>
            configureAutomaticCaptureFilters(
                    ConfigureAutomaticCaptureFiltersRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureAutomaticCaptureFiltersRequest,
                                    ConfigureAutomaticCaptureFiltersResponse>
                            handler);

    /**
     * Configures the Automatic SPM Evolve Advisor task `SYS_AUTO_SPM_EVOLVE_TASK` by specifying
     * task parameters. As the task is owned by `SYS`, only `SYS` can set task parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ConfigureAutomaticSpmEvolveAdvisorTaskResponse>
            configureAutomaticSpmEvolveAdvisorTask(
                    ConfigureAutomaticSpmEvolveAdvisorTaskRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureAutomaticSpmEvolveAdvisorTaskRequest,
                                    ConfigureAutomaticSpmEvolveAdvisorTaskResponse>
                            handler);

    /**
     * Creates a new Database Management private endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDbManagementPrivateEndpointResponse>
            createDbManagementPrivateEndpoint(
                    CreateDbManagementPrivateEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateDbManagementPrivateEndpointRequest,
                                    CreateDbManagementPrivateEndpointResponse>
                            handler);

    /**
     * Creates an external DB system and its related resources.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateExternalDbSystemResponse> createExternalDbSystem(
            CreateExternalDbSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateExternalDbSystemRequest, CreateExternalDbSystemResponse>
                    handler);

    /**
     * Creates a new external connector.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateExternalDbSystemConnectorResponse>
            createExternalDbSystemConnector(
                    CreateExternalDbSystemConnectorRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalDbSystemConnectorRequest,
                                    CreateExternalDbSystemConnectorResponse>
                            handler);

    /**
     * Creates an external DB system discovery resource and initiates the discovery process.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateExternalDbSystemDiscoveryResponse>
            createExternalDbSystemDiscovery(
                    CreateExternalDbSystemDiscoveryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalDbSystemDiscoveryRequest,
                                    CreateExternalDbSystemDiscoveryResponse>
                            handler);

    /**
     * Creates an OCI resource for the Exadata infrastructure and enables the Monitoring service for
     * the Exadata infrastructure. The following resource/subresources are created: Infrastructure
     * Storage server connectors Storage servers Storage grids
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateExternalExadataInfrastructureResponse>
            createExternalExadataInfrastructure(
                    CreateExternalExadataInfrastructureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalExadataInfrastructureRequest,
                                    CreateExternalExadataInfrastructureResponse>
                            handler);

    /**
     * Creates the Exadata storage server connector after validating the connection information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateExternalExadataStorageConnectorResponse>
            createExternalExadataStorageConnector(
                    CreateExternalExadataStorageConnectorRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalExadataStorageConnectorRequest,
                                    CreateExternalExadataStorageConnectorResponse>
                            handler);

    /**
     * Creates an external MySQL database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateExternalMySqlDatabaseResponse> createExternalMySqlDatabase(
            CreateExternalMySqlDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateExternalMySqlDatabaseRequest, CreateExternalMySqlDatabaseResponse>
                    handler);

    /**
     * Creates an external MySQL connector resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateExternalMySqlDatabaseConnectorResponse>
            createExternalMySqlDatabaseConnector(
                    CreateExternalMySqlDatabaseConnectorRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalMySqlDatabaseConnectorRequest,
                                    CreateExternalMySqlDatabaseConnectorResponse>
                            handler);

    /**
     * Creates a job to be executed on a Managed Database or Managed Database Group. Only one of the
     * parameters, managedDatabaseId or managedDatabaseGroupId should be provided as input in
     * CreateJobDetails resource in request body.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateJobResponse> createJob(
            CreateJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateJobRequest, CreateJobResponse> handler);

    /**
     * Creates a Managed Database Group. The group does not contain any Managed Databases when it is
     * created, and they must be added later.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateManagedDatabaseGroupResponse> createManagedDatabaseGroup(
            CreateManagedDatabaseGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateManagedDatabaseGroupRequest, CreateManagedDatabaseGroupResponse>
                    handler);

    /**
     * Creates a named credential.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateNamedCredentialResponse> createNamedCredential(
            CreateNamedCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateNamedCredentialRequest, CreateNamedCredentialResponse>
                    handler);

    /**
     * Creates a tablespace within the Managed Database specified by managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateTablespaceResponse> createTablespace(
            CreateTablespaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateTablespaceRequest, CreateTablespaceResponse>
                    handler);

    /**
     * Deletes a specific Database Management private endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDbManagementPrivateEndpointResponse>
            deleteDbManagementPrivateEndpoint(
                    DeleteDbManagementPrivateEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDbManagementPrivateEndpointRequest,
                                    DeleteDbManagementPrivateEndpointResponse>
                            handler);

    /**
     * Deletes the external DB system specified by `externalDbSystemId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteExternalDbSystemResponse> deleteExternalDbSystem(
            DeleteExternalDbSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteExternalDbSystemRequest, DeleteExternalDbSystemResponse>
                    handler);

    /**
     * Deletes the external connector specified by `externalDbSystemConnectorId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteExternalDbSystemConnectorResponse>
            deleteExternalDbSystemConnector(
                    DeleteExternalDbSystemConnectorRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalDbSystemConnectorRequest,
                                    DeleteExternalDbSystemConnectorResponse>
                            handler);

    /**
     * Deletes the external DB system discovery resource specified by `externalDbSystemDiscoveryId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteExternalDbSystemDiscoveryResponse>
            deleteExternalDbSystemDiscovery(
                    DeleteExternalDbSystemDiscoveryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalDbSystemDiscoveryRequest,
                                    DeleteExternalDbSystemDiscoveryResponse>
                            handler);

    /**
     * Deletes the Exadata infrastructure specified by externalExadataInfrastructureId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteExternalExadataInfrastructureResponse>
            deleteExternalExadataInfrastructure(
                    DeleteExternalExadataInfrastructureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalExadataInfrastructureRequest,
                                    DeleteExternalExadataInfrastructureResponse>
                            handler);

    /**
     * Deletes the Exadata storage server connector specified by exadataStorageConnectorId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteExternalExadataStorageConnectorResponse>
            deleteExternalExadataStorageConnector(
                    DeleteExternalExadataStorageConnectorRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalExadataStorageConnectorRequest,
                                    DeleteExternalExadataStorageConnectorResponse>
                            handler);

    /**
     * Deletes the Oracle Cloud Infrastructure resource representing an external MySQL database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteExternalMySqlDatabaseResponse> deleteExternalMySqlDatabase(
            DeleteExternalMySqlDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteExternalMySqlDatabaseRequest, DeleteExternalMySqlDatabaseResponse>
                    handler);

    /**
     * Deletes the Oracle Cloud Infrastructure resource representing an external MySQL database
     * connector.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteExternalMySqlDatabaseConnectorResponse>
            deleteExternalMySqlDatabaseConnector(
                    DeleteExternalMySqlDatabaseConnectorRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalMySqlDatabaseConnectorRequest,
                                    DeleteExternalMySqlDatabaseConnectorResponse>
                            handler);

    /**
     * Deletes the job specified by jobId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteJobResponse> deleteJob(
            DeleteJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteJobRequest, DeleteJobResponse> handler);

    /**
     * Deletes the Managed Database Group specified by managedDatabaseGroupId. If the group contains
     * Managed Databases, then it cannot be deleted.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteManagedDatabaseGroupResponse> deleteManagedDatabaseGroup(
            DeleteManagedDatabaseGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteManagedDatabaseGroupRequest, DeleteManagedDatabaseGroupResponse>
                    handler);

    /**
     * Deletes the named credential specified by namedCredentialId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteNamedCredentialResponse> deleteNamedCredential(
            DeleteNamedCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteNamedCredentialRequest, DeleteNamedCredentialResponse>
                    handler);

    /**
     * Deletes the preferred credential based on the credentialName.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeletePreferredCredentialResponse> deletePreferredCredential(
            DeletePreferredCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeletePreferredCredentialRequest, DeletePreferredCredentialResponse>
                    handler);

    /**
     * Disables automatic initial plan capture.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableAutomaticInitialPlanCaptureResponse>
            disableAutomaticInitialPlanCapture(
                    DisableAutomaticInitialPlanCaptureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableAutomaticInitialPlanCaptureRequest,
                                    DisableAutomaticInitialPlanCaptureResponse>
                            handler);

    /**
     * Disables the Automatic SPM Evolve Advisor task.
     *
     * <p>One client controls both Automatic SQL Tuning Advisor and Automatic SPM Evolve Advisor.
     * Thus, the same task enables or disables both.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableAutomaticSpmEvolveAdvisorTaskResponse>
            disableAutomaticSpmEvolveAdvisorTask(
                    DisableAutomaticSpmEvolveAdvisorTaskRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableAutomaticSpmEvolveAdvisorTaskRequest,
                                    DisableAutomaticSpmEvolveAdvisorTaskResponse>
                            handler);

    /**
     * Disables a Database Management feature for the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableAutonomousDatabaseManagementFeatureResponse>
            disableAutonomousDatabaseManagementFeature(
                    DisableAutonomousDatabaseManagementFeatureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableAutonomousDatabaseManagementFeatureRequest,
                                    DisableAutonomousDatabaseManagementFeatureResponse>
                            handler);

    /**
     * Disables a Database Management feature for the specified Oracle cloud database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableDatabaseManagementFeatureResponse>
            disableDatabaseManagementFeature(
                    DisableDatabaseManagementFeatureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableDatabaseManagementFeatureRequest,
                                    DisableDatabaseManagementFeatureResponse>
                            handler);

    /**
     * Disables a Database Management feature for the specified external container database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableExternalContainerDatabaseManagementFeatureResponse>
            disableExternalContainerDatabaseManagementFeature(
                    DisableExternalContainerDatabaseManagementFeatureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalContainerDatabaseManagementFeatureRequest,
                                    DisableExternalContainerDatabaseManagementFeatureResponse>
                            handler);

    /**
     * Disables Database Management service for all the components of the specified external DB
     * system (except databases).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableExternalDbSystemDatabaseManagementResponse>
            disableExternalDbSystemDatabaseManagement(
                    DisableExternalDbSystemDatabaseManagementRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalDbSystemDatabaseManagementRequest,
                                    DisableExternalDbSystemDatabaseManagementResponse>
                            handler);

    /**
     * Disables Stack Monitoring for all the components of the specified external DB system (except
     * databases).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableExternalDbSystemStackMonitoringResponse>
            disableExternalDbSystemStackMonitoring(
                    DisableExternalDbSystemStackMonitoringRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalDbSystemStackMonitoringRequest,
                                    DisableExternalDbSystemStackMonitoringResponse>
                            handler);

    /**
     * Disables Database Management for the Exadata infrastructure specified by
     * externalExadataInfrastructureId. It covers the following components:
     *
     * <p>- Exadata infrastructure - Exadata storage grid - Exadata storage server
     *
     * <p>Note that Database Management will not be disabled for the DB systems within the Exadata
     * infrastructure and should be disabled explicitly, if required.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableExternalExadataInfrastructureManagementResponse>
            disableExternalExadataInfrastructureManagement(
                    DisableExternalExadataInfrastructureManagementRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalExadataInfrastructureManagementRequest,
                                    DisableExternalExadataInfrastructureManagementResponse>
                            handler);

    /**
     * Disables Database Management for an external MySQL Database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableExternalMySqlDatabaseManagementResponse>
            disableExternalMySqlDatabaseManagement(
                    DisableExternalMySqlDatabaseManagementRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalMySqlDatabaseManagementRequest,
                                    DisableExternalMySqlDatabaseManagementResponse>
                            handler);

    /**
     * Disables a Database Management feature for the specified external non-container database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableExternalNonContainerDatabaseManagementFeatureResponse>
            disableExternalNonContainerDatabaseManagementFeature(
                    DisableExternalNonContainerDatabaseManagementFeatureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalNonContainerDatabaseManagementFeatureRequest,
                                    DisableExternalNonContainerDatabaseManagementFeatureResponse>
                            handler);

    /**
     * Disables a Database Management feature for the specified external pluggable database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableExternalPluggableDatabaseManagementFeatureResponse>
            disableExternalPluggableDatabaseManagementFeature(
                    DisableExternalPluggableDatabaseManagementFeatureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalPluggableDatabaseManagementFeatureRequest,
                                    DisableExternalPluggableDatabaseManagementFeatureResponse>
                            handler);

    /**
     * Disables the high-frequency Automatic SPM Evolve Advisor task.
     *
     * <p>It is available only on Oracle Exadata Database Machine, Oracle Database Exadata Cloud
     * Service (ExaCS) and Oracle Database Exadata Cloud@Customer (ExaCC).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse>
            disableHighFrequencyAutomaticSpmEvolveAdvisorTask(
                    DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest,
                                    DisableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse>
                            handler);

    /**
     * Disables a Database Management feature for the specified Oracle cloud pluggable database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisablePluggableDatabaseManagementFeatureResponse>
            disablePluggableDatabaseManagementFeature(
                    DisablePluggableDatabaseManagementFeatureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisablePluggableDatabaseManagementFeatureRequest,
                                    DisablePluggableDatabaseManagementFeatureResponse>
                            handler);

    /**
     * Disables the use of SQL plan baselines stored in SQL Management Base.
     *
     * <p>When disabled, the optimizer does not use any SQL plan baselines.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableSqlPlanBaselinesUsageResponse> disableSqlPlanBaselinesUsage(
            DisableSqlPlanBaselinesUsageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DisableSqlPlanBaselinesUsageRequest,
                            DisableSqlPlanBaselinesUsageResponse>
                    handler);

    /**
     * Completes the Exadata system prechecking on the following:
     *
     * <p>- Verifies if the DB systems are valid RAC DB systems or return 400 status code with
     * NON_RAC_DATABASE_SYSTEM error code. - Verifies if the ASM connector defined for each DB
     * system or return 400 status code with CONNECTOR_NOT_DEFINED error code. - Verifies if the
     * agents associated with ASM are valid and could be used for the Exadata storage servers or
     * return 400 status code with INVALID_AGENT error code. - Verifies if it is an Exadata system
     * or return 400 status code with INVALID_EXADATA_SYSTEM error code.
     *
     * <p>Starts the discovery process for the Exadata system infrastructure. The following
     * resources/components are discovered
     *
     * <p>- Exadata storage servers from each DB systems - Exadata storage grid for all Exadata
     * storage servers - Exadata infrastructure
     *
     * <p>The same API covers both new discovery and rediscovery cases. For the new discovery case,
     * new managed resources/sub-resources are created or the existing ones are overridden. For
     * rediscovery case, the existing managed resources/sub-resources are checked to find out which
     * ones should be added or which ones should be removed based on the unique key defined for each
     * resource/sub-resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DiscoverExternalExadataInfrastructureResponse>
            discoverExternalExadataInfrastructure(
                    DiscoverExternalExadataInfrastructureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DiscoverExternalExadataInfrastructureRequest,
                                    DiscoverExternalExadataInfrastructureResponse>
                            handler);

    /**
     * Drops a single plan or all plans associated with a SQL statement.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DropSqlPlanBaselinesResponse> dropSqlPlanBaselines(
            DropSqlPlanBaselinesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DropSqlPlanBaselinesRequest, DropSqlPlanBaselinesResponse>
                    handler);

    /**
     * Drops the tablespace specified by tablespaceName within the Managed Database specified by
     * managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DropTablespaceResponse> dropTablespace(
            DropTablespaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<DropTablespaceRequest, DropTablespaceResponse>
                    handler);

    /**
     * Enables automatic initial plan capture. When enabled, the database checks whether executed
     * SQL statements are eligible for automatic capture. It creates initial plan baselines for
     * eligible statements.
     *
     * <p>By default, the database creates a SQL plan baseline for every eligible repeatable
     * statement, including all recursive SQL and monitoring SQL. Thus, automatic capture may result
     * in the creation of an extremely large number of plan baselines. To limit the statements that
     * are eligible for plan baselines, configure filters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableAutomaticInitialPlanCaptureResponse>
            enableAutomaticInitialPlanCapture(
                    EnableAutomaticInitialPlanCaptureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableAutomaticInitialPlanCaptureRequest,
                                    EnableAutomaticInitialPlanCaptureResponse>
                            handler);

    /**
     * Enables the Automatic SPM Evolve Advisor task. By default, the automatic task
     * `SYS_AUTO_SPM_EVOLVE_TASK` runs every day in the scheduled maintenance window.
     *
     * <p>The SPM Evolve Advisor performs the following tasks:
     *
     * <p>- Checks AWR for top SQL - Looks for alternative plans in all available sources - Adds
     * unaccepted plans to the plan history - Tests the execution of as many plans as possible
     * during the maintenance window - Adds the alternative plan to the baseline if it performs
     * better than the current plan
     *
     * <p>One client controls both Automatic SQL Tuning Advisor and Automatic SPM Evolve Advisor.
     * Thus, the same task enables or disables both.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableAutomaticSpmEvolveAdvisorTaskResponse>
            enableAutomaticSpmEvolveAdvisorTask(
                    EnableAutomaticSpmEvolveAdvisorTaskRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableAutomaticSpmEvolveAdvisorTaskRequest,
                                    EnableAutomaticSpmEvolveAdvisorTaskResponse>
                            handler);

    /**
     * Enables a Database Management feature for the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableAutonomousDatabaseManagementFeatureResponse>
            enableAutonomousDatabaseManagementFeature(
                    EnableAutonomousDatabaseManagementFeatureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableAutonomousDatabaseManagementFeatureRequest,
                                    EnableAutonomousDatabaseManagementFeatureResponse>
                            handler);

    /**
     * Enables a Database Management feature for the specified cloud database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableDatabaseManagementFeatureResponse>
            enableDatabaseManagementFeature(
                    EnableDatabaseManagementFeatureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableDatabaseManagementFeatureRequest,
                                    EnableDatabaseManagementFeatureResponse>
                            handler);

    /**
     * Enables a Database Management feature for the specified external container database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableExternalContainerDatabaseManagementFeatureResponse>
            enableExternalContainerDatabaseManagementFeature(
                    EnableExternalContainerDatabaseManagementFeatureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalContainerDatabaseManagementFeatureRequest,
                                    EnableExternalContainerDatabaseManagementFeatureResponse>
                            handler);

    /**
     * Enables Database Management service for all the components of the specified external DB
     * system (except databases).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableExternalDbSystemDatabaseManagementResponse>
            enableExternalDbSystemDatabaseManagement(
                    EnableExternalDbSystemDatabaseManagementRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalDbSystemDatabaseManagementRequest,
                                    EnableExternalDbSystemDatabaseManagementResponse>
                            handler);

    /**
     * Enables Stack Monitoring for all the components of the specified external DB system (except
     * databases).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableExternalDbSystemStackMonitoringResponse>
            enableExternalDbSystemStackMonitoring(
                    EnableExternalDbSystemStackMonitoringRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalDbSystemStackMonitoringRequest,
                                    EnableExternalDbSystemStackMonitoringResponse>
                            handler);

    /**
     * Enables Database Management for the Exadata infrastructure specified by
     * externalExadataInfrastructureId. It covers the following components:
     *
     * <p>- Exadata infrastructure - Exadata storage grid - Exadata storage server
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableExternalExadataInfrastructureManagementResponse>
            enableExternalExadataInfrastructureManagement(
                    EnableExternalExadataInfrastructureManagementRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalExadataInfrastructureManagementRequest,
                                    EnableExternalExadataInfrastructureManagementResponse>
                            handler);

    /**
     * Enables Database Management for an external MySQL Database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableExternalMySqlDatabaseManagementResponse>
            enableExternalMySqlDatabaseManagement(
                    EnableExternalMySqlDatabaseManagementRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalMySqlDatabaseManagementRequest,
                                    EnableExternalMySqlDatabaseManagementResponse>
                            handler);

    /**
     * Enables Database Management feature for the specified external non-container database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableExternalNonContainerDatabaseManagementFeatureResponse>
            enableExternalNonContainerDatabaseManagementFeature(
                    EnableExternalNonContainerDatabaseManagementFeatureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalNonContainerDatabaseManagementFeatureRequest,
                                    EnableExternalNonContainerDatabaseManagementFeatureResponse>
                            handler);

    /**
     * Enables a Database Management feature for the specified external pluggable database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableExternalPluggableDatabaseManagementFeatureResponse>
            enableExternalPluggableDatabaseManagementFeature(
                    EnableExternalPluggableDatabaseManagementFeatureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalPluggableDatabaseManagementFeatureRequest,
                                    EnableExternalPluggableDatabaseManagementFeatureResponse>
                            handler);

    /**
     * Enables the high-frequency Automatic SPM Evolve Advisor task. The high-frequency task runs
     * every hour and runs for no longer than 30 minutes. These settings are not configurable.
     *
     * <p>The high-frequency task complements the standard Automatic SPM Evolve Advisor task. They
     * are independent and are scheduled through two different frameworks.
     *
     * <p>It is available only on Oracle Exadata Database Machine, Oracle Database Exadata Cloud
     * Service (ExaCS) and Oracle Database Exadata Cloud@Customer (ExaCC).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse>
            enableHighFrequencyAutomaticSpmEvolveAdvisorTask(
                    EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskRequest,
                                    EnableHighFrequencyAutomaticSpmEvolveAdvisorTaskResponse>
                            handler);

    /**
     * Enables a Database Management feature for the specified Oracle cloud pluggable database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnablePluggableDatabaseManagementFeatureResponse>
            enablePluggableDatabaseManagementFeature(
                    EnablePluggableDatabaseManagementFeatureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnablePluggableDatabaseManagementFeatureRequest,
                                    EnablePluggableDatabaseManagementFeatureResponse>
                            handler);

    /**
     * Enables the use of SQL plan baselines stored in SQL Management Base.
     *
     * <p>When enabled, the optimizer uses SQL plan baselines to select plans to avoid potential
     * performance regressions.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableSqlPlanBaselinesUsageResponse> enableSqlPlanBaselinesUsage(
            EnableSqlPlanBaselinesUsageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            EnableSqlPlanBaselinesUsageRequest, EnableSqlPlanBaselinesUsageResponse>
                    handler);

    /**
     * Creates an AWR snapshot for the target database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GenerateAwrSnapshotResponse> generateAwrSnapshot(
            GenerateAwrSnapshotRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GenerateAwrSnapshotRequest, GenerateAwrSnapshotResponse>
                    handler);

    /**
     * Gets the AWR report for the specific database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAwrDbReportResponse> getAwrDbReport(
            GetAwrDbReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAwrDbReportRequest, GetAwrDbReportResponse>
                    handler);

    /**
     * Gets the SQL health check report for one SQL of the specific database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAwrDbSqlReportResponse> getAwrDbSqlReport(
            GetAwrDbSqlReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAwrDbSqlReportRequest, GetAwrDbSqlReportResponse>
                    handler);

    /**
     * Gets the metrics related to cluster cache for the Oracle Real Application Clusters (Oracle
     * RAC) database specified by managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetClusterCacheMetricResponse> getClusterCacheMetric(
            GetClusterCacheMetricRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetClusterCacheMetricRequest, GetClusterCacheMetricResponse>
                    handler);

    /**
     * Gets the fleet of container databases (CDBs) and their backup details and metrics, in a
     * compartment or Database Group. The databaseHostedIn query parameter must be provided to list
     * either cloud or external databases. Either the CompartmentId or the ManagedDatabaseGroupId
     * query parameters must be provided to retrieve the HA and backup metrics.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseFleetBackupMetricsResponse>
            getDatabaseFleetBackupMetrics(
                    GetDatabaseFleetBackupMetricsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseFleetBackupMetricsRequest,
                                    GetDatabaseFleetBackupMetricsResponse>
                            handler);

    /**
     * Gets the fleet of Oracle Data Guard-enabled container databases (CDBs) along with Data Guard
     * metrics and standby databases, in a compartment or Database Group. Either the CompartmentId
     * or the ManagedDatabaseGroupId query parameters must be provided to retrieve the list of
     * databases and Data Guard metrics.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseFleetDataguardMetricsResponse>
            getDatabaseFleetDataguardMetrics(
                    GetDatabaseFleetDataguardMetricsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseFleetDataguardMetricsRequest,
                                    GetDatabaseFleetDataguardMetricsResponse>
                            handler);

    /**
     * Gets the fleet of container databases (CDBs) and their HA and backup metrics in a compartment
     * or in a Database Group. Either the CompartmentId or the ManagedDatabaseGroupId query
     * parameters must be provided to retrieve the HA and backup metrics.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseFleetHaOverviewMetricsResponse>
            getDatabaseFleetHaOverviewMetrics(
                    GetDatabaseFleetHaOverviewMetricsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseFleetHaOverviewMetricsRequest,
                                    GetDatabaseFleetHaOverviewMetricsResponse>
                            handler);

    /**
     * Gets the health metrics for a fleet of databases in a compartment or in a Managed Database
     * Group. Either the CompartmentId or the ManagedDatabaseGroupId query parameters must be
     * provided to retrieve the health metrics.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseFleetHealthMetricsResponse>
            getDatabaseFleetHealthMetrics(
                    GetDatabaseFleetHealthMetricsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseFleetHealthMetricsRequest,
                                    GetDatabaseFleetHealthMetricsResponse>
                            handler);

    /**
     * Gets HA and backup details with metrics and backup history for a single database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseHaBackupDetailsResponse> getDatabaseHaBackupDetails(
            GetDatabaseHaBackupDetailsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseHaBackupDetailsRequest, GetDatabaseHaBackupDetailsResponse>
                    handler);

    /**
     * Gets a summary of the activity and resource usage metrics like DB Time, CPU, User I/O, Wait,
     * Storage, and Memory for a Managed Database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseHomeMetricsResponse> getDatabaseHomeMetrics(
            GetDatabaseHomeMetricsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseHomeMetricsRequest, GetDatabaseHomeMetricsResponse>
                    handler);

    /**
     * Gets a historical summary of the Database Guard performance metrics for Managed Databases. If
     * the peerDatabaseCompartmentId is specified, then the metrics are only retrieved from the
     * specified compartment. If the peerDatabaseCompartmentId is not specified, then the metrics
     * are retrieved from the compartment of the Managed Database specified by the
     * ManagedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDataguardPerformanceMetricsResponse>
            getDataguardPerformanceMetrics(
                    GetDataguardPerformanceMetricsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDataguardPerformanceMetricsRequest,
                                    GetDataguardPerformanceMetricsResponse>
                            handler);

    /**
     * Gets the details of a specific Database Management private endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDbManagementPrivateEndpointResponse>
            getDbManagementPrivateEndpoint(
                    GetDbManagementPrivateEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDbManagementPrivateEndpointRequest,
                                    GetDbManagementPrivateEndpointResponse>
                            handler);

    /**
     * Gets the details for the external ASM specified by `externalAsmId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExternalAsmResponse> getExternalAsm(
            GetExternalAsmRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetExternalAsmRequest, GetExternalAsmResponse>
                    handler);

    /**
     * Gets configuration details including disk groups for the external ASM specified by
     * `externalAsmId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExternalAsmConfigurationResponse> getExternalAsmConfiguration(
            GetExternalAsmConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExternalAsmConfigurationRequest, GetExternalAsmConfigurationResponse>
                    handler);

    /**
     * Gets the details for the external ASM instance specified by `externalAsmInstanceId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExternalAsmInstanceResponse> getExternalAsmInstance(
            GetExternalAsmInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExternalAsmInstanceRequest, GetExternalAsmInstanceResponse>
                    handler);

    /**
     * Gets the details for the external cluster specified by `externalClusterId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExternalClusterResponse> getExternalCluster(
            GetExternalClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExternalClusterRequest, GetExternalClusterResponse>
                    handler);

    /**
     * Gets the details for the external cluster instance specified by `externalClusterInstanceId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExternalClusterInstanceResponse> getExternalClusterInstance(
            GetExternalClusterInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExternalClusterInstanceRequest, GetExternalClusterInstanceResponse>
                    handler);

    /**
     * Gets the details for the external DB home specified by `externalDbHomeId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExternalDbHomeResponse> getExternalDbHome(
            GetExternalDbHomeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExternalDbHomeRequest, GetExternalDbHomeResponse>
                    handler);

    /**
     * Gets the details for the external DB node specified by `externalDbNodeId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExternalDbNodeResponse> getExternalDbNode(
            GetExternalDbNodeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExternalDbNodeRequest, GetExternalDbNodeResponse>
                    handler);

    /**
     * Gets the details for the external DB system specified by `externalDbSystemId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExternalDbSystemResponse> getExternalDbSystem(
            GetExternalDbSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExternalDbSystemRequest, GetExternalDbSystemResponse>
                    handler);

    /**
     * Gets the details for the external connector specified by `externalDbSystemConnectorId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExternalDbSystemConnectorResponse> getExternalDbSystemConnector(
            GetExternalDbSystemConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExternalDbSystemConnectorRequest,
                            GetExternalDbSystemConnectorResponse>
                    handler);

    /**
     * Gets the details for the external DB system discovery resource specified by
     * `externalDbSystemDiscoveryId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExternalDbSystemDiscoveryResponse> getExternalDbSystemDiscovery(
            GetExternalDbSystemDiscoveryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExternalDbSystemDiscoveryRequest,
                            GetExternalDbSystemDiscoveryResponse>
                    handler);

    /**
     * Gets the details for the Exadata infrastructure specified by externalExadataInfrastructureId.
     * It includes the DB systems and storage grid within the Exadata infrastructure.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExternalExadataInfrastructureResponse>
            getExternalExadataInfrastructure(
                    GetExternalExadataInfrastructureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalExadataInfrastructureRequest,
                                    GetExternalExadataInfrastructureResponse>
                            handler);

    /**
     * Gets the details for the Exadata storage server connector specified by
     * exadataStorageConnectorId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExternalExadataStorageConnectorResponse>
            getExternalExadataStorageConnector(
                    GetExternalExadataStorageConnectorRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalExadataStorageConnectorRequest,
                                    GetExternalExadataStorageConnectorResponse>
                            handler);

    /**
     * Gets the details for the Exadata storage server grid specified by exadataStorageGridId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExternalExadataStorageGridResponse>
            getExternalExadataStorageGrid(
                    GetExternalExadataStorageGridRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalExadataStorageGridRequest,
                                    GetExternalExadataStorageGridResponse>
                            handler);

    /**
     * Gets the summary for the Exadata storage server specified by exadataStorageServerId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExternalExadataStorageServerResponse>
            getExternalExadataStorageServer(
                    GetExternalExadataStorageServerRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalExadataStorageServerRequest,
                                    GetExternalExadataStorageServerResponse>
                            handler);

    /**
     * Gets the details for the external listener specified by `externalListenerId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExternalListenerResponse> getExternalListener(
            GetExternalListenerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExternalListenerRequest, GetExternalListenerResponse>
                    handler);

    /**
     * Retrieves the external MySQL database information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExternalMySqlDatabaseResponse> getExternalMySqlDatabase(
            GetExternalMySqlDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExternalMySqlDatabaseRequest, GetExternalMySqlDatabaseResponse>
                    handler);

    /**
     * Retrieves the MySQL database connector.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExternalMySqlDatabaseConnectorResponse>
            getExternalMySqlDatabaseConnector(
                    GetExternalMySqlDatabaseConnectorRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalMySqlDatabaseConnectorRequest,
                                    GetExternalMySqlDatabaseConnectorResponse>
                            handler);

    /**
     * Get the IORM plan from the specific Exadata storage server.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetIormPlanResponse> getIormPlan(
            GetIormPlanRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetIormPlanRequest, GetIormPlanResponse> handler);

    /**
     * Gets the details for the job specified by jobId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetJobResponse> getJob(
            GetJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJobRequest, GetJobResponse> handler);

    /**
     * Gets the details for the job execution specified by jobExecutionId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetJobExecutionResponse> getJobExecution(
            GetJobExecutionRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJobExecutionRequest, GetJobExecutionResponse>
                    handler);

    /**
     * Gets the details for the job run specified by jobRunId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetJobRunResponse> getJobRun(
            GetJobRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJobRunRequest, GetJobRunResponse> handler);

    /**
     * Gets the details for the Managed Database specified by managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetManagedDatabaseResponse> getManagedDatabase(
            GetManagedDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetManagedDatabaseRequest, GetManagedDatabaseResponse>
                    handler);

    /**
     * Gets the details for the Managed Database Group specified by managedDatabaseGroupId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetManagedDatabaseGroupResponse> getManagedDatabaseGroup(
            GetManagedDatabaseGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetManagedDatabaseGroupRequest, GetManagedDatabaseGroupResponse>
                    handler);

    /**
     * Gets the details for the named credential specified by namedCredentialId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetNamedCredentialResponse> getNamedCredential(
            GetNamedCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetNamedCredentialRequest, GetNamedCredentialResponse>
                    handler);

    /**
     * Gets the open alerts from the specified Exadata storage server.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOpenAlertHistoryResponse> getOpenAlertHistory(
            GetOpenAlertHistoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetOpenAlertHistoryRequest, GetOpenAlertHistoryResponse>
                    handler);

    /**
     * Gets a comprehensive report of the Optimizer Statistics Advisor execution, which includes
     * details of the Managed Database, findings, recommendations, rationale, and examples.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOptimizerStatisticsAdvisorExecutionResponse>
            getOptimizerStatisticsAdvisorExecution(
                    GetOptimizerStatisticsAdvisorExecutionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetOptimizerStatisticsAdvisorExecutionRequest,
                                    GetOptimizerStatisticsAdvisorExecutionResponse>
                            handler);

    /**
     * Gets the Oracle system-generated script for the specified Optimizer Statistics Advisor
     * execution.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOptimizerStatisticsAdvisorExecutionScriptResponse>
            getOptimizerStatisticsAdvisorExecutionScript(
                    GetOptimizerStatisticsAdvisorExecutionScriptRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetOptimizerStatisticsAdvisorExecutionScriptRequest,
                                    GetOptimizerStatisticsAdvisorExecutionScriptResponse>
                            handler);

    /**
     * Gets a detailed report of the Optimizer Statistics Collection operation for the specified
     * Managed Database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOptimizerStatisticsCollectionOperationResponse>
            getOptimizerStatisticsCollectionOperation(
                    GetOptimizerStatisticsCollectionOperationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetOptimizerStatisticsCollectionOperationRequest,
                                    GetOptimizerStatisticsCollectionOperationResponse>
                            handler);

    /**
     * Gets a summary of the resource usage metrics such as CPU, User I/O, and Storage for each PDB
     * within a specific CDB. If comparmentId is specified, then the metrics for each PDB (within
     * the CDB) in the specified compartment are retrieved. If compartmentId is not specified, then
     * the metrics for all the PDBs within the CDB are retrieved.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPdbMetricsResponse> getPdbMetrics(
            GetPdbMetricsRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPdbMetricsRequest, GetPdbMetricsResponse>
                    handler);

    /**
     * Gets a comparative summary of the baseline and target values of the Data Guard performance
     * metrics for Managed Databases. If the peerDatabaseCompartmentId is specified, then the
     * metrics are only retrieved from the specified compartment. If the peerDatabaseCompartmentId
     * is not specified, then the metrics are retrieved from the compartment of the Managed Database
     * specified by the ManagedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPeerDatabaseMetricsResponse> getPeerDatabaseMetrics(
            GetPeerDatabaseMetricsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPeerDatabaseMetricsRequest, GetPeerDatabaseMetricsResponse>
                    handler);

    /**
     * Gets the preferred credential details for a Managed Database based on credentialName.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPreferredCredentialResponse> getPreferredCredential(
            GetPreferredCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPreferredCredentialRequest, GetPreferredCredentialResponse>
                    handler);

    /**
     * Gets the SQL plan baseline details for the specified planName.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSqlPlanBaselineResponse> getSqlPlanBaseline(
            GetSqlPlanBaselineRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSqlPlanBaselineRequest, GetSqlPlanBaselineResponse>
                    handler);

    /**
     * Gets the configuration details of SQL plan baselines for the specified Managed Database. The
     * details include the settings for the capture and use of SQL plan baselines, SPM Evolve
     * Advisor task, and SQL Management Base.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSqlPlanBaselineConfigurationResponse>
            getSqlPlanBaselineConfiguration(
                    GetSqlPlanBaselineConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetSqlPlanBaselineConfigurationRequest,
                                    GetSqlPlanBaselineConfigurationResponse>
                            handler);

    /**
     * Gets the details of the tablespace specified by tablespaceName within the Managed Database
     * specified by managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTablespaceResponse> getTablespace(
            GetTablespaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTablespaceRequest, GetTablespaceResponse>
                    handler);

    /**
     * Gets the SQL IDs with the top CPU activity from the Exadata storage server.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTopSqlCpuActivityResponse> getTopSqlCpuActivity(
            GetTopSqlCpuActivityRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetTopSqlCpuActivityRequest, GetTopSqlCpuActivityResponse>
                    handler);

    /**
     * Gets the details of the user specified by managedDatabaseId and userName.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetUserResponse> getUser(
            GetUserRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetUserRequest, GetUserResponse> handler);

    /**
     * Gets the status of the work request with the given Work Request ID
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Asynchronously implements the findings and recommendations of the Optimizer Statistics
     * Advisor execution.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ImplementOptimizerStatisticsAdvisorRecommendationsResponse>
            implementOptimizerStatisticsAdvisorRecommendations(
                    ImplementOptimizerStatisticsAdvisorRecommendationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ImplementOptimizerStatisticsAdvisorRecommendationsRequest,
                                    ImplementOptimizerStatisticsAdvisorRecommendationsResponse>
                            handler);

    /**
     * Gets the list of ASM properties for the specified managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAsmPropertiesResponse> listAsmProperties(
            ListAsmPropertiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAsmPropertiesRequest, ListAsmPropertiesResponse>
                    handler);

    /**
     * Gets the list of databases using a specific Database Management private endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAssociatedDatabasesResponse> listAssociatedDatabases(
            ListAssociatedDatabasesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAssociatedDatabasesRequest, ListAssociatedDatabasesResponse>
                    handler);

    /**
     * Lists AWR snapshots for the specified database in the AWR.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAwrDbSnapshotsResponse> listAwrDbSnapshots(
            ListAwrDbSnapshotsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAwrDbSnapshotsRequest, ListAwrDbSnapshotsResponse>
                    handler);

    /**
     * Gets the list of databases and their snapshot summary details available in the AWR of the
     * specified Managed Database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAwrDbsResponse> listAwrDbs(
            ListAwrDbsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAwrDbsRequest, ListAwrDbsResponse> handler);

    /**
     * Gets the list of consumer group privileges granted to a specific user.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListConsumerGroupPrivilegesResponse> listConsumerGroupPrivileges(
            ListConsumerGroupPrivilegesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListConsumerGroupPrivilegesRequest, ListConsumerGroupPrivilegesResponse>
                    handler);

    /**
     * Lists the SQL statements from shared SQL area, also called the cursor cache.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCursorCacheStatementsResponse> listCursorCacheStatements(
            ListCursorCacheStatementsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCursorCacheStatementsRequest, ListCursorCacheStatementsResponse>
                    handler);

    /**
     * Gets the list of containers for a specific user. This is only applicable if ALL_CONTAINERS
     * !='Y'.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDataAccessContainersResponse> listDataAccessContainers(
            ListDataAccessContainersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDataAccessContainersRequest, ListDataAccessContainersResponse>
                    handler);

    /**
     * Gets the list of database parameters for the specified Managed Database. The parameters are
     * listed in alphabetical order, along with their current values.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDatabaseParametersResponse> listDatabaseParameters(
            ListDatabaseParametersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDatabaseParametersRequest, ListDatabaseParametersResponse>
                    handler);

    /**
     * Gets a list of Database Management private endpoints.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDbManagementPrivateEndpointsResponse>
            listDbManagementPrivateEndpoints(
                    ListDbManagementPrivateEndpointsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDbManagementPrivateEndpointsRequest,
                                    ListDbManagementPrivateEndpointsResponse>
                            handler);

    /**
     * Lists ASM disk groups for the external ASM specified by `externalAsmId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListExternalAsmDiskGroupsResponse> listExternalAsmDiskGroups(
            ListExternalAsmDiskGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListExternalAsmDiskGroupsRequest, ListExternalAsmDiskGroupsResponse>
                    handler);

    /**
     * Lists the ASM instances in the specified external ASM.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListExternalAsmInstancesResponse> listExternalAsmInstances(
            ListExternalAsmInstancesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListExternalAsmInstancesRequest, ListExternalAsmInstancesResponse>
                    handler);

    /**
     * Lists ASM users for the external ASM specified by `externalAsmId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListExternalAsmUsersResponse> listExternalAsmUsers(
            ListExternalAsmUsersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListExternalAsmUsersRequest, ListExternalAsmUsersResponse>
                    handler);

    /**
     * Lists the ASMs in the specified external DB system.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListExternalAsmsResponse> listExternalAsms(
            ListExternalAsmsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListExternalAsmsRequest, ListExternalAsmsResponse>
                    handler);

    /**
     * Lists the cluster instances in the specified external cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListExternalClusterInstancesResponse> listExternalClusterInstances(
            ListExternalClusterInstancesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListExternalClusterInstancesRequest,
                            ListExternalClusterInstancesResponse>
                    handler);

    /**
     * Lists the clusters in the specified external DB system.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListExternalClustersResponse> listExternalClusters(
            ListExternalClustersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListExternalClustersRequest, ListExternalClustersResponse>
                    handler);

    /**
     * Lists the external databases in the specified compartment or in the specified DB system.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListExternalDatabasesResponse> listExternalDatabases(
            ListExternalDatabasesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListExternalDatabasesRequest, ListExternalDatabasesResponse>
                    handler);

    /**
     * Lists the DB homes in the specified external DB system.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListExternalDbHomesResponse> listExternalDbHomes(
            ListExternalDbHomesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListExternalDbHomesRequest, ListExternalDbHomesResponse>
                    handler);

    /**
     * Lists the external DB nodes in the specified external DB system.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListExternalDbNodesResponse> listExternalDbNodes(
            ListExternalDbNodesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListExternalDbNodesRequest, ListExternalDbNodesResponse>
                    handler);

    /**
     * Lists the external connectors in the specified external DB system.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListExternalDbSystemConnectorsResponse>
            listExternalDbSystemConnectors(
                    ListExternalDbSystemConnectorsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalDbSystemConnectorsRequest,
                                    ListExternalDbSystemConnectorsResponse>
                            handler);

    /**
     * Lists the external DB system discovery resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListExternalDbSystemDiscoveriesResponse>
            listExternalDbSystemDiscoveries(
                    ListExternalDbSystemDiscoveriesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalDbSystemDiscoveriesRequest,
                                    ListExternalDbSystemDiscoveriesResponse>
                            handler);

    /**
     * Lists the external DB systems in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListExternalDbSystemsResponse> listExternalDbSystems(
            ListExternalDbSystemsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListExternalDbSystemsRequest, ListExternalDbSystemsResponse>
                    handler);

    /**
     * Lists the Exadata infrastructure resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListExternalExadataInfrastructuresResponse>
            listExternalExadataInfrastructures(
                    ListExternalExadataInfrastructuresRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalExadataInfrastructuresRequest,
                                    ListExternalExadataInfrastructuresResponse>
                            handler);

    /**
     * Lists the Exadata storage server connectors for the specified Exadata infrastructure.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListExternalExadataStorageConnectorsResponse>
            listExternalExadataStorageConnectors(
                    ListExternalExadataStorageConnectorsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalExadataStorageConnectorsRequest,
                                    ListExternalExadataStorageConnectorsResponse>
                            handler);

    /**
     * Lists the Exadata storage servers for the specified Exadata infrastructure.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListExternalExadataStorageServersResponse>
            listExternalExadataStorageServers(
                    ListExternalExadataStorageServersRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalExadataStorageServersRequest,
                                    ListExternalExadataStorageServersResponse>
                            handler);

    /**
     * Lists the database services registered with the specified external listener for the specified
     * Managed Database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListExternalListenerServicesResponse> listExternalListenerServices(
            ListExternalListenerServicesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListExternalListenerServicesRequest,
                            ListExternalListenerServicesResponse>
                    handler);

    /**
     * Lists the listeners in the specified external DB system.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListExternalListenersResponse> listExternalListeners(
            ListExternalListenersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListExternalListenersRequest, ListExternalListenersResponse>
                    handler);

    /**
     * Gets the list of External MySQL Databases.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListExternalMySqlDatabasesResponse> listExternalMySqlDatabases(
            ListExternalMySqlDatabasesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListExternalMySqlDatabasesRequest, ListExternalMySqlDatabasesResponse>
                    handler);

    /**
     * Gets the job execution for a specific ID or the list of job executions for a job, job run,
     * Managed Database or Managed Database Group in a specific compartment. Only one of the
     * parameters, ID, jobId, jobRunId, managedDatabaseId or managedDatabaseGroupId should be
     * provided. If none of these parameters is provided, all the job executions in the compartment
     * are listed. Job executions can also be filtered based on the name and status parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListJobExecutionsResponse> listJobExecutions(
            ListJobExecutionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListJobExecutionsRequest, ListJobExecutionsResponse>
                    handler);

    /**
     * Gets the job run for a specific ID or the list of job runs for a job, Managed Database or
     * Managed Database Group in a specific compartment. Only one of the parameters, ID, jobId,
     * managedDatabaseId, or managedDatabaseGroupId should be provided. If none of these parameters
     * is provided, all the job runs in the compartment are listed. Job runs can also be filtered
     * based on name and runStatus parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListJobRunsResponse> listJobRuns(
            ListJobRunsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListJobRunsRequest, ListJobRunsResponse> handler);

    /**
     * Gets the job for a specific ID or the list of jobs for a Managed Database or Managed Database
     * Group in a specific compartment. Only one of the parameters, ID, managedDatabaseId or
     * managedDatabaseGroupId, should be provided. If none of these parameters is provided, all the
     * jobs in the compartment are listed. Jobs can also be filtered based on the name and
     * lifecycleState parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListJobsResponse> listJobs(
            ListJobsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListJobsRequest, ListJobsResponse> handler);

    /**
     * Gets the Managed Database Group for a specific ID or the list of Managed Database Groups in a
     * specific compartment. Managed Database Groups can also be filtered based on the name
     * parameter. Only one of the parameters, ID or name should be provided. If none of these
     * parameters is provided, all the Managed Database Groups in the compartment are listed.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedDatabaseGroupsResponse> listManagedDatabaseGroups(
            ListManagedDatabaseGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListManagedDatabaseGroupsRequest, ListManagedDatabaseGroupsResponse>
                    handler);

    /**
     * Gets the Managed Database for a specific ID or the list of Managed Databases in a specific
     * compartment. Managed Databases can be filtered based on the name parameter. Only one of the
     * parameters, ID or name should be provided. If neither of these parameters is provided, all
     * the Managed Databases in the compartment are listed. Managed Databases can also be filtered
     * based on the deployment type and management option. If the deployment type is not specified
     * or if it is `ONPREMISE`, then the management option is not considered and Managed Databases
     * with `ADVANCED` management option are listed.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedDatabasesResponse> listManagedDatabases(
            ListManagedDatabasesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListManagedDatabasesRequest, ListManagedDatabasesResponse>
                    handler);

    /**
     * Gets the list of External MySQL Database connectors.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListMySqlDatabaseConnectorsResponse> listMySqlDatabaseConnectors(
            ListMySqlDatabaseConnectorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMySqlDatabaseConnectorsRequest, ListMySqlDatabaseConnectorsResponse>
                    handler);

    /**
     * Gets a single named credential specified by the name or all the named credentials in a
     * specific compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListNamedCredentialsResponse> listNamedCredentials(
            ListNamedCredentialsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListNamedCredentialsRequest, ListNamedCredentialsResponse>
                    handler);

    /**
     * Gets the list of object privileges granted to a specific user.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListObjectPrivilegesResponse> listObjectPrivileges(
            ListObjectPrivilegesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListObjectPrivilegesRequest, ListObjectPrivilegesResponse>
                    handler);

    /**
     * Lists the details of the Optimizer Statistics Advisor task executions, such as their
     * duration, and the number of findings, if any. Optionally, you can specify a date-time range
     * (of seven days) to obtain the list of executions that fall within the specified time range.
     * If the date-time range is not specified, then the executions in the last seven days are
     * listed.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOptimizerStatisticsAdvisorExecutionsResponse>
            listOptimizerStatisticsAdvisorExecutions(
                    ListOptimizerStatisticsAdvisorExecutionsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListOptimizerStatisticsAdvisorExecutionsRequest,
                                    ListOptimizerStatisticsAdvisorExecutionsResponse>
                            handler);

    /**
     * Gets a list of the optimizer statistics collection operations per hour, grouped by task or
     * object status for the specified Managed Database. You must specify a value for
     * GroupByQueryParam to determine whether the data should be grouped by task status or task
     * object status. Optionally, you can specify a date-time range (of seven days) to obtain
     * collection aggregations within the specified time range. If the date-time range is not
     * specified, then the operations in the last seven days are listed. You can further filter the
     * results by providing the optional type of TaskTypeQueryParam. If the task type not provided,
     * then both Auto and Manual tasks are considered for aggregation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOptimizerStatisticsCollectionAggregationsResponse>
            listOptimizerStatisticsCollectionAggregations(
                    ListOptimizerStatisticsCollectionAggregationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListOptimizerStatisticsCollectionAggregationsRequest,
                                    ListOptimizerStatisticsCollectionAggregationsResponse>
                            handler);

    /**
     * Lists the Optimizer Statistics Collection (Auto and Manual) task operation summary for the
     * specified Managed Database. The summary includes the details of each operation and the number
     * of tasks grouped by status: Completed, In Progress, Failed, and so on. Optionally, you can
     * specify a date-time range (of seven days) to obtain the list of operations that fall within
     * the specified time range. If the date-time range is not specified, then the operations in the
     * last seven days are listed. This API also enables the pagination of results and the
     * opc-next-page response header indicates whether there is a next page. If you use the same
     * header value in a consecutive request, the next page records are returned. To obtain the
     * required results, you can apply the different types of filters supported by this API.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOptimizerStatisticsCollectionOperationsResponse>
            listOptimizerStatisticsCollectionOperations(
                    ListOptimizerStatisticsCollectionOperationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListOptimizerStatisticsCollectionOperationsRequest,
                                    ListOptimizerStatisticsCollectionOperationsResponse>
                            handler);

    /**
     * Gets the list of preferred credentials for a given Managed Database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPreferredCredentialsResponse> listPreferredCredentials(
            ListPreferredCredentialsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPreferredCredentialsRequest, ListPreferredCredentialsResponse>
                    handler);

    /**
     * Gets the list of users on whose behalf the current user acts as proxy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListProxiedForUsersResponse> listProxiedForUsers(
            ListProxiedForUsersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListProxiedForUsersRequest, ListProxiedForUsersResponse>
                    handler);

    /**
     * Gets the list of proxy users for the current user.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListProxyUsersResponse> listProxyUsers(
            ListProxyUsersRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListProxyUsersRequest, ListProxyUsersResponse>
                    handler);

    /**
     * Gets the list of roles granted to a specific user.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListRolesResponse> listRoles(
            ListRolesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListRolesRequest, ListRolesResponse> handler);

    /**
     * Lists the database jobs used for loading SQL plan baselines in the specified Managed
     * Database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSqlPlanBaselineJobsResponse> listSqlPlanBaselineJobs(
            ListSqlPlanBaselineJobsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSqlPlanBaselineJobsRequest, ListSqlPlanBaselineJobsResponse>
                    handler);

    /**
     * Lists the SQL plan baselines for the specified Managed Database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSqlPlanBaselinesResponse> listSqlPlanBaselines(
            ListSqlPlanBaselinesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSqlPlanBaselinesRequest, ListSqlPlanBaselinesResponse>
                    handler);

    /**
     * Gets the list of system privileges granted to a specific user.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSystemPrivilegesResponse> listSystemPrivileges(
            ListSystemPrivilegesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSystemPrivilegesRequest, ListSystemPrivilegesResponse>
                    handler);

    /**
     * Lists the database table statistics grouped by different statuses such as Not Stale Stats,
     * Stale Stats, and No Stats. This also includes the percentage of each status.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTableStatisticsResponse> listTableStatistics(
            ListTableStatisticsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListTableStatisticsRequest, ListTableStatisticsResponse>
                    handler);

    /**
     * Gets the list of tablespaces for the specified managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTablespacesResponse> listTablespaces(
            ListTablespacesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTablespacesRequest, ListTablespacesResponse>
                    handler);

    /**
     * Gets the list of users for the specified managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListUsersResponse> listUsers(
            ListUsersRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListUsersRequest, ListUsersResponse> handler);

    /**
     * Returns a paginated list of errors for a given work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Returns a paginated list of logs for a given work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * The list of work requests in a specific compartment was retrieved successfully.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Loads plans from Automatic Workload Repository (AWR) snapshots. You must specify the
     * beginning and ending of the snapshot range. Optionally, you can apply a filter to load only
     * plans that meet specified criteria. By default, the optimizer uses the loaded plans the next
     * time that the database executes the SQL statements.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<LoadSqlPlanBaselinesFromAwrResponse> loadSqlPlanBaselinesFromAwr(
            LoadSqlPlanBaselinesFromAwrRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            LoadSqlPlanBaselinesFromAwrRequest, LoadSqlPlanBaselinesFromAwrResponse>
                    handler);

    /**
     * Loads plans for statements directly from the shared SQL area, also called the cursor cache.
     * By applying a filter on the module name, the schema, or the SQL ID you identify the SQL
     * statement or set of SQL statements to load.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<LoadSqlPlanBaselinesFromCursorCacheResponse>
            loadSqlPlanBaselinesFromCursorCache(
                    LoadSqlPlanBaselinesFromCursorCacheRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    LoadSqlPlanBaselinesFromCursorCacheRequest,
                                    LoadSqlPlanBaselinesFromCursorCacheResponse>
                            handler);

    /**
     * Modifies the Database Management feature for the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ModifyAutonomousDatabaseManagementFeatureResponse>
            modifyAutonomousDatabaseManagementFeature(
                    ModifyAutonomousDatabaseManagementFeatureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ModifyAutonomousDatabaseManagementFeatureRequest,
                                    ModifyAutonomousDatabaseManagementFeatureResponse>
                            handler);

    /**
     * Modifies a Database Management feature for the specified Oracle cloud database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ModifyDatabaseManagementFeatureResponse>
            modifyDatabaseManagementFeature(
                    ModifyDatabaseManagementFeatureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ModifyDatabaseManagementFeatureRequest,
                                    ModifyDatabaseManagementFeatureResponse>
                            handler);

    /**
     * Modifies the Database Management feature for the specified Oracle cloud pluggable database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ModifyPluggableDatabaseManagementFeatureResponse>
            modifyPluggableDatabaseManagementFeature(
                    ModifyPluggableDatabaseManagementFeatureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ModifyPluggableDatabaseManagementFeatureRequest,
                                    ModifyPluggableDatabaseManagementFeatureResponse>
                            handler);

    /**
     * Patches the external DB system discovery specified by `externalDbSystemDiscoveryId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PatchExternalDbSystemDiscoveryResponse>
            patchExternalDbSystemDiscovery(
                    PatchExternalDbSystemDiscoveryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    PatchExternalDbSystemDiscoveryRequest,
                                    PatchExternalDbSystemDiscoveryResponse>
                            handler);

    /**
     * Removes a data file or temp file from the tablespace.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemoveDataFileResponse> removeDataFile(
            RemoveDataFileRequest request,
            com.oracle.bmc.responses.AsyncHandler<RemoveDataFileRequest, RemoveDataFileResponse>
                    handler);

    /**
     * Removes a Managed Database from a Managed Database Group. Any management activities that are
     * currently running on this database will continue to run to completion. However, any
     * activities scheduled to run in the future will not be performed on this database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemoveManagedDatabaseFromManagedDatabaseGroupResponse>
            removeManagedDatabaseFromManagedDatabaseGroup(
                    RemoveManagedDatabaseFromManagedDatabaseGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveManagedDatabaseFromManagedDatabaseGroupRequest,
                                    RemoveManagedDatabaseFromManagedDatabaseGroupResponse>
                            handler);

    /**
     * Resets database parameter values to their default or startup values.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ResetDatabaseParametersResponse> resetDatabaseParameters(
            ResetDatabaseParametersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ResetDatabaseParametersRequest, ResetDatabaseParametersResponse>
                    handler);

    /**
     * Resizes a data file or temp file within the tablespace.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ResizeDataFileResponse> resizeDataFile(
            ResizeDataFileRequest request,
            com.oracle.bmc.responses.AsyncHandler<ResizeDataFileRequest, ResizeDataFileResponse>
                    handler);

    /**
     * Creates and executes a historic ADDM task using the specified AWR snapshot IDs. If an
     * existing ADDM task uses the provided awr snapshot IDs, the existing task will be returned.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RunHistoricAddmResponse> runHistoricAddm(
            RunHistoricAddmRequest request,
            com.oracle.bmc.responses.AsyncHandler<RunHistoricAddmRequest, RunHistoricAddmResponse>
                    handler);

    /**
     * Summarizes the AWR CPU resource limits and metrics for the specified database in AWR.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAwrDbCpuUsagesResponse> summarizeAwrDbCpuUsages(
            SummarizeAwrDbCpuUsagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrDbCpuUsagesRequest, SummarizeAwrDbCpuUsagesResponse>
                    handler);

    /**
     * Summarizes the metric samples for the specified database in the AWR. The metric samples are
     * summarized based on the Time dimension for each metric.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAwrDbMetricsResponse> summarizeAwrDbMetrics(
            SummarizeAwrDbMetricsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrDbMetricsRequest, SummarizeAwrDbMetricsResponse>
                    handler);

    /**
     * Summarizes the database parameter change history for one database parameter of the specified
     * database in AWR. One change history record contains the previous value, the changed value,
     * and the corresponding time range. If the database parameter value was changed multiple times
     * within the time range, then multiple change history records are created for the same
     * parameter. Note that this API only returns information on change history details for one
     * database parameter. To get a list of all the database parameters whose values were changed
     * during a specified time range, use the following API endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbs/{awrDbId}/awrDbParameters
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAwrDbParameterChangesResponse>
            summarizeAwrDbParameterChanges(
                    SummarizeAwrDbParameterChangesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDbParameterChangesRequest,
                                    SummarizeAwrDbParameterChangesResponse>
                            handler);

    /**
     * Summarizes the database parameter history for the specified database in AWR. This includes
     * the list of database parameters, with information on whether the parameter values were
     * modified within the query time range. Note that each database parameter is only listed once.
     * Depending on the optional query parameters, the returned summary gets all the database
     * parameters, which include:
     *
     * <p>- Each parameter whose value was changed during the time range: (valueChanged =\"Y\") -
     * Each parameter whose value was unchanged during the time range: (valueChanged =\"N\") - Each
     * parameter whose value was changed at the system level during the time range: (valueChanged
     * =\"Y\" and valueModified = \"SYSTEM_MOD\") - Each parameter whose value was unchanged during
     * the time range, however, the value is not the default value: (valueChanged =\"N\" and
     * valueDefault = \"FALSE\")
     *
     * <p>Note that this API does not return information on the number of times each database
     * parameter has been changed within the time range. To get the database parameter value change
     * history for a specific parameter, use the following API endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbs/{awrDbId}/awrDbParameterChanges
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAwrDbParametersResponse> summarizeAwrDbParameters(
            SummarizeAwrDbParametersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrDbParametersRequest, SummarizeAwrDbParametersResponse>
                    handler);

    /**
     * Summarizes the AWR snapshot ranges that contain continuous snapshots, for the specified
     * Managed Database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAwrDbSnapshotRangesResponse> summarizeAwrDbSnapshotRanges(
            SummarizeAwrDbSnapshotRangesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrDbSnapshotRangesRequest,
                            SummarizeAwrDbSnapshotRangesResponse>
                    handler);

    /**
     * Summarizes the AWR SYSSTAT sample data for the specified database in AWR. The statistical
     * data is summarized based on the Time dimension for each statistic.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAwrDbSysstatsResponse> summarizeAwrDbSysstats(
            SummarizeAwrDbSysstatsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrDbSysstatsRequest, SummarizeAwrDbSysstatsResponse>
                    handler);

    /**
     * Summarizes the AWR top wait events.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAwrDbTopWaitEventsResponse> summarizeAwrDbTopWaitEvents(
            SummarizeAwrDbTopWaitEventsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrDbTopWaitEventsRequest, SummarizeAwrDbTopWaitEventsResponse>
                    handler);

    /**
     * Summarizes AWR wait event data into value buckets and frequency, for the specified database
     * in the AWR.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAwrDbWaitEventBucketsResponse>
            summarizeAwrDbWaitEventBuckets(
                    SummarizeAwrDbWaitEventBucketsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDbWaitEventBucketsRequest,
                                    SummarizeAwrDbWaitEventBucketsResponse>
                            handler);

    /**
     * Summarizes the AWR wait event sample data for the specified database in the AWR. The event
     * data is summarized based on the Time dimension for each event.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAwrDbWaitEventsResponse> summarizeAwrDbWaitEvents(
            SummarizeAwrDbWaitEventsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrDbWaitEventsRequest, SummarizeAwrDbWaitEventsResponse>
                    handler);

    /**
     * Gets metrics for the external ASM specified by `externalAsmId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeExternalAsmMetricsResponse> summarizeExternalAsmMetrics(
            SummarizeExternalAsmMetricsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeExternalAsmMetricsRequest, SummarizeExternalAsmMetricsResponse>
                    handler);

    /**
     * Gets metrics for the external cluster specified by `externalClusterId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeExternalClusterMetricsResponse>
            summarizeExternalClusterMetrics(
                    SummarizeExternalClusterMetricsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExternalClusterMetricsRequest,
                                    SummarizeExternalClusterMetricsResponse>
                            handler);

    /**
     * Gets metrics for the external DB node specified by `externalDbNodeId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeExternalDbNodeMetricsResponse>
            summarizeExternalDbNodeMetrics(
                    SummarizeExternalDbNodeMetricsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExternalDbNodeMetricsRequest,
                                    SummarizeExternalDbNodeMetricsResponse>
                            handler);

    /**
     * Gets availability metrics for the components present in the external DB system specified by
     * `externalDbSystemId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeExternalDbSystemAvailabilityMetricsResponse>
            summarizeExternalDbSystemAvailabilityMetrics(
                    SummarizeExternalDbSystemAvailabilityMetricsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExternalDbSystemAvailabilityMetricsRequest,
                                    SummarizeExternalDbSystemAvailabilityMetricsResponse>
                            handler);

    /**
     * Gets metrics for the external listener specified by `externalListenerId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeExternalListenerMetricsResponse>
            summarizeExternalListenerMetrics(
                    SummarizeExternalListenerMetricsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExternalListenerMetricsRequest,
                                    SummarizeExternalListenerMetricsResponse>
                            handler);

    /**
     * Gets the number of job executions grouped by status for a job, Managed Database, or Database
     * Group in a specific compartment. Only one of the parameters, jobId, managedDatabaseId, or
     * managedDatabaseGroupId should be provided.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeJobExecutionsStatusesResponse>
            summarizeJobExecutionsStatuses(
                    SummarizeJobExecutionsStatusesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeJobExecutionsStatusesRequest,
                                    SummarizeJobExecutionsStatusesResponse>
                            handler);

    /**
     * Gets the availability metrics related to managed database for the Oracle database specified
     * by managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeManagedDatabaseAvailabilityMetricsResponse>
            summarizeManagedDatabaseAvailabilityMetrics(
                    SummarizeManagedDatabaseAvailabilityMetricsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeManagedDatabaseAvailabilityMetricsRequest,
                                    SummarizeManagedDatabaseAvailabilityMetricsResponse>
                            handler);

    /**
     * Gets the number of SQL plan baselines aggregated by their attributes.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeSqlPlanBaselinesResponse> summarizeSqlPlanBaselines(
            SummarizeSqlPlanBaselinesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeSqlPlanBaselinesRequest, SummarizeSqlPlanBaselinesResponse>
                    handler);

    /**
     * Gets the number of SQL plan baselines aggregated by the age of their last execution in weeks.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeSqlPlanBaselinesByLastExecutionResponse>
            summarizeSqlPlanBaselinesByLastExecution(
                    SummarizeSqlPlanBaselinesByLastExecutionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeSqlPlanBaselinesByLastExecutionRequest,
                                    SummarizeSqlPlanBaselinesByLastExecutionResponse>
                            handler);

    /**
     * Tests the named credential.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<TestNamedCredentialResponse> testNamedCredential(
            TestNamedCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            TestNamedCredentialRequest, TestNamedCredentialResponse>
                    handler);

    /**
     * Tests the preferred credential.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<TestPreferredCredentialResponse> testPreferredCredential(
            TestPreferredCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            TestPreferredCredentialRequest, TestPreferredCredentialResponse>
                    handler);

    /**
     * Updates one or more attributes of a specific Database Management private endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDbManagementPrivateEndpointResponse>
            updateDbManagementPrivateEndpoint(
                    UpdateDbManagementPrivateEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDbManagementPrivateEndpointRequest,
                                    UpdateDbManagementPrivateEndpointResponse>
                            handler);

    /**
     * Updates the external ASM specified by `externalAsmId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExternalAsmResponse> updateExternalAsm(
            UpdateExternalAsmRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateExternalAsmRequest, UpdateExternalAsmResponse>
                    handler);

    /**
     * Updates the external ASM instance specified by `externalAsmInstanceId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExternalAsmInstanceResponse> updateExternalAsmInstance(
            UpdateExternalAsmInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateExternalAsmInstanceRequest, UpdateExternalAsmInstanceResponse>
                    handler);

    /**
     * Updates the external cluster specified by `externalClusterId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExternalClusterResponse> updateExternalCluster(
            UpdateExternalClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateExternalClusterRequest, UpdateExternalClusterResponse>
                    handler);

    /**
     * Updates the external cluster instance specified by `externalClusterInstanceId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExternalClusterInstanceResponse>
            updateExternalClusterInstance(
                    UpdateExternalClusterInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalClusterInstanceRequest,
                                    UpdateExternalClusterInstanceResponse>
                            handler);

    /**
     * Updates the external DB home specified by `externalDbHomeId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExternalDbHomeResponse> updateExternalDbHome(
            UpdateExternalDbHomeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateExternalDbHomeRequest, UpdateExternalDbHomeResponse>
                    handler);

    /**
     * Updates the external DB node specified by `externalDbNodeId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExternalDbNodeResponse> updateExternalDbNode(
            UpdateExternalDbNodeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateExternalDbNodeRequest, UpdateExternalDbNodeResponse>
                    handler);

    /**
     * Updates the external DB system specified by `externalDbSystemId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExternalDbSystemResponse> updateExternalDbSystem(
            UpdateExternalDbSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateExternalDbSystemRequest, UpdateExternalDbSystemResponse>
                    handler);

    /**
     * Updates the external connector specified by `externalDbSystemConnectorId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExternalDbSystemConnectorResponse>
            updateExternalDbSystemConnector(
                    UpdateExternalDbSystemConnectorRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalDbSystemConnectorRequest,
                                    UpdateExternalDbSystemConnectorResponse>
                            handler);

    /**
     * Updates the external DB system discovery specified by `externalDbSystemDiscoveryId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExternalDbSystemDiscoveryResponse>
            updateExternalDbSystemDiscovery(
                    UpdateExternalDbSystemDiscoveryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalDbSystemDiscoveryRequest,
                                    UpdateExternalDbSystemDiscoveryResponse>
                            handler);

    /**
     * Updates the details for the Exadata infrastructure specified by
     * externalExadataInfrastructureId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExternalExadataInfrastructureResponse>
            updateExternalExadataInfrastructure(
                    UpdateExternalExadataInfrastructureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalExadataInfrastructureRequest,
                                    UpdateExternalExadataInfrastructureResponse>
                            handler);

    /**
     * Updates the Exadata storage server connector specified by exadataStorageConnectorId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExternalExadataStorageConnectorResponse>
            updateExternalExadataStorageConnector(
                    UpdateExternalExadataStorageConnectorRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalExadataStorageConnectorRequest,
                                    UpdateExternalExadataStorageConnectorResponse>
                            handler);

    /**
     * Updates the Exadata storage server grid specified by exadataStorageGridId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExternalExadataStorageGridResponse>
            updateExternalExadataStorageGrid(
                    UpdateExternalExadataStorageGridRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalExadataStorageGridRequest,
                                    UpdateExternalExadataStorageGridResponse>
                            handler);

    /**
     * Updates the Exadata storage server specified by exadataStorageServerId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExternalExadataStorageServerResponse>
            updateExternalExadataStorageServer(
                    UpdateExternalExadataStorageServerRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalExadataStorageServerRequest,
                                    UpdateExternalExadataStorageServerResponse>
                            handler);

    /**
     * Updates the external listener specified by `externalListenerId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExternalListenerResponse> updateExternalListener(
            UpdateExternalListenerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateExternalListenerRequest, UpdateExternalListenerResponse>
                    handler);

    /**
     * Updates the External Mysql Database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExternalMysqlDatabaseResponse> updateExternalMysqlDatabase(
            UpdateExternalMysqlDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateExternalMysqlDatabaseRequest, UpdateExternalMysqlDatabaseResponse>
                    handler);

    /**
     * Updates the External Mysql Database Connector.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExternalMysqlDatabaseConnectorResponse>
            updateExternalMysqlDatabaseConnector(
                    UpdateExternalMysqlDatabaseConnectorRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalMysqlDatabaseConnectorRequest,
                                    UpdateExternalMysqlDatabaseConnectorResponse>
                            handler);

    /**
     * Updates the details for the recurring scheduled job specified by jobId. Note that
     * non-recurring (one time) jobs cannot be updated.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateJobResponse> updateJob(
            UpdateJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateJobRequest, UpdateJobResponse> handler);

    /**
     * Updates the Managed Database specified by managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateManagedDatabaseResponse> updateManagedDatabase(
            UpdateManagedDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateManagedDatabaseRequest, UpdateManagedDatabaseResponse>
                    handler);

    /**
     * Updates the Managed Database Group specified by managedDatabaseGroupId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateManagedDatabaseGroupResponse> updateManagedDatabaseGroup(
            UpdateManagedDatabaseGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateManagedDatabaseGroupRequest, UpdateManagedDatabaseGroupResponse>
                    handler);

    /**
     * Updates the named credential specified by namedCredentialId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateNamedCredentialResponse> updateNamedCredential(
            UpdateNamedCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateNamedCredentialRequest, UpdateNamedCredentialResponse>
                    handler);

    /**
     * Updates the preferred credential based on the credentialName.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePreferredCredentialResponse> updatePreferredCredential(
            UpdatePreferredCredentialRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdatePreferredCredentialRequest, UpdatePreferredCredentialResponse>
                    handler);

    /**
     * Updates the attributes of the tablespace specified by tablespaceName within the Managed
     * Database specified by managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTablespaceResponse> updateTablespace(
            UpdateTablespaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateTablespaceRequest, UpdateTablespaceResponse>
                    handler);
}
