/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.autoscaling;

import com.oracle.bmc.autoscaling.requests.*;
import com.oracle.bmc.autoscaling.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public interface AutoScaling extends AutoCloseable {

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
     * Create an AutoScalingConfiguration
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateAutoScalingConfigurationResponse createAutoScalingConfiguration(
            CreateAutoScalingConfigurationRequest request);

    /**
     * Create a Policy for AutoScalingConfiguration
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateAutoScalingPolicyResponse createAutoScalingPolicy(CreateAutoScalingPolicyRequest request);

    /**
     * Deletes an AutoScalingConfiguration
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteAutoScalingConfigurationResponse deleteAutoScalingConfiguration(
            DeleteAutoScalingConfigurationRequest request);

    /**
     * Deletes an AutoScalingConfiguration Policy
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteAutoScalingPolicyResponse deleteAutoScalingPolicy(DeleteAutoScalingPolicyRequest request);

    /**
     * Get AutoScalingConfiguration
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetAutoScalingConfigurationResponse getAutoScalingConfiguration(
            GetAutoScalingConfigurationRequest request);

    /**
     * Get Policy from a specific AutoScalingConfiguration
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetAutoScalingPolicyResponse getAutoScalingPolicy(GetAutoScalingPolicyRequest request);

    /**
     * Lists AutoScalingConfigurations in the specific compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAutoScalingConfigurationsResponse listAutoScalingConfigurations(
            ListAutoScalingConfigurationsRequest request);

    /**
     * Lists Policies in an AutoScalingConfiguration.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAutoScalingPoliciesResponse listAutoScalingPolicies(ListAutoScalingPoliciesRequest request);

    /**
     * Updates an AutoScalingConfiguration
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateAutoScalingConfigurationResponse updateAutoScalingConfiguration(
            UpdateAutoScalingConfigurationRequest request);

    /**
     * Updates a Policy in the specific AutoScalingConfiguration
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateAutoScalingPolicyResponse updateAutoScalingPolicy(UpdateAutoScalingPolicyRequest request);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    AutoScalingPaginators getPaginators();
}
