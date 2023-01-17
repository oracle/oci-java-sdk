/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.mysql.requests.*;
import com.oracle.bmc.mysql.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public class DbSystemClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements DbSystem {
    /** Service instance for DbSystem. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DBSYSTEM")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://mysql.{region}.ocp.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DbSystemAsyncClient.class);

    private final DbSystemWaiters waiters;

    private final DbSystemPaginators paginators;

    private DbSystemClient(
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
                                    .nameFormat("DbSystem-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DbSystemWaiters(executorService, this);

        this.paginators = new DbSystemPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DbSystemClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
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
        public DbSystemClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DbSystemClient(this, authenticationDetailsProvider, executorService);
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
    public AddAnalyticsClusterResponse addAnalyticsCluster(AddAnalyticsClusterRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");
        Objects.requireNonNull(
                request.getAddAnalyticsClusterDetails(), "addAnalyticsClusterDetails is required");

        return clientCall(request, AddAnalyticsClusterResponse::builder)
                .logger(LOG, "addAnalyticsCluster")
                .serviceDetails(
                        "DbSystem",
                        "AddAnalyticsCluster",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/AnalyticsCluster/AddAnalyticsCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddAnalyticsClusterRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("analyticsCluster")
                .appendPathParam("actions")
                .appendPathParam("add")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mysql.model.AnalyticsCluster.class,
                        AddAnalyticsClusterResponse.Builder::analyticsCluster)
                .handleResponseHeaderString("etag", AddAnalyticsClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AddAnalyticsClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddAnalyticsClusterResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public AddHeatWaveClusterResponse addHeatWaveCluster(AddHeatWaveClusterRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");
        Objects.requireNonNull(
                request.getAddHeatWaveClusterDetails(), "addHeatWaveClusterDetails is required");

        return clientCall(request, AddHeatWaveClusterResponse::builder)
                .logger(LOG, "addHeatWaveCluster")
                .serviceDetails(
                        "DbSystem",
                        "AddHeatWaveCluster",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/HeatWaveCluster/AddHeatWaveCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddHeatWaveClusterRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("heatWaveCluster")
                .appendPathParam("actions")
                .appendPathParam("add")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mysql.model.HeatWaveCluster.class,
                        AddHeatWaveClusterResponse.Builder::heatWaveCluster)
                .handleResponseHeaderString("etag", AddHeatWaveClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AddHeatWaveClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", AddHeatWaveClusterResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateDbSystemResponse createDbSystem(CreateDbSystemRequest request) {
        Objects.requireNonNull(
                request.getCreateDbSystemDetails(), "createDbSystemDetails is required");

        return clientCall(request, CreateDbSystemResponse::builder)
                .logger(LOG, "createDbSystem")
                .serviceDetails("DbSystem", "CreateDbSystem", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDbSystemRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mysql.model.DbSystem.class,
                        CreateDbSystemResponse.Builder::dbSystem)
                .handleResponseHeaderString("etag", CreateDbSystemResponse.Builder::etag)
                .handleResponseHeaderString("location", CreateDbSystemResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDbSystemResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateDbSystemResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteAnalyticsClusterResponse deleteAnalyticsCluster(
            DeleteAnalyticsClusterRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, DeleteAnalyticsClusterResponse::builder)
                .logger(LOG, "deleteAnalyticsCluster")
                .serviceDetails(
                        "DbSystem",
                        "DeleteAnalyticsCluster",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/AnalyticsCluster/DeleteAnalyticsCluster")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAnalyticsClusterRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("analyticsCluster")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAnalyticsClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteAnalyticsClusterResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteDbSystemResponse deleteDbSystem(DeleteDbSystemRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, DeleteDbSystemResponse::builder)
                .logger(LOG, "deleteDbSystem")
                .serviceDetails(
                        "DbSystem",
                        "DeleteDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/DbSystem/DeleteDbSystem")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDbSystemRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDbSystemResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteDbSystemResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteHeatWaveClusterResponse deleteHeatWaveCluster(
            DeleteHeatWaveClusterRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, DeleteHeatWaveClusterResponse::builder)
                .logger(LOG, "deleteHeatWaveCluster")
                .serviceDetails(
                        "DbSystem",
                        "DeleteHeatWaveCluster",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/HeatWaveCluster/DeleteHeatWaveCluster")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteHeatWaveClusterRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("heatWaveCluster")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteHeatWaveClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteHeatWaveClusterResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GenerateAnalyticsClusterMemoryEstimateResponse generateAnalyticsClusterMemoryEstimate(
            GenerateAnalyticsClusterMemoryEstimateRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, GenerateAnalyticsClusterMemoryEstimateResponse::builder)
                .logger(LOG, "generateAnalyticsClusterMemoryEstimate")
                .serviceDetails(
                        "DbSystem",
                        "GenerateAnalyticsClusterMemoryEstimate",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/AnalyticsClusterMemoryEstimate/GenerateAnalyticsClusterMemoryEstimate")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateAnalyticsClusterMemoryEstimateRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("analyticsClusterMemoryEstimate")
                .appendPathParam("actions")
                .appendPathParam("generate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.mysql.model.AnalyticsClusterMemoryEstimate.class,
                        GenerateAnalyticsClusterMemoryEstimateResponse.Builder
                                ::analyticsClusterMemoryEstimate)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GenerateAnalyticsClusterMemoryEstimateResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        GenerateAnalyticsClusterMemoryEstimateResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GenerateHeatWaveClusterMemoryEstimateResponse generateHeatWaveClusterMemoryEstimate(
            GenerateHeatWaveClusterMemoryEstimateRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, GenerateHeatWaveClusterMemoryEstimateResponse::builder)
                .logger(LOG, "generateHeatWaveClusterMemoryEstimate")
                .serviceDetails(
                        "DbSystem",
                        "GenerateHeatWaveClusterMemoryEstimate",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/HeatWaveClusterMemoryEstimate/GenerateHeatWaveClusterMemoryEstimate")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateHeatWaveClusterMemoryEstimateRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("heatWaveClusterMemoryEstimate")
                .appendPathParam("actions")
                .appendPathParam("generate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.mysql.model.HeatWaveClusterMemoryEstimate.class,
                        GenerateHeatWaveClusterMemoryEstimateResponse.Builder
                                ::heatWaveClusterMemoryEstimate)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GenerateHeatWaveClusterMemoryEstimateResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        GenerateHeatWaveClusterMemoryEstimateResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetAnalyticsClusterResponse getAnalyticsCluster(GetAnalyticsClusterRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, GetAnalyticsClusterResponse::builder)
                .logger(LOG, "getAnalyticsCluster")
                .serviceDetails(
                        "DbSystem",
                        "GetAnalyticsCluster",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/AnalyticsCluster/GetAnalyticsCluster")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAnalyticsClusterRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("analyticsCluster")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .handleBody(
                        com.oracle.bmc.mysql.model.AnalyticsCluster.class,
                        GetAnalyticsClusterResponse.Builder::analyticsCluster)
                .handleResponseHeaderString("etag", GetAnalyticsClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAnalyticsClusterResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetAnalyticsClusterMemoryEstimateResponse getAnalyticsClusterMemoryEstimate(
            GetAnalyticsClusterMemoryEstimateRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, GetAnalyticsClusterMemoryEstimateResponse::builder)
                .logger(LOG, "getAnalyticsClusterMemoryEstimate")
                .serviceDetails(
                        "DbSystem",
                        "GetAnalyticsClusterMemoryEstimate",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/AnalyticsClusterMemoryEstimate/GetAnalyticsClusterMemoryEstimate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAnalyticsClusterMemoryEstimateRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("analyticsClusterMemoryEstimate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.mysql.model.AnalyticsClusterMemoryEstimate.class,
                        GetAnalyticsClusterMemoryEstimateResponse.Builder
                                ::analyticsClusterMemoryEstimate)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetAnalyticsClusterMemoryEstimateResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetDbSystemResponse getDbSystem(GetDbSystemRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, GetDbSystemResponse::builder)
                .logger(LOG, "getDbSystem")
                .serviceDetails(
                        "DbSystem",
                        "GetDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/DbSystem/GetDbSystem")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDbSystemRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .handleBody(
                        com.oracle.bmc.mysql.model.DbSystem.class,
                        GetDbSystemResponse.Builder::dbSystem)
                .handleResponseHeaderString("etag", GetDbSystemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDbSystemResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetHeatWaveClusterResponse getHeatWaveCluster(GetHeatWaveClusterRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, GetHeatWaveClusterResponse::builder)
                .logger(LOG, "getHeatWaveCluster")
                .serviceDetails(
                        "DbSystem",
                        "GetHeatWaveCluster",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/HeatWaveCluster/GetHeatWaveCluster")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetHeatWaveClusterRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("heatWaveCluster")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .handleBody(
                        com.oracle.bmc.mysql.model.HeatWaveCluster.class,
                        GetHeatWaveClusterResponse.Builder::heatWaveCluster)
                .handleResponseHeaderString("etag", GetHeatWaveClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetHeatWaveClusterResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetHeatWaveClusterMemoryEstimateResponse getHeatWaveClusterMemoryEstimate(
            GetHeatWaveClusterMemoryEstimateRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, GetHeatWaveClusterMemoryEstimateResponse::builder)
                .logger(LOG, "getHeatWaveClusterMemoryEstimate")
                .serviceDetails(
                        "DbSystem",
                        "GetHeatWaveClusterMemoryEstimate",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/HeatWaveClusterMemoryEstimate/GetHeatWaveClusterMemoryEstimate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetHeatWaveClusterMemoryEstimateRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("heatWaveClusterMemoryEstimate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.mysql.model.HeatWaveClusterMemoryEstimate.class,
                        GetHeatWaveClusterMemoryEstimateResponse.Builder
                                ::heatWaveClusterMemoryEstimate)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetHeatWaveClusterMemoryEstimateResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListDbSystemsResponse listDbSystems(ListDbSystemsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDbSystemsResponse::builder)
                .logger(LOG, "listDbSystems")
                .serviceDetails(
                        "DbSystem",
                        "ListDbSystems",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/DbSystemSummary/ListDbSystems")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbSystemsRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendQueryParam(
                        "isAnalyticsClusterAttached", request.getIsAnalyticsClusterAttached())
                .appendQueryParam(
                        "isHeatWaveClusterAttached", request.getIsHeatWaveClusterAttached())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("dbSystemId", request.getDbSystemId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("configurationId", request.getConfigurationId())
                .appendQueryParam("isUpToDate", request.getIsUpToDate())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.mysql.model.DbSystemSummary.class,
                        ListDbSystemsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDbSystemsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDbSystemsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RestartAnalyticsClusterResponse restartAnalyticsCluster(
            RestartAnalyticsClusterRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, RestartAnalyticsClusterResponse::builder)
                .logger(LOG, "restartAnalyticsCluster")
                .serviceDetails(
                        "DbSystem",
                        "RestartAnalyticsCluster",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/AnalyticsCluster/RestartAnalyticsCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestartAnalyticsClusterRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("analyticsCluster")
                .appendPathParam("actions")
                .appendPathParam("restart")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", RestartAnalyticsClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RestartAnalyticsClusterResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RestartDbSystemResponse restartDbSystem(RestartDbSystemRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");
        Objects.requireNonNull(
                request.getRestartDbSystemDetails(), "restartDbSystemDetails is required");

        return clientCall(request, RestartDbSystemResponse::builder)
                .logger(LOG, "restartDbSystem")
                .serviceDetails(
                        "DbSystem",
                        "RestartDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/DbSystem/RestartDbSystem")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestartDbSystemRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("actions")
                .appendPathParam("restart")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", RestartDbSystemResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", RestartDbSystemResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RestartHeatWaveClusterResponse restartHeatWaveCluster(
            RestartHeatWaveClusterRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, RestartHeatWaveClusterResponse::builder)
                .logger(LOG, "restartHeatWaveCluster")
                .serviceDetails(
                        "DbSystem",
                        "RestartHeatWaveCluster",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/HeatWaveCluster/RestartHeatWaveCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestartHeatWaveClusterRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("heatWaveCluster")
                .appendPathParam("actions")
                .appendPathParam("restart")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", RestartHeatWaveClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RestartHeatWaveClusterResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public StartAnalyticsClusterResponse startAnalyticsCluster(
            StartAnalyticsClusterRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, StartAnalyticsClusterResponse::builder)
                .logger(LOG, "startAnalyticsCluster")
                .serviceDetails(
                        "DbSystem",
                        "StartAnalyticsCluster",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/AnalyticsCluster/StartAnalyticsCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartAnalyticsClusterRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("analyticsCluster")
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", StartAnalyticsClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StartAnalyticsClusterResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public StartDbSystemResponse startDbSystem(StartDbSystemRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, StartDbSystemResponse::builder)
                .logger(LOG, "startDbSystem")
                .serviceDetails(
                        "DbSystem",
                        "StartDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/DbSystem/StartDbSystem")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartDbSystemRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", StartDbSystemResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", StartDbSystemResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public StartHeatWaveClusterResponse startHeatWaveCluster(StartHeatWaveClusterRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, StartHeatWaveClusterResponse::builder)
                .logger(LOG, "startHeatWaveCluster")
                .serviceDetails(
                        "DbSystem",
                        "StartHeatWaveCluster",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/HeatWaveCluster/StartHeatWaveCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartHeatWaveClusterRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("heatWaveCluster")
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", StartHeatWaveClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StartHeatWaveClusterResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public StopAnalyticsClusterResponse stopAnalyticsCluster(StopAnalyticsClusterRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, StopAnalyticsClusterResponse::builder)
                .logger(LOG, "stopAnalyticsCluster")
                .serviceDetails(
                        "DbSystem",
                        "StopAnalyticsCluster",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/AnalyticsCluster/StopAnalyticsCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopAnalyticsClusterRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("analyticsCluster")
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", StopAnalyticsClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StopAnalyticsClusterResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public StopDbSystemResponse stopDbSystem(StopDbSystemRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");
        Objects.requireNonNull(request.getStopDbSystemDetails(), "stopDbSystemDetails is required");

        return clientCall(request, StopDbSystemResponse::builder)
                .logger(LOG, "stopDbSystem")
                .serviceDetails(
                        "DbSystem",
                        "StopDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/DbSystem/StopDbSystem")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopDbSystemRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", StopDbSystemResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", StopDbSystemResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public StopHeatWaveClusterResponse stopHeatWaveCluster(StopHeatWaveClusterRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, StopHeatWaveClusterResponse::builder)
                .logger(LOG, "stopHeatWaveCluster")
                .serviceDetails(
                        "DbSystem",
                        "StopHeatWaveCluster",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/HeatWaveCluster/StopHeatWaveCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopHeatWaveClusterRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("heatWaveCluster")
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", StopHeatWaveClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StopHeatWaveClusterResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateAnalyticsClusterResponse updateAnalyticsCluster(
            UpdateAnalyticsClusterRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAnalyticsClusterDetails(),
                "updateAnalyticsClusterDetails is required");

        return clientCall(request, UpdateAnalyticsClusterResponse::builder)
                .logger(LOG, "updateAnalyticsCluster")
                .serviceDetails(
                        "DbSystem",
                        "UpdateAnalyticsCluster",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/AnalyticsCluster/UpdateAnalyticsCluster")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAnalyticsClusterRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("analyticsCluster")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAnalyticsClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAnalyticsClusterResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateDbSystemResponse updateDbSystem(UpdateDbSystemRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDbSystemDetails(), "updateDbSystemDetails is required");

        return clientCall(request, UpdateDbSystemResponse::builder)
                .logger(LOG, "updateDbSystem")
                .serviceDetails(
                        "DbSystem",
                        "UpdateDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/DbSystem/UpdateDbSystem")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDbSystemRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDbSystemResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateDbSystemResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateHeatWaveClusterResponse updateHeatWaveCluster(
            UpdateHeatWaveClusterRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");
        Objects.requireNonNull(
                request.getUpdateHeatWaveClusterDetails(),
                "updateHeatWaveClusterDetails is required");

        return clientCall(request, UpdateHeatWaveClusterResponse::builder)
                .logger(LOG, "updateHeatWaveCluster")
                .serviceDetails(
                        "DbSystem",
                        "UpdateHeatWaveCluster",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/HeatWaveCluster/UpdateHeatWaveCluster")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateHeatWaveClusterRequest::builder)
                .basePath("/20190415")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("heatWaveCluster")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateHeatWaveClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateHeatWaveClusterResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DbSystemWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DbSystemPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DbSystemClient(
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
    public DbSystemClient(
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
    public DbSystemClient(
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
    public DbSystemClient(
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
    public DbSystemClient(
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
    public DbSystemClient(
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
    public DbSystemClient(
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
    public DbSystemClient(
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
