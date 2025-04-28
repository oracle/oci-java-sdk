/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;

/**
 * Use the OS Management Hub API to manage and monitor updates and patches for instances in OCI,
 * your private data center, or 3rd-party clouds. For more information, see [Overview of OS
 * Management Hub](https://docs.oracle.com/iaas/osmh/doc/overview.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public interface ManagementStationAsync extends AutoCloseable {

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
     * Moves a managment station to a different compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeManagementStationCompartmentResponse>
            changeManagementStationCompartment(
                    ChangeManagementStationCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeManagementStationCompartmentRequest,
                                    ChangeManagementStationCompartmentResponse>
                            handler);

    /**
     * Creates a management station using the proxy and mirror configuration information provided.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateManagementStationResponse> createManagementStation(
            CreateManagementStationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateManagementStationRequest, CreateManagementStationResponse>
                    handler);

    /**
     * Deletes a management station. You can't delete a station if there are resources associated
     * with the station (such as instances using the station or profiles associated with the
     * station). Switch stations and edit profiles as needed before deleting the station.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteManagementStationResponse> deleteManagementStation(
            DeleteManagementStationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteManagementStationRequest, DeleteManagementStationResponse>
                    handler);

    /**
     * Returns information about the specified management station.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetManagementStationResponse> getManagementStation(
            GetManagementStationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetManagementStationRequest, GetManagementStationResponse>
                    handler);

    /**
     * Lists management stations within the specified compartment. Filter the list against a variety
     * of criteria including but not limited to name, status, and location.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagementStationsResponse> listManagementStations(
            ListManagementStationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListManagementStationsRequest, ListManagementStationsResponse>
                    handler);

    /**
     * Lists all software source mirrors associated with a specified management station.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListMirrorsResponse> listMirrors(
            ListMirrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListMirrorsRequest, ListMirrorsResponse> handler);

    /**
     * Refreshes the list of software sources mirrored by the management station.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RefreshManagementStationConfigResponse>
            refreshManagementStationConfig(
                    RefreshManagementStationConfigRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RefreshManagementStationConfigRequest,
                                    RefreshManagementStationConfigResponse>
                            handler);

    /**
     * Synchronize the specified software sources mirrored on the management station.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SynchronizeMirrorsResponse> synchronizeMirrors(
            SynchronizeMirrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SynchronizeMirrorsRequest, SynchronizeMirrorsResponse>
                    handler);

    /**
     * Synchronize the specified software source mirrors on the management station.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SynchronizeSingleMirrorsResponse> synchronizeSingleMirrors(
            SynchronizeSingleMirrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SynchronizeSingleMirrorsRequest, SynchronizeSingleMirrorsResponse>
                    handler);

    /**
     * Updates the configuration of the specified management station.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateManagementStationResponse> updateManagementStation(
            UpdateManagementStationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateManagementStationRequest, UpdateManagementStationResponse>
                    handler);
}
