/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dashboardservice;

import com.oracle.bmc.dashboardservice.requests.*;
import com.oracle.bmc.dashboardservice.responses.*;

/**
 * Use the Oracle Cloud Infrastructure Dashboards service API to manage dashboards in the Console.
 * Dashboards provide an organized and customizable view of resources and their metrics in the
 * Console. For more information, see
 * [Dashboards](https://docs.oracle.com/iaas/Content/Dashboards/home.htm).
 *
 * <p>*Important:** Resources for the Dashboards service are created in the tenacy's home region.
 * Although it is possible to create dashboard and dashboard group resources in regions other than
 * the home region, you won't be able to view those resources in the Console. Therefore, creating
 * resources outside of the home region is not recommended.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210731")
public interface DashboardAsync extends AutoCloseable {

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
     * Moves a Dashboard resource from one dashboardGroup identifier to another. When provided,
     * If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDashboardGroupResponse> changeDashboardGroup(
            ChangeDashboardGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeDashboardGroupRequest, ChangeDashboardGroupResponse>
                    handler);

    /**
     * Creates a new dashboard in the dashboard group's compartment using the details provided in
     * request body.
     *
     * <p>*Caution:** Resources for the Dashboard service are created in the tenacy's home region.
     * Although it is possible to create dashboard resource in regions other than the home region,
     * you won't be able to view those resources in the Console. Therefore, creating resources
     * outside of the home region is not recommended.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDashboardResponse> createDashboard(
            CreateDashboardRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateDashboardRequest, CreateDashboardResponse>
                    handler);

    /**
     * Deletes the specified dashboard. Uses the dashboard's OCID to determine which dashboard to
     * delete.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDashboardResponse> deleteDashboard(
            DeleteDashboardRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteDashboardRequest, DeleteDashboardResponse>
                    handler);

    /**
     * Gets the specified dashboard's information. Uses the dashboard's OCID to determine which
     * dashboard to retrieve.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDashboardResponse> getDashboard(
            GetDashboardRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDashboardRequest, GetDashboardResponse>
                    handler);

    /**
     * Returns a list of dashboards with a specific dashboard group ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDashboardsResponse> listDashboards(
            ListDashboardsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDashboardsRequest, ListDashboardsResponse>
                    handler);

    /**
     * Updates the specified dashboard. Uses the dashboard's OCID to determine which dashboard to
     * update.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDashboardResponse> updateDashboard(
            UpdateDashboardRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateDashboardRequest, UpdateDashboardResponse>
                    handler);
}
