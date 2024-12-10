/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

/**
 * Use the Core Services API to manage resources such as virtual cloud networks (VCNs),
 * compute instances, and block storage volumes. For more information, see the console
 * documentation for the [Networking](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/overview.htm),
 * [Compute](https://docs.cloud.oracle.com/iaas/Content/Compute/Concepts/computeoverview.htm), and
 * [Block Volume](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/overview.htm) services.
 * The required permissions are documented in the
 * [Details for the Core Services](https://docs.cloud.oracle.com/iaas/Content/Identity/Reference/corepolicyreference.htm) article.
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface ComputeAsync extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

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
     * Determines whether realm specific endpoint should be used or not.
     * Set realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm specific endpoint template, otherwise set it to "false"
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Accept the changes to the PCR values in the measured boot report.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AcceptShieldedIntegrityPolicyResponse>
            acceptShieldedIntegrityPolicy(
                    AcceptShieldedIntegrityPolicyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AcceptShieldedIntegrityPolicyRequest,
                                    AcceptShieldedIntegrityPolicyResponse>
                            handler);

    /**
     * Adds a shape to the compatible shapes list for the image.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddImageShapeCompatibilityEntryResponse>
            addImageShapeCompatibilityEntry(
                    AddImageShapeCompatibilityEntryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AddImageShapeCompatibilityEntryRequest,
                                    AddImageShapeCompatibilityEntryResponse>
                            handler);

    /**
     * Attaches the specified boot volume to the specified instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AttachBootVolumeResponse> attachBootVolume(
            AttachBootVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<AttachBootVolumeRequest, AttachBootVolumeResponse>
                    handler);

    /**
     * Creates a secondary VNIC and attaches it to the specified instance.
     * For more information about secondary VNICs, see
     * [Virtual Network Interface Cards (VNICs)](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AttachVnicResponse> attachVnic(
            AttachVnicRequest request,
            com.oracle.bmc.responses.AsyncHandler<AttachVnicRequest, AttachVnicResponse> handler);

    /**
     * Attaches the specified storage volume to the specified instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AttachVolumeResponse> attachVolume(
            AttachVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<AttachVolumeRequest, AttachVolumeResponse>
                    handler);

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
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CaptureConsoleHistoryResponse> captureConsoleHistory(
            CaptureConsoleHistoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CaptureConsoleHistoryRequest, CaptureConsoleHistoryResponse>
                    handler);

    /**
     * Moves a compute capacity reservation into a different compartment. For information about
     * moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeComputeCapacityReservationCompartmentResponse>
            changeComputeCapacityReservationCompartment(
                    ChangeComputeCapacityReservationCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeComputeCapacityReservationCompartmentRequest,
                                    ChangeComputeCapacityReservationCompartmentResponse>
                            handler);

    /**
     * Moves a compute capacity topology into a different compartment. For information about moving resources between
     * compartments, see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeComputeCapacityTopologyCompartmentResponse>
            changeComputeCapacityTopologyCompartment(
                    ChangeComputeCapacityTopologyCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeComputeCapacityTopologyCompartmentRequest,
                                    ChangeComputeCapacityTopologyCompartmentResponse>
                            handler);

    /**
     * Moves a compute cluster into a different compartment within the same tenancy.
     * A [compute cluster](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm) is a remote direct memory access (RDMA) network group.
     * <p>
     * For information about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeComputeClusterCompartmentResponse>
            changeComputeClusterCompartment(
                    ChangeComputeClusterCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeComputeClusterCompartmentRequest,
                                    ChangeComputeClusterCompartmentResponse>
                            handler);

    /**
     * Moves a compute image capability schema into a different compartment within the same tenancy.
     * For information about moving resources between compartments, see
     *         [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeComputeImageCapabilitySchemaCompartmentResponse>
            changeComputeImageCapabilitySchemaCompartment(
                    ChangeComputeImageCapabilitySchemaCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeComputeImageCapabilitySchemaCompartmentRequest,
                                    ChangeComputeImageCapabilitySchemaCompartmentResponse>
                            handler);

    /**
     * Moves a dedicated virtual machine host from one compartment to another.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDedicatedVmHostCompartmentResponse>
            changeDedicatedVmHostCompartment(
                    ChangeDedicatedVmHostCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDedicatedVmHostCompartmentRequest,
                                    ChangeDedicatedVmHostCompartmentResponse>
                            handler);

    /**
     * Moves an image into a different compartment within the same tenancy. For information about moving
     * resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeImageCompartmentResponse> changeImageCompartment(
            ChangeImageCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeImageCompartmentRequest, ChangeImageCompartmentResponse>
                    handler);

    /**
     * Moves an instance into a different compartment within the same tenancy. For information about
     * moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     * <p>
     * When you move an instance to a different compartment, associated resources such as boot volumes and VNICs
     * are not moved.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeInstanceCompartmentResponse> changeInstanceCompartment(
            ChangeInstanceCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeInstanceCompartmentRequest, ChangeInstanceCompartmentResponse>
                    handler);

    /**
     * Create a subscription for listing resource version for a compartment. It will take some time to propagate to all regions.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAppCatalogSubscriptionResponse> createAppCatalogSubscription(
            CreateAppCatalogSubscriptionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateAppCatalogSubscriptionRequest,
                            CreateAppCatalogSubscriptionResponse>
                    handler);

    /**
     * Generates a report of the host capacity within an availability domain that is available for you
     * to create compute instances. Host capacity is the physical infrastructure that resources such as compute
     * instances run on.
     * <p>
     * Use the capacity report to determine whether sufficient capacity is available for a shape before
     * you create an instance or change the shape of an instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateComputeCapacityReportResponse> createComputeCapacityReport(
            CreateComputeCapacityReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateComputeCapacityReportRequest, CreateComputeCapacityReportResponse>
                    handler);

    /**
     * Creates a new compute capacity reservation in the specified compartment and availability domain.
     * Compute capacity reservations let you reserve instances in a compartment.
     * When you launch an instance using this reservation, you are assured that you have enough space for your instance,
     * and you won't get out of capacity errors.
     * For more information, see [Reserved Capacity](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateComputeCapacityReservationResponse>
            createComputeCapacityReservation(
                    CreateComputeCapacityReservationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateComputeCapacityReservationRequest,
                                    CreateComputeCapacityReservationResponse>
                            handler);

    /**
     * Creates a new compute capacity topology in the specified compartment and availability domain.
     * <p>
     * Compute capacity topologies provide the RDMA network topology of your bare metal hosts so that you can launch
     * instances on your bare metal hosts with targeted network locations.
     * <p>
     * Compute capacity topologies report the health status of your bare metal hosts.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateComputeCapacityTopologyResponse>
            createComputeCapacityTopology(
                    CreateComputeCapacityTopologyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateComputeCapacityTopologyRequest,
                                    CreateComputeCapacityTopologyResponse>
                            handler);

    /**
     * Creates an empty [compute cluster](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm). A compute cluster
     * is a remote direct memory access (RDMA) network group.
     * <p>
     * After the compute cluster is created, you can use the compute cluster's OCID with the
     * {@link #launchInstance(LaunchInstanceRequest, Consumer, Consumer) launchInstance} operation to create instances in the compute cluster.
     * The instances must be created in the same compartment and availability domain as the cluster.
     * <p>
     * Use compute clusters when you want to manage instances in the cluster individually in the RDMA network group.
     * <p>
     * If you want predictable capacity for a specific number of identical instances that are managed as a group,
     * create a cluster network that uses instance pools by using the
     * {@link #createClusterNetwork(CreateClusterNetworkRequest, Consumer, Consumer) createClusterNetwork} operation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateComputeClusterResponse> createComputeCluster(
            CreateComputeClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateComputeClusterRequest, CreateComputeClusterResponse>
                    handler);

    /**
     * Creates compute image capability schema.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateComputeImageCapabilitySchemaResponse>
            createComputeImageCapabilitySchema(
                    CreateComputeImageCapabilitySchemaRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateComputeImageCapabilitySchemaRequest,
                                    CreateComputeImageCapabilitySchemaResponse>
                            handler);

    /**
     * Creates a new dedicated virtual machine host in the specified compartment and the specified availability domain.
     * Dedicated virtual machine hosts enable you to run your Compute virtual machine (VM) instances on dedicated servers
     * that are a single tenant and not shared with other customers.
     * For more information, see [Dedicated Virtual Machine Hosts](https://docs.cloud.oracle.com/iaas/Content/Compute/Concepts/dedicatedvmhosts.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDedicatedVmHostResponse> createDedicatedVmHost(
            CreateDedicatedVmHostRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDedicatedVmHostRequest, CreateDedicatedVmHostResponse>
                    handler);

    /**
     * Creates a boot disk image for the specified instance or imports an exported image from the Oracle Cloud Infrastructure Object Storage service.
     * <p>
     * When creating a new image, you must provide the OCID of the instance you want to use as the basis for the image, and
     * the OCID of the compartment containing that instance. For more information about images,
     * see [Managing Custom Images](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/managingcustomimages.htm).
     * <p>
     * When importing an exported image from Object Storage, you specify the source information
     * in {@link #imageSourceDetails(ImageSourceDetailsRequest, Consumer, Consumer) imageSourceDetails}.
     * <p>
     * When importing an image based on the namespace, bucket name, and object name,
     * use {@link #imageSourceViaObjectStorageTupleDetails(ImageSourceViaObjectStorageTupleDetailsRequest, Consumer, Consumer) imageSourceViaObjectStorageTupleDetails}.
     * <p>
     * When importing an image based on the Object Storage URL, use
     * {@link #imageSourceViaObjectStorageUriDetails(ImageSourceViaObjectStorageUriDetailsRequest, Consumer, Consumer) imageSourceViaObjectStorageUriDetails}.
     * See [Object Storage URLs](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/imageimportexport.htm#URLs) and [Using Pre-Authenticated Requests](https://docs.cloud.oracle.com/iaas/Content/Object/Tasks/usingpreauthenticatedrequests.htm)
     * for constructing URLs for image import/export.
     * <p>
     * For more information about importing exported images, see
     * [Image Import/Export](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/imageimportexport.htm).
     * <p>
     * You may optionally specify a *display name* for the image, which is simply a friendly name or description.
     * It does not have to be unique, and you can change it. See {@link #updateImage(UpdateImageRequest, Consumer, Consumer) updateImage}.
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
    java.util.concurrent.Future<CreateImageResponse> createImage(
            CreateImageRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateImageRequest, CreateImageResponse> handler);

    /**
     * Creates a new console connection to the specified instance.
     * After the console connection has been created and is available,
     * you connect to the console using SSH.
     * <p>
     * For more information about instance console connections, see [Troubleshooting Instances Using Instance Console Connections](https://docs.cloud.oracle.com/iaas/Content/Compute/References/serialconsole.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateInstanceConsoleConnectionResponse>
            createInstanceConsoleConnection(
                    CreateInstanceConsoleConnectionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateInstanceConsoleConnectionRequest,
                                    CreateInstanceConsoleConnectionResponse>
                            handler);

    /**
     * Delete a subscription for a listing resource version for a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAppCatalogSubscriptionResponse> deleteAppCatalogSubscription(
            DeleteAppCatalogSubscriptionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteAppCatalogSubscriptionRequest,
                            DeleteAppCatalogSubscriptionResponse>
                    handler);

    /**
     * Deletes the specified compute capacity reservation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteComputeCapacityReservationResponse>
            deleteComputeCapacityReservation(
                    DeleteComputeCapacityReservationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteComputeCapacityReservationRequest,
                                    DeleteComputeCapacityReservationResponse>
                            handler);

    /**
     * Deletes the specified compute capacity topology.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteComputeCapacityTopologyResponse>
            deleteComputeCapacityTopology(
                    DeleteComputeCapacityTopologyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteComputeCapacityTopologyRequest,
                                    DeleteComputeCapacityTopologyResponse>
                            handler);

    /**
     * Deletes a compute cluster. A [compute cluster](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm) is a
     * remote direct memory access (RDMA) network group.
     * <p>
     * Before you delete a compute cluster, first delete all instances in the cluster by using
     * the {@link #terminateInstance(TerminateInstanceRequest, Consumer, Consumer) terminateInstance} operation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteComputeClusterResponse> deleteComputeCluster(
            DeleteComputeClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteComputeClusterRequest, DeleteComputeClusterResponse>
                    handler);

    /**
     * Deletes the specified Compute Image Capability Schema
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteComputeImageCapabilitySchemaResponse>
            deleteComputeImageCapabilitySchema(
                    DeleteComputeImageCapabilitySchemaRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteComputeImageCapabilitySchemaRequest,
                                    DeleteComputeImageCapabilitySchemaResponse>
                            handler);

    /**
     * Deletes the specified console history metadata and the console history data.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteConsoleHistoryResponse> deleteConsoleHistory(
            DeleteConsoleHistoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteConsoleHistoryRequest, DeleteConsoleHistoryResponse>
                    handler);

    /**
     * Deletes the specified dedicated virtual machine host.
     * <p>
     * If any VM instances are assigned to the dedicated virtual machine host,
     * the delete operation will fail and the service will return a 409 response code.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDedicatedVmHostResponse> deleteDedicatedVmHost(
            DeleteDedicatedVmHostRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDedicatedVmHostRequest, DeleteDedicatedVmHostResponse>
                    handler);

    /**
     * Deletes an image.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteImageResponse> deleteImage(
            DeleteImageRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteImageRequest, DeleteImageResponse> handler);

    /**
     * Deletes the specified instance console connection.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteInstanceConsoleConnectionResponse>
            deleteInstanceConsoleConnection(
                    DeleteInstanceConsoleConnectionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteInstanceConsoleConnectionRequest,
                                    DeleteInstanceConsoleConnectionResponse>
                            handler);

    /**
     * Detaches a boot volume from an instance. You must specify the OCID of the boot volume attachment.
     * <p>
     * This is an asynchronous operation. The attachment's `lifecycleState` will change to DETACHING temporarily
     * until the attachment is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DetachBootVolumeResponse> detachBootVolume(
            DetachBootVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<DetachBootVolumeRequest, DetachBootVolumeResponse>
                    handler);

    /**
     * Detaches and deletes the specified secondary VNIC.
     * This operation cannot be used on the instance's primary VNIC.
     * When you terminate an instance, all attached VNICs (primary
     * and secondary) are automatically detached and deleted.
     * <p>
     **Important:** If the VNIC has a
     * {@link PrivateIp} that is the
     * [target of a route rule](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#privateip),
     * deleting the VNIC causes that route rule to blackhole and the traffic
     * will be dropped.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DetachVnicResponse> detachVnic(
            DetachVnicRequest request,
            com.oracle.bmc.responses.AsyncHandler<DetachVnicRequest, DetachVnicResponse> handler);

    /**
     * Detaches a storage volume from an instance. You must specify the OCID of the volume attachment.
     * <p>
     * This is an asynchronous operation. The attachment's `lifecycleState` will change to DETACHING temporarily
     * until the attachment is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DetachVolumeResponse> detachVolume(
            DetachVolumeRequest request,
            com.oracle.bmc.responses.AsyncHandler<DetachVolumeRequest, DetachVolumeResponse>
                    handler);

    /**
     * Exports the specified image to the Oracle Cloud Infrastructure Object Storage service. You can use the Object Storage URL,
     * or the namespace, bucket name, and object name when specifying the location to export to.
     * <p>
     * For more information about exporting images, see [Image Import/Export](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/imageimportexport.htm).
     * <p>
     * To perform an image export, you need write access to the Object Storage bucket for the image,
     * see [Let Users Write Objects to Object Storage Buckets](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/commonpolicies.htm#Let4).
     * <p>
     * See [Object Storage URLs](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/imageimportexport.htm#URLs) and [Using Pre-Authenticated Requests](https://docs.cloud.oracle.com/iaas/Content/Object/Tasks/usingpreauthenticatedrequests.htm)
     * for constructing URLs for image import/export.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ExportImageResponse> exportImage(
            ExportImageRequest request,
            com.oracle.bmc.responses.AsyncHandler<ExportImageRequest, ExportImageResponse> handler);

    /**
     * Gets the specified listing.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAppCatalogListingResponse> getAppCatalogListing(
            GetAppCatalogListingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAppCatalogListingRequest, GetAppCatalogListingResponse>
                    handler);

    /**
     * Retrieves the agreements for a particular resource version of a listing.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAppCatalogListingAgreementsResponse>
            getAppCatalogListingAgreements(
                    GetAppCatalogListingAgreementsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetAppCatalogListingAgreementsRequest,
                                    GetAppCatalogListingAgreementsResponse>
                            handler);

    /**
     * Gets the specified listing resource version.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAppCatalogListingResourceVersionResponse>
            getAppCatalogListingResourceVersion(
                    GetAppCatalogListingResourceVersionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetAppCatalogListingResourceVersionRequest,
                                    GetAppCatalogListingResourceVersionResponse>
                            handler);

    /**
     * Gets information about the specified boot volume attachment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetBootVolumeAttachmentResponse> getBootVolumeAttachment(
            GetBootVolumeAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetBootVolumeAttachmentRequest, GetBootVolumeAttachmentResponse>
                    handler);

    /**
     * Gets information about the specified compute capacity reservation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetComputeCapacityReservationResponse>
            getComputeCapacityReservation(
                    GetComputeCapacityReservationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetComputeCapacityReservationRequest,
                                    GetComputeCapacityReservationResponse>
                            handler);

    /**
     * Gets information about the specified compute capacity topology.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetComputeCapacityTopologyResponse> getComputeCapacityTopology(
            GetComputeCapacityTopologyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetComputeCapacityTopologyRequest, GetComputeCapacityTopologyResponse>
                    handler);

    /**
     * Gets information about a compute cluster. A [compute cluster](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm)
     * is a remote direct memory access (RDMA) network group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetComputeClusterResponse> getComputeCluster(
            GetComputeClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetComputeClusterRequest, GetComputeClusterResponse>
                    handler);

    /**
     * Gets the specified Compute Global Image Capability Schema
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetComputeGlobalImageCapabilitySchemaResponse>
            getComputeGlobalImageCapabilitySchema(
                    GetComputeGlobalImageCapabilitySchemaRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetComputeGlobalImageCapabilitySchemaRequest,
                                    GetComputeGlobalImageCapabilitySchemaResponse>
                            handler);

    /**
     * Gets the specified Compute Global Image Capability Schema Version
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetComputeGlobalImageCapabilitySchemaVersionResponse>
            getComputeGlobalImageCapabilitySchemaVersion(
                    GetComputeGlobalImageCapabilitySchemaVersionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetComputeGlobalImageCapabilitySchemaVersionRequest,
                                    GetComputeGlobalImageCapabilitySchemaVersionResponse>
                            handler);

    /**
     * Gets the specified Compute Image Capability Schema
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetComputeImageCapabilitySchemaResponse>
            getComputeImageCapabilitySchema(
                    GetComputeImageCapabilitySchemaRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetComputeImageCapabilitySchemaRequest,
                                    GetComputeImageCapabilitySchemaResponse>
                            handler);

    /**
     * Shows the metadata for the specified console history.
     * See {@link #captureConsoleHistory(CaptureConsoleHistoryRequest, Consumer, Consumer) captureConsoleHistory}
     * for details about using the console history operations.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetConsoleHistoryResponse> getConsoleHistory(
            GetConsoleHistoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetConsoleHistoryRequest, GetConsoleHistoryResponse>
                    handler);

    /**
     * Gets the actual console history data (not the metadata).
     * See {@link #captureConsoleHistory(CaptureConsoleHistoryRequest, Consumer, Consumer) captureConsoleHistory}
     * for details about using the console history operations.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetConsoleHistoryContentResponse> getConsoleHistoryContent(
            GetConsoleHistoryContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetConsoleHistoryContentRequest, GetConsoleHistoryContentResponse>
                    handler);

    /**
     * Gets information about the specified dedicated virtual machine host.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDedicatedVmHostResponse> getDedicatedVmHost(
            GetDedicatedVmHostRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDedicatedVmHostRequest, GetDedicatedVmHostResponse>
                    handler);

    /**
     * Gets the specified image.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetImageResponse> getImage(
            GetImageRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetImageRequest, GetImageResponse> handler);

    /**
     * Retrieves an image shape compatibility entry.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetImageShapeCompatibilityEntryResponse>
            getImageShapeCompatibilityEntry(
                    GetImageShapeCompatibilityEntryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetImageShapeCompatibilityEntryRequest,
                                    GetImageShapeCompatibilityEntryResponse>
                            handler);

    /**
     * Gets information about the specified instance.
     * <p>
     **Note:** To retrieve public and private IP addresses for an instance, use the {@link #listVnicAttachments(ListVnicAttachmentsRequest, Consumer, Consumer) listVnicAttachments}
     * operation to get the VNIC ID for the instance, and then call {@link #getVnic(GetVnicRequest, Consumer, Consumer) getVnic} with the VNIC ID.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetInstanceResponse> getInstance(
            GetInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetInstanceRequest, GetInstanceResponse> handler);

    /**
     * Gets the specified instance console connection's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetInstanceConsoleConnectionResponse> getInstanceConsoleConnection(
            GetInstanceConsoleConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetInstanceConsoleConnectionRequest,
                            GetInstanceConsoleConnectionResponse>
                    handler);

    /**
     * Gets the maintenance event for the given instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetInstanceMaintenanceEventResponse> getInstanceMaintenanceEvent(
            GetInstanceMaintenanceEventRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetInstanceMaintenanceEventRequest, GetInstanceMaintenanceEventResponse>
                    handler);

    /**
     * Gets the maximum possible date that a maintenance reboot can be extended. For more information, see
     * [Infrastructure Maintenance](https://docs.cloud.oracle.com/iaas/Content/Compute/References/infrastructure-maintenance.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetInstanceMaintenanceRebootResponse> getInstanceMaintenanceReboot(
            GetInstanceMaintenanceRebootRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetInstanceMaintenanceRebootRequest,
                            GetInstanceMaintenanceRebootResponse>
                    handler);

    /**
     * Gets the measured boot report for this shielded instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetMeasuredBootReportResponse> getMeasuredBootReport(
            GetMeasuredBootReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetMeasuredBootReportRequest, GetMeasuredBootReportResponse>
                    handler);

    /**
     * Gets the information for the specified VNIC attachment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVnicAttachmentResponse> getVnicAttachment(
            GetVnicAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetVnicAttachmentRequest, GetVnicAttachmentResponse>
                    handler);

    /**
     * Gets information about the specified volume attachment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVolumeAttachmentResponse> getVolumeAttachment(
            GetVolumeAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetVolumeAttachmentRequest, GetVolumeAttachmentResponse>
                    handler);

    /**
     * Gets the generated credentials for the instance. Only works for instances that require a password to log in, such as Windows.
     * For certain operating systems, users will be forced to change the initial credentials.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetWindowsInstanceInitialCredentialsResponse>
            getWindowsInstanceInitialCredentials(
                    GetWindowsInstanceInitialCredentialsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetWindowsInstanceInitialCredentialsRequest,
                                    GetWindowsInstanceInitialCredentialsResponse>
                            handler);

    /**
     * Performs one of the following power actions on the specified instance:
     * <p>
     * - **START** - Powers on the instance.
     * <p>
     * - **STOP** - Powers off the instance.
     * <p>
     * - **RESET** - Powers off the instance and then powers it back on.
     * <p>
     * - **SOFTSTOP** - Gracefully shuts down the instance by sending a shutdown command to the operating system.
     * After waiting 15 minutes for the OS to shut down, the instance is powered off.
     * If the applications that run on the instance take more than 15 minutes to shut down, they could be improperly stopped, resulting
     * in data corruption. To avoid this, manually shut down the instance using the commands available in the OS before you softstop the
     * instance.
     * <p>
     * - **SOFTRESET** - Gracefully reboots the instance by sending a shutdown command to the operating system.
     * After waiting 15 minutes for the OS to shut down, the instance is powered off and
     * then powered back on.
     * <p>
     *
     * - **SENDDIAGNOSTICINTERRUPT** - For advanced users. **Caution: Sending a diagnostic interrupt to a live system can
     * cause data corruption or system failure.** Sends a diagnostic interrupt that causes the instance's
     * OS to crash and then reboot. Before you send a diagnostic interrupt, you must configure the instance to generate a
     * crash dump file when it crashes. The crash dump captures information about the state of the OS at the time of
     * the crash. After the OS restarts, you can analyze the crash dump to diagnose the issue. For more information, see
     * [Sending a Diagnostic Interrupt](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/sendingdiagnosticinterrupt.htm).
     * <p>
     *
     * <p>
     * - **DIAGNOSTICREBOOT** - Powers off the instance, rebuilds it, and then powers it back on.
     * Before you send a diagnostic reboot, restart the instance's OS, confirm that the instance and networking settings are configured
     * correctly, and try other [troubleshooting steps](https://docs.cloud.oracle.com/iaas/Content/Compute/References/troubleshooting-compute-instances.htm).
     * Use diagnostic reboot as a final attempt to troubleshoot an unreachable instance. For virtual machine (VM) instances only.
     * For more information, see [Performing a Diagnostic Reboot](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/diagnostic-reboot.htm).
     * <p>
     *
     * - **REBOOTMIGRATE** - Powers off the instance, moves it to new hardware, and then powers it back on. For more information, see
     * [Infrastructure Maintenance](https://docs.cloud.oracle.com/iaas/Content/Compute/References/infrastructure-maintenance.htm).
     * <p>
     *
     * For more information about managing instance lifecycle states, see
     * [Stopping and Starting an Instance](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/restartinginstance.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<InstanceActionResponse> instanceAction(
            InstanceActionRequest request,
            com.oracle.bmc.responses.AsyncHandler<InstanceActionRequest, InstanceActionResponse>
                    handler);

    /**
     * Creates a new instance in the specified compartment and the specified availability domain.
     * For general information about instances, see
     * [Overview of the Compute Service](https://docs.cloud.oracle.com/iaas/Content/Compute/Concepts/computeoverview.htm).
     * <p>
     * For information about access control and compartments, see
     * [Overview of the IAM Service](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/overview.htm).
     * <p>
     * For information about availability domains, see
     * [Regions and Availability Domains](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm).
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
     * addresses, use the {@link #listVnicAttachments(ListVnicAttachmentsRequest, Consumer, Consumer) listVnicAttachments}
     * operation to get the VNIC ID for the instance, and then call
     * {@link #getVnic(GetVnicRequest, Consumer, Consumer) getVnic} with the VNIC ID.
     * <p>
     * You can later add secondary VNICs to an instance. For more information, see
     * [Virtual Network Interface Cards (VNICs)](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
     * <p>
     * To launch an instance from a Marketplace image listing, you must provide the image ID of the
     * listing resource version that you want, but you also must subscribe to the listing before you try
     * to launch the instance. To subscribe to the listing, use the {@link #getAppCatalogListingAgreements(GetAppCatalogListingAgreementsRequest, Consumer, Consumer) getAppCatalogListingAgreements}
     * operation to get the signature for the terms of use agreement for the desired listing resource version.
     * Then, call {@link #createAppCatalogSubscription(CreateAppCatalogSubscriptionRequest, Consumer, Consumer) createAppCatalogSubscription}
     * with the signature. To get the image ID for the LaunchInstance operation, call
     * {@link #getAppCatalogListingResourceVersion(GetAppCatalogListingResourceVersionRequest, Consumer, Consumer) getAppCatalogListingResourceVersion}.
     * <p>
     * When launching an instance, you may provide the `securityAttributes` parameter in
     * {@link LaunchInstanceDetails} to manage security attributes via the instance,
     * or in the embedded {@link CreateVnicDetails} to manage security attributes
     * via the VNIC directly, but not both.  Providing `securityAttributes` in both locations will return a
     * 400 Bad Request response.
     * <p>
     * To determine whether capacity is available for a specific shape before you create an instance,
     * use the {@link #createComputeCapacityReport(CreateComputeCapacityReportRequest, Consumer, Consumer) createComputeCapacityReport}
     * operation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<LaunchInstanceResponse> launchInstance(
            LaunchInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<LaunchInstanceRequest, LaunchInstanceResponse>
                    handler);

    /**
     * Gets all resource versions for a particular listing.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAppCatalogListingResourceVersionsResponse>
            listAppCatalogListingResourceVersions(
                    ListAppCatalogListingResourceVersionsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAppCatalogListingResourceVersionsRequest,
                                    ListAppCatalogListingResourceVersionsResponse>
                            handler);

    /**
     * Lists the published listings.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAppCatalogListingsResponse> listAppCatalogListings(
            ListAppCatalogListingsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAppCatalogListingsRequest, ListAppCatalogListingsResponse>
                    handler);

    /**
     * Lists subscriptions for a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAppCatalogSubscriptionsResponse> listAppCatalogSubscriptions(
            ListAppCatalogSubscriptionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAppCatalogSubscriptionsRequest, ListAppCatalogSubscriptionsResponse>
                    handler);

    /**
     * Lists the boot volume attachments in the specified compartment. You can filter the
     * list by specifying an instance OCID, boot volume OCID, or both.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListBootVolumeAttachmentsResponse> listBootVolumeAttachments(
            ListBootVolumeAttachmentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListBootVolumeAttachmentsRequest, ListBootVolumeAttachmentsResponse>
                    handler);

    /**
     * Lists the shapes that can be reserved within the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListComputeCapacityReservationInstanceShapesResponse>
            listComputeCapacityReservationInstanceShapes(
                    ListComputeCapacityReservationInstanceShapesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeCapacityReservationInstanceShapesRequest,
                                    ListComputeCapacityReservationInstanceShapesResponse>
                            handler);

    /**
     * Lists the instances launched under a capacity reservation. You can filter results by specifying criteria.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListComputeCapacityReservationInstancesResponse>
            listComputeCapacityReservationInstances(
                    ListComputeCapacityReservationInstancesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeCapacityReservationInstancesRequest,
                                    ListComputeCapacityReservationInstancesResponse>
                            handler);

    /**
     * Lists the compute capacity reservations that match the specified criteria and compartment.
     * <p>
     * You can limit the list by specifying a compute capacity reservation display name
     * (the list will include all the identically-named compute capacity reservations in the compartment).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListComputeCapacityReservationsResponse>
            listComputeCapacityReservations(
                    ListComputeCapacityReservationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeCapacityReservationsRequest,
                                    ListComputeCapacityReservationsResponse>
                            handler);

    /**
     * Lists the compute capacity topologies in the specified compartment. You can filter the list by a compute
     * capacity topology display name.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListComputeCapacityTopologiesResponse>
            listComputeCapacityTopologies(
                    ListComputeCapacityTopologiesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeCapacityTopologiesRequest,
                                    ListComputeCapacityTopologiesResponse>
                            handler);

    /**
     * Lists compute bare metal hosts in the specified compute capacity topology.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListComputeCapacityTopologyComputeBareMetalHostsResponse>
            listComputeCapacityTopologyComputeBareMetalHosts(
                    ListComputeCapacityTopologyComputeBareMetalHostsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeCapacityTopologyComputeBareMetalHostsRequest,
                                    ListComputeCapacityTopologyComputeBareMetalHostsResponse>
                            handler);

    /**
     * Lists compute HPC islands in the specified compute capacity topology.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListComputeCapacityTopologyComputeHpcIslandsResponse>
            listComputeCapacityTopologyComputeHpcIslands(
                    ListComputeCapacityTopologyComputeHpcIslandsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeCapacityTopologyComputeHpcIslandsRequest,
                                    ListComputeCapacityTopologyComputeHpcIslandsResponse>
                            handler);

    /**
     * Lists compute network blocks in the specified compute capacity topology.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListComputeCapacityTopologyComputeNetworkBlocksResponse>
            listComputeCapacityTopologyComputeNetworkBlocks(
                    ListComputeCapacityTopologyComputeNetworkBlocksRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeCapacityTopologyComputeNetworkBlocksRequest,
                                    ListComputeCapacityTopologyComputeNetworkBlocksResponse>
                            handler);

    /**
     * Lists the compute clusters in the specified compartment.
     * A [compute cluster](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm) is a remote direct memory access (RDMA) network group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListComputeClustersResponse> listComputeClusters(
            ListComputeClustersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListComputeClustersRequest, ListComputeClustersResponse>
                    handler);

    /**
     * Lists Compute Global Image Capability Schema versions in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListComputeGlobalImageCapabilitySchemaVersionsResponse>
            listComputeGlobalImageCapabilitySchemaVersions(
                    ListComputeGlobalImageCapabilitySchemaVersionsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeGlobalImageCapabilitySchemaVersionsRequest,
                                    ListComputeGlobalImageCapabilitySchemaVersionsResponse>
                            handler);

    /**
     * Lists Compute Global Image Capability Schema in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListComputeGlobalImageCapabilitySchemasResponse>
            listComputeGlobalImageCapabilitySchemas(
                    ListComputeGlobalImageCapabilitySchemasRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeGlobalImageCapabilitySchemasRequest,
                                    ListComputeGlobalImageCapabilitySchemasResponse>
                            handler);

    /**
     * Lists Compute Image Capability Schema in the specified compartment. You can also query by a specific imageId.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListComputeImageCapabilitySchemasResponse>
            listComputeImageCapabilitySchemas(
                    ListComputeImageCapabilitySchemasRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListComputeImageCapabilitySchemasRequest,
                                    ListComputeImageCapabilitySchemasResponse>
                            handler);

    /**
     * Lists the console history metadata for the specified compartment or instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListConsoleHistoriesResponse> listConsoleHistories(
            ListConsoleHistoriesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListConsoleHistoriesRequest, ListConsoleHistoriesResponse>
                    handler);

    /**
     * Lists the shapes that can be used to launch a virtual machine instance on a dedicated virtual machine host within the specified compartment.
     * You can filter the list by compatibility with a specific dedicated virtual machine host shape.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDedicatedVmHostInstanceShapesResponse>
            listDedicatedVmHostInstanceShapes(
                    ListDedicatedVmHostInstanceShapesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDedicatedVmHostInstanceShapesRequest,
                                    ListDedicatedVmHostInstanceShapesResponse>
                            handler);

    /**
     * Returns the list of instances on the dedicated virtual machine hosts that match the specified criteria.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDedicatedVmHostInstancesResponse> listDedicatedVmHostInstances(
            ListDedicatedVmHostInstancesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDedicatedVmHostInstancesRequest,
                            ListDedicatedVmHostInstancesResponse>
                    handler);

    /**
     * Lists the shapes that can be used to launch a dedicated virtual machine host within the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDedicatedVmHostShapesResponse> listDedicatedVmHostShapes(
            ListDedicatedVmHostShapesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDedicatedVmHostShapesRequest, ListDedicatedVmHostShapesResponse>
                    handler);

    /**
     * Returns the list of dedicated virtual machine hosts that match the specified criteria in the specified compartment.
     * <p>
     * You can limit the list by specifying a dedicated virtual machine host display name. The list will include all the identically-named
     * dedicated virtual machine hosts in the compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDedicatedVmHostsResponse> listDedicatedVmHosts(
            ListDedicatedVmHostsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDedicatedVmHostsRequest, ListDedicatedVmHostsResponse>
                    handler);

    /**
     * Lists the compatible shapes for the specified image.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListImageShapeCompatibilityEntriesResponse>
            listImageShapeCompatibilityEntries(
                    ListImageShapeCompatibilityEntriesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListImageShapeCompatibilityEntriesRequest,
                                    ListImageShapeCompatibilityEntriesResponse>
                            handler);

    /**
     * Lists a subset of images available in the specified compartment, including
     * [platform images](https://docs.cloud.oracle.com/iaas/Content/Compute/References/images.htm) and
     * [custom images](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/managingcustomimages.htm).
     * The list of platform images includes the three most recently published versions
     * of each major distribution. The list does not support filtering based on image tags.
     * <p>
     * The list of images returned is ordered to first show the recent platform images,
     * then all of the custom images.
     * <p>
     **Caution:** Platform images are refreshed regularly. When new images are released, older versions are replaced.
     * The image OCIDs remain available, but when the platform image is replaced, the image OCIDs are no longer returned as part of the platform image list.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListImagesResponse> listImages(
            ListImagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListImagesRequest, ListImagesResponse> handler);

    /**
     * Lists the console connections for the specified compartment or instance.
     * <p>
     * For more information about instance console connections, see [Troubleshooting Instances Using Instance Console Connections](https://docs.cloud.oracle.com/iaas/Content/Compute/References/serialconsole.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListInstanceConsoleConnectionsResponse>
            listInstanceConsoleConnections(
                    ListInstanceConsoleConnectionsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListInstanceConsoleConnectionsRequest,
                                    ListInstanceConsoleConnectionsResponse>
                            handler);

    /**
     * Gets a list of all the devices for given instance. You can optionally filter results by device availability.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListInstanceDevicesResponse> listInstanceDevices(
            ListInstanceDevicesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListInstanceDevicesRequest, ListInstanceDevicesResponse>
                    handler);

    /**
     * Gets a list of all the maintenance events for the given instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListInstanceMaintenanceEventsResponse>
            listInstanceMaintenanceEvents(
                    ListInstanceMaintenanceEventsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListInstanceMaintenanceEventsRequest,
                                    ListInstanceMaintenanceEventsResponse>
                            handler);

    /**
     * Lists the instances in the specified compartment and the specified availability domain.
     * You can filter the results by specifying an instance name (the list will include all the identically-named
     * instances in the compartment).
     * <p>
     **Note:** To retrieve public and private IP addresses for an instance, use the {@link #listVnicAttachments(ListVnicAttachmentsRequest, Consumer, Consumer) listVnicAttachments}
     * operation to get the VNIC ID for the instance, and then call {@link #getVnic(GetVnicRequest, Consumer, Consumer) getVnic} with the VNIC ID.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListInstancesResponse> listInstances(
            ListInstancesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListInstancesRequest, ListInstancesResponse>
                    handler);

    /**
     * Lists the shapes that can be used to launch an instance within the specified compartment. You can
     * filter the list by compatibility with a specific image.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListShapesResponse> listShapes(
            ListShapesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListShapesRequest, ListShapesResponse> handler);

    /**
     * Lists the VNIC attachments in the specified compartment. A VNIC attachment
     * resides in the same compartment as the attached instance. The list can be
     * filtered by instance, VNIC, or availability domain.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVnicAttachmentsResponse> listVnicAttachments(
            ListVnicAttachmentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListVnicAttachmentsRequest, ListVnicAttachmentsResponse>
                    handler);

    /**
     * Lists the volume attachments in the specified compartment. You can filter the
     * list by specifying an instance OCID, volume OCID, or both.
     * <p>
     * Currently, the only supported volume attachment type are {@link IScsiVolumeAttachment} and
     * {@link ParavirtualizedVolumeAttachment}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVolumeAttachmentsResponse> listVolumeAttachments(
            ListVolumeAttachmentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListVolumeAttachmentsRequest, ListVolumeAttachmentsResponse>
                    handler);

    /**
     * Removes a shape from the compatible shapes list for the image.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveImageShapeCompatibilityEntryResponse>
            removeImageShapeCompatibilityEntry(
                    RemoveImageShapeCompatibilityEntryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveImageShapeCompatibilityEntryRequest,
                                    RemoveImageShapeCompatibilityEntryResponse>
                            handler);

    /**
     * Permanently terminates (deletes) the specified instance. Any attached VNICs and volumes are automatically detached
     * when the instance terminates.
     * <p>
     * To preserve the boot volume associated with the instance, specify `true` for `PreserveBootVolumeQueryParam`.
     * To delete the boot volume when the instance is deleted, specify `false` or do not specify a value for `PreserveBootVolumeQueryParam`.
     * <p>
     * To preserve data volumes created with the instance, specify `true` or do not specify a value for `PreserveDataVolumesQueryParam`.
     * To delete the data volumes when the instance itself is deleted, specify `false` for `PreserveDataVolumesQueryParam`.
     * <p>
     * This is an asynchronous operation. The instance's `lifecycleState` changes to TERMINATING temporarily
     * until the instance is completely deleted. After the instance is deleted, the record remains visible in the list of instances
     * with the state TERMINATED for at least 12 hours, but no further action is needed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<TerminateInstanceResponse> terminateInstance(
            TerminateInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            TerminateInstanceRequest, TerminateInstanceResponse>
                    handler);

    /**
     * Updates the specified capacity reservation and its associated capacity configurations.
     * Fields that are not provided in the request will not be updated. Capacity configurations that are not included will be deleted.
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
    java.util.concurrent.Future<UpdateComputeCapacityReservationResponse>
            updateComputeCapacityReservation(
                    UpdateComputeCapacityReservationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateComputeCapacityReservationRequest,
                                    UpdateComputeCapacityReservationResponse>
                            handler);

    /**
     * Updates the specified compute capacity topology. Fields that are not provided in the request will not be updated.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateComputeCapacityTopologyResponse>
            updateComputeCapacityTopology(
                    UpdateComputeCapacityTopologyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateComputeCapacityTopologyRequest,
                                    UpdateComputeCapacityTopologyResponse>
                            handler);

    /**
     * Updates a compute cluster. A [compute cluster](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm) is a
     * remote direct memory access (RDMA) network group.
     * <p>
     * To create instances within a compute cluster, use the {@link #launchInstance(LaunchInstanceRequest, Consumer, Consumer) launchInstance}
     * operation.
     * <p>
     * To delete instances from a compute cluster, use the {@link #terminateInstance(TerminateInstanceRequest, Consumer, Consumer) terminateInstance}
     * operation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateComputeClusterResponse> updateComputeCluster(
            UpdateComputeClusterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateComputeClusterRequest, UpdateComputeClusterResponse>
                    handler);

    /**
     * Updates the specified Compute Image Capability Schema
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateComputeImageCapabilitySchemaResponse>
            updateComputeImageCapabilitySchema(
                    UpdateComputeImageCapabilitySchemaRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateComputeImageCapabilitySchemaRequest,
                                    UpdateComputeImageCapabilitySchemaResponse>
                            handler);

    /**
     * Updates the specified console history metadata.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateConsoleHistoryResponse> updateConsoleHistory(
            UpdateConsoleHistoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateConsoleHistoryRequest, UpdateConsoleHistoryResponse>
                    handler);

    /**
     * Updates the displayName, freeformTags, and definedTags attributes for the specified dedicated virtual machine host.
     * If an attribute value is not included, it will not be updated.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDedicatedVmHostResponse> updateDedicatedVmHost(
            UpdateDedicatedVmHostRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDedicatedVmHostRequest, UpdateDedicatedVmHostResponse>
                    handler);

    /**
     * Updates the display name of the image. Avoid entering confidential information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateImageResponse> updateImage(
            UpdateImageRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateImageRequest, UpdateImageResponse> handler);

    /**
     * Updates certain fields on the specified instance. Fields that are not provided in the
     * request will not be updated. Avoid entering confidential information.
     * <p>
     * Changes to metadata fields will be reflected in the instance metadata service (this may take
     * up to a minute).
     * <p>
     * The OCID of the instance remains the same.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateInstanceResponse> updateInstance(
            UpdateInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateInstanceRequest, UpdateInstanceResponse>
                    handler);

    /**
     * Updates the defined tags and free-form tags for the specified instance console connection.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateInstanceConsoleConnectionResponse>
            updateInstanceConsoleConnection(
                    UpdateInstanceConsoleConnectionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateInstanceConsoleConnectionRequest,
                                    UpdateInstanceConsoleConnectionResponse>
                            handler);

    /**
     * Updates the maintenance event for the given instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateInstanceMaintenanceEventResponse>
            updateInstanceMaintenanceEvent(
                    UpdateInstanceMaintenanceEventRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateInstanceMaintenanceEventRequest,
                                    UpdateInstanceMaintenanceEventResponse>
                            handler);

    /**
     * Updates information about the specified volume attachment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateVolumeAttachmentResponse> updateVolumeAttachment(
            UpdateVolumeAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateVolumeAttachmentRequest, UpdateVolumeAttachmentResponse>
                    handler);
}
