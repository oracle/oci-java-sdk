/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dblm;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.dblm.requests.*;
import com.oracle.bmc.dblm.responses.*;

import java.util.Objects;

/**
 * Async client implementation for DbLifeCycleManagement service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240102")
public class DbLifeCycleManagementAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DbLifeCycleManagementAsync {
    /** Service instance for DbLifeCycleManagement. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DbLifeCycleManagementClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://dbmgmt.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DbLifeCycleManagementAsyncClient.class);

    DbLifeCycleManagementAsyncClient(
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
                    Builder, DbLifeCycleManagementAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "dblm";
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
        public DbLifeCycleManagementAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DbLifeCycleManagementAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateVulnerabilityScanResponse> createVulnerabilityScan(
            CreateVulnerabilityScanRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateVulnerabilityScanRequest, CreateVulnerabilityScanResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateVulnerabilityScanDetails(),
                "createVulnerabilityScanDetails is required");

        return clientCall(request, CreateVulnerabilityScanResponse::builder)
                .logger(LOG, "createVulnerabilityScan")
                .serviceDetails("DbLifeCycleManagement", "CreateVulnerabilityScan", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVulnerabilityScanRequest::builder)
                .basePath("/20240102")
                .appendPathParam("vulnerabilityScans")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dblm.model.VulnerabilityScan.class,
                        CreateVulnerabilityScanResponse.Builder::vulnerabilityScan)
                .handleResponseHeaderString(
                        "location", CreateVulnerabilityScanResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateVulnerabilityScanResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateVulnerabilityScanResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateVulnerabilityScanResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVulnerabilityScanResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPatchManagementResponse> getPatchManagement(
            GetPatchManagementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPatchManagementRequest, GetPatchManagementResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetPatchManagementResponse::builder)
                .logger(LOG, "getPatchManagement")
                .serviceDetails("DbLifeCycleManagement", "GetPatchManagement", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPatchManagementRequest::builder)
                .basePath("/20240102")
                .appendPathParam("patchManagement")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("databaseRelease", request.getDatabaseRelease())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam(
                        "timeStartedGreaterThanOrEqualTo",
                        request.getTimeStartedGreaterThanOrEqualTo())
                .appendQueryParam("timeStartedLessThan", request.getTimeStartedLessThan())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dblm.model.DblmPatchManagement.class,
                        GetPatchManagementResponse.Builder::dblmPatchManagement)
                .handleResponseHeaderString("etag", GetPatchManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPatchManagementResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetVulnerabilityResponse> getVulnerability(
            GetVulnerabilityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVulnerabilityRequest, GetVulnerabilityResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetVulnerabilityResponse::builder)
                .logger(LOG, "getVulnerability")
                .serviceDetails("DbLifeCycleManagement", "GetVulnerability", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVulnerabilityRequest::builder)
                .basePath("/20240102")
                .appendPathParam("vulnerability")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("databaseRelease", request.getDatabaseRelease())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dblm.model.DblmVulnerability.class,
                        GetVulnerabilityResponse.Builder::dblmVulnerability)
                .handleResponseHeaderString("etag", GetVulnerabilityResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVulnerabilityResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetVulnerabilityScanResponse> getVulnerabilityScan(
            GetVulnerabilityScanRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetVulnerabilityScanRequest, GetVulnerabilityScanResponse>
                    handler) {

        Validate.notBlank(
                request.getVulnerabilityScanId(), "vulnerabilityScanId must not be blank");

        return clientCall(request, GetVulnerabilityScanResponse::builder)
                .logger(LOG, "getVulnerabilityScan")
                .serviceDetails("DbLifeCycleManagement", "GetVulnerabilityScan", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVulnerabilityScanRequest::builder)
                .basePath("/20240102")
                .appendPathParam("vulnerabilityScans")
                .appendPathParam(request.getVulnerabilityScanId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dblm.model.VulnerabilityScan.class,
                        GetVulnerabilityScanResponse.Builder::vulnerabilityScan)
                .handleResponseHeaderString("etag", GetVulnerabilityScanResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVulnerabilityScanResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWorkRequestRequest, GetWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails("DbLifeCycleManagement", "GetWorkRequest", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20240102")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dblm.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAggregatedVulnerabilityDataResponse>
            listAggregatedVulnerabilityData(
                    ListAggregatedVulnerabilityDataRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAggregatedVulnerabilityDataRequest,
                                    ListAggregatedVulnerabilityDataResponse>
                            handler) {

        return clientCall(request, ListAggregatedVulnerabilityDataResponse::builder)
                .logger(LOG, "listAggregatedVulnerabilityData")
                .serviceDetails("DbLifeCycleManagement", "ListAggregatedVulnerabilityData", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAggregatedVulnerabilityDataRequest::builder)
                .basePath("/20240102")
                .appendPathParam("vulnerability")
                .appendPathParam("aggregatedVulnerabilityData")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("timeCreatedGreaterThan", request.getTimeCreatedGreaterThan())
                .appendQueryParam("timeEndedLessThan", request.getTimeEndedLessThan())
                .appendQueryParam("databaseRelease", request.getDatabaseRelease())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dblm.model.AggregatedVulnerabilityCollection.class,
                        ListAggregatedVulnerabilityDataResponse.Builder
                                ::aggregatedVulnerabilityCollection)
                .handleResponseHeaderString(
                        "etag", ListAggregatedVulnerabilityDataResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAggregatedVulnerabilityDataResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDatabasesResponse> listDatabases(
            ListDatabasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDatabasesRequest, ListDatabasesResponse>
                    handler) {

        return clientCall(request, ListDatabasesResponse::builder)
                .logger(LOG, "listDatabases")
                .serviceDetails("DbLifeCycleManagement", "ListDatabases", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDatabasesRequest::builder)
                .basePath("/20240102")
                .appendPathParam("patchManagement")
                .appendPathParam("databases")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("databaseRelease", request.getDatabaseRelease())
                .appendEnumQueryParam("databaseType", request.getDatabaseType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("imageId", request.getImageId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("drifterPatchId", request.getDrifterPatchId())
                .appendEnumQueryParam("imageCompliance", request.getImageCompliance())
                .appendListQueryParam(
                        "severityType",
                        request.getSeverityType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dblm.model.PatchDatabasesCollection.class,
                        ListDatabasesResponse.Builder::patchDatabasesCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDatabasesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListNotificationsResponse> listNotifications(
            ListNotificationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListNotificationsRequest, ListNotificationsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListNotificationsResponse::builder)
                .logger(LOG, "listNotifications")
                .serviceDetails("DbLifeCycleManagement", "ListNotifications", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListNotificationsRequest::builder)
                .basePath("/20240102")
                .appendPathParam("vulnerability")
                .appendPathParam("notifications")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dblm.model.NotificationCollection.class,
                        ListNotificationsResponse.Builder::notificationCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListNotificationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListNotificationsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListVulnerabilitiesResponse> listVulnerabilities(
            ListVulnerabilitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVulnerabilitiesRequest, ListVulnerabilitiesResponse>
                    handler) {

        return clientCall(request, ListVulnerabilitiesResponse::builder)
                .logger(LOG, "listVulnerabilities")
                .serviceDetails("DbLifeCycleManagement", "ListVulnerabilities", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVulnerabilitiesRequest::builder)
                .basePath("/20240102")
                .appendPathParam("vulnerability")
                .appendPathParam("vulnerabilities")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("databaseRelease", request.getDatabaseRelease())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendListQueryParam(
                        "severityType",
                        request.getSeverityType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("searchBy", request.getSearchBy())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dblm.model.VulnerabilityCollection.class,
                        ListVulnerabilitiesResponse.Builder::vulnerabilityCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListVulnerabilitiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListVulnerabilitiesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListVulnerabilityResourcesResponse>
            listVulnerabilityResources(
                    ListVulnerabilityResourcesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListVulnerabilityResourcesRequest,
                                    ListVulnerabilityResourcesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVulnerabilityResourcesResponse::builder)
                .logger(LOG, "listVulnerabilityResources")
                .serviceDetails("DbLifeCycleManagement", "ListVulnerabilityResources", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVulnerabilityResourcesRequest::builder)
                .basePath("/20240102")
                .appendPathParam("vulnerability")
                .appendPathParam("resources")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("databaseRelease", request.getDatabaseRelease())
                .appendQueryParam("cveId", request.getCveId())
                .appendListQueryParam(
                        "severityType",
                        request.getSeverityType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "patchRecommendation",
                        request.getPatchRecommendation(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dblm.model.VulnerabilityResourceCollection.class,
                        ListVulnerabilityResourcesResponse.Builder::vulnerabilityResourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListVulnerabilityResourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListVulnerabilityResourcesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListVulnerabilityScansResponse> listVulnerabilityScans(
            ListVulnerabilityScansRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVulnerabilityScansRequest, ListVulnerabilityScansResponse>
                    handler) {

        return clientCall(request, ListVulnerabilityScansResponse::builder)
                .logger(LOG, "listVulnerabilityScans")
                .serviceDetails("DbLifeCycleManagement", "ListVulnerabilityScans", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVulnerabilityScansRequest::builder)
                .basePath("/20240102")
                .appendPathParam("vulnerabilityScans")
                .appendQueryParam("vulnerabilityScanId", request.getVulnerabilityScanId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("timeCreatedGreaterThan", request.getTimeCreatedGreaterThan())
                .appendQueryParam("timeEndedLessThan", request.getTimeEndedLessThan())
                .appendListQueryParam(
                        "vulnerabilityScanStatus",
                        request.getVulnerabilityScanStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("vulnerabilityScanType", request.getVulnerabilityScanType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dblm.model.VulnerabilityScanCollection.class,
                        ListVulnerabilityScansResponse.Builder::vulnerabilityScanCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListVulnerabilityScansResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListVulnerabilityScansResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails("DbLifeCycleManagement", "ListWorkRequestErrors", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20240102")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dblm.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails("DbLifeCycleManagement", "ListWorkRequestLogs", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20240102")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dblm.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails("DbLifeCycleManagement", "ListWorkRequests", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20240102")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dblm.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DbLifeCycleManagementAsyncClient(
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
    public DbLifeCycleManagementAsyncClient(
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
    public DbLifeCycleManagementAsyncClient(
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
    public DbLifeCycleManagementAsyncClient(
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
    public DbLifeCycleManagementAsyncClient(
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
    public DbLifeCycleManagementAsyncClient(
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
    public DbLifeCycleManagementAsyncClient(
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
