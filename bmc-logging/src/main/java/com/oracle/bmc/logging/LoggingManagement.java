/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging;

import com.oracle.bmc.logging.requests.*;
import com.oracle.bmc.logging.responses.*;

/**
 * Use the Logging Management API to create, read, list, update, and delete log groups, log objects, and agent configurations.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
public interface LoggingManagement extends AutoCloseable {

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
     * Moves a log group into a different compartment within the same tenancy.  When provided, the If-Match is checked against the resource ETag values.
     * For information about moving resources between compartments, see [Moving Resources Between Compartments](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeLogGroupCompartmentResponse changeLogGroupCompartment(
            ChangeLogGroupCompartmentRequest request);

    /**
     * Moves a log into a different log group within the same tenancy.  When provided, the If-Match is checked against the ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeLogLogGroupResponse changeLogLogGroup(ChangeLogLogGroupRequest request);

    /**
     * Moves a saved search into a different compartment within the same tenancy. For information about moving
     * resources between compartments, see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeLogSavedSearchCompartmentResponse changeLogSavedSearchCompartment(
            ChangeLogSavedSearchCompartmentRequest request);

    /**
     * Moves the unified agent configuration into a different compartment within the same tenancy.  When provided, the If-Match is checked against the ETag values of the resource.
     * For information about moving resources between compartments, see [Moving Resources Between Compartments](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeUnifiedAgentConfigurationCompartmentResponse changeUnifiedAgentConfigurationCompartment(
            ChangeUnifiedAgentConfigurationCompartmentRequest request);

    /**
     * Creates a log within the specified log group. This call fails if a log group has already been created
     * with the same displayName or (service, resource, category) triplet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateLogResponse createLog(CreateLogRequest request);

    /**
     * Create a new log group with a unique display name. This call fails
     * if the log group is already created with the same displayName in the compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateLogGroupResponse createLogGroup(CreateLogGroupRequest request);

    /**
     * Creates a new LogSavedSearch.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateLogSavedSearchResponse createLogSavedSearch(CreateLogSavedSearchRequest request);

    /**
     * Create unified agent configuration registration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateUnifiedAgentConfigurationResponse createUnifiedAgentConfiguration(
            CreateUnifiedAgentConfigurationRequest request);

    /**
     * Deletes the log object in a log group.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteLogResponse deleteLog(DeleteLogRequest request);

    /**
     * Deletes the specified log group.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteLogGroupResponse deleteLogGroup(DeleteLogGroupRequest request);

    /**
     * Deletes the specified log saved search.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteLogSavedSearchResponse deleteLogSavedSearch(DeleteLogSavedSearchRequest request);

    /**
     * Delete unified agent configuration.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteUnifiedAgentConfigurationResponse deleteUnifiedAgentConfiguration(
            DeleteUnifiedAgentConfigurationRequest request);

    /**
     * Cancel a work request that has not started yet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteWorkRequestResponse deleteWorkRequest(DeleteWorkRequestRequest request);

    /**
     * Gets the log object configuration for the log object OCID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetLogResponse getLog(GetLogRequest request);

    /**
     * Get the specified log group's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetLogGroupResponse getLogGroup(GetLogGroupRequest request);

    /**
     * Retrieves a LogIncludedSearch.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetLogIncludedSearchResponse getLogIncludedSearch(GetLogIncludedSearchRequest request);

    /**
     * Retrieves a log saved search.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetLogSavedSearchResponse getLogSavedSearch(GetLogSavedSearchRequest request);

    /**
     * Get the unified agent configuration for an ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetUnifiedAgentConfigurationResponse getUnifiedAgentConfiguration(
            GetUnifiedAgentConfigurationRequest request);

    /**
     * Gets the details of the work request with the given ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Lists all log groups for the specified compartment or tenancy.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListLogGroupsResponse listLogGroups(ListLogGroupsRequest request);

    /**
     * Lists Logging Included Searches for this compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListLogIncludedSearchesResponse listLogIncludedSearches(ListLogIncludedSearchesRequest request);

    /**
     * Lists Logging Saved Searches for this compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListLogSavedSearchesResponse listLogSavedSearches(ListLogSavedSearchesRequest request);

    /**
     * Lists the specified log group's log objects.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListLogsResponse listLogs(ListLogsRequest request);

    /**
     * Lists all services that support logging.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListServicesResponse listServices(ListServicesRequest request);

    /**
     * Lists all unified agent configurations in the specified compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListUnifiedAgentConfigurationsResponse listUnifiedAgentConfigurations(
            ListUnifiedAgentConfigurationsRequest request);

    /**
     * Return a list of errors for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Return a list of logs for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Updates the existing log object with the associated configuration. This call
     *       fails if the log object does not exist.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateLogResponse updateLog(UpdateLogRequest request);

    /**
     * Updates the existing log group with the associated configuration. This call
     *       fails if the log group does not exist.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateLogGroupResponse updateLogGroup(UpdateLogGroupRequest request);

    /**
     * Updates an  existing log saved search.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateLogSavedSearchResponse updateLogSavedSearch(UpdateLogSavedSearchRequest request);

    /**
     * Update an existing unified agent configuration. This call
     *       fails if the log group does not exist.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateUnifiedAgentConfigurationResponse updateUnifiedAgentConfiguration(
            UpdateUnifiedAgentConfigurationRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    LoggingManagementWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    LoggingManagementPaginators getPaginators();
}
