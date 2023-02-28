/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public class KmsVaultClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements KmsVault {
    /** Service instance for KmsVault. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("KMSVAULT")
                    .serviceEndpointPrefix("kms")
                    .serviceEndpointTemplate("https://kms.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(KmsVaultClient.class);

    private final KmsVaultWaiters waiters;

    private final KmsVaultPaginators paginators;

    private KmsVaultClient(
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
                                    .nameFormat("KmsVault-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new KmsVaultWaiters(executorService, this);

        this.paginators = new KmsVaultPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, KmsVaultClient> {
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
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public KmsVaultClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new KmsVaultClient(this, authenticationDetailsProvider, executorService);
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
    public BackupVaultResponse backupVault(BackupVaultRequest request) {

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
                .callSync();
    }

    @Override
    public CancelVaultDeletionResponse cancelVaultDeletion(CancelVaultDeletionRequest request) {

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
                .callSync();
    }

    @Override
    public ChangeVaultCompartmentResponse changeVaultCompartment(
            ChangeVaultCompartmentRequest request) {

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
                .callSync();
    }

    @Override
    public CreateVaultResponse createVault(CreateVaultRequest request) {
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
                .callSync();
    }

    @Override
    public CreateVaultReplicaResponse createVaultReplica(CreateVaultReplicaRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteVaultReplicaResponse deleteVaultReplica(DeleteVaultReplicaRequest request) {

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
                .callSync();
    }

    @Override
    public GetVaultResponse getVault(GetVaultRequest request) {

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
                .callSync();
    }

    @Override
    public GetVaultUsageResponse getVaultUsage(GetVaultUsageRequest request) {

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
                .callSync();
    }

    @Override
    public ListVaultReplicasResponse listVaultReplicas(ListVaultReplicasRequest request) {

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
                .callSync();
    }

    @Override
    public ListVaultsResponse listVaults(ListVaultsRequest request) {
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
                .callSync();
    }

    @Override
    public RestoreVaultFromFileResponse restoreVaultFromFile(RestoreVaultFromFileRequest request) {
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
                .callSync();
    }

    @Override
    public RestoreVaultFromObjectStoreResponse restoreVaultFromObjectStore(
            RestoreVaultFromObjectStoreRequest request) {
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
                .callSync();
    }

    @Override
    public ScheduleVaultDeletionResponse scheduleVaultDeletion(
            ScheduleVaultDeletionRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateVaultResponse updateVault(UpdateVaultRequest request) {

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
                .callSync();
    }

    @Override
    public KmsVaultWaiters getWaiters() {
        return waiters;
    }

    @Override
    public KmsVaultPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public KmsVaultClient(
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
    public KmsVaultClient(
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
    public KmsVaultClient(
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
    public KmsVaultClient(
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
    public KmsVaultClient(
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
    public KmsVaultClient(
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
    public KmsVaultClient(
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
    public KmsVaultClient(
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
