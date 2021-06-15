/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database;

import com.oracle.bmc.database.requests.*;
import com.oracle.bmc.database.responses.*;

/**
 * The API for the Database Service. Use this API to manage resources such as databases and DB Systems. For more information, see [Overview of the Database Service](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/databaseoverview.htm).
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface DatabaseAsync extends AutoCloseable {

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
     * Activates the specified Exadata infrastructure resource. Applies to Exadata Cloud@Customer instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ActivateExadataInfrastructureResponse>
            activateExadataInfrastructure(
                    ActivateExadataInfrastructureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ActivateExadataInfrastructureRequest,
                                    ActivateExadataInfrastructureResponse>
                            handler);

    /**
     * Makes the storage capacity from additional storage servers available for VM Cluster consumption. Applies to Exadata Cloud@Customer instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddStorageCapacityExadataInfrastructureResponse>
            addStorageCapacityExadataInfrastructure(
                    AddStorageCapacityExadataInfrastructureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AddStorageCapacityExadataInfrastructureRequest,
                                    AddStorageCapacityExadataInfrastructureResponse>
                            handler);

    /**
     * Initiates a data refresh for an Autonomous Database refreshable clone. Data is refreshed from the source database to the point of a specified timestamp.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AutonomousDatabaseManualRefreshResponse>
            autonomousDatabaseManualRefresh(
                    AutonomousDatabaseManualRefreshRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AutonomousDatabaseManualRefreshRequest,
                                    AutonomousDatabaseManualRefreshResponse>
                            handler);

    /**
     * Move the Autonomous Container Database and its dependent resources to the specified compartment.
     * For more information about moving Autonomous Container Databases, see
     * [Moving Database Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeAutonomousContainerDatabaseCompartmentResponse>
            changeAutonomousContainerDatabaseCompartment(
                    ChangeAutonomousContainerDatabaseCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAutonomousContainerDatabaseCompartmentRequest,
                                    ChangeAutonomousContainerDatabaseCompartmentResponse>
                            handler);

    /**
     * Move the Autonomous Database and its dependent resources to the specified compartment.
     * For more information about moving Autonomous Databases, see
     * [Moving Database Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeAutonomousDatabaseCompartmentResponse>
            changeAutonomousDatabaseCompartment(
                    ChangeAutonomousDatabaseCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAutonomousDatabaseCompartmentRequest,
                                    ChangeAutonomousDatabaseCompartmentResponse>
                            handler);

    /**
     * Moves the Autonomous Exadata Infrastructure resource and its dependent resources to the specified compartment.
     * For more information, see
     * [Moving Database Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeAutonomousExadataInfrastructureCompartmentResponse>
            changeAutonomousExadataInfrastructureCompartment(
                    ChangeAutonomousExadataInfrastructureCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAutonomousExadataInfrastructureCompartmentRequest,
                                    ChangeAutonomousExadataInfrastructureCompartmentResponse>
                            handler);

    /**
     * To move an Autonomous VM cluster and its dependent resources to another compartment, use the
     * {@link #changeAutonomousVmClusterCompartment(ChangeAutonomousVmClusterCompartmentRequest, Consumer, Consumer) changeAutonomousVmClusterCompartment} operation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeAutonomousVmClusterCompartmentResponse>
            changeAutonomousVmClusterCompartment(
                    ChangeAutonomousVmClusterCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAutonomousVmClusterCompartmentRequest,
                                    ChangeAutonomousVmClusterCompartmentResponse>
                            handler);

    /**
     * Move the backup destination and its dependent resources to the specified compartment.
     * For more information, see
     * [Moving Database Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeBackupDestinationCompartmentResponse>
            changeBackupDestinationCompartment(
                    ChangeBackupDestinationCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeBackupDestinationCompartmentRequest,
                                    ChangeBackupDestinationCompartmentResponse>
                            handler);

    /**
     * Moves a cloud Exadata infrastructure resource and its dependent resources to another compartment. Applies to Exadata Cloud Service instances only. For more information about moving resources to a different compartment, see [Moving Database Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeCloudExadataInfrastructureCompartmentResponse>
            changeCloudExadataInfrastructureCompartment(
                    ChangeCloudExadataInfrastructureCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCloudExadataInfrastructureCompartmentRequest,
                                    ChangeCloudExadataInfrastructureCompartmentResponse>
                            handler);

    /**
     * Moves a cloud VM cluster and its dependent resources to another compartment. Applies to Exadata Cloud Service instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeCloudVmClusterCompartmentResponse>
            changeCloudVmClusterCompartment(
                    ChangeCloudVmClusterCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCloudVmClusterCompartmentRequest,
                                    ChangeCloudVmClusterCompartmentResponse>
                            handler);

    /**
     * Move the Database Software Image and its dependent resources to the specified compartment.
     * For more information about moving Databse Software Images, see
     * [Moving Database Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDatabaseSoftwareImageCompartmentResponse>
            changeDatabaseSoftwareImageCompartment(
                    ChangeDatabaseSoftwareImageCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseSoftwareImageCompartmentRequest,
                                    ChangeDatabaseSoftwareImageCompartmentResponse>
                            handler);

    /**
     * Moves the DB system and its dependent resources to the specified compartment.
     * For more information about moving DB systems, see
     * [Moving Database Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDbSystemCompartmentResponse> changeDbSystemCompartment(
            ChangeDbSystemCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeDbSystemCompartmentRequest, ChangeDbSystemCompartmentResponse>
                    handler);

    /**
     * Moves an Exadata infrastructure resource and its dependent resources to another compartment. Applies to Exadata Cloud@Customer instances only.
     * To move an Exadata Cloud Service infrastructure resource to another compartment, use the  {@link #changeCloudExadataInfrastructureCompartment(ChangeCloudExadataInfrastructureCompartmentRequest, Consumer, Consumer) changeCloudExadataInfrastructureCompartment} operation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeExadataInfrastructureCompartmentResponse>
            changeExadataInfrastructureCompartment(
                    ChangeExadataInfrastructureCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeExadataInfrastructureCompartmentRequest,
                                    ChangeExadataInfrastructureCompartmentResponse>
                            handler);

    /**
     * Move the {@link #createExternalContainerDatabaseDetails(CreateExternalContainerDatabaseDetailsRequest, Consumer, Consumer) createExternalContainerDatabaseDetails}
     * and its dependent resources to the specified compartment.
     * For more information about moving external container databases, see
     * [Moving Database Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeExternalContainerDatabaseCompartmentResponse>
            changeExternalContainerDatabaseCompartment(
                    ChangeExternalContainerDatabaseCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeExternalContainerDatabaseCompartmentRequest,
                                    ChangeExternalContainerDatabaseCompartmentResponse>
                            handler);

    /**
     * Move the external non-container database and its dependent resources to the specified compartment.
     * For more information about moving external non-container databases, see
     * [Moving Database Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeExternalNonContainerDatabaseCompartmentResponse>
            changeExternalNonContainerDatabaseCompartment(
                    ChangeExternalNonContainerDatabaseCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeExternalNonContainerDatabaseCompartmentRequest,
                                    ChangeExternalNonContainerDatabaseCompartmentResponse>
                            handler);

    /**
     * Move the {@link #createExternalPluggableDatabaseDetails(CreateExternalPluggableDatabaseDetailsRequest, Consumer, Consumer) createExternalPluggableDatabaseDetails} and
     * its dependent resources to the specified compartment.
     * For more information about moving external pluggable databases, see
     * [Moving Database Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeExternalPluggableDatabaseCompartmentResponse>
            changeExternalPluggableDatabaseCompartment(
                    ChangeExternalPluggableDatabaseCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeExternalPluggableDatabaseCompartmentRequest,
                                    ChangeExternalPluggableDatabaseCompartmentResponse>
                            handler);

    /**
     * Move the key store resource to the specified compartment.
     * For more information about moving key stores, see
     * [Moving Database Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeKeyStoreCompartmentResponse> changeKeyStoreCompartment(
            ChangeKeyStoreCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeKeyStoreCompartmentRequest, ChangeKeyStoreCompartmentResponse>
                    handler);

    /**
     * Moves a VM cluster and its dependent resources to another compartment. Applies to Exadata Cloud@Customer instances only.
     * To move a cloud VM cluster in an Exadata Cloud Service instance to another compartment, use the {@link #changeCloudVmClusterCompartment(ChangeCloudVmClusterCompartmentRequest, Consumer, Consumer) changeCloudVmClusterCompartment} operation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeVmClusterCompartmentResponse> changeVmClusterCompartment(
            ChangeVmClusterCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeVmClusterCompartmentRequest, ChangeVmClusterCompartmentResponse>
                    handler);

    /**
     * Check the status of the external database connection specified in this connector.
     * This operation will refresh the connectionStatus and timeConnectionStatusLastUpdated fields.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CheckExternalDatabaseConnectorConnectionStatusResponse>
            checkExternalDatabaseConnectorConnectionStatus(
                    CheckExternalDatabaseConnectorConnectionStatusRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CheckExternalDatabaseConnectorConnectionStatusRequest,
                                    CheckExternalDatabaseConnectorConnectionStatusResponse>
                            handler);

    /**
     * Changes the status of the standalone backup resource to `ACTIVE` after the backup is created from the on-premises database and placed in Oracle Cloud Infrastructure Object Storage.
     * <p>
     **Note:** This API is used by an Oracle Cloud Infrastructure Python script that is packaged with the Oracle Cloud Infrastructure CLI. Oracle recommends that you use the script instead using the API directly. See [Migrating an On-Premises Database to Oracle Cloud Infrastructure by Creating a Backup in the Cloud](https://docs.cloud.oracle.com/Content/Database/Tasks/mig-onprembackup.htm) for more information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CompleteExternalBackupJobResponse> completeExternalBackupJob(
            CompleteExternalBackupJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CompleteExternalBackupJobRequest, CompleteExternalBackupJobResponse>
                    handler);

    /**
     * Configures the Autonomous Database Vault service [key](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ConfigureAutonomousDatabaseVaultKeyResponse>
            configureAutonomousDatabaseVaultKey(
                    ConfigureAutonomousDatabaseVaultKeyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureAutonomousDatabaseVaultKeyRequest,
                                    ConfigureAutonomousDatabaseVaultKeyResponse>
                            handler);

    /**
     * Creates an Autonomous Container Database in the specified Autonomous Exadata Infrastructure.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAutonomousContainerDatabaseResponse>
            createAutonomousContainerDatabase(
                    CreateAutonomousContainerDatabaseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateAutonomousContainerDatabaseRequest,
                                    CreateAutonomousContainerDatabaseResponse>
                            handler);

    /**
     * Creates a new Autonomous Database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAutonomousDatabaseResponse> createAutonomousDatabase(
            CreateAutonomousDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateAutonomousDatabaseRequest, CreateAutonomousDatabaseResponse>
                    handler);

    /**
     * Creates a new Autonomous Database backup for the specified database based on the provided request parameters.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAutonomousDatabaseBackupResponse>
            createAutonomousDatabaseBackup(
                    CreateAutonomousDatabaseBackupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateAutonomousDatabaseBackupRequest,
                                    CreateAutonomousDatabaseBackupResponse>
                            handler);

    /**
     * Creates an Autonomous VM cluster for Exadata Cloud@Customer.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAutonomousVmClusterResponse> createAutonomousVmCluster(
            CreateAutonomousVmClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateAutonomousVmClusterRequest, CreateAutonomousVmClusterResponse>
                    handler);

    /**
     * Creates a new backup in the specified database based on the request parameters you provide. If you previously used RMAN or dbcli to configure backups and then you switch to using the Console or the API for backups, a new backup configuration is created and associated with your database. This means that you can no longer rely on your previously configured unmanaged backups to work.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateBackupResponse> createBackup(
            CreateBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateBackupRequest, CreateBackupResponse>
                    handler);

    /**
     * Creates a backup destination in an Exadata Cloud@Customer system.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateBackupDestinationResponse> createBackupDestination(
            CreateBackupDestinationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateBackupDestinationRequest, CreateBackupDestinationResponse>
                    handler);

    /**
     * Creates a cloud Exadata infrastructure resource. This resource is used to create an [Exadata Cloud Service](https://docs.cloud.oracle.com/Content/Database/Concepts/exaoverview.htm) instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateCloudExadataInfrastructureResponse>
            createCloudExadataInfrastructure(
                    CreateCloudExadataInfrastructureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateCloudExadataInfrastructureRequest,
                                    CreateCloudExadataInfrastructureResponse>
                            handler);

    /**
     * Creates a cloud VM cluster.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateCloudVmClusterResponse> createCloudVmCluster(
            CreateCloudVmClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateCloudVmClusterRequest, CreateCloudVmClusterResponse>
                    handler);

    /**
     * Creates a new console connection to the specified database node.
     * After the console connection has been created and is available,
     * you connect to the console using SSH.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateConsoleConnectionResponse> createConsoleConnection(
            CreateConsoleConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateConsoleConnectionRequest, CreateConsoleConnectionResponse>
                    handler);

    /**
     * Creates a new Data Guard association.  A Data Guard association represents the replication relationship between the
     * specified database and a peer database. For more information, see [Using Oracle Data Guard](https://docs.cloud.oracle.com/Content/Database/Tasks/usingdataguard.htm).
     * <p>
     * All Oracle Cloud Infrastructure resources, including Data Guard associations, get an Oracle-assigned, unique ID
     * called an Oracle Cloud Identifier (OCID). When you create a resource, you can find its OCID in the response.
     * You can also retrieve a resource's OCID by using a List API operation on that resource type, or by viewing the
     * resource in the Console. For more information, see
     * [Resource Identifiers](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDataGuardAssociationResponse> createDataGuardAssociation(
            CreateDataGuardAssociationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDataGuardAssociationRequest, CreateDataGuardAssociationResponse>
                    handler);

    /**
     * Creates a new database in the specified Database Home. If the database version is provided, it must match the version of the Database Home. Applies to Exadata and Exadata Cloud@Customer systems.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDatabaseResponse> createDatabase(
            CreateDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateDatabaseRequest, CreateDatabaseResponse>
                    handler);

    /**
     * create database software image in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDatabaseSoftwareImageResponse> createDatabaseSoftwareImage(
            CreateDatabaseSoftwareImageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDatabaseSoftwareImageRequest, CreateDatabaseSoftwareImageResponse>
                    handler);

    /**
     * Creates a new Database Home in the specified database system based on the request parameters you provide. Applies to bare metal DB systems, Exadata systems, and Exadata Cloud@Customer systems.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDbHomeResponse> createDbHome(
            CreateDbHomeRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateDbHomeRequest, CreateDbHomeResponse>
                    handler);

    /**
     * Creates an Exadata infrastructure resource. Applies to Exadata Cloud@Customer instances only.
     * To create an Exadata Cloud Service infrastructure resource, use the  {@link #createCloudExadataInfrastructure(CreateCloudExadataInfrastructureRequest, Consumer, Consumer) createCloudExadataInfrastructure} operation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateExadataInfrastructureResponse> createExadataInfrastructure(
            CreateExadataInfrastructureRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateExadataInfrastructureRequest, CreateExadataInfrastructureResponse>
                    handler);

    /**
     * Creates a new backup resource and returns the information the caller needs to back up an on-premises Oracle Database to Oracle Cloud Infrastructure.
     * <p>
     **Note:** This API is used by an Oracle Cloud Infrastructure Python script that is packaged with the Oracle Cloud Infrastructure CLI. Oracle recommends that you use the script instead using the API directly. See [Migrating an On-Premises Database to Oracle Cloud Infrastructure by Creating a Backup in the Cloud](https://docs.cloud.oracle.com/Content/Database/Tasks/mig-onprembackup.htm) for more information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateExternalBackupJobResponse> createExternalBackupJob(
            CreateExternalBackupJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateExternalBackupJobRequest, CreateExternalBackupJobResponse>
                    handler);

    /**
     * Creates a new external container database resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateExternalContainerDatabaseResponse>
            createExternalContainerDatabase(
                    CreateExternalContainerDatabaseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalContainerDatabaseRequest,
                                    CreateExternalContainerDatabaseResponse>
                            handler);

    /**
     * Creates a new external database connector.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateExternalDatabaseConnectorResponse>
            createExternalDatabaseConnector(
                    CreateExternalDatabaseConnectorRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalDatabaseConnectorRequest,
                                    CreateExternalDatabaseConnectorResponse>
                            handler);

    /**
     * Creates a new ExternalNonContainerDatabase resource
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateExternalNonContainerDatabaseResponse>
            createExternalNonContainerDatabase(
                    CreateExternalNonContainerDatabaseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalNonContainerDatabaseRequest,
                                    CreateExternalNonContainerDatabaseResponse>
                            handler);

    /**
     * Registers a new {@link #createExternalPluggableDatabaseDetails(CreateExternalPluggableDatabaseDetailsRequest, Consumer, Consumer) createExternalPluggableDatabaseDetails}
     * resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateExternalPluggableDatabaseResponse>
            createExternalPluggableDatabase(
                    CreateExternalPluggableDatabaseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalPluggableDatabaseRequest,
                                    CreateExternalPluggableDatabaseResponse>
                            handler);

    /**
     * Creates a Key Store.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateKeyStoreResponse> createKeyStore(
            CreateKeyStoreRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateKeyStoreRequest, CreateKeyStoreResponse>
                    handler);

    /**
     * Creates an Exadata Cloud@Customer VM cluster.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateVmClusterResponse> createVmCluster(
            CreateVmClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateVmClusterRequest, CreateVmClusterResponse>
                    handler);

    /**
     * Creates the VM cluster network. Applies to Exadata Cloud@Customer instances only.
     * To create a cloud VM cluster in an Exadata Cloud Service instance, use the {@link #createCloudVmCluster(CreateCloudVmClusterRequest, Consumer, Consumer) createCloudVmCluster} operation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateVmClusterNetworkResponse> createVmClusterNetwork(
            CreateVmClusterNetworkRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateVmClusterNetworkRequest, CreateVmClusterNetworkResponse>
                    handler);

    /**
     * Performs one of the following power actions on the specified DB node:
     * - start - power on
     * - stop - power off
     * - softreset - ACPI shutdown and power on
     * - reset - power off and power on
     * <p>
     **Note:** Stopping a node affects billing differently, depending on the type of DB system:
     * *Bare metal and Exadata systems* - The _stop_ state has no effect on the resources you consume.
     * Billing continues for DB nodes that you stop, and related resources continue
     * to apply against any relevant quotas. You must terminate the DB system
     * ({@link #terminateDbSystem(TerminateDbSystemRequest, Consumer, Consumer) terminateDbSystem})
     * to remove its resources from billing and quotas.
     * *Virtual machine DB systems* - Stopping a node stops billing for all OCPUs associated with that node, and billing resumes when you restart the node.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DbNodeActionResponse> dbNodeAction(
            DbNodeActionRequest request,
            com.oracle.bmc.responses.AsyncHandler<DbNodeActionRequest, DbNodeActionResponse>
                    handler);

    /**
     * Deletes the specified Autonomous Database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAutonomousDatabaseResponse> deleteAutonomousDatabase(
            DeleteAutonomousDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteAutonomousDatabaseRequest, DeleteAutonomousDatabaseResponse>
                    handler);

    /**
     * Deletes the specified Autonomous VM cluster in an Exadata Cloud@Customer system.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAutonomousVmClusterResponse> deleteAutonomousVmCluster(
            DeleteAutonomousVmClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteAutonomousVmClusterRequest, DeleteAutonomousVmClusterResponse>
                    handler);

    /**
     * Deletes a full backup. You cannot delete automatic backups using this API.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteBackupResponse> deleteBackup(
            DeleteBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteBackupRequest, DeleteBackupResponse>
                    handler);

    /**
     * Deletes a backup destination in an Exadata Cloud@Customer system.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteBackupDestinationResponse> deleteBackupDestination(
            DeleteBackupDestinationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteBackupDestinationRequest, DeleteBackupDestinationResponse>
                    handler);

    /**
     * Deletes the cloud Exadata infrastructure resource. Applies to Exadata Cloud Service instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCloudExadataInfrastructureResponse>
            deleteCloudExadataInfrastructure(
                    DeleteCloudExadataInfrastructureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteCloudExadataInfrastructureRequest,
                                    DeleteCloudExadataInfrastructureResponse>
                            handler);

    /**
     * Deletes the specified cloud VM cluster. Applies to Exadata Cloud Service instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCloudVmClusterResponse> deleteCloudVmCluster(
            DeleteCloudVmClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteCloudVmClusterRequest, DeleteCloudVmClusterResponse>
                    handler);

    /**
     * Deletes the specified database node console connection.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteConsoleConnectionResponse> deleteConsoleConnection(
            DeleteConsoleConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteConsoleConnectionRequest, DeleteConsoleConnectionResponse>
                    handler);

    /**
     * Deletes the specified database. Applies only to Exadata systems.
     * <p>
     * The data in this database is local to the Exadata system and will be lost when the database is deleted. Oracle recommends that you back up any data in the Exadata system prior to deleting it. You can use the `performFinalBackup` parameter to have the Exadata system database backed up before it is deleted.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDatabaseResponse> deleteDatabase(
            DeleteDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteDatabaseRequest, DeleteDatabaseResponse>
                    handler);

    /**
     * Delete a database software image
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDatabaseSoftwareImageResponse> deleteDatabaseSoftwareImage(
            DeleteDatabaseSoftwareImageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDatabaseSoftwareImageRequest, DeleteDatabaseSoftwareImageResponse>
                    handler);

    /**
     * Deletes a Database Home. Applies to bare metal DB systems, Exadata Cloud Service, and Exadata Cloud@Customer systems.
     * <p>
     * Oracle recommends that you use the `performFinalBackup` parameter to back up any data on a bare metal DB system before you delete a Database Home. On an Exadata Cloud@Customer system or an Exadata Cloud Service system, you can delete a Database Home only when there are no databases in it and therefore you cannot use the `performFinalBackup` parameter to back up data.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDbHomeResponse> deleteDbHome(
            DeleteDbHomeRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteDbHomeRequest, DeleteDbHomeResponse>
                    handler);

    /**
     * Deletes the Exadata Cloud@Customer infrastructure.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteExadataInfrastructureResponse> deleteExadataInfrastructure(
            DeleteExadataInfrastructureRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteExadataInfrastructureRequest, DeleteExadataInfrastructureResponse>
                    handler);

    /**
     * Deletes the {@link #createExternalContainerDatabaseDetails(CreateExternalContainerDatabaseDetailsRequest, Consumer, Consumer) createExternalContainerDatabaseDetails}
     * resource. Any external pluggable databases registered under this container database must be deleted in
     * your Oracle Cloud Infrastructure tenancy prior to this operation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteExternalContainerDatabaseResponse>
            deleteExternalContainerDatabase(
                    DeleteExternalContainerDatabaseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalContainerDatabaseRequest,
                                    DeleteExternalContainerDatabaseResponse>
                            handler);

    /**
     * Deletes an external database connector.
     * Any services enabled using the external database connector must be
     * deleted prior to this operation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteExternalDatabaseConnectorResponse>
            deleteExternalDatabaseConnector(
                    DeleteExternalDatabaseConnectorRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalDatabaseConnectorRequest,
                                    DeleteExternalDatabaseConnectorResponse>
                            handler);

    /**
     * Deletes the Oracle Cloud Infrastructure resource representing an external non-container database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteExternalNonContainerDatabaseResponse>
            deleteExternalNonContainerDatabase(
                    DeleteExternalNonContainerDatabaseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalNonContainerDatabaseRequest,
                                    DeleteExternalNonContainerDatabaseResponse>
                            handler);

    /**
     * Deletes the {@link #createExternalPluggableDatabaseDetails(CreateExternalPluggableDatabaseDetailsRequest, Consumer, Consumer) createExternalPluggableDatabaseDetails}.
     * resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteExternalPluggableDatabaseResponse>
            deleteExternalPluggableDatabase(
                    DeleteExternalPluggableDatabaseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalPluggableDatabaseRequest,
                                    DeleteExternalPluggableDatabaseResponse>
                            handler);

    /**
     * Deletes a key store.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteKeyStoreResponse> deleteKeyStore(
            DeleteKeyStoreRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteKeyStoreRequest, DeleteKeyStoreResponse>
                    handler);

    /**
     * Deletes the specified VM cluster. Applies to Exadata Cloud@Customer instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteVmClusterResponse> deleteVmCluster(
            DeleteVmClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteVmClusterRequest, DeleteVmClusterResponse>
                    handler);

    /**
     * Deletes the specified VM cluster network. Applies to Exadata Cloud@Customer instances only.
     * To delete a cloud VM cluster in an Exadata Cloud Service instance, use the {@link #deleteCloudVmCluster(DeleteCloudVmClusterRequest, Consumer, Consumer) deleteCloudVmCluster} operation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteVmClusterNetworkResponse> deleteVmClusterNetwork(
            DeleteVmClusterNetworkRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteVmClusterNetworkRequest, DeleteVmClusterNetworkResponse>
                    handler);

    /**
     * Asynchronously deregisters this Autonomous Database with Data Safe.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeregisterAutonomousDatabaseDataSafeResponse>
            deregisterAutonomousDatabaseDataSafe(
                    DeregisterAutonomousDatabaseDataSafeRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeregisterAutonomousDatabaseDataSafeRequest,
                                    DeregisterAutonomousDatabaseDataSafeResponse>
                            handler);

    /**
     * Disables Operations Insights for the Autonomous Database resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DisableAutonomousDatabaseOperationsInsightsResponse>
            disableAutonomousDatabaseOperationsInsights(
                    DisableAutonomousDatabaseOperationsInsightsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableAutonomousDatabaseOperationsInsightsRequest,
                                    DisableAutonomousDatabaseOperationsInsightsResponse>
                            handler);

    /**
     * Disable Database Management service for the external container database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DisableExternalContainerDatabaseDatabaseManagementResponse>
            disableExternalContainerDatabaseDatabaseManagement(
                    DisableExternalContainerDatabaseDatabaseManagementRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalContainerDatabaseDatabaseManagementRequest,
                                    DisableExternalContainerDatabaseDatabaseManagementResponse>
                            handler);

    /**
     * Disable Database Management Service for the external non-container database.
     * For more information about the Database Management Service, see
     * [Database Management Service](https://docs.cloud.oracle.com/Content/ExternalDatabase/Concepts/databasemanagementservice.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DisableExternalNonContainerDatabaseDatabaseManagementResponse>
            disableExternalNonContainerDatabaseDatabaseManagement(
                    DisableExternalNonContainerDatabaseDatabaseManagementRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalNonContainerDatabaseDatabaseManagementRequest,
                                    DisableExternalNonContainerDatabaseDatabaseManagementResponse>
                            handler);

    /**
     * Disable Operations Insights for the external non-container database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DisableExternalNonContainerDatabaseOperationsInsightsResponse>
            disableExternalNonContainerDatabaseOperationsInsights(
                    DisableExternalNonContainerDatabaseOperationsInsightsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalNonContainerDatabaseOperationsInsightsRequest,
                                    DisableExternalNonContainerDatabaseOperationsInsightsResponse>
                            handler);

    /**
     * Disable Database Management Service for the external pluggable database.
     * For more information about the Database Management Service, see
     * [Database Management Service](https://docs.cloud.oracle.com/Content/ExternalDatabase/Concepts/databasemanagementservice.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DisableExternalPluggableDatabaseDatabaseManagementResponse>
            disableExternalPluggableDatabaseDatabaseManagement(
                    DisableExternalPluggableDatabaseDatabaseManagementRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalPluggableDatabaseDatabaseManagementRequest,
                                    DisableExternalPluggableDatabaseDatabaseManagementResponse>
                            handler);

    /**
     * Disable Operations Insights for the external pluggable database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DisableExternalPluggableDatabaseOperationsInsightsResponse>
            disableExternalPluggableDatabaseOperationsInsights(
                    DisableExternalPluggableDatabaseOperationsInsightsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalPluggableDatabaseOperationsInsightsRequest,
                                    DisableExternalPluggableDatabaseOperationsInsightsResponse>
                            handler);

    /**
     * Downloads the configuration file for the specified Exadata Cloud@Customer infrastructure.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DownloadExadataInfrastructureConfigFileResponse>
            downloadExadataInfrastructureConfigFile(
                    DownloadExadataInfrastructureConfigFileRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DownloadExadataInfrastructureConfigFileRequest,
                                    DownloadExadataInfrastructureConfigFileResponse>
                            handler);

    /**
     * Downloads the configuration file for the specified VM cluster network. Applies to Exadata Cloud@Customer instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DownloadVmClusterNetworkConfigFileResponse>
            downloadVmClusterNetworkConfigFile(
                    DownloadVmClusterNetworkConfigFileRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DownloadVmClusterNetworkConfigFileRequest,
                                    DownloadVmClusterNetworkConfigFileResponse>
                            handler);

    /**
     * Enables the specified Autonomous Database with Operations Insights.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<EnableAutonomousDatabaseOperationsInsightsResponse>
            enableAutonomousDatabaseOperationsInsights(
                    EnableAutonomousDatabaseOperationsInsightsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableAutonomousDatabaseOperationsInsightsRequest,
                                    EnableAutonomousDatabaseOperationsInsightsResponse>
                            handler);

    /**
     * Enables Database Management Service for the external container database.
     * For more information about the Database Management Service, see
     * [Database Management Service](https://docs.cloud.oracle.com/Content/ExternalDatabase/Concepts/databasemanagementservice.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<EnableExternalContainerDatabaseDatabaseManagementResponse>
            enableExternalContainerDatabaseDatabaseManagement(
                    EnableExternalContainerDatabaseDatabaseManagementRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalContainerDatabaseDatabaseManagementRequest,
                                    EnableExternalContainerDatabaseDatabaseManagementResponse>
                            handler);

    /**
     * Enable Database Management Service for the external non-container database.
     * For more information about the Database Management Service, see
     * [Database Management Service](https://docs.cloud.oracle.com/Content/ExternalDatabase/Concepts/databasemanagementservice.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<EnableExternalNonContainerDatabaseDatabaseManagementResponse>
            enableExternalNonContainerDatabaseDatabaseManagement(
                    EnableExternalNonContainerDatabaseDatabaseManagementRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalNonContainerDatabaseDatabaseManagementRequest,
                                    EnableExternalNonContainerDatabaseDatabaseManagementResponse>
                            handler);

    /**
     * Enable Operations Insights for the external non-container database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<EnableExternalNonContainerDatabaseOperationsInsightsResponse>
            enableExternalNonContainerDatabaseOperationsInsights(
                    EnableExternalNonContainerDatabaseOperationsInsightsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalNonContainerDatabaseOperationsInsightsRequest,
                                    EnableExternalNonContainerDatabaseOperationsInsightsResponse>
                            handler);

    /**
     * Enable Database Management Service for the external pluggable database.
     * For more information about the Database Management Service, see
     * [Database Management Service](https://docs.cloud.oracle.com/Content/ExternalDatabase/Concepts/databasemanagementservice.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<EnableExternalPluggableDatabaseDatabaseManagementResponse>
            enableExternalPluggableDatabaseDatabaseManagement(
                    EnableExternalPluggableDatabaseDatabaseManagementRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalPluggableDatabaseDatabaseManagementRequest,
                                    EnableExternalPluggableDatabaseDatabaseManagementResponse>
                            handler);

    /**
     * Enable Operations Insights for the external pluggable database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<EnableExternalPluggableDatabaseOperationsInsightsResponse>
            enableExternalPluggableDatabaseOperationsInsights(
                    EnableExternalPluggableDatabaseOperationsInsightsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalPluggableDatabaseOperationsInsightsRequest,
                                    EnableExternalPluggableDatabaseOperationsInsightsResponse>
                            handler);

    /**
     * Initiates a failover the specified Autonomous Database to a standby.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<FailOverAutonomousDatabaseResponse> failOverAutonomousDatabase(
            FailOverAutonomousDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            FailOverAutonomousDatabaseRequest, FailOverAutonomousDatabaseResponse>
                    handler);

    /**
     * Fails over the standby Autonomous Container Database identified by the autonomousContainerDatabaseId parameter to the primary Autonomous Container Database after the existing primary Autonomous Container Database fails or becomes unreachable.
     * <p>
     * A failover can result in data loss, depending on the protection mode in effect at the time the primary Autonomous Container Database fails.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<FailoverAutonomousContainerDatabaseDataguardAssociationResponse>
            failoverAutonomousContainerDatabaseDataguardAssociation(
                    FailoverAutonomousContainerDatabaseDataguardAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    FailoverAutonomousContainerDatabaseDataguardAssociationRequest,
                                    FailoverAutonomousContainerDatabaseDataguardAssociationResponse>
                            handler);

    /**
     * Performs a failover to transition the standby database identified by the `databaseId` parameter into the
     * specified Data Guard association's primary role after the existing primary database fails or becomes unreachable.
     * <p>
     * A failover might result in data loss depending on the protection mode in effect at the time of the primary
     * database failure.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<FailoverDataGuardAssociationResponse> failoverDataGuardAssociation(
            FailoverDataGuardAssociationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            FailoverDataGuardAssociationRequest,
                            FailoverDataGuardAssociationResponse>
                    handler);

    /**
     * Creates and downloads a wallet for the specified Autonomous Database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GenerateAutonomousDatabaseWalletResponse>
            generateAutonomousDatabaseWallet(
                    GenerateAutonomousDatabaseWalletRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GenerateAutonomousDatabaseWalletRequest,
                                    GenerateAutonomousDatabaseWalletResponse>
                            handler);

    /**
     * Generates a recommended Cloud@Customer VM cluster network configuration.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GenerateRecommendedVmClusterNetworkResponse>
            generateRecommendedVmClusterNetwork(
                    GenerateRecommendedVmClusterNetworkRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GenerateRecommendedVmClusterNetworkRequest,
                                    GenerateRecommendedVmClusterNetworkResponse>
                            handler);

    /**
     * Gets information about the specified Autonomous Container Database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAutonomousContainerDatabaseResponse>
            getAutonomousContainerDatabase(
                    GetAutonomousContainerDatabaseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetAutonomousContainerDatabaseRequest,
                                    GetAutonomousContainerDatabaseResponse>
                            handler);

    /**
     * Gets an Autonomous Container Database enabled with Autonomous Data Guard associated with the specified Autonomous Container Database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAutonomousContainerDatabaseDataguardAssociationResponse>
            getAutonomousContainerDatabaseDataguardAssociation(
                    GetAutonomousContainerDatabaseDataguardAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetAutonomousContainerDatabaseDataguardAssociationRequest,
                                    GetAutonomousContainerDatabaseDataguardAssociationResponse>
                            handler);

    /**
     * Gets the details of the specified Autonomous Database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAutonomousDatabaseResponse> getAutonomousDatabase(
            GetAutonomousDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAutonomousDatabaseRequest, GetAutonomousDatabaseResponse>
                    handler);

    /**
     * Gets information about the specified Autonomous Database backup.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAutonomousDatabaseBackupResponse> getAutonomousDatabaseBackup(
            GetAutonomousDatabaseBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAutonomousDatabaseBackupRequest, GetAutonomousDatabaseBackupResponse>
                    handler);

    /**
     * Gets an Autonomous Data Guard-enabled database associated with the specified Autonomous Database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAutonomousDatabaseDataguardAssociationResponse>
            getAutonomousDatabaseDataguardAssociation(
                    GetAutonomousDatabaseDataguardAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetAutonomousDatabaseDataguardAssociationRequest,
                                    GetAutonomousDatabaseDataguardAssociationResponse>
                            handler);

    /**
     * Gets the Autonomous Database regional wallet details.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAutonomousDatabaseRegionalWalletResponse>
            getAutonomousDatabaseRegionalWallet(
                    GetAutonomousDatabaseRegionalWalletRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetAutonomousDatabaseRegionalWalletRequest,
                                    GetAutonomousDatabaseRegionalWalletResponse>
                            handler);

    /**
     * Gets the wallet details for the specified Autonomous Database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAutonomousDatabaseWalletResponse> getAutonomousDatabaseWallet(
            GetAutonomousDatabaseWalletRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAutonomousDatabaseWalletRequest, GetAutonomousDatabaseWalletResponse>
                    handler);

    /**
     * Gets information about the specified Autonomous Exadata Infrastructure resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAutonomousExadataInfrastructureResponse>
            getAutonomousExadataInfrastructure(
                    GetAutonomousExadataInfrastructureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetAutonomousExadataInfrastructureRequest,
                                    GetAutonomousExadataInfrastructureResponse>
                            handler);

    /**
     * Gets information about a specific autonomous patch.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAutonomousPatchResponse> getAutonomousPatch(
            GetAutonomousPatchRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAutonomousPatchRequest, GetAutonomousPatchResponse>
                    handler);

    /**
     * Gets information about the specified Autonomous VM cluster for an Exadata Cloud@Customer system.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAutonomousVmClusterResponse> getAutonomousVmCluster(
            GetAutonomousVmClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAutonomousVmClusterRequest, GetAutonomousVmClusterResponse>
                    handler);

    /**
     * Gets information about the specified backup.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetBackupResponse> getBackup(
            GetBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetBackupRequest, GetBackupResponse> handler);

    /**
     * Gets information about the specified backup destination in an Exadata Cloud@Customer system.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetBackupDestinationResponse> getBackupDestination(
            GetBackupDestinationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetBackupDestinationRequest, GetBackupDestinationResponse>
                    handler);

    /**
     * Gets information about the specified cloud Exadata infrastructure resource. Applies to Exadata Cloud Service instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCloudExadataInfrastructureResponse>
            getCloudExadataInfrastructure(
                    GetCloudExadataInfrastructureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetCloudExadataInfrastructureRequest,
                                    GetCloudExadataInfrastructureResponse>
                            handler);

    /**
     * Gets information about the specified cloud VM cluster. Applies to Exadata Cloud Service instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCloudVmClusterResponse> getCloudVmCluster(
            GetCloudVmClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCloudVmClusterRequest, GetCloudVmClusterResponse>
                    handler);

    /**
     * Gets the IORM configuration for the specified cloud VM cluster in an Exadata Cloud Service instance.
     * If you have not specified an IORM configuration, the default configuration is returned.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCloudVmClusterIormConfigResponse> getCloudVmClusterIormConfig(
            GetCloudVmClusterIormConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCloudVmClusterIormConfigRequest, GetCloudVmClusterIormConfigResponse>
                    handler);

    /**
     * Gets information about a specified maintenance update package for a cloud VM cluster. Applies to Exadata Cloud Service instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCloudVmClusterUpdateResponse> getCloudVmClusterUpdate(
            GetCloudVmClusterUpdateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCloudVmClusterUpdateRequest, GetCloudVmClusterUpdateResponse>
                    handler);

    /**
     * Gets the maintenance update history details for the specified update history entry. Applies to Exadata Cloud Service instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCloudVmClusterUpdateHistoryEntryResponse>
            getCloudVmClusterUpdateHistoryEntry(
                    GetCloudVmClusterUpdateHistoryEntryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetCloudVmClusterUpdateHistoryEntryRequest,
                                    GetCloudVmClusterUpdateHistoryEntryResponse>
                            handler);

    /**
     * Gets the specified database node console connection's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetConsoleConnectionResponse> getConsoleConnection(
            GetConsoleConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetConsoleConnectionRequest, GetConsoleConnectionResponse>
                    handler);

    /**
     * Gets the specified Data Guard association's configuration information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDataGuardAssociationResponse> getDataGuardAssociation(
            GetDataGuardAssociationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDataGuardAssociationRequest, GetDataGuardAssociationResponse>
                    handler);

    /**
     * Gets information about the specified database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseResponse> getDatabase(
            GetDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDatabaseRequest, GetDatabaseResponse> handler);

    /**
     * Gets information about the specified database software image.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseSoftwareImageResponse> getDatabaseSoftwareImage(
            GetDatabaseSoftwareImageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseSoftwareImageRequest, GetDatabaseSoftwareImageResponse>
                    handler);

    /**
     * gets the upgrade history for a specified database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseUpgradeHistoryEntryResponse>
            getDatabaseUpgradeHistoryEntry(
                    GetDatabaseUpgradeHistoryEntryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseUpgradeHistoryEntryRequest,
                                    GetDatabaseUpgradeHistoryEntryResponse>
                            handler);

    /**
     * Gets information about the specified Database Home.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDbHomeResponse> getDbHome(
            GetDbHomeRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDbHomeRequest, GetDbHomeResponse> handler);

    /**
     * Gets information about a specified patch package.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDbHomePatchResponse> getDbHomePatch(
            GetDbHomePatchRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDbHomePatchRequest, GetDbHomePatchResponse>
                    handler);

    /**
     * Gets the patch history details for the specified patchHistoryEntryId
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDbHomePatchHistoryEntryResponse> getDbHomePatchHistoryEntry(
            GetDbHomePatchHistoryEntryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDbHomePatchHistoryEntryRequest, GetDbHomePatchHistoryEntryResponse>
                    handler);

    /**
     * Gets information about the specified database node.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDbNodeResponse> getDbNode(
            GetDbNodeRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDbNodeRequest, GetDbNodeResponse> handler);

    /**
     * Gets information about the specified DB system.
     * <p>
     **Note:** Deprecated for Exadata Cloud Service systems. Use the [new resource model APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model) instead.
     * <p>
     * For Exadata Cloud Service instances, support for this API will end on May 15th, 2021. See [Switching an Exadata DB System to the New Resource Model and APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem_topic-resource_model_conversion.htm) for details on converting existing Exadata DB systems to the new resource model.
     *
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
     * Gets information the specified patch.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDbSystemPatchResponse> getDbSystemPatch(
            GetDbSystemPatchRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDbSystemPatchRequest, GetDbSystemPatchResponse>
                    handler);

    /**
     * Gets the details of the specified patch operation on the specified DB system.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDbSystemPatchHistoryEntryResponse> getDbSystemPatchHistoryEntry(
            GetDbSystemPatchHistoryEntryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDbSystemPatchHistoryEntryRequest,
                            GetDbSystemPatchHistoryEntryResponse>
                    handler);

    /**
     * Gets information about the specified Exadata infrastructure. Applies to Exadata Cloud@Customer instances only.
     * To get information on an Exadata Cloud Service infrastructure resource, use the  {@link #getCloudExadataInfrastructure(GetCloudExadataInfrastructureRequest, Consumer, Consumer) getCloudExadataInfrastructure} operation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetExadataInfrastructureResponse> getExadataInfrastructure(
            GetExadataInfrastructureRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExadataInfrastructureRequest, GetExadataInfrastructureResponse>
                    handler);

    /**
     * Gets details of the available and consumed OCPUs for the specified Autonomous Exadata Infrastructure resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetExadataInfrastructureOcpusResponse>
            getExadataInfrastructureOcpus(
                    GetExadataInfrastructureOcpusRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetExadataInfrastructureOcpusRequest,
                                    GetExadataInfrastructureOcpusResponse>
                            handler);

    /**
     * Gets the IORM configuration settings for the specified cloud Exadata DB system.
     * All Exadata service instances have default IORM settings.
     * <p>
     **Note:** Deprecated for Exadata Cloud Service systems. Use the [new resource model APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model) instead.
     * <p>
     * For Exadata Cloud Service instances, support for this API will end on May 15th, 2021. See [Switching an Exadata DB System to the New Resource Model and APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem_topic-resource_model_conversion.htm) for details on converting existing Exadata DB systems to the new resource model.
     * <p>
     * The {@link #getCloudVmClusterIormConfig(GetCloudVmClusterIormConfigRequest, Consumer, Consumer) getCloudVmClusterIormConfig} API is used for this operation with Exadata systems using the
     * new resource model.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetExadataIormConfigResponse> getExadataIormConfig(
            GetExadataIormConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExadataIormConfigRequest, GetExadataIormConfigResponse>
                    handler);

    /**
     * Gets information about the specified external backup job.
     * <p>
     **Note:** This API is used by an Oracle Cloud Infrastructure Python script that is packaged with the Oracle Cloud Infrastructure CLI. Oracle recommends that you use the script instead using the API directly. See [Migrating an On-Premises Database to Oracle Cloud Infrastructure by Creating a Backup in the Cloud](https://docs.cloud.oracle.com/Content/Database/Tasks/mig-onprembackup.htm) for more information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetExternalBackupJobResponse> getExternalBackupJob(
            GetExternalBackupJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExternalBackupJobRequest, GetExternalBackupJobResponse>
                    handler);

    /**
     * Gets information about the specified external container database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetExternalContainerDatabaseResponse> getExternalContainerDatabase(
            GetExternalContainerDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExternalContainerDatabaseRequest,
                            GetExternalContainerDatabaseResponse>
                    handler);

    /**
     * Gets information about the specified external database connector.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetExternalDatabaseConnectorResponse> getExternalDatabaseConnector(
            GetExternalDatabaseConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExternalDatabaseConnectorRequest,
                            GetExternalDatabaseConnectorResponse>
                    handler);

    /**
     * Gets information about a specific external non-container database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetExternalNonContainerDatabaseResponse>
            getExternalNonContainerDatabase(
                    GetExternalNonContainerDatabaseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalNonContainerDatabaseRequest,
                                    GetExternalNonContainerDatabaseResponse>
                            handler);

    /**
     * Gets information about a specific
     * {@link #createExternalPluggableDatabaseDetails(CreateExternalPluggableDatabaseDetailsRequest, Consumer, Consumer) createExternalPluggableDatabaseDetails} resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetExternalPluggableDatabaseResponse> getExternalPluggableDatabase(
            GetExternalPluggableDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExternalPluggableDatabaseRequest,
                            GetExternalPluggableDatabaseResponse>
                    handler);

    /**
     * Gets information about the specified key store.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetKeyStoreResponse> getKeyStore(
            GetKeyStoreRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetKeyStoreRequest, GetKeyStoreResponse> handler);

    /**
     * Gets information about the specified maintenance run.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetMaintenanceRunResponse> getMaintenanceRun(
            GetMaintenanceRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetMaintenanceRunRequest, GetMaintenanceRunResponse>
                    handler);

    /**
     * Gets information about the VM cluster. Applies to Exadata Cloud@Customer instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVmClusterResponse> getVmCluster(
            GetVmClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetVmClusterRequest, GetVmClusterResponse>
                    handler);

    /**
     * Gets information about the specified VM cluster network. Applies to Exadata Cloud@Customer instances only.
     * To get information about a cloud VM cluster in an Exadata Cloud Service instance, use the {@link #getCloudVmCluster(GetCloudVmClusterRequest, Consumer, Consumer) getCloudVmCluster} operation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVmClusterNetworkResponse> getVmClusterNetwork(
            GetVmClusterNetworkRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetVmClusterNetworkRequest, GetVmClusterNetworkResponse>
                    handler);

    /**
     * Gets information about a specified patch package.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVmClusterPatchResponse> getVmClusterPatch(
            GetVmClusterPatchRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetVmClusterPatchRequest, GetVmClusterPatchResponse>
                    handler);

    /**
     * Gets the patch history details for the specified patch history entry.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVmClusterPatchHistoryEntryResponse>
            getVmClusterPatchHistoryEntry(
                    GetVmClusterPatchHistoryEntryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetVmClusterPatchHistoryEntryRequest,
                                    GetVmClusterPatchHistoryEntryResponse>
                            handler);

    /**
     * Creates a new Autonomous Exadata Infrastructure in the specified compartment and availability domain.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<LaunchAutonomousExadataInfrastructureResponse>
            launchAutonomousExadataInfrastructure(
                    LaunchAutonomousExadataInfrastructureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    LaunchAutonomousExadataInfrastructureRequest,
                                    LaunchAutonomousExadataInfrastructureResponse>
                            handler);

    /**
     * Creates a new DB system in the specified compartment and availability domain. The Oracle
     * Database edition that you specify applies to all the databases on that DB system. The selected edition cannot be changed.
     * <p>
     * An initial database is created on the DB system based on the request parameters you provide and some default
     * options. For detailed information about default options, see [Bare metal and virtual machine DB system default options.](https://docs.cloud.oracle.com/Content/Database/Tasks/creatingDBsystem.htm#Default)
     * <p>
     **Note:** Deprecated for Exadata Cloud Service systems. Use the [new resource model APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model) instead.
     * <p>
     * For Exadata Cloud Service instances, support for this API will end on May 15th, 2021. See [Switching an Exadata DB System to the New Resource Model and APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem_topic-resource_model_conversion.htm) for details on converting existing Exadata DB systems to the new resource model.
     * <p>
     * Use the {@link #createCloudExadataInfrastructure(CreateCloudExadataInfrastructureRequest, Consumer, Consumer) createCloudExadataInfrastructure} and {@link #createCloudVmCluster(CreateCloudVmClusterRequest, Consumer, Consumer) createCloudVmCluster} APIs to provision a new Exadata Cloud Service instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<LaunchDbSystemResponse> launchDbSystem(
            LaunchDbSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<LaunchDbSystemRequest, LaunchDbSystemResponse>
                    handler);

    /**
     * Gets a list of the Autonomous Container Databases with Autonomous Data Guard-enabled associated with the specified Autonomous Container Database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAutonomousContainerDatabaseDataguardAssociationsResponse>
            listAutonomousContainerDatabaseDataguardAssociations(
                    ListAutonomousContainerDatabaseDataguardAssociationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousContainerDatabaseDataguardAssociationsRequest,
                                    ListAutonomousContainerDatabaseDataguardAssociationsResponse>
                            handler);

    /**
     * Gets a list of the Autonomous Container Databases in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAutonomousContainerDatabasesResponse>
            listAutonomousContainerDatabases(
                    ListAutonomousContainerDatabasesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousContainerDatabasesRequest,
                                    ListAutonomousContainerDatabasesResponse>
                            handler);

    /**
     * Gets a list of Autonomous Database backups based on either the `autonomousDatabaseId` or `compartmentId` specified as a query parameter.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAutonomousDatabaseBackupsResponse>
            listAutonomousDatabaseBackups(
                    ListAutonomousDatabaseBackupsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousDatabaseBackupsRequest,
                                    ListAutonomousDatabaseBackupsResponse>
                            handler);

    /**
     * Lists the Autonomous Database clones for the specified Autonomous Database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAutonomousDatabaseClonesResponse> listAutonomousDatabaseClones(
            ListAutonomousDatabaseClonesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAutonomousDatabaseClonesRequest,
                            ListAutonomousDatabaseClonesResponse>
                    handler);

    /**
     * Gets a list of the Autonomous Data Guard-enabled databases associated with the specified Autonomous Database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAutonomousDatabaseDataguardAssociationsResponse>
            listAutonomousDatabaseDataguardAssociations(
                    ListAutonomousDatabaseDataguardAssociationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousDatabaseDataguardAssociationsRequest,
                                    ListAutonomousDatabaseDataguardAssociationsResponse>
                            handler);

    /**
     * Gets a list of Autonomous Databases based on the query parameters specified.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAutonomousDatabasesResponse> listAutonomousDatabases(
            ListAutonomousDatabasesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAutonomousDatabasesRequest, ListAutonomousDatabasesResponse>
                    handler);

    /**
     * Gets a list of supported Autonomous Database versions. Note that preview version software is only available for
     * databases with [shared Exadata infrastructure](https://docs.cloud.oracle.com/Content/Database/Concepts/adboverview.htm#AEI).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAutonomousDbPreviewVersionsResponse>
            listAutonomousDbPreviewVersions(
                    ListAutonomousDbPreviewVersionsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousDbPreviewVersionsRequest,
                                    ListAutonomousDbPreviewVersionsResponse>
                            handler);

    /**
     * Gets a list of supported Autonomous Database versions.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAutonomousDbVersionsResponse> listAutonomousDbVersions(
            ListAutonomousDbVersionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAutonomousDbVersionsRequest, ListAutonomousDbVersionsResponse>
                    handler);

    /**
     * Gets a list of the shapes that can be used to launch a new Autonomous Exadata Infrastructure resource. The shape determines resources to allocate (CPU cores, memory and storage).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAutonomousExadataInfrastructureShapesResponse>
            listAutonomousExadataInfrastructureShapes(
                    ListAutonomousExadataInfrastructureShapesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousExadataInfrastructureShapesRequest,
                                    ListAutonomousExadataInfrastructureShapesResponse>
                            handler);

    /**
     * Gets a list of the Autonomous Exadata Infrastructures in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAutonomousExadataInfrastructuresResponse>
            listAutonomousExadataInfrastructures(
                    ListAutonomousExadataInfrastructuresRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousExadataInfrastructuresRequest,
                                    ListAutonomousExadataInfrastructuresResponse>
                            handler);

    /**
     * Gets a list of Exadata Cloud@Customer Autonomous VM clusters in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAutonomousVmClustersResponse> listAutonomousVmClusters(
            ListAutonomousVmClustersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAutonomousVmClustersRequest, ListAutonomousVmClustersResponse>
                    handler);

    /**
     * Gets a list of backup destinations in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListBackupDestinationResponse> listBackupDestination(
            ListBackupDestinationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListBackupDestinationRequest, ListBackupDestinationResponse>
                    handler);

    /**
     * Gets a list of backups based on the `databaseId` or `compartmentId` specified. Either one of these query parameters must be provided.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListBackupsResponse> listBackups(
            ListBackupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListBackupsRequest, ListBackupsResponse> handler);

    /**
     * Gets a list of the cloud Exadata infrastructure resources in the specified compartment. Applies to Exadata Cloud Service instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCloudExadataInfrastructuresResponse>
            listCloudExadataInfrastructures(
                    ListCloudExadataInfrastructuresRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListCloudExadataInfrastructuresRequest,
                                    ListCloudExadataInfrastructuresResponse>
                            handler);

    /**
     * Gets the history of the maintenance update actions performed on the specified cloud VM cluster. Applies to Exadata Cloud Service instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCloudVmClusterUpdateHistoryEntriesResponse>
            listCloudVmClusterUpdateHistoryEntries(
                    ListCloudVmClusterUpdateHistoryEntriesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListCloudVmClusterUpdateHistoryEntriesRequest,
                                    ListCloudVmClusterUpdateHistoryEntriesResponse>
                            handler);

    /**
     * Lists the maintenance updates that can be applied to the specified cloud VM cluster. Applies to Exadata Cloud Service instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCloudVmClusterUpdatesResponse> listCloudVmClusterUpdates(
            ListCloudVmClusterUpdatesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCloudVmClusterUpdatesRequest, ListCloudVmClusterUpdatesResponse>
                    handler);

    /**
     * Gets a list of the cloud VM clusters in the specified compartment. Applies to Exadata Cloud Service instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCloudVmClustersResponse> listCloudVmClusters(
            ListCloudVmClustersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCloudVmClustersRequest, ListCloudVmClustersResponse>
                    handler);

    /**
     * Lists the console connections for the specified database node.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListConsoleConnectionsResponse> listConsoleConnections(
            ListConsoleConnectionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListConsoleConnectionsRequest, ListConsoleConnectionsResponse>
                    handler);

    /**
     * Lists the patches applicable to the requested container database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListContainerDatabasePatchesResponse> listContainerDatabasePatches(
            ListContainerDatabasePatchesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListContainerDatabasePatchesRequest,
                            ListContainerDatabasePatchesResponse>
                    handler);

    /**
     * Lists all Data Guard associations for the specified database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDataGuardAssociationsResponse> listDataGuardAssociations(
            ListDataGuardAssociationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDataGuardAssociationsRequest, ListDataGuardAssociationsResponse>
                    handler);

    /**
     * Gets a list of the database software images in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDatabaseSoftwareImagesResponse> listDatabaseSoftwareImages(
            ListDatabaseSoftwareImagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDatabaseSoftwareImagesRequest, ListDatabaseSoftwareImagesResponse>
                    handler);

    /**
     * Gets the upgrade history for a specified database in a bare metal or virtual machine DB system.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDatabaseUpgradeHistoryEntriesResponse>
            listDatabaseUpgradeHistoryEntries(
                    ListDatabaseUpgradeHistoryEntriesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseUpgradeHistoryEntriesRequest,
                                    ListDatabaseUpgradeHistoryEntriesResponse>
                            handler);

    /**
     * Gets a list of the databases in the specified Database Home.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDatabasesResponse> listDatabases(
            ListDatabasesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDatabasesRequest, ListDatabasesResponse>
                    handler);

    /**
     * Lists the history of patch operations on the specified Database Home.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDbHomePatchHistoryEntriesResponse>
            listDbHomePatchHistoryEntries(
                    ListDbHomePatchHistoryEntriesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDbHomePatchHistoryEntriesRequest,
                                    ListDbHomePatchHistoryEntriesResponse>
                            handler);

    /**
     * Lists patches applicable to the requested Database Home.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDbHomePatchesResponse> listDbHomePatches(
            ListDbHomePatchesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDbHomePatchesRequest, ListDbHomePatchesResponse>
                    handler);

    /**
     * Lists the Database Homes in the specified DB system and compartment. A Database Home is a directory where Oracle Database software is installed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDbHomesResponse> listDbHomes(
            ListDbHomesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDbHomesRequest, ListDbHomesResponse> handler);

    /**
     * Lists the database nodes in the specified DB system and compartment. A database node is a server running database software.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDbNodesResponse> listDbNodes(
            ListDbNodesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDbNodesRequest, ListDbNodesResponse> handler);

    /**
     * Gets the history of the patch actions performed on the specified DB system.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDbSystemPatchHistoryEntriesResponse>
            listDbSystemPatchHistoryEntries(
                    ListDbSystemPatchHistoryEntriesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDbSystemPatchHistoryEntriesRequest,
                                    ListDbSystemPatchHistoryEntriesResponse>
                            handler);

    /**
     * Lists the patches applicable to the specified DB system.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDbSystemPatchesResponse> listDbSystemPatches(
            ListDbSystemPatchesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDbSystemPatchesRequest, ListDbSystemPatchesResponse>
                    handler);

    /**
     * Gets a list of the shapes that can be used to launch a new DB system. The shape determines resources to allocate to the DB system - CPU cores and memory for VM shapes; CPU cores, memory and storage for non-VM (or bare metal) shapes.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDbSystemShapesResponse> listDbSystemShapes(
            ListDbSystemShapesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDbSystemShapesRequest, ListDbSystemShapesResponse>
                    handler);

    /**
     * Lists the DB systems in the specified compartment. You can specify a `backupId` to list only the DB systems that support creating a database using this backup in this compartment.
     * <p>
     **Note:** Deprecated for Exadata Cloud Service systems. Use the [new resource model APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model) instead.
     * <p>
     * For Exadata Cloud Service instances, support for this API will end on May 15th, 2021. See [Switching an Exadata DB System to the New Resource Model and APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem_topic-resource_model_conversion.htm) for details on converting existing Exadata DB systems to the new resource model.
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
     * Gets a list of supported Oracle Database versions.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDbVersionsResponse> listDbVersions(
            ListDbVersionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDbVersionsRequest, ListDbVersionsResponse>
                    handler);

    /**
     * Lists the Exadata infrastructure resources in the specified compartment. Applies to Exadata Cloud@Customer instances only.
     * To list the Exadata Cloud Service infrastructure resources in a compartment, use the  {@link #listCloudExadataInfrastructures(ListCloudExadataInfrastructuresRequest, Consumer, Consumer) listCloudExadataInfrastructures} operation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListExadataInfrastructuresResponse> listExadataInfrastructures(
            ListExadataInfrastructuresRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListExadataInfrastructuresRequest, ListExadataInfrastructuresResponse>
                    handler);

    /**
     * Gets a list of the external container databases in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListExternalContainerDatabasesResponse>
            listExternalContainerDatabases(
                    ListExternalContainerDatabasesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalContainerDatabasesRequest,
                                    ListExternalContainerDatabasesResponse>
                            handler);

    /**
     * Gets a list of the external database connectors in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListExternalDatabaseConnectorsResponse>
            listExternalDatabaseConnectors(
                    ListExternalDatabaseConnectorsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalDatabaseConnectorsRequest,
                                    ListExternalDatabaseConnectorsResponse>
                            handler);

    /**
     * Gets a list of the ExternalNonContainerDatabases in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListExternalNonContainerDatabasesResponse>
            listExternalNonContainerDatabases(
                    ListExternalNonContainerDatabasesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalNonContainerDatabasesRequest,
                                    ListExternalNonContainerDatabasesResponse>
                            handler);

    /**
     * Gets a list of the {@link #createExternalPluggableDatabaseDetails(CreateExternalPluggableDatabaseDetailsRequest, Consumer, Consumer) createExternalPluggableDatabaseDetails}
     * resources in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListExternalPluggableDatabasesResponse>
            listExternalPluggableDatabases(
                    ListExternalPluggableDatabasesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalPluggableDatabasesRequest,
                                    ListExternalPluggableDatabasesResponse>
                            handler);

    /**
     * Gets a list of the flex components that can be used to launch a new DB system. The flex component determines resources to allocate to the DB system - Database Servers and Storage Servers.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListFlexComponentsResponse> listFlexComponents(
            ListFlexComponentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListFlexComponentsRequest, ListFlexComponentsResponse>
                    handler);

    /**
     * Gets a list of supported GI versions for the Exadata Cloud@Customer VM cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListGiVersionsResponse> listGiVersions(
            ListGiVersionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListGiVersionsRequest, ListGiVersionsResponse>
                    handler);

    /**
     * Gets a list of key stores in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListKeyStoresResponse> listKeyStores(
            ListKeyStoresRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListKeyStoresRequest, ListKeyStoresResponse>
                    handler);

    /**
     * Gets a list of the maintenance runs in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListMaintenanceRunsResponse> listMaintenanceRuns(
            ListMaintenanceRunsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMaintenanceRunsRequest, ListMaintenanceRunsResponse>
                    handler);

    /**
     * Gets a list of the VM cluster networks in the specified compartment. Applies to Exadata Cloud@Customer instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVmClusterNetworksResponse> listVmClusterNetworks(
            ListVmClusterNetworksRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListVmClusterNetworksRequest, ListVmClusterNetworksResponse>
                    handler);

    /**
     * Gets the history of the patch actions performed on the specified VM cluster in an Exadata Cloud@Customer system.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVmClusterPatchHistoryEntriesResponse>
            listVmClusterPatchHistoryEntries(
                    ListVmClusterPatchHistoryEntriesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListVmClusterPatchHistoryEntriesRequest,
                                    ListVmClusterPatchHistoryEntriesResponse>
                            handler);

    /**
     * Lists the patches applicable to the specified VM cluster in an Exadata Cloud@Customer system.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVmClusterPatchesResponse> listVmClusterPatches(
            ListVmClusterPatchesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListVmClusterPatchesRequest, ListVmClusterPatchesResponse>
                    handler);

    /**
     * Lists the VM clusters in the specified compartment. Applies to Exadata Cloud@Customer instances only.
     * To list the cloud VM clusters in an Exadata Cloud Service instance, use the {@link #listCloudVmClusters(ListCloudVmClustersRequest, Consumer, Consumer) listCloudVmClusters} operation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVmClustersResponse> listVmClusters(
            ListVmClustersRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListVmClustersRequest, ListVmClustersResponse>
                    handler);

    /**
     * Migrates the Exadata DB system to the new [Exadata resource model](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model).
     * All related resources will be migrated.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<MigrateExadataDbSystemResourceModelResponse>
            migrateExadataDbSystemResourceModel(
                    MigrateExadataDbSystemResourceModelRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    MigrateExadataDbSystemResourceModelRequest,
                                    MigrateExadataDbSystemResourceModelResponse>
                            handler);

    /**
     * Changes encryption key management from customer-managed, using the [Vault service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm), to Oracle-managed.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<MigrateVaultKeyResponse> migrateVaultKey(
            MigrateVaultKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<MigrateVaultKeyRequest, MigrateVaultKeyResponse>
                    handler);

    /**
     * Asynchronously registers this Autonomous Database with Data Safe.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RegisterAutonomousDatabaseDataSafeResponse>
            registerAutonomousDatabaseDataSafe(
                    RegisterAutonomousDatabaseDataSafeRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RegisterAutonomousDatabaseDataSafeRequest,
                                    RegisterAutonomousDatabaseDataSafeResponse>
                            handler);

    /**
     * Reinstates a disabled standby Autonomous Container Database, identified by the autonomousContainerDatabaseId parameter, to an active standby Autonomous Container Database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ReinstateAutonomousContainerDatabaseDataguardAssociationResponse>
            reinstateAutonomousContainerDatabaseDataguardAssociation(
                    ReinstateAutonomousContainerDatabaseDataguardAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ReinstateAutonomousContainerDatabaseDataguardAssociationRequest,
                                    ReinstateAutonomousContainerDatabaseDataguardAssociationResponse>
                            handler);

    /**
     * Reinstates the database identified by the `databaseId` parameter into the standby role in a Data Guard association.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ReinstateDataGuardAssociationResponse>
            reinstateDataGuardAssociation(
                    ReinstateDataGuardAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ReinstateDataGuardAssociationRequest,
                                    ReinstateDataGuardAssociationResponse>
                            handler);

    /**
     * Rolling restarts the specified Autonomous Container Database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RestartAutonomousContainerDatabaseResponse>
            restartAutonomousContainerDatabase(
                    RestartAutonomousContainerDatabaseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RestartAutonomousContainerDatabaseRequest,
                                    RestartAutonomousContainerDatabaseResponse>
                            handler);

    /**
     * Restarts the specified Autonomous Database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RestartAutonomousDatabaseResponse> restartAutonomousDatabase(
            RestartAutonomousDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RestartAutonomousDatabaseRequest, RestartAutonomousDatabaseResponse>
                    handler);

    /**
     * Restores an Autonomous Database based on the provided request parameters.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RestoreAutonomousDatabaseResponse> restoreAutonomousDatabase(
            RestoreAutonomousDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RestoreAutonomousDatabaseRequest, RestoreAutonomousDatabaseResponse>
                    handler);

    /**
     * Restore a Database based on the request parameters you provide.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RestoreDatabaseResponse> restoreDatabase(
            RestoreDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<RestoreDatabaseRequest, RestoreDatabaseResponse>
                    handler);

    /**
     * Creates a new version of an existing [Vault service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RotateAutonomousContainerDatabaseEncryptionKeyResponse>
            rotateAutonomousContainerDatabaseEncryptionKey(
                    RotateAutonomousContainerDatabaseEncryptionKeyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RotateAutonomousContainerDatabaseEncryptionKeyRequest,
                                    RotateAutonomousContainerDatabaseEncryptionKeyResponse>
                            handler);

    /**
     * Rotate existing AutonomousDatabase [Vault service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RotateAutonomousDatabaseEncryptionKeyResponse>
            rotateAutonomousDatabaseEncryptionKey(
                    RotateAutonomousDatabaseEncryptionKeyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RotateAutonomousDatabaseEncryptionKeyRequest,
                                    RotateAutonomousDatabaseEncryptionKeyResponse>
                            handler);

    /**
     * Rotates Oracle REST Data Services (ORDS) certs for an Autonomous Exadata Infrastructure resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RotateOrdsCertsResponse> rotateOrdsCerts(
            RotateOrdsCertsRequest request,
            com.oracle.bmc.responses.AsyncHandler<RotateOrdsCertsRequest, RotateOrdsCertsResponse>
                    handler);

    /**
     * Rotates SSL certs for an Autonomous Exadata Infrastructure resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RotateSslCertsResponse> rotateSslCerts(
            RotateSslCertsRequest request,
            com.oracle.bmc.responses.AsyncHandler<RotateSslCertsRequest, RotateSslCertsResponse>
                    handler);

    /**
     * Creates a new version of an existing [Vault service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RotateVaultKeyResponse> rotateVaultKey(
            RotateVaultKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<RotateVaultKeyRequest, RotateVaultKeyResponse>
                    handler);

    /**
     * Scans for pluggable databases in the specified external container database.
     * This operation will return un-registered pluggable databases in the `GetWorkRequest` operation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ScanExternalContainerDatabasePluggableDatabasesResponse>
            scanExternalContainerDatabasePluggableDatabases(
                    ScanExternalContainerDatabasePluggableDatabasesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ScanExternalContainerDatabasePluggableDatabasesRequest,
                                    ScanExternalContainerDatabasePluggableDatabasesResponse>
                            handler);

    /**
     * Starts the specified Autonomous Database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<StartAutonomousDatabaseResponse> startAutonomousDatabase(
            StartAutonomousDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StartAutonomousDatabaseRequest, StartAutonomousDatabaseResponse>
                    handler);

    /**
     * Stops the specified Autonomous Database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<StopAutonomousDatabaseResponse> stopAutonomousDatabase(
            StopAutonomousDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StopAutonomousDatabaseRequest, StopAutonomousDatabaseResponse>
                    handler);

    /**
     * Switches over the primary Autonomous Container Database of an Autonomous Data Guard peer association to standby role. The standby Autonomous Container Database associated with autonomousContainerDatabaseDataguardAssociationId assumes the primary Autonomous Container Database role.
     * <p>
     * A switchover incurs no data loss.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse>
            switchoverAutonomousContainerDatabaseDataguardAssociation(
                    SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest,
                                    SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse>
                            handler);

    /**
     * Initiates a switchover of the specified Autonomous Database to the associated standby database. Applicable only to databases with Autonomous Data Guard enabled.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SwitchoverAutonomousDatabaseResponse> switchoverAutonomousDatabase(
            SwitchoverAutonomousDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SwitchoverAutonomousDatabaseRequest,
                            SwitchoverAutonomousDatabaseResponse>
                    handler);

    /**
     * Performs a switchover to transition the primary database of a Data Guard association into a standby role. The
     * standby database associated with the `dataGuardAssociationId` assumes the primary database role.
     * <p>
     * A switchover guarantees no data loss.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SwitchoverDataGuardAssociationResponse>
            switchoverDataGuardAssociation(
                    SwitchoverDataGuardAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SwitchoverDataGuardAssociationRequest,
                                    SwitchoverDataGuardAssociationResponse>
                            handler);

    /**
     * Terminates an Autonomous Container Database, which permanently deletes the container database and any databases within the container database. The database data is local to the Autonomous Exadata Infrastructure and will be lost when the container database is terminated. Oracle recommends that you back up any data in the Autonomous Container Database prior to terminating it.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<TerminateAutonomousContainerDatabaseResponse>
            terminateAutonomousContainerDatabase(
                    TerminateAutonomousContainerDatabaseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    TerminateAutonomousContainerDatabaseRequest,
                                    TerminateAutonomousContainerDatabaseResponse>
                            handler);

    /**
     * Terminates an Autonomous Exadata Infrastructure, which permanently deletes the infrastructure resource and any container databases and databases contained in the resource. The database data is local to the Autonomous Exadata Infrastructure and will be lost when the system is terminated. Oracle recommends that you back up any data in the Autonomous Exadata Infrastructure prior to terminating it.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<TerminateAutonomousExadataInfrastructureResponse>
            terminateAutonomousExadataInfrastructure(
                    TerminateAutonomousExadataInfrastructureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    TerminateAutonomousExadataInfrastructureRequest,
                                    TerminateAutonomousExadataInfrastructureResponse>
                            handler);

    /**
     * Terminates a DB system and permanently deletes it and any databases running on it, and any storage volumes attached to it. The database data is local to the DB system and will be lost when the system is terminated. Oracle recommends that you back up any data in the DB system prior to terminating it.
     * <p>
     **Note:** Deprecated for Exadata Cloud Service systems. Use the [new resource model APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model) instead.
     * <p>
     * For Exadata Cloud Service instances, support for this API will end on May 15th, 2021. See [Switching an Exadata DB System to the New Resource Model and APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem_topic-resource_model_conversion.htm) for details on converting existing Exadata DB systems to the new resource model.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<TerminateDbSystemResponse> terminateDbSystem(
            TerminateDbSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            TerminateDbSystemRequest, TerminateDbSystemResponse>
                    handler);

    /**
     * Updates the properties of an Autonomous Container Database, such as the OCPU core count and storage size.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAutonomousContainerDatabaseResponse>
            updateAutonomousContainerDatabase(
                    UpdateAutonomousContainerDatabaseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAutonomousContainerDatabaseRequest,
                                    UpdateAutonomousContainerDatabaseResponse>
                            handler);

    /**
     * Updates one or more attributes of the specified Autonomous Database. See the UpdateAutonomousDatabaseDetails resource for a full list of attributes that can be updated.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAutonomousDatabaseResponse> updateAutonomousDatabase(
            UpdateAutonomousDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateAutonomousDatabaseRequest, UpdateAutonomousDatabaseResponse>
                    handler);

    /**
     * Updates the Autonomous Database regional wallet.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAutonomousDatabaseRegionalWalletResponse>
            updateAutonomousDatabaseRegionalWallet(
                    UpdateAutonomousDatabaseRegionalWalletRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAutonomousDatabaseRegionalWalletRequest,
                                    UpdateAutonomousDatabaseRegionalWalletResponse>
                            handler);

    /**
     * Updates the wallet for the specified Autonomous Database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAutonomousDatabaseWalletResponse>
            updateAutonomousDatabaseWallet(
                    UpdateAutonomousDatabaseWalletRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAutonomousDatabaseWalletRequest,
                                    UpdateAutonomousDatabaseWalletResponse>
                            handler);

    /**
     * Updates the properties of an Autonomous Exadata Infrastructure, such as the CPU core count.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAutonomousExadataInfrastructureResponse>
            updateAutonomousExadataInfrastructure(
                    UpdateAutonomousExadataInfrastructureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAutonomousExadataInfrastructureRequest,
                                    UpdateAutonomousExadataInfrastructureResponse>
                            handler);

    /**
     * Updates the specified Autonomous VM cluster for the Exadata Cloud@Customer system.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAutonomousVmClusterResponse> updateAutonomousVmCluster(
            UpdateAutonomousVmClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateAutonomousVmClusterRequest, UpdateAutonomousVmClusterResponse>
                    handler);

    /**
     * If no database is associated with the backup destination:
     * - For a RECOVERY_APPLIANCE backup destination, updates the connection string and/or the list of VPC users.
     * - For an NFS backup destination, updates the NFS location.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateBackupDestinationResponse> updateBackupDestination(
            UpdateBackupDestinationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateBackupDestinationRequest, UpdateBackupDestinationResponse>
                    handler);

    /**
     * Updates the Cloud Exadata infrastructure resource. Applies to Exadata Cloud Service instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCloudExadataInfrastructureResponse>
            updateCloudExadataInfrastructure(
                    UpdateCloudExadataInfrastructureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateCloudExadataInfrastructureRequest,
                                    UpdateCloudExadataInfrastructureResponse>
                            handler);

    /**
     * Updates the specified cloud VM cluster. Applies to Exadata Cloud Service instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCloudVmClusterResponse> updateCloudVmCluster(
            UpdateCloudVmClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateCloudVmClusterRequest, UpdateCloudVmClusterResponse>
                    handler);

    /**
     * Updates the IORM settings for the specified cloud VM cluster in an Exadata Cloud Service instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCloudVmClusterIormConfigResponse>
            updateCloudVmClusterIormConfig(
                    UpdateCloudVmClusterIormConfigRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateCloudVmClusterIormConfigRequest,
                                    UpdateCloudVmClusterIormConfigResponse>
                            handler);

    /**
     * Update the specified database based on the request parameters provided.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDatabaseResponse> updateDatabase(
            UpdateDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateDatabaseRequest, UpdateDatabaseResponse>
                    handler);

    /**
     * Updates the properties of a Database Software Image, like Display Nmae
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDatabaseSoftwareImageResponse> updateDatabaseSoftwareImage(
            UpdateDatabaseSoftwareImageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDatabaseSoftwareImageRequest, UpdateDatabaseSoftwareImageResponse>
                    handler);

    /**
     * Patches the specified Database Home.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDbHomeResponse> updateDbHome(
            UpdateDbHomeRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateDbHomeRequest, UpdateDbHomeResponse>
                    handler);

    /**
     * Updates the properties of the specified DB system.
     * <p>
     **Note:** Deprecated for Exadata Cloud Service systems. Use the [new resource model APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model) instead.
     * <p>
     * For Exadata Cloud Service instances, support for this API will end on May 15th, 2021. See [Switching an Exadata DB System to the New Resource Model and APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem_topic-resource_model_conversion.htm) for details on converting existing Exadata DB systems to the new resource model.
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
     * Updates the Exadata infrastructure resource. Applies to Exadata Cloud@Customer instances only.
     * To update an Exadata Cloud Service infrastructure resource, use the  {@link #updateCloudExadataInfrastructure(UpdateCloudExadataInfrastructureRequest, Consumer, Consumer) updateCloudExadataInfrastructure} operation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExadataInfrastructureResponse> updateExadataInfrastructure(
            UpdateExadataInfrastructureRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateExadataInfrastructureRequest, UpdateExadataInfrastructureResponse>
                    handler);

    /**
     * Updates IORM settings for the specified Exadata DB system.
     * <p>
     **Note:** Deprecated for Exadata Cloud Service systems. Use the [new resource model APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model) instead.
     * <p>
     * For Exadata Cloud Service instances, support for this API will end on May 15th, 2021. See [Switching an Exadata DB System to the New Resource Model and APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem_topic-resource_model_conversion.htm) for details on converting existing Exadata DB systems to the new resource model.
     * <p>
     * The {@link #updateCloudVmClusterIormConfig(UpdateCloudVmClusterIormConfigRequest, Consumer, Consumer) updateCloudVmClusterIormConfig} API is used for Exadata systems using the
     * new resource model.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExadataIormConfigResponse> updateExadataIormConfig(
            UpdateExadataIormConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateExadataIormConfigRequest, UpdateExadataIormConfigResponse>
                    handler);

    /**
     * Updates the properties of
     * an {@link #createExternalContainerDatabaseDetails(CreateExternalContainerDatabaseDetailsRequest, Consumer, Consumer) createExternalContainerDatabaseDetails} resource,
     * such as the display name.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExternalContainerDatabaseResponse>
            updateExternalContainerDatabase(
                    UpdateExternalContainerDatabaseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalContainerDatabaseRequest,
                                    UpdateExternalContainerDatabaseResponse>
                            handler);

    /**
     * Updates the properties of an external database connector, such as the display name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExternalDatabaseConnectorResponse>
            updateExternalDatabaseConnector(
                    UpdateExternalDatabaseConnectorRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalDatabaseConnectorRequest,
                                    UpdateExternalDatabaseConnectorResponse>
                            handler);

    /**
     * Updates the properties of an external non-container database, such as the display name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExternalNonContainerDatabaseResponse>
            updateExternalNonContainerDatabase(
                    UpdateExternalNonContainerDatabaseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalNonContainerDatabaseRequest,
                                    UpdateExternalNonContainerDatabaseResponse>
                            handler);

    /**
     * Updates the properties of an
     * {@link #createExternalPluggableDatabaseDetails(CreateExternalPluggableDatabaseDetailsRequest, Consumer, Consumer) createExternalPluggableDatabaseDetails} resource,
     * such as the display name.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExternalPluggableDatabaseResponse>
            updateExternalPluggableDatabase(
                    UpdateExternalPluggableDatabaseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateExternalPluggableDatabaseRequest,
                                    UpdateExternalPluggableDatabaseResponse>
                            handler);

    /**
     * If no database is associated with the key store, edit the key store.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateKeyStoreResponse> updateKeyStore(
            UpdateKeyStoreRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateKeyStoreRequest, UpdateKeyStoreResponse>
                    handler);

    /**
     * Updates the properties of a maintenance run, such as the state of a maintenance run.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMaintenanceRunResponse> updateMaintenanceRun(
            UpdateMaintenanceRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateMaintenanceRunRequest, UpdateMaintenanceRunResponse>
                    handler);

    /**
     * Updates the specified VM cluster. Applies to Exadata Cloud@Customer instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateVmClusterResponse> updateVmCluster(
            UpdateVmClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateVmClusterRequest, UpdateVmClusterResponse>
                    handler);

    /**
     * Updates the specified VM cluster network. Applies to Exadata Cloud@Customer instances only.
     * To update a cloud VM cluster in an Exadata Cloud Service instance, use the {@link #updateCloudVmCluster(UpdateCloudVmClusterRequest, Consumer, Consumer) updateCloudVmCluster} operation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateVmClusterNetworkResponse> updateVmClusterNetwork(
            UpdateVmClusterNetworkRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateVmClusterNetworkRequest, UpdateVmClusterNetworkResponse>
                    handler);

    /**
     * Upgrades the specified Oracle Database instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpgradeDatabaseResponse> upgradeDatabase(
            UpgradeDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpgradeDatabaseRequest, UpgradeDatabaseResponse>
                    handler);

    /**
     * Validates the specified VM cluster network. Applies to Exadata Cloud@Customer instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ValidateVmClusterNetworkResponse> validateVmClusterNetwork(
            ValidateVmClusterNetworkRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ValidateVmClusterNetworkRequest, ValidateVmClusterNetworkResponse>
                    handler);
}
