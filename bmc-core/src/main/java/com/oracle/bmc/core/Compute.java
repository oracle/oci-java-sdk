/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

import com.oracle.bmc.*;

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
     * Attaches the specified storage volume to the specified instance.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    AttachVolumeResponse attachVolume(AttachVolumeRequest request);

    /**
     * Captures the most recent serial console data (up to a megabyte) for the
     * specified instance. The data includes configuration messages that occur when the
     * instance boots, such as kernel and BIOS messages, and is useful for checking the
     * status of the instance or diagnosing problems.  The console data is minimally
     * formatted ASCII text.
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
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CaptureConsoleHistoryResponse captureConsoleHistory(CaptureConsoleHistoryRequest request);

    /**
     * Creates a boot disk image for the specified instance. For more information about images, see
     * [Managing Custom Images](https://docs.us-phoenix-1.oraclecloud.com/Content/Compute/Tasks/managingcustomimages.htm).
     * <p>
     * You must provide the OCID of the instance you want to use as the basis for the image, and
     * the OCID of the compartment containing that instance.
     * <p>
     * You may optionally specify a *display name* for the image, which is simply a friendly name or description.
     * It does not have to be unique, and you can change it. See {@link #updateImage(UpdateImageRequest) updateImage}.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateImageResponse createImage(CreateImageRequest request);

    /**
     * Deletes the specified console history metadata and the console history data.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteConsoleHistoryResponse deleteConsoleHistory(DeleteConsoleHistoryRequest request);

    /**
     * Deletes an image.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteImageResponse deleteImage(DeleteImageRequest request);

    /**
     * Detaches a storage volume from an instance. You must specify the OCID of the volume attachment.
     * <p>
     * This is an asynchronous operation; the attachment's `lifecycleState` will change to DETACHING temporarily
     * until the attachment is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DetachVolumeResponse detachVolume(DetachVolumeRequest request);

    /**
     * Shows the metadata for the specified console history.
     * See {@link #captureConsoleHistory(CaptureConsoleHistoryRequest) captureConsoleHistory}
     * for details about using the console history operations.
     *
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
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetConsoleHistoryContentResponse getConsoleHistoryContent(
            GetConsoleHistoryContentRequest request);

    /**
     * Gets the specified image.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetImageResponse getImage(GetImageRequest request);

    /**
     * Gets information about the specified instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetInstanceResponse getInstance(GetInstanceRequest request);

    /**
     * Gets information about the specified volume attachment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVolumeAttachmentResponse getVolumeAttachment(GetVolumeAttachmentRequest request);

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
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    InstanceActionResponse instanceAction(InstanceActionRequest request);

    /**
     * Creates a new instance in the specified compartment and the specified Availability Domain.
     * For general information about instances, see
     * [Overview of the Compute Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Compute/Concepts/computeoverview.htm)
     * <p>
     * For information about access control and compartments, see
     * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm).
     * <p>
     * For information about Availability Domains, see
     * [Regions and Availability Domains](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/regions.htm).
     * To get a list of Availability Domains, use the `ListAvailabilityDomains` operation
     * in the Identity and Access Management Service API.
     * <p>
     * All Oracle Bare Metal Cloud Services resources, including instances, get an Oracle-assigned,
     * unique ID called an Oracle Cloud Identifier (OCID).
     * When you create a resource, you can find its OCID in the response. You can
     * also retrieve a resource's OCID by using a List API operation
     * on that resource type, or by viewing the resource in the Console.
     * <p>
     * When you launch an instance, it is automatically attached to a Virtual
     * Network Interface Card (VNIC) and given both a public and private IP address.
     * To get both addresses, use the {@link #listVnicAttachments(ListVnicAttachmentsRequest) listVnicAttachments}
     * operation to get the VNIC ID for the instance, and then call
     * {@link #getVnic(GetVnicRequest) getVnic} with the VNIC ID.
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
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    LaunchInstanceResponse launchInstance(LaunchInstanceRequest request);

    /**
     * Lists all the console history metadata for the specified compartment or instance.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListConsoleHistoriesResponse listConsoleHistories(ListConsoleHistoriesRequest request);

    /**
     * Gets a list of the available images in the specified compartment. For more
     * information about images, see
     * [Managing Custom Images](https://docs.us-phoenix-1.oraclecloud.com/Content/Compute/Tasks/managingcustomimages.htm).
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListImagesResponse listImages(ListImagesRequest request);

    /**
     * Gets a list of all the instances in the specified compartment and the specified Availability Domain.
     * You can filter the results by specifying an instance name (the list will include all the identically-named
     * instances in the compartment).
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListInstancesResponse listInstances(ListInstancesRequest request);

    /**
     * Lists all shapes that can be used to launch an instance within the specified compartment. You can
     * filter the list by compatibility with a specific image.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListShapesResponse listShapes(ListShapesRequest request);

    /**
     * Gets a list of the VNIC attachments for the specified compartment. The list can be filtered by
     * instance and by VNIC.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListVnicAttachmentsResponse listVnicAttachments(ListVnicAttachmentsRequest request);

    /**
     * Gets a list of the volume attachments in the specified compartment. You can filter the
     * list by specifying an instance OCID, volume OCID, or both.
     * <p>
     * Currently, the only supported volume attachment type is {@link IScsiVolumeAttachment}.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
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
     * This is an asynchronous operation; the instance's `lifecycleState` will change to TERMINATING temporarily
     * until the instance is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    TerminateInstanceResponse terminateInstance(TerminateInstanceRequest request);

    /**
     * Updates the display name of the image.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateImageResponse updateImage(UpdateImageRequest request);

    /**
     * Updates the display name of the specified instance. The OCID of the instance
     * remains the same.
     *
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
}
