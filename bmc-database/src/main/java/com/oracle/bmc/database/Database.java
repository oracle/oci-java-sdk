/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database;

import com.oracle.bmc.database.requests.*;
import com.oracle.bmc.database.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface Database extends AutoCloseable {

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
     * Create a new Autonomous Container Database in the specified Autonomous Exadata Infrastructure.
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
     * Creates a new backup in the specified database based on the request parameters you provide. If you previously used RMAN or dbcli to configure backups and then you switch to using the Console or the API for backups, a new backup configuration is created and associated with your database. This means that you can no longer rely on your previously configured unmanaged backups to work.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateBackupResponse createBackup(CreateBackupRequest request);

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
     * Creates a new database home in the specified DB system based on the request parameters you provide.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateDbHomeResponse createDbHome(CreateDbHomeRequest request);

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
     * Performs one of the following power actions on the specified DB node:
     * - start - power on
     * - stop - power off
     * - softreset - ACPI shutdown and power on
     * - reset - power off and power on
     * <p>
     **Note:** Stopping a node affects billing differently, depending on the type of DB system:
     * *Bare metal and Exadata DB systems* - The _stop_ state has no effect on the resources you consume.
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
     * Deletes a full backup. You cannot delete automatic backups using this API.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteBackupResponse deleteBackup(DeleteBackupRequest request);

    /**
     * Deletes a DB Home. The DB Home and its database data are local to the DB system and will be lost when it is deleted. Oracle recommends that you back up any data in the DB system prior to deleting it.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteDbHomeResponse deleteDbHome(DeleteDbHomeRequest request);

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
     * Gets information about the specified Autonomous Exadata Infrastructure.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetAutonomousExadataInfrastructureResponse getAutonomousExadataInfrastructure(
            GetAutonomousExadataInfrastructureRequest request);

    /**
     * Gets information about the specified backup.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetBackupResponse getBackup(GetBackupRequest request);

    /**
     * Gets the specified Data Guard association's configuration information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDataGuardAssociationResponse getDataGuardAssociation(GetDataGuardAssociationRequest request);

    /**
     * Gets information about a specific database.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDatabaseResponse getDatabase(GetDatabaseRequest request);

    /**
     * Gets information about the specified database home.
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
     * Gets information about a specified patch package.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDbSystemPatchResponse getDbSystemPatch(GetDbSystemPatchRequest request);

    /**
     * Gets the patch history details for the specified patchHistoryEntryId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDbSystemPatchHistoryEntryResponse getDbSystemPatchHistoryEntry(
            GetDbSystemPatchHistoryEntryRequest request);

    /**
     * Gets `IORM` Setting for the requested Exadata DB System.
     * The default IORM Settings is pre-created in all the Exadata DB System.
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
     * Gets information about the specified Maintenance Run.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetMaintenanceRunResponse getMaintenanceRun(GetMaintenanceRunRequest request);

    /**
     * Launches a new Autonomous Exadata Infrastructure in the specified compartment and availability domain.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    LaunchAutonomousExadataInfrastructureResponse launchAutonomousExadataInfrastructure(
            LaunchAutonomousExadataInfrastructureRequest request);

    /**
     * Launches a new DB system in the specified compartment and availability domain. The Oracle
     * Database edition that you specify applies to all the databases on that DB system. The selected edition cannot be changed.
     * <p>
     * An initial database is created on the DB system based on the request parameters you provide and some default
     * options. For more information,
     * see [Default Options for the Initial Database](https://docs.cloud.oracle.com/Content/Database/Tasks/launchingDB.htm#DefaultOptionsfortheInitialDatabase).
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
     * Gets a list of Autonomous Databases.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAutonomousDatabasesResponse listAutonomousDatabases(ListAutonomousDatabasesRequest request);

    /**
     * Gets a list of supported Autonomous Database versions.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAutonomousDbPreviewVersionsResponse listAutonomousDbPreviewVersions(
            ListAutonomousDbPreviewVersionsRequest request);

    /**
     * Gets a list of the shapes that can be used to launch a new Autonomous Exadata Infrastructure DB system. The shape determines resources to allocate to the DB system (CPU cores, memory and storage).
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
     * Gets a list of backups based on the databaseId or compartmentId specified. Either one of the query parameters must be provided.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListBackupsResponse listBackups(ListBackupsRequest request);

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
     * Gets a list of the databases in the specified database home.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDatabasesResponse listDatabases(ListDatabasesRequest request);

    /**
     * Gets history of the actions taken for patches for the specified database home.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDbHomePatchHistoryEntriesResponse listDbHomePatchHistoryEntries(
            ListDbHomePatchHistoryEntriesRequest request);

    /**
     * Lists patches applicable to the requested database home.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDbHomePatchesResponse listDbHomePatches(ListDbHomePatchesRequest request);

    /**
     * Gets a list of database homes in the specified DB system and compartment. A database home is a directory where Oracle Database software is installed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDbHomesResponse listDbHomes(ListDbHomesRequest request);

    /**
     * Gets a list of database nodes in the specified DB system and compartment. A database node is a server running database software.
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
     * Lists the patches applicable to the requested DB system.
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
     * Gets a list of the DB systems in the specified compartment. You can specify a backupId to list only the DB systems that support creating a database using this backup in this compartment.
     *
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
     * Gets a list of the Maintenance Runs in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListMaintenanceRunsResponse listMaintenanceRuns(ListMaintenanceRunsRequest request);

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
     * Terminates an Autonomous Exadata Infrastructure, which permanently deletes the Exadata Infrastructure and any container databases and databases contained in the Exadata Infrastructure. The database data is local to the Autonomous Exadata Infrastructure and will be lost when the system is terminated. Oracle recommends that you back up any data in the Autonomous Exadata Infrastructure prior to terminating it.
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
     * Updates the properties of an Autonomous Container Database, such as the CPU core count and storage size.
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
     * Updates the specified Autonomous Database with a new CPU core count and size.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateAutonomousDatabaseResponse updateAutonomousDatabase(
            UpdateAutonomousDatabaseRequest request);

    /**
     * Updates the properties of an Autonomous Exadata Infrastructure, such as the CPU core count.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateAutonomousExadataInfrastructureResponse updateAutonomousExadataInfrastructure(
            UpdateAutonomousExadataInfrastructureRequest request);

    /**
     * Update a Database based on the request parameters you provide.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateDatabaseResponse updateDatabase(UpdateDatabaseRequest request);

    /**
     * Patches the specified dbHome.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateDbHomeResponse updateDbHome(UpdateDbHomeRequest request);

    /**
     * Updates the properties of a DB system, such as the CPU core count.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateDbSystemResponse updateDbSystem(UpdateDbSystemRequest request);

    /**
     * Update `IORM` Settings for the requested Exadata DB System.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateExadataIormConfigResponse updateExadataIormConfig(UpdateExadataIormConfigRequest request);

    /**
     * Updates the properties of a Maintenance Run, such as the state of a Maintenance Run.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateMaintenanceRunResponse updateMaintenanceRun(UpdateMaintenanceRunRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    DatabaseWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DatabasePaginators getPaginators();
}
