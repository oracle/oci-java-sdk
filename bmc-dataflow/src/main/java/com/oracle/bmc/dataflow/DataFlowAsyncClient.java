/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.dataflow.requests.*;
import com.oracle.bmc.dataflow.responses.*;

import java.util.Objects;

/**
 * Async client implementation for DataFlow service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
public class DataFlowAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DataFlowAsync {
    /** Service instance for DataFlow. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DATAFLOW")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://dataflow.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DataFlowAsyncClient.class);

    DataFlowAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    DataFlowAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "DataFlowAsyncClient", "getRunLog"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DataFlowAsyncClient> {
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "dataflow";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
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
        public DataFlowAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DataFlowAsyncClient(
                    this, authenticationDetailsProvider, isStreamWarningEnabled);
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
    public java.util.concurrent.Future<ChangeApplicationCompartmentResponse>
            changeApplicationCompartment(
                    ChangeApplicationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeApplicationCompartmentRequest,
                                    ChangeApplicationCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangePoolCompartmentResponse> changePoolCompartment(
            ChangePoolCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangePoolCompartmentRequest, ChangePoolCompartmentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangePrivateEndpointCompartmentResponse>
            changePrivateEndpointCompartment(
                    ChangePrivateEndpointCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangePrivateEndpointCompartmentRequest,
                                    ChangePrivateEndpointCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeRunCompartmentResponse> changeRunCompartment(
            ChangeRunCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeRunCompartmentRequest, ChangeRunCompartmentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeSqlEndpointCompartmentResponse>
            changeSqlEndpointCompartment(
                    ChangeSqlEndpointCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSqlEndpointCompartmentRequest,
                                    ChangeSqlEndpointCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getSqlEndpointId(), "sqlEndpointId must not be blank");
        Objects.requireNonNull(
                request.getChangeSqlEndpointCompartmentDetails(),
                "changeSqlEndpointCompartmentDetails is required");

        return clientCall(request, ChangeSqlEndpointCompartmentResponse::builder)
                .logger(LOG, "changeSqlEndpointCompartment")
                .serviceDetails(
                        "DataFlow",
                        "ChangeSqlEndpointCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/SqlEndpoint/ChangeSqlEndpointCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSqlEndpointCompartmentRequest::builder)
                .basePath("/20200129")
                .appendPathParam("sqlEndpoints")
                .appendPathParam(request.getSqlEndpointId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeSqlEndpointCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeSqlEndpointCompartmentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResponse> createApplication(
            CreateApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateApplicationRequest, CreateApplicationResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePoolResponse> createPool(
            CreatePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreatePoolRequest, CreatePoolResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePrivateEndpointResponse> createPrivateEndpoint(
            CreatePrivateEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePrivateEndpointRequest, CreatePrivateEndpointResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateRunResponse> createRun(
            CreateRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateRunRequest, CreateRunResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSqlEndpointResponse> createSqlEndpoint(
            CreateSqlEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSqlEndpointRequest, CreateSqlEndpointResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateSqlEndpointDetails(), "createSqlEndpointDetails is required");

        return clientCall(request, CreateSqlEndpointResponse::builder)
                .logger(LOG, "createSqlEndpoint")
                .serviceDetails("DataFlow", "CreateSqlEndpoint", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSqlEndpointRequest::builder)
                .basePath("/20200129")
                .appendPathParam("sqlEndpoints")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dataflow.model.SqlEndpoint.class,
                        CreateSqlEndpointResponse.Builder::sqlEndpoint)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSqlEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateSqlEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreateSqlEndpointResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateStatementResponse> createStatement(
            CreateStatementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateStatementRequest, CreateStatementResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResponse> deleteApplication(
            DeleteApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteApplicationRequest, DeleteApplicationResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePoolResponse> deletePool(
            DeletePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeletePoolRequest, DeletePoolResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePrivateEndpointResponse> deletePrivateEndpoint(
            DeletePrivateEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePrivateEndpointRequest, DeletePrivateEndpointResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteRunResponse> deleteRun(
            DeleteRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteRunRequest, DeleteRunResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSqlEndpointResponse> deleteSqlEndpoint(
            DeleteSqlEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSqlEndpointRequest, DeleteSqlEndpointResponse>
                    handler) {

        Validate.notBlank(request.getSqlEndpointId(), "sqlEndpointId must not be blank");

        return clientCall(request, DeleteSqlEndpointResponse::builder)
                .logger(LOG, "deleteSqlEndpoint")
                .serviceDetails(
                        "DataFlow",
                        "DeleteSqlEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/SqlEndpoint/DeleteSqlEndpoint")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSqlEndpointRequest::builder)
                .basePath("/20200129")
                .appendPathParam("sqlEndpoints")
                .appendPathParam(request.getSqlEndpointId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSqlEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteSqlEndpointResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteStatementResponse> deleteStatement(
            DeleteStatementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteStatementRequest, DeleteStatementResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationResponse> getApplication(
            GetApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetApplicationRequest, GetApplicationResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPoolResponse> getPool(
            GetPoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPoolRequest, GetPoolResponse> handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPrivateEndpointResponse> getPrivateEndpoint(
            GetPrivateEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPrivateEndpointRequest, GetPrivateEndpointResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRunResponse> getRun(
            GetRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetRunRequest, GetRunResponse> handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRunLogResponse> getRunLog(
            GetRunLogRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetRunLogRequest, GetRunLogResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSqlEndpointResponse> getSqlEndpoint(
            GetSqlEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSqlEndpointRequest, GetSqlEndpointResponse>
                    handler) {

        Validate.notBlank(request.getSqlEndpointId(), "sqlEndpointId must not be blank");

        return clientCall(request, GetSqlEndpointResponse::builder)
                .logger(LOG, "getSqlEndpoint")
                .serviceDetails(
                        "DataFlow",
                        "GetSqlEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/SqlEndpoint/GetSqlEndpoint")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSqlEndpointRequest::builder)
                .basePath("/20200129")
                .appendPathParam("sqlEndpoints")
                .appendPathParam(request.getSqlEndpointId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataflow.model.SqlEndpoint.class,
                        GetSqlEndpointResponse.Builder::sqlEndpoint)
                .handleResponseHeaderString("etag", GetSqlEndpointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSqlEndpointResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetStatementResponse> getStatement(
            GetStatementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetStatementRequest, GetStatementResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResponse> listApplications(
            ListApplicationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListApplicationsRequest, ListApplicationsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPoolsResponse> listPools(
            ListPoolsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPoolsRequest, ListPoolsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPrivateEndpointsResponse> listPrivateEndpoints(
            ListPrivateEndpointsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPrivateEndpointsRequest, ListPrivateEndpointsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRunLogsResponse> listRunLogs(
            ListRunLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListRunLogsRequest, ListRunLogsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRunsResponse> listRuns(
            ListRunsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListRunsRequest, ListRunsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSqlEndpointsResponse> listSqlEndpoints(
            ListSqlEndpointsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSqlEndpointsRequest, ListSqlEndpointsResponse>
                    handler) {

        return clientCall(request, ListSqlEndpointsResponse::builder)
                .logger(LOG, "listSqlEndpoints")
                .serviceDetails(
                        "DataFlow",
                        "ListSqlEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/SqlEndpointCollection/ListSqlEndpoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSqlEndpointsRequest::builder)
                .basePath("/20200129")
                .appendPathParam("sqlEndpoints")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("sqlEndpointId", request.getSqlEndpointId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dataflow.model.SqlEndpointCollection.class,
                        ListSqlEndpointsResponse.Builder::sqlEndpointCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListSqlEndpointsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSqlEndpointsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListStatementsResponse> listStatements(
            ListStatementsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListStatementsRequest, ListStatementsResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartPoolResponse> startPool(
            StartPoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<StartPoolRequest, StartPoolResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopPoolResponse> stopPool(
            StopPoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<StopPoolRequest, StopPoolResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResponse> updateApplication(
            UpdateApplicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateApplicationRequest, UpdateApplicationResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePoolResponse> updatePool(
            UpdatePoolRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdatePoolRequest, UpdatePoolResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePrivateEndpointResponse> updatePrivateEndpoint(
            UpdatePrivateEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePrivateEndpointRequest, UpdatePrivateEndpointResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateRunResponse> updateRun(
            UpdateRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateRunRequest, UpdateRunResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSqlEndpointResponse> updateSqlEndpoint(
            UpdateSqlEndpointRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSqlEndpointRequest, UpdateSqlEndpointResponse>
                    handler) {
        Objects.requireNonNull(
                request.getUpdateSqlEndpointDetails(), "updateSqlEndpointDetails is required");

        Validate.notBlank(request.getSqlEndpointId(), "sqlEndpointId must not be blank");

        return clientCall(request, UpdateSqlEndpointResponse::builder)
                .logger(LOG, "updateSqlEndpoint")
                .serviceDetails(
                        "DataFlow",
                        "UpdateSqlEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/data-flow/20200129/SqlEndpoint/UpdateSqlEndpoint")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSqlEndpointRequest::builder)
                .basePath("/20200129")
                .appendPathParam("sqlEndpoints")
                .appendPathParam(request.getSqlEndpointId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSqlEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateSqlEndpointResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DataFlowAsyncClient(
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
    public DataFlowAsyncClient(
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
    public DataFlowAsyncClient(
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
    public DataFlowAsyncClient(
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
    public DataFlowAsyncClient(
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
    public DataFlowAsyncClient(
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
    public DataFlowAsyncClient(
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
