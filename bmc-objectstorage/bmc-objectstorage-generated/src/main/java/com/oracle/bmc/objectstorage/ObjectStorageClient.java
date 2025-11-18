/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.objectstorage.requests.*;
import com.oracle.bmc.objectstorage.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ObjectStorageClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements ObjectStorage {
    /** Service instance for ObjectStorage. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("OBJECTSTORAGE")
                    .serviceEndpointPrefix("objectstorage")
                    .serviceEndpointTemplate("https://objectstorage.{region}.{secondLevelDomain}")
                    .addServiceEndpointTemplateForRealm(
                            "oc1",
                            "https://{namespaceName+Dot}objectstorage.{region}.oci.customer-oci.com")
                    .endpointServiceName("objectstorage")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ObjectStorageClient.class);

    private final ObjectStorageWaiters waiters;

    private final ObjectStoragePaginators paginators;

    ObjectStorageClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        this(builder, authenticationDetailsProvider, executorService, true);
    }

    ObjectStorageClient(
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
                                    .nameFormat("ObjectStorage-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new ObjectStorageWaiters(executorService, this);

        this.paginators = new ObjectStoragePaginators(this);
        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "ObjectStorageClient", "getObject"));
        }
    }

    @Override
    protected com.oracle.bmc.http.ClientConfigurator getDefaultConfigurator() {
        return new com.oracle.bmc.http.DefaultConfigurator.NonBuffering();
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ObjectStorageClient> {
        private boolean isStreamWarningEnabled = true;
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "objectstorage";
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
        public ObjectStorageClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ObjectStorageClient(
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
    public AbortMultipartUploadResponse abortMultipartUpload(AbortMultipartUploadRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getObjectName(), "objectName must not be blank");
        Objects.requireNonNull(request.getUploadId(), "uploadId is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("objectName", request.getObjectName());
        requiredParametersMap.put("uploadId", request.getUploadId());

        return clientCall(request, AbortMultipartUploadResponse::builder)
                .logger(LOG, "abortMultipartUpload")
                .serviceDetails(
                        "ObjectStorage",
                        "AbortMultipartUpload",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/MultipartUpload/AbortMultipartUpload")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(AbortMultipartUploadRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("u")
                .appendPathParam(request.getObjectName())
                .appendQueryParam("uploadId", request.getUploadId())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        AbortMultipartUploadResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", AbortMultipartUploadResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public BatchDeleteObjectsResponse batchDeleteObjects(BatchDeleteObjectsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");
        Objects.requireNonNull(
                request.getBatchDeleteObjectsDetails(), "batchDeleteObjectsDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, BatchDeleteObjectsResponse::builder)
                .logger(LOG, "batchDeleteObjects")
                .serviceDetails(
                        "ObjectStorage",
                        "BatchDeleteObjects",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Object/BatchDeleteObjects")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(BatchDeleteObjectsRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("actions")
                .appendPathParam("batchDeleteObjects")
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.objectstorage.model.BatchDeleteObjectsResult.class,
                        BatchDeleteObjectsResponse.Builder::batchDeleteObjectsResult)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        BatchDeleteObjectsResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", BatchDeleteObjectsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("workRequestId", request.getWorkRequestId());

        return clientCall(request, CancelWorkRequestResponse::builder)
                .logger(LOG, "cancelWorkRequest")
                .serviceDetails(
                        "ObjectStorage",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/WorkRequest/CancelWorkRequest")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        CancelWorkRequestResponse.Builder::opcClientRequestId)
                .callSync();
    }

    @Override
    public CommitMultipartUploadResponse commitMultipartUpload(
            CommitMultipartUploadRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getObjectName(), "objectName must not be blank");
        Objects.requireNonNull(request.getUploadId(), "uploadId is required");

        Objects.requireNonNull(
                request.getCommitMultipartUploadDetails(),
                "commitMultipartUploadDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("objectName", request.getObjectName());
        requiredParametersMap.put("uploadId", request.getUploadId());

        return clientCall(request, CommitMultipartUploadResponse::builder)
                .logger(LOG, "commitMultipartUpload")
                .serviceDetails(
                        "ObjectStorage",
                        "CommitMultipartUpload",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/MultipartUpload/CommitMultipartUpload")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CommitMultipartUploadRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("u")
                .appendPathParam(request.getObjectName())
                .appendQueryParam("uploadId", request.getUploadId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        CommitMultipartUploadResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CommitMultipartUploadResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-multipart-md5", CommitMultipartUploadResponse.Builder::opcMultipartMd5)
                .handleResponseHeaderString(
                        "opc-content-crc32c",
                        CommitMultipartUploadResponse.Builder::opcContentCrc32c)
                .handleResponseHeaderString(
                        "opc-multipart-sha256",
                        CommitMultipartUploadResponse.Builder::opcMultipartSha256)
                .handleResponseHeaderString(
                        "opc-multipart-sha384",
                        CommitMultipartUploadResponse.Builder::opcMultipartSha384)
                .handleResponseHeaderString("ETag", CommitMultipartUploadResponse.Builder::eTag)
                .handleResponseHeaderDate(
                        "last-modified", CommitMultipartUploadResponse.Builder::lastModified)
                .handleResponseHeaderString(
                        "version-id", CommitMultipartUploadResponse.Builder::versionId)
                .callSync();
    }

    @Override
    public CopyObjectResponse copyObject(CopyObjectRequest request) {
        request =
                com.oracle.bmc.objectstorage.internal.http.ObjectMetadataInterceptor.intercept(
                        request);

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");
        Objects.requireNonNull(request.getCopyObjectDetails(), "copyObjectDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, CopyObjectResponse::builder)
                .logger(LOG, "copyObject")
                .serviceDetails(
                        "ObjectStorage",
                        "CopyObject",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Object/CopyObject")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CopyObjectRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("actions")
                .appendPathParam("copyObject")
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .appendHeader("opc-sse-customer-algorithm", request.getOpcSseCustomerAlgorithm())
                .appendHeader("opc-sse-customer-key", request.getOpcSseCustomerKey())
                .appendHeader("opc-sse-customer-key-sha256", request.getOpcSseCustomerKeySha256())
                .appendHeader(
                        "opc-source-sse-customer-algorithm",
                        request.getOpcSourceSseCustomerAlgorithm())
                .appendHeader("opc-source-sse-customer-key", request.getOpcSourceSseCustomerKey())
                .appendHeader(
                        "opc-source-sse-customer-key-sha256",
                        request.getOpcSourceSseCustomerKeySha256())
                .appendHeader("opc-sse-kms-key-id", request.getOpcSseKmsKeyId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CopyObjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CopyObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id", CopyObjectResponse.Builder::opcClientRequestId)
                .callSync();
    }

    @Override
    public CreateBucketResponse createBucket(CreateBucketRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getCreateBucketDetails(), "createBucketDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());

        return clientCall(request, CreateBucketResponse::builder)
                .logger(LOG, "createBucket")
                .serviceDetails(
                        "ObjectStorage",
                        "CreateBucket",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Bucket/CreateBucket")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBucketRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.objectstorage.model.Bucket.class,
                        CreateBucketResponse.Builder::bucket)
                .handleResponseHeaderString(
                        "opc-client-request-id", CreateBucketResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBucketResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", CreateBucketResponse.Builder::eTag)
                .handleResponseHeaderString("Location", CreateBucketResponse.Builder::location)
                .callSync();
    }

    @Override
    public CreateMultipartUploadResponse createMultipartUpload(
            CreateMultipartUploadRequest request) {
        request =
                com.oracle.bmc.objectstorage.internal.http.ObjectMetadataInterceptor.intercept(
                        request);

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");
        Objects.requireNonNull(
                request.getCreateMultipartUploadDetails(),
                "createMultipartUploadDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, CreateMultipartUploadResponse::builder)
                .logger(LOG, "createMultipartUpload")
                .serviceDetails(
                        "ObjectStorage",
                        "CreateMultipartUpload",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/MultipartUpload/CreateMultipartUpload")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMultipartUploadRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("u")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .appendHeader("opc-sse-customer-algorithm", request.getOpcSseCustomerAlgorithm())
                .appendHeader("opc-sse-customer-key", request.getOpcSseCustomerKey())
                .appendHeader("opc-sse-customer-key-sha256", request.getOpcSseCustomerKeySha256())
                .appendHeader("opc-sse-kms-key-id", request.getOpcSseKmsKeyId())
                .appendEnumHeader("opc-checksum-algorithm", request.getOpcChecksumAlgorithm())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.objectstorage.model.MultipartUpload.class,
                        CreateMultipartUploadResponse.Builder::multipartUpload)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        CreateMultipartUploadResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMultipartUploadResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "Location", CreateMultipartUploadResponse.Builder::location)
                .callSync();
    }

    @Override
    public CreatePreauthenticatedRequestResponse createPreauthenticatedRequest(
            CreatePreauthenticatedRequestRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");
        Objects.requireNonNull(
                request.getCreatePreauthenticatedRequestDetails(),
                "createPreauthenticatedRequestDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, CreatePreauthenticatedRequestResponse::builder)
                .logger(LOG, "createPreauthenticatedRequest")
                .serviceDetails(
                        "ObjectStorage",
                        "CreatePreauthenticatedRequest",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/PreauthenticatedRequest/CreatePreauthenticatedRequest")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePreauthenticatedRequestRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("p")
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.objectstorage.model.PreauthenticatedRequest.class,
                        CreatePreauthenticatedRequestResponse.Builder::preauthenticatedRequest)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        CreatePreauthenticatedRequestResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreatePreauthenticatedRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreatePrivateEndpointResponse createPrivateEndpoint(
            CreatePrivateEndpointRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getCreatePrivateEndpointDetails(),
                "createPrivateEndpointDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());

        return clientCall(request, CreatePrivateEndpointResponse::builder)
                .logger(LOG, "createPrivateEndpoint")
                .serviceDetails(
                        "ObjectStorage",
                        "CreatePrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/PrivateEndpoint/CreatePrivateEndpoint")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePrivateEndpointRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("pe")
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreatePrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        CreatePrivateEndpointResponse.Builder::opcClientRequestId)
                .callSync();
    }

    @Override
    public CreateReplicationPolicyResponse createReplicationPolicy(
            CreateReplicationPolicyRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");
        Objects.requireNonNull(
                request.getCreateReplicationPolicyDetails(),
                "createReplicationPolicyDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, CreateReplicationPolicyResponse::builder)
                .logger(LOG, "createReplicationPolicy")
                .serviceDetails(
                        "ObjectStorage",
                        "CreateReplicationPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Replication/CreateReplicationPolicy")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateReplicationPolicyRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("replicationPolicies")
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.objectstorage.model.ReplicationPolicy.class,
                        CreateReplicationPolicyResponse.Builder::replicationPolicy)
                .handleResponseHeaderString(
                        "opc-request-id", CreateReplicationPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        CreateReplicationPolicyResponse.Builder::opcClientRequestId)
                .callSync();
    }

    @Override
    public CreateRetentionRuleResponse createRetentionRule(CreateRetentionRuleRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");
        Objects.requireNonNull(
                request.getCreateRetentionRuleDetails(), "createRetentionRuleDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, CreateRetentionRuleResponse::builder)
                .logger(LOG, "createRetentionRule")
                .serviceDetails(
                        "ObjectStorage",
                        "CreateRetentionRule",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/RetentionRule/CreateRetentionRule")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRetentionRuleRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("retentionRules")
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.objectstorage.model.RetentionRule.class,
                        CreateRetentionRuleResponse.Builder::retentionRule)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRetentionRuleResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        CreateRetentionRuleResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString("etag", CreateRetentionRuleResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteBucketResponse deleteBucket(DeleteBucketRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, DeleteBucketResponse::builder)
                .logger(LOG, "deleteBucket")
                .serviceDetails(
                        "ObjectStorage",
                        "DeleteBucket",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Bucket/DeleteBucket")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBucketRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-client-request-id", DeleteBucketResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBucketResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteObjectResponse deleteObject(DeleteObjectRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getObjectName(), "objectName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("objectName", request.getObjectName());

        return clientCall(request, DeleteObjectResponse::builder)
                .logger(LOG, "deleteObject")
                .serviceDetails(
                        "ObjectStorage",
                        "DeleteObject",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Object/DeleteObject")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteObjectRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("o")
                .appendPathParam(request.getObjectName())
                .appendQueryParam("versionId", request.getVersionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-client-request-id", DeleteObjectResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderDate(
                        "last-modified", DeleteObjectResponse.Builder::lastModified)
                .handleResponseHeaderString("version-id", DeleteObjectResponse.Builder::versionId)
                .handleResponseHeaderBoolean(
                        "is-delete-marker", DeleteObjectResponse.Builder::isDeleteMarker)
                .callSync();
    }

    @Override
    public DeleteObjectLifecyclePolicyResponse deleteObjectLifecyclePolicy(
            DeleteObjectLifecyclePolicyRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, DeleteObjectLifecyclePolicyResponse::builder)
                .logger(LOG, "deleteObjectLifecyclePolicy")
                .serviceDetails(
                        "ObjectStorage",
                        "DeleteObjectLifecyclePolicy",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/ObjectLifecyclePolicy/DeleteObjectLifecyclePolicy")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteObjectLifecyclePolicyRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("l")
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteObjectLifecyclePolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        DeleteObjectLifecyclePolicyResponse.Builder::opcClientRequestId)
                .callSync();
    }

    @Override
    public DeletePreauthenticatedRequestResponse deletePreauthenticatedRequest(
            DeletePreauthenticatedRequestRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getParId(), "parId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("parId", request.getParId());

        return clientCall(request, DeletePreauthenticatedRequestResponse::builder)
                .logger(LOG, "deletePreauthenticatedRequest")
                .serviceDetails(
                        "ObjectStorage",
                        "DeletePreauthenticatedRequest",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/PreauthenticatedRequest/DeletePreauthenticatedRequest")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePreauthenticatedRequestRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("p")
                .appendPathParam(request.getParId())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        DeletePreauthenticatedRequestResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeletePreauthenticatedRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeletePrivateEndpointResponse deletePrivateEndpoint(
            DeletePrivateEndpointRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getPeName(), "peName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("peName", request.getPeName());

        return clientCall(request, DeletePrivateEndpointResponse::builder)
                .logger(LOG, "deletePrivateEndpoint")
                .serviceDetails(
                        "ObjectStorage",
                        "DeletePrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/PrivateEndpoint/DeletePrivateEndpoint")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePrivateEndpointRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("pe")
                .appendPathParam(request.getPeName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeletePrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        DeletePrivateEndpointResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeletePrivateEndpointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteReplicationPolicyResponse deleteReplicationPolicy(
            DeleteReplicationPolicyRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getReplicationId(), "replicationId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("replicationId", request.getReplicationId());

        return clientCall(request, DeleteReplicationPolicyResponse::builder)
                .logger(LOG, "deleteReplicationPolicy")
                .serviceDetails(
                        "ObjectStorage",
                        "DeleteReplicationPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Replication/DeleteReplicationPolicy")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteReplicationPolicyRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("replicationPolicies")
                .appendPathParam(request.getReplicationId())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteReplicationPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        DeleteReplicationPolicyResponse.Builder::opcClientRequestId)
                .callSync();
    }

    @Override
    public DeleteRetentionRuleResponse deleteRetentionRule(DeleteRetentionRuleRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getRetentionRuleId(), "retentionRuleId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("retentionRuleId", request.getRetentionRuleId());

        return clientCall(request, DeleteRetentionRuleResponse::builder)
                .logger(LOG, "deleteRetentionRule")
                .serviceDetails(
                        "ObjectStorage",
                        "DeleteRetentionRule",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/RetentionRule/DeleteRetentionRule")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRetentionRuleRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("retentionRules")
                .appendPathParam(request.getRetentionRuleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        DeleteRetentionRuleResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRetentionRuleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetBucketResponse getBucket(GetBucketRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, GetBucketResponse::builder)
                .logger(LOG, "getBucket")
                .serviceDetails(
                        "ObjectStorage",
                        "GetBucket",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Bucket/GetBucket")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBucketRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.CommaSeparated)
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.objectstorage.model.Bucket.class,
                        GetBucketResponse.Builder::bucket)
                .handleResponseHeaderString(
                        "opc-client-request-id", GetBucketResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", GetBucketResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", GetBucketResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public GetNamespaceResponse getNamespace(GetNamespaceRequest request) {

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();

        return clientCall(request, GetNamespaceResponse::builder)
                .logger(LOG, "getNamespace")
                .serviceDetails(
                        "ObjectStorage",
                        "GetNamespace",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Namespace/GetNamespace")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNamespaceRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleBody(String.class, GetNamespaceResponse.Builder::value)
                .callSync();
    }

    @Override
    public GetNamespaceMetadataResponse getNamespaceMetadata(GetNamespaceMetadataRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());

        return clientCall(request, GetNamespaceMetadataResponse::builder)
                .logger(LOG, "getNamespaceMetadata")
                .serviceDetails(
                        "ObjectStorage",
                        "GetNamespaceMetadata",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Namespace/GetNamespaceMetadata")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNamespaceMetadataRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.objectstorage.model.NamespaceMetadata.class,
                        GetNamespaceMetadataResponse.Builder::namespaceMetadata)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        GetNamespaceMetadataResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", GetNamespaceMetadataResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetObjectResponse getObject(GetObjectRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getObjectName(), "objectName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("objectName", request.getObjectName());

        return clientCall(request, GetObjectResponse::builder)
                .logger(LOG, "getObject")
                .serviceDetails(
                        "ObjectStorage",
                        "GetObject",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Object/GetObject")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetObjectRequest::builder)
                .interceptResponse(
                        com.oracle.bmc.objectstorage.internal.http.ObjectMetadataInterceptor
                                ::intercept)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("o")
                .appendPathParam(request.getObjectName())
                .appendQueryParam("versionId", request.getVersionId())
                .appendQueryParam(
                        "httpResponseContentDisposition",
                        request.getHttpResponseContentDisposition())
                .appendQueryParam("httpResponseCacheControl", request.getHttpResponseCacheControl())
                .appendQueryParam("httpResponseContentType", request.getHttpResponseContentType())
                .appendQueryParam(
                        "httpResponseContentLanguage", request.getHttpResponseContentLanguage())
                .appendQueryParam(
                        "httpResponseContentEncoding", request.getHttpResponseContentEncoding())
                .appendQueryParam("httpResponseExpires", request.getHttpResponseExpires())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .appendHeader("range", request.getRange())
                .appendHeader("opc-sse-customer-algorithm", request.getOpcSseCustomerAlgorithm())
                .appendHeader("opc-sse-customer-key", request.getOpcSseCustomerKey())
                .appendHeader("opc-sse-customer-key-sha256", request.getOpcSseCustomerKeySha256())
                .operationUsesDefaultRetries()
                .handleBody(java.io.InputStream.class, GetObjectResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-client-request-id", GetObjectResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", GetObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", GetObjectResponse.Builder::eTag)
                .handleResponseHeadersMap("opc-meta-", GetObjectResponse.Builder::opcMeta)
                .handleResponseHeaderLong(
                        "content-length", GetObjectResponse.Builder::contentLength)
                .handleResponseHeaderRange("content-range", GetObjectResponse.Builder::contentRange)
                .handleResponseHeaderString("content-md5", GetObjectResponse.Builder::contentMd5)
                .handleResponseHeaderString(
                        "opc-multipart-md5", GetObjectResponse.Builder::opcMultipartMd5)
                .handleResponseHeaderString(
                        "opc-content-crc32c", GetObjectResponse.Builder::opcContentCrc32c)
                .handleResponseHeaderString(
                        "opc-content-sha256", GetObjectResponse.Builder::opcContentSha256)
                .handleResponseHeaderString(
                        "opc-multipart-sha256", GetObjectResponse.Builder::opcMultipartSha256)
                .handleResponseHeaderString(
                        "opc-content-sha384", GetObjectResponse.Builder::opcContentSha384)
                .handleResponseHeaderString(
                        "opc-multipart-sha384", GetObjectResponse.Builder::opcMultipartSha384)
                .handleResponseHeaderString("content-type", GetObjectResponse.Builder::contentType)
                .handleResponseHeaderString(
                        "content-language", GetObjectResponse.Builder::contentLanguage)
                .handleResponseHeaderString(
                        "content-encoding", GetObjectResponse.Builder::contentEncoding)
                .handleResponseHeaderString(
                        "cache-control", GetObjectResponse.Builder::cacheControl)
                .handleResponseHeaderString(
                        "content-disposition", GetObjectResponse.Builder::contentDisposition)
                .handleResponseHeaderDate("last-modified", GetObjectResponse.Builder::lastModified)
                .handleResponseHeaderEnum(
                        "storage-tier",
                        com.oracle.bmc.objectstorage.model.StorageTier::create,
                        GetObjectResponse.Builder::storageTier)
                .handleResponseHeaderEnum(
                        "archival-state",
                        com.oracle.bmc.objectstorage.model.ArchivalState::create,
                        GetObjectResponse.Builder::archivalState)
                .handleResponseHeaderDate(
                        "time-of-archival", GetObjectResponse.Builder::timeOfArchival)
                .handleResponseHeaderString("version-id", GetObjectResponse.Builder::versionId)
                .handleResponseHeaderDate("expires", GetObjectResponse.Builder::expires)
                .callSync();
    }

    @Override
    public GetObjectLifecyclePolicyResponse getObjectLifecyclePolicy(
            GetObjectLifecyclePolicyRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, GetObjectLifecyclePolicyResponse::builder)
                .logger(LOG, "getObjectLifecyclePolicy")
                .serviceDetails(
                        "ObjectStorage",
                        "GetObjectLifecyclePolicy",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/ObjectLifecyclePolicy/GetObjectLifecyclePolicy")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetObjectLifecyclePolicyRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("l")
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.objectstorage.model.ObjectLifecyclePolicy.class,
                        GetObjectLifecyclePolicyResponse.Builder::objectLifecyclePolicy)
                .handleResponseHeaderString(
                        "opc-request-id", GetObjectLifecyclePolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        GetObjectLifecyclePolicyResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString("ETag", GetObjectLifecyclePolicyResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public GetPreauthenticatedRequestResponse getPreauthenticatedRequest(
            GetPreauthenticatedRequestRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getParId(), "parId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("parId", request.getParId());

        return clientCall(request, GetPreauthenticatedRequestResponse::builder)
                .logger(LOG, "getPreauthenticatedRequest")
                .serviceDetails(
                        "ObjectStorage",
                        "GetPreauthenticatedRequest",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/PreauthenticatedRequest/GetPreauthenticatedRequest")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPreauthenticatedRequestRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("p")
                .appendPathParam(request.getParId())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.objectstorage.model.PreauthenticatedRequestSummary.class,
                        GetPreauthenticatedRequestResponse.Builder::preauthenticatedRequestSummary)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        GetPreauthenticatedRequestResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", GetPreauthenticatedRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPrivateEndpointResponse getPrivateEndpoint(GetPrivateEndpointRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getPeName(), "peName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("peName", request.getPeName());

        return clientCall(request, GetPrivateEndpointResponse::builder)
                .logger(LOG, "getPrivateEndpoint")
                .serviceDetails(
                        "ObjectStorage",
                        "GetPrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/PrivateEndpoint/GetPrivateEndpoint")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPrivateEndpointRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("pe")
                .appendPathParam(request.getPeName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.objectstorage.model.PrivateEndpoint.class,
                        GetPrivateEndpointResponse.Builder::privateEndpoint)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        GetPrivateEndpointResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", GetPrivateEndpointResponse.Builder::opcRequestId)
                .handleResponseHeaderString("eTag", GetPrivateEndpointResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public GetReplicationPolicyResponse getReplicationPolicy(GetReplicationPolicyRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getReplicationId(), "replicationId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("replicationId", request.getReplicationId());

        return clientCall(request, GetReplicationPolicyResponse::builder)
                .logger(LOG, "getReplicationPolicy")
                .serviceDetails(
                        "ObjectStorage",
                        "GetReplicationPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Replication/GetReplicationPolicy")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetReplicationPolicyRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("replicationPolicies")
                .appendPathParam(request.getReplicationId())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.objectstorage.model.ReplicationPolicy.class,
                        GetReplicationPolicyResponse.Builder::replicationPolicy)
                .handleResponseHeaderString(
                        "opc-request-id", GetReplicationPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        GetReplicationPolicyResponse.Builder::opcClientRequestId)
                .callSync();
    }

    @Override
    public GetRetentionRuleResponse getRetentionRule(GetRetentionRuleRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getRetentionRuleId(), "retentionRuleId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("retentionRuleId", request.getRetentionRuleId());

        return clientCall(request, GetRetentionRuleResponse::builder)
                .logger(LOG, "getRetentionRule")
                .serviceDetails(
                        "ObjectStorage",
                        "GetRetentionRule",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/RetentionRule/GetRetentionRule")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRetentionRuleRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("retentionRules")
                .appendPathParam(request.getRetentionRuleId())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.objectstorage.model.RetentionRule.class,
                        GetRetentionRuleResponse.Builder::retentionRule)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        GetRetentionRuleResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", GetRetentionRuleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetRetentionRuleResponse.Builder::etag)
                .handleResponseHeaderDate(
                        "last-modified", GetRetentionRuleResponse.Builder::lastModified)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("workRequestId", request.getWorkRequestId());

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "ObjectStorage",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/WorkRequest/GetWorkRequest")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.objectstorage.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id", GetWorkRequestResponse.Builder::opcClientRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public HeadBucketResponse headBucket(HeadBucketRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, HeadBucketResponse::builder)
                .logger(LOG, "headBucket")
                .serviceDetails(
                        "ObjectStorage",
                        "HeadBucket",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Bucket/HeadBucket")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.HEAD)
                .requestBuilder(HeadBucketRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-client-request-id", HeadBucketResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", HeadBucketResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", HeadBucketResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public HeadObjectResponse headObject(HeadObjectRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getObjectName(), "objectName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("objectName", request.getObjectName());

        return clientCall(request, HeadObjectResponse::builder)
                .logger(LOG, "headObject")
                .serviceDetails(
                        "ObjectStorage",
                        "HeadObject",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Object/HeadObject")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.HEAD)
                .requestBuilder(HeadObjectRequest::builder)
                .interceptResponse(
                        com.oracle.bmc.objectstorage.internal.http.ObjectMetadataInterceptor
                                ::intercept)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("o")
                .appendPathParam(request.getObjectName())
                .appendQueryParam("versionId", request.getVersionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .appendHeader("opc-sse-customer-algorithm", request.getOpcSseCustomerAlgorithm())
                .appendHeader("opc-sse-customer-key", request.getOpcSseCustomerKey())
                .appendHeader("opc-sse-customer-key-sha256", request.getOpcSseCustomerKeySha256())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-client-request-id", HeadObjectResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", HeadObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", HeadObjectResponse.Builder::eTag)
                .handleResponseHeadersMap("opc-meta-", HeadObjectResponse.Builder::opcMeta)
                .handleResponseHeaderLong(
                        "content-length", HeadObjectResponse.Builder::contentLength)
                .handleResponseHeaderString("content-md5", HeadObjectResponse.Builder::contentMd5)
                .handleResponseHeaderString(
                        "opc-multipart-md5", HeadObjectResponse.Builder::opcMultipartMd5)
                .handleResponseHeaderString(
                        "opc-content-crc32c", HeadObjectResponse.Builder::opcContentCrc32c)
                .handleResponseHeaderString(
                        "opc-content-sha256", HeadObjectResponse.Builder::opcContentSha256)
                .handleResponseHeaderString(
                        "opc-multipart-sha256", HeadObjectResponse.Builder::opcMultipartSha256)
                .handleResponseHeaderString(
                        "opc-content-sha384", HeadObjectResponse.Builder::opcContentSha384)
                .handleResponseHeaderString(
                        "opc-multipart-sha384", HeadObjectResponse.Builder::opcMultipartSha384)
                .handleResponseHeaderString("content-type", HeadObjectResponse.Builder::contentType)
                .handleResponseHeaderString(
                        "content-language", HeadObjectResponse.Builder::contentLanguage)
                .handleResponseHeaderString(
                        "content-encoding", HeadObjectResponse.Builder::contentEncoding)
                .handleResponseHeaderString(
                        "cache-control", HeadObjectResponse.Builder::cacheControl)
                .handleResponseHeaderString(
                        "content-disposition", HeadObjectResponse.Builder::contentDisposition)
                .handleResponseHeaderDate("last-modified", HeadObjectResponse.Builder::lastModified)
                .handleResponseHeaderEnum(
                        "storage-tier",
                        com.oracle.bmc.objectstorage.model.StorageTier::create,
                        HeadObjectResponse.Builder::storageTier)
                .handleResponseHeaderEnum(
                        "archival-state",
                        com.oracle.bmc.objectstorage.model.ArchivalState::create,
                        HeadObjectResponse.Builder::archivalState)
                .handleResponseHeaderDate(
                        "time-of-archival", HeadObjectResponse.Builder::timeOfArchival)
                .handleResponseHeaderString("version-id", HeadObjectResponse.Builder::versionId)
                .callSync();
    }

    @Override
    public ListBucketsResponse listBuckets(ListBucketsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("compartmentId", request.getCompartmentId());

        return clientCall(request, ListBucketsResponse::builder)
                .logger(LOG, "listBuckets")
                .serviceDetails(
                        "ObjectStorage",
                        "ListBuckets",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Bucket/ListBuckets")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBucketsRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.CommaSeparated)
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.objectstorage.model.BucketSummary.class,
                        ListBucketsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-client-request-id", ListBucketsResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ListBucketsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBucketsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMultipartUploadPartsResponse listMultipartUploadParts(
            ListMultipartUploadPartsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getObjectName(), "objectName must not be blank");
        Objects.requireNonNull(request.getUploadId(), "uploadId is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("objectName", request.getObjectName());
        requiredParametersMap.put("uploadId", request.getUploadId());

        return clientCall(request, ListMultipartUploadPartsResponse::builder)
                .logger(LOG, "listMultipartUploadParts")
                .serviceDetails(
                        "ObjectStorage",
                        "ListMultipartUploadParts",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/MultipartUpload/ListMultipartUploadParts")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMultipartUploadPartsRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("u")
                .appendPathParam(request.getObjectName())
                .appendQueryParam("uploadId", request.getUploadId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.objectstorage.model.MultipartUploadPartSummary.class,
                        ListMultipartUploadPartsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        ListMultipartUploadPartsResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ListMultipartUploadPartsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMultipartUploadPartsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMultipartUploadsResponse listMultipartUploads(ListMultipartUploadsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, ListMultipartUploadsResponse::builder)
                .logger(LOG, "listMultipartUploads")
                .serviceDetails(
                        "ObjectStorage",
                        "ListMultipartUploads",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/MultipartUpload/ListMultipartUploads")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMultipartUploadsRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("u")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.objectstorage.model.MultipartUpload.class,
                        ListMultipartUploadsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        ListMultipartUploadsResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ListMultipartUploadsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMultipartUploadsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListObjectVersionsResponse listObjectVersions(ListObjectVersionsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, ListObjectVersionsResponse::builder)
                .logger(LOG, "listObjectVersions")
                .serviceDetails(
                        "ObjectStorage",
                        "ListObjectVersions",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Object/ListObjectVersions")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListObjectVersionsRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("objectversions")
                .appendQueryParam("prefix", request.getPrefix())
                .appendQueryParam("start", request.getStart())
                .appendQueryParam("end", request.getEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("delimiter", request.getDelimiter())
                .appendQueryParam("fields", request.getFields())
                .appendQueryParam("startAfter", request.getStartAfter())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.objectstorage.model.ObjectVersionCollection.class,
                        ListObjectVersionsResponse.Builder::objectVersionCollection)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        ListObjectVersionsResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ListObjectVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListObjectVersionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListObjectsResponse listObjects(ListObjectsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, ListObjectsResponse::builder)
                .logger(LOG, "listObjects")
                .serviceDetails(
                        "ObjectStorage",
                        "ListObjects",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Object/ListObjects")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListObjectsRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("o")
                .appendQueryParam("prefix", request.getPrefix())
                .appendQueryParam("start", request.getStart())
                .appendQueryParam("end", request.getEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("delimiter", request.getDelimiter())
                .appendQueryParam("fields", request.getFields())
                .appendQueryParam("startAfter", request.getStartAfter())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.objectstorage.model.ListObjects.class,
                        ListObjectsResponse.Builder::listObjects)
                .handleResponseHeaderString(
                        "opc-client-request-id", ListObjectsResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ListObjectsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListPreauthenticatedRequestsResponse listPreauthenticatedRequests(
            ListPreauthenticatedRequestsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, ListPreauthenticatedRequestsResponse::builder)
                .logger(LOG, "listPreauthenticatedRequests")
                .serviceDetails(
                        "ObjectStorage",
                        "ListPreauthenticatedRequests",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/PreauthenticatedRequest/ListPreauthenticatedRequests")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPreauthenticatedRequestsRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("p")
                .appendQueryParam("objectNamePrefix", request.getObjectNamePrefix())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.objectstorage.model.PreauthenticatedRequestSummary.class,
                        ListPreauthenticatedRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        ListPreauthenticatedRequestsResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListPreauthenticatedRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPreauthenticatedRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListPrivateEndpointsResponse listPrivateEndpoints(ListPrivateEndpointsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("compartmentId", request.getCompartmentId());

        return clientCall(request, ListPrivateEndpointsResponse::builder)
                .logger(LOG, "listPrivateEndpoints")
                .serviceDetails(
                        "ObjectStorage",
                        "ListPrivateEndpoints",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/PrivateEndpointSummary/ListPrivateEndpoints")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPrivateEndpointsRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("pe")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.CommaSeparated)
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.objectstorage.model.PrivateEndpointSummary.class,
                        ListPrivateEndpointsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        ListPrivateEndpointsResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ListPrivateEndpointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPrivateEndpointsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListReplicationPoliciesResponse listReplicationPolicies(
            ListReplicationPoliciesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, ListReplicationPoliciesResponse::builder)
                .logger(LOG, "listReplicationPolicies")
                .serviceDetails(
                        "ObjectStorage",
                        "ListReplicationPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Replication/ListReplicationPolicies")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListReplicationPoliciesRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("replicationPolicies")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.objectstorage.model.ReplicationPolicySummary.class,
                        ListReplicationPoliciesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListReplicationPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        ListReplicationPoliciesResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListReplicationPoliciesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListReplicationSourcesResponse listReplicationSources(
            ListReplicationSourcesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, ListReplicationSourcesResponse::builder)
                .logger(LOG, "listReplicationSources")
                .serviceDetails(
                        "ObjectStorage",
                        "ListReplicationSources",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Replication/ListReplicationSources")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListReplicationSourcesRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("replicationSources")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.objectstorage.model.ReplicationSource.class,
                        ListReplicationSourcesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListReplicationSourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        ListReplicationSourcesResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListReplicationSourcesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListRetentionRulesResponse listRetentionRules(ListRetentionRulesRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, ListRetentionRulesResponse::builder)
                .logger(LOG, "listRetentionRules")
                .serviceDetails(
                        "ObjectStorage",
                        "ListRetentionRules",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/RetentionRule/ListRetentionRules")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRetentionRulesRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("retentionRules")
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.objectstorage.model.RetentionRuleCollection.class,
                        ListRetentionRulesResponse.Builder::retentionRuleCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRetentionRulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        ListRetentionRulesResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRetentionRulesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("workRequestId", request.getWorkRequestId());

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "ObjectStorage",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/WorkRequestError/ListWorkRequestErrors")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.objectstorage.model.WorkRequestError.class,
                        ListWorkRequestErrorsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        ListWorkRequestErrorsResponse.Builder::opcClientRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("workRequestId", request.getWorkRequestId());

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "ObjectStorage",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/WorkRequestLogEntry/ListWorkRequestLogs")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.objectstorage.model.WorkRequestLogEntry.class,
                        ListWorkRequestLogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        ListWorkRequestLogsResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("compartmentId", request.getCompartmentId());

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "ObjectStorage",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/WorkRequest/ListWorkRequests")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("privateEndpointName", request.getPrivateEndpointName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.objectstorage.model.WorkRequestSummary.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        ListWorkRequestsResponse.Builder::opcClientRequestId)
                .callSync();
    }

    @Override
    public MakeBucketWritableResponse makeBucketWritable(MakeBucketWritableRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, MakeBucketWritableResponse::builder)
                .logger(LOG, "makeBucketWritable")
                .serviceDetails(
                        "ObjectStorage",
                        "MakeBucketWritable",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Replication/MakeBucketWritable")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(MakeBucketWritableRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("actions")
                .appendPathParam("makeBucketWritable")
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        MakeBucketWritableResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", MakeBucketWritableResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public PutObjectResponse putObject(PutObjectRequest request) {
        request =
                com.oracle.bmc.objectstorage.internal.http.ObjectMetadataInterceptor.intercept(
                        request);

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getObjectName(), "objectName must not be blank");
        Objects.requireNonNull(request.getPutObjectBody(), "putObjectBody is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("objectName", request.getObjectName());

        return clientCall(request, PutObjectResponse::builder)
                .logger(LOG, "putObject")
                .serviceDetails(
                        "ObjectStorage",
                        "PutObject",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Object/PutObject")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutObjectRequest::builder)
                .obmcsSigningStrategy(com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("o")
                .appendPathParam(request.getObjectName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .appendHeader("Expect", request.getExpect())
                .appendHeader("Content-Length", request.getContentLength())
                .appendHeader("Content-MD5", request.getContentMD5())
                .appendEnumHeader("opc-checksum-algorithm", request.getOpcChecksumAlgorithm())
                .appendHeader("opc-content-crc32c", request.getOpcContentCrc32c())
                .appendHeader("opc-content-sha256", request.getOpcContentSha256())
                .appendHeader("opc-content-sha384", request.getOpcContentSha384())
                .appendHeader("Content-Type", request.getContentType())
                .appendHeader("Content-Language", request.getContentLanguage())
                .appendHeader("Content-Encoding", request.getContentEncoding())
                .appendHeader("Content-Disposition", request.getContentDisposition())
                .appendHeader("Cache-Control", request.getCacheControl())
                .appendHeader("opc-sse-customer-algorithm", request.getOpcSseCustomerAlgorithm())
                .appendHeader("opc-sse-customer-key", request.getOpcSseCustomerKey())
                .appendHeader("opc-sse-customer-key-sha256", request.getOpcSseCustomerKeySha256())
                .appendHeader("opc-sse-kms-key-id", request.getOpcSseKmsKeyId())
                .appendEnumHeader("storage-tier", request.getStorageTier())
                .appendHeaders(request.getOpcMeta())
                .operationUsesDefaultRetries()
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-client-request-id", PutObjectResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PutObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-content-md5", PutObjectResponse.Builder::opcContentMd5)
                .handleResponseHeaderString(
                        "opc-content-crc32c", PutObjectResponse.Builder::opcContentCrc32c)
                .handleResponseHeaderString(
                        "opc-content-sha256", PutObjectResponse.Builder::opcContentSha256)
                .handleResponseHeaderString(
                        "opc-content-sha384", PutObjectResponse.Builder::opcContentSha384)
                .handleResponseHeaderString("ETag", PutObjectResponse.Builder::eTag)
                .handleResponseHeaderDate("last-modified", PutObjectResponse.Builder::lastModified)
                .handleResponseHeaderString("version-id", PutObjectResponse.Builder::versionId)
                .callSync();
    }

    @Override
    public PutObjectLifecyclePolicyResponse putObjectLifecyclePolicy(
            PutObjectLifecyclePolicyRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");
        Objects.requireNonNull(
                request.getPutObjectLifecyclePolicyDetails(),
                "putObjectLifecyclePolicyDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, PutObjectLifecyclePolicyResponse::builder)
                .logger(LOG, "putObjectLifecyclePolicy")
                .serviceDetails(
                        "ObjectStorage",
                        "PutObjectLifecyclePolicy",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/ObjectLifecyclePolicy/PutObjectLifecyclePolicy")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutObjectLifecyclePolicyRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("l")
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.objectstorage.model.ObjectLifecyclePolicy.class,
                        PutObjectLifecyclePolicyResponse.Builder::objectLifecyclePolicy)
                .handleResponseHeaderString(
                        "opc-request-id", PutObjectLifecyclePolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        PutObjectLifecyclePolicyResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString("ETag", PutObjectLifecyclePolicyResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public ReencryptBucketResponse reencryptBucket(ReencryptBucketRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, ReencryptBucketResponse::builder)
                .logger(LOG, "reencryptBucket")
                .serviceDetails(
                        "ObjectStorage",
                        "ReencryptBucket",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Bucket/ReencryptBucket")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ReencryptBucketRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("actions")
                .appendPathParam("reencrypt")
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", ReencryptBucketResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        ReencryptBucketResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ReencryptBucketResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ReencryptObjectResponse reencryptObject(ReencryptObjectRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getObjectName(), "objectName must not be blank");
        Objects.requireNonNull(
                request.getReencryptObjectDetails(), "reencryptObjectDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("objectName", request.getObjectName());

        return clientCall(request, ReencryptObjectResponse::builder)
                .logger(LOG, "reencryptObject")
                .serviceDetails(
                        "ObjectStorage",
                        "ReencryptObject",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Object/ReencryptObject")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ReencryptObjectRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("actions")
                .appendPathParam("reencrypt")
                .appendPathParam(request.getObjectName())
                .appendQueryParam("versionId", request.getVersionId())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        ReencryptObjectResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ReencryptObjectResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RenameObjectResponse renameObject(RenameObjectRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");
        Objects.requireNonNull(request.getRenameObjectDetails(), "renameObjectDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, RenameObjectResponse::builder)
                .logger(LOG, "renameObject")
                .serviceDetails(
                        "ObjectStorage",
                        "RenameObject",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Object/RenameObject")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RenameObjectRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("actions")
                .appendPathParam("renameObject")
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-client-request-id", RenameObjectResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RenameObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", RenameObjectResponse.Builder::eTag)
                .handleResponseHeaderDate(
                        "last-modified", RenameObjectResponse.Builder::lastModified)
                .handleResponseHeaderString("version-id", RenameObjectResponse.Builder::versionId)
                .callSync();
    }

    @Override
    public RestoreObjectsResponse restoreObjects(RestoreObjectsRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");
        Objects.requireNonNull(
                request.getRestoreObjectsDetails(), "restoreObjectsDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, RestoreObjectsResponse::builder)
                .logger(LOG, "restoreObjects")
                .serviceDetails(
                        "ObjectStorage",
                        "RestoreObjects",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Object/RestoreObjects")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestoreObjectsRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("actions")
                .appendPathParam("restoreObjects")
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-client-request-id", RestoreObjectsResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RestoreObjectsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateBucketResponse updateBucket(UpdateBucketRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");
        Objects.requireNonNull(request.getUpdateBucketDetails(), "updateBucketDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, UpdateBucketResponse::builder)
                .logger(LOG, "updateBucket")
                .serviceDetails(
                        "ObjectStorage",
                        "UpdateBucket",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Bucket/UpdateBucket")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpdateBucketRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.objectstorage.model.Bucket.class,
                        UpdateBucketResponse.Builder::bucket)
                .handleResponseHeaderString(
                        "opc-client-request-id", UpdateBucketResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBucketResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", UpdateBucketResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public UpdateNamespaceMetadataResponse updateNamespaceMetadata(
            UpdateNamespaceMetadataRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getUpdateNamespaceMetadataDetails(),
                "updateNamespaceMetadataDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());

        return clientCall(request, UpdateNamespaceMetadataResponse::builder)
                .logger(LOG, "updateNamespaceMetadata")
                .serviceDetails(
                        "ObjectStorage",
                        "UpdateNamespaceMetadata",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Namespace/UpdateNamespaceMetadata")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateNamespaceMetadataRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.objectstorage.model.NamespaceMetadata.class,
                        UpdateNamespaceMetadataResponse.Builder::namespaceMetadata)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        UpdateNamespaceMetadataResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateNamespaceMetadataResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateObjectStorageTierResponse updateObjectStorageTier(
            UpdateObjectStorageTierRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");
        Objects.requireNonNull(
                request.getUpdateObjectStorageTierDetails(),
                "updateObjectStorageTierDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());

        return clientCall(request, UpdateObjectStorageTierResponse::builder)
                .logger(LOG, "updateObjectStorageTier")
                .serviceDetails(
                        "ObjectStorage",
                        "UpdateObjectStorageTier",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Object/UpdateObjectStorageTier")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpdateObjectStorageTierRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("actions")
                .appendPathParam("updateObjectStorageTier")
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        UpdateObjectStorageTierResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateObjectStorageTierResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdatePrivateEndpointResponse updatePrivateEndpoint(
            UpdatePrivateEndpointRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getPeName(), "peName must not be blank");
        Objects.requireNonNull(
                request.getUpdatePrivateEndpointDetails(),
                "updatePrivateEndpointDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("peName", request.getPeName());

        return clientCall(request, UpdatePrivateEndpointResponse::builder)
                .logger(LOG, "updatePrivateEndpoint")
                .serviceDetails(
                        "ObjectStorage",
                        "UpdatePrivateEndpoint",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/PrivateEndpoint/UpdatePrivateEndpoint")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpdatePrivateEndpointRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("pe")
                .appendPathParam(request.getPeName())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdatePrivateEndpointResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        UpdatePrivateEndpointResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePrivateEndpointResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateRetentionRuleResponse updateRetentionRule(UpdateRetentionRuleRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getRetentionRuleId(), "retentionRuleId must not be blank");
        Objects.requireNonNull(
                request.getUpdateRetentionRuleDetails(), "updateRetentionRuleDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("retentionRuleId", request.getRetentionRuleId());

        return clientCall(request, UpdateRetentionRuleResponse::builder)
                .logger(LOG, "updateRetentionRule")
                .serviceDetails(
                        "ObjectStorage",
                        "UpdateRetentionRule",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/RetentionRule/UpdateRetentionRule")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRetentionRuleRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("retentionRules")
                .appendPathParam(request.getRetentionRuleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.objectstorage.model.RetentionRule.class,
                        UpdateRetentionRuleResponse.Builder::retentionRule)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        UpdateRetentionRuleResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRetentionRuleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateRetentionRuleResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UploadPartResponse uploadPart(UploadPartRequest request) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getObjectName(), "objectName must not be blank");
        Objects.requireNonNull(request.getUploadId(), "uploadId is required");

        Objects.requireNonNull(request.getUploadPartNum(), "uploadPartNum is required");

        Objects.requireNonNull(request.getUploadPartBody(), "uploadPartBody is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("objectName", request.getObjectName());
        requiredParametersMap.put("uploadId", request.getUploadId());
        requiredParametersMap.put("uploadPartNum", request.getUploadPartNum());

        return clientCall(request, UploadPartResponse::builder)
                .logger(LOG, "uploadPart")
                .serviceDetails(
                        "ObjectStorage",
                        "UploadPart",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/MultipartUpload/UploadPart")
                .requiredParametersMap(requiredParametersMap)
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UploadPartRequest::builder)
                .obmcsSigningStrategy(com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .appendPathParam(request.getBucketName())
                .appendPathParam("u")
                .appendPathParam(request.getObjectName())
                .appendQueryParam("uploadId", request.getUploadId())
                .appendQueryParam("uploadPartNum", request.getUploadPartNum())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .appendHeader("Expect", request.getExpect())
                .appendHeader("Content-Length", request.getContentLength())
                .appendHeader("Content-MD5", request.getContentMD5())
                .appendEnumHeader("opc-checksum-algorithm", request.getOpcChecksumAlgorithm())
                .appendHeader("opc-content-crc32c", request.getOpcContentCrc32c())
                .appendHeader("opc-content-sha256", request.getOpcContentSha256())
                .appendHeader("opc-content-sha384", request.getOpcContentSha384())
                .appendHeader("opc-sse-customer-algorithm", request.getOpcSseCustomerAlgorithm())
                .appendHeader("opc-sse-customer-key", request.getOpcSseCustomerKey())
                .appendHeader("opc-sse-customer-key-sha256", request.getOpcSseCustomerKeySha256())
                .appendHeader("opc-sse-kms-key-id", request.getOpcSseKmsKeyId())
                .operationUsesDefaultRetries()
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-client-request-id", UploadPartResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UploadPartResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-content-md5", UploadPartResponse.Builder::opcContentMd5)
                .handleResponseHeaderString(
                        "opc-content-crc32c", UploadPartResponse.Builder::opcContentCrc32c)
                .handleResponseHeaderString(
                        "opc-content-sha256", UploadPartResponse.Builder::opcContentSha256)
                .handleResponseHeaderString(
                        "opc-content-sha384", UploadPartResponse.Builder::opcContentSha384)
                .handleResponseHeaderString("ETag", UploadPartResponse.Builder::eTag)
                .callSync();
    }

    @Override
    public ObjectStorageWaiters getWaiters() {
        return waiters;
    }

    @Override
    public ObjectStoragePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ObjectStorageClient(
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
    public ObjectStorageClient(
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
    public ObjectStorageClient(
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
    public ObjectStorageClient(
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
    public ObjectStorageClient(
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
    public ObjectStorageClient(
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
    public ObjectStorageClient(
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
    public ObjectStorageClient(
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
