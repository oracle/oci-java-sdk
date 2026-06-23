/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.databasetoolsruntime.requests.*;
import com.oracle.bmc.databasetoolsruntime.responses.*;

import java.util.Objects;

/**
 * Async client implementation for DatabaseToolsRuntime service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
public class DatabaseToolsRuntimeAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DatabaseToolsRuntimeAsync {
    /** Service instance for DatabaseToolsRuntime. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DatabaseToolsRuntimeClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://dbtools.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DatabaseToolsRuntimeAsyncClient.class);

    DatabaseToolsRuntimeAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    DatabaseToolsRuntimeAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "DatabaseToolsRuntimeAsyncClient",
                            "getDatabaseToolsDatabaseApiGatewayConfigContent"));
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
                    Builder, DatabaseToolsRuntimeAsyncClient> {
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "databasetoolsruntime";
            com.oracle.bmc.internal.DeveloperToolConfiguration
                    .throwDisabledServiceExceptionIfAppropriate(packageName);
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
        public DatabaseToolsRuntimeAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DatabaseToolsRuntimeAsyncClient(
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
    public java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, CancelWorkRequestResponse::builder)
                .logger(LOG, "cancelWorkRequest")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20230222")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateCredentialResponse> createCredential(
            CreateCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCredentialRequest, CreateCredentialResponse>
                    handler) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");
        Objects.requireNonNull(
                request.getCreateCredentialDetails(), "createCredentialDetails is required");

        return clientCall(request, CreateCredentialResponse::builder)
                .logger(LOG, "createCredential")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "CreateCredential",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/DatabaseToolsConnection/CreateCredential")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCredentialRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendPathParam("credentials")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.Credential.class,
                        CreateCredentialResponse.Builder::credential)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCredentialResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", CreateCredentialResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateCredentialExecuteGranteeResponse>
            createCredentialExecuteGrantee(
                    CreateCredentialExecuteGranteeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateCredentialExecuteGranteeRequest,
                                    CreateCredentialExecuteGranteeResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");

        Validate.notBlank(request.getCredentialKey(), "credentialKey must not be blank");
        Objects.requireNonNull(
                request.getCreateCredentialExecuteGranteeDetails(),
                "createCredentialExecuteGranteeDetails is required");

        return clientCall(request, CreateCredentialExecuteGranteeResponse::builder)
                .logger(LOG, "createCredentialExecuteGrantee")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "CreateCredentialExecuteGrantee",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/CredentialExecuteGrantee/CreateCredentialExecuteGrantee")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCredentialExecuteGranteeRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendPathParam("credentials")
                .appendPathParam(request.getCredentialKey())
                .appendPathParam("executeGrantees")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.CredentialExecuteGrantee.class,
                        CreateCredentialExecuteGranteeResponse.Builder::credentialExecuteGrantee)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateCredentialExecuteGranteeResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateCredentialExecuteGranteeResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateCredentialPublicSynonymResponse>
            createCredentialPublicSynonym(
                    CreateCredentialPublicSynonymRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateCredentialPublicSynonymRequest,
                                    CreateCredentialPublicSynonymResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");

        Validate.notBlank(request.getCredentialKey(), "credentialKey must not be blank");
        Objects.requireNonNull(
                request.getCreateCredentialPublicSynonymDetails(),
                "createCredentialPublicSynonymDetails is required");

        return clientCall(request, CreateCredentialPublicSynonymResponse::builder)
                .logger(LOG, "createCredentialPublicSynonym")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "CreateCredentialPublicSynonym",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/CredentialPublicSynonym/CreateCredentialPublicSynonym")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCredentialPublicSynonymRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendPathParam("credentials")
                .appendPathParam(request.getCredentialKey())
                .appendPathParam("publicSynonyms")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.CredentialPublicSynonym.class,
                        CreateCredentialPublicSynonymResponse.Builder::credentialPublicSynonym)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateCredentialPublicSynonymResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateCredentialPublicSynonymResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
            createDatabaseToolsDatabaseApiGatewayConfigPool(
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsDatabaseApiGatewayConfigId(),
                "databaseToolsDatabaseApiGatewayConfigId must not be blank");
        Objects.requireNonNull(
                request.getCreateDatabaseToolsDatabaseApiGatewayConfigPoolDetails(),
                "createDatabaseToolsDatabaseApiGatewayConfigPoolDetails is required");

        return clientCall(request, CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse::builder)
                .logger(LOG, "createDatabaseToolsDatabaseApiGatewayConfigPool")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "CreateDatabaseToolsDatabaseApiGatewayConfigPool",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/DatabaseToolsDatabaseApiGatewayConfigPool/CreateDatabaseToolsDatabaseApiGatewayConfigPool")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsDatabaseApiGatewayConfigs")
                .appendPathParam(request.getDatabaseToolsDatabaseApiGatewayConfigId())
                .appendPathParam("pools")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model
                                .DatabaseToolsDatabaseApiGatewayConfigPool.class,
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse.Builder
                                ::databaseToolsDatabaseApiGatewayConfigPool)
                .handleResponseHeaderString(
                        "location",
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse.Builder::location)
                .handleResponseHeaderString(
                        "etag",
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
            createDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec(
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest,
                                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsDatabaseApiGatewayConfigId(),
                "databaseToolsDatabaseApiGatewayConfigId must not be blank");

        Validate.notBlank(request.getPoolKey(), "poolKey must not be blank");
        Objects.requireNonNull(
                request.getCreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecDetails(),
                "createDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecDetails is required");

        return clientCall(
                        request,
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse::builder)
                .logger(LOG, "createDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/DatabaseToolsDatabaseApiGatewayConfigPoolApiSpec/CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsDatabaseApiGatewayConfigs")
                .appendPathParam(request.getDatabaseToolsDatabaseApiGatewayConfigId())
                .appendPathParam("pools")
                .appendPathParam(request.getPoolKey())
                .appendPathParam("apiSpecs")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model
                                .DatabaseToolsDatabaseApiGatewayConfigPoolApiSpec.class,
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse.Builder
                                ::databaseToolsDatabaseApiGatewayConfigPoolApiSpec)
                .handleResponseHeaderString(
                        "location",
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse.Builder
                                ::location)
                .handleResponseHeaderString(
                        "etag",
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse.Builder
                                ::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
            createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsDatabaseApiGatewayConfigId(),
                "databaseToolsDatabaseApiGatewayConfigId must not be blank");

        Validate.notBlank(request.getPoolKey(), "poolKey must not be blank");
        Objects.requireNonNull(
                request.getCreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails(),
                "createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails is required");

        return clientCall(
                        request,
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse::builder)
                .logger(LOG, "createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/DatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec/CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsDatabaseApiGatewayConfigs")
                .appendPathParam(request.getDatabaseToolsDatabaseApiGatewayConfigId())
                .appendPathParam("pools")
                .appendPathParam(request.getPoolKey())
                .appendPathParam("autoApiSpecs")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model
                                .DatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec.class,
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse.Builder
                                ::databaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec)
                .handleResponseHeaderString(
                        "location",
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse.Builder
                                ::location)
                .handleResponseHeaderString(
                        "etag",
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse.Builder
                                ::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteCredentialResponse> deleteCredential(
            DeleteCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCredentialRequest, DeleteCredentialResponse>
                    handler) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");

        Validate.notBlank(request.getCredentialKey(), "credentialKey must not be blank");

        return clientCall(request, DeleteCredentialResponse::builder)
                .logger(LOG, "deleteCredential")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "DeleteCredential",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/Credential/DeleteCredential")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCredentialRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendPathParam("credentials")
                .appendPathParam(request.getCredentialKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCredentialResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteCredentialExecuteGranteeResponse>
            deleteCredentialExecuteGrantee(
                    DeleteCredentialExecuteGranteeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteCredentialExecuteGranteeRequest,
                                    DeleteCredentialExecuteGranteeResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");

        Validate.notBlank(request.getCredentialKey(), "credentialKey must not be blank");

        Validate.notBlank(request.getExecuteGranteeKey(), "executeGranteeKey must not be blank");

        return clientCall(request, DeleteCredentialExecuteGranteeResponse::builder)
                .logger(LOG, "deleteCredentialExecuteGrantee")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "DeleteCredentialExecuteGrantee",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/CredentialExecuteGrantee/DeleteCredentialExecuteGrantee")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCredentialExecuteGranteeRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendPathParam("credentials")
                .appendPathParam(request.getCredentialKey())
                .appendPathParam("executeGrantees")
                .appendPathParam(request.getExecuteGranteeKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteCredentialExecuteGranteeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteCredentialPublicSynonymResponse>
            deleteCredentialPublicSynonym(
                    DeleteCredentialPublicSynonymRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteCredentialPublicSynonymRequest,
                                    DeleteCredentialPublicSynonymResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");

        Validate.notBlank(request.getCredentialKey(), "credentialKey must not be blank");

        Validate.notBlank(request.getPublicSynonymKey(), "publicSynonymKey must not be blank");

        return clientCall(request, DeleteCredentialPublicSynonymResponse::builder)
                .logger(LOG, "deleteCredentialPublicSynonym")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "DeleteCredentialPublicSynonym",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/CredentialPublicSynonym/DeleteCredentialPublicSynonym")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCredentialPublicSynonymRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendPathParam("credentials")
                .appendPathParam(request.getCredentialKey())
                .appendPathParam("publicSynonyms")
                .appendPathParam(request.getPublicSynonymKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteCredentialPublicSynonymResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
            deleteDatabaseToolsDatabaseApiGatewayConfigPool(
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsDatabaseApiGatewayConfigId(),
                "databaseToolsDatabaseApiGatewayConfigId must not be blank");

        Validate.notBlank(request.getPoolKey(), "poolKey must not be blank");

        return clientCall(request, DeleteDatabaseToolsDatabaseApiGatewayConfigPoolResponse::builder)
                .logger(LOG, "deleteDatabaseToolsDatabaseApiGatewayConfigPool")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "DeleteDatabaseToolsDatabaseApiGatewayConfigPool",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/DatabaseToolsDatabaseApiGatewayConfig/DeleteDatabaseToolsDatabaseApiGatewayConfigPool")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDatabaseToolsDatabaseApiGatewayConfigPoolRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsDatabaseApiGatewayConfigs")
                .appendPathParam(request.getDatabaseToolsDatabaseApiGatewayConfigId())
                .appendPathParam("pools")
                .appendPathParam(request.getPoolKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
            deleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec(
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest,
                                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsDatabaseApiGatewayConfigId(),
                "databaseToolsDatabaseApiGatewayConfigId must not be blank");

        Validate.notBlank(request.getPoolKey(), "poolKey must not be blank");

        Validate.notBlank(request.getApiSpecKey(), "apiSpecKey must not be blank");

        return clientCall(
                        request,
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse::builder)
                .logger(LOG, "deleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/DatabaseToolsDatabaseApiGatewayConfig/DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsDatabaseApiGatewayConfigs")
                .appendPathParam(request.getDatabaseToolsDatabaseApiGatewayConfigId())
                .appendPathParam("pools")
                .appendPathParam(request.getPoolKey())
                .appendPathParam("apiSpecs")
                .appendPathParam(request.getApiSpecKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
            deleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsDatabaseApiGatewayConfigId(),
                "databaseToolsDatabaseApiGatewayConfigId must not be blank");

        Validate.notBlank(request.getPoolKey(), "poolKey must not be blank");

        Validate.notBlank(request.getAutoApiSpecKey(), "autoApiSpecKey must not be blank");

        return clientCall(
                        request,
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse::builder)
                .logger(LOG, "deleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/DatabaseToolsDatabaseApiGatewayConfig/DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsDatabaseApiGatewayConfigs")
                .appendPathParam(request.getDatabaseToolsDatabaseApiGatewayConfigId())
                .appendPathParam("pools")
                .appendPathParam(request.getPoolKey())
                .appendPathParam("autoApiSpecs")
                .appendPathParam(request.getAutoApiSpecKey())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ExecuteSqlDatabaseToolsConnectionResponse>
            executeSqlDatabaseToolsConnection(
                    ExecuteSqlDatabaseToolsConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ExecuteSqlDatabaseToolsConnectionRequest,
                                    ExecuteSqlDatabaseToolsConnectionResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");
        Objects.requireNonNull(
                request.getExecuteSqlDatabaseToolsConnectionDetails(),
                "executeSqlDatabaseToolsConnectionDetails is required");

        return clientCall(request, ExecuteSqlDatabaseToolsConnectionResponse::builder)
                .logger(LOG, "executeSqlDatabaseToolsConnection")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "ExecuteSqlDatabaseToolsConnection",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/DatabaseToolsConnection/ExecuteSqlDatabaseToolsConnection")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExecuteSqlDatabaseToolsConnectionRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendPathParam("actions")
                .appendPathParam("executeSql")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.ExecuteSqlResponse.class,
                        ExecuteSqlDatabaseToolsConnectionResponse.Builder::executeSqlResponse)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ExecuteSqlDatabaseToolsConnectionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ExecuteSqlDatabaseToolsConnectionResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCredentialResponse> getCredential(
            GetCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetCredentialRequest, GetCredentialResponse>
                    handler) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");

        Validate.notBlank(request.getCredentialKey(), "credentialKey must not be blank");

        return clientCall(request, GetCredentialResponse::builder)
                .logger(LOG, "getCredential")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "GetCredential",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/Credential/GetCredential")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCredentialRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendPathParam("credentials")
                .appendPathParam(request.getCredentialKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.Credential.class,
                        GetCredentialResponse.Builder::credential)
                .handleResponseHeaderString(
                        "opc-request-id", GetCredentialResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCredentialExecuteGranteeResponse>
            getCredentialExecuteGrantee(
                    GetCredentialExecuteGranteeRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetCredentialExecuteGranteeRequest,
                                    GetCredentialExecuteGranteeResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");

        Validate.notBlank(request.getCredentialKey(), "credentialKey must not be blank");

        Validate.notBlank(request.getExecuteGranteeKey(), "executeGranteeKey must not be blank");

        return clientCall(request, GetCredentialExecuteGranteeResponse::builder)
                .logger(LOG, "getCredentialExecuteGrantee")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "GetCredentialExecuteGrantee",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/CredentialExecuteGrantee/GetCredentialExecuteGrantee")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCredentialExecuteGranteeRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendPathParam("credentials")
                .appendPathParam(request.getCredentialKey())
                .appendPathParam("executeGrantees")
                .appendPathParam(request.getExecuteGranteeKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.CredentialExecuteGrantee.class,
                        GetCredentialExecuteGranteeResponse.Builder::credentialExecuteGrantee)
                .handleResponseHeaderString(
                        "opc-request-id", GetCredentialExecuteGranteeResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCredentialPublicSynonymResponse>
            getCredentialPublicSynonym(
                    GetCredentialPublicSynonymRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetCredentialPublicSynonymRequest,
                                    GetCredentialPublicSynonymResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");

        Validate.notBlank(request.getCredentialKey(), "credentialKey must not be blank");

        Validate.notBlank(request.getPublicSynonymKey(), "publicSynonymKey must not be blank");

        return clientCall(request, GetCredentialPublicSynonymResponse::builder)
                .logger(LOG, "getCredentialPublicSynonym")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "GetCredentialPublicSynonym",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/CredentialPublicSynonym/GetCredentialPublicSynonym")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCredentialPublicSynonymRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendPathParam("credentials")
                .appendPathParam(request.getCredentialKey())
                .appendPathParam("publicSynonyms")
                .appendPathParam(request.getPublicSynonymKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.CredentialPublicSynonym.class,
                        GetCredentialPublicSynonymResponse.Builder::credentialPublicSynonym)
                .handleResponseHeaderString(
                        "opc-request-id", GetCredentialPublicSynonymResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseToolsDatabaseApiGatewayConfigContentResponse>
            getDatabaseToolsDatabaseApiGatewayConfigContent(
                    GetDatabaseToolsDatabaseApiGatewayConfigContentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsDatabaseApiGatewayConfigContentRequest,
                                    GetDatabaseToolsDatabaseApiGatewayConfigContentResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsDatabaseApiGatewayConfigId(),
                "databaseToolsDatabaseApiGatewayConfigId must not be blank");

        return clientCall(request, GetDatabaseToolsDatabaseApiGatewayConfigContentResponse::builder)
                .logger(LOG, "getDatabaseToolsDatabaseApiGatewayConfigContent")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "GetDatabaseToolsDatabaseApiGatewayConfigContent",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/DatabaseToolsDatabaseApiGatewayConfig/GetDatabaseToolsDatabaseApiGatewayConfigContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatabaseToolsDatabaseApiGatewayConfigContentRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsDatabaseApiGatewayConfigs")
                .appendPathParam(request.getDatabaseToolsDatabaseApiGatewayConfigId())
                .appendPathParam("content")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .handleBody(
                        java.io.InputStream.class,
                        GetDatabaseToolsDatabaseApiGatewayConfigContentResponse.Builder
                                ::inputStream)
                .handleResponseHeaderString(
                        "etag",
                        GetDatabaseToolsDatabaseApiGatewayConfigContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDatabaseToolsDatabaseApiGatewayConfigContentResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>
            getDatabaseToolsDatabaseApiGatewayConfigGlobal(
                    GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest,
                                    GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsDatabaseApiGatewayConfigId(),
                "databaseToolsDatabaseApiGatewayConfigId must not be blank");

        Validate.notBlank(request.getGlobalKey().getValue(), "globalKey must not be blank");

        return clientCall(request, GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse::builder)
                .logger(LOG, "getDatabaseToolsDatabaseApiGatewayConfigGlobal")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "GetDatabaseToolsDatabaseApiGatewayConfigGlobal",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/DatabaseToolsDatabaseApiGatewayConfigGlobal/GetDatabaseToolsDatabaseApiGatewayConfigGlobal")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsDatabaseApiGatewayConfigs")
                .appendPathParam(request.getDatabaseToolsDatabaseApiGatewayConfigId())
                .appendPathParam("globals")
                .appendPathParam(request.getGlobalKey().getValue())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model
                                .DatabaseToolsDatabaseApiGatewayConfigGlobal.class,
                        GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse.Builder
                                ::databaseToolsDatabaseApiGatewayConfigGlobal)
                .handleResponseHeaderString(
                        "etag",
                        GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
            getDatabaseToolsDatabaseApiGatewayConfigPool(
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                                    GetDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsDatabaseApiGatewayConfigId(),
                "databaseToolsDatabaseApiGatewayConfigId must not be blank");

        Validate.notBlank(request.getPoolKey(), "poolKey must not be blank");

        return clientCall(request, GetDatabaseToolsDatabaseApiGatewayConfigPoolResponse::builder)
                .logger(LOG, "getDatabaseToolsDatabaseApiGatewayConfigPool")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "GetDatabaseToolsDatabaseApiGatewayConfigPool",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/DatabaseToolsDatabaseApiGatewayConfigPool/GetDatabaseToolsDatabaseApiGatewayConfigPool")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatabaseToolsDatabaseApiGatewayConfigPoolRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsDatabaseApiGatewayConfigs")
                .appendPathParam(request.getDatabaseToolsDatabaseApiGatewayConfigId())
                .appendPathParam("pools")
                .appendPathParam(request.getPoolKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model
                                .DatabaseToolsDatabaseApiGatewayConfigPool.class,
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolResponse.Builder
                                ::databaseToolsDatabaseApiGatewayConfigPool)
                .handleResponseHeaderString(
                        "etag", GetDatabaseToolsDatabaseApiGatewayConfigPoolResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
            getDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec(
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest,
                                    GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsDatabaseApiGatewayConfigId(),
                "databaseToolsDatabaseApiGatewayConfigId must not be blank");

        Validate.notBlank(request.getPoolKey(), "poolKey must not be blank");

        Validate.notBlank(request.getApiSpecKey(), "apiSpecKey must not be blank");

        return clientCall(
                        request,
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse::builder)
                .logger(LOG, "getDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/DatabaseToolsDatabaseApiGatewayConfigPoolApiSpec/GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsDatabaseApiGatewayConfigs")
                .appendPathParam(request.getDatabaseToolsDatabaseApiGatewayConfigId())
                .appendPathParam("pools")
                .appendPathParam(request.getPoolKey())
                .appendPathParam("apiSpecs")
                .appendPathParam(request.getApiSpecKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model
                                .DatabaseToolsDatabaseApiGatewayConfigPoolApiSpec.class,
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse.Builder
                                ::databaseToolsDatabaseApiGatewayConfigPoolApiSpec)
                .handleResponseHeaderString(
                        "etag",
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
            getDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                                    GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsDatabaseApiGatewayConfigId(),
                "databaseToolsDatabaseApiGatewayConfigId must not be blank");

        Validate.notBlank(request.getPoolKey(), "poolKey must not be blank");

        Validate.notBlank(request.getAutoApiSpecKey(), "autoApiSpecKey must not be blank");

        return clientCall(
                        request,
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse::builder)
                .logger(LOG, "getDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/DatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec/GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsDatabaseApiGatewayConfigs")
                .appendPathParam(request.getDatabaseToolsDatabaseApiGatewayConfigId())
                .appendPathParam("pools")
                .appendPathParam(request.getPoolKey())
                .appendPathParam("autoApiSpecs")
                .appendPathParam(request.getAutoApiSpecKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model
                                .DatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec.class,
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse.Builder
                                ::databaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec)
                .handleResponseHeaderString(
                        "etag",
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse.Builder
                                ::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPropertySetResponse> getPropertySet(
            GetPropertySetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPropertySetRequest, GetPropertySetResponse>
                    handler) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");

        Validate.notBlank(
                request.getPropertySetKey().getValue(), "propertySetKey must not be blank");

        return clientCall(request, GetPropertySetResponse::builder)
                .logger(LOG, "getPropertySet")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "GetPropertySet",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/PropertySet/GetPropertySet")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPropertySetRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendPathParam("propertySets")
                .appendPathParam(request.getPropertySetKey().getValue())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.PropertySet.class,
                        GetPropertySetResponse.Builder::propertySet)
                .handleResponseHeaderString(
                        "opc-request-id", GetPropertySetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetUserCredentialResponse> getUserCredential(
            GetUserCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetUserCredentialRequest, GetUserCredentialResponse>
                    handler) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");

        Validate.notBlank(request.getUserKey(), "userKey must not be blank");

        Validate.notBlank(request.getCredentialKey(), "credentialKey must not be blank");

        return clientCall(request, GetUserCredentialResponse::builder)
                .logger(LOG, "getUserCredential")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "GetUserCredential",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/UserCredential/GetUserCredential")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUserCredentialRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendPathParam("users")
                .appendPathParam(request.getUserKey())
                .appendPathParam("credentials")
                .appendPathParam(request.getCredentialKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.UserCredential.class,
                        GetUserCredentialResponse.Builder::userCredential)
                .handleResponseHeaderString(
                        "opc-request-id", GetUserCredentialResponse.Builder::opcRequestId)
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
                        "DatabaseToolsRuntime",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20230222")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCredentialExecuteGranteesResponse>
            listCredentialExecuteGrantees(
                    ListCredentialExecuteGranteesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListCredentialExecuteGranteesRequest,
                                    ListCredentialExecuteGranteesResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");

        Validate.notBlank(request.getCredentialKey(), "credentialKey must not be blank");

        return clientCall(request, ListCredentialExecuteGranteesResponse::builder)
                .logger(LOG, "listCredentialExecuteGrantees")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "ListCredentialExecuteGrantees",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/CredentialExecuteGranteeCollection/ListCredentialExecuteGrantees")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCredentialExecuteGranteesRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendPathParam("credentials")
                .appendPathParam(request.getCredentialKey())
                .appendPathParam("executeGrantees")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.CredentialExecuteGranteeCollection
                                .class,
                        ListCredentialExecuteGranteesResponse.Builder
                                ::credentialExecuteGranteeCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListCredentialExecuteGranteesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCredentialExecuteGranteesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCredentialPublicSynonymsResponse>
            listCredentialPublicSynonyms(
                    ListCredentialPublicSynonymsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListCredentialPublicSynonymsRequest,
                                    ListCredentialPublicSynonymsResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");

        Validate.notBlank(request.getCredentialKey(), "credentialKey must not be blank");

        return clientCall(request, ListCredentialPublicSynonymsResponse::builder)
                .logger(LOG, "listCredentialPublicSynonyms")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "ListCredentialPublicSynonyms",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/CredentialPublicSynonymCollection/ListCredentialPublicSynonyms")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCredentialPublicSynonymsRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendPathParam("credentials")
                .appendPathParam(request.getCredentialKey())
                .appendPathParam("publicSynonyms")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.CredentialPublicSynonymCollection
                                .class,
                        ListCredentialPublicSynonymsResponse.Builder
                                ::credentialPublicSynonymCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListCredentialPublicSynonymsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCredentialPublicSynonymsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCredentialsResponse> listCredentials(
            ListCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCredentialsRequest, ListCredentialsResponse>
                    handler) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");

        return clientCall(request, ListCredentialsResponse::builder)
                .logger(LOG, "listCredentials")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "ListCredentials",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/CredentialCollection/ListCredentials")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCredentialsRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendPathParam("credentials")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.CredentialCollection.class,
                        ListCredentialsResponse.Builder::credentialCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListCredentialsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListCredentialsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<
                    ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesResponse>
            listDatabaseToolsDatabaseApiGatewayConfigAdvancedProperties(
                    ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesRequest,
                                    ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesResponse>
                            handler) {

        return clientCall(
                        request,
                        ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesResponse
                                ::builder)
                .logger(LOG, "listDatabaseToolsDatabaseApiGatewayConfigAdvancedProperties")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "ListDatabaseToolsDatabaseApiGatewayConfigAdvancedProperties",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/DatabaseToolsDatabaseApiGatewayConfigAdvancedPropertySummary/ListDatabaseToolsDatabaseApiGatewayConfigAdvancedProperties")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(
                        ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsDatabaseApiGatewayConfigAdvancedProperties")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model
                                .DatabaseToolsDatabaseApiGatewayConfigAdvancedPropertySummaryCollection
                                .class,
                        ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesResponse.Builder
                                ::databaseToolsDatabaseApiGatewayConfigAdvancedPropertySummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesResponse.Builder
                                ::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse>
            listDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecs(
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest,
                                    ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsDatabaseApiGatewayConfigId(),
                "databaseToolsDatabaseApiGatewayConfigId must not be blank");

        Validate.notBlank(request.getPoolKey(), "poolKey must not be blank");

        return clientCall(
                        request,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse::builder)
                .logger(LOG, "listDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecs")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecs",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/DatabaseToolsDatabaseApiGatewayConfig/ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsDatabaseApiGatewayConfigs")
                .appendPathParam(request.getDatabaseToolsDatabaseApiGatewayConfigId())
                .appendPathParam("pools")
                .appendPathParam(request.getPoolKey())
                .appendPathParam("apiSpecs")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model
                                .DatabaseToolsDatabaseApiGatewayConfigPoolApiSpecCollection.class,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse.Builder
                                ::databaseToolsDatabaseApiGatewayConfigPoolApiSpecCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse.Builder
                                ::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse>
            listDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecs(
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest,
                                    ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsDatabaseApiGatewayConfigId(),
                "databaseToolsDatabaseApiGatewayConfigId must not be blank");

        Validate.notBlank(request.getPoolKey(), "poolKey must not be blank");

        return clientCall(
                        request,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse::builder)
                .logger(LOG, "listDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecs")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecs",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/DatabaseToolsDatabaseApiGatewayConfig/ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsDatabaseApiGatewayConfigs")
                .appendPathParam(request.getDatabaseToolsDatabaseApiGatewayConfigId())
                .appendPathParam("pools")
                .appendPathParam(request.getPoolKey())
                .appendPathParam("autoApiSpecs")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model
                                .DatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecCollection
                                .class,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse.Builder
                                ::databaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse.Builder
                                ::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse>
            listDatabaseToolsDatabaseApiGatewayConfigPools(
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest,
                                    ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsDatabaseApiGatewayConfigId(),
                "databaseToolsDatabaseApiGatewayConfigId must not be blank");

        return clientCall(request, ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse::builder)
                .logger(LOG, "listDatabaseToolsDatabaseApiGatewayConfigPools")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "ListDatabaseToolsDatabaseApiGatewayConfigPools",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/DatabaseToolsDatabaseApiGatewayConfig/ListDatabaseToolsDatabaseApiGatewayConfigPools")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsDatabaseApiGatewayConfigs")
                .appendPathParam(request.getDatabaseToolsDatabaseApiGatewayConfigId())
                .appendPathParam("pools")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model
                                .DatabaseToolsDatabaseApiGatewayConfigPoolCollection.class,
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse.Builder
                                ::databaseToolsDatabaseApiGatewayConfigPoolCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListUserCredentialsResponse> listUserCredentials(
            ListUserCredentialsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListUserCredentialsRequest, ListUserCredentialsResponse>
                    handler) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");

        Validate.notBlank(request.getUserKey(), "userKey must not be blank");

        return clientCall(request, ListUserCredentialsResponse::builder)
                .logger(LOG, "listUserCredentials")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "ListUserCredentials",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/UserCredentialCollection/ListUserCredentials")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListUserCredentialsRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendPathParam("users")
                .appendPathParam(request.getUserKey())
                .appendPathParam("credentials")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.UserCredentialCollection.class,
                        ListUserCredentialsResponse.Builder::userCredentialCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListUserCredentialsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListUserCredentialsResponse.Builder::opcRequestId)
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
                        "DatabaseToolsRuntime",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20230222")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.WorkRequestErrorCollection.class,
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
                        "DatabaseToolsRuntime",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20230222")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.WorkRequestLogEntryCollection
                                .class,
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
                        "DatabaseToolsRuntime",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20230222")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceIdentifier", request.getResourceIdentifier())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendListQueryParam(
                        "operationType",
                        request.getOperationType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("createdByPrincipalId", request.getCreatedByPrincipalId())
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.WorkRequestCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCredentialResponse> updateCredential(
            UpdateCredentialRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCredentialRequest, UpdateCredentialResponse>
                    handler) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");

        Validate.notBlank(request.getCredentialKey(), "credentialKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateCredentialDetails(), "updateCredentialDetails is required");

        return clientCall(request, UpdateCredentialResponse::builder)
                .logger(LOG, "updateCredential")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "UpdateCredential",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/Credential/UpdateCredential")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCredentialRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendPathParam("credentials")
                .appendPathParam(request.getCredentialKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.Credential.class,
                        UpdateCredentialResponse.Builder::credential)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCredentialResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>
            updateDatabaseToolsDatabaseApiGatewayConfigGlobal(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalRequest,
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsDatabaseApiGatewayConfigId(),
                "databaseToolsDatabaseApiGatewayConfigId must not be blank");

        Validate.notBlank(request.getGlobalKey().getValue(), "globalKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateDatabaseToolsDatabaseApiGatewayConfigGlobalDetails(),
                "updateDatabaseToolsDatabaseApiGatewayConfigGlobalDetails is required");

        return clientCall(
                        request, UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalResponse::builder)
                .logger(LOG, "updateDatabaseToolsDatabaseApiGatewayConfigGlobal")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "UpdateDatabaseToolsDatabaseApiGatewayConfigGlobal",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/DatabaseToolsDatabaseApiGatewayConfigGlobal/UpdateDatabaseToolsDatabaseApiGatewayConfigGlobal")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsDatabaseApiGatewayConfigs")
                .appendPathParam(request.getDatabaseToolsDatabaseApiGatewayConfigId())
                .appendPathParam("globals")
                .appendPathParam(request.getGlobalKey().getValue())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model
                                .DatabaseToolsDatabaseApiGatewayConfigGlobal.class,
                        UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalResponse.Builder
                                ::databaseToolsDatabaseApiGatewayConfigGlobal)
                .handleResponseHeaderString(
                        "etag",
                        UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
            updateDatabaseToolsDatabaseApiGatewayConfigPool(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsDatabaseApiGatewayConfigId(),
                "databaseToolsDatabaseApiGatewayConfigId must not be blank");

        Validate.notBlank(request.getPoolKey(), "poolKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateDatabaseToolsDatabaseApiGatewayConfigPoolDetails(),
                "updateDatabaseToolsDatabaseApiGatewayConfigPoolDetails is required");

        return clientCall(request, UpdateDatabaseToolsDatabaseApiGatewayConfigPoolResponse::builder)
                .logger(LOG, "updateDatabaseToolsDatabaseApiGatewayConfigPool")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "UpdateDatabaseToolsDatabaseApiGatewayConfigPool",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/DatabaseToolsDatabaseApiGatewayConfigPool/UpdateDatabaseToolsDatabaseApiGatewayConfigPool")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDatabaseToolsDatabaseApiGatewayConfigPoolRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsDatabaseApiGatewayConfigs")
                .appendPathParam(request.getDatabaseToolsDatabaseApiGatewayConfigId())
                .appendPathParam("pools")
                .appendPathParam(request.getPoolKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model
                                .DatabaseToolsDatabaseApiGatewayConfigPool.class,
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolResponse.Builder
                                ::databaseToolsDatabaseApiGatewayConfigPool)
                .handleResponseHeaderString(
                        "etag",
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
            updateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest,
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsDatabaseApiGatewayConfigId(),
                "databaseToolsDatabaseApiGatewayConfigId must not be blank");

        Validate.notBlank(request.getPoolKey(), "poolKey must not be blank");

        Validate.notBlank(request.getApiSpecKey(), "apiSpecKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecDetails(),
                "updateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecDetails is required");

        return clientCall(
                        request,
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse::builder)
                .logger(LOG, "updateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/DatabaseToolsDatabaseApiGatewayConfigPoolApiSpec/UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsDatabaseApiGatewayConfigs")
                .appendPathParam(request.getDatabaseToolsDatabaseApiGatewayConfigId())
                .appendPathParam("pools")
                .appendPathParam(request.getPoolKey())
                .appendPathParam("apiSpecs")
                .appendPathParam(request.getApiSpecKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model
                                .DatabaseToolsDatabaseApiGatewayConfigPoolApiSpec.class,
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse.Builder
                                ::databaseToolsDatabaseApiGatewayConfigPoolApiSpec)
                .handleResponseHeaderString(
                        "etag",
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse.Builder
                                ::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
            updateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsDatabaseApiGatewayConfigId(),
                "databaseToolsDatabaseApiGatewayConfigId must not be blank");

        Validate.notBlank(request.getPoolKey(), "poolKey must not be blank");

        Validate.notBlank(request.getAutoApiSpecKey(), "autoApiSpecKey must not be blank");
        Objects.requireNonNull(
                request.getUpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails(),
                "updateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails is required");

        return clientCall(
                        request,
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse::builder)
                .logger(LOG, "updateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/DatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec/UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsDatabaseApiGatewayConfigs")
                .appendPathParam(request.getDatabaseToolsDatabaseApiGatewayConfigId())
                .appendPathParam("pools")
                .appendPathParam(request.getPoolKey())
                .appendPathParam("autoApiSpecs")
                .appendPathParam(request.getAutoApiSpecKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model
                                .DatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec.class,
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse.Builder
                                ::databaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec)
                .handleResponseHeaderString(
                        "etag",
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse.Builder
                                ::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse.Builder
                                ::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePropertySetResponse> updatePropertySet(
            UpdatePropertySetRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePropertySetRequest, UpdatePropertySetResponse>
                    handler) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");

        Validate.notBlank(
                request.getPropertySetKey().getValue(), "propertySetKey must not be blank");
        Objects.requireNonNull(
                request.getUpdatePropertySetDetails(), "updatePropertySetDetails is required");

        return clientCall(request, UpdatePropertySetResponse::builder)
                .logger(LOG, "updatePropertySet")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "UpdatePropertySet",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/PropertySet/UpdatePropertySet")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePropertySetRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendPathParam("propertySets")
                .appendPathParam(request.getPropertySetKey().getValue())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.PropertySet.class,
                        UpdatePropertySetResponse.Builder::propertySet)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePropertySetResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ValidateDatabaseToolsConnectionResponse>
            validateDatabaseToolsConnection(
                    ValidateDatabaseToolsConnectionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ValidateDatabaseToolsConnectionRequest,
                                    ValidateDatabaseToolsConnectionResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsConnectionId(),
                "databaseToolsConnectionId must not be blank");
        Objects.requireNonNull(
                request.getValidateDatabaseToolsConnectionDetails(),
                "validateDatabaseToolsConnectionDetails is required");

        return clientCall(request, ValidateDatabaseToolsConnectionResponse::builder)
                .logger(LOG, "validateDatabaseToolsConnection")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "ValidateDatabaseToolsConnection",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/DatabaseToolsConnection/ValidateDatabaseToolsConnection")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateDatabaseToolsConnectionRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsConnections")
                .appendPathParam(request.getDatabaseToolsConnectionId())
                .appendPathParam("actions")
                .appendPathParam("validateConnection")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model
                                .ValidateDatabaseToolsConnectionResult.class,
                        ValidateDatabaseToolsConnectionResponse.Builder
                                ::validateDatabaseToolsConnectionResult)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ValidateDatabaseToolsConnectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ValidateDatabaseToolsIdentityCredentialResponse>
            validateDatabaseToolsIdentityCredential(
                    ValidateDatabaseToolsIdentityCredentialRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ValidateDatabaseToolsIdentityCredentialRequest,
                                    ValidateDatabaseToolsIdentityCredentialResponse>
                            handler) {

        Validate.notBlank(
                request.getDatabaseToolsIdentityId(), "databaseToolsIdentityId must not be blank");
        Objects.requireNonNull(
                request.getValidateDatabaseToolsIdentityCredentialDetails(),
                "validateDatabaseToolsIdentityCredentialDetails is required");

        return clientCall(request, ValidateDatabaseToolsIdentityCredentialResponse::builder)
                .logger(LOG, "validateDatabaseToolsIdentityCredential")
                .serviceDetails(
                        "DatabaseToolsRuntime",
                        "ValidateDatabaseToolsIdentityCredential",
                        "https://docs.oracle.com/iaas/api/#/en/database-tools-runtime/20230222/DatabaseToolsIdentity/ValidateDatabaseToolsIdentityCredential")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateDatabaseToolsIdentityCredentialRequest::builder)
                .basePath("/20230222")
                .appendPathParam("databaseToolsIdentities")
                .appendPathParam(request.getDatabaseToolsIdentityId())
                .appendPathParam("actions")
                .appendPathParam("validateCredential")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model
                                .ValidateDatabaseToolsIdentityCredentialResult.class,
                        ValidateDatabaseToolsIdentityCredentialResponse.Builder
                                ::validateDatabaseToolsIdentityCredentialResult)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ValidateDatabaseToolsIdentityCredentialResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DatabaseToolsRuntimeAsyncClient(
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
    public DatabaseToolsRuntimeAsyncClient(
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
    public DatabaseToolsRuntimeAsyncClient(
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
    public DatabaseToolsRuntimeAsyncClient(
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
    public DatabaseToolsRuntimeAsyncClient(
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
    public DatabaseToolsRuntimeAsyncClient(
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
    public DatabaseToolsRuntimeAsyncClient(
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
