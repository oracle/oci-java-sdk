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
 * Center](https://docs.oracle.com/iaas/Content/control-center/home.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
public interface DemandSignalAsync extends AutoCloseable {

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
     * This API will help in bulk creation of demand signal items. This API is atomic i.e either all
     * the demand signal item resources will be created or none will be created.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BulkCreateOccmDemandSignalItemResponse>
            bulkCreateOccmDemandSignalItem(
                    BulkCreateOccmDemandSignalItemRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    BulkCreateOccmDemandSignalItemRequest,
                                    BulkCreateOccmDemandSignalItemResponse>
                            handler);

    /**
     * This is a post API to create occm demand signal.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOccmDemandSignalResponse> createOccmDemandSignal(
            CreateOccmDemandSignalRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateOccmDemandSignalRequest, CreateOccmDemandSignalResponse>
                    handler);

    /**
     * This API will create a demand signal item representing a resource request. This needs to be
     * grouped under a demand signal.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOccmDemandSignalItemResponse> createOccmDemandSignalItem(
            CreateOccmDemandSignalItemRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateOccmDemandSignalItemRequest, CreateOccmDemandSignalItemResponse>
                    handler);

    /**
     * This is a DELETE API which deletes a demand signal with the provided demand signal ocid.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOccmDemandSignalResponse> deleteOccmDemandSignal(
            DeleteOccmDemandSignalRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteOccmDemandSignalRequest, DeleteOccmDemandSignalResponse>
                    handler);

    /**
     * This is a DELETE API which deletes a demand signal item with the provided demand signal item
     * ocid.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOccmDemandSignalItemResponse> deleteOccmDemandSignalItem(
            DeleteOccmDemandSignalItemRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteOccmDemandSignalItemRequest, DeleteOccmDemandSignalItemResponse>
                    handler);

    /**
     * This is a GET API which gets the detailed information about a specific demand signal.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOccmDemandSignalResponse> getOccmDemandSignal(
            GetOccmDemandSignalRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetOccmDemandSignalRequest, GetOccmDemandSignalResponse>
                    handler);

    /**
     * This is a GET API to get the details of a demand signal item resource representing the
     * details of the resource demanded by you.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOccmDemandSignalItemResponse> getOccmDemandSignalItem(
            GetOccmDemandSignalItemRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetOccmDemandSignalItemRequest, GetOccmDemandSignalItemResponse>
                    handler);

    /**
     * This API will list all the resources across all demand signal catalogs for a given namespace
     * and customer group containing the caller compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOccmDemandSignalCatalogResourcesResponse>
            listOccmDemandSignalCatalogResources(
                    ListOccmDemandSignalCatalogResourcesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListOccmDemandSignalCatalogResourcesRequest,
                                    ListOccmDemandSignalCatalogResourcesResponse>
                            handler);

    /**
     * This GET call is used to list all demand signals delivery resources within the compartment
     * passed as a query param.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOccmDemandSignalDeliveriesResponse>
            listOccmDemandSignalDeliveries(
                    ListOccmDemandSignalDeliveriesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListOccmDemandSignalDeliveriesRequest,
                                    ListOccmDemandSignalDeliveriesResponse>
                            handler);

    /**
     * This API will list the detailed information about the resources demanded as part of the
     * demand signal.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOccmDemandSignalItemsResponse> listOccmDemandSignalItems(
            ListOccmDemandSignalItemsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListOccmDemandSignalItemsRequest, ListOccmDemandSignalItemsResponse>
                    handler);

    /**
     * This GET call is used to list all demand signals within the compartment passed as a query
     * parameter.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOccmDemandSignalsResponse> listOccmDemandSignals(
            ListOccmDemandSignalsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListOccmDemandSignalsRequest, ListOccmDemandSignalsResponse>
                    handler);

    /**
     * This is a PUT API which shall be used to update the metadata of the demand signal.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOccmDemandSignalResponse> updateOccmDemandSignal(
            UpdateOccmDemandSignalRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateOccmDemandSignalRequest, UpdateOccmDemandSignalResponse>
                    handler);

    /**
     * This is a PUT API which can be used to update the demand signal item resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOccmDemandSignalItemResponse> updateOccmDemandSignalItem(
            UpdateOccmDemandSignalItemRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateOccmDemandSignalItemRequest, UpdateOccmDemandSignalItemResponse>
                    handler);
}
