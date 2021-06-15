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
     * Activates the specified Exadata infrastructure resource. Applies to Exadata Cloud@Customer instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ActivateExadataInfrastructureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ActivateExadataInfrastructure API.
     */
    ActivateExadataInfrastructureResponse activateExadataInfrastructure(
            ActivateExadataInfrastructureRequest request);

    /**
     * Makes the storage capacity from additional storage servers available for VM Cluster consumption. Applies to Exadata Cloud@Customer instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/AddStorageCapacityExadataInfrastructureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddStorageCapacityExadataInfrastructure API.
     */
    AddStorageCapacityExadataInfrastructureResponse addStorageCapacityExadataInfrastructure(
            AddStorageCapacityExadataInfrastructureRequest request);

    /**
     * Initiates a data refresh for an Autonomous Database refreshable clone. Data is refreshed from the source database to the point of a specified timestamp.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/AutonomousDatabaseManualRefreshExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AutonomousDatabaseManualRefresh API.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeAutonomousContainerDatabaseCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeAutonomousContainerDatabaseCompartment API.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeAutonomousDatabaseCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeAutonomousDatabaseCompartment API.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeAutonomousExadataInfrastructureCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeAutonomousExadataInfrastructureCompartment API.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeAutonomousVmClusterCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeAutonomousVmClusterCompartment API.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeBackupDestinationCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeBackupDestinationCompartment API.
     */
    ChangeBackupDestinationCompartmentResponse changeBackupDestinationCompartment(
            ChangeBackupDestinationCompartmentRequest request);

    /**
     * Moves a cloud Exadata infrastructure resource and its dependent resources to another compartment. Applies to Exadata Cloud Service instances only. For more information about moving resources to a different compartment, see [Moving Database Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeCloudExadataInfrastructureCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeCloudExadataInfrastructureCompartment API.
     */
    ChangeCloudExadataInfrastructureCompartmentResponse changeCloudExadataInfrastructureCompartment(
            ChangeCloudExadataInfrastructureCompartmentRequest request);

    /**
     * Moves a cloud VM cluster and its dependent resources to another compartment. Applies to Exadata Cloud Service instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeCloudVmClusterCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeCloudVmClusterCompartment API.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeDatabaseSoftwareImageCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeDatabaseSoftwareImageCompartment API.
     */
    ChangeDatabaseSoftwareImageCompartmentResponse changeDatabaseSoftwareImageCompartment(
            ChangeDatabaseSoftwareImageCompartmentRequest request);

    /**
     * Moves the DB system and its dependent resources to the specified compartment.
     * For more information about moving DB systems, see
     * [Moving Database Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeDbSystemCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeDbSystemCompartment API.
     */
    ChangeDbSystemCompartmentResponse changeDbSystemCompartment(
            ChangeDbSystemCompartmentRequest request);

    /**
     * Moves an Exadata infrastructure resource and its dependent resources to another compartment. Applies to Exadata Cloud@Customer instances only.
     * To move an Exadata Cloud Service infrastructure resource to another compartment, use the  {@link #changeCloudExadataInfrastructureCompartment(ChangeCloudExadataInfrastructureCompartmentRequest) changeCloudExadataInfrastructureCompartment} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeExadataInfrastructureCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeExadataInfrastructureCompartment API.
     */
    ChangeExadataInfrastructureCompartmentResponse changeExadataInfrastructureCompartment(
            ChangeExadataInfrastructureCompartmentRequest request);

    /**
     * Move the {@link #createExternalContainerDatabaseDetails(CreateExternalContainerDatabaseDetailsRequest) createExternalContainerDatabaseDetails}
     * and its dependent resources to the specified compartment.
     * For more information about moving external container databases, see
     * [Moving Database Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeExternalContainerDatabaseCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeExternalContainerDatabaseCompartment API.
     */
    ChangeExternalContainerDatabaseCompartmentResponse changeExternalContainerDatabaseCompartment(
            ChangeExternalContainerDatabaseCompartmentRequest request);

    /**
     * Move the external non-container database and its dependent resources to the specified compartment.
     * For more information about moving external non-container databases, see
     * [Moving Database Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeExternalNonContainerDatabaseCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeExternalNonContainerDatabaseCompartment API.
     */
    ChangeExternalNonContainerDatabaseCompartmentResponse
            changeExternalNonContainerDatabaseCompartment(
                    ChangeExternalNonContainerDatabaseCompartmentRequest request);

    /**
     * Move the {@link #createExternalPluggableDatabaseDetails(CreateExternalPluggableDatabaseDetailsRequest) createExternalPluggableDatabaseDetails} and
     * its dependent resources to the specified compartment.
     * For more information about moving external pluggable databases, see
     * [Moving Database Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeExternalPluggableDatabaseCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeExternalPluggableDatabaseCompartment API.
     */
    ChangeExternalPluggableDatabaseCompartmentResponse changeExternalPluggableDatabaseCompartment(
            ChangeExternalPluggableDatabaseCompartmentRequest request);

    /**
     * Move the key store resource to the specified compartment.
     * For more information about moving key stores, see
     * [Moving Database Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeKeyStoreCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeKeyStoreCompartment API.
     */
    ChangeKeyStoreCompartmentResponse changeKeyStoreCompartment(
            ChangeKeyStoreCompartmentRequest request);

    /**
     * Moves a VM cluster and its dependent resources to another compartment. Applies to Exadata Cloud@Customer instances only.
     * To move a cloud VM cluster in an Exadata Cloud Service instance to another compartment, use the {@link #changeCloudVmClusterCompartment(ChangeCloudVmClusterCompartmentRequest) changeCloudVmClusterCompartment} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeVmClusterCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeVmClusterCompartment API.
     */
    ChangeVmClusterCompartmentResponse changeVmClusterCompartment(
            ChangeVmClusterCompartmentRequest request);

    /**
     * Check the status of the external database connection specified in this connector.
     * This operation will refresh the connectionStatus and timeConnectionStatusLastUpdated fields.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CheckExternalDatabaseConnectorConnectionStatusExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CheckExternalDatabaseConnectorConnectionStatus API.
     */
    CheckExternalDatabaseConnectorConnectionStatusResponse
            checkExternalDatabaseConnectorConnectionStatus(
                    CheckExternalDatabaseConnectorConnectionStatusRequest request);

    /**
     * Changes the status of the standalone backup resource to `ACTIVE` after the backup is created from the on-premises database and placed in Oracle Cloud Infrastructure Object Storage.
     * <p>
     **Note:** This API is used by an Oracle Cloud Infrastructure Python script that is packaged with the Oracle Cloud Infrastructure CLI. Oracle recommends that you use the script instead using the API directly. See [Migrating an On-Premises Database to Oracle Cloud Infrastructure by Creating a Backup in the Cloud](https://docs.cloud.oracle.com/Content/Database/Tasks/mig-onprembackup.htm) for more information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CompleteExternalBackupJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CompleteExternalBackupJob API.
     */
    CompleteExternalBackupJobResponse completeExternalBackupJob(
            CompleteExternalBackupJobRequest request);

    /**
     * Configures the Autonomous Database Vault service [key](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ConfigureAutonomousDatabaseVaultKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ConfigureAutonomousDatabaseVaultKey API.
     */
    ConfigureAutonomousDatabaseVaultKeyResponse configureAutonomousDatabaseVaultKey(
            ConfigureAutonomousDatabaseVaultKeyRequest request);

    /**
     * Creates an Autonomous Container Database in the specified Autonomous Exadata Infrastructure.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateAutonomousContainerDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateAutonomousContainerDatabase API.
     */
    CreateAutonomousContainerDatabaseResponse createAutonomousContainerDatabase(
            CreateAutonomousContainerDatabaseRequest request);

    /**
     * Creates a new Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateAutonomousDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateAutonomousDatabase API.
     */
    CreateAutonomousDatabaseResponse createAutonomousDatabase(
            CreateAutonomousDatabaseRequest request);

    /**
     * Creates a new Autonomous Database backup for the specified database based on the provided request parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateAutonomousDatabaseBackupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateAutonomousDatabaseBackup API.
     */
    CreateAutonomousDatabaseBackupResponse createAutonomousDatabaseBackup(
            CreateAutonomousDatabaseBackupRequest request);

    /**
     * Creates an Autonomous VM cluster for Exadata Cloud@Customer.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateAutonomousVmClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateAutonomousVmCluster API.
     */
    CreateAutonomousVmClusterResponse createAutonomousVmCluster(
            CreateAutonomousVmClusterRequest request);

    /**
     * Creates a new backup in the specified database based on the request parameters you provide. If you previously used RMAN or dbcli to configure backups and then you switch to using the Console or the API for backups, a new backup configuration is created and associated with your database. This means that you can no longer rely on your previously configured unmanaged backups to work.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateBackupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateBackup API.
     */
    CreateBackupResponse createBackup(CreateBackupRequest request);

    /**
     * Creates a backup destination in an Exadata Cloud@Customer system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateBackupDestinationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateBackupDestination API.
     */
    CreateBackupDestinationResponse createBackupDestination(CreateBackupDestinationRequest request);

    /**
     * Creates a cloud Exadata infrastructure resource. This resource is used to create an [Exadata Cloud Service](https://docs.cloud.oracle.com/Content/Database/Concepts/exaoverview.htm) instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateCloudExadataInfrastructureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateCloudExadataInfrastructure API.
     */
    CreateCloudExadataInfrastructureResponse createCloudExadataInfrastructure(
            CreateCloudExadataInfrastructureRequest request);

    /**
     * Creates a cloud VM cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateCloudVmClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateCloudVmCluster API.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateConsoleConnectionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateConsoleConnection API.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateDataGuardAssociationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDataGuardAssociation API.
     */
    CreateDataGuardAssociationResponse createDataGuardAssociation(
            CreateDataGuardAssociationRequest request);

    /**
     * Creates a new database in the specified Database Home. If the database version is provided, it must match the version of the Database Home. Applies to Exadata and Exadata Cloud@Customer systems.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDatabase API.
     */
    CreateDatabaseResponse createDatabase(CreateDatabaseRequest request);

    /**
     * create database software image in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateDatabaseSoftwareImageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDatabaseSoftwareImage API.
     */
    CreateDatabaseSoftwareImageResponse createDatabaseSoftwareImage(
            CreateDatabaseSoftwareImageRequest request);

    /**
     * Creates a new Database Home in the specified database system based on the request parameters you provide. Applies to bare metal DB systems, Exadata systems, and Exadata Cloud@Customer systems.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateDbHomeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDbHome API.
     */
    CreateDbHomeResponse createDbHome(CreateDbHomeRequest request);

    /**
     * Creates an Exadata infrastructure resource. Applies to Exadata Cloud@Customer instances only.
     * To create an Exadata Cloud Service infrastructure resource, use the  {@link #createCloudExadataInfrastructure(CreateCloudExadataInfrastructureRequest) createCloudExadataInfrastructure} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateExadataInfrastructureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateExadataInfrastructure API.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateExternalBackupJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateExternalBackupJob API.
     */
    CreateExternalBackupJobResponse createExternalBackupJob(CreateExternalBackupJobRequest request);

    /**
     * Creates a new external container database resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateExternalContainerDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateExternalContainerDatabase API.
     */
    CreateExternalContainerDatabaseResponse createExternalContainerDatabase(
            CreateExternalContainerDatabaseRequest request);

    /**
     * Creates a new external database connector.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateExternalDatabaseConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateExternalDatabaseConnector API.
     */
    CreateExternalDatabaseConnectorResponse createExternalDatabaseConnector(
            CreateExternalDatabaseConnectorRequest request);

    /**
     * Creates a new ExternalNonContainerDatabase resource
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateExternalNonContainerDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateExternalNonContainerDatabase API.
     */
    CreateExternalNonContainerDatabaseResponse createExternalNonContainerDatabase(
            CreateExternalNonContainerDatabaseRequest request);

    /**
     * Registers a new {@link #createExternalPluggableDatabaseDetails(CreateExternalPluggableDatabaseDetailsRequest) createExternalPluggableDatabaseDetails}
     * resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateExternalPluggableDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateExternalPluggableDatabase API.
     */
    CreateExternalPluggableDatabaseResponse createExternalPluggableDatabase(
            CreateExternalPluggableDatabaseRequest request);

    /**
     * Creates a Key Store.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateKeyStoreExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateKeyStore API.
     */
    CreateKeyStoreResponse createKeyStore(CreateKeyStoreRequest request);

    /**
     * Creates an Exadata Cloud@Customer VM cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateVmClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateVmCluster API.
     */
    CreateVmClusterResponse createVmCluster(CreateVmClusterRequest request);

    /**
     * Creates the VM cluster network. Applies to Exadata Cloud@Customer instances only.
     * To create a cloud VM cluster in an Exadata Cloud Service instance, use the {@link #createCloudVmCluster(CreateCloudVmClusterRequest) createCloudVmCluster} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateVmClusterNetworkExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateVmClusterNetwork API.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DbNodeActionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DbNodeAction API.
     */
    DbNodeActionResponse dbNodeAction(DbNodeActionRequest request);

    /**
     * Deletes the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteAutonomousDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteAutonomousDatabase API.
     */
    DeleteAutonomousDatabaseResponse deleteAutonomousDatabase(
            DeleteAutonomousDatabaseRequest request);

    /**
     * Deletes the specified Autonomous VM cluster in an Exadata Cloud@Customer system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteAutonomousVmClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteAutonomousVmCluster API.
     */
    DeleteAutonomousVmClusterResponse deleteAutonomousVmCluster(
            DeleteAutonomousVmClusterRequest request);

    /**
     * Deletes a full backup. You cannot delete automatic backups using this API.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteBackupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteBackup API.
     */
    DeleteBackupResponse deleteBackup(DeleteBackupRequest request);

    /**
     * Deletes a backup destination in an Exadata Cloud@Customer system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteBackupDestinationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteBackupDestination API.
     */
    DeleteBackupDestinationResponse deleteBackupDestination(DeleteBackupDestinationRequest request);

    /**
     * Deletes the cloud Exadata infrastructure resource. Applies to Exadata Cloud Service instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteCloudExadataInfrastructureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteCloudExadataInfrastructure API.
     */
    DeleteCloudExadataInfrastructureResponse deleteCloudExadataInfrastructure(
            DeleteCloudExadataInfrastructureRequest request);

    /**
     * Deletes the specified cloud VM cluster. Applies to Exadata Cloud Service instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteCloudVmClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteCloudVmCluster API.
     */
    DeleteCloudVmClusterResponse deleteCloudVmCluster(DeleteCloudVmClusterRequest request);

    /**
     * Deletes the specified database node console connection.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteConsoleConnectionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteConsoleConnection API.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDatabase API.
     */
    DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request);

    /**
     * Delete a database software image
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteDatabaseSoftwareImageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDatabaseSoftwareImage API.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteDbHomeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDbHome API.
     */
    DeleteDbHomeResponse deleteDbHome(DeleteDbHomeRequest request);

    /**
     * Deletes the Exadata Cloud@Customer infrastructure.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteExadataInfrastructureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteExadataInfrastructure API.
     */
    DeleteExadataInfrastructureResponse deleteExadataInfrastructure(
            DeleteExadataInfrastructureRequest request);

    /**
     * Deletes the {@link #createExternalContainerDatabaseDetails(CreateExternalContainerDatabaseDetailsRequest) createExternalContainerDatabaseDetails}
     * resource. Any external pluggable databases registered under this container database must be deleted in
     * your Oracle Cloud Infrastructure tenancy prior to this operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteExternalContainerDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteExternalContainerDatabase API.
     */
    DeleteExternalContainerDatabaseResponse deleteExternalContainerDatabase(
            DeleteExternalContainerDatabaseRequest request);

    /**
     * Deletes an external database connector.
     * Any services enabled using the external database connector must be
     * deleted prior to this operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteExternalDatabaseConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteExternalDatabaseConnector API.
     */
    DeleteExternalDatabaseConnectorResponse deleteExternalDatabaseConnector(
            DeleteExternalDatabaseConnectorRequest request);

    /**
     * Deletes the Oracle Cloud Infrastructure resource representing an external non-container database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteExternalNonContainerDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteExternalNonContainerDatabase API.
     */
    DeleteExternalNonContainerDatabaseResponse deleteExternalNonContainerDatabase(
            DeleteExternalNonContainerDatabaseRequest request);

    /**
     * Deletes the {@link #createExternalPluggableDatabaseDetails(CreateExternalPluggableDatabaseDetailsRequest) createExternalPluggableDatabaseDetails}.
     * resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteExternalPluggableDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteExternalPluggableDatabase API.
     */
    DeleteExternalPluggableDatabaseResponse deleteExternalPluggableDatabase(
            DeleteExternalPluggableDatabaseRequest request);

    /**
     * Deletes a key store.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteKeyStoreExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteKeyStore API.
     */
    DeleteKeyStoreResponse deleteKeyStore(DeleteKeyStoreRequest request);

    /**
     * Deletes the specified VM cluster. Applies to Exadata Cloud@Customer instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteVmClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteVmCluster API.
     */
    DeleteVmClusterResponse deleteVmCluster(DeleteVmClusterRequest request);

    /**
     * Deletes the specified VM cluster network. Applies to Exadata Cloud@Customer instances only.
     * To delete a cloud VM cluster in an Exadata Cloud Service instance, use the {@link #deleteCloudVmCluster(DeleteCloudVmClusterRequest) deleteCloudVmCluster} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteVmClusterNetworkExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteVmClusterNetwork API.
     */
    DeleteVmClusterNetworkResponse deleteVmClusterNetwork(DeleteVmClusterNetworkRequest request);

    /**
     * Asynchronously deregisters this Autonomous Database with Data Safe.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeregisterAutonomousDatabaseDataSafeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeregisterAutonomousDatabaseDataSafe API.
     */
    DeregisterAutonomousDatabaseDataSafeResponse deregisterAutonomousDatabaseDataSafe(
            DeregisterAutonomousDatabaseDataSafeRequest request);

    /**
     * Disables Operations Insights for the Autonomous Database resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DisableAutonomousDatabaseOperationsInsightsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableAutonomousDatabaseOperationsInsights API.
     */
    DisableAutonomousDatabaseOperationsInsightsResponse disableAutonomousDatabaseOperationsInsights(
            DisableAutonomousDatabaseOperationsInsightsRequest request);

    /**
     * Disable Database Management service for the external container database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DisableExternalContainerDatabaseDatabaseManagementExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableExternalContainerDatabaseDatabaseManagement API.
     */
    DisableExternalContainerDatabaseDatabaseManagementResponse
            disableExternalContainerDatabaseDatabaseManagement(
                    DisableExternalContainerDatabaseDatabaseManagementRequest request);

    /**
     * Disable Database Management Service for the external non-container database.
     * For more information about the Database Management Service, see
     * [Database Management Service](https://docs.cloud.oracle.com/Content/ExternalDatabase/Concepts/databasemanagementservice.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DisableExternalNonContainerDatabaseDatabaseManagementExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableExternalNonContainerDatabaseDatabaseManagement API.
     */
    DisableExternalNonContainerDatabaseDatabaseManagementResponse
            disableExternalNonContainerDatabaseDatabaseManagement(
                    DisableExternalNonContainerDatabaseDatabaseManagementRequest request);

    /**
     * Disable Operations Insights for the external non-container database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DisableExternalNonContainerDatabaseOperationsInsightsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableExternalNonContainerDatabaseOperationsInsights API.
     */
    DisableExternalNonContainerDatabaseOperationsInsightsResponse
            disableExternalNonContainerDatabaseOperationsInsights(
                    DisableExternalNonContainerDatabaseOperationsInsightsRequest request);

    /**
     * Disable Database Management Service for the external pluggable database.
     * For more information about the Database Management Service, see
     * [Database Management Service](https://docs.cloud.oracle.com/Content/ExternalDatabase/Concepts/databasemanagementservice.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DisableExternalPluggableDatabaseDatabaseManagementExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableExternalPluggableDatabaseDatabaseManagement API.
     */
    DisableExternalPluggableDatabaseDatabaseManagementResponse
            disableExternalPluggableDatabaseDatabaseManagement(
                    DisableExternalPluggableDatabaseDatabaseManagementRequest request);

    /**
     * Disable Operations Insights for the external pluggable database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DisableExternalPluggableDatabaseOperationsInsightsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableExternalPluggableDatabaseOperationsInsights API.
     */
    DisableExternalPluggableDatabaseOperationsInsightsResponse
            disableExternalPluggableDatabaseOperationsInsights(
                    DisableExternalPluggableDatabaseOperationsInsightsRequest request);

    /**
     * Downloads the configuration file for the specified Exadata Cloud@Customer infrastructure.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DownloadExadataInfrastructureConfigFileExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DownloadExadataInfrastructureConfigFile API.
     */
    DownloadExadataInfrastructureConfigFileResponse downloadExadataInfrastructureConfigFile(
            DownloadExadataInfrastructureConfigFileRequest request);

    /**
     * Downloads the configuration file for the specified VM cluster network. Applies to Exadata Cloud@Customer instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DownloadVmClusterNetworkConfigFileExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DownloadVmClusterNetworkConfigFile API.
     */
    DownloadVmClusterNetworkConfigFileResponse downloadVmClusterNetworkConfigFile(
            DownloadVmClusterNetworkConfigFileRequest request);

    /**
     * Enables the specified Autonomous Database with Operations Insights.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/EnableAutonomousDatabaseOperationsInsightsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableAutonomousDatabaseOperationsInsights API.
     */
    EnableAutonomousDatabaseOperationsInsightsResponse enableAutonomousDatabaseOperationsInsights(
            EnableAutonomousDatabaseOperationsInsightsRequest request);

    /**
     * Enables Database Management Service for the external container database.
     * For more information about the Database Management Service, see
     * [Database Management Service](https://docs.cloud.oracle.com/Content/ExternalDatabase/Concepts/databasemanagementservice.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/EnableExternalContainerDatabaseDatabaseManagementExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableExternalContainerDatabaseDatabaseManagement API.
     */
    EnableExternalContainerDatabaseDatabaseManagementResponse
            enableExternalContainerDatabaseDatabaseManagement(
                    EnableExternalContainerDatabaseDatabaseManagementRequest request);

    /**
     * Enable Database Management Service for the external non-container database.
     * For more information about the Database Management Service, see
     * [Database Management Service](https://docs.cloud.oracle.com/Content/ExternalDatabase/Concepts/databasemanagementservice.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/EnableExternalNonContainerDatabaseDatabaseManagementExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableExternalNonContainerDatabaseDatabaseManagement API.
     */
    EnableExternalNonContainerDatabaseDatabaseManagementResponse
            enableExternalNonContainerDatabaseDatabaseManagement(
                    EnableExternalNonContainerDatabaseDatabaseManagementRequest request);

    /**
     * Enable Operations Insights for the external non-container database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/EnableExternalNonContainerDatabaseOperationsInsightsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableExternalNonContainerDatabaseOperationsInsights API.
     */
    EnableExternalNonContainerDatabaseOperationsInsightsResponse
            enableExternalNonContainerDatabaseOperationsInsights(
                    EnableExternalNonContainerDatabaseOperationsInsightsRequest request);

    /**
     * Enable Database Management Service for the external pluggable database.
     * For more information about the Database Management Service, see
     * [Database Management Service](https://docs.cloud.oracle.com/Content/ExternalDatabase/Concepts/databasemanagementservice.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/EnableExternalPluggableDatabaseDatabaseManagementExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableExternalPluggableDatabaseDatabaseManagement API.
     */
    EnableExternalPluggableDatabaseDatabaseManagementResponse
            enableExternalPluggableDatabaseDatabaseManagement(
                    EnableExternalPluggableDatabaseDatabaseManagementRequest request);

    /**
     * Enable Operations Insights for the external pluggable database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/EnableExternalPluggableDatabaseOperationsInsightsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableExternalPluggableDatabaseOperationsInsights API.
     */
    EnableExternalPluggableDatabaseOperationsInsightsResponse
            enableExternalPluggableDatabaseOperationsInsights(
                    EnableExternalPluggableDatabaseOperationsInsightsRequest request);

    /**
     * Initiates a failover the specified Autonomous Database to a standby.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/FailOverAutonomousDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use FailOverAutonomousDatabase API.
     */
    FailOverAutonomousDatabaseResponse failOverAutonomousDatabase(
            FailOverAutonomousDatabaseRequest request);

    /**
     * Fails over the standby Autonomous Container Database identified by the autonomousContainerDatabaseId parameter to the primary Autonomous Container Database after the existing primary Autonomous Container Database fails or becomes unreachable.
     * <p>
     * A failover can result in data loss, depending on the protection mode in effect at the time the primary Autonomous Container Database fails.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/FailoverAutonomousContainerDatabaseDataguardAssociationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use FailoverAutonomousContainerDatabaseDataguardAssociation API.
     */
    FailoverAutonomousContainerDatabaseDataguardAssociationResponse
            failoverAutonomousContainerDatabaseDataguardAssociation(
                    FailoverAutonomousContainerDatabaseDataguardAssociationRequest request);

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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/FailoverDataGuardAssociationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use FailoverDataGuardAssociation API.
     */
    FailoverDataGuardAssociationResponse failoverDataGuardAssociation(
            FailoverDataGuardAssociationRequest request);

    /**
     * Creates and downloads a wallet for the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GenerateAutonomousDatabaseWalletExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GenerateAutonomousDatabaseWallet API.
     */
    GenerateAutonomousDatabaseWalletResponse generateAutonomousDatabaseWallet(
            GenerateAutonomousDatabaseWalletRequest request);

    /**
     * Generates a recommended Cloud@Customer VM cluster network configuration.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GenerateRecommendedVmClusterNetworkExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GenerateRecommendedVmClusterNetwork API.
     */
    GenerateRecommendedVmClusterNetworkResponse generateRecommendedVmClusterNetwork(
            GenerateRecommendedVmClusterNetworkRequest request);

    /**
     * Gets information about the specified Autonomous Container Database.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousContainerDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAutonomousContainerDatabase API.
     */
    GetAutonomousContainerDatabaseResponse getAutonomousContainerDatabase(
            GetAutonomousContainerDatabaseRequest request);

    /**
     * Gets an Autonomous Container Database enabled with Autonomous Data Guard associated with the specified Autonomous Container Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousContainerDatabaseDataguardAssociationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAutonomousContainerDatabaseDataguardAssociation API.
     */
    GetAutonomousContainerDatabaseDataguardAssociationResponse
            getAutonomousContainerDatabaseDataguardAssociation(
                    GetAutonomousContainerDatabaseDataguardAssociationRequest request);

    /**
     * Gets the details of the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAutonomousDatabase API.
     */
    GetAutonomousDatabaseResponse getAutonomousDatabase(GetAutonomousDatabaseRequest request);

    /**
     * Gets information about the specified Autonomous Database backup.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousDatabaseBackupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAutonomousDatabaseBackup API.
     */
    GetAutonomousDatabaseBackupResponse getAutonomousDatabaseBackup(
            GetAutonomousDatabaseBackupRequest request);

    /**
     * Gets an Autonomous Data Guard-enabled database associated with the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousDatabaseDataguardAssociationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAutonomousDatabaseDataguardAssociation API.
     */
    GetAutonomousDatabaseDataguardAssociationResponse getAutonomousDatabaseDataguardAssociation(
            GetAutonomousDatabaseDataguardAssociationRequest request);

    /**
     * Gets the Autonomous Database regional wallet details.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousDatabaseRegionalWalletExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAutonomousDatabaseRegionalWallet API.
     */
    GetAutonomousDatabaseRegionalWalletResponse getAutonomousDatabaseRegionalWallet(
            GetAutonomousDatabaseRegionalWalletRequest request);

    /**
     * Gets the wallet details for the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousDatabaseWalletExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAutonomousDatabaseWallet API.
     */
    GetAutonomousDatabaseWalletResponse getAutonomousDatabaseWallet(
            GetAutonomousDatabaseWalletRequest request);

    /**
     * Gets information about the specified Autonomous Exadata Infrastructure resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousExadataInfrastructureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAutonomousExadataInfrastructure API.
     */
    GetAutonomousExadataInfrastructureResponse getAutonomousExadataInfrastructure(
            GetAutonomousExadataInfrastructureRequest request);

    /**
     * Gets information about a specific autonomous patch.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousPatchExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAutonomousPatch API.
     */
    GetAutonomousPatchResponse getAutonomousPatch(GetAutonomousPatchRequest request);

    /**
     * Gets information about the specified Autonomous VM cluster for an Exadata Cloud@Customer system.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousVmClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAutonomousVmCluster API.
     */
    GetAutonomousVmClusterResponse getAutonomousVmCluster(GetAutonomousVmClusterRequest request);

    /**
     * Gets information about the specified backup.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetBackupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetBackup API.
     */
    GetBackupResponse getBackup(GetBackupRequest request);

    /**
     * Gets information about the specified backup destination in an Exadata Cloud@Customer system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetBackupDestinationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetBackupDestination API.
     */
    GetBackupDestinationResponse getBackupDestination(GetBackupDestinationRequest request);

    /**
     * Gets information about the specified cloud Exadata infrastructure resource. Applies to Exadata Cloud Service instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetCloudExadataInfrastructureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetCloudExadataInfrastructure API.
     */
    GetCloudExadataInfrastructureResponse getCloudExadataInfrastructure(
            GetCloudExadataInfrastructureRequest request);

    /**
     * Gets information about the specified cloud VM cluster. Applies to Exadata Cloud Service instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetCloudVmClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetCloudVmCluster API.
     */
    GetCloudVmClusterResponse getCloudVmCluster(GetCloudVmClusterRequest request);

    /**
     * Gets the IORM configuration for the specified cloud VM cluster in an Exadata Cloud Service instance.
     * If you have not specified an IORM configuration, the default configuration is returned.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetCloudVmClusterIormConfigExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetCloudVmClusterIormConfig API.
     */
    GetCloudVmClusterIormConfigResponse getCloudVmClusterIormConfig(
            GetCloudVmClusterIormConfigRequest request);

    /**
     * Gets information about a specified maintenance update package for a cloud VM cluster. Applies to Exadata Cloud Service instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetCloudVmClusterUpdateExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetCloudVmClusterUpdate API.
     */
    GetCloudVmClusterUpdateResponse getCloudVmClusterUpdate(GetCloudVmClusterUpdateRequest request);

    /**
     * Gets the maintenance update history details for the specified update history entry. Applies to Exadata Cloud Service instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetCloudVmClusterUpdateHistoryEntryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetCloudVmClusterUpdateHistoryEntry API.
     */
    GetCloudVmClusterUpdateHistoryEntryResponse getCloudVmClusterUpdateHistoryEntry(
            GetCloudVmClusterUpdateHistoryEntryRequest request);

    /**
     * Gets the specified database node console connection's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetConsoleConnectionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetConsoleConnection API.
     */
    GetConsoleConnectionResponse getConsoleConnection(GetConsoleConnectionRequest request);

    /**
     * Gets the specified Data Guard association's configuration information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDataGuardAssociationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDataGuardAssociation API.
     */
    GetDataGuardAssociationResponse getDataGuardAssociation(GetDataGuardAssociationRequest request);

    /**
     * Gets information about the specified database.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDatabase API.
     */
    GetDatabaseResponse getDatabase(GetDatabaseRequest request);

    /**
     * Gets information about the specified database software image.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDatabaseSoftwareImageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDatabaseSoftwareImage API.
     */
    GetDatabaseSoftwareImageResponse getDatabaseSoftwareImage(
            GetDatabaseSoftwareImageRequest request);

    /**
     * gets the upgrade history for a specified database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDatabaseUpgradeHistoryEntryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDatabaseUpgradeHistoryEntry API.
     */
    GetDatabaseUpgradeHistoryEntryResponse getDatabaseUpgradeHistoryEntry(
            GetDatabaseUpgradeHistoryEntryRequest request);

    /**
     * Gets information about the specified Database Home.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDbHomeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDbHome API.
     */
    GetDbHomeResponse getDbHome(GetDbHomeRequest request);

    /**
     * Gets information about a specified patch package.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDbHomePatchExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDbHomePatch API.
     */
    GetDbHomePatchResponse getDbHomePatch(GetDbHomePatchRequest request);

    /**
     * Gets the patch history details for the specified patchHistoryEntryId
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDbHomePatchHistoryEntryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDbHomePatchHistoryEntry API.
     */
    GetDbHomePatchHistoryEntryResponse getDbHomePatchHistoryEntry(
            GetDbHomePatchHistoryEntryRequest request);

    /**
     * Gets information about the specified database node.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDbNodeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDbNode API.
     */
    GetDbNodeResponse getDbNode(GetDbNodeRequest request);

    /**
     * Gets information about the specified DB system.
     * <p>
     **Note:** Deprecated for Exadata Cloud Service systems. Use the [new resource model APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model) instead.
     * <p>
     * For Exadata Cloud Service instances, support for this API will end on May 15th, 2021. See [Switching an Exadata DB System to the New Resource Model and APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem_topic-resource_model_conversion.htm) for details on converting existing Exadata DB systems to the new resource model.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDbSystemExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDbSystem API.
     */
    GetDbSystemResponse getDbSystem(GetDbSystemRequest request);

    /**
     * Gets information the specified patch.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDbSystemPatchExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDbSystemPatch API.
     */
    GetDbSystemPatchResponse getDbSystemPatch(GetDbSystemPatchRequest request);

    /**
     * Gets the details of the specified patch operation on the specified DB system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDbSystemPatchHistoryEntryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDbSystemPatchHistoryEntry API.
     */
    GetDbSystemPatchHistoryEntryResponse getDbSystemPatchHistoryEntry(
            GetDbSystemPatchHistoryEntryRequest request);

    /**
     * Gets information about the specified Exadata infrastructure. Applies to Exadata Cloud@Customer instances only.
     * To get information on an Exadata Cloud Service infrastructure resource, use the  {@link #getCloudExadataInfrastructure(GetCloudExadataInfrastructureRequest) getCloudExadataInfrastructure} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExadataInfrastructureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExadataInfrastructure API.
     */
    GetExadataInfrastructureResponse getExadataInfrastructure(
            GetExadataInfrastructureRequest request);

    /**
     * Gets details of the available and consumed OCPUs for the specified Autonomous Exadata Infrastructure resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExadataInfrastructureOcpusExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExadataInfrastructureOcpus API.
     */
    GetExadataInfrastructureOcpusResponse getExadataInfrastructureOcpus(
            GetExadataInfrastructureOcpusRequest request);

    /**
     * Gets the IORM configuration settings for the specified cloud Exadata DB system.
     * All Exadata service instances have default IORM settings.
     * <p>
     **Note:** Deprecated for Exadata Cloud Service systems. Use the [new resource model APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model) instead.
     * <p>
     * For Exadata Cloud Service instances, support for this API will end on May 15th, 2021. See [Switching an Exadata DB System to the New Resource Model and APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem_topic-resource_model_conversion.htm) for details on converting existing Exadata DB systems to the new resource model.
     * <p>
     * The {@link #getCloudVmClusterIormConfig(GetCloudVmClusterIormConfigRequest) getCloudVmClusterIormConfig} API is used for this operation with Exadata systems using the
     * new resource model.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExadataIormConfigExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExadataIormConfig API.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExternalBackupJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExternalBackupJob API.
     */
    GetExternalBackupJobResponse getExternalBackupJob(GetExternalBackupJobRequest request);

    /**
     * Gets information about the specified external container database.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExternalContainerDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExternalContainerDatabase API.
     */
    GetExternalContainerDatabaseResponse getExternalContainerDatabase(
            GetExternalContainerDatabaseRequest request);

    /**
     * Gets information about the specified external database connector.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExternalDatabaseConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExternalDatabaseConnector API.
     */
    GetExternalDatabaseConnectorResponse getExternalDatabaseConnector(
            GetExternalDatabaseConnectorRequest request);

    /**
     * Gets information about a specific external non-container database.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExternalNonContainerDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExternalNonContainerDatabase API.
     */
    GetExternalNonContainerDatabaseResponse getExternalNonContainerDatabase(
            GetExternalNonContainerDatabaseRequest request);

    /**
     * Gets information about a specific
     * {@link #createExternalPluggableDatabaseDetails(CreateExternalPluggableDatabaseDetailsRequest) createExternalPluggableDatabaseDetails} resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExternalPluggableDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExternalPluggableDatabase API.
     */
    GetExternalPluggableDatabaseResponse getExternalPluggableDatabase(
            GetExternalPluggableDatabaseRequest request);

    /**
     * Gets information about the specified key store.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetKeyStoreExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetKeyStore API.
     */
    GetKeyStoreResponse getKeyStore(GetKeyStoreRequest request);

    /**
     * Gets information about the specified maintenance run.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetMaintenanceRunExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetMaintenanceRun API.
     */
    GetMaintenanceRunResponse getMaintenanceRun(GetMaintenanceRunRequest request);

    /**
     * Gets information about the VM cluster. Applies to Exadata Cloud@Customer instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetVmClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVmCluster API.
     */
    GetVmClusterResponse getVmCluster(GetVmClusterRequest request);

    /**
     * Gets information about the specified VM cluster network. Applies to Exadata Cloud@Customer instances only.
     * To get information about a cloud VM cluster in an Exadata Cloud Service instance, use the {@link #getCloudVmCluster(GetCloudVmClusterRequest) getCloudVmCluster} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetVmClusterNetworkExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVmClusterNetwork API.
     */
    GetVmClusterNetworkResponse getVmClusterNetwork(GetVmClusterNetworkRequest request);

    /**
     * Gets information about a specified patch package.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetVmClusterPatchExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVmClusterPatch API.
     */
    GetVmClusterPatchResponse getVmClusterPatch(GetVmClusterPatchRequest request);

    /**
     * Gets the patch history details for the specified patch history entry.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetVmClusterPatchHistoryEntryExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVmClusterPatchHistoryEntry API.
     */
    GetVmClusterPatchHistoryEntryResponse getVmClusterPatchHistoryEntry(
            GetVmClusterPatchHistoryEntryRequest request);

    /**
     * Creates a new Autonomous Exadata Infrastructure in the specified compartment and availability domain.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/LaunchAutonomousExadataInfrastructureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use LaunchAutonomousExadataInfrastructure API.
     */
    LaunchAutonomousExadataInfrastructureResponse launchAutonomousExadataInfrastructure(
            LaunchAutonomousExadataInfrastructureRequest request);

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
     * Use the {@link #createCloudExadataInfrastructure(CreateCloudExadataInfrastructureRequest) createCloudExadataInfrastructure} and {@link #createCloudVmCluster(CreateCloudVmClusterRequest) createCloudVmCluster} APIs to provision a new Exadata Cloud Service instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/LaunchDbSystemExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use LaunchDbSystem API.
     */
    LaunchDbSystemResponse launchDbSystem(LaunchDbSystemRequest request);

    /**
     * Gets a list of the Autonomous Container Databases with Autonomous Data Guard-enabled associated with the specified Autonomous Container Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousContainerDatabaseDataguardAssociationsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAutonomousContainerDatabaseDataguardAssociations API.
     */
    ListAutonomousContainerDatabaseDataguardAssociationsResponse
            listAutonomousContainerDatabaseDataguardAssociations(
                    ListAutonomousContainerDatabaseDataguardAssociationsRequest request);

    /**
     * Gets a list of the Autonomous Container Databases in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousContainerDatabasesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAutonomousContainerDatabases API.
     */
    ListAutonomousContainerDatabasesResponse listAutonomousContainerDatabases(
            ListAutonomousContainerDatabasesRequest request);

    /**
     * Gets a list of Autonomous Database backups based on either the `autonomousDatabaseId` or `compartmentId` specified as a query parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousDatabaseBackupsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAutonomousDatabaseBackups API.
     */
    ListAutonomousDatabaseBackupsResponse listAutonomousDatabaseBackups(
            ListAutonomousDatabaseBackupsRequest request);

    /**
     * Lists the Autonomous Database clones for the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousDatabaseClonesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAutonomousDatabaseClones API.
     */
    ListAutonomousDatabaseClonesResponse listAutonomousDatabaseClones(
            ListAutonomousDatabaseClonesRequest request);

    /**
     * Gets a list of the Autonomous Data Guard-enabled databases associated with the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousDatabaseDataguardAssociationsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAutonomousDatabaseDataguardAssociations API.
     */
    ListAutonomousDatabaseDataguardAssociationsResponse listAutonomousDatabaseDataguardAssociations(
            ListAutonomousDatabaseDataguardAssociationsRequest request);

    /**
     * Gets a list of Autonomous Databases based on the query parameters specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousDatabasesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAutonomousDatabases API.
     */
    ListAutonomousDatabasesResponse listAutonomousDatabases(ListAutonomousDatabasesRequest request);

    /**
     * Gets a list of supported Autonomous Database versions. Note that preview version software is only available for
     * databases with [shared Exadata infrastructure](https://docs.cloud.oracle.com/Content/Database/Concepts/adboverview.htm#AEI).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousDbPreviewVersionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAutonomousDbPreviewVersions API.
     */
    ListAutonomousDbPreviewVersionsResponse listAutonomousDbPreviewVersions(
            ListAutonomousDbPreviewVersionsRequest request);

    /**
     * Gets a list of supported Autonomous Database versions.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousDbVersionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAutonomousDbVersions API.
     */
    ListAutonomousDbVersionsResponse listAutonomousDbVersions(
            ListAutonomousDbVersionsRequest request);

    /**
     * Gets a list of the shapes that can be used to launch a new Autonomous Exadata Infrastructure resource. The shape determines resources to allocate (CPU cores, memory and storage).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousExadataInfrastructureShapesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAutonomousExadataInfrastructureShapes API.
     */
    ListAutonomousExadataInfrastructureShapesResponse listAutonomousExadataInfrastructureShapes(
            ListAutonomousExadataInfrastructureShapesRequest request);

    /**
     * Gets a list of the Autonomous Exadata Infrastructures in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousExadataInfrastructuresExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAutonomousExadataInfrastructures API.
     */
    ListAutonomousExadataInfrastructuresResponse listAutonomousExadataInfrastructures(
            ListAutonomousExadataInfrastructuresRequest request);

    /**
     * Gets a list of Exadata Cloud@Customer Autonomous VM clusters in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousVmClustersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAutonomousVmClusters API.
     */
    ListAutonomousVmClustersResponse listAutonomousVmClusters(
            ListAutonomousVmClustersRequest request);

    /**
     * Gets a list of backup destinations in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListBackupDestinationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListBackupDestination API.
     */
    ListBackupDestinationResponse listBackupDestination(ListBackupDestinationRequest request);

    /**
     * Gets a list of backups based on the `databaseId` or `compartmentId` specified. Either one of these query parameters must be provided.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListBackupsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListBackups API.
     */
    ListBackupsResponse listBackups(ListBackupsRequest request);

    /**
     * Gets a list of the cloud Exadata infrastructure resources in the specified compartment. Applies to Exadata Cloud Service instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListCloudExadataInfrastructuresExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListCloudExadataInfrastructures API.
     */
    ListCloudExadataInfrastructuresResponse listCloudExadataInfrastructures(
            ListCloudExadataInfrastructuresRequest request);

    /**
     * Gets the history of the maintenance update actions performed on the specified cloud VM cluster. Applies to Exadata Cloud Service instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListCloudVmClusterUpdateHistoryEntriesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListCloudVmClusterUpdateHistoryEntries API.
     */
    ListCloudVmClusterUpdateHistoryEntriesResponse listCloudVmClusterUpdateHistoryEntries(
            ListCloudVmClusterUpdateHistoryEntriesRequest request);

    /**
     * Lists the maintenance updates that can be applied to the specified cloud VM cluster. Applies to Exadata Cloud Service instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListCloudVmClusterUpdatesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListCloudVmClusterUpdates API.
     */
    ListCloudVmClusterUpdatesResponse listCloudVmClusterUpdates(
            ListCloudVmClusterUpdatesRequest request);

    /**
     * Gets a list of the cloud VM clusters in the specified compartment. Applies to Exadata Cloud Service instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListCloudVmClustersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListCloudVmClusters API.
     */
    ListCloudVmClustersResponse listCloudVmClusters(ListCloudVmClustersRequest request);

    /**
     * Lists the console connections for the specified database node.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListConsoleConnectionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListConsoleConnections API.
     */
    ListConsoleConnectionsResponse listConsoleConnections(ListConsoleConnectionsRequest request);

    /**
     * Lists the patches applicable to the requested container database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListContainerDatabasePatchesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListContainerDatabasePatches API.
     */
    ListContainerDatabasePatchesResponse listContainerDatabasePatches(
            ListContainerDatabasePatchesRequest request);

    /**
     * Lists all Data Guard associations for the specified database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDataGuardAssociationsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDataGuardAssociations API.
     */
    ListDataGuardAssociationsResponse listDataGuardAssociations(
            ListDataGuardAssociationsRequest request);

    /**
     * Gets a list of the database software images in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDatabaseSoftwareImagesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDatabaseSoftwareImages API.
     */
    ListDatabaseSoftwareImagesResponse listDatabaseSoftwareImages(
            ListDatabaseSoftwareImagesRequest request);

    /**
     * Gets the upgrade history for a specified database in a bare metal or virtual machine DB system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDatabaseUpgradeHistoryEntriesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDatabaseUpgradeHistoryEntries API.
     */
    ListDatabaseUpgradeHistoryEntriesResponse listDatabaseUpgradeHistoryEntries(
            ListDatabaseUpgradeHistoryEntriesRequest request);

    /**
     * Gets a list of the databases in the specified Database Home.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDatabasesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDatabases API.
     */
    ListDatabasesResponse listDatabases(ListDatabasesRequest request);

    /**
     * Lists the history of patch operations on the specified Database Home.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbHomePatchHistoryEntriesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDbHomePatchHistoryEntries API.
     */
    ListDbHomePatchHistoryEntriesResponse listDbHomePatchHistoryEntries(
            ListDbHomePatchHistoryEntriesRequest request);

    /**
     * Lists patches applicable to the requested Database Home.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbHomePatchesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDbHomePatches API.
     */
    ListDbHomePatchesResponse listDbHomePatches(ListDbHomePatchesRequest request);

    /**
     * Lists the Database Homes in the specified DB system and compartment. A Database Home is a directory where Oracle Database software is installed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbHomesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDbHomes API.
     */
    ListDbHomesResponse listDbHomes(ListDbHomesRequest request);

    /**
     * Lists the database nodes in the specified DB system and compartment. A database node is a server running database software.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbNodesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDbNodes API.
     */
    ListDbNodesResponse listDbNodes(ListDbNodesRequest request);

    /**
     * Gets the history of the patch actions performed on the specified DB system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbSystemPatchHistoryEntriesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDbSystemPatchHistoryEntries API.
     */
    ListDbSystemPatchHistoryEntriesResponse listDbSystemPatchHistoryEntries(
            ListDbSystemPatchHistoryEntriesRequest request);

    /**
     * Lists the patches applicable to the specified DB system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbSystemPatchesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDbSystemPatches API.
     */
    ListDbSystemPatchesResponse listDbSystemPatches(ListDbSystemPatchesRequest request);

    /**
     * Gets a list of the shapes that can be used to launch a new DB system. The shape determines resources to allocate to the DB system - CPU cores and memory for VM shapes; CPU cores, memory and storage for non-VM (or bare metal) shapes.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbSystemShapesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDbSystemShapes API.
     */
    ListDbSystemShapesResponse listDbSystemShapes(ListDbSystemShapesRequest request);

    /**
     * Lists the DB systems in the specified compartment. You can specify a `backupId` to list only the DB systems that support creating a database using this backup in this compartment.
     * <p>
     **Note:** Deprecated for Exadata Cloud Service systems. Use the [new resource model APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model) instead.
     * <p>
     * For Exadata Cloud Service instances, support for this API will end on May 15th, 2021. See [Switching an Exadata DB System to the New Resource Model and APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem_topic-resource_model_conversion.htm) for details on converting existing Exadata DB systems to the new resource model.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbSystemsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDbSystems API.
     */
    ListDbSystemsResponse listDbSystems(ListDbSystemsRequest request);

    /**
     * Gets a list of supported Oracle Database versions.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbVersionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDbVersions API.
     */
    ListDbVersionsResponse listDbVersions(ListDbVersionsRequest request);

    /**
     * Lists the Exadata infrastructure resources in the specified compartment. Applies to Exadata Cloud@Customer instances only.
     * To list the Exadata Cloud Service infrastructure resources in a compartment, use the  {@link #listCloudExadataInfrastructures(ListCloudExadataInfrastructuresRequest) listCloudExadataInfrastructures} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListExadataInfrastructuresExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExadataInfrastructures API.
     */
    ListExadataInfrastructuresResponse listExadataInfrastructures(
            ListExadataInfrastructuresRequest request);

    /**
     * Gets a list of the external container databases in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListExternalContainerDatabasesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExternalContainerDatabases API.
     */
    ListExternalContainerDatabasesResponse listExternalContainerDatabases(
            ListExternalContainerDatabasesRequest request);

    /**
     * Gets a list of the external database connectors in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListExternalDatabaseConnectorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExternalDatabaseConnectors API.
     */
    ListExternalDatabaseConnectorsResponse listExternalDatabaseConnectors(
            ListExternalDatabaseConnectorsRequest request);

    /**
     * Gets a list of the ExternalNonContainerDatabases in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListExternalNonContainerDatabasesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExternalNonContainerDatabases API.
     */
    ListExternalNonContainerDatabasesResponse listExternalNonContainerDatabases(
            ListExternalNonContainerDatabasesRequest request);

    /**
     * Gets a list of the {@link #createExternalPluggableDatabaseDetails(CreateExternalPluggableDatabaseDetailsRequest) createExternalPluggableDatabaseDetails}
     * resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListExternalPluggableDatabasesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExternalPluggableDatabases API.
     */
    ListExternalPluggableDatabasesResponse listExternalPluggableDatabases(
            ListExternalPluggableDatabasesRequest request);

    /**
     * Gets a list of the flex components that can be used to launch a new DB system. The flex component determines resources to allocate to the DB system - Database Servers and Storage Servers.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListFlexComponentsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListFlexComponents API.
     */
    ListFlexComponentsResponse listFlexComponents(ListFlexComponentsRequest request);

    /**
     * Gets a list of supported GI versions for the Exadata Cloud@Customer VM cluster.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListGiVersionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListGiVersions API.
     */
    ListGiVersionsResponse listGiVersions(ListGiVersionsRequest request);

    /**
     * Gets a list of key stores in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListKeyStoresExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListKeyStores API.
     */
    ListKeyStoresResponse listKeyStores(ListKeyStoresRequest request);

    /**
     * Gets a list of the maintenance runs in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListMaintenanceRunsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMaintenanceRuns API.
     */
    ListMaintenanceRunsResponse listMaintenanceRuns(ListMaintenanceRunsRequest request);

    /**
     * Gets a list of the VM cluster networks in the specified compartment. Applies to Exadata Cloud@Customer instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListVmClusterNetworksExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListVmClusterNetworks API.
     */
    ListVmClusterNetworksResponse listVmClusterNetworks(ListVmClusterNetworksRequest request);

    /**
     * Gets the history of the patch actions performed on the specified VM cluster in an Exadata Cloud@Customer system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListVmClusterPatchHistoryEntriesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListVmClusterPatchHistoryEntries API.
     */
    ListVmClusterPatchHistoryEntriesResponse listVmClusterPatchHistoryEntries(
            ListVmClusterPatchHistoryEntriesRequest request);

    /**
     * Lists the patches applicable to the specified VM cluster in an Exadata Cloud@Customer system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListVmClusterPatchesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListVmClusterPatches API.
     */
    ListVmClusterPatchesResponse listVmClusterPatches(ListVmClusterPatchesRequest request);

    /**
     * Lists the VM clusters in the specified compartment. Applies to Exadata Cloud@Customer instances only.
     * To list the cloud VM clusters in an Exadata Cloud Service instance, use the {@link #listCloudVmClusters(ListCloudVmClustersRequest) listCloudVmClusters} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListVmClustersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListVmClusters API.
     */
    ListVmClustersResponse listVmClusters(ListVmClustersRequest request);

    /**
     * Migrates the Exadata DB system to the new [Exadata resource model](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model).
     * All related resources will be migrated.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/MigrateExadataDbSystemResourceModelExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use MigrateExadataDbSystemResourceModel API.
     */
    MigrateExadataDbSystemResourceModelResponse migrateExadataDbSystemResourceModel(
            MigrateExadataDbSystemResourceModelRequest request);

    /**
     * Changes encryption key management from customer-managed, using the [Vault service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm), to Oracle-managed.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/MigrateVaultKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use MigrateVaultKey API.
     */
    MigrateVaultKeyResponse migrateVaultKey(MigrateVaultKeyRequest request);

    /**
     * Asynchronously registers this Autonomous Database with Data Safe.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RegisterAutonomousDatabaseDataSafeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RegisterAutonomousDatabaseDataSafe API.
     */
    RegisterAutonomousDatabaseDataSafeResponse registerAutonomousDatabaseDataSafe(
            RegisterAutonomousDatabaseDataSafeRequest request);

    /**
     * Reinstates a disabled standby Autonomous Container Database, identified by the autonomousContainerDatabaseId parameter, to an active standby Autonomous Container Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ReinstateAutonomousContainerDatabaseDataguardAssociationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ReinstateAutonomousContainerDatabaseDataguardAssociation API.
     */
    ReinstateAutonomousContainerDatabaseDataguardAssociationResponse
            reinstateAutonomousContainerDatabaseDataguardAssociation(
                    ReinstateAutonomousContainerDatabaseDataguardAssociationRequest request);

    /**
     * Reinstates the database identified by the `databaseId` parameter into the standby role in a Data Guard association.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ReinstateDataGuardAssociationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ReinstateDataGuardAssociation API.
     */
    ReinstateDataGuardAssociationResponse reinstateDataGuardAssociation(
            ReinstateDataGuardAssociationRequest request);

    /**
     * Rolling restarts the specified Autonomous Container Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RestartAutonomousContainerDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RestartAutonomousContainerDatabase API.
     */
    RestartAutonomousContainerDatabaseResponse restartAutonomousContainerDatabase(
            RestartAutonomousContainerDatabaseRequest request);

    /**
     * Restarts the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RestartAutonomousDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RestartAutonomousDatabase API.
     */
    RestartAutonomousDatabaseResponse restartAutonomousDatabase(
            RestartAutonomousDatabaseRequest request);

    /**
     * Restores an Autonomous Database based on the provided request parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RestoreAutonomousDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RestoreAutonomousDatabase API.
     */
    RestoreAutonomousDatabaseResponse restoreAutonomousDatabase(
            RestoreAutonomousDatabaseRequest request);

    /**
     * Restore a Database based on the request parameters you provide.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RestoreDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RestoreDatabase API.
     */
    RestoreDatabaseResponse restoreDatabase(RestoreDatabaseRequest request);

    /**
     * Creates a new version of an existing [Vault service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RotateAutonomousContainerDatabaseEncryptionKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RotateAutonomousContainerDatabaseEncryptionKey API.
     */
    RotateAutonomousContainerDatabaseEncryptionKeyResponse
            rotateAutonomousContainerDatabaseEncryptionKey(
                    RotateAutonomousContainerDatabaseEncryptionKeyRequest request);

    /**
     * Rotate existing AutonomousDatabase [Vault service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RotateAutonomousDatabaseEncryptionKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RotateAutonomousDatabaseEncryptionKey API.
     */
    RotateAutonomousDatabaseEncryptionKeyResponse rotateAutonomousDatabaseEncryptionKey(
            RotateAutonomousDatabaseEncryptionKeyRequest request);

    /**
     * Rotates Oracle REST Data Services (ORDS) certs for an Autonomous Exadata Infrastructure resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RotateOrdsCertsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RotateOrdsCerts API.
     */
    RotateOrdsCertsResponse rotateOrdsCerts(RotateOrdsCertsRequest request);

    /**
     * Rotates SSL certs for an Autonomous Exadata Infrastructure resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RotateSslCertsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RotateSslCerts API.
     */
    RotateSslCertsResponse rotateSslCerts(RotateSslCertsRequest request);

    /**
     * Creates a new version of an existing [Vault service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RotateVaultKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RotateVaultKey API.
     */
    RotateVaultKeyResponse rotateVaultKey(RotateVaultKeyRequest request);

    /**
     * Scans for pluggable databases in the specified external container database.
     * This operation will return un-registered pluggable databases in the `GetWorkRequest` operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ScanExternalContainerDatabasePluggableDatabasesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ScanExternalContainerDatabasePluggableDatabases API.
     */
    ScanExternalContainerDatabasePluggableDatabasesResponse
            scanExternalContainerDatabasePluggableDatabases(
                    ScanExternalContainerDatabasePluggableDatabasesRequest request);

    /**
     * Starts the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/StartAutonomousDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use StartAutonomousDatabase API.
     */
    StartAutonomousDatabaseResponse startAutonomousDatabase(StartAutonomousDatabaseRequest request);

    /**
     * Stops the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/StopAutonomousDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use StopAutonomousDatabase API.
     */
    StopAutonomousDatabaseResponse stopAutonomousDatabase(StopAutonomousDatabaseRequest request);

    /**
     * Switches over the primary Autonomous Container Database of an Autonomous Data Guard peer association to standby role. The standby Autonomous Container Database associated with autonomousContainerDatabaseDataguardAssociationId assumes the primary Autonomous Container Database role.
     * <p>
     * A switchover incurs no data loss.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/SwitchoverAutonomousContainerDatabaseDataguardAssociationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SwitchoverAutonomousContainerDatabaseDataguardAssociation API.
     */
    SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse
            switchoverAutonomousContainerDatabaseDataguardAssociation(
                    SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest request);

    /**
     * Initiates a switchover of the specified Autonomous Database to the associated standby database. Applicable only to databases with Autonomous Data Guard enabled.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/SwitchoverAutonomousDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SwitchoverAutonomousDatabase API.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/SwitchoverDataGuardAssociationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SwitchoverDataGuardAssociation API.
     */
    SwitchoverDataGuardAssociationResponse switchoverDataGuardAssociation(
            SwitchoverDataGuardAssociationRequest request);

    /**
     * Terminates an Autonomous Container Database, which permanently deletes the container database and any databases within the container database. The database data is local to the Autonomous Exadata Infrastructure and will be lost when the container database is terminated. Oracle recommends that you back up any data in the Autonomous Container Database prior to terminating it.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/TerminateAutonomousContainerDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use TerminateAutonomousContainerDatabase API.
     */
    TerminateAutonomousContainerDatabaseResponse terminateAutonomousContainerDatabase(
            TerminateAutonomousContainerDatabaseRequest request);

    /**
     * Terminates an Autonomous Exadata Infrastructure, which permanently deletes the infrastructure resource and any container databases and databases contained in the resource. The database data is local to the Autonomous Exadata Infrastructure and will be lost when the system is terminated. Oracle recommends that you back up any data in the Autonomous Exadata Infrastructure prior to terminating it.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/TerminateAutonomousExadataInfrastructureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use TerminateAutonomousExadataInfrastructure API.
     */
    TerminateAutonomousExadataInfrastructureResponse terminateAutonomousExadataInfrastructure(
            TerminateAutonomousExadataInfrastructureRequest request);

    /**
     * Terminates a DB system and permanently deletes it and any databases running on it, and any storage volumes attached to it. The database data is local to the DB system and will be lost when the system is terminated. Oracle recommends that you back up any data in the DB system prior to terminating it.
     * <p>
     **Note:** Deprecated for Exadata Cloud Service systems. Use the [new resource model APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model) instead.
     * <p>
     * For Exadata Cloud Service instances, support for this API will end on May 15th, 2021. See [Switching an Exadata DB System to the New Resource Model and APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem_topic-resource_model_conversion.htm) for details on converting existing Exadata DB systems to the new resource model.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/TerminateDbSystemExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use TerminateDbSystem API.
     */
    TerminateDbSystemResponse terminateDbSystem(TerminateDbSystemRequest request);

    /**
     * Updates the properties of an Autonomous Container Database, such as the OCPU core count and storage size.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateAutonomousContainerDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateAutonomousContainerDatabase API.
     */
    UpdateAutonomousContainerDatabaseResponse updateAutonomousContainerDatabase(
            UpdateAutonomousContainerDatabaseRequest request);

    /**
     * Updates one or more attributes of the specified Autonomous Database. See the UpdateAutonomousDatabaseDetails resource for a full list of attributes that can be updated.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateAutonomousDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateAutonomousDatabase API.
     */
    UpdateAutonomousDatabaseResponse updateAutonomousDatabase(
            UpdateAutonomousDatabaseRequest request);

    /**
     * Updates the Autonomous Database regional wallet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateAutonomousDatabaseRegionalWalletExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateAutonomousDatabaseRegionalWallet API.
     */
    UpdateAutonomousDatabaseRegionalWalletResponse updateAutonomousDatabaseRegionalWallet(
            UpdateAutonomousDatabaseRegionalWalletRequest request);

    /**
     * Updates the wallet for the specified Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateAutonomousDatabaseWalletExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateAutonomousDatabaseWallet API.
     */
    UpdateAutonomousDatabaseWalletResponse updateAutonomousDatabaseWallet(
            UpdateAutonomousDatabaseWalletRequest request);

    /**
     * Updates the properties of an Autonomous Exadata Infrastructure, such as the CPU core count.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateAutonomousExadataInfrastructureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateAutonomousExadataInfrastructure API.
     */
    UpdateAutonomousExadataInfrastructureResponse updateAutonomousExadataInfrastructure(
            UpdateAutonomousExadataInfrastructureRequest request);

    /**
     * Updates the specified Autonomous VM cluster for the Exadata Cloud@Customer system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateAutonomousVmClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateAutonomousVmCluster API.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateBackupDestinationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateBackupDestination API.
     */
    UpdateBackupDestinationResponse updateBackupDestination(UpdateBackupDestinationRequest request);

    /**
     * Updates the Cloud Exadata infrastructure resource. Applies to Exadata Cloud Service instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateCloudExadataInfrastructureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateCloudExadataInfrastructure API.
     */
    UpdateCloudExadataInfrastructureResponse updateCloudExadataInfrastructure(
            UpdateCloudExadataInfrastructureRequest request);

    /**
     * Updates the specified cloud VM cluster. Applies to Exadata Cloud Service instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateCloudVmClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateCloudVmCluster API.
     */
    UpdateCloudVmClusterResponse updateCloudVmCluster(UpdateCloudVmClusterRequest request);

    /**
     * Updates the IORM settings for the specified cloud VM cluster in an Exadata Cloud Service instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateCloudVmClusterIormConfigExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateCloudVmClusterIormConfig API.
     */
    UpdateCloudVmClusterIormConfigResponse updateCloudVmClusterIormConfig(
            UpdateCloudVmClusterIormConfigRequest request);

    /**
     * Update the specified database based on the request parameters provided.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDatabase API.
     */
    UpdateDatabaseResponse updateDatabase(UpdateDatabaseRequest request);

    /**
     * Updates the properties of a Database Software Image, like Display Nmae
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateDatabaseSoftwareImageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDatabaseSoftwareImage API.
     */
    UpdateDatabaseSoftwareImageResponse updateDatabaseSoftwareImage(
            UpdateDatabaseSoftwareImageRequest request);

    /**
     * Patches the specified Database Home.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateDbHomeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDbHome API.
     */
    UpdateDbHomeResponse updateDbHome(UpdateDbHomeRequest request);

    /**
     * Updates the properties of the specified DB system.
     * <p>
     **Note:** Deprecated for Exadata Cloud Service systems. Use the [new resource model APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model) instead.
     * <p>
     * For Exadata Cloud Service instances, support for this API will end on May 15th, 2021. See [Switching an Exadata DB System to the New Resource Model and APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem_topic-resource_model_conversion.htm) for details on converting existing Exadata DB systems to the new resource model.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateDbSystemExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDbSystem API.
     */
    UpdateDbSystemResponse updateDbSystem(UpdateDbSystemRequest request);

    /**
     * Updates the Exadata infrastructure resource. Applies to Exadata Cloud@Customer instances only.
     * To update an Exadata Cloud Service infrastructure resource, use the  {@link #updateCloudExadataInfrastructure(UpdateCloudExadataInfrastructureRequest) updateCloudExadataInfrastructure} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateExadataInfrastructureExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExadataInfrastructure API.
     */
    UpdateExadataInfrastructureResponse updateExadataInfrastructure(
            UpdateExadataInfrastructureRequest request);

    /**
     * Updates IORM settings for the specified Exadata DB system.
     * <p>
     **Note:** Deprecated for Exadata Cloud Service systems. Use the [new resource model APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model) instead.
     * <p>
     * For Exadata Cloud Service instances, support for this API will end on May 15th, 2021. See [Switching an Exadata DB System to the New Resource Model and APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem_topic-resource_model_conversion.htm) for details on converting existing Exadata DB systems to the new resource model.
     * <p>
     * The {@link #updateCloudVmClusterIormConfig(UpdateCloudVmClusterIormConfigRequest) updateCloudVmClusterIormConfig} API is used for Exadata systems using the
     * new resource model.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateExadataIormConfigExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExadataIormConfig API.
     */
    UpdateExadataIormConfigResponse updateExadataIormConfig(UpdateExadataIormConfigRequest request);

    /**
     * Updates the properties of
     * an {@link #createExternalContainerDatabaseDetails(CreateExternalContainerDatabaseDetailsRequest) createExternalContainerDatabaseDetails} resource,
     * such as the display name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateExternalContainerDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExternalContainerDatabase API.
     */
    UpdateExternalContainerDatabaseResponse updateExternalContainerDatabase(
            UpdateExternalContainerDatabaseRequest request);

    /**
     * Updates the properties of an external database connector, such as the display name.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateExternalDatabaseConnectorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExternalDatabaseConnector API.
     */
    UpdateExternalDatabaseConnectorResponse updateExternalDatabaseConnector(
            UpdateExternalDatabaseConnectorRequest request);

    /**
     * Updates the properties of an external non-container database, such as the display name.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateExternalNonContainerDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExternalNonContainerDatabase API.
     */
    UpdateExternalNonContainerDatabaseResponse updateExternalNonContainerDatabase(
            UpdateExternalNonContainerDatabaseRequest request);

    /**
     * Updates the properties of an
     * {@link #createExternalPluggableDatabaseDetails(CreateExternalPluggableDatabaseDetailsRequest) createExternalPluggableDatabaseDetails} resource,
     * such as the display name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateExternalPluggableDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExternalPluggableDatabase API.
     */
    UpdateExternalPluggableDatabaseResponse updateExternalPluggableDatabase(
            UpdateExternalPluggableDatabaseRequest request);

    /**
     * If no database is associated with the key store, edit the key store.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateKeyStoreExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateKeyStore API.
     */
    UpdateKeyStoreResponse updateKeyStore(UpdateKeyStoreRequest request);

    /**
     * Updates the properties of a maintenance run, such as the state of a maintenance run.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateMaintenanceRunExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateMaintenanceRun API.
     */
    UpdateMaintenanceRunResponse updateMaintenanceRun(UpdateMaintenanceRunRequest request);

    /**
     * Updates the specified VM cluster. Applies to Exadata Cloud@Customer instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateVmClusterExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateVmCluster API.
     */
    UpdateVmClusterResponse updateVmCluster(UpdateVmClusterRequest request);

    /**
     * Updates the specified VM cluster network. Applies to Exadata Cloud@Customer instances only.
     * To update a cloud VM cluster in an Exadata Cloud Service instance, use the {@link #updateCloudVmCluster(UpdateCloudVmClusterRequest) updateCloudVmCluster} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateVmClusterNetworkExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateVmClusterNetwork API.
     */
    UpdateVmClusterNetworkResponse updateVmClusterNetwork(UpdateVmClusterNetworkRequest request);

    /**
     * Upgrades the specified Oracle Database instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpgradeDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpgradeDatabase API.
     */
    UpgradeDatabaseResponse upgradeDatabase(UpgradeDatabaseRequest request);

    /**
     * Validates the specified VM cluster network. Applies to Exadata Cloud@Customer instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ValidateVmClusterNetworkExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ValidateVmClusterNetwork API.
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
    DatabaseWaiters newWaiters(com.oracle.bmc.workrequests.WorkRequest workRequestClient);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DatabasePaginators getPaginators();
}
