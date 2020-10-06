/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database;

import com.oracle.bmc.database.requests.*;
import com.oracle.bmc.database.responses.*;
import com.oracle.bmc.workrequests.WorkRequest;

/**
 * The API for the Database Service. Use this API to manage resources such as databases and DB Systems. For more information, see [Overview of the Database Service](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/databaseoverview.htm).
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface Database extends AutoCloseable {

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
     * Activates the specified Exadata Cloud@Customer infrastructure.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ActivateExadataInfrastructureResponse activateExadataInfrastructure(
            ActivateExadataInfrastructureRequest request);

    /**
     * Initiates a data refresh for an Autonomous Database refreshable clone. Data is refreshed from the source database to the point of a specified timestamp.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    AutonomousDatabaseManualRefreshResponse autonomousDatabaseManualRefresh(
            AutonomousDatabaseManualRefreshRequest request);

    /**
     * Move the Autonomous Container Database and its dependent resources to the specified compartment.
     * For more information about moving Autonomous Container Databases, see
     * [Moving Database Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeAutonomousContainerDatabaseCompartmentResponse
            changeAutonomousContainerDatabaseCompartment(
                    ChangeAutonomousContainerDatabaseCompartmentRequest request);

    /**
     * Move the Autonomous Database and its dependent resources to the specified compartment.
     * For more information about moving Autonomous Databases, see
     * [Moving Database Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeAutonomousDatabaseCompartmentResponse changeAutonomousDatabaseCompartment(
            ChangeAutonomousDatabaseCompartmentRequest request);

    /**
     * Moves the Autonomous Exadata Infrastructure resource and its dependent resources to the specified compartment.
     * For more information, see
     * [Moving Database Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeAutonomousExadataInfrastructureCompartmentResponse
            changeAutonomousExadataInfrastructureCompartment(
                    ChangeAutonomousExadataInfrastructureCompartmentRequest request);

    /**
     * To move an Autonomous VM cluster and its dependent resources to another compartment, use the
     * {@link #changeAutonomousVmClusterCompartment(ChangeAutonomousVmClusterCompartmentRequest) changeAutonomousVmClusterCompartment} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeAutonomousVmClusterCompartmentResponse changeAutonomousVmClusterCompartment(
            ChangeAutonomousVmClusterCompartmentRequest request);

    /**
     * Move the backup destination and its dependent resources to the specified compartment.
     * For more information, see
     * [Moving Database Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeBackupDestinationCompartmentResponse changeBackupDestinationCompartment(
            ChangeBackupDestinationCompartmentRequest request);

    /**
     * To move a cloud Exadata infrastructure resource and its dependent resources to another compartment, use the
     * {@link #changeCloudExadataInfrastructureCompartment(ChangeCloudExadataInfrastructureCompartmentRequest) changeCloudExadataInfrastructureCompartment} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeCloudExadataInfrastructureCompartmentResponse changeCloudExadataInfrastructureCompartment(
            ChangeCloudExadataInfrastructureCompartmentRequest request);

    /**
     * To move a cloud VM cluster and its dependent resources to another compartment, use the
     * {@link #changeCloudVmClusterCompartment(ChangeCloudVmClusterCompartmentRequest) changeCloudVmClusterCompartment} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeCloudVmClusterCompartmentResponse changeCloudVmClusterCompartment(
            ChangeCloudVmClusterCompartmentRequest request);

    /**
     * Move the Database Software Image and its dependent resources to the specified compartment.
     * For more information about moving Databse Software Images, see
     * [Moving Database Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeDatabaseSoftwareImageCompartmentResponse changeDatabaseSoftwareImageCompartment(
            ChangeDatabaseSoftwareImageCompartmentRequest request);

    /**
     * Move the DB system and its dependent resources to the specified compartment.
     * For more information about moving DB systems, see
     * [Moving Database Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeDbSystemCompartmentResponse changeDbSystemCompartment(
            ChangeDbSystemCompartmentRequest request);

    /**
     * To move an Exadata Cloud@Customer infrastructure resource and its dependent resources to another compartment, use the
     * {@link #changeExadataInfrastructureCompartment(ChangeExadataInfrastructureCompartmentRequest) changeExadataInfrastructureCompartment} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeExadataInfrastructureCompartmentResponse changeExadataInfrastructureCompartment(
            ChangeExadataInfrastructureCompartmentRequest request);

    /**
     * To move an Exadata Cloud@Customer VM cluster and its dependent resources to another compartment, use the
     * {@link #changeVmClusterCompartment(ChangeVmClusterCompartmentRequest) changeVmClusterCompartment} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeVmClusterCompartmentResponse changeVmClusterCompartment(
            ChangeVmClusterCompartmentRequest request);

    /**
     * Changes the status of the standalone backup resource to `ACTIVE` after the backup is created from the on-premises database and placed in Oracle Cloud Infrastructure Object Storage.
     * <p>
     **Note:** This API is used by an Oracle Cloud Infrastructure Python script that is packaged with the Oracle Cloud Infrastructure CLI. Oracle recommends that you use the script instead using the API directly. See [Migrating an On-Premises Database to Oracle Cloud Infrastructure by Creating a Backup in the Cloud](https://docs.cloud.oracle.com/Content/Database/Tasks/mig-onprembackup.htm) for more information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CompleteExternalBackupJobResponse completeExternalBackupJob(
            CompleteExternalBackupJobRequest request);

    /**
     * Creates an Autonomous Container Database in the specified Autonomous Exadata Infrastructure.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateAutonomousContainerDatabaseResponse createAutonomousContainerDatabase(
            CreateAutonomousContainerDatabaseRequest request);

    /**
     * **Deprecated.** To create a new Autonomous Data Warehouse, use the {@link #createAutonomousDatabase(CreateAutonomousDatabaseRequest) createAutonomousDatabase} operation and specify `DW` as the workload type.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateAutonomousDataWarehouseResponse createAutonomousDataWarehouse(
            CreateAutonomousDataWarehouseRequest request);

    /**
     * **Deprecated.** To create a new Autonomous Data Warehouse backup for a specified database, use the {@link #createAutonomousDatabaseBackup(CreateAutonomousDatabaseBackupRequest) createAutonomousDatabaseBackup} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateAutonomousDataWarehouseBackupResponse createAutonomousDataWarehouseBackup(
            CreateAutonomousDataWarehouseBackupRequest request);

    /**
     * Creates a new Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateAutonomousDatabaseResponse createAutonomousDatabase(
            CreateAutonomousDatabaseRequest request);

    /**
     * Creates a new Autonomous Database backup for the specified database based on the provided request parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateAutonomousDatabaseBackupResponse createAutonomousDatabaseBackup(
            CreateAutonomousDatabaseBackupRequest request);

    /**
     * Creates an Autonomous VM cluster for Exadata Cloud@Customer.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateAutonomousVmClusterResponse createAutonomousVmCluster(
            CreateAutonomousVmClusterRequest request);

    /**
     * Creates a new backup in the specified database based on the request parameters you provide. If you previously used RMAN or dbcli to configure backups and then you switch to using the Console or the API for backups, a new backup configuration is created and associated with your database. This means that you can no longer rely on your previously configured unmanaged backups to work.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateBackupResponse createBackup(CreateBackupRequest request);

    /**
     * Creates a backup destination in an Exadata Cloud@Customer system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateBackupDestinationResponse createBackupDestination(CreateBackupDestinationRequest request);

    /**
     * Creates a cloud Exadata infrastructure resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateCloudExadataInfrastructureResponse createCloudExadataInfrastructure(
            CreateCloudExadataInfrastructureRequest request);

    /**
     * Creates a cloud VM cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateCloudVmClusterResponse createCloudVmCluster(CreateCloudVmClusterRequest request);

    /**
     * Creates a new console connection to the specified database node.
     * After the console connection has been created and is available,
     * you connect to the console using SSH.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateConsoleConnectionResponse createConsoleConnection(CreateConsoleConnectionRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateDataGuardAssociationResponse createDataGuardAssociation(
            CreateDataGuardAssociationRequest request);

    /**
     * Creates a new database in the specified Database Home. If the database version is provided, it must match the version of the Database Home. Applies to Exadata and Exadata Cloud@Customer systems.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateDatabaseResponse createDatabase(CreateDatabaseRequest request);

    /**
     * create database software image in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateDatabaseSoftwareImageResponse createDatabaseSoftwareImage(
            CreateDatabaseSoftwareImageRequest request);

    /**
     * Creates a new Database Home in the specified database system based on the request parameters you provide. Applies to bare metal DB systems, Exadata systems, and Exadata Cloud@Customer systems.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateDbHomeResponse createDbHome(CreateDbHomeRequest request);

    /**
     * Creates Exadata Cloud@Customer infrastructure.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateExadataInfrastructureResponse createExadataInfrastructure(
            CreateExadataInfrastructureRequest request);

    /**
     * Creates a new backup resource and returns the information the caller needs to back up an on-premises Oracle Database to Oracle Cloud Infrastructure.
     * <p>
     **Note:** This API is used by an Oracle Cloud Infrastructure Python script that is packaged with the Oracle Cloud Infrastructure CLI. Oracle recommends that you use the script instead using the API directly. See [Migrating an On-Premises Database to Oracle Cloud Infrastructure by Creating a Backup in the Cloud](https://docs.cloud.oracle.com/Content/Database/Tasks/mig-onprembackup.htm) for more information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateExternalBackupJobResponse createExternalBackupJob(CreateExternalBackupJobRequest request);

    /**
     * Creates an Exadata Cloud@Customer VM cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateVmClusterResponse createVmCluster(CreateVmClusterRequest request);

    /**
     * Creates the Exadata Cloud@Customer VM cluster network.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateVmClusterNetworkResponse createVmClusterNetwork(CreateVmClusterNetworkRequest request);

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
     * ({@link #terminateDbSystem(TerminateDbSystemRequest) terminateDbSystem})
     * to remove its resources from billing and quotas.
     * *Virtual machine DB systems* - Stopping a node stops billing for all OCPUs associated with that node, and billing resumes when you restart the node.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DbNodeActionResponse dbNodeAction(DbNodeActionRequest request);

    /**
     * **Deprecated.** To delete an Autonomous Data Warehouse, use the {@link #deleteAutonomousDatabase(DeleteAutonomousDatabaseRequest) deleteAutonomousDatabase} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteAutonomousDataWarehouseResponse deleteAutonomousDataWarehouse(
            DeleteAutonomousDataWarehouseRequest request);

    /**
     * Deletes the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteAutonomousDatabaseResponse deleteAutonomousDatabase(
            DeleteAutonomousDatabaseRequest request);

    /**
     * Deletes the specified Autonomous VM cluster in an Exadata Cloud@Customer system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteAutonomousVmClusterResponse deleteAutonomousVmCluster(
            DeleteAutonomousVmClusterRequest request);

    /**
     * Deletes a full backup. You cannot delete automatic backups using this API.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteBackupResponse deleteBackup(DeleteBackupRequest request);

    /**
     * Deletes a backup destination in an Exadata Cloud@Customer system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteBackupDestinationResponse deleteBackupDestination(DeleteBackupDestinationRequest request);

    /**
     * Deletes the cloud Exadata infrastructure resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteCloudExadataInfrastructureResponse deleteCloudExadataInfrastructure(
            DeleteCloudExadataInfrastructureRequest request);

    /**
     * Deletes the specified cloud VM cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteCloudVmClusterResponse deleteCloudVmCluster(DeleteCloudVmClusterRequest request);

    /**
     * Deletes the specified database node console connection.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteConsoleConnectionResponse deleteConsoleConnection(DeleteConsoleConnectionRequest request);

    /**
     * Deletes the specified database. Applies only to Exadata systems.
     * <p>
     * The data in this database is local to the Exadata system and will be lost when the database is deleted. Oracle recommends that you back up any data in the Exadata system prior to deleting it. You can use the `performFinalBackup` parameter to have the Exadata system database backed up before it is deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request);

    /**
     * Delete a database software image
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteDatabaseSoftwareImageResponse deleteDatabaseSoftwareImage(
            DeleteDatabaseSoftwareImageRequest request);

    /**
     * Deletes a Database Home. Applies to bare metal DB systems, Exadata Cloud Service, and Exadata Cloud@Customer systems.
     * <p>
     * Oracle recommends that you use the `performFinalBackup` parameter to back up any data on a bare metal DB system before you delete a Database Home. On an Exadata Cloud@Customer system or an Exadata Cloud Service system, you can delete a Database Home only when there are no databases in it and therefore you cannot use the `performFinalBackup` parameter to back up data.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteDbHomeResponse deleteDbHome(DeleteDbHomeRequest request);

    /**
     * Deletes the Exadata Cloud@Customer infrastructure.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteExadataInfrastructureResponse deleteExadataInfrastructure(
            DeleteExadataInfrastructureRequest request);

    /**
     * Deletes the specified Exadata Cloud@Customer VM cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteVmClusterResponse deleteVmCluster(DeleteVmClusterRequest request);

    /**
     * Deletes the specified Exadata Cloud@Customer VM cluster network.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteVmClusterNetworkResponse deleteVmClusterNetwork(DeleteVmClusterNetworkRequest request);

    /**
     * Asynchronously deregisters this Autonomous Database with Data Safe.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeregisterAutonomousDatabaseDataSafeResponse deregisterAutonomousDatabaseDataSafe(
            DeregisterAutonomousDatabaseDataSafeRequest request);

    /**
     * Downloads the configuration file for the specified Exadata Cloud@Customer infrastructure.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DownloadExadataInfrastructureConfigFileResponse downloadExadataInfrastructureConfigFile(
            DownloadExadataInfrastructureConfigFileRequest request);

    /**
     * Downloads the configuration file for the specified Exadata Cloud@Customer VM cluster network.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DownloadVmClusterNetworkConfigFileResponse downloadVmClusterNetworkConfigFile(
            DownloadVmClusterNetworkConfigFileRequest request);

    /**
     * Initiates a failover the specified Autonomous Database to a standby.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    FailOverAutonomousDatabaseResponse failOverAutonomousDatabase(
            FailOverAutonomousDatabaseRequest request);

    /**
     * Performs a failover to transition the standby database identified by the `databaseId` parameter into the
     * specified Data Guard association's primary role after the existing primary database fails or becomes unreachable.
     * <p>
     * A failover might result in data loss depending on the protection mode in effect at the time of the primary
     * database failure.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    FailoverDataGuardAssociationResponse failoverDataGuardAssociation(
            FailoverDataGuardAssociationRequest request);

    /**
     * **Deprecated.** To create and download a wallet for an Autonomous Data Warehouse, use the {@link #generateAutonomousDatabaseWallet(GenerateAutonomousDatabaseWalletRequest) generateAutonomousDatabaseWallet} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GenerateAutonomousDataWarehouseWalletResponse generateAutonomousDataWarehouseWallet(
            GenerateAutonomousDataWarehouseWalletRequest request);

    /**
     * Creates and downloads a wallet for the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GenerateAutonomousDatabaseWalletResponse generateAutonomousDatabaseWallet(
            GenerateAutonomousDatabaseWalletRequest request);

    /**
     * Generates a recommended Cloud@Customer VM cluster network configuration.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GenerateRecommendedVmClusterNetworkResponse generateRecommendedVmClusterNetwork(
            GenerateRecommendedVmClusterNetworkRequest request);

    /**
     * Gets information about the specified Autonomous Container Database.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetAutonomousContainerDatabaseResponse getAutonomousContainerDatabase(
            GetAutonomousContainerDatabaseRequest request);

    /**
     * **Deprecated.** To get the details of an Autonomous Data Warehouse, use the {@link #getAutonomousDatabase(GetAutonomousDatabaseRequest) getAutonomousDatabase} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetAutonomousDataWarehouseResponse getAutonomousDataWarehouse(
            GetAutonomousDataWarehouseRequest request);

    /**
     * **Deprecated.** To get information about a specified Autonomous Data Warehouse backup, use the {@link #getAutonomousDatabaseBackup(GetAutonomousDatabaseBackupRequest) getAutonomousDatabaseBackup} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetAutonomousDataWarehouseBackupResponse getAutonomousDataWarehouseBackup(
            GetAutonomousDataWarehouseBackupRequest request);

    /**
     * Gets the details of the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetAutonomousDatabaseResponse getAutonomousDatabase(GetAutonomousDatabaseRequest request);

    /**
     * Gets information about the specified Autonomous Database backup.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetAutonomousDatabaseBackupResponse getAutonomousDatabaseBackup(
            GetAutonomousDatabaseBackupRequest request);

    /**
     * Gets the Autonomous Database regional wallet details.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetAutonomousDatabaseRegionalWalletResponse getAutonomousDatabaseRegionalWallet(
            GetAutonomousDatabaseRegionalWalletRequest request);

    /**
     * Gets the wallet details for the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetAutonomousDatabaseWalletResponse getAutonomousDatabaseWallet(
            GetAutonomousDatabaseWalletRequest request);

    /**
     * Gets information about the specified Autonomous Exadata Infrastructure resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetAutonomousExadataInfrastructureResponse getAutonomousExadataInfrastructure(
            GetAutonomousExadataInfrastructureRequest request);

    /**
     * Gets information about a specific autonomous patch.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetAutonomousPatchResponse getAutonomousPatch(GetAutonomousPatchRequest request);

    /**
     * Gets information about the specified Autonomous VM cluster for an Exadata Cloud@Customer system.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetAutonomousVmClusterResponse getAutonomousVmCluster(GetAutonomousVmClusterRequest request);

    /**
     * Gets information about the specified backup.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetBackupResponse getBackup(GetBackupRequest request);

    /**
     * Gets information about the specified backup destination in an Exadata Cloud@Customer system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetBackupDestinationResponse getBackupDestination(GetBackupDestinationRequest request);

    /**
     * Gets information about the specified cloud Exadata infrastructure resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetCloudExadataInfrastructureResponse getCloudExadataInfrastructure(
            GetCloudExadataInfrastructureRequest request);

    /**
     * Gets information about the specified cloud VM cluster.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetCloudVmClusterResponse getCloudVmCluster(GetCloudVmClusterRequest request);

    /**
     * Gets the IORM configuration for the specified cloud VM cluster.
     * If you have not specified an IORM configuration, the default configuration is returned.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetCloudVmClusterIormConfigResponse getCloudVmClusterIormConfig(
            GetCloudVmClusterIormConfigRequest request);

    /**
     * Gets information about a specified maintenance update package.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetCloudVmClusterUpdateResponse getCloudVmClusterUpdate(GetCloudVmClusterUpdateRequest request);

    /**
     * Gets the maintenance update history details for the specified update history entry.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetCloudVmClusterUpdateHistoryEntryResponse getCloudVmClusterUpdateHistoryEntry(
            GetCloudVmClusterUpdateHistoryEntryRequest request);

    /**
     * Gets the specified database node console connection's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetConsoleConnectionResponse getConsoleConnection(GetConsoleConnectionRequest request);

    /**
     * Gets the specified Data Guard association's configuration information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDataGuardAssociationResponse getDataGuardAssociation(GetDataGuardAssociationRequest request);

    /**
     * Gets information about the specified database.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDatabaseResponse getDatabase(GetDatabaseRequest request);

    /**
     * Gets information about the specified database software image.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDatabaseSoftwareImageResponse getDatabaseSoftwareImage(
            GetDatabaseSoftwareImageRequest request);

    /**
     * Gets information about the specified Database Home.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDbHomeResponse getDbHome(GetDbHomeRequest request);

    /**
     * Gets information about a specified patch package.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDbHomePatchResponse getDbHomePatch(GetDbHomePatchRequest request);

    /**
     * Gets the patch history details for the specified patchHistoryEntryId
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDbHomePatchHistoryEntryResponse getDbHomePatchHistoryEntry(
            GetDbHomePatchHistoryEntryRequest request);

    /**
     * Gets information about the specified database node.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDbNodeResponse getDbNode(GetDbNodeRequest request);

    /**
     * Gets information about the specified DB system.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDbSystemResponse getDbSystem(GetDbSystemRequest request);

    /**
     * Gets information the specified patch.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDbSystemPatchResponse getDbSystemPatch(GetDbSystemPatchRequest request);

    /**
     * Gets the details of the specified patch operation on the specified DB system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDbSystemPatchHistoryEntryResponse getDbSystemPatchHistoryEntry(
            GetDbSystemPatchHistoryEntryRequest request);

    /**
     * Gets information about the specified Exadata Cloud@Customer infrastructure.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetExadataInfrastructureResponse getExadataInfrastructure(
            GetExadataInfrastructureRequest request);

    /**
     * Gets details of the available and consumed OCPUs for the specified Autonomous Exadata Infrastructure resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetExadataInfrastructureOcpusResponse getExadataInfrastructureOcpus(
            GetExadataInfrastructureOcpusRequest request);

    /**
     * Gets the IORM configuration settings for the specified cloud Exadata system.
     * All Exadata service instances have default IORM settings.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetExadataIormConfigResponse getExadataIormConfig(GetExadataIormConfigRequest request);

    /**
     * Gets information about the specified external backup job.
     * <p>
     **Note:** This API is used by an Oracle Cloud Infrastructure Python script that is packaged with the Oracle Cloud Infrastructure CLI. Oracle recommends that you use the script instead using the API directly. See [Migrating an On-Premises Database to Oracle Cloud Infrastructure by Creating a Backup in the Cloud](https://docs.cloud.oracle.com/Content/Database/Tasks/mig-onprembackup.htm) for more information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetExternalBackupJobResponse getExternalBackupJob(GetExternalBackupJobRequest request);

    /**
     * Gets information about the specified maintenance run.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetMaintenanceRunResponse getMaintenanceRun(GetMaintenanceRunRequest request);

    /**
     * Gets information about the specified Exadata Cloud@Customer VM cluster.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVmClusterResponse getVmCluster(GetVmClusterRequest request);

    /**
     * Gets information about the specified Exadata Cloud@Customer VM cluster network.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVmClusterNetworkResponse getVmClusterNetwork(GetVmClusterNetworkRequest request);

    /**
     * Gets information about a specified patch package.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVmClusterPatchResponse getVmClusterPatch(GetVmClusterPatchRequest request);

    /**
     * Gets the patch history details for the specified patch history entry.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVmClusterPatchHistoryEntryResponse getVmClusterPatchHistoryEntry(
            GetVmClusterPatchHistoryEntryRequest request);

    /**
     * Creates a new Autonomous Exadata Infrastructure in the specified compartment and availability domain.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    LaunchAutonomousExadataInfrastructureResponse launchAutonomousExadataInfrastructure(
            LaunchAutonomousExadataInfrastructureRequest request);

    /**
     * Creates a new DB system in the specified compartment and availability domain. The Oracle
     * Database edition that you specify applies to all the databases on that DB system. The selected edition cannot be changed.
     * <p>
     * An initial database is created on the DB system based on the request parameters you provide and some default
     * options. For detailed information about default options, see the following:
     * <p>
     * - [Bare metal and virtual machine DB system default options](https://docs.cloud.oracle.com/Content/Database/Tasks/creatingDBsystem.htm#DefaultOptionsfortheInitialDatabase)
     * - [Exadata DB system default options](https://docs.cloud.oracle.com/Content/Database/Tasks/exacreatingDBsystem.htm#DefaultOptionsfortheInitialDatabase)
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    LaunchDbSystemResponse launchDbSystem(LaunchDbSystemRequest request);

    /**
     * Gets a list of the Autonomous Container Databases in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAutonomousContainerDatabasesResponse listAutonomousContainerDatabases(
            ListAutonomousContainerDatabasesRequest request);

    /**
     * **Deprecated.** To get a list of Autonomous Data Warehouse backups, use the {@link #listAutonomousDatabaseBackups(ListAutonomousDatabaseBackupsRequest) listAutonomousDatabaseBackups} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAutonomousDataWarehouseBackupsResponse listAutonomousDataWarehouseBackups(
            ListAutonomousDataWarehouseBackupsRequest request);

    /**
     * **Deprecated.** To get a list of Autonomous Data Warehouses, use the {@link #listAutonomousDatabases(ListAutonomousDatabasesRequest) listAutonomousDatabases} operation and specify `DW` as the workload type.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAutonomousDataWarehousesResponse listAutonomousDataWarehouses(
            ListAutonomousDataWarehousesRequest request);

    /**
     * Gets a list of Autonomous Database backups based on either the `autonomousDatabaseId` or `compartmentId` specified as a query parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAutonomousDatabaseBackupsResponse listAutonomousDatabaseBackups(
            ListAutonomousDatabaseBackupsRequest request);

    /**
     * Lists the Autonomous Database clones for the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAutonomousDatabaseClonesResponse listAutonomousDatabaseClones(
            ListAutonomousDatabaseClonesRequest request);

    /**
     * Gets a list of Autonomous Databases based on the query parameters specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAutonomousDatabasesResponse listAutonomousDatabases(ListAutonomousDatabasesRequest request);

    /**
     * Gets a list of supported Autonomous Database versions. Note that preview version software is only available for
     * databases with [shared Exadata infrastructure](https://docs.cloud.oracle.com/Content/Database/Concepts/adboverview.htm#AEI).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAutonomousDbPreviewVersionsResponse listAutonomousDbPreviewVersions(
            ListAutonomousDbPreviewVersionsRequest request);

    /**
     * Gets a list of supported Autonomous Database versions.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAutonomousDbVersionsResponse listAutonomousDbVersions(
            ListAutonomousDbVersionsRequest request);

    /**
     * Gets a list of the shapes that can be used to launch a new Autonomous Exadata Infrastructure resource. The shape determines resources to allocate (CPU cores, memory and storage).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAutonomousExadataInfrastructureShapesResponse listAutonomousExadataInfrastructureShapes(
            ListAutonomousExadataInfrastructureShapesRequest request);

    /**
     * Gets a list of the Autonomous Exadata Infrastructures in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAutonomousExadataInfrastructuresResponse listAutonomousExadataInfrastructures(
            ListAutonomousExadataInfrastructuresRequest request);

    /**
     * Gets a list of Exadata Cloud@Customer Autonomous VM clusters in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAutonomousVmClustersResponse listAutonomousVmClusters(
            ListAutonomousVmClustersRequest request);

    /**
     * Gets a list of backup destinations in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListBackupDestinationResponse listBackupDestination(ListBackupDestinationRequest request);

    /**
     * Gets a list of backups based on the `databaseId` or `compartmentId` specified. Either one of these query parameters must be provided.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListBackupsResponse listBackups(ListBackupsRequest request);

    /**
     * Gets a list of the cloud Exadata infrastructure in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListCloudExadataInfrastructuresResponse listCloudExadataInfrastructures(
            ListCloudExadataInfrastructuresRequest request);

    /**
     * Gets the history of the maintenance update actions performed on the specified cloud VM cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListCloudVmClusterUpdateHistoryEntriesResponse listCloudVmClusterUpdateHistoryEntries(
            ListCloudVmClusterUpdateHistoryEntriesRequest request);

    /**
     * Lists the maintenance updates that can be applied to the requested cloud VM cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListCloudVmClusterUpdatesResponse listCloudVmClusterUpdates(
            ListCloudVmClusterUpdatesRequest request);

    /**
     * Gets a list of the cloud VM clusters in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListCloudVmClustersResponse listCloudVmClusters(ListCloudVmClustersRequest request);

    /**
     * Lists the console connections for the specified database node.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListConsoleConnectionsResponse listConsoleConnections(ListConsoleConnectionsRequest request);

    /**
     * Lists the patches applicable to the requested container database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListContainerDatabasePatchesResponse listContainerDatabasePatches(
            ListContainerDatabasePatchesRequest request);

    /**
     * Lists all Data Guard associations for the specified database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDataGuardAssociationsResponse listDataGuardAssociations(
            ListDataGuardAssociationsRequest request);

    /**
     * Gets a list of the database software images in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDatabaseSoftwareImagesResponse listDatabaseSoftwareImages(
            ListDatabaseSoftwareImagesRequest request);

    /**
     * Gets a list of the databases in the specified Database Home.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDatabasesResponse listDatabases(ListDatabasesRequest request);

    /**
     * Lists the history of patch operations on the specified Database Home.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDbHomePatchHistoryEntriesResponse listDbHomePatchHistoryEntries(
            ListDbHomePatchHistoryEntriesRequest request);

    /**
     * Lists patches applicable to the requested Database Home.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDbHomePatchesResponse listDbHomePatches(ListDbHomePatchesRequest request);

    /**
     * Lists the Database Homes in the specified DB system and compartment. A Database Home is a directory where Oracle Database software is installed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDbHomesResponse listDbHomes(ListDbHomesRequest request);

    /**
     * Lists the database nodes in the specified DB system and compartment. A database node is a server running database software.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDbNodesResponse listDbNodes(ListDbNodesRequest request);

    /**
     * Gets the history of the patch actions performed on the specified DB system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDbSystemPatchHistoryEntriesResponse listDbSystemPatchHistoryEntries(
            ListDbSystemPatchHistoryEntriesRequest request);

    /**
     * Lists the patches applicable to the specified DB system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDbSystemPatchesResponse listDbSystemPatches(ListDbSystemPatchesRequest request);

    /**
     * Gets a list of the shapes that can be used to launch a new DB system. The shape determines resources to allocate to the DB system - CPU cores and memory for VM shapes; CPU cores, memory and storage for non-VM (or bare metal) shapes.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDbSystemShapesResponse listDbSystemShapes(ListDbSystemShapesRequest request);

    /**
     * Lists the DB systems in the specified compartment. You can specify a `backupId` to list only the DB systems that support creating a database using this backup in this compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDbSystemsResponse listDbSystems(ListDbSystemsRequest request);

    /**
     * Gets a list of supported Oracle Database versions.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDbVersionsResponse listDbVersions(ListDbVersionsRequest request);

    /**
     * Gets a list of the Exadata Cloud@Customer infrastructure resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListExadataInfrastructuresResponse listExadataInfrastructures(
            ListExadataInfrastructuresRequest request);

    /**
     * Gets a list of supported GI versions for the Exadata Cloud@Customer VM cluster.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListGiVersionsResponse listGiVersions(ListGiVersionsRequest request);

    /**
     * Gets a list of the maintenance runs in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListMaintenanceRunsResponse listMaintenanceRuns(ListMaintenanceRunsRequest request);

    /**
     * Gets a list of the Exadata Cloud@Customer VM cluster networks in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListVmClusterNetworksResponse listVmClusterNetworks(ListVmClusterNetworksRequest request);

    /**
     * Gets the history of the patch actions performed on the specified VM cluster in an Exadata Cloud@Customer system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListVmClusterPatchHistoryEntriesResponse listVmClusterPatchHistoryEntries(
            ListVmClusterPatchHistoryEntriesRequest request);

    /**
     * Lists the patches applicable to the specified VM cluster in an Exadata Cloud@Customer system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListVmClusterPatchesResponse listVmClusterPatches(ListVmClusterPatchesRequest request);

    /**
     * Gets a list of the Exadata Cloud@Customer VM clusters in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListVmClustersResponse listVmClusters(ListVmClustersRequest request);

    /**
     * Migrates the Exadata DB system to the cloud Exadata infrastructure model. All related resources will be migrated.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    MigrateExadataDbSystemResourceModelResponse migrateExadataDbSystemResourceModel(
            MigrateExadataDbSystemResourceModelRequest request);

    /**
     * Asynchronously registers this Autonomous Database with Data Safe.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    RegisterAutonomousDatabaseDataSafeResponse registerAutonomousDatabaseDataSafe(
            RegisterAutonomousDatabaseDataSafeRequest request);

    /**
     * Reinstates the database identified by the `databaseId` parameter into the standby role in a Data Guard association.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ReinstateDataGuardAssociationResponse reinstateDataGuardAssociation(
            ReinstateDataGuardAssociationRequest request);

    /**
     * Rolling restarts the specified Autonomous Container Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    RestartAutonomousContainerDatabaseResponse restartAutonomousContainerDatabase(
            RestartAutonomousContainerDatabaseRequest request);

    /**
     * Restarts the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    RestartAutonomousDatabaseResponse restartAutonomousDatabase(
            RestartAutonomousDatabaseRequest request);

    /**
     * **Deprecated.** To restore an Autonomous Data Warehouse, use the {@link #restoreAutonomousDatabase(RestoreAutonomousDatabaseRequest) restoreAutonomousDatabase} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    RestoreAutonomousDataWarehouseResponse restoreAutonomousDataWarehouse(
            RestoreAutonomousDataWarehouseRequest request);

    /**
     * Restores an Autonomous Database based on the provided request parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    RestoreAutonomousDatabaseResponse restoreAutonomousDatabase(
            RestoreAutonomousDatabaseRequest request);

    /**
     * Restore a Database based on the request parameters you provide.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    RestoreDatabaseResponse restoreDatabase(RestoreDatabaseRequest request);

    /**
     * Creates a new version of an existing [Vault service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    RotateAutonomousContainerDatabaseEncryptionKeyResponse
            rotateAutonomousContainerDatabaseEncryptionKey(
                    RotateAutonomousContainerDatabaseEncryptionKeyRequest request);

    /**
     * Rotate existing AutonomousDatabase [Vault service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    RotateAutonomousDatabaseEncryptionKeyResponse rotateAutonomousDatabaseEncryptionKey(
            RotateAutonomousDatabaseEncryptionKeyRequest request);

    /**
     * **Deprecated.** To start an Autonomous Data Warehouse, use the {@link #startAutonomousDatabase(StartAutonomousDatabaseRequest) startAutonomousDatabase} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    StartAutonomousDataWarehouseResponse startAutonomousDataWarehouse(
            StartAutonomousDataWarehouseRequest request);

    /**
     * Starts the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    StartAutonomousDatabaseResponse startAutonomousDatabase(StartAutonomousDatabaseRequest request);

    /**
     * **Deprecated.** To stop an Autonomous Data Warehouse, use the {@link #stopAutonomousDatabase(StopAutonomousDatabaseRequest) stopAutonomousDatabase} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    StopAutonomousDataWarehouseResponse stopAutonomousDataWarehouse(
            StopAutonomousDataWarehouseRequest request);

    /**
     * Stops the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    StopAutonomousDatabaseResponse stopAutonomousDatabase(StopAutonomousDatabaseRequest request);

    /**
     * Initiates a switchover of the specified Autonomous Database to the associated standby database. Applicable only to databases with Autonomous Data Guard enabled.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    SwitchoverAutonomousDatabaseResponse switchoverAutonomousDatabase(
            SwitchoverAutonomousDatabaseRequest request);

    /**
     * Performs a switchover to transition the primary database of a Data Guard association into a standby role. The
     * standby database associated with the `dataGuardAssociationId` assumes the primary database role.
     * <p>
     * A switchover guarantees no data loss.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    SwitchoverDataGuardAssociationResponse switchoverDataGuardAssociation(
            SwitchoverDataGuardAssociationRequest request);

    /**
     * Terminates an Autonomous Container Database, which permanently deletes the container database and any databases within the container database. The database data is local to the Autonomous Exadata Infrastructure and will be lost when the container database is terminated. Oracle recommends that you back up any data in the Autonomous Container Database prior to terminating it.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    TerminateAutonomousContainerDatabaseResponse terminateAutonomousContainerDatabase(
            TerminateAutonomousContainerDatabaseRequest request);

    /**
     * Terminates an Autonomous Exadata Infrastructure, which permanently deletes the infrastructure resource and any container databases and databases contained in the resource. The database data is local to the Autonomous Exadata Infrastructure and will be lost when the system is terminated. Oracle recommends that you back up any data in the Autonomous Exadata Infrastructure prior to terminating it.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    TerminateAutonomousExadataInfrastructureResponse terminateAutonomousExadataInfrastructure(
            TerminateAutonomousExadataInfrastructureRequest request);

    /**
     * Terminates a DB system and permanently deletes it and any databases running on it, and any storage volumes attached to it. The database data is local to the DB system and will be lost when the system is terminated. Oracle recommends that you back up any data in the DB system prior to terminating it.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    TerminateDbSystemResponse terminateDbSystem(TerminateDbSystemRequest request);

    /**
     * Updates the properties of an Autonomous Container Database, such as the OCPU core count and storage size.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateAutonomousContainerDatabaseResponse updateAutonomousContainerDatabase(
            UpdateAutonomousContainerDatabaseRequest request);

    /**
     * **Deprecated.** To update the CPU core count and storage size of an Autonomous Data Warehouse, use the {@link #updateAutonomousDatabase(UpdateAutonomousDatabaseRequest) updateAutonomousDatabase} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateAutonomousDataWarehouseResponse updateAutonomousDataWarehouse(
            UpdateAutonomousDataWarehouseRequest request);

    /**
     * Updates one or more attributes of the specified Autonomous Database. See the UpdateAutonomousDatabaseDetails resource for a full list of attributes that can be updated.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateAutonomousDatabaseResponse updateAutonomousDatabase(
            UpdateAutonomousDatabaseRequest request);

    /**
     * Updates the Autonomous Database regional wallet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateAutonomousDatabaseRegionalWalletResponse updateAutonomousDatabaseRegionalWallet(
            UpdateAutonomousDatabaseRegionalWalletRequest request);

    /**
     * Updates the wallet for the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateAutonomousDatabaseWalletResponse updateAutonomousDatabaseWallet(
            UpdateAutonomousDatabaseWalletRequest request);

    /**
     * Updates the properties of an Autonomous Exadata Infrastructure, such as the CPU core count.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateAutonomousExadataInfrastructureResponse updateAutonomousExadataInfrastructure(
            UpdateAutonomousExadataInfrastructureRequest request);

    /**
     * Updates the specified Autonomous VM cluster for the Exadata Cloud@Customer system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateAutonomousVmClusterResponse updateAutonomousVmCluster(
            UpdateAutonomousVmClusterRequest request);

    /**
     * If no database is associated with the backup destination:
     * - For a RECOVERY_APPLIANCE backup destination, updates the connection string and/or the list of VPC users.
     * - For an NFS backup destination, updates the NFS location.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateBackupDestinationResponse updateBackupDestination(UpdateBackupDestinationRequest request);

    /**
     * Updates the Cloud Exadata infrastructure resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateCloudExadataInfrastructureResponse updateCloudExadataInfrastructure(
            UpdateCloudExadataInfrastructureRequest request);

    /**
     * Updates the specified cloud VM cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateCloudVmClusterResponse updateCloudVmCluster(UpdateCloudVmClusterRequest request);

    /**
     * Updates the IORM settings for the specified cloud VM cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateCloudVmClusterIormConfigResponse updateCloudVmClusterIormConfig(
            UpdateCloudVmClusterIormConfigRequest request);

    /**
     * Update the specified database based on the request parameters provided.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateDatabaseResponse updateDatabase(UpdateDatabaseRequest request);

    /**
     * Updates the properties of a Database Software Image, like Display Nmae
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateDatabaseSoftwareImageResponse updateDatabaseSoftwareImage(
            UpdateDatabaseSoftwareImageRequest request);

    /**
     * Patches the specified Database Home.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateDbHomeResponse updateDbHome(UpdateDbHomeRequest request);

    /**
     * Updates the properties of the specified DB system.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateDbSystemResponse updateDbSystem(UpdateDbSystemRequest request);

    /**
     * Updates the Exadata Cloud@Customer infrastructure.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateExadataInfrastructureResponse updateExadataInfrastructure(
            UpdateExadataInfrastructureRequest request);

    /**
     * Updates IORM settings for the specified Exadata system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateExadataIormConfigResponse updateExadataIormConfig(UpdateExadataIormConfigRequest request);

    /**
     * Updates the properties of a maintenance run, such as the state of a maintenance run.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateMaintenanceRunResponse updateMaintenanceRun(UpdateMaintenanceRunRequest request);

    /**
     * Updates the specified Exadata Cloud@Customer VM cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateVmClusterResponse updateVmCluster(UpdateVmClusterRequest request);

    /**
     * Updates the specified Exadata Cloud@Customer VM cluster network.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateVmClusterNetworkResponse updateVmClusterNetwork(UpdateVmClusterNetworkRequest request);

    /**
     * Validates the specified Exadata Cloud@Customer VM cluster network.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ValidateVmClusterNetworkResponse validateVmClusterNetwork(
            ValidateVmClusterNetworkRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     * @deprecated use {@link #newWaiters(WorkRequest)} instead.  Otherwise, a default one will be provided
     *   that does not support operations that rely on the {@code WorkRequestClient} for polling.  An
     *   {@code IllegalStateException} will be thrown for such operations.
     */
    @Deprecated
    DatabaseWaiters getWaiters();

    /**
     * Creates a new {@code DatabaseWaiters} for resources for this service.
     *
     * @param workRequestClient The work request service client used to query for work request status
     * @return The service waiters.
     */
    DatabaseWaiters newWaiters(WorkRequest workRequestClient);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DatabasePaginators getPaginators();
}
