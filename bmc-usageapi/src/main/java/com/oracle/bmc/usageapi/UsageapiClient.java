/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.usageapi.requests.*;
import com.oracle.bmc.usageapi.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
public class UsageapiClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements Usageapi {
    /** Service instance for Usageapi. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("USAGEAPI")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://usageapi.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(UsageapiClient.class);

    private final UsageapiWaiters waiters;

    private final UsageapiPaginators paginators;

    UsageapiClient(
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
                                    .nameFormat("Usageapi-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new UsageapiWaiters(executorService, this);

        this.paginators = new UsageapiPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, UsageapiClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "usageapi";
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
        public UsageapiClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new UsageapiClient(this, authenticationDetailsProvider, executorService);
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
    public CreateCustomTableResponse createCustomTable(CreateCustomTableRequest request) {
        Objects.requireNonNull(
                request.getCreateCustomTableDetails(), "createCustomTableDetails is required");

        return clientCall(request, CreateCustomTableResponse::builder)
                .logger(LOG, "createCustomTable")
                .serviceDetails(
                        "Usageapi",
                        "CreateCustomTable",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/CustomTable/CreateCustomTable")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCustomTableRequest::builder)
                .basePath("/20200107")
                .appendPathParam("customTables")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.usageapi.model.CustomTable.class,
                        CreateCustomTableResponse.Builder::customTable)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCustomTableResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateCustomTableResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateQueryResponse createQuery(CreateQueryRequest request) {
        Objects.requireNonNull(request.getCreateQueryDetails(), "createQueryDetails is required");

        return clientCall(request, CreateQueryResponse::builder)
                .logger(LOG, "createQuery")
                .serviceDetails(
                        "Usageapi",
                        "CreateQuery",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Query/CreateQuery")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateQueryRequest::builder)
                .basePath("/20200107")
                .appendPathParam("queries")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.usageapi.model.Query.class,
                        CreateQueryResponse.Builder::query)
                .handleResponseHeaderString(
                        "opc-request-id", CreateQueryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateQueryResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateScheduleResponse createSchedule(CreateScheduleRequest request) {
        Objects.requireNonNull(
                request.getCreateScheduleDetails(), "createScheduleDetails is required");

        return clientCall(request, CreateScheduleResponse::builder)
                .logger(LOG, "createSchedule")
                .serviceDetails(
                        "Usageapi",
                        "CreateSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Schedule/CreateSchedule")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateScheduleRequest::builder)
                .basePath("/20200107")
                .appendPathParam("schedules")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.usageapi.model.Schedule.class,
                        CreateScheduleResponse.Builder::schedule)
                .handleResponseHeaderString(
                        "opc-request-id", CreateScheduleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateScheduleResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateUsageCarbonEmissionsQueryResponse createUsageCarbonEmissionsQuery(
            CreateUsageCarbonEmissionsQueryRequest request) {
        Objects.requireNonNull(
                request.getCreateUsageCarbonEmissionsQueryDetails(),
                "createUsageCarbonEmissionsQueryDetails is required");

        return clientCall(request, CreateUsageCarbonEmissionsQueryResponse::builder)
                .logger(LOG, "createUsageCarbonEmissionsQuery")
                .serviceDetails(
                        "Usageapi",
                        "CreateUsageCarbonEmissionsQuery",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/UsageCarbonEmissionsQuery/CreateUsageCarbonEmissionsQuery")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateUsageCarbonEmissionsQueryRequest::builder)
                .basePath("/20200107")
                .appendPathParam("usageCarbonEmissionsQueries")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.usageapi.model.UsageCarbonEmissionsQuery.class,
                        CreateUsageCarbonEmissionsQueryResponse.Builder::usageCarbonEmissionsQuery)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateUsageCarbonEmissionsQueryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateUsageCarbonEmissionsQueryResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteCustomTableResponse deleteCustomTable(DeleteCustomTableRequest request) {

        Validate.notBlank(request.getCustomTableId(), "customTableId must not be blank");

        return clientCall(request, DeleteCustomTableResponse::builder)
                .logger(LOG, "deleteCustomTable")
                .serviceDetails(
                        "Usageapi",
                        "DeleteCustomTable",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/CustomTable/DeleteCustomTable")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCustomTableRequest::builder)
                .basePath("/20200107")
                .appendPathParam("customTables")
                .appendPathParam(request.getCustomTableId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCustomTableResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteQueryResponse deleteQuery(DeleteQueryRequest request) {

        Validate.notBlank(request.getQueryId(), "queryId must not be blank");

        return clientCall(request, DeleteQueryResponse::builder)
                .logger(LOG, "deleteQuery")
                .serviceDetails(
                        "Usageapi",
                        "DeleteQuery",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Query/DeleteQuery")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteQueryRequest::builder)
                .basePath("/20200107")
                .appendPathParam("queries")
                .appendPathParam(request.getQueryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteQueryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteScheduleResponse deleteSchedule(DeleteScheduleRequest request) {

        Validate.notBlank(request.getScheduleId(), "scheduleId must not be blank");

        return clientCall(request, DeleteScheduleResponse::builder)
                .logger(LOG, "deleteSchedule")
                .serviceDetails(
                        "Usageapi",
                        "DeleteSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Schedule/DeleteSchedule")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteScheduleRequest::builder)
                .basePath("/20200107")
                .appendPathParam("schedules")
                .appendPathParam(request.getScheduleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteScheduleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteUsageCarbonEmissionsQueryResponse deleteUsageCarbonEmissionsQuery(
            DeleteUsageCarbonEmissionsQueryRequest request) {

        Validate.notBlank(
                request.getUsageCarbonEmissionsQueryId(),
                "usageCarbonEmissionsQueryId must not be blank");

        return clientCall(request, DeleteUsageCarbonEmissionsQueryResponse::builder)
                .logger(LOG, "deleteUsageCarbonEmissionsQuery")
                .serviceDetails(
                        "Usageapi",
                        "DeleteUsageCarbonEmissionsQuery",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/UsageCarbonEmissionsQuery/DeleteUsageCarbonEmissionsQuery")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteUsageCarbonEmissionsQueryRequest::builder)
                .basePath("/20200107")
                .appendPathParam("usageCarbonEmissionsQueries")
                .appendPathParam(request.getUsageCarbonEmissionsQueryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteUsageCarbonEmissionsQueryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCustomTableResponse getCustomTable(GetCustomTableRequest request) {

        Validate.notBlank(request.getCustomTableId(), "customTableId must not be blank");

        return clientCall(request, GetCustomTableResponse::builder)
                .logger(LOG, "getCustomTable")
                .serviceDetails(
                        "Usageapi",
                        "GetCustomTable",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/CustomTable/GetCustomTable")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCustomTableRequest::builder)
                .basePath("/20200107")
                .appendPathParam("customTables")
                .appendPathParam(request.getCustomTableId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.CustomTable.class,
                        GetCustomTableResponse.Builder::customTable)
                .handleResponseHeaderString(
                        "opc-request-id", GetCustomTableResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetCustomTableResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetQueryResponse getQuery(GetQueryRequest request) {

        Validate.notBlank(request.getQueryId(), "queryId must not be blank");

        return clientCall(request, GetQueryResponse::builder)
                .logger(LOG, "getQuery")
                .serviceDetails(
                        "Usageapi",
                        "GetQuery",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Query/GetQuery")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetQueryRequest::builder)
                .basePath("/20200107")
                .appendPathParam("queries")
                .appendPathParam(request.getQueryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.Query.class, GetQueryResponse.Builder::query)
                .handleResponseHeaderString(
                        "opc-request-id", GetQueryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetQueryResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetScheduleResponse getSchedule(GetScheduleRequest request) {

        Validate.notBlank(request.getScheduleId(), "scheduleId must not be blank");

        return clientCall(request, GetScheduleResponse::builder)
                .logger(LOG, "getSchedule")
                .serviceDetails(
                        "Usageapi",
                        "GetSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Schedule/GetSchedule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetScheduleRequest::builder)
                .basePath("/20200107")
                .appendPathParam("schedules")
                .appendPathParam(request.getScheduleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.Schedule.class,
                        GetScheduleResponse.Builder::schedule)
                .handleResponseHeaderString(
                        "opc-request-id", GetScheduleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetScheduleResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetScheduledRunResponse getScheduledRun(GetScheduledRunRequest request) {

        Validate.notBlank(request.getScheduledRunId(), "scheduledRunId must not be blank");

        return clientCall(request, GetScheduledRunResponse::builder)
                .logger(LOG, "getScheduledRun")
                .serviceDetails(
                        "Usageapi",
                        "GetScheduledRun",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/ScheduledRun/GetScheduledRun")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetScheduledRunRequest::builder)
                .basePath("/20200107")
                .appendPathParam("scheduledRuns")
                .appendPathParam(request.getScheduledRunId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.ScheduledRun.class,
                        GetScheduledRunResponse.Builder::scheduledRun)
                .handleResponseHeaderString(
                        "opc-request-id", GetScheduledRunResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetScheduledRunResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetUsageCarbonEmissionsQueryResponse getUsageCarbonEmissionsQuery(
            GetUsageCarbonEmissionsQueryRequest request) {

        Validate.notBlank(
                request.getUsageCarbonEmissionsQueryId(),
                "usageCarbonEmissionsQueryId must not be blank");

        return clientCall(request, GetUsageCarbonEmissionsQueryResponse::builder)
                .logger(LOG, "getUsageCarbonEmissionsQuery")
                .serviceDetails(
                        "Usageapi",
                        "GetUsageCarbonEmissionsQuery",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/UsageCarbonEmissionsQuery/GetUsageCarbonEmissionsQuery")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUsageCarbonEmissionsQueryRequest::builder)
                .basePath("/20200107")
                .appendPathParam("usageCarbonEmissionsQueries")
                .appendPathParam(request.getUsageCarbonEmissionsQueryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.UsageCarbonEmissionsQuery.class,
                        GetUsageCarbonEmissionsQueryResponse.Builder::usageCarbonEmissionsQuery)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetUsageCarbonEmissionsQueryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetUsageCarbonEmissionsQueryResponse.Builder::etag)
                .callSync();
    }

    @Override
    public ListCustomTablesResponse listCustomTables(ListCustomTablesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getSavedReportId(), "savedReportId is required");

        return clientCall(request, ListCustomTablesResponse::builder)
                .logger(LOG, "listCustomTables")
                .serviceDetails(
                        "Usageapi",
                        "ListCustomTables",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/CustomTable/ListCustomTables")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCustomTablesRequest::builder)
                .basePath("/20200107")
                .appendPathParam("customTables")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("savedReportId", request.getSavedReportId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.CustomTableCollection.class,
                        ListCustomTablesResponse.Builder::customTableCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCustomTablesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCustomTablesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListQueriesResponse listQueries(ListQueriesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListQueriesResponse::builder)
                .logger(LOG, "listQueries")
                .serviceDetails(
                        "Usageapi",
                        "ListQueries",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Query/ListQueries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListQueriesRequest::builder)
                .basePath("/20200107")
                .appendPathParam("queries")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.QueryCollection.class,
                        ListQueriesResponse.Builder::queryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListQueriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListQueriesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListScheduledRunsResponse listScheduledRuns(ListScheduledRunsRequest request) {
        Objects.requireNonNull(request.getScheduleId(), "scheduleId is required");

        return clientCall(request, ListScheduledRunsResponse::builder)
                .logger(LOG, "listScheduledRuns")
                .serviceDetails(
                        "Usageapi",
                        "ListScheduledRuns",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/ScheduledRun/ListScheduledRuns")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListScheduledRunsRequest::builder)
                .basePath("/20200107")
                .appendPathParam("scheduledRuns")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("scheduleId", request.getScheduleId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.ScheduledRunCollection.class,
                        ListScheduledRunsResponse.Builder::scheduledRunCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListScheduledRunsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListScheduledRunsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListSchedulesResponse listSchedules(ListSchedulesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSchedulesResponse::builder)
                .logger(LOG, "listSchedules")
                .serviceDetails(
                        "Usageapi",
                        "ListSchedules",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Schedule/ListSchedules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSchedulesRequest::builder)
                .basePath("/20200107")
                .appendPathParam("schedules")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("name", request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.ScheduleCollection.class,
                        ListSchedulesResponse.Builder::scheduleCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSchedulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSchedulesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListUsageCarbonEmissionsQueriesResponse listUsageCarbonEmissionsQueries(
            ListUsageCarbonEmissionsQueriesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListUsageCarbonEmissionsQueriesResponse::builder)
                .logger(LOG, "listUsageCarbonEmissionsQueries")
                .serviceDetails(
                        "Usageapi",
                        "ListUsageCarbonEmissionsQueries",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/UsageCarbonEmissionsQuery/ListUsageCarbonEmissionsQueries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUsageCarbonEmissionsQueriesRequest::builder)
                .basePath("/20200107")
                .appendPathParam("usageCarbonEmissionsQueries")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.UsageCarbonEmissionsQueryCollection.class,
                        ListUsageCarbonEmissionsQueriesResponse.Builder
                                ::usageCarbonEmissionsQueryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListUsageCarbonEmissionsQueriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListUsageCarbonEmissionsQueriesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RequestAverageCarbonEmissionResponse requestAverageCarbonEmission(
            RequestAverageCarbonEmissionRequest request) {

        Validate.notBlank(request.getSkuPartNumber(), "skuPartNumber must not be blank");

        return clientCall(request, RequestAverageCarbonEmissionResponse::builder)
                .logger(LOG, "requestAverageCarbonEmission")
                .serviceDetails(
                        "Usageapi",
                        "RequestAverageCarbonEmission",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/AverageCarbonEmission/RequestAverageCarbonEmission")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(RequestAverageCarbonEmissionRequest::builder)
                .basePath("/20200107")
                .appendPathParam("averageCarbonEmissions")
                .appendPathParam(request.getSkuPartNumber())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.AverageCarbonEmission.class,
                        RequestAverageCarbonEmissionResponse.Builder::averageCarbonEmission)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestAverageCarbonEmissionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", RequestAverageCarbonEmissionResponse.Builder::etag)
                .callSync();
    }

    @Override
    public RequestCleanEnergyUsageResponse requestCleanEnergyUsage(
            RequestCleanEnergyUsageRequest request) {

        Validate.notBlank(request.getRegion(), "region must not be blank");

        return clientCall(request, RequestCleanEnergyUsageResponse::builder)
                .logger(LOG, "requestCleanEnergyUsage")
                .serviceDetails(
                        "Usageapi",
                        "RequestCleanEnergyUsage",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/CleanEnergyUsage/RequestCleanEnergyUsage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(RequestCleanEnergyUsageRequest::builder)
                .basePath("/20200107")
                .appendPathParam("cleanEnergyUsages")
                .appendPathParam(request.getRegion())
                .appendQueryParam("ad", request.getAd())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.CleanEnergyUsage.class,
                        RequestCleanEnergyUsageResponse.Builder::cleanEnergyUsage)
                .handleResponseHeaderString(
                        "opc-request-id", RequestCleanEnergyUsageResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", RequestCleanEnergyUsageResponse.Builder::etag)
                .callSync();
    }

    @Override
    public RequestSummarizedConfigurationsResponse requestSummarizedConfigurations(
            RequestSummarizedConfigurationsRequest request) {
        Objects.requireNonNull(request.getTenantId(), "tenantId is required");

        return clientCall(request, RequestSummarizedConfigurationsResponse::builder)
                .logger(LOG, "requestSummarizedConfigurations")
                .serviceDetails(
                        "Usageapi",
                        "RequestSummarizedConfigurations",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Configuration/RequestSummarizedConfigurations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(RequestSummarizedConfigurationsRequest::builder)
                .basePath("/20200107")
                .appendPathParam("configuration")
                .appendQueryParam("tenantId", request.getTenantId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.ConfigurationAggregation.class,
                        RequestSummarizedConfigurationsResponse.Builder::configurationAggregation)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestSummarizedConfigurationsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RequestSummarizedUsagesResponse requestSummarizedUsages(
            RequestSummarizedUsagesRequest request) {
        Objects.requireNonNull(
                request.getRequestSummarizedUsagesDetails(),
                "requestSummarizedUsagesDetails is required");

        return clientCall(request, RequestSummarizedUsagesResponse::builder)
                .logger(LOG, "requestSummarizedUsages")
                .serviceDetails(
                        "Usageapi",
                        "RequestSummarizedUsages",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/UsageSummary/RequestSummarizedUsages")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestSummarizedUsagesRequest::builder)
                .basePath("/20200107")
                .appendPathParam("usage")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.usageapi.model.UsageAggregation.class,
                        RequestSummarizedUsagesResponse.Builder::usageAggregation)
                .handleResponseHeaderString(
                        "opc-request-id", RequestSummarizedUsagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", RequestSummarizedUsagesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RequestUsageCarbonEmissionConfigResponse requestUsageCarbonEmissionConfig(
            RequestUsageCarbonEmissionConfigRequest request) {
        Objects.requireNonNull(request.getTenantId(), "tenantId is required");

        return clientCall(request, RequestUsageCarbonEmissionConfigResponse::builder)
                .logger(LOG, "requestUsageCarbonEmissionConfig")
                .serviceDetails(
                        "Usageapi",
                        "RequestUsageCarbonEmissionConfig",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Configuration/RequestUsageCarbonEmissionConfig")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(RequestUsageCarbonEmissionConfigRequest::builder)
                .basePath("/20200107")
                .appendPathParam("usageCarbonEmissionsConfig")
                .appendQueryParam("tenantId", request.getTenantId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.usageapi.model.ConfigurationAggregation.class,
                        RequestUsageCarbonEmissionConfigResponse.Builder::configurationAggregation)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestUsageCarbonEmissionConfigResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RequestUsageCarbonEmissionsResponse requestUsageCarbonEmissions(
            RequestUsageCarbonEmissionsRequest request) {
        Objects.requireNonNull(
                request.getRequestUsageCarbonEmissionsDetails(),
                "requestUsageCarbonEmissionsDetails is required");

        return clientCall(request, RequestUsageCarbonEmissionsResponse::builder)
                .logger(LOG, "requestUsageCarbonEmissions")
                .serviceDetails(
                        "Usageapi",
                        "RequestUsageCarbonEmissions",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/UsageCarbonEmissionSummary/RequestUsageCarbonEmissions")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestUsageCarbonEmissionsRequest::builder)
                .basePath("/20200107")
                .appendPathParam("usageCarbonEmissions")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.usageapi.model.UsageCarbonEmissionAggregation.class,
                        RequestUsageCarbonEmissionsResponse.Builder::usageCarbonEmissionAggregation)
                .handleResponseHeaderString(
                        "opc-request-id", RequestUsageCarbonEmissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", RequestUsageCarbonEmissionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateCustomTableResponse updateCustomTable(UpdateCustomTableRequest request) {
        Objects.requireNonNull(
                request.getUpdateCustomTableDetails(), "updateCustomTableDetails is required");

        Validate.notBlank(request.getCustomTableId(), "customTableId must not be blank");

        return clientCall(request, UpdateCustomTableResponse::builder)
                .logger(LOG, "updateCustomTable")
                .serviceDetails(
                        "Usageapi",
                        "UpdateCustomTable",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/CustomTable/UpdateCustomTable")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCustomTableRequest::builder)
                .basePath("/20200107")
                .appendPathParam("customTables")
                .appendPathParam(request.getCustomTableId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.usageapi.model.CustomTable.class,
                        UpdateCustomTableResponse.Builder::customTable)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCustomTableResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateCustomTableResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateQueryResponse updateQuery(UpdateQueryRequest request) {
        Objects.requireNonNull(request.getUpdateQueryDetails(), "updateQueryDetails is required");

        Validate.notBlank(request.getQueryId(), "queryId must not be blank");

        return clientCall(request, UpdateQueryResponse::builder)
                .logger(LOG, "updateQuery")
                .serviceDetails(
                        "Usageapi",
                        "UpdateQuery",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Query/UpdateQuery")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateQueryRequest::builder)
                .basePath("/20200107")
                .appendPathParam("queries")
                .appendPathParam(request.getQueryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.usageapi.model.Query.class,
                        UpdateQueryResponse.Builder::query)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateQueryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateQueryResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateScheduleResponse updateSchedule(UpdateScheduleRequest request) {
        Objects.requireNonNull(
                request.getUpdateScheduleDetails(), "updateScheduleDetails is required");

        Validate.notBlank(request.getScheduleId(), "scheduleId must not be blank");

        return clientCall(request, UpdateScheduleResponse::builder)
                .logger(LOG, "updateSchedule")
                .serviceDetails(
                        "Usageapi",
                        "UpdateSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/Schedule/UpdateSchedule")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateScheduleRequest::builder)
                .basePath("/20200107")
                .appendPathParam("schedules")
                .appendPathParam(request.getScheduleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.usageapi.model.Schedule.class,
                        UpdateScheduleResponse.Builder::schedule)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateScheduleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateScheduleResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateUsageCarbonEmissionsQueryResponse updateUsageCarbonEmissionsQuery(
            UpdateUsageCarbonEmissionsQueryRequest request) {
        Objects.requireNonNull(
                request.getUpdateUsageCarbonEmissionsQueryDetails(),
                "updateUsageCarbonEmissionsQueryDetails is required");

        Validate.notBlank(
                request.getUsageCarbonEmissionsQueryId(),
                "usageCarbonEmissionsQueryId must not be blank");

        return clientCall(request, UpdateUsageCarbonEmissionsQueryResponse::builder)
                .logger(LOG, "updateUsageCarbonEmissionsQuery")
                .serviceDetails(
                        "Usageapi",
                        "UpdateUsageCarbonEmissionsQuery",
                        "https://docs.oracle.com/iaas/api/#/en/usage/20200107/UsageCarbonEmissionsQuery/UpdateUsageCarbonEmissionsQuery")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateUsageCarbonEmissionsQueryRequest::builder)
                .basePath("/20200107")
                .appendPathParam("usageCarbonEmissionsQueries")
                .appendPathParam(request.getUsageCarbonEmissionsQueryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.usageapi.model.UsageCarbonEmissionsQuery.class,
                        UpdateUsageCarbonEmissionsQueryResponse.Builder::usageCarbonEmissionsQuery)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateUsageCarbonEmissionsQueryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateUsageCarbonEmissionsQueryResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UsageapiWaiters getWaiters() {
        return waiters;
    }

    @Override
    public UsageapiPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public UsageapiClient(
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
    public UsageapiClient(
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
    public UsageapiClient(
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
    public UsageapiClient(
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
    public UsageapiClient(
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
    public UsageapiClient(
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
    public UsageapiClient(
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
    public UsageapiClient(
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
