/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.dataflow.requests.*;
import com.oracle.bmc.dataflow.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
public class DataFlowClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements DataFlow {
    /** Service instance for DataFlow. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DATAFLOW")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://dataflow.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DataFlowClient.class);

    private final DataFlowWaiters waiters;

    private final DataFlowPaginators paginators;

    DataFlowClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        this(builder, authenticationDetailsProvider, executorService, true);
    }

    DataFlowClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService,
            boolean isStreamWarningEnabled) {
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
                                    .nameFormat("DataFlow-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DataFlowWaiters(executorService, this);

        this.paginators = new DataFlowPaginators(this);
        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "DataFlowClient", "getRunLog"));
        }
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DataFlowClient> {
        private boolean isStreamWarningEnabled = true;
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
         * Enable/disable the stream warnings for the client
         *
         * @param isStreamWarningEnabled executorService
         * @return this builder
         */
        public Builder isStreamWarningEnabled(boolean isStreamWarningEnabled) {
            this.isStreamWarningEnabled = isStreamWarningEnabled;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public DataFlowClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DataFlowClient(
                    this, authenticationDetailsProvider, executorService, isStreamWarningEnabled);
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
    public ChangeApplicationCompartmentResponse changeApplicationCompartment(
            ChangeApplicationCompartmentRequest request) {

        Validate.notBlank(request.getApplicationId(), "applicationId must not be blank");
        Objects.requireNonNull(
                request.getChangeApplicationCompartmentDetails(),
                "changeApplicationCompartmentDetails is required");

        return clientCall(request, ChangeApplicationCompartmentResponse::builder)
                .logger(LOG, "changeApplicationCompartment")
                .serviceDetails(
                        "DataFlow",
                        "ChangeApplicationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/Application/ChangeApplicationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeApplicationCompartmentRequest::builder)
                .basePath("/20200129")
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeApplicationCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangePoolCompartmentResponse changePoolCompartment(
            ChangePoolCompartmentRequest request) {

        Validate.notBlank(request.getPoolId(), "poolId must not be blank");
        Objects.requireNonNull(
                request.getChangePoolCompartmentDetails(),
                "changePoolCompartmentDetails is required");

        return clientCall(request, ChangePoolCompartmentResponse::builder)
                .logger(LOG, "changePoolCompartment")
                .serviceDetails(
                        "DataFlow",
                        "ChangePoolCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/Pool/ChangePoolCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangePoolCompartmentRequest::builder)
                .basePath("/20200129")
                .appendPathParam("pools")
                .appendPathParam(request.getPoolId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangePoolCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangePrivateEndpointCompartmentResponse changePrivateEndpointCompartment(
            ChangePrivateEndpointCompartmentRequest request) {

        Validate.notBlank(request.getPrivateEndpointId(), "privateEndpointId must not be blank");
        Objects.requireNonNull(
                request.getChangePrivateEndpointCompartmentDetails(),
                "changePrivateEndpointCompartmentDetails is required");

        return clientCall(request, ChangePrivateEndpointCompartmentResponse::builder)
                .logger(LOG, "changePrivateEndpointCompartment")
                .serviceDetails(
                        "DataFlow",
                        "ChangePrivateEndpointCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/PrivateEndpoint/ChangePrivateEndpointCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangePrivateEndpointCompartmentRequest::builder)
                .basePath("/20200129")
                .appendPathParam("privateEndpoints")
                .appendPathParam(request.getPrivateEndpointId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangePrivateEndpointCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangePrivateEndpointCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ChangeRunCompartmentResponse changeRunCompartment(ChangeRunCompartmentRequest request) {

        Validate.notBlank(request.getRunId(), "runId must not be blank");
        Objects.requireNonNull(
                request.getChangeRunCompartmentDetails(),
                "changeRunCompartmentDetails is required");

        return clientCall(request, ChangeRunCompartmentResponse::builder)
                .logger(LOG, "changeRunCompartment")
                .serviceDetails(
                        "DataFlow",
                        "ChangeRunCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/Run/ChangeRunCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeRunCompartmentRequest::builder)
                .basePath("/20200129")
                .appendPathParam("runs")
                .appendPathParam(request.getRunId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeRunCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateApplicationResponse createApplication(CreateApplicationRequest request) {
        Objects.requireNonNull(
                request.getCreateApplicationDetails(), "createApplicationDetails is required");

        return clientCall(request, CreateApplicationResponse::builder)
                .logger(LOG, "createApplication")
                .serviceDetails(
                        "DataFlow",
                        "CreateApplication",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/Application/CreateApplication")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateApplicationRequest::builder)
                .basePath("/20200129")
                .appendPathParam("applications")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataflow.model.Application.class,
                        CreateApplicationResponse.Builder::application)
                .handleResponseHeaderString("etag", CreateApplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateApplicationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreatePoolResponse createPool(CreatePoolRequest request) {
        Objects.requireNonNull(request.getCreatePoolDetails(), "createPoolDetails is required");

        return clientCall(request, CreatePoolResponse::builder)
                .logger(LOG, "createPool")
                .serviceDetails("DataFlow", "CreatePool", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePoolRequest::builder)
                .basePath("/20200129")
                .appendPathParam("pools")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataflow.model.Pool.class, CreatePoolResponse.Builder::pool)
                .handleResponseHeaderString("etag", CreatePoolResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePoolResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreatePoolResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("Location", CreatePoolResponse.Builder::location)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreatePrivateEndpointResponse createPrivateEndpoint(
            CreatePrivateEndpointRequest request) {
        Objects.requireNonNull(
                request.getCreatePrivateEndpointDetails(),
                "createPrivateEndpointDetails is required");

        return clientCall(request, CreatePrivateEndpointResponse::builder)
                .logger(LOG, "createPrivateEndpoint")
                .serviceDetails("DataFlow", "CreatePrivateEndpoint", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePrivateEndpointRequest::builder)
                .basePath("/20200129")
                .appendPathParam("privateEndpoints")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataflow.model.PrivateEndpoint.class,
                        CreatePrivateEndpointResponse.Builder::privateEndpoint)
                .handleResponseHeaderString("etag", CreatePrivateEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreatePrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "Location", CreatePrivateEndpointResponse.Builder::location)
                .callSync();
    }

    @Override
    public CreateRunResponse createRun(CreateRunRequest request) {
        Objects.requireNonNull(request.getCreateRunDetails(), "createRunDetails is required");

        return clientCall(request, CreateRunResponse::builder)
                .logger(LOG, "createRun")
                .serviceDetails(
                        "DataFlow",
                        "CreateRun",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/Run/CreateRun")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRunRequest::builder)
                .basePath("/20200129")
                .appendPathParam("runs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(com.oracle.bmc.dataflow.model.Run.class, CreateRunResponse.Builder::run)
                .handleResponseHeaderString("etag", CreateRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRunResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateStatementResponse createStatement(CreateStatementRequest request) {
        Objects.requireNonNull(
                request.getCreateStatementDetails(), "createStatementDetails is required");

        Validate.notBlank(request.getRunId(), "runId must not be blank");

        return clientCall(request, CreateStatementResponse::builder)
                .logger(LOG, "createStatement")
                .serviceDetails(
                        "DataFlow",
                        "CreateStatement",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/Statement/CreateStatement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateStatementRequest::builder)
                .basePath("/20200129")
                .appendPathParam("runs")
                .appendPathParam(request.getRunId())
                .appendPathParam("statements")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataflow.model.Statement.class,
                        CreateStatementResponse.Builder::statement)
                .handleResponseHeaderString("etag", CreateStatementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateStatementResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) {

        Validate.notBlank(request.getApplicationId(), "applicationId must not be blank");

        return clientCall(request, DeleteApplicationResponse::builder)
                .logger(LOG, "deleteApplication")
                .serviceDetails(
                        "DataFlow",
                        "DeleteApplication",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/Application/DeleteApplication")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteApplicationRequest::builder)
                .basePath("/20200129")
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteApplicationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeletePoolResponse deletePool(DeletePoolRequest request) {

        Validate.notBlank(request.getPoolId(), "poolId must not be blank");

        return clientCall(request, DeletePoolResponse::builder)
                .logger(LOG, "deletePool")
                .serviceDetails(
                        "DataFlow",
                        "DeletePool",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/Pool/DeletePool")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePoolRequest::builder)
                .basePath("/20200129")
                .appendPathParam("pools")
                .appendPathParam(request.getPoolId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePoolResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeletePrivateEndpointResponse deletePrivateEndpoint(
            DeletePrivateEndpointRequest request) {

        Validate.notBlank(request.getPrivateEndpointId(), "privateEndpointId must not be blank");

        return clientCall(request, DeletePrivateEndpointResponse::builder)
                .logger(LOG, "deletePrivateEndpoint")
                .serviceDetails(
                        "DataFlow",
                        "DeletePrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/PrivateEndpoint/DeletePrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePrivateEndpointRequest::builder)
                .basePath("/20200129")
                .appendPathParam("privateEndpoints")
                .appendPathParam(request.getPrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeletePrivateEndpointResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteRunResponse deleteRun(DeleteRunRequest request) {

        Validate.notBlank(request.getRunId(), "runId must not be blank");

        return clientCall(request, DeleteRunResponse::builder)
                .logger(LOG, "deleteRun")
                .serviceDetails(
                        "DataFlow",
                        "DeleteRun",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/Run/DeleteRun")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRunRequest::builder)
                .basePath("/20200129")
                .appendPathParam("runs")
                .appendPathParam(request.getRunId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRunResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteStatementResponse deleteStatement(DeleteStatementRequest request) {

        Validate.notBlank(request.getRunId(), "runId must not be blank");

        Validate.notBlank(request.getStatementId(), "statementId must not be blank");

        return clientCall(request, DeleteStatementResponse::builder)
                .logger(LOG, "deleteStatement")
                .serviceDetails(
                        "DataFlow",
                        "DeleteStatement",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/Statement/DeleteStatement")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteStatementRequest::builder)
                .basePath("/20200129")
                .appendPathParam("runs")
                .appendPathParam(request.getRunId())
                .appendPathParam("statements")
                .appendPathParam(request.getStatementId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteStatementResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetApplicationResponse getApplication(GetApplicationRequest request) {

        Validate.notBlank(request.getApplicationId(), "applicationId must not be blank");

        return clientCall(request, GetApplicationResponse::builder)
                .logger(LOG, "getApplication")
                .serviceDetails(
                        "DataFlow",
                        "GetApplication",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/Application/GetApplication")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetApplicationRequest::builder)
                .basePath("/20200129")
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataflow.model.Application.class,
                        GetApplicationResponse.Builder::application)
                .handleResponseHeaderString("etag", GetApplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetApplicationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetPoolResponse getPool(GetPoolRequest request) {

        Validate.notBlank(request.getPoolId(), "poolId must not be blank");

        return clientCall(request, GetPoolResponse::builder)
                .logger(LOG, "getPool")
                .serviceDetails(
                        "DataFlow",
                        "GetPool",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/Pool/GetPool")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPoolRequest::builder)
                .basePath("/20200129")
                .appendPathParam("pools")
                .appendPathParam(request.getPoolId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(com.oracle.bmc.dataflow.model.Pool.class, GetPoolResponse.Builder::pool)
                .handleResponseHeaderString("etag", GetPoolResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetPoolResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetPrivateEndpointResponse getPrivateEndpoint(GetPrivateEndpointRequest request) {

        Validate.notBlank(request.getPrivateEndpointId(), "privateEndpointId must not be blank");

        return clientCall(request, GetPrivateEndpointResponse::builder)
                .logger(LOG, "getPrivateEndpoint")
                .serviceDetails(
                        "DataFlow",
                        "GetPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/PrivateEndpoint/GetPrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPrivateEndpointRequest::builder)
                .basePath("/20200129")
                .appendPathParam("privateEndpoints")
                .appendPathParam(request.getPrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataflow.model.PrivateEndpoint.class,
                        GetPrivateEndpointResponse.Builder::privateEndpoint)
                .handleResponseHeaderString("etag", GetPrivateEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPrivateEndpointResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetRunResponse getRun(GetRunRequest request) {

        Validate.notBlank(request.getRunId(), "runId must not be blank");

        return clientCall(request, GetRunResponse::builder)
                .logger(LOG, "getRun")
                .serviceDetails(
                        "DataFlow",
                        "GetRun",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/Run/GetRun")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRunRequest::builder)
                .basePath("/20200129")
                .appendPathParam("runs")
                .appendPathParam(request.getRunId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(com.oracle.bmc.dataflow.model.Run.class, GetRunResponse.Builder::run)
                .handleResponseHeaderString("etag", GetRunResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetRunResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetRunLogResponse getRunLog(GetRunLogRequest request) {

        Validate.notBlank(request.getRunId(), "runId must not be blank");

        Validate.notBlank(request.getName(), "name must not be blank");

        return clientCall(request, GetRunLogResponse::builder)
                .logger(LOG, "getRunLog")
                .serviceDetails(
                        "DataFlow",
                        "GetRunLog",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/Run/GetRunLog")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRunLogRequest::builder)
                .basePath("/20200129")
                .appendPathParam("runs")
                .appendPathParam(request.getRunId())
                .appendPathParam("logs")
                .appendPathParam(request.getName())
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(java.io.InputStream.class, GetRunLogResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", GetRunLogResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetRunLogResponse.Builder::etag)
                .handleResponseHeaderLong(
                        "content-length", GetRunLogResponse.Builder::contentLength)
                .handleResponseHeaderString("content-type", GetRunLogResponse.Builder::contentType)
                .handleResponseHeaderString(
                        "content-encoding", GetRunLogResponse.Builder::contentEncoding)
                .handleResponseHeadersMap("opc-meta-", GetRunLogResponse.Builder::opcMeta)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetStatementResponse getStatement(GetStatementRequest request) {

        Validate.notBlank(request.getRunId(), "runId must not be blank");

        Validate.notBlank(request.getStatementId(), "statementId must not be blank");

        return clientCall(request, GetStatementResponse::builder)
                .logger(LOG, "getStatement")
                .serviceDetails(
                        "DataFlow",
                        "GetStatement",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/Statement/GetStatement")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetStatementRequest::builder)
                .basePath("/20200129")
                .appendPathParam("runs")
                .appendPathParam(request.getRunId())
                .appendPathParam("statements")
                .appendPathParam(request.getStatementId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataflow.model.Statement.class,
                        GetStatementResponse.Builder::statement)
                .handleResponseHeaderString("etag", GetStatementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetStatementResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "DataFlow",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20200129")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataflow.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListApplicationsResponse listApplications(ListApplicationsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListApplicationsResponse::builder)
                .logger(LOG, "listApplications")
                .serviceDetails(
                        "DataFlow",
                        "ListApplications",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/ApplicationSummary/ListApplications")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApplicationsRequest::builder)
                .basePath("/20200129")
                .appendPathParam("applications")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("ownerPrincipalId", request.getOwnerPrincipalId())
                .appendQueryParam("displayNameStartsWith", request.getDisplayNameStartsWith())
                .appendQueryParam("sparkVersion", request.getSparkVersion())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.dataflow.model.ApplicationSummary.class,
                        ListApplicationsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-prev-page", ListApplicationsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListApplicationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListApplicationsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListPoolsResponse listPools(ListPoolsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListPoolsResponse::builder)
                .logger(LOG, "listPools")
                .serviceDetails(
                        "DataFlow",
                        "ListPools",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/Pool/ListPools")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPoolsRequest::builder)
                .basePath("/20200129")
                .appendPathParam("pools")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("ownerPrincipalId", request.getOwnerPrincipalId())
                .appendQueryParam("displayNameStartsWith", request.getDisplayNameStartsWith())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataflow.model.PoolCollection.class,
                        ListPoolsResponse.Builder::poolCollection)
                .handleResponseHeaderString("opc-prev-page", ListPoolsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString("opc-next-page", ListPoolsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListPoolsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListPrivateEndpointsResponse listPrivateEndpoints(ListPrivateEndpointsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListPrivateEndpointsResponse::builder)
                .logger(LOG, "listPrivateEndpoints")
                .serviceDetails(
                        "DataFlow",
                        "ListPrivateEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/PrivateEndpoint/ListPrivateEndpoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPrivateEndpointsRequest::builder)
                .basePath("/20200129")
                .appendPathParam("privateEndpoints")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("ownerPrincipalId", request.getOwnerPrincipalId())
                .appendQueryParam("displayNameStartsWith", request.getDisplayNameStartsWith())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataflow.model.PrivateEndpointCollection.class,
                        ListPrivateEndpointsResponse.Builder::privateEndpointCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListPrivateEndpointsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListPrivateEndpointsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListPrivateEndpointsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListRunLogsResponse listRunLogs(ListRunLogsRequest request) {

        Validate.notBlank(request.getRunId(), "runId must not be blank");

        return clientCall(request, ListRunLogsResponse::builder)
                .logger(LOG, "listRunLogs")
                .serviceDetails(
                        "DataFlow",
                        "ListRunLogs",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/RunLogSummary/ListRunLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRunLogsRequest::builder)
                .basePath("/20200129")
                .appendPathParam("runs")
                .appendPathParam(request.getRunId())
                .appendPathParam("logs")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.dataflow.model.RunLogSummary.class,
                        ListRunLogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListRunLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-prev-page", ListRunLogsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListRunLogsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListRunsResponse listRuns(ListRunsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListRunsResponse::builder)
                .logger(LOG, "listRuns")
                .serviceDetails(
                        "DataFlow",
                        "ListRuns",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/RunSummary/ListRuns")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRunsRequest::builder)
                .basePath("/20200129")
                .appendPathParam("runs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("applicationId", request.getApplicationId())
                .appendQueryParam("poolId", request.getPoolId())
                .appendQueryParam("ownerPrincipalId", request.getOwnerPrincipalId())
                .appendQueryParam("displayNameStartsWith", request.getDisplayNameStartsWith())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("timeCreatedGreaterThan", request.getTimeCreatedGreaterThan())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.dataflow.model.RunSummary.class,
                        ListRunsResponse.Builder::items)
                .handleResponseHeaderString("opc-prev-page", ListRunsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString("opc-next-page", ListRunsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListRunsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListStatementsResponse listStatements(ListStatementsRequest request) {

        Validate.notBlank(request.getRunId(), "runId must not be blank");

        return clientCall(request, ListStatementsResponse::builder)
                .logger(LOG, "listStatements")
                .serviceDetails(
                        "DataFlow",
                        "ListStatements",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/StatementCollection/ListStatements")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListStatementsRequest::builder)
                .basePath("/20200129")
                .appendPathParam("runs")
                .appendPathParam(request.getRunId())
                .appendPathParam("statements")
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataflow.model.StatementCollection.class,
                        ListStatementsResponse.Builder::statementCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListStatementsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListStatementsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListStatementsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "DataFlow",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20200129")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataflow.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListWorkRequestErrorsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "DataFlow",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/WorkRequestLog/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20200129")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataflow.model.WorkRequestLogCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListWorkRequestLogsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "DataFlow",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20200129")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataflow.model.WorkRequestCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestCollection)
                .handleResponseHeaderString(
                        "opc-prev-page", ListWorkRequestsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public StartPoolResponse startPool(StartPoolRequest request) {

        Validate.notBlank(request.getPoolId(), "poolId must not be blank");

        return clientCall(request, StartPoolResponse::builder)
                .logger(LOG, "startPool")
                .serviceDetails(
                        "DataFlow",
                        "StartPool",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/Pool/StartPool")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartPoolRequest::builder)
                .basePath("/20200129")
                .appendPathParam("pools")
                .appendPathParam(request.getPoolId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", StartPoolResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", StartPoolResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public StopPoolResponse stopPool(StopPoolRequest request) {

        Validate.notBlank(request.getPoolId(), "poolId must not be blank");

        return clientCall(request, StopPoolResponse::builder)
                .logger(LOG, "stopPool")
                .serviceDetails(
                        "DataFlow",
                        "StopPool",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/Pool/StopPool")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopPoolRequest::builder)
                .basePath("/20200129")
                .appendPathParam("pools")
                .appendPathParam(request.getPoolId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", StopPoolResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", StopPoolResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateApplicationResponse updateApplication(UpdateApplicationRequest request) {
        Objects.requireNonNull(
                request.getUpdateApplicationDetails(), "updateApplicationDetails is required");

        Validate.notBlank(request.getApplicationId(), "applicationId must not be blank");

        return clientCall(request, UpdateApplicationResponse::builder)
                .logger(LOG, "updateApplication")
                .serviceDetails(
                        "DataFlow",
                        "UpdateApplication",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/Application/UpdateApplication")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateApplicationRequest::builder)
                .basePath("/20200129")
                .appendPathParam("applications")
                .appendPathParam(request.getApplicationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataflow.model.Application.class,
                        UpdateApplicationResponse.Builder::application)
                .handleResponseHeaderString("etag", UpdateApplicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateApplicationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdatePoolResponse updatePool(UpdatePoolRequest request) {
        Objects.requireNonNull(request.getUpdatePoolDetails(), "updatePoolDetails is required");

        Validate.notBlank(request.getPoolId(), "poolId must not be blank");

        return clientCall(request, UpdatePoolResponse::builder)
                .logger(LOG, "updatePool")
                .serviceDetails(
                        "DataFlow",
                        "UpdatePool",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/Pool/UpdatePool")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePoolRequest::builder)
                .basePath("/20200129")
                .appendPathParam("pools")
                .appendPathParam(request.getPoolId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePoolResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdatePoolResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdatePrivateEndpointResponse updatePrivateEndpoint(
            UpdatePrivateEndpointRequest request) {
        Objects.requireNonNull(
                request.getUpdatePrivateEndpointDetails(),
                "updatePrivateEndpointDetails is required");

        Validate.notBlank(request.getPrivateEndpointId(), "privateEndpointId must not be blank");

        return clientCall(request, UpdatePrivateEndpointResponse::builder)
                .logger(LOG, "updatePrivateEndpoint")
                .serviceDetails(
                        "DataFlow",
                        "UpdatePrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/PrivateEndpoint/UpdatePrivateEndpoint")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePrivateEndpointRequest::builder)
                .basePath("/20200129")
                .appendPathParam("privateEndpoints")
                .appendPathParam(request.getPrivateEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdatePrivateEndpointResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateRunResponse updateRun(UpdateRunRequest request) {
        Objects.requireNonNull(request.getUpdateRunDetails(), "updateRunDetails is required");

        Validate.notBlank(request.getRunId(), "runId must not be blank");

        return clientCall(request, UpdateRunResponse::builder)
                .logger(LOG, "updateRun")
                .serviceDetails(
                        "DataFlow",
                        "UpdateRun",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/Run/UpdateRun")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRunRequest::builder)
                .basePath("/20200129")
                .appendPathParam("runs")
                .appendPathParam(request.getRunId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(com.oracle.bmc.dataflow.model.Run.class, UpdateRunResponse.Builder::run)
                .handleResponseHeaderString("etag", UpdateRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRunResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DataFlowWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DataFlowPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DataFlowClient(
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
    public DataFlowClient(
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
    public DataFlowClient(
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
    public DataFlowClient(
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
    public DataFlowClient(
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
    public DataFlowClient(
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
    public DataFlowClient(
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
    public DataFlowClient(
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
