/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.mysql.requests.*;
import com.oracle.bmc.mysql.responses.*;

import java.util.Objects;

/**
 * Async client implementation for DbSystem service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public class DbSystemAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DbSystemAsync {
    /** Service instance for DbSystem. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DBSYSTEM")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://mysql.{region}.ocp.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DbSystemAsyncClient.class);

    DbSystemAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DbSystemAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "mysql";
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
        public DbSystemAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DbSystemAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<AddHeatWaveClusterResponse> addHeatWaveCluster(
            AddHeatWaveClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddHeatWaveClusterRequest, AddHeatWaveClusterResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDbSystemResponse> createDbSystem(
            CreateDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDbSystemRequest, CreateDbSystemResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDbSystemResponse> deleteDbSystem(
            DeleteDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDbSystemRequest, DeleteDbSystemResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteHeatWaveClusterResponse> deleteHeatWaveCluster(
            DeleteHeatWaveClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteHeatWaveClusterRequest, DeleteHeatWaveClusterResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateHeatWaveClusterMemoryEstimateResponse>
            generateHeatWaveClusterMemoryEstimate(
                    GenerateHeatWaveClusterMemoryEstimateRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GenerateHeatWaveClusterMemoryEstimateRequest,
                                    GenerateHeatWaveClusterMemoryEstimateResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDbSystemResponse> getDbSystem(
            GetDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDbSystemRequest, GetDbSystemResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetHeatWaveClusterResponse> getHeatWaveCluster(
            GetHeatWaveClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetHeatWaveClusterRequest, GetHeatWaveClusterResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetHeatWaveClusterMemoryEstimateResponse>
            getHeatWaveClusterMemoryEstimate(
                    GetHeatWaveClusterMemoryEstimateRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetHeatWaveClusterMemoryEstimateRequest,
                                    GetHeatWaveClusterMemoryEstimateResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDbSystemsResponse> listDbSystems(
            ListDbSystemsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDbSystemsRequest, ListDbSystemsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RestartDbSystemResponse> restartDbSystem(
            RestartDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RestartDbSystemRequest, RestartDbSystemResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RestartHeatWaveClusterResponse> restartHeatWaveCluster(
            RestartHeatWaveClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RestartHeatWaveClusterRequest, RestartHeatWaveClusterResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartDbSystemResponse> startDbSystem(
            StartDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<StartDbSystemRequest, StartDbSystemResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartHeatWaveClusterResponse> startHeatWaveCluster(
            StartHeatWaveClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartHeatWaveClusterRequest, StartHeatWaveClusterResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopDbSystemResponse> stopDbSystem(
            StopDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<StopDbSystemRequest, StopDbSystemResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopHeatWaveClusterResponse> stopHeatWaveCluster(
            StopHeatWaveClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopHeatWaveClusterRequest, StopHeatWaveClusterResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDbSystemResponse> updateDbSystem(
            UpdateDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDbSystemRequest, UpdateDbSystemResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateHeatWaveClusterResponse> updateHeatWaveCluster(
            UpdateHeatWaveClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateHeatWaveClusterRequest, UpdateHeatWaveClusterResponse>
                    handler) {

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
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DbSystemAsyncClient(
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
    public DbSystemAsyncClient(
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
    public DbSystemAsyncClient(
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
    public DbSystemAsyncClient(
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
    public DbSystemAsyncClient(
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
    public DbSystemAsyncClient(
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
    public DbSystemAsyncClient(
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
