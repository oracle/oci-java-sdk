/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementdashboard;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.managementdashboard.requests.*;
import com.oracle.bmc.managementdashboard.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200901")
public class DashxApisClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements DashxApis {
    /** Service instance for DashxApis. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DashxApisClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://managementdashboard.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DashxApisClient.class);

    private final DashxApisWaiters waiters;

    private final DashxApisPaginators paginators;

    DashxApisClient(
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
                                    .nameFormat("DashxApis-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DashxApisWaiters(executorService, this);

        this.paginators = new DashxApisPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DashxApisClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "managementdashboard";
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
        public DashxApisClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DashxApisClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeManagementDashboardsCompartmentResponse changeManagementDashboardsCompartment(
            ChangeManagementDashboardsCompartmentRequest request) {

        Validate.notBlank(
                request.getManagementDashboardId(), "managementDashboardId must not be blank");
        Objects.requireNonNull(
                request.getChangeManagementDashboardsCompartmentDetails(),
                "changeManagementDashboardsCompartmentDetails is required");

        return clientCall(request, ChangeManagementDashboardsCompartmentResponse::builder)
                .logger(LOG, "changeManagementDashboardsCompartment")
                .serviceDetails(
                        "DashxApis",
                        "ChangeManagementDashboardsCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/managementdashboard/20200901/ManagementDashboard/ChangeManagementDashboardsCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeManagementDashboardsCompartmentRequest::builder)
                .basePath("/20200901")
                .appendPathParam("managementDashboards")
                .appendPathParam(request.getManagementDashboardId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.managementdashboard.model.ManagementDashboard.class,
                        ChangeManagementDashboardsCompartmentResponse.Builder::managementDashboard)
                .handleResponseHeaderString(
                        "etag", ChangeManagementDashboardsCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeManagementDashboardsCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeManagementDashboardsCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ChangeManagementSavedSearchesCompartmentResponse
            changeManagementSavedSearchesCompartment(
                    ChangeManagementSavedSearchesCompartmentRequest request) {

        Validate.notBlank(
                request.getManagementSavedSearchId(), "managementSavedSearchId must not be blank");
        Objects.requireNonNull(
                request.getChangeManagementSavedSearchesCompartmentDetails(),
                "changeManagementSavedSearchesCompartmentDetails is required");

        return clientCall(request, ChangeManagementSavedSearchesCompartmentResponse::builder)
                .logger(LOG, "changeManagementSavedSearchesCompartment")
                .serviceDetails(
                        "DashxApis",
                        "ChangeManagementSavedSearchesCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/managementdashboard/20200901/ManagementSavedSearch/ChangeManagementSavedSearchesCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeManagementSavedSearchesCompartmentRequest::builder)
                .basePath("/20200901")
                .appendPathParam("managementSavedSearches")
                .appendPathParam(request.getManagementSavedSearchId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.managementdashboard.model.ManagementSavedSearch.class,
                        ChangeManagementSavedSearchesCompartmentResponse.Builder
                                ::managementSavedSearch)
                .handleResponseHeaderString(
                        "etag", ChangeManagementSavedSearchesCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeManagementSavedSearchesCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeManagementSavedSearchesCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateManagementDashboardResponse createManagementDashboard(
            CreateManagementDashboardRequest request) {
        Objects.requireNonNull(
                request.getCreateManagementDashboardDetails(),
                "createManagementDashboardDetails is required");

        return clientCall(request, CreateManagementDashboardResponse::builder)
                .logger(LOG, "createManagementDashboard")
                .serviceDetails(
                        "DashxApis",
                        "CreateManagementDashboard",
                        "https://docs.oracle.com/iaas/api/#/en/managementdashboard/20200901/ManagementDashboard/CreateManagementDashboard")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateManagementDashboardRequest::builder)
                .basePath("/20200901")
                .appendPathParam("managementDashboards")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.managementdashboard.model.ManagementDashboard.class,
                        CreateManagementDashboardResponse.Builder::managementDashboard)
                .handleResponseHeaderString("etag", CreateManagementDashboardResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateManagementDashboardResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateManagementDashboardResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateManagementSavedSearchResponse createManagementSavedSearch(
            CreateManagementSavedSearchRequest request) {
        Objects.requireNonNull(
                request.getCreateManagementSavedSearchDetails(),
                "createManagementSavedSearchDetails is required");

        return clientCall(request, CreateManagementSavedSearchResponse::builder)
                .logger(LOG, "createManagementSavedSearch")
                .serviceDetails(
                        "DashxApis",
                        "CreateManagementSavedSearch",
                        "https://docs.oracle.com/iaas/api/#/en/managementdashboard/20200901/ManagementSavedSearch/CreateManagementSavedSearch")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateManagementSavedSearchRequest::builder)
                .basePath("/20200901")
                .appendPathParam("managementSavedSearches")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.managementdashboard.model.ManagementSavedSearch.class,
                        CreateManagementSavedSearchResponse.Builder::managementSavedSearch)
                .handleResponseHeaderString(
                        "etag", CreateManagementSavedSearchResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateManagementSavedSearchResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateManagementSavedSearchResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteManagementDashboardResponse deleteManagementDashboard(
            DeleteManagementDashboardRequest request) {

        Validate.notBlank(
                request.getManagementDashboardId(), "managementDashboardId must not be blank");

        return clientCall(request, DeleteManagementDashboardResponse::builder)
                .logger(LOG, "deleteManagementDashboard")
                .serviceDetails(
                        "DashxApis",
                        "DeleteManagementDashboard",
                        "https://docs.oracle.com/iaas/api/#/en/managementdashboard/20200901/ManagementDashboard/DeleteManagementDashboard")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteManagementDashboardRequest::builder)
                .basePath("/20200901")
                .appendPathParam("managementDashboards")
                .appendPathParam(request.getManagementDashboardId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteManagementDashboardResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteManagementDashboardResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteManagementSavedSearchResponse deleteManagementSavedSearch(
            DeleteManagementSavedSearchRequest request) {

        Validate.notBlank(
                request.getManagementSavedSearchId(), "managementSavedSearchId must not be blank");

        return clientCall(request, DeleteManagementSavedSearchResponse::builder)
                .logger(LOG, "deleteManagementSavedSearch")
                .serviceDetails(
                        "DashxApis",
                        "DeleteManagementSavedSearch",
                        "https://docs.oracle.com/iaas/api/#/en/managementdashboard/20200901/ManagementSavedSearch/DeleteManagementSavedSearch")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteManagementSavedSearchRequest::builder)
                .basePath("/20200901")
                .appendPathParam("managementSavedSearches")
                .appendPathParam(request.getManagementSavedSearchId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteManagementSavedSearchResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteManagementSavedSearchResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ExportDashboardResponse exportDashboard(ExportDashboardRequest request) {

        Validate.notBlank(request.getExportDashboardId(), "exportDashboardId must not be blank");

        return clientCall(request, ExportDashboardResponse::builder)
                .logger(LOG, "exportDashboard")
                .serviceDetails(
                        "DashxApis",
                        "ExportDashboard",
                        "https://docs.oracle.com/iaas/api/#/en/managementdashboard/20200901/ManagementDashboardImportDetails/ExportDashboard")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ExportDashboardRequest::builder)
                .basePath("/20200901")
                .appendPathParam("managementDashboards")
                .appendPathParam("actions")
                .appendPathParam("exportDashboard")
                .appendPathParam(request.getExportDashboardId())
                .appendQueryParam("exportTags", request.getExportTags())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.managementdashboard.model.ManagementDashboardExportDetails
                                .class,
                        ExportDashboardResponse.Builder::managementDashboardExportDetails)
                .handleResponseHeaderString(
                        "opc-work-request-id", ExportDashboardResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ExportDashboardResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetManagementDashboardResponse getManagementDashboard(
            GetManagementDashboardRequest request) {

        Validate.notBlank(
                request.getManagementDashboardId(), "managementDashboardId must not be blank");

        return clientCall(request, GetManagementDashboardResponse::builder)
                .logger(LOG, "getManagementDashboard")
                .serviceDetails(
                        "DashxApis",
                        "GetManagementDashboard",
                        "https://docs.oracle.com/iaas/api/#/en/managementdashboard/20200901/ManagementDashboard/GetManagementDashboard")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetManagementDashboardRequest::builder)
                .basePath("/20200901")
                .appendPathParam("managementDashboards")
                .appendPathParam(request.getManagementDashboardId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.managementdashboard.model.ManagementDashboard.class,
                        GetManagementDashboardResponse.Builder::managementDashboard)
                .handleResponseHeaderString("etag", GetManagementDashboardResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        GetManagementDashboardResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", GetManagementDashboardResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetManagementSavedSearchResponse getManagementSavedSearch(
            GetManagementSavedSearchRequest request) {

        Validate.notBlank(
                request.getManagementSavedSearchId(), "managementSavedSearchId must not be blank");

        return clientCall(request, GetManagementSavedSearchResponse::builder)
                .logger(LOG, "getManagementSavedSearch")
                .serviceDetails(
                        "DashxApis",
                        "GetManagementSavedSearch",
                        "https://docs.oracle.com/iaas/api/#/en/managementdashboard/20200901/ManagementSavedSearch/GetManagementSavedSearch")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetManagementSavedSearchRequest::builder)
                .basePath("/20200901")
                .appendPathParam("managementSavedSearches")
                .appendPathParam(request.getManagementSavedSearchId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.managementdashboard.model.ManagementSavedSearch.class,
                        GetManagementSavedSearchResponse.Builder::managementSavedSearch)
                .handleResponseHeaderString("etag", GetManagementSavedSearchResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        GetManagementSavedSearchResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", GetManagementSavedSearchResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOobManagementDashboardResponse getOobManagementDashboard(
            GetOobManagementDashboardRequest request) {

        Validate.notBlank(
                request.getManagementDashboardId(), "managementDashboardId must not be blank");

        return clientCall(request, GetOobManagementDashboardResponse::builder)
                .logger(LOG, "getOobManagementDashboard")
                .serviceDetails(
                        "DashxApis",
                        "GetOobManagementDashboard",
                        "https://docs.oracle.com/iaas/api/#/en/managementdashboard/20200901/ManagementDashboard/GetOobManagementDashboard")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOobManagementDashboardRequest::builder)
                .basePath("/20200901")
                .appendPathParam("oobManagementDashboards")
                .appendPathParam(request.getManagementDashboardId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.managementdashboard.model.ManagementDashboard.class,
                        GetOobManagementDashboardResponse.Builder::managementDashboard)
                .handleResponseHeaderString("etag", GetOobManagementDashboardResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        GetOobManagementDashboardResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", GetOobManagementDashboardResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOobManagementSavedSearchResponse getOobManagementSavedSearch(
            GetOobManagementSavedSearchRequest request) {

        Validate.notBlank(
                request.getManagementSavedSearchId(), "managementSavedSearchId must not be blank");

        return clientCall(request, GetOobManagementSavedSearchResponse::builder)
                .logger(LOG, "getOobManagementSavedSearch")
                .serviceDetails(
                        "DashxApis",
                        "GetOobManagementSavedSearch",
                        "https://docs.oracle.com/iaas/api/#/en/managementdashboard/20200901/ManagementSavedSearch/GetOobManagementSavedSearch")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOobManagementSavedSearchRequest::builder)
                .basePath("/20200901")
                .appendPathParam("oobManagementSavedSearches")
                .appendPathParam(request.getManagementSavedSearchId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.managementdashboard.model.ManagementSavedSearch.class,
                        GetOobManagementSavedSearchResponse.Builder::managementSavedSearch)
                .handleResponseHeaderString(
                        "etag", GetOobManagementSavedSearchResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOobManagementSavedSearchResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ImportDashboardResponse importDashboard(ImportDashboardRequest request) {
        Objects.requireNonNull(
                request.getManagementDashboardImportDetails(),
                "managementDashboardImportDetails is required");

        return clientCall(request, ImportDashboardResponse::builder)
                .logger(LOG, "importDashboard")
                .serviceDetails(
                        "DashxApis",
                        "ImportDashboard",
                        "https://docs.oracle.com/iaas/api/#/en/managementdashboard/20200901/ManagementDashboardImportDetails/ImportDashboard")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ImportDashboardRequest::builder)
                .basePath("/20200901")
                .appendPathParam("managementDashboards")
                .appendPathParam("actions")
                .appendPathParam("importDashboard")
                .appendQueryParam("overrideSameName", request.getOverrideSameName())
                .appendQueryParam(
                        "overrideDashboardCompartmentOcid",
                        request.getOverrideDashboardCompartmentOcid())
                .appendQueryParam(
                        "overrideSavedSearchCompartmentOcid",
                        request.getOverrideSavedSearchCompartmentOcid())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", ImportDashboardResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ImportDashboardResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListManagementDashboardsResponse listManagementDashboards(
            ListManagementDashboardsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListManagementDashboardsResponse::builder)
                .logger(LOG, "listManagementDashboards")
                .serviceDetails(
                        "DashxApis",
                        "ListManagementDashboards",
                        "https://docs.oracle.com/iaas/api/#/en/managementdashboard/20200901/ManagementDashboard/ListManagementDashboards")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagementDashboardsRequest::builder)
                .basePath("/20200901")
                .appendPathParam("managementDashboards")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.managementdashboard.model.ManagementDashboardCollection
                                .class,
                        ListManagementDashboardsResponse.Builder::managementDashboardCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListManagementDashboardsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListManagementDashboardsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListManagementSavedSearchesResponse listManagementSavedSearches(
            ListManagementSavedSearchesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListManagementSavedSearchesResponse::builder)
                .logger(LOG, "listManagementSavedSearches")
                .serviceDetails(
                        "DashxApis",
                        "ListManagementSavedSearches",
                        "https://docs.oracle.com/iaas/api/#/en/managementdashboard/20200901/ManagementSavedSearch/ListManagementSavedSearches")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagementSavedSearchesRequest::builder)
                .basePath("/20200901")
                .appendPathParam("managementSavedSearches")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.managementdashboard.model.ManagementSavedSearchCollection
                                .class,
                        ListManagementSavedSearchesResponse.Builder
                                ::managementSavedSearchCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListManagementSavedSearchesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListManagementSavedSearchesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListOobManagementDashboardsResponse listOobManagementDashboards(
            ListOobManagementDashboardsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOobManagementDashboardsResponse::builder)
                .logger(LOG, "listOobManagementDashboards")
                .serviceDetails(
                        "DashxApis",
                        "ListOobManagementDashboards",
                        "https://docs.oracle.com/iaas/api/#/en/managementdashboard/20200901/ManagementDashboard/ListOobManagementDashboards")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOobManagementDashboardsRequest::builder)
                .basePath("/20200901")
                .appendPathParam("oobManagementDashboards")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.managementdashboard.model.ManagementDashboardCollection
                                .class,
                        ListOobManagementDashboardsResponse.Builder::managementDashboardCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOobManagementDashboardsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOobManagementDashboardsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListOobManagementSavedSearchesResponse listOobManagementSavedSearches(
            ListOobManagementSavedSearchesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOobManagementSavedSearchesResponse::builder)
                .logger(LOG, "listOobManagementSavedSearches")
                .serviceDetails(
                        "DashxApis",
                        "ListOobManagementSavedSearches",
                        "https://docs.oracle.com/iaas/api/#/en/managementdashboard/20200901/ManagementSavedSearch/ListOobManagementSavedSearches")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOobManagementSavedSearchesRequest::builder)
                .basePath("/20200901")
                .appendPathParam("oobManagementSavedSearches")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.managementdashboard.model.ManagementSavedSearchCollection
                                .class,
                        ListOobManagementSavedSearchesResponse.Builder
                                ::managementSavedSearchCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOobManagementSavedSearchesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListOobManagementSavedSearchesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateManagementDashboardResponse updateManagementDashboard(
            UpdateManagementDashboardRequest request) {

        Validate.notBlank(
                request.getManagementDashboardId(), "managementDashboardId must not be blank");
        Objects.requireNonNull(
                request.getUpdateManagementDashboardDetails(),
                "updateManagementDashboardDetails is required");

        return clientCall(request, UpdateManagementDashboardResponse::builder)
                .logger(LOG, "updateManagementDashboard")
                .serviceDetails(
                        "DashxApis",
                        "UpdateManagementDashboard",
                        "https://docs.oracle.com/iaas/api/#/en/managementdashboard/20200901/ManagementDashboard/UpdateManagementDashboard")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateManagementDashboardRequest::builder)
                .basePath("/20200901")
                .appendPathParam("managementDashboards")
                .appendPathParam(request.getManagementDashboardId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.managementdashboard.model.ManagementDashboard.class,
                        UpdateManagementDashboardResponse.Builder::managementDashboard)
                .handleResponseHeaderString("etag", UpdateManagementDashboardResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateManagementDashboardResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateManagementDashboardResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateManagementSavedSearchResponse updateManagementSavedSearch(
            UpdateManagementSavedSearchRequest request) {

        Validate.notBlank(
                request.getManagementSavedSearchId(), "managementSavedSearchId must not be blank");
        Objects.requireNonNull(
                request.getUpdateManagementSavedSearchDetails(),
                "updateManagementSavedSearchDetails is required");

        return clientCall(request, UpdateManagementSavedSearchResponse::builder)
                .logger(LOG, "updateManagementSavedSearch")
                .serviceDetails(
                        "DashxApis",
                        "UpdateManagementSavedSearch",
                        "https://docs.oracle.com/iaas/api/#/en/managementdashboard/20200901/ManagementSavedSearch/UpdateManagementSavedSearch")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateManagementSavedSearchRequest::builder)
                .basePath("/20200901")
                .appendPathParam("managementSavedSearches")
                .appendPathParam(request.getManagementSavedSearchId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.managementdashboard.model.ManagementSavedSearch.class,
                        UpdateManagementSavedSearchResponse.Builder::managementSavedSearch)
                .handleResponseHeaderString(
                        "etag", UpdateManagementSavedSearchResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateManagementSavedSearchResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateManagementSavedSearchResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DashxApisWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DashxApisPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DashxApisClient(
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
    public DashxApisClient(
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
    public DashxApisClient(
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
    public DashxApisClient(
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
    public DashxApisClient(
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
    public DashxApisClient(
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
    public DashxApisClient(
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
    public DashxApisClient(
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
