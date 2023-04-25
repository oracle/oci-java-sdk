/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.autoscaling;

import com.oracle.bmc.autoscaling.requests.*;
import com.oracle.bmc.autoscaling.responses.*;

/**
 * APIs for dynamically scaling Compute resources to meet application requirements. For more information about
 * autoscaling, see [Autoscaling](https://docs.cloud.oracle.com/Content/Compute/Tasks/autoscalinginstancepools.htm). For information about the
 * Compute service, see [Overview of the Compute Service](https://docs.cloud.oracle.com/Content/Compute/Concepts/computeoverview.htm).
 *
 **Note:** Autoscaling is not available in US Government Cloud tenancies. For more information, see
 * [Oracle Cloud Infrastructure US Government Cloud](https://docs.cloud.oracle.com/Content/General/Concepts/govoverview.htm).
 *
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public interface AutoScaling extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

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
     * Determines whether realm specific endpoint should be used or not.
     * Set realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm specific endpoint template, otherwise set it to "false"
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Moves an autoscaling configuration into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     * <p>
     * When you move an autoscaling configuration to a different compartment, associated resources such as instance
     * pools are not moved.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/autoscaling/ChangeAutoScalingConfigurationCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeAutoScalingConfigurationCompartment API.
     */
    ChangeAutoScalingConfigurationCompartmentResponse changeAutoScalingConfigurationCompartment(
            ChangeAutoScalingConfigurationCompartmentRequest request);

    /**
     * Creates an autoscaling configuration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/autoscaling/CreateAutoScalingConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateAutoScalingConfiguration API.
     */
    CreateAutoScalingConfigurationResponse createAutoScalingConfiguration(
            CreateAutoScalingConfigurationRequest request);

    /**
     * Creates an autoscaling policy for the specified autoscaling configuration.
     * <p>
     * You can create the following types of autoscaling policies:
     * <p>
     * - **Schedule-based:** Autoscaling events take place at the specific times that you schedule.
     * - **Threshold-based:** An autoscaling action is triggered when a performance metric meets or exceeds a threshold.
     * <p>
     * An autoscaling configuration can either have multiple schedule-based autoscaling policies, or one
     * threshold-based autoscaling policy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/autoscaling/CreateAutoScalingPolicyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateAutoScalingPolicy API.
     */
    CreateAutoScalingPolicyResponse createAutoScalingPolicy(CreateAutoScalingPolicyRequest request);

    /**
     * Deletes an autoscaling configuration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/autoscaling/DeleteAutoScalingConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteAutoScalingConfiguration API.
     */
    DeleteAutoScalingConfigurationResponse deleteAutoScalingConfiguration(
            DeleteAutoScalingConfigurationRequest request);

    /**
     * Deletes an autoscaling policy for the specified autoscaling configuration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/autoscaling/DeleteAutoScalingPolicyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteAutoScalingPolicy API.
     */
    DeleteAutoScalingPolicyResponse deleteAutoScalingPolicy(DeleteAutoScalingPolicyRequest request);

    /**
     * Gets information about the specified autoscaling configuration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/autoscaling/GetAutoScalingConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAutoScalingConfiguration API.
     */
    GetAutoScalingConfigurationResponse getAutoScalingConfiguration(
            GetAutoScalingConfigurationRequest request);

    /**
     * Gets information about the specified autoscaling policy in the specified autoscaling configuration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/autoscaling/GetAutoScalingPolicyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAutoScalingPolicy API.
     */
    GetAutoScalingPolicyResponse getAutoScalingPolicy(GetAutoScalingPolicyRequest request);

    /**
     * Lists autoscaling configurations in the specifed compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/autoscaling/ListAutoScalingConfigurationsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAutoScalingConfigurations API.
     */
    ListAutoScalingConfigurationsResponse listAutoScalingConfigurations(
            ListAutoScalingConfigurationsRequest request);

    /**
     * Lists the autoscaling policies in the specified autoscaling configuration.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/autoscaling/ListAutoScalingPoliciesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAutoScalingPolicies API.
     */
    ListAutoScalingPoliciesResponse listAutoScalingPolicies(ListAutoScalingPoliciesRequest request);

    /**
     * Updates certain fields on the specified autoscaling configuration, such as the name, the cooldown period,
     * and whether the autoscaling configuration is enabled.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/autoscaling/UpdateAutoScalingConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateAutoScalingConfiguration API.
     */
    UpdateAutoScalingConfigurationResponse updateAutoScalingConfiguration(
            UpdateAutoScalingConfigurationRequest request);

    /**
     * Updates an autoscaling policy in the specified autoscaling configuration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/autoscaling/UpdateAutoScalingPolicyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateAutoScalingPolicy API.
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
