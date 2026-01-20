/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds;

import com.oracle.bmc.bds.requests.*;
import com.oracle.bmc.bds.responses.*;

/**
 * REST API for Oracle Big Data Service. Use this API to build, deploy, and manage fully elastic Big
 * Data Service clusters. Build on Hadoop, Spark and Data Science distributions, which can be fully
 * integrated with existing enterprise data in Oracle Database and Oracle applications.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
public interface BdsAsync extends AutoCloseable {

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
     * Activate specified metastore configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ActivateBdsMetastoreConfigurationResponse>
            activateBdsMetastoreConfiguration(
                    ActivateBdsMetastoreConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ActivateBdsMetastoreConfigurationRequest,
                                    ActivateBdsMetastoreConfigurationResponse>
                            handler);

    /**
     * Activate IAM user sync configuration for the given identity configuration
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ActivateIamUserSyncConfigurationResponse>
            activateIamUserSyncConfiguration(
                    ActivateIamUserSyncConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ActivateIamUserSyncConfigurationRequest,
                                    ActivateIamUserSyncConfigurationResponse>
                            handler);

    /**
     * Activate UPST configuration for the given identity configuration
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ActivateUpstConfigurationResponse> activateUpstConfiguration(
            ActivateUpstConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ActivateUpstConfigurationRequest, ActivateUpstConfigurationResponse>
                    handler);

    /**
     * Add an autoscale configuration to the cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddAutoScalingConfigurationResponse> addAutoScalingConfiguration(
            AddAutoScalingConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddAutoScalingConfigurationRequest, AddAutoScalingConfigurationResponse>
                    handler);

    /**
     * Adds block storage to existing worker/compute only worker nodes. The same amount of storage
     * will be added to all worker/compute only worker nodes. No change will be made to storage that
     * is already attached. Block storage cannot be removed.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddBlockStorageResponse> addBlockStorage(
            AddBlockStorageRequest request,
            com.oracle.bmc.responses.AsyncHandler<AddBlockStorageRequest, AddBlockStorageResponse>
                    handler);

    /**
     * Adds Cloud SQL to your cluster. You can use Cloud SQL to query against non-relational data
     * stored in multiple big data sources, including Apache Hive, HDFS, Oracle NoSQL Database, and
     * Apache HBase. Adding Cloud SQL adds a query server node to the cluster and creates cell
     * servers on all the worker nodes in the cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddCloudSqlResponse> addCloudSql(
            AddCloudSqlRequest request,
            com.oracle.bmc.responses.AsyncHandler<AddCloudSqlRequest, AddCloudSqlResponse> handler);

    /**
     * Adds Kafka to a cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddKafkaResponse> addKafka(
            AddKafkaRequest request,
            com.oracle.bmc.responses.AsyncHandler<AddKafkaRequest, AddKafkaResponse> handler);

    /**
     * Increases the size (scales out) of a cluster by adding master nodes. The added master nodes
     * will have the same shape and will have the same amount of attached block storage as other
     * master nodes in the cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddMasterNodesResponse> addMasterNodes(
            AddMasterNodesRequest request,
            com.oracle.bmc.responses.AsyncHandler<AddMasterNodesRequest, AddMasterNodesResponse>
                    handler);

    /**
     * Increases the size (scales out) of a cluster by adding utility nodes. The added utility nodes
     * will have the same shape and will have the same amount of attached block storage as other
     * utility nodes in the cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddUtilityNodesResponse> addUtilityNodes(
            AddUtilityNodesRequest request,
            com.oracle.bmc.responses.AsyncHandler<AddUtilityNodesRequest, AddUtilityNodesResponse>
                    handler);

    /**
     * Increases the size (scales out) a cluster by adding worker nodes(data/compute). The added
     * worker nodes will have the same shape and will have the same amount of attached block storage
     * as other worker nodes in the cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddWorkerNodesResponse> addWorkerNodes(
            AddWorkerNodesRequest request,
            com.oracle.bmc.responses.AsyncHandler<AddWorkerNodesRequest, AddWorkerNodesResponse>
                    handler);

    /**
     * Takes a backup of of given nodes.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BackupNodeResponse> backupNode(
            BackupNodeRequest request,
            com.oracle.bmc.responses.AsyncHandler<BackupNodeRequest, BackupNodeResponse> handler);

    /**
     * A list of services and their certificate details.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CertificateServiceInfoResponse> certificateServiceInfo(
            CertificateServiceInfoRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CertificateServiceInfoRequest, CertificateServiceInfoResponse>
                    handler);

    /**
     * Moves a Big Data Service cluster into a different compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeBdsInstanceCompartmentResponse> changeBdsInstanceCompartment(
            ChangeBdsInstanceCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeBdsInstanceCompartmentRequest,
                            ChangeBdsInstanceCompartmentResponse>
                    handler);

    /**
     * Changes the size of a cluster by scaling up or scaling down the nodes. Nodes are scaled up or
     * down by changing the shapes of all the nodes of the same type to the next larger or smaller
     * shape. The node types are master, utility, worker, and Cloud SQL. Only nodes with VM-STANDARD
     * shapes can be scaled.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeShapeResponse> changeShape(
            ChangeShapeRequest request,
            com.oracle.bmc.responses.AsyncHandler<ChangeShapeRequest, ChangeShapeResponse> handler);

    /**
     * Create an API key on behalf of the specified user.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateBdsApiKeyResponse> createBdsApiKey(
            CreateBdsApiKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateBdsApiKeyRequest, CreateBdsApiKeyResponse>
                    handler);

    /**
     * Create a detailed capacity report for BDS service
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateBdsCapacityReportResponse> createBdsCapacityReport(
            CreateBdsCapacityReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateBdsCapacityReportRequest, CreateBdsCapacityReportResponse>
                    handler);

    /**
     * Creates a Big Data Service cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateBdsInstanceResponse> createBdsInstance(
            CreateBdsInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateBdsInstanceRequest, CreateBdsInstanceResponse>
                    handler);

    /**
     * Create and activate external metastore configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateBdsMetastoreConfigurationResponse>
            createBdsMetastoreConfiguration(
                    CreateBdsMetastoreConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateBdsMetastoreConfigurationRequest,
                                    CreateBdsMetastoreConfigurationResponse>
                            handler);

    /**
     * Create an identity configuration for the cluster
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateIdentityConfigurationResponse> createIdentityConfiguration(
            CreateIdentityConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateIdentityConfigurationRequest, CreateIdentityConfigurationResponse>
                    handler);

    /**
     * Add a node volume backup configuration to the cluster for an indicated node type or node.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateNodeBackupConfigurationResponse>
            createNodeBackupConfiguration(
                    CreateNodeBackupConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateNodeBackupConfigurationRequest,
                                    CreateNodeBackupConfigurationResponse>
                            handler);

    /**
     * Add a nodeReplaceConfigurations to the cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateNodeReplaceConfigurationResponse>
            createNodeReplaceConfiguration(
                    CreateNodeReplaceConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateNodeReplaceConfigurationRequest,
                                    CreateNodeReplaceConfigurationResponse>
                            handler);

    /**
     * Create a resource principal session token configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateResourcePrincipalConfigurationResponse>
            createResourcePrincipalConfiguration(
                    CreateResourcePrincipalConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateResourcePrincipalConfigurationRequest,
                                    CreateResourcePrincipalConfigurationResponse>
                            handler);

    /**
     * Deactivate the IAM user sync configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeactivateIamUserSyncConfigurationResponse>
            deactivateIamUserSyncConfiguration(
                    DeactivateIamUserSyncConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeactivateIamUserSyncConfigurationRequest,
                                    DeactivateIamUserSyncConfigurationResponse>
                            handler);

    /**
     * Deactivate the UPST configuration represented by the provided ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeactivateUpstConfigurationResponse> deactivateUpstConfiguration(
            DeactivateUpstConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeactivateUpstConfigurationRequest, DeactivateUpstConfigurationResponse>
                    handler);

    /**
     * Deletes the user's API key represented by the provided ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteBdsApiKeyResponse> deleteBdsApiKey(
            DeleteBdsApiKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteBdsApiKeyRequest, DeleteBdsApiKeyResponse>
                    handler);

    /**
     * Deletes the cluster identified by the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteBdsInstanceResponse> deleteBdsInstance(
            DeleteBdsInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteBdsInstanceRequest, DeleteBdsInstanceResponse>
                    handler);

    /**
     * Delete the BDS metastore configuration represented by the provided ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteBdsMetastoreConfigurationResponse>
            deleteBdsMetastoreConfiguration(
                    DeleteBdsMetastoreConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteBdsMetastoreConfigurationRequest,
                                    DeleteBdsMetastoreConfigurationResponse>
                            handler);

    /**
     * Delete the identity configuration represented by the provided ID. Deletion is only allowed if
     * this identity configuration is not associated with any active IAM user sync configuration or
     * UPST configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteIdentityConfigurationResponse> deleteIdentityConfiguration(
            DeleteIdentityConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteIdentityConfigurationRequest, DeleteIdentityConfigurationResponse>
                    handler);

    /**
     * Delete the NodeBackup represented by the provided ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteNodeBackupResponse> deleteNodeBackup(
            DeleteNodeBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteNodeBackupRequest, DeleteNodeBackupResponse>
                    handler);

    /**
     * Delete the NodeBackupConfiguration represented by the provided ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteNodeBackupConfigurationResponse>
            deleteNodeBackupConfiguration(
                    DeleteNodeBackupConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteNodeBackupConfigurationRequest,
                                    DeleteNodeBackupConfigurationResponse>
                            handler);

    /**
     * Disabling TLS/SSL for various ODH services running on the BDS cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableCertificateResponse> disableCertificate(
            DisableCertificateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DisableCertificateRequest, DisableCertificateResponse>
                    handler);

    /**
     * Configuring TLS/SSL for various ODH services running on the BDS cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableCertificateResponse> enableCertificate(
            EnableCertificateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            EnableCertificateRequest, EnableCertificateResponse>
                    handler);

    /**
     * Execute bootstrap script.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ExecuteBootstrapScriptResponse> executeBootstrapScript(
            ExecuteBootstrapScriptRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ExecuteBootstrapScriptRequest, ExecuteBootstrapScriptResponse>
                    handler);

    /**
     * Force Refresh Resource Principal for the cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ForceRefreshResourcePrincipalResponse>
            forceRefreshResourcePrincipal(
                    ForceRefreshResourcePrincipalRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ForceRefreshResourcePrincipalRequest,
                                    ForceRefreshResourcePrincipalResponse>
                            handler);

    /**
     * Returns details of the autoscale configuration identified by the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAutoScalingConfigurationResponse> getAutoScalingConfiguration(
            GetAutoScalingConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAutoScalingConfigurationRequest, GetAutoScalingConfigurationResponse>
                    handler);

    /**
     * Returns the user's API key information for the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetBdsApiKeyResponse> getBdsApiKey(
            GetBdsApiKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetBdsApiKeyRequest, GetBdsApiKeyResponse>
                    handler);

    /**
     * Returns information about the Big Data Service cluster identified by the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetBdsInstanceResponse> getBdsInstance(
            GetBdsInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetBdsInstanceRequest, GetBdsInstanceResponse>
                    handler);

    /**
     * Returns the BDS Metastore configuration information for the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetBdsMetastoreConfigurationResponse> getBdsMetastoreConfiguration(
            GetBdsMetastoreConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetBdsMetastoreConfigurationRequest,
                            GetBdsMetastoreConfigurationResponse>
                    handler);

    /**
     * Get details of one identity config on the cluster
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetIdentityConfigurationResponse> getIdentityConfiguration(
            GetIdentityConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetIdentityConfigurationRequest, GetIdentityConfigurationResponse>
                    handler);

    /**
     * Returns details of NodeBackup identified by the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetNodeBackupResponse> getNodeBackup(
            GetNodeBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetNodeBackupRequest, GetNodeBackupResponse>
                    handler);

    /**
     * Returns details of the NodeBackupConfiguration identified by the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetNodeBackupConfigurationResponse> getNodeBackupConfiguration(
            GetNodeBackupConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetNodeBackupConfigurationRequest, GetNodeBackupConfigurationResponse>
                    handler);

    /**
     * Returns details of the nodeReplaceConfiguration identified by the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetNodeReplaceConfigurationResponse> getNodeReplaceConfiguration(
            GetNodeReplaceConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetNodeReplaceConfigurationRequest, GetNodeReplaceConfigurationResponse>
                    handler);

    /**
     * Get the details of an os patch
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOsPatchDetailsResponse> getOsPatchDetails(
            GetOsPatchDetailsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetOsPatchDetailsRequest, GetOsPatchDetailsResponse>
                    handler);

    /**
     * Returns details of the resourcePrincipalConfiguration identified by the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetResourcePrincipalConfigurationResponse>
            getResourcePrincipalConfiguration(
                    GetResourcePrincipalConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetResourcePrincipalConfigurationRequest,
                                    GetResourcePrincipalConfigurationResponse>
                            handler);

    /**
     * Get the details of the software update of the given SoftwareUpdateId
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSoftwareUpdateResponse> getSoftwareUpdate(
            GetSoftwareUpdateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSoftwareUpdateRequest, GetSoftwareUpdateResponse>
                    handler);

    /**
     * Returns the status of the work request identified by the given ID.
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
     * Install an os patch on a cluster
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<InstallOsPatchResponse> installOsPatch(
            InstallOsPatchRequest request,
            com.oracle.bmc.responses.AsyncHandler<InstallOsPatchRequest, InstallOsPatchResponse>
                    handler);

    /**
     * Install the specified patch to this cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<InstallPatchResponse> installPatch(
            InstallPatchRequest request,
            com.oracle.bmc.responses.AsyncHandler<InstallPatchRequest, InstallPatchResponse>
                    handler);

    /**
     * Install the specified software update to this cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<InstallSoftwareUpdatesResponse> installSoftwareUpdates(
            InstallSoftwareUpdatesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            InstallSoftwareUpdatesRequest, InstallSoftwareUpdatesResponse>
                    handler);

    /**
     * Returns information about the autoscaling configurations for a cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAutoScalingConfigurationsResponse>
            listAutoScalingConfigurations(
                    ListAutoScalingConfigurationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAutoScalingConfigurationsRequest,
                                    ListAutoScalingConfigurationsResponse>
                            handler);

    /**
     * Returns a list of all API keys associated with this Big Data Service cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListBdsApiKeysResponse> listBdsApiKeys(
            ListBdsApiKeysRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListBdsApiKeysRequest, ListBdsApiKeysResponse>
                    handler);

    /**
     * Returns a list of cluster versions with associated odh and bds versions.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListBdsClusterVersionsResponse> listBdsClusterVersions(
            ListBdsClusterVersionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListBdsClusterVersionsRequest, ListBdsClusterVersionsResponse>
                    handler);

    /**
     * Returns a list of all Big Data Service clusters in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListBdsInstancesResponse> listBdsInstances(
            ListBdsInstancesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListBdsInstancesRequest, ListBdsInstancesResponse>
                    handler);

    /**
     * Returns a list of metastore configurations ssociated with this Big Data Service cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListBdsMetastoreConfigurationsResponse>
            listBdsMetastoreConfigurations(
                    ListBdsMetastoreConfigurationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListBdsMetastoreConfigurationsRequest,
                                    ListBdsMetastoreConfigurationsResponse>
                            handler);

    /**
     * Returns a list of all identity configurations associated with this Big Data Service cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListIdentityConfigurationsResponse> listIdentityConfigurations(
            ListIdentityConfigurationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListIdentityConfigurationsRequest, ListIdentityConfigurationsResponse>
                    handler);

    /**
     * Returns information about the NodeBackupConfigurations.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListNodeBackupConfigurationsResponse> listNodeBackupConfigurations(
            ListNodeBackupConfigurationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListNodeBackupConfigurationsRequest,
                            ListNodeBackupConfigurationsResponse>
                    handler);

    /**
     * Returns information about the node Backups.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListNodeBackupsResponse> listNodeBackups(
            ListNodeBackupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListNodeBackupsRequest, ListNodeBackupsResponse>
                    handler);

    /**
     * Returns information about the NodeReplaceConfiguration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListNodeReplaceConfigurationsResponse>
            listNodeReplaceConfigurations(
                    ListNodeReplaceConfigurationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListNodeReplaceConfigurationsRequest,
                                    ListNodeReplaceConfigurationsResponse>
                            handler);

    /**
     * List all available os patches for a given cluster
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOsPatchesResponse> listOsPatches(
            ListOsPatchesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListOsPatchesRequest, ListOsPatchesResponse>
                    handler);

    /**
     * List the patch history of this cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPatchHistoriesResponse> listPatchHistories(
            ListPatchHistoriesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPatchHistoriesRequest, ListPatchHistoriesResponse>
                    handler);

    /**
     * List all the available patches for this cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPatchesResponse> listPatches(
            ListPatchesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPatchesRequest, ListPatchesResponse> handler);

    /**
     * Returns information about the ResourcePrincipalConfiguration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListResourcePrincipalConfigurationsResponse>
            listResourcePrincipalConfigurations(
                    ListResourcePrincipalConfigurationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListResourcePrincipalConfigurationsRequest,
                                    ListResourcePrincipalConfigurationsResponse>
                            handler);

    /**
     * List all the available software updates for current cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSoftwareUpdatesResponse> listSoftwareUpdates(
            ListSoftwareUpdatesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSoftwareUpdatesRequest, ListSoftwareUpdatesResponse>
                    handler);

    /**
     * Returns a paginated list of errors for a work request identified by the given ID.
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
     * Lists the work requests in a compartment.
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
     * Refresh confidential application for the given identity configuration in case of any update
     * to the confidential application (e.g. regenerated client secret)
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RefreshConfidentialApplicationResponse>
            refreshConfidentialApplication(
                    RefreshConfidentialApplicationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RefreshConfidentialApplicationRequest,
                                    RefreshConfidentialApplicationResponse>
                            handler);

    /**
     * Refresh token exchange kerberos principal keytab for the UPST enabled identity configuration
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RefreshUpstTokenExchangeKeytabResponse>
            refreshUpstTokenExchangeKeytab(
                    RefreshUpstTokenExchangeKeytabRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RefreshUpstTokenExchangeKeytabRequest,
                                    RefreshUpstTokenExchangeKeytabResponse>
                            handler);

    /**
     * Deletes an autoscale configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemoveAutoScalingConfigurationResponse>
            removeAutoScalingConfiguration(
                    RemoveAutoScalingConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveAutoScalingConfigurationRequest,
                                    RemoveAutoScalingConfigurationResponse>
                            handler);

    /**
     * Removes Cloud SQL from the cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemoveCloudSqlResponse> removeCloudSql(
            RemoveCloudSqlRequest request,
            com.oracle.bmc.responses.AsyncHandler<RemoveCloudSqlRequest, RemoveCloudSqlResponse>
                    handler);

    /**
     * Remove Kafka from the cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemoveKafkaResponse> removeKafka(
            RemoveKafkaRequest request,
            com.oracle.bmc.responses.AsyncHandler<RemoveKafkaRequest, RemoveKafkaResponse> handler);

    /**
     * Remove a single node of a Big Data Service cluster
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemoveNodeResponse> removeNode(
            RemoveNodeRequest request,
            com.oracle.bmc.responses.AsyncHandler<RemoveNodeRequest, RemoveNodeResponse> handler);

    /**
     * Deletes a nodeReplaceConfiguration
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemoveNodeReplaceConfigurationResponse>
            removeNodeReplaceConfiguration(
                    RemoveNodeReplaceConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveNodeReplaceConfigurationRequest,
                                    RemoveNodeReplaceConfigurationResponse>
                            handler);

    /**
     * Delete the resource principal configuration for the cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemoveResourcePrincipalConfigurationResponse>
            removeResourcePrincipalConfiguration(
                    RemoveResourcePrincipalConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveResourcePrincipalConfigurationRequest,
                                    RemoveResourcePrincipalConfigurationResponse>
                            handler);

    /**
     * Renewing TLS/SSL for various ODH services running on the BDS cluster.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RenewCertificateResponse> renewCertificate(
            RenewCertificateRequest request,
            com.oracle.bmc.responses.AsyncHandler<RenewCertificateRequest, RenewCertificateResponse>
                    handler);

    /**
     * Replaces a node of a Big Data Service cluster from backup.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ReplaceNodeResponse> replaceNode(
            ReplaceNodeRequest request,
            com.oracle.bmc.responses.AsyncHandler<ReplaceNodeRequest, ReplaceNodeResponse> handler);

    /**
     * Restarts a single node of a Big Data Service cluster
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RestartNodeResponse> restartNode(
            RestartNodeRequest request,
            com.oracle.bmc.responses.AsyncHandler<RestartNodeRequest, RestartNodeResponse> handler);

    /**
     * Starts the BDS cluster that was stopped earlier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StartBdsInstanceResponse> startBdsInstance(
            StartBdsInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<StartBdsInstanceRequest, StartBdsInstanceResponse>
                    handler);

    /**
     * Stops the BDS cluster that can be started at later point of time.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StopBdsInstanceResponse> stopBdsInstance(
            StopBdsInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<StopBdsInstanceRequest, StopBdsInstanceResponse>
                    handler);

    /**
     * Test specified metastore configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<TestBdsMetastoreConfigurationResponse>
            testBdsMetastoreConfiguration(
                    TestBdsMetastoreConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    TestBdsMetastoreConfigurationRequest,
                                    TestBdsMetastoreConfigurationResponse>
                            handler);

    /**
     * Test access to specified Object Storage bucket using the API key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<TestBdsObjectStorageConnectionResponse>
            testBdsObjectStorageConnection(
                    TestBdsObjectStorageConnectionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    TestBdsObjectStorageConnectionRequest,
                                    TestBdsObjectStorageConnectionResponse>
                            handler);

    /**
     * Updates fields on an autoscale configuration, including the name, the threshold value, and
     * whether the autoscale configuration is enabled.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAutoScalingConfigurationResponse>
            updateAutoScalingConfiguration(
                    UpdateAutoScalingConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAutoScalingConfigurationRequest,
                                    UpdateAutoScalingConfigurationResponse>
                            handler);

    /**
     * Updates the Big Data Service cluster identified by the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateBdsInstanceResponse> updateBdsInstance(
            UpdateBdsInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateBdsInstanceRequest, UpdateBdsInstanceResponse>
                    handler);

    /**
     * Update the BDS metastore configuration represented by the provided ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateBdsMetastoreConfigurationResponse>
            updateBdsMetastoreConfiguration(
                    UpdateBdsMetastoreConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateBdsMetastoreConfigurationRequest,
                                    UpdateBdsMetastoreConfigurationResponse>
                            handler);

    /**
     * Update the IAM user sync and UPST configuration for the specified identity configuration
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateIdentityConfigurationResponse> updateIdentityConfiguration(
            UpdateIdentityConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateIdentityConfigurationRequest, UpdateIdentityConfigurationResponse>
                    handler);

    /**
     * Updates fields on NodeBackupConfiguration, including the name, the schedule.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateNodeBackupConfigurationResponse>
            updateNodeBackupConfiguration(
                    UpdateNodeBackupConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateNodeBackupConfigurationRequest,
                                    UpdateNodeBackupConfigurationResponse>
                            handler);

    /**
     * Updates fields on nodeReplaceConfigurations, including the name, the schedule
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateNodeReplaceConfigurationResponse>
            updateNodeReplaceConfiguration(
                    UpdateNodeReplaceConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateNodeReplaceConfigurationRequest,
                                    UpdateNodeReplaceConfigurationResponse>
                            handler);

    /**
     * Updates fields on resourcePrincipalConfiguration, including the name, the lifeSpanInHours of
     * the token.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateResourcePrincipalConfigurationResponse>
            updateResourcePrincipalConfiguration(
                    UpdateResourcePrincipalConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateResourcePrincipalConfigurationRequest,
                                    UpdateResourcePrincipalConfigurationResponse>
                            handler);
}
