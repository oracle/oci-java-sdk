/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.filestorage;

import com.oracle.bmc.filestorage.requests.*;
import com.oracle.bmc.filestorage.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
public interface FileStorageAsync extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

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
     * Moves a file system and its associated snapshots into a different compartment within the same tenancy. For information about moving resources between compartments, see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes)
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeFileSystemCompartmentResponse> changeFileSystemCompartment(
            ChangeFileSystemCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeFileSystemCompartmentRequest, ChangeFileSystemCompartmentResponse>
                    handler);

    /**
     * Moves a mount target and its associated export set into a different compartment within the same tenancy. For information about moving resources between compartments, see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes)
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeMountTargetCompartmentResponse> changeMountTargetCompartment(
            ChangeMountTargetCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeMountTargetCompartmentRequest,
                            ChangeMountTargetCompartmentResponse>
                    handler);

    /**
     * Creates a new export in the specified export set, path, and
     * file system.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateExportResponse> createExport(
            CreateExportRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateExportRequest, CreateExportResponse>
                    handler);

    /**
     * Creates a new file system in the specified compartment and
     * availability domain. Instances can mount file systems in
     * another availability domain, but doing so might increase
     * latency when compared to mounting instances in the same
     * availability domain.
     * <p>
     * After you create a file system, you can associate it with a mount
     * target. Instances can then mount the file system by connecting to the
     * mount target's IP address. You can associate a file system with
     * more than one mount target at a time.
     * <p>
     * For information about access control and compartments, see
     * [Overview of the IAM Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm).
     * <p>
     * For information about Network Security Groups access control, see
     * [Network Security Groups](https://docs.cloud.oracle.com/Content/Network/Concepts/networksecuritygroups.htm).
     * <p>
     * For information about availability domains, see [Regions and
     * Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm).
     * To get a list of availability domains, use the
     * `ListAvailabilityDomains` operation in the Identity and Access
     * Management Service API.
     * <p>
     * All Oracle Cloud Infrastructure resources, including
     * file systems, get an Oracle-assigned, unique ID called an Oracle
     * Cloud Identifier (OCID).  When you create a resource, you can
     * find its OCID in the response. You can also retrieve a
     * resource's OCID by using a List API operation on that resource
     * type or by viewing the resource in the Console.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateFileSystemResponse> createFileSystem(
            CreateFileSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateFileSystemRequest, CreateFileSystemResponse>
                    handler);

    /**
     * Creates a new mount target in the specified compartment and
     * subnet. You can associate a file system with a mount
     * target only when they exist in the same availability domain. Instances
     * can connect to mount targets in another availablity domain, but
     * you might see higher latency than with instances in the same
     * availability domain as the mount target.
     * <p>
     * Mount targets have one or more private IP addresses that you can
     * provide as the host portion of remote target parameters in
     * client mount commands. These private IP addresses are listed
     * in the privateIpIds property of the mount target and are highly available. Mount
     * targets also consume additional IP addresses in their subnet.
     * Do not use /30 or smaller subnets for mount target creation because they
     * do not have sufficient available IP addresses.
     * Allow at least three IP addresses for each mount target.
     * <p>
     * For information about access control and compartments, see
     * [Overview of the IAM
     * Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm).
     * <p>
     * For information about availability domains, see [Regions and
     * Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm).
     * To get a list of availability domains, use the
     * `ListAvailabilityDomains` operation in the Identity and Access
     * Management Service API.
     * <p>
     * All Oracle Cloud Infrastructure Services resources, including
     * mount targets, get an Oracle-assigned, unique ID called an
     * Oracle Cloud Identifier (OCID).  When you create a resource,
     * you can find its OCID in the response. You can also retrieve a
     * resource's OCID by using a List API operation on that resource
     * type, or by viewing the resource in the Console.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateMountTargetResponse> createMountTarget(
            CreateMountTargetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateMountTargetRequest, CreateMountTargetResponse>
                    handler);

    /**
     * Creates a new snapshot of the specified file system. You
     * can access the snapshot at `.snapshot/<name>`.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateSnapshotResponse> createSnapshot(
            CreateSnapshotRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResponse>
                    handler);

    /**
     * Deletes the specified export.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteExportResponse> deleteExport(
            DeleteExportRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteExportRequest, DeleteExportResponse>
                    handler);

    /**
     * Deletes the specified file system. Before you delete the file system,
     * verify that no remaining export resources still reference it. Deleting a
     * file system also deletes all of its snapshots.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteFileSystemResponse> deleteFileSystem(
            DeleteFileSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteFileSystemRequest, DeleteFileSystemResponse>
                    handler);

    /**
     * Deletes the specified mount target. This operation also deletes the
     * mount target's VNICs.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMountTargetResponse> deleteMountTarget(
            DeleteMountTargetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteMountTargetRequest, DeleteMountTargetResponse>
                    handler);

    /**
     * Deletes the specified snapshot.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSnapshotResponse> deleteSnapshot(
            DeleteSnapshotRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteSnapshotRequest, DeleteSnapshotResponse>
                    handler);

    /**
     * Gets the specified export's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetExportResponse> getExport(
            GetExportRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetExportRequest, GetExportResponse> handler);

    /**
     * Gets the specified export set's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
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
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetFileSystemResponse> getFileSystem(
            GetFileSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetFileSystemRequest, GetFileSystemResponse>
                    handler);

    /**
     * Gets the specified mount target's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetMountTargetResponse> getMountTarget(
            GetMountTargetRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetMountTargetRequest, GetMountTargetResponse>
                    handler);

    /**
     * Gets the specified snapshot's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetSnapshotResponse> getSnapshot(
            GetSnapshotRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSnapshotRequest, GetSnapshotResponse> handler);

    /**
     * Lists the export set resources in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListExportSetsResponse> listExportSets(
            ListExportSetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListExportSetsRequest, ListExportSetsResponse>
                    handler);

    /**
     * Lists export resources by compartment, file system, or export
     * set. You must specify an export set ID, a file system ID, and
     * / or a compartment ID.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListExportsResponse> listExports(
            ListExportsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListExportsRequest, ListExportsResponse> handler);

    /**
     * Lists the file system resources in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListFileSystemsResponse> listFileSystems(
            ListFileSystemsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListFileSystemsRequest, ListFileSystemsResponse>
                    handler);

    /**
     * Lists the mount target resources in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListMountTargetsResponse> listMountTargets(
            ListMountTargetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListMountTargetsRequest, ListMountTargetsResponse>
                    handler);

    /**
     * Lists snapshots of the specified file system.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSnapshotsResponse> listSnapshots(
            ListSnapshotsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSnapshotsRequest, ListSnapshotsResponse>
                    handler);

    /**
     * Updates the specified export's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
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
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExportSetResponse> updateExportSet(
            UpdateExportSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateExportSetRequest, UpdateExportSetResponse>
                    handler);

    /**
     * Updates the specified file system's information.
     * You can use this operation to rename a file system.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateFileSystemResponse> updateFileSystem(
            UpdateFileSystemRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateFileSystemRequest, UpdateFileSystemResponse>
                    handler);

    /**
     * Updates the specified mount target's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMountTargetResponse> updateMountTarget(
            UpdateMountTargetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateMountTargetRequest, UpdateMountTargetResponse>
                    handler);

    /**
     * Updates the specified snapshot's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSnapshotResponse> updateSnapshot(
            UpdateSnapshotRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateSnapshotRequest, UpdateSnapshotResponse>
                    handler);
}
