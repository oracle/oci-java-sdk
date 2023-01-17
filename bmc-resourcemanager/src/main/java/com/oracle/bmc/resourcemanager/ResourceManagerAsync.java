/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager;

import com.oracle.bmc.resourcemanager.requests.*;
import com.oracle.bmc.resourcemanager.responses.*;

/**
 * Use the Resource Manager API to automate deployment and operations for all Oracle Cloud Infrastructure resources.
 * Using the infrastructure-as-code (IaC) model, the service is based on Terraform, an open source industry standard that lets DevOps engineers develop and deploy their infrastructure anywhere.
 * For more information, see
 * [the Resource Manager documentation](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/home.htm).
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
public interface ResourceManagerAsync extends AutoCloseable {

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
     * Indicates the intention to cancel the specified job.
     * Cancellation of the job is not immediate, and may be delayed,
     * or may not happen at all.
     * You can optionally choose forced cancellation by setting `isForced` to true.
     * A forced cancellation can result in an incorrect state file.
     * For example, the state file might not reflect the exact state of the provisioned resources.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CancelJobResponse> cancelJob(
            CancelJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<CancelJobRequest, CancelJobResponse> handler);

    /**
     * Moves a configuration source provider into a different compartment within the same tenancy.
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
    java.util.concurrent.Future<ChangeConfigurationSourceProviderCompartmentResponse>
            changeConfigurationSourceProviderCompartment(
                    ChangeConfigurationSourceProviderCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeConfigurationSourceProviderCompartmentRequest,
                                    ChangeConfigurationSourceProviderCompartmentResponse>
                            handler);

    /**
     * Moves a private endpoint to a different compartment within the same tenancy.
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
    java.util.concurrent.Future<ChangePrivateEndpointCompartmentResponse>
            changePrivateEndpointCompartment(
                    ChangePrivateEndpointCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangePrivateEndpointCompartmentRequest,
                                    ChangePrivateEndpointCompartmentResponse>
                            handler);

    /**
     * Moves a stack (and its associated jobs) into a different compartment within the same tenancy.
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
    java.util.concurrent.Future<ChangeStackCompartmentResponse> changeStackCompartment(
            ChangeStackCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeStackCompartmentRequest, ChangeStackCompartmentResponse>
                    handler);

    /**
     * Moves a template into a different compartment within the same tenancy.
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
    java.util.concurrent.Future<ChangeTemplateCompartmentResponse> changeTemplateCompartment(
            ChangeTemplateCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeTemplateCompartmentRequest, ChangeTemplateCompartmentResponse>
                    handler);

    /**
     * Creates a configuration source provider in the specified compartment.
     * For more information, see
     * [To create a configuration source provider](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Tasks/managingconfigurationsourceproviders.htm#CreateConfigurationSourceProvider).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateConfigurationSourceProviderResponse>
            createConfigurationSourceProvider(
                    CreateConfigurationSourceProviderRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateConfigurationSourceProviderRequest,
                                    CreateConfigurationSourceProviderResponse>
                            handler);

    /**
     * Creates a job.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateJobResponse> createJob(
            CreateJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateJobRequest, CreateJobResponse> handler);

    /**
     * Creates a private endpoint in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreatePrivateEndpointResponse> createPrivateEndpoint(
            CreatePrivateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreatePrivateEndpointRequest, CreatePrivateEndpointResponse>
                    handler);

    /**
     * Creates a stack in the specified compartment.
     * You can create a stack from a Terraform configuration.
     * The Terraform configuration can be directly uploaded or referenced from a source code control system.
     * You can also create a stack from an existing compartment, which generates a Terraform configuration.
     * You can also upload the Terraform configuration from an Object Storage bucket.
     * For more information, see
     * [Creating Stacks](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Tasks/create-stack.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateStackResponse> createStack(
            CreateStackRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateStackRequest, CreateStackResponse> handler);

    /**
     * Creates a private template in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateTemplateResponse> createTemplate(
            CreateTemplateRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateTemplateRequest, CreateTemplateResponse>
                    handler);

    /**
     * Deletes the specified configuration source provider.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteConfigurationSourceProviderResponse>
            deleteConfigurationSourceProvider(
                    DeleteConfigurationSourceProviderRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteConfigurationSourceProviderRequest,
                                    DeleteConfigurationSourceProviderResponse>
                            handler);

    /**
     * Deletes the specified private endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeletePrivateEndpointResponse> deletePrivateEndpoint(
            DeletePrivateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeletePrivateEndpointRequest, DeletePrivateEndpointResponse>
                    handler);

    /**
     * Deletes the specified stack.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteStackResponse> deleteStack(
            DeleteStackRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteStackRequest, DeleteStackResponse> handler);

    /**
     * Deletes the specified template.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTemplateResponse> deleteTemplate(
            DeleteTemplateRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteTemplateRequest, DeleteTemplateResponse>
                    handler);

    /**
     * Checks drift status for the specified stack.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DetectStackDriftResponse> detectStackDrift(
            DetectStackDriftRequest request,
            com.oracle.bmc.responses.AsyncHandler<DetectStackDriftRequest, DetectStackDriftResponse>
                    handler);

    /**
     * Gets the properties of the specified configuration source provider.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetConfigurationSourceProviderResponse>
            getConfigurationSourceProvider(
                    GetConfigurationSourceProviderRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetConfigurationSourceProviderRequest,
                                    GetConfigurationSourceProviderResponse>
                            handler);

    /**
     * Gets the properties of the specified job.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetJobResponse> getJob(
            GetJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJobRequest, GetJobResponse> handler);

    /**
     * Returns the Terraform detailed log content for the specified job in plain text. [Learn about Terraform detailed log.](https://www.terraform.io/docs/internals/debugging.html)
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetJobDetailedLogContentResponse> getJobDetailedLogContent(
            GetJobDetailedLogContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetJobDetailedLogContentRequest, GetJobDetailedLogContentResponse>
                    handler);

    /**
     * Returns console log entries for the specified job in JSON format.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetJobLogsResponse> getJobLogs(
            GetJobLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJobLogsRequest, GetJobLogsResponse> handler);

    /**
     * Returns the raw log file for the specified job in text format.
     * The file includes a maximum of 100,000 log entries.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetJobLogsContentResponse> getJobLogsContent(
            GetJobLogsContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetJobLogsContentRequest, GetJobLogsContentResponse>
                    handler);

    /**
     * Returns the Terraform configuration for the specified job in zip format.
     * If no zip file is found, returns an error.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetJobTfConfigResponse> getJobTfConfig(
            GetJobTfConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJobTfConfigRequest, GetJobTfConfigResponse>
                    handler);

    /**
     * Returns the output of the specified Terraform plan job in binary or JSON format.
     * For information about running Terraform plan jobs, see
     * [Creating Plan Jobs](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Tasks/create-job.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetJobTfPlanResponse> getJobTfPlan(
            GetJobTfPlanRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJobTfPlanRequest, GetJobTfPlanResponse>
                    handler);

    /**
     * Returns the Terraform state for the specified job.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetJobTfStateResponse> getJobTfState(
            GetJobTfStateRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJobTfStateRequest, GetJobTfStateResponse>
                    handler);

    /**
     * Gets the specified private endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPrivateEndpointResponse> getPrivateEndpoint(
            GetPrivateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPrivateEndpointRequest, GetPrivateEndpointResponse>
                    handler);

    /**
     * Gets the reachable, or alternative, IP address for a nonpublic IP address that is associated with the private endpoint.
     * Resource Manager uses this IP address to connect to nonpublic resources through the associated private endpoint.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetReachableIpResponse> getReachableIp(
            GetReachableIpRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetReachableIpRequest, GetReachableIpResponse>
                    handler);

    /**
     * Gets the specified stack.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetStackResponse> getStack(
            GetStackRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetStackRequest, GetStackResponse> handler);

    /**
     * Returns the Terraform configuration file for the specified stack in zip format.
     * Returns an error if no zip file is found.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetStackTfConfigResponse> getStackTfConfig(
            GetStackTfConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetStackTfConfigRequest, GetStackTfConfigResponse>
                    handler);

    /**
     * Returns the Terraform state for the specified stack.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetStackTfStateResponse> getStackTfState(
            GetStackTfStateRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetStackTfStateRequest, GetStackTfStateResponse>
                    handler);

    /**
     * Gets the specified template.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetTemplateResponse> getTemplate(
            GetTemplateRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTemplateRequest, GetTemplateResponse> handler);

    /**
     * Returns the Terraform logo file in .logo format for the specified template.
     * Returns an error if no logo file is found.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetTemplateLogoResponse> getTemplateLogo(
            GetTemplateLogoRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTemplateLogoRequest, GetTemplateLogoResponse>
                    handler);

    /**
     * Returns the Terraform configuration file in zip format for the specified template.
     * Returns an error if no zip file is found.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetTemplateTfConfigResponse> getTemplateTfConfig(
            GetTemplateTfConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetTemplateTfConfigRequest, GetTemplateTfConfigResponse>
                    handler);

    /**
     * Returns the specified work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Lists configuration source providers according to the specified filter.
     * - For `compartmentId`, lists all configuration source providers in the matching compartment.
     * - For `configurationSourceProviderId`, lists the matching configuration source provider.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListConfigurationSourceProvidersResponse>
            listConfigurationSourceProviders(
                    ListConfigurationSourceProvidersRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListConfigurationSourceProvidersRequest,
                                    ListConfigurationSourceProvidersResponse>
                            handler);

    /**
     * Gets the list of resources associated with the specified job.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListJobAssociatedResourcesResponse> listJobAssociatedResources(
            ListJobAssociatedResourcesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListJobAssociatedResourcesRequest, ListJobAssociatedResourcesResponse>
                    handler);

    /**
     * Gets the list of outputs associated with the specified job.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListJobOutputsResponse> listJobOutputs(
            ListJobOutputsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListJobOutputsRequest, ListJobOutputsResponse>
                    handler);

    /**
     * Lists jobs according to the specified filter. By default, the list is ordered by time created.
     * <p>
     * - To list all jobs in a stack, provide the stack [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * - To list all jobs in a compartment, provide the compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * - To return a specific job, provide the job [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). (Equivalent to {@link #getStack(GetStackRequest, Consumer, Consumer) getStack}.)
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListJobsResponse> listJobs(
            ListJobsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListJobsRequest, ListJobsResponse> handler);

    /**
     * Lists private endpoints according to the specified filter.
     * - For `compartmentId`, lists all private endpoints in the matching compartment.
     * - For `privateEndpointId`, lists the matching private endpoint.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListPrivateEndpointsResponse> listPrivateEndpoints(
            ListPrivateEndpointsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPrivateEndpointsRequest, ListPrivateEndpointsResponse>
                    handler);

    /**
     * Returns a list of supported services for [Resource Discovery](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/resource-discovery.htm).
     * For reference on service names, see the [Terraform provider documentation](https://www.terraform.io/docs/providers/oci/guides/resource_discovery.html#services).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListResourceDiscoveryServicesResponse>
            listResourceDiscoveryServices(
                    ListResourceDiscoveryServicesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListResourceDiscoveryServicesRequest,
                                    ListResourceDiscoveryServicesResponse>
                            handler);

    /**
     * Gets the list of resources associated with the specified stack.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListStackAssociatedResourcesResponse> listStackAssociatedResources(
            ListStackAssociatedResourcesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListStackAssociatedResourcesRequest,
                            ListStackAssociatedResourcesResponse>
                    handler);

    /**
     * Lists drift status details for each resource defined in the specified stack.
     * The drift status details for a given resource indicate differences, if any, between the actual state
     * and the expected (defined) state for that resource.
     * The drift status details correspond to the specified work request (`workRequestId`).
     * If no work request is specified, then the drift status details correspond to the latest completed work request for the stack.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListStackResourceDriftDetailsResponse>
            listStackResourceDriftDetails(
                    ListStackResourceDriftDetailsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListStackResourceDriftDetailsRequest,
                                    ListStackResourceDriftDetailsResponse>
                            handler);

    /**
     * Lists stacks according to the specified filter.
     * - If called using the compartment ID, returns all stacks in the specified compartment.
     * - If called using the stack ID, returns the specified stack. (See also {@link #getStack(GetStackRequest, Consumer, Consumer) getStack}.)
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListStacksResponse> listStacks(
            ListStacksRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListStacksRequest, ListStacksResponse> handler);

    /**
     * Lists template categories.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTemplateCategoriesResponse> listTemplateCategories(
            ListTemplateCategoriesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListTemplateCategoriesRequest, ListTemplateCategoriesResponse>
                    handler);

    /**
     * Lists templates according to the specified filter.
     * The attributes `compartmentId` and `templateCategoryId` are required unless `templateId` is specified.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTemplatesResponse> listTemplates(
            ListTemplatesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTemplatesRequest, ListTemplatesResponse>
                    handler);

    /**
     * Returns a list of supported Terraform versions for use with stacks.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTerraformVersionsResponse> listTerraformVersions(
            ListTerraformVersionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListTerraformVersionsRequest, ListTerraformVersionsResponse>
                    handler);

    /**
     * Returns a paginated list of errors for the specified work request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Returns a paginated list of logs for the specified work request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * Lists the work requests in the specified compartment or for the specified resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Updates the properties of the specified configuration source provider.
     * For more information, see
     * [To edit a configuration source provider](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Tasks/managingconfigurationsourceproviders.htm#EditConfigurationSourceProvider).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateConfigurationSourceProviderResponse>
            updateConfigurationSourceProvider(
                    UpdateConfigurationSourceProviderRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateConfigurationSourceProviderRequest,
                                    UpdateConfigurationSourceProviderResponse>
                            handler);

    /**
     * Updates the specified job.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateJobResponse> updateJob(
            UpdateJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateJobRequest, UpdateJobResponse> handler);

    /**
     * Updates the specified private endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePrivateEndpointResponse> updatePrivateEndpoint(
            UpdatePrivateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdatePrivateEndpointRequest, UpdatePrivateEndpointResponse>
                    handler);

    /**
     * Updates the specified stack.
     * Use `UpdateStack` when you update your Terraform configuration
     * and want your changes to be reflected in the execution plan.
     * For more information, see
     * [Updating Stacks](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Tasks/update-stack.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateStackResponse> updateStack(
            UpdateStackRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateStackRequest, UpdateStackResponse> handler);

    /**
     * Updates the specified template.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTemplateResponse> updateTemplate(
            UpdateTemplateRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateTemplateRequest, UpdateTemplateResponse>
                    handler);
}
