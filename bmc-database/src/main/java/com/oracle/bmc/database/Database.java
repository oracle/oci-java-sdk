/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database;

import com.oracle.bmc.database.requests.*;
import com.oracle.bmc.database.responses.*;

/**
 * The API for the Database Service. Use this API to manage resources such as databases and DB
 * Systems. For more information, see [Overview of the Database
 * Service](https://docs.oracle.com/iaas/Content/Database/Concepts/databaseoverview.htm).
 *
 * <p>This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by
 * default if no circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface Database extends AutoCloseable {

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
     * Activates the specified Exadata infrastructure resource. Applies to Exadata Cloud@Customer
     * instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ActivateExadataInfrastructureExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ActivateExadataInfrastructure API.
     */
    ActivateExadataInfrastructureResponse activateExadataInfrastructure(
            ActivateExadataInfrastructureRequest request);

    /**
     * Add a database node snapshots to the Exadb VM cluster..
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/AddDbnodeSnapshotsForExadbVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AddDbnodeSnapshotsForExadbVmCluster API.
     */
    AddDbnodeSnapshotsForExadbVmClusterResponse addDbnodeSnapshotsForExadbVmCluster(
            AddDbnodeSnapshotsForExadbVmClusterRequest request);

    /**
     * Add a standby Autonomous Container Database. For more information about Autonomous Data
     * Guard,see [Protect Critical Databases from Failures and Disasters Using Autonomous Data
     * Guard](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbau/GUID-C57B9A6E-7471-4CDC-8F10-B8386538E31C).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/AddStandbyAutonomousContainerDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AddStandbyAutonomousContainerDatabase API.
     */
    AddStandbyAutonomousContainerDatabaseResponse addStandbyAutonomousContainerDatabase(
            AddStandbyAutonomousContainerDatabaseRequest request);

    /**
     * Makes the storage capacity from additional storage servers available for Cloud VM Cluster
     * consumption. Applies to Exadata Cloud Service instances and Autonomous AI Database on
     * dedicated Exadata infrastructure only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/AddStorageCapacityCloudExadataInfrastructureExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AddStorageCapacityCloudExadataInfrastructure API.
     */
    AddStorageCapacityCloudExadataInfrastructureResponse
            addStorageCapacityCloudExadataInfrastructure(
                    AddStorageCapacityCloudExadataInfrastructureRequest request);

    /**
     * Makes the storage capacity from additional storage servers available for VM Cluster
     * consumption. Applies to Exadata Cloud@Customer instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/AddStorageCapacityExadataInfrastructureExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AddStorageCapacityExadataInfrastructure API.
     */
    AddStorageCapacityExadataInfrastructureResponse addStorageCapacityExadataInfrastructure(
            AddStorageCapacityExadataInfrastructureRequest request);

    /**
     * Add Virtual Machines to the Cloud VM cluster. Applies to Exadata Cloud instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/AddVirtualMachineToCloudVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AddVirtualMachineToCloudVmCluster API.
     */
    AddVirtualMachineToCloudVmClusterResponse addVirtualMachineToCloudVmCluster(
            AddVirtualMachineToCloudVmClusterRequest request);

    /**
     * Add Virtual Machines to the VM cluster. Applies to Exadata Cloud@Customer instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/AddVirtualMachineToVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AddVirtualMachineToVmCluster API.
     */
    AddVirtualMachineToVmClusterResponse addVirtualMachineToVmCluster(
            AddVirtualMachineToVmClusterRequest request);

    /**
     * Initiates a data refresh for an Autonomous AI Database refreshable clone. Data is refreshed
     * from the source database to the point of a specified timestamp.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/AutonomousDatabaseManualRefreshExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AutonomousDatabaseManualRefresh API.
     */
    AutonomousDatabaseManualRefreshResponse autonomousDatabaseManualRefresh(
            AutonomousDatabaseManualRefreshRequest request);

    /**
     * Cancel automatic/standalone full/incremental create backup workrequests specified by the
     * backup Id.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CancelBackupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CancelBackup API.
     */
    CancelBackupResponse cancelBackup(CancelBackupRequest request);

    /**
     * Cancels the in progress maintenance activity under this execution window.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CancelExecutionWindowExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CancelExecutionWindow API.
     */
    CancelExecutionWindowResponse cancelExecutionWindow(CancelExecutionWindowRequest request);

    /**
     * Delete the scheduling plan resource along with all the scheduled actions associated with this
     * resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CascadingDeleteSchedulingPlanExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CascadingDeleteSchedulingPlan API.
     */
    CascadingDeleteSchedulingPlanResponse cascadingDeleteSchedulingPlan(
            CascadingDeleteSchedulingPlanRequest request);

    /**
     * Move the Autonomous Container Database and its dependent resources to the specified
     * compartment. For more information about moving Autonomous Container Databases, see [Moving
     * Database Resources to a Different
     * Compartment](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/raqyy/#articletitle.html).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeAutonomousContainerDatabaseCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeAutonomousContainerDatabaseCompartment API.
     */
    ChangeAutonomousContainerDatabaseCompartmentResponse
            changeAutonomousContainerDatabaseCompartment(
                    ChangeAutonomousContainerDatabaseCompartmentRequest request);

    /**
     * Move the Autonomous AI Database and its dependent resources to the specified compartment. For
     * more information about moving Autonomous AI Databases, see [Moving Database Resources to a
     * Different
     * Compartment](https://docs.oracle.com/iaas/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeAutonomousDatabaseCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeAutonomousDatabaseCompartment API.
     */
    ChangeAutonomousDatabaseCompartmentResponse changeAutonomousDatabaseCompartment(
            ChangeAutonomousDatabaseCompartmentRequest request);

    /**
     * Move the Autonomous AI Database Software Image and its dependent resources to the specified
     * compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeAutonomousDatabaseSoftwareImageCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeAutonomousDatabaseSoftwareImageCompartment API.
     */
    ChangeAutonomousDatabaseSoftwareImageCompartmentResponse
            changeAutonomousDatabaseSoftwareImageCompartment(
                    ChangeAutonomousDatabaseSoftwareImageCompartmentRequest request);

    /**
     * Associate an Autonomous AI Database with a different subscription.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeAutonomousDatabaseSubscriptionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeAutonomousDatabaseSubscription API.
     */
    ChangeAutonomousDatabaseSubscriptionResponse changeAutonomousDatabaseSubscription(
            ChangeAutonomousDatabaseSubscriptionRequest request);

    /**
     * **Deprecated.** Use the {@link
     * #changeCloudExadataInfrastructureCompartment(ChangeCloudExadataInfrastructureCompartmentRequest)
     * changeCloudExadataInfrastructureCompartment} operation to move an Exadata infrastructure
     * resource to a different compartment and {@link
     * #changeCloudAutonomousVmClusterCompartment(ChangeCloudAutonomousVmClusterCompartmentRequest)
     * changeCloudAutonomousVmClusterCompartment} operation to move an Autonomous Exadata VM cluster
     * to a different compartment. For more information, see [Moving Database Resources to a
     * Different
     * Compartment](https://docs.oracle.com/iaas/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeAutonomousExadataInfrastructureCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeAutonomousExadataInfrastructureCompartment API.
     */
    ChangeAutonomousExadataInfrastructureCompartmentResponse
            changeAutonomousExadataInfrastructureCompartment(
                    ChangeAutonomousExadataInfrastructureCompartmentRequest request);

    /**
     * Moves an Autonomous VM cluster and its dependent resources to another compartment. Applies to
     * Exadata Cloud@Customer only. For systems in the Oracle cloud, see {@link
     * #changeAutonomousVmClusterCompartment(ChangeAutonomousVmClusterCompartmentRequest)
     * changeAutonomousVmClusterCompartment}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeAutonomousVmClusterCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeAutonomousVmClusterCompartment API.
     */
    ChangeAutonomousVmClusterCompartmentResponse changeAutonomousVmClusterCompartment(
            ChangeAutonomousVmClusterCompartmentRequest request);

    /**
     * Move the backup destination and its dependent resources to the specified compartment. For
     * more information, see [Moving Database Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeBackupDestinationCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeBackupDestinationCompartment API.
     */
    ChangeBackupDestinationCompartmentResponse changeBackupDestinationCompartment(
            ChangeBackupDestinationCompartmentRequest request);

    /**
     * Moves an Autonomous Exadata VM cluster in the Oracle cloud and its dependent resources to
     * another compartment. For Exadata Cloud@Customer systems, see {@link
     * #changeAutonomousVmClusterCompartment(ChangeAutonomousVmClusterCompartmentRequest)
     * changeAutonomousVmClusterCompartment}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeCloudAutonomousVmClusterCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeCloudAutonomousVmClusterCompartment API.
     */
    ChangeCloudAutonomousVmClusterCompartmentResponse changeCloudAutonomousVmClusterCompartment(
            ChangeCloudAutonomousVmClusterCompartmentRequest request);

    /**
     * Associate a Cloud Autonomous VM cluster with a different subscription.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeCloudAutonomousVmClusterSubscriptionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeCloudAutonomousVmClusterSubscription API.
     */
    ChangeCloudAutonomousVmClusterSubscriptionResponse changeCloudAutonomousVmClusterSubscription(
            ChangeCloudAutonomousVmClusterSubscriptionRequest request);

    /**
     * Associate a cloud DB system with a different subscription.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeCloudDbSystemSubscriptionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeCloudDbSystemSubscription API.
     */
    ChangeCloudDbSystemSubscriptionResponse changeCloudDbSystemSubscription(
            ChangeCloudDbSystemSubscriptionRequest request);

    /**
     * Moves a cloud Exadata infrastructure resource and its dependent resources to another
     * compartment. Applies to Exadata Cloud Service instances and Autonomous AI Database on
     * dedicated Exadata infrastructure only.For more information about moving resources to a
     * different compartment, see [Moving Database Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeCloudExadataInfrastructureCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeCloudExadataInfrastructureCompartment API.
     */
    ChangeCloudExadataInfrastructureCompartmentResponse changeCloudExadataInfrastructureCompartment(
            ChangeCloudExadataInfrastructureCompartmentRequest request);

    /**
     * Associate a cloud Exadata infrastructure with a different subscription.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeCloudExadataInfrastructureSubscriptionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeCloudExadataInfrastructureSubscription API.
     */
    ChangeCloudExadataInfrastructureSubscriptionResponse
            changeCloudExadataInfrastructureSubscription(
                    ChangeCloudExadataInfrastructureSubscriptionRequest request);

    /**
     * Moves a cloud VM cluster and its dependent resources to another compartment. Applies to
     * Exadata Cloud Service instances and Autonomous Database on dedicated Exadata infrastructure
     * only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeCloudVmClusterCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeCloudVmClusterCompartment API.
     */
    ChangeCloudVmClusterCompartmentResponse changeCloudVmClusterCompartment(
            ChangeCloudVmClusterCompartmentRequest request);

    /**
     * Associate a cloud VM cluster with a different subscription.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeCloudVmClusterSubscriptionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeCloudVmClusterSubscription API.
     */
    ChangeCloudVmClusterSubscriptionResponse changeCloudVmClusterSubscription(
            ChangeCloudVmClusterSubscriptionRequest request);

    /**
     * Move the Database Software Image and its dependent resources to the specified compartment.
     * For more information about moving Databse Software Images, see [Moving Database Resources to
     * a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeDatabaseSoftwareImageCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeDatabaseSoftwareImageCompartment API.
     */
    ChangeDatabaseSoftwareImageCompartmentResponse changeDatabaseSoftwareImageCompartment(
            ChangeDatabaseSoftwareImageCompartmentRequest request);

    /**
     * **Deprecated.** Use the {@link
     * #convertStandbyAutonomousContainerDatabase(ConvertStandbyAutonomousContainerDatabaseRequest)
     * convertStandbyAutonomousContainerDatabase} operation to switch the Autonomous Container
     * Database (ACD) role between Standby and Snapshot Standby. For more information about changing
     * ACD Role, see [Convert Physical Standby to Snapshot
     * Standby](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbcl/index.html#ADBCL-GUID-D3B503F1-0032-4B0D-9F00-ACAE8151AB80)
     * and [Convert Snapshot Standby to Physical
     * Standby](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbcl/index.html#ADBCL-GUID-E8D7E0EE-8244-467D-B33A-1BC6F969A0A4).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeDataguardRoleExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeDataguardRole
     *     API.
     */
    ChangeDataguardRoleResponse changeDataguardRole(ChangeDataguardRoleRequest request);

    /**
     * Moves the DB system and its dependent resources to the specified compartment. For more
     * information about moving DB systems, see [Moving Database Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeDbSystemCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeDbSystemCompartment API.
     */
    ChangeDbSystemCompartmentResponse changeDbSystemCompartment(
            ChangeDbSystemCompartmentRequest request);

    /**
     * This operation updates the cross-region disaster recovery (DR) details of the standby
     * Autonomous AI Database Serverless database, and must be run on the standby side.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeDisasterRecoveryConfigurationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeDisasterRecoveryConfiguration API.
     */
    ChangeDisasterRecoveryConfigurationResponse changeDisasterRecoveryConfiguration(
            ChangeDisasterRecoveryConfigurationRequest request);

    /**
     * Update the encryption key management location for the database
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeEncryptionKeyLocationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeEncryptionKeyLocation API.
     */
    ChangeEncryptionKeyLocationResponse changeEncryptionKeyLocation(
            ChangeEncryptionKeyLocationRequest request);

    /**
     * Moves an Exadata infrastructure resource and its dependent resources to another compartment.
     * Applies to Exadata Cloud@Customer instances only. To move an Exadata Cloud Service
     * infrastructure resource to another compartment, use the {@link
     * #changeCloudExadataInfrastructureCompartment(ChangeCloudExadataInfrastructureCompartmentRequest)
     * changeCloudExadataInfrastructureCompartment} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeExadataInfrastructureCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeExadataInfrastructureCompartment API.
     */
    ChangeExadataInfrastructureCompartmentResponse changeExadataInfrastructureCompartment(
            ChangeExadataInfrastructureCompartmentRequest request);

    /**
     * Moves a Exadata VM cluster on Exascale Infrastructure and its dependent resources to another
     * compartment. Applies to Exadata Database Service on Exascale Infrastructure only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeExadbVmClusterCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeExadbVmClusterCompartment API.
     */
    ChangeExadbVmClusterCompartmentResponse changeExadbVmClusterCompartment(
            ChangeExadbVmClusterCompartmentRequest request);

    /**
     * Associate a Exadata VM cluster on Exascale Infrastructure with a different subscription.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeExadbVmClusterSubscriptionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeExadbVmClusterSubscription API.
     */
    ChangeExadbVmClusterSubscriptionResponse changeExadbVmClusterSubscription(
            ChangeExadbVmClusterSubscriptionRequest request);

    /**
     * Moves a Exadata Database Storage Vault to another compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeExascaleDbStorageVaultCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeExascaleDbStorageVaultCompartment API.
     */
    ChangeExascaleDbStorageVaultCompartmentResponse changeExascaleDbStorageVaultCompartment(
            ChangeExascaleDbStorageVaultCompartmentRequest request);

    /**
     * Associate a Exadata Database Storage Vault with a different subscription.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeExascaleDbStorageVaultSubscriptionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeExascaleDbStorageVaultSubscription API.
     */
    ChangeExascaleDbStorageVaultSubscriptionResponse changeExascaleDbStorageVaultSubscription(
            ChangeExascaleDbStorageVaultSubscriptionRequest request);

    /**
     * Move the {@link
     * #createExternalContainerDatabaseDetails(CreateExternalContainerDatabaseDetailsRequest)
     * createExternalContainerDatabaseDetails} and its dependent resources to the specified
     * compartment. For more information about moving external container databases, see [Moving
     * Database Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeExternalContainerDatabaseCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeExternalContainerDatabaseCompartment API.
     */
    ChangeExternalContainerDatabaseCompartmentResponse changeExternalContainerDatabaseCompartment(
            ChangeExternalContainerDatabaseCompartmentRequest request);

    /**
     * Move the external non-container database and its dependent resources to the specified
     * compartment. For more information about moving external non-container databases, see [Moving
     * Database Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeExternalNonContainerDatabaseCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeExternalNonContainerDatabaseCompartment API.
     */
    ChangeExternalNonContainerDatabaseCompartmentResponse
            changeExternalNonContainerDatabaseCompartment(
                    ChangeExternalNonContainerDatabaseCompartmentRequest request);

    /**
     * Move the {@link
     * #createExternalPluggableDatabaseDetails(CreateExternalPluggableDatabaseDetailsRequest)
     * createExternalPluggableDatabaseDetails} and its dependent resources to the specified
     * compartment. For more information about moving external pluggable databases, see [Moving
     * Database Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeExternalPluggableDatabaseCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeExternalPluggableDatabaseCompartment API.
     */
    ChangeExternalPluggableDatabaseCompartmentResponse changeExternalPluggableDatabaseCompartment(
            ChangeExternalPluggableDatabaseCompartmentRequest request);

    /**
     * Move the key store resource to the specified compartment. For more information about moving
     * key stores, see [Moving Database Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Database/Concepts/databaseoverview.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeKeyStoreCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeKeyStoreCompartment API.
     */
    ChangeKeyStoreCompartmentResponse changeKeyStoreCompartment(
            ChangeKeyStoreCompartmentRequest request);

    /**
     * Changes encryption key management type
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeKeyStoreTypeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeKeyStoreType
     *     API.
     */
    ChangeKeyStoreTypeResponse changeKeyStoreType(ChangeKeyStoreTypeRequest request);

    /**
     * Move the one-off patch to the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeOneoffPatchCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeOneoffPatchCompartment API.
     */
    ChangeOneoffPatchCompartmentResponse changeOneoffPatchCompartment(
            ChangeOneoffPatchCompartmentRequest request);

    /**
     * Moves an scheduling plan resource to another compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeSchedulingPlanCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeSchedulingPlanCompartment API.
     */
    ChangeSchedulingPlanCompartmentResponse changeSchedulingPlanCompartment(
            ChangeSchedulingPlanCompartmentRequest request);

    /**
     * Moves an scheduling policy resource to another compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeSchedulingPolicyCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeSchedulingPolicyCompartment API.
     */
    ChangeSchedulingPolicyCompartmentResponse changeSchedulingPolicyCompartment(
            ChangeSchedulingPolicyCompartmentRequest request);

    /**
     * Moves a VM cluster and its dependent resources to another compartment. Applies to Exadata
     * Cloud@Customer instances only. To move a cloud VM cluster in an Exadata Cloud Service
     * instance to another compartment, use the {@link
     * #changeCloudVmClusterCompartment(ChangeCloudVmClusterCompartmentRequest)
     * changeCloudVmClusterCompartment} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeVmClusterCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeVmClusterCompartment API.
     */
    ChangeVmClusterCompartmentResponse changeVmClusterCompartment(
            ChangeVmClusterCompartmentRequest request);

    /**
     * Check the status of the external database connection specified in this connector. This
     * operation will refresh the connectionStatus and timeConnectionStatusLastUpdated fields.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CheckExternalDatabaseConnectorConnectionStatusExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CheckExternalDatabaseConnectorConnectionStatus API.
     */
    CheckExternalDatabaseConnectorConnectionStatusResponse
            checkExternalDatabaseConnectorConnectionStatus(
                    CheckExternalDatabaseConnectorConnectionStatusRequest request);

    /**
     * Changes the status of the standalone backup resource to `ACTIVE` after the backup is created
     * from the on-premises database and placed in Oracle Cloud Infrastructure Object Storage.
     *
     * <p>*Note:** This API is used by an Oracle Cloud Infrastructure Python script that is packaged
     * with the Oracle Cloud Infrastructure CLI. Oracle recommends that you use the script instead
     * using the API directly. See [Migrating an On-Premises Database to Oracle Cloud Infrastructure
     * by Creating a Backup in the
     * Cloud](https://docs.oracle.com/iaas/Content/Database/Tasks/mig-onprembackup.htm) for more
     * information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CompleteExternalBackupJobExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CompleteExternalBackupJob API.
     */
    CompleteExternalBackupJobResponse completeExternalBackupJob(
            CompleteExternalBackupJobRequest request);

    /**
     * Configures the Autonomous AI Database Vault service
     * [key](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ConfigureAutonomousDatabaseVaultKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ConfigureAutonomousDatabaseVaultKey API.
     */
    ConfigureAutonomousDatabaseVaultKeyResponse configureAutonomousDatabaseVaultKey(
            ConfigureAutonomousDatabaseVaultKeyRequest request);

    /**
     * Configures Exascale on Cloud exadata infrastructure resource. Applies to Exadata Cloud
     * Service instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ConfigureExascaleCloudExadataInfrastructureExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ConfigureExascaleCloudExadataInfrastructure API.
     */
    ConfigureExascaleCloudExadataInfrastructureResponse configureExascaleCloudExadataInfrastructure(
            ConfigureExascaleCloudExadataInfrastructureRequest request);

    /**
     * Configures Exascale on Exadata infrastructure resource. Applies to Exadata Cloud@Customer
     * instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ConfigureExascaleExadataInfrastructureExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ConfigureExascaleExadataInfrastructure API.
     */
    ConfigureExascaleExadataInfrastructureResponse configureExascaleExadataInfrastructure(
            ConfigureExascaleExadataInfrastructureRequest request);

    /**
     * This operation updates SaaS administrative user configuration of the Autonomous AI Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ConfigureSaasAdminUserExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ConfigureSaasAdminUser API.
     */
    ConfigureSaasAdminUserResponse configureSaasAdminUser(ConfigureSaasAdminUserRequest request);

    /**
     * This is for user to confirm to DBaaS that the Oracle Key Valut (OKV) connection IPs, username
     * and password are all correct. This operation will put the Key Store back into Active state.
     * If details are incorrect, your OKV account may get locked after some unsuccessful attempts to
     * connect.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ConfirmKeyStoreDetailsAreCorrectExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ConfirmKeyStoreDetailsAreCorrect API.
     */
    ConfirmKeyStoreDetailsAreCorrectResponse confirmKeyStoreDetailsAreCorrect(
            ConfirmKeyStoreDetailsAreCorrectRequest request);

    /**
     * Convert the standby Autonomous Container Database (ACD) between physical standby and snapshot
     * standby ACD. For more information about converting standby ACDs, see [Convert Physical
     * Standby to Snapshot
     * Standby](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbcl/index.html#ADBCL-GUID-D3B503F1-0032-4B0D-9F00-ACAE8151AB80)
     * and [Convert Snapshot Standby to Physical
     * Standby](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbcl/index.html#ADBCL-GUID-E8D7E0EE-8244-467D-B33A-1BC6F969A0A4).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ConvertStandbyAutonomousContainerDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ConvertStandbyAutonomousContainerDatabase API.
     */
    ConvertStandbyAutonomousContainerDatabaseResponse convertStandbyAutonomousContainerDatabase(
            ConvertStandbyAutonomousContainerDatabaseRequest request);

    /**
     * Performs transition from standby database into a snapshot standby and vice versa. The
     * transition performed based on the current role of the database, if the current role is
     * standby then this operation will convert it to snapshot standby and if the current role is
     * snapshot standby then this operation will convert it to standby.
     *
     * <p>This operation should be performed on respective standby/snapshot standby database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ConvertStandbyDatabaseTypeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ConvertStandbyDatabaseType API.
     */
    ConvertStandbyDatabaseTypeResponse convertStandbyDatabaseType(
            ConvertStandbyDatabaseTypeRequest request);

    /**
     * Converts a non-container database to a pluggable database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ConvertToPdbExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ConvertToPdb API.
     */
    ConvertToPdbResponse convertToPdb(ConvertToPdbRequest request);

    /**
     * Converts a Refreshable clone to Regular pluggable database (PDB). Pluggable Database will be
     * in `READ_WRITE` openmode after conversion.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ConvertToRegularPluggableDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ConvertToRegularPluggableDatabase API.
     */
    ConvertToRegularPluggableDatabaseResponse convertToRegularPluggableDatabase(
            ConvertToRegularPluggableDatabaseRequest request);

    /**
     * Disassociate the standby database identified by the `databaseId` parameter from existing Data
     * Guard group.
     *
     * <p>Convert the standby to a standalone database.
     *
     * <p>This operation should be performed on respective standby database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ConvertToStandaloneExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ConvertToStandalone
     *     API.
     */
    ConvertToStandaloneResponse convertToStandalone(ConvertToStandaloneRequest request);

    /**
     * Creates a new application virtual IP (VIP) address in the specified cloud VM cluster based on
     * the request parameters you provide.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateApplicationVipExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateApplicationVip API.
     */
    CreateApplicationVipResponse createApplicationVip(CreateApplicationVipRequest request);

    /**
     * Creates an Autonomous Container Database in the specified Autonomous Exadata Infrastructure.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateAutonomousContainerDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateAutonomousContainerDatabase API.
     */
    CreateAutonomousContainerDatabaseResponse createAutonomousContainerDatabase(
            CreateAutonomousContainerDatabaseRequest request);

    /**
     * **Deprecated.** Use the {@link
     * #addStandbyAutonomousContainerDatabase(AddStandbyAutonomousContainerDatabaseRequest)
     * addStandbyAutonomousContainerDatabase} operation to create a new Autonomous Data Guard
     * association. An Autonomous Data Guard association represents the replication relationship
     * between the specified Autonomous Container database and a peer Autonomous Container database.
     * For more information, see [Using Oracle Data
     * Guard](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbau/#articletitle.html).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateAutonomousContainerDatabaseDataguardAssociationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateAutonomousContainerDatabaseDataguardAssociation API.
     */
    CreateAutonomousContainerDatabaseDataguardAssociationResponse
            createAutonomousContainerDatabaseDataguardAssociation(
                    CreateAutonomousContainerDatabaseDataguardAssociationRequest request);

    /**
     * Creates a new Autonomous AI Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateAutonomousDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateAutonomousDatabase API.
     */
    CreateAutonomousDatabaseResponse createAutonomousDatabase(
            CreateAutonomousDatabaseRequest request);

    /**
     * Creates a new Autonomous AI Database backup for the specified database based on the provided
     * request parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateAutonomousDatabaseBackupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateAutonomousDatabaseBackup API.
     */
    CreateAutonomousDatabaseBackupResponse createAutonomousDatabaseBackup(
            CreateAutonomousDatabaseBackupRequest request);

    /**
     * create Autonomous AI Database Software Image in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateAutonomousDatabaseSoftwareImageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateAutonomousDatabaseSoftwareImage API.
     */
    CreateAutonomousDatabaseSoftwareImageResponse createAutonomousDatabaseSoftwareImage(
            CreateAutonomousDatabaseSoftwareImageRequest request);

    /**
     * Creates an Autonomous VM cluster for Exadata Cloud@Customer. To create an Autonomous VM
     * Cluster in the Oracle cloud, see {@link
     * #createCloudAutonomousVmCluster(CreateCloudAutonomousVmClusterRequest)
     * createCloudAutonomousVmCluster}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateAutonomousVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateAutonomousVmCluster API.
     */
    CreateAutonomousVmClusterResponse createAutonomousVmCluster(
            CreateAutonomousVmClusterRequest request);

    /**
     * Creates a new backup in the specified database based on the request parameters you provide.
     * If you previously used RMAN or dbcli to configure backups and then you switch to using the
     * Console or the API for backups, a new backup configuration is created and associated with
     * your database. This means that you can no longer rely on your previously configured unmanaged
     * backups to work.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateBackupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateBackup API.
     */
    CreateBackupResponse createBackup(CreateBackupRequest request);

    /**
     * Creates a backup destination in an Exadata Cloud@Customer system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateBackupDestinationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateBackupDestination API.
     */
    CreateBackupDestinationResponse createBackupDestination(CreateBackupDestinationRequest request);

    /**
     * Creates an Autonomous Exadata VM cluster in the Oracle cloud. For Exadata Cloud@Customer
     * systems, see {@link #createAutonomousVmCluster(CreateAutonomousVmClusterRequest)
     * createAutonomousVmCluster}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateCloudAutonomousVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateCloudAutonomousVmCluster API.
     */
    CreateCloudAutonomousVmClusterResponse createCloudAutonomousVmCluster(
            CreateCloudAutonomousVmClusterRequest request);

    /**
     * Creates a cloud Exadata infrastructure resource. This resource is used to create either an
     * [Exadata Cloud
     * Service](https://docs.oracle.com/iaas/Content/Database/Concepts/exaoverview.htm) instance or
     * an Autonomous AI Database on dedicated Exadata infrastructure.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateCloudExadataInfrastructureExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateCloudExadataInfrastructure API.
     */
    CreateCloudExadataInfrastructureResponse createCloudExadataInfrastructure(
            CreateCloudExadataInfrastructureRequest request);

    /**
     * Creates a cloud VM cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateCloudVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateCloudVmCluster API.
     */
    CreateCloudVmClusterResponse createCloudVmCluster(CreateCloudVmClusterRequest request);

    /**
     * Creates a new console connection to the specified database node. After the console connection
     * has been created and is available, you connect to the console using SSH.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateConsoleConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateConsoleConnection API.
     */
    CreateConsoleConnectionResponse createConsoleConnection(CreateConsoleConnectionRequest request);

    /**
     * Captures the most recent serial console data (up to a megabyte) for the specified database
     * node.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateConsoleHistoryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateConsoleHistory API.
     */
    CreateConsoleHistoryResponse createConsoleHistory(CreateConsoleHistoryRequest request);

    /**
     * Creates a new Data Guard association. A Data Guard association represents the replication
     * relationship between the specified database and a peer database. For more information, see
     * [Using Oracle Data
     * Guard](https://docs.oracle.com/iaas/Content/Database/Tasks/usingdataguard.htm).
     *
     * <p>All Oracle Cloud Infrastructure resources, including Data Guard associations, get an
     * Oracle-assigned, unique ID called an Oracle Cloud Identifier (OCID). When you create a
     * resource, you can find its OCID in the response. You can also retrieve a resource's OCID by
     * using a List API operation on that resource type, or by viewing the resource in the Console.
     * For more information, see [Resource
     * Identifiers](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateDataGuardAssociationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateDataGuardAssociation API.
     */
    CreateDataGuardAssociationResponse createDataGuardAssociation(
            CreateDataGuardAssociationRequest request);

    /**
     * Creates a new database in the specified Database Home. If the database version is provided,
     * it must match the version of the Database Home. Applies to Exadata and Exadata Cloud@Customer
     * systems.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDatabase API.
     */
    CreateDatabaseResponse createDatabase(CreateDatabaseRequest request);

    /**
     * create database software image in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateDatabaseSoftwareImageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateDatabaseSoftwareImage API.
     */
    CreateDatabaseSoftwareImageResponse createDatabaseSoftwareImage(
            CreateDatabaseSoftwareImageRequest request);

    /**
     * Creates a new Database Home in the specified database system based on the request parameters
     * you provide. Applies to bare metal DB systems, Exadata systems, and Exadata Cloud@Customer
     * systems.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateDbHomeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDbHome API.
     */
    CreateDbHomeResponse createDbHome(CreateDbHomeRequest request);

    /**
     * Creates an Exadata infrastructure resource. Applies to Exadata Cloud@Customer instances only.
     * To create an Exadata Cloud Service infrastructure resource, use the {@link
     * #createCloudExadataInfrastructure(CreateCloudExadataInfrastructureRequest)
     * createCloudExadataInfrastructure} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateExadataInfrastructureExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateExadataInfrastructure API.
     */
    CreateExadataInfrastructureResponse createExadataInfrastructure(
            CreateExadataInfrastructureRequest request);

    /**
     * Creates an Exadata VM cluster on Exascale Infrastructure
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateExadbVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateExadbVmCluster API.
     */
    CreateExadbVmClusterResponse createExadbVmCluster(CreateExadbVmClusterRequest request);

    /**
     * Creates an Exadata Database Storage Vault
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateExascaleDbStorageVaultExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateExascaleDbStorageVault API.
     */
    CreateExascaleDbStorageVaultResponse createExascaleDbStorageVault(
            CreateExascaleDbStorageVaultRequest request);

    /**
     * Creates an execution action resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateExecutionActionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateExecutionAction API.
     */
    CreateExecutionActionResponse createExecutionAction(CreateExecutionActionRequest request);

    /**
     * Creates an execution window resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateExecutionWindowExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateExecutionWindow API.
     */
    CreateExecutionWindowResponse createExecutionWindow(CreateExecutionWindowRequest request);

    /**
     * Creates a new backup resource and returns the information the caller needs to back up an
     * on-premises Oracle Database to Oracle Cloud Infrastructure.
     *
     * <p>*Note:** This API is used by an Oracle Cloud Infrastructure Python script that is packaged
     * with the Oracle Cloud Infrastructure CLI. Oracle recommends that you use the script instead
     * using the API directly. See [Migrating an On-Premises Database to Oracle Cloud Infrastructure
     * by Creating a Backup in the
     * Cloud](https://docs.oracle.com/iaas/Content/Database/Tasks/mig-onprembackup.htm) for more
     * information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateExternalBackupJobExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateExternalBackupJob API.
     */
    CreateExternalBackupJobResponse createExternalBackupJob(CreateExternalBackupJobRequest request);

    /**
     * Creates a new external container database resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateExternalContainerDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateExternalContainerDatabase API.
     */
    CreateExternalContainerDatabaseResponse createExternalContainerDatabase(
            CreateExternalContainerDatabaseRequest request);

    /**
     * Creates a new external database connector.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateExternalDatabaseConnectorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateExternalDatabaseConnector API.
     */
    CreateExternalDatabaseConnectorResponse createExternalDatabaseConnector(
            CreateExternalDatabaseConnectorRequest request);

    /**
     * Creates a new ExternalNonContainerDatabase resource
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateExternalNonContainerDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateExternalNonContainerDatabase API.
     */
    CreateExternalNonContainerDatabaseResponse createExternalNonContainerDatabase(
            CreateExternalNonContainerDatabaseRequest request);

    /**
     * Registers a new {@link
     * #createExternalPluggableDatabaseDetails(CreateExternalPluggableDatabaseDetailsRequest)
     * createExternalPluggableDatabaseDetails} resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateExternalPluggableDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateExternalPluggableDatabase API.
     */
    CreateExternalPluggableDatabaseResponse createExternalPluggableDatabase(
            CreateExternalPluggableDatabaseRequest request);

    /**
     * Creates a Key Store.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateKeyStoreExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateKeyStore API.
     */
    CreateKeyStoreResponse createKeyStore(CreateKeyStoreRequest request);

    /**
     * Creates a maintenance run with one of the following: 1. The latest available release update
     * patch (RUP) for the Autonomous Container Database. 2. The latest available RUP and DST
     * time-zone (TZ) file updates for the Autonomous Container Database. 3. The DST TZ file updates
     * for the Autonomous Container Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateMaintenanceRunExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateMaintenanceRun API.
     */
    CreateMaintenanceRunResponse createMaintenanceRun(CreateMaintenanceRunRequest request);

    /**
     * Creates one-off patch for specified database version to download.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateOneoffPatchExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateOneoffPatch
     *     API.
     */
    CreateOneoffPatchResponse createOneoffPatch(CreateOneoffPatchRequest request);

    /**
     * Creates and starts a pluggable database in the specified container database. Pluggable
     * Database can be created using different operations (e.g. LocalClone, RemoteClone, Relocate )
     * with this API. Use the {@link #startPluggableDatabase(StartPluggableDatabaseRequest)
     * startPluggableDatabase} and {@link #stopPluggableDatabase(StopPluggableDatabaseRequest)
     * stopPluggableDatabase} APIs to start and stop the pluggable database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreatePluggableDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreatePluggableDatabase API.
     */
    CreatePluggableDatabaseResponse createPluggableDatabase(CreatePluggableDatabaseRequest request);

    /**
     * Creates a Pluggable Database Snapshot
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreatePluggableDatabaseSnapshotExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreatePluggableDatabaseSnapshot API.
     */
    CreatePluggableDatabaseSnapshotResponse createPluggableDatabaseSnapshot(
            CreatePluggableDatabaseSnapshotRequest request);

    /**
     * Creates a Scheduled Action resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateScheduledActionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateScheduledAction API.
     */
    CreateScheduledActionResponse createScheduledAction(CreateScheduledActionRequest request);

    /**
     * Creates a Scheduling Plan resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateSchedulingPlanExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateSchedulingPlan API.
     */
    CreateSchedulingPlanResponse createSchedulingPlan(CreateSchedulingPlanRequest request);

    /**
     * Creates a Scheduling Policy resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateSchedulingPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateSchedulingPolicy API.
     */
    CreateSchedulingPolicyResponse createSchedulingPolicy(CreateSchedulingPolicyRequest request);

    /**
     * Creates a Scheduling Window resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateSchedulingWindowExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateSchedulingWindow API.
     */
    CreateSchedulingWindowResponse createSchedulingWindow(CreateSchedulingWindowRequest request);

    /**
     * Creates an Exadata Cloud@Customer VM cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateVmCluster
     *     API.
     */
    CreateVmClusterResponse createVmCluster(CreateVmClusterRequest request);

    /**
     * Creates the VM cluster network. Applies to Exadata Cloud@Customer instances only. To create a
     * cloud VM cluster in an Exadata Cloud Service instance, use the {@link
     * #createCloudVmCluster(CreateCloudVmClusterRequest) createCloudVmCluster} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateVmClusterNetworkExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateVmClusterNetwork API.
     */
    CreateVmClusterNetworkResponse createVmClusterNetwork(CreateVmClusterNetworkRequest request);

    /**
     * Performs one of the following power actions on the specified DB node: - start - power on -
     * stop - power off - softreset - ACPI shutdown and power on - reset - power off and power on
     *
     * <p>*Note:** Stopping a node affects billing differently, depending on the type of DB system:
     * *Bare metal and Exadata systems* - The _stop_ state has no effect on the resources you
     * consume. Billing continues for DB nodes that you stop, and related resources continue to
     * apply against any relevant quotas. You must terminate the DB system ({@link
     * #terminateDbSystem(TerminateDbSystemRequest) terminateDbSystem}) to remove its resources from
     * billing and quotas. *Virtual machine DB systems* - Stopping a node stops billing for all
     * OCPUs associated with that node, and billing resumes when you restart the node.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DbNodeActionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DbNodeAction API.
     */
    DbNodeActionResponse dbNodeAction(DbNodeActionRequest request);

    /**
     * Deletes and deregisters the specified application virtual IP (VIP) address.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteApplicationVipExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteApplicationVip API.
     */
    DeleteApplicationVipResponse deleteApplicationVip(DeleteApplicationVipRequest request);

    /**
     * Deletes the specified Autonomous AI Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteAutonomousDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteAutonomousDatabase API.
     */
    DeleteAutonomousDatabaseResponse deleteAutonomousDatabase(
            DeleteAutonomousDatabaseRequest request);

    /**
     * Deletes a long-term backup. You cannot delete other backups using this API.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteAutonomousDatabaseBackupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteAutonomousDatabaseBackup API.
     */
    DeleteAutonomousDatabaseBackupResponse deleteAutonomousDatabaseBackup(
            DeleteAutonomousDatabaseBackupRequest request);

    /**
     * Delete an Autonomous AI Database Software Image
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteAutonomousDatabaseSoftwareImageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteAutonomousDatabaseSoftwareImage API.
     */
    DeleteAutonomousDatabaseSoftwareImageResponse deleteAutonomousDatabaseSoftwareImage(
            DeleteAutonomousDatabaseSoftwareImageRequest request);

    /**
     * Deletes the specified Autonomous VM cluster in an Exadata Cloud@Customer system. To delete an
     * Autonomous VM Cluster in the Oracle cloud, see {@link
     * #deleteCloudAutonomousVmCluster(DeleteCloudAutonomousVmClusterRequest)
     * deleteCloudAutonomousVmCluster}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteAutonomousVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteAutonomousVmCluster API.
     */
    DeleteAutonomousVmClusterResponse deleteAutonomousVmCluster(
            DeleteAutonomousVmClusterRequest request);

    /**
     * Deletes a full backup. You cannot delete automatic backups using this API.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteBackupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteBackup API.
     */
    DeleteBackupResponse deleteBackup(DeleteBackupRequest request);

    /**
     * Deletes a backup destination in an Exadata Cloud@Customer system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteBackupDestinationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteBackupDestination API.
     */
    DeleteBackupDestinationResponse deleteBackupDestination(DeleteBackupDestinationRequest request);

    /**
     * Deletes the specified Autonomous Exadata VM cluster in the Oracle cloud. For Exadata
     * Cloud@Customer systems, see {@link
     * #deleteAutonomousVmCluster(DeleteAutonomousVmClusterRequest) deleteAutonomousVmCluster}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteCloudAutonomousVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteCloudAutonomousVmCluster API.
     */
    DeleteCloudAutonomousVmClusterResponse deleteCloudAutonomousVmCluster(
            DeleteCloudAutonomousVmClusterRequest request);

    /**
     * Deletes the cloud Exadata infrastructure resource. Applies to Exadata Cloud Service instances
     * and Autonomous AI Database on dedicated Exadata infrastructure only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteCloudExadataInfrastructureExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteCloudExadataInfrastructure API.
     */
    DeleteCloudExadataInfrastructureResponse deleteCloudExadataInfrastructure(
            DeleteCloudExadataInfrastructureRequest request);

    /**
     * Deletes the specified cloud VM cluster. Applies to Exadata Cloud Service instances and
     * Autonomous Database on dedicated Exadata infrastructure only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteCloudVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteCloudVmCluster API.
     */
    DeleteCloudVmClusterResponse deleteCloudVmCluster(DeleteCloudVmClusterRequest request);

    /**
     * Deletes the specified database node console connection.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteConsoleConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteConsoleConnection API.
     */
    DeleteConsoleConnectionResponse deleteConsoleConnection(DeleteConsoleConnectionRequest request);

    /**
     * Deletes the specified database node console history.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteConsoleHistoryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteConsoleHistory API.
     */
    DeleteConsoleHistoryResponse deleteConsoleHistory(DeleteConsoleHistoryRequest request);

    /**
     * Deletes the specified database. Applies only to Exadata systems.
     *
     * <p>The data in this database is local to the Exadata system and will be lost when the
     * database is deleted. Oracle recommends that you back up any data in the Exadata system prior
     * to deleting it. You can use the `performFinalBackup` parameter to have the Exadata system
     * database backed up before it is deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDatabase API.
     */
    DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request);

    /**
     * Delete a database software image
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteDatabaseSoftwareImageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteDatabaseSoftwareImage API.
     */
    DeleteDatabaseSoftwareImageResponse deleteDatabaseSoftwareImage(
            DeleteDatabaseSoftwareImageRequest request);

    /**
     * Deletes a Database Home. Applies to bare metal DB systems, Exadata Cloud Service, and Exadata
     * Cloud@Customer systems.
     *
     * <p>Oracle recommends that you use the `performFinalBackup` parameter to back up any data on a
     * bare metal DB system before you delete a Database Home. On an Exadata Cloud@Customer system
     * or an Exadata Cloud Service system, you can delete a Database Home only when there are no
     * databases in it and therefore you cannot use the `performFinalBackup` parameter to back up
     * data.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteDbHomeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDbHome API.
     */
    DeleteDbHomeResponse deleteDbHome(DeleteDbHomeRequest request);

    /**
     * Deletes the specified Exadata Database Node Snapshot.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteDbnodeSnapshotExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteDbnodeSnapshot API.
     */
    DeleteDbnodeSnapshotResponse deleteDbnodeSnapshot(DeleteDbnodeSnapshotRequest request);

    /**
     * Deletes the Exadata Cloud@Customer infrastructure.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteExadataInfrastructureExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteExadataInfrastructure API.
     */
    DeleteExadataInfrastructureResponse deleteExadataInfrastructure(
            DeleteExadataInfrastructureRequest request);

    /**
     * Deletes the specified Exadata VM cluster on Exascale Infrastructure. Applies to Exadata
     * Database Service on Exascale Infrastructure only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteExadbVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteExadbVmCluster API.
     */
    DeleteExadbVmClusterResponse deleteExadbVmCluster(DeleteExadbVmClusterRequest request);

    /**
     * Deletes the specified Exadata Database Storage Vault.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteExascaleDbStorageVaultExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteExascaleDbStorageVault API.
     */
    DeleteExascaleDbStorageVaultResponse deleteExascaleDbStorageVault(
            DeleteExascaleDbStorageVaultRequest request);

    /**
     * Deletes the execution action.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteExecutionActionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteExecutionAction API.
     */
    DeleteExecutionActionResponse deleteExecutionAction(DeleteExecutionActionRequest request);

    /**
     * Deletes the execution window.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteExecutionWindowExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteExecutionWindow API.
     */
    DeleteExecutionWindowResponse deleteExecutionWindow(DeleteExecutionWindowRequest request);

    /**
     * Deletes the {@link
     * #createExternalContainerDatabaseDetails(CreateExternalContainerDatabaseDetailsRequest)
     * createExternalContainerDatabaseDetails} resource. Any external pluggable databases registered
     * under this container database must be deleted in your Oracle Cloud Infrastructure tenancy
     * prior to this operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteExternalContainerDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteExternalContainerDatabase API.
     */
    DeleteExternalContainerDatabaseResponse deleteExternalContainerDatabase(
            DeleteExternalContainerDatabaseRequest request);

    /**
     * Deletes an external database connector. Any services enabled using the external database
     * connector must be deleted prior to this operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteExternalDatabaseConnectorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteExternalDatabaseConnector API.
     */
    DeleteExternalDatabaseConnectorResponse deleteExternalDatabaseConnector(
            DeleteExternalDatabaseConnectorRequest request);

    /**
     * Deletes the Oracle Cloud Infrastructure resource representing an external non-container
     * database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteExternalNonContainerDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteExternalNonContainerDatabase API.
     */
    DeleteExternalNonContainerDatabaseResponse deleteExternalNonContainerDatabase(
            DeleteExternalNonContainerDatabaseRequest request);

    /**
     * Deletes the {@link
     * #createExternalPluggableDatabaseDetails(CreateExternalPluggableDatabaseDetailsRequest)
     * createExternalPluggableDatabaseDetails}. resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteExternalPluggableDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteExternalPluggableDatabase API.
     */
    DeleteExternalPluggableDatabaseResponse deleteExternalPluggableDatabase(
            DeleteExternalPluggableDatabaseRequest request);

    /**
     * Deletes a key store.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteKeyStoreExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteKeyStore API.
     */
    DeleteKeyStoreResponse deleteKeyStore(DeleteKeyStoreRequest request);

    /**
     * Deletes a one-off patch.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteOneoffPatchExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteOneoffPatch
     *     API.
     */
    DeleteOneoffPatchResponse deleteOneoffPatch(DeleteOneoffPatchRequest request);

    /**
     * Deletes the specified pluggable database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeletePluggableDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeletePluggableDatabase API.
     */
    DeletePluggableDatabaseResponse deletePluggableDatabase(DeletePluggableDatabaseRequest request);

    /**
     * Deletes the specified Exadata Pluggable Database Snapshot.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeletePluggableDatabaseSnapshotExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeletePluggableDatabaseSnapshot API.
     */
    DeletePluggableDatabaseSnapshotResponse deletePluggableDatabaseSnapshot(
            DeletePluggableDatabaseSnapshotRequest request);

    /**
     * Deletes the scheduled action.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteScheduledActionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteScheduledAction API.
     */
    DeleteScheduledActionResponse deleteScheduledAction(DeleteScheduledActionRequest request);

    /**
     * Deletes the scheduling plan.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteSchedulingPlanExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteSchedulingPlan API.
     */
    DeleteSchedulingPlanResponse deleteSchedulingPlan(DeleteSchedulingPlanRequest request);

    /**
     * Deletes the scheduling policy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteSchedulingPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteSchedulingPolicy API.
     */
    DeleteSchedulingPolicyResponse deleteSchedulingPolicy(DeleteSchedulingPolicyRequest request);

    /**
     * Deletes the scheduling window.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteSchedulingWindowExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteSchedulingWindow API.
     */
    DeleteSchedulingWindowResponse deleteSchedulingWindow(DeleteSchedulingWindowRequest request);

    /**
     * Deletes the specified VM cluster. Applies to Exadata Cloud@Customer instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteVmCluster
     *     API.
     */
    DeleteVmClusterResponse deleteVmCluster(DeleteVmClusterRequest request);

    /**
     * Deletes the specified VM cluster network. Applies to Exadata Cloud@Customer instances only.
     * To delete a cloud VM cluster in an Exadata Cloud Service instance, use the {@link
     * #deleteCloudVmCluster(DeleteCloudVmClusterRequest) deleteCloudVmCluster} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeleteVmClusterNetworkExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteVmClusterNetwork API.
     */
    DeleteVmClusterNetworkResponse deleteVmClusterNetwork(DeleteVmClusterNetworkRequest request);

    /**
     * Asynchronously deregisters this Autonomous AI Database with Data Safe.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DeregisterAutonomousDatabaseDataSafeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeregisterAutonomousDatabaseDataSafe API.
     */
    DeregisterAutonomousDatabaseDataSafeResponse deregisterAutonomousDatabaseDataSafe(
            DeregisterAutonomousDatabaseDataSafeRequest request);

    /**
     * Disables Database Management for the Autonomous AI Database resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DisableAutonomousDatabaseManagementExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DisableAutonomousDatabaseManagement API.
     */
    DisableAutonomousDatabaseManagementResponse disableAutonomousDatabaseManagement(
            DisableAutonomousDatabaseManagementRequest request);

    /**
     * Disables Operations Insights for the Autonomous AI Database resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DisableAutonomousDatabaseOperationsInsightsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DisableAutonomousDatabaseOperationsInsights API.
     */
    DisableAutonomousDatabaseOperationsInsightsResponse disableAutonomousDatabaseOperationsInsights(
            DisableAutonomousDatabaseOperationsInsightsRequest request);

    /**
     * Disables the Database Management service for the database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DisableDatabaseManagementExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DisableDatabaseManagement API.
     */
    DisableDatabaseManagementResponse disableDatabaseManagement(
            DisableDatabaseManagementRequest request);

    /**
     * Disable Database Management service for the external container database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DisableExternalContainerDatabaseDatabaseManagementExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DisableExternalContainerDatabaseDatabaseManagement API.
     */
    DisableExternalContainerDatabaseDatabaseManagementResponse
            disableExternalContainerDatabaseDatabaseManagement(
                    DisableExternalContainerDatabaseDatabaseManagementRequest request);

    /**
     * Disable Stack Monitoring for the external container database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DisableExternalContainerDatabaseStackMonitoringExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DisableExternalContainerDatabaseStackMonitoring API.
     */
    DisableExternalContainerDatabaseStackMonitoringResponse
            disableExternalContainerDatabaseStackMonitoring(
                    DisableExternalContainerDatabaseStackMonitoringRequest request);

    /**
     * Disable Database Management Service for the external non-container database. For more
     * information about the Database Management Service, see [Database Management
     * Service](https://docs.oracle.com/iaas/Content/ExternalDatabase/Concepts/databasemanagementservice.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DisableExternalNonContainerDatabaseDatabaseManagementExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DisableExternalNonContainerDatabaseDatabaseManagement API.
     */
    DisableExternalNonContainerDatabaseDatabaseManagementResponse
            disableExternalNonContainerDatabaseDatabaseManagement(
                    DisableExternalNonContainerDatabaseDatabaseManagementRequest request);

    /**
     * Disable Operations Insights for the external non-container database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DisableExternalNonContainerDatabaseOperationsInsightsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DisableExternalNonContainerDatabaseOperationsInsights API.
     */
    DisableExternalNonContainerDatabaseOperationsInsightsResponse
            disableExternalNonContainerDatabaseOperationsInsights(
                    DisableExternalNonContainerDatabaseOperationsInsightsRequest request);

    /**
     * Disable Stack Monitoring for the external non-container database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DisableExternalNonContainerDatabaseStackMonitoringExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DisableExternalNonContainerDatabaseStackMonitoring API.
     */
    DisableExternalNonContainerDatabaseStackMonitoringResponse
            disableExternalNonContainerDatabaseStackMonitoring(
                    DisableExternalNonContainerDatabaseStackMonitoringRequest request);

    /**
     * Disable Database Management Service for the external pluggable database. For more information
     * about the Database Management Service, see [Database Management
     * Service](https://docs.oracle.com/iaas/Content/ExternalDatabase/Concepts/databasemanagementservice.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DisableExternalPluggableDatabaseDatabaseManagementExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DisableExternalPluggableDatabaseDatabaseManagement API.
     */
    DisableExternalPluggableDatabaseDatabaseManagementResponse
            disableExternalPluggableDatabaseDatabaseManagement(
                    DisableExternalPluggableDatabaseDatabaseManagementRequest request);

    /**
     * Disable Operations Insights for the external pluggable database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DisableExternalPluggableDatabaseOperationsInsightsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DisableExternalPluggableDatabaseOperationsInsights API.
     */
    DisableExternalPluggableDatabaseOperationsInsightsResponse
            disableExternalPluggableDatabaseOperationsInsights(
                    DisableExternalPluggableDatabaseOperationsInsightsRequest request);

    /**
     * Disable Stack Monitoring for the external pluggable database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DisableExternalPluggableDatabaseStackMonitoringExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DisableExternalPluggableDatabaseStackMonitoring API.
     */
    DisableExternalPluggableDatabaseStackMonitoringResponse
            disableExternalPluggableDatabaseStackMonitoring(
                    DisableExternalPluggableDatabaseStackMonitoringRequest request);

    /**
     * Disables the Database Management service for the pluggable database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DisablePluggableDatabaseManagementExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DisablePluggableDatabaseManagement API.
     */
    DisablePluggableDatabaseManagementResponse disablePluggableDatabaseManagement(
            DisablePluggableDatabaseManagementRequest request);

    /**
     * Downloads the configuration file for the specified Exadata Cloud@Customer infrastructure.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DownloadExadataInfrastructureConfigFileExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DownloadExadataInfrastructureConfigFile API.
     */
    DownloadExadataInfrastructureConfigFileResponse downloadExadataInfrastructureConfigFile(
            DownloadExadataInfrastructureConfigFileRequest request);

    /**
     * Download one-off patch.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DownloadOneoffPatchExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DownloadOneoffPatch
     *     API.
     */
    DownloadOneoffPatchResponse downloadOneoffPatch(DownloadOneoffPatchRequest request);

    /**
     * Downloads the network validation report file for the specified VM cluster network. Applies to
     * Exadata Cloud@Customer instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DownloadValidationReportExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DownloadValidationReport API.
     */
    DownloadValidationReportResponse downloadValidationReport(
            DownloadValidationReportRequest request);

    /**
     * Downloads the configuration file for the specified VM cluster network. Applies to Exadata
     * Cloud@Customer instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/DownloadVmClusterNetworkConfigFileExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DownloadVmClusterNetworkConfigFile API.
     */
    DownloadVmClusterNetworkConfigFileResponse downloadVmClusterNetworkConfigFile(
            DownloadVmClusterNetworkConfigFileRequest request);

    /**
     * Modify Autonomous Container Database Data Guard settings such as protection mode, automatic
     * failover, and fast start failover lag limit. For more information, see [Update Autonomous
     * Container Database
     * Dataguard](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbcl/index.html#ADBCL-GUID-3A936EC7-7A49-4FD2-9F39-8DB6B22011CE).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/EditAutonomousContainerDatabaseDataguardExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     EditAutonomousContainerDatabaseDataguard API.
     */
    EditAutonomousContainerDatabaseDataguardResponse editAutonomousContainerDatabaseDataguard(
            EditAutonomousContainerDatabaseDataguardRequest request);

    /**
     * Enables Database Management for Autonomous AI Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/EnableAutonomousDatabaseManagementExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     EnableAutonomousDatabaseManagement API.
     */
    EnableAutonomousDatabaseManagementResponse enableAutonomousDatabaseManagement(
            EnableAutonomousDatabaseManagementRequest request);

    /**
     * Enables the specified Autonomous AI Database with Operations Insights.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/EnableAutonomousDatabaseOperationsInsightsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     EnableAutonomousDatabaseOperationsInsights API.
     */
    EnableAutonomousDatabaseOperationsInsightsResponse enableAutonomousDatabaseOperationsInsights(
            EnableAutonomousDatabaseOperationsInsightsRequest request);

    /**
     * Enables the Database Management service for an Oracle Database located in Oracle Cloud
     * Infrastructure. This service allows the database to access tools including Metrics and
     * Performance hub. Database Management is enabled at the container database (CDB) level.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/EnableDatabaseManagementExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     EnableDatabaseManagement API.
     */
    EnableDatabaseManagementResponse enableDatabaseManagement(
            EnableDatabaseManagementRequest request);

    /**
     * Enables Database Management Service for the external container database. For more information
     * about the Database Management Service, see [Database Management
     * Service](https://docs.oracle.com/iaas/Content/ExternalDatabase/Concepts/databasemanagementservice.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/EnableExternalContainerDatabaseDatabaseManagementExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     EnableExternalContainerDatabaseDatabaseManagement API.
     */
    EnableExternalContainerDatabaseDatabaseManagementResponse
            enableExternalContainerDatabaseDatabaseManagement(
                    EnableExternalContainerDatabaseDatabaseManagementRequest request);

    /**
     * Enable Stack Monitoring for the external container database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/EnableExternalContainerDatabaseStackMonitoringExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     EnableExternalContainerDatabaseStackMonitoring API.
     */
    EnableExternalContainerDatabaseStackMonitoringResponse
            enableExternalContainerDatabaseStackMonitoring(
                    EnableExternalContainerDatabaseStackMonitoringRequest request);

    /**
     * Enable Database Management Service for the external non-container database. For more
     * information about the Database Management Service, see [Database Management
     * Service](https://docs.oracle.com/iaas/Content/ExternalDatabase/Concepts/databasemanagementservice.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/EnableExternalNonContainerDatabaseDatabaseManagementExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     EnableExternalNonContainerDatabaseDatabaseManagement API.
     */
    EnableExternalNonContainerDatabaseDatabaseManagementResponse
            enableExternalNonContainerDatabaseDatabaseManagement(
                    EnableExternalNonContainerDatabaseDatabaseManagementRequest request);

    /**
     * Enable Operations Insights for the external non-container database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/EnableExternalNonContainerDatabaseOperationsInsightsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     EnableExternalNonContainerDatabaseOperationsInsights API.
     */
    EnableExternalNonContainerDatabaseOperationsInsightsResponse
            enableExternalNonContainerDatabaseOperationsInsights(
                    EnableExternalNonContainerDatabaseOperationsInsightsRequest request);

    /**
     * Enable Stack Monitoring for the external non-container database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/EnableExternalNonContainerDatabaseStackMonitoringExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     EnableExternalNonContainerDatabaseStackMonitoring API.
     */
    EnableExternalNonContainerDatabaseStackMonitoringResponse
            enableExternalNonContainerDatabaseStackMonitoring(
                    EnableExternalNonContainerDatabaseStackMonitoringRequest request);

    /**
     * Enable Database Management Service for the external pluggable database. For more information
     * about the Database Management Service, see [Database Management
     * Service](https://docs.oracle.com/iaas/Content/ExternalDatabase/Concepts/databasemanagementservice.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/EnableExternalPluggableDatabaseDatabaseManagementExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     EnableExternalPluggableDatabaseDatabaseManagement API.
     */
    EnableExternalPluggableDatabaseDatabaseManagementResponse
            enableExternalPluggableDatabaseDatabaseManagement(
                    EnableExternalPluggableDatabaseDatabaseManagementRequest request);

    /**
     * Enable Operations Insights for the external pluggable database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/EnableExternalPluggableDatabaseOperationsInsightsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     EnableExternalPluggableDatabaseOperationsInsights API.
     */
    EnableExternalPluggableDatabaseOperationsInsightsResponse
            enableExternalPluggableDatabaseOperationsInsights(
                    EnableExternalPluggableDatabaseOperationsInsightsRequest request);

    /**
     * Enable Stack Monitoring for the external pluggable database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/EnableExternalPluggableDatabaseStackMonitoringExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     EnableExternalPluggableDatabaseStackMonitoring API.
     */
    EnableExternalPluggableDatabaseStackMonitoringResponse
            enableExternalPluggableDatabaseStackMonitoring(
                    EnableExternalPluggableDatabaseStackMonitoringRequest request);

    /**
     * Enables the Database Management service for an Oracle Pluggable Database located in Oracle
     * Cloud Infrastructure. This service allows the pluggable database to access tools including
     * Metrics and Performance hub. Database Management is enabled at the pluggable database (PDB)
     * level.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/EnablePluggableDatabaseManagementExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     EnablePluggableDatabaseManagement API.
     */
    EnablePluggableDatabaseManagementResponse enablePluggableDatabaseManagement(
            EnablePluggableDatabaseManagementRequest request);

    /**
     * Initiates a failover of the specified Autonomous AI Database to the associated peer database.
     * Applicable only to databases with Disaster Recovery enabled. This API should be called in the
     * remote region where the peer database resides. Below parameter is optional: - `peerDbId` Use
     * this parameter to specify the database OCID of the Disaster Recovery peer, which is located
     * in a different (remote) region from the current peer database. If this parameter is not
     * provided, the failover will happen in the same region.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/FailOverAutonomousDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     FailOverAutonomousDatabase API.
     */
    FailOverAutonomousDatabaseResponse failOverAutonomousDatabase(
            FailOverAutonomousDatabaseRequest request);

    /**
     * Performs failover to a standby Autonomous Container Database (ACD) identified by the
     * autonomousContainerDatabaseId parameter. This standby ACD will become the new primary ACD
     * when the failover completes successfully. For more information, see [Fail Over to the Standby
     * in an Autonomous Data Guard
     * Configuration](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbcl/index.html#ADBCL-GUID-C8FFA343-223C-4F41-9656-AEC356AD90A0).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/FailoverAutonomousContainerDatabaseDataguardExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     FailoverAutonomousContainerDatabaseDataguard API.
     */
    FailoverAutonomousContainerDatabaseDataguardResponse
            failoverAutonomousContainerDatabaseDataguard(
                    FailoverAutonomousContainerDatabaseDataguardRequest request);

    /**
     * **Deprecated.** Use the {@link
     * #failoverAutonomousContainerDatabaseDataguard(FailoverAutonomousContainerDatabaseDataguardRequest)
     * failoverAutonomousContainerDatabaseDataguard} operation to fail over the standby Autonomous
     * Container Database (ACD) to the primary ACD after the existing primary ACD fails or becomes
     * unreachable.
     *
     * <p>A failover can result in data loss, depending on the protection mode in effect at the time
     * the primary Autonomous Container Database fails.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/FailoverAutonomousContainerDatabaseDataguardAssociationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     FailoverAutonomousContainerDatabaseDataguardAssociation API.
     */
    FailoverAutonomousContainerDatabaseDataguardAssociationResponse
            failoverAutonomousContainerDatabaseDataguardAssociation(
                    FailoverAutonomousContainerDatabaseDataguardAssociationRequest request);

    /**
     * Performs a failover to transition the standby database identified by the `databaseId` path
     * parameter into the primary role after the existing primary database fails or becomes
     * unreachable.
     *
     * <p>A failover might result in data loss depending on the protection mode in effect at the
     * time of the primary database failure.
     *
     * <p>This operation should be performed on respective standby database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/FailoverDataGuardExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use FailoverDataGuard
     *     API.
     */
    FailoverDataGuardResponse failoverDataGuard(FailoverDataGuardRequest request);

    /**
     * Performs a failover to transition the standby database identified by the `databaseId`
     * parameter into the specified Data Guard association's primary role after the existing primary
     * database fails or becomes unreachable.
     *
     * <p>A failover might result in data loss depending on the protection mode in effect at the
     * time of the primary database failure.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/FailoverDataGuardAssociationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     FailoverDataGuardAssociation API.
     */
    FailoverDataGuardAssociationResponse failoverDataGuardAssociation(
            FailoverDataGuardAssociationRequest request);

    /**
     * Creates and downloads a wallet for the specified Autonomous AI Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GenerateAutonomousDatabaseWalletExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GenerateAutonomousDatabaseWallet API.
     */
    GenerateAutonomousDatabaseWalletResponse generateAutonomousDatabaseWallet(
            GenerateAutonomousDatabaseWalletRequest request);

    /**
     * Generates a recommended Cloud@Customer VM cluster network configuration.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GenerateRecommendedVmClusterNetworkExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GenerateRecommendedVmClusterNetwork API.
     */
    GenerateRecommendedVmClusterNetworkResponse generateRecommendedVmClusterNetwork(
            GenerateRecommendedVmClusterNetworkRequest request);

    /**
     * Gets information about a specified application virtual IP (VIP) address.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetApplicationVipExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetApplicationVip
     *     API.
     */
    GetApplicationVipResponse getApplicationVip(GetApplicationVipRequest request);

    /**
     * Gets information about the specified Autonomous Container Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousContainerDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetAutonomousContainerDatabase API.
     */
    GetAutonomousContainerDatabaseResponse getAutonomousContainerDatabase(
            GetAutonomousContainerDatabaseRequest request);

    /**
     * **Deprecated.** Use the {@link
     * #getAutonomousContainerDatabase(GetAutonomousContainerDatabaseRequest)
     * getAutonomousContainerDatabase} operation to get the details of an Autonomous Container
     * Database (ACD) enabled with Autonomous Data Guard associated with the specified ACD.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousContainerDatabaseDataguardAssociationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetAutonomousContainerDatabaseDataguardAssociation API.
     */
    GetAutonomousContainerDatabaseDataguardAssociationResponse
            getAutonomousContainerDatabaseDataguardAssociation(
                    GetAutonomousContainerDatabaseDataguardAssociationRequest request);

    /**
     * Get resource usage details for the specified Autonomous Container Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousContainerDatabaseResourceUsageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetAutonomousContainerDatabaseResourceUsage API.
     */
    GetAutonomousContainerDatabaseResourceUsageResponse getAutonomousContainerDatabaseResourceUsage(
            GetAutonomousContainerDatabaseResourceUsageRequest request);

    /**
     * Gets the details of the specified Autonomous AI Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetAutonomousDatabase API.
     */
    GetAutonomousDatabaseResponse getAutonomousDatabase(GetAutonomousDatabaseRequest request);

    /**
     * Gets information about the specified Autonomous AI Database backup.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousDatabaseBackupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetAutonomousDatabaseBackup API.
     */
    GetAutonomousDatabaseBackupResponse getAutonomousDatabaseBackup(
            GetAutonomousDatabaseBackupRequest request);

    /**
     * *Deprecated.* Use the {@link
     * #getAutonomousContainerDatabase(GetAutonomousContainerDatabaseRequest)
     * getAutonomousContainerDatabase} operation to gets an Autonomous Data Guard-enabled database
     * associated with the specified Autonomous AI Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousDatabaseDataguardAssociationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetAutonomousDatabaseDataguardAssociation API.
     */
    GetAutonomousDatabaseDataguardAssociationResponse getAutonomousDatabaseDataguardAssociation(
            GetAutonomousDatabaseDataguardAssociationRequest request);

    /**
     * Gets the Autonomous AI Database regional wallet details.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousDatabaseRegionalWalletExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetAutonomousDatabaseRegionalWallet API.
     */
    GetAutonomousDatabaseRegionalWalletResponse getAutonomousDatabaseRegionalWallet(
            GetAutonomousDatabaseRegionalWalletRequest request);

    /**
     * Gets information about the specified Autonomous AI Database Software Image.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousDatabaseSoftwareImageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetAutonomousDatabaseSoftwareImage API.
     */
    GetAutonomousDatabaseSoftwareImageResponse getAutonomousDatabaseSoftwareImage(
            GetAutonomousDatabaseSoftwareImageRequest request);

    /**
     * Gets the wallet details for the specified Autonomous AI Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousDatabaseWalletExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetAutonomousDatabaseWallet API.
     */
    GetAutonomousDatabaseWalletResponse getAutonomousDatabaseWallet(
            GetAutonomousDatabaseWalletRequest request);

    /**
     * **Deprecated.** Use the {@link
     * #getCloudExadataInfrastructure(GetCloudExadataInfrastructureRequest)
     * getCloudExadataInfrastructure} operation to get details of an Exadata Infrastructure resource
     * and the {@link #getCloudAutonomousVmCluster(GetCloudAutonomousVmClusterRequest)
     * getCloudAutonomousVmCluster} operation to get details of an Autonomous Exadata VM cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousExadataInfrastructureExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetAutonomousExadataInfrastructure API.
     */
    GetAutonomousExadataInfrastructureResponse getAutonomousExadataInfrastructure(
            GetAutonomousExadataInfrastructureRequest request);

    /**
     * Gets information about a specific autonomous patch.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousPatchExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAutonomousPatch
     *     API.
     */
    GetAutonomousPatchResponse getAutonomousPatch(GetAutonomousPatchRequest request);

    /**
     * Gets the details of specific Autonomous Virtual Machine.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousVirtualMachineExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetAutonomousVirtualMachine API.
     */
    GetAutonomousVirtualMachineResponse getAutonomousVirtualMachine(
            GetAutonomousVirtualMachineRequest request);

    /**
     * Gets information about the specified Autonomous VM cluster for an Exadata Cloud@Customer
     * system. To get information about an Autonomous VM Cluster in the Oracle cloud, see {@link
     * #getCloudAutonomousVmCluster(GetCloudAutonomousVmClusterRequest)
     * getCloudAutonomousVmCluster}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetAutonomousVmCluster API.
     */
    GetAutonomousVmClusterResponse getAutonomousVmCluster(GetAutonomousVmClusterRequest request);

    /**
     * Get the resource usage details for the specified Autonomous Exadata VM cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousVmClusterResourceUsageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetAutonomousVmClusterResourceUsage API.
     */
    GetAutonomousVmClusterResourceUsageResponse getAutonomousVmClusterResourceUsage(
            GetAutonomousVmClusterResourceUsageRequest request);

    /**
     * Gets information about the specified backup.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetBackupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetBackup API.
     */
    GetBackupResponse getBackup(GetBackupRequest request);

    /**
     * Gets information about the specified backup destination in an Exadata Cloud@Customer system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetBackupDestinationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetBackupDestination API.
     */
    GetBackupDestinationResponse getBackupDestination(GetBackupDestinationRequest request);

    /**
     * Gets information about the specified Autonomous Exadata VM cluster in the Oracle cloud. For
     * Exadata Cloud@Custustomer systems, see {@link
     * #getAutonomousVmCluster(GetAutonomousVmClusterRequest) getAutonomousVmCluster}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetCloudAutonomousVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetCloudAutonomousVmCluster API.
     */
    GetCloudAutonomousVmClusterResponse getCloudAutonomousVmCluster(
            GetCloudAutonomousVmClusterRequest request);

    /**
     * Get the resource usage details for the specified Cloud Autonomous Exadata VM cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetCloudAutonomousVmClusterResourceUsageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetCloudAutonomousVmClusterResourceUsage API.
     */
    GetCloudAutonomousVmClusterResourceUsageResponse getCloudAutonomousVmClusterResourceUsage(
            GetCloudAutonomousVmClusterResourceUsageRequest request);

    /**
     * Gets information about the specified cloud Exadata infrastructure resource. Applies to
     * Exadata Cloud Service instances and Autonomous AI Database on dedicated Exadata
     * infrastructure only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetCloudExadataInfrastructureExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetCloudExadataInfrastructure API.
     */
    GetCloudExadataInfrastructureResponse getCloudExadataInfrastructure(
            GetCloudExadataInfrastructureRequest request);

    /**
     * Gets unallocated resources information for the specified Cloud Exadata infrastructure.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetCloudExadataInfrastructureUnallocatedResourcesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetCloudExadataInfrastructureUnallocatedResources API.
     */
    GetCloudExadataInfrastructureUnallocatedResourcesResponse
            getCloudExadataInfrastructureUnallocatedResources(
                    GetCloudExadataInfrastructureUnallocatedResourcesRequest request);

    /**
     * Gets information about the specified cloud VM cluster. Applies to Exadata Cloud Service
     * instances and Autonomous Database on dedicated Exadata infrastructure only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetCloudVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetCloudVmCluster
     *     API.
     */
    GetCloudVmClusterResponse getCloudVmCluster(GetCloudVmClusterRequest request);

    /**
     * Gets the IORM configuration for the specified cloud VM cluster in an Exadata Cloud Service
     * instance. If you have not specified an IORM configuration, the default configuration is
     * returned.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetCloudVmClusterIormConfigExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetCloudVmClusterIormConfig API.
     */
    GetCloudVmClusterIormConfigResponse getCloudVmClusterIormConfig(
            GetCloudVmClusterIormConfigRequest request);

    /**
     * Gets information about a specified maintenance update package for a cloud VM cluster. Applies
     * to Exadata Cloud Service instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetCloudVmClusterUpdateExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetCloudVmClusterUpdate API.
     */
    GetCloudVmClusterUpdateResponse getCloudVmClusterUpdate(GetCloudVmClusterUpdateRequest request);

    /**
     * Gets the maintenance update history details for the specified update history entry. Applies
     * to Exadata Cloud Service instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetCloudVmClusterUpdateHistoryEntryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetCloudVmClusterUpdateHistoryEntry API.
     */
    GetCloudVmClusterUpdateHistoryEntryResponse getCloudVmClusterUpdateHistoryEntry(
            GetCloudVmClusterUpdateHistoryEntryRequest request);

    /**
     * Gets the specified database node console connection's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetConsoleConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetConsoleConnection API.
     */
    GetConsoleConnectionResponse getConsoleConnection(GetConsoleConnectionRequest request);

    /**
     * Gets information about the specified database node console history.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetConsoleHistoryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetConsoleHistory
     *     API.
     */
    GetConsoleHistoryResponse getConsoleHistory(GetConsoleHistoryRequest request);

    /**
     * Retrieves the specified database node console history contents upto a megabyte.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetConsoleHistoryContentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetConsoleHistoryContent API.
     */
    GetConsoleHistoryContentResponse getConsoleHistoryContent(
            GetConsoleHistoryContentRequest request);

    /**
     * Gets the specified Data Guard association's configuration information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDataGuardAssociationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetDataGuardAssociation API.
     */
    GetDataGuardAssociationResponse getDataGuardAssociation(GetDataGuardAssociationRequest request);

    /**
     * Gets information about the specified database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDatabase API.
     */
    GetDatabaseResponse getDatabase(GetDatabaseRequest request);

    /**
     * Gets information about the specified database software image.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDatabaseSoftwareImageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetDatabaseSoftwareImage API.
     */
    GetDatabaseSoftwareImageResponse getDatabaseSoftwareImage(
            GetDatabaseSoftwareImageRequest request);

    /**
     * gets the upgrade history for a specified database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDatabaseUpgradeHistoryEntryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetDatabaseUpgradeHistoryEntry API.
     */
    GetDatabaseUpgradeHistoryEntryResponse getDatabaseUpgradeHistoryEntry(
            GetDatabaseUpgradeHistoryEntryRequest request);

    /**
     * Gets information about the specified Database Home.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDbHomeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDbHome API.
     */
    GetDbHomeResponse getDbHome(GetDbHomeRequest request);

    /**
     * Gets information about a specified patch package.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDbHomePatchExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDbHomePatch API.
     */
    GetDbHomePatchResponse getDbHomePatch(GetDbHomePatchRequest request);

    /**
     * Gets the patch history details for the specified patchHistoryEntryId
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDbHomePatchHistoryEntryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetDbHomePatchHistoryEntry API.
     */
    GetDbHomePatchHistoryEntryResponse getDbHomePatchHistoryEntry(
            GetDbHomePatchHistoryEntryRequest request);

    /**
     * Gets information about the specified database node.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDbNodeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDbNode API.
     */
    GetDbNodeResponse getDbNode(GetDbNodeRequest request);

    /**
     * Gets information about the Exadata Db server.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDbServerExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDbServer API.
     */
    GetDbServerResponse getDbServer(GetDbServerRequest request);

    /**
     * Gets information about the specified DB system.
     *
     * <p>*Note:** Deprecated for Exadata Cloud Service systems. Use the [new resource model
     * APIs](https://docs.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model)
     * instead.
     *
     * <p>For Exadata Cloud Service instances, support for this API will end on May 15th, 2021. See
     * [Switching an Exadata DB System to the New Resource Model and
     * APIs](https://docs.oracle.com/iaas/Content/Database/Concepts/exaflexsystem_topic-resource_model_conversion.htm)
     * for details on converting existing Exadata DB systems to the new resource model.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDbSystemExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDbSystem API.
     */
    GetDbSystemResponse getDbSystem(GetDbSystemRequest request);

    /**
     * Gets information the specified patch.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDbSystemPatchExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDbSystemPatch
     *     API.
     */
    GetDbSystemPatchResponse getDbSystemPatch(GetDbSystemPatchRequest request);

    /**
     * Gets the details of the specified patch operation on the specified DB system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDbSystemPatchHistoryEntryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetDbSystemPatchHistoryEntry API.
     */
    GetDbSystemPatchHistoryEntryResponse getDbSystemPatchHistoryEntry(
            GetDbSystemPatchHistoryEntryRequest request);

    /**
     * Gets the details of the specified operating system upgrade operation for the specified DB
     * system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDbSystemUpgradeHistoryEntryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetDbSystemUpgradeHistoryEntry API.
     */
    GetDbSystemUpgradeHistoryEntryResponse getDbSystemUpgradeHistoryEntry(
            GetDbSystemUpgradeHistoryEntryRequest request);

    /**
     * Gets information about the specified Exadata Database Node Snapshot in the specified
     * compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDbnodeSnapshotExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDbnodeSnapshot
     *     API.
     */
    GetDbnodeSnapshotResponse getDbnodeSnapshot(GetDbnodeSnapshotRequest request);

    /**
     * Gets information about the specified Exadata infrastructure. Applies to Exadata
     * Cloud@Customer instances only. To get information on an Exadata Cloud Service infrastructure
     * resource, use the {@link #getCloudExadataInfrastructure(GetCloudExadataInfrastructureRequest)
     * getCloudExadataInfrastructure} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExadataInfrastructureExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetExadataInfrastructure API.
     */
    GetExadataInfrastructureResponse getExadataInfrastructure(
            GetExadataInfrastructureRequest request);

    /**
     * Gets details of the available and consumed OCPUs for the specified Autonomous Exadata
     * Infrastructure resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExadataInfrastructureOcpusExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetExadataInfrastructureOcpus API.
     */
    GetExadataInfrastructureOcpusResponse getExadataInfrastructureOcpus(
            GetExadataInfrastructureOcpusRequest request);

    /**
     * Gets un allocated resources information for the specified Exadata infrastructure. Applies to
     * Exadata Cloud@Customer instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExadataInfrastructureUnAllocatedResourcesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetExadataInfrastructureUnAllocatedResources API.
     */
    GetExadataInfrastructureUnAllocatedResourcesResponse
            getExadataInfrastructureUnAllocatedResources(
                    GetExadataInfrastructureUnAllocatedResourcesRequest request);

    /**
     * Gets the IORM configuration settings for the specified cloud Exadata DB system. All Exadata
     * service instances have default IORM settings.
     *
     * <p>*Note:** Deprecated for Exadata Cloud Service systems. Use the [new resource model
     * APIs](https://docs.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model)
     * instead.
     *
     * <p>For Exadata Cloud Service instances, support for this API will end on May 15th, 2021. See
     * [Switching an Exadata DB System to the New Resource Model and
     * APIs](https://docs.oracle.com/iaas/Content/Database/Concepts/exaflexsystem_topic-resource_model_conversion.htm)
     * for details on converting existing Exadata DB systems to the new resource model.
     *
     * <p>The {@link #getCloudVmClusterIormConfig(GetCloudVmClusterIormConfigRequest)
     * getCloudVmClusterIormConfig} API is used for this operation with Exadata systems using the
     * new resource model.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExadataIormConfigExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetExadataIormConfig API.
     */
    GetExadataIormConfigResponse getExadataIormConfig(GetExadataIormConfigRequest request);

    /**
     * Gets information about the specified Exadata VM cluster on Exascale Infrastructure. Applies
     * to Exadata Database Service on Exascale Infrastructure only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExadbVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExadbVmCluster
     *     API.
     */
    GetExadbVmClusterResponse getExadbVmCluster(GetExadbVmClusterRequest request);

    /**
     * Gets information about a specified maintenance update package for a Exadata VM cluster on
     * Exascale Infrastructure.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExadbVmClusterUpdateExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetExadbVmClusterUpdate API.
     */
    GetExadbVmClusterUpdateResponse getExadbVmClusterUpdate(GetExadbVmClusterUpdateRequest request);

    /**
     * Gets the maintenance update history details for the specified update history entry.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExadbVmClusterUpdateHistoryEntryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetExadbVmClusterUpdateHistoryEntry API.
     */
    GetExadbVmClusterUpdateHistoryEntryResponse getExadbVmClusterUpdateHistoryEntry(
            GetExadbVmClusterUpdateHistoryEntryRequest request);

    /**
     * Gets information about the specified Exadata Database Storage Vaults in the specified
     * compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExascaleDbStorageVaultExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetExascaleDbStorageVault API.
     */
    GetExascaleDbStorageVaultResponse getExascaleDbStorageVault(
            GetExascaleDbStorageVaultRequest request);

    /**
     * Gets information about the specified execution action.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExecutionActionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExecutionAction
     *     API.
     */
    GetExecutionActionResponse getExecutionAction(GetExecutionActionRequest request);

    /**
     * Gets information about the specified execution window.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExecutionWindowExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExecutionWindow
     *     API.
     */
    GetExecutionWindowResponse getExecutionWindow(GetExecutionWindowRequest request);

    /**
     * Gets information about the specified external backup job.
     *
     * <p>*Note:** This API is used by an Oracle Cloud Infrastructure Python script that is packaged
     * with the Oracle Cloud Infrastructure CLI. Oracle recommends that you use the script instead
     * using the API directly. See [Migrating an On-Premises Database to Oracle Cloud Infrastructure
     * by Creating a Backup in the
     * Cloud](https://docs.oracle.com/iaas/Content/Database/Tasks/mig-onprembackup.htm) for more
     * information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExternalBackupJobExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetExternalBackupJob API.
     */
    GetExternalBackupJobResponse getExternalBackupJob(GetExternalBackupJobRequest request);

    /**
     * Gets information about the specified external container database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExternalContainerDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetExternalContainerDatabase API.
     */
    GetExternalContainerDatabaseResponse getExternalContainerDatabase(
            GetExternalContainerDatabaseRequest request);

    /**
     * Gets information about the specified external database connector.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExternalDatabaseConnectorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetExternalDatabaseConnector API.
     */
    GetExternalDatabaseConnectorResponse getExternalDatabaseConnector(
            GetExternalDatabaseConnectorRequest request);

    /**
     * Gets information about a specific external non-container database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExternalNonContainerDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetExternalNonContainerDatabase API.
     */
    GetExternalNonContainerDatabaseResponse getExternalNonContainerDatabase(
            GetExternalNonContainerDatabaseRequest request);

    /**
     * Gets information about a specific {@link
     * #createExternalPluggableDatabaseDetails(CreateExternalPluggableDatabaseDetailsRequest)
     * createExternalPluggableDatabaseDetails} resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExternalPluggableDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetExternalPluggableDatabase API.
     */
    GetExternalPluggableDatabaseResponse getExternalPluggableDatabase(
            GetExternalPluggableDatabaseRequest request);

    /**
     * Gets details of the Exadata Infrastructure target system software versions that can be
     * applied to the specified infrastructure resource for maintenance updates. Applies to Exadata
     * Cloud@Customer and Exadata Cloud instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetInfrastructureTargetVersionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetInfrastructureTargetVersions API.
     */
    GetInfrastructureTargetVersionsResponse getInfrastructureTargetVersions(
            GetInfrastructureTargetVersionsRequest request);

    /**
     * Gets information about the specified key store.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetKeyStoreExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetKeyStore API.
     */
    GetKeyStoreResponse getKeyStore(GetKeyStoreRequest request);

    /**
     * Gets information about the specified maintenance run.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetMaintenanceRunExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetMaintenanceRun
     *     API.
     */
    GetMaintenanceRunResponse getMaintenanceRun(GetMaintenanceRunRequest request);

    /**
     * Gets information about the specified maintenance run history.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetMaintenanceRunHistoryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetMaintenanceRunHistory API.
     */
    GetMaintenanceRunHistoryResponse getMaintenanceRunHistory(
            GetMaintenanceRunHistoryRequest request);

    /**
     * Gets information about the specified one-off patch.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetOneoffPatchExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetOneoffPatch API.
     */
    GetOneoffPatchResponse getOneoffPatch(GetOneoffPatchRequest request);

    /**
     * Gets the details of operations performed to convert the specified database from non-container
     * (non-CDB) to pluggable (PDB).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetPdbConversionHistoryEntryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetPdbConversionHistoryEntry API.
     */
    GetPdbConversionHistoryEntryResponse getPdbConversionHistoryEntry(
            GetPdbConversionHistoryEntryRequest request);

    /**
     * Gets information about the specified pluggable database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetPluggableDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetPluggableDatabase API.
     */
    GetPluggableDatabaseResponse getPluggableDatabase(GetPluggableDatabaseRequest request);

    /**
     * Gets information about the specified Exadata Pluggable Database Snapshot in the specified
     * compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetPluggableDatabaseSnapshotExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetPluggableDatabaseSnapshot API.
     */
    GetPluggableDatabaseSnapshotResponse getPluggableDatabaseSnapshot(
            GetPluggableDatabaseSnapshotRequest request);

    /**
     * Gets information about the specified Scheduled Action.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetScheduledActionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetScheduledAction
     *     API.
     */
    GetScheduledActionResponse getScheduledAction(GetScheduledActionRequest request);

    /**
     * Gets information about the specified Scheduling Plan.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetSchedulingPlanExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSchedulingPlan
     *     API.
     */
    GetSchedulingPlanResponse getSchedulingPlan(GetSchedulingPlanRequest request);

    /**
     * Gets information about the specified Scheduling Policy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetSchedulingPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSchedulingPolicy
     *     API.
     */
    GetSchedulingPolicyResponse getSchedulingPolicy(GetSchedulingPolicyRequest request);

    /**
     * Gets information about the specified Scheduling Window.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetSchedulingWindowExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSchedulingWindow
     *     API.
     */
    GetSchedulingWindowResponse getSchedulingWindow(GetSchedulingWindowRequest request);

    /**
     * Gets information about the VM cluster. Applies to Exadata Cloud@Customer instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVmCluster API.
     */
    GetVmClusterResponse getVmCluster(GetVmClusterRequest request);

    /**
     * Gets information about the specified VM cluster network. Applies to Exadata Cloud@Customer
     * instances only. To get information about a cloud VM cluster in an Exadata Cloud Service
     * instance, use the {@link #getCloudVmCluster(GetCloudVmClusterRequest) getCloudVmCluster}
     * operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetVmClusterNetworkExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVmClusterNetwork
     *     API.
     */
    GetVmClusterNetworkResponse getVmClusterNetwork(GetVmClusterNetworkRequest request);

    /**
     * Gets information about a specified patch package.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetVmClusterPatchExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVmClusterPatch
     *     API.
     */
    GetVmClusterPatchResponse getVmClusterPatch(GetVmClusterPatchRequest request);

    /**
     * Gets the patch history details for the specified patch history entry.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetVmClusterPatchHistoryEntryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetVmClusterPatchHistoryEntry API.
     */
    GetVmClusterPatchHistoryEntryResponse getVmClusterPatchHistoryEntry(
            GetVmClusterPatchHistoryEntryRequest request);

    /**
     * Gets information about a specified maintenance update package for a VM cluster. Applies to
     * Exadata Cloud@Customer instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetVmClusterUpdateExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVmClusterUpdate
     *     API.
     */
    GetVmClusterUpdateResponse getVmClusterUpdate(GetVmClusterUpdateRequest request);

    /**
     * Gets the maintenance update history details for the specified update history entry. Applies
     * to Exadata Cloud@Customer instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetVmClusterUpdateHistoryEntryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetVmClusterUpdateHistoryEntry API.
     */
    GetVmClusterUpdateHistoryEntryResponse getVmClusterUpdateHistoryEntry(
            GetVmClusterUpdateHistoryEntryRequest request);

    /**
     * **Deprecated** To create a new Autonomous AI Database system on dedicated Exadata
     * Infrastructure, use the {@link
     * #createCloudExadataInfrastructure(CreateCloudExadataInfrastructureRequest)
     * createCloudExadataInfrastructure} and {@link
     * #createCloudAutonomousVmCluster(CreateCloudAutonomousVmClusterRequest)
     * createCloudAutonomousVmCluster} operations instead. Note that to create an Autonomous VM
     * cluster, you must have an existing Exadata Infrastructure resource to contain the VM cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/LaunchAutonomousExadataInfrastructureExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     LaunchAutonomousExadataInfrastructure API.
     */
    LaunchAutonomousExadataInfrastructureResponse launchAutonomousExadataInfrastructure(
            LaunchAutonomousExadataInfrastructureRequest request);

    /**
     * Creates a new DB system in the specified compartment and availability domain. The Oracle
     * Database edition that you specify applies to all the databases on that DB system. The
     * selected edition cannot be changed.
     *
     * <p>An initial database is created on the DB system based on the request parameters you
     * provide and some default options. For detailed information about default options, see [Bare
     * metal and virtual machine DB system default
     * options.](https://docs.oracle.com/iaas/Content/Database/Tasks/creatingDBsystem.htm#Default)
     *
     * <p>*Note:** Deprecated for Exadata Cloud Service systems. Use the [new resource model
     * APIs](https://docs.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model)
     * instead.
     *
     * <p>For Exadata Cloud Service instances, support for this API will end on May 15th, 2021. See
     * [Switching an Exadata DB System to the New Resource Model and
     * APIs](https://docs.oracle.com/iaas/Content/Database/Concepts/exaflexsystem_topic-resource_model_conversion.htm)
     * for details on converting existing Exadata DB systems to the new resource model.
     *
     * <p>Use the {@link #createCloudExadataInfrastructure(CreateCloudExadataInfrastructureRequest)
     * createCloudExadataInfrastructure} and {@link
     * #createCloudVmCluster(CreateCloudVmClusterRequest) createCloudVmCluster} APIs to provision a
     * new Exadata Cloud Service instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/LaunchDbSystemExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use LaunchDbSystem API.
     */
    LaunchDbSystemResponse launchDbSystem(LaunchDbSystemRequest request);

    /**
     * Gets a list of application virtual IP (VIP) addresses on a cloud VM cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListApplicationVipsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListApplicationVips
     *     API.
     */
    ListApplicationVipsResponse listApplicationVips(ListApplicationVipsRequest request);

    /**
     * Gets a list of Autonomous Container Database backups by using either the
     * 'autonomousDatabaseId' or 'compartmentId' as your query parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousContainerDatabaseBackupsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAutonomousContainerDatabaseBackups API.
     */
    ListAutonomousContainerDatabaseBackupsResponse listAutonomousContainerDatabaseBackups(
            ListAutonomousContainerDatabaseBackupsRequest request);

    /**
     * **Deprecated.** Use the {@link
     * #listAutonomousContainerDatabases(ListAutonomousContainerDatabasesRequest)
     * listAutonomousContainerDatabases} operation to get a list of the Autonomous Container
     * Databases (ACDs)with Autonomous Data Guard-enabled associated with the specified ACD.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousContainerDatabaseDataguardAssociationsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAutonomousContainerDatabaseDataguardAssociations API.
     */
    ListAutonomousContainerDatabaseDataguardAssociationsResponse
            listAutonomousContainerDatabaseDataguardAssociations(
                    ListAutonomousContainerDatabaseDataguardAssociationsRequest request);

    /**
     * Gets a list of supported Autonomous Container Database versions.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousContainerDatabaseVersionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAutonomousContainerDatabaseVersions API.
     */
    ListAutonomousContainerDatabaseVersionsResponse listAutonomousContainerDatabaseVersions(
            ListAutonomousContainerDatabaseVersionsRequest request);

    /**
     * Gets a list of the Autonomous Container Databases in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousContainerDatabasesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAutonomousContainerDatabases API.
     */
    ListAutonomousContainerDatabasesResponse listAutonomousContainerDatabases(
            ListAutonomousContainerDatabasesRequest request);

    /**
     * Gets a list of Autonomous AI Database backups based on either the `autonomousDatabaseId` or
     * `compartmentId` specified as a query parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousDatabaseBackupsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAutonomousDatabaseBackups API.
     */
    ListAutonomousDatabaseBackupsResponse listAutonomousDatabaseBackups(
            ListAutonomousDatabaseBackupsRequest request);

    /**
     * Gets a list of supported character sets.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousDatabaseCharacterSetsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAutonomousDatabaseCharacterSets API.
     */
    ListAutonomousDatabaseCharacterSetsResponse listAutonomousDatabaseCharacterSets(
            ListAutonomousDatabaseCharacterSetsRequest request);

    /**
     * Lists the Autonomous AI Database clones for the specified Autonomous AI Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousDatabaseClonesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAutonomousDatabaseClones API.
     */
    ListAutonomousDatabaseClonesResponse listAutonomousDatabaseClones(
            ListAutonomousDatabaseClonesRequest request);

    /**
     * *Deprecated.* Use the {@link
     * #getAutonomousContainerDatabase(GetAutonomousContainerDatabaseRequest)
     * getAutonomousContainerDatabase} operation to get a list of the Autonomous Data Guard-enabled
     * databases associated with the specified Autonomous AI Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousDatabaseDataguardAssociationsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAutonomousDatabaseDataguardAssociations API.
     */
    ListAutonomousDatabaseDataguardAssociationsResponse listAutonomousDatabaseDataguardAssociations(
            ListAutonomousDatabaseDataguardAssociationsRequest request);

    /**
     * Lists the Autonomous AI Database peers for the specified Autonomous AI Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousDatabasePeersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAutonomousDatabasePeers API.
     */
    ListAutonomousDatabasePeersResponse listAutonomousDatabasePeers(
            ListAutonomousDatabasePeersRequest request);

    /**
     * Lists the OCIDs of the Autonomous AI Database local and connected remote refreshable clones
     * with the region where they exist for the specified source database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousDatabaseRefreshableClonesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAutonomousDatabaseRefreshableClones API.
     */
    ListAutonomousDatabaseRefreshableClonesResponse listAutonomousDatabaseRefreshableClones(
            ListAutonomousDatabaseRefreshableClonesRequest request);

    /**
     * Gets a list of the Autonomous AI Database Software Images in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousDatabaseSoftwareImagesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAutonomousDatabaseSoftwareImages API.
     */
    ListAutonomousDatabaseSoftwareImagesResponse listAutonomousDatabaseSoftwareImages(
            ListAutonomousDatabaseSoftwareImagesRequest request);

    /**
     * Gets a list of Autonomous AI Databases based on the query parameters specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousDatabasesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAutonomousDatabases API.
     */
    ListAutonomousDatabasesResponse listAutonomousDatabases(ListAutonomousDatabasesRequest request);

    /**
     * Gets a list of supported Autonomous AI Database versions. Note that preview version software
     * is only available for Autonomous AI Database Serverless
     * (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) databases.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousDbPreviewVersionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAutonomousDbPreviewVersions API.
     */
    ListAutonomousDbPreviewVersionsResponse listAutonomousDbPreviewVersions(
            ListAutonomousDbPreviewVersionsRequest request);

    /**
     * Gets a list of supported Autonomous AI Database versions.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousDbVersionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAutonomousDbVersions API.
     */
    ListAutonomousDbVersionsResponse listAutonomousDbVersions(
            ListAutonomousDbVersionsRequest request);

    /**
     * **Deprecated.**
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousExadataInfrastructureShapesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAutonomousExadataInfrastructureShapes API.
     */
    ListAutonomousExadataInfrastructureShapesResponse listAutonomousExadataInfrastructureShapes(
            ListAutonomousExadataInfrastructureShapesRequest request);

    /**
     * **Deprecated.** Use the {@link
     * #listCloudExadataInfrastructures(ListCloudExadataInfrastructuresRequest)
     * listCloudExadataInfrastructures} operation to list Exadata Infrastructures in the Oracle
     * cloud and the {@link #listCloudAutonomousVmClusters(ListCloudAutonomousVmClustersRequest)
     * listCloudAutonomousVmClusters} operation to list Autonomous Exadata VM clusters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousExadataInfrastructuresExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAutonomousExadataInfrastructures API.
     */
    ListAutonomousExadataInfrastructuresResponse listAutonomousExadataInfrastructures(
            ListAutonomousExadataInfrastructuresRequest request);

    /**
     * Lists the Autonomous Virtual Machines in the specified Autonomous VM Cluster and Compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousVirtualMachinesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAutonomousVirtualMachines API.
     */
    ListAutonomousVirtualMachinesResponse listAutonomousVirtualMachines(
            ListAutonomousVirtualMachinesRequest request);

    /**
     * Gets the list of resource usage details for all the Autonomous Container Database in the
     * specified Autonomous Exadata VM cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousVmClusterAcdResourceUsageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAutonomousVmClusterAcdResourceUsage API.
     */
    ListAutonomousVmClusterAcdResourceUsageResponse listAutonomousVmClusterAcdResourceUsage(
            ListAutonomousVmClusterAcdResourceUsageRequest request);

    /**
     * Gets a list of Exadata Cloud@Customer Autonomous VM clusters in the specified compartment. To
     * list Autonomous VM Clusters in the Oracle Cloud, see {@link
     * #listCloudAutonomousVmClusters(ListCloudAutonomousVmClustersRequest)
     * listCloudAutonomousVmClusters}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousVmClustersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAutonomousVmClusters API.
     */
    ListAutonomousVmClustersResponse listAutonomousVmClusters(
            ListAutonomousVmClustersRequest request);

    /**
     * Gets a list of backup destinations in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListBackupDestinationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListBackupDestination API.
     */
    ListBackupDestinationResponse listBackupDestination(ListBackupDestinationRequest request);

    /**
     * Gets a list of backups based on the `databaseId` or `compartmentId` specified. Either one of
     * these query parameters must be provided.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListBackupsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListBackups API.
     */
    ListBackupsResponse listBackups(ListBackupsRequest request);

    /**
     * Gets the list of resource usage details for all the Cloud Autonomous Container Database in
     * the specified Cloud Autonomous Exadata VM cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListCloudAutonomousVmClusterAcdResourceUsageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListCloudAutonomousVmClusterAcdResourceUsage API.
     */
    ListCloudAutonomousVmClusterAcdResourceUsageResponse
            listCloudAutonomousVmClusterAcdResourceUsage(
                    ListCloudAutonomousVmClusterAcdResourceUsageRequest request);

    /**
     * Lists Autonomous Exadata VM clusters in the Oracle cloud. For Exadata Cloud@Customer systems,
     * see {@link #listAutonomousVmClusters(ListAutonomousVmClustersRequest)
     * listAutonomousVmClusters}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListCloudAutonomousVmClustersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListCloudAutonomousVmClusters API.
     */
    ListCloudAutonomousVmClustersResponse listCloudAutonomousVmClusters(
            ListCloudAutonomousVmClustersRequest request);

    /**
     * Gets a list of the cloud Exadata infrastructure resources in the specified compartment.
     * Applies to Exadata Cloud Service instances and Autonomous AI Database on dedicated Exadata
     * infrastructure only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListCloudExadataInfrastructuresExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListCloudExadataInfrastructures API.
     */
    ListCloudExadataInfrastructuresResponse listCloudExadataInfrastructures(
            ListCloudExadataInfrastructuresRequest request);

    /**
     * Gets the history of the maintenance update actions performed on the specified cloud VM
     * cluster. Applies to Exadata Cloud Service instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListCloudVmClusterUpdateHistoryEntriesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListCloudVmClusterUpdateHistoryEntries API.
     */
    ListCloudVmClusterUpdateHistoryEntriesResponse listCloudVmClusterUpdateHistoryEntries(
            ListCloudVmClusterUpdateHistoryEntriesRequest request);

    /**
     * Lists the maintenance updates that can be applied to the specified cloud VM cluster. Applies
     * to Exadata Cloud Service instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListCloudVmClusterUpdatesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListCloudVmClusterUpdates API.
     */
    ListCloudVmClusterUpdatesResponse listCloudVmClusterUpdates(
            ListCloudVmClusterUpdatesRequest request);

    /**
     * Gets a list of the cloud VM clusters in the specified compartment. Applies to Exadata Cloud
     * Service instances and Autonomous Database on dedicated Exadata infrastructure only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListCloudVmClustersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListCloudVmClusters
     *     API.
     */
    ListCloudVmClustersResponse listCloudVmClusters(ListCloudVmClustersRequest request);

    /**
     * Lists the console connections for the specified database node.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListConsoleConnectionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListConsoleConnections API.
     */
    ListConsoleConnectionsResponse listConsoleConnections(ListConsoleConnectionsRequest request);

    /**
     * Lists the console histories for the specified database node.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListConsoleHistoriesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListConsoleHistories API.
     */
    ListConsoleHistoriesResponse listConsoleHistories(ListConsoleHistoriesRequest request);

    /**
     * Lists the patches applicable to the requested container database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListContainerDatabasePatchesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListContainerDatabasePatches API.
     */
    ListContainerDatabasePatchesResponse listContainerDatabasePatches(
            ListContainerDatabasePatchesRequest request);

    /**
     * Lists all Data Guard associations for the specified database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDataGuardAssociationsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDataGuardAssociations API.
     */
    ListDataGuardAssociationsResponse listDataGuardAssociations(
            ListDataGuardAssociationsRequest request);

    /**
     * Gets a list of the database software images in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDatabaseSoftwareImagesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDatabaseSoftwareImages API.
     */
    ListDatabaseSoftwareImagesResponse listDatabaseSoftwareImages(
            ListDatabaseSoftwareImagesRequest request);

    /**
     * Gets the upgrade history for a specified database in a bare metal or virtual machine DB
     * system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDatabaseUpgradeHistoryEntriesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDatabaseUpgradeHistoryEntries API.
     */
    ListDatabaseUpgradeHistoryEntriesResponse listDatabaseUpgradeHistoryEntries(
            ListDatabaseUpgradeHistoryEntriesRequest request);

    /**
     * Gets a list of the databases in the specified Database Home.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDatabasesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDatabases API.
     */
    ListDatabasesResponse listDatabases(ListDatabasesRequest request);

    /**
     * Lists the history of patch operations on the specified Database Home.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbHomePatchHistoryEntriesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDbHomePatchHistoryEntries API.
     */
    ListDbHomePatchHistoryEntriesResponse listDbHomePatchHistoryEntries(
            ListDbHomePatchHistoryEntriesRequest request);

    /**
     * Lists patches applicable to the requested Database Home.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbHomePatchesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDbHomePatches
     *     API.
     */
    ListDbHomePatchesResponse listDbHomePatches(ListDbHomePatchesRequest request);

    /**
     * Lists the Database Homes in the specified DB system and compartment. A Database Home is a
     * directory where Oracle Database software is installed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbHomesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDbHomes API.
     */
    ListDbHomesResponse listDbHomes(ListDbHomesRequest request);

    /**
     * Lists the database nodes in the specified DB system and compartment. In addition to the other
     * required parameters, either '--db-system-id' or '--vm-cluster-id' also must be provided,
     * depending on the service being accessed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbNodesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDbNodes API.
     */
    ListDbNodesResponse listDbNodes(ListDbNodesRequest request);

    /**
     * Lists the Exadata DB servers in the ExadataInfrastructureId and specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbServersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDbServers API.
     */
    ListDbServersResponse listDbServers(ListDbServersRequest request);

    /**
     * Gets a list of expected compute performance parameters for a virtual machine DB system based
     * on system configuration.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbSystemComputePerformancesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDbSystemComputePerformances API.
     */
    ListDbSystemComputePerformancesResponse listDbSystemComputePerformances(
            ListDbSystemComputePerformancesRequest request);

    /**
     * Gets the history of the patch actions performed on the specified DB system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbSystemPatchHistoryEntriesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDbSystemPatchHistoryEntries API.
     */
    ListDbSystemPatchHistoryEntriesResponse listDbSystemPatchHistoryEntries(
            ListDbSystemPatchHistoryEntriesRequest request);

    /**
     * Lists the patches applicable to the specified DB system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbSystemPatchesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDbSystemPatches
     *     API.
     */
    ListDbSystemPatchesResponse listDbSystemPatches(ListDbSystemPatchesRequest request);

    /**
     * Gets a list of the shapes that can be used to launch a new DB system. The shape determines
     * resources to allocate to the DB system - CPU cores and memory for VM shapes; CPU cores,
     * memory and storage for non-VM (or bare metal) shapes.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbSystemShapesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDbSystemShapes
     *     API.
     */
    ListDbSystemShapesResponse listDbSystemShapes(ListDbSystemShapesRequest request);

    /**
     * Gets a list of possible expected storage performance parameters of a VMDB System based on
     * Configuration.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbSystemStoragePerformancesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDbSystemStoragePerformances API.
     */
    ListDbSystemStoragePerformancesResponse listDbSystemStoragePerformances(
            ListDbSystemStoragePerformancesRequest request);

    /**
     * Gets the history of the upgrade actions performed on the specified DB system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbSystemUpgradeHistoryEntriesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDbSystemUpgradeHistoryEntries API.
     */
    ListDbSystemUpgradeHistoryEntriesResponse listDbSystemUpgradeHistoryEntries(
            ListDbSystemUpgradeHistoryEntriesRequest request);

    /**
     * Lists the applicable upgrade components for a DB systems.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbSystemUpgradesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDbSystemUpgrades API.
     */
    ListDbSystemUpgradesResponse listDbSystemUpgrades(ListDbSystemUpgradesRequest request);

    /**
     * Lists the DB systems in the specified compartment. You can specify a `backupId` to list only
     * the DB systems that support creating a database using this backup in this compartment.
     *
     * <p>*Note:** Deprecated for Exadata Cloud Service systems. Use the [new resource model
     * APIs](https://docs.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model)
     * instead.
     *
     * <p>For Exadata Cloud Service instances, support for this API will end on May 15th, 2021. See
     * [Switching an Exadata DB System to the New Resource Model and
     * APIs](https://docs.oracle.com/iaas/Content/Database/Concepts/exaflexsystem_topic-resource_model_conversion.htm)
     * for details on converting existing Exadata DB systems to the new resource model.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbSystemsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDbSystems API.
     */
    ListDbSystemsResponse listDbSystems(ListDbSystemsRequest request);

    /**
     * Gets a list of supported Oracle Database versions.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbVersionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDbVersions API.
     */
    ListDbVersionsResponse listDbVersions(ListDbVersionsRequest request);

    /**
     * Gets a list of the Exadata Database Node Snapshots in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbnodeSnapshotsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDbnodeSnapshots
     *     API.
     */
    ListDbnodeSnapshotsResponse listDbnodeSnapshots(ListDbnodeSnapshotsRequest request);

    /**
     * Lists the Exadata infrastructure resources in the specified compartment. Applies to Exadata
     * Cloud@Customer instances only. To list the Exadata Cloud Service infrastructure resources in
     * a compartment, use the {@link
     * #listCloudExadataInfrastructures(ListCloudExadataInfrastructuresRequest)
     * listCloudExadataInfrastructures} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListExadataInfrastructuresExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListExadataInfrastructures API.
     */
    ListExadataInfrastructuresResponse listExadataInfrastructures(
            ListExadataInfrastructuresRequest request);

    /**
     * Gets the history of the maintenance update actions performed on the specified Exadata VM
     * cluster on Exascale Infrastructure.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListExadbVmClusterUpdateHistoryEntriesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListExadbVmClusterUpdateHistoryEntries API.
     */
    ListExadbVmClusterUpdateHistoryEntriesResponse listExadbVmClusterUpdateHistoryEntries(
            ListExadbVmClusterUpdateHistoryEntriesRequest request);

    /**
     * Lists the maintenance updates that can be applied to the specified Exadata VM cluster on
     * Exascale Infrastructure.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListExadbVmClusterUpdatesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListExadbVmClusterUpdates API.
     */
    ListExadbVmClusterUpdatesResponse listExadbVmClusterUpdates(
            ListExadbVmClusterUpdatesRequest request);

    /**
     * Gets a list of the Exadata VM clusters on Exascale Infrastructure in the specified
     * compartment. Applies to Exadata Database Service on Exascale Infrastructure only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListExadbVmClustersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExadbVmClusters
     *     API.
     */
    ListExadbVmClustersResponse listExadbVmClusters(ListExadbVmClustersRequest request);

    /**
     * Gets a list of the Exadata Database Storage Vaults in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListExascaleDbStorageVaultsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListExascaleDbStorageVaults API.
     */
    ListExascaleDbStorageVaultsResponse listExascaleDbStorageVaults(
            ListExascaleDbStorageVaultsRequest request);

    /**
     * Lists the execution action resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListExecutionActionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListExecutionActions API.
     */
    ListExecutionActionsResponse listExecutionActions(ListExecutionActionsRequest request);

    /**
     * Lists the execution window resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListExecutionWindowsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListExecutionWindows API.
     */
    ListExecutionWindowsResponse listExecutionWindows(ListExecutionWindowsRequest request);

    /**
     * Gets a list of the external container databases in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListExternalContainerDatabasesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListExternalContainerDatabases API.
     */
    ListExternalContainerDatabasesResponse listExternalContainerDatabases(
            ListExternalContainerDatabasesRequest request);

    /**
     * Gets a list of the external database connectors in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListExternalDatabaseConnectorsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListExternalDatabaseConnectors API.
     */
    ListExternalDatabaseConnectorsResponse listExternalDatabaseConnectors(
            ListExternalDatabaseConnectorsRequest request);

    /**
     * Gets a list of the ExternalNonContainerDatabases in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListExternalNonContainerDatabasesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListExternalNonContainerDatabases API.
     */
    ListExternalNonContainerDatabasesResponse listExternalNonContainerDatabases(
            ListExternalNonContainerDatabasesRequest request);

    /**
     * Gets a list of the {@link
     * #createExternalPluggableDatabaseDetails(CreateExternalPluggableDatabaseDetailsRequest)
     * createExternalPluggableDatabaseDetails} resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListExternalPluggableDatabasesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListExternalPluggableDatabases API.
     */
    ListExternalPluggableDatabasesResponse listExternalPluggableDatabases(
            ListExternalPluggableDatabasesRequest request);

    /**
     * Gets a list of the flex components that can be used to launch a new DB system. The flex
     * component determines resources to allocate to the DB system - Database Servers and Storage
     * Servers.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListFlexComponentsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListFlexComponents
     *     API.
     */
    ListFlexComponentsResponse listFlexComponents(ListFlexComponentsRequest request);

    /**
     * Gets a list of supported Oracle Grid Infrastructure minor versions for the given major
     * version and shape family.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListGiVersionMinorVersionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListGiVersionMinorVersions API.
     */
    ListGiVersionMinorVersionsResponse listGiVersionMinorVersions(
            ListGiVersionMinorVersionsRequest request);

    /**
     * Gets a list of supported GI versions.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListGiVersionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListGiVersions API.
     */
    ListGiVersionsResponse listGiVersions(ListGiVersionsRequest request);

    /**
     * Gets a list of key stores in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListKeyStoresExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListKeyStores API.
     */
    ListKeyStoresResponse listKeyStores(ListKeyStoresRequest request);

    /**
     * Gets a list of the maintenance run histories in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListMaintenanceRunHistoryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListMaintenanceRunHistory API.
     */
    ListMaintenanceRunHistoryResponse listMaintenanceRunHistory(
            ListMaintenanceRunHistoryRequest request);

    /**
     * Gets a list of the maintenance runs in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListMaintenanceRunsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMaintenanceRuns
     *     API.
     */
    ListMaintenanceRunsResponse listMaintenanceRuns(ListMaintenanceRunsRequest request);

    /**
     * Lists one-off patches in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListOneoffPatchesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListOneoffPatches
     *     API.
     */
    ListOneoffPatchesResponse listOneoffPatches(ListOneoffPatchesRequest request);

    /**
     * List all the action params and their possible values for a given action type
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListParamsForActionTypeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListParamsForActionType API.
     */
    ListParamsForActionTypeResponse listParamsForActionType(ListParamsForActionTypeRequest request);

    /**
     * Gets the pluggable database conversion history for a specified database in a bare metal or
     * virtual machine DB system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListPdbConversionHistoryEntriesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListPdbConversionHistoryEntries API.
     */
    ListPdbConversionHistoryEntriesResponse listPdbConversionHistoryEntries(
            ListPdbConversionHistoryEntriesRequest request);

    /**
     * Gets a list of the Exadata Pluggable Database Snapshots in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListPluggableDatabaseSnapshotsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListPluggableDatabaseSnapshots API.
     */
    ListPluggableDatabaseSnapshotsResponse listPluggableDatabaseSnapshots(
            ListPluggableDatabaseSnapshotsRequest request);

    /**
     * Gets a list of the pluggable databases in a database or compartment. You must provide either
     * a `databaseId` or `compartmentId` value.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListPluggableDatabasesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListPluggableDatabases API.
     */
    ListPluggableDatabasesResponse listPluggableDatabases(ListPluggableDatabasesRequest request);

    /**
     * Returns a recommended Scheduled Actions configuration for a given resource, plan intent and
     * scheduling policy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListRecommendedScheduledActionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListRecommendedScheduledActions API.
     */
    ListRecommendedScheduledActionsResponse listRecommendedScheduledActions(
            ListRecommendedScheduledActionsRequest request);

    /**
     * Lists the OCIDs of the Autonomous AI Database resource pool members for the specified
     * Autonomous AI Database leader.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListResourcePoolMembersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListResourcePoolMembers API.
     */
    ListResourcePoolMembersResponse listResourcePoolMembers(ListResourcePoolMembersRequest request);

    /**
     * Lists the Scheduled Action resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListScheduledActionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListScheduledActions API.
     */
    ListScheduledActionsResponse listScheduledActions(ListScheduledActionsRequest request);

    /**
     * Lists the Scheduling Plan resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListSchedulingPlansExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSchedulingPlans
     *     API.
     */
    ListSchedulingPlansResponse listSchedulingPlans(ListSchedulingPlansRequest request);

    /**
     * Lists the Scheduling Policy resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListSchedulingPoliciesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListSchedulingPolicies API.
     */
    ListSchedulingPoliciesResponse listSchedulingPolicies(ListSchedulingPoliciesRequest request);

    /**
     * Lists the Scheduling Window resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListSchedulingWindowsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListSchedulingWindows API.
     */
    ListSchedulingWindowsResponse listSchedulingWindows(ListSchedulingWindowsRequest request);

    /**
     * Retrieves a list of supported minor versions for the specified Exadata System Software major
     * version. You must provide either a `shape` or `resourceId` value.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListSystemVersionMinorVersionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListSystemVersionMinorVersions API.
     */
    ListSystemVersionMinorVersionsResponse listSystemVersionMinorVersions(
            ListSystemVersionMinorVersionsRequest request);

    /**
     * Gets a list of supported Exadata system versions for a given shape and GI version.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListSystemVersionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSystemVersions
     *     API.
     */
    ListSystemVersionsResponse listSystemVersions(ListSystemVersionsRequest request);

    /**
     * Gets a list of the VM cluster networks in the specified compartment. Applies to Exadata
     * Cloud@Customer instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListVmClusterNetworksExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListVmClusterNetworks API.
     */
    ListVmClusterNetworksResponse listVmClusterNetworks(ListVmClusterNetworksRequest request);

    /**
     * Gets the history of the patch actions performed on the specified VM cluster in an Exadata
     * Cloud@Customer system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListVmClusterPatchHistoryEntriesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListVmClusterPatchHistoryEntries API.
     */
    ListVmClusterPatchHistoryEntriesResponse listVmClusterPatchHistoryEntries(
            ListVmClusterPatchHistoryEntriesRequest request);

    /**
     * Lists the patches applicable to the specified VM cluster in an Exadata Cloud@Customer system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListVmClusterPatchesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListVmClusterPatches API.
     */
    ListVmClusterPatchesResponse listVmClusterPatches(ListVmClusterPatchesRequest request);

    /**
     * Gets the history of the maintenance update actions performed on the specified VM cluster.
     * Applies to Exadata Cloud@Customer instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListVmClusterUpdateHistoryEntriesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListVmClusterUpdateHistoryEntries API.
     */
    ListVmClusterUpdateHistoryEntriesResponse listVmClusterUpdateHistoryEntries(
            ListVmClusterUpdateHistoryEntriesRequest request);

    /**
     * Lists the maintenance updates that can be applied to the specified VM cluster. Applies to
     * Exadata Cloud@Customer instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListVmClusterUpdatesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListVmClusterUpdates API.
     */
    ListVmClusterUpdatesResponse listVmClusterUpdates(ListVmClusterUpdatesRequest request);

    /**
     * Lists the VM clusters in the specified compartment. Applies to Exadata Cloud@Customer
     * instances only. To list the cloud VM clusters in an Exadata Cloud Service instance, use the
     * {@link #listCloudVmClusters(ListCloudVmClustersRequest) listCloudVmClusters} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListVmClustersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListVmClusters API.
     */
    ListVmClustersResponse listVmClusters(ListVmClustersRequest request);

    /**
     * **Deprecated.** Use {@link #createPluggableDatabase(CreatePluggableDatabaseRequest)
     * createPluggableDatabase} for Pluggable Database LocalClone Operation. Clones and starts a
     * pluggable database (PDB) in the same database (CDB) as the source PDB. The source PDB must be
     * in the `READ_WRITE` openMode to perform the clone operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/LocalClonePluggableDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     LocalClonePluggableDatabase API.
     */
    LocalClonePluggableDatabaseResponse localClonePluggableDatabase(
            LocalClonePluggableDatabaseRequest request);

    /**
     * Migrate Autonomous Container Database, identified by the autonomousContainerDatabaseId
     * parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/MigrateAutonomousContainerDatabaseDataguardAssociationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     MigrateAutonomousContainerDatabaseDataguardAssociation API.
     */
    MigrateAutonomousContainerDatabaseDataguardAssociationResponse
            migrateAutonomousContainerDatabaseDataguardAssociation(
                    MigrateAutonomousContainerDatabaseDataguardAssociationRequest request);

    /**
     * Migrates the existing Data Guard association to new Data Guard model to support multiple
     * standby databases functionality.
     *
     * <p>This operation should always be performed on primary.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/MigrateDataGuardAssociationToMultiDataGuardsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     MigrateDataGuardAssociationToMultiDataGuards API.
     */
    MigrateDataGuardAssociationToMultiDataGuardsResponse
            migrateDataGuardAssociationToMultiDataGuards(
                    MigrateDataGuardAssociationToMultiDataGuardsRequest request);

    /**
     * Migrates the Exadata DB system to the new [Exadata resource
     * model](https://docs.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model).
     * All related resources will be migrated.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/MigrateExadataDbSystemResourceModelExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     MigrateExadataDbSystemResourceModel API.
     */
    MigrateExadataDbSystemResourceModelResponse migrateExadataDbSystemResourceModel(
            MigrateExadataDbSystemResourceModelRequest request);

    /**
     * Changes encryption key management from customer-managed, using the [Vault
     * service](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm), to
     * Oracle-managed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/MigrateVaultKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use MigrateVaultKey
     *     API.
     */
    MigrateVaultKeyResponse migrateVaultKey(MigrateVaultKeyRequest request);

    /**
     * Updates one or more attributes of the Database Management service for the database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ModifyDatabaseManagementExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ModifyDatabaseManagement API.
     */
    ModifyDatabaseManagementResponse modifyDatabaseManagement(
            ModifyDatabaseManagementRequest request);

    /**
     * Updates one or more attributes of the Database Management service for the pluggable database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ModifyPluggableDatabaseManagementExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ModifyPluggableDatabaseManagement API.
     */
    ModifyPluggableDatabaseManagementResponse modifyPluggableDatabaseManagement(
            ModifyPluggableDatabaseManagementRequest request);

    /**
     * Mounts the snapshot for the provided dbNode.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/MountDbnodeSnapshotExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use MountDbnodeSnapshot
     *     API.
     */
    MountDbnodeSnapshotResponse mountDbnodeSnapshot(MountDbnodeSnapshotRequest request);

    /**
     * Moves an execution action member to this execution action resource from another.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/MoveExecutionActionMemberExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     MoveExecutionActionMember API.
     */
    MoveExecutionActionMemberResponse moveExecutionActionMember(
            MoveExecutionActionMemberRequest request);

    /**
     * Refreshes a pluggable database (PDB) Refreshable clone.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RefreshPluggableDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RefreshPluggableDatabase API.
     */
    RefreshPluggableDatabaseResponse refreshPluggableDatabase(
            RefreshPluggableDatabaseRequest request);

    /**
     * Asynchronously registers this Autonomous AI Database with Data Safe.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RegisterAutonomousDatabaseDataSafeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RegisterAutonomousDatabaseDataSafe API.
     */
    RegisterAutonomousDatabaseDataSafeResponse registerAutonomousDatabaseDataSafe(
            RegisterAutonomousDatabaseDataSafeRequest request);

    /**
     * Install the PKCS11 driver for given keystore type
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RegisterCloudVmClusterPkcsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RegisterCloudVmClusterPkcs API.
     */
    RegisterCloudVmClusterPkcsResponse registerCloudVmClusterPkcs(
            RegisterCloudVmClusterPkcsRequest request);

    /**
     * Reinstates a disabled standby Autonomous Container Database (ACD), identified by the
     * autonomousContainerDatabaseId parameter to an active standby ACD. For more information, see
     * [Reinstate the Disabled Standby in an Autonomous Data Guard
     * Configuration](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbcl/index.html#ADBCL-GUID-B5C6A90D-72E3-4F32-988D-8AECC0A2D947).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ReinstateAutonomousContainerDatabaseDataguardExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ReinstateAutonomousContainerDatabaseDataguard API.
     */
    ReinstateAutonomousContainerDatabaseDataguardResponse
            reinstateAutonomousContainerDatabaseDataguard(
                    ReinstateAutonomousContainerDatabaseDataguardRequest request);

    /**
     * **Deprecated.** Use the {@link
     * #reinstateAutonomousContainerDatabaseDataguard(ReinstateAutonomousContainerDatabaseDataguardRequest)
     * reinstateAutonomousContainerDatabaseDataguard} operation to reinstate a disabled standby
     * Autonomous Container Database (ACD), identified by the autonomousContainerDatabaseId
     * parameter, to an active standby ACD.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ReinstateAutonomousContainerDatabaseDataguardAssociationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ReinstateAutonomousContainerDatabaseDataguardAssociation API.
     */
    ReinstateAutonomousContainerDatabaseDataguardAssociationResponse
            reinstateAutonomousContainerDatabaseDataguardAssociation(
                    ReinstateAutonomousContainerDatabaseDataguardAssociationRequest request);

    /**
     * Reinstates the database identified by the `databaseId` parameter into the standby role in a
     * Data Guard association.
     *
     * <p>This operation should be performed on disabled standby database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ReinstateDataGuardExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ReinstateDataGuard
     *     API.
     */
    ReinstateDataGuardResponse reinstateDataGuard(ReinstateDataGuardRequest request);

    /**
     * Reinstates the database identified by the `databaseId` parameter into the standby role in a
     * Data Guard association.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ReinstateDataGuardAssociationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ReinstateDataGuardAssociation API.
     */
    ReinstateDataGuardAssociationResponse reinstateDataGuardAssociation(
            ReinstateDataGuardAssociationRequest request);

    /**
     * **Deprecated.** Use {@link #createPluggableDatabase(CreatePluggableDatabaseRequest)
     * createPluggableDatabase} for Pluggable Database RemoteClone Operation. Clones a pluggable
     * database (PDB) to a different database from the source PDB. The cloned PDB will be started
     * upon completion of the clone operation. The source PDB must be in the `READ_WRITE` openMode
     * when performing the clone. For Exadata Cloud@Customer instances, the source pluggable
     * database (PDB) must be on the same Exadata Infrastructure as the target container database
     * (CDB) to create a remote clone.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RemoteClonePluggableDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemoteClonePluggableDatabase API.
     */
    RemoteClonePluggableDatabaseResponse remoteClonePluggableDatabase(
            RemoteClonePluggableDatabaseRequest request);

    /**
     * Remove Virtual Machines from the Cloud VM cluster. Applies to Exadata Cloud instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RemoveVirtualMachineFromCloudVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemoveVirtualMachineFromCloudVmCluster API.
     */
    RemoveVirtualMachineFromCloudVmClusterResponse removeVirtualMachineFromCloudVmCluster(
            RemoveVirtualMachineFromCloudVmClusterRequest request);

    /**
     * Remove Virtual Machines from the Exadata VM cluster on Exascale Infrastructure. Applies to
     * Exadata Cloud instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RemoveVirtualMachineFromExadbVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemoveVirtualMachineFromExadbVmCluster API.
     */
    RemoveVirtualMachineFromExadbVmClusterResponse removeVirtualMachineFromExadbVmCluster(
            RemoveVirtualMachineFromExadbVmClusterRequest request);

    /**
     * Remove Virtual Machines from the VM cluster. Applies to Exadata Cloud@Customer instances
     * only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RemoveVirtualMachineFromVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemoveVirtualMachineFromVmCluster API.
     */
    RemoveVirtualMachineFromVmClusterResponse removeVirtualMachineFromVmCluster(
            RemoveVirtualMachineFromVmClusterRequest request);

    /**
     * Reorders the execution actions under this execution window resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ReorderExecutionActionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ReorderExecutionActions API.
     */
    ReorderExecutionActionsResponse reorderExecutionActions(ReorderExecutionActionsRequest request);

    /**
     * Re-order the scheduled actions under this scheduling plan resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ReorderScheduledActionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ReorderScheduledActions API.
     */
    ReorderScheduledActionsResponse reorderScheduledActions(ReorderScheduledActionsRequest request);

    /**
     * Adds or removes Db server network nodes to extend or shrink the existing VM cluster network.
     * Applies to Exadata Cloud@Customer instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ResizeVmClusterNetworkExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ResizeVmClusterNetwork API.
     */
    ResizeVmClusterNetworkResponse resizeVmClusterNetwork(ResizeVmClusterNetworkRequest request);

    /**
     * Lists available resource pools shapes.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ResourcePoolShapesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ResourcePoolShapes
     *     API.
     */
    ResourcePoolShapesResponse resourcePoolShapes(ResourcePoolShapesRequest request);

    /**
     * Rolling restarts the specified Autonomous Container Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RestartAutonomousContainerDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RestartAutonomousContainerDatabase API.
     */
    RestartAutonomousContainerDatabaseResponse restartAutonomousContainerDatabase(
            RestartAutonomousContainerDatabaseRequest request);

    /**
     * Restarts the specified Autonomous AI Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RestartAutonomousDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RestartAutonomousDatabase API.
     */
    RestartAutonomousDatabaseResponse restartAutonomousDatabase(
            RestartAutonomousDatabaseRequest request);

    /**
     * Restores an Autonomous AI Database based on the provided request parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RestoreAutonomousDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RestoreAutonomousDatabase API.
     */
    RestoreAutonomousDatabaseResponse restoreAutonomousDatabase(
            RestoreAutonomousDatabaseRequest request);

    /**
     * Restore a Database based on the request parameters you provide.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RestoreDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use RestoreDatabase
     *     API.
     */
    RestoreDatabaseResponse restoreDatabase(RestoreDatabaseRequest request);

    /**
     * Creates a new version of an existing [Vault
     * service](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RotateAutonomousContainerDatabaseEncryptionKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RotateAutonomousContainerDatabaseEncryptionKey API.
     */
    RotateAutonomousContainerDatabaseEncryptionKeyResponse
            rotateAutonomousContainerDatabaseEncryptionKey(
                    RotateAutonomousContainerDatabaseEncryptionKeyRequest request);

    /**
     * Rotate existing AutonomousDatabase [Vault
     * service](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RotateAutonomousDatabaseEncryptionKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RotateAutonomousDatabaseEncryptionKey API.
     */
    RotateAutonomousDatabaseEncryptionKeyResponse rotateAutonomousDatabaseEncryptionKey(
            RotateAutonomousDatabaseEncryptionKeyRequest request);

    /**
     * Rotates the Oracle REST Data Services (ORDS) certificates for Autonomous Exadata VM cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RotateAutonomousVmClusterOrdsCertsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RotateAutonomousVmClusterOrdsCerts API.
     */
    RotateAutonomousVmClusterOrdsCertsResponse rotateAutonomousVmClusterOrdsCerts(
            RotateAutonomousVmClusterOrdsCertsRequest request);

    /**
     * Rotates the SSL certificates for Autonomous Exadata VM cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RotateAutonomousVmClusterSslCertsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RotateAutonomousVmClusterSslCerts API.
     */
    RotateAutonomousVmClusterSslCertsResponse rotateAutonomousVmClusterSslCerts(
            RotateAutonomousVmClusterSslCertsRequest request);

    /**
     * Rotates the Oracle REST Data Services (ORDS) certificates for a cloud Autonomous Exadata VM
     * cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RotateCloudAutonomousVmClusterOrdsCertsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RotateCloudAutonomousVmClusterOrdsCerts API.
     */
    RotateCloudAutonomousVmClusterOrdsCertsResponse rotateCloudAutonomousVmClusterOrdsCerts(
            RotateCloudAutonomousVmClusterOrdsCertsRequest request);

    /**
     * Rotates the SSL certficates for a cloud Autonomous Exadata VM cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RotateCloudAutonomousVmClusterSslCertsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RotateCloudAutonomousVmClusterSslCerts API.
     */
    RotateCloudAutonomousVmClusterSslCertsResponse rotateCloudAutonomousVmClusterSslCerts(
            RotateCloudAutonomousVmClusterSslCertsRequest request);

    /**
     * **Deprecated.** Use the {@link
     * #rotateCloudAutonomousVmClusterOrdsCerts(RotateCloudAutonomousVmClusterOrdsCertsRequest)
     * rotateCloudAutonomousVmClusterOrdsCerts} to rotate Oracle REST Data Services (ORDS) certs for
     * an Autonomous Exadata VM cluster instead.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RotateOrdsCertsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use RotateOrdsCerts
     *     API.
     */
    RotateOrdsCertsResponse rotateOrdsCerts(RotateOrdsCertsRequest request);

    /**
     * Create a new version of the existing encryption key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RotatePluggableDatabaseEncryptionKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RotatePluggableDatabaseEncryptionKey API.
     */
    RotatePluggableDatabaseEncryptionKeyResponse rotatePluggableDatabaseEncryptionKey(
            RotatePluggableDatabaseEncryptionKeyRequest request);

    /**
     * **Deprecated.** Use the {@link
     * #rotateCloudAutonomousVmClusterSslCerts(RotateCloudAutonomousVmClusterSslCertsRequest)
     * rotateCloudAutonomousVmClusterSslCerts} to rotate SSL certs for an Autonomous Exadata VM
     * cluster instead.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RotateSslCertsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use RotateSslCerts API.
     */
    RotateSslCertsResponse rotateSslCerts(RotateSslCertsRequest request);

    /**
     * Creates a new version of an existing [Vault
     * service](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RotateVaultKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use RotateVaultKey API.
     */
    RotateVaultKeyResponse rotateVaultKey(RotateVaultKeyRequest request);

    /**
     * This operation gets SaaS administrative user status of the Autonomous AI Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/SaasAdminUserStatusExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use SaasAdminUserStatus
     *     API.
     */
    SaasAdminUserStatusResponse saasAdminUserStatus(SaasAdminUserStatusRequest request);

    /**
     * Scans for pluggable databases in the specified external container database. This operation
     * will return un-registered pluggable databases in the {@link
     * #getWorkRequest(GetWorkRequestRequest) getWorkRequest} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ScanExternalContainerDatabasePluggableDatabasesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ScanExternalContainerDatabasePluggableDatabases API.
     */
    ScanExternalContainerDatabasePluggableDatabasesResponse
            scanExternalContainerDatabasePluggableDatabases(
                    ScanExternalContainerDatabasePluggableDatabasesRequest request);

    /**
     * Sets a new version of an existing [Vault
     * service](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/SetDbKeyVersionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use SetDbKeyVersion
     *     API.
     */
    SetDbKeyVersionResponse setDbKeyVersion(SetDbKeyVersionRequest request);

    /**
     * Sets a new version of an existing [Vault
     * service](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/SetPdbKeyVersionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use SetPdbKeyVersion
     *     API.
     */
    SetPdbKeyVersionResponse setPdbKeyVersion(SetPdbKeyVersionRequest request);

    /**
     * This operation shrinks the current allocated storage down to the current actual used data
     * storage (actualUsedDataStorageSizeInTBs). The if the base storage value for the database
     * (dataStorageSizeInTBs) is larger than the actualUsedDataStorageSizeInTBs value, you are
     * billed for the base storage value.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ShrinkAutonomousDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ShrinkAutonomousDatabase API.
     */
    ShrinkAutonomousDatabaseResponse shrinkAutonomousDatabase(
            ShrinkAutonomousDatabaseRequest request);

    /**
     * Starts the specified Autonomous AI Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/StartAutonomousDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     StartAutonomousDatabase API.
     */
    StartAutonomousDatabaseResponse startAutonomousDatabase(StartAutonomousDatabaseRequest request);

    /**
     * Starts a stopped pluggable database. The `openMode` value of the pluggable database will be
     * `READ_WRITE` upon completion.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/StartPluggableDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     StartPluggableDatabase API.
     */
    StartPluggableDatabaseResponse startPluggableDatabase(StartPluggableDatabaseRequest request);

    /**
     * Stops the specified Autonomous AI Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/StopAutonomousDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     StopAutonomousDatabase API.
     */
    StopAutonomousDatabaseResponse stopAutonomousDatabase(StopAutonomousDatabaseRequest request);

    /**
     * Stops a pluggable database. The `openMode` value of the pluggable database will be `MOUNTED`
     * upon completion.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/StopPluggableDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     StopPluggableDatabase API.
     */
    StopPluggableDatabaseResponse stopPluggableDatabase(StopPluggableDatabaseRequest request);

    /**
     * Performs a switchover to transition primary database of this Data Guard association into a
     * standby role. The standby database associated with the `dataGuardAssociationId` assumes the
     * primary database role.
     *
     * <p>A switchover guarantees no data loss.
     *
     * <p>This operation should be performed on respective standby database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/SwitchOverDataGuardExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use SwitchOverDataGuard
     *     API.
     */
    SwitchOverDataGuardResponse switchOverDataGuard(SwitchOverDataGuardRequest request);

    /**
     * Switchover an Autonomous Container Database (ACD), identified by the
     * autonomousContainerDatabaseId parameter, to an active standby ACD. This standby ACD will
     * become the new primary ACD when the switchover completes successfully. For more information,
     * see [Switch Roles in an Autonomous Data Guard
     * Configuration](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbcl/index.html#ADBCL-GUID-A2AB31F6-D52D-493C-9BA7-D87A0F17078F).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/SwitchoverAutonomousContainerDatabaseDataguardExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SwitchoverAutonomousContainerDatabaseDataguard API.
     */
    SwitchoverAutonomousContainerDatabaseDataguardResponse
            switchoverAutonomousContainerDatabaseDataguard(
                    SwitchoverAutonomousContainerDatabaseDataguardRequest request);

    /**
     * **Deprecated.** Use the {@link
     * #switchoverAutonomousContainerDatabaseDataguard(SwitchoverAutonomousContainerDatabaseDataguardRequest)
     * switchoverAutonomousContainerDatabaseDataguard} operation to switches over the primary
     * Autonomous Container Database (ACD) of an Autonomous Data Guard peer association to standby
     * role. The standby ACD associated with autonomousContainerDatabaseDataguardAssociationId
     * assumes the primary ACD role.
     *
     * <p>A switchover incurs no data loss.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/SwitchoverAutonomousContainerDatabaseDataguardAssociationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SwitchoverAutonomousContainerDatabaseDataguardAssociation API.
     */
    SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse
            switchoverAutonomousContainerDatabaseDataguardAssociation(
                    SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest request);

    /**
     * Initiates a switchover of the specified Autonomous AI Database to the associated peer
     * database. Applicable only to databases with Disaster Recovery enabled. This API should be
     * called in the remote region where the peer database resides. Below parameter is optional: -
     * `peerDbId` Use this parameter to specify the database OCID of the Disaster Recovery peer,
     * which is located in a different (remote) region from the current peer database. If this
     * parameter is not provided, the switchover will happen in the same region.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/SwitchoverAutonomousDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SwitchoverAutonomousDatabase API.
     */
    SwitchoverAutonomousDatabaseResponse switchoverAutonomousDatabase(
            SwitchoverAutonomousDatabaseRequest request);

    /**
     * Performs a switchover to transition the primary database of a Data Guard association into a
     * standby role. The standby database associated with the `dataGuardAssociationId` assumes the
     * primary database role.
     *
     * <p>A switchover guarantees no data loss.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/SwitchoverDataGuardAssociationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SwitchoverDataGuardAssociation API.
     */
    SwitchoverDataGuardAssociationResponse switchoverDataGuardAssociation(
            SwitchoverDataGuardAssociationRequest request);

    /**
     * Terminates an Autonomous Container Database, which permanently deletes the container database
     * and any databases within the container database. The database data is local to the Autonomous
     * Exadata Infrastructure and will be lost when the container database is terminated. Oracle
     * recommends that you back up any data in the Autonomous Container Database prior to
     * terminating it.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/TerminateAutonomousContainerDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     TerminateAutonomousContainerDatabase API.
     */
    TerminateAutonomousContainerDatabaseResponse terminateAutonomousContainerDatabase(
            TerminateAutonomousContainerDatabaseRequest request);

    /**
     * **Deprecated.** To terminate an Exadata Infrastructure resource in the Oracle cloud, use the
     * {@link #deleteCloudExadataInfrastructure(DeleteCloudExadataInfrastructureRequest)
     * deleteCloudExadataInfrastructure} operation. To delete an Autonomous Exadata VM cluster in
     * the Oracle cloud, use the {@link
     * #deleteCloudAutonomousVmCluster(DeleteCloudAutonomousVmClusterRequest)
     * deleteCloudAutonomousVmCluster} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/TerminateAutonomousExadataInfrastructureExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     TerminateAutonomousExadataInfrastructure API.
     */
    TerminateAutonomousExadataInfrastructureResponse terminateAutonomousExadataInfrastructure(
            TerminateAutonomousExadataInfrastructureRequest request);

    /**
     * Terminates a DB system and permanently deletes it and any databases running on it, and any
     * storage volumes attached to it. The database data is local to the DB system and will be lost
     * when the system is terminated. Oracle recommends that you back up any data in the DB system
     * prior to terminating it.
     *
     * <p>*Note:** Deprecated for Exadata Cloud Service systems. Use the [new resource model
     * APIs](https://docs.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model)
     * instead.
     *
     * <p>For Exadata Cloud Service instances, support for this API will end on May 15th, 2021. See
     * [Switching an Exadata DB System to the New Resource Model and
     * APIs](https://docs.oracle.com/iaas/Content/Database/Concepts/exaflexsystem_topic-resource_model_conversion.htm)
     * for details on converting existing Exadata DB systems to the new resource model.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/TerminateDbSystemExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use TerminateDbSystem
     *     API.
     */
    TerminateDbSystemResponse terminateDbSystem(TerminateDbSystemRequest request);

    /**
     * Unmounts the snapshot for the provided dbNode.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UnmountDbnodeSnapshotExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UnmountDbnodeSnapshot API.
     */
    UnmountDbnodeSnapshotResponse unmountDbnodeSnapshot(UnmountDbnodeSnapshotRequest request);

    /**
     * Uninstall the PKCS11 driver for given keystore type
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UnregisterCloudVmClusterPkcsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UnregisterCloudVmClusterPkcs API.
     */
    UnregisterCloudVmClusterPkcsResponse unregisterCloudVmClusterPkcs(
            UnregisterCloudVmClusterPkcsRequest request);

    /**
     * Updates the properties of an Autonomous Container Database, such as display name, maintenance
     * preference, backup retention, and tags.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateAutonomousContainerDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateAutonomousContainerDatabase API.
     */
    UpdateAutonomousContainerDatabaseResponse updateAutonomousContainerDatabase(
            UpdateAutonomousContainerDatabaseRequest request);

    /**
     * **Deprecated.** Use the {@link
     * #editAutonomousContainerDatabaseDataguard(EditAutonomousContainerDatabaseDataguardRequest)
     * editAutonomousContainerDatabaseDataguard} operation to update an Autonomous Data Guard
     * association.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateAutonomousContainerDatabaseDataguardAssociationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateAutonomousContainerDatabaseDataguardAssociation API.
     */
    UpdateAutonomousContainerDatabaseDataguardAssociationResponse
            updateAutonomousContainerDatabaseDataguardAssociation(
                    UpdateAutonomousContainerDatabaseDataguardAssociationRequest request);

    /**
     * Updates one or more attributes of the specified Autonomous AI Database. See the
     * UpdateAutonomousDatabaseDetails resource for a full list of attributes that can be updated.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateAutonomousDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateAutonomousDatabase API.
     */
    UpdateAutonomousDatabaseResponse updateAutonomousDatabase(
            UpdateAutonomousDatabaseRequest request);

    /**
     * Updates the Autonomous AI Database backup of the specified database based on the request
     * parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateAutonomousDatabaseBackupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateAutonomousDatabaseBackup API.
     */
    UpdateAutonomousDatabaseBackupResponse updateAutonomousDatabaseBackup(
            UpdateAutonomousDatabaseBackupRequest request);

    /**
     * Updates the Autonomous AI Database regional wallet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateAutonomousDatabaseRegionalWalletExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateAutonomousDatabaseRegionalWallet API.
     */
    UpdateAutonomousDatabaseRegionalWalletResponse updateAutonomousDatabaseRegionalWallet(
            UpdateAutonomousDatabaseRegionalWalletRequest request);

    /**
     * Updates the properties of an Autonomous AI Database Software Image, like add tags
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateAutonomousDatabaseSoftwareImageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateAutonomousDatabaseSoftwareImage API.
     */
    UpdateAutonomousDatabaseSoftwareImageResponse updateAutonomousDatabaseSoftwareImage(
            UpdateAutonomousDatabaseSoftwareImageRequest request);

    /**
     * Updates the wallet for the specified Autonomous AI Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateAutonomousDatabaseWalletExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateAutonomousDatabaseWallet API.
     */
    UpdateAutonomousDatabaseWalletResponse updateAutonomousDatabaseWallet(
            UpdateAutonomousDatabaseWalletRequest request);

    /**
     * **Deprecated.** Use the {@link
     * #updateCloudExadataInfrastructure(UpdateCloudExadataInfrastructureRequest)
     * updateCloudExadataInfrastructure} operation to update an Exadata Infrastructure resource and
     * {@link #updateCloudAutonomousVmCluster(UpdateCloudAutonomousVmClusterRequest)
     * updateCloudAutonomousVmCluster} operation to update an Autonomous Exadata VM cluster.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateAutonomousExadataInfrastructureExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateAutonomousExadataInfrastructure API.
     */
    UpdateAutonomousExadataInfrastructureResponse updateAutonomousExadataInfrastructure(
            UpdateAutonomousExadataInfrastructureRequest request);

    /**
     * Updates the specified Autonomous VM cluster for the Exadata Cloud@Customer system.To update
     * an Autonomous VM Cluster in the Oracle cloud, see {@link
     * #updateCloudAutonomousVmCluster(UpdateCloudAutonomousVmClusterRequest)
     * updateCloudAutonomousVmCluster}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateAutonomousVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateAutonomousVmCluster API.
     */
    UpdateAutonomousVmClusterResponse updateAutonomousVmCluster(
            UpdateAutonomousVmClusterRequest request);

    /**
     * Updates database backup details.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateBackupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateBackup API.
     */
    UpdateBackupResponse updateBackup(UpdateBackupRequest request);

    /**
     * If no database is associated with the backup destination: - For a RECOVERY_APPLIANCE backup
     * destination, updates the connection string and/or the list of VPC users. - For an NFS backup
     * destination, updates the NFS location.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateBackupDestinationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateBackupDestination API.
     */
    UpdateBackupDestinationResponse updateBackupDestination(UpdateBackupDestinationRequest request);

    /**
     * Updates the specified Autonomous Exadata VM cluster in the Oracle cloud. For Exadata
     * Cloud@Customer systems, see {@link
     * #updateAutonomousVmCluster(UpdateAutonomousVmClusterRequest) updateAutonomousVmCluster}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateCloudAutonomousVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateCloudAutonomousVmCluster API.
     */
    UpdateCloudAutonomousVmClusterResponse updateCloudAutonomousVmCluster(
            UpdateCloudAutonomousVmClusterRequest request);

    /**
     * Updates the Cloud Exadata infrastructure resource. Applies to Exadata Cloud Service instances
     * and Autonomous AI Database on dedicated Exadata infrastructure only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateCloudExadataInfrastructureExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateCloudExadataInfrastructure API.
     */
    UpdateCloudExadataInfrastructureResponse updateCloudExadataInfrastructure(
            UpdateCloudExadataInfrastructureRequest request);

    /**
     * Updates the specified cloud VM cluster. Applies to Exadata Cloud Service instances and
     * Autonomous Database on dedicated Exadata infrastructure only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateCloudVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateCloudVmCluster API.
     */
    UpdateCloudVmClusterResponse updateCloudVmCluster(UpdateCloudVmClusterRequest request);

    /**
     * Updates the IORM settings for the specified cloud VM cluster in an Exadata Cloud Service
     * instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateCloudVmClusterIormConfigExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateCloudVmClusterIormConfig API.
     */
    UpdateCloudVmClusterIormConfigResponse updateCloudVmClusterIormConfig(
            UpdateCloudVmClusterIormConfigRequest request);

    /**
     * Updates the specified database node console connection.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateConsoleConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateConsoleConnection API.
     */
    UpdateConsoleConnectionResponse updateConsoleConnection(UpdateConsoleConnectionRequest request);

    /**
     * Updates the specified database node console history.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateConsoleHistoryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateConsoleHistory API.
     */
    UpdateConsoleHistoryResponse updateConsoleHistory(UpdateConsoleHistoryRequest request);

    /**
     * Update an existing Data Guard member. A Data Guard member represents the replication
     * relationship between the specified database and a standby database. For more information, see
     * [Using Oracle Data
     * Guard](https://docs.oracle.com/iaas/Content/Database/Tasks/usingdataguard.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateDataGuardExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDataGuard
     *     API.
     */
    UpdateDataGuardResponse updateDataGuard(UpdateDataGuardRequest request);

    /**
     * Updates the Data Guard association the specified database. This API can be used to change the
     * `protectionMode` and `transportType` of the Data Guard association.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateDataGuardAssociationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateDataGuardAssociation API.
     */
    UpdateDataGuardAssociationResponse updateDataGuardAssociation(
            UpdateDataGuardAssociationRequest request);

    /**
     * Update the specified database based on the request parameters provided.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDatabase API.
     */
    UpdateDatabaseResponse updateDatabase(UpdateDatabaseRequest request);

    /**
     * Updates the properties of a Database Software Image, like Display Nmae
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateDatabaseSoftwareImageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateDatabaseSoftwareImage API.
     */
    UpdateDatabaseSoftwareImageResponse updateDatabaseSoftwareImage(
            UpdateDatabaseSoftwareImageRequest request);

    /**
     * Patches the specified Database Home.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateDbHomeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDbHome API.
     */
    UpdateDbHomeResponse updateDbHome(UpdateDbHomeRequest request);

    /**
     * Updates the specified database node.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateDbNodeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDbNode API.
     */
    UpdateDbNodeResponse updateDbNode(UpdateDbNodeRequest request);

    /**
     * Updates the properties of the specified DB system.
     *
     * <p>*Note:** Deprecated for Exadata Cloud Service systems. Use the [new resource model
     * APIs](https://docs.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model)
     * instead.
     *
     * <p>For Exadata Cloud Service instances, support for this API will end on May 15th, 2021. See
     * [Switching an Exadata DB System to the New Resource Model and
     * APIs](https://docs.oracle.com/iaas/Content/Database/Concepts/exaflexsystem_topic-resource_model_conversion.htm)
     * for details on converting existing Exadata DB systems to the new resource model.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateDbSystemExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDbSystem API.
     */
    UpdateDbSystemResponse updateDbSystem(UpdateDbSystemRequest request);

    /**
     * Updates the Exadata infrastructure resource. Applies to Exadata Cloud@Customer instances
     * only. To update an Exadata Cloud Service infrastructure resource, use the {@link
     * #updateCloudExadataInfrastructure(UpdateCloudExadataInfrastructureRequest)
     * updateCloudExadataInfrastructure} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateExadataInfrastructureExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateExadataInfrastructure API.
     */
    UpdateExadataInfrastructureResponse updateExadataInfrastructure(
            UpdateExadataInfrastructureRequest request);

    /**
     * Updates IORM settings for the specified Exadata DB system.
     *
     * <p>*Note:** Deprecated for Exadata Cloud Service systems. Use the [new resource model
     * APIs](https://docs.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model)
     * instead.
     *
     * <p>For Exadata Cloud Service instances, support for this API will end on May 15th, 2021. See
     * [Switching an Exadata DB System to the New Resource Model and
     * APIs](https://docs.oracle.com/iaas/Content/Database/Concepts/exaflexsystem_topic-resource_model_conversion.htm)
     * for details on converting existing Exadata DB systems to the new resource model.
     *
     * <p>The {@link #updateCloudVmClusterIormConfig(UpdateCloudVmClusterIormConfigRequest)
     * updateCloudVmClusterIormConfig} API is used for Exadata systems using the new resource model.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateExadataIormConfigExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateExadataIormConfig API.
     */
    UpdateExadataIormConfigResponse updateExadataIormConfig(UpdateExadataIormConfigRequest request);

    /**
     * Updates the specified Exadata VM cluster on Exascale Infrastructure. Applies to Exadata
     * Database Service on Exascale Infrastructure only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateExadbVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateExadbVmCluster API.
     */
    UpdateExadbVmClusterResponse updateExadbVmCluster(UpdateExadbVmClusterRequest request);

    /**
     * Updates the specified Exadata Database Storage Vault.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateExascaleDbStorageVaultExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateExascaleDbStorageVault API.
     */
    UpdateExascaleDbStorageVaultResponse updateExascaleDbStorageVault(
            UpdateExascaleDbStorageVaultRequest request);

    /**
     * Updates the execution action resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateExecutionActionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateExecutionAction API.
     */
    UpdateExecutionActionResponse updateExecutionAction(UpdateExecutionActionRequest request);

    /**
     * Updates the execution window resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateExecutionWindowExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateExecutionWindow API.
     */
    UpdateExecutionWindowResponse updateExecutionWindow(UpdateExecutionWindowRequest request);

    /**
     * Updates the properties of an {@link
     * #createExternalContainerDatabaseDetails(CreateExternalContainerDatabaseDetailsRequest)
     * createExternalContainerDatabaseDetails} resource, such as the display name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateExternalContainerDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateExternalContainerDatabase API.
     */
    UpdateExternalContainerDatabaseResponse updateExternalContainerDatabase(
            UpdateExternalContainerDatabaseRequest request);

    /**
     * Updates the properties of an external database connector, such as the display name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateExternalDatabaseConnectorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateExternalDatabaseConnector API.
     */
    UpdateExternalDatabaseConnectorResponse updateExternalDatabaseConnector(
            UpdateExternalDatabaseConnectorRequest request);

    /**
     * Updates the properties of an external non-container database, such as the display name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateExternalNonContainerDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateExternalNonContainerDatabase API.
     */
    UpdateExternalNonContainerDatabaseResponse updateExternalNonContainerDatabase(
            UpdateExternalNonContainerDatabaseRequest request);

    /**
     * Updates the properties of an {@link
     * #createExternalPluggableDatabaseDetails(CreateExternalPluggableDatabaseDetailsRequest)
     * createExternalPluggableDatabaseDetails} resource, such as the display name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateExternalPluggableDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateExternalPluggableDatabase API.
     */
    UpdateExternalPluggableDatabaseResponse updateExternalPluggableDatabase(
            UpdateExternalPluggableDatabaseRequest request);

    /**
     * Edit the key store.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateKeyStoreExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateKeyStore API.
     */
    UpdateKeyStoreResponse updateKeyStore(UpdateKeyStoreRequest request);

    /**
     * Updates the properties of a maintenance run, such as the state of a maintenance run.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateMaintenanceRunExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateMaintenanceRun API.
     */
    UpdateMaintenanceRunResponse updateMaintenanceRun(UpdateMaintenanceRunRequest request);

    /**
     * Updates the properties of the specified one-off patch.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateOneoffPatchExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateOneoffPatch
     *     API.
     */
    UpdateOneoffPatchResponse updateOneoffPatch(UpdateOneoffPatchRequest request);

    /**
     * Updates the specified pluggable database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdatePluggableDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdatePluggableDatabase API.
     */
    UpdatePluggableDatabaseResponse updatePluggableDatabase(UpdatePluggableDatabaseRequest request);

    /**
     * Updates the Scheduled Action resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateScheduledActionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateScheduledAction API.
     */
    UpdateScheduledActionResponse updateScheduledAction(UpdateScheduledActionRequest request);

    /**
     * Updates the Scheduling Policy resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateSchedulingPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateSchedulingPolicy API.
     */
    UpdateSchedulingPolicyResponse updateSchedulingPolicy(UpdateSchedulingPolicyRequest request);

    /**
     * Updates the Scheduling Window resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateSchedulingWindowExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateSchedulingWindow API.
     */
    UpdateSchedulingWindowResponse updateSchedulingWindow(UpdateSchedulingWindowRequest request);

    /**
     * Updates the specified VM cluster. Applies to Exadata Cloud@Customer instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateVmClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateVmCluster
     *     API.
     */
    UpdateVmClusterResponse updateVmCluster(UpdateVmClusterRequest request);

    /**
     * Updates the specified VM cluster network. Applies to Exadata Cloud@Customer instances only.
     * To update a cloud VM cluster in an Exadata Cloud Service instance, use the {@link
     * #updateCloudVmCluster(UpdateCloudVmClusterRequest) updateCloudVmCluster} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateVmClusterNetworkExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateVmClusterNetwork API.
     */
    UpdateVmClusterNetworkResponse updateVmClusterNetwork(UpdateVmClusterNetworkRequest request);

    /**
     * Upgrades the specified Oracle Database instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpgradeDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpgradeDatabase
     *     API.
     */
    UpgradeDatabaseResponse upgradeDatabase(UpgradeDatabaseRequest request);

    /**
     * Upgrades the operating system and grid infrastructure of the DB system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpgradeDbSystemExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpgradeDbSystem
     *     API.
     */
    UpgradeDbSystemResponse upgradeDbSystem(UpgradeDbSystemRequest request);

    /**
     * Validates the specified VM cluster network. Applies to Exadata Cloud@Customer instances only.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ValidateVmClusterNetworkExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ValidateVmClusterNetwork API.
     */
    ValidateVmClusterNetworkResponse validateVmClusterNetwork(
            ValidateVmClusterNetworkRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     * @deprecated use {@link #newWaiters(WorkRequest)} instead. Otherwise, a default one will be
     *     provided that does not support operations that rely on the {@code WorkRequestClient} for
     *     polling. An {@code IllegalStateException} will be thrown for such operations.
     */
    @Deprecated
    DatabaseWaiters getWaiters();

    /**
     * Creates a new {@code DatabaseWaiters} for resources for this service.
     *
     * @param workRequestClient The work request service client used to query for work request
     *     status
     * @return The service waiters.
     */
    DatabaseWaiters newWaiters(com.oracle.bmc.workrequests.WorkRequest workRequestClient);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DatabasePaginators getPaginators();
}
