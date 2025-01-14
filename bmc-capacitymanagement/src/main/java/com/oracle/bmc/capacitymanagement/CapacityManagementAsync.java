/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement;

import com.oracle.bmc.capacitymanagement.requests.*;
import com.oracle.bmc.capacitymanagement.responses.*;

/**
 * OCI Control Center (OCC) Capacity Management enables you to manage capacity requests in realms
 * where OCI Control Center Capacity Management is available. For more information, see [OCI Control
 * Center](https://docs.cloud.oracle.com/iaas/Content/control-center/home.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
public interface CapacityManagementAsync extends AutoCloseable {

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
     * Create availability catalog
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOccAvailabilityCatalogResponse> createOccAvailabilityCatalog(
            CreateOccAvailabilityCatalogRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateOccAvailabilityCatalogRequest,
                            CreateOccAvailabilityCatalogResponse>
                    handler);

    /**
     * Create Capacity Request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOccCapacityRequestResponse> createOccCapacityRequest(
            CreateOccCapacityRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateOccCapacityRequestRequest, CreateOccCapacityRequestResponse>
                    handler);

    /**
     * Create customer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOccCustomerResponse> createOccCustomer(
            CreateOccCustomerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateOccCustomerRequest, CreateOccCustomerResponse>
                    handler);

    /**
     * Create customer group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOccCustomerGroupResponse> createOccCustomerGroup(
            CreateOccCustomerGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateOccCustomerGroupRequest, CreateOccCustomerGroupResponse>
                    handler);

    /**
     * Deletes the availability catalog resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOccAvailabilityCatalogResponse> deleteOccAvailabilityCatalog(
            DeleteOccAvailabilityCatalogRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteOccAvailabilityCatalogRequest,
                            DeleteOccAvailabilityCatalogResponse>
                    handler);

    /**
     * Deletes the capacity request resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOccCapacityRequestResponse> deleteOccCapacityRequest(
            DeleteOccCapacityRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteOccCapacityRequestRequest, DeleteOccCapacityRequestResponse>
                    handler);

    /**
     * Deletes the customer resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOccCustomerResponse> deleteOccCustomer(
            DeleteOccCustomerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteOccCustomerRequest, DeleteOccCustomerResponse>
                    handler);

    /**
     * Deletes the customer group resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOccCustomerGroupResponse> deleteOccCustomerGroup(
            DeleteOccCustomerGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteOccCustomerGroupRequest, DeleteOccCustomerGroupResponse>
                    handler);

    /**
     * Get details about availability catalog.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOccAvailabilityCatalogResponse> getOccAvailabilityCatalog(
            GetOccAvailabilityCatalogRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetOccAvailabilityCatalogRequest, GetOccAvailabilityCatalogResponse>
                    handler);

    /**
     * Returns the binary contents of the availability catalog. Can be saved as a csv file.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOccAvailabilityCatalogContentResponse>
            getOccAvailabilityCatalogContent(
                    GetOccAvailabilityCatalogContentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetOccAvailabilityCatalogContentRequest,
                                    GetOccAvailabilityCatalogContentResponse>
                            handler);

    /**
     * Get details about the capacity request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOccCapacityRequestResponse> getOccCapacityRequest(
            GetOccCapacityRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetOccCapacityRequestRequest, GetOccCapacityRequestResponse>
                    handler);

    /**
     * Gets information about the specified customer group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOccCustomerGroupResponse> getOccCustomerGroup(
            GetOccCustomerGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetOccCustomerGroupRequest, GetOccCustomerGroupResponse>
                    handler);

    /**
     * Lists an overview of all resources in that namespace in a given time interval.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListInternalNamespaceOccOverviewsResponse>
            listInternalNamespaceOccOverviews(
                    ListInternalNamespaceOccOverviewsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListInternalNamespaceOccOverviewsRequest,
                                    ListInternalNamespaceOccOverviewsResponse>
                            handler);

    /**
     * List details about a given occHandoverResourceBlock.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListInternalOccHandoverResourceBlockDetailsResponse>
            listInternalOccHandoverResourceBlockDetails(
                    ListInternalOccHandoverResourceBlockDetailsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListInternalOccHandoverResourceBlockDetailsRequest,
                                    ListInternalOccHandoverResourceBlockDetailsResponse>
                            handler);

    /**
     * List Occ Handover Resource blocks.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListInternalOccHandoverResourceBlocksResponse>
            listInternalOccHandoverResourceBlocks(
                    ListInternalOccHandoverResourceBlocksRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListInternalOccHandoverResourceBlocksRequest,
                                    ListInternalOccHandoverResourceBlocksResponse>
                            handler);

    /**
     * Lists availabilities for a particular availability catalog.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOccAvailabilitiesResponse> listOccAvailabilities(
            ListOccAvailabilitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListOccAvailabilitiesRequest, ListOccAvailabilitiesResponse>
                    handler);

    /**
     * Lists all availability catalogs.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOccAvailabilityCatalogsResponse> listOccAvailabilityCatalogs(
            ListOccAvailabilityCatalogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListOccAvailabilityCatalogsRequest, ListOccAvailabilityCatalogsResponse>
                    handler);

    /**
     * An internal api to list availability catalogs.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOccAvailabilityCatalogsInternalResponse>
            listOccAvailabilityCatalogsInternal(
                    ListOccAvailabilityCatalogsInternalRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListOccAvailabilityCatalogsInternalRequest,
                                    ListOccAvailabilityCatalogsInternalResponse>
                            handler);

    /**
     * Lists all capacity requests.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOccCapacityRequestsResponse> listOccCapacityRequests(
            ListOccCapacityRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListOccCapacityRequestsRequest, ListOccCapacityRequestsResponse>
                    handler);

    /**
     * An internal api to list all capacity requests.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOccCapacityRequestsInternalResponse>
            listOccCapacityRequestsInternal(
                    ListOccCapacityRequestsInternalRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListOccCapacityRequestsInternalRequest,
                                    ListOccCapacityRequestsInternalResponse>
                            handler);

    /**
     * Lists all the customer groups.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOccCustomerGroupsResponse> listOccCustomerGroups(
            ListOccCustomerGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListOccCustomerGroupsRequest, ListOccCustomerGroupsResponse>
                    handler);

    /**
     * List details about a given occHandoverResourceBlock.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOccHandoverResourceBlockDetailsResponse>
            listOccHandoverResourceBlockDetails(
                    ListOccHandoverResourceBlockDetailsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListOccHandoverResourceBlockDetailsRequest,
                                    ListOccHandoverResourceBlockDetailsResponse>
                            handler);

    /**
     * List Occ Handover Resource blocks.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOccHandoverResourceBlocksResponse>
            listOccHandoverResourceBlocks(
                    ListOccHandoverResourceBlocksRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListOccHandoverResourceBlocksRequest,
                                    ListOccHandoverResourceBlocksResponse>
                            handler);

    /**
     * Lists an overview of all resources in that namespace in a given time interval.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOccOverviewsResponse> listOccOverviews(
            ListOccOverviewsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListOccOverviewsRequest, ListOccOverviewsResponse>
                    handler);

    /**
     * Updates the OccCapacityRequest by evaluating a sequence of instructions.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PatchInternalOccCapacityRequestResponse>
            patchInternalOccCapacityRequest(
                    PatchInternalOccCapacityRequestRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    PatchInternalOccCapacityRequestRequest,
                                    PatchInternalOccCapacityRequestResponse>
                            handler);

    /**
     * Updates the OccCapacityRequest by evaluating a sequence of instructions.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PatchOccCapacityRequestResponse> patchOccCapacityRequest(
            PatchOccCapacityRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            PatchOccCapacityRequestRequest, PatchOccCapacityRequestResponse>
                    handler);

    /**
     * Publishes the version of availability catalog specified by the operator. This makes that
     * catalog version visible to customers.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PublishOccAvailabilityCatalogResponse>
            publishOccAvailabilityCatalog(
                    PublishOccAvailabilityCatalogRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    PublishOccAvailabilityCatalogRequest,
                                    PublishOccAvailabilityCatalogResponse>
                            handler);

    /**
     * The internal api to update the capacity request. This api will be used by operators for
     * updating the capacity request to either completed, resubmitted or rejected.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateInternalOccCapacityRequestResponse>
            updateInternalOccCapacityRequest(
                    UpdateInternalOccCapacityRequestRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateInternalOccCapacityRequestRequest,
                                    UpdateInternalOccCapacityRequestResponse>
                            handler);

    /**
     * The request to update the availability catalog. Currently only freeform tags can be updated
     * via this api.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOccAvailabilityCatalogResponse> updateOccAvailabilityCatalog(
            UpdateOccAvailabilityCatalogRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateOccAvailabilityCatalogRequest,
                            UpdateOccAvailabilityCatalogResponse>
                    handler);

    /**
     * The request to update the capacity request. The user can perform actions like closing a
     * partially completed request so that it doesn't go ahead for full completion.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOccCapacityRequestResponse> updateOccCapacityRequest(
            UpdateOccCapacityRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateOccCapacityRequestRequest, UpdateOccCapacityRequestResponse>
                    handler);

    /**
     * The request to update the customer.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOccCustomerResponse> updateOccCustomer(
            UpdateOccCustomerRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateOccCustomerRequest, UpdateOccCustomerResponse>
                    handler);

    /**
     * The request to update the customer group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOccCustomerGroupResponse> updateOccCustomerGroup(
            UpdateOccCustomerGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateOccCustomerGroupRequest, UpdateOccCustomerGroupResponse>
                    handler);
}
