/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.autoscaling;

import com.oracle.bmc.autoscaling.requests.*;
import com.oracle.bmc.autoscaling.responses.*;

/**
 * APIs for dynamically scaling Compute resources to meet application requirements. For more
 * information about autoscaling, see
 * [Autoscaling](https://docs.cloud.oracle.com/Content/Compute/Tasks/autoscalinginstancepools.htm).
 * For information about the Compute service, see [Overview of the Compute
 * Service](https://docs.cloud.oracle.com/Content/Compute/Concepts/computeoverview.htm).
 *
 * <p>*Note:** Autoscaling is not available in US Government Cloud tenancies. For more information,
 * see [Oracle Cloud Infrastructure US Government
 * Cloud](https://docs.cloud.oracle.com/Content/General/Concepts/govoverview.htm).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public interface AutoScalingAsync extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this region, however, an
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
     * Moves an autoscaling configuration into a different compartment within the same tenancy. For
     * information about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * <p>When you move an autoscaling configuration to a different compartment, associated
     * resources such as instance pools are not moved.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeAutoScalingConfigurationCompartmentResponse>
            changeAutoScalingConfigurationCompartment(
                    ChangeAutoScalingConfigurationCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAutoScalingConfigurationCompartmentRequest,
                                    ChangeAutoScalingConfigurationCompartmentResponse>
                            handler);

    /**
     * Creates an autoscaling configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateAutoScalingConfigurationResponse>
            createAutoScalingConfiguration(
                    CreateAutoScalingConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateAutoScalingConfigurationRequest,
                                    CreateAutoScalingConfigurationResponse>
                            handler);

    /**
     * Creates an autoscaling policy for the specified autoscaling configuration.
     *
     * <p>You can create the following types of autoscaling policies:
     *
     * <p>- **Schedule-based:** Autoscaling events take place at the specific times that you
     * schedule. - **Threshold-based:** An autoscaling action is triggered when a performance metric
     * meets or exceeds a threshold.
     *
     * <p>An autoscaling configuration can either have multiple schedule-based autoscaling policies,
     * or one threshold-based autoscaling policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateAutoScalingPolicyResponse> createAutoScalingPolicy(
            CreateAutoScalingPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateAutoScalingPolicyRequest, CreateAutoScalingPolicyResponse>
                    handler);

    /**
     * Deletes an autoscaling configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAutoScalingConfigurationResponse>
            deleteAutoScalingConfiguration(
                    DeleteAutoScalingConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteAutoScalingConfigurationRequest,
                                    DeleteAutoScalingConfigurationResponse>
                            handler);

    /**
     * Deletes an autoscaling policy for the specified autoscaling configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAutoScalingPolicyResponse> deleteAutoScalingPolicy(
            DeleteAutoScalingPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteAutoScalingPolicyRequest, DeleteAutoScalingPolicyResponse>
                    handler);

    /**
     * Gets information about the specified autoscaling configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAutoScalingConfigurationResponse> getAutoScalingConfiguration(
            GetAutoScalingConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAutoScalingConfigurationRequest, GetAutoScalingConfigurationResponse>
                    handler);

    /**
     * Gets information about the specified autoscaling policy in the specified autoscaling
     * configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAutoScalingPolicyResponse> getAutoScalingPolicy(
            GetAutoScalingPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAutoScalingPolicyRequest, GetAutoScalingPolicyResponse>
                    handler);

    /**
     * Lists autoscaling configurations in the specifed compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAutoScalingConfigurationsResponse>
            listAutoScalingConfigurations(
                    ListAutoScalingConfigurationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAutoScalingConfigurationsRequest,
                                    ListAutoScalingConfigurationsResponse>
                            handler);

    /**
     * Lists the autoscaling policies in the specified autoscaling configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAutoScalingPoliciesResponse> listAutoScalingPolicies(
            ListAutoScalingPoliciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAutoScalingPoliciesRequest, ListAutoScalingPoliciesResponse>
                    handler);

    /**
     * Updates certain fields on the specified autoscaling configuration, such as the name, the
     * cooldown period, and whether the autoscaling configuration is enabled.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAutoScalingConfigurationResponse>
            updateAutoScalingConfiguration(
                    UpdateAutoScalingConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAutoScalingConfigurationRequest,
                                    UpdateAutoScalingConfigurationResponse>
                            handler);

    /**
     * Updates an autoscaling policy in the specified autoscaling configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAutoScalingPolicyResponse> updateAutoScalingPolicy(
            UpdateAutoScalingPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse>
                    handler);
}
