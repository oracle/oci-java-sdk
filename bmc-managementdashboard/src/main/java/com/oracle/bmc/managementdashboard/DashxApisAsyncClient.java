/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementdashboard;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.managementdashboard.requests.*;
import com.oracle.bmc.managementdashboard.responses.*;

import java.util.Objects;

/**
 * Async client implementation for DashxApis service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200901")
public class DashxApisAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DashxApisAsync {
    /** Service instance for DashxApis. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DASHXAPIS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://managementdashboard.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DashxApisAsyncClient.class);

    DashxApisAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DashxApisAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "managementdashboard";
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
        public DashxApisAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DashxApisAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeManagementDashboardsCompartmentResponse>
            changeManagementDashboardsCompartment(
                    ChangeManagementDashboardsCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeManagementDashboardsCompartmentRequest,
                                    ChangeManagementDashboardsCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeManagementSavedSearchesCompartmentResponse>
            changeManagementSavedSearchesCompartment(
                    ChangeManagementSavedSearchesCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeManagementSavedSearchesCompartmentRequest,
                                    ChangeManagementSavedSearchesCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateManagementDashboardResponse> createManagementDashboard(
            CreateManagementDashboardRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateManagementDashboardRequest, CreateManagementDashboardResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateManagementSavedSearchResponse>
            createManagementSavedSearch(
                    CreateManagementSavedSearchRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateManagementSavedSearchRequest,
                                    CreateManagementSavedSearchResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteManagementDashboardResponse> deleteManagementDashboard(
            DeleteManagementDashboardRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteManagementDashboardRequest, DeleteManagementDashboardResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteManagementSavedSearchResponse>
            deleteManagementSavedSearch(
                    DeleteManagementSavedSearchRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteManagementSavedSearchRequest,
                                    DeleteManagementSavedSearchResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ExportDashboardResponse> exportDashboard(
            ExportDashboardRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ExportDashboardRequest, ExportDashboardResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetManagementDashboardResponse> getManagementDashboard(
            GetManagementDashboardRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetManagementDashboardRequest, GetManagementDashboardResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetManagementSavedSearchResponse> getManagementSavedSearch(
            GetManagementSavedSearchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetManagementSavedSearchRequest, GetManagementSavedSearchResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ImportDashboardResponse> importDashboard(
            ImportDashboardRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ImportDashboardRequest, ImportDashboardResponse>
                    handler) {
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
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", ImportDashboardResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ImportDashboardResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListManagementDashboardsResponse> listManagementDashboards(
            ListManagementDashboardsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListManagementDashboardsRequest, ListManagementDashboardsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListManagementSavedSearchesResponse>
            listManagementSavedSearches(
                    ListManagementSavedSearchesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListManagementSavedSearchesRequest,
                                    ListManagementSavedSearchesResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateManagementDashboardResponse> updateManagementDashboard(
            UpdateManagementDashboardRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateManagementDashboardRequest, UpdateManagementDashboardResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateManagementSavedSearchResponse>
            updateManagementSavedSearch(
                    UpdateManagementSavedSearchRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateManagementSavedSearchRequest,
                                    UpdateManagementSavedSearchResponse>
                            handler) {

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
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DashxApisAsyncClient(
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
    public DashxApisAsyncClient(
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
    public DashxApisAsyncClient(
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
    public DashxApisAsyncClient(
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
    public DashxApisAsyncClient(
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
    public DashxApisAsyncClient(
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
    public DashxApisAsyncClient(
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
