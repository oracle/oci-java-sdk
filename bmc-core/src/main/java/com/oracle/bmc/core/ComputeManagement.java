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
public interface ComputeManagement extends AutoCloseable {

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
     * Attach a load balancer to the instance pool.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/AttachLoadBalancerExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AttachLoadBalancer API.
     */
    AttachLoadBalancerResponse attachLoadBalancer(AttachLoadBalancerRequest request);

    /**
     * Moves a cluster network into a different compartment within the same tenancy. For
     * information about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     * <p>
     * When you move a cluster network to a different compartment, associated resources such as the instances
     * in the cluster network, boot volumes, and VNICs are not moved.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeClusterNetworkCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeClusterNetworkCompartment API.
     */
    ChangeClusterNetworkCompartmentResponse changeClusterNetworkCompartment(
            ChangeClusterNetworkCompartmentRequest request);

    /**
     * Moves an instance configuration into a different compartment within the same tenancy.
     * For information about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     * <p>
     * When you move an instance configuration to a different compartment, associated resources such as
     * instance pools are not moved.
     * <p>
     **Important:** Most of the properties for an existing instance configuration, including the compartment,
     * cannot be modified after you create the instance configuration. Although you can move an instance configuration
     * to a different compartment, you will not be able to use the instance configuration to manage instance pools
     * in the new compartment. If you want to update an instance configuration to point to a different compartment,
     * you should instead create a new instance configuration in the target compartment using
     * [CreateInstanceConfiguration](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/20160918/InstanceConfiguration/CreateInstanceConfiguration).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeInstanceConfigurationCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeInstanceConfigurationCompartment API.
     */
    ChangeInstanceConfigurationCompartmentResponse changeInstanceConfigurationCompartment(
            ChangeInstanceConfigurationCompartmentRequest request);

    /**
     * Moves an instance pool into a different compartment within the same tenancy. For
     * information about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     * <p>
     * When you move an instance pool to a different compartment, associated resources such as the instances in
     * the pool, boot volumes, VNICs, and autoscaling configurations are not moved.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeInstancePoolCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeInstancePoolCompartment API.
     */
    ChangeInstancePoolCompartmentResponse changeInstancePoolCompartment(
            ChangeInstancePoolCompartmentRequest request);

    /**
     * Creates a cluster network. For more information about cluster networks, see
     * [Managing Cluster Networks](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/managingclusternetworks.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateClusterNetworkExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateClusterNetwork API.
     */
    CreateClusterNetworkResponse createClusterNetwork(CreateClusterNetworkRequest request);

    /**
     * Creates an instance configuration. An instance configuration is a template that defines the
     * settings to use when creating Compute instances.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateInstanceConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateInstanceConfiguration API.
     */
    CreateInstanceConfigurationResponse createInstanceConfiguration(
            CreateInstanceConfigurationRequest request);

    /**
     * Create an instance pool.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateInstancePoolExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateInstancePool API.
     */
    CreateInstancePoolResponse createInstancePool(CreateInstancePoolRequest request);

    /**
     * Deletes an instance configuration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteInstanceConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteInstanceConfiguration API.
     */
    DeleteInstanceConfigurationResponse deleteInstanceConfiguration(
            DeleteInstanceConfigurationRequest request);

    /**
     * Detach a load balancer from the instance pool.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DetachLoadBalancerExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DetachLoadBalancer API.
     */
    DetachLoadBalancerResponse detachLoadBalancer(DetachLoadBalancerRequest request);

    /**
     * Gets information about the specified cluster network.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetClusterNetworkExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetClusterNetwork API.
     */
    GetClusterNetworkResponse getClusterNetwork(GetClusterNetworkRequest request);

    /**
     * Gets the specified instance configuration
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetInstanceConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetInstanceConfiguration API.
     */
    GetInstanceConfigurationResponse getInstanceConfiguration(
            GetInstanceConfigurationRequest request);

    /**
     * Gets the specified instance pool
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetInstancePoolExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetInstancePool API.
     */
    GetInstancePoolResponse getInstancePool(GetInstancePoolRequest request);

    /**
     * Gets information about a load balancer that is attached to the specified instance pool.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetInstancePoolLoadBalancerAttachmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetInstancePoolLoadBalancerAttachment API.
     */
    GetInstancePoolLoadBalancerAttachmentResponse getInstancePoolLoadBalancerAttachment(
            GetInstancePoolLoadBalancerAttachmentRequest request);

    /**
     * Launches an instance from an instance configuration.
     * <p>
     * If the instance configuration does not include all of the parameters that are
     * required to launch an instance, such as the availability domain and subnet ID, you must
     * provide these parameters when you launch an instance from the instance configuration.
     * For more information, see the {@link InstanceConfiguration}
     * resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/LaunchInstanceConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use LaunchInstanceConfiguration API.
     */
    LaunchInstanceConfigurationResponse launchInstanceConfiguration(
            LaunchInstanceConfigurationRequest request);

