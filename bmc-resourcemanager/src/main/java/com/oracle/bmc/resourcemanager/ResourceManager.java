/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
public interface ResourceManager extends AutoCloseable {

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
     * Indicates the intention to cancel the specified job.
     * Cancellation of the job is not immediate, and may be delayed,
     * or may not happen at all.
     * You can optionally choose forced cancellation by setting `isForced` to true.
     * A forced cancellation can result in an incorrect state file.
     * For example, the state file might not reflect the exact state of the provisioned resources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/CancelJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CancelJob API.
     */
    CancelJobResponse cancelJob(CancelJobRequest request);

    /**
     * Moves a configuration source provider into a different compartment within the same tenancy.
     * For information about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/ChangeConfigurationSourceProviderCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeConfigurationSourceProviderCompartment API.
     */
    ChangeConfigurationSourceProviderCompartmentResponse
            changeConfigurationSourceProviderCompartment(
                    ChangeConfigurationSourceProviderCompartmentRequest request);

    /**
     * Moves a private endpoint to a different compartment within the same tenancy.
     * For information about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/ChangePrivateEndpointCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangePrivateEndpointCompartment API.
     */
    ChangePrivateEndpointCompartmentResponse changePrivateEndpointCompartment(
            ChangePrivateEndpointCompartmentRequest request);

    /**
     * Moves a stack (and its associated jobs) into a different compartment within the same tenancy.
     * For information about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/ChangeStackCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeStackCompartment API.
     */
    ChangeStackCompartmentResponse changeStackCompartment(ChangeStackCompartmentRequest request);

    /**
     * Moves a template into a different compartment within the same tenancy.
     * For information about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/ChangeTemplateCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeTemplateCompartment API.
     */
    ChangeTemplateCompartmentResponse changeTemplateCompartment(
            ChangeTemplateCompartmentRequest request);

    /**
     * Creates a configuration source provider in the specified compartment.
     * For more information, see
     * [To create a configuration source provider](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Tasks/managingconfigurationsourceproviders.htm#CreateConfigurationSourceProvider).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/CreateConfigurationSourceProviderExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateConfigurationSourceProvider API.
     */
    CreateConfigurationSourceProviderResponse createConfigurationSourceProvider(
            CreateConfigurationSourceProviderRequest request);

    /**
     * Creates a job.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/CreateJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateJob API.
     */
    CreateJobResponse createJob(CreateJobRequest request);

    /**
     * Creates a private endpoint in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/CreatePrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreatePrivateEndpoint API.
     */
    CreatePrivateEndpointResponse createPrivateEndpoint(CreatePrivateEndpointRequest request);

    /**
     * Creates a stack in the specified compartment.
     * You can create a stack from a Terraform configuration.
     * The Terraform configuration can be directly uploaded or referenced from a source code control system.
     * You can also create a stack from an existing compartment, which generates a Terraform configuration.
     * You can also upload the Terraform configuration from an Object Storage bucket.
     * For more information, see
     * [Creating Stacks](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Tasks/create-stack.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/CreateStackExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateStack API.
     */
    CreateStackResponse createStack(CreateStackRequest request);

    /**
     * Creates a private template in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/CreateTemplateExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateTemplate API.
     */
    CreateTemplateResponse createTemplate(CreateTemplateRequest request);

    /**
     * Deletes the specified configuration source provider.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/DeleteConfigurationSourceProviderExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteConfigurationSourceProvider API.
     */
    DeleteConfigurationSourceProviderResponse deleteConfigurationSourceProvider(
            DeleteConfigurationSourceProviderRequest request);

    /**
     * Deletes the specified private endpoint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/DeletePrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeletePrivateEndpoint API.
     */
    DeletePrivateEndpointResponse deletePrivateEndpoint(DeletePrivateEndpointRequest request);

    /**
     * Deletes the specified stack.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/DeleteStackExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteStack API.
     */
    DeleteStackResponse deleteStack(DeleteStackRequest request);

