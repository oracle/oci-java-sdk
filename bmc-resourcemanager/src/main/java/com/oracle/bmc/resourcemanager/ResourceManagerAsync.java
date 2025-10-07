/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager;

import com.oracle.bmc.resourcemanager.requests.*;
import com.oracle.bmc.resourcemanager.responses.*;

/**
 * Use the Resource Manager API to automate deployment and operations for all Oracle Cloud
 * Infrastructure resources. Using the infrastructure-as-code (IaC) model, the service is based on
 * Terraform, an open source industry standard that lets DevOps engineers develop and deploy their
 * infrastructure anywhere. For more information, see [the Resource Manager
 * documentation](https://docs.oracle.com/iaas/Content/ResourceManager/home.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
public interface ResourceManagerAsync extends AutoCloseable {

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
     * Determines whether realm specific endpoint should be used or not. Set
     * realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm
     * specific endpoint template, otherwise set it to "false"
     *
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint
     *     template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Indicates the intention to cancel the specified job. Cancellation of the job is not
     * immediate, and may be delayed, or may not happen at all. You can optionally choose forced
     * cancellation by setting `isForced` to true. A forced cancellation can result in an incorrect
     * state file. For example, the state file might not reflect the exact state of the provisioned
     * resources. For more information, see [Canceling a
     * Job](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/cancel-job.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelJobResponse> cancelJob(
            CancelJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<CancelJobRequest, CancelJobResponse> handler);

    /**
     * Moves a configuration source provider into a different compartment within the same tenancy.
     * For more information, see [Moving a Configuration Source
     * Provider](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/change-compartment-csp.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeConfigurationSourceProviderCompartmentResponse>
            changeConfigurationSourceProviderCompartment(
                    ChangeConfigurationSourceProviderCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeConfigurationSourceProviderCompartmentRequest,
                                    ChangeConfigurationSourceProviderCompartmentResponse>
                            handler);

    /**
     * Moves a private endpoint to a different compartment within the same tenancy. For more
     * information, see [Moving a Private
     * Endpoint](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/move-private-endpoints.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangePrivateEndpointCompartmentResponse>
            changePrivateEndpointCompartment(
                    ChangePrivateEndpointCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangePrivateEndpointCompartmentRequest,
                                    ChangePrivateEndpointCompartmentResponse>
                            handler);

    /**
     * Moves a stack (and its associated jobs) into a different compartment within the same tenancy.
     * For more information, see [Moving a
     * Stack](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/change-compartment-stack.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeStackCompartmentResponse> changeStackCompartment(
            ChangeStackCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeStackCompartmentRequest, ChangeStackCompartmentResponse>
                    handler);

    /**
     * Moves a template into a different compartment within the same tenancy. For more information,
     * see [Moving a Private
     * Template](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/change-compartment-template.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeTemplateCompartmentResponse> changeTemplateCompartment(
            ChangeTemplateCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeTemplateCompartmentRequest, ChangeTemplateCompartmentResponse>
                    handler);

    /**
     * Creates a configuration source provider in the specified compartment. For more information,
     * see [Creating a Configuration Source
     * Provider](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/create-csp.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateConfigurationSourceProviderResponse>
            createConfigurationSourceProvider(
                    CreateConfigurationSourceProviderRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateConfigurationSourceProviderRequest,
                                    CreateConfigurationSourceProviderResponse>
                            handler);

    /**
     * Creates a job. For more information, see [Creating a
     * Job](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/create-job.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateJobResponse> createJob(
            CreateJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateJobRequest, CreateJobResponse> handler);

    /**
     * Creates a private endpoint in the specified compartment. For more information, see [Creating
     * a Private
     * Endpoint](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/create-private-endpoints.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreatePrivateEndpointResponse> createPrivateEndpoint(
            CreatePrivateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreatePrivateEndpointRequest, CreatePrivateEndpointResponse>
                    handler);

    /**
     * Creates a stack in the specified compartment. You can create a stack from a Terraform
     * configuration. The Terraform configuration can be directly uploaded or referenced from a
     * source code control system. You can also create a stack from an existing compartment, which
     * generates a Terraform configuration. You can also upload the Terraform configuration from an
     * Object Storage bucket. For more information, see [Creating a
     * Stack](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/create-stack.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateStackResponse> createStack(
            CreateStackRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateStackRequest, CreateStackResponse> handler);

    /**
     * Creates a private template in the specified compartment. For more information, see [Creating
     * a Private
     * Template](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/create-template.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateTemplateResponse> createTemplate(
            CreateTemplateRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateTemplateRequest, CreateTemplateResponse>
                    handler);

    /**
     * Deletes the specified configuration source provider. For more information, see [Deleting a
     * Configuration Source
     * Provider](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/delete-csp.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteConfigurationSourceProviderResponse>
            deleteConfigurationSourceProvider(
                    DeleteConfigurationSourceProviderRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteConfigurationSourceProviderRequest,
                                    DeleteConfigurationSourceProviderResponse>
                            handler);

    /**
     * Deletes the specified private endpoint. For more information, see [Deleting a Private
     * Endpoint](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/delete-private-endpoints.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeletePrivateEndpointResponse> deletePrivateEndpoint(
            DeletePrivateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeletePrivateEndpointRequest, DeletePrivateEndpointResponse>
                    handler);

    /**
     * Deletes the specified stack. For more information, see [Deleting a
     * Stack](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/delete-stack.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteStackResponse> deleteStack(
            DeleteStackRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteStackRequest, DeleteStackResponse> handler);

    /**
     * Deletes the specified template. For more information, see [Deleting a Private
     * Template](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/delete-template.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTemplateResponse> deleteTemplate(
            DeleteTemplateRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteTemplateRequest, DeleteTemplateResponse>
                    handler);

    /**
     * Checks drift status for the specified stack. For more information, see [Detecting
     * Drift](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/detect-drift.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DetectStackDriftResponse> detectStackDrift(
            DetectStackDriftRequest request,
            com.oracle.bmc.responses.AsyncHandler<DetectStackDriftRequest, DetectStackDriftResponse>
                    handler);

    /**
     * Gets the properties of the specified configuration source provider. For more information, see
     * [Getting a Configuration Source Provider's
     * Details](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/get-csp.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetConfigurationSourceProviderResponse>
            getConfigurationSourceProvider(
                    GetConfigurationSourceProviderRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetConfigurationSourceProviderRequest,
                                    GetConfigurationSourceProviderResponse>
                            handler);

    /**
     * Gets the properties of the specified job. For more information, see [Getting a Job's
     * Details](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/get-job.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetJobResponse> getJob(
            GetJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJobRequest, GetJobResponse> handler);

    /**
     * Returns the Terraform detailed log content for the specified job in plain text. [Learn about
     * Terraform detailed log.](https://www.terraform.io/docs/internals/debugging.html) For more
     * information, see [Getting Detailed Log Content for a
     * Job](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/get-job-detailed-log-content.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetJobDetailedLogContentResponse> getJobDetailedLogContent(
            GetJobDetailedLogContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetJobDetailedLogContentRequest, GetJobDetailedLogContentResponse>
                    handler);

    /**
     * Returns console log entries for the specified job in JSON format. For more information, see
     * [Getting Logs for a
     * Job](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/get-job-logs.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetJobLogsResponse> getJobLogs(
            GetJobLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJobLogsRequest, GetJobLogsResponse> handler);

    /**
     * Returns the raw log file for the specified job in text format. The file includes a maximum of
     * 100,000 log entries. For more information, see [Getting Logs Content for a
     * Job](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/get-job-logs-content.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetJobLogsContentResponse> getJobLogsContent(
            GetJobLogsContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetJobLogsContentRequest, GetJobLogsContentResponse>
                    handler);

    /**
     * Returns the Terraform configuration for the specified job in zip format. If no zip file is
     * found, returns an error. For more information, see [Getting a Job Terraform
     * Configuration](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/get-job-tf-config.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetJobTfConfigResponse> getJobTfConfig(
            GetJobTfConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJobTfConfigRequest, GetJobTfConfigResponse>
                    handler);

    /**
     * Returns the output of the specified Terraform plan job in binary or JSON format. For more
     * information, see [Getting the Terraform Output for a Plan
     * Job](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/get-job-tf-plan.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetJobTfPlanResponse> getJobTfPlan(
            GetJobTfPlanRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJobTfPlanRequest, GetJobTfPlanResponse>
                    handler);

    /**
     * Returns the Terraform state for the specified job. For more information, see [Getting a Job
     * Terraform
     * Configuration](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/get-job-tf-config.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetJobTfStateResponse> getJobTfState(
            GetJobTfStateRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJobTfStateRequest, GetJobTfStateResponse>
                    handler);

    /**
     * Gets the specified private endpoint. For more information, see [Getting a Private Endpoint's
     * Details](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/get-private-endpoints.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPrivateEndpointResponse> getPrivateEndpoint(
            GetPrivateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPrivateEndpointRequest, GetPrivateEndpointResponse>
                    handler);

    /**
     * Gets the reachable, or alternative, IP address for a nonpublic IP address that is associated
     * with the private endpoint. Resource Manager uses this IP address to connect to nonpublic
     * resources through the associated private endpoint. For more information, see [Getting the
     * Reachable IP Address for a Private
     * Endpoint](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/get-private-endpoint-reachable-ip.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetReachableIpResponse> getReachableIp(
            GetReachableIpRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetReachableIpRequest, GetReachableIpResponse>
                    handler);

    /**
     * Gets the specified stack. For more information, see [Getting a Stack's
     * Details](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/get-stack.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetStackResponse> getStack(
            GetStackRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetStackRequest, GetStackResponse> handler);

    /**
     * Returns the Terraform configuration file for the specified stack in zip format. Returns an
     * error if no zip file is found. For more information, see [Getting a Stack Terraform
     * Configuration](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/get-stack-tf-config.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetStackTfConfigResponse> getStackTfConfig(
            GetStackTfConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetStackTfConfigRequest, GetStackTfConfigResponse>
                    handler);

    /**
     * Returns the Terraform state for the specified stack. For more information, see [Getting a
     * Stack State
     * File](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/get-stack-tf-state.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetStackTfStateResponse> getStackTfState(
            GetStackTfStateRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetStackTfStateRequest, GetStackTfStateResponse>
                    handler);

    /**
     * Gets the specified template. For more information, see [Getting a Private Template's
     * Details](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/get-template.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTemplateResponse> getTemplate(
            GetTemplateRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTemplateRequest, GetTemplateResponse> handler);

    /**
     * Returns the Terraform logo file in .logo format for the specified template. Returns an error
     * if no logo file is found. For more information, see [Getting a Private Template's
     * Logo](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/get-template-logo.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTemplateLogoResponse> getTemplateLogo(
            GetTemplateLogoRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTemplateLogoRequest, GetTemplateLogoResponse>
                    handler);

    /**
     * Returns the Terraform configuration file in zip format for the specified template. Returns an
     * error if no zip file is found. For more information, see [Getting a Private Template's
     * Terraform
     * Configuration](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/get-template-tf-config.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTemplateTfConfigResponse> getTemplateTfConfig(
            GetTemplateTfConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetTemplateTfConfigRequest, GetTemplateTfConfigResponse>
                    handler);

    /**
     * Returns the specified work request. For more information, see [Getting a Work Request's
     * Details](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/get-work-request.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Lists configuration source providers according to the specified filter. For more information,
     * see [Listing Configuration Source
     * Providers](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/list-csp.htm). - For
     * `compartmentId`, lists all configuration source providers in the matching compartment. - For
     * `configurationSourceProviderId`, lists the matching configuration source provider.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListConfigurationSourceProvidersResponse>
            listConfigurationSourceProviders(
                    ListConfigurationSourceProvidersRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListConfigurationSourceProvidersRequest,
                                    ListConfigurationSourceProvidersResponse>
                            handler);

    /**
     * Gets the list of resources associated with the specified job. For more information, see
     * [Listing Job
     * Resources](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/list-job-resources.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListJobAssociatedResourcesResponse> listJobAssociatedResources(
            ListJobAssociatedResourcesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListJobAssociatedResourcesRequest, ListJobAssociatedResourcesResponse>
                    handler);

    /**
     * Gets the list of outputs associated with the specified job. For more information, see
     * [Listing Job
     * Outputs](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/list-job-outputs.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListJobOutputsResponse> listJobOutputs(
            ListJobOutputsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListJobOutputsRequest, ListJobOutputsResponse>
                    handler);

    /**
     * Lists jobs according to the specified filter. By default, the list is ordered by time
     * created. For more information, see [Listing
     * Jobs](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/list-jobs.htm).
     *
     * <p>- To list all jobs in a stack, provide the stack
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). - To list all
     * jobs in a compartment, provide the compartment
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). - To return a
     * specific job, provide the job
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). (Equivalent to
     * {@link #getStack(GetStackRequest, Consumer, Consumer) getStack}.)
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListJobsResponse> listJobs(
            ListJobsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListJobsRequest, ListJobsResponse> handler);

    /**
     * Lists private endpoints according to the specified filter. For more information, see [Listing
     * Private
     * Endpoints](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/list-private-endpoints.htm).
     * - For `compartmentId`, lists all private endpoints in the matching compartment. - For
     * `privateEndpointId`, lists the matching private endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPrivateEndpointsResponse> listPrivateEndpoints(
            ListPrivateEndpointsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPrivateEndpointsRequest, ListPrivateEndpointsResponse>
                    handler);

    /**
     * Returns a list of supported services for [Resource
     * Discovery](https://docs.oracle.com/iaas/Content/ResourceManager/Concepts/resource-discovery.htm).
     * For reference on service names, see the [Terraform provider
     * documentation](https://www.terraform.io/docs/providers/oci/guides/resource_discovery.html#services).
     * For more information, see [Listing Resource Discovery
     * Services](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/list-discovery-services.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListResourceDiscoveryServicesResponse>
            listResourceDiscoveryServices(
                    ListResourceDiscoveryServicesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListResourceDiscoveryServicesRequest,
                                    ListResourceDiscoveryServicesResponse>
                            handler);

    /**
     * Gets the list of resources associated with the specified stack. For more information, see
     * [Listing Stack
     * Resources](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/list-stack-resources.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListStackAssociatedResourcesResponse> listStackAssociatedResources(
            ListStackAssociatedResourcesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListStackAssociatedResourcesRequest,
                            ListStackAssociatedResourcesResponse>
                    handler);

    /**
     * Lists drift status details for each resource defined in the specified stack. The drift status
     * details for a given resource indicate differences, if any, between the actual state and the
     * expected (defined) state for that resource. The drift status details correspond to the
     * specified work request (`workRequestId`). If no work request is specified, then the drift
     * status details correspond to the latest completed work request for the stack. For more
     * information, see [Listing Drift
     * Status](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/list-drift.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListStackResourceDriftDetailsResponse>
            listStackResourceDriftDetails(
                    ListStackResourceDriftDetailsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListStackResourceDriftDetailsRequest,
                                    ListStackResourceDriftDetailsResponse>
                            handler);

    /**
     * Lists stacks according to the specified filter. For more information, see [Listing
     * Stacks](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/list-stacks.htm). - If
     * called using the compartment ID, returns all stacks in the specified compartment. - If called
     * using the stack ID, returns the specified stack. (See also {@link #getStack(GetStackRequest,
     * Consumer, Consumer) getStack}.)
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListStacksResponse> listStacks(
            ListStacksRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListStacksRequest, ListStacksResponse> handler);

    /**
     * Lists template categories. For more information, see [Listing Template
     * Categories](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/list-template-categories.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTemplateCategoriesResponse> listTemplateCategories(
            ListTemplateCategoriesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListTemplateCategoriesRequest, ListTemplateCategoriesResponse>
                    handler);

    /**
     * Lists templates according to the specified filter. The attributes `compartmentId` and
     * `templateCategoryId` are required unless `templateId` is specified. For more information, see
     * [Listing
     * Templates](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/list-template.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTemplatesResponse> listTemplates(
            ListTemplatesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTemplatesRequest, ListTemplatesResponse>
                    handler);

    /**
     * Returns a list of supported Terraform versions for use with stacks. For more information, see
     * [Listing Terraform
     * Versions](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/list-tf-versions.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTerraformVersionsResponse> listTerraformVersions(
            ListTerraformVersionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListTerraformVersionsRequest, ListTerraformVersionsResponse>
                    handler);

    /**
     * Returns a paginated list of errors for the specified work request. For more information, see
     * [Listing Errors for a Work
     * Request](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/list-work-request-errors.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Returns a paginated list of logs for the specified work request. For more information, see
     * [Listing Logs for a Work
     * Request](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/list-work-request-logs.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * Lists the work requests in the specified compartment or for the specified resource. For more
     * information, see [Listing Work
     * Requests](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/list-work-request.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Updates the properties of the specified configuration source provider. For more information,
     * see [Updating a Configuration Source
     * Provider](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/update-csp.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateConfigurationSourceProviderResponse>
            updateConfigurationSourceProvider(
                    UpdateConfigurationSourceProviderRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateConfigurationSourceProviderRequest,
                                    UpdateConfigurationSourceProviderResponse>
                            handler);

    /**
     * Updates the specified job. For more information, see [Updating a
     * Job](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/update-job.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateJobResponse> updateJob(
            UpdateJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateJobRequest, UpdateJobResponse> handler);

    /**
     * Updates the specified private endpoint. For more information, see [Updating a Private
     * Endpoint](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/update-private-endpoints.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePrivateEndpointResponse> updatePrivateEndpoint(
            UpdatePrivateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdatePrivateEndpointRequest, UpdatePrivateEndpointResponse>
                    handler);

    /**
     * Updates the specified stack. Use `UpdateStack` when you update your Terraform configuration
     * and want your changes to be reflected in the execution plan. For more information, see
     * [Updating a
     * Stack](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/update-stack.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateStackResponse> updateStack(
            UpdateStackRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateStackRequest, UpdateStackResponse> handler);

    /**
     * Updates the specified template. For more information, see [Updating a Private
     * Template](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/update-template.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTemplateResponse> updateTemplate(
            UpdateTemplateRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateTemplateRequest, UpdateTemplateResponse>
                    handler);
}
