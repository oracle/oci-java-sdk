/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.resourcemanager;

import com.oracle.bmc.resourcemanager.requests.*;
import com.oracle.bmc.resourcemanager.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
public interface ResourceManagerAsync extends AutoCloseable {

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
     * Indicates the intention to cancel the specified job.
     * Cancellation of the job is not immediate, and may be delayed,
     * or may not happen at all.
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
     * Moves a Stack and it's associated Jobs into a different compartment.
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
     * Creates a stack in the specified comparment.
     * Specify the compartment using the compartment ID.
     * For more information, see [Create a Stack](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Tasks/usingconsole.htm#CreateStack).
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
     * Deletes the specified stack object.
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
     * Returns the specified job along with the job details.
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
     * Returns log entries for the specified job in JSON format.
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
     * Returns raw log file for the specified job in text format.
     * Returns a maximum of 100,000 log entries.
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
     * Returns the Terraform configuration file for the specified job in .zip format.
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
    java.util.concurrent.Future<GetJobTfConfigResponse> getJobTfConfig(
            GetJobTfConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJobTfConfigRequest, GetJobTfConfigResponse>
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
     * Gets a stack using the stack ID.
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
     * Returns the Terraform configuration file in .zip format for the specified stack.
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
     * Return the given work request.
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
     * Returns a list of jobs in a stack or compartment, ordered by time created.
     * <p>
     * - To list all jobs in a stack, provide the stack [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * - To list all jobs in a compartment, provide the compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * - To return a specific job, provide the job [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
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
     * Returns a list of stacks.
     * - If called using the compartment ID, returns all stacks in the specified compartment.
     * - If called using the stack ID, returns the specified stack.
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
     * Return a (paginated) list of errors for a given work request.
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
     * Return a (paginated) list of logs for a given work request.
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
     * Lists the work requests in a given compartment or for a given resource.
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
     * Updates the specified stack object.
     * Use `UpdateStack` when you update your Terraform configuration
     * and want your changes to be reflected in the execution plan.
     * For more information, see [Update a Stack](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Tasks/usingconsole.htm#UpdateStack) and
     * [Edit or Delete a Stack](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Tasks/usingconsole.htm#EditStack).
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
}
