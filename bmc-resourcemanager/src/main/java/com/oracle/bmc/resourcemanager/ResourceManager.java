/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager;

import com.oracle.bmc.resourcemanager.requests.*;
import com.oracle.bmc.resourcemanager.responses.*;

/**
 * API for the Resource Manager service.
 * Use this API to install, configure, and manage resources via the "infrastructure-as-code" model.
 * For more information, see
 * [Overview of Resource Manager](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/resourcemanager.htm).
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
public interface ResourceManager extends AutoCloseable {

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
     * Indicates the intention to cancel the specified job.
     * Cancellation of the job is not immediate, and may be delayed,
     * or may not happen at all.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     */
    ChangeConfigurationSourceProviderCompartmentResponse
            changeConfigurationSourceProviderCompartment(
                    ChangeConfigurationSourceProviderCompartmentRequest request);

    /**
     * Moves a Stack and it's associated Jobs into a different compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeStackCompartmentResponse changeStackCompartment(ChangeStackCompartmentRequest request);

    /**
     * Creates a configuration source provider in the specified compartment.
     * For more information, see
     * [To create a configuration source provider](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Tasks/managingstacksandjobs.htm#CreateConfigurationSourceProvider).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateConfigurationSourceProviderResponse createConfigurationSourceProvider(
            CreateConfigurationSourceProviderRequest request);

    /**
     * Creates a job.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateJobResponse createJob(CreateJobRequest request);

    /**
     * Creates a stack in the specified compartment.
     * You can create a stack from a Terraform configuration file.
     * The Terraform configuration file can be directly uploaded or referenced from a source code control system.
     * You can also create a stack from an existing compartment.
     * For more information, see
     * [To create a stack](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Tasks/managingstacksandjobs.htm#CreateStack).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateStackResponse createStack(CreateStackRequest request);

    /**
     * Deletes the specified configuration source provider.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteConfigurationSourceProviderResponse deleteConfigurationSourceProvider(
            DeleteConfigurationSourceProviderRequest request);

    /**
     * Deletes the specified stack object.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteStackResponse deleteStack(DeleteStackRequest request);

    /**
     * Checks drift status for the specified stack.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DetectStackDriftResponse detectStackDrift(DetectStackDriftRequest request);

    /**
     * Gets the properties of the specified configuration source provider.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetConfigurationSourceProviderResponse getConfigurationSourceProvider(
            GetConfigurationSourceProviderRequest request);

    /**
     * Returns the specified job along with the job details.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetJobResponse getJob(GetJobRequest request);

    /**
     * Returns log entries for the specified job in JSON format.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetJobLogsResponse getJobLogs(GetJobLogsRequest request);

    /**
     * Returns raw log file for the specified job in text format.
     * Returns a maximum of 100,000 log entries.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetJobLogsContentResponse getJobLogsContent(GetJobLogsContentRequest request);

    /**
     * Returns the Terraform configuration file for the specified job in .zip format.
     * Returns an error if no zip file is found.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetJobTfConfigResponse getJobTfConfig(GetJobTfConfigRequest request);

    /**
     * Returns the Terraform state for the specified job.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetJobTfStateResponse getJobTfState(GetJobTfStateRequest request);

    /**
     * Gets a stack using the stack ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetStackResponse getStack(GetStackRequest request);

    /**
     * Returns the Terraform configuration file in .zip format for the specified stack.
     * Returns an error if no zip file is found.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetStackTfConfigResponse getStackTfConfig(GetStackTfConfigRequest request);

    /**
     * Returns the Terraform state for the specified stack.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetStackTfStateResponse getStackTfState(GetStackTfStateRequest request);

    /**
     * Return the given work request.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
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
     */
    ListConfigurationSourceProvidersResponse listConfigurationSourceProviders(
            ListConfigurationSourceProvidersRequest request);

    /**
     * Returns a list of jobs in a stack or compartment, ordered by time created.
     * <p>
     * - To list all jobs in a stack, provide the stack [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * - To list all jobs in a compartment, provide the compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * - To return a specific job, provide the job [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListJobsResponse listJobs(ListJobsRequest request);

    /**
     * Returns a list of supported services for Resource Discovery. For reference on service names, see the [Terraform provider documentation](https://www.terraform.io/docs/providers/oci/guides/resource_discovery.html#services).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListResourceDiscoveryServicesResponse listResourceDiscoveryServices(
            ListResourceDiscoveryServicesRequest request);

    /**
     * Lists drift status details for each resource defined in the specified stack.
     * The drift status details for a given resource indicate differences, if any, between the actual state
     * and the expected (defined) state for that resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListStackResourceDriftDetailsResponse listStackResourceDriftDetails(
            ListStackResourceDriftDetailsRequest request);

    /**
     * Returns a list of stacks.
     * - If called using the compartment ID, returns all stacks in the specified compartment.
     * - If called using the stack ID, returns the specified stack.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListStacksResponse listStacks(ListStacksRequest request);

    /**
     * Returns a list of supported Terraform versions for use with stacks.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListTerraformVersionsResponse listTerraformVersions(ListTerraformVersionsRequest request);

    /**
     * Return a (paginated) list of errors for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Return a (paginated) list of logs for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a given compartment or for a given resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Updates the properties of the specified configuration source provider.
     * For more information, see
     * [To update a configuration source provider](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Tasks/managingstacksandjobs.htm#UpdateConfigurationSourceProvider).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateConfigurationSourceProviderResponse updateConfigurationSourceProvider(
            UpdateConfigurationSourceProviderRequest request);

    /**
     * Updates the specified job.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateJobResponse updateJob(UpdateJobRequest request);

    /**
     * Updates the specified stack object.
     * Use `UpdateStack` when you update your Terraform configuration
     * and want your changes to be reflected in the execution plan.
     * For more information, see
     * [To update a stack](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Tasks/managingstacksandjobs.htm#UpdateStack) and
     * [To edit a stack](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Tasks/managingstacksandjobs.htm#EditStack).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateStackResponse updateStack(UpdateStackRequest request);

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
