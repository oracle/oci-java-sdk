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
public class KmsManagementClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements KmsManagement {
    /** Service instance for KmsManagement. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("KMSMANAGEMENT")
                    .serviceEndpointPrefix("kms")
                    .serviceEndpointTemplate("https://kms.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(KmsManagementClient.class);

    private final KmsManagementWaiters waiters;

    private final KmsManagementPaginators paginators;

    KmsManagementClient(
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
                                    .nameFormat("KmsManagement-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new KmsManagementWaiters(executorService, this);

        this.paginators = new KmsManagementPaginators(this);
    }

    /**
     * Create a builder for this client.
     *
     * @return builder
     */
    public static com.oracle.bmc.keymanagement.KmsManagementClientBuilder builder() {
        return new com.oracle.bmc.keymanagement.KmsManagementClientBuilder(SERVICE);
    }

    @Override
    public BackupKeyResponse backupKey(BackupKeyRequest request) {

        Validate.notBlank(request.getKeyId(), "keyId must not be blank");

        return clientCall(request, BackupKeyResponse::builder)
                .logger(LOG, "backupKey")
                .serviceDetails("KmsManagement", "BackupKey", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BackupKeyRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("keys")
                .appendPathParam(request.getKeyId())
                .appendPathParam("actions")
                .appendPathParam("backup")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.Key.class,
                        BackupKeyResponse.Builder::key)
                .handleResponseHeaderString("etag", BackupKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", BackupKeyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", BackupKeyResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CancelKeyDeletionResponse cancelKeyDeletion(CancelKeyDeletionRequest request) {

        Validate.notBlank(request.getKeyId(), "keyId must not be blank");

        return clientCall(request, CancelKeyDeletionResponse::builder)
                .logger(LOG, "cancelKeyDeletion")
                .serviceDetails("KmsManagement", "CancelKeyDeletion", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelKeyDeletionRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("keys")
                .appendPathParam(request.getKeyId())
                .appendPathParam("actions")
                .appendPathParam("cancelDeletion")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.keymanagement.model.Key.class,
                        CancelKeyDeletionResponse.Builder::key)
                .handleResponseHeaderString("etag", CancelKeyDeletionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CancelKeyDeletionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CancelKeyVersionDeletionResponse cancelKeyVersionDeletion(
            CancelKeyVersionDeletionRequest request) {

        Validate.notBlank(request.getKeyId(), "keyId must not be blank");

        Validate.notBlank(request.getKeyVersionId(), "keyVersionId must not be blank");

        return clientCall(request, CancelKeyVersionDeletionResponse::builder)
                .logger(LOG, "cancelKeyVersionDeletion")
                .serviceDetails("KmsManagement", "CancelKeyVersionDeletion", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelKeyVersionDeletionRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("keys")
                .appendPathParam(request.getKeyId())
                .appendPathParam("keyVersions")
                .appendPathParam(request.getKeyVersionId())
                .appendPathParam("actions")
                .appendPathParam("cancelDeletion")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.keymanagement.model.KeyVersion.class,
                        CancelKeyVersionDeletionResponse.Builder::keyVersion)
                .handleResponseHeaderString("etag", CancelKeyVersionDeletionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CancelKeyVersionDeletionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeKeyCompartmentResponse changeKeyCompartment(ChangeKeyCompartmentRequest request) {

        Validate.notBlank(request.getKeyId(), "keyId must not be blank");
        Objects.requireNonNull(
                request.getChangeKeyCompartmentDetails(),
                "changeKeyCompartmentDetails is required");

        return clientCall(request, ChangeKeyCompartmentResponse::builder)
                .logger(LOG, "changeKeyCompartment")
                .serviceDetails("KmsManagement", "ChangeKeyCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeKeyCompartmentRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("keys")
                .appendPathParam(request.getKeyId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString("etag", ChangeKeyCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeKeyCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateKeyResponse createKey(CreateKeyRequest request) {
        Objects.requireNonNull(request.getCreateKeyDetails(), "createKeyDetails is required");

        return clientCall(request, CreateKeyResponse::builder)
                .logger(LOG, "createKey")
                .serviceDetails("KmsManagement", "CreateKey", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateKeyRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("keys")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.Key.class,
                        CreateKeyResponse.Builder::key)
                .handleResponseHeaderString("etag", CreateKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateKeyVersionResponse createKeyVersion(CreateKeyVersionRequest request) {

        Validate.notBlank(request.getKeyId(), "keyId must not be blank");

        return clientCall(request, CreateKeyVersionResponse::builder)
                .logger(LOG, "createKeyVersion")
                .serviceDetails("KmsManagement", "CreateKeyVersion", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateKeyVersionRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("keys")
                .appendPathParam(request.getKeyId())
                .appendPathParam("keyVersions")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.keymanagement.model.KeyVersion.class,
                        CreateKeyVersionResponse.Builder::keyVersion)
                .handleResponseHeaderString("etag", CreateKeyVersionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateKeyVersionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DisableKeyResponse disableKey(DisableKeyRequest request) {

        Validate.notBlank(request.getKeyId(), "keyId must not be blank");

        return clientCall(request, DisableKeyResponse::builder)
                .logger(LOG, "disableKey")
                .serviceDetails("KmsManagement", "DisableKey", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableKeyRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("keys")
                .appendPathParam(request.getKeyId())
                .appendPathParam("actions")
                .appendPathParam("disable")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.keymanagement.model.Key.class,
                        DisableKeyResponse.Builder::key)
                .handleResponseHeaderString("etag", DisableKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", DisableKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public EnableKeyResponse enableKey(EnableKeyRequest request) {

        Validate.notBlank(request.getKeyId(), "keyId must not be blank");

        return clientCall(request, EnableKeyResponse::builder)
                .logger(LOG, "enableKey")
                .serviceDetails("KmsManagement", "EnableKey", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableKeyRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("keys")
                .appendPathParam(request.getKeyId())
                .appendPathParam("actions")
                .appendPathParam("enable")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.keymanagement.model.Key.class,
                        EnableKeyResponse.Builder::key)
                .handleResponseHeaderString("etag", EnableKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", EnableKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetKeyResponse getKey(GetKeyRequest request) {

        Validate.notBlank(request.getKeyId(), "keyId must not be blank");

        return clientCall(request, GetKeyResponse::builder)
                .logger(LOG, "getKey")
                .serviceDetails("KmsManagement", "GetKey", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetKeyRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("keys")
                .appendPathParam(request.getKeyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.keymanagement.model.Key.class, GetKeyResponse.Builder::key)
                .handleResponseHeaderString("etag", GetKeyResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetKeyVersionResponse getKeyVersion(GetKeyVersionRequest request) {

        Validate.notBlank(request.getKeyId(), "keyId must not be blank");

        Validate.notBlank(request.getKeyVersionId(), "keyVersionId must not be blank");

        return clientCall(request, GetKeyVersionResponse::builder)
                .logger(LOG, "getKeyVersion")
                .serviceDetails("KmsManagement", "GetKeyVersion", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetKeyVersionRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("keys")
                .appendPathParam(request.getKeyId())
                .appendPathParam("keyVersions")
                .appendPathParam(request.getKeyVersionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.keymanagement.model.KeyVersion.class,
                        GetKeyVersionResponse.Builder::keyVersion)
                .handleResponseHeaderString("etag", GetKeyVersionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetKeyVersionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetReplicationStatusResponse getReplicationStatus(GetReplicationStatusRequest request) {

        Validate.notBlank(request.getReplicationId(), "replicationId must not be blank");

        return clientCall(request, GetReplicationStatusResponse::builder)
                .logger(LOG, "getReplicationStatus")
                .serviceDetails("KmsManagement", "GetReplicationStatus", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetReplicationStatusRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("replicaOperations")
                .appendPathParam(request.getReplicationId())
                .appendPathParam("status")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.keymanagement.model.ReplicationStatusDetails.class,
                        GetReplicationStatusResponse.Builder::replicationStatusDetails)
                .handleResponseHeaderString("etag", GetReplicationStatusResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetReplicationStatusResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWrappingKeyResponse getWrappingKey(GetWrappingKeyRequest request) {

        return clientCall(request, GetWrappingKeyResponse::builder)
                .logger(LOG, "getWrappingKey")
                .serviceDetails("KmsManagement", "GetWrappingKey", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWrappingKeyRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("wrappingKeys")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.keymanagement.model.WrappingKey.class,
                        GetWrappingKeyResponse.Builder::wrappingKey)
                .handleResponseHeaderString("etag", GetWrappingKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWrappingKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ImportKeyResponse importKey(ImportKeyRequest request) {
        Objects.requireNonNull(request.getImportKeyDetails(), "importKeyDetails is required");

        return clientCall(request, ImportKeyResponse::builder)
                .logger(LOG, "importKey")
                .serviceDetails("KmsManagement", "ImportKey", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ImportKeyRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("keys")
                .appendPathParam("import")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.Key.class,
                        ImportKeyResponse.Builder::key)
                .handleResponseHeaderString("etag", ImportKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ImportKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ImportKeyVersionResponse importKeyVersion(ImportKeyVersionRequest request) {

        Validate.notBlank(request.getKeyId(), "keyId must not be blank");
        Objects.requireNonNull(
                request.getImportKeyVersionDetails(), "importKeyVersionDetails is required");

        return clientCall(request, ImportKeyVersionResponse::builder)
                .logger(LOG, "importKeyVersion")
                .serviceDetails("KmsManagement", "ImportKeyVersion", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ImportKeyVersionRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("keys")
                .appendPathParam(request.getKeyId())
                .appendPathParam("keyVersions")
                .appendPathParam("import")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.KeyVersion.class,
                        ImportKeyVersionResponse.Builder::keyVersion)
                .handleResponseHeaderString("etag", ImportKeyVersionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ImportKeyVersionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListKeyVersionsResponse listKeyVersions(ListKeyVersionsRequest request) {

        Validate.notBlank(request.getKeyId(), "keyId must not be blank");

        return clientCall(request, ListKeyVersionsResponse::builder)
                .logger(LOG, "listKeyVersions")
                .serviceDetails("KmsManagement", "ListKeyVersions", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListKeyVersionsRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("keys")
                .appendPathParam(request.getKeyId())
                .appendPathParam("keyVersions")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.keymanagement.model.KeyVersionSummary.class,
                        ListKeyVersionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListKeyVersionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListKeyVersionsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListKeysResponse listKeys(ListKeysRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListKeysResponse::builder)
                .logger(LOG, "listKeys")
                .serviceDetails("KmsManagement", "ListKeys", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListKeysRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("keys")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("protectionMode", request.getProtectionMode())
                .appendEnumQueryParam("algorithm", request.getAlgorithm())
                .appendQueryParam("length", request.getLength())
                .appendEnumQueryParam("curveId", request.getCurveId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.keymanagement.model.KeySummary.class,
                        ListKeysResponse.Builder::items)
                .handleResponseHeaderString("opc-next-page", ListKeysResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListKeysResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RestoreKeyFromFileResponse restoreKeyFromFile(RestoreKeyFromFileRequest request) {
        Objects.requireNonNull(
                request.getRestoreKeyFromFileDetails(), "restoreKeyFromFileDetails is required");

        return clientCall(request, RestoreKeyFromFileResponse::builder)
                .logger(LOG, "restoreKeyFromFile")
                .serviceDetails("KmsManagement", "RestoreKeyFromFile", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestoreKeyFromFileRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("keys")
                .appendPathParam("actions")
                .appendPathParam("restoreFromFile")
                .accept("application/json")
                .appendHeader("content-length", request.getContentLength())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("content-md5", request.getContentMd5())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBinaryRequestBody()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.Key.class,
                        RestoreKeyFromFileResponse.Builder::key)
                .handleResponseHeaderString("etag", RestoreKeyFromFileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-content-md5", RestoreKeyFromFileResponse.Builder::opcContentMd5)
                .handleResponseHeaderString(
                        "opc-request-id", RestoreKeyFromFileResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", RestoreKeyFromFileResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public RestoreKeyFromObjectStoreResponse restoreKeyFromObjectStore(
            RestoreKeyFromObjectStoreRequest request) {

        return clientCall(request, RestoreKeyFromObjectStoreResponse::builder)
                .logger(LOG, "restoreKeyFromObjectStore")
                .serviceDetails("KmsManagement", "RestoreKeyFromObjectStore", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestoreKeyFromObjectStoreRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("keys")
                .appendPathParam("actions")
                .appendPathParam("restoreFromObjectStore")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.Key.class,
                        RestoreKeyFromObjectStoreResponse.Builder::key)
                .handleResponseHeaderString("etag", RestoreKeyFromObjectStoreResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RestoreKeyFromObjectStoreResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RestoreKeyFromObjectStoreResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ScheduleKeyDeletionResponse scheduleKeyDeletion(ScheduleKeyDeletionRequest request) {

        Validate.notBlank(request.getKeyId(), "keyId must not be blank");
        Objects.requireNonNull(
                request.getScheduleKeyDeletionDetails(), "scheduleKeyDeletionDetails is required");

        return clientCall(request, ScheduleKeyDeletionResponse::builder)
                .logger(LOG, "scheduleKeyDeletion")
                .serviceDetails("KmsManagement", "ScheduleKeyDeletion", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScheduleKeyDeletionRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("keys")
                .appendPathParam(request.getKeyId())
                .appendPathParam("actions")
                .appendPathParam("scheduleDeletion")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.Key.class,
                        ScheduleKeyDeletionResponse.Builder::key)
                .handleResponseHeaderString("etag", ScheduleKeyDeletionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ScheduleKeyDeletionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ScheduleKeyVersionDeletionResponse scheduleKeyVersionDeletion(
            ScheduleKeyVersionDeletionRequest request) {

        Validate.notBlank(request.getKeyId(), "keyId must not be blank");

        Validate.notBlank(request.getKeyVersionId(), "keyVersionId must not be blank");
        Objects.requireNonNull(
                request.getScheduleKeyVersionDeletionDetails(),
                "scheduleKeyVersionDeletionDetails is required");

        return clientCall(request, ScheduleKeyVersionDeletionResponse::builder)
                .logger(LOG, "scheduleKeyVersionDeletion")
                .serviceDetails("KmsManagement", "ScheduleKeyVersionDeletion", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScheduleKeyVersionDeletionRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("keys")
                .appendPathParam(request.getKeyId())
                .appendPathParam("keyVersions")
                .appendPathParam(request.getKeyVersionId())
                .appendPathParam("actions")
                .appendPathParam("scheduleDeletion")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.KeyVersion.class,
                        ScheduleKeyVersionDeletionResponse.Builder::keyVersion)
                .handleResponseHeaderString(
                        "etag", ScheduleKeyVersionDeletionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ScheduleKeyVersionDeletionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateKeyResponse updateKey(UpdateKeyRequest request) {

        Validate.notBlank(request.getKeyId(), "keyId must not be blank");
        Objects.requireNonNull(request.getUpdateKeyDetails(), "updateKeyDetails is required");

        return clientCall(request, UpdateKeyResponse::builder)
                .logger(LOG, "updateKey")
                .serviceDetails("KmsManagement", "UpdateKey", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateKeyRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("keys")
                .appendPathParam(request.getKeyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.Key.class,
                        UpdateKeyResponse.Builder::key)
                .handleResponseHeaderString("etag", UpdateKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public KmsManagementWaiters getWaiters() {
        return waiters;
    }

    @Override
    public KmsManagementPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public KmsManagementClient(
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
    public KmsManagementClient(
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
    public KmsManagementClient(
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
    public KmsManagementClient(
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
    public KmsManagementClient(
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
    public KmsManagementClient(
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
    public KmsManagementClient(
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
    public KmsManagementClient(
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
