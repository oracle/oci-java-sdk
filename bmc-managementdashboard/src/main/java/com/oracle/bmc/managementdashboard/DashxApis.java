/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementdashboard;

import com.oracle.bmc.managementdashboard.requests.*;
import com.oracle.bmc.managementdashboard.responses.*;

/**
 * API for the Management Dashboard micro-service. Use this API for dashboard and saved search metadata preservation and to perform  tasks such as creating a dashboard, creating a saved search, and obtaining a list of dashboards and saved searches in a compartment.
 *
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200901")
public interface DashxApis extends AutoCloseable {

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
     * Moves the dashboard from the existing compartment to a new compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeManagementDashboardsCompartmentResponse changeManagementDashboardsCompartment(
            ChangeManagementDashboardsCompartmentRequest request);

    /**
     * Moves the saved search from the existing compartment to a new compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeManagementSavedSearchesCompartmentResponse changeManagementSavedSearchesCompartment(
            ChangeManagementSavedSearchesCompartmentRequest request);

    /**
     * Creates a new dashboard.  Limit for number of saved searches in a dashboard is 20.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateManagementDashboardResponse createManagementDashboard(
            CreateManagementDashboardRequest request);

    /**
     * Creates a new saved search.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateManagementSavedSearchResponse createManagementSavedSearch(
            CreateManagementSavedSearchRequest request);

    /**
     * Deletes a Dashboard by ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteManagementDashboardResponse deleteManagementDashboard(
            DeleteManagementDashboardRequest request);

    /**
     * Deletes a saved search by ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteManagementSavedSearchResponse deleteManagementSavedSearch(
            DeleteManagementSavedSearchRequest request);

    /**
     * Exports an array of dashboards and their saved searches.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ExportDashboardResponse exportDashboard(ExportDashboardRequest request);

    /**
     * Gets a dashboard and its saved searches by ID.  Deleted or unauthorized saved searches are marked by tile's state property.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetManagementDashboardResponse getManagementDashboard(GetManagementDashboardRequest request);

    /**
     * Gets a saved search by ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetManagementSavedSearchResponse getManagementSavedSearch(
            GetManagementSavedSearchRequest request);

    /**
     * Imports an array of dashboards and their saved searches.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ImportDashboardResponse importDashboard(ImportDashboardRequest request);

    /**
     * Gets the list of dashboards and their saved searches in a compartment with pagination.  Returned properties are the summary.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListManagementDashboardsResponse listManagementDashboards(
            ListManagementDashboardsRequest request);

    /**
     * Gets the list of saved searches in a compartment with pagination.  Returned properties are the summary.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListManagementSavedSearchesResponse listManagementSavedSearches(
            ListManagementSavedSearchesRequest request);

    /**
     * Updates an existing dashboard identified by ID path parameter.  CompartmentId can be modified only by the changeCompartment API. Limit for number of saved searches in a dashboard is 20.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateManagementDashboardResponse updateManagementDashboard(
            UpdateManagementDashboardRequest request);

    /**
     * Updates an existing saved search identified by ID path parameter.  CompartmentId can be modified only by the changeCompartment API.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateManagementSavedSearchResponse updateManagementSavedSearch(
            UpdateManagementSavedSearchRequest request);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DashxApisPaginators getPaginators();
}
