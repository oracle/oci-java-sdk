/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement;

import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;

/**
 * Use the Database Management API to perform tasks such as obtaining performance and resource usage metrics
 * for a fleet of Managed Databases or a specific Managed Database, creating Managed Database Groups, and
 * running a SQL job on a Managed Database or Managed Database Group.
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public interface DbManagementAsync extends AutoCloseable {

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
     * Adds a Managed Database to a specific Managed Database Group.
     * After the database is added, it will be included in the
     * management activities performed on the Managed Database Group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddManagedDatabaseToManagedDatabaseGroupResponse>
            addManagedDatabaseToManagedDatabaseGroup(
                    AddManagedDatabaseToManagedDatabaseGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AddManagedDatabaseToManagedDatabaseGroupRequest,
                                    AddManagedDatabaseToManagedDatabaseGroupResponse>
                            handler);

    /**
     * Changes database parameters' values. There are two kinds of database
     * parameters:
     * <p>
     * - Dynamic parameters: They can be changed for the current Oracle
     * Database instance. The changes take effect immediately.
     * - Static parameters: They cannot be changed for the current instance.
     * You must change these parameters and then restart the database before
     * changes take effect.
     * <p>
     **Note:** If the instance is started using a text initialization
     * parameter file, the parameter changes are applicable only for the
     * current instance. You must update them manually to be passed to
     * a future instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDatabaseParametersResponse> changeDatabaseParameters(
            ChangeDatabaseParametersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeDatabaseParametersRequest, ChangeDatabaseParametersResponse>
                    handler);

    /**
     * Moves a job.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeJobCompartmentResponse> changeJobCompartment(
            ChangeJobCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeJobCompartmentRequest, ChangeJobCompartmentResponse>
                    handler);

    /**
     * Moves a Managed Database Group to a different compartment.
     * The destination compartment must not have a Managed Database Group
     * with the same name.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeManagedDatabaseGroupCompartmentResponse>
            changeManagedDatabaseGroupCompartment(
                    ChangeManagedDatabaseGroupCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeManagedDatabaseGroupCompartmentRequest,
                                    ChangeManagedDatabaseGroupCompartmentResponse>
                            handler);

    /**
     * Creates a job to be executed on a Managed Database or Managed Database Group. Only one
     * of the parameters, managedDatabaseId or managedDatabaseGroupId should be provided as
     * input in CreateJobDetails resource in request body.
     *
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
     * Creates a Managed Database Group. The group does not contain any
     * Managed Databases when it is created, and they must be added later.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateManagedDatabaseGroupResponse> createManagedDatabaseGroup(
            CreateManagedDatabaseGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateManagedDatabaseGroupRequest, CreateManagedDatabaseGroupResponse>
                    handler);

    /**
     * Deletes the job specified by jobId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteJobResponse> deleteJob(
            DeleteJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteJobRequest, DeleteJobResponse> handler);

    /**
     * Deletes the Managed Database Group specified by managedDatabaseGroupId.
     * If the group contains Managed Databases, then it cannot be deleted.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteManagedDatabaseGroupResponse> deleteManagedDatabaseGroup(
            DeleteManagedDatabaseGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteManagedDatabaseGroupRequest, DeleteManagedDatabaseGroupResponse>
                    handler);

    /**
     * Gets the health metrics for a fleet of databases in a compartment or in a Managed Database Group.
     * Either the CompartmentId or the ManagedDatabaseGroupId query parameters must be provided to retrieve the health metrics.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseFleetHealthMetricsResponse>
            getDatabaseFleetHealthMetrics(
                    GetDatabaseFleetHealthMetricsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseFleetHealthMetricsRequest,
                                    GetDatabaseFleetHealthMetricsResponse>
                            handler);

    /**
     * Gets a summary of the activity and resource usage metrics like DB Time, CPU, User I/O, Wait, Storage, and Memory for a Managed Database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseHomeMetricsResponse> getDatabaseHomeMetrics(
            GetDatabaseHomeMetricsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseHomeMetricsRequest, GetDatabaseHomeMetricsResponse>
                    handler);

    /**
     * Gets the details for the job specified by jobId.
     *
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
     * Gets the details for the job execution specified by jobExecutionId.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetJobExecutionResponse> getJobExecution(
            GetJobExecutionRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJobExecutionRequest, GetJobExecutionResponse>
                    handler);

    /**
     * Gets the details for the job run specified by jobRunId.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetJobRunResponse> getJobRun(
            GetJobRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJobRunRequest, GetJobRunResponse> handler);

    /**
     * Gets the details for the Managed Database specified by managedDatabaseId.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetManagedDatabaseResponse> getManagedDatabase(
            GetManagedDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetManagedDatabaseRequest, GetManagedDatabaseResponse>
                    handler);

    /**
     * Gets the details for the Managed Database Group specified by managedDatabaseGroupId.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetManagedDatabaseGroupResponse> getManagedDatabaseGroup(
            GetManagedDatabaseGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetManagedDatabaseGroupRequest, GetManagedDatabaseGroupResponse>
                    handler);

    /**
     * Gets the list of database parameters for the specified Managed Database. The parameters are listed in alphabetical order, along with their current values.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDatabaseParametersResponse> listDatabaseParameters(
            ListDatabaseParametersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDatabaseParametersRequest, ListDatabaseParametersResponse>
                    handler);

    /**
     * Gets the job execution for a specific ID or the list of job executions for a job, Managed Database or Managed Database Group
     * in a specific compartment. Only one of the parameters, ID, jobId, managedDatabaseId or managedDatabaseGroupId should be provided.
     * If none of these parameters is provided, all the job executions in the compartment are listed. Job executions can also be filtered
     * based on the name and status parameters.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListJobExecutionsResponse> listJobExecutions(
            ListJobExecutionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListJobExecutionsRequest, ListJobExecutionsResponse>
                    handler);

    /**
     * Gets the job run for a specific ID or the list of job runs for a job, Managed Database or Managed Database Group
     * in a specific compartment. Only one of the parameters, ID, jobId, managedDatabaseId, or managedDatabaseGroupId
     * should be provided. If none of these parameters is provided, all the job runs in the compartment are listed.
     * Job runs can also be filtered based on name and runStatus parameters.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListJobRunsResponse> listJobRuns(
            ListJobRunsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListJobRunsRequest, ListJobRunsResponse> handler);

    /**
     * Gets the job for a specific ID or the list of jobs for a Managed Database or Managed Database Group
     * in a specific compartment. Only one of the parameters, ID, managedDatabaseId or managedDatabaseGroupId,
     * should be provided. If none of these parameters is provided, all the jobs in the compartment are listed.
     * Jobs can also be filtered based on the name and lifecycleState parameters.
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
     * Gets the Managed Database Group for a specific ID or the list of Managed Database Groups in
     * a specific compartment. Managed Database Groups can also be filtered based on the name parameter.
     * Only one of the parameters, ID or name should be provided. If none of these parameters is provided,
     * all the Managed Database Groups in the compartment are listed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedDatabaseGroupsResponse> listManagedDatabaseGroups(
            ListManagedDatabaseGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListManagedDatabaseGroupsRequest, ListManagedDatabaseGroupsResponse>
                    handler);

    /**
     * Gets the Managed Database for a specific ID or the list of Managed Databases in a specific compartment.
     * Managed Databases can also be filtered based on the name parameter. Only one of the parameters, ID or name
     * should be provided. If none of these parameters is provided, all the Managed Databases in the compartment are listed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedDatabasesResponse> listManagedDatabases(
            ListManagedDatabasesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListManagedDatabasesRequest, ListManagedDatabasesResponse>
                    handler);

    /**
     * Gets the list of tablespaces for the specified managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTablespacesResponse> listTablespaces(
            ListTablespacesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTablespacesRequest, ListTablespacesResponse>
                    handler);

    /**
     * Removes a Managed Database from a Managed Database Group. Any management
     * activities that are currently running on this database will continue to
     * run to completion. However, any activities scheduled to run in the future
     * will not be performed on this database.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveManagedDatabaseFromManagedDatabaseGroupResponse>
            removeManagedDatabaseFromManagedDatabaseGroup(
                    RemoveManagedDatabaseFromManagedDatabaseGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveManagedDatabaseFromManagedDatabaseGroupRequest,
                                    RemoveManagedDatabaseFromManagedDatabaseGroupResponse>
                            handler);

    /**
     * Resets database parameters' values to their default or startup values.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ResetDatabaseParametersResponse> resetDatabaseParameters(
            ResetDatabaseParametersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ResetDatabaseParametersRequest, ResetDatabaseParametersResponse>
                    handler);

    /**
     * Updates the Managed Database Group specified by managedDatabaseGroupId.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateManagedDatabaseGroupResponse> updateManagedDatabaseGroup(
            UpdateManagedDatabaseGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateManagedDatabaseGroupRequest, UpdateManagedDatabaseGroupResponse>
                    handler);
}
