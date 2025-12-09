/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.mysql.requests.*;
import com.oracle.bmc.mysql.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public class DbBackupsClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements DbBackups {
    /** Service instance for DbBackups. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DbBackupsClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://mysql.{region}.ocp.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DbBackupsClient.class);

    private final DbBackupsWaiters waiters;

    private final DbBackupsPaginators paginators;

    DbBackupsClient(
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
                                    .nameFormat("DbBackups-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DbBackupsWaiters(executorService, this);

        this.paginators = new DbBackupsPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DbBackupsClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "mysql";
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
        public DbBackupsClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DbBackupsClient(this, authenticationDetailsProvider, executorService);
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
    public CancelBackupDeletionResponse cancelBackupDeletion(CancelBackupDeletionRequest request) {

        Validate.notBlank(request.getBackupId(), "backupId must not be blank");

        return clientCall(request, CancelBackupDeletionResponse::builder)
                .logger(LOG, "cancelBackupDeletion")
                .serviceDetails(
                        "DbBackups",
                        "CancelBackupDeletion",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/Backup/CancelBackupDeletion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelBackupDeletionRequest::builder)
                .basePath("/20190415")
                .appendPathParam("backups")
                .appendPathParam(request.getBackupId())
                .appendPathParam("actions")
                .appendPathParam("cancelDeletion")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", CancelBackupDeletionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CancelBackupDeletionResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ChangeBackupCompartmentResponse changeBackupCompartment(
            ChangeBackupCompartmentRequest request) {

        Validate.notBlank(request.getBackupId(), "backupId must not be blank");
        Objects.requireNonNull(
                request.getChangeBackupCompartmentDetails(),
                "changeBackupCompartmentDetails is required");

        return clientCall(request, ChangeBackupCompartmentResponse::builder)
                .logger(LOG, "changeBackupCompartment")
                .serviceDetails(
                        "DbBackups",
                        "ChangeBackupCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/Backup/ChangeBackupCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeBackupCompartmentRequest::builder)
                .basePath("/20190415")
                .appendPathParam("backups")
                .appendPathParam(request.getBackupId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeBackupCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeBackupCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CopyBackupResponse copyBackup(CopyBackupRequest request) {
        Objects.requireNonNull(request.getCopyBackupDetails(), "copyBackupDetails is required");

        return clientCall(request, CopyBackupResponse::builder)
                .logger(LOG, "copyBackup")
                .serviceDetails(
                        "DbBackups",
                        "CopyBackup",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/Backup/CopyBackup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CopyBackupRequest::builder)
                .basePath("/20190415")
                .appendPathParam("backups")
                .appendPathParam("actions")
                .appendPathParam("copy")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mysql.model.Backup.class, CopyBackupResponse.Builder::backup)
                .handleResponseHeaderString("etag", CopyBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CopyBackupResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CopyBackupResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateBackupResponse createBackup(CreateBackupRequest request) {
        Objects.requireNonNull(request.getCreateBackupDetails(), "createBackupDetails is required");

        return clientCall(request, CreateBackupResponse::builder)
                .logger(LOG, "createBackup")
                .serviceDetails(
                        "DbBackups",
                        "CreateBackup",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/Backup/CreateBackup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBackupRequest::builder)
                .basePath("/20190415")
                .appendPathParam("backups")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mysql.model.Backup.class,
                        CreateBackupResponse.Builder::backup)
                .handleResponseHeaderString("etag", CreateBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBackupResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateBackupResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteBackupResponse deleteBackup(DeleteBackupRequest request) {

        Validate.notBlank(request.getBackupId(), "backupId must not be blank");

        return clientCall(request, DeleteBackupResponse::builder)
                .logger(LOG, "deleteBackup")
                .serviceDetails(
                        "DbBackups",
                        "DeleteBackup",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/Backup/DeleteBackup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBackupRequest::builder)
                .basePath("/20190415")
                .appendPathParam("backups")
                .appendPathParam(request.getBackupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBackupResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteBackupResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public GetBackupResponse getBackup(GetBackupRequest request) {

        Validate.notBlank(request.getBackupId(), "backupId must not be blank");

        return clientCall(request, GetBackupResponse::builder)
                .logger(LOG, "getBackup")
                .serviceDetails(
                        "DbBackups",
                        "GetBackup",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/Backup/GetBackup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBackupRequest::builder)
                .basePath("/20190415")
                .appendPathParam("backups")
                .appendPathParam(request.getBackupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.mysql.model.Backup.class, GetBackupResponse.Builder::backup)
                .handleResponseHeaderString("etag", GetBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBackupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListBackupsResponse listBackups(ListBackupsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListBackupsResponse::builder)
                .logger(LOG, "listBackups")
                .serviceDetails(
                        "DbBackups",
                        "ListBackups",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/BackupSummary/ListBackups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBackupsRequest::builder)
                .basePath("/20190415")
                .appendPathParam("backups")
                .appendQueryParam("backupId", request.getBackupId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("dbSystemId", request.getDbSystemId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("softDelete", request.getSoftDelete())
                .appendEnumQueryParam(
                        "backupPreparationStatus", request.getBackupPreparationStatus())
                .appendEnumQueryParam("validationStatus", request.getValidationStatus())
                .appendEnumQueryParam("creationType", request.getCreationType())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.mysql.model.BackupSummary.class,
                        ListBackupsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListBackupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBackupsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateBackupResponse updateBackup(UpdateBackupRequest request) {

        Validate.notBlank(request.getBackupId(), "backupId must not be blank");
        Objects.requireNonNull(request.getUpdateBackupDetails(), "updateBackupDetails is required");

        return clientCall(request, UpdateBackupResponse::builder)
                .logger(LOG, "updateBackup")
                .serviceDetails(
                        "DbBackups",
                        "UpdateBackup",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/Backup/UpdateBackup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBackupRequest::builder)
                .basePath("/20190415")
                .appendPathParam("backups")
                .appendPathParam(request.getBackupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mysql.model.Backup.class,
                        UpdateBackupResponse.Builder::backup)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBackupResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateBackupResponse.Builder::etag)
                .callSync();
    }

    @Override
    public ValidateBackupResponse validateBackup(ValidateBackupRequest request) {

        Validate.notBlank(request.getBackupId(), "backupId must not be blank");

        return clientCall(request, ValidateBackupResponse::builder)
                .logger(LOG, "validateBackup")
                .serviceDetails(
                        "DbBackups",
                        "ValidateBackup",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/Backup/ValidateBackup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateBackupRequest::builder)
                .basePath("/20190415")
                .appendPathParam("backups")
                .appendPathParam(request.getBackupId())
                .appendPathParam("actions")
                .appendPathParam("validate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mysql.model.Backup.class,
                        ValidateBackupResponse.Builder::backup)
                .handleResponseHeaderString("etag", ValidateBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ValidateBackupResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", ValidateBackupResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DbBackupsWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DbBackupsPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DbBackupsClient(
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
    public DbBackupsClient(
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
    public DbBackupsClient(
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
    public DbBackupsClient(
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
    public DbBackupsClient(
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
    public DbBackupsClient(
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
    public DbBackupsClient(
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
    public DbBackupsClient(
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
