/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.mysql.requests.*;
import com.oracle.bmc.mysql.responses.*;

import java.util.Objects;

/**
 * Async client implementation for DbBackups service. <br>
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
public class DbBackupsAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DbBackupsAsync {
    /** Service instance for DbBackups. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DBBACKUPS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://mysql.{region}.ocp.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DbBackupsAsyncClient.class);

    DbBackupsAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DbBackupsAsyncClient> {
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
        public DbBackupsAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DbBackupsAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeBackupCompartmentResponse> changeBackupCompartment(
            ChangeBackupCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeBackupCompartmentRequest, ChangeBackupCompartmentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CopyBackupResponse> copyBackup(
            CopyBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CopyBackupRequest, CopyBackupResponse>
                    handler) {
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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mysql.model.Backup.class, CopyBackupResponse.Builder::backup)
                .handleResponseHeaderString("etag", CopyBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CopyBackupResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CopyBackupResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateBackupResponse> createBackup(
            CreateBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateBackupRequest, CreateBackupResponse>
                    handler) {
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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mysql.model.Backup.class,
                        CreateBackupResponse.Builder::backup)
                .handleResponseHeaderString("etag", CreateBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBackupResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateBackupResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupResponse> deleteBackup(
            DeleteBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteBackupRequest, DeleteBackupResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBackupResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteBackupResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBackupResponse> getBackup(
            GetBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetBackupRequest, GetBackupResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.mysql.model.Backup.class, GetBackupResponse.Builder::backup)
                .handleResponseHeaderString("etag", GetBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBackupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBackupsResponse> listBackups(
            ListBackupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListBackupsRequest, ListBackupsResponse>
                    handler) {
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
                .appendEnumQueryParam("creationType", request.getCreationType())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.mysql.model.BackupSummary.class,
                        ListBackupsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListBackupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBackupsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateBackupResponse> updateBackup(
            UpdateBackupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateBackupRequest, UpdateBackupResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mysql.model.Backup.class,
                        UpdateBackupResponse.Builder::backup)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBackupResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateBackupResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DbBackupsAsyncClient(
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
    public DbBackupsAsyncClient(
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
    public DbBackupsAsyncClient(
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
    public DbBackupsAsyncClient(
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
    public DbBackupsAsyncClient(
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
    public DbBackupsAsyncClient(
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
    public DbBackupsAsyncClient(
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
