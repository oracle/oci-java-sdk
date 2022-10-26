/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;

import java.util.Objects;

/**
 * Async client implementation for KmsVault service. <br>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public class KmsVaultAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements KmsVaultAsync {
    /** Service instance for KmsVault. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("KMSVAULT")
                    .serviceEndpointPrefix("kms")
                    .serviceEndpointTemplate("https://kms.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(KmsVaultAsyncClient.class);

    private KmsVaultAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, KmsVaultAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
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
        public KmsVaultAsyncClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new KmsVaultAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<BackupVaultResponse> backupVault(
            BackupVaultRequest request,
            final com.oracle.bmc.responses.AsyncHandler<BackupVaultRequest, BackupVaultResponse>
                    handler) {

        Validate.notBlank(request.getVaultId(), "vaultId must not be blank");

        return clientCall(request, BackupVaultResponse::builder)
                .logger(LOG, "backupVault")
                .serviceDetails("KmsVault", "BackupVault", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BackupVaultRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("vaults")
                .appendPathParam(request.getVaultId())
                .appendPathParam("actions")
                .appendPathParam("backup")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.Vault.class,
                        BackupVaultResponse.Builder::vault)
                .handleResponseHeaderString("etag", BackupVaultResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", BackupVaultResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", BackupVaultResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CancelVaultDeletionResponse> cancelVaultDeletion(
            CancelVaultDeletionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelVaultDeletionRequest, CancelVaultDeletionResponse>
                    handler) {

        Validate.notBlank(request.getVaultId(), "vaultId must not be blank");

        return clientCall(request, CancelVaultDeletionResponse::builder)
                .logger(LOG, "cancelVaultDeletion")
                .serviceDetails("KmsVault", "CancelVaultDeletion", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelVaultDeletionRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("vaults")
                .appendPathParam(request.getVaultId())
                .appendPathParam("actions")
                .appendPathParam("cancelDeletion")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.keymanagement.model.Vault.class,
                        CancelVaultDeletionResponse.Builder::vault)
                .handleResponseHeaderString("etag", CancelVaultDeletionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CancelVaultDeletionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeVaultCompartmentResponse> changeVaultCompartment(
            ChangeVaultCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeVaultCompartmentRequest, ChangeVaultCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getVaultId(), "vaultId must not be blank");
        Objects.requireNonNull(
                request.getChangeVaultCompartmentDetails(),
                "changeVaultCompartmentDetails is required");

        return clientCall(request, ChangeVaultCompartmentResponse::builder)
                .logger(LOG, "changeVaultCompartment")
                .serviceDetails("KmsVault", "ChangeVaultCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeVaultCompartmentRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("vaults")
                .appendPathParam(request.getVaultId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString("etag", ChangeVaultCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeVaultCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateVaultResponse> createVault(
            CreateVaultRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateVaultRequest, CreateVaultResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateVaultDetails(), "createVaultDetails is required");

        return clientCall(request, CreateVaultResponse::builder)
                .logger(LOG, "createVault")
                .serviceDetails("KmsVault", "CreateVault", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVaultRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("vaults")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.Vault.class,
                        CreateVaultResponse.Builder::vault)
                .handleResponseHeaderString("etag", CreateVaultResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVaultResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateVaultReplicaResponse> createVaultReplica(
            CreateVaultReplicaRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateVaultReplicaRequest, CreateVaultReplicaResponse>
                    handler) {

        Validate.notBlank(request.getVaultId(), "vaultId must not be blank");
        Objects.requireNonNull(
                request.getCreateVaultReplicaDetails(), "createVaultReplicaDetails is required");

        return clientCall(request, CreateVaultReplicaResponse::builder)
                .logger(LOG, "createVaultReplica")
                .serviceDetails("KmsVault", "CreateVaultReplica", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVaultReplicaRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("vaults")
                .appendPathParam(request.getVaultId())
                .appendPathParam("actions")
                .appendPathParam("createReplica")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", CreateVaultReplicaResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateVaultReplicaResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteVaultReplicaResponse> deleteVaultReplica(
            DeleteVaultReplicaRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteVaultReplicaRequest, DeleteVaultReplicaResponse>
                    handler) {

        Validate.notBlank(request.getVaultId(), "vaultId must not be blank");
        Objects.requireNonNull(
                request.getDeleteVaultReplicaDetails(), "deleteVaultReplicaDetails is required");

        return clientCall(request, DeleteVaultReplicaResponse::builder)
                .logger(LOG, "deleteVaultReplica")
                .serviceDetails("KmsVault", "DeleteVaultReplica", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DeleteVaultReplicaRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("vaults")
                .appendPathParam(request.getVaultId())
                .appendPathParam("actions")
                .appendPathParam("deleteReplica")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVaultReplicaResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteVaultReplicaResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetVaultResponse> getVault(
            GetVaultRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetVaultRequest, GetVaultResponse>
                    handler) {

        Validate.notBlank(request.getVaultId(), "vaultId must not be blank");

        return clientCall(request, GetVaultResponse::builder)
                .logger(LOG, "getVault")
                .serviceDetails("KmsVault", "GetVault", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVaultRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("vaults")
                .appendPathParam(request.getVaultId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.keymanagement.model.Vault.class,
                        GetVaultResponse.Builder::vault)
                .handleResponseHeaderString("etag", GetVaultResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVaultResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetVaultUsageResponse> getVaultUsage(
            GetVaultUsageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetVaultUsageRequest, GetVaultUsageResponse>
                    handler) {

        Validate.notBlank(request.getVaultId(), "vaultId must not be blank");

        return clientCall(request, GetVaultUsageResponse::builder)
                .logger(LOG, "getVaultUsage")
                .serviceDetails("KmsVault", "GetVaultUsage", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVaultUsageRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("vaults")
                .appendPathParam(request.getVaultId())
                .appendPathParam("usage")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.keymanagement.model.VaultUsage.class,
                        GetVaultUsageResponse.Builder::vaultUsage)
                .handleResponseHeaderString(
                        "opc-request-id", GetVaultUsageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListVaultReplicasResponse> listVaultReplicas(
            ListVaultReplicasRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListVaultReplicasRequest, ListVaultReplicasResponse>
                    handler) {

        Validate.notBlank(request.getVaultId(), "vaultId must not be blank");

        return clientCall(request, ListVaultReplicasResponse::builder)
                .logger(LOG, "listVaultReplicas")
                .serviceDetails("KmsVault", "ListVaultReplicas", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVaultReplicasRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("vaults")
                .appendPathParam(request.getVaultId())
                .appendPathParam("actions")
                .appendPathParam("listReplicas")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBodyList(
                        com.oracle.bmc.keymanagement.model.VaultReplicaSummary.class,
                        ListVaultReplicasResponse.Builder::items)
                .handleResponseHeaderString("etag", ListVaultReplicasResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-next-page", ListVaultReplicasResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListVaultReplicasResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListVaultsResponse> listVaults(
            ListVaultsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListVaultsRequest, ListVaultsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVaultsResponse::builder)
                .logger(LOG, "listVaults")
                .serviceDetails("KmsVault", "ListVaults", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVaultsRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("vaults")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.keymanagement.model.VaultSummary.class,
                        ListVaultsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListVaultsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListVaultsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RestoreVaultFromFileResponse> restoreVaultFromFile(
            RestoreVaultFromFileRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RestoreVaultFromFileRequest, RestoreVaultFromFileResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getRestoreVaultFromFileDetails(),
                "restoreVaultFromFileDetails is required");

        return clientCall(request, RestoreVaultFromFileResponse::builder)
                .logger(LOG, "restoreVaultFromFile")
                .serviceDetails("KmsVault", "RestoreVaultFromFile", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestoreVaultFromFileRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("vaults")
                .appendPathParam("actions")
                .appendPathParam("restoreFromFile")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("content-length", request.getContentLength())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("content-md5", request.getContentMd5())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBinaryRequestBody()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.Vault.class,
                        RestoreVaultFromFileResponse.Builder::vault)
                .handleResponseHeaderString("etag", RestoreVaultFromFileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-content-md5", RestoreVaultFromFileResponse.Builder::opcContentMd5)
                .handleResponseHeaderString(
                        "opc-request-id", RestoreVaultFromFileResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RestoreVaultFromFileResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RestoreVaultFromObjectStoreResponse>
            restoreVaultFromObjectStore(
                    RestoreVaultFromObjectStoreRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RestoreVaultFromObjectStoreRequest,
                                    RestoreVaultFromObjectStoreResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, RestoreVaultFromObjectStoreResponse::builder)
                .logger(LOG, "restoreVaultFromObjectStore")
                .serviceDetails("KmsVault", "RestoreVaultFromObjectStore", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestoreVaultFromObjectStoreRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("vaults")
                .appendPathParam("actions")
                .appendPathParam("restoreFromObjectStore")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.Vault.class,
                        RestoreVaultFromObjectStoreResponse.Builder::vault)
                .handleResponseHeaderString(
                        "etag", RestoreVaultFromObjectStoreResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RestoreVaultFromObjectStoreResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RestoreVaultFromObjectStoreResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ScheduleVaultDeletionResponse> scheduleVaultDeletion(
            ScheduleVaultDeletionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ScheduleVaultDeletionRequest, ScheduleVaultDeletionResponse>
                    handler) {

        Validate.notBlank(request.getVaultId(), "vaultId must not be blank");
        Objects.requireNonNull(
                request.getScheduleVaultDeletionDetails(),
                "scheduleVaultDeletionDetails is required");

        return clientCall(request, ScheduleVaultDeletionResponse::builder)
                .logger(LOG, "scheduleVaultDeletion")
                .serviceDetails("KmsVault", "ScheduleVaultDeletion", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScheduleVaultDeletionRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("vaults")
                .appendPathParam(request.getVaultId())
                .appendPathParam("actions")
                .appendPathParam("scheduleDeletion")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.Vault.class,
                        ScheduleVaultDeletionResponse.Builder::vault)
                .handleResponseHeaderString("etag", ScheduleVaultDeletionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ScheduleVaultDeletionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateVaultResponse> updateVault(
            UpdateVaultRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateVaultRequest, UpdateVaultResponse>
                    handler) {

        Validate.notBlank(request.getVaultId(), "vaultId must not be blank");
        Objects.requireNonNull(request.getUpdateVaultDetails(), "updateVaultDetails is required");

        return clientCall(request, UpdateVaultResponse::builder)
                .logger(LOG, "updateVault")
                .serviceDetails("KmsVault", "UpdateVault", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVaultRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("vaults")
                .appendPathParam(request.getVaultId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.Vault.class,
                        UpdateVaultResponse.Builder::vault)
                .handleResponseHeaderString("etag", UpdateVaultResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVaultResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public KmsVaultAsyncClient(
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
    public KmsVaultAsyncClient(
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
    public KmsVaultAsyncClient(
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
    public KmsVaultAsyncClient(
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
    public KmsVaultAsyncClient(
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
    public KmsVaultAsyncClient(
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
    public KmsVaultAsyncClient(
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
