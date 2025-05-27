/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.capacitymanagement.requests.*;
import com.oracle.bmc.capacitymanagement.responses.*;

import java.util.Objects;

/**
 * Async client implementation for DemandSignal service. <br>
 * There are two ways to use async client: 1. Use AsyncHandler: using AsyncHandler, if the response
 * to the call is an {@link java.io.InputStream}, like getObject Api in object storage service,
 * developers need to process the stream in AsyncHandler, and not anywhere else, because the stream
 * will be closed right after the AsyncHandler is invoked. <br>
 * 2. Use Java Future: using Java Future, developers need to close the stream after they are done
 * with the Java Future.<br>
 * Accessing the result should be done in a mutually exclusive manner, either through the Future or
 * the AsyncHandler, but not both. If the Future is used, the caller should pass in null as the
 * AsyncHandler. If the AsyncHandler is used, it is still safe to use the Future to determine
 * whether or not the request was completed via Future.isDone/isCancelled.<br>
 * Please refer to
 * https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ResteasyClientWithObjectStorageExample.java
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
public class DemandSignalAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DemandSignalAsync {
    /** Service instance for DemandSignal. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DEMANDSIGNAL")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://control-center-cp.{region}.oci.{secondLevelDomain}")
                    .endpointServiceName("control-center-cp")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DemandSignalAsyncClient.class);

    DemandSignalAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(builder, authenticationDetailsProvider);
    }

    /**
     * Create a builder for this client.
     *
     * @return builder
     */
    public static Builder builder() {
        return new Builder(SERVICE);
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be
     * passed to the {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DemandSignalAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "capacitymanagement";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public DemandSignalAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DemandSignalAsyncClient(this, authenticationDetailsProvider);
        }
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        super.setRegion(region);
    }

    @Override
    public void setRegion(String regionId) {
        super.setRegion(regionId);
    }

    @Override
    public java.util.concurrent.Future<BulkCreateOccmDemandSignalItemResponse>
            bulkCreateOccmDemandSignalItem(
                    BulkCreateOccmDemandSignalItemRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    BulkCreateOccmDemandSignalItemRequest,
                                    BulkCreateOccmDemandSignalItemResponse>
                            handler) {
        Objects.requireNonNull(
                request.getBulkCreateOccmDemandSignalItemDetails(),
                "bulkCreateOccmDemandSignalItemDetails is required");

        return clientCall(request, BulkCreateOccmDemandSignalItemResponse::builder)
                .logger(LOG, "bulkCreateOccmDemandSignalItem")
                .serviceDetails(
                        "DemandSignal",
                        "BulkCreateOccmDemandSignalItem",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccmDemandSignalItem/BulkCreateOccmDemandSignalItem")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BulkCreateOccmDemandSignalItemRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occmDemandSignalItems")
                .appendPathParam("actions")
                .appendPathParam("bulkCreateDemandSignalItems")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        BulkCreateOccmDemandSignalItemResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOccmDemandSignalResponse> createOccmDemandSignal(
            CreateOccmDemandSignalRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateOccmDemandSignalRequest, CreateOccmDemandSignalResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateOccmDemandSignalDetails(),
                "createOccmDemandSignalDetails is required");

        return clientCall(request, CreateOccmDemandSignalResponse::builder)
                .logger(LOG, "createOccmDemandSignal")
                .serviceDetails(
                        "DemandSignal",
                        "CreateOccmDemandSignal",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccmDemandSignal/CreateOccmDemandSignal")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOccmDemandSignalRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occmDemandSignals")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccmDemandSignal.class,
                        CreateOccmDemandSignalResponse.Builder::occmDemandSignal)
                .handleResponseHeaderString("etag", CreateOccmDemandSignalResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOccmDemandSignalResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", CreateOccmDemandSignalResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOccmDemandSignalItemResponse>
            createOccmDemandSignalItem(
                    CreateOccmDemandSignalItemRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateOccmDemandSignalItemRequest,
                                    CreateOccmDemandSignalItemResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateOccmDemandSignalItemDetails(),
                "createOccmDemandSignalItemDetails is required");

        return clientCall(request, CreateOccmDemandSignalItemResponse::builder)
                .logger(LOG, "createOccmDemandSignalItem")
                .serviceDetails(
                        "DemandSignal",
                        "CreateOccmDemandSignalItem",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccmDemandSignalItem/CreateOccmDemandSignalItem")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOccmDemandSignalItemRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occmDemandSignalItems")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccmDemandSignalItem.class,
                        CreateOccmDemandSignalItemResponse.Builder::occmDemandSignalItem)
                .handleResponseHeaderString(
                        "etag", CreateOccmDemandSignalItemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOccmDemandSignalItemResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", CreateOccmDemandSignalItemResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOccmDemandSignalResponse> deleteOccmDemandSignal(
            DeleteOccmDemandSignalRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteOccmDemandSignalRequest, DeleteOccmDemandSignalResponse>
                    handler) {

        Validate.notBlank(request.getOccmDemandSignalId(), "occmDemandSignalId must not be blank");

        return clientCall(request, DeleteOccmDemandSignalResponse::builder)
                .logger(LOG, "deleteOccmDemandSignal")
                .serviceDetails(
                        "DemandSignal",
                        "DeleteOccmDemandSignal",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccmDemandSignal/DeleteOccmDemandSignal")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOccmDemandSignalRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occmDemandSignals")
                .appendPathParam(request.getOccmDemandSignalId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOccmDemandSignalResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", DeleteOccmDemandSignalResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOccmDemandSignalItemResponse>
            deleteOccmDemandSignalItem(
                    DeleteOccmDemandSignalItemRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOccmDemandSignalItemRequest,
                                    DeleteOccmDemandSignalItemResponse>
                            handler) {

        Validate.notBlank(
                request.getOccmDemandSignalItemId(), "occmDemandSignalItemId must not be blank");

        return clientCall(request, DeleteOccmDemandSignalItemResponse::builder)
                .logger(LOG, "deleteOccmDemandSignalItem")
                .serviceDetails(
                        "DemandSignal",
                        "DeleteOccmDemandSignalItem",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccmDemandSignalItem/DeleteOccmDemandSignalItem")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOccmDemandSignalItemRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occmDemandSignalItems")
                .appendPathParam(request.getOccmDemandSignalItemId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOccmDemandSignalItemResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", DeleteOccmDemandSignalItemResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOccmDemandSignalResponse> getOccmDemandSignal(
            GetOccmDemandSignalRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOccmDemandSignalRequest, GetOccmDemandSignalResponse>
                    handler) {

        Validate.notBlank(request.getOccmDemandSignalId(), "occmDemandSignalId must not be blank");

        return clientCall(request, GetOccmDemandSignalResponse::builder)
                .logger(LOG, "getOccmDemandSignal")
                .serviceDetails(
                        "DemandSignal",
                        "GetOccmDemandSignal",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccmDemandSignal/GetOccmDemandSignal")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOccmDemandSignalRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occmDemandSignals")
                .appendPathParam(request.getOccmDemandSignalId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccmDemandSignal.class,
                        GetOccmDemandSignalResponse.Builder::occmDemandSignal)
                .handleResponseHeaderString("etag", GetOccmDemandSignalResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOccmDemandSignalResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOccmDemandSignalItemResponse> getOccmDemandSignalItem(
            GetOccmDemandSignalItemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOccmDemandSignalItemRequest, GetOccmDemandSignalItemResponse>
                    handler) {

        Validate.notBlank(
                request.getOccmDemandSignalItemId(), "occmDemandSignalItemId must not be blank");

        return clientCall(request, GetOccmDemandSignalItemResponse::builder)
                .logger(LOG, "getOccmDemandSignalItem")
                .serviceDetails(
                        "DemandSignal",
                        "GetOccmDemandSignalItem",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccmDemandSignalItem/GetOccmDemandSignalItem")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOccmDemandSignalItemRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occmDemandSignalItems")
                .appendPathParam(request.getOccmDemandSignalItemId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccmDemandSignalItem.class,
                        GetOccmDemandSignalItemResponse.Builder::occmDemandSignalItem)
                .handleResponseHeaderString("etag", GetOccmDemandSignalItemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOccmDemandSignalItemResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOccmDemandSignalCatalogResourcesResponse>
            listOccmDemandSignalCatalogResources(
                    ListOccmDemandSignalCatalogResourcesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOccmDemandSignalCatalogResourcesRequest,
                                    ListOccmDemandSignalCatalogResourcesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOccmDemandSignalCatalogResourcesResponse::builder)
                .logger(LOG, "listOccmDemandSignalCatalogResources")
                .serviceDetails(
                        "DemandSignal",
                        "ListOccmDemandSignalCatalogResources",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccmDemandSignalCatalogResource/ListOccmDemandSignalCatalogResources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOccmDemandSignalCatalogResourcesRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occmDemandSignalCatalogResources")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("demandSignalNamespace", request.getDemandSignalNamespace())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model
                                .OccmDemandSignalCatalogResourceCollection.class,
                        ListOccmDemandSignalCatalogResourcesResponse.Builder
                                ::occmDemandSignalCatalogResourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOccmDemandSignalCatalogResourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListOccmDemandSignalCatalogResourcesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOccmDemandSignalDeliveriesResponse>
            listOccmDemandSignalDeliveries(
                    ListOccmDemandSignalDeliveriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOccmDemandSignalDeliveriesRequest,
                                    ListOccmDemandSignalDeliveriesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOccmDemandSignalDeliveriesResponse::builder)
                .logger(LOG, "listOccmDemandSignalDeliveries")
                .serviceDetails(
                        "DemandSignal",
                        "ListOccmDemandSignalDeliveries",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccmDemandSignalDeliveryCollection/ListOccmDemandSignalDeliveries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOccmDemandSignalDeliveriesRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occmDemandSignalDeliveries")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("occmDemandSignalItemId", request.getOccmDemandSignalItemId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccmDemandSignalDeliveryCollection
                                .class,
                        ListOccmDemandSignalDeliveriesResponse.Builder
                                ::occmDemandSignalDeliveryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOccmDemandSignalDeliveriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListOccmDemandSignalDeliveriesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOccmDemandSignalItemsResponse> listOccmDemandSignalItems(
            ListOccmDemandSignalItemsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOccmDemandSignalItemsRequest, ListOccmDemandSignalItemsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOccmDemandSignalItemsResponse::builder)
                .logger(LOG, "listOccmDemandSignalItems")
                .serviceDetails(
                        "DemandSignal",
                        "ListOccmDemandSignalItems",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccmDemandSignalItem/ListOccmDemandSignalItems")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOccmDemandSignalItemsRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occmDemandSignalItems")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("occmDemandSignalId", request.getOccmDemandSignalId())
                .appendQueryParam("resourceName", request.getResourceName())
                .appendEnumQueryParam("demandSignalNamespace", request.getDemandSignalNamespace())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccmDemandSignalItemCollection
                                .class,
                        ListOccmDemandSignalItemsResponse.Builder::occmDemandSignalItemCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOccmDemandSignalItemsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOccmDemandSignalItemsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOccmDemandSignalsResponse> listOccmDemandSignals(
            ListOccmDemandSignalsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOccmDemandSignalsRequest, ListOccmDemandSignalsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOccmDemandSignalsResponse::builder)
                .logger(LOG, "listOccmDemandSignals")
                .serviceDetails(
                        "DemandSignal",
                        "ListOccmDemandSignals",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccmDemandSignal/ListOccmDemandSignals")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOccmDemandSignalsRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occmDemandSignals")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("lifecycleDetails", request.getLifecycleDetails())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccmDemandSignalCollection.class,
                        ListOccmDemandSignalsResponse.Builder::occmDemandSignalCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOccmDemandSignalsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOccmDemandSignalsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOccmDemandSignalResponse> updateOccmDemandSignal(
            UpdateOccmDemandSignalRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateOccmDemandSignalRequest, UpdateOccmDemandSignalResponse>
                    handler) {
        Objects.requireNonNull(
                request.getUpdateOccmDemandSignalDetails(),
                "updateOccmDemandSignalDetails is required");

        Validate.notBlank(request.getOccmDemandSignalId(), "occmDemandSignalId must not be blank");

        return clientCall(request, UpdateOccmDemandSignalResponse::builder)
                .logger(LOG, "updateOccmDemandSignal")
                .serviceDetails(
                        "DemandSignal",
                        "UpdateOccmDemandSignal",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccmDemandSignal/UpdateOccmDemandSignal")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOccmDemandSignalRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occmDemandSignals")
                .appendPathParam(request.getOccmDemandSignalId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccmDemandSignal.class,
                        UpdateOccmDemandSignalResponse.Builder::occmDemandSignal)
                .handleResponseHeaderString("etag", UpdateOccmDemandSignalResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOccmDemandSignalResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", UpdateOccmDemandSignalResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOccmDemandSignalItemResponse>
            updateOccmDemandSignalItem(
                    UpdateOccmDemandSignalItemRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOccmDemandSignalItemRequest,
                                    UpdateOccmDemandSignalItemResponse>
                            handler) {
        Objects.requireNonNull(
                request.getUpdateOccmDemandSignalItemDetails(),
                "updateOccmDemandSignalItemDetails is required");

        Validate.notBlank(
                request.getOccmDemandSignalItemId(), "occmDemandSignalItemId must not be blank");

        return clientCall(request, UpdateOccmDemandSignalItemResponse::builder)
                .logger(LOG, "updateOccmDemandSignalItem")
                .serviceDetails(
                        "DemandSignal",
                        "UpdateOccmDemandSignalItem",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccmDemandSignalItem/UpdateOccmDemandSignalItem")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOccmDemandSignalItemRequest::builder)
                .basePath("/20231107")
                .appendPathParam("occmDemandSignalItems")
                .appendPathParam(request.getOccmDemandSignalItemId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccmDemandSignalItem.class,
                        UpdateOccmDemandSignalItemResponse.Builder::occmDemandSignalItem)
                .handleResponseHeaderString(
                        "etag", UpdateOccmDemandSignalItemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOccmDemandSignalItemResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", UpdateOccmDemandSignalItemResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DemandSignalAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DemandSignalAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DemandSignalAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DemandSignalAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DemandSignalAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DemandSignalAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link
     *     Builder#signingStrategyRequestSignerFactories}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DemandSignalAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider);
    }
}
