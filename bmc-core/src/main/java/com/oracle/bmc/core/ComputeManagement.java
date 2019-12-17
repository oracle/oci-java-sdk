/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;
import com.oracle.bmc.workrequests.WorkRequest;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface ComputeManagement extends AutoCloseable {

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
     * Attach a load balancer to the instance pool.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     */
    CreateClusterNetworkResponse createClusterNetwork(CreateClusterNetworkRequest request);

    /**
     * Creates an instance configuration. An instance configuration is a template that defines the
     * settings to use when creating Compute instances.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateInstanceConfigurationResponse createInstanceConfiguration(
            CreateInstanceConfigurationRequest request);

    /**
     * Create an instance pool.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateInstancePoolResponse createInstancePool(CreateInstancePoolRequest request);

    /**
     * Deletes an instance configuration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteInstanceConfigurationResponse deleteInstanceConfiguration(
            DeleteInstanceConfigurationRequest request);

    /**
     * Detach a load balancer from the instance pool.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DetachLoadBalancerResponse detachLoadBalancer(DetachLoadBalancerRequest request);

    /**
     * Gets information about the specified cluster network.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetClusterNetworkResponse getClusterNetwork(GetClusterNetworkRequest request);

    /**
     * Gets the specified instance configuration
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetInstanceConfigurationResponse getInstanceConfiguration(
            GetInstanceConfigurationRequest request);

    /**
     * Gets the specified instance pool
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetInstancePoolResponse getInstancePool(GetInstancePoolRequest request);

    /**
     * Gets information about a load balancer that is attached to the specified instance pool.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     */
    LaunchInstanceConfigurationResponse launchInstanceConfiguration(
            LaunchInstanceConfigurationRequest request);

    /**
     * Lists the instances in the specified cluster network.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListClusterNetworkInstancesResponse listClusterNetworkInstances(
            ListClusterNetworkInstancesRequest request);

    /**
     * Lists the cluster networks in the specified compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListClusterNetworksResponse listClusterNetworks(ListClusterNetworksRequest request);

    /**
     * Lists the instance configurations in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListInstanceConfigurationsResponse listInstanceConfigurations(
            ListInstanceConfigurationsRequest request);

    /**
     * List the instances in the specified instance pool.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListInstancePoolInstancesResponse listInstancePoolInstances(
            ListInstancePoolInstancesRequest request);

    /**
     * Lists the instance pools in the specified compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListInstancePoolsResponse listInstancePools(ListInstancePoolsRequest request);

    /**
     * Performs the reset (power off and power on) action on the specified instance pool,
     * which performs the action on all the instances in the pool.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ResetInstancePoolResponse resetInstancePool(ResetInstancePoolRequest request);

    /**
     * Performs the softreset (ACPI shutdown and power on) action on the specified instance pool,
     * which performs the action on all the instances in the pool.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    SoftresetInstancePoolResponse softresetInstancePool(SoftresetInstancePoolRequest request);

    /**
     * Performs the start (power on) action on the specified instance pool,
     * which performs the action on all the instances in the pool.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    StartInstancePoolResponse startInstancePool(StartInstancePoolRequest request);

    /**
     * Performs the stop (power off) action on the specified instance pool,
     * which performs the action on all the instances in the pool.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     */
    TerminateClusterNetworkResponse terminateClusterNetwork(TerminateClusterNetworkRequest request);

    /**
     * Terminate the specified instance pool.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    TerminateInstancePoolResponse terminateInstancePool(TerminateInstancePoolRequest request);

    /**
     * Updates the specified cluster network. The OCID of the cluster network remains the same.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateClusterNetworkResponse updateClusterNetwork(UpdateClusterNetworkRequest request);

    /**
     * Updates the free-form tags, defined tags, and display name of an instance configuration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
    ComputeManagementWaiters newWaiters(WorkRequest workRequestClient);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    ComputeManagementPaginators getPaginators();
}
