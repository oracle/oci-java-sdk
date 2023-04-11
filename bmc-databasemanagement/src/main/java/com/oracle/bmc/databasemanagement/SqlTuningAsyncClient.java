/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;

import java.util.Objects;

/**
 * Async client implementation for SqlTuning service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class SqlTuningAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements SqlTuningAsync {
    /** Service instance for SqlTuning. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("SQLTUNING")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://dbmgmt.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SqlTuningAsyncClient.class);

    SqlTuningAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, SqlTuningAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
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
        public SqlTuningAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new SqlTuningAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CloneSqlTuningTaskResponse> cloneSqlTuningTask(
            CloneSqlTuningTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CloneSqlTuningTaskRequest, CloneSqlTuningTaskResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getCloneSqlTuningTaskDetails(), "cloneSqlTuningTaskDetails is required");

        return clientCall(request, CloneSqlTuningTaskResponse::builder)
                .logger(LOG, "cloneSqlTuningTask")
                .serviceDetails(
                        "SqlTuning",
                        "CloneSqlTuningTask",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/CloneSqlTuningTask")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CloneSqlTuningTaskRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("cloneSqlTuningTask")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.SqlTuningTaskReturn.class,
                        CloneSqlTuningTaskResponse.Builder::sqlTuningTaskReturn)
                .handleResponseHeaderString(
                        "opc-request-id", CloneSqlTuningTaskResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DropSqlTuningTaskResponse> dropSqlTuningTask(
            DropSqlTuningTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DropSqlTuningTaskRequest, DropSqlTuningTaskResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getDropSqlTuningTaskDetails(), "dropSqlTuningTaskDetails is required");

        return clientCall(request, DropSqlTuningTaskResponse::builder)
                .logger(LOG, "dropSqlTuningTask")
                .serviceDetails(
                        "SqlTuning",
                        "DropSqlTuningTask",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/DropSqlTuningTask")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DropSqlTuningTaskRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("dropSqlTuningTask")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", DropSqlTuningTaskResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetExecutionPlanStatsComparisionResponse>
            getExecutionPlanStatsComparision(
                    GetExecutionPlanStatsComparisionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetExecutionPlanStatsComparisionRequest,
                                    GetExecutionPlanStatsComparisionResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Objects.requireNonNull(request.getSqlObjectId(), "sqlObjectId is required");

        Objects.requireNonNull(request.getExecutionId(), "executionId is required");

        return clientCall(request, GetExecutionPlanStatsComparisionResponse::builder)
                .logger(LOG, "getExecutionPlanStatsComparision")
                .serviceDetails(
                        "SqlTuning",
                        "GetExecutionPlanStatsComparision",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetExecutionPlanStatsComparision")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExecutionPlanStatsComparisionRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlTuningAdvisorTasks")
                .appendPathParam(request.getSqlTuningAdvisorTaskId())
                .appendPathParam("executionPlanStatsComparision")
                .appendQueryParam("sqlObjectId", request.getSqlObjectId())
                .appendQueryParam("executionId", request.getExecutionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.ExecutionPlanStatsComparision.class,
                        GetExecutionPlanStatsComparisionResponse.Builder
                                ::executionPlanStatsComparision)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetExecutionPlanStatsComparisionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSqlExecutionPlanResponse> getSqlExecutionPlan(
            GetSqlExecutionPlanRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSqlExecutionPlanRequest, GetSqlExecutionPlanResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Objects.requireNonNull(request.getSqlObjectId(), "sqlObjectId is required");

        Objects.requireNonNull(request.getAttribute(), "attribute is required");

        return clientCall(request, GetSqlExecutionPlanResponse::builder)
                .logger(LOG, "getSqlExecutionPlan")
                .serviceDetails(
                        "SqlTuning",
                        "GetSqlExecutionPlan",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetSqlExecutionPlan")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSqlExecutionPlanRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlTuningAdvisorTasks")
                .appendPathParam(request.getSqlTuningAdvisorTaskId())
                .appendPathParam("sqlExecutionPlan")
                .appendQueryParam("sqlObjectId", request.getSqlObjectId())
                .appendEnumQueryParam("attribute", request.getAttribute())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.SqlTuningAdvisorTaskSqlExecutionPlan
                                .class,
                        GetSqlExecutionPlanResponse.Builder::sqlTuningAdvisorTaskSqlExecutionPlan)
                .handleResponseHeaderString(
                        "opc-request-id", GetSqlExecutionPlanResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSqlTuningAdvisorTaskSummaryReportResponse>
            getSqlTuningAdvisorTaskSummaryReport(
                    GetSqlTuningAdvisorTaskSummaryReportRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetSqlTuningAdvisorTaskSummaryReportRequest,
                                    GetSqlTuningAdvisorTaskSummaryReportResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, GetSqlTuningAdvisorTaskSummaryReportResponse::builder)
                .logger(LOG, "getSqlTuningAdvisorTaskSummaryReport")
                .serviceDetails(
                        "SqlTuning",
                        "GetSqlTuningAdvisorTaskSummaryReport",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/GetSqlTuningAdvisorTaskSummaryReport")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSqlTuningAdvisorTaskSummaryReportRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlTuningAdvisorTasks")
                .appendPathParam(request.getSqlTuningAdvisorTaskId())
                .appendPathParam("summaryReport")
                .appendEnumQueryParam("searchPeriod", request.getSearchPeriod())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendQueryParam(
                        "beginExecIdGreaterThanOrEqualTo",
                        request.getBeginExecIdGreaterThanOrEqualTo())
                .appendQueryParam(
                        "endExecIdLessThanOrEqualTo", request.getEndExecIdLessThanOrEqualTo())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.SqlTuningAdvisorTaskSummaryReport
                                .class,
                        GetSqlTuningAdvisorTaskSummaryReportResponse.Builder
                                ::sqlTuningAdvisorTaskSummaryReport)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetSqlTuningAdvisorTaskSummaryReportResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSqlTuningAdvisorTaskFindingsResponse>
            listSqlTuningAdvisorTaskFindings(
                    ListSqlTuningAdvisorTaskFindingsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSqlTuningAdvisorTaskFindingsRequest,
                                    ListSqlTuningAdvisorTaskFindingsResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, ListSqlTuningAdvisorTaskFindingsResponse::builder)
                .logger(LOG, "listSqlTuningAdvisorTaskFindings")
                .serviceDetails(
                        "SqlTuning",
                        "ListSqlTuningAdvisorTaskFindings",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListSqlTuningAdvisorTaskFindings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSqlTuningAdvisorTaskFindingsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlTuningAdvisorTasks")
                .appendPathParam(request.getSqlTuningAdvisorTaskId())
                .appendPathParam("findings")
                .appendQueryParam("beginExecId", request.getBeginExecId())
                .appendQueryParam("endExecId", request.getEndExecId())
                .appendEnumQueryParam("searchPeriod", request.getSearchPeriod())
                .appendEnumQueryParam("findingFilter", request.getFindingFilter())
                .appendQueryParam("statsHashFilter", request.getStatsHashFilter())
                .appendQueryParam("indexHashFilter", request.getIndexHashFilter())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model
                                .SqlTuningAdvisorTaskFindingCollection.class,
                        ListSqlTuningAdvisorTaskFindingsResponse.Builder
                                ::sqlTuningAdvisorTaskFindingCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListSqlTuningAdvisorTaskFindingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListSqlTuningAdvisorTaskFindingsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSqlTuningAdvisorTaskRecommendationsResponse>
            listSqlTuningAdvisorTaskRecommendations(
                    ListSqlTuningAdvisorTaskRecommendationsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListSqlTuningAdvisorTaskRecommendationsRequest,
                                    ListSqlTuningAdvisorTaskRecommendationsResponse>
                            handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        Objects.requireNonNull(request.getSqlObjectId(), "sqlObjectId is required");

        Objects.requireNonNull(request.getExecutionId(), "executionId is required");

        return clientCall(request, ListSqlTuningAdvisorTaskRecommendationsResponse::builder)
                .logger(LOG, "listSqlTuningAdvisorTaskRecommendations")
                .serviceDetails(
                        "SqlTuning",
                        "ListSqlTuningAdvisorTaskRecommendations",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListSqlTuningAdvisorTaskRecommendations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSqlTuningAdvisorTaskRecommendationsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlTuningAdvisorTasks")
                .appendPathParam(request.getSqlTuningAdvisorTaskId())
                .appendPathParam("recommendations")
                .appendQueryParam("sqlObjectId", request.getSqlObjectId())
                .appendQueryParam("executionId", request.getExecutionId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model
                                .SqlTuningAdvisorTaskRecommendationCollection.class,
                        ListSqlTuningAdvisorTaskRecommendationsResponse.Builder
                                ::sqlTuningAdvisorTaskRecommendationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListSqlTuningAdvisorTaskRecommendationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListSqlTuningAdvisorTaskRecommendationsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSqlTuningAdvisorTasksResponse> listSqlTuningAdvisorTasks(
            ListSqlTuningAdvisorTasksRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSqlTuningAdvisorTasksRequest, ListSqlTuningAdvisorTasksResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, ListSqlTuningAdvisorTasksResponse::builder)
                .logger(LOG, "listSqlTuningAdvisorTasks")
                .serviceDetails(
                        "SqlTuning",
                        "ListSqlTuningAdvisorTasks",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListSqlTuningAdvisorTasks")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSqlTuningAdvisorTasksRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlTuningAdvisorTasks")
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("timeGreaterThanOrEqualTo", request.getTimeGreaterThanOrEqualTo())
                .appendQueryParam("timeLessThanOrEqualTo", request.getTimeLessThanOrEqualTo())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.SqlTuningAdvisorTaskCollection
                                .class,
                        ListSqlTuningAdvisorTasksResponse.Builder::sqlTuningAdvisorTaskCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSqlTuningAdvisorTasksResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSqlTuningAdvisorTasksResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSqlTuningSetsResponse> listSqlTuningSets(
            ListSqlTuningSetsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSqlTuningSetsRequest, ListSqlTuningSetsResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");

        return clientCall(request, ListSqlTuningSetsResponse::builder)
                .logger(LOG, "listSqlTuningSets")
                .serviceDetails(
                        "SqlTuning",
                        "ListSqlTuningSets",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/ListSqlTuningSets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSqlTuningSetsRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("sqlTuningSets")
                .appendQueryParam("owner", request.getOwner())
                .appendQueryParam("nameContains", request.getNameContains())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.SqlTuningSetCollection.class,
                        ListSqlTuningSetsResponse.Builder::sqlTuningSetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSqlTuningSetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSqlTuningSetsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartSqlTuningTaskResponse> startSqlTuningTask(
            StartSqlTuningTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartSqlTuningTaskRequest, StartSqlTuningTaskResponse>
                    handler) {

        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getStartSqlTuningTaskDetails(), "startSqlTuningTaskDetails is required");

        return clientCall(request, StartSqlTuningTaskResponse::builder)
                .logger(LOG, "startSqlTuningTask")
                .serviceDetails(
                        "SqlTuning",
                        "StartSqlTuningTask",
                        "https://docs.oracle.com/iaas/api/#/en/database-management/20201101/ManagedDatabase/StartSqlTuningTask")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartSqlTuningTaskRequest::builder)
                .basePath("/20201101")
                .appendPathParam("managedDatabases")
                .appendPathParam(request.getManagedDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("startSqlTuningTask")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemanagement.model.SqlTuningTaskReturn.class,
                        StartSqlTuningTaskResponse.Builder::sqlTuningTaskReturn)
                .handleResponseHeaderString(
                        "opc-request-id", StartSqlTuningTaskResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public SqlTuningAsyncClient(
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
    public SqlTuningAsyncClient(
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
    public SqlTuningAsyncClient(
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
    public SqlTuningAsyncClient(
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
    public SqlTuningAsyncClient(
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
    public SqlTuningAsyncClient(
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
    public SqlTuningAsyncClient(
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