    /**
     * Lists the instances in the specified cluster network.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListClusterNetworkInstancesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListClusterNetworkInstances API.
     */
    ListClusterNetworkInstancesResponse listClusterNetworkInstances(
            ListClusterNetworkInstancesRequest request);

    /**
     * Lists the cluster networks in the specified compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListClusterNetworksExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListClusterNetworks API.
     */
    ListClusterNetworksResponse listClusterNetworks(ListClusterNetworksRequest request);

    /**
     * Lists the instance configurations in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListInstanceConfigurationsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListInstanceConfigurations API.
     */
    ListInstanceConfigurationsResponse listInstanceConfigurations(
            ListInstanceConfigurationsRequest request);

    /**
     * List the instances in the specified instance pool.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListInstancePoolInstancesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListInstancePoolInstances API.
     */
    ListInstancePoolInstancesResponse listInstancePoolInstances(
            ListInstancePoolInstancesRequest request);

    /**
     * Lists the instance pools in the specified compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListInstancePoolsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListInstancePools API.
     */
    ListInstancePoolsResponse listInstancePools(ListInstancePoolsRequest request);

    /**
     * Performs the reset (immediate power off and power on) action on the specified instance pool,
     * which performs the action on all the instances in the pool.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ResetInstancePoolExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ResetInstancePool API.
     */
    ResetInstancePoolResponse resetInstancePool(ResetInstancePoolRequest request);

    /**
     * Performs the softreset (ACPI shutdown and power on) action on the specified instance pool,
     * which performs the action on all the instances in the pool.
     * <p>
     * Softreset gracefully reboots the instances by sending a shutdown command to the operating systems.
     * After waiting 15 minutes for the OS to shut down, the instances are powered off and then powered back on.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/SoftresetInstancePoolExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SoftresetInstancePool API.
     */
    SoftresetInstancePoolResponse softresetInstancePool(SoftresetInstancePoolRequest request);

    /**
     * Performs the start (power on) action on the specified instance pool,
     * which performs the action on all the instances in the pool.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/StartInstancePoolExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use StartInstancePool API.
     */
    StartInstancePoolResponse startInstancePool(StartInstancePoolRequest request);

    /**
     * Performs the stop (immediate power off) action on the specified instance pool,
     * which performs the action on all the instances in the pool.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/StopInstancePoolExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use StopInstancePool API.
     */
    StopInstancePoolResponse stopInstancePool(StopInstancePoolRequest request);

    /**
     * Terminates the specified cluster network.
     * <p>
     * When you delete a cluster network, all of its resources are permanently deleted,
     * including associated instances and instance pools.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/TerminateClusterNetworkExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use TerminateClusterNetwork API.
     */
    TerminateClusterNetworkResponse terminateClusterNetwork(TerminateClusterNetworkRequest request);

    /**
     * Terminate the specified instance pool.
     * <p>
     **Warning:** When you delete an instance pool, the resources that were created by the pool are permanently
     * deleted, including associated instances, attached boot volumes, and block volumes.
     * <p>
     * If an autoscaling configuration applies to the instance pool, the autoscaling configuration will be deleted
     * asynchronously after the pool is deleted. You can also manually delete the autoscaling configuration using
     * the `DeleteAutoScalingConfiguration` operation in the Autoscaling API.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/TerminateInstancePoolExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use TerminateInstancePool API.
     */
    TerminateInstancePoolResponse terminateInstancePool(TerminateInstancePoolRequest request);

    /**
     * Updates the specified cluster network. The OCID of the cluster network remains the same.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateClusterNetworkExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateClusterNetwork API.
     */
    UpdateClusterNetworkResponse updateClusterNetwork(UpdateClusterNetworkRequest request);

    /**
     * Updates the free-form tags, defined tags, and display name of an instance configuration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateInstanceConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateInstanceConfiguration API.
     */
    UpdateInstanceConfigurationResponse updateInstanceConfiguration(
            UpdateInstanceConfigurationRequest request);

    /**
     * Update the specified instance pool.
     * <p>
     * The OCID of the instance pool remains the same.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateInstancePoolExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateInstancePool API.
     */
    UpdateInstancePoolResponse updateInstancePool(UpdateInstancePoolRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     * @deprecated use {@link #newWaiters(WorkRequest)} instead.  Otherwise, a default one will be provided
     *   that does not support operations that rely on the {@code WorkRequestClient} for polling.  An
     *   {@code IllegalStateException} will be thrown for such operations.
     */
    @Deprecated
    ComputeManagementWaiters getWaiters();

    /**
     * Creates a new {@code ComputeManagementWaiters} for resources for this service.
     *
     * @param workRequestClient The work request service client used to query for work request status
     * @return The service waiters.
     */
    ComputeManagementWaiters newWaiters(com.oracle.bmc.workrequests.WorkRequest workRequestClient);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    ComputeManagementPaginators getPaginators();
}
