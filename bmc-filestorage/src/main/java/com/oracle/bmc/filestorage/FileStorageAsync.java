/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage;

import com.oracle.bmc.filestorage.requests.*;
import com.oracle.bmc.filestorage.responses.*;

/**
 * Use the File Storage service API to manage file systems, mount targets, and snapshots. For more
 * information, see [Overview of File
 * Storage](https://docs.cloud.oracle.com/iaas/Content/File/Concepts/filestorageoverview.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
public interface FileStorageAsync extends AutoCloseable {

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
     * Moves a file system and its associated snapshots into a different compartment within the same
     * tenancy. For information about moving resources between compartments, see [Moving Resources
     * to a Different
     * Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes)
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeFileSystemCompartmentResponse> changeFileSystemCompartment(
            ChangeFileSystemCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeFileSystemCompartmentRequest, ChangeFileSystemCompartmentResponse>
                    handler);

    /**
     * Moves a file system snapshot policy into a different compartment within the same tenancy. For
     * information about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeFilesystemSnapshotPolicyCompartmentResponse>
            changeFilesystemSnapshotPolicyCompartment(
                    ChangeFilesystemSnapshotPolicyCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeFilesystemSnapshotPolicyCompartmentRequest,
                                    ChangeFilesystemSnapshotPolicyCompartmentResponse>
                            handler);

    /**
     * Moves a mount target and its associated export set or share set into a different compartment
     * within the same tenancy. For information about moving resources between compartments, see
     * [Moving Resources to a Different
     * Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes)
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeMountTargetCompartmentResponse> changeMountTargetCompartment(
            ChangeMountTargetCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeMountTargetCompartmentRequest,
                            ChangeMountTargetCompartmentResponse>
                    handler);

    /**
     * Moves an outbound connector into a different compartment within the same tenancy. For
     * information about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes)
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeOutboundConnectorCompartmentResponse>
            changeOutboundConnectorCompartment(
                    ChangeOutboundConnectorCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOutboundConnectorCompartmentRequest,
                                    ChangeOutboundConnectorCompartmentResponse>
                            handler);

    /**
     * Moves a replication and its replication target into a different compartment within the same
     * tenancy. For information about moving resources between compartments, see [Moving Resources
     * to a Different
     * Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeReplicationCompartmentResponse> changeReplicationCompartment(
            ChangeReplicationCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeReplicationCompartmentRequest,
                            ChangeReplicationCompartmentResponse>
                    handler);

    /**
     * Creates a new export in the specified export set, path, and file system.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateExportResponse> createExport(
            CreateExportRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateExportRequest, CreateExportResponse>
                    handler);

    /**
     * Creates a new file system in the specified compartment and availability domain. Instances can
     * mount file systems in another availability domain, but doing so might increase latency when
     * compared to mounting instances in the same availability domain.
     *
     * <p>After you create a file system, you can associate it with a mount target. Instances can
     * then mount the file system by connecting to the mount target's IP address. You can associate
     * a file system with more than one mount target at a time.
     *
     * <p>For information about access control and compartments, see [Overview of the IAM
     * Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm).
     *
     * <p>For information about Network Security Groups access control, see [Network Security
     * Groups](https://docs.cloud.oracle.com/Content/Network/Concepts/networksecuritygroups.htm).
     *
     * <p>For information about availability domains, see [Regions and Availability
     * Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm). To get a list
     * of availability domains, use the `ListAvailabilityDomains` operation in the Identity and
     * Access Management Service API.
     *
     * <p>All Oracle Cloud Infrastructure resources, including file systems, get an Oracle-assigned,
     * unique ID called an Oracle Cloud Identifier
     * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)). When you
     * create a resource, you can find its OCID in the response. You can also retrieve a resource's
     * OCID by using a List API operation on that resource type or by viewing the resource in the
     * Console.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateFileSystemResponse> createFileSystem(
            CreateFileSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateFileSystemRequest, CreateFileSystemResponse>
                    handler);

    /**
     * Creates a new file system snapshot policy in the specified compartment and availability
     * domain.
     *
     * <p>After you create a file system snapshot policy, you can associate it with file systems.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateFilesystemSnapshotPolicyResponse>
            createFilesystemSnapshotPolicy(
                    CreateFilesystemSnapshotPolicyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateFilesystemSnapshotPolicyRequest,
                                    CreateFilesystemSnapshotPolicyResponse>
                            handler);

    /**
     * Creates a new mount target in the specified compartment and subnet. You can associate a file
     * system with a mount target only when they exist in the same availability domain. Instances
     * can connect to mount targets in another availablity domain, but you might see higher latency
     * than with instances in the same availability domain as the mount target.
     *
     * <p>Mount targets have one or more private IP addresses that you can provide as the host
     * portion of remote target parameters in client mount commands. These private IP addresses are
     * listed in the privateIpIds property of the mount target and are highly available. Mount
     * targets also consume additional IP addresses in their subnet. Do not use /30 or smaller
     * subnets for mount target creation because they do not have sufficient available IP addresses.
     * Allow at least three IP addresses for each mount target.
     *
     * <p>For information about access control and compartments, see [Overview of the IAM
     * Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm).
     *
     * <p>For information about availability domains, see [Regions and Availability
     * Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm). To get a list
     * of availability domains, use the `ListAvailabilityDomains` operation in the Identity and
     * Access Management Service API.
     *
     * <p>All Oracle Cloud Infrastructure Services resources, including mount targets, get an
     * Oracle-assigned, unique ID called an Oracle Cloud Identifier
     * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)). When you
     * create a resource, you can find its OCID in the response. You can also retrieve a resource's
     * OCID by using a List API operation on that resource type, or by viewing the resource in the
     * Console.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateMountTargetResponse> createMountTarget(
            CreateMountTargetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateMountTargetRequest, CreateMountTargetResponse>
                    handler);

    /**
     * Creates a new outbound connector in the specified compartment. You can associate an outbound
     * connector with a mount target only when they exist in the same availability domain.
     *
     * <p>For information about access control and compartments, see [Overview of the IAM
     * Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm).
     *
     * <p>For information about availability domains, see [Regions and Availability
     * Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm). To get a list
     * of availability domains, use the `ListAvailabilityDomains` operation in the Identity and
     * Access Management Service API.
     *
     * <p>All Oracle Cloud Infrastructure Services resources, including outbound connectors, get an
     * Oracle-assigned, unique ID called an Oracle Cloud Identifier
     * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)). When you
     * create a resource, you can find its OCID in the response. You can also retrieve a resource's
     * OCID by using a List API operation on that resource type, or by viewing the resource in the
     * Console.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOutboundConnectorResponse> createOutboundConnector(
            CreateOutboundConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateOutboundConnectorRequest, CreateOutboundConnectorResponse>
                    handler);

    /**
     * Creates a new replication in the specified compartment. Replications are the primary resource
     * that governs the policy of cross-region replication between source and target file systems.
     * Replications are associated with a secondary resource called a {@link ReplicationTarget}
     * located in another availability domain. The associated replication target resource is
     * automatically created along with the replication resource. The replication retrieves the
     * delta of data between two snapshots of a source file system and sends it to the associated
     * `ReplicationTarget`, which retrieves the delta and applies it to the target file system. Only
     * unexported file systems can be used as target file systems. For more information, see [Using
     * Replication](https://docs.cloud.oracle.com/iaas/Content/File/Tasks/FSreplication.htm).
     *
     * <p>For information about access control and compartments, see [Overview of the IAM
     * Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm).
     *
     * <p>For information about availability domains, see [Regions and Availability
     * Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm). To get a list
     * of availability domains, use the `ListAvailabilityDomains` operation in the Identity and
     * Access Management Service API.
     *
     * <p>All Oracle Cloud Infrastructure Services resources, including replications, get an
     * Oracle-assigned, unique ID called an Oracle Cloud Identifier
     * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)). When you
     * create a resource, you can find its OCID in the response. You can also retrieve a resource's
     * OCID by using a List API operation on that resource type, or by viewing the resource in the
     * Console.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateReplicationResponse> createReplication(
            CreateReplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateReplicationRequest, CreateReplicationResponse>
                    handler);

    /**
     * Creates a new snapshot of the specified file system. You can access the snapshot at
     * `.snapshot/<name>`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSnapshotResponse> createSnapshot(
            CreateSnapshotRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResponse>
                    handler);

    /**
     * Deletes the specified export.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteExportResponse> deleteExport(
            DeleteExportRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteExportRequest, DeleteExportResponse>
                    handler);

    /**
     * Deletes the specified file system. Before you delete the file system, verify that no
     * remaining export resources still reference it. Deleting a file system also deletes all of its
     * snapshots.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteFileSystemResponse> deleteFileSystem(
            DeleteFileSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteFileSystemRequest, DeleteFileSystemResponse>
                    handler);

    /**
     * Deletes the specified file system snapshot policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteFilesystemSnapshotPolicyResponse>
            deleteFilesystemSnapshotPolicy(
                    DeleteFilesystemSnapshotPolicyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteFilesystemSnapshotPolicyRequest,
                                    DeleteFilesystemSnapshotPolicyResponse>
                            handler);

    /**
     * Deletes the specified mount target. This operation also deletes the mount target's VNICs.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMountTargetResponse> deleteMountTarget(
            DeleteMountTargetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteMountTargetRequest, DeleteMountTargetResponse>
                    handler);

    /**
     * Deletes the specified outbound connector.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOutboundConnectorResponse> deleteOutboundConnector(
            DeleteOutboundConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteOutboundConnectorRequest, DeleteOutboundConnectorResponse>
                    handler);

    /**
     * Deletes the specified replication and the the associated replication target.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteReplicationResponse> deleteReplication(
            DeleteReplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteReplicationRequest, DeleteReplicationResponse>
                    handler);

    /**
     * Deletes the specified replication target. This operation causes the immediate release of the
     * target file system if there are currently no delta application operations. If there is any
     * current delta being applied the delete operation is blocked until the current delta has been
     * completely applied.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteReplicationTargetResponse> deleteReplicationTarget(
            DeleteReplicationTargetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteReplicationTargetRequest, DeleteReplicationTargetResponse>
                    handler);

    /**
     * Deletes the specified snapshot.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSnapshotResponse> deleteSnapshot(
            DeleteSnapshotRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteSnapshotRequest, DeleteSnapshotResponse>
                    handler);

    /**
     * Provides estimates for replication created using specific file system.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EstimateReplicationResponse> estimateReplication(
            EstimateReplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            EstimateReplicationRequest, EstimateReplicationResponse>
                    handler);

    /**
     * Gets the specified export's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExportResponse> getExport(
            GetExportRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetExportRequest, GetExportResponse> handler);

    /**
     * Gets the specified export set's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExportSetResponse> getExportSet(
            GetExportSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetExportSetRequest, GetExportSetResponse>
                    handler);

    /**
     * Gets the specified file system's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetFileSystemResponse> getFileSystem(
            GetFileSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetFileSystemRequest, GetFileSystemResponse>
                    handler);

    /**
     * Gets the specified file system snapshot policy's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetFilesystemSnapshotPolicyResponse> getFilesystemSnapshotPolicy(
            GetFilesystemSnapshotPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetFilesystemSnapshotPolicyRequest, GetFilesystemSnapshotPolicyResponse>
                    handler);

    /**
     * Gets the specified mount target's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetMountTargetResponse> getMountTarget(
            GetMountTargetRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetMountTargetRequest, GetMountTargetResponse>
                    handler);

    /**
     * Gets the specified outbound connector's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOutboundConnectorResponse> getOutboundConnector(
            GetOutboundConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetOutboundConnectorRequest, GetOutboundConnectorResponse>
                    handler);

    /**
     * Gets the specified replication's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetReplicationResponse> getReplication(
            GetReplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetReplicationRequest, GetReplicationResponse>
                    handler);

    /**
     * Gets the specified replication target's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetReplicationTargetResponse> getReplicationTarget(
            GetReplicationTargetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetReplicationTargetRequest, GetReplicationTargetResponse>
                    handler);

    /**
     * Gets the specified snapshot's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSnapshotResponse> getSnapshot(
            GetSnapshotRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSnapshotRequest, GetSnapshotResponse> handler);

    /**
     * Lists the export set resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListExportSetsResponse> listExportSets(
            ListExportSetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListExportSetsRequest, ListExportSetsResponse>
                    handler);

    /**
     * Lists export resources by compartment, file system, or export set. You must specify an export
     * set ID, a file system ID, and / or a compartment ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListExportsResponse> listExports(
            ListExportsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListExportsRequest, ListExportsResponse> handler);

    /**
     * Lists the file system resources in the specified compartment, or by the specified compartment
     * and file system snapshot policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListFileSystemsResponse> listFileSystems(
            ListFileSystemsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListFileSystemsRequest, ListFileSystemsResponse>
                    handler);

    /**
     * Lists file system snapshot policies in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListFilesystemSnapshotPoliciesResponse>
            listFilesystemSnapshotPolicies(
                    ListFilesystemSnapshotPoliciesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListFilesystemSnapshotPoliciesRequest,
                                    ListFilesystemSnapshotPoliciesResponse>
                            handler);

    /**
     * Lists the mount target resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListMountTargetsResponse> listMountTargets(
            ListMountTargetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListMountTargetsRequest, ListMountTargetsResponse>
                    handler);

    /**
     * Lists the outbound connector resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOutboundConnectorsResponse> listOutboundConnectors(
            ListOutboundConnectorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListOutboundConnectorsRequest, ListOutboundConnectorsResponse>
                    handler);

    /**
     * Lists the replication target resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListReplicationTargetsResponse> listReplicationTargets(
            ListReplicationTargetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListReplicationTargetsRequest, ListReplicationTargetsResponse>
                    handler);

    /**
     * Lists the replication resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListReplicationsResponse> listReplications(
            ListReplicationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListReplicationsRequest, ListReplicationsResponse>
                    handler);

    /**
     * Lists snapshots of the specified file system, or by file system snapshot policy and
     * compartment, or by file system snapshot policy and file system.
     *
     * <p>If file system ID is not specified, a file system snapshot policy ID and compartment ID
     * must be specified.
     *
     * <p>Users can only sort by time created when listing snapshots by file system snapshot policy
     * ID and compartment ID (sort by name is NOT supported for listing snapshots by policy and
     * compartment).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSnapshotsResponse> listSnapshots(
            ListSnapshotsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSnapshotsRequest, ListSnapshotsResponse>
                    handler);

    /**
     * This operation pauses the scheduled snapshot creation and snapshot deletion of the policy and
     * updates the lifecycle state of the file system snapshot policy from ACTIVE to INACTIVE. When
     * a file system snapshot policy is paused, file systems that are associated with the policy
     * will not have scheduled snapshots created or deleted.
     *
     * <p>If the policy is already paused, or in the INACTIVE state, you cannot pause it again. You
     * can't pause a policy that is in a DELETING, DELETED, FAILED, CREATING or INACTIVE state;
     * attempts to pause a policy in these states result in a 409 conflict error.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PauseFilesystemSnapshotPolicyResponse>
            pauseFilesystemSnapshotPolicy(
                    PauseFilesystemSnapshotPolicyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    PauseFilesystemSnapshotPolicyRequest,
                                    PauseFilesystemSnapshotPolicyResponse>
                            handler);

    /**
     * This operation unpauses a paused file system snapshot policy and updates the lifecycle state
     * of the file system snapshot policy from INACTIVE to ACTIVE. By default, file system snapshot
     * policies are in the ACTIVE state. When a file system snapshot policy is not paused, or in the
     * ACTIVE state, file systems that are associated with the policy will have snapshots created
     * and deleted according to the schedules defined in the policy.
     *
     * <p>If the policy is already in the ACTIVE state, you cannot unpause it. You can't unpause a
     * policy that is in a DELETING, DELETED, FAILED, CREATING, or ACTIVE state; attempts to unpause
     * a policy in these states result in a 409 conflict error.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UnpauseFilesystemSnapshotPolicyResponse>
            unpauseFilesystemSnapshotPolicy(
                    UnpauseFilesystemSnapshotPolicyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UnpauseFilesystemSnapshotPolicyRequest,
                                    UnpauseFilesystemSnapshotPolicyResponse>
                            handler);

    /**
     * Updates the specified export's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExportResponse> updateExport(
            UpdateExportRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateExportRequest, UpdateExportResponse>
                    handler);

    /**
     * Updates the specified export set's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExportSetResponse> updateExportSet(
            UpdateExportSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateExportSetRequest, UpdateExportSetResponse>
                    handler);

    /**
     * Updates the specified file system's information. You can use this operation to rename a file
     * system.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateFileSystemResponse> updateFileSystem(
            UpdateFileSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateFileSystemRequest, UpdateFileSystemResponse>
                    handler);

    /**
     * Updates the specified file system snapshot policy's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateFilesystemSnapshotPolicyResponse>
            updateFilesystemSnapshotPolicy(
                    UpdateFilesystemSnapshotPolicyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateFilesystemSnapshotPolicyRequest,
                                    UpdateFilesystemSnapshotPolicyResponse>
                            handler);

    /**
     * Updates the specified mount target's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMountTargetResponse> updateMountTarget(
            UpdateMountTargetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateMountTargetRequest, UpdateMountTargetResponse>
                    handler);

    /**
     * Updates the specified outbound connector's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOutboundConnectorResponse> updateOutboundConnector(
            UpdateOutboundConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateOutboundConnectorRequest, UpdateOutboundConnectorResponse>
                    handler);

    /**
     * Updates the information for the specified replication and its associated replication target.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateReplicationResponse> updateReplication(
            UpdateReplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateReplicationRequest, UpdateReplicationResponse>
                    handler);

    /**
     * Updates the specified snapshot's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSnapshotResponse> updateSnapshot(
            UpdateSnapshotRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateSnapshotRequest, UpdateSnapshotResponse>
                    handler);

    /**
     * Validates keytab contents for the secret details passed on the request or validte keytab
     * contents associated with the mount target passed in the request. The keytabs are
     * deserialized, the contents are validated for compatibility and the principal, key version
     * number and encryption type of each entry is provided as part of the response.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ValidateKeyTabsResponse> validateKeyTabs(
            ValidateKeyTabsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ValidateKeyTabsRequest, ValidateKeyTabsResponse>
                    handler);
}
