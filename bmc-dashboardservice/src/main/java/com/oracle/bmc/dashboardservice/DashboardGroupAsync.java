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
public interface DashboardGroupAsync extends AutoCloseable {

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
     * Moves a DashboardGroup resource from one compartment identifier to another. When provided,
     * If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDashboardGroupCompartmentResponse>
            changeDashboardGroupCompartment(
                    ChangeDashboardGroupCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDashboardGroupCompartmentRequest,
                                    ChangeDashboardGroupCompartmentResponse>
                            handler);

    /**
     * Creates a new dashboard group using the details provided in request body.
     *
     * <p>*Caution:** Resources for the Dashboard service are created in the tenacy's home region.
     * Although it is possible to create dashboard group resource in regions other than the home
     * region, you won't be able to view those resources in the Console. Therefore, creating
     * resources outside of the home region is not recommended.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDashboardGroupResponse> createDashboardGroup(
            CreateDashboardGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDashboardGroupRequest, CreateDashboardGroupResponse>
                    handler);

    /**
     * Deletes the specified dashboard group. Uses the dashboard group's OCID to determine which
     * dashboard group to delete.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDashboardGroupResponse> deleteDashboardGroup(
            DeleteDashboardGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDashboardGroupRequest, DeleteDashboardGroupResponse>
                    handler);

    /**
     * Gets the specified dashboard group's information. Uses the dashboard group's OCID to
     * determine which dashboard to retrieve.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDashboardGroupResponse> getDashboardGroup(
            GetDashboardGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDashboardGroupRequest, GetDashboardGroupResponse>
                    handler);

    /**
     * Returns a list of dashboard groups with a specific compartment ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDashboardGroupsResponse> listDashboardGroups(
            ListDashboardGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDashboardGroupsRequest, ListDashboardGroupsResponse>
                    handler);

    /**
     * Updates the specified dashboard group. Uses the dashboard group's OCID to determine which
     * dashboard group to update.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDashboardGroupResponse> updateDashboardGroup(
            UpdateDashboardGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDashboardGroupRequest, UpdateDashboardGroupResponse>
                    handler);
}
