/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.objectstorage.requests.*;
import com.oracle.bmc.objectstorage.responses.*;

import java.util.Objects;

/**
 * Async client implementation for ObjectStorage service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ObjectStorageAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ObjectStorageAsync {
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
            org.slf4j.LoggerFactory.getLogger(ObjectStorageAsyncClient.class);

    ObjectStorageAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    ObjectStorageAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "ObjectStorageAsyncClient", "getObject"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ObjectStorageAsyncClient> {
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "objectstorage";
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
        public ObjectStorageAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ObjectStorageAsyncClient(
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
    public java.util.concurrent.Future<AbortMultipartUploadResponse> abortMultipartUpload(
            AbortMultipartUploadRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            AbortMultipartUploadRequest, AbortMultipartUploadResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getObjectName(), "objectName must not be blank");
        Objects.requireNonNull(request.getUploadId(), "uploadId is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("objectName", request.getObjectName());
        requiredParametersMap.put("uploadId", request.getUploadId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, AbortMultipartUploadResponse::builder)
                .logger(LOG, "abortMultipartUpload")
                .serviceDetails(
                        "ObjectStorage",
                        "AbortMultipartUpload",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/MultipartUpload/AbortMultipartUpload")
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
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        AbortMultipartUploadResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", AbortMultipartUploadResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("workRequestId", request.getWorkRequestId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, CancelWorkRequestResponse::builder)
                .logger(LOG, "cancelWorkRequest")
                .serviceDetails(
                        "ObjectStorage",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        CancelWorkRequestResponse.Builder::opcClientRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CommitMultipartUploadResponse> commitMultipartUpload(
            CommitMultipartUploadRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CommitMultipartUploadRequest, CommitMultipartUploadResponse>
                    handler) {

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
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, CommitMultipartUploadResponse::builder)
                .logger(LOG, "commitMultipartUpload")
                .serviceDetails(
                        "ObjectStorage",
                        "CommitMultipartUpload",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/MultipartUpload/CommitMultipartUpload")
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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        CommitMultipartUploadResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CommitMultipartUploadResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-multipart-md5", CommitMultipartUploadResponse.Builder::opcMultipartMd5)
                .handleResponseHeaderString("ETag", CommitMultipartUploadResponse.Builder::eTag)
                .handleResponseHeaderDate(
                        "last-modified", CommitMultipartUploadResponse.Builder::lastModified)
                .handleResponseHeaderString(
                        "version-id", CommitMultipartUploadResponse.Builder::versionId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CopyObjectResponse> copyObject(
            CopyObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CopyObjectRequest, CopyObjectResponse>
                    handler) {
        request =
                com.oracle.bmc.objectstorage.internal.http.ObjectMetadataInterceptor.intercept(
                        request);

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");
        Objects.requireNonNull(request.getCopyObjectDetails(), "copyObjectDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, CopyObjectResponse::builder)
                .logger(LOG, "copyObject")
                .serviceDetails(
                        "ObjectStorage",
                        "CopyObject",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Object/CopyObject")
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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CopyObjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CopyObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id", CopyObjectResponse.Builder::opcClientRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateBucketResponse> createBucket(
            CreateBucketRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateBucketRequest, CreateBucketResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getCreateBucketDetails(), "createBucketDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, CreateBucketResponse::builder)
                .logger(LOG, "createBucket")
                .serviceDetails(
                        "ObjectStorage",
                        "CreateBucket",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Bucket/CreateBucket")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBucketRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .appendPathParam("b")
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMultipartUploadResponse> createMultipartUpload(
            CreateMultipartUploadRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMultipartUploadRequest, CreateMultipartUploadResponse>
                    handler) {
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
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, CreateMultipartUploadResponse::builder)
                .logger(LOG, "createMultipartUpload")
                .serviceDetails(
                        "ObjectStorage",
                        "CreateMultipartUpload",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/MultipartUpload/CreateMultipartUpload")
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePreauthenticatedRequestResponse>
            createPreauthenticatedRequest(
                    CreatePreauthenticatedRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreatePreauthenticatedRequestRequest,
                                    CreatePreauthenticatedRequestResponse>
                            handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");
        Objects.requireNonNull(
                request.getCreatePreauthenticatedRequestDetails(),
                "createPreauthenticatedRequestDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, CreatePreauthenticatedRequestResponse::builder)
                .logger(LOG, "createPreauthenticatedRequest")
                .serviceDetails(
                        "ObjectStorage",
                        "CreatePreauthenticatedRequest",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/PreauthenticatedRequest/CreatePreauthenticatedRequest")
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationPolicyResponse> createReplicationPolicy(
            CreateReplicationPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateReplicationPolicyRequest, CreateReplicationPolicyResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");
        Objects.requireNonNull(
                request.getCreateReplicationPolicyDetails(),
                "createReplicationPolicyDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, CreateReplicationPolicyResponse::builder)
                .logger(LOG, "createReplicationPolicy")
                .serviceDetails(
                        "ObjectStorage",
                        "CreateReplicationPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Replication/CreateReplicationPolicy")
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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.objectstorage.model.ReplicationPolicy.class,
                        CreateReplicationPolicyResponse.Builder::replicationPolicy)
                .handleResponseHeaderString(
                        "opc-request-id", CreateReplicationPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        CreateReplicationPolicyResponse.Builder::opcClientRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateRetentionRuleResponse> createRetentionRule(
            CreateRetentionRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateRetentionRuleRequest, CreateRetentionRuleResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");
        Objects.requireNonNull(
                request.getCreateRetentionRuleDetails(), "createRetentionRuleDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, CreateRetentionRuleResponse::builder)
                .logger(LOG, "createRetentionRule")
                .serviceDetails(
                        "ObjectStorage",
                        "CreateRetentionRule",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/RetentionRule/CreateRetentionRule")
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteBucketResponse> deleteBucket(
            DeleteBucketRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteBucketRequest, DeleteBucketResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, DeleteBucketResponse::builder)
                .logger(LOG, "deleteBucket")
                .serviceDetails(
                        "ObjectStorage",
                        "DeleteBucket",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Bucket/DeleteBucket")
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
                .handleResponseHeaderString(
                        "opc-client-request-id", DeleteBucketResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBucketResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteObjectResponse> deleteObject(
            DeleteObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteObjectRequest, DeleteObjectResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getObjectName(), "objectName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("objectName", request.getObjectName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, DeleteObjectResponse::builder)
                .logger(LOG, "deleteObject")
                .serviceDetails(
                        "ObjectStorage",
                        "DeleteObject",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Object/DeleteObject")
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
                .handleResponseHeaderString(
                        "opc-client-request-id", DeleteObjectResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderDate(
                        "last-modified", DeleteObjectResponse.Builder::lastModified)
                .handleResponseHeaderString("version-id", DeleteObjectResponse.Builder::versionId)
                .handleResponseHeaderBoolean(
                        "is-delete-marker", DeleteObjectResponse.Builder::isDeleteMarker)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteObjectLifecyclePolicyResponse>
            deleteObjectLifecyclePolicy(
                    DeleteObjectLifecyclePolicyRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteObjectLifecyclePolicyRequest,
                                    DeleteObjectLifecyclePolicyResponse>
                            handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, DeleteObjectLifecyclePolicyResponse::builder)
                .logger(LOG, "deleteObjectLifecyclePolicy")
                .serviceDetails(
                        "ObjectStorage",
                        "DeleteObjectLifecyclePolicy",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/ObjectLifecyclePolicy/DeleteObjectLifecyclePolicy")
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
                .handleResponseHeaderString(
                        "opc-request-id", DeleteObjectLifecyclePolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        DeleteObjectLifecyclePolicyResponse.Builder::opcClientRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePreauthenticatedRequestResponse>
            deletePreauthenticatedRequest(
                    DeletePreauthenticatedRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeletePreauthenticatedRequestRequest,
                                    DeletePreauthenticatedRequestResponse>
                            handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getParId(), "parId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("parId", request.getParId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, DeletePreauthenticatedRequestResponse::builder)
                .logger(LOG, "deletePreauthenticatedRequest")
                .serviceDetails(
                        "ObjectStorage",
                        "DeletePreauthenticatedRequest",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/PreauthenticatedRequest/DeletePreauthenticatedRequest")
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
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        DeletePreauthenticatedRequestResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeletePreauthenticatedRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationPolicyResponse> deleteReplicationPolicy(
            DeleteReplicationPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteReplicationPolicyRequest, DeleteReplicationPolicyResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getReplicationId(), "replicationId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("replicationId", request.getReplicationId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, DeleteReplicationPolicyResponse::builder)
                .logger(LOG, "deleteReplicationPolicy")
                .serviceDetails(
                        "ObjectStorage",
                        "DeleteReplicationPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Replication/DeleteReplicationPolicy")
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
                .handleResponseHeaderString(
                        "opc-request-id", DeleteReplicationPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        DeleteReplicationPolicyResponse.Builder::opcClientRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteRetentionRuleResponse> deleteRetentionRule(
            DeleteRetentionRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteRetentionRuleRequest, DeleteRetentionRuleResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getRetentionRuleId(), "retentionRuleId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("retentionRuleId", request.getRetentionRuleId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, DeleteRetentionRuleResponse::builder)
                .logger(LOG, "deleteRetentionRule")
                .serviceDetails(
                        "ObjectStorage",
                        "DeleteRetentionRule",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/RetentionRule/DeleteRetentionRule")
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
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        DeleteRetentionRuleResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRetentionRuleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBucketResponse> getBucket(
            GetBucketRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetBucketRequest, GetBucketResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, GetBucketResponse::builder)
                .logger(LOG, "getBucket")
                .serviceDetails(
                        "ObjectStorage",
                        "GetBucket",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Bucket/GetBucket")
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
                .handleBody(
                        com.oracle.bmc.objectstorage.model.Bucket.class,
                        GetBucketResponse.Builder::bucket)
                .handleResponseHeaderString(
                        "opc-client-request-id", GetBucketResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", GetBucketResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", GetBucketResponse.Builder::eTag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetNamespaceResponse> getNamespace(
            GetNamespaceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetNamespaceRequest, GetNamespaceResponse>
                    handler) {

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, GetNamespaceResponse::builder)
                .logger(LOG, "getNamespace")
                .serviceDetails(
                        "ObjectStorage",
                        "GetNamespace",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Namespace/GetNamespace")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNamespaceRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .handleBody(String.class, GetNamespaceResponse.Builder::value)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetNamespaceMetadataResponse> getNamespaceMetadata(
            GetNamespaceMetadataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetNamespaceMetadataRequest, GetNamespaceMetadataResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, GetNamespaceMetadataResponse::builder)
                .logger(LOG, "getNamespaceMetadata")
                .serviceDetails(
                        "ObjectStorage",
                        "GetNamespaceMetadata",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Namespace/GetNamespaceMetadata")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetNamespaceMetadataRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .handleBody(
                        com.oracle.bmc.objectstorage.model.NamespaceMetadata.class,
                        GetNamespaceMetadataResponse.Builder::namespaceMetadata)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        GetNamespaceMetadataResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", GetNamespaceMetadataResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetObjectResponse> getObject(
            GetObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetObjectRequest, GetObjectResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getObjectName(), "objectName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("objectName", request.getObjectName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, GetObjectResponse::builder)
                .logger(LOG, "getObject")
                .serviceDetails(
                        "ObjectStorage",
                        "GetObject",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Object/GetObject")
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetObjectLifecyclePolicyResponse> getObjectLifecyclePolicy(
            GetObjectLifecyclePolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetObjectLifecyclePolicyRequest, GetObjectLifecyclePolicyResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, GetObjectLifecyclePolicyResponse::builder)
                .logger(LOG, "getObjectLifecyclePolicy")
                .serviceDetails(
                        "ObjectStorage",
                        "GetObjectLifecyclePolicy",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/ObjectLifecyclePolicy/GetObjectLifecyclePolicy")
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
                .handleBody(
                        com.oracle.bmc.objectstorage.model.ObjectLifecyclePolicy.class,
                        GetObjectLifecyclePolicyResponse.Builder::objectLifecyclePolicy)
                .handleResponseHeaderString(
                        "opc-request-id", GetObjectLifecyclePolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        GetObjectLifecyclePolicyResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString("ETag", GetObjectLifecyclePolicyResponse.Builder::eTag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPreauthenticatedRequestResponse>
            getPreauthenticatedRequest(
                    GetPreauthenticatedRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetPreauthenticatedRequestRequest,
                                    GetPreauthenticatedRequestResponse>
                            handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getParId(), "parId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("parId", request.getParId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, GetPreauthenticatedRequestResponse::builder)
                .logger(LOG, "getPreauthenticatedRequest")
                .serviceDetails(
                        "ObjectStorage",
                        "GetPreauthenticatedRequest",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/PreauthenticatedRequest/GetPreauthenticatedRequest")
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
                .handleBody(
                        com.oracle.bmc.objectstorage.model.PreauthenticatedRequestSummary.class,
                        GetPreauthenticatedRequestResponse.Builder::preauthenticatedRequestSummary)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        GetPreauthenticatedRequestResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", GetPreauthenticatedRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetReplicationPolicyResponse> getReplicationPolicy(
            GetReplicationPolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetReplicationPolicyRequest, GetReplicationPolicyResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getReplicationId(), "replicationId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("replicationId", request.getReplicationId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, GetReplicationPolicyResponse::builder)
                .logger(LOG, "getReplicationPolicy")
                .serviceDetails(
                        "ObjectStorage",
                        "GetReplicationPolicy",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Replication/GetReplicationPolicy")
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
                .handleBody(
                        com.oracle.bmc.objectstorage.model.ReplicationPolicy.class,
                        GetReplicationPolicyResponse.Builder::replicationPolicy)
                .handleResponseHeaderString(
                        "opc-request-id", GetReplicationPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        GetReplicationPolicyResponse.Builder::opcClientRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRetentionRuleResponse> getRetentionRule(
            GetRetentionRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRetentionRuleRequest, GetRetentionRuleResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getRetentionRuleId(), "retentionRuleId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("retentionRuleId", request.getRetentionRuleId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, GetRetentionRuleResponse::builder)
                .logger(LOG, "getRetentionRule")
                .serviceDetails(
                        "ObjectStorage",
                        "GetRetentionRule",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/RetentionRule/GetRetentionRule")
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWorkRequestRequest, GetWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("workRequestId", request.getWorkRequestId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "ObjectStorage",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .handleBody(
                        com.oracle.bmc.objectstorage.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id", GetWorkRequestResponse.Builder::opcClientRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<HeadBucketResponse> headBucket(
            HeadBucketRequest request,
            final com.oracle.bmc.responses.AsyncHandler<HeadBucketRequest, HeadBucketResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, HeadBucketResponse::builder)
                .logger(LOG, "headBucket")
                .serviceDetails(
                        "ObjectStorage",
                        "HeadBucket",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Bucket/HeadBucket")
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
                .handleResponseHeaderString(
                        "opc-client-request-id", HeadBucketResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", HeadBucketResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", HeadBucketResponse.Builder::eTag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<HeadObjectResponse> headObject(
            HeadObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<HeadObjectRequest, HeadObjectResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getObjectName(), "objectName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("objectName", request.getObjectName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, HeadObjectResponse::builder)
                .logger(LOG, "headObject")
                .serviceDetails(
                        "ObjectStorage",
                        "HeadObject",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Object/HeadObject")
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBucketsResponse> listBuckets(
            ListBucketsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListBucketsRequest, ListBucketsResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("compartmentId", request.getCompartmentId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, ListBucketsResponse::builder)
                .logger(LOG, "listBuckets")
                .serviceDetails(
                        "ObjectStorage",
                        "ListBuckets",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Bucket/ListBuckets")
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
                .handleBodyList(
                        com.oracle.bmc.objectstorage.model.BucketSummary.class,
                        ListBucketsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-client-request-id", ListBucketsResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ListBucketsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBucketsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMultipartUploadPartsResponse> listMultipartUploadParts(
            ListMultipartUploadPartsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMultipartUploadPartsRequest, ListMultipartUploadPartsResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getObjectName(), "objectName must not be blank");
        Objects.requireNonNull(request.getUploadId(), "uploadId is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("objectName", request.getObjectName());
        requiredParametersMap.put("uploadId", request.getUploadId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, ListMultipartUploadPartsResponse::builder)
                .logger(LOG, "listMultipartUploadParts")
                .serviceDetails(
                        "ObjectStorage",
                        "ListMultipartUploadParts",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/MultipartUpload/ListMultipartUploadParts")
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMultipartUploadsResponse> listMultipartUploads(
            ListMultipartUploadsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMultipartUploadsRequest, ListMultipartUploadsResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, ListMultipartUploadsResponse::builder)
                .logger(LOG, "listMultipartUploads")
                .serviceDetails(
                        "ObjectStorage",
                        "ListMultipartUploads",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/MultipartUpload/ListMultipartUploads")
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListObjectVersionsResponse> listObjectVersions(
            ListObjectVersionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListObjectVersionsRequest, ListObjectVersionsResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, ListObjectVersionsResponse::builder)
                .logger(LOG, "listObjectVersions")
                .serviceDetails(
                        "ObjectStorage",
                        "ListObjectVersions",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Object/ListObjectVersions")
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListObjectsResponse> listObjects(
            ListObjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListObjectsRequest, ListObjectsResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, ListObjectsResponse::builder)
                .logger(LOG, "listObjects")
                .serviceDetails(
                        "ObjectStorage",
                        "ListObjects",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Object/ListObjects")
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
                .handleBody(
                        com.oracle.bmc.objectstorage.model.ListObjects.class,
                        ListObjectsResponse.Builder::listObjects)
                .handleResponseHeaderString(
                        "opc-client-request-id", ListObjectsResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ListObjectsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPreauthenticatedRequestsResponse>
            listPreauthenticatedRequests(
                    ListPreauthenticatedRequestsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListPreauthenticatedRequestsRequest,
                                    ListPreauthenticatedRequestsResponse>
                            handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, ListPreauthenticatedRequestsResponse::builder)
                .logger(LOG, "listPreauthenticatedRequests")
                .serviceDetails(
                        "ObjectStorage",
                        "ListPreauthenticatedRequests",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/PreauthenticatedRequest/ListPreauthenticatedRequests")
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListReplicationPoliciesResponse> listReplicationPolicies(
            ListReplicationPoliciesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListReplicationPoliciesRequest, ListReplicationPoliciesResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, ListReplicationPoliciesResponse::builder)
                .logger(LOG, "listReplicationPolicies")
                .serviceDetails(
                        "ObjectStorage",
                        "ListReplicationPolicies",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Replication/ListReplicationPolicies")
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListReplicationSourcesResponse> listReplicationSources(
            ListReplicationSourcesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListReplicationSourcesRequest, ListReplicationSourcesResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, ListReplicationSourcesResponse::builder)
                .logger(LOG, "listReplicationSources")
                .serviceDetails(
                        "ObjectStorage",
                        "ListReplicationSources",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Replication/ListReplicationSources")
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRetentionRulesResponse> listRetentionRules(
            ListRetentionRulesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRetentionRulesRequest, ListRetentionRulesResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, ListRetentionRulesResponse::builder)
                .logger(LOG, "listRetentionRules")
                .serviceDetails(
                        "ObjectStorage",
                        "ListRetentionRules",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/RetentionRule/ListRetentionRules")
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("workRequestId", request.getWorkRequestId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "ObjectStorage",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/WorkRequestError/ListWorkRequestErrors")
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("workRequestId", request.getWorkRequestId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "ObjectStorage",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/WorkRequestLogEntry/ListWorkRequestLogs")
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("compartmentId", request.getCompartmentId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "ObjectStorage",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<MakeBucketWritableResponse> makeBucketWritable(
            MakeBucketWritableRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            MakeBucketWritableRequest, MakeBucketWritableResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, MakeBucketWritableResponse::builder)
                .logger(LOG, "makeBucketWritable")
                .serviceDetails(
                        "ObjectStorage",
                        "MakeBucketWritable",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Replication/MakeBucketWritable")
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
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        MakeBucketWritableResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", MakeBucketWritableResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PutObjectResponse> putObject(
            PutObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PutObjectRequest, PutObjectResponse>
                    handler) {
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
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, PutObjectResponse::builder)
                .logger(LOG, "putObject")
                .serviceDetails(
                        "ObjectStorage",
                        "PutObject",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Object/PutObject")
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
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-client-request-id", PutObjectResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PutObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-content-md5", PutObjectResponse.Builder::opcContentMd5)
                .handleResponseHeaderString("ETag", PutObjectResponse.Builder::eTag)
                .handleResponseHeaderDate("last-modified", PutObjectResponse.Builder::lastModified)
                .handleResponseHeaderString("version-id", PutObjectResponse.Builder::versionId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PutObjectLifecyclePolicyResponse> putObjectLifecyclePolicy(
            PutObjectLifecyclePolicyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutObjectLifecyclePolicyRequest, PutObjectLifecyclePolicyResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");
        Objects.requireNonNull(
                request.getPutObjectLifecyclePolicyDetails(),
                "putObjectLifecyclePolicyDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, PutObjectLifecyclePolicyResponse::builder)
                .logger(LOG, "putObjectLifecyclePolicy")
                .serviceDetails(
                        "ObjectStorage",
                        "PutObjectLifecyclePolicy",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/ObjectLifecyclePolicy/PutObjectLifecyclePolicy")
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ReencryptBucketResponse> reencryptBucket(
            ReencryptBucketRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ReencryptBucketRequest, ReencryptBucketResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, ReencryptBucketResponse::builder)
                .logger(LOG, "reencryptBucket")
                .serviceDetails(
                        "ObjectStorage",
                        "ReencryptBucket",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Bucket/ReencryptBucket")
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
                .handleResponseHeaderString(
                        "opc-work-request-id", ReencryptBucketResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        ReencryptBucketResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ReencryptBucketResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ReencryptObjectResponse> reencryptObject(
            ReencryptObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ReencryptObjectRequest, ReencryptObjectResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getObjectName(), "objectName must not be blank");
        Objects.requireNonNull(
                request.getReencryptObjectDetails(), "reencryptObjectDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("objectName", request.getObjectName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, ReencryptObjectResponse::builder)
                .logger(LOG, "reencryptObject")
                .serviceDetails(
                        "ObjectStorage",
                        "ReencryptObject",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Object/ReencryptObject")
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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        ReencryptObjectResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ReencryptObjectResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RenameObjectResponse> renameObject(
            RenameObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<RenameObjectRequest, RenameObjectResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");
        Objects.requireNonNull(request.getRenameObjectDetails(), "renameObjectDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, RenameObjectResponse::builder)
                .logger(LOG, "renameObject")
                .serviceDetails(
                        "ObjectStorage",
                        "RenameObject",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Object/RenameObject")
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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-client-request-id", RenameObjectResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RenameObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", RenameObjectResponse.Builder::eTag)
                .handleResponseHeaderDate(
                        "last-modified", RenameObjectResponse.Builder::lastModified)
                .handleResponseHeaderString("version-id", RenameObjectResponse.Builder::versionId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RestoreObjectsResponse> restoreObjects(
            RestoreObjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RestoreObjectsRequest, RestoreObjectsResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");
        Objects.requireNonNull(
                request.getRestoreObjectsDetails(), "restoreObjectsDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, RestoreObjectsResponse::builder)
                .logger(LOG, "restoreObjects")
                .serviceDetails(
                        "ObjectStorage",
                        "RestoreObjects",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Object/RestoreObjects")
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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-client-request-id", RestoreObjectsResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RestoreObjectsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateBucketResponse> updateBucket(
            UpdateBucketRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateBucketRequest, UpdateBucketResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");
        Objects.requireNonNull(request.getUpdateBucketDetails(), "updateBucketDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, UpdateBucketResponse::builder)
                .logger(LOG, "updateBucket")
                .serviceDetails(
                        "ObjectStorage",
                        "UpdateBucket",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Bucket/UpdateBucket")
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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.objectstorage.model.Bucket.class,
                        UpdateBucketResponse.Builder::bucket)
                .handleResponseHeaderString(
                        "opc-client-request-id", UpdateBucketResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBucketResponse.Builder::opcRequestId)
                .handleResponseHeaderString("ETag", UpdateBucketResponse.Builder::eTag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateNamespaceMetadataResponse> updateNamespaceMetadata(
            UpdateNamespaceMetadataRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateNamespaceMetadataRequest, UpdateNamespaceMetadataResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");
        Objects.requireNonNull(
                request.getUpdateNamespaceMetadataDetails(),
                "updateNamespaceMetadataDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, UpdateNamespaceMetadataResponse::builder)
                .logger(LOG, "updateNamespaceMetadata")
                .serviceDetails(
                        "ObjectStorage",
                        "UpdateNamespaceMetadata",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Namespace/UpdateNamespaceMetadata")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateNamespaceMetadataRequest::builder)
                .basePath("/")
                .appendPathParam("n")
                .appendPathParam(request.getNamespaceName())
                .accept("application/json")
                .appendHeader("opc-client-request-id", request.getOpcClientRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.objectstorage.model.NamespaceMetadata.class,
                        UpdateNamespaceMetadataResponse.Builder::namespaceMetadata)
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        UpdateNamespaceMetadataResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateNamespaceMetadataResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateObjectStorageTierResponse> updateObjectStorageTier(
            UpdateObjectStorageTierRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateObjectStorageTierRequest, UpdateObjectStorageTierResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");
        Objects.requireNonNull(
                request.getUpdateObjectStorageTierDetails(),
                "updateObjectStorageTierDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, UpdateObjectStorageTierResponse::builder)
                .logger(LOG, "updateObjectStorageTier")
                .serviceDetails(
                        "ObjectStorage",
                        "UpdateObjectStorageTier",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/Object/UpdateObjectStorageTier")
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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-client-request-id",
                        UpdateObjectStorageTierResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateObjectStorageTierResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateRetentionRuleResponse> updateRetentionRule(
            UpdateRetentionRuleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateRetentionRuleRequest, UpdateRetentionRuleResponse>
                    handler) {

        Validate.notBlank(request.getNamespaceName(), "namespaceName must not be blank");

        Validate.notBlank(request.getBucketName(), "bucketName must not be blank");

        Validate.notBlank(request.getRetentionRuleId(), "retentionRuleId must not be blank");
        Objects.requireNonNull(
                request.getUpdateRetentionRuleDetails(), "updateRetentionRuleDetails is required");

        java.util.Map<String, Object> requiredParametersMap = new java.util.HashMap<>();
        requiredParametersMap.put("namespaceName", request.getNamespaceName());
        requiredParametersMap.put("bucketName", request.getBucketName());
        requiredParametersMap.put("retentionRuleId", request.getRetentionRuleId());
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, UpdateRetentionRuleResponse::builder)
                .logger(LOG, "updateRetentionRule")
                .serviceDetails(
                        "ObjectStorage",
                        "UpdateRetentionRule",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/RetentionRule/UpdateRetentionRule")
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UploadPartResponse> uploadPart(
            UploadPartRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UploadPartRequest, UploadPartResponse>
                    handler) {

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
        this.populateServiceParametersInEndpoint(this.getEndpoint(), requiredParametersMap);

        return clientCall(request, UploadPartResponse::builder)
                .logger(LOG, "uploadPart")
                .serviceDetails(
                        "ObjectStorage",
                        "UploadPart",
                        "https://docs.oracle.com/iaas/api/#/en/objectstorage/20160918/MultipartUpload/UploadPart")
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
                .appendHeader("opc-sse-customer-algorithm", request.getOpcSseCustomerAlgorithm())
                .appendHeader("opc-sse-customer-key", request.getOpcSseCustomerKey())
                .appendHeader("opc-sse-customer-key-sha256", request.getOpcSseCustomerKeySha256())
                .appendHeader("opc-sse-kms-key-id", request.getOpcSseKmsKeyId())
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-client-request-id", UploadPartResponse.Builder::opcClientRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UploadPartResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-content-md5", UploadPartResponse.Builder::opcContentMd5)
                .handleResponseHeaderString("ETag", UploadPartResponse.Builder::eTag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ObjectStorageAsyncClient(
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
    public ObjectStorageAsyncClient(
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
    public ObjectStorageAsyncClient(
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
    public ObjectStorageAsyncClient(
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
    public ObjectStorageAsyncClient(
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
    public ObjectStorageAsyncClient(
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
    public ObjectStorageAsyncClient(
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
