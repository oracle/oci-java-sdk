/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dblm;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.dblm.requests.*;
import com.oracle.bmc.dblm.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240102")
public class DbLifeCycleManagementClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements DbLifeCycleManagement {
    /** Service instance for DbLifeCycleManagement. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DBLIFECYCLEMANAGEMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://dbmgmt.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DbLifeCycleManagementClient.class);

    private final DbLifeCycleManagementWaiters waiters;

    private final DbLifeCycleManagementPaginators paginators;

    DbLifeCycleManagementClient(
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
                                    .nameFormat("DbLifeCycleManagement-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DbLifeCycleManagementWaiters(executorService, this);

        this.paginators = new DbLifeCycleManagementPaginators(this);
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
                    Builder, DbLifeCycleManagementClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "dblm";
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
        public DbLifeCycleManagementClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DbLifeCycleManagementClient(
                    this, authenticationDetailsProvider, executorService);
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
    public CreateVulnerabilityScanResponse createVulnerabilityScan(
            CreateVulnerabilityScanRequest request) {
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public GetVulnerabilityResponse getVulnerability(GetVulnerabilityRequest request) {
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dblm.model.DblmVulnerability.class,
                        GetVulnerabilityResponse.Builder::dblmVulnerability)
                .handleResponseHeaderString("etag", GetVulnerabilityResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVulnerabilityResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVulnerabilityScanResponse getVulnerabilityScan(GetVulnerabilityScanRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dblm.model.VulnerabilityScan.class,
                        GetVulnerabilityScanResponse.Builder::vulnerabilityScan)
                .handleResponseHeaderString("etag", GetVulnerabilityScanResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVulnerabilityScanResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dblm.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListAggregatedVulnerabilityDataResponse listAggregatedVulnerabilityData(
            ListAggregatedVulnerabilityDataRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dblm.model.AggregatedVulnerabilityCollection.class,
                        ListAggregatedVulnerabilityDataResponse.Builder
                                ::aggregatedVulnerabilityCollection)
                .handleResponseHeaderString(
                        "etag", ListAggregatedVulnerabilityDataResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAggregatedVulnerabilityDataResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListNotificationsResponse listNotifications(ListNotificationsRequest request) {
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dblm.model.NotificationCollection.class,
                        ListNotificationsResponse.Builder::notificationCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListNotificationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListNotificationsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListVulnerabilitiesResponse listVulnerabilities(ListVulnerabilitiesRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dblm.model.VulnerabilityCollection.class,
                        ListVulnerabilitiesResponse.Builder::vulnerabilityCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListVulnerabilitiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListVulnerabilitiesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListVulnerabilityResourcesResponse listVulnerabilityResources(
            ListVulnerabilityResourcesRequest request) {
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dblm.model.VulnerabilityResourceCollection.class,
                        ListVulnerabilityResourcesResponse.Builder::vulnerabilityResourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListVulnerabilityResourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListVulnerabilityResourcesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListVulnerabilityScansResponse listVulnerabilityScans(
            ListVulnerabilityScansRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dblm.model.VulnerabilityScanCollection.class,
                        ListVulnerabilityScansResponse.Builder::vulnerabilityScanCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListVulnerabilityScansResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListVulnerabilityScansResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dblm.model.WorkRequestErrorCollection.class,
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dblm.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dblm.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public DbLifeCycleManagementWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DbLifeCycleManagementPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DbLifeCycleManagementClient(
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
    public DbLifeCycleManagementClient(
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
    public DbLifeCycleManagementClient(
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
    public DbLifeCycleManagementClient(
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
    public DbLifeCycleManagementClient(
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
    public DbLifeCycleManagementClient(
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
    public DbLifeCycleManagementClient(
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
    public DbLifeCycleManagementClient(
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
