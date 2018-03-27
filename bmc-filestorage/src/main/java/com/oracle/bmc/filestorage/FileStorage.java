/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.filestorage;

import com.oracle.bmc.filestorage.requests.*;
import com.oracle.bmc.filestorage.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
public interface FileStorage extends AutoCloseable {

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
     * default endpoint format ({@link Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Creates a new export in the specified export set, path, and
     * file system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateExportResponse createExport(CreateExportRequest request);

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
     * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm).
     * <p>
     * For information about availability domains, see [Regions and
     * Availability Domains](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/regions.htm).
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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateFileSystemResponse createFileSystem(CreateFileSystemRequest request);

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
     * Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm).
     * <p>
     * For information about availability domains, see [Regions and
     * Availability Domains](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/regions.htm).
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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateMountTargetResponse createMountTarget(CreateMountTargetRequest request);

    /**
     * Creates a new snapshot of the specified file system. You
     * can access the snapshot at `.snapshot/<name>`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request);

    /**
     * Deletes the specified export.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteExportResponse deleteExport(DeleteExportRequest request);

    /**
     * Deletes the specified file system. Before you delete the file system,
     * verify that no remaining export resources still reference it. Deleting a
     * file system also deletes all of its snapshots.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteFileSystemResponse deleteFileSystem(DeleteFileSystemRequest request);

    /**
     * Deletes the specified mount target. This operation also deletes the
     * mount target's VNICs.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteMountTargetResponse deleteMountTarget(DeleteMountTargetRequest request);

    /**
     * Deletes the specified snapshot.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request);

    /**
     * Gets the specified export's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetExportResponse getExport(GetExportRequest request);

    /**
     * Gets the specified export set's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetExportSetResponse getExportSet(GetExportSetRequest request);

    /**
     * Gets the specified file system's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetFileSystemResponse getFileSystem(GetFileSystemRequest request);

    /**
     * Gets the specified mount target's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetMountTargetResponse getMountTarget(GetMountTargetRequest request);

    /**
     * Gets the specified snapshot's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetSnapshotResponse getSnapshot(GetSnapshotRequest request);

    /**
     * Lists the export set resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListExportSetsResponse listExportSets(ListExportSetsRequest request);

    /**
     * Lists the export resources in the specified compartment. You must
     * also specify an export set, a file system, or both.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListExportsResponse listExports(ListExportsRequest request);

    /**
     * Lists the file system resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListFileSystemsResponse listFileSystems(ListFileSystemsRequest request);

    /**
     * Lists the mount target resources in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListMountTargetsResponse listMountTargets(ListMountTargetsRequest request);

    /**
     * Lists snapshots of the specified file system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListSnapshotsResponse listSnapshots(ListSnapshotsRequest request);

    /**
     * Updates the specified export set's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateExportSetResponse updateExportSet(UpdateExportSetRequest request);

    /**
     * Updates the specified file system's information.
     * You can use this operation to rename a file system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateFileSystemResponse updateFileSystem(UpdateFileSystemRequest request);

    /**
     * Updates the specified mount target's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateMountTargetResponse updateMountTarget(UpdateMountTargetRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    FileStorageWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    FileStoragePaginators getPaginators();
}
