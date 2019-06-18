/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;
import com.oracle.bmc.workrequests.WorkRequest;

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
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
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
     * [Virtual Network Interface Cards (VNICs)](https://docs.cloud.oracle.com/Content/Network/Tasks/managingVNICs.htm).
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
     * Create a subscription for listing resource version for a compartment. It will take some time to propagate to all regions.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateAppCatalogSubscriptionResponse createAppCatalogSubscription(
            CreateAppCatalogSubscriptionRequest request);

    /**
     * Creates a boot disk image for the specified instance or imports an exported image from the Oracle Cloud Infrastructure Object Storage service.
     * <p>
     * When creating a new image, you must provide the OCID of the instance you want to use as the basis for the image, and
     * the OCID of the compartment containing that instance. For more information about images,
     * see [Managing Custom Images](https://docs.cloud.oracle.com/Content/Compute/Tasks/managingcustomimages.htm).
     * <p>
     * When importing an exported image from Object Storage, you specify the source information
     * in {@link #imageSourceDetails(ImageSourceDetailsRequest) imageSourceDetails}.
     * <p>
     * When importing an image based on the namespace, bucket name, and object name,
     * use {@link #imageSourceViaObjectStorageTupleDetails(ImageSourceViaObjectStorageTupleDetailsRequest) imageSourceViaObjectStorageTupleDetails}.
     * <p>
     * When importing an image based on the Object Storage URL, use
     * {@link #imageSourceViaObjectStorageUriDetails(ImageSourceViaObjectStorageUriDetailsRequest) imageSourceViaObjectStorageUriDetails}.
     * See [Object Storage URLs](https://docs.cloud.oracle.com/Content/Compute/Tasks/imageimportexport.htm#URLs) and [Using Pre-Authenticated Requests](https://docs.cloud.oracle.com/Content/Object/Tasks/usingpreauthenticatedrequests.htm)
     * for constructing URLs for image import/export.
     * <p>
     * For more information about importing exported images, see
     * [Image Import/Export](https://docs.cloud.oracle.com/Content/Compute/Tasks/imageimportexport.htm).
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
     * For more information about console access, see [Accessing the Console](https://docs.cloud.oracle.com/Content/Compute/References/serialconsole.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateInstanceConsoleConnectionResponse createInstanceConsoleConnection(
            CreateInstanceConsoleConnectionRequest request);

    /**
     * Delete a subscription for a listing resource version for a compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteAppCatalogSubscriptionResponse deleteAppCatalogSubscription(
            DeleteAppCatalogSubscriptionRequest request);

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
     * [target of a route rule](https://docs.cloud.oracle.com/Content/Network/Tasks/managingroutetables.htm#privateip),
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
     * For more information about exporting images, see [Image Import/Export](https://docs.cloud.oracle.com/Content/Compute/Tasks/imageimportexport.htm).
     * <p>
     * To perform an image export, you need write access to the Object Storage bucket for the image,
     * see [Let Users Write Objects to Object Storage Buckets](https://docs.cloud.oracle.com/Content/Identity/Concepts/commonpolicies.htm#Let4).
     * <p>
     * See [Object Storage URLs](https://docs.cloud.oracle.com/Content/Compute/Tasks/imageimportexport.htm#URLs) and [Using Pre-Authenticated Requests](https://docs.cloud.oracle.com/Content/Object/Tasks/usingpreauthenticatedrequests.htm)
     * for constructing URLs for image import/export.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ExportImageResponse exportImage(ExportImageRequest request);

    /**
     * Gets the specified listing.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetAppCatalogListingResponse getAppCatalogListing(GetAppCatalogListingRequest request);

    /**
     * Retrieves the agreements for a particular resource version of a listing.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetAppCatalogListingAgreementsResponse getAppCatalogListingAgreements(
            GetAppCatalogListingAgreementsRequest request);

    /**
     * Gets the specified listing resource version.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetAppCatalogListingResourceVersionResponse getAppCatalogListingResourceVersion(
            GetAppCatalogListingResourceVersionRequest request);

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
     * Gets the generated credentials for the instance. Only works for instances that require password to log in (E.g. Windows).
     * For certain OS'es, users will be forced to change the initial credentials.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetWindowsInstanceInitialCredentialsResponse getWindowsInstanceInitialCredentials(
            GetWindowsInstanceInitialCredentialsRequest request);

    /**
     * Performs one of the following power actions on the specified instance:
     * <p>
     * - **START** - Powers on the instance.
     * <p>
     * - **STOP** - Powers off the instance.
     * <p>
     * - **SOFTRESET** - Gracefully reboots instance by sending a shutdown command to the operating system and then powers the instance back on.
     * <p>
     * - **SOFTSTOP** - Gracefully shuts down instance by sending a shutdown command to the operating system.
     * <p>
     * - **RESET** - Powers off the instance and then powers it back on.
     * <p>
     * For more information see [Stopping and Starting an Instance](https://docs.cloud.oracle.com/Content/Compute/Tasks/restartinginstance.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    InstanceActionResponse instanceAction(InstanceActionRequest request);

    /**
     * Creates a new instance in the specified compartment and the specified availability domain.
     * For general information about instances, see
     * [Overview of the Compute Service](https://docs.cloud.oracle.com/Content/Compute/Concepts/computeoverview.htm).
     * <p>
     * For information about access control and compartments, see
     * [Overview of the IAM Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm).
     * <p>
     * For information about availability domains, see
     * [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm).
     * To get a list of availability domains, use the `ListAvailabilityDomains` operation
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
     * [Virtual Network Interface Cards (VNICs)](https://docs.cloud.oracle.com/Content/Network/Tasks/managingVNICs.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    LaunchInstanceResponse launchInstance(LaunchInstanceRequest request);

    /**
     * Gets all resource versions for a particular listing.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAppCatalogListingResourceVersionsResponse listAppCatalogListingResourceVersions(
            ListAppCatalogListingResourceVersionsRequest request);

    /**
     * Lists the published listings.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAppCatalogListingsResponse listAppCatalogListings(ListAppCatalogListingsRequest request);

    /**
     * Lists subscriptions for a compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAppCatalogSubscriptionsResponse listAppCatalogSubscriptions(
            ListAppCatalogSubscriptionsRequest request);

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
     * Lists the available images in the specified compartment, including both
     * [Oracle-provided images](https://docs.cloud.oracle.com/Content/Compute/References/images.htm) and
     * [custom images](https://docs.cloud.oracle.com/Content/Compute/Tasks/managingcustomimages.htm) that have
     * been created. The list of images returned is ordered to first show all
     * Oracle-provided images, then all custom images.
     * <p>
     * The order of images returned may change when new images are released.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListImagesResponse listImages(ListImagesRequest request);

    /**
     * Lists the console connections for the specified compartment or instance.
     * <p>
     * For more information about console access, see [Accessing the Console](https://docs.cloud.oracle.com/Content/Compute/References/serialconsole.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListInstanceConsoleConnectionsResponse listInstanceConsoleConnections(
            ListInstanceConsoleConnectionsRequest request);

    /**
     * Gets a list of all the devices for given instance. You can optionally filter results by device availability.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListInstanceDevicesResponse listInstanceDevices(ListInstanceDevicesRequest request);

    /**
     * Lists the instances in the specified compartment and the specified availability domain.
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
     * filtered by instance, VNIC, or availability domain.
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
     * Currently, the only supported volume attachment type are {@link IScsiVolumeAttachment} and
     * {@link ParavirtualizedVolumeAttachment}.
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
     * Updates certain fields on the specified instance. Fields that are not provided in the
     * request will not be updated. Avoid entering confidential information.
     * <p>
     * Changes to metadata fields will be reflected in the instance metadata service (this may take
     * up to a minute).
     * <p>
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
     * @deprecated use {@link #newWaiters(WorkRequest)} instead.  Otherwise, a default one will be provided
     *   that does not support operations that rely on the {@code WorkRequestClient} for polling.  An
     *   {@code IllegalStateException} will be thrown for such operations.
     */
    @Deprecated
    ComputeWaiters getWaiters();

    /**
     * Creates a new {@code ComputeWaiters} for resources for this service.
     *
     * @param workRequestClient The work request service client used to query for work request status
     * @return The service waiters.
     */
    ComputeWaiters newWaiters(WorkRequest workRequestClient);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    ComputePaginators getPaginators();
}
