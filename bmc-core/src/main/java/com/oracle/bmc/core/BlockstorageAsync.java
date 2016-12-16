/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.responses.AsyncHandler;

import java.util.concurrent.Future;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

import com.oracle.bmc.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface BlockstorageAsync extends AutoCloseable {

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
    void setRegion(Region region);

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
     * Creates a new volume in the specified compartment. The size of a volume can be either 256 GB or 2 TB.
     * For general information about block volumes, see
     * [Overview of Block Volume Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Concepts/overview.htm)
     * <p>
     * A volume and instance can be in separate compartments but must be in the same Availability Domain.
     * For information about access control and compartments, see
     * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm). For information about
     * Availability Domains, see [Regions and Availability Domains](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/regions.htm).
     * To get a list of Availability Domains, use the `ListAvailabilityDomains` operation
     * in the Identity and Access Management Service API.
     * <p>
     * You may optionally specify a *display name* for the volume, which is simply a friendly name or
     * description. It does not have to be unique, and you can change it.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     * <p>
     * For information about endpoints and signing API requests, see
     * [About the API](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/usingapi.htm). For information about available SDKs and tools, see
     * [SDKS and Other Tools](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/sdks.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<CreateVolumeResponse> createVolume(
            CreateVolumeRequest request,
            AsyncHandler<CreateVolumeRequest, CreateVolumeResponse> handler);

    /**
     * Creates a new backup of the specified volume. For general information about volume backups,
     * see [Overview of Block Volume Service Backups](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Concepts/blockvolumebackups.htm)
     * <p>
     * When the request is received, the backup object is in a REQUEST_RECEIVED state.
     * When the data is imaged, it goes into a CREATING state.
     * After the backup is fully uploaded to the cloud, it goes into an AVAILABLE state.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<CreateVolumeBackupResponse> createVolumeBackup(
            CreateVolumeBackupRequest request,
            AsyncHandler<CreateVolumeBackupRequest, CreateVolumeBackupResponse> handler);

    /**
     * Deletes the specified volume. The volume cannot have an active connection to an instance.
     * To disconnect the volume from a connected instance, see
     * [Disconnecting From a Volume](https://docs.us-phoenix-1.oraclecloud.com/Content/Block/Tasks/disconnectingfromavolume.htm).
     * **Warning:** All data on the volume will be permanently lost when the volume is deleted.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<DeleteVolumeResponse> deleteVolume(
            DeleteVolumeRequest request,
            AsyncHandler<DeleteVolumeRequest, DeleteVolumeResponse> handler);

    /**
     * Deletes a volume backup.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<DeleteVolumeBackupResponse> deleteVolumeBackup(
            DeleteVolumeBackupRequest request,
            AsyncHandler<DeleteVolumeBackupRequest, DeleteVolumeBackupResponse> handler);

    /**
     * Gets information for the specified volume.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<GetVolumeResponse> getVolume(
            GetVolumeRequest request, AsyncHandler<GetVolumeRequest, GetVolumeResponse> handler);

    /**
     * Gets information for the specified volume backup.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<GetVolumeBackupResponse> getVolumeBackup(
            GetVolumeBackupRequest request,
            AsyncHandler<GetVolumeBackupRequest, GetVolumeBackupResponse> handler);

    /**
     * Gets a list of volume backups in the specified compartment. You can filter the results by volume.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<ListVolumeBackupsResponse> listVolumeBackups(
            ListVolumeBackupsRequest request,
            AsyncHandler<ListVolumeBackupsRequest, ListVolumeBackupsResponse> handler);

    /**
     * Gets a list of volumes in the specified compartment and Availability Domain.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<ListVolumesResponse> listVolumes(
            ListVolumesRequest request,
            AsyncHandler<ListVolumesRequest, ListVolumesResponse> handler);

    /**
     * Updates the specified volume's display name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<UpdateVolumeResponse> updateVolume(
            UpdateVolumeRequest request,
            AsyncHandler<UpdateVolumeRequest, UpdateVolumeResponse> handler);

    /**
     * Updates the display name for the specified volume backup.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<UpdateVolumeBackupResponse> updateVolumeBackup(
            UpdateVolumeBackupRequest request,
            AsyncHandler<UpdateVolumeBackupRequest, UpdateVolumeBackupResponse> handler);
}
