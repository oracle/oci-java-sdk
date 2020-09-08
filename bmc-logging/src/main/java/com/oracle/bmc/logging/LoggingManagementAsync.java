/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging;

import com.oracle.bmc.logging.requests.*;
import com.oracle.bmc.logging.responses.*;

/**
 * loggingManagementControlplane API specification
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
public interface LoggingManagementAsync extends AutoCloseable {

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
     * Moves a log group into a different compartment within the same tenancy.  When provided, If-Match is checked against ETag values of the resource.
     * For information about moving resources between compartments, see [Moving Resources Between Compartments](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeLogGroupCompartmentResponse> changeLogGroupCompartment(
            ChangeLogGroupCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeLogGroupCompartmentRequest, ChangeLogGroupCompartmentResponse>
                    handler);

    /**
     * Moves a log into a different log group within the same tenancy.  When provided, If-Match is checked against ETag values of the resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeLogLogGroupResponse> changeLogLogGroup(
            ChangeLogLogGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeLogLogGroupRequest, ChangeLogLogGroupResponse>
                    handler);

    /**
     * Moves a saved search into a different compartment within the same tenancy. For information about moving
     * resources between compartments, see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeLogSavedSearchCompartmentResponse>
            changeLogSavedSearchCompartment(
                    ChangeLogSavedSearchCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLogSavedSearchCompartmentRequest,
                                    ChangeLogSavedSearchCompartmentResponse>
                            handler);

    /**
     * Moves unified agent configuration into a different compartment within the same tenancy.  When provided, If-Match is checked against ETag values of the resource.
     * For information about moving resources between compartments, see [Moving Resources Between Compartments](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeUnifiedAgentConfigurationCompartmentResponse>
            changeUnifiedAgentConfigurationCompartment(
                    ChangeUnifiedAgentConfigurationCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeUnifiedAgentConfigurationCompartmentRequest,
                                    ChangeUnifiedAgentConfigurationCompartmentResponse>
                            handler);

    /**
     * Creates a log within specified log group. This call fails if log group is already created
     * with same displayName or (service, resource, category) triplet.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateLogResponse> createLog(
            CreateLogRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateLogRequest, CreateLogResponse> handler);

    /**
     * Create new log group with unique display name. This call fails
     * if log group is already created with same displayName in the compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateLogGroupResponse> createLogGroup(
            CreateLogGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateLogGroupRequest, CreateLogGroupResponse>
                    handler);

    /**
     * Creates a new LogSavedSearch.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateLogSavedSearchResponse> createLogSavedSearch(
            CreateLogSavedSearchRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateLogSavedSearchRequest, CreateLogSavedSearchResponse>
                    handler);

    /**
     * Create unified agent config registration
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateUnifiedAgentConfigurationResponse>
            createUnifiedAgentConfiguration(
                    CreateUnifiedAgentConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateUnifiedAgentConfigurationRequest,
                                    CreateUnifiedAgentConfigurationResponse>
                            handler);

    /**
     * Deletes the log object in a log group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteLogResponse> deleteLog(
            DeleteLogRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteLogRequest, DeleteLogResponse> handler);

    /**
     * Deletes the specified log group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteLogGroupResponse> deleteLogGroup(
            DeleteLogGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteLogGroupRequest, DeleteLogGroupResponse>
                    handler);

    /**
     * Deletes the specified log saved search.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteLogSavedSearchResponse> deleteLogSavedSearch(
            DeleteLogSavedSearchRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteLogSavedSearchRequest, DeleteLogSavedSearchResponse>
                    handler);

    /**
     * Delete unified agent configuration
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteUnifiedAgentConfigurationResponse>
            deleteUnifiedAgentConfiguration(
                    DeleteUnifiedAgentConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteUnifiedAgentConfigurationRequest,
                                    DeleteUnifiedAgentConfigurationResponse>
                            handler);

    /**
     * Cancel a work request that has not started yet.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteWorkRequestResponse> deleteWorkRequest(
            DeleteWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteWorkRequestRequest, DeleteWorkRequestResponse>
                    handler);

    /**
     * Gets the log object config for log object OCID.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetLogResponse> getLog(
            GetLogRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetLogRequest, GetLogResponse> handler);

    /**
     * Get the specified log group's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetLogGroupResponse> getLogGroup(
            GetLogGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetLogGroupRequest, GetLogGroupResponse> handler);

    /**
     * Retrieves a LogIncludedSearch.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetLogIncludedSearchResponse> getLogIncludedSearch(
            GetLogIncludedSearchRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetLogIncludedSearchRequest, GetLogIncludedSearchResponse>
                    handler);

    /**
     * Retrieves a log saved search.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetLogSavedSearchResponse> getLogSavedSearch(
            GetLogSavedSearchRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetLogSavedSearchRequest, GetLogSavedSearchResponse>
                    handler);

    /**
     * Get unified agent configuration for an id
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetUnifiedAgentConfigurationResponse> getUnifiedAgentConfiguration(
            GetUnifiedAgentConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetUnifiedAgentConfigurationRequest,
                            GetUnifiedAgentConfigurationResponse>
                    handler);

    /**
     * Gets the details of the work request with the given ID.
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
     * Lists all log groups for the specified compartment or tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListLogGroupsResponse> listLogGroups(
            ListLogGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListLogGroupsRequest, ListLogGroupsResponse>
                    handler);

    /**
     * Lists Logging Included Searches for this compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListLogIncludedSearchesResponse> listLogIncludedSearches(
            ListLogIncludedSearchesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListLogIncludedSearchesRequest, ListLogIncludedSearchesResponse>
                    handler);

    /**
     * Lists Logging Saved Searches for this compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListLogSavedSearchesResponse> listLogSavedSearches(
            ListLogSavedSearchesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListLogSavedSearchesRequest, ListLogSavedSearchesResponse>
                    handler);

    /**
     * Lists the specified log group's log objects.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListLogsResponse> listLogs(
            ListLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListLogsRequest, ListLogsResponse> handler);

    /**
     * Lists all services supporting logging.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListServicesResponse> listServices(
            ListServicesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListServicesRequest, ListServicesResponse>
                    handler);

    /**
     * Lists all unified agent configurations in the specified compartment
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListUnifiedAgentConfigurationsResponse>
            listUnifiedAgentConfigurations(
                    ListUnifiedAgentConfigurationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListUnifiedAgentConfigurationsRequest,
                                    ListUnifiedAgentConfigurationsResponse>
                            handler);

    /**
     * Return a list of errors for a given work request.
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
     * Return a list of logs for a given work request.
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
     * Lists the work requests in a compartment.
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
     * Updates existing log object with the associated config. This call
     *       fails if log object does not exist.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateLogResponse> updateLog(
            UpdateLogRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateLogRequest, UpdateLogResponse> handler);

    /**
     * Updates existing log group with the associated config. This call
     *       fails if log group does not exist.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateLogGroupResponse> updateLogGroup(
            UpdateLogGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateLogGroupRequest, UpdateLogGroupResponse>
                    handler);

    /**
     * Updates an  existing log saved search.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateLogSavedSearchResponse> updateLogSavedSearch(
            UpdateLogSavedSearchRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateLogSavedSearchRequest, UpdateLogSavedSearchResponse>
                    handler);

    /**
     * Update an existing unified agent configuration. This call
     *       fails if log group does not exist.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateUnifiedAgentConfigurationResponse>
            updateUnifiedAgentConfiguration(
                    UpdateUnifiedAgentConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateUnifiedAgentConfigurationRequest,
                                    UpdateUnifiedAgentConfigurationResponse>
                            handler);
}
