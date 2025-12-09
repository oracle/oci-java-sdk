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
 * Async client implementation for InternalDemandSignal service. <br>
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
public class InternalDemandSignalAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements InternalDemandSignalAsync {
    /** Service instance for InternalDemandSignal. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(InternalDemandSignalClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://control-center-cp.{region}.oci.{secondLevelDomain}")
                    .endpointServiceName("control-center-cp")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(InternalDemandSignalAsyncClient.class);

    InternalDemandSignalAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, InternalDemandSignalAsyncClient> {
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
        public InternalDemandSignalAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new InternalDemandSignalAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateInternalOccmDemandSignalDeliveryResponse>
            createInternalOccmDemandSignalDelivery(
                    CreateInternalOccmDemandSignalDeliveryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateInternalOccmDemandSignalDeliveryRequest,
                                    CreateInternalOccmDemandSignalDeliveryResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateInternalOccmDemandSignalDeliveryDetails(),
                "createInternalOccmDemandSignalDeliveryDetails is required");

        return clientCall(request, CreateInternalOccmDemandSignalDeliveryResponse::builder)
                .logger(LOG, "createInternalOccmDemandSignalDelivery")
                .serviceDetails(
                        "InternalDemandSignal",
                        "CreateInternalOccmDemandSignalDelivery",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/InternalOccmDemandSignalDelivery/CreateInternalOccmDemandSignalDelivery")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateInternalOccmDemandSignalDeliveryRequest::builder)
                .basePath("/20231107")
                .appendPathParam("internal")
                .appendPathParam("occmDemandSignalDeliveries")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.InternalOccmDemandSignalDelivery
                                .class,
                        CreateInternalOccmDemandSignalDeliveryResponse.Builder
                                ::internalOccmDemandSignalDelivery)
                .handleResponseHeaderString(
                        "etag", CreateInternalOccmDemandSignalDeliveryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateInternalOccmDemandSignalDeliveryResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after",
                        CreateInternalOccmDemandSignalDeliveryResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteInternalOccmDemandSignalDeliveryResponse>
            deleteInternalOccmDemandSignalDelivery(
                    DeleteInternalOccmDemandSignalDeliveryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteInternalOccmDemandSignalDeliveryRequest,
                                    DeleteInternalOccmDemandSignalDeliveryResponse>
                            handler) {

        Validate.notBlank(
                request.getOccmDemandSignalDeliveryId(),
                "occmDemandSignalDeliveryId must not be blank");

        return clientCall(request, DeleteInternalOccmDemandSignalDeliveryResponse::builder)
                .logger(LOG, "deleteInternalOccmDemandSignalDelivery")
                .serviceDetails(
                        "InternalDemandSignal",
                        "DeleteInternalOccmDemandSignalDelivery",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/InternalOccmDemandSignalDelivery/DeleteInternalOccmDemandSignalDelivery")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteInternalOccmDemandSignalDeliveryRequest::builder)
                .basePath("/20231107")
                .appendPathParam("internal")
                .appendPathParam("occmDemandSignalDeliveries")
                .appendPathParam(request.getOccmDemandSignalDeliveryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteInternalOccmDemandSignalDeliveryResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after",
                        DeleteInternalOccmDemandSignalDeliveryResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetInternalOccmDemandSignalResponse>
            getInternalOccmDemandSignal(
                    GetInternalOccmDemandSignalRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetInternalOccmDemandSignalRequest,
                                    GetInternalOccmDemandSignalResponse>
                            handler) {

        Validate.notBlank(request.getOccmDemandSignalId(), "occmDemandSignalId must not be blank");

        return clientCall(request, GetInternalOccmDemandSignalResponse::builder)
                .logger(LOG, "getInternalOccmDemandSignal")
                .serviceDetails(
                        "InternalDemandSignal",
                        "GetInternalOccmDemandSignal",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/InternalOccmDemandSignal/GetInternalOccmDemandSignal")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetInternalOccmDemandSignalRequest::builder)
                .basePath("/20231107")
                .appendPathParam("internal")
                .appendPathParam("occmDemandSignals")
                .appendPathParam(request.getOccmDemandSignalId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.InternalOccmDemandSignal.class,
                        GetInternalOccmDemandSignalResponse.Builder::internalOccmDemandSignal)
                .handleResponseHeaderString(
                        "etag", GetInternalOccmDemandSignalResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetInternalOccmDemandSignalResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetInternalOccmDemandSignalCatalogResponse>
            getInternalOccmDemandSignalCatalog(
                    GetInternalOccmDemandSignalCatalogRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetInternalOccmDemandSignalCatalogRequest,
                                    GetInternalOccmDemandSignalCatalogResponse>
                            handler) {

        Validate.notBlank(
                request.getOccmDemandSignalCatalogId(),
                "occmDemandSignalCatalogId must not be blank");

        return clientCall(request, GetInternalOccmDemandSignalCatalogResponse::builder)
                .logger(LOG, "getInternalOccmDemandSignalCatalog")
                .serviceDetails(
                        "InternalDemandSignal",
                        "GetInternalOccmDemandSignalCatalog",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccmDemandSignalCatalogResource/GetInternalOccmDemandSignalCatalog")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetInternalOccmDemandSignalCatalogRequest::builder)
                .basePath("/20231107")
                .appendPathParam("internal")
                .appendPathParam("occmDemandSignalCatalog")
                .appendPathParam(request.getOccmDemandSignalCatalogId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccmDemandSignalCatalog.class,
                        GetInternalOccmDemandSignalCatalogResponse.Builder::occmDemandSignalCatalog)
                .handleResponseHeaderString(
                        "etag", GetInternalOccmDemandSignalCatalogResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetInternalOccmDemandSignalCatalogResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetInternalOccmDemandSignalDeliveryResponse>
            getInternalOccmDemandSignalDelivery(
                    GetInternalOccmDemandSignalDeliveryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetInternalOccmDemandSignalDeliveryRequest,
                                    GetInternalOccmDemandSignalDeliveryResponse>
                            handler) {

        Validate.notBlank(
                request.getOccmDemandSignalDeliveryId(),
                "occmDemandSignalDeliveryId must not be blank");

        return clientCall(request, GetInternalOccmDemandSignalDeliveryResponse::builder)
                .logger(LOG, "getInternalOccmDemandSignalDelivery")
                .serviceDetails(
                        "InternalDemandSignal",
                        "GetInternalOccmDemandSignalDelivery",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/InternalOccmDemandSignalDelivery/GetInternalOccmDemandSignalDelivery")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetInternalOccmDemandSignalDeliveryRequest::builder)
                .basePath("/20231107")
                .appendPathParam("internal")
                .appendPathParam("occmDemandSignalDeliveries")
                .appendPathParam(request.getOccmDemandSignalDeliveryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.InternalOccmDemandSignalDelivery
                                .class,
                        GetInternalOccmDemandSignalDeliveryResponse.Builder
                                ::internalOccmDemandSignalDelivery)
                .handleResponseHeaderString(
                        "etag", GetInternalOccmDemandSignalDeliveryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetInternalOccmDemandSignalDeliveryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListInternalOccmDemandSignalCatalogResourcesResponse>
            listInternalOccmDemandSignalCatalogResources(
                    ListInternalOccmDemandSignalCatalogResourcesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListInternalOccmDemandSignalCatalogResourcesRequest,
                                    ListInternalOccmDemandSignalCatalogResourcesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getOccCustomerGroupId(), "occCustomerGroupId is required");

        Objects.requireNonNull(
                request.getOccmDemandSignalCatalogId(), "occmDemandSignalCatalogId is required");

        return clientCall(request, ListInternalOccmDemandSignalCatalogResourcesResponse::builder)
                .logger(LOG, "listInternalOccmDemandSignalCatalogResources")
                .serviceDetails(
                        "InternalDemandSignal",
                        "ListInternalOccmDemandSignalCatalogResources",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/InternalOccmDemandSignalCatalogResource/ListInternalOccmDemandSignalCatalogResources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInternalOccmDemandSignalCatalogResourcesRequest::builder)
                .basePath("/20231107")
                .appendPathParam("internal")
                .appendPathParam("occmDemandSignalCatalogResources")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("occCustomerGroupId", request.getOccCustomerGroupId())
                .appendQueryParam(
                        "occmDemandSignalCatalogId", request.getOccmDemandSignalCatalogId())
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
                                .InternalOccmDemandSignalCatalogResourceCollection.class,
                        ListInternalOccmDemandSignalCatalogResourcesResponse.Builder
                                ::internalOccmDemandSignalCatalogResourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListInternalOccmDemandSignalCatalogResourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListInternalOccmDemandSignalCatalogResourcesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListInternalOccmDemandSignalCatalogsResponse>
            listInternalOccmDemandSignalCatalogs(
                    ListInternalOccmDemandSignalCatalogsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListInternalOccmDemandSignalCatalogsRequest,
                                    ListInternalOccmDemandSignalCatalogsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getOccCustomerGroupId(), "occCustomerGroupId is required");

        return clientCall(request, ListInternalOccmDemandSignalCatalogsResponse::builder)
                .logger(LOG, "listInternalOccmDemandSignalCatalogs")
                .serviceDetails(
                        "InternalDemandSignal",
                        "ListInternalOccmDemandSignalCatalogs",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/OccmDemandSignalCatalog/ListInternalOccmDemandSignalCatalogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInternalOccmDemandSignalCatalogsRequest::builder)
                .basePath("/20231107")
                .appendPathParam("internal")
                .appendPathParam("occmDemandSignalCatalog")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("occCustomerGroupId", request.getOccCustomerGroupId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.OccmDemandSignalCatalogCollection
                                .class,
                        ListInternalOccmDemandSignalCatalogsResponse.Builder
                                ::occmDemandSignalCatalogCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListInternalOccmDemandSignalCatalogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListInternalOccmDemandSignalCatalogsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListInternalOccmDemandSignalDeliveriesResponse>
            listInternalOccmDemandSignalDeliveries(
                    ListInternalOccmDemandSignalDeliveriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListInternalOccmDemandSignalDeliveriesRequest,
                                    ListInternalOccmDemandSignalDeliveriesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getOccCustomerGroupId(), "occCustomerGroupId is required");

        return clientCall(request, ListInternalOccmDemandSignalDeliveriesResponse::builder)
                .logger(LOG, "listInternalOccmDemandSignalDeliveries")
                .serviceDetails(
                        "InternalDemandSignal",
                        "ListInternalOccmDemandSignalDeliveries",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/InternalOccmDemandSignalDelivery/ListInternalOccmDemandSignalDeliveries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInternalOccmDemandSignalDeliveriesRequest::builder)
                .basePath("/20231107")
                .appendPathParam("internal")
                .appendPathParam("occmDemandSignalDeliveries")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("occCustomerGroupId", request.getOccCustomerGroupId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("occmDemandSignalItemId", request.getOccmDemandSignalItemId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model
                                .InternalOccmDemandSignalDeliveryCollection.class,
                        ListInternalOccmDemandSignalDeliveriesResponse.Builder
                                ::internalOccmDemandSignalDeliveryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListInternalOccmDemandSignalDeliveriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListInternalOccmDemandSignalDeliveriesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListInternalOccmDemandSignalItemsResponse>
            listInternalOccmDemandSignalItems(
                    ListInternalOccmDemandSignalItemsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListInternalOccmDemandSignalItemsRequest,
                                    ListInternalOccmDemandSignalItemsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getOccCustomerGroupId(), "occCustomerGroupId is required");

        return clientCall(request, ListInternalOccmDemandSignalItemsResponse::builder)
                .logger(LOG, "listInternalOccmDemandSignalItems")
                .serviceDetails(
                        "InternalDemandSignal",
                        "ListInternalOccmDemandSignalItems",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/InternalOccmDemandSignalItemCollection/ListInternalOccmDemandSignalItems")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInternalOccmDemandSignalItemsRequest::builder)
                .basePath("/20231107")
                .appendPathParam("internal")
                .appendPathParam("occmDemandSignalItems")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("occCustomerGroupId", request.getOccCustomerGroupId())
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
                        com.oracle.bmc.capacitymanagement.model
                                .InternalOccmDemandSignalItemCollection.class,
                        ListInternalOccmDemandSignalItemsResponse.Builder
                                ::internalOccmDemandSignalItemCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListInternalOccmDemandSignalItemsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListInternalOccmDemandSignalItemsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListInternalOccmDemandSignalsResponse>
            listInternalOccmDemandSignals(
                    ListInternalOccmDemandSignalsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListInternalOccmDemandSignalsRequest,
                                    ListInternalOccmDemandSignalsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getOccCustomerGroupId(), "occCustomerGroupId is required");

        return clientCall(request, ListInternalOccmDemandSignalsResponse::builder)
                .logger(LOG, "listInternalOccmDemandSignals")
                .serviceDetails(
                        "InternalDemandSignal",
                        "ListInternalOccmDemandSignals",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/InternalOccmDemandSignal/ListInternalOccmDemandSignals")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInternalOccmDemandSignalsRequest::builder)
                .basePath("/20231107")
                .appendPathParam("internal")
                .appendPathParam("occmDemandSignals")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("occCustomerGroupId", request.getOccCustomerGroupId())
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
                        com.oracle.bmc.capacitymanagement.model.InternalOccmDemandSignalCollection
                                .class,
                        ListInternalOccmDemandSignalsResponse.Builder
                                ::internalOccmDemandSignalCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListInternalOccmDemandSignalsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListInternalOccmDemandSignalsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateInternalOccmDemandSignalResponse>
            updateInternalOccmDemandSignal(
                    UpdateInternalOccmDemandSignalRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateInternalOccmDemandSignalRequest,
                                    UpdateInternalOccmDemandSignalResponse>
                            handler) {
        Objects.requireNonNull(
                request.getUpdateInternalOccmDemandSignalDetails(),
                "updateInternalOccmDemandSignalDetails is required");

        Validate.notBlank(request.getOccmDemandSignalId(), "occmDemandSignalId must not be blank");

        return clientCall(request, UpdateInternalOccmDemandSignalResponse::builder)
                .logger(LOG, "updateInternalOccmDemandSignal")
                .serviceDetails(
                        "InternalDemandSignal",
                        "UpdateInternalOccmDemandSignal",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/InternalOccmDemandSignal/UpdateInternalOccmDemandSignal")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateInternalOccmDemandSignalRequest::builder)
                .basePath("/20231107")
                .appendPathParam("internal")
                .appendPathParam("occmDemandSignals")
                .appendPathParam(request.getOccmDemandSignalId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.InternalOccmDemandSignal.class,
                        UpdateInternalOccmDemandSignalResponse.Builder::internalOccmDemandSignal)
                .handleResponseHeaderString(
                        "etag", UpdateInternalOccmDemandSignalResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateInternalOccmDemandSignalResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", UpdateInternalOccmDemandSignalResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateInternalOccmDemandSignalDeliveryResponse>
            updateInternalOccmDemandSignalDelivery(
                    UpdateInternalOccmDemandSignalDeliveryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateInternalOccmDemandSignalDeliveryRequest,
                                    UpdateInternalOccmDemandSignalDeliveryResponse>
                            handler) {
        Objects.requireNonNull(
                request.getUpdateInternalOccmDemandSignalDeliveryDetails(),
                "updateInternalOccmDemandSignalDeliveryDetails is required");

        Validate.notBlank(
                request.getOccmDemandSignalDeliveryId(),
                "occmDemandSignalDeliveryId must not be blank");

        return clientCall(request, UpdateInternalOccmDemandSignalDeliveryResponse::builder)
                .logger(LOG, "updateInternalOccmDemandSignalDelivery")
                .serviceDetails(
                        "InternalDemandSignal",
                        "UpdateInternalOccmDemandSignalDelivery",
                        "https://docs.oracle.com/iaas/api/#/en/occcm/20231107/InternalOccmDemandSignalDelivery/UpdateInternalOccmDemandSignalDelivery")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateInternalOccmDemandSignalDeliveryRequest::builder)
                .basePath("/20231107")
                .appendPathParam("internal")
                .appendPathParam("occmDemandSignalDeliveries")
                .appendPathParam(request.getOccmDemandSignalDeliveryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.capacitymanagement.model.InternalOccmDemandSignalDelivery
                                .class,
                        UpdateInternalOccmDemandSignalDeliveryResponse.Builder
                                ::internalOccmDemandSignalDelivery)
                .handleResponseHeaderString(
                        "etag", UpdateInternalOccmDemandSignalDeliveryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateInternalOccmDemandSignalDeliveryResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after",
                        UpdateInternalOccmDemandSignalDeliveryResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public InternalDemandSignalAsyncClient(
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
    public InternalDemandSignalAsyncClient(
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
    public InternalDemandSignalAsyncClient(
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
    public InternalDemandSignalAsyncClient(
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
    public InternalDemandSignalAsyncClient(
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
    public InternalDemandSignalAsyncClient(
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
    public InternalDemandSignalAsyncClient(
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
