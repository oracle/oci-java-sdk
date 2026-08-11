/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabasev26;

import com.oracle.bmc.distributeddatabasev26.requests.*;
import com.oracle.bmc.distributeddatabasev26.responses.*;

/**
 * Use the Globally Distributed Database service APIs to create and manage the Globally distributed
 * databases. This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the
 * operations by default if no circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260101")
public interface DistributedAutonomousDbService extends AutoCloseable {

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
     * Add new Global database services control(GDS CTL) node for the Globally distributed
     * autonomous database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/AddDistributedAutonomousDatabaseGdsControlNodeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AddDistributedAutonomousDatabaseGdsControlNode API.
     */
    AddDistributedAutonomousDatabaseGdsControlNodeResponse
            addDistributedAutonomousDatabaseGdsControlNode(
                    AddDistributedAutonomousDatabaseGdsControlNodeRequest request);

    /**
     * Move the Globally distributed autonomous database and its dependent resources to the
     * specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/ChangeDistributedAutonomousDatabaseCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeDistributedAutonomousDatabaseCompartment API.
     */
    ChangeDistributedAutonomousDatabaseCompartmentResponse
            changeDistributedAutonomousDatabaseCompartment(
                    ChangeDistributedAutonomousDatabaseCompartmentRequest request);

    /**
     * Change the DbBackupConfig for the Globally distributed autonomous database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/ChangeDistributedAutonomousDbBackupConfigExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeDistributedAutonomousDbBackupConfig API.
     */
    ChangeDistributedAutonomousDbBackupConfigResponse changeDistributedAutonomousDbBackupConfig(
            ChangeDistributedAutonomousDbBackupConfigRequest request);

    /**
     * Configure autoResourceManagement options for the Globally distributed autonomous database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/ConfigureDistributedAutonomousDatabaseAutoResourceManagementExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ConfigureDistributedAutonomousDatabaseAutoResourceManagement API.
     */
    ConfigureDistributedAutonomousDatabaseAutoResourceManagementResponse
            configureDistributedAutonomousDatabaseAutoResourceManagement(
                    ConfigureDistributedAutonomousDatabaseAutoResourceManagementRequest request);

    /**
     * Configure wallets on Global Service Manager(GSM) instances for a Globally distributed
     * autonomous database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/ConfigureDistributedAutonomousDatabaseGsmWalletExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ConfigureDistributedAutonomousDatabaseGsmWallet API.
     */
    ConfigureDistributedAutonomousDatabaseGsmWalletResponse
            configureDistributedAutonomousDatabaseGsmWallet(
                    ConfigureDistributedAutonomousDatabaseGsmWalletRequest request);

    /**
     * Configure new Global Service Manager(GSM aka shard manager) instances for the Globally
     * distributed autonomous database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/ConfigureDistributedAutonomousDatabaseGsmsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ConfigureDistributedAutonomousDatabaseGsms API.
     */
    ConfigureDistributedAutonomousDatabaseGsmsResponse configureDistributedAutonomousDatabaseGsms(
            ConfigureDistributedAutonomousDatabaseGsmsRequest request);

    /**
     * Once all components of Globally distributed autonomous database are provisioned, this api
     * shall be invoked to configure sharding on the Globally distributed autonomous database. Note
     * that this 'ConfigureSharding' API also needs to be invoked after successfully adding a new
     * shard to the Globally distributed autonomous database using PATCH api. If this API is not
     * invoked after successfully adding a new shard, then that new shard will not be a participant
     * in sharding topology of the Globally distributed autonomous database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/ConfigureDistributedAutonomousDatabaseShardingExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ConfigureDistributedAutonomousDatabaseSharding API.
     */
    ConfigureDistributedAutonomousDatabaseShardingResponse
            configureDistributedAutonomousDatabaseSharding(
                    ConfigureDistributedAutonomousDatabaseShardingRequest request);

    /**
     * Creates a Globally distributed autonomous database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/CreateDistributedAutonomousDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateDistributedAutonomousDatabase API.
     */
    CreateDistributedAutonomousDatabaseResponse createDistributedAutonomousDatabase(
            CreateDistributedAutonomousDatabaseRequest request);

    /**
     * Terminate the given Globally distributed autonomous databases.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/DeleteDistributedAutonomousDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteDistributedAutonomousDatabase API.
     */
    DeleteDistributedAutonomousDatabaseResponse deleteDistributedAutonomousDatabase(
            DeleteDistributedAutonomousDatabaseRequest request);

    /**
     * Generate the wallet associated with Globally distributed autonomous database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/GenerateDistributedAutonomousDatabaseWalletExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GenerateDistributedAutonomousDatabaseWallet API.
     */
    GenerateDistributedAutonomousDatabaseWalletResponse generateDistributedAutonomousDatabaseWallet(
            GenerateDistributedAutonomousDatabaseWalletRequest request);

    /**
     * Gets the details of the Globally distributed autonomous database identified by given id.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/GetDistributedAutonomousDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetDistributedAutonomousDatabase API.
     */
    GetDistributedAutonomousDatabaseResponse getDistributedAutonomousDatabase(
            GetDistributedAutonomousDatabaseRequest request);

    /**
     * Operation to retrieve RAFT metrics for the Globally distributed autonomous database. If the
     * Globally distributed autonomous database is not RAFT based then empty response is returned
     * from the API.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/GetDistributedAutonomousDatabaseRaftMetricExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetDistributedAutonomousDatabaseRaftMetric API.
     */
    GetDistributedAutonomousDatabaseRaftMetricResponse getDistributedAutonomousDatabaseRaftMetric(
            GetDistributedAutonomousDatabaseRaftMetricRequest request);

    /**
     * Operation to retrieve move RU invocation history and status for the Globally distributed
     * autonomous database. Results are ordered by created timestamp in descending order.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/GetDistributedAutonomousDatabaseRuChangeLogExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetDistributedAutonomousDatabaseRuChangeLog API.
     */
    GetDistributedAutonomousDatabaseRuChangeLogResponse getDistributedAutonomousDatabaseRuChangeLog(
            GetDistributedAutonomousDatabaseRuChangeLogRequest request);

    /**
     * List of Globally distributed autonomous databases.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/ListDistributedAutonomousDatabasesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDistributedAutonomousDatabases API.
     */
    ListDistributedAutonomousDatabasesResponse listDistributedAutonomousDatabases(
            ListDistributedAutonomousDatabasesRequest request);

    /**
     * Move the replication units for RAFT based globally distributed autonomous database from
     * source shard to destination shard.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/MoveDistributedAutonomousDatabaseReplicationUnitExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     MoveDistributedAutonomousDatabaseReplicationUnit API.
     */
    MoveDistributedAutonomousDatabaseReplicationUnitResponse
            moveDistributedAutonomousDatabaseReplicationUnit(
                    MoveDistributedAutonomousDatabaseReplicationUnitRequest request);

    /**
     * Patch operation to add, remove or update shards to the Globally distributed autonomous
     * database topology. In single patch operation, multiple shards can be either added, or removed
     * or updated. Combination of inserts, update and remove in single operation is not allowed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/PatchDistributedAutonomousDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     PatchDistributedAutonomousDatabase API.
     */
    PatchDistributedAutonomousDatabaseResponse patchDistributedAutonomousDatabase(
            PatchDistributedAutonomousDatabaseRequest request);

    /**
     * Recreate the failed resource for the Globally Distributed Autonomous Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/RecreateFailedDistributedAutonomousDatabaseResourceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RecreateFailedDistributedAutonomousDatabaseResource API.
     */
    RecreateFailedDistributedAutonomousDatabaseResourceResponse
            recreateFailedDistributedAutonomousDatabaseResource(
                    RecreateFailedDistributedAutonomousDatabaseResourceRequest request);

    /**
     * Rotate the gsmuser and gsmcatuser passwords for shards and catalog of the Globally
     * distributed autonomous database. This operation will also remove GdsCtlNodes if present.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/RotateDistributedAutonomousDatabasePasswordsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RotateDistributedAutonomousDatabasePasswords API.
     */
    RotateDistributedAutonomousDatabasePasswordsResponse
            rotateDistributedAutonomousDatabasePasswords(
                    RotateDistributedAutonomousDatabasePasswordsRequest request);

    /**
     * Scale global service manager(GSM aka shard director) instances for the Globally distributed
     * autonomous database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/ScaleDistributedAutonomousDatabaseGsmsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ScaleDistributedAutonomousDatabaseGsms API.
     */
    ScaleDistributedAutonomousDatabaseGsmsResponse scaleDistributedAutonomousDatabaseGsms(
            ScaleDistributedAutonomousDatabaseGsmsRequest request);

    /**
     * Start the shards, catalog, GSMs and GDSCTL instances of Globally distributed autonomous
     * database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/StartDistributedAutonomousDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     StartDistributedAutonomousDatabase API.
     */
    StartDistributedAutonomousDatabaseResponse startDistributedAutonomousDatabase(
            StartDistributedAutonomousDatabaseRequest request);

    /**
     * Stop the shards, catalog, GSMs and GDSCTL instances for the Globally distributed autonomous
     * database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/StopDistributedAutonomousDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     StopDistributedAutonomousDatabase API.
     */
    StopDistributedAutonomousDatabaseResponse stopDistributedAutonomousDatabase(
            StopDistributedAutonomousDatabaseRequest request);

    /**
     * Updates the configuration of the Globally distributed autonomous database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/UpdateDistributedAutonomousDatabaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateDistributedAutonomousDatabase API.
     */
    UpdateDistributedAutonomousDatabaseResponse updateDistributedAutonomousDatabase(
            UpdateDistributedAutonomousDatabaseRequest request);

    /**
     * Validate the CA Bundles consistency of the globally distributed autonomous database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/ValidateDistributedAutonomousDatabaseCaBundleExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ValidateDistributedAutonomousDatabaseCaBundle API.
     */
    ValidateDistributedAutonomousDatabaseCaBundleResponse
            validateDistributedAutonomousDatabaseCaBundle(
                    ValidateDistributedAutonomousDatabaseCaBundleRequest request);

    /**
     * Validate the network connectivity between components of the globally distributed autonomous
     * database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/ValidateDistributedAutonomousDatabaseNetworkExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ValidateDistributedAutonomousDatabaseNetwork API.
     */
    ValidateDistributedAutonomousDatabaseNetworkResponse
            validateDistributedAutonomousDatabaseNetwork(
                    ValidateDistributedAutonomousDatabaseNetworkRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    DistributedAutonomousDbServiceWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DistributedAutonomousDbServicePaginators getPaginators();
}
