/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface Blockstorage extends AutoCloseable {

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
     * Creates a new boot volume in the specified compartment from an existing boot volume or a boot volume backup.
     * For general information about boot volumes, see [Boot Volumes](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Concepts/bootvolumes.htm).
     * You may optionally specify a *display name* for the volume, which is simply a friendly name or
     * description. It does not have to be unique, and you can change it. Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateBootVolumeResponse createBootVolume(CreateBootVolumeRequest request);

    /**
     * Creates a new boot volume backup of the specified boot volume. For general information about boot volume backups,
     * see [Overview of Boot Volume Backups](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Concepts/bootvolumebackups.htm)
     * <p>
     * When the request is received, the backup object is in a REQUEST_RECEIVED state.
     * When the data is imaged, it goes into a CREATING state.
     * After the backup is fully uploaded to the cloud, it goes into an AVAILABLE state.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateBootVolumeBackupResponse createBootVolumeBackup(CreateBootVolumeBackupRequest request);

    /**
     * Creates a new volume in the specified compartment. Volumes can be created in sizes ranging from
     * 50 GB (51200 MB) to 32 TB (33554432 MB), in 1 GB (1024 MB) increments. By default, volumes are 1 TB (1048576 MB).
     * For general information about block volumes, see
     * [Overview of Block Volume Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Concepts/overview.htm).
     * <p>
     * A volume and instance can be in separate compartments but must be in the same availability domain.
     * For information about access control and compartments, see
     * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm). For information about
     * availability domains, see [Regions and Availability Domains](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/regions.htm).
     * To get a list of availability domains, use the `ListAvailabilityDomains` operation
     * in the Identity and Access Management Service API.
     * <p>
     * You may optionally specify a *display name* for the volume, which is simply a friendly name or
     * description. It does not have to be unique, and you can change it. Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateVolumeResponse createVolume(CreateVolumeRequest request);

    /**
     * Creates a new backup of the specified volume. For general information about volume backups,
     * see [Overview of Block Volume Service Backups](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Concepts/blockvolumebackups.htm)
     * <p>
     * When the request is received, the backup object is in a REQUEST_RECEIVED state.
     * When the data is imaged, it goes into a CREATING state.
     * After the backup is fully uploaded to the cloud, it goes into an AVAILABLE state.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateVolumeBackupResponse createVolumeBackup(CreateVolumeBackupRequest request);

    /**
     * Assigns a policy to the specified asset, such as a volume. Note that a given asset can
     * only have one policy assigned to it; if this method is called for an asset that previously
     * has a different policy assigned, the prior assignment will be silently deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateVolumeBackupPolicyAssignmentResponse createVolumeBackupPolicyAssignment(
            CreateVolumeBackupPolicyAssignmentRequest request);

    /**
     * Creates a new volume group in the specified compartment.
     * A volume group is a collection of volumes and may be created from a list of volumes, cloning an existing
     * volume group, or by restoring a volume group backup. A volume group can contain up to 64 volumes.
     * You may optionally specify a *display name* for the volume group, which is simply a friendly name or
     * description. It does not have to be unique, and you can change it. Avoid entering confidential information.
     * <p>
     * For more information, see [Volume Groups](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Concepts/volumegroups.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateVolumeGroupResponse createVolumeGroup(CreateVolumeGroupRequest request);

    /**
     * Creates a new backup volume group of the specified volume group.
     * For more information, see [Volume Groups](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Concepts/volumegroups.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateVolumeGroupBackupResponse createVolumeGroupBackup(CreateVolumeGroupBackupRequest request);

    /**
     * Deletes the specified boot volume. The volume cannot have an active connection to an instance.
     * To disconnect the boot volume from a connected instance, see
     * [Disconnecting From a Boot Volume](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Tasks/deletingbootvolume.htm).
     * **Warning:** All data on the boot volume will be permanently lost when the boot volume is deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteBootVolumeResponse deleteBootVolume(DeleteBootVolumeRequest request);

    /**
     * Deletes a boot volume backup.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteBootVolumeBackupResponse deleteBootVolumeBackup(DeleteBootVolumeBackupRequest request);

    /**
     * Remove kms for the specific boot volume. If the volume doesn't use KMS, then do nothing.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteBootVolumeKmsKeyResponse deleteBootVolumeKmsKey(DeleteBootVolumeKmsKeyRequest request);

    /**
     * Deletes the specified volume. The volume cannot have an active connection to an instance.
     * To disconnect the volume from a connected instance, see
     * [Disconnecting From a Volume](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Tasks/disconnectingfromavolume.htm).
     * **Warning:** All data on the volume will be permanently lost when the volume is deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteVolumeResponse deleteVolume(DeleteVolumeRequest request);

    /**
     * Deletes a volume backup.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteVolumeBackupResponse deleteVolumeBackup(DeleteVolumeBackupRequest request);

    /**
     * Deletes a volume backup policy assignment (i.e. unassigns the policy from an asset).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteVolumeBackupPolicyAssignmentResponse deleteVolumeBackupPolicyAssignment(
            DeleteVolumeBackupPolicyAssignmentRequest request);

    /**
     * Deletes the specified volume group. Individual volumes are not deleted, only the volume group is deleted.
     * For more information, see [Volume Groups](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Concepts/volumegroups.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteVolumeGroupResponse deleteVolumeGroup(DeleteVolumeGroupRequest request);

    /**
     * Deletes a volume group backup. This operation deletes all the backups in the volume group. For more information, see [Volume Groups](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Concepts/volumegroups.htm).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteVolumeGroupBackupResponse deleteVolumeGroupBackup(DeleteVolumeGroupBackupRequest request);

    /**
     * Remove kms for the specific volume. If the volume doesn't use KMS, then do nothing.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteVolumeKmsKeyResponse deleteVolumeKmsKey(DeleteVolumeKmsKeyRequest request);

    /**
     * Gets information for the specified boot volume.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetBootVolumeResponse getBootVolume(GetBootVolumeRequest request);

    /**
     * Gets information for the specified boot volume backup.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetBootVolumeBackupResponse getBootVolumeBackup(GetBootVolumeBackupRequest request);

    /**
     * Gets kms key id for the specified boot volume.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetBootVolumeKmsKeyResponse getBootVolumeKmsKey(GetBootVolumeKmsKeyRequest request);

    /**
     * Gets information for the specified volume.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVolumeResponse getVolume(GetVolumeRequest request);

    /**
     * Gets information for the specified volume backup.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVolumeBackupResponse getVolumeBackup(GetVolumeBackupRequest request);

    /**
     * Gets information for the specified volume backup policy.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVolumeBackupPolicyResponse getVolumeBackupPolicy(GetVolumeBackupPolicyRequest request);

    /**
     * Gets the volume backup policy assignment for the specified asset. Note that the
     * assetId query parameter is required, and that the returned list will contain at most
     * one item (since any given asset can only have one policy assigned to it).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVolumeBackupPolicyAssetAssignmentResponse getVolumeBackupPolicyAssetAssignment(
            GetVolumeBackupPolicyAssetAssignmentRequest request);

    /**
     * Gets information for the specified volume backup policy assignment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVolumeBackupPolicyAssignmentResponse getVolumeBackupPolicyAssignment(
            GetVolumeBackupPolicyAssignmentRequest request);

    /**
     * Gets information for the specified volume group. For more information, see [Volume Groups](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Concepts/volumegroups.htm).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVolumeGroupResponse getVolumeGroup(GetVolumeGroupRequest request);

    /**
     * Gets information for the specified volume group backup. For more information, see [Volume Groups](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Concepts/volumegroups.htm).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVolumeGroupBackupResponse getVolumeGroupBackup(GetVolumeGroupBackupRequest request);

    /**
     * Gets kms key id for the specified volume.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVolumeKmsKeyResponse getVolumeKmsKey(GetVolumeKmsKeyRequest request);

    /**
     * Lists the boot volume backups in the specified compartment. You can filter the results by boot volume.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListBootVolumeBackupsResponse listBootVolumeBackups(ListBootVolumeBackupsRequest request);

    /**
     * Lists the boot volumes in the specified compartment and availability domain.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListBootVolumesResponse listBootVolumes(ListBootVolumesRequest request);

    /**
     * Lists all volume backup policies available to the caller.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListVolumeBackupPoliciesResponse listVolumeBackupPolicies(
            ListVolumeBackupPoliciesRequest request);

    /**
     * Lists the volume backups in the specified compartment. You can filter the results by volume.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListVolumeBackupsResponse listVolumeBackups(ListVolumeBackupsRequest request);

    /**
     * Lists the volume group backups in the specified compartment. You can filter the results by volume group.
     * For more information, see [Volume Groups](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Concepts/volumegroups.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListVolumeGroupBackupsResponse listVolumeGroupBackups(ListVolumeGroupBackupsRequest request);

    /**
     * Lists the volume groups in the specified compartment and availability domain.
     * For more information, see [Volume Groups](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Concepts/volumegroups.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListVolumeGroupsResponse listVolumeGroups(ListVolumeGroupsRequest request);

    /**
     * Lists the volumes in the specified compartment and availability domain.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListVolumesResponse listVolumes(ListVolumesRequest request);

    /**
     * Updates the specified boot volume's display name.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateBootVolumeResponse updateBootVolume(UpdateBootVolumeRequest request);

    /**
     * Updates the display name for the specified boot volume backup.
     * Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateBootVolumeBackupResponse updateBootVolumeBackup(UpdateBootVolumeBackupRequest request);

    /**
     * Update kms key id for the specific volume.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateBootVolumeKmsKeyResponse updateBootVolumeKmsKey(UpdateBootVolumeKmsKeyRequest request);

    /**
     * Updates the specified volume's display name.
     * Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateVolumeResponse updateVolume(UpdateVolumeRequest request);

    /**
     * Updates the display name for the specified volume backup.
     * Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateVolumeBackupResponse updateVolumeBackup(UpdateVolumeBackupRequest request);

    /**
     * Updates the set of volumes in a volume group along with the display name. Use this operation
     * to add or remove volumes in a volume group. Specify the full list of volume IDs to include in the
     * volume group. If the volume ID is not specified in the call, it will be removed from the volume group.
     * Avoid entering confidential information.
     * <p>
     * For more information, see [Volume Groups](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Concepts/volumegroups.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateVolumeGroupResponse updateVolumeGroup(UpdateVolumeGroupRequest request);

    /**
     * Updates the display name for the specified volume group backup. For more information, see [Volume Groups](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Concepts/volumegroups.htm).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateVolumeGroupBackupResponse updateVolumeGroupBackup(UpdateVolumeGroupBackupRequest request);

    /**
     * Update kms key id for the specific volume.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateVolumeKmsKeyResponse updateVolumeKmsKey(UpdateVolumeKmsKeyRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    BlockstorageWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    BlockstoragePaginators getPaginators();
}
