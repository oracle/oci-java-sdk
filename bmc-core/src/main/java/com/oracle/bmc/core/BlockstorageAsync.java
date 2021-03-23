/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
public interface BlockstorageAsync extends AutoCloseable {

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
     * Moves a boot volume backup into a different compartment within the same tenancy.
     * For information about moving resources between compartments,
     * see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeBootVolumeBackupCompartmentResponse>
            changeBootVolumeBackupCompartment(
                    ChangeBootVolumeBackupCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeBootVolumeBackupCompartmentRequest,
                                    ChangeBootVolumeBackupCompartmentResponse>
                            handler);

    /**
     * Moves a boot volume into a different compartment within the same tenancy.
     * For information about moving resources between compartments,
     * see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeBootVolumeCompartmentResponse> changeBootVolumeCompartment(
            ChangeBootVolumeCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeBootVolumeCompartmentRequest, ChangeBootVolumeCompartmentResponse>
                    handler);

    /**
     * Moves a volume backup into a different compartment within the same tenancy.
     * For information about moving resources between compartments,
     * see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeVolumeBackupCompartmentResponse>
            changeVolumeBackupCompartment(
                    ChangeVolumeBackupCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeVolumeBackupCompartmentRequest,
                                    ChangeVolumeBackupCompartmentResponse>
                            handler);

    /**
     * Moves a volume into a different compartment within the same tenancy.
     * For information about moving resources between compartments,
     * see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeVolumeCompartmentResponse> changeVolumeCompartment(
            ChangeVolumeCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeVolumeCompartmentRequest, ChangeVolumeCompartmentResponse>
                    handler);

    /**
     * Moves a volume group backup into a different compartment within the same tenancy.
     * For information about moving resources between compartments,
     * see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeVolumeGroupBackupCompartmentResponse>
            changeVolumeGroupBackupCompartment(
                    ChangeVolumeGroupBackupCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeVolumeGroupBackupCompartmentRequest,
                                    ChangeVolumeGroupBackupCompartmentResponse>
                            handler);

    /**
     * Moves a volume group into a different compartment within the same tenancy.
     * For information about moving resources between compartments,
     * see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeVolumeGroupCompartmentResponse> changeVolumeGroupCompartment(
            ChangeVolumeGroupCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeVolumeGroupCompartmentRequest,
                            ChangeVolumeGroupCompartmentResponse>
                    handler);

    /**
     * Creates a boot volume backup copy in specified region. For general information about volume backups,
     * see [Overview of Boot Volume Backups](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/bootvolumebackups.htm)
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CopyBootVolumeBackupResponse> copyBootVolumeBackup(
            CopyBootVolumeBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CopyBootVolumeBackupRequest, CopyBootVolumeBackupResponse>
                    handler);

    /**
     * Creates a volume backup copy in specified region. For general information about volume backups,
     * see [Overview of Block Volume Service Backups](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/blockvolumebackups.htm)
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CopyVolumeBackupResponse> copyVolumeBackup(
            CopyVolumeBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<CopyVolumeBackupRequest, CopyVolumeBackupResponse>
                    handler);

    /**
     * Creates a new boot volume in the specified compartment from an existing boot volume or a boot volume backup.
     * For general information about boot volumes, see [Boot Volumes](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/bootvolumes.htm).
     * You may optionally specify a *display name* for the volume, which is simply a friendly name or
     * description. It does not have to be unique, and you can change it. Avoid entering confidential information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateBootVolumeResponse> createBootVolume(
            CreateBootVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateBootVolumeRequest, CreateBootVolumeResponse>
                    handler);

    /**
     * Creates a new boot volume backup of the specified boot volume. For general information about boot volume backups,
     * see [Overview of Boot Volume Backups](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/bootvolumebackups.htm)
     * <p>
     * When the request is received, the backup object is in a REQUEST_RECEIVED state.
     * When the data is imaged, it goes into a CREATING state.
     * After the backup is fully uploaded to the cloud, it goes into an AVAILABLE state.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateBootVolumeBackupResponse> createBootVolumeBackup(
            CreateBootVolumeBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateBootVolumeBackupRequest, CreateBootVolumeBackupResponse>
                    handler);

    /**
     * Creates a new volume in the specified compartment. Volumes can be created in sizes ranging from
     * 50 GB (51200 MB) to 32 TB (33554432 MB), in 1 GB (1024 MB) increments. By default, volumes are 1 TB (1048576 MB).
     * For general information about block volumes, see
     * [Overview of Block Volume Service](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/overview.htm).
     * <p>
     * A volume and instance can be in separate compartments but must be in the same availability domain.
     * For information about access control and compartments, see
     * [Overview of the IAM Service](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/overview.htm). For information about
     * availability domains, see [Regions and Availability Domains](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm).
     * To get a list of availability domains, use the `ListAvailabilityDomains` operation
     * in the Identity and Access Management Service API.
     * <p>
     * You may optionally specify a *display name* for the volume, which is simply a friendly name or
     * description. It does not have to be unique, and you can change it. Avoid entering confidential information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateVolumeResponse> createVolume(
            CreateVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateVolumeRequest, CreateVolumeResponse>
                    handler);

    /**
     * Creates a new backup of the specified volume. For general information about volume backups,
     * see [Overview of Block Volume Service Backups](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/blockvolumebackups.htm)
     * <p>
     * When the request is received, the backup object is in a REQUEST_RECEIVED state.
     * When the data is imaged, it goes into a CREATING state.
     * After the backup is fully uploaded to the cloud, it goes into an AVAILABLE state.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateVolumeBackupResponse> createVolumeBackup(
            CreateVolumeBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateVolumeBackupRequest, CreateVolumeBackupResponse>
                    handler);

    /**
     * Creates a new user defined backup policy.
     * <p>
     * For more information about Oracle defined backup policies and user defined backup policies,
     * see [Policy-Based Backups](https://docs.cloud.oracle.com/iaas/Content/Block/Tasks/schedulingvolumebackups.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateVolumeBackupPolicyResponse> createVolumeBackupPolicy(
            CreateVolumeBackupPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateVolumeBackupPolicyRequest, CreateVolumeBackupPolicyResponse>
                    handler);

    /**
     * Assigns a volume backup policy to the specified volume. Note that a given volume can
     * only have one backup policy assigned to it. If this operation is used for a volume that already
     * has a different backup policy assigned, the prior backup policy will be silently unassigned.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateVolumeBackupPolicyAssignmentResponse>
            createVolumeBackupPolicyAssignment(
                    CreateVolumeBackupPolicyAssignmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateVolumeBackupPolicyAssignmentRequest,
                                    CreateVolumeBackupPolicyAssignmentResponse>
                            handler);

    /**
     * Creates a new volume group in the specified compartment.
     * A volume group is a collection of volumes and may be created from a list of volumes, cloning an existing
     * volume group, or by restoring a volume group backup. A volume group can contain up to 64 volumes.
     * You may optionally specify a *display name* for the volume group, which is simply a friendly name or
     * description. It does not have to be unique, and you can change it. Avoid entering confidential information.
     * <p>
     * For more information, see [Volume Groups](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/volumegroups.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateVolumeGroupResponse> createVolumeGroup(
            CreateVolumeGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateVolumeGroupRequest, CreateVolumeGroupResponse>
                    handler);

    /**
     * Creates a new backup volume group of the specified volume group.
     * For more information, see [Volume Groups](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/volumegroups.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateVolumeGroupBackupResponse> createVolumeGroupBackup(
            CreateVolumeGroupBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateVolumeGroupBackupRequest, CreateVolumeGroupBackupResponse>
                    handler);

    /**
     * Deletes the specified boot volume. The volume cannot have an active connection to an instance.
     * To disconnect the boot volume from a connected instance, see
     * [Disconnecting From a Boot Volume](https://docs.cloud.oracle.com/iaas/Content/Block/Tasks/deletingbootvolume.htm).
     * **Warning:** All data on the boot volume will be permanently lost when the boot volume is deleted.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteBootVolumeResponse> deleteBootVolume(
            DeleteBootVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteBootVolumeRequest, DeleteBootVolumeResponse>
                    handler);

    /**
     * Deletes a boot volume backup.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteBootVolumeBackupResponse> deleteBootVolumeBackup(
            DeleteBootVolumeBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteBootVolumeBackupRequest, DeleteBootVolumeBackupResponse>
                    handler);

    /**
     * Removes the specified boot volume's assigned Key Management encryption key.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteBootVolumeKmsKeyResponse> deleteBootVolumeKmsKey(
            DeleteBootVolumeKmsKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteBootVolumeKmsKeyRequest, DeleteBootVolumeKmsKeyResponse>
                    handler);

    /**
     * Deletes the specified volume. The volume cannot have an active connection to an instance.
     * To disconnect the volume from a connected instance, see
     * [Disconnecting From a Volume](https://docs.cloud.oracle.com/iaas/Content/Block/Tasks/disconnectingfromavolume.htm).
     * **Warning:** All data on the volume will be permanently lost when the volume is deleted.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteVolumeResponse> deleteVolume(
            DeleteVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteVolumeRequest, DeleteVolumeResponse>
                    handler);

    /**
     * Deletes a volume backup.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteVolumeBackupResponse> deleteVolumeBackup(
            DeleteVolumeBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteVolumeBackupRequest, DeleteVolumeBackupResponse>
                    handler);

    /**
     * Deletes a user defined backup policy.
     *  For more information about user defined backup policies,
     *  see [Policy-Based Backups](https://docs.cloud.oracle.com/iaas/Content/Block/Tasks/schedulingvolumebackups.htm#UserDefinedBackupPolicies).
     * <p>
     * Avoid entering confidential information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteVolumeBackupPolicyResponse> deleteVolumeBackupPolicy(
            DeleteVolumeBackupPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteVolumeBackupPolicyRequest, DeleteVolumeBackupPolicyResponse>
                    handler);

    /**
     * Deletes a volume backup policy assignment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteVolumeBackupPolicyAssignmentResponse>
            deleteVolumeBackupPolicyAssignment(
                    DeleteVolumeBackupPolicyAssignmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteVolumeBackupPolicyAssignmentRequest,
                                    DeleteVolumeBackupPolicyAssignmentResponse>
                            handler);

    /**
     * Deletes the specified volume group. Individual volumes are not deleted, only the volume group is deleted.
     * For more information, see [Volume Groups](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/volumegroups.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteVolumeGroupResponse> deleteVolumeGroup(
            DeleteVolumeGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteVolumeGroupRequest, DeleteVolumeGroupResponse>
                    handler);

    /**
     * Deletes a volume group backup. This operation deletes all the backups in
     * the volume group. For more information, see [Volume Groups](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/volumegroups.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteVolumeGroupBackupResponse> deleteVolumeGroupBackup(
            DeleteVolumeGroupBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteVolumeGroupBackupRequest, DeleteVolumeGroupBackupResponse>
                    handler);

    /**
     * Removes the specified volume's assigned Key Management encryption key.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteVolumeKmsKeyResponse> deleteVolumeKmsKey(
            DeleteVolumeKmsKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteVolumeKmsKeyRequest, DeleteVolumeKmsKeyResponse>
                    handler);

    /**
     * Gets information for the specified boot volume.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetBootVolumeResponse> getBootVolume(
            GetBootVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetBootVolumeRequest, GetBootVolumeResponse>
                    handler);

    /**
     * Gets information for the specified boot volume backup.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetBootVolumeBackupResponse> getBootVolumeBackup(
            GetBootVolumeBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetBootVolumeBackupRequest, GetBootVolumeBackupResponse>
                    handler);

    /**
     * Gets the Key Management encryption key assigned to the specified boot volume.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetBootVolumeKmsKeyResponse> getBootVolumeKmsKey(
            GetBootVolumeKmsKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetBootVolumeKmsKeyRequest, GetBootVolumeKmsKeyResponse>
                    handler);

    /**
     * Gets information for the specified volume.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVolumeResponse> getVolume(
            GetVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetVolumeRequest, GetVolumeResponse> handler);

    /**
     * Gets information for the specified volume backup.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVolumeBackupResponse> getVolumeBackup(
            GetVolumeBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetVolumeBackupRequest, GetVolumeBackupResponse>
                    handler);

    /**
     * Gets information for the specified volume backup policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVolumeBackupPolicyResponse> getVolumeBackupPolicy(
            GetVolumeBackupPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetVolumeBackupPolicyRequest, GetVolumeBackupPolicyResponse>
                    handler);

    /**
     * Gets the volume backup policy assignment for the specified volume. The
     * `assetId` query parameter is required, and the returned list will contain at most
     * one item, since volume can only have one volume backup policy assigned at a time.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVolumeBackupPolicyAssetAssignmentResponse>
            getVolumeBackupPolicyAssetAssignment(
                    GetVolumeBackupPolicyAssetAssignmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetVolumeBackupPolicyAssetAssignmentRequest,
                                    GetVolumeBackupPolicyAssetAssignmentResponse>
                            handler);

    /**
     * Gets information for the specified volume backup policy assignment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVolumeBackupPolicyAssignmentResponse>
            getVolumeBackupPolicyAssignment(
                    GetVolumeBackupPolicyAssignmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetVolumeBackupPolicyAssignmentRequest,
                                    GetVolumeBackupPolicyAssignmentResponse>
                            handler);

    /**
     * Gets information for the specified volume group. For more information, see [Volume Groups](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/volumegroups.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVolumeGroupResponse> getVolumeGroup(
            GetVolumeGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetVolumeGroupRequest, GetVolumeGroupResponse>
                    handler);

    /**
     * Gets information for the specified volume group backup. For more information, see [Volume Groups](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/volumegroups.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVolumeGroupBackupResponse> getVolumeGroupBackup(
            GetVolumeGroupBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetVolumeGroupBackupRequest, GetVolumeGroupBackupResponse>
                    handler);

    /**
     * Gets the Key Management encryption key assigned to the specified volume.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVolumeKmsKeyResponse> getVolumeKmsKey(
            GetVolumeKmsKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetVolumeKmsKeyRequest, GetVolumeKmsKeyResponse>
                    handler);

    /**
     * Lists the boot volume backups in the specified compartment. You can filter the results by boot volume.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListBootVolumeBackupsResponse> listBootVolumeBackups(
            ListBootVolumeBackupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListBootVolumeBackupsRequest, ListBootVolumeBackupsResponse>
                    handler);

    /**
     * Lists the boot volumes in the specified compartment and availability domain.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListBootVolumesResponse> listBootVolumes(
            ListBootVolumesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListBootVolumesRequest, ListBootVolumesResponse>
                    handler);

    /**
     * Lists all the volume backup policies available in the specified compartment.
     * <p>
     * For more information about Oracle defined backup policies and user defined backup policies,
     * see [Policy-Based Backups](https://docs.cloud.oracle.com/iaas/Content/Block/Tasks/schedulingvolumebackups.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVolumeBackupPoliciesResponse> listVolumeBackupPolicies(
            ListVolumeBackupPoliciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListVolumeBackupPoliciesRequest, ListVolumeBackupPoliciesResponse>
                    handler);

    /**
     * Lists the volume backups in the specified compartment. You can filter the results by volume.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVolumeBackupsResponse> listVolumeBackups(
            ListVolumeBackupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListVolumeBackupsRequest, ListVolumeBackupsResponse>
                    handler);

    /**
     * Lists the volume group backups in the specified compartment. You can filter the results by volume group.
     * For more information, see [Volume Groups](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/volumegroups.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVolumeGroupBackupsResponse> listVolumeGroupBackups(
            ListVolumeGroupBackupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListVolumeGroupBackupsRequest, ListVolumeGroupBackupsResponse>
                    handler);

    /**
     * Lists the volume groups in the specified compartment and availability domain.
     * For more information, see [Volume Groups](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/volumegroups.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVolumeGroupsResponse> listVolumeGroups(
            ListVolumeGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListVolumeGroupsRequest, ListVolumeGroupsResponse>
                    handler);

    /**
     * Lists the volumes in the specified compartment and availability domain.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVolumesResponse> listVolumes(
            ListVolumesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListVolumesRequest, ListVolumesResponse> handler);

    /**
     * Updates the specified boot volume's display name, defined tags, and free-form tags.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateBootVolumeResponse> updateBootVolume(
            UpdateBootVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateBootVolumeRequest, UpdateBootVolumeResponse>
                    handler);

    /**
     * Updates the display name for the specified boot volume backup.
     * Avoid entering confidential information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateBootVolumeBackupResponse> updateBootVolumeBackup(
            UpdateBootVolumeBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateBootVolumeBackupRequest, UpdateBootVolumeBackupResponse>
                    handler);

    /**
     * Updates the specified volume with a new Key Management master encryption key.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateBootVolumeKmsKeyResponse> updateBootVolumeKmsKey(
            UpdateBootVolumeKmsKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateBootVolumeKmsKeyRequest, UpdateBootVolumeKmsKeyResponse>
                    handler);

    /**
     * Updates the specified volume's display name.
     * Avoid entering confidential information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateVolumeResponse> updateVolume(
            UpdateVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateVolumeRequest, UpdateVolumeResponse>
                    handler);

    /**
     * Updates the display name for the specified volume backup.
     * Avoid entering confidential information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateVolumeBackupResponse> updateVolumeBackup(
            UpdateVolumeBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateVolumeBackupRequest, UpdateVolumeBackupResponse>
                    handler);

    /**
     * Updates a user defined backup policy.
     *  For more information about user defined backup policies,
     *  see [Policy-Based Backups](https://docs.cloud.oracle.com/iaas/Content/Block/Tasks/schedulingvolumebackups.htm#UserDefinedBackupPolicies).
     * <p>
     * Avoid entering confidential information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateVolumeBackupPolicyResponse> updateVolumeBackupPolicy(
            UpdateVolumeBackupPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateVolumeBackupPolicyRequest, UpdateVolumeBackupPolicyResponse>
                    handler);

    /**
     * Updates the set of volumes in a volume group along with the display name. Use this operation
     * to add or remove volumes in a volume group. Specify the full list of volume IDs to include in the
     * volume group. If the volume ID is not specified in the call, it will be removed from the volume group.
     * Avoid entering confidential information.
     * <p>
     * For more information, see [Volume Groups](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/volumegroups.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateVolumeGroupResponse> updateVolumeGroup(
            UpdateVolumeGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateVolumeGroupRequest, UpdateVolumeGroupResponse>
                    handler);

    /**
     * Updates the display name for the specified volume group backup. For more information, see [Volume Groups](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/volumegroups.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateVolumeGroupBackupResponse> updateVolumeGroupBackup(
            UpdateVolumeGroupBackupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateVolumeGroupBackupRequest, UpdateVolumeGroupBackupResponse>
                    handler);

    /**
     * Updates the specified volume with a new Key Management master encryption key.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateVolumeKmsKeyResponse> updateVolumeKmsKey(
            UpdateVolumeKmsKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateVolumeKmsKeyRequest, UpdateVolumeKmsKeyResponse>
                    handler);
}
