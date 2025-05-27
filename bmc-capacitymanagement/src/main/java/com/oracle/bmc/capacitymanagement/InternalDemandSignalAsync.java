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
public interface InternalDemandSignalAsync extends AutoCloseable {

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
     * This is a post API which is used to create a demand signal delivery resource. operationId:
     * CreateInternalOccmDemandSignalDelivery summary: A post call to create a demand signal
     * delivery.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateInternalOccmDemandSignalDeliveryResponse>
            createInternalOccmDemandSignalDelivery(
                    CreateInternalOccmDemandSignalDeliveryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateInternalOccmDemandSignalDeliveryRequest,
                                    CreateInternalOccmDemandSignalDeliveryResponse>
                            handler);

    /**
     * This is an internal DELETE API which is used to delete a demand signal delivery resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteInternalOccmDemandSignalDeliveryResponse>
            deleteInternalOccmDemandSignalDelivery(
                    DeleteInternalOccmDemandSignalDeliveryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteInternalOccmDemandSignalDeliveryRequest,
                                    DeleteInternalOccmDemandSignalDeliveryResponse>
                            handler);

    /**
     * This is an internal GET API which gets the detailed information about a specific demand
     * signal.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetInternalOccmDemandSignalResponse> getInternalOccmDemandSignal(
            GetInternalOccmDemandSignalRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetInternalOccmDemandSignalRequest, GetInternalOccmDemandSignalResponse>
                    handler);

    /**
     * This API helps in getting the details about a specific occm demand signal catalog.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetInternalOccmDemandSignalCatalogResponse>
            getInternalOccmDemandSignalCatalog(
                    GetInternalOccmDemandSignalCatalogRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetInternalOccmDemandSignalCatalogRequest,
                                    GetInternalOccmDemandSignalCatalogResponse>
                            handler);

    /**
     * This is an internal GET API to get the details of a demand signal delivery resource
     * corresponding to a demand signal item.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetInternalOccmDemandSignalDeliveryResponse>
            getInternalOccmDemandSignalDelivery(
                    GetInternalOccmDemandSignalDeliveryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetInternalOccmDemandSignalDeliveryRequest,
                                    GetInternalOccmDemandSignalDeliveryResponse>
                            handler);

    /**
     * This API will list all the resources across all demand signal catalogs for a given namespace
     * and customer group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListInternalOccmDemandSignalCatalogResourcesResponse>
            listInternalOccmDemandSignalCatalogResources(
                    ListInternalOccmDemandSignalCatalogResourcesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListInternalOccmDemandSignalCatalogResourcesRequest,
                                    ListInternalOccmDemandSignalCatalogResourcesResponse>
                            handler);

    /**
     * This API will list demand signal catalogs for a given customer group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListInternalOccmDemandSignalCatalogsResponse>
            listInternalOccmDemandSignalCatalogs(
                    ListInternalOccmDemandSignalCatalogsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListInternalOccmDemandSignalCatalogsRequest,
                                    ListInternalOccmDemandSignalCatalogsResponse>
                            handler);

    /**
     * This GET call is used to list all demand signal delivery resources within the customer group
     * passed as a query parameter.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListInternalOccmDemandSignalDeliveriesResponse>
            listInternalOccmDemandSignalDeliveries(
                    ListInternalOccmDemandSignalDeliveriesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListInternalOccmDemandSignalDeliveriesRequest,
                                    ListInternalOccmDemandSignalDeliveriesResponse>
                            handler);

    /**
     * This internal API will list the detailed information about the resources demanded as part of
     * the demand signal.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListInternalOccmDemandSignalItemsResponse>
            listInternalOccmDemandSignalItems(
                    ListInternalOccmDemandSignalItemsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListInternalOccmDemandSignalItemsRequest,
                                    ListInternalOccmDemandSignalItemsResponse>
                            handler);

    /**
     * This is an internal GET call is used to list all demand signals within the compartment passed
     * as a query parameter.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListInternalOccmDemandSignalsResponse>
            listInternalOccmDemandSignals(
                    ListInternalOccmDemandSignalsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListInternalOccmDemandSignalsRequest,
                                    ListInternalOccmDemandSignalsResponse>
                            handler);

    /**
     * This is a internal PUT API which shall be used to update the metadata of the demand signal.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateInternalOccmDemandSignalResponse>
            updateInternalOccmDemandSignal(
                    UpdateInternalOccmDemandSignalRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateInternalOccmDemandSignalRequest,
                                    UpdateInternalOccmDemandSignalResponse>
                            handler);

    /**
     * This is an internal PUT API which is used to update the demand signal delivery resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateInternalOccmDemandSignalDeliveryResponse>
            updateInternalOccmDemandSignalDelivery(
                    UpdateInternalOccmDemandSignalDeliveryRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateInternalOccmDemandSignalDeliveryRequest,
                                    UpdateInternalOccmDemandSignalDeliveryResponse>
                            handler);
}
