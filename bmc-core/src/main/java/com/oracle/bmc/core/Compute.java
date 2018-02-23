/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface Compute extends AutoCloseable {

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
     * Attaches the specified boot volume to the specified instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    AttachBootVolumeResponse attachBootVolume(AttachBootVolumeRequest request);

    /**
     * Creates a secondary VNIC and attaches it to the specified instance.
     * For more information about secondary VNICs, see
     * [Virtual Network Interface Cards (VNICs)](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingVNICs.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    AttachVnicResponse attachVnic(AttachVnicRequest request);

    /**
     * Attaches the specified storage volume to the specified instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    AttachVolumeResponse attachVolume(AttachVolumeRequest request);

    /**
     * Captures the most recent serial console data (up to a megabyte) for the
     * specified instance.
     * <p>
     * The `CaptureConsoleHistory` operation works with the other console history operations
     * as described below.
     * <p>
     * 1. Use `CaptureConsoleHistory` to request the capture of up to a megabyte of the
     * most recent console history. This call returns a `ConsoleHistory`
     * object. The object will have a state of REQUESTED.
     * 2. Wait for the capture operation to succeed by polling `GetConsoleHistory` with
     * the identifier of the console history metadata. The state of the
     * `ConsoleHistory` object will go from REQUESTED to GETTING-HISTORY and
     * then SUCCEEDED (or FAILED).
     * 3. Use `GetConsoleHistoryContent` to get the actual console history data (not the
     * metadata).
     * 4. Optionally, use `DeleteConsoleHistory` to delete the console history metadata
     * and the console history data.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CaptureConsoleHistoryResponse captureConsoleHistory(CaptureConsoleHistoryRequest request);

    /**
     * Creates a boot disk image for the specified instance or imports an exported image from the Oracle Cloud Infrastructure Object Storage service.
     * <p>
     * When creating a new image, you must provide the OCID of the instance you want to use as the basis for the image, and
     * the OCID of the compartment containing that instance. For more information about images,
     * see [Managing Custom Images](https://docs.us-phoenix-1.oraclecloud.com/Content/Compute/Tasks/managingcustomimages.htm).
     * <p>
     * When importing an exported image from Object Storage, you specify the source information
     * in {@link #imageSourceDetails(ImageSourceDetailsRequest) imageSourceDetails}.
     * <p>
     * When importing an image based on the namespace, bucket name, and object name,
     * use {@link #imageSourceViaObjectStorageTupleDetails(ImageSourceViaObjectStorageTupleDetailsRequest) imageSourceViaObjectStorageTupleDetails}.
     * <p>
     * When importing an image based on the Object Storage URL, use
     * {@link #imageSourceViaObjectStorageUriDetails(ImageSourceViaObjectStorageUriDetailsRequest) imageSourceViaObjectStorageUriDetails}.
     * See [Object Storage URLs](https://docs.us-phoenix-1.oraclecloud.com/Content/Compute/Tasks/imageimportexport.htm#URLs) and [pre-authenticated requests](https://docs.us-phoenix-1.oraclecloud.com/Content/Object/Tasks/managingaccess.htm#pre-auth)
     * for constructing URLs for image import/export.
     * <p>
     * For more information about importing exported images, see
     * [Image Import/Export](https://docs.us-phoenix-1.oraclecloud.com/Content/Compute/Tasks/imageimportexport.htm).
     * <p>
     * You may optionally specify a *display name* for the image, which is simply a friendly name or description.
     * It does not have to be unique, and you can change it. See {@link #updateImage(UpdateImageRequest) updateImage}.
     * Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateImageResponse createImage(CreateImageRequest request);

    /**
     * Creates a new console connection to the specified instance.
     * Once the console connection has been created and is available,
     * you connect to the console using SSH.
     * <p>
     * For more information about console access, see [Accessing the Console](https://docs.us-phoenix-1.oraclecloud.com/Content/Compute/References/serialconsole.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateInstanceConsoleConnectionResponse createInstanceConsoleConnection(
            CreateInstanceConsoleConnectionRequest request);

    /**
     * Deletes the specified console history metadata and the console history data.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteConsoleHistoryResponse deleteConsoleHistory(DeleteConsoleHistoryRequest request);

    /**
     * Deletes an image.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteImageResponse deleteImage(DeleteImageRequest request);

    /**
     * Deletes the specified instance console connection.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteInstanceConsoleConnectionResponse deleteInstanceConsoleConnection(
            DeleteInstanceConsoleConnectionRequest request);

    /**
     * Detaches a boot volume from an instance. You must specify the OCID of the boot volume attachment.
     * <p>
     * This is an asynchronous operation. The attachment's `lifecycleState` will change to DETACHING temporarily
     * until the attachment is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DetachBootVolumeResponse detachBootVolume(DetachBootVolumeRequest request);

    /**
     * Detaches and deletes the specified secondary VNIC.
     * This operation cannot be used on the instance's primary VNIC.
     * When you terminate an instance, all attached VNICs (primary
     * and secondary) are automatically detached and deleted.
     * <p>
     **Important:** If the VNIC has a
     * {@link PrivateIp} that is the
     * [target of a route rule](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingroutetables.htm#privateip),
     * deleting the VNIC causes that route rule to blackhole and the traffic
     * will be dropped.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DetachVnicResponse detachVnic(DetachVnicRequest request);

    /**
     * Detaches a storage volume from an instance. You must specify the OCID of the volume attachment.
     * <p>
     * This is an asynchronous operation. The attachment's `lifecycleState` will change to DETACHING temporarily
     * until the attachment is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DetachVolumeResponse detachVolume(DetachVolumeRequest request);

    /**
     * Exports the specified image to the Oracle Cloud Infrastructure Object Storage service. You can use the Object Storage URL,
     * or the namespace, bucket name, and object name when specifying the location to export to.
     * <p>
     * For more information about exporting images, see [Image Import/Export](https://docs.us-phoenix-1.oraclecloud.com/Content/Compute/Tasks/imageimportexport.htm).
     * <p>
     * To perform an image export, you need write access to the Object Storage bucket for the image,
     * see [Let Users Write Objects to Object Storage Buckets](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/commonpolicies.htm#Let4).
     * <p>
     * See [Object Storage URLs](https://docs.us-phoenix-1.oraclecloud.com/Content/Compute/Tasks/imageimportexport.htm#URLs) and [pre-authenticated requests](https://docs.us-phoenix-1.oraclecloud.com/Content/Object/Tasks/managingaccess.htm#pre-auth)
     * for constructing URLs for image import/export.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ExportImageResponse exportImage(ExportImageRequest request);

    /**
     * Gets information about the specified boot volume attachment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetBootVolumeAttachmentResponse getBootVolumeAttachment(GetBootVolumeAttachmentRequest request);

    /**
     * Shows the metadata for the specified console history.
     * See {@link #captureConsoleHistory(CaptureConsoleHistoryRequest) captureConsoleHistory}
     * for details about using the console history operations.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetConsoleHistoryResponse getConsoleHistory(GetConsoleHistoryRequest request);

    /**
     * Gets the actual console history data (not the metadata).
     * See {@link #captureConsoleHistory(CaptureConsoleHistoryRequest) captureConsoleHistory}
     * for details about using the console history operations.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetConsoleHistoryContentResponse getConsoleHistoryContent(
            GetConsoleHistoryContentRequest request);

    /**
     * Gets the specified image.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetImageResponse getImage(GetImageRequest request);

    /**
     * Gets information about the specified instance.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetInstanceResponse getInstance(GetInstanceRequest request);

    /**
     * Gets the specified instance console connection's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetInstanceConsoleConnectionResponse getInstanceConsoleConnection(
            GetInstanceConsoleConnectionRequest request);

    /**
     * Gets the information for the specified VNIC attachment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVnicAttachmentResponse getVnicAttachment(GetVnicAttachmentRequest request);

    /**
     * Gets information about the specified volume attachment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVolumeAttachmentResponse getVolumeAttachment(GetVolumeAttachmentRequest request);

    /**
     * Gets the generated credentials for the instance. Only works for Windows instances. The returned credentials
     * are only valid for the initial login.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetWindowsInstanceInitialCredentialsResponse getWindowsInstanceInitialCredentials(
            GetWindowsInstanceInitialCredentialsRequest request);

    /**
     * Performs one of the power actions (start, stop, softreset, or reset)
     * on the specified instance.
     * <p>
     **start** - power on
     * <p>
     **stop** - power off
     * <p>
     **softreset** - ACPI shutdown and power on
     * <p>
     **reset** - power off and power on
     * <p>
     * Note that the **stop** state has no effect on the resources you consume.
     * Billing continues for instances that you stop, and related resources continue
     * to apply against any relevant quotas. You must terminate an instance
     * ({@link #terminateInstance(TerminateInstanceRequest) terminateInstance})
     * to remove its resources from billing and quotas.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    InstanceActionResponse instanceAction(InstanceActionRequest request);

    /**
     * Creates a new instance in the specified compartment and the specified Availability Domain.
     * For general information about instances, see
     * [Overview of the Compute Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Compute/Concepts/computeoverview.htm).
     * <p>
     * For information about access control and compartments, see
     * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm).
     * <p>
     * For information about Availability Domains, see
     * [Regions and Availability Domains](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/regions.htm).
     * To get a list of Availability Domains, use the `ListAvailabilityDomains` operation
     * in the Identity and Access Management Service API.
     * <p>
     * All Oracle Cloud Infrastructure resources, including instances, get an Oracle-assigned,
     * unique ID called an Oracle Cloud Identifier (OCID).
     * When you create a resource, you can find its OCID in the response. You can
     * also retrieve a resource's OCID by using a List API operation
     * on that resource type, or by viewing the resource in the Console.
     * <p>
     * To launch an instance using an image or a boot volume use the `sourceDetails` parameter in {@link LaunchInstanceDetails}.
     * <p>
     * When you launch an instance, it is automatically attached to a virtual
     * network interface card (VNIC), called the *primary VNIC*. The VNIC
     * has a private IP address from the subnet's CIDR. You can either assign a
     * private IP address of your choice or let Oracle automatically assign one.
     * You can choose whether the instance has a public IP address. To retrieve the
     * addresses, use the {@link #listVnicAttachments(ListVnicAttachmentsRequest) listVnicAttachments}
     * operation to get the VNIC ID for the instance, and then call
     * {@link #getVnic(GetVnicRequest) getVnic} with the VNIC ID.
     * <p>
     * You can later add secondary VNICs to an instance. For more information, see
     * [Virtual Network Interface Cards (VNICs)](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingVNICs.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    LaunchInstanceResponse launchInstance(LaunchInstanceRequest request);

    /**
     * Lists the boot volume attachments in the specified compartment. You can filter the
     * list by specifying an instance OCID, boot volume OCID, or both.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListBootVolumeAttachmentsResponse listBootVolumeAttachments(
            ListBootVolumeAttachmentsRequest request);

    /**
     * Lists the console history metadata for the specified compartment or instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListConsoleHistoriesResponse listConsoleHistories(ListConsoleHistoriesRequest request);

    /**
     * Lists the available images in the specified compartment.
     * If you specify a value for the `sortBy` parameter, Oracle-provided images appear first in the list, followed by custom images.
     * For more
     * information about images, see
     * [Managing Custom Images](https://docs.us-phoenix-1.oraclecloud.com/Content/Compute/Tasks/managingcustomimages.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListImagesResponse listImages(ListImagesRequest request);

    /**
     * Lists the console connections for the specified compartment or instance.
     * <p>
     * For more information about console access, see [Accessing the Instance Console](https://docs.us-phoenix-1.oraclecloud.com/Content/Compute/References/serialconsole.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListInstanceConsoleConnectionsResponse listInstanceConsoleConnections(
            ListInstanceConsoleConnectionsRequest request);

    /**
     * Lists the instances in the specified compartment and the specified Availability Domain.
     * You can filter the results by specifying an instance name (the list will include all the identically-named
     * instances in the compartment).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListInstancesResponse listInstances(ListInstancesRequest request);

    /**
     * Lists the shapes that can be used to launch an instance within the specified compartment. You can
     * filter the list by compatibility with a specific image.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListShapesResponse listShapes(ListShapesRequest request);

    /**
     * Lists the VNIC attachments in the specified compartment. A VNIC attachment
     * resides in the same compartment as the attached instance. The list can be
     * filtered by instance, VNIC, or Availability Domain.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListVnicAttachmentsResponse listVnicAttachments(ListVnicAttachmentsRequest request);

    /**
     * Lists the volume attachments in the specified compartment. You can filter the
     * list by specifying an instance OCID, volume OCID, or both.
     * <p>
     * Currently, the only supported volume attachment type is {@link IScsiVolumeAttachment}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListVolumeAttachmentsResponse listVolumeAttachments(ListVolumeAttachmentsRequest request);

    /**
     * Terminates the specified instance. Any attached VNICs and volumes are automatically detached
     * when the instance terminates.
     * <p>
     * To preserve the boot volume associated with the instance, specify `true` for `PreserveBootVolumeQueryParam`.
     * To delete the boot volume when the instance is deleted, specify `false` or do not specify a value for `PreserveBootVolumeQueryParam`.
     * <p>
     * This is an asynchronous operation. The instance's `lifecycleState` will change to TERMINATING temporarily
     * until the instance is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    TerminateInstanceResponse terminateInstance(TerminateInstanceRequest request);

    /**
     * Updates the specified console history metadata.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateConsoleHistoryResponse updateConsoleHistory(UpdateConsoleHistoryRequest request);

    /**
     * Updates the display name of the image. Avoid entering confidential information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateImageResponse updateImage(UpdateImageRequest request);

    /**
     * Updates the display name of the specified instance. Avoid entering confidential information.
     * The OCID of the instance remains the same.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateInstanceResponse updateInstance(UpdateInstanceRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    ComputeWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    ComputePaginators getPaginators();
}
