/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.cloudbridge.requests.*;
import com.oracle.bmc.cloudbridge.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
public class InventoryClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements Inventory {
    /** Service instance for Inventory. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("INVENTORY")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://cloudbridge.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(InventoryClient.class);

    private final InventoryWaiters waiters;

    private final InventoryPaginators paginators;

    InventoryClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        if (executorService == null) {
            // up to 50 (core) threads, time out after 60s idle, all daemon
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor =
                    new java.util.concurrent.ThreadPoolExecutor(
                            50,
                            50,
                            60L,
                            java.util.concurrent.TimeUnit.SECONDS,
                            new java.util.concurrent.LinkedBlockingQueue<Runnable>(),
                            com.oracle.bmc.internal.ClientThreadFactory.builder()
                                    .isDaemon(true)
                                    .nameFormat("Inventory-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new InventoryWaiters(executorService, this);

        this.paginators = new InventoryPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, InventoryClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "cloudbridge";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Set the ExecutorService for the client to be created.
         *
         * @param executorService executorService
         * @return this builder
         */
        public Builder executorService(java.util.concurrent.ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public InventoryClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new InventoryClient(this, authenticationDetailsProvider, executorService);
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
    public AnalyzeAssetsResponse analyzeAssets(AnalyzeAssetsRequest request) {
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.AssetAggregationCollection.class,
                        AnalyzeAssetsResponse.Builder::assetAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", AnalyzeAssetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", AnalyzeAssetsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ChangeAssetCompartmentResponse changeAssetCompartment(
            ChangeAssetCompartmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeAssetCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeAssetTagsResponse changeAssetTags(ChangeAssetTagsRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Asset.class,
                        ChangeAssetTagsResponse.Builder::asset)
                .handleResponseHeaderString("etag", ChangeAssetTagsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeAssetTagsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateAssetResponse createAsset(CreateAssetRequest request) {
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Asset.class,
                        CreateAssetResponse.Builder::asset)
                .handleResponseHeaderString("etag", CreateAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAssetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateInventoryResponse createInventory(CreateInventoryRequest request) {
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", CreateInventoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateInventoryResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteAssetResponse deleteAsset(DeleteAssetRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAssetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteInventoryResponse deleteInventory(DeleteInventoryRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteInventoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteInventoryResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public GetAssetResponse getAsset(GetAssetRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Asset.class,
                        GetAssetResponse.Builder::asset)
                .handleResponseHeaderString("etag", GetAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAssetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetInventoryResponse getInventory(GetInventoryRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Inventory.class,
                        GetInventoryResponse.Builder::inventory)
                .handleResponseHeaderString("etag", GetInventoryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetInventoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", GetInventoryResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ImportInventoryResponse importInventory(ImportInventoryRequest request) {
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ImportInventoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", ImportInventoryResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ListAssetsResponse listAssets(ListAssetsRequest request) {
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.AssetCollection.class,
                        ListAssetsResponse.Builder::assetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAssetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAssetsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListHistoricalMetricsResponse listHistoricalMetrics(
            ListHistoricalMetricsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.HistoricalMetricCollection.class,
                        ListHistoricalMetricsResponse.Builder::historicalMetricCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListHistoricalMetricsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListHistoricalMetricsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListInventoriesResponse listInventories(ListInventoriesRequest request) {
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.InventoryCollection.class,
                        ListInventoriesResponse.Builder::inventoryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListInventoriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListInventoriesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SubmitHistoricalMetricsResponse submitHistoricalMetrics(
            SubmitHistoricalMetricsRequest request) {
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.HistoricalMetricCollection.class,
                        SubmitHistoricalMetricsResponse.Builder::historicalMetricCollection)
                .handleResponseHeaderString("etag", SubmitHistoricalMetricsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", SubmitHistoricalMetricsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateAssetResponse updateAsset(UpdateAssetRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Asset.class,
                        UpdateAssetResponse.Builder::asset)
                .handleResponseHeaderString("etag", UpdateAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAssetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateInventoryResponse updateInventory(UpdateInventoryRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.Inventory.class,
                        UpdateInventoryResponse.Builder::inventory)
                .handleResponseHeaderString("etag", UpdateInventoryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateInventoryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public InventoryWaiters getWaiters() {
        return waiters;
    }

    @Override
    public InventoryPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public InventoryClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider, null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public InventoryClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider, null);
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
    public InventoryClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider,
                null);
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
    public InventoryClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider,
                null);
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
    public InventoryClient(
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
                authenticationDetailsProvider,
                null);
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
    public InventoryClient(
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
                authenticationDetailsProvider,
                null);
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
    public InventoryClient(
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
                authenticationDetailsProvider,
                null);
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
     * @param executorService {@link Builder#executorService}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public InventoryClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint,
            java.util.concurrent.ExecutorService executorService) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider,
                executorService);
    }
}
