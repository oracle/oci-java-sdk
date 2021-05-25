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
public interface DbManagement extends AutoCloseable {

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
     * Adds a Managed Database to a specific Managed Database Group.
     * After the database is added, it will be included in the
     * management activities performed on the Managed Database Group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/AddManagedDatabaseToManagedDatabaseGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddManagedDatabaseToManagedDatabaseGroup API.
     */
    AddManagedDatabaseToManagedDatabaseGroupResponse addManagedDatabaseToManagedDatabaseGroup(
            AddManagedDatabaseToManagedDatabaseGroupRequest request);

    /**
     * Changes database parameter values. There are two kinds of database
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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ChangeDatabaseParametersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeDatabaseParameters API.
     */
    ChangeDatabaseParametersResponse changeDatabaseParameters(
            ChangeDatabaseParametersRequest request);

    /**
     * Moves a job.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ChangeJobCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeJobCompartment API.
     */
    ChangeJobCompartmentResponse changeJobCompartment(ChangeJobCompartmentRequest request);

    /**
     * Moves a Managed Database Group to a different compartment.
     * The destination compartment must not have a Managed Database Group
     * with the same name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ChangeManagedDatabaseGroupCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeManagedDatabaseGroupCompartment API.
     */
    ChangeManagedDatabaseGroupCompartmentResponse changeManagedDatabaseGroupCompartment(
            ChangeManagedDatabaseGroupCompartmentRequest request);

    /**
     * Creates a job to be executed on a Managed Database or Managed Database Group. Only one
     * of the parameters, managedDatabaseId or managedDatabaseGroupId should be provided as
     * input in CreateJobDetails resource in request body.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/CreateJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateJob API.
     */
    CreateJobResponse createJob(CreateJobRequest request);

    /**
     * Creates a Managed Database Group. The group does not contain any
     * Managed Databases when it is created, and they must be added later.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/CreateManagedDatabaseGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateManagedDatabaseGroup API.
     */
    CreateManagedDatabaseGroupResponse createManagedDatabaseGroup(
            CreateManagedDatabaseGroupRequest request);

    /**
     * Deletes the job specified by jobId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DeleteJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteJob API.
     */
    DeleteJobResponse deleteJob(DeleteJobRequest request);

    /**
     * Deletes the Managed Database Group specified by managedDatabaseGroupId.
     * If the group contains Managed Databases, then it cannot be deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DeleteManagedDatabaseGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteManagedDatabaseGroup API.
     */
    DeleteManagedDatabaseGroupResponse deleteManagedDatabaseGroup(
            DeleteManagedDatabaseGroupRequest request);

    /**
     * Gets the AWR report for the specified Managed Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetAwrDbReportExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAwrDbReport API.
     */
    GetAwrDbReportResponse getAwrDbReport(GetAwrDbReportRequest request);

    /**
     * Get a AWR SQL report for one SQL.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetAwrDbSqlReportExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAwrDbSqlReport API.
     */
    GetAwrDbSqlReportResponse getAwrDbSqlReport(GetAwrDbSqlReportRequest request);

    /**
     * Gets the metrics related to cluster cache for the Oracle
     * Real Application Clusters (Oracle RAC) database specified
     * by managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetClusterCacheMetricExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetClusterCacheMetric API.
     */
    GetClusterCacheMetricResponse getClusterCacheMetric(GetClusterCacheMetricRequest request);

    /**
     * Gets the health metrics for a fleet of databases in a compartment or in a Managed Database Group.
     * Either the CompartmentId or the ManagedDatabaseGroupId query parameters must be provided to retrieve the health metrics.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetDatabaseFleetHealthMetricsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDatabaseFleetHealthMetrics API.
     */
    GetDatabaseFleetHealthMetricsResponse getDatabaseFleetHealthMetrics(
            GetDatabaseFleetHealthMetricsRequest request);

    /**
     * Gets a summary of the activity and resource usage metrics like DB Time, CPU, User I/O, Wait, Storage, and Memory for a Managed Database.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetDatabaseHomeMetricsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDatabaseHomeMetrics API.
     */
    GetDatabaseHomeMetricsResponse getDatabaseHomeMetrics(GetDatabaseHomeMetricsRequest request);

    /**
     * Gets the details for the job specified by jobId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetJobExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetJob API.
     */
    GetJobResponse getJob(GetJobRequest request);

    /**
     * Gets the details for the job execution specified by jobExecutionId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetJobExecutionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetJobExecution API.
     */
    GetJobExecutionResponse getJobExecution(GetJobExecutionRequest request);

    /**
     * Gets the details for the job run specified by jobRunId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetJobRunExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetJobRun API.
     */
    GetJobRunResponse getJobRun(GetJobRunRequest request);

