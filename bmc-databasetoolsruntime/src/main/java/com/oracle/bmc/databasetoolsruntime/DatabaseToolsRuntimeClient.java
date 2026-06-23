/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.databasetoolsruntime.requests.*;
import com.oracle.bmc.databasetoolsruntime.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
public class DatabaseToolsRuntimeClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements DatabaseToolsRuntime {
    /** Service instance for DatabaseToolsRuntime. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DatabaseToolsRuntimeClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://dbtools.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DatabaseToolsRuntimeClient.class);

    private final DatabaseToolsRuntimeWaiters waiters;

    private final DatabaseToolsRuntimePaginators paginators;

    DatabaseToolsRuntimeClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        this(builder, authenticationDetailsProvider, executorService, true);
    }

    DatabaseToolsRuntimeClient(
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
                                    .nameFormat("DatabaseToolsRuntime-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DatabaseToolsRuntimeWaiters(executorService, this);

        this.paginators = new DatabaseToolsRuntimePaginators(this);
        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "DatabaseToolsRuntimeClient",
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
                    Builder, DatabaseToolsRuntimeClient> {
        private boolean isStreamWarningEnabled = true;
        private java.util.concurrent.ExecutorService executorService;

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
        public DatabaseToolsRuntimeClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DatabaseToolsRuntimeClient(
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
    public CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateCredentialResponse createCredential(CreateCredentialRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.Credential.class,
                        CreateCredentialResponse.Builder::credential)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCredentialResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", CreateCredentialResponse.Builder::location)
                .callSync();
    }

    @Override
    public CreateCredentialExecuteGranteeResponse createCredentialExecuteGrantee(
            CreateCredentialExecuteGranteeRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.CredentialExecuteGrantee.class,
                        CreateCredentialExecuteGranteeResponse.Builder::credentialExecuteGrantee)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateCredentialExecuteGranteeResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateCredentialExecuteGranteeResponse.Builder::location)
                .callSync();
    }

    @Override
    public CreateCredentialPublicSynonymResponse createCredentialPublicSynonym(
            CreateCredentialPublicSynonymRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.CredentialPublicSynonym.class,
                        CreateCredentialPublicSynonymResponse.Builder::credentialPublicSynonym)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateCredentialPublicSynonymResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateCredentialPublicSynonymResponse.Builder::location)
                .callSync();
    }

    @Override
    public CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse
            createDatabaseToolsDatabaseApiGatewayConfigPool(
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse
            createDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec(
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse
            createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public DeleteCredentialResponse deleteCredential(DeleteCredentialRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteCredentialExecuteGranteeResponse deleteCredentialExecuteGrantee(
            DeleteCredentialExecuteGranteeRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteCredentialExecuteGranteeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteCredentialPublicSynonymResponse deleteCredentialPublicSynonym(
            DeleteCredentialPublicSynonymRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteCredentialPublicSynonymResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDatabaseToolsDatabaseApiGatewayConfigPoolResponse
            deleteDatabaseToolsDatabaseApiGatewayConfigPool(
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse
            deleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec(
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse
            deleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                    DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public ExecuteSqlDatabaseToolsConnectionResponse executeSqlDatabaseToolsConnection(
            ExecuteSqlDatabaseToolsConnectionRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public GetCredentialResponse getCredential(GetCredentialRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.Credential.class,
                        GetCredentialResponse.Builder::credential)
                .handleResponseHeaderString(
                        "opc-request-id", GetCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCredentialExecuteGranteeResponse getCredentialExecuteGrantee(
            GetCredentialExecuteGranteeRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.CredentialExecuteGrantee.class,
                        GetCredentialExecuteGranteeResponse.Builder::credentialExecuteGrantee)
                .handleResponseHeaderString(
                        "opc-request-id", GetCredentialExecuteGranteeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCredentialPublicSynonymResponse getCredentialPublicSynonym(
            GetCredentialPublicSynonymRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.CredentialPublicSynonym.class,
                        GetCredentialPublicSynonymResponse.Builder::credentialPublicSynonym)
                .handleResponseHeaderString(
                        "opc-request-id", GetCredentialPublicSynonymResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDatabaseToolsDatabaseApiGatewayConfigContentResponse
            getDatabaseToolsDatabaseApiGatewayConfigContent(
                    GetDatabaseToolsDatabaseApiGatewayConfigContentRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public GetDatabaseToolsDatabaseApiGatewayConfigGlobalResponse
            getDatabaseToolsDatabaseApiGatewayConfigGlobal(
                    GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public GetDatabaseToolsDatabaseApiGatewayConfigPoolResponse
            getDatabaseToolsDatabaseApiGatewayConfigPool(
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse
            getDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec(
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse
            getDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                    GetDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public GetPropertySetResponse getPropertySet(GetPropertySetRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.PropertySet.class,
                        GetPropertySetResponse.Builder::propertySet)
                .handleResponseHeaderString(
                        "opc-request-id", GetPropertySetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetUserCredentialResponse getUserCredential(GetUserCredentialRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.UserCredential.class,
                        GetUserCredentialResponse.Builder::userCredential)
                .handleResponseHeaderString(
                        "opc-request-id", GetUserCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .callSync();
    }

    @Override
    public ListCredentialExecuteGranteesResponse listCredentialExecuteGrantees(
            ListCredentialExecuteGranteesRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public ListCredentialPublicSynonymsResponse listCredentialPublicSynonyms(
            ListCredentialPublicSynonymsRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public ListCredentialsResponse listCredentials(ListCredentialsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.CredentialCollection.class,
                        ListCredentialsResponse.Builder::credentialCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListCredentialsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListCredentialsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesResponse
            listDatabaseToolsDatabaseApiGatewayConfigAdvancedProperties(
                    ListDatabaseToolsDatabaseApiGatewayConfigAdvancedPropertiesRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsResponse
            listDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecs(
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecsRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsResponse
            listDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecs(
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecsRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public ListDatabaseToolsDatabaseApiGatewayConfigPoolsResponse
            listDatabaseToolsDatabaseApiGatewayConfigPools(
                    ListDatabaseToolsDatabaseApiGatewayConfigPoolsRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public ListUserCredentialsResponse listUserCredentials(ListUserCredentialsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.UserCredentialCollection.class,
                        ListUserCredentialsResponse.Builder::userCredentialCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListUserCredentialsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListUserCredentialsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.WorkRequestErrorCollection.class,
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.WorkRequestLogEntryCollection
                                .class,
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.WorkRequestCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateCredentialResponse updateCredential(UpdateCredentialRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.Credential.class,
                        UpdateCredentialResponse.Builder::credential)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalResponse
            updateDatabaseToolsDatabaseApiGatewayConfigGlobal(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigGlobalRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public UpdateDatabaseToolsDatabaseApiGatewayConfigPoolResponse
            updateDatabaseToolsDatabaseApiGatewayConfigPool(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecResponse
            updateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpec(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolApiSpecRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecResponse
            updateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpec(
                    UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public UpdatePropertySetResponse updatePropertySet(UpdatePropertySetRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model.PropertySet.class,
                        UpdatePropertySetResponse.Builder::propertySet)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePropertySetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ValidateDatabaseToolsConnectionResponse validateDatabaseToolsConnection(
            ValidateDatabaseToolsConnectionRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model
                                .ValidateDatabaseToolsConnectionResult.class,
                        ValidateDatabaseToolsConnectionResponse.Builder
                                ::validateDatabaseToolsConnectionResult)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ValidateDatabaseToolsConnectionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ValidateDatabaseToolsIdentityCredentialResponse validateDatabaseToolsIdentityCredential(
            ValidateDatabaseToolsIdentityCredentialRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.databasetoolsruntime.model
                                .ValidateDatabaseToolsIdentityCredentialResult.class,
                        ValidateDatabaseToolsIdentityCredentialResponse.Builder
                                ::validateDatabaseToolsIdentityCredentialResult)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ValidateDatabaseToolsIdentityCredentialResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DatabaseToolsRuntimeWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DatabaseToolsRuntimePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DatabaseToolsRuntimeClient(
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
    public DatabaseToolsRuntimeClient(
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
    public DatabaseToolsRuntimeClient(
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
    public DatabaseToolsRuntimeClient(
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
    public DatabaseToolsRuntimeClient(
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
    public DatabaseToolsRuntimeClient(
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
    public DatabaseToolsRuntimeClient(
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
    public DatabaseToolsRuntimeClient(
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
