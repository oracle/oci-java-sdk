/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

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
     * Determines whether realm specific endpoint should be used or not.
     * Set realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm specific endpoint template, otherwise set it to "false"
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

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
     * Makes the storage capacity from additional storage servers available for Cloud VM Cluster consumption. Applies to Exadata Cloud Service instances and Autonomous Database on dedicated Exadata infrastructure only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddStorageCapacityCloudExadataInfrastructureResponse>
            addStorageCapacityCloudExadataInfrastructure(
                    AddStorageCapacityCloudExadataInfrastructureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AddStorageCapacityCloudExadataInfrastructureRequest,
                                    AddStorageCapacityCloudExadataInfrastructureResponse>
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
     * Add Virtual Machines to the Cloud VM cluster. Applies to Exadata Cloud instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddVirtualMachineToCloudVmClusterResponse>
            addVirtualMachineToCloudVmCluster(
                    AddVirtualMachineToCloudVmClusterRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AddVirtualMachineToCloudVmClusterRequest,
                                    AddVirtualMachineToCloudVmClusterResponse>
                            handler);

    /**
     * Add Virtual Machines to the VM cluster. Applies to Exadata Cloud@Customer instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddVirtualMachineToVmClusterResponse> addVirtualMachineToVmCluster(
            AddVirtualMachineToVmClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddVirtualMachineToVmClusterRequest,
                            AddVirtualMachineToVmClusterResponse>
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
     * Cancel automatic/standalone full/incremental create backup workrequests specified by the backup Id.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CancelBackupResponse> cancelBackup(
            CancelBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<CancelBackupRequest, CancelBackupResponse>
                    handler);

    /**
     * Cancels the in progress maintenance activity under this execution window.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CancelExecutionWindowResponse> cancelExecutionWindow(
            CancelExecutionWindowRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelExecutionWindowRequest, CancelExecutionWindowResponse>
                    handler);

    /**
     * Delete the scheduling plan resource along with all the scheduled actions associated with this resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CascadingDeleteSchedulingPlanResponse>
            cascadingDeleteSchedulingPlan(
                    CascadingDeleteSchedulingPlanRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CascadingDeleteSchedulingPlanRequest,
                                    CascadingDeleteSchedulingPlanResponse>
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
     * Move the Autonomous Database Software Image and its dependent resources to the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeAutonomousDatabaseSoftwareImageCompartmentResponse>
            changeAutonomousDatabaseSoftwareImageCompartment(
                    ChangeAutonomousDatabaseSoftwareImageCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAutonomousDatabaseSoftwareImageCompartmentRequest,
                                    ChangeAutonomousDatabaseSoftwareImageCompartmentResponse>
                            handler);

    /**
     * Associate an Autonomous Database with a different subscription.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeAutonomousDatabaseSubscriptionResponse>
            changeAutonomousDatabaseSubscription(
                    ChangeAutonomousDatabaseSubscriptionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAutonomousDatabaseSubscriptionRequest,
                                    ChangeAutonomousDatabaseSubscriptionResponse>
                            handler);

    /**
     * **Deprecated.** Use the {@link #changeCloudExadataInfrastructureCompartment(ChangeCloudExadataInfrastructureCompartmentRequest, Consumer, Consumer) changeCloudExadataInfrastructureCompartment} operation to move an Exadata infrastructure resource to a different compartment and  {@link #changeCloudAutonomousVmClusterCompartment(ChangeCloudAutonomousVmClusterCompartmentRequest, Consumer, Consumer) changeCloudAutonomousVmClusterCompartment} operation to move an Autonomous Exadata VM cluster to a different compartment.
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
     * Moves an Autonomous VM cluster and its dependent resources to another compartment. Applies to Exadata Cloud@Customer  only. For systems in the Oracle cloud, see {@link #changeAutonomousVmClusterCompartment(ChangeAutonomousVmClusterCompartmentRequest, Consumer, Consumer) changeAutonomousVmClusterCompartment}.
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
     * Moves an Autonomous Exadata VM cluster in the Oracle cloud and its dependent resources to another compartment. For Exadata Cloud@Customer systems, see {@link #changeAutonomousVmClusterCompartment(ChangeAutonomousVmClusterCompartmentRequest, Consumer, Consumer) changeAutonomousVmClusterCompartment}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeCloudAutonomousVmClusterCompartmentResponse>
            changeCloudAutonomousVmClusterCompartment(
                    ChangeCloudAutonomousVmClusterCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCloudAutonomousVmClusterCompartmentRequest,
                                    ChangeCloudAutonomousVmClusterCompartmentResponse>
                            handler);

    /**
     * Moves a cloud Exadata infrastructure resource and its dependent resources to another compartment. Applies to Exadata Cloud Service instances and Autonomous Database on dedicated Exadata infrastructure only.For more information about moving resources to a different compartment, see [Moving Database Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Database/Concepts/databaseoverview.htm#moveRes).
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
     * Associate a cloud Exadata infrastructure with a different subscription.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeCloudExadataInfrastructureSubscriptionResponse>
            changeCloudExadataInfrastructureSubscription(
                    ChangeCloudExadataInfrastructureSubscriptionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCloudExadataInfrastructureSubscriptionRequest,
                                    ChangeCloudExadataInfrastructureSubscriptionResponse>
                            handler);

    /**
     * Moves a cloud VM cluster and its dependent resources to another compartment. Applies to Exadata Cloud Service instances and Autonomous Database on dedicated Exadata infrastructure only.
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
     * Associate a cloud VM cluster with a different subscription.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeCloudVmClusterSubscriptionResponse>
            changeCloudVmClusterSubscription(
                    ChangeCloudVmClusterSubscriptionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCloudVmClusterSubscriptionRequest,
                                    ChangeCloudVmClusterSubscriptionResponse>
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
     * Switch the Autonomous Container Database role between Standby and Snapshot Standby.
     * For more information about changing Autonomous Container Databases Dataguard Role, see
     * [Convert Physical Standby to Snapshot Standby](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbcl/index.html#ADBCL-GUID-D3B503F1-0032-4B0D-9F00-ACAE8151AB80) and [Convert Snapshot Standby to Physical Standby](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbcl/index.html#ADBCL-GUID-E8D7E0EE-8244-467D-B33A-1BC6F969A0A4).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDataguardRoleResponse> changeDataguardRole(
            ChangeDataguardRoleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeDataguardRoleRequest, ChangeDataguardRoleResponse>
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
     * This operation updates the cross-region disaster recovery (DR) details of the standby Autonomous Database Serverless database, and must be run on the standby side.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDisasterRecoveryConfigurationResponse>
            changeDisasterRecoveryConfiguration(
                    ChangeDisasterRecoveryConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDisasterRecoveryConfigurationRequest,
                                    ChangeDisasterRecoveryConfigurationResponse>
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
     * Moves a Exadata VM cluster on Exascale Infrastructure and its dependent resources to another compartment. Applies to Exadata Database Service on Exascale Infrastructure only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeExadbVmClusterCompartmentResponse>
            changeExadbVmClusterCompartment(
                    ChangeExadbVmClusterCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeExadbVmClusterCompartmentRequest,
                                    ChangeExadbVmClusterCompartmentResponse>
                            handler);

    /**
     * Moves a Exadata Database Storage Vault to another compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeExascaleDbStorageVaultCompartmentResponse>
            changeExascaleDbStorageVaultCompartment(
                    ChangeExascaleDbStorageVaultCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeExascaleDbStorageVaultCompartmentRequest,
                                    ChangeExascaleDbStorageVaultCompartmentResponse>
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
     * Changes encryption key management type
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeKeyStoreTypeResponse> changeKeyStoreType(
            ChangeKeyStoreTypeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeKeyStoreTypeRequest, ChangeKeyStoreTypeResponse>
                    handler);

    /**
     * Move the one-off patch to the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeOneoffPatchCompartmentResponse> changeOneoffPatchCompartment(
            ChangeOneoffPatchCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeOneoffPatchCompartmentRequest,
                            ChangeOneoffPatchCompartmentResponse>
                    handler);

    /**
     * Moves an scheduling plan resource to another compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeSchedulingPlanCompartmentResponse>
            changeSchedulingPlanCompartment(
                    ChangeSchedulingPlanCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSchedulingPlanCompartmentRequest,
                                    ChangeSchedulingPlanCompartmentResponse>
                            handler);

    /**
     * Moves an scheduling policy resource to another compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeSchedulingPolicyCompartmentResponse>
            changeSchedulingPolicyCompartment(
                    ChangeSchedulingPolicyCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSchedulingPolicyCompartmentRequest,
                                    ChangeSchedulingPolicyCompartmentResponse>
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
     * Configures Exascale on Exadata infrastructure resource. Applies to Exadata Cloud@Customer instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ConfigureExascaleExadataInfrastructureResponse>
            configureExascaleExadataInfrastructure(
                    ConfigureExascaleExadataInfrastructureRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureExascaleExadataInfrastructureRequest,
                                    ConfigureExascaleExadataInfrastructureResponse>
                            handler);

    /**
     * This operation updates SaaS administrative user configuration of the Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ConfigureSaasAdminUserResponse> configureSaasAdminUser(
            ConfigureSaasAdminUserRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ConfigureSaasAdminUserRequest, ConfigureSaasAdminUserResponse>
                    handler);

    /**
     * This is for user to confirm to DBaaS that the Oracle Key Valut (OKV) connection IPs, username and password are all correct. This operation will put
     * the Key Store back into Active state. If details are incorrect, your OKV account may get locked after some unsuccessful attempts to connect.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ConfirmKeyStoreDetailsAreCorrectResponse>
            confirmKeyStoreDetailsAreCorrect(
                    ConfirmKeyStoreDetailsAreCorrectRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ConfirmKeyStoreDetailsAreCorrectRequest,
                                    ConfirmKeyStoreDetailsAreCorrectResponse>
                            handler);

    /**
     * Converts a non-container database to a pluggable database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ConvertToPdbResponse> convertToPdb(
            ConvertToPdbRequest request,
            com.oracle.bmc.responses.AsyncHandler<ConvertToPdbRequest, ConvertToPdbResponse>
                    handler);

    /**
     * Converts a Refreshable clone to Regular pluggable database (PDB).
     * Pluggable Database will be in `READ_WRITE` openmode after conversion.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ConvertToRegularPluggableDatabaseResponse>
            convertToRegularPluggableDatabase(
                    ConvertToRegularPluggableDatabaseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ConvertToRegularPluggableDatabaseRequest,
                                    ConvertToRegularPluggableDatabaseResponse>
                            handler);

    /**
     * Creates a new application virtual IP (VIP) address in the specified cloud VM cluster based on the request parameters you provide.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateApplicationVipResponse> createApplicationVip(
            CreateApplicationVipRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateApplicationVipRequest, CreateApplicationVipResponse>
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
     * Create a new Autonomous Data Guard association. An Autonomous Data Guard association represents the replication relationship between the
     * specified Autonomous Container database and a peer Autonomous Container database. For more information, see [Using Oracle Data Guard](https://docs.cloud.oracle.com/Content/Database/Tasks/usingdataguard.htm).
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
    java.util.concurrent.Future<CreateAutonomousContainerDatabaseDataguardAssociationResponse>
            createAutonomousContainerDatabaseDataguardAssociation(
                    CreateAutonomousContainerDatabaseDataguardAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateAutonomousContainerDatabaseDataguardAssociationRequest,
                                    CreateAutonomousContainerDatabaseDataguardAssociationResponse>
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
     * create Autonomous Database Software Image in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAutonomousDatabaseSoftwareImageResponse>
            createAutonomousDatabaseSoftwareImage(
                    CreateAutonomousDatabaseSoftwareImageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateAutonomousDatabaseSoftwareImageRequest,
                                    CreateAutonomousDatabaseSoftwareImageResponse>
                            handler);

    /**
     * Creates an Autonomous VM cluster for Exadata Cloud@Customer. To create an Autonomous VM Cluster in the Oracle cloud, see {@link #createCloudAutonomousVmCluster(CreateCloudAutonomousVmClusterRequest, Consumer, Consumer) createCloudAutonomousVmCluster}.
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
     * Creates an Autonomous Exadata VM cluster in the Oracle cloud. For Exadata Cloud@Customer systems, see {@link #createAutonomousVmCluster(CreateAutonomousVmClusterRequest, Consumer, Consumer) createAutonomousVmCluster}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateCloudAutonomousVmClusterResponse>
            createCloudAutonomousVmCluster(
                    CreateCloudAutonomousVmClusterRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateCloudAutonomousVmClusterRequest,
                                    CreateCloudAutonomousVmClusterResponse>
                            handler);

    /**
     * Creates a cloud Exadata infrastructure resource. This resource is used to create either an [Exadata Cloud Service](https://docs.cloud.oracle.com/Content/Database/Concepts/exaoverview.htm) instance or an Autonomous Database on dedicated Exadata infrastructure.
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
     * Captures the most recent serial console data (up to a megabyte) for the specified database node.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateConsoleHistoryResponse> createConsoleHistory(
            CreateConsoleHistoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateConsoleHistoryRequest, CreateConsoleHistoryResponse>
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
     * Creates an Exadata VM cluster on Exascale Infrastructure
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateExadbVmClusterResponse> createExadbVmCluster(
            CreateExadbVmClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateExadbVmClusterRequest, CreateExadbVmClusterResponse>
                    handler);

    /**
     * Creates an Exadata Database Storage Vault
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateExascaleDbStorageVaultResponse> createExascaleDbStorageVault(
            CreateExascaleDbStorageVaultRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateExascaleDbStorageVaultRequest,
                            CreateExascaleDbStorageVaultResponse>
                    handler);

    /**
     * Creates an execution action resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateExecutionActionResponse> createExecutionAction(
            CreateExecutionActionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateExecutionActionRequest, CreateExecutionActionResponse>
                    handler);

    /**
     * Creates an execution window resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateExecutionWindowResponse> createExecutionWindow(
            CreateExecutionWindowRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateExecutionWindowRequest, CreateExecutionWindowResponse>
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
     * Creates a maintenance run with one of the following:
     * 1. The latest available release update patch (RUP) for the Autonomous Container Database.
     * 2. The latest available RUP and DST time-zone (TZ) file updates for the Autonomous Container Database.
     * 3. The DST TZ file updates for the Autonomous Container Database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateMaintenanceRunResponse> createMaintenanceRun(
            CreateMaintenanceRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateMaintenanceRunRequest, CreateMaintenanceRunResponse>
                    handler);

    /**
     * Creates one-off patch for specified database version to download.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateOneoffPatchResponse> createOneoffPatch(
            CreateOneoffPatchRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateOneoffPatchRequest, CreateOneoffPatchResponse>
                    handler);

    /**
     * Creates and starts a pluggable database in the specified container database.
     * Pluggable Database can be created using different operations (e.g. LocalClone, RemoteClone, Relocate ) with this API.
     * Use the {@link #startPluggableDatabase(StartPluggableDatabaseRequest, Consumer, Consumer) startPluggableDatabase} and {@link #stopPluggableDatabase(StopPluggableDatabaseRequest, Consumer, Consumer) stopPluggableDatabase} APIs to start and stop the pluggable database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreatePluggableDatabaseResponse> createPluggableDatabase(
            CreatePluggableDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreatePluggableDatabaseRequest, CreatePluggableDatabaseResponse>
                    handler);

    /**
     * Creates a Scheduled Action resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateScheduledActionResponse> createScheduledAction(
            CreateScheduledActionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateScheduledActionRequest, CreateScheduledActionResponse>
                    handler);

    /**
     * Creates a Scheduling Plan resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateSchedulingPlanResponse> createSchedulingPlan(
            CreateSchedulingPlanRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSchedulingPlanRequest, CreateSchedulingPlanResponse>
                    handler);

    /**
     * Creates a Scheduling Policy resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateSchedulingPolicyResponse> createSchedulingPolicy(
            CreateSchedulingPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSchedulingPolicyRequest, CreateSchedulingPolicyResponse>
                    handler);

    /**
     * Creates a Scheduling Window resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateSchedulingWindowResponse> createSchedulingWindow(
            CreateSchedulingWindowRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSchedulingWindowRequest, CreateSchedulingWindowResponse>
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
     * Deletes and deregisters the specified application virtual IP (VIP) address.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteApplicationVipResponse> deleteApplicationVip(
            DeleteApplicationVipRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteApplicationVipRequest, DeleteApplicationVipResponse>
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
     * Deletes a long-term backup. You cannot delete other backups using this API.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAutonomousDatabaseBackupResponse>
            deleteAutonomousDatabaseBackup(
                    DeleteAutonomousDatabaseBackupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteAutonomousDatabaseBackupRequest,
                                    DeleteAutonomousDatabaseBackupResponse>
                            handler);

    /**
     * Delete an Autonomous Database Software Image
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAutonomousDatabaseSoftwareImageResponse>
            deleteAutonomousDatabaseSoftwareImage(
                    DeleteAutonomousDatabaseSoftwareImageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteAutonomousDatabaseSoftwareImageRequest,
                                    DeleteAutonomousDatabaseSoftwareImageResponse>
                            handler);

    /**
     * Deletes the specified Autonomous VM cluster in an Exadata Cloud@Customer system. To delete an Autonomous VM Cluster in the Oracle cloud, see {@link #deleteCloudAutonomousVmCluster(DeleteCloudAutonomousVmClusterRequest, Consumer, Consumer) deleteCloudAutonomousVmCluster}.
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
     * Deletes the specified Autonomous Exadata VM cluster in the Oracle cloud. For Exadata Cloud@Customer systems, see {@link #deleteAutonomousVmCluster(DeleteAutonomousVmClusterRequest, Consumer, Consumer) deleteAutonomousVmCluster}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCloudAutonomousVmClusterResponse>
            deleteCloudAutonomousVmCluster(
                    DeleteCloudAutonomousVmClusterRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteCloudAutonomousVmClusterRequest,
                                    DeleteCloudAutonomousVmClusterResponse>
                            handler);

    /**
     * Deletes the cloud Exadata infrastructure resource. Applies to Exadata Cloud Service instances and Autonomous Database on dedicated Exadata infrastructure only.
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
     * Deletes the specified cloud VM cluster. Applies to Exadata Cloud Service instances and Autonomous Database on dedicated Exadata infrastructure only.
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
     * Deletes the specified database node console history.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteConsoleHistoryResponse> deleteConsoleHistory(
            DeleteConsoleHistoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteConsoleHistoryRequest, DeleteConsoleHistoryResponse>
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
     * Deletes the specified Exadata VM cluster on Exascale Infrastructure. Applies to Exadata Database Service on Exascale Infrastructure only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteExadbVmClusterResponse> deleteExadbVmCluster(
            DeleteExadbVmClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteExadbVmClusterRequest, DeleteExadbVmClusterResponse>
                    handler);

    /**
     * Deletes the specified Exadata Database Storage Vault.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteExascaleDbStorageVaultResponse> deleteExascaleDbStorageVault(
            DeleteExascaleDbStorageVaultRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteExascaleDbStorageVaultRequest,
                            DeleteExascaleDbStorageVaultResponse>
                    handler);

    /**
     * Deletes the execution action.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteExecutionActionResponse> deleteExecutionAction(
            DeleteExecutionActionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteExecutionActionRequest, DeleteExecutionActionResponse>
                    handler);

    /**
     * Deletes the execution window.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteExecutionWindowResponse> deleteExecutionWindow(
            DeleteExecutionWindowRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteExecutionWindowRequest, DeleteExecutionWindowResponse>
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
     * Deletes a one-off patch.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOneoffPatchResponse> deleteOneoffPatch(
            DeleteOneoffPatchRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteOneoffPatchRequest, DeleteOneoffPatchResponse>
                    handler);

    /**
     * Deletes the specified pluggable database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeletePluggableDatabaseResponse> deletePluggableDatabase(
            DeletePluggableDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeletePluggableDatabaseRequest, DeletePluggableDatabaseResponse>
                    handler);

    /**
     * Deletes the scheduled action.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteScheduledActionResponse> deleteScheduledAction(
            DeleteScheduledActionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteScheduledActionRequest, DeleteScheduledActionResponse>
                    handler);

    /**
     * Deletes the scheduling plan.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSchedulingPlanResponse> deleteSchedulingPlan(
            DeleteSchedulingPlanRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSchedulingPlanRequest, DeleteSchedulingPlanResponse>
                    handler);

    /**
     * Deletes the scheduling policy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSchedulingPolicyResponse> deleteSchedulingPolicy(
            DeleteSchedulingPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSchedulingPolicyRequest, DeleteSchedulingPolicyResponse>
                    handler);

    /**
     * Deletes the scheduling window.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSchedulingWindowResponse> deleteSchedulingWindow(
            DeleteSchedulingWindowRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSchedulingWindowRequest, DeleteSchedulingWindowResponse>
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
     * Disables Database Management for the Autonomous Database resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DisableAutonomousDatabaseManagementResponse>
            disableAutonomousDatabaseManagement(
                    DisableAutonomousDatabaseManagementRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableAutonomousDatabaseManagementRequest,
                                    DisableAutonomousDatabaseManagementResponse>
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
     * Disables the Database Management service for the database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DisableDatabaseManagementResponse> disableDatabaseManagement(
            DisableDatabaseManagementRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DisableDatabaseManagementRequest, DisableDatabaseManagementResponse>
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
     * Disable Stack Monitoring for the external container database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DisableExternalContainerDatabaseStackMonitoringResponse>
            disableExternalContainerDatabaseStackMonitoring(
                    DisableExternalContainerDatabaseStackMonitoringRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalContainerDatabaseStackMonitoringRequest,
                                    DisableExternalContainerDatabaseStackMonitoringResponse>
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
     * Disable Stack Monitoring for the external non-container database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DisableExternalNonContainerDatabaseStackMonitoringResponse>
            disableExternalNonContainerDatabaseStackMonitoring(
                    DisableExternalNonContainerDatabaseStackMonitoringRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalNonContainerDatabaseStackMonitoringRequest,
                                    DisableExternalNonContainerDatabaseStackMonitoringResponse>
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
     * Disable Stack Monitoring for the external pluggable database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DisableExternalPluggableDatabaseStackMonitoringResponse>
            disableExternalPluggableDatabaseStackMonitoring(
                    DisableExternalPluggableDatabaseStackMonitoringRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableExternalPluggableDatabaseStackMonitoringRequest,
                                    DisableExternalPluggableDatabaseStackMonitoringResponse>
                            handler);

    /**
     * Disables the Database Management service for the pluggable database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DisablePluggableDatabaseManagementResponse>
            disablePluggableDatabaseManagement(
                    DisablePluggableDatabaseManagementRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisablePluggableDatabaseManagementRequest,
                                    DisablePluggableDatabaseManagementResponse>
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
     * Download one-off patch.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DownloadOneoffPatchResponse> downloadOneoffPatch(
            DownloadOneoffPatchRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DownloadOneoffPatchRequest, DownloadOneoffPatchResponse>
                    handler);

    /**
     * Downloads the network validation report file for the specified VM cluster network. Applies to Exadata Cloud@Customer instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DownloadValidationReportResponse> downloadValidationReport(
            DownloadValidationReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DownloadValidationReportRequest, DownloadValidationReportResponse>
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
     * Enables Database Management for Autonomous Database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<EnableAutonomousDatabaseManagementResponse>
            enableAutonomousDatabaseManagement(
                    EnableAutonomousDatabaseManagementRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableAutonomousDatabaseManagementRequest,
                                    EnableAutonomousDatabaseManagementResponse>
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
     * Enables the Database Management service for an Oracle Database located in Oracle Cloud Infrastructure. This service allows the database to access tools including Metrics and Performance hub. Database Management is enabled at the container database (CDB) level.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<EnableDatabaseManagementResponse> enableDatabaseManagement(
            EnableDatabaseManagementRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            EnableDatabaseManagementRequest, EnableDatabaseManagementResponse>
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
     * Enable Stack Monitoring for the external container database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<EnableExternalContainerDatabaseStackMonitoringResponse>
            enableExternalContainerDatabaseStackMonitoring(
                    EnableExternalContainerDatabaseStackMonitoringRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalContainerDatabaseStackMonitoringRequest,
                                    EnableExternalContainerDatabaseStackMonitoringResponse>
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
     * Enable Stack Monitoring for the external non-container database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<EnableExternalNonContainerDatabaseStackMonitoringResponse>
            enableExternalNonContainerDatabaseStackMonitoring(
                    EnableExternalNonContainerDatabaseStackMonitoringRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalNonContainerDatabaseStackMonitoringRequest,
                                    EnableExternalNonContainerDatabaseStackMonitoringResponse>
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
     * Enable Stack Monitoring for the external pluggable database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<EnableExternalPluggableDatabaseStackMonitoringResponse>
            enableExternalPluggableDatabaseStackMonitoring(
                    EnableExternalPluggableDatabaseStackMonitoringRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableExternalPluggableDatabaseStackMonitoringRequest,
                                    EnableExternalPluggableDatabaseStackMonitoringResponse>
                            handler);

    /**
     * Enables the Database Management service for an Oracle Pluggable Database located in Oracle Cloud Infrastructure. This service allows the pluggable database to access tools including Metrics and Performance hub. Database Management is enabled at the pluggable database (PDB) level.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<EnablePluggableDatabaseManagementResponse>
            enablePluggableDatabaseManagement(
                    EnablePluggableDatabaseManagementRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnablePluggableDatabaseManagementRequest,
                                    EnablePluggableDatabaseManagementResponse>
                            handler);

    /**
     * Initiates a failover of the specified Autonomous Database to the associated peer database. Applicable only to databases with Disaster Recovery enabled.
     * This API should be called in the remote region where the peer database resides.
     * Below parameter is optional:
     *   - `peerDbId`
     *     Use this parameter to specify the database OCID of the Disaster Recovery peer, which is located in a different (remote) region from the current peer database.
     *     If this parameter is not provided, the failover will happen in the same region.
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
     * Gets information about a specified application virtual IP (VIP) address.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetApplicationVipResponse> getApplicationVip(
            GetApplicationVipRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetApplicationVipRequest, GetApplicationVipResponse>
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
     * Get resource usage details for the specified Autonomous Container Database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAutonomousContainerDatabaseResourceUsageResponse>
            getAutonomousContainerDatabaseResourceUsage(
                    GetAutonomousContainerDatabaseResourceUsageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetAutonomousContainerDatabaseResourceUsageRequest,
                                    GetAutonomousContainerDatabaseResourceUsageResponse>
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
     * Gets information about the specified Autonomous Database Software Image.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAutonomousDatabaseSoftwareImageResponse>
            getAutonomousDatabaseSoftwareImage(
                    GetAutonomousDatabaseSoftwareImageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetAutonomousDatabaseSoftwareImageRequest,
                                    GetAutonomousDatabaseSoftwareImageResponse>
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
     * **Deprecated.** Use the {@link #getCloudExadataInfrastructure(GetCloudExadataInfrastructureRequest, Consumer, Consumer) getCloudExadataInfrastructure} operation to get details of an Exadata Infrastructure resource and the {@link #getCloudAutonomousVmCluster(GetCloudAutonomousVmClusterRequest, Consumer, Consumer) getCloudAutonomousVmCluster} operation to get details of an Autonomous Exadata VM cluster.
     *
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
     * Gets the details of specific Autonomous Virtual Machine.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAutonomousVirtualMachineResponse> getAutonomousVirtualMachine(
            GetAutonomousVirtualMachineRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAutonomousVirtualMachineRequest, GetAutonomousVirtualMachineResponse>
                    handler);

    /**
     * Gets information about the specified Autonomous VM cluster for an Exadata Cloud@Customer system. To get information about an Autonomous VM Cluster in the Oracle cloud, see {@link #getCloudAutonomousVmCluster(GetCloudAutonomousVmClusterRequest, Consumer, Consumer) getCloudAutonomousVmCluster}.
     *
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
     * Get the resource usage details for the specified Autonomous Exadata VM cluster.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAutonomousVmClusterResourceUsageResponse>
            getAutonomousVmClusterResourceUsage(
                    GetAutonomousVmClusterResourceUsageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetAutonomousVmClusterResourceUsageRequest,
                                    GetAutonomousVmClusterResourceUsageResponse>
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
     * Gets information about the specified Autonomous Exadata VM cluster in the Oracle cloud. For Exadata Cloud@Custustomer systems, see {@link #getAutonomousVmCluster(GetAutonomousVmClusterRequest, Consumer, Consumer) getAutonomousVmCluster}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCloudAutonomousVmClusterResponse> getCloudAutonomousVmCluster(
            GetCloudAutonomousVmClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCloudAutonomousVmClusterRequest, GetCloudAutonomousVmClusterResponse>
                    handler);

    /**
     * Get the resource usage details for the specified Cloud Autonomous Exadata VM cluster.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCloudAutonomousVmClusterResourceUsageResponse>
            getCloudAutonomousVmClusterResourceUsage(
                    GetCloudAutonomousVmClusterResourceUsageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetCloudAutonomousVmClusterResourceUsageRequest,
                                    GetCloudAutonomousVmClusterResourceUsageResponse>
                            handler);

    /**
     * Gets information about the specified cloud Exadata infrastructure resource. Applies to Exadata Cloud Service instances and Autonomous Database on dedicated Exadata infrastructure only.
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
     * Gets unallocated resources information for the specified Cloud Exadata infrastructure.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCloudExadataInfrastructureUnallocatedResourcesResponse>
            getCloudExadataInfrastructureUnallocatedResources(
                    GetCloudExadataInfrastructureUnallocatedResourcesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetCloudExadataInfrastructureUnallocatedResourcesRequest,
                                    GetCloudExadataInfrastructureUnallocatedResourcesResponse>
                            handler);

    /**
     * Gets information about the specified cloud VM cluster. Applies to Exadata Cloud Service instances and Autonomous Database on dedicated Exadata infrastructure only.
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
     * Gets information about the specified database node console history.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetConsoleHistoryResponse> getConsoleHistory(
            GetConsoleHistoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetConsoleHistoryRequest, GetConsoleHistoryResponse>
                    handler);

    /**
     * Retrieves the specified database node console history contents upto a megabyte.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetConsoleHistoryContentResponse> getConsoleHistoryContent(
            GetConsoleHistoryContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetConsoleHistoryContentRequest, GetConsoleHistoryContentResponse>
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
     * Gets information about the Exadata Db server.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDbServerResponse> getDbServer(
            GetDbServerRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDbServerRequest, GetDbServerResponse> handler);

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
     * Gets the details of the specified operating system upgrade operation for the specified DB system.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDbSystemUpgradeHistoryEntryResponse>
            getDbSystemUpgradeHistoryEntry(
                    GetDbSystemUpgradeHistoryEntryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDbSystemUpgradeHistoryEntryRequest,
                                    GetDbSystemUpgradeHistoryEntryResponse>
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
     * Gets un allocated resources information for the specified Exadata infrastructure. Applies to Exadata Cloud@Customer instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetExadataInfrastructureUnAllocatedResourcesResponse>
            getExadataInfrastructureUnAllocatedResources(
                    GetExadataInfrastructureUnAllocatedResourcesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetExadataInfrastructureUnAllocatedResourcesRequest,
                                    GetExadataInfrastructureUnAllocatedResourcesResponse>
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
     * Gets information about the specified Exadata VM cluster on Exascale Infrastructure. Applies to Exadata Database Service on Exascale Infrastructure only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetExadbVmClusterResponse> getExadbVmCluster(
            GetExadbVmClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExadbVmClusterRequest, GetExadbVmClusterResponse>
                    handler);

    /**
     * Gets information about a specified maintenance update package for a Exadata VM cluster on Exascale Infrastructure.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetExadbVmClusterUpdateResponse> getExadbVmClusterUpdate(
            GetExadbVmClusterUpdateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExadbVmClusterUpdateRequest, GetExadbVmClusterUpdateResponse>
                    handler);

    /**
     * Gets the maintenance update history details for the specified update history entry.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetExadbVmClusterUpdateHistoryEntryResponse>
            getExadbVmClusterUpdateHistoryEntry(
                    GetExadbVmClusterUpdateHistoryEntryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetExadbVmClusterUpdateHistoryEntryRequest,
                                    GetExadbVmClusterUpdateHistoryEntryResponse>
                            handler);

    /**
     * Gets information about the specified Exadata Database Storage Vaults in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetExascaleDbStorageVaultResponse> getExascaleDbStorageVault(
            GetExascaleDbStorageVaultRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExascaleDbStorageVaultRequest, GetExascaleDbStorageVaultResponse>
                    handler);

    /**
     * Gets information about the specified execution action.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetExecutionActionResponse> getExecutionAction(
            GetExecutionActionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExecutionActionRequest, GetExecutionActionResponse>
                    handler);

    /**
     * Gets information about the specified execution window.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetExecutionWindowResponse> getExecutionWindow(
            GetExecutionWindowRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExecutionWindowRequest, GetExecutionWindowResponse>
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
     * Gets details of the Exadata Infrastructure target system software versions that can be applied to the specified infrastructure resource for maintenance updates.
     * Applies to Exadata Cloud@Customer and Exadata Cloud instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetInfrastructureTargetVersionsResponse>
            getInfrastructureTargetVersions(
                    GetInfrastructureTargetVersionsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetInfrastructureTargetVersionsRequest,
                                    GetInfrastructureTargetVersionsResponse>
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
     * Gets information about the specified maintenance run history.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetMaintenanceRunHistoryResponse> getMaintenanceRunHistory(
            GetMaintenanceRunHistoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetMaintenanceRunHistoryRequest, GetMaintenanceRunHistoryResponse>
                    handler);

    /**
     * Gets information about the specified one-off patch.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetOneoffPatchResponse> getOneoffPatch(
            GetOneoffPatchRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetOneoffPatchRequest, GetOneoffPatchResponse>
                    handler);

    /**
     * Gets the details of operations performed to convert the specified database from non-container (non-CDB) to pluggable (PDB).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPdbConversionHistoryEntryResponse> getPdbConversionHistoryEntry(
            GetPdbConversionHistoryEntryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPdbConversionHistoryEntryRequest,
                            GetPdbConversionHistoryEntryResponse>
                    handler);

    /**
     * Gets information about the specified pluggable database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPluggableDatabaseResponse> getPluggableDatabase(
            GetPluggableDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPluggableDatabaseRequest, GetPluggableDatabaseResponse>
                    handler);

    /**
     * Gets information about the specified Scheduled Action.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetScheduledActionResponse> getScheduledAction(
            GetScheduledActionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetScheduledActionRequest, GetScheduledActionResponse>
                    handler);

    /**
     * Gets information about the specified Scheduling Plan.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetSchedulingPlanResponse> getSchedulingPlan(
            GetSchedulingPlanRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSchedulingPlanRequest, GetSchedulingPlanResponse>
                    handler);

    /**
     * Gets information about the specified Scheduling Policy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetSchedulingPolicyResponse> getSchedulingPolicy(
            GetSchedulingPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSchedulingPolicyRequest, GetSchedulingPolicyResponse>
                    handler);

    /**
     * Gets information about the specified Scheduling Window.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetSchedulingWindowResponse> getSchedulingWindow(
            GetSchedulingWindowRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSchedulingWindowRequest, GetSchedulingWindowResponse>
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
     * Gets information about a specified maintenance update package for a VM cluster. Applies to Exadata Cloud@Customer instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVmClusterUpdateResponse> getVmClusterUpdate(
            GetVmClusterUpdateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetVmClusterUpdateRequest, GetVmClusterUpdateResponse>
                    handler);

    /**
     * Gets the maintenance update history details for the specified update history entry. Applies to Exadata Cloud@Customer instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVmClusterUpdateHistoryEntryResponse>
            getVmClusterUpdateHistoryEntry(
                    GetVmClusterUpdateHistoryEntryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetVmClusterUpdateHistoryEntryRequest,
                                    GetVmClusterUpdateHistoryEntryResponse>
                            handler);

    /**
     * **Deprecated** To create a new Autonomous Database system on dedicated Exadata Infrastructure, use the {@link #createCloudExadataInfrastructure(CreateCloudExadataInfrastructureRequest, Consumer, Consumer) createCloudExadataInfrastructure} and {@link #createCloudAutonomousVmCluster(CreateCloudAutonomousVmClusterRequest, Consumer, Consumer) createCloudAutonomousVmCluster} operations instead. Note that to create an Autonomous VM cluster, you must have an existing Exadata Infrastructure resource to contain the VM cluster.
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
     * Gets a list of application virtual IP (VIP) addresses on a cloud VM cluster.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListApplicationVipsResponse> listApplicationVips(
            ListApplicationVipsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListApplicationVipsRequest, ListApplicationVipsResponse>
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
     * Gets a list of supported Autonomous Container Database versions.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAutonomousContainerDatabaseVersionsResponse>
            listAutonomousContainerDatabaseVersions(
                    ListAutonomousContainerDatabaseVersionsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousContainerDatabaseVersionsRequest,
                                    ListAutonomousContainerDatabaseVersionsResponse>
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
     * Gets a list of supported character sets.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAutonomousDatabaseCharacterSetsResponse>
            listAutonomousDatabaseCharacterSets(
                    ListAutonomousDatabaseCharacterSetsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousDatabaseCharacterSetsRequest,
                                    ListAutonomousDatabaseCharacterSetsResponse>
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
     * Lists the Autonomous Database peers for the specified Autonomous Database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAutonomousDatabasePeersResponse> listAutonomousDatabasePeers(
            ListAutonomousDatabasePeersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAutonomousDatabasePeersRequest, ListAutonomousDatabasePeersResponse>
                    handler);

    /**
     * Lists the OCIDs of the Autonomous Database local and connected remote refreshable clones with the region where they exist for the specified source database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAutonomousDatabaseRefreshableClonesResponse>
            listAutonomousDatabaseRefreshableClones(
                    ListAutonomousDatabaseRefreshableClonesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousDatabaseRefreshableClonesRequest,
                                    ListAutonomousDatabaseRefreshableClonesResponse>
                            handler);

    /**
     * Gets a list of the Autonomous Database Software Images in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAutonomousDatabaseSoftwareImagesResponse>
            listAutonomousDatabaseSoftwareImages(
                    ListAutonomousDatabaseSoftwareImagesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousDatabaseSoftwareImagesRequest,
                                    ListAutonomousDatabaseSoftwareImagesResponse>
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
     * Autonomous Database Serverless (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) databases.
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
     * **Deprecated.**
     *
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
     * **Deprecated.** Use the {@link #listCloudExadataInfrastructures(ListCloudExadataInfrastructuresRequest, Consumer, Consumer) listCloudExadataInfrastructures} operation to list Exadata Infrastructures in the Oracle cloud and the  {@link #listCloudAutonomousVmClusters(ListCloudAutonomousVmClustersRequest, Consumer, Consumer) listCloudAutonomousVmClusters} operation to list Autonomous Exadata VM clusters.
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
     * Lists the Autonomous Virtual Machines in the specified Autonomous VM Cluster and Compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAutonomousVirtualMachinesResponse>
            listAutonomousVirtualMachines(
                    ListAutonomousVirtualMachinesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousVirtualMachinesRequest,
                                    ListAutonomousVirtualMachinesResponse>
                            handler);

    /**
     * Gets the list of resource usage details for all the Autonomous Container Database in the specified Autonomous Exadata VM cluster.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAutonomousVmClusterAcdResourceUsageResponse>
            listAutonomousVmClusterAcdResourceUsage(
                    ListAutonomousVmClusterAcdResourceUsageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAutonomousVmClusterAcdResourceUsageRequest,
                                    ListAutonomousVmClusterAcdResourceUsageResponse>
                            handler);

    /**
     * Gets a list of Exadata Cloud@Customer Autonomous VM clusters in the specified compartment. To list Autonomous VM Clusters in the Oracle Cloud, see {@link #listCloudAutonomousVmClusters(ListCloudAutonomousVmClustersRequest, Consumer, Consumer) listCloudAutonomousVmClusters}.
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
     * Gets the list of resource usage details for all the Cloud Autonomous Container Database
     * in the specified Cloud Autonomous Exadata VM cluster.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCloudAutonomousVmClusterAcdResourceUsageResponse>
            listCloudAutonomousVmClusterAcdResourceUsage(
                    ListCloudAutonomousVmClusterAcdResourceUsageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListCloudAutonomousVmClusterAcdResourceUsageRequest,
                                    ListCloudAutonomousVmClusterAcdResourceUsageResponse>
                            handler);

    /**
     * Lists Autonomous Exadata VM clusters in the Oracle cloud. For Exadata Cloud@Customer systems, see {@link #listAutonomousVmClusters(ListAutonomousVmClustersRequest, Consumer, Consumer) listAutonomousVmClusters}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCloudAutonomousVmClustersResponse>
            listCloudAutonomousVmClusters(
                    ListCloudAutonomousVmClustersRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListCloudAutonomousVmClustersRequest,
                                    ListCloudAutonomousVmClustersResponse>
                            handler);

    /**
     * Gets a list of the cloud Exadata infrastructure resources in the specified compartment. Applies to Exadata Cloud Service instances and Autonomous Database on dedicated Exadata infrastructure only.
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
     * Gets a list of the cloud VM clusters in the specified compartment. Applies to Exadata Cloud Service instances and Autonomous Database on dedicated Exadata infrastructure only.
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
     * Lists the console histories for the specified database node.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListConsoleHistoriesResponse> listConsoleHistories(
            ListConsoleHistoriesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListConsoleHistoriesRequest, ListConsoleHistoriesResponse>
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
     * Lists the Exadata DB servers in the ExadataInfrastructureId and specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDbServersResponse> listDbServers(
            ListDbServersRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDbServersRequest, ListDbServersResponse>
                    handler);

    /**
     * Gets a list of expected compute performance parameters for a virtual machine DB system based on system configuration.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDbSystemComputePerformancesResponse>
            listDbSystemComputePerformances(
                    ListDbSystemComputePerformancesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDbSystemComputePerformancesRequest,
                                    ListDbSystemComputePerformancesResponse>
                            handler);

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
     * Gets a list of possible expected storage performance parameters of a VMDB System based on Configuration.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDbSystemStoragePerformancesResponse>
            listDbSystemStoragePerformances(
                    ListDbSystemStoragePerformancesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDbSystemStoragePerformancesRequest,
                                    ListDbSystemStoragePerformancesResponse>
                            handler);

    /**
     * Gets the history of the upgrade actions performed on the specified DB system.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDbSystemUpgradeHistoryEntriesResponse>
            listDbSystemUpgradeHistoryEntries(
                    ListDbSystemUpgradeHistoryEntriesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDbSystemUpgradeHistoryEntriesRequest,
                                    ListDbSystemUpgradeHistoryEntriesResponse>
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
     * Gets the history of the maintenance update actions performed on the specified Exadata VM cluster on Exascale Infrastructure.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListExadbVmClusterUpdateHistoryEntriesResponse>
            listExadbVmClusterUpdateHistoryEntries(
                    ListExadbVmClusterUpdateHistoryEntriesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListExadbVmClusterUpdateHistoryEntriesRequest,
                                    ListExadbVmClusterUpdateHistoryEntriesResponse>
                            handler);

    /**
     * Lists the maintenance updates that can be applied to the specified Exadata VM cluster on Exascale Infrastructure.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListExadbVmClusterUpdatesResponse> listExadbVmClusterUpdates(
            ListExadbVmClusterUpdatesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListExadbVmClusterUpdatesRequest, ListExadbVmClusterUpdatesResponse>
                    handler);

    /**
     * Gets a list of the Exadata VM clusters on Exascale Infrastructure in the specified compartment. Applies to Exadata Database Service on Exascale Infrastructure only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListExadbVmClustersResponse> listExadbVmClusters(
            ListExadbVmClustersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListExadbVmClustersRequest, ListExadbVmClustersResponse>
                    handler);

    /**
     * Gets a list of the Exadata Database Storage Vaults in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListExascaleDbStorageVaultsResponse> listExascaleDbStorageVaults(
            ListExascaleDbStorageVaultsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListExascaleDbStorageVaultsRequest, ListExascaleDbStorageVaultsResponse>
                    handler);

    /**
     * Lists the execution action resources in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListExecutionActionsResponse> listExecutionActions(
            ListExecutionActionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListExecutionActionsRequest, ListExecutionActionsResponse>
                    handler);

    /**
     * Lists the execution window resources in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListExecutionWindowsResponse> listExecutionWindows(
            ListExecutionWindowsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListExecutionWindowsRequest, ListExecutionWindowsResponse>
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
     * Gets a list of supported Oracle Grid Infrastructure minor versions for the given major version and shape family.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListGiVersionMinorVersionsResponse> listGiVersionMinorVersions(
            ListGiVersionMinorVersionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListGiVersionMinorVersionsRequest, ListGiVersionMinorVersionsResponse>
                    handler);

    /**
     * Gets a list of supported GI versions.
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
     * Gets a list of the maintenance run histories in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListMaintenanceRunHistoryResponse> listMaintenanceRunHistory(
            ListMaintenanceRunHistoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMaintenanceRunHistoryRequest, ListMaintenanceRunHistoryResponse>
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
     * Lists one-off patches in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListOneoffPatchesResponse> listOneoffPatches(
            ListOneoffPatchesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListOneoffPatchesRequest, ListOneoffPatchesResponse>
                    handler);

    /**
     * List all the action params and their possible values for a given action type
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListParamsForActionTypeResponse> listParamsForActionType(
            ListParamsForActionTypeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListParamsForActionTypeRequest, ListParamsForActionTypeResponse>
                    handler);

    /**
     * Gets the pluggable database conversion history for a specified database in a bare metal or virtual machine DB system.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListPdbConversionHistoryEntriesResponse>
            listPdbConversionHistoryEntries(
                    ListPdbConversionHistoryEntriesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListPdbConversionHistoryEntriesRequest,
                                    ListPdbConversionHistoryEntriesResponse>
                            handler);

    /**
     * Gets a list of the pluggable databases in a database or compartment. You must provide either a `databaseId` or `compartmentId` value.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListPluggableDatabasesResponse> listPluggableDatabases(
            ListPluggableDatabasesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPluggableDatabasesRequest, ListPluggableDatabasesResponse>
                    handler);

    /**
     * Returns a recommended Scheduled Actions configuration for a given resource, plan intent and scheduling policy.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListRecommendedScheduledActionsResponse>
            listRecommendedScheduledActions(
                    ListRecommendedScheduledActionsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListRecommendedScheduledActionsRequest,
                                    ListRecommendedScheduledActionsResponse>
                            handler);

    /**
     * Lists the Scheduled Action resources in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListScheduledActionsResponse> listScheduledActions(
            ListScheduledActionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListScheduledActionsRequest, ListScheduledActionsResponse>
                    handler);

    /**
     * Lists the Scheduling Plan resources in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSchedulingPlansResponse> listSchedulingPlans(
            ListSchedulingPlansRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSchedulingPlansRequest, ListSchedulingPlansResponse>
                    handler);

    /**
     * Lists the Scheduling Policy resources in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSchedulingPoliciesResponse> listSchedulingPolicies(
            ListSchedulingPoliciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSchedulingPoliciesRequest, ListSchedulingPoliciesResponse>
                    handler);

    /**
     * Lists the Scheduling Window resources in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSchedulingWindowsResponse> listSchedulingWindows(
            ListSchedulingWindowsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSchedulingWindowsRequest, ListSchedulingWindowsResponse>
                    handler);

    /**
     * Gets a list of supported Exadata system versions for a given shape and GI version.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSystemVersionsResponse> listSystemVersions(
            ListSystemVersionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSystemVersionsRequest, ListSystemVersionsResponse>
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
     * Gets the history of the maintenance update actions performed on the specified VM cluster. Applies to Exadata Cloud@Customer instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVmClusterUpdateHistoryEntriesResponse>
            listVmClusterUpdateHistoryEntries(
                    ListVmClusterUpdateHistoryEntriesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListVmClusterUpdateHistoryEntriesRequest,
                                    ListVmClusterUpdateHistoryEntriesResponse>
                            handler);

    /**
     * Lists the maintenance updates that can be applied to the specified VM cluster. Applies to Exadata Cloud@Customer instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVmClusterUpdatesResponse> listVmClusterUpdates(
            ListVmClusterUpdatesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListVmClusterUpdatesRequest, ListVmClusterUpdatesResponse>
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
     * **Deprecated.** Use {@link #createPluggableDatabase(CreatePluggableDatabaseRequest, Consumer, Consumer) createPluggableDatabase} for Pluggable Database LocalClone Operation.
     * Clones and starts a pluggable database (PDB) in the same database (CDB) as the source PDB. The source PDB must be in the `READ_WRITE` openMode to perform the clone operation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<LocalClonePluggableDatabaseResponse> localClonePluggableDatabase(
            LocalClonePluggableDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            LocalClonePluggableDatabaseRequest, LocalClonePluggableDatabaseResponse>
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
     * Updates one or more attributes of the Database Management service for the database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ModifyDatabaseManagementResponse> modifyDatabaseManagement(
            ModifyDatabaseManagementRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ModifyDatabaseManagementRequest, ModifyDatabaseManagementResponse>
                    handler);

    /**
     * Updates one or more attributes of the Database Management service for the pluggable database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ModifyPluggableDatabaseManagementResponse>
            modifyPluggableDatabaseManagement(
                    ModifyPluggableDatabaseManagementRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ModifyPluggableDatabaseManagementRequest,
                                    ModifyPluggableDatabaseManagementResponse>
                            handler);

    /**
     * Moves an execution action member to this execution action resource from another.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<MoveExecutionActionMemberResponse> moveExecutionActionMember(
            MoveExecutionActionMemberRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            MoveExecutionActionMemberRequest, MoveExecutionActionMemberResponse>
                    handler);

    /**
     * Refreshes a pluggable database (PDB) Refreshable clone.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RefreshPluggableDatabaseResponse> refreshPluggableDatabase(
            RefreshPluggableDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RefreshPluggableDatabaseRequest, RefreshPluggableDatabaseResponse>
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
     * **Deprecated.** Use {@link #createPluggableDatabase(CreatePluggableDatabaseRequest, Consumer, Consumer) createPluggableDatabase} for Pluggable Database RemoteClone Operation.
     * Clones a pluggable database (PDB) to a different database from the source PDB. The cloned PDB will be started upon completion of the clone operation. The source PDB must be in the `READ_WRITE` openMode when performing the clone.
     * For Exadata Cloud@Customer instances, the source pluggable database (PDB) must be on the same Exadata Infrastructure as the target container database (CDB) to create a remote clone.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoteClonePluggableDatabaseResponse> remoteClonePluggableDatabase(
            RemoteClonePluggableDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemoteClonePluggableDatabaseRequest,
                            RemoteClonePluggableDatabaseResponse>
                    handler);

    /**
     * Remove Virtual Machines from the Cloud VM cluster. Applies to Exadata Cloud instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveVirtualMachineFromCloudVmClusterResponse>
            removeVirtualMachineFromCloudVmCluster(
                    RemoveVirtualMachineFromCloudVmClusterRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveVirtualMachineFromCloudVmClusterRequest,
                                    RemoveVirtualMachineFromCloudVmClusterResponse>
                            handler);

    /**
     * Remove Virtual Machines from the Exadata VM cluster on Exascale Infrastructure. Applies to Exadata Cloud instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveVirtualMachineFromExadbVmClusterResponse>
            removeVirtualMachineFromExadbVmCluster(
                    RemoveVirtualMachineFromExadbVmClusterRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveVirtualMachineFromExadbVmClusterRequest,
                                    RemoveVirtualMachineFromExadbVmClusterResponse>
                            handler);

    /**
     * Remove Virtual Machines from the VM cluster. Applies to Exadata Cloud@Customer instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveVirtualMachineFromVmClusterResponse>
            removeVirtualMachineFromVmCluster(
                    RemoveVirtualMachineFromVmClusterRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveVirtualMachineFromVmClusterRequest,
                                    RemoveVirtualMachineFromVmClusterResponse>
                            handler);

    /**
     * Reorders the execution actions under this execution window resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ReorderExecutionActionsResponse> reorderExecutionActions(
            ReorderExecutionActionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ReorderExecutionActionsRequest, ReorderExecutionActionsResponse>
                    handler);

    /**
     * Re-order the scheduled actions under this scheduling plan resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ReorderScheduledActionsResponse> reorderScheduledActions(
            ReorderScheduledActionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ReorderScheduledActionsRequest, ReorderScheduledActionsResponse>
                    handler);

    /**
     * Adds or removes Db server network nodes to extend or shrink the existing VM cluster network. Applies to Exadata
     * Cloud@Customer instances only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ResizeVmClusterNetworkResponse> resizeVmClusterNetwork(
            ResizeVmClusterNetworkRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ResizeVmClusterNetworkRequest, ResizeVmClusterNetworkResponse>
                    handler);

    /**
     * Lists available resource pools shapes.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ResourcePoolShapesResponse> resourcePoolShapes(
            ResourcePoolShapesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ResourcePoolShapesRequest, ResourcePoolShapesResponse>
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
     * Rotates the Oracle REST Data Services (ORDS) certificates for Autonomous Exadata VM cluster.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RotateAutonomousVmClusterOrdsCertsResponse>
            rotateAutonomousVmClusterOrdsCerts(
                    RotateAutonomousVmClusterOrdsCertsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RotateAutonomousVmClusterOrdsCertsRequest,
                                    RotateAutonomousVmClusterOrdsCertsResponse>
                            handler);

    /**
     * Rotates the SSL certificates for Autonomous Exadata VM cluster.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RotateAutonomousVmClusterSslCertsResponse>
            rotateAutonomousVmClusterSslCerts(
                    RotateAutonomousVmClusterSslCertsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RotateAutonomousVmClusterSslCertsRequest,
                                    RotateAutonomousVmClusterSslCertsResponse>
                            handler);

    /**
     * Rotates the Oracle REST Data Services (ORDS) certificates for a cloud Autonomous Exadata VM cluster.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RotateCloudAutonomousVmClusterOrdsCertsResponse>
            rotateCloudAutonomousVmClusterOrdsCerts(
                    RotateCloudAutonomousVmClusterOrdsCertsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RotateCloudAutonomousVmClusterOrdsCertsRequest,
                                    RotateCloudAutonomousVmClusterOrdsCertsResponse>
                            handler);

    /**
     * Rotates the SSL certficates for a cloud Autonomous Exadata VM cluster.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RotateCloudAutonomousVmClusterSslCertsResponse>
            rotateCloudAutonomousVmClusterSslCerts(
                    RotateCloudAutonomousVmClusterSslCertsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RotateCloudAutonomousVmClusterSslCertsRequest,
                                    RotateCloudAutonomousVmClusterSslCertsResponse>
                            handler);

    /**
     * **Deprecated.** Use the {@link #rotateCloudAutonomousVmClusterOrdsCerts(RotateCloudAutonomousVmClusterOrdsCertsRequest, Consumer, Consumer) rotateCloudAutonomousVmClusterOrdsCerts} to rotate Oracle REST Data Services (ORDS) certs for an Autonomous Exadata VM cluster instead.
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
     * Create a new version of the existing encryption key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RotatePluggableDatabaseEncryptionKeyResponse>
            rotatePluggableDatabaseEncryptionKey(
                    RotatePluggableDatabaseEncryptionKeyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RotatePluggableDatabaseEncryptionKeyRequest,
                                    RotatePluggableDatabaseEncryptionKeyResponse>
                            handler);

    /**
     * **Deprecated.** Use the {@link #rotateCloudAutonomousVmClusterSslCerts(RotateCloudAutonomousVmClusterSslCertsRequest, Consumer, Consumer) rotateCloudAutonomousVmClusterSslCerts} to rotate SSL certs for an Autonomous Exadata VM cluster instead.
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
     * This operation gets SaaS administrative user status of the Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SaasAdminUserStatusResponse> saasAdminUserStatus(
            SaasAdminUserStatusRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SaasAdminUserStatusRequest, SaasAdminUserStatusResponse>
                    handler);

    /**
     * Scans for pluggable databases in the specified external container database.
     * This operation will return un-registered pluggable databases in the {@link #getWorkRequest(GetWorkRequestRequest, Consumer, Consumer) getWorkRequest} operation.
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
     * Sets a new version of an existing [Vault service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SetDbKeyVersionResponse> setDbKeyVersion(
            SetDbKeyVersionRequest request,
            com.oracle.bmc.responses.AsyncHandler<SetDbKeyVersionRequest, SetDbKeyVersionResponse>
                    handler);

    /**
     * Sets a new version of an existing [Vault service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SetPdbKeyVersionResponse> setPdbKeyVersion(
            SetPdbKeyVersionRequest request,
            com.oracle.bmc.responses.AsyncHandler<SetPdbKeyVersionRequest, SetPdbKeyVersionResponse>
                    handler);

    /**
     * This operation shrinks the current allocated storage down to the current actual used data storage (actualUsedDataStorageSizeInTBs). The if the base storage value for the database (dataStorageSizeInTBs) is larger than the actualUsedDataStorageSizeInTBs value, you are billed for the base storage value.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ShrinkAutonomousDatabaseResponse> shrinkAutonomousDatabase(
            ShrinkAutonomousDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ShrinkAutonomousDatabaseRequest, ShrinkAutonomousDatabaseResponse>
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
     * Starts a stopped pluggable database. The `openMode` value of the pluggable database will be `READ_WRITE` upon completion.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<StartPluggableDatabaseResponse> startPluggableDatabase(
            StartPluggableDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StartPluggableDatabaseRequest, StartPluggableDatabaseResponse>
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
     * Stops a pluggable database. The `openMode` value of the pluggable database will be `MOUNTED` upon completion.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<StopPluggableDatabaseResponse> stopPluggableDatabase(
            StopPluggableDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StopPluggableDatabaseRequest, StopPluggableDatabaseResponse>
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
     * Initiates a switchover of the specified Autonomous Database to the associated peer database. Applicable only to databases with Disaster Recovery enabled.
     * This API should be called in the remote region where the peer database resides.
     * Below parameter is optional:
     *   - `peerDbId`
     *     Use this parameter to specify the database OCID of the Disaster Recovery peer, which is located in a different (remote) region from the current peer database.
     *     If this parameter is not provided, the switchover will happen in the same region.
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
     * **Deprecated.** To terminate an Exadata Infrastructure resource in the Oracle cloud, use the {@link #deleteCloudExadataInfrastructure(DeleteCloudExadataInfrastructureRequest, Consumer, Consumer) deleteCloudExadataInfrastructure} operation. To delete an Autonomous Exadata VM cluster in the Oracle cloud, use the {@link #deleteCloudAutonomousVmCluster(DeleteCloudAutonomousVmClusterRequest, Consumer, Consumer) deleteCloudAutonomousVmCluster} operation.
     *
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
     * Updates the properties of an Autonomous Container Database, such as display name, maintenance preference, backup retention, and tags.
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
     * Update Autonomous Data Guard association.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAutonomousContainerDatabaseDataguardAssociationResponse>
            updateAutonomousContainerDatabaseDataguardAssociation(
                    UpdateAutonomousContainerDatabaseDataguardAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAutonomousContainerDatabaseDataguardAssociationRequest,
                                    UpdateAutonomousContainerDatabaseDataguardAssociationResponse>
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
     * Updates the Autonomous Database backup of the specified database based on the request parameters.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAutonomousDatabaseBackupResponse>
            updateAutonomousDatabaseBackup(
                    UpdateAutonomousDatabaseBackupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAutonomousDatabaseBackupRequest,
                                    UpdateAutonomousDatabaseBackupResponse>
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
     * Updates the properties of an Autonomous Database Software Image, like add tags
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAutonomousDatabaseSoftwareImageResponse>
            updateAutonomousDatabaseSoftwareImage(
                    UpdateAutonomousDatabaseSoftwareImageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAutonomousDatabaseSoftwareImageRequest,
                                    UpdateAutonomousDatabaseSoftwareImageResponse>
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
     * **Deprecated.** Use the {@link #updateCloudExadataInfrastructure(UpdateCloudExadataInfrastructureRequest, Consumer, Consumer) updateCloudExadataInfrastructure} operation to update an Exadata Infrastructure resource and  {@link #updateCloudAutonomousVmCluster(UpdateCloudAutonomousVmClusterRequest, Consumer, Consumer) updateCloudAutonomousVmCluster} operation to update an Autonomous Exadata VM cluster.
     *
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
     * Updates the specified Autonomous VM cluster for the Exadata Cloud@Customer system.To update an Autonomous VM Cluster in the Oracle cloud, see {@link #updateCloudAutonomousVmCluster(UpdateCloudAutonomousVmClusterRequest, Consumer, Consumer) updateCloudAutonomousVmCluster}.
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
     * Updates the specified Autonomous Exadata VM cluster in the Oracle cloud. For Exadata Cloud@Customer systems, see {@link #updateAutonomousVmCluster(UpdateAutonomousVmClusterRequest, Consumer, Consumer) updateAutonomousVmCluster}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCloudAutonomousVmClusterResponse>
            updateCloudAutonomousVmCluster(
                    UpdateCloudAutonomousVmClusterRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateCloudAutonomousVmClusterRequest,
                                    UpdateCloudAutonomousVmClusterResponse>
                            handler);

    /**
     * Updates the Cloud Exadata infrastructure resource. Applies to Exadata Cloud Service instances and Autonomous Database on dedicated Exadata infrastructure only.
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
     * Updates the specified cloud VM cluster. Applies to Exadata Cloud Service instances and Autonomous Database on dedicated Exadata infrastructure only.
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
     * Updates the specified database node console connection.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateConsoleConnectionResponse> updateConsoleConnection(
            UpdateConsoleConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateConsoleConnectionRequest, UpdateConsoleConnectionResponse>
                    handler);

    /**
     * Updates the specified database node console history.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateConsoleHistoryResponse> updateConsoleHistory(
            UpdateConsoleHistoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateConsoleHistoryRequest, UpdateConsoleHistoryResponse>
                    handler);

    /**
     * Updates the Data Guard association the specified database. This API can be used to change the `protectionMode` and `transportType` of the Data Guard association.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDataGuardAssociationResponse> updateDataGuardAssociation(
            UpdateDataGuardAssociationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDataGuardAssociationRequest, UpdateDataGuardAssociationResponse>
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
     * Updates the specified database node.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDbNodeResponse> updateDbNode(
            UpdateDbNodeRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateDbNodeRequest, UpdateDbNodeResponse>
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
     * Updates the specified Exadata VM cluster on Exascale Infrastructure. Applies to Exadata Database Service on Exascale Infrastructure only.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExadbVmClusterResponse> updateExadbVmCluster(
            UpdateExadbVmClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateExadbVmClusterRequest, UpdateExadbVmClusterResponse>
                    handler);

    /**
     * Updates the specified Exadata Database Storage Vault.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExascaleDbStorageVaultResponse> updateExascaleDbStorageVault(
            UpdateExascaleDbStorageVaultRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateExascaleDbStorageVaultRequest,
                            UpdateExascaleDbStorageVaultResponse>
                    handler);

    /**
     * Updates the execution action resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExecutionActionResponse> updateExecutionAction(
            UpdateExecutionActionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateExecutionActionRequest, UpdateExecutionActionResponse>
                    handler);

    /**
     * Updates the execution window resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExecutionWindowResponse> updateExecutionWindow(
            UpdateExecutionWindowRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateExecutionWindowRequest, UpdateExecutionWindowResponse>
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
     * Edit the key store.
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
     * Updates the properties of the specified one-off patch.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOneoffPatchResponse> updateOneoffPatch(
            UpdateOneoffPatchRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateOneoffPatchRequest, UpdateOneoffPatchResponse>
                    handler);

    /**
     * Updates the specified pluggable database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePluggableDatabaseResponse> updatePluggableDatabase(
            UpdatePluggableDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdatePluggableDatabaseRequest, UpdatePluggableDatabaseResponse>
                    handler);

    /**
     * Updates the Scheduled Action resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateScheduledActionResponse> updateScheduledAction(
            UpdateScheduledActionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateScheduledActionRequest, UpdateScheduledActionResponse>
                    handler);

    /**
     * Updates the Scheduling Policy resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSchedulingPolicyResponse> updateSchedulingPolicy(
            UpdateSchedulingPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSchedulingPolicyRequest, UpdateSchedulingPolicyResponse>
                    handler);

    /**
     * Updates the Scheduling Window resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSchedulingWindowResponse> updateSchedulingWindow(
            UpdateSchedulingWindowRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSchedulingWindowRequest, UpdateSchedulingWindowResponse>
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
     * Upgrades the operating system and grid infrastructure of the DB system.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpgradeDbSystemResponse> upgradeDbSystem(
            UpgradeDbSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpgradeDbSystemRequest, UpgradeDbSystemResponse>
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