    /**
     * Gets the details for the Managed Database specified by managedDatabaseId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetManagedDatabaseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetManagedDatabase API.
     */
    GetManagedDatabaseResponse getManagedDatabase(GetManagedDatabaseRequest request);

    /**
     * Gets the details for the Managed Database Group specified by managedDatabaseGroupId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetManagedDatabaseGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetManagedDatabaseGroup API.
     */
    GetManagedDatabaseGroupResponse getManagedDatabaseGroup(GetManagedDatabaseGroupRequest request);

    /**
     * Lists AWR snapshots for the specified database in the AWR.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListAwrDbSnapshotsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAwrDbSnapshots API.
     */
    ListAwrDbSnapshotsResponse listAwrDbSnapshots(ListAwrDbSnapshotsRequest request);

    /**
     * Gets the list of databases and their snapshot summary details available in the AWR of the specified Managed Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListAwrDbsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAwrDbs API.
     */
    ListAwrDbsResponse listAwrDbs(ListAwrDbsRequest request);

    /**
     * Gets the list of database parameters for the specified Managed Database. The parameters are listed in alphabetical order, along with their current values.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListDatabaseParametersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDatabaseParameters API.
     */
    ListDatabaseParametersResponse listDatabaseParameters(ListDatabaseParametersRequest request);

    /**
     * Gets the job execution for a specific ID or the list of job executions for a job, Managed Database or Managed Database Group
     * in a specific compartment. Only one of the parameters, ID, jobId, managedDatabaseId or managedDatabaseGroupId should be provided.
     * If none of these parameters is provided, all the job executions in the compartment are listed. Job executions can also be filtered
     * based on the name and status parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListJobExecutionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListJobExecutions API.
     */
    ListJobExecutionsResponse listJobExecutions(ListJobExecutionsRequest request);

    /**
     * Gets the job run for a specific ID or the list of job runs for a job, Managed Database or Managed Database Group
     * in a specific compartment. Only one of the parameters, ID, jobId, managedDatabaseId, or managedDatabaseGroupId
     * should be provided. If none of these parameters is provided, all the job runs in the compartment are listed.
     * Job runs can also be filtered based on name and runStatus parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListJobRunsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListJobRuns API.
     */
    ListJobRunsResponse listJobRuns(ListJobRunsRequest request);

    /**
     * Gets the job for a specific ID or the list of jobs for a Managed Database or Managed Database Group
     * in a specific compartment. Only one of the parameters, ID, managedDatabaseId or managedDatabaseGroupId,
     * should be provided. If none of these parameters is provided, all the jobs in the compartment are listed.
     * Jobs can also be filtered based on the name and lifecycleState parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListJobsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListJobs API.
     */
    ListJobsResponse listJobs(ListJobsRequest request);

    /**
     * Gets the Managed Database Group for a specific ID or the list of Managed Database Groups in
     * a specific compartment. Managed Database Groups can also be filtered based on the name parameter.
     * Only one of the parameters, ID or name should be provided. If none of these parameters is provided,
     * all the Managed Database Groups in the compartment are listed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListManagedDatabaseGroupsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListManagedDatabaseGroups API.
     */
    ListManagedDatabaseGroupsResponse listManagedDatabaseGroups(
            ListManagedDatabaseGroupsRequest request);

    /**
     * Gets the Managed Database for a specific ID or the list of Managed Databases in a specific compartment.
     * Managed Databases can also be filtered based on the name parameter. Only one of the parameters, ID or name
     * should be provided. If none of these parameters is provided, all the Managed Databases in the compartment are listed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListManagedDatabasesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListManagedDatabases API.
     */
    ListManagedDatabasesResponse listManagedDatabases(ListManagedDatabasesRequest request);

    /**
     * Gets the list of tablespaces for the specified managedDatabaseId.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListTablespacesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTablespaces API.
     */
    ListTablespacesResponse listTablespaces(ListTablespacesRequest request);

    /**
     * Removes a Managed Database from a Managed Database Group. Any management
     * activities that are currently running on this database will continue to
     * run to completion. However, any activities scheduled to run in the future
     * will not be performed on this database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/RemoveManagedDatabaseFromManagedDatabaseGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemoveManagedDatabaseFromManagedDatabaseGroup API.
     */
    RemoveManagedDatabaseFromManagedDatabaseGroupResponse
            removeManagedDatabaseFromManagedDatabaseGroup(
                    RemoveManagedDatabaseFromManagedDatabaseGroupRequest request);

