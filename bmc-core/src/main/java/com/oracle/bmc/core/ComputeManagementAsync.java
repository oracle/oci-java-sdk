/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface ComputeManagementAsync extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

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
     * Attach load balancer to the instance pool.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AttachLoadBalancerResponse> attachLoadBalancer(
            AttachLoadBalancerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AttachLoadBalancerRequest, AttachLoadBalancerResponse>
                    handler);

    /**
     * Creates an instance configuration
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateInstanceConfigurationResponse> createInstanceConfiguration(
            CreateInstanceConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateInstanceConfigurationRequest, CreateInstanceConfigurationResponse>
                    handler);

    /**
     * Create an instance pool.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateInstancePoolResponse> createInstancePool(
            CreateInstancePoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateInstancePoolRequest, CreateInstancePoolResponse>
                    handler);

    /**
     * Deletes an instance configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteInstanceConfigurationResponse> deleteInstanceConfiguration(
            DeleteInstanceConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteInstanceConfigurationRequest, DeleteInstanceConfigurationResponse>
                    handler);

    /**
     * Detach a load balancer from the instance pool.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DetachLoadBalancerResponse> detachLoadBalancer(
            DetachLoadBalancerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DetachLoadBalancerRequest, DetachLoadBalancerResponse>
                    handler);

    /**
     * Gets the specified instance configuration
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetInstanceConfigurationResponse> getInstanceConfiguration(
            GetInstanceConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetInstanceConfigurationRequest, GetInstanceConfigurationResponse>
                    handler);

    /**
     * Gets the specified instance pool
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetInstancePoolResponse> getInstancePool(
            GetInstancePoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetInstancePoolRequest, GetInstancePoolResponse>
                    handler);

    /**
     * Launch an instance from an instance configuration
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<LaunchInstanceConfigurationResponse> launchInstanceConfiguration(
            LaunchInstanceConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            LaunchInstanceConfigurationRequest, LaunchInstanceConfigurationResponse>
                    handler);

    /**
     * Lists the available instanceConfigurations in the specific compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListInstanceConfigurationsResponse> listInstanceConfigurations(
            ListInstanceConfigurationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListInstanceConfigurationsRequest, ListInstanceConfigurationsResponse>
                    handler);

    /**
     * List the instances in the specified instance pool.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListInstancePoolInstancesResponse> listInstancePoolInstances(
            ListInstancePoolInstancesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListInstancePoolInstancesRequest, ListInstancePoolInstancesResponse>
                    handler);

    /**
     * Lists the instance pools in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListInstancePoolsResponse> listInstancePools(
            ListInstancePoolsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListInstancePoolsRequest, ListInstancePoolsResponse>
                    handler);

    /**
     * Performs the reset (power off and power on) action on the specified instance pool,
     * which performs the action on all the instances in the pool.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ResetInstancePoolResponse> resetInstancePool(
            ResetInstancePoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ResetInstancePoolRequest, ResetInstancePoolResponse>
                    handler);

    /**
     * Performs the softreset (ACPI shutdown and power on) action on the specified instance pool,
     * which performs the action on all the instances in the pool.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SoftresetInstancePoolResponse> softresetInstancePool(
            SoftresetInstancePoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SoftresetInstancePoolRequest, SoftresetInstancePoolResponse>
                    handler);

    /**
     * Performs the start (power on) action on the specified instance pool,
     * which performs the action on all the instances in the pool.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<StartInstancePoolResponse> startInstancePool(
            StartInstancePoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StartInstancePoolRequest, StartInstancePoolResponse>
                    handler);

    /**
     * Performs the stop (power off) action on the specified instance pool,
     * which performs the action on all the instances in the pool.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<StopInstancePoolResponse> stopInstancePool(
            StopInstancePoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<StopInstancePoolRequest, StopInstancePoolResponse>
                    handler);

    /**
     * Terminate the specified instance pool.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<TerminateInstancePoolResponse> terminateInstancePool(
            TerminateInstancePoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            TerminateInstancePoolRequest, TerminateInstancePoolResponse>
                    handler);

    /**
     * Updates the freeFormTags, definedTags, and display name of an instance configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateInstanceConfigurationResponse> updateInstanceConfiguration(
            UpdateInstanceConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>
                    handler);

    /**
     * Update the specified instance pool.
     * The OCID of the instance pool remains the same.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateInstancePoolResponse> updateInstancePool(
            UpdateInstancePoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateInstancePoolRequest, UpdateInstancePoolResponse>
                    handler);
}
