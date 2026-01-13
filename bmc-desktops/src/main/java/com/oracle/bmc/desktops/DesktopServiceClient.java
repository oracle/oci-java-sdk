/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.desktops.requests.*;
import com.oracle.bmc.desktops.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
public class DesktopServiceClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements DesktopService {
    /** Service instance for DesktopService. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DesktopServiceClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://api.desktops.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DesktopServiceClient.class);

    private final DesktopServiceWaiters waiters;

    private final DesktopServicePaginators paginators;

    DesktopServiceClient(
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
                                    .nameFormat("DesktopService-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DesktopServiceWaiters(executorService, this);

        this.paginators = new DesktopServicePaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DesktopServiceClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "desktops";
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
        public DesktopServiceClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DesktopServiceClient(this, authenticationDetailsProvider, executorService);
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
    public CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, CancelWorkRequestResponse::builder)
                .logger(LOG, "cancelWorkRequest")
                .serviceDetails(
                        "DesktopService",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/secure-desktops/20220618/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20220618")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeDesktopPoolCompartmentResponse changeDesktopPoolCompartment(
            ChangeDesktopPoolCompartmentRequest request) {

        Validate.notBlank(request.getDesktopPoolId(), "desktopPoolId must not be blank");
        Objects.requireNonNull(
                request.getChangeDesktopPoolCompartmentDetails(),
                "changeDesktopPoolCompartmentDetails is required");

        return clientCall(request, ChangeDesktopPoolCompartmentResponse::builder)
                .logger(LOG, "changeDesktopPoolCompartment")
                .serviceDetails(
                        "DesktopService",
                        "ChangeDesktopPoolCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/secure-desktops/20220618/DesktopPool/ChangeDesktopPoolCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDesktopPoolCompartmentRequest::builder)
                .basePath("/20220618")
                .appendPathParam("desktopPools")
                .appendPathParam(request.getDesktopPoolId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDesktopPoolCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDesktopPoolCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateDesktopPoolResponse createDesktopPool(CreateDesktopPoolRequest request) {
        Objects.requireNonNull(
                request.getCreateDesktopPoolDetails(), "createDesktopPoolDetails is required");

        return clientCall(request, CreateDesktopPoolResponse::builder)
                .logger(LOG, "createDesktopPool")
                .serviceDetails(
                        "DesktopService",
                        "CreateDesktopPool",
                        "https://docs.oracle.com/iaas/api/#/en/secure-desktops/20220618/DesktopPool/CreateDesktopPool")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDesktopPoolRequest::builder)
                .basePath("/20220618")
                .appendPathParam("desktopPools")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.desktops.model.DesktopPool.class,
                        CreateDesktopPoolResponse.Builder::desktopPool)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDesktopPoolResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateDesktopPoolResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("Location", CreateDesktopPoolResponse.Builder::location)
                .handleResponseHeaderString(
                        "Content-Location", CreateDesktopPoolResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateDesktopPoolResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteDesktopResponse deleteDesktop(DeleteDesktopRequest request) {

        Validate.notBlank(request.getDesktopId(), "desktopId must not be blank");

        return clientCall(request, DeleteDesktopResponse::builder)
                .logger(LOG, "deleteDesktop")
                .serviceDetails(
                        "DesktopService",
                        "DeleteDesktop",
                        "https://docs.oracle.com/iaas/api/#/en/secure-desktops/20220618/Desktop/DeleteDesktop")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDesktopRequest::builder)
                .basePath("/20220618")
                .appendPathParam("desktops")
                .appendPathParam(request.getDesktopId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDesktopResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteDesktopResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteDesktopPoolResponse deleteDesktopPool(DeleteDesktopPoolRequest request) {

        Validate.notBlank(request.getDesktopPoolId(), "desktopPoolId must not be blank");

        return clientCall(request, DeleteDesktopPoolResponse::builder)
                .logger(LOG, "deleteDesktopPool")
                .serviceDetails(
                        "DesktopService",
                        "DeleteDesktopPool",
                        "https://docs.oracle.com/iaas/api/#/en/secure-desktops/20220618/DesktopPool/DeleteDesktopPool")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDesktopPoolRequest::builder)
                .basePath("/20220618")
                .appendPathParam("desktopPools")
                .appendPathParam(request.getDesktopPoolId())
                .appendQueryParam("areVolumesPreserved", request.getAreVolumesPreserved())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDesktopPoolResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteDesktopPoolResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public GetDesktopResponse getDesktop(GetDesktopRequest request) {

        Validate.notBlank(request.getDesktopId(), "desktopId must not be blank");

        return clientCall(request, GetDesktopResponse::builder)
                .logger(LOG, "getDesktop")
                .serviceDetails(
                        "DesktopService",
                        "GetDesktop",
                        "https://docs.oracle.com/iaas/api/#/en/secure-desktops/20220618/Desktop/GetDesktop")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDesktopRequest::builder)
                .basePath("/20220618")
                .appendPathParam("desktops")
                .appendPathParam(request.getDesktopId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.desktops.model.Desktop.class,
                        GetDesktopResponse.Builder::desktop)
                .handleResponseHeaderString(
                        "opc-request-id", GetDesktopResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetDesktopResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetDesktopPoolResponse getDesktopPool(GetDesktopPoolRequest request) {

        Validate.notBlank(request.getDesktopPoolId(), "desktopPoolId must not be blank");

        return clientCall(request, GetDesktopPoolResponse::builder)
                .logger(LOG, "getDesktopPool")
                .serviceDetails(
                        "DesktopService",
                        "GetDesktopPool",
                        "https://docs.oracle.com/iaas/api/#/en/secure-desktops/20220618/DesktopPool/GetDesktopPool")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDesktopPoolRequest::builder)
                .basePath("/20220618")
                .appendPathParam("desktopPools")
                .appendPathParam(request.getDesktopPoolId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.desktops.model.DesktopPool.class,
                        GetDesktopPoolResponse.Builder::desktopPool)
                .handleResponseHeaderString(
                        "opc-request-id", GetDesktopPoolResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetDesktopPoolResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "DesktopService",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/secure-desktops/20220618/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20220618")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.desktops.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListDesktopPoolDesktopsResponse listDesktopPoolDesktops(
            ListDesktopPoolDesktopsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(request.getDesktopPoolId(), "desktopPoolId must not be blank");

        return clientCall(request, ListDesktopPoolDesktopsResponse::builder)
                .logger(LOG, "listDesktopPoolDesktops")
                .serviceDetails(
                        "DesktopService",
                        "ListDesktopPoolDesktops",
                        "https://docs.oracle.com/iaas/api/#/en/secure-desktops/20220618/DesktopPool/ListDesktopPoolDesktops")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDesktopPoolDesktopsRequest::builder)
                .basePath("/20220618")
                .appendPathParam("desktopPools")
                .appendPathParam(request.getDesktopPoolId())
                .appendPathParam("desktops")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.desktops.model.DesktopPoolDesktopCollection.class,
                        ListDesktopPoolDesktopsResponse.Builder::desktopPoolDesktopCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDesktopPoolDesktopsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDesktopPoolDesktopsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDesktopPoolVolumesResponse listDesktopPoolVolumes(
            ListDesktopPoolVolumesRequest request) {

        Validate.notBlank(request.getDesktopPoolId(), "desktopPoolId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDesktopPoolVolumesResponse::builder)
                .logger(LOG, "listDesktopPoolVolumes")
                .serviceDetails(
                        "DesktopService",
                        "ListDesktopPoolVolumes",
                        "https://docs.oracle.com/iaas/api/#/en/secure-desktops/20220618/DesktopPool/ListDesktopPoolVolumes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDesktopPoolVolumesRequest::builder)
                .basePath("/20220618")
                .appendPathParam("desktopPools")
                .appendPathParam(request.getDesktopPoolId())
                .appendPathParam("volumes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.desktops.model.DesktopPoolVolumeCollection.class,
                        ListDesktopPoolVolumesResponse.Builder::desktopPoolVolumeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDesktopPoolVolumesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDesktopPoolVolumesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDesktopPoolsResponse listDesktopPools(ListDesktopPoolsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDesktopPoolsResponse::builder)
                .logger(LOG, "listDesktopPools")
                .serviceDetails(
                        "DesktopService",
                        "ListDesktopPools",
                        "https://docs.oracle.com/iaas/api/#/en/secure-desktops/20220618/DesktopPool/ListDesktopPools")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDesktopPoolsRequest::builder)
                .basePath("/20220618")
                .appendPathParam("desktopPools")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.desktops.model.DesktopPoolCollection.class,
                        ListDesktopPoolsResponse.Builder::desktopPoolCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDesktopPoolsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDesktopPoolsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDesktopsResponse listDesktops(ListDesktopsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDesktopsResponse::builder)
                .logger(LOG, "listDesktops")
                .serviceDetails(
                        "DesktopService",
                        "ListDesktops",
                        "https://docs.oracle.com/iaas/api/#/en/secure-desktops/20220618/Desktop/ListDesktops")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDesktopsRequest::builder)
                .basePath("/20220618")
                .appendPathParam("desktops")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("desktopPoolId", request.getDesktopPoolId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.desktops.model.DesktopCollection.class,
                        ListDesktopsResponse.Builder::desktopCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDesktopsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDesktopsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "DesktopService",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/secure-desktops/20220618/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20220618")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.desktops.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "DesktopService",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/secure-desktops/20220618/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20220618")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.desktops.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "DesktopService",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/secure-desktops/20220618/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20220618")
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.desktops.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public StartDesktopResponse startDesktop(StartDesktopRequest request) {

        Validate.notBlank(request.getDesktopId(), "desktopId must not be blank");

        return clientCall(request, StartDesktopResponse::builder)
                .logger(LOG, "startDesktop")
                .serviceDetails(
                        "DesktopService",
                        "StartDesktop",
                        "https://docs.oracle.com/iaas/api/#/en/secure-desktops/20220618/Desktop/StartDesktop")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartDesktopRequest::builder)
                .basePath("/20220618")
                .appendPathParam("desktops")
                .appendPathParam(request.getDesktopId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", StartDesktopResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", StartDesktopResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public StartDesktopPoolResponse startDesktopPool(StartDesktopPoolRequest request) {

        Validate.notBlank(request.getDesktopPoolId(), "desktopPoolId must not be blank");

        return clientCall(request, StartDesktopPoolResponse::builder)
                .logger(LOG, "startDesktopPool")
                .serviceDetails(
                        "DesktopService",
                        "StartDesktopPool",
                        "https://docs.oracle.com/iaas/api/#/en/secure-desktops/20220618/DesktopPool/StartDesktopPool")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartDesktopPoolRequest::builder)
                .basePath("/20220618")
                .appendPathParam("desktopPools")
                .appendPathParam(request.getDesktopPoolId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", StartDesktopPoolResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", StartDesktopPoolResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public StopDesktopResponse stopDesktop(StopDesktopRequest request) {

        Validate.notBlank(request.getDesktopId(), "desktopId must not be blank");

        return clientCall(request, StopDesktopResponse::builder)
                .logger(LOG, "stopDesktop")
                .serviceDetails(
                        "DesktopService",
                        "StopDesktop",
                        "https://docs.oracle.com/iaas/api/#/en/secure-desktops/20220618/Desktop/StopDesktop")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopDesktopRequest::builder)
                .basePath("/20220618")
                .appendPathParam("desktops")
                .appendPathParam(request.getDesktopId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .appendQueryParam("isSoftStop", request.getIsSoftStop())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", StopDesktopResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", StopDesktopResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public StopDesktopPoolResponse stopDesktopPool(StopDesktopPoolRequest request) {

        Validate.notBlank(request.getDesktopPoolId(), "desktopPoolId must not be blank");

        return clientCall(request, StopDesktopPoolResponse::builder)
                .logger(LOG, "stopDesktopPool")
                .serviceDetails(
                        "DesktopService",
                        "StopDesktopPool",
                        "https://docs.oracle.com/iaas/api/#/en/secure-desktops/20220618/DesktopPool/StopDesktopPool")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopDesktopPoolRequest::builder)
                .basePath("/20220618")
                .appendPathParam("desktopPools")
                .appendPathParam(request.getDesktopPoolId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", StopDesktopPoolResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", StopDesktopPoolResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateDesktopResponse updateDesktop(UpdateDesktopRequest request) {

        Validate.notBlank(request.getDesktopId(), "desktopId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDesktopDetails(), "updateDesktopDetails is required");

        return clientCall(request, UpdateDesktopResponse::builder)
                .logger(LOG, "updateDesktop")
                .serviceDetails(
                        "DesktopService",
                        "UpdateDesktop",
                        "https://docs.oracle.com/iaas/api/#/en/secure-desktops/20220618/Desktop/UpdateDesktop")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDesktopRequest::builder)
                .basePath("/20220618")
                .appendPathParam("desktops")
                .appendPathParam(request.getDesktopId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDesktopResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateDesktopResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateDesktopPoolResponse updateDesktopPool(UpdateDesktopPoolRequest request) {

        Validate.notBlank(request.getDesktopPoolId(), "desktopPoolId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDesktopPoolDetails(), "updateDesktopPoolDetails is required");

        return clientCall(request, UpdateDesktopPoolResponse::builder)
                .logger(LOG, "updateDesktopPool")
                .serviceDetails(
                        "DesktopService",
                        "UpdateDesktopPool",
                        "https://docs.oracle.com/iaas/api/#/en/secure-desktops/20220618/DesktopPool/UpdateDesktopPool")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDesktopPoolRequest::builder)
                .basePath("/20220618")
                .appendPathParam("desktopPools")
                .appendPathParam(request.getDesktopPoolId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDesktopPoolResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateDesktopPoolResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DesktopServiceWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DesktopServicePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DesktopServiceClient(
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
    public DesktopServiceClient(
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
    public DesktopServiceClient(
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
    public DesktopServiceClient(
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
    public DesktopServiceClient(
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
    public DesktopServiceClient(
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
    public DesktopServiceClient(
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
    public DesktopServiceClient(
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