    /**
     * Resets database parameter values to their default or startup values.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ResetDatabaseParametersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ResetDatabaseParameters API.
     */
    ResetDatabaseParametersResponse resetDatabaseParameters(ResetDatabaseParametersRequest request);

    /**
     * Summarizes the AWR CPU resource limits and metrics for the specified database in AWR.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeAwrDbCpuUsagesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDbCpuUsages API.
     */
    SummarizeAwrDbCpuUsagesResponse summarizeAwrDbCpuUsages(SummarizeAwrDbCpuUsagesRequest request);

    /**
     * Summarizes the metric samples for the specified database in the AWR. The metric samples are summarized based on the Time dimension for each metric.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeAwrDbMetricsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDbMetrics API.
     */
    SummarizeAwrDbMetricsResponse summarizeAwrDbMetrics(SummarizeAwrDbMetricsRequest request);

    /**
     * Summarizes the AWR database parameter change history for one database parameter of the specified Managed Database. One change history record contains
     * the previous value, the changed value, and the corresponding time range. If the database parameter value was changed multiple times within the time range, then multiple change history records are created for the same parameter.
     * Note that this API only returns information on change history details for one database parameter.
     * To get a list of all the database parameters whose values were changed during a specified time range, use the following API endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbs/{awrDbId}/awrDbParameters
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeAwrDbParameterChangesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDbParameterChanges API.
     */
    SummarizeAwrDbParameterChangesResponse summarizeAwrDbParameterChanges(
            SummarizeAwrDbParameterChangesRequest request);

    /**
     * Summarizes the AWR database parameter history for the specified Managed Database. This includes the list of database
     * parameters, with information on whether the parameter values were modified within the query time range. Note that
     * each database parameter is only listed once. The returned summary gets all the database parameters, which include:
     *  -Each parameter whose value was changed during the time range: AwrDbParameterValueOptionalQueryParam (valueChanged =\"Y\")
     *  -Each parameter whose value was unchanged during the time range: AwrDbParameterValueOptionalQueryParam (valueChanged =\"N\")
     *  -Each parameter whose value was changed at the system level during the time range: (valueChanged =\"Y\"  and valueModified = \"SYSTEM_MOD\").
     *  -Each parameter whose value was unchanged during the time range, however, the value is not the default value: (valueChanged =\"N\" and  valueDefault = \"FALSE\")
     * Note that this API does not return information on the number of times each database parameter has been changed within the time range. To get the database parameter value change history for a specific parameter, use the following API endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbs/{awrDbId}/awrDbParameterChanges
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeAwrDbParametersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDbParameters API.
     */
    SummarizeAwrDbParametersResponse summarizeAwrDbParameters(
            SummarizeAwrDbParametersRequest request);

    /**
     * Summarizes the AWR snapshot ranges that contain continuous snapshots, for the specified Managed Database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeAwrDbSnapshotRangesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDbSnapshotRanges API.
     */
    SummarizeAwrDbSnapshotRangesResponse summarizeAwrDbSnapshotRanges(
            SummarizeAwrDbSnapshotRangesRequest request);

    /**
     * Summarizes the AWR SYSSTAT sample data for the specified database in AWR. The statistical data is summarized based on the Time dimension for each statistic.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeAwrDbSysstatsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDbSysstats API.
     */
    SummarizeAwrDbSysstatsResponse summarizeAwrDbSysstats(SummarizeAwrDbSysstatsRequest request);

    /**
     * Summarizes the AWR top wait events.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeAwrDbTopWaitEventsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDbTopWaitEvents API.
     */
    SummarizeAwrDbTopWaitEventsResponse summarizeAwrDbTopWaitEvents(
            SummarizeAwrDbTopWaitEventsRequest request);

    /**
     * Summarizes AWR wait event data into value buckets and frequency, for the specified database in the AWR.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeAwrDbWaitEventBucketsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDbWaitEventBuckets API.
     */
    SummarizeAwrDbWaitEventBucketsResponse summarizeAwrDbWaitEventBuckets(
            SummarizeAwrDbWaitEventBucketsRequest request);

    /**
     * Summarizes the AWR wait event sample data for the specified database in the AWR. The event data is summarized based on the Time dimension for each event.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeAwrDbWaitEventsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDbWaitEvents API.
     */
    SummarizeAwrDbWaitEventsResponse summarizeAwrDbWaitEvents(
            SummarizeAwrDbWaitEventsRequest request);

    /**
     * Updates the Managed Database Group specified by managedDatabaseGroupId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/UpdateManagedDatabaseGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateManagedDatabaseGroup API.
     */
    UpdateManagedDatabaseGroupResponse updateManagedDatabaseGroup(
            UpdateManagedDatabaseGroupRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    DbManagementWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DbManagementPaginators getPaginators();
}
