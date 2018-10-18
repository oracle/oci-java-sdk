/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

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
     * default endpoint format ({@link Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Creates an instance configuration
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
     * Launch an instance from an instance configuration
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    LaunchInstanceConfigurationResponse launchInstanceConfiguration(
            LaunchInstanceConfigurationRequest request);

    /**
     * Lists the available instanceConfigurations in the specific compartment.
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
     * Terminate the specified instance pool.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    TerminateInstancePoolResponse terminateInstancePool(TerminateInstancePoolRequest request);

    /**
     * Updates the freeFormTags, definedTags, and display name of an instance configuration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateInstanceConfigurationResponse updateInstanceConfiguration(
            UpdateInstanceConfigurationRequest request);

    /**
     * Update the specified instance pool.
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
     */
    ComputeManagementWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    ComputeManagementPaginators getPaginators();
}
