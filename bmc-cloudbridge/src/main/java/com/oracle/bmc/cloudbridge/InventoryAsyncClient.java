/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.cloudbridge.requests.*;
import com.oracle.bmc.cloudbridge.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Inventory service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
public class InventoryAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements InventoryAsync {
    /** Service instance for Inventory. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("INVENTORY")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://cloudbridge.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(InventoryAsyncClient.class);

    InventoryAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, InventoryAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "cloudbridge";
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
        public InventoryAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new InventoryAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<AnalyzeAssetsResponse> analyzeAssets(
            AnalyzeAssetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AnalyzeAssetsRequest, AnalyzeAssetsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getAggregationProperties(), "aggregationProperties is required");

        return clientCall(request, AnalyzeAssetsResponse::builder)
                .logger(LOG, "analyzeAssets")
                .serviceDetails(
                        "Inventory",
                        "AnalyzeAssets",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AssetAggregation/AnalyzeAssets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(AnalyzeAssetsRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assetAnalytics")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("sourceKey", request.getSourceKey())
                .appendQueryParam("externalAssetKey", request.getExternalAssetKey())
                .appendEnumQueryParam("assetType", request.getAssetType())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendListQueryParam(
                        "aggregationProperties",
                        request.getAggregationProperties(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "groupBy",
                        request.getGroupBy(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("inventoryId", request.getInventoryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.AssetAggregationCollection.class,
                        AnalyzeAssetsResponse.Builder::assetAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", AnalyzeAssetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", AnalyzeAssetsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeAssetCompartmentResponse> changeAssetCompartment(
            ChangeAssetCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeAssetCompartmentRequest, ChangeAssetCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getAssetId(), "assetId must not be blank");
        Objects.requireNonNull(
                request.getChangeAssetCompartmentDetails(),
                "changeAssetCompartmentDetails is required");

        return clientCall(request, ChangeAssetCompartmentResponse::builder)
                .logger(LOG, "changeAssetCompartment")
                .serviceDetails(
                        "Inventory",
                        "ChangeAssetCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Asset/ChangeAssetCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAssetCompartmentRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assets")
                .appendPathParam(request.getAssetId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeAssetCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeAssetTagsResponse> changeAssetTags(
            ChangeAssetTagsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeAssetTagsRequest, ChangeAssetTagsResponse>
                    handler) {

        Validate.notBlank(request.getAssetId(), "assetId must not be blank");
        Objects.requireNonNull(
                request.getChangeAssetTagsDetails(), "changeAssetTagsDetails is required");

        return clientCall(request, ChangeAssetTagsResponse::builder)
                .logger(LOG, "changeAssetTags")
                .serviceDetails(
                        "Inventory",
                        "ChangeAssetTags",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Asset/ChangeAssetTags")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAssetTagsRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assets")
                .appendPathParam(request.getAssetId())
                .appendPathParam("actions")
                .appendPathParam("changeTags")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Asset.class,
                        ChangeAssetTagsResponse.Builder::asset)
                .handleResponseHeaderString("etag", ChangeAssetTagsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeAssetTagsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAssetResponse> createAsset(
            CreateAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateAssetRequest, CreateAssetResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateAssetDetails(), "createAssetDetails is required");

        return clientCall(request, CreateAssetResponse::builder)
                .logger(LOG, "createAsset")
                .serviceDetails(
                        "Inventory",
                        "CreateAsset",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Asset/CreateAsset")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAssetRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assets")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Asset.class,
                        CreateAssetResponse.Builder::asset)
                .handleResponseHeaderString("etag", CreateAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAssetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateInventoryResponse> createInventory(
            CreateInventoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateInventoryRequest, CreateInventoryResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateInventoryDetails(), "createInventoryDetails is required");

        return clientCall(request, CreateInventoryResponse::builder)
                .logger(LOG, "createInventory")
                .serviceDetails(
                        "Inventory",
                        "CreateInventory",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Inventory/CreateInventory")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateInventoryRequest::builder)
                .basePath("/20220509")
                .appendPathParam("inventories")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", CreateInventoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateInventoryResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssetResponse> deleteAsset(
            DeleteAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteAssetRequest, DeleteAssetResponse>
                    handler) {

        Validate.notBlank(request.getAssetId(), "assetId must not be blank");

        return clientCall(request, DeleteAssetResponse::builder)
                .logger(LOG, "deleteAsset")
                .serviceDetails(
                        "Inventory",
                        "DeleteAsset",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Asset/DeleteAsset")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAssetRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assets")
                .appendPathParam(request.getAssetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAssetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteInventoryResponse> deleteInventory(
            DeleteInventoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteInventoryRequest, DeleteInventoryResponse>
                    handler) {

        Validate.notBlank(request.getInventoryId(), "inventoryId must not be blank");

        return clientCall(request, DeleteInventoryResponse::builder)
                .logger(LOG, "deleteInventory")
                .serviceDetails(
                        "Inventory",
                        "DeleteInventory",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Inventory/DeleteInventory")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteInventoryRequest::builder)
                .basePath("/20220509")
                .appendPathParam("inventories")
                .appendPathParam(request.getInventoryId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteInventoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteInventoryResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAssetResponse> getAsset(
            GetAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAssetRequest, GetAssetResponse>
                    handler) {

        Validate.notBlank(request.getAssetId(), "assetId must not be blank");

        return clientCall(request, GetAssetResponse::builder)
                .logger(LOG, "getAsset")
                .serviceDetails(
                        "Inventory",
                        "GetAsset",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Asset/GetAsset")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAssetRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assets")
                .appendPathParam(request.getAssetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Asset.class,
                        GetAssetResponse.Builder::asset)
                .handleResponseHeaderString("etag", GetAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAssetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetInventoryResponse> getInventory(
            GetInventoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetInventoryRequest, GetInventoryResponse>
                    handler) {

        Validate.notBlank(request.getInventoryId(), "inventoryId must not be blank");

        return clientCall(request, GetInventoryResponse::builder)
                .logger(LOG, "getInventory")
                .serviceDetails(
                        "Inventory",
                        "GetInventory",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Inventory/GetInventory")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetInventoryRequest::builder)
                .basePath("/20220509")
                .appendPathParam("inventories")
                .appendPathParam(request.getInventoryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Inventory.class,
                        GetInventoryResponse.Builder::inventory)
                .handleResponseHeaderString("etag", GetInventoryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetInventoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", GetInventoryResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ImportInventoryResponse> importInventory(
            ImportInventoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ImportInventoryRequest, ImportInventoryResponse>
                    handler) {
        Objects.requireNonNull(
                request.getImportInventoryDetails(), "importInventoryDetails is required");

        Validate.notBlank(request.getInventoryId(), "inventoryId must not be blank");

        return clientCall(request, ImportInventoryResponse::builder)
                .logger(LOG, "importInventory")
                .serviceDetails(
                        "Inventory",
                        "ImportInventory",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Inventory/ImportInventory")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ImportInventoryRequest::builder)
                .basePath("/20220509")
                .appendPathParam("inventories")
                .appendPathParam(request.getInventoryId())
                .appendPathParam("actions")
                .appendPathParam("import")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ImportInventoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", ImportInventoryResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAssetsResponse> listAssets(
            ListAssetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListAssetsRequest, ListAssetsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAssetsResponse::builder)
                .logger(LOG, "listAssets")
                .serviceDetails(
                        "Inventory",
                        "ListAssets",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AssetCollection/ListAssets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAssetsRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assets")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("sourceKey", request.getSourceKey())
                .appendQueryParam("externalAssetKey", request.getExternalAssetKey())
                .appendEnumQueryParam("assetType", request.getAssetType())
                .appendQueryParam("assetId", request.getAssetId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("inventoryId", request.getInventoryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.AssetCollection.class,
                        ListAssetsResponse.Builder::assetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAssetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAssetsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListHistoricalMetricsResponse> listHistoricalMetrics(
            ListHistoricalMetricsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListHistoricalMetricsRequest, ListHistoricalMetricsResponse>
                    handler) {

        Validate.notBlank(request.getAssetId(), "assetId must not be blank");

        return clientCall(request, ListHistoricalMetricsResponse::builder)
                .logger(LOG, "listHistoricalMetrics")
                .serviceDetails(
                        "Inventory",
                        "ListHistoricalMetrics",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/HistoricalMetric/ListHistoricalMetrics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListHistoricalMetricsRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assets")
                .appendPathParam(request.getAssetId())
                .appendPathParam("historicalMetrics")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.HistoricalMetricCollection.class,
                        ListHistoricalMetricsResponse.Builder::historicalMetricCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListHistoricalMetricsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListHistoricalMetricsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListInventoriesResponse> listInventories(
            ListInventoriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListInventoriesRequest, ListInventoriesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListInventoriesResponse::builder)
                .logger(LOG, "listInventories")
                .serviceDetails(
                        "Inventory",
                        "ListInventories",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Inventory/ListInventories")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInventoriesRequest::builder)
                .basePath("/20220509")
                .appendPathParam("inventories")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.InventoryCollection.class,
                        ListInventoriesResponse.Builder::inventoryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListInventoriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListInventoriesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SubmitHistoricalMetricsResponse> submitHistoricalMetrics(
            SubmitHistoricalMetricsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SubmitHistoricalMetricsRequest, SubmitHistoricalMetricsResponse>
                    handler) {
        Objects.requireNonNull(
                request.getSubmitHistoricalMetricsDetails(),
                "submitHistoricalMetricsDetails is required");

        Validate.notBlank(request.getAssetId(), "assetId must not be blank");

        return clientCall(request, SubmitHistoricalMetricsResponse::builder)
                .logger(LOG, "submitHistoricalMetrics")
                .serviceDetails(
                        "Inventory",
                        "SubmitHistoricalMetrics",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/HistoricalMetric/SubmitHistoricalMetrics")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SubmitHistoricalMetricsRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assets")
                .appendPathParam(request.getAssetId())
                .appendPathParam("actions")
                .appendPathParam("submitHistoricalMetrics")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.HistoricalMetricCollection.class,
                        SubmitHistoricalMetricsResponse.Builder::historicalMetricCollection)
                .handleResponseHeaderString("etag", SubmitHistoricalMetricsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", SubmitHistoricalMetricsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssetResponse> updateAsset(
            UpdateAssetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateAssetRequest, UpdateAssetResponse>
                    handler) {

        Validate.notBlank(request.getAssetId(), "assetId must not be blank");
        Objects.requireNonNull(request.getUpdateAssetDetails(), "updateAssetDetails is required");

        return clientCall(request, UpdateAssetResponse::builder)
                .logger(LOG, "updateAsset")
                .serviceDetails(
                        "Inventory",
                        "UpdateAsset",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Asset/UpdateAsset")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAssetRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assets")
                .appendPathParam(request.getAssetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Asset.class,
                        UpdateAssetResponse.Builder::asset)
                .handleResponseHeaderString("etag", UpdateAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAssetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateInventoryResponse> updateInventory(
            UpdateInventoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateInventoryRequest, UpdateInventoryResponse>
                    handler) {

        Validate.notBlank(request.getInventoryId(), "inventoryId must not be blank");
        Objects.requireNonNull(
                request.getUpdateInventoryDetails(), "updateInventoryDetails is required");

        return clientCall(request, UpdateInventoryResponse::builder)
                .logger(LOG, "updateInventory")
                .serviceDetails(
                        "Inventory",
                        "UpdateInventory",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/Inventory/UpdateInventory")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateInventoryRequest::builder)
                .basePath("/20220509")
                .appendPathParam("inventories")
                .appendPathParam(request.getInventoryId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Inventory.class,
                        UpdateInventoryResponse.Builder::inventory)
                .handleResponseHeaderString("etag", UpdateInventoryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateInventoryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public InventoryAsyncClient(
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
    public InventoryAsyncClient(
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
    public InventoryAsyncClient(
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
    public InventoryAsyncClient(
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
    public InventoryAsyncClient(
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
    public InventoryAsyncClient(
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
    public InventoryAsyncClient(
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
