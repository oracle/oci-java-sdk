/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.psql.requests.*;
import com.oracle.bmc.psql.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Postgresql service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
public class PostgresqlAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements PostgresqlAsync {
    /** Service instance for Postgresql. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("POSTGRESQL")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://postgresql.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(PostgresqlAsyncClient.class);

    PostgresqlAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, PostgresqlAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "psql";
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
        public PostgresqlAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new PostgresqlAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<BackupCopyResponse> backupCopy(
            BackupCopyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<BackupCopyRequest, BackupCopyResponse>
                    handler) {

        Validate.notBlank(request.getBackupId(), "backupId must not be blank");
        Objects.requireNonNull(request.getBackupCopyDetails(), "backupCopyDetails is required");

        return clientCall(request, BackupCopyResponse::builder)
                .logger(LOG, "backupCopy")
                .serviceDetails(
                        "Postgresql",
                        "BackupCopy",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/Backup/BackupCopy")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BackupCopyRequest::builder)
                .basePath("/20220915")
                .appendPathParam("backups")
                .appendPathParam(request.getBackupId())
                .appendPathParam("actions")
                .appendPathParam("copy")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", BackupCopyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", BackupCopyResponse.Builder::opcRequestId)
                .callAsync(handler);
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
                        "Postgresql",
                        "ChangeBackupCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/Backup/ChangeBackupCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeBackupCompartmentRequest::builder)
                .basePath("/20220915")
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
                        "opc-work-request-id",
                        ChangeBackupCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeBackupCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeConfigurationCompartmentResponse>
            changeConfigurationCompartment(
                    ChangeConfigurationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeConfigurationCompartmentRequest,
                                    ChangeConfigurationCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getConfigurationId(), "configurationId must not be blank");
        Objects.requireNonNull(
                request.getChangeConfigurationCompartmentDetails(),
                "changeConfigurationCompartmentDetails is required");

        return clientCall(request, ChangeConfigurationCompartmentResponse::builder)
                .logger(LOG, "changeConfigurationCompartment")
                .serviceDetails(
                        "Postgresql",
                        "ChangeConfigurationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/Configuration/ChangeConfigurationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeConfigurationCompartmentRequest::builder)
                .basePath("/20220915")
                .appendPathParam("configurations")
                .appendPathParam(request.getConfigurationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeConfigurationCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeDbSystemCompartmentResponse> changeDbSystemCompartment(
            ChangeDbSystemCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeDbSystemCompartmentRequest, ChangeDbSystemCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");
        Objects.requireNonNull(
                request.getChangeDbSystemCompartmentDetails(),
                "changeDbSystemCompartmentDetails is required");

        return clientCall(request, ChangeDbSystemCompartmentResponse::builder)
                .logger(LOG, "changeDbSystemCompartment")
                .serviceDetails(
                        "Postgresql",
                        "ChangeDbSystemCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/DbSystem/ChangeDbSystemCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDbSystemCompartmentRequest::builder)
                .basePath("/20220915")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDbSystemCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeDbSystemCompartmentResponse.Builder::opcRequestId)
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
                        "Postgresql",
                        "CreateBackup",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/Backup/CreateBackup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBackupRequest::builder)
                .basePath("/20220915")
                .appendPathParam("backups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateBackupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBackupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationResponse> createConfiguration(
            CreateConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateConfigurationRequest, CreateConfigurationResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateConfigurationDetails(), "createConfigurationDetails is required");

        return clientCall(request, CreateConfigurationResponse::builder)
                .logger(LOG, "createConfiguration")
                .serviceDetails(
                        "Postgresql",
                        "CreateConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/Configuration/CreateConfiguration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateConfigurationRequest::builder)
                .basePath("/20220915")
                .appendPathParam("configurations")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.psql.model.Configuration.class,
                        CreateConfigurationResponse.Builder::configuration)
                .handleResponseHeaderString(
                        "opc-request-id", CreateConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateConfigurationResponse.Builder::etag)
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
                .serviceDetails(
                        "Postgresql",
                        "CreateDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/DbSystem/CreateDbSystem")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDbSystemRequest::builder)
                .basePath("/20220915")
                .appendPathParam("dbSystems")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.psql.model.DbSystem.class,
                        CreateDbSystemResponse.Builder::dbSystem)
                .handleResponseHeaderString("etag", CreateDbSystemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateDbSystemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDbSystemResponse.Builder::opcRequestId)
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
                        "Postgresql",
                        "DeleteBackup",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/Backup/DeleteBackup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBackupRequest::builder)
                .basePath("/20220915")
                .appendPathParam("backups")
                .appendPathParam(request.getBackupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteBackupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBackupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationResponse> deleteConfiguration(
            DeleteConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteConfigurationRequest, DeleteConfigurationResponse>
                    handler) {

        Validate.notBlank(request.getConfigurationId(), "configurationId must not be blank");

        return clientCall(request, DeleteConfigurationResponse::builder)
                .logger(LOG, "deleteConfiguration")
                .serviceDetails(
                        "Postgresql",
                        "DeleteConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/Configuration/DeleteConfiguration")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteConfigurationRequest::builder)
                .basePath("/20220915")
                .appendPathParam("configurations")
                .appendPathParam(request.getConfigurationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteConfigurationResponse.Builder::opcRequestId)
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
                        "Postgresql",
                        "DeleteDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/DbSystem/DeleteDbSystem")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDbSystemRequest::builder)
                .basePath("/20220915")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteDbSystemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDbSystemResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<FailoverDbSystemResponse> failoverDbSystem(
            FailoverDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            FailoverDbSystemRequest, FailoverDbSystemResponse>
                    handler) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");
        Objects.requireNonNull(
                request.getFailoverDbSystemDetails(), "failoverDbSystemDetails is required");

        return clientCall(request, FailoverDbSystemResponse::builder)
                .logger(LOG, "failoverDbSystem")
                .serviceDetails(
                        "Postgresql",
                        "FailoverDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/DbSystem/FailoverDbSystem")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(FailoverDbSystemRequest::builder)
                .basePath("/20220915")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("actions")
                .appendPathParam("failover")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", FailoverDbSystemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", FailoverDbSystemResponse.Builder::opcRequestId)
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
                        "Postgresql",
                        "GetBackup",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/Backup/GetBackup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBackupRequest::builder)
                .basePath("/20220915")
                .appendPathParam("backups")
                .appendPathParam(request.getBackupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.psql.model.Backup.class, GetBackupResponse.Builder::backup)
                .handleResponseHeaderString("etag", GetBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBackupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetConfigurationResponse> getConfiguration(
            GetConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetConfigurationRequest, GetConfigurationResponse>
                    handler) {

        Validate.notBlank(request.getConfigurationId(), "configurationId must not be blank");

        return clientCall(request, GetConfigurationResponse::builder)
                .logger(LOG, "getConfiguration")
                .serviceDetails(
                        "Postgresql",
                        "GetConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/Configuration/GetConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConfigurationRequest::builder)
                .basePath("/20220915")
                .appendPathParam("configurations")
                .appendPathParam(request.getConfigurationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.psql.model.Configuration.class,
                        GetConfigurationResponse.Builder::configuration)
                .handleResponseHeaderString("etag", GetConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConfigurationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetConnectionDetailsResponse> getConnectionDetails(
            GetConnectionDetailsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetConnectionDetailsRequest, GetConnectionDetailsResponse>
                    handler) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, GetConnectionDetailsResponse::builder)
                .logger(LOG, "getConnectionDetails")
                .serviceDetails(
                        "Postgresql",
                        "GetConnectionDetails",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/ConnectionDetails/GetConnectionDetails")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConnectionDetailsRequest::builder)
                .basePath("/20220915")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("connectionDetails")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.psql.model.ConnectionDetails.class,
                        GetConnectionDetailsResponse.Builder::connectionDetails)
                .handleResponseHeaderString("etag", GetConnectionDetailsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConnectionDetailsResponse.Builder::opcRequestId)
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
                        "Postgresql",
                        "GetDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/DbSystem/GetDbSystem")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDbSystemRequest::builder)
                .basePath("/20220915")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendListQueryParam(
                        "excludedFields",
                        request.getExcludedFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.psql.model.DbSystem.class,
                        GetDbSystemResponse.Builder::dbSystem)
                .handleResponseHeaderString("etag", GetDbSystemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDbSystemResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDefaultConfigurationResponse> getDefaultConfiguration(
            GetDefaultConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDefaultConfigurationRequest, GetDefaultConfigurationResponse>
                    handler) {

        Validate.notBlank(
                request.getDefaultConfigurationId(), "defaultConfigurationId must not be blank");

        return clientCall(request, GetDefaultConfigurationResponse::builder)
                .logger(LOG, "getDefaultConfiguration")
                .serviceDetails(
                        "Postgresql",
                        "GetDefaultConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/DefaultConfiguration/GetDefaultConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDefaultConfigurationRequest::builder)
                .basePath("/20220915")
                .appendPathParam("defaultConfigurations")
                .appendPathParam(request.getDefaultConfigurationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.psql.model.DefaultConfiguration.class,
                        GetDefaultConfigurationResponse.Builder::defaultConfiguration)
                .handleResponseHeaderString("etag", GetDefaultConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDefaultConfigurationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPrimaryDbInstanceResponse> getPrimaryDbInstance(
            GetPrimaryDbInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPrimaryDbInstanceRequest, GetPrimaryDbInstanceResponse>
                    handler) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, GetPrimaryDbInstanceResponse::builder)
                .logger(LOG, "getPrimaryDbInstance")
                .serviceDetails(
                        "Postgresql",
                        "GetPrimaryDbInstance",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/DbSystem/GetPrimaryDbInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPrimaryDbInstanceRequest::builder)
                .basePath("/20220915")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("primaryDbInstance")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.psql.model.PrimaryDbInstanceDetails.class,
                        GetPrimaryDbInstanceResponse.Builder::primaryDbInstanceDetails)
                .handleResponseHeaderString("etag", GetPrimaryDbInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPrimaryDbInstanceResponse.Builder::opcRequestId)
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
                        "Postgresql",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20220915")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.psql.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBackupsResponse> listBackups(
            ListBackupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListBackupsRequest, ListBackupsResponse>
                    handler) {

        return clientCall(request, ListBackupsResponse::builder)
                .logger(LOG, "listBackups")
                .serviceDetails(
                        "Postgresql",
                        "ListBackups",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/BackupCollection/ListBackups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBackupsRequest::builder)
                .basePath("/20220915")
                .appendPathParam("backups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("timeStarted", request.getTimeStarted())
                .appendQueryParam("timeEnded", request.getTimeEnded())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("backupId", request.getBackupId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.psql.model.BackupCollection.class,
                        ListBackupsResponse.Builder::backupCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBackupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBackupsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationsResponse> listConfigurations(
            ListConfigurationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListConfigurationsRequest, ListConfigurationsResponse>
                    handler) {

        return clientCall(request, ListConfigurationsResponse::builder)
                .logger(LOG, "listConfigurations")
                .serviceDetails(
                        "Postgresql",
                        "ListConfigurations",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/ConfigurationCollection/ListConfigurations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListConfigurationsRequest::builder)
                .basePath("/20220915")
                .appendPathParam("configurations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("configType", request.getConfigType())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("dbVersion", request.getDbVersion())
                .appendQueryParam("shape", request.getShape())
                .appendQueryParam("configurationId", request.getConfigurationId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.psql.model.ConfigurationCollection.class,
                        ListConfigurationsResponse.Builder::configurationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListConfigurationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListConfigurationsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDbSystemsResponse> listDbSystems(
            ListDbSystemsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListDbSystemsRequest, ListDbSystemsResponse>
                    handler) {

        return clientCall(request, ListDbSystemsResponse::builder)
                .logger(LOG, "listDbSystems")
                .serviceDetails(
                        "Postgresql",
                        "ListDbSystems",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/DbSystemCollection/ListDbSystems")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbSystemsRequest::builder)
                .basePath("/20220915")
                .appendPathParam("dbSystems")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.psql.model.DbSystemCollection.class,
                        ListDbSystemsResponse.Builder::dbSystemCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDbSystemsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDbSystemsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDefaultConfigurationsResponse> listDefaultConfigurations(
            ListDefaultConfigurationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDefaultConfigurationsRequest, ListDefaultConfigurationsResponse>
                    handler) {

        return clientCall(request, ListDefaultConfigurationsResponse::builder)
                .logger(LOG, "listDefaultConfigurations")
                .serviceDetails(
                        "Postgresql",
                        "ListDefaultConfigurations",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/DefaultConfigurationCollection/ListDefaultConfigurations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDefaultConfigurationsRequest::builder)
                .basePath("/20220915")
                .appendPathParam("defaultConfigurations")
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("dbVersion", request.getDbVersion())
                .appendQueryParam("shape", request.getShape())
                .appendQueryParam("configurationId", request.getConfigurationId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.psql.model.DefaultConfigurationCollection.class,
                        ListDefaultConfigurationsResponse.Builder::defaultConfigurationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDefaultConfigurationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDefaultConfigurationsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListShapesResponse> listShapes(
            ListShapesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListShapesRequest, ListShapesResponse>
                    handler) {

        return clientCall(request, ListShapesResponse::builder)
                .logger(LOG, "listShapes")
                .serviceDetails(
                        "Postgresql",
                        "ListShapes",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/ShapeSummary/ListShapes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListShapesRequest::builder)
                .basePath("/20220915")
                .appendPathParam("shapes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.psql.model.ShapeCollection.class,
                        ListShapesResponse.Builder::shapeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListShapesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListShapesResponse.Builder::opcNextPage)
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
                        "Postgresql",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20220915")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.psql.model.WorkRequestErrorCollection.class,
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
                        "Postgresql",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20220915")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.psql.model.WorkRequestLogEntryCollection.class,
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

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "Postgresql",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20220915")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.psql.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchDbSystemResponse> patchDbSystem(
            PatchDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PatchDbSystemRequest, PatchDbSystemResponse>
                    handler) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");
        Objects.requireNonNull(
                request.getPatchDbSystemDetails(), "patchDbSystemDetails is required");

        return clientCall(request, PatchDbSystemResponse::builder)
                .logger(LOG, "patchDbSystem")
                .serviceDetails(
                        "Postgresql",
                        "PatchDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/DbSystem/PatchDbSystem")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchDbSystemRequest::builder)
                .basePath("/20220915")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", PatchDbSystemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PatchDbSystemResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ResetMasterUserPasswordResponse> resetMasterUserPassword(
            ResetMasterUserPasswordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResetMasterUserPasswordRequest, ResetMasterUserPasswordResponse>
                    handler) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");
        Objects.requireNonNull(
                request.getResetMasterUserPasswordDetails(),
                "resetMasterUserPasswordDetails is required");

        return clientCall(request, ResetMasterUserPasswordResponse::builder)
                .logger(LOG, "resetMasterUserPassword")
                .serviceDetails(
                        "Postgresql",
                        "ResetMasterUserPassword",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/DbSystem/ResetMasterUserPassword")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ResetMasterUserPasswordRequest::builder)
                .basePath("/20220915")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("actions")
                .appendPathParam("resetMasterUserPassword")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ResetMasterUserPasswordResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ResetMasterUserPasswordResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RestartDbInstanceInDbSystemResponse>
            restartDbInstanceInDbSystem(
                    RestartDbInstanceInDbSystemRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RestartDbInstanceInDbSystemRequest,
                                    RestartDbInstanceInDbSystemResponse>
                            handler) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");
        Objects.requireNonNull(
                request.getRestartDbInstanceInDbSystemDetails(),
                "restartDbInstanceInDbSystemDetails is required");

        return clientCall(request, RestartDbInstanceInDbSystemResponse::builder)
                .logger(LOG, "restartDbInstanceInDbSystem")
                .serviceDetails(
                        "Postgresql",
                        "RestartDbInstanceInDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/DbSystem/RestartDbInstanceInDbSystem")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestartDbInstanceInDbSystemRequest::builder)
                .basePath("/20220915")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("actions")
                .appendPathParam("restartDbInstance")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RestartDbInstanceInDbSystemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RestartDbInstanceInDbSystemResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RestoreDbSystemResponse> restoreDbSystem(
            RestoreDbSystemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RestoreDbSystemRequest, RestoreDbSystemResponse>
                    handler) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");
        Objects.requireNonNull(
                request.getRestoreDbSystemDetails(), "restoreDbSystemDetails is required");

        return clientCall(request, RestoreDbSystemResponse::builder)
                .logger(LOG, "restoreDbSystem")
                .serviceDetails(
                        "Postgresql",
                        "RestoreDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/DbSystem/RestoreDbSystem")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestoreDbSystemRequest::builder)
                .basePath("/20220915")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("actions")
                .appendPathParam("restore")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", RestoreDbSystemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RestoreDbSystemResponse.Builder::opcRequestId)
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
                        "Postgresql",
                        "UpdateBackup",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/Backup/UpdateBackup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBackupRequest::builder)
                .basePath("/20220915")
                .appendPathParam("backups")
                .appendPathParam(request.getBackupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.psql.model.Backup.class,
                        UpdateBackupResponse.Builder::backup)
                .handleResponseHeaderString("etag", UpdateBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBackupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationResponse> updateConfiguration(
            UpdateConfigurationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateConfigurationRequest, UpdateConfigurationResponse>
                    handler) {

        Validate.notBlank(request.getConfigurationId(), "configurationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateConfigurationDetails(), "updateConfigurationDetails is required");

        return clientCall(request, UpdateConfigurationResponse::builder)
                .logger(LOG, "updateConfiguration")
                .serviceDetails(
                        "Postgresql",
                        "UpdateConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/Configuration/UpdateConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateConfigurationRequest::builder)
                .basePath("/20220915")
                .appendPathParam("configurations")
                .appendPathParam(request.getConfigurationId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.psql.model.Configuration.class,
                        UpdateConfigurationResponse.Builder::configuration)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateConfigurationResponse.Builder::etag)
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
                        "Postgresql",
                        "UpdateDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/DbSystem/UpdateDbSystem")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDbSystemRequest::builder)
                .basePath("/20220915")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateDbSystemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDbSystemResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDbSystemDbInstanceResponse> updateDbSystemDbInstance(
            UpdateDbSystemDbInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDbSystemDbInstanceRequest, UpdateDbSystemDbInstanceResponse>
                    handler) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        Validate.notBlank(request.getDbInstanceId(), "dbInstanceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDbSystemDbInstanceDetails(),
                "updateDbSystemDbInstanceDetails is required");

        return clientCall(request, UpdateDbSystemDbInstanceResponse::builder)
                .logger(LOG, "updateDbSystemDbInstance")
                .serviceDetails(
                        "Postgresql",
                        "UpdateDbSystemDbInstance",
                        "https://docs.oracle.com/iaas/api/#/en/postgresql/20220915/DbSystem/UpdateDbSystemDbInstance")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDbSystemDbInstanceRequest::builder)
                .basePath("/20220915")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("dbinstances")
                .appendPathParam(request.getDbInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDbSystemDbInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDbSystemDbInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public PostgresqlAsyncClient(
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
    public PostgresqlAsyncClient(
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
    public PostgresqlAsyncClient(
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
    public PostgresqlAsyncClient(
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
    public PostgresqlAsyncClient(
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
    public PostgresqlAsyncClient(
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
    public PostgresqlAsyncClient(
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
