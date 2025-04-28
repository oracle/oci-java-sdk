/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

/**
 * Use the Core Services API to manage resources such as virtual cloud networks (VCNs), compute
 * instances, and block storage volumes. For more information, see the console documentation for the
 * [Networking](https://docs.oracle.com/iaas/Content/Network/Concepts/overview.htm),
 * [Compute](https://docs.oracle.com/iaas/Content/Compute/Concepts/computeoverview.htm), and [Block
 * Volume](https://docs.oracle.com/iaas/Content/Block/Concepts/overview.htm) services. The required
 * permissions are documented in the [Details for the Core
 * Services](https://docs.oracle.com/iaas/Content/Identity/Reference/corepolicyreference.htm)
 * article.
 *
 * <p>This service client does not use circuit breakers by default if the user has not defined a
 * circuit breaker configuration.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface Compute extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this Region, however, an
     * IllegalArgumentException will be raised.
     *
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     *
     * <p>Note, this will first try to map the region ID to a known Region and call {@link
     * #setRegion(Region) setRegion}.
     *
     * <p>If no known Region could be determined, it will create an endpoint based on the default
     * endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     *
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Determines whether realm specific endpoint should be used or not. Set
     * realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm
     * specific endpoint template, otherwise set it to "false"
     *
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint
     *     template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Accept the changes to the PCR values in the measured boot report.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/AcceptShieldedIntegrityPolicyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AcceptShieldedIntegrityPolicy API.
     */
    AcceptShieldedIntegrityPolicyResponse acceptShieldedIntegrityPolicy(
            AcceptShieldedIntegrityPolicyRequest request);

    /**
     * Adds a shape to the compatible shapes list for the image.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/AddImageShapeCompatibilityEntryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AddImageShapeCompatibilityEntry API.
     */
    AddImageShapeCompatibilityEntryResponse addImageShapeCompatibilityEntry(
            AddImageShapeCompatibilityEntryRequest request);

    /**
     * Attaches the specified boot volume to the specified instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/AttachBootVolumeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use AttachBootVolume
     *     API.
     */
    AttachBootVolumeResponse attachBootVolume(AttachBootVolumeRequest request);

    /**
     * Creates a secondary VNIC and attaches it to the specified instance. For more information
     * about secondary VNICs, see [Virtual Network Interface Cards
     * (VNICs)](https://docs.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/AttachVnicExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use AttachVnic API.
     */
    AttachVnicResponse attachVnic(AttachVnicRequest request);

    /**
     * Attaches the specified storage volume to the specified instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/AttachVolumeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use AttachVolume API.
     */
    AttachVolumeResponse attachVolume(AttachVolumeRequest request);

    /**
     * Captures the most recent serial console data (up to a megabyte) for the specified instance.
     *
     * <p>The `CaptureConsoleHistory` operation works with the other console history operations as
     * described below.
     *
     * <p>1. Use `CaptureConsoleHistory` to request the capture of up to a megabyte of the most
     * recent console history. This call returns a `ConsoleHistory` object. The object will have a
     * state of REQUESTED. 2. Wait for the capture operation to succeed by polling
     * `GetConsoleHistory` with the identifier of the console history metadata. The state of the
     * `ConsoleHistory` object will go from REQUESTED to GETTING-HISTORY and then SUCCEEDED (or
     * FAILED). 3. Use `GetConsoleHistoryContent` to get the actual console history data (not the
     * metadata). 4. Optionally, use `DeleteConsoleHistory` to delete the console history metadata
     * and the console history data.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CaptureConsoleHistoryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CaptureConsoleHistory API.
     */
    CaptureConsoleHistoryResponse captureConsoleHistory(CaptureConsoleHistoryRequest request);

    /**
     * Moves a compute capacity reservation into a different compartment. For information about
     * moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeComputeCapacityReservationCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeComputeCapacityReservationCompartment API.
     */
    ChangeComputeCapacityReservationCompartmentResponse changeComputeCapacityReservationCompartment(
            ChangeComputeCapacityReservationCompartmentRequest request);

    /**
     * Moves a compute capacity topology into a different compartment. For information about moving
     * resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeComputeCapacityTopologyCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeComputeCapacityTopologyCompartment API.
     */
    ChangeComputeCapacityTopologyCompartmentResponse changeComputeCapacityTopologyCompartment(
            ChangeComputeCapacityTopologyCompartmentRequest request);

    /**
     * Moves a compute cluster into a different compartment within the same tenancy. A [compute
     * cluster](https://docs.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm) is a remote
     * direct memory access (RDMA) network group.
     *
     * <p>For information about moving resources between compartments, see [Moving Resources to a
     * Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeComputeClusterCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeComputeClusterCompartment API.
     */
    ChangeComputeClusterCompartmentResponse changeComputeClusterCompartment(
            ChangeComputeClusterCompartmentRequest request);

    /**
     * Moves a compute GPU memory cluster into a different compartment. For information about moving
     * resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeComputeGpuMemoryClusterCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeComputeGpuMemoryClusterCompartment API.
     */
    ChangeComputeGpuMemoryClusterCompartmentResponse changeComputeGpuMemoryClusterCompartment(
            ChangeComputeGpuMemoryClusterCompartmentRequest request);

    /**
     * Moves a compute GPU memory fabric into a different compartment. For information about moving
     * resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeComputeGpuMemoryFabricCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeComputeGpuMemoryFabricCompartment API.
     */
    ChangeComputeGpuMemoryFabricCompartmentResponse changeComputeGpuMemoryFabricCompartment(
            ChangeComputeGpuMemoryFabricCompartmentRequest request);

    /**
     * Moves a compute host into a different compartment. For information about moving resources
     * between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeComputeHostCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeComputeHostCompartment API.
     */
    ChangeComputeHostCompartmentResponse changeComputeHostCompartment(
            ChangeComputeHostCompartmentRequest request);

    /**
     * Moves a compute image capability schema into a different compartment within the same tenancy.
     * For information about moving resources between compartments, see [Moving Resources to a
     * Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeComputeImageCapabilitySchemaCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeComputeImageCapabilitySchemaCompartment API.
     */
    ChangeComputeImageCapabilitySchemaCompartmentResponse
            changeComputeImageCapabilitySchemaCompartment(
                    ChangeComputeImageCapabilitySchemaCompartmentRequest request);

    /**
     * Moves a dedicated virtual machine host from one compartment to another.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeDedicatedVmHostCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeDedicatedVmHostCompartment API.
     */
    ChangeDedicatedVmHostCompartmentResponse changeDedicatedVmHostCompartment(
            ChangeDedicatedVmHostCompartmentRequest request);

    /**
     * Moves an image into a different compartment within the same tenancy. For information about
     * moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeImageCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeImageCompartment API.
     */
    ChangeImageCompartmentResponse changeImageCompartment(ChangeImageCompartmentRequest request);

    /**
     * Moves an instance into a different compartment within the same tenancy. For information about
     * moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * <p>When you move an instance to a different compartment, associated resources such as boot
     * volumes and VNICs are not moved.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeInstanceCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeInstanceCompartment API.
     */
    ChangeInstanceCompartmentResponse changeInstanceCompartment(
            ChangeInstanceCompartmentRequest request);

    /**
     * Create a subscription for listing resource version for a compartment. It will take some time
     * to propagate to all regions.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateAppCatalogSubscriptionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateAppCatalogSubscription API.
     */
    CreateAppCatalogSubscriptionResponse createAppCatalogSubscription(
            CreateAppCatalogSubscriptionRequest request);

    /**
     * Generates a report of the host capacity within an availability domain that is available for
     * you to create compute instances. Host capacity is the physical infrastructure that resources
     * such as compute instances run on.
     *
     * <p>Use the capacity report to determine whether sufficient capacity is available for a shape
     * before you create an instance or change the shape of an instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateComputeCapacityReportExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateComputeCapacityReport API.
     */
    CreateComputeCapacityReportResponse createComputeCapacityReport(
            CreateComputeCapacityReportRequest request);

    /**
     * Creates a new compute capacity reservation in the specified compartment and availability
     * domain. Compute capacity reservations let you reserve instances in a compartment. When you
     * launch an instance using this reservation, you are assured that you have enough space for
     * your instance, and you won't get out of capacity errors. For more information, see [Reserved
     * Capacity](https://docs.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateComputeCapacityReservationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateComputeCapacityReservation API.
     */
    CreateComputeCapacityReservationResponse createComputeCapacityReservation(
            CreateComputeCapacityReservationRequest request);

    /**
     * Creates a new compute capacity topology in the specified compartment and availability domain.
     *
     * <p>Compute capacity topologies provide the RDMA network topology of your bare metal hosts so
     * that you can launch instances on your bare metal hosts with targeted network locations.
     *
     * <p>Compute capacity topologies report the health status of your bare metal hosts.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateComputeCapacityTopologyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateComputeCapacityTopology API.
     */
    CreateComputeCapacityTopologyResponse createComputeCapacityTopology(
            CreateComputeCapacityTopologyRequest request);

    /**
     * Creates an empty [compute
     * cluster](https://docs.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm). A compute
     * cluster is a remote direct memory access (RDMA) network group.
     *
     * <p>After the compute cluster is created, you can use the compute cluster's OCID with the
     * {@link #launchInstance(LaunchInstanceRequest) launchInstance} operation to create instances
     * in the compute cluster. The instances must be created in the same compartment and
     * availability domain as the cluster.
     *
     * <p>Use compute clusters when you want to manage instances in the cluster individually in the
     * RDMA network group.
     *
     * <p>If you want predictable capacity for a specific number of identical instances that are
     * managed as a group, create a cluster network that uses instance pools by using the {@link
     * #createClusterNetwork(CreateClusterNetworkRequest) createClusterNetwork} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateComputeClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateComputeCluster API.
     */
    CreateComputeClusterResponse createComputeCluster(CreateComputeClusterRequest request);

    /**
     * Create a compute GPU memory cluster instance on a specific compute GPU memory fabric
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateComputeGpuMemoryClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateComputeGpuMemoryCluster API.
     */
    CreateComputeGpuMemoryClusterResponse createComputeGpuMemoryCluster(
            CreateComputeGpuMemoryClusterRequest request);

    /**
     * Creates compute image capability schema.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateComputeImageCapabilitySchemaExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateComputeImageCapabilitySchema API.
     */
    CreateComputeImageCapabilitySchemaResponse createComputeImageCapabilitySchema(
            CreateComputeImageCapabilitySchemaRequest request);

    /**
     * Creates a new dedicated virtual machine host in the specified compartment and the specified
     * availability domain. Dedicated virtual machine hosts enable you to run your Compute virtual
     * machine (VM) instances on dedicated servers that are a single tenant and not shared with
     * other customers. For more information, see [Dedicated Virtual Machine
     * Hosts](https://docs.oracle.com/iaas/Content/Compute/Concepts/dedicatedvmhosts.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateDedicatedVmHostExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateDedicatedVmHost API.
     */
    CreateDedicatedVmHostResponse createDedicatedVmHost(CreateDedicatedVmHostRequest request);

    /**
     * Creates a boot disk image for the specified instance or imports an exported image from the
     * Oracle Cloud Infrastructure Object Storage service.
     *
     * <p>When creating a new image, you must provide the OCID of the instance you want to use as
     * the basis for the image, and the OCID of the compartment containing that instance. For more
     * information about images, see [Managing Custom
     * Images](https://docs.oracle.com/iaas/Content/Compute/Tasks/managingcustomimages.htm).
     *
     * <p>When importing an exported image from Object Storage, you specify the source information
     * in {@link #imageSourceDetails(ImageSourceDetailsRequest) imageSourceDetails}.
     *
     * <p>When importing an image based on the namespace, bucket name, and object name, use {@link
     * #imageSourceViaObjectStorageTupleDetails(ImageSourceViaObjectStorageTupleDetailsRequest)
     * imageSourceViaObjectStorageTupleDetails}.
     *
     * <p>When importing an image based on the Object Storage URL, use {@link
     * #imageSourceViaObjectStorageUriDetails(ImageSourceViaObjectStorageUriDetailsRequest)
     * imageSourceViaObjectStorageUriDetails}. See [Object Storage
     * URLs](https://docs.oracle.com/iaas/Content/Compute/Tasks/imageimportexport.htm#URLs) and
     * [Using Pre-Authenticated
     * Requests](https://docs.oracle.com/iaas/Content/Object/Tasks/usingpreauthenticatedrequests.htm)
     * for constructing URLs for image import/export.
     *
     * <p>For more information about importing exported images, see [Image
     * Import/Export](https://docs.oracle.com/iaas/Content/Compute/Tasks/imageimportexport.htm).
     *
     * <p>You may optionally specify a *display name* for the image, which is simply a friendly name
     * or description. It does not have to be unique, and you can change it. See {@link
     * #updateImage(UpdateImageRequest) updateImage}. Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateImageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateImage API.
     */
    CreateImageResponse createImage(CreateImageRequest request);

    /**
     * Creates a new console connection to the specified instance. After the console connection has
     * been created and is available, you connect to the console using SSH.
     *
     * <p>For more information about instance console connections, see [Troubleshooting Instances
     * Using Instance Console
     * Connections](https://docs.oracle.com/iaas/Content/Compute/References/serialconsole.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateInstanceConsoleConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateInstanceConsoleConnection API.
     */
    CreateInstanceConsoleConnectionResponse createInstanceConsoleConnection(
            CreateInstanceConsoleConnectionRequest request);

    /**
     * Delete a subscription for a listing resource version for a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteAppCatalogSubscriptionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteAppCatalogSubscription API.
     */
    DeleteAppCatalogSubscriptionResponse deleteAppCatalogSubscription(
            DeleteAppCatalogSubscriptionRequest request);

    /**
     * Deletes the specified compute capacity reservation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteComputeCapacityReservationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteComputeCapacityReservation API.
     */
    DeleteComputeCapacityReservationResponse deleteComputeCapacityReservation(
            DeleteComputeCapacityReservationRequest request);

    /**
     * Deletes the specified compute capacity topology.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteComputeCapacityTopologyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteComputeCapacityTopology API.
     */
    DeleteComputeCapacityTopologyResponse deleteComputeCapacityTopology(
            DeleteComputeCapacityTopologyRequest request);

    /**
     * Deletes a compute cluster. A [compute
     * cluster](https://docs.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm) is a remote
     * direct memory access (RDMA) network group.
     *
     * <p>Before you delete a compute cluster, first delete all instances in the cluster by using
     * the {@link #terminateInstance(TerminateInstanceRequest) terminateInstance} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteComputeClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteComputeCluster API.
     */
    DeleteComputeClusterResponse deleteComputeCluster(DeleteComputeClusterRequest request);

    /**
     * Terminates and deletes the specified compute GPU memory cluster and underlying instances.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteComputeGpuMemoryClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteComputeGpuMemoryCluster API.
     */
    DeleteComputeGpuMemoryClusterResponse deleteComputeGpuMemoryCluster(
            DeleteComputeGpuMemoryClusterRequest request);

    /**
     * Deletes the specified Compute Image Capability Schema
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteComputeImageCapabilitySchemaExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteComputeImageCapabilitySchema API.
     */
    DeleteComputeImageCapabilitySchemaResponse deleteComputeImageCapabilitySchema(
            DeleteComputeImageCapabilitySchemaRequest request);

    /**
     * Deletes the specified console history metadata and the console history data.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteConsoleHistoryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteConsoleHistory API.
     */
    DeleteConsoleHistoryResponse deleteConsoleHistory(DeleteConsoleHistoryRequest request);

    /**
     * Deletes the specified dedicated virtual machine host.
     *
     * <p>If any VM instances are assigned to the dedicated virtual machine host, the delete
     * operation will fail and the service will return a 409 response code.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteDedicatedVmHostExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteDedicatedVmHost API.
     */
    DeleteDedicatedVmHostResponse deleteDedicatedVmHost(DeleteDedicatedVmHostRequest request);

    /**
     * Deletes an image.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteImageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteImage API.
     */
    DeleteImageResponse deleteImage(DeleteImageRequest request);

    /**
     * Deletes the specified instance console connection.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteInstanceConsoleConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteInstanceConsoleConnection API.
     */
    DeleteInstanceConsoleConnectionResponse deleteInstanceConsoleConnection(
            DeleteInstanceConsoleConnectionRequest request);

    /**
     * Detaches a boot volume from an instance. You must specify the OCID of the boot volume
     * attachment.
     *
     * <p>This is an asynchronous operation. The attachment's `lifecycleState` will change to
     * DETACHING temporarily until the attachment is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DetachBootVolumeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DetachBootVolume
     *     API.
     */
    DetachBootVolumeResponse detachBootVolume(DetachBootVolumeRequest request);

    /**
     * Detaches and deletes the specified secondary VNIC. This operation cannot be used on the
     * instance's primary VNIC. When you terminate an instance, all attached VNICs (primary and
     * secondary) are automatically detached and deleted.
     *
     * <p>*Important:** If the VNIC has a {@link PrivateIp} that is the [target of a route
     * rule](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#privateip),
     * deleting the VNIC causes that route rule to blackhole and the traffic will be dropped.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DetachVnicExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DetachVnic API.
     */
    DetachVnicResponse detachVnic(DetachVnicRequest request);

    /**
     * Detaches a storage volume from an instance. You must specify the OCID of the volume
     * attachment.
     *
     * <p>This is an asynchronous operation. The attachment's `lifecycleState` will change to
     * DETACHING temporarily until the attachment is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DetachVolumeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DetachVolume API.
     */
    DetachVolumeResponse detachVolume(DetachVolumeRequest request);

    /**
     * Exports the specified image to the Oracle Cloud Infrastructure Object Storage service. You
     * can use the Object Storage URL, or the namespace, bucket name, and object name when
     * specifying the location to export to.
     *
     * <p>For more information about exporting images, see [Image
     * Import/Export](https://docs.oracle.com/iaas/Content/Compute/Tasks/imageimportexport.htm).
     *
     * <p>To perform an image export, you need write access to the Object Storage bucket for the
     * image, see [Let Users Write Objects to Object Storage
     * Buckets](https://docs.oracle.com/iaas/Content/Identity/Concepts/commonpolicies.htm#Let4).
     *
     * <p>See [Object Storage
     * URLs](https://docs.oracle.com/iaas/Content/Compute/Tasks/imageimportexport.htm#URLs) and
     * [Using Pre-Authenticated
     * Requests](https://docs.oracle.com/iaas/Content/Object/Tasks/usingpreauthenticatedrequests.htm)
     * for constructing URLs for image import/export.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ExportImageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ExportImage API.
     */
    ExportImageResponse exportImage(ExportImageRequest request);

    /**
     * Gets the specified listing.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetAppCatalogListingExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetAppCatalogListing API.
     */
    GetAppCatalogListingResponse getAppCatalogListing(GetAppCatalogListingRequest request);

    /**
     * Retrieves the agreements for a particular resource version of a listing.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetAppCatalogListingAgreementsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetAppCatalogListingAgreements API.
     */
    GetAppCatalogListingAgreementsResponse getAppCatalogListingAgreements(
            GetAppCatalogListingAgreementsRequest request);

    /**
     * Gets the specified listing resource version.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetAppCatalogListingResourceVersionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetAppCatalogListingResourceVersion API.
     */
    GetAppCatalogListingResourceVersionResponse getAppCatalogListingResourceVersion(
            GetAppCatalogListingResourceVersionRequest request);

    /**
     * Gets information about the specified boot volume attachment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetBootVolumeAttachmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetBootVolumeAttachment API.
     */
    GetBootVolumeAttachmentResponse getBootVolumeAttachment(GetBootVolumeAttachmentRequest request);

    /**
     * Gets information about the specified compute capacity reservation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetComputeCapacityReservationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetComputeCapacityReservation API.
     */
    GetComputeCapacityReservationResponse getComputeCapacityReservation(
            GetComputeCapacityReservationRequest request);

    /**
     * Gets information about the specified compute capacity topology.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetComputeCapacityTopologyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetComputeCapacityTopology API.
     */
    GetComputeCapacityTopologyResponse getComputeCapacityTopology(
            GetComputeCapacityTopologyRequest request);

    /**
     * Gets information about a compute cluster. A [compute
     * cluster](https://docs.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm) is a remote
     * direct memory access (RDMA) network group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetComputeClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetComputeCluster
     *     API.
     */
    GetComputeClusterResponse getComputeCluster(GetComputeClusterRequest request);

    /**
     * Gets the specified Compute Global Image Capability Schema
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetComputeGlobalImageCapabilitySchemaExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetComputeGlobalImageCapabilitySchema API.
     */
    GetComputeGlobalImageCapabilitySchemaResponse getComputeGlobalImageCapabilitySchema(
            GetComputeGlobalImageCapabilitySchemaRequest request);

    /**
     * Gets the specified Compute Global Image Capability Schema Version
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetComputeGlobalImageCapabilitySchemaVersionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetComputeGlobalImageCapabilitySchemaVersion API.
     */
    GetComputeGlobalImageCapabilitySchemaVersionResponse
            getComputeGlobalImageCapabilitySchemaVersion(
                    GetComputeGlobalImageCapabilitySchemaVersionRequest request);

    /**
     * Gets information about the specified compute GPU memory cluster
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetComputeGpuMemoryClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetComputeGpuMemoryCluster API.
     */
    GetComputeGpuMemoryClusterResponse getComputeGpuMemoryCluster(
            GetComputeGpuMemoryClusterRequest request);

    /**
     * Gets information about the specified compute GPU memory fabric
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetComputeGpuMemoryFabricExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetComputeGpuMemoryFabric API.
     */
    GetComputeGpuMemoryFabricResponse getComputeGpuMemoryFabric(
            GetComputeGpuMemoryFabricRequest request);

    /**
     * Gets information about the specified compute host
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetComputeHostExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetComputeHost API.
     */
    GetComputeHostResponse getComputeHost(GetComputeHostRequest request);

    /**
     * Gets the specified Compute Image Capability Schema
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetComputeImageCapabilitySchemaExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetComputeImageCapabilitySchema API.
     */
    GetComputeImageCapabilitySchemaResponse getComputeImageCapabilitySchema(
            GetComputeImageCapabilitySchemaRequest request);

    /**
     * Shows the metadata for the specified console history. See {@link
     * #captureConsoleHistory(CaptureConsoleHistoryRequest) captureConsoleHistory} for details about
     * using the console history operations.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetConsoleHistoryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetConsoleHistory
     *     API.
     */
    GetConsoleHistoryResponse getConsoleHistory(GetConsoleHistoryRequest request);

    /**
     * Gets the actual console history data (not the metadata). See {@link
     * #captureConsoleHistory(CaptureConsoleHistoryRequest) captureConsoleHistory} for details about
     * using the console history operations.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetConsoleHistoryContentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetConsoleHistoryContent API.
     */
    GetConsoleHistoryContentResponse getConsoleHistoryContent(
            GetConsoleHistoryContentRequest request);

    /**
     * Gets information about the specified dedicated virtual machine host.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetDedicatedVmHostExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDedicatedVmHost
     *     API.
     */
    GetDedicatedVmHostResponse getDedicatedVmHost(GetDedicatedVmHostRequest request);

    /**
     * Gets the specified image.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetImageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetImage API.
     */
    GetImageResponse getImage(GetImageRequest request);

    /**
     * Retrieves an image shape compatibility entry.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetImageShapeCompatibilityEntryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetImageShapeCompatibilityEntry API.
     */
    GetImageShapeCompatibilityEntryResponse getImageShapeCompatibilityEntry(
            GetImageShapeCompatibilityEntryRequest request);

    /**
     * Gets information about the specified instance.
     *
     * <p>*Note:** To retrieve public and private IP addresses for an instance, use the {@link
     * #listVnicAttachments(ListVnicAttachmentsRequest) listVnicAttachments} operation to get the
     * VNIC ID for the instance, and then call {@link #getVnic(GetVnicRequest) getVnic} with the
     * VNIC ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetInstance API.
     */
    GetInstanceResponse getInstance(GetInstanceRequest request);

    /**
     * Gets the specified instance console connection's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetInstanceConsoleConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetInstanceConsoleConnection API.
     */
    GetInstanceConsoleConnectionResponse getInstanceConsoleConnection(
            GetInstanceConsoleConnectionRequest request);

    /**
     * Gets the maintenance event for the given instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetInstanceMaintenanceEventExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetInstanceMaintenanceEvent API.
     */
    GetInstanceMaintenanceEventResponse getInstanceMaintenanceEvent(
            GetInstanceMaintenanceEventRequest request);

    /**
     * Gets the maximum possible date that a maintenance reboot can be extended. For more
     * information, see [Infrastructure
     * Maintenance](https://docs.oracle.com/iaas/Content/Compute/References/infrastructure-maintenance.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetInstanceMaintenanceRebootExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetInstanceMaintenanceReboot API.
     */
    GetInstanceMaintenanceRebootResponse getInstanceMaintenanceReboot(
            GetInstanceMaintenanceRebootRequest request);

    /**
     * Gets the measured boot report for this shielded instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetMeasuredBootReportExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetMeasuredBootReport API.
     */
    GetMeasuredBootReportResponse getMeasuredBootReport(GetMeasuredBootReportRequest request);

    /**
     * Gets the information for the specified VNIC attachment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetVnicAttachmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVnicAttachment
     *     API.
     */
    GetVnicAttachmentResponse getVnicAttachment(GetVnicAttachmentRequest request);

    /**
     * Gets information about the specified volume attachment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetVolumeAttachmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVolumeAttachment
     *     API.
     */
    GetVolumeAttachmentResponse getVolumeAttachment(GetVolumeAttachmentRequest request);

    /**
     * Gets the generated credentials for the instance. Only works for instances that require a
     * password to log in, such as Windows. For certain operating systems, users will be forced to
     * change the initial credentials.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetWindowsInstanceInitialCredentialsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetWindowsInstanceInitialCredentials API.
     */
    GetWindowsInstanceInitialCredentialsResponse getWindowsInstanceInitialCredentials(
            GetWindowsInstanceInitialCredentialsRequest request);

    /**
     * Performs one of the following power actions on the specified instance:
     *
     * <p>- **START** - Powers on the instance.
     *
     * <p>- **STOP** - Powers off the instance.
     *
     * <p>- **RESET** - Powers off the instance and then powers it back on.
     *
     * <p>- **SOFTSTOP** - Gracefully shuts down the instance by sending a shutdown command to the
     * operating system. After waiting 15 minutes for the OS to shut down, the instance is powered
     * off. If the applications that run on the instance take more than 15 minutes to shut down,
     * they could be improperly stopped, resulting in data corruption. To avoid this, manually shut
     * down the instance using the commands available in the OS before you softstop the instance.
     *
     * <p>- **SOFTRESET** - Gracefully reboots the instance by sending a shutdown command to the
     * operating system. After waiting 15 minutes for the OS to shut down, the instance is powered
     * off and then powered back on.
     *
     * <p>- **SENDDIAGNOSTICINTERRUPT** - For advanced users. **Caution: Sending a diagnostic
     * interrupt to a live system can cause data corruption or system failure.** Sends a diagnostic
     * interrupt that causes the instance's OS to crash and then reboot. Before you send a
     * diagnostic interrupt, you must configure the instance to generate a crash dump file when it
     * crashes. The crash dump captures information about the state of the OS at the time of the
     * crash. After the OS restarts, you can analyze the crash dump to diagnose the issue. For more
     * information, see [Sending a Diagnostic
     * Interrupt](https://docs.oracle.com/iaas/Content/Compute/Tasks/sendingdiagnosticinterrupt.htm).
     *
     * <p>
     *
     * <p>- **DIAGNOSTICREBOOT** - Powers off the instance, rebuilds it, and then powers it back on.
     * Before you send a diagnostic reboot, restart the instance's OS, confirm that the instance and
     * networking settings are configured correctly, and try other [troubleshooting
     * steps](https://docs.oracle.com/iaas/Content/Compute/References/troubleshooting-compute-instances.htm).
     * Use diagnostic reboot as a final attempt to troubleshoot an unreachable instance. For virtual
     * machine (VM) instances only. For more information, see [Performing a Diagnostic
     * Reboot](https://docs.oracle.com/iaas/Content/Compute/Tasks/diagnostic-reboot.htm).
     *
     * <p>- **REBOOTMIGRATE** - Powers off the instance, moves it to new hardware, and then powers
     * it back on. For more information, see [Infrastructure
     * Maintenance](https://docs.oracle.com/iaas/Content/Compute/References/infrastructure-maintenance.htm).
     *
     * <p>For more information about managing instance lifecycle states, see [Stopping and Starting
     * an Instance](https://docs.oracle.com/iaas/Content/Compute/Tasks/restartinginstance.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/InstanceActionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use InstanceAction API.
     */
    InstanceActionResponse instanceAction(InstanceActionRequest request);

    /**
     * Creates a new instance in the specified compartment and the specified availability domain.
     * For general information about instances, see [Overview of the Compute
     * Service](https://docs.oracle.com/iaas/Content/Compute/Concepts/computeoverview.htm).
     *
     * <p>For information about access control and compartments, see [Overview of the IAM
     * Service](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm).
     *
     * <p>For information about availability domains, see [Regions and Availability
     * Domains](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm). To get a list of
     * availability domains, use the `ListAvailabilityDomains` operation in the Identity and Access
     * Management Service API.
     *
     * <p>All Oracle Cloud Infrastructure resources, including instances, get an Oracle-assigned,
     * unique ID called an Oracle Cloud Identifier (OCID). When you create a resource, you can find
     * its OCID in the response. You can also retrieve a resource's OCID by using a List API
     * operation on that resource type, or by viewing the resource in the Console.
     *
     * <p>To launch an instance using an image or a boot volume use the `sourceDetails` parameter in
     * {@link LaunchInstanceDetails}.
     *
     * <p>When you launch an instance, it is automatically attached to a virtual network interface
     * card (VNIC), called the *primary VNIC*. The VNIC has a private IP address from the subnet's
     * CIDR. You can either assign a private IP address of your choice or let Oracle automatically
     * assign one. You can choose whether the instance has a public IP address. To retrieve the
     * addresses, use the {@link #listVnicAttachments(ListVnicAttachmentsRequest)
     * listVnicAttachments} operation to get the VNIC ID for the instance, and then call {@link
     * #getVnic(GetVnicRequest) getVnic} with the VNIC ID.
     *
     * <p>You can later add secondary VNICs to an instance. For more information, see [Virtual
     * Network Interface Cards
     * (VNICs)](https://docs.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
     *
     * <p>To launch an instance from a Marketplace image listing, you must provide the image ID of
     * the listing resource version that you want, but you also must subscribe to the listing before
     * you try to launch the instance. To subscribe to the listing, use the {@link
     * #getAppCatalogListingAgreements(GetAppCatalogListingAgreementsRequest)
     * getAppCatalogListingAgreements} operation to get the signature for the terms of use agreement
     * for the desired listing resource version. Then, call {@link
     * #createAppCatalogSubscription(CreateAppCatalogSubscriptionRequest)
     * createAppCatalogSubscription} with the signature. To get the image ID for the LaunchInstance
     * operation, call {@link
     * #getAppCatalogListingResourceVersion(GetAppCatalogListingResourceVersionRequest)
     * getAppCatalogListingResourceVersion}.
     *
     * <p>When launching an instance, you may provide the `securityAttributes` parameter in {@link
     * LaunchInstanceDetails} to manage security attributes via the instance, or in the embedded
     * {@link CreateVnicDetails} to manage security attributes via the VNIC directly, but not both.
     * Providing `securityAttributes` in both locations will return a 400 Bad Request response.
     *
     * <p>To determine whether capacity is available for a specific shape before you create an
     * instance, use the {@link #createComputeCapacityReport(CreateComputeCapacityReportRequest)
     * createComputeCapacityReport} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/LaunchInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use LaunchInstance API.
     */
    LaunchInstanceResponse launchInstance(LaunchInstanceRequest request);

    /**
     * Gets all resource versions for a particular listing.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListAppCatalogListingResourceVersionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAppCatalogListingResourceVersions API.
     */
    ListAppCatalogListingResourceVersionsResponse listAppCatalogListingResourceVersions(
            ListAppCatalogListingResourceVersionsRequest request);

    /**
     * Lists the published listings.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListAppCatalogListingsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAppCatalogListings API.
     */
    ListAppCatalogListingsResponse listAppCatalogListings(ListAppCatalogListingsRequest request);

    /**
     * Lists subscriptions for a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListAppCatalogSubscriptionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAppCatalogSubscriptions API.
     */
    ListAppCatalogSubscriptionsResponse listAppCatalogSubscriptions(
            ListAppCatalogSubscriptionsRequest request);

    /**
     * Lists the boot volume attachments in the specified compartment. You can filter the list by
     * specifying an instance OCID, boot volume OCID, or both.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListBootVolumeAttachmentsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListBootVolumeAttachments API.
     */
    ListBootVolumeAttachmentsResponse listBootVolumeAttachments(
            ListBootVolumeAttachmentsRequest request);

    /**
     * Lists the shapes that can be reserved within the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListComputeCapacityReservationInstanceShapesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListComputeCapacityReservationInstanceShapes API.
     */
    ListComputeCapacityReservationInstanceShapesResponse
            listComputeCapacityReservationInstanceShapes(
                    ListComputeCapacityReservationInstanceShapesRequest request);

    /**
     * Lists the instances launched under a capacity reservation. You can filter results by
     * specifying criteria.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListComputeCapacityReservationInstancesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListComputeCapacityReservationInstances API.
     */
    ListComputeCapacityReservationInstancesResponse listComputeCapacityReservationInstances(
            ListComputeCapacityReservationInstancesRequest request);

    /**
     * Lists the compute capacity reservations that match the specified criteria and compartment.
     *
     * <p>You can limit the list by specifying a compute capacity reservation display name (the list
     * will include all the identically-named compute capacity reservations in the compartment).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListComputeCapacityReservationsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListComputeCapacityReservations API.
     */
    ListComputeCapacityReservationsResponse listComputeCapacityReservations(
            ListComputeCapacityReservationsRequest request);

    /**
     * Lists the compute capacity topologies in the specified compartment. You can filter the list
     * by a compute capacity topology display name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListComputeCapacityTopologiesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListComputeCapacityTopologies API.
     */
    ListComputeCapacityTopologiesResponse listComputeCapacityTopologies(
            ListComputeCapacityTopologiesRequest request);

    /**
     * Lists compute bare metal hosts in the specified compute capacity topology.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListComputeCapacityTopologyComputeBareMetalHostsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListComputeCapacityTopologyComputeBareMetalHosts API.
     */
    ListComputeCapacityTopologyComputeBareMetalHostsResponse
            listComputeCapacityTopologyComputeBareMetalHosts(
                    ListComputeCapacityTopologyComputeBareMetalHostsRequest request);

    /**
     * Lists compute HPC islands in the specified compute capacity topology.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListComputeCapacityTopologyComputeHpcIslandsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListComputeCapacityTopologyComputeHpcIslands API.
     */
    ListComputeCapacityTopologyComputeHpcIslandsResponse
            listComputeCapacityTopologyComputeHpcIslands(
                    ListComputeCapacityTopologyComputeHpcIslandsRequest request);

    /**
     * Lists compute network blocks in the specified compute capacity topology.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListComputeCapacityTopologyComputeNetworkBlocksExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListComputeCapacityTopologyComputeNetworkBlocks API.
     */
    ListComputeCapacityTopologyComputeNetworkBlocksResponse
            listComputeCapacityTopologyComputeNetworkBlocks(
                    ListComputeCapacityTopologyComputeNetworkBlocksRequest request);

    /**
     * Lists the compute clusters in the specified compartment. A [compute
     * cluster](https://docs.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm) is a remote
     * direct memory access (RDMA) network group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListComputeClustersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListComputeClusters
     *     API.
     */
    ListComputeClustersResponse listComputeClusters(ListComputeClustersRequest request);

    /**
     * Lists Compute Global Image Capability Schema versions in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListComputeGlobalImageCapabilitySchemaVersionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListComputeGlobalImageCapabilitySchemaVersions API.
     */
    ListComputeGlobalImageCapabilitySchemaVersionsResponse
            listComputeGlobalImageCapabilitySchemaVersions(
                    ListComputeGlobalImageCapabilitySchemaVersionsRequest request);

    /**
     * Lists Compute Global Image Capability Schema in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListComputeGlobalImageCapabilitySchemasExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListComputeGlobalImageCapabilitySchemas API.
     */
    ListComputeGlobalImageCapabilitySchemasResponse listComputeGlobalImageCapabilitySchemas(
            ListComputeGlobalImageCapabilitySchemasRequest request);

    /**
     * List all of the GPU memory cluster instances.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListComputeGpuMemoryClusterInstancesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListComputeGpuMemoryClusterInstances API.
     */
    ListComputeGpuMemoryClusterInstancesResponse listComputeGpuMemoryClusterInstances(
            ListComputeGpuMemoryClusterInstancesRequest request);

    /**
     * List all of the compute GPU memory clusters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListComputeGpuMemoryClustersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListComputeGpuMemoryClusters API.
     */
    ListComputeGpuMemoryClustersResponse listComputeGpuMemoryClusters(
            ListComputeGpuMemoryClustersRequest request);

    /**
     * Lists the compute GPU memory fabrics that match the specified criteria and compartmentId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListComputeGpuMemoryFabricsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListComputeGpuMemoryFabrics API.
     */
    ListComputeGpuMemoryFabricsResponse listComputeGpuMemoryFabrics(
            ListComputeGpuMemoryFabricsRequest request);

    /**
     * Generates a list of summary host details
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListComputeHostsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListComputeHosts
     *     API.
     */
    ListComputeHostsResponse listComputeHosts(ListComputeHostsRequest request);

    /**
     * Lists Compute Image Capability Schema in the specified compartment. You can also query by a
     * specific imageId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListComputeImageCapabilitySchemasExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListComputeImageCapabilitySchemas API.
     */
    ListComputeImageCapabilitySchemasResponse listComputeImageCapabilitySchemas(
            ListComputeImageCapabilitySchemasRequest request);

    /**
     * Lists the console history metadata for the specified compartment or instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListConsoleHistoriesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListConsoleHistories API.
     */
    ListConsoleHistoriesResponse listConsoleHistories(ListConsoleHistoriesRequest request);

    /**
     * Lists the shapes that can be used to launch a virtual machine instance on a dedicated virtual
     * machine host within the specified compartment. You can filter the list by compatibility with
     * a specific dedicated virtual machine host shape.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListDedicatedVmHostInstanceShapesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDedicatedVmHostInstanceShapes API.
     */
    ListDedicatedVmHostInstanceShapesResponse listDedicatedVmHostInstanceShapes(
            ListDedicatedVmHostInstanceShapesRequest request);

    /**
     * Returns the list of instances on the dedicated virtual machine hosts that match the specified
     * criteria.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListDedicatedVmHostInstancesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDedicatedVmHostInstances API.
     */
    ListDedicatedVmHostInstancesResponse listDedicatedVmHostInstances(
            ListDedicatedVmHostInstancesRequest request);

    /**
     * Lists the shapes that can be used to launch a dedicated virtual machine host within the
     * specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListDedicatedVmHostShapesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDedicatedVmHostShapes API.
     */
    ListDedicatedVmHostShapesResponse listDedicatedVmHostShapes(
            ListDedicatedVmHostShapesRequest request);

    /**
     * Returns the list of dedicated virtual machine hosts that match the specified criteria in the
     * specified compartment.
     *
     * <p>You can limit the list by specifying a dedicated virtual machine host display name. The
     * list will include all the identically-named dedicated virtual machine hosts in the
     * compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListDedicatedVmHostsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDedicatedVmHosts API.
     */
    ListDedicatedVmHostsResponse listDedicatedVmHosts(ListDedicatedVmHostsRequest request);

    /**
     * Lists the compatible shapes for the specified image.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListImageShapeCompatibilityEntriesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListImageShapeCompatibilityEntries API.
     */
    ListImageShapeCompatibilityEntriesResponse listImageShapeCompatibilityEntries(
            ListImageShapeCompatibilityEntriesRequest request);

    /**
     * Lists a subset of images available in the specified compartment, including [platform
     * images](https://docs.oracle.com/iaas/Content/Compute/References/images.htm) and [custom
     * images](https://docs.oracle.com/iaas/Content/Compute/Tasks/managingcustomimages.htm). The
     * list of platform images includes the three most recently published versions of each major
     * distribution. The list does not support filtering based on image tags.
     *
     * <p>The list of images returned is ordered to first show the recent platform images, then all
     * of the custom images.
     *
     * <p>*Caution:** Platform images are refreshed regularly. When new images are released, older
     * versions are replaced. The image OCIDs remain available, but when the platform image is
     * replaced, the image OCIDs are no longer returned as part of the platform image list.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListImagesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListImages API.
     */
    ListImagesResponse listImages(ListImagesRequest request);

    /**
     * Lists the console connections for the specified compartment or instance.
     *
     * <p>For more information about instance console connections, see [Troubleshooting Instances
     * Using Instance Console
     * Connections](https://docs.oracle.com/iaas/Content/Compute/References/serialconsole.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListInstanceConsoleConnectionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListInstanceConsoleConnections API.
     */
    ListInstanceConsoleConnectionsResponse listInstanceConsoleConnections(
            ListInstanceConsoleConnectionsRequest request);

    /**
     * Gets a list of all the devices for given instance. You can optionally filter results by
     * device availability.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListInstanceDevicesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListInstanceDevices
     *     API.
     */
    ListInstanceDevicesResponse listInstanceDevices(ListInstanceDevicesRequest request);

    /**
     * Gets a list of all the maintenance events for the given instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListInstanceMaintenanceEventsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListInstanceMaintenanceEvents API.
     */
    ListInstanceMaintenanceEventsResponse listInstanceMaintenanceEvents(
            ListInstanceMaintenanceEventsRequest request);

    /**
     * Lists the instances in the specified compartment and the specified availability domain. You
     * can filter the results by specifying an instance name (the list will include all the
     * identically-named instances in the compartment).
     *
     * <p>*Note:** To retrieve public and private IP addresses for an instance, use the {@link
     * #listVnicAttachments(ListVnicAttachmentsRequest) listVnicAttachments} operation to get the
     * VNIC ID for the instance, and then call {@link #getVnic(GetVnicRequest) getVnic} with the
     * VNIC ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListInstancesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListInstances API.
     */
    ListInstancesResponse listInstances(ListInstancesRequest request);

    /**
     * Lists the shapes that can be used to launch an instance within the specified compartment. You
     * can filter the list by compatibility with a specific image.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListShapesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListShapes API.
     */
    ListShapesResponse listShapes(ListShapesRequest request);

    /**
     * Lists the VNIC attachments in the specified compartment. A VNIC attachment resides in the
     * same compartment as the attached instance. The list can be filtered by instance, VNIC, or
     * availability domain.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListVnicAttachmentsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListVnicAttachments
     *     API.
     */
    ListVnicAttachmentsResponse listVnicAttachments(ListVnicAttachmentsRequest request);

    /**
     * Lists the volume attachments in the specified compartment. You can filter the list by
     * specifying an instance OCID, volume OCID, or both.
     *
     * <p>Currently, the only supported volume attachment type are {@link IScsiVolumeAttachment} and
     * {@link ParavirtualizedVolumeAttachment}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListVolumeAttachmentsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListVolumeAttachments API.
     */
    ListVolumeAttachmentsResponse listVolumeAttachments(ListVolumeAttachmentsRequest request);

    /**
     * Removes a shape from the compatible shapes list for the image.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/RemoveImageShapeCompatibilityEntryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemoveImageShapeCompatibilityEntry API.
     */
    RemoveImageShapeCompatibilityEntryResponse removeImageShapeCompatibilityEntry(
            RemoveImageShapeCompatibilityEntryRequest request);

    /**
     * Permanently terminates (deletes) the specified instance. Any attached VNICs and volumes are
     * automatically detached when the instance terminates.
     *
     * <p>To preserve the boot volume associated with the instance, specify `true` for
     * `PreserveBootVolumeQueryParam`. To delete the boot volume when the instance is deleted,
     * specify `false` or do not specify a value for `PreserveBootVolumeQueryParam`.
     *
     * <p>To preserve data volumes created with the instance, specify `true` or do not specify a
     * value for `PreserveDataVolumesQueryParam`. To delete the data volumes when the instance
     * itself is deleted, specify `false` for `PreserveDataVolumesQueryParam`.
     *
     * <p>This is an asynchronous operation. The instance's `lifecycleState` changes to TERMINATING
     * temporarily until the instance is completely deleted. After the instance is deleted, the
     * record remains visible in the list of instances with the state TERMINATED for at least 12
     * hours, but no further action is needed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/TerminateInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use TerminateInstance
     *     API.
     */
    TerminateInstanceResponse terminateInstance(TerminateInstanceRequest request);

    /**
     * Updates the specified capacity reservation and its associated capacity configurations. Fields
     * that are not provided in the request will not be updated. Capacity configurations that are
     * not included will be deleted. Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateComputeCapacityReservationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateComputeCapacityReservation API.
     */
    UpdateComputeCapacityReservationResponse updateComputeCapacityReservation(
            UpdateComputeCapacityReservationRequest request);

    /**
     * Updates the specified compute capacity topology. Fields that are not provided in the request
     * will not be updated.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateComputeCapacityTopologyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateComputeCapacityTopology API.
     */
    UpdateComputeCapacityTopologyResponse updateComputeCapacityTopology(
            UpdateComputeCapacityTopologyRequest request);

    /**
     * Updates a compute cluster. A [compute
     * cluster](https://docs.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm) is a remote
     * direct memory access (RDMA) network group.
     *
     * <p>To create instances within a compute cluster, use the {@link
     * #launchInstance(LaunchInstanceRequest) launchInstance} operation.
     *
     * <p>To delete instances from a compute cluster, use the {@link
     * #terminateInstance(TerminateInstanceRequest) terminateInstance} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateComputeClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateComputeCluster API.
     */
    UpdateComputeClusterResponse updateComputeCluster(UpdateComputeClusterRequest request);

    /**
     * Updates a compute gpu memory cluster resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateComputeGpuMemoryClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateComputeGpuMemoryCluster API.
     */
    UpdateComputeGpuMemoryClusterResponse updateComputeGpuMemoryCluster(
            UpdateComputeGpuMemoryClusterRequest request);

    /**
     * Customer can update displayName and tags for compute GPU memory fabric record
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateComputeGpuMemoryFabricExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateComputeGpuMemoryFabric API.
     */
    UpdateComputeGpuMemoryFabricResponse updateComputeGpuMemoryFabric(
            UpdateComputeGpuMemoryFabricRequest request);

    /**
     * Customer can update the some fields for ComputeHost record
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateComputeHostExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateComputeHost
     *     API.
     */
    UpdateComputeHostResponse updateComputeHost(UpdateComputeHostRequest request);

    /**
     * Updates the specified Compute Image Capability Schema
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateComputeImageCapabilitySchemaExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateComputeImageCapabilitySchema API.
     */
    UpdateComputeImageCapabilitySchemaResponse updateComputeImageCapabilitySchema(
            UpdateComputeImageCapabilitySchemaRequest request);

    /**
     * Updates the specified console history metadata.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateConsoleHistoryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateConsoleHistory API.
     */
    UpdateConsoleHistoryResponse updateConsoleHistory(UpdateConsoleHistoryRequest request);

    /**
     * Updates the displayName, freeformTags, and definedTags attributes for the specified dedicated
     * virtual machine host. If an attribute value is not included, it will not be updated.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateDedicatedVmHostExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateDedicatedVmHost API.
     */
    UpdateDedicatedVmHostResponse updateDedicatedVmHost(UpdateDedicatedVmHostRequest request);

    /**
     * Updates the display name of the image. Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateImageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateImage API.
     */
    UpdateImageResponse updateImage(UpdateImageRequest request);

    /**
     * Updates certain fields on the specified instance. Fields that are not provided in the request
     * will not be updated. Avoid entering confidential information.
     *
     * <p>Changes to metadata fields will be reflected in the instance metadata service (this may
     * take up to a minute).
     *
     * <p>The OCID of the instance remains the same.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateInstance API.
     */
    UpdateInstanceResponse updateInstance(UpdateInstanceRequest request);

    /**
     * Updates the defined tags and free-form tags for the specified instance console connection.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateInstanceConsoleConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateInstanceConsoleConnection API.
     */
    UpdateInstanceConsoleConnectionResponse updateInstanceConsoleConnection(
            UpdateInstanceConsoleConnectionRequest request);

    /**
     * Updates the maintenance event for the given instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateInstanceMaintenanceEventExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateInstanceMaintenanceEvent API.
     */
    UpdateInstanceMaintenanceEventResponse updateInstanceMaintenanceEvent(
            UpdateInstanceMaintenanceEventRequest request);

    /**
     * Updates information about the specified volume attachment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateVolumeAttachmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateVolumeAttachment API.
     */
    UpdateVolumeAttachmentResponse updateVolumeAttachment(UpdateVolumeAttachmentRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     * @deprecated use {@link #newWaiters(WorkRequest)} instead. Otherwise, a default one will be
     *     provided that does not support operations that rely on the {@code WorkRequestClient} for
     *     polling. An {@code IllegalStateException} will be thrown for such operations.
     */
    @Deprecated
    ComputeWaiters getWaiters();

    /**
     * Creates a new {@code ComputeWaiters} for resources for this service.
     *
     * @param workRequestClient The work request service client used to query for work request
     *     status
     * @return The service waiters.
     */
    ComputeWaiters newWaiters(com.oracle.bmc.workrequests.WorkRequest workRequestClient);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    ComputePaginators getPaginators();
}
