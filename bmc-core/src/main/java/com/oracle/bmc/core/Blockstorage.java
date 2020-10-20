/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

/**
 * API covering the [Networking](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/overview.htm),
 * [Compute](https://docs.cloud.oracle.com/iaas/Content/Compute/Concepts/computeoverview.htm), and
 * [Block Volume](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/overview.htm) services. Use this API
 * to manage resources such as virtual cloud networks (VCNs), compute instances, and
 * block storage volumes.
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface Blockstorage extends AutoCloseable {

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
     * Moves a boot volume backup into a different compartment within the same tenancy.
     * For information about moving resources between compartments,
     * see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeBootVolumeBackupCompartmentResponse changeBootVolumeBackupCompartment(
            ChangeBootVolumeBackupCompartmentRequest request);

    /**
     * Moves a boot volume into a different compartment within the same tenancy.
     * For information about moving resources between compartments,
     * see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeBootVolumeCompartmentResponse changeBootVolumeCompartment(
            ChangeBootVolumeCompartmentRequest request);

    /**
     * Moves a volume backup into a different compartment within the same tenancy.
     * For information about moving resources between compartments,
     * see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeVolumeBackupCompartmentResponse changeVolumeBackupCompartment(
            ChangeVolumeBackupCompartmentRequest request);

    /**
     * Moves a volume into a different compartment within the same tenancy.
     * For information about moving resources between compartments,
     * see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeVolumeCompartmentResponse changeVolumeCompartment(ChangeVolumeCompartmentRequest request);

    /**
     * Moves a volume group backup into a different compartment within the same tenancy.
     * For information about moving resources between compartments,
     * see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeVolumeGroupBackupCompartmentResponse changeVolumeGroupBackupCompartment(
            ChangeVolumeGroupBackupCompartmentRequest request);

    /**
     * Moves a volume group into a different compartment within the same tenancy.
     * For information about moving resources between compartments,
     * see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeVolumeGroupCompartmentResponse changeVolumeGroupCompartment(
            ChangeVolumeGroupCompartmentRequest request);

    /**
     * Creates a boot volume backup copy in specified region. For general information about volume backups,
     * see [Overview of Boot Volume Backups](https://docs.cloud.oracle.com/Content/Block/Concepts/bootvolumebackups.htm)
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CopyBootVolumeBackupResponse copyBootVolumeBackup(CopyBootVolumeBackupRequest request);

    /**
     * Creates a volume backup copy in specified region. For general information about volume backups,
     * see [Overview of Block Volume Service Backups](https://docs.cloud.oracle.com/Content/Block/Concepts/blockvolumebackups.htm)
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CopyVolumeBackupResponse copyVolumeBackup(CopyVolumeBackupRequest request);

    /**
     * Creates a new boot volume in the specified compartment from an existing boot volume or a boot volume backup.
     * For general information about boot volumes, see [Boot Volumes](https://docs.cloud.oracle.com/Content/Block/Concepts/bootvolumes.htm).
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
     * see [Overview of Boot Volume Backups](https://docs.cloud.oracle.com/Content/Block/Concepts/bootvolumebackups.htm)
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
     * [Overview of Block Volume Service](https://docs.cloud.oracle.com/Content/Block/Concepts/overview.htm).
     * <p>
     * A volume and instance can be in separate compartments but must be in the same availability domain.
     * For information about access control and compartments, see
     * [Overview of the IAM Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm). For information about
     * availability domains, see [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm).
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
     * see [Overview of Block Volume Service Backups](https://docs.cloud.oracle.com/Content/Block/Concepts/blockvolumebackups.htm)
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
     * Creates a new user defined backup policy.
     * <p>
     * For more information about Oracle defined backup policies and user defined backup policies,
     * see [Policy-Based Backups](https://docs.cloud.oracle.com/iaas/Content/Block/Tasks/schedulingvolumebackups.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateVolumeBackupPolicyResponse createVolumeBackupPolicy(
            CreateVolumeBackupPolicyRequest request);

    /**
     * Assigns a volume backup policy to the specified volume. Note that a given volume can
     * only have one backup policy assigned to it. If this operation is used for a volume that already
     * has a different backup policy assigned, the prior backup policy will be silently unassigned.
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
     * For more information, see [Volume Groups](https://docs.cloud.oracle.com/Content/Block/Concepts/volumegroups.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateVolumeGroupResponse createVolumeGroup(CreateVolumeGroupRequest request);

    /**
     * Creates a new backup volume group of the specified volume group.
     * For more information, see [Volume Groups](https://docs.cloud.oracle.com/Content/Block/Concepts/volumegroups.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateVolumeGroupBackupResponse createVolumeGroupBackup(CreateVolumeGroupBackupRequest request);

    /**
     * Deletes the specified boot volume. The volume cannot have an active connection to an instance.
     * To disconnect the boot volume from a connected instance, see
     * [Disconnecting From a Boot Volume](https://docs.cloud.oracle.com/Content/Block/Tasks/deletingbootvolume.htm).
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
     * Removes the specified boot volume's assigned Key Management encryption key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteBootVolumeKmsKeyResponse deleteBootVolumeKmsKey(DeleteBootVolumeKmsKeyRequest request);

    /**
     * Deletes the specified volume. The volume cannot have an active connection to an instance.
     * To disconnect the volume from a connected instance, see
     * [Disconnecting From a Volume](https://docs.cloud.oracle.com/Content/Block/Tasks/disconnectingfromavolume.htm).
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
     * Deletes a user defined backup policy.
     *  For more information about user defined backup policies,
     *  see [Policy-Based Backups](https://docs.cloud.oracle.com/iaas/Content/Block/Tasks/schedulingvolumebackups.htm#UserDefinedBackupPolicies).
     * <p>
     * Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteVolumeBackupPolicyResponse deleteVolumeBackupPolicy(
            DeleteVolumeBackupPolicyRequest request);

    /**
     * Deletes a volume backup policy assignment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteVolumeBackupPolicyAssignmentResponse deleteVolumeBackupPolicyAssignment(
            DeleteVolumeBackupPolicyAssignmentRequest request);

    /**
     * Deletes the specified volume group. Individual volumes are not deleted, only the volume group is deleted.
     * For more information, see [Volume Groups](https://docs.cloud.oracle.com/Content/Block/Concepts/volumegroups.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteVolumeGroupResponse deleteVolumeGroup(DeleteVolumeGroupRequest request);

    /**
     * Deletes a volume group backup. This operation deletes all the backups in the volume group. For more information, see [Volume Groups](https://docs.cloud.oracle.com/Content/Block/Concepts/volumegroups.htm).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteVolumeGroupBackupResponse deleteVolumeGroupBackup(DeleteVolumeGroupBackupRequest request);

    /**
     * Removes the specified volume's assigned Key Management encryption key.
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
     * Gets the Key Management encryption key assigned to the specified boot volume.
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
     * Gets the volume backup policy assignment for the specified volume. The
     * `assetId` query parameter is required, and the returned list will contain at most
     * one item, since volume can only have one volume backup policy assigned at a time.
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
     * Gets information for the specified volume group. For more information, see [Volume Groups](https://docs.cloud.oracle.com/Content/Block/Concepts/volumegroups.htm).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVolumeGroupResponse getVolumeGroup(GetVolumeGroupRequest request);

    /**
     * Gets information for the specified volume group backup. For more information, see [Volume Groups](https://docs.cloud.oracle.com/Content/Block/Concepts/volumegroups.htm).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVolumeGroupBackupResponse getVolumeGroupBackup(GetVolumeGroupBackupRequest request);

    /**
     * Gets the Key Management encryption key assigned to the specified volume.
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
     * Lists all the volume backup policies available in the specified compartment.
     * <p>
     * For more information about Oracle defined backup policies and user defined backup policies,
     * see [Policy-Based Backups](https://docs.cloud.oracle.com/iaas/Content/Block/Tasks/schedulingvolumebackups.htm).
     *
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
     * For more information, see [Volume Groups](https://docs.cloud.oracle.com/Content/Block/Concepts/volumegroups.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListVolumeGroupBackupsResponse listVolumeGroupBackups(ListVolumeGroupBackupsRequest request);

    /**
     * Lists the volume groups in the specified compartment and availability domain.
     * For more information, see [Volume Groups](https://docs.cloud.oracle.com/Content/Block/Concepts/volumegroups.htm).
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
     * Updates the specified boot volume's display name, defined tags, and free-form tags.
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
     * Updates the specified volume with a new Key Management master encryption key.
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
     * Updates a user defined backup policy.
     *  For more information about user defined backup policies,
     *  see [Policy-Based Backups](https://docs.cloud.oracle.com/iaas/Content/Block/Tasks/schedulingvolumebackups.htm#UserDefinedBackupPolicies).
     * <p>
     * Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateVolumeBackupPolicyResponse updateVolumeBackupPolicy(
            UpdateVolumeBackupPolicyRequest request);

    /**
     * Updates the set of volumes in a volume group along with the display name. Use this operation
     * to add or remove volumes in a volume group. Specify the full list of volume IDs to include in the
     * volume group. If the volume ID is not specified in the call, it will be removed from the volume group.
     * Avoid entering confidential information.
     * <p>
     * For more information, see [Volume Groups](https://docs.cloud.oracle.com/Content/Block/Concepts/volumegroups.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateVolumeGroupResponse updateVolumeGroup(UpdateVolumeGroupRequest request);

    /**
     * Updates the display name for the specified volume group backup. For more information, see [Volume Groups](https://docs.cloud.oracle.com/Content/Block/Concepts/volumegroups.htm).
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateVolumeGroupBackupResponse updateVolumeGroupBackup(UpdateVolumeGroupBackupRequest request);

    /**
     * Updates the specified volume with a new Key Management master encryption key.
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
     * @deprecated use {@link #newWaiters(WorkRequest)} instead.  Otherwise, a default one will be provided
     *   that does not support operations that rely on the {@code WorkRequestClient} for polling.  An
     *   {@code IllegalStateException} will be thrown for such operations.
     */
    @Deprecated
    BlockstorageWaiters getWaiters();

    /**
     * Creates a new {@code BlockstorageWaiters} for resources for this service.
     *
     * @param workRequestClient The work request service client used to query for work request status
     * @return The service waiters.
     */
    BlockstorageWaiters newWaiters(com.oracle.bmc.workrequests.WorkRequest workRequestClient);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    BlockstoragePaginators getPaginators();
}