    /**
     * Deletes the specified template.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/DeleteTemplateExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteTemplate API.
     */
    DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request);

    /**
     * Checks drift status for the specified stack.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/DetectStackDriftExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DetectStackDrift API.
     */
    DetectStackDriftResponse detectStackDrift(DetectStackDriftRequest request);

    /**
     * Gets the properties of the specified configuration source provider.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/GetConfigurationSourceProviderExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetConfigurationSourceProvider API.
     */
    GetConfigurationSourceProviderResponse getConfigurationSourceProvider(
            GetConfigurationSourceProviderRequest request);

    /**
     * Gets the properties of the specified job.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/GetJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetJob API.
     */
    GetJobResponse getJob(GetJobRequest request);

    /**
     * Returns the Terraform detailed log content for the specified job in plain text. [Learn about Terraform detailed log.](https://www.terraform.io/docs/internals/debugging.html)
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/GetJobDetailedLogContentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetJobDetailedLogContent API.
     */
    GetJobDetailedLogContentResponse getJobDetailedLogContent(
            GetJobDetailedLogContentRequest request);

    /**
     * Returns console log entries for the specified job in JSON format.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/GetJobLogsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetJobLogs API.
     */
    GetJobLogsResponse getJobLogs(GetJobLogsRequest request);

    /**
     * Returns the raw log file for the specified job in text format.
     * The file includes a maximum of 100,000 log entries.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/GetJobLogsContentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetJobLogsContent API.
     */
    GetJobLogsContentResponse getJobLogsContent(GetJobLogsContentRequest request);

    /**
     * Returns the Terraform configuration for the specified job in zip format.
     * If no zip file is found, returns an error.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/GetJobTfConfigExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetJobTfConfig API.
     */
    GetJobTfConfigResponse getJobTfConfig(GetJobTfConfigRequest request);

    /**
     * Returns the output of the specified Terraform plan job in binary or JSON format.
     * For information about running Terraform plan jobs, see
     * [Creating Plan Jobs](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Tasks/create-job.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/GetJobTfPlanExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetJobTfPlan API.
     */
    GetJobTfPlanResponse getJobTfPlan(GetJobTfPlanRequest request);

    /**
     * Returns the Terraform state for the specified job.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/GetJobTfStateExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetJobTfState API.
     */
    GetJobTfStateResponse getJobTfState(GetJobTfStateRequest request);

    /**
     * Gets the specified private endpoint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/GetPrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetPrivateEndpoint API.
     */
    GetPrivateEndpointResponse getPrivateEndpoint(GetPrivateEndpointRequest request);

    /**
     * Gets the reachable, or alternative, IP address for a nonpublic IP address that is associated with the private endpoint.
     * Resource Manager uses this IP address to connect to nonpublic resources through the associated private endpoint.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/GetReachableIpExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetReachableIp API.
     */
    GetReachableIpResponse getReachableIp(GetReachableIpRequest request);

    /**
     * Gets the specified stack.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/GetStackExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetStack API.
     */
    GetStackResponse getStack(GetStackRequest request);

    /**
     * Returns the Terraform configuration file for the specified stack in zip format.
     * Returns an error if no zip file is found.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/GetStackTfConfigExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetStackTfConfig API.
     */
    GetStackTfConfigResponse getStackTfConfig(GetStackTfConfigRequest request);

    /**
     * Returns the Terraform state for the specified stack.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/GetStackTfStateExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetStackTfState API.
     */
    GetStackTfStateResponse getStackTfState(GetStackTfStateRequest request);

    /**
     * Gets the specified template.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/GetTemplateExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTemplate API.
     */
    GetTemplateResponse getTemplate(GetTemplateRequest request);

    /**
     * Returns the Terraform logo file in .logo format for the specified template.
     * Returns an error if no logo file is found.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/GetTemplateLogoExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTemplateLogo API.
     */
    GetTemplateLogoResponse getTemplateLogo(GetTemplateLogoRequest request);

    /**
     * Returns the Terraform configuration file in zip format for the specified template.
     * Returns an error if no zip file is found.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/GetTemplateTfConfigExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTemplateTfConfig API.
     */
    GetTemplateTfConfigResponse getTemplateTfConfig(GetTemplateTfConfigRequest request);

    /**
     * Returns the specified work request.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/GetWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Lists configuration source providers according to the specified filter.
     * - For `compartmentId`, lists all configuration source providers in the matching compartment.
     * - For `configurationSourceProviderId`, lists the matching configuration source provider.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/ListConfigurationSourceProvidersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListConfigurationSourceProviders API.
     */
    ListConfigurationSourceProvidersResponse listConfigurationSourceProviders(
            ListConfigurationSourceProvidersRequest request);

    /**
     * Lists jobs according to the specified filter. By default, the list is ordered by time created.
     * <p>
     * - To list all jobs in a stack, provide the stack [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * - To list all jobs in a compartment, provide the compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * - To return a specific job, provide the job [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). (Equivalent to {@link #getStack(GetStackRequest) getStack}.)
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/ListJobsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListJobs API.
     */
    ListJobsResponse listJobs(ListJobsRequest request);

    /**
     * Lists private endpoints according to the specified filter.
     * - For `compartmentId`, lists all private endpoints in the matching compartment.
     * - For `privateEndpointId`, lists the matching private endpoint.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/ListPrivateEndpointsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListPrivateEndpoints API.
     */
    ListPrivateEndpointsResponse listPrivateEndpoints(ListPrivateEndpointsRequest request);

    /**
     * Returns a list of supported services for [Resource Discovery](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/resource-discovery.htm).
     * For reference on service names, see the [Terraform provider documentation](https://www.terraform.io/docs/providers/oci/guides/resource_discovery.html#services).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/ListResourceDiscoveryServicesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListResourceDiscoveryServices API.
     */
    ListResourceDiscoveryServicesResponse listResourceDiscoveryServices(
            ListResourceDiscoveryServicesRequest request);

    /**
     * Lists drift status details for each resource defined in the specified stack.
     * The drift status details for a given resource indicate differences, if any, between the actual state
     * and the expected (defined) state for that resource.
     * The drift status details correspond to the specified work request (`workRequestId`).
     * If no work request is specified, then the drift status details correspond to the latest completed work request for the stack.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/ListStackResourceDriftDetailsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListStackResourceDriftDetails API.
     */
    ListStackResourceDriftDetailsResponse listStackResourceDriftDetails(
            ListStackResourceDriftDetailsRequest request);

    /**
     * Lists stacks according to the specified filter.
     * - If called using the compartment ID, returns all stacks in the specified compartment.
     * - If called using the stack ID, returns the specified stack. (See also {@link #getStack(GetStackRequest) getStack}.)
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/ListStacksExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListStacks API.
     */
    ListStacksResponse listStacks(ListStacksRequest request);

    /**
     * Lists template categories.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/ListTemplateCategoriesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTemplateCategories API.
     */
    ListTemplateCategoriesResponse listTemplateCategories(ListTemplateCategoriesRequest request);

    /**
     * Lists templates according to the specified filter.
     * The attributes `compartmentId` and `templateCategoryId` are required unless `templateId` is specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/ListTemplatesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTemplates API.
     */
    ListTemplatesResponse listTemplates(ListTemplatesRequest request);

    /**
     * Returns a list of supported Terraform versions for use with stacks.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/ListTerraformVersionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTerraformVersions API.
     */
    ListTerraformVersionsResponse listTerraformVersions(ListTerraformVersionsRequest request);

    /**
     * Returns a paginated list of errors for the specified work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/ListWorkRequestErrorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Returns a paginated list of logs for the specified work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/ListWorkRequestLogsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in the specified compartment or for the specified resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/ListWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Updates the properties of the specified configuration source provider.
     * For more information, see
     * [To edit a configuration source provider](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Tasks/managingconfigurationsourceproviders.htm#EditConfigurationSourceProvider).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/UpdateConfigurationSourceProviderExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateConfigurationSourceProvider API.
     */
    UpdateConfigurationSourceProviderResponse updateConfigurationSourceProvider(
            UpdateConfigurationSourceProviderRequest request);

    /**
     * Updates the specified job.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/UpdateJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateJob API.
     */
    UpdateJobResponse updateJob(UpdateJobRequest request);

    /**
     * Updates the specified private endpoint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/UpdatePrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdatePrivateEndpoint API.
     */
    UpdatePrivateEndpointResponse updatePrivateEndpoint(UpdatePrivateEndpointRequest request);

    /**
     * Updates the specified stack.
     * Use `UpdateStack` when you update your Terraform configuration
     * and want your changes to be reflected in the execution plan.
     * For more information, see
     * [Updating Stacks](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Tasks/update-stack.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/UpdateStackExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateStack API.
     */
    UpdateStackResponse updateStack(UpdateStackRequest request);

    /**
     * Updates the specified template.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/UpdateTemplateExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateTemplate API.
     */
    UpdateTemplateResponse updateTemplate(UpdateTemplateRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    ResourceManagerWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    ResourceManagerPaginators getPaginators();
}
