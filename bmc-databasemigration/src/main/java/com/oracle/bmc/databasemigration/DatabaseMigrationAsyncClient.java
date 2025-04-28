/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.databasemigration.requests.*;
import com.oracle.bmc.databasemigration.responses.*;

import java.util.Objects;

/**
 * Async client implementation for DatabaseMigration service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
public class DatabaseMigrationAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DatabaseMigrationAsync {
    /** Service instance for DatabaseMigration. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DATABASEMIGRATION")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://odms.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DatabaseMigrationAsyncClient.class);

    DatabaseMigrationAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    DatabaseMigrationAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "DatabaseMigrationAsyncClient", "getJobOutputContent"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, DatabaseMigrationAsyncClient> {
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "databasemigration";
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
        public DatabaseMigrationAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DatabaseMigrationAsyncClient(
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
    public java.util.concurrent.Future<AbortJobResponse> abortJob(
            AbortJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AbortJobRequest, AbortJobResponse>
                    handler) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, AbortJobResponse::builder)
                .logger(LOG, "abortJob")
                .serviceDetails(
                        "DatabaseMigration",
                        "AbortJob",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Job/AbortJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AbortJobRequest::builder)
                .basePath("/20230518")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("actions")
                .appendPathParam("abort")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemigration.model.Job.class,
                        AbortJobResponse.Builder::job)
                .handleResponseHeaderString(
                        "opc-request-id", AbortJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", AbortJobResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<AddMigrationObjectsResponse> addMigrationObjects(
            AddMigrationObjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AddMigrationObjectsRequest, AddMigrationObjectsResponse>
                    handler) {

        Validate.notBlank(request.getMigrationId(), "migrationId must not be blank");
        Objects.requireNonNull(
                request.getAddMigrationObjectsDetails(), "addMigrationObjectsDetails is required");

        return clientCall(request, AddMigrationObjectsResponse::builder)
                .logger(LOG, "addMigrationObjects")
                .serviceDetails(
                        "DatabaseMigration",
                        "AddMigrationObjects",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Migration/AddMigrationObjects")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddMigrationObjectsRequest::builder)
                .basePath("/20230518")
                .appendPathParam("migrations")
                .appendPathParam(request.getMigrationId())
                .appendPathParam("actions")
                .appendPathParam("addMigrationObjects")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", AddMigrationObjectsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeConnectionCompartmentResponse>
            changeConnectionCompartment(
                    ChangeConnectionCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeConnectionCompartmentRequest,
                                    ChangeConnectionCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getConnectionId(), "connectionId must not be blank");
        Objects.requireNonNull(
                request.getChangeConnectionCompartmentDetails(),
                "changeConnectionCompartmentDetails is required");

        return clientCall(request, ChangeConnectionCompartmentResponse::builder)
                .logger(LOG, "changeConnectionCompartment")
                .serviceDetails(
                        "DatabaseMigration",
                        "ChangeConnectionCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Connection/ChangeConnectionCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeConnectionCompartmentRequest::builder)
                .basePath("/20230518")
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeConnectionCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeMigrationCompartmentResponse>
            changeMigrationCompartment(
                    ChangeMigrationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMigrationCompartmentRequest,
                                    ChangeMigrationCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getMigrationId(), "migrationId must not be blank");
        Objects.requireNonNull(
                request.getChangeMigrationCompartmentDetails(),
                "changeMigrationCompartmentDetails is required");

        return clientCall(request, ChangeMigrationCompartmentResponse::builder)
                .logger(LOG, "changeMigrationCompartment")
                .serviceDetails(
                        "DatabaseMigration",
                        "ChangeMigrationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Migration/ChangeMigrationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeMigrationCompartmentRequest::builder)
                .basePath("/20230518")
                .appendPathParam("migrations")
                .appendPathParam(request.getMigrationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeMigrationCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CloneMigrationResponse> cloneMigration(
            CloneMigrationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CloneMigrationRequest, CloneMigrationResponse>
                    handler) {

        Validate.notBlank(request.getMigrationId(), "migrationId must not be blank");
        Objects.requireNonNull(
                request.getCloneMigrationDetails(), "cloneMigrationDetails is required");

        return clientCall(request, CloneMigrationResponse::builder)
                .logger(LOG, "cloneMigration")
                .serviceDetails(
                        "DatabaseMigration",
                        "CloneMigration",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Migration/CloneMigration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CloneMigrationRequest::builder)
                .basePath("/20230518")
                .appendPathParam("migrations")
                .appendPathParam(request.getMigrationId())
                .appendPathParam("actions")
                .appendPathParam("clone")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemigration.model.Migration.class,
                        CloneMigrationResponse.Builder::migration)
                .handleResponseHeaderString(
                        "opc-request-id", CloneMigrationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CloneMigrationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CloneMigrationResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ConnectionDiagnosticsResponse> connectionDiagnostics(
            ConnectionDiagnosticsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ConnectionDiagnosticsRequest, ConnectionDiagnosticsResponse>
                    handler) {

        Validate.notBlank(request.getConnectionId(), "connectionId must not be blank");

        return clientCall(request, ConnectionDiagnosticsResponse::builder)
                .logger(LOG, "connectionDiagnostics")
                .serviceDetails(
                        "DatabaseMigration",
                        "ConnectionDiagnostics",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Connection/ConnectionDiagnostics")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConnectionDiagnosticsRequest::builder)
                .basePath("/20230518")
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionId())
                .appendPathParam("actions")
                .appendPathParam("diagnostics")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.databasemigration.model.DiagnosticsResult.class,
                        ConnectionDiagnosticsResponse.Builder::diagnosticsResult)
                .handleResponseHeaderString(
                        "opc-request-id", ConnectionDiagnosticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", ConnectionDiagnosticsResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionResponse> createConnection(
            CreateConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateConnectionRequest, CreateConnectionResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateConnectionDetails(), "createConnectionDetails is required");

        return clientCall(request, CreateConnectionResponse::builder)
                .logger(LOG, "createConnection")
                .serviceDetails("DatabaseMigration", "CreateConnection", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateConnectionRequest::builder)
                .basePath("/20230518")
                .appendPathParam("connections")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemigration.model.Connection.class,
                        CreateConnectionResponse.Builder::connection)
                .handleResponseHeaderString(
                        "opc-request-id", CreateConnectionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateConnectionResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMigrationResponse> createMigration(
            CreateMigrationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMigrationRequest, CreateMigrationResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateMigrationDetails(), "createMigrationDetails is required");

        return clientCall(request, CreateMigrationResponse::builder)
                .logger(LOG, "createMigration")
                .serviceDetails(
                        "DatabaseMigration",
                        "CreateMigration",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Migration/CreateMigration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMigrationRequest::builder)
                .basePath("/20230518")
                .appendPathParam("migrations")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemigration.model.Migration.class,
                        CreateMigrationResponse.Builder::migration)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMigrationResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateMigrationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateMigrationResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateParameterFileVersionResponse>
            createParameterFileVersion(
                    CreateParameterFileVersionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateParameterFileVersionRequest,
                                    CreateParameterFileVersionResponse>
                            handler) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");
        Objects.requireNonNull(
                request.getCreateParameterFileVersionDetails(),
                "createParameterFileVersionDetails is required");

        return clientCall(request, CreateParameterFileVersionResponse::builder)
                .logger(LOG, "createParameterFileVersion")
                .serviceDetails(
                        "DatabaseMigration",
                        "CreateParameterFileVersion",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Job/CreateParameterFileVersion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateParameterFileVersionRequest::builder)
                .basePath("/20230518")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("parameterFileVersions")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", CreateParameterFileVersionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateParameterFileVersionResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionResponse> deleteConnection(
            DeleteConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteConnectionRequest, DeleteConnectionResponse>
                    handler) {

        Validate.notBlank(request.getConnectionId(), "connectionId must not be blank");

        return clientCall(request, DeleteConnectionResponse::builder)
                .logger(LOG, "deleteConnection")
                .serviceDetails(
                        "DatabaseMigration",
                        "DeleteConnection",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Connection/DeleteConnection")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteConnectionRequest::builder)
                .basePath("/20230518")
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteConnectionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteConnectionResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteJobResponse> deleteJob(
            DeleteJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteJobRequest, DeleteJobResponse>
                    handler) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, DeleteJobResponse::builder)
                .logger(LOG, "deleteJob")
                .serviceDetails(
                        "DatabaseMigration",
                        "DeleteJob",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Job/DeleteJob")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteJobRequest::builder)
                .basePath("/20230518")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMigrationResponse> deleteMigration(
            DeleteMigrationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMigrationRequest, DeleteMigrationResponse>
                    handler) {

        Validate.notBlank(request.getMigrationId(), "migrationId must not be blank");

        return clientCall(request, DeleteMigrationResponse::builder)
                .logger(LOG, "deleteMigration")
                .serviceDetails(
                        "DatabaseMigration",
                        "DeleteMigration",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Migration/DeleteMigration")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMigrationRequest::builder)
                .basePath("/20230518")
                .appendPathParam("migrations")
                .appendPathParam(request.getMigrationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMigrationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteMigrationResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteParameterFileVersionResponse>
            deleteParameterFileVersion(
                    DeleteParameterFileVersionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteParameterFileVersionRequest,
                                    DeleteParameterFileVersionResponse>
                            handler) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        Validate.notBlank(request.getParameterFileName(), "parameterFileName must not be blank");

        return clientCall(request, DeleteParameterFileVersionResponse::builder)
                .logger(LOG, "deleteParameterFileVersion")
                .serviceDetails(
                        "DatabaseMigration",
                        "DeleteParameterFileVersion",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Job/DeleteParameterFileVersion")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteParameterFileVersionRequest::builder)
                .basePath("/20230518")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("parameterFileVersions")
                .appendPathParam(request.getParameterFileName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteParameterFileVersionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteParameterFileVersionResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EvaluateMigrationResponse> evaluateMigration(
            EvaluateMigrationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            EvaluateMigrationRequest, EvaluateMigrationResponse>
                    handler) {

        Validate.notBlank(request.getMigrationId(), "migrationId must not be blank");

        return clientCall(request, EvaluateMigrationResponse::builder)
                .logger(LOG, "evaluateMigration")
                .serviceDetails(
                        "DatabaseMigration",
                        "EvaluateMigration",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Job/EvaluateMigration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EvaluateMigrationRequest::builder)
                .basePath("/20230518")
                .appendPathParam("migrations")
                .appendPathParam(request.getMigrationId())
                .appendPathParam("actions")
                .appendPathParam("validate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemigration.model.Job.class,
                        EvaluateMigrationResponse.Builder::job)
                .handleResponseHeaderString(
                        "opc-request-id", EvaluateMigrationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", EvaluateMigrationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", EvaluateMigrationResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAdvisorReportResponse> getAdvisorReport(
            GetAdvisorReportRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAdvisorReportRequest, GetAdvisorReportResponse>
                    handler) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, GetAdvisorReportResponse::builder)
                .logger(LOG, "getAdvisorReport")
                .serviceDetails(
                        "DatabaseMigration",
                        "GetAdvisorReport",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Job/GetAdvisorReport")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAdvisorReportRequest::builder)
                .basePath("/20230518")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("advisorReport")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemigration.model.AdvisorReport.class,
                        GetAdvisorReportResponse.Builder::advisorReport)
                .handleResponseHeaderString(
                        "opc-request-id", GetAdvisorReportResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetAdvisorReportResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetConnectionResponse> getConnection(
            GetConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetConnectionRequest, GetConnectionResponse>
                    handler) {

        Validate.notBlank(request.getConnectionId(), "connectionId must not be blank");

        return clientCall(request, GetConnectionResponse::builder)
                .logger(LOG, "getConnection")
                .serviceDetails(
                        "DatabaseMigration",
                        "GetConnection",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Connection/GetConnection")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConnectionRequest::builder)
                .basePath("/20230518")
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemigration.model.Connection.class,
                        GetConnectionResponse.Builder::connection)
                .handleResponseHeaderString(
                        "opc-request-id", GetConnectionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetConnectionResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetJobResponse> getJob(
            GetJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetJobRequest, GetJobResponse> handler) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, GetJobResponse::builder)
                .logger(LOG, "getJob")
                .serviceDetails(
                        "DatabaseMigration",
                        "GetJob",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Job/GetJob")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJobRequest::builder)
                .basePath("/20230518")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemigration.model.Job.class,
                        GetJobResponse.Builder::job)
                .handleResponseHeaderString("opc-request-id", GetJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetJobResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetJobOutputContentResponse> getJobOutputContent(
            GetJobOutputContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetJobOutputContentRequest, GetJobOutputContentResponse>
                    handler) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, GetJobOutputContentResponse::builder)
                .logger(LOG, "getJobOutputContent")
                .serviceDetails(
                        "DatabaseMigration",
                        "GetJobOutputContent",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Job/GetJobOutputContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJobOutputContentRequest::builder)
                .basePath("/20230518")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("output")
                .appendPathParam("content")
                .accept("application/x-yaml")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        java.io.InputStream.class, GetJobOutputContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", GetJobOutputContentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMigrationResponse> getMigration(
            GetMigrationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetMigrationRequest, GetMigrationResponse>
                    handler) {

        Validate.notBlank(request.getMigrationId(), "migrationId must not be blank");

        return clientCall(request, GetMigrationResponse::builder)
                .logger(LOG, "getMigration")
                .serviceDetails(
                        "DatabaseMigration",
                        "GetMigration",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Migration/GetMigration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMigrationRequest::builder)
                .basePath("/20230518")
                .appendPathParam("migrations")
                .appendPathParam(request.getMigrationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.databasemigration.model.Migration.class,
                        GetMigrationResponse.Builder::migration)
                .handleResponseHeaderString(
                        "opc-request-id", GetMigrationResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetMigrationResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetParameterFileVersionResponse> getParameterFileVersion(
            GetParameterFileVersionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetParameterFileVersionRequest, GetParameterFileVersionResponse>
                    handler) {

        Validate.notBlank(request.getParameterFileName(), "parameterFileName must not be blank");

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, GetParameterFileVersionResponse::builder)
                .logger(LOG, "getParameterFileVersion")
                .serviceDetails(
                        "DatabaseMigration",
                        "GetParameterFileVersion",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Job/GetParameterFileVersion")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetParameterFileVersionRequest::builder)
                .basePath("/20230518")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("parameterFileVersions")
                .appendPathParam(request.getParameterFileName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemigration.model.ParameterFileVersion.class,
                        GetParameterFileVersionResponse.Builder::parameterFileVersion)
                .handleResponseHeaderString(
                        "opc-request-id", GetParameterFileVersionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetParameterFileVersionResponse.Builder::etag)
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
                        "DatabaseMigration",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20230518")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemigration.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListConnectionsResponse> listConnections(
            ListConnectionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListConnectionsRequest, ListConnectionsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListConnectionsResponse::builder)
                .logger(LOG, "listConnections")
                .serviceDetails(
                        "DatabaseMigration",
                        "ListConnections",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/ConnectionSummary/ListConnections")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListConnectionsRequest::builder)
                .basePath("/20230518")
                .appendPathParam("connections")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "technologyType",
                        request.getTechnologyType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "connectionType",
                        request.getConnectionType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("sourceConnectionId", request.getSourceConnectionId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemigration.model.ConnectionCollection.class,
                        ListConnectionsResponse.Builder::connectionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListConnectionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListConnectionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListExcludedObjectsResponse> listExcludedObjects(
            ListExcludedObjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListExcludedObjectsRequest, ListExcludedObjectsResponse>
                    handler) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, ListExcludedObjectsResponse::builder)
                .logger(LOG, "listExcludedObjects")
                .serviceDetails(
                        "DatabaseMigration",
                        "ListExcludedObjects",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/ExcludedObjectSummary/ListExcludedObjects")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExcludedObjectsRequest::builder)
                .basePath("/20230518")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("excludedObjects")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("type", request.getType())
                .appendQueryParam("owner", request.getOwner())
                .appendQueryParam("object", request.getObject())
                .appendQueryParam("ownerContains", request.getOwnerContains())
                .appendQueryParam("objectContains", request.getObjectContains())
                .appendEnumQueryParam("reasonCategory", request.getReasonCategory())
                .appendQueryParam("sourceRule", request.getSourceRule())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemigration.model.ExcludedObjectSummaryCollection
                                .class,
                        ListExcludedObjectsResponse.Builder::excludedObjectSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListExcludedObjectsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExcludedObjectsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListJobOutputsResponse> listJobOutputs(
            ListJobOutputsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListJobOutputsRequest, ListJobOutputsResponse>
                    handler) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, ListJobOutputsResponse::builder)
                .logger(LOG, "listJobOutputs")
                .serviceDetails(
                        "DatabaseMigration",
                        "ListJobOutputs",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/JobOutputSummary/ListJobOutputs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJobOutputsRequest::builder)
                .basePath("/20230518")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("output")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemigration.model.JobOutputSummaryCollection.class,
                        ListJobOutputsResponse.Builder::jobOutputSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListJobOutputsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListJobOutputsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListJobsResponse> listJobs(
            ListJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListJobsRequest, ListJobsResponse>
                    handler) {
        Objects.requireNonNull(request.getMigrationId(), "migrationId is required");

        return clientCall(request, ListJobsResponse::builder)
                .logger(LOG, "listJobs")
                .serviceDetails(
                        "DatabaseMigration",
                        "ListJobs",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/JobSummary/ListJobs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJobsRequest::builder)
                .basePath("/20230518")
                .appendPathParam("jobs")
                .appendQueryParam("migrationId", request.getMigrationId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemigration.model.JobCollection.class,
                        ListJobsResponse.Builder::jobCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListJobsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListJobsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMigrationObjectTypesResponse> listMigrationObjectTypes(
            ListMigrationObjectTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMigrationObjectTypesRequest, ListMigrationObjectTypesResponse>
                    handler) {
        Objects.requireNonNull(request.getConnectionType(), "connectionType is required");

        return clientCall(request, ListMigrationObjectTypesResponse::builder)
                .logger(LOG, "listMigrationObjectTypes")
                .serviceDetails(
                        "DatabaseMigration",
                        "ListMigrationObjectTypes",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/MigrationObjectTypeSummary/ListMigrationObjectTypes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMigrationObjectTypesRequest::builder)
                .basePath("/20230518")
                .appendPathParam("migrationObjectTypes")
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("connectionType", request.getConnectionType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemigration.model.MigrationObjectTypeSummaryCollection
                                .class,
                        ListMigrationObjectTypesResponse.Builder
                                ::migrationObjectTypeSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMigrationObjectTypesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMigrationObjectTypesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMigrationObjectsResponse> listMigrationObjects(
            ListMigrationObjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMigrationObjectsRequest, ListMigrationObjectsResponse>
                    handler) {

        Validate.notBlank(request.getMigrationId(), "migrationId must not be blank");

        return clientCall(request, ListMigrationObjectsResponse::builder)
                .logger(LOG, "listMigrationObjects")
                .serviceDetails(
                        "DatabaseMigration",
                        "ListMigrationObjects",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/MigrationObjectCollection/ListMigrationObjects")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMigrationObjectsRequest::builder)
                .basePath("/20230518")
                .appendPathParam("migrations")
                .appendPathParam(request.getMigrationId())
                .appendPathParam("migrationObjects")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.databasemigration.model.MigrationObjectCollection.class,
                        ListMigrationObjectsResponse.Builder::migrationObjectCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMigrationObjectsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMigrationObjectsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMigrationParametersResponse> listMigrationParameters(
            ListMigrationParametersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMigrationParametersRequest, ListMigrationParametersResponse>
                    handler) {

        return clientCall(request, ListMigrationParametersResponse::builder)
                .logger(LOG, "listMigrationParameters")
                .serviceDetails(
                        "DatabaseMigration",
                        "ListMigrationParameters",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/MigrationParameterSummary/ListMigrationParameters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMigrationParametersRequest::builder)
                .basePath("/20230518")
                .appendPathParam("migrationParameters")
                .appendEnumQueryParam("migrationType", request.getMigrationType())
                .appendEnumQueryParam("databaseCombination", request.getDatabaseCombination())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemigration.model.MigrationParameterSummaryCollection
                                .class,
                        ListMigrationParametersResponse.Builder
                                ::migrationParameterSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMigrationParametersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMigrationParametersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMigrationsResponse> listMigrations(
            ListMigrationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMigrationsRequest, ListMigrationsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListMigrationsResponse::builder)
                .logger(LOG, "listMigrations")
                .serviceDetails(
                        "DatabaseMigration",
                        "ListMigrations",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/MigrationSummary/ListMigrations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMigrationsRequest::builder)
                .basePath("/20230518")
                .appendPathParam("migrations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("lifecycleDetails", request.getLifecycleDetails())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemigration.model.MigrationCollection.class,
                        ListMigrationsResponse.Builder::migrationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMigrationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMigrationsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListParameterFileVersionsResponse> listParameterFileVersions(
            ListParameterFileVersionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListParameterFileVersionsRequest, ListParameterFileVersionsResponse>
                    handler) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, ListParameterFileVersionsResponse::builder)
                .logger(LOG, "listParameterFileVersions")
                .serviceDetails(
                        "DatabaseMigration",
                        "ListParameterFileVersions",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Job/ListParameterFileVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListParameterFileVersionsRequest::builder)
                .basePath("/20230518")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("parameterFileVersions")
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemigration.model.ParameterFileVersionCollection.class,
                        ListParameterFileVersionsResponse.Builder::parameterFileVersionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListParameterFileVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListParameterFileVersionsResponse.Builder::opcNextPage)
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
                        "DatabaseMigration",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20230518")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemigration.model.WorkRequestErrorCollection.class,
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
                .serviceDetails(
                        "DatabaseMigration",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20230518")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemigration.model.WorkRequestLogEntryCollection.class,
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
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "DatabaseMigration",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/WorkRequestSummary/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20230518")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemigration.model.WorkRequestCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<MakeCurrentParameterFileVersionResponse>
            makeCurrentParameterFileVersion(
                    MakeCurrentParameterFileVersionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    MakeCurrentParameterFileVersionRequest,
                                    MakeCurrentParameterFileVersionResponse>
                            handler) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        Validate.notBlank(request.getParameterFileName(), "parameterFileName must not be blank");

        return clientCall(request, MakeCurrentParameterFileVersionResponse::builder)
                .logger(LOG, "makeCurrentParameterFileVersion")
                .serviceDetails(
                        "DatabaseMigration",
                        "MakeCurrentParameterFileVersion",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Job/MakeCurrentParameterFileVersion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(MakeCurrentParameterFileVersionRequest::builder)
                .basePath("/20230518")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("parameterFileVersions")
                .appendPathParam(request.getParameterFileName())
                .appendPathParam("actions")
                .appendPathParam("makeCurrent")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemigration.model.Job.class,
                        MakeCurrentParameterFileVersionResponse.Builder::job)
                .handleResponseHeaderString(
                        "opc-request-id",
                        MakeCurrentParameterFileVersionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", MakeCurrentParameterFileVersionResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveMigrationObjectsResponse> removeMigrationObjects(
            RemoveMigrationObjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveMigrationObjectsRequest, RemoveMigrationObjectsResponse>
                    handler) {

        Validate.notBlank(request.getMigrationId(), "migrationId must not be blank");
        Objects.requireNonNull(
                request.getRemoveMigrationObjectsDetails(),
                "removeMigrationObjectsDetails is required");

        return clientCall(request, RemoveMigrationObjectsResponse::builder)
                .logger(LOG, "removeMigrationObjects")
                .serviceDetails(
                        "DatabaseMigration",
                        "RemoveMigrationObjects",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Migration/RemoveMigrationObjects")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveMigrationObjectsRequest::builder)
                .basePath("/20230518")
                .appendPathParam("migrations")
                .appendPathParam(request.getMigrationId())
                .appendPathParam("actions")
                .appendPathParam("removeMigrationObjects")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", RemoveMigrationObjectsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ResumeJobResponse> resumeJob(
            ResumeJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ResumeJobRequest, ResumeJobResponse>
                    handler) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, ResumeJobResponse::builder)
                .logger(LOG, "resumeJob")
                .serviceDetails(
                        "DatabaseMigration",
                        "ResumeJob",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Job/ResumeJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ResumeJobRequest::builder)
                .basePath("/20230518")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("actions")
                .appendPathParam("resume")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemigration.model.Job.class,
                        ResumeJobResponse.Builder::job)
                .handleResponseHeaderString(
                        "opc-request-id", ResumeJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", ResumeJobResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RetrieveSupportedPhasesResponse> retrieveSupportedPhases(
            RetrieveSupportedPhasesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RetrieveSupportedPhasesRequest, RetrieveSupportedPhasesResponse>
                    handler) {

        Validate.notBlank(request.getMigrationId(), "migrationId must not be blank");

        return clientCall(request, RetrieveSupportedPhasesResponse::builder)
                .logger(LOG, "retrieveSupportedPhases")
                .serviceDetails(
                        "DatabaseMigration",
                        "RetrieveSupportedPhases",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Migration/RetrieveSupportedPhases")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RetrieveSupportedPhasesRequest::builder)
                .basePath("/20230518")
                .appendPathParam("migrations")
                .appendPathParam(request.getMigrationId())
                .appendPathParam("actions")
                .appendPathParam("getSupportedPhases")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemigration.model.MigrationPhaseCollection.class,
                        RetrieveSupportedPhasesResponse.Builder::migrationPhaseCollection)
                .handleResponseHeaderString(
                        "opc-request-id", RetrieveSupportedPhasesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartMigrationResponse> startMigration(
            StartMigrationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartMigrationRequest, StartMigrationResponse>
                    handler) {

        Validate.notBlank(request.getMigrationId(), "migrationId must not be blank");

        return clientCall(request, StartMigrationResponse::builder)
                .logger(LOG, "startMigration")
                .serviceDetails(
                        "DatabaseMigration",
                        "StartMigration",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Job/StartMigration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartMigrationRequest::builder)
                .basePath("/20230518")
                .appendPathParam("migrations")
                .appendPathParam(request.getMigrationId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemigration.model.Job.class,
                        StartMigrationResponse.Builder::job)
                .handleResponseHeaderString(
                        "opc-request-id", StartMigrationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", StartMigrationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", StartMigrationResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SuspendJobResponse> suspendJob(
            SuspendJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<SuspendJobRequest, SuspendJobResponse>
                    handler) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");

        return clientCall(request, SuspendJobResponse::builder)
                .logger(LOG, "suspendJob")
                .serviceDetails(
                        "DatabaseMigration",
                        "SuspendJob",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Job/SuspendJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SuspendJobRequest::builder)
                .basePath("/20230518")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .appendPathParam("actions")
                .appendPathParam("suspend")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasemigration.model.Job.class,
                        SuspendJobResponse.Builder::job)
                .handleResponseHeaderString(
                        "opc-request-id", SuspendJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", SuspendJobResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectionResponse> updateConnection(
            UpdateConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateConnectionRequest, UpdateConnectionResponse>
                    handler) {

        Validate.notBlank(request.getConnectionId(), "connectionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateConnectionDetails(), "updateConnectionDetails is required");

        return clientCall(request, UpdateConnectionResponse::builder)
                .logger(LOG, "updateConnection")
                .serviceDetails(
                        "DatabaseMigration",
                        "UpdateConnection",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Connection/UpdateConnection")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateConnectionRequest::builder)
                .basePath("/20230518")
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateConnectionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateConnectionResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateJobResponse> updateJob(
            UpdateJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateJobRequest, UpdateJobResponse>
                    handler) {

        Validate.notBlank(request.getJobId(), "jobId must not be blank");
        Objects.requireNonNull(request.getUpdateJobDetails(), "updateJobDetails is required");

        return clientCall(request, UpdateJobResponse::builder)
                .logger(LOG, "updateJob")
                .serviceDetails(
                        "DatabaseMigration",
                        "UpdateJob",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Job/UpdateJob")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateJobRequest::builder)
                .basePath("/20230518")
                .appendPathParam("jobs")
                .appendPathParam(request.getJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasemigration.model.Job.class,
                        UpdateJobResponse.Builder::job)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateJobResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateMigrationResponse> updateMigration(
            UpdateMigrationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMigrationRequest, UpdateMigrationResponse>
                    handler) {

        Validate.notBlank(request.getMigrationId(), "migrationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMigrationDetails(), "updateMigrationDetails is required");

        return clientCall(request, UpdateMigrationResponse::builder)
                .logger(LOG, "updateMigration")
                .serviceDetails(
                        "DatabaseMigration",
                        "UpdateMigration",
                        "https://docs.oracle.com/iaas/api/#/en/database-migration/20230518/Migration/UpdateMigration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMigrationRequest::builder)
                .basePath("/20230518")
                .appendPathParam("migrations")
                .appendPathParam(request.getMigrationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMigrationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateMigrationResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DatabaseMigrationAsyncClient(
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
    public DatabaseMigrationAsyncClient(
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
    public DatabaseMigrationAsyncClient(
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
    public DatabaseMigrationAsyncClient(
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
    public DatabaseMigrationAsyncClient(
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
    public DatabaseMigrationAsyncClient(
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
    public DatabaseMigrationAsyncClient(
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
