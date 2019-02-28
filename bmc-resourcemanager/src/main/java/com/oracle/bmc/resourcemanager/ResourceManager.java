/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.resourcemanager;

import com.oracle.bmc.resourcemanager.requests.*;
import com.oracle.bmc.resourcemanager.responses.*;

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
     * Creates a job.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateJobResponse createJob(CreateJobRequest request);

    /**
     * Creates a stack in the specified comparment.
     * Specify the compartment using the compartment ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateStackResponse createStack(CreateStackRequest request);

    /**
     * Deletes the specified stack object.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteStackResponse deleteStack(DeleteStackRequest request);

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
     * Returns a list of jobs in a stack or compartment, ordered by time created.
     * <p>
     * - To list all jobs in a stack, provide the stack OCID.
     * - To list all jobs in a compartment, provide the compartment OCID.
     * - To return a specific job, provide the job OCID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListJobsResponse listJobs(ListJobsRequest request);

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
