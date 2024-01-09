/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementdashboard;

import com.oracle.bmc.managementdashboard.requests.*;
import com.oracle.bmc.managementdashboard.responses.*;

/**
 * API for the Management Dashboard micro-service. Use this API for dashboard and saved search
 * metadata preservation and to perform tasks such as creating a dashboard, creating a saved search,
 * and obtaining a list of dashboards and saved searches in a compartment.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200901")
public interface DashxApisAsync extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this region, however, an
     * IllegalArgumentException will be raised.
     *
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     *
     * <p>Note, this will first try to map the region ID to a known Region and call {@link
     * #setRegion(Region) setRegion}.
     *
     * <p>If no known Region could be determined, it will create an endpoint based on the default
     * endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     *
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Determines whether realm specific endpoint should be used or not. Set
     * realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm
     * specific endpoint template, otherwise set it to "false"
     *
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint
     *     template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Moves the dashboard from the existing compartment to a new compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeManagementDashboardsCompartmentResponse>
            changeManagementDashboardsCompartment(
                    ChangeManagementDashboardsCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeManagementDashboardsCompartmentRequest,
                                    ChangeManagementDashboardsCompartmentResponse>
                            handler);

    /**
     * Moves the saved search from the existing compartment to a new compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeManagementSavedSearchesCompartmentResponse>
            changeManagementSavedSearchesCompartment(
                    ChangeManagementSavedSearchesCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeManagementSavedSearchesCompartmentRequest,
                                    ChangeManagementSavedSearchesCompartmentResponse>
                            handler);

    /**
     * Creates a new dashboard. Limit for number of saved searches in a dashboard is 20. Here's an
     * example of how you can use CLI to create a dashboard. For information on the details that
     * must be passed to CREATE, you can use the GET API to obtain the Create.json file: `oci
     * management-dashboard dashboard get --management-dashboard-id
     * \"ocid1.managementdashboard.oc1..dashboardId1\" --query data > Create.json.` You can then
     * modify the Create.json file by removing the `id` attribute and making other required changes,
     * and use the `oci management-dashboard dashboard create` command.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateManagementDashboardResponse> createManagementDashboard(
            CreateManagementDashboardRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateManagementDashboardRequest, CreateManagementDashboardResponse>
                    handler);

    /**
     * Creates a new saved search. Here's an example of how you can use CLI to create a saved
     * search. For information on the details that must be passed to CREATE, you can use the GET API
     * to obtain the Create.json file: `oci management-dashboard saved-search get
     * --management-saved-search-id ocid1.managementsavedsearch.oc1..savedsearchId1 --query data >
     * Create.json`. You can then modify the Create.json file by removing the `id` attribute and
     * making other required changes, and use the `oci management-dashboard saved-search create`
     * command.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateManagementSavedSearchResponse> createManagementSavedSearch(
            CreateManagementSavedSearchRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateManagementSavedSearchRequest, CreateManagementSavedSearchResponse>
                    handler);

    /**
     * Deletes a Dashboard by ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteManagementDashboardResponse> deleteManagementDashboard(
            DeleteManagementDashboardRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteManagementDashboardRequest, DeleteManagementDashboardResponse>
                    handler);

    /**
     * Deletes a saved search by ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteManagementSavedSearchResponse> deleteManagementSavedSearch(
            DeleteManagementSavedSearchRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteManagementSavedSearchRequest, DeleteManagementSavedSearchResponse>
                    handler);

    /**
     * Exports an array of dashboards and their saved searches. Export is designed to work with
     * importDashboard. Here's an example of how you can use CLI to export a dashboard: `$oci
     * management-dashboard dashboard export --query data --export-dashboard-id
     * \"{\\\"dashboardIds\\\":[\\\"ocid1.managementdashboard.oc1..dashboardId1\\\"]}\" >
     * dashboards.json`
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ExportDashboardResponse> exportDashboard(
            ExportDashboardRequest request,
            com.oracle.bmc.responses.AsyncHandler<ExportDashboardRequest, ExportDashboardResponse>
                    handler);

    /**
     * Gets a dashboard and its saved searches by ID. Deleted or unauthorized saved searches are
     * marked by tile's state property.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetManagementDashboardResponse> getManagementDashboard(
            GetManagementDashboardRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetManagementDashboardRequest, GetManagementDashboardResponse>
                    handler);

    /**
     * Gets a saved search by ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetManagementSavedSearchResponse> getManagementSavedSearch(
            GetManagementSavedSearchRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetManagementSavedSearchRequest, GetManagementSavedSearchResponse>
                    handler);

    /**
     * Imports an array of dashboards and their saved searches. Here's an example of how you can use
     * CLI to import a dashboard. For information on the details that must be passed to IMPORT, you
     * can use the EXPORT API to obtain the Import.json file: `oci management-dashboard dashboard
     * export --query data --export-dashboard-id
     * \"{\\\"dashboardIds\\\":[\\\"ocid1.managementdashboard.oc1..dashboardId1\\\"]}\" >
     * Import.json`. Note that import API updates the resource if it already exists, and creates a
     * new resource if it does not exist. To import to a different compartment, edit and change the
     * compartmentId to the desired compartment OCID. Here's an example of how you can use CLI to
     * import: `oci management-dashboard dashboard import --from-json file://Import.json`
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ImportDashboardResponse> importDashboard(
            ImportDashboardRequest request,
            com.oracle.bmc.responses.AsyncHandler<ImportDashboardRequest, ImportDashboardResponse>
                    handler);

    /**
     * Gets the list of dashboards in a compartment with pagination. Returned properties are the
     * summary.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagementDashboardsResponse> listManagementDashboards(
            ListManagementDashboardsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListManagementDashboardsRequest, ListManagementDashboardsResponse>
                    handler);

    /**
     * Gets the list of saved searches in a compartment with pagination. Returned properties are the
     * summary.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagementSavedSearchesResponse> listManagementSavedSearches(
            ListManagementSavedSearchesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListManagementSavedSearchesRequest, ListManagementSavedSearchesResponse>
                    handler);

    /**
     * Updates an existing dashboard identified by ID path parameter. CompartmentId can be modified
     * only by the changeCompartment API. Limit for number of saved searches in a dashboard is 20.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateManagementDashboardResponse> updateManagementDashboard(
            UpdateManagementDashboardRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateManagementDashboardRequest, UpdateManagementDashboardResponse>
                    handler);

    /**
     * Updates an existing saved search identified by ID path parameter. CompartmentId can be
     * modified only by the changeCompartment API.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateManagementSavedSearchResponse> updateManagementSavedSearch(
            UpdateManagementSavedSearchRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateManagementSavedSearchRequest, UpdateManagementSavedSearchResponse>
                    handler);
}
