/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage;

import com.oracle.bmc.objectstorage.internal.http.*;
import com.oracle.bmc.objectstorage.requests.*;
import com.oracle.bmc.objectstorage.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class ObjectStorageAsyncClient implements ObjectStorageAsync {
    /**
     * Service instance for ObjectStorage.
     */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.create("OBJECTSTORAGE", "objectstorage");

    @lombok.Getter(value = lombok.AccessLevel.PACKAGE)
    private final com.oracle.bmc.http.internal.RestClient client;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public ObjectStorageAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public ObjectStorageAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(authenticationDetailsProvider, configuration, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     */
    public ObjectStorageAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                        com.oracle.bmc.http.signing.SigningStrategy.OBJECT_STORAGE));
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param requestSignerFactory The request signer factory used to create the request signer for this service.
     */
    public ObjectStorageAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory requestSignerFactory) {
        com.oracle.bmc.http.internal.RestClientFactory restClientFactory =
                com.oracle.bmc.http.internal.RestClientFactoryBuilder.builder()
                        .clientConfigurator(clientConfigurator)
                        .build();
        com.oracle.bmc.http.signing.RequestSigner requestSigner =
                requestSignerFactory.createRequestSigner(SERVICE, authenticationDetailsProvider);
        this.client = restClientFactory.create(requestSigner, configuration);
    }

    @Override
    public void setEndpoint(String endpoint) {
        LOG.info("Setting endpoint to {}", endpoint);
        client.setEndpoint(endpoint);
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        com.google.common.base.Optional<String> endpoint = region.getEndpoint(SERVICE);
        if (endpoint.isPresent()) {
            setEndpoint(endpoint.get());
        } else {
            throw new IllegalArgumentException(
                    "Endpoint for " + SERVICE + " is not known in region " + region);
        }
    }

    @Override
    public void setRegion(String regionId) {
        regionId = regionId.toLowerCase();
        try {
            com.oracle.bmc.Region region = com.oracle.bmc.Region.fromRegionId(regionId);
            setRegion(region);
        } catch (IllegalArgumentException e) {
            LOG.info("Unknown regionId '{}', falling back to default endpoint format", regionId);
            String endpoint = com.oracle.bmc.Region.formatDefaultRegionEndpoint(SERVICE, regionId);
            setEndpoint(endpoint);
        }
    }

    @Override
    public void close() {
        client.close();
    }

    @Override
    public java.util.concurrent.Future<AbortMultipartUploadResponse> abortMultipartUpload(
            AbortMultipartUploadRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AbortMultipartUploadRequest, AbortMultipartUploadResponse>
                    handler) {
        LOG.trace("Called async abortMultipartUpload");
        request = AbortMultipartUploadConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AbortMultipartUploadConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, AbortMultipartUploadResponse>
                transformer = AbortMultipartUploadConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<CommitMultipartUploadResponse> commitMultipartUpload(
            CommitMultipartUploadRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CommitMultipartUploadRequest, CommitMultipartUploadResponse>
                    handler) {
        LOG.trace("Called async commitMultipartUpload");
        request = CommitMultipartUploadConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CommitMultipartUploadConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CommitMultipartUploadResponse>
                transformer = CommitMultipartUploadConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib, request.getCommitMultipartUploadDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<CreateBucketResponse> createBucket(
            CreateBucketRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateBucketRequest, CreateBucketResponse>
                    handler) {
        LOG.trace("Called async createBucket");
        request = CreateBucketConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBucketConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateBucketResponse>
                transformer = CreateBucketConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request.getCreateBucketDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<CreateMultipartUploadResponse> createMultipartUpload(
            CreateMultipartUploadRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateMultipartUploadRequest, CreateMultipartUploadResponse>
                    handler) {
        LOG.trace("Called async createMultipartUpload");
        request = CreateMultipartUploadConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMultipartUploadConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateMultipartUploadResponse>
                transformer = CreateMultipartUploadConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib, request.getCreateMultipartUploadDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<CreatePreauthenticatedRequestResponse>
            createPreauthenticatedRequest(
                    CreatePreauthenticatedRequestRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreatePreauthenticatedRequestRequest,
                                    CreatePreauthenticatedRequestResponse>
                            handler) {
        LOG.trace("Called async createPreauthenticatedRequest");
        request = CreatePreauthenticatedRequestConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePreauthenticatedRequestConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreatePreauthenticatedRequestResponse>
                transformer = CreatePreauthenticatedRequestConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(
                        ib,
                        request.getCreatePreauthenticatedRequestDetails(),
                        request,
                        onSuccess,
                        onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<DeleteBucketResponse> deleteBucket(
            DeleteBucketRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteBucketRequest, DeleteBucketResponse>
                    handler) {
        LOG.trace("Called async deleteBucket");
        request = DeleteBucketConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBucketConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteBucketResponse>
                transformer = DeleteBucketConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<DeleteObjectResponse> deleteObject(
            DeleteObjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteObjectRequest, DeleteObjectResponse>
                    handler) {
        LOG.trace("Called async deleteObject");
        request = DeleteObjectConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteObjectConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteObjectResponse>
                transformer = DeleteObjectConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<DeletePreauthenticatedRequestResponse>
            deletePreauthenticatedRequest(
                    DeletePreauthenticatedRequestRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeletePreauthenticatedRequestRequest,
                                    DeletePreauthenticatedRequestResponse>
                            handler) {
        LOG.trace("Called async deletePreauthenticatedRequest");
        request = DeletePreauthenticatedRequestConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePreauthenticatedRequestConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeletePreauthenticatedRequestResponse>
                transformer = DeletePreauthenticatedRequestConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.delete(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetBucketResponse> getBucket(
            GetBucketRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetBucketRequest, GetBucketResponse> handler) {
        LOG.trace("Called async getBucket");
        request = GetBucketConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBucketConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetBucketResponse> transformer =
                GetBucketConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetNamespaceResponse> getNamespace(
            GetNamespaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetNamespaceRequest, GetNamespaceResponse>
                    handler) {
        LOG.trace("Called async getNamespace");
        request = GetNamespaceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNamespaceConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetNamespaceResponse>
                transformer = GetNamespaceConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetNamespaceMetadataResponse> getNamespaceMetadata(
            GetNamespaceMetadataRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetNamespaceMetadataRequest, GetNamespaceMetadataResponse>
                    handler) {
        LOG.trace("Called async getNamespaceMetadata");
        request = GetNamespaceMetadataConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNamespaceMetadataConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetNamespaceMetadataResponse>
                transformer = GetNamespaceMetadataConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetObjectResponse> getObject(
            GetObjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetObjectRequest, GetObjectResponse> handler) {
        LOG.trace("Called async getObject");
        request = GetObjectConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetObjectConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetObjectResponse> transformer =
                GetObjectConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<GetPreauthenticatedRequestResponse>
            getPreauthenticatedRequest(
                    GetPreauthenticatedRequestRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetPreauthenticatedRequestRequest,
                                    GetPreauthenticatedRequestResponse>
                            handler) {
        LOG.trace("Called async getPreauthenticatedRequest");
        request = GetPreauthenticatedRequestConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPreauthenticatedRequestConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetPreauthenticatedRequestResponse>
                transformer = GetPreauthenticatedRequestConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<HeadBucketResponse> headBucket(
            HeadBucketRequest request,
            com.oracle.bmc.responses.AsyncHandler<HeadBucketRequest, HeadBucketResponse> handler) {
        LOG.trace("Called async headBucket");
        request = HeadBucketConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                HeadBucketConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, HeadBucketResponse> transformer =
                HeadBucketConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.head(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<HeadObjectResponse> headObject(
            HeadObjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<HeadObjectRequest, HeadObjectResponse> handler) {
        LOG.trace("Called async headObject");
        request = HeadObjectConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                HeadObjectConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, HeadObjectResponse> transformer =
                HeadObjectConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.head(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListBucketsResponse> listBuckets(
            ListBucketsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListBucketsRequest, ListBucketsResponse>
                    handler) {
        LOG.trace("Called async listBuckets");
        request = ListBucketsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBucketsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListBucketsResponse>
                transformer = ListBucketsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListMultipartUploadPartsResponse> listMultipartUploadParts(
            ListMultipartUploadPartsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMultipartUploadPartsRequest, ListMultipartUploadPartsResponse>
                    handler) {
        LOG.trace("Called async listMultipartUploadParts");
        request = ListMultipartUploadPartsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMultipartUploadPartsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListMultipartUploadPartsResponse>
                transformer = ListMultipartUploadPartsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListMultipartUploadsResponse> listMultipartUploads(
            ListMultipartUploadsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMultipartUploadsRequest, ListMultipartUploadsResponse>
                    handler) {
        LOG.trace("Called async listMultipartUploads");
        request = ListMultipartUploadsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMultipartUploadsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListMultipartUploadsResponse>
                transformer = ListMultipartUploadsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListObjectsResponse> listObjects(
            ListObjectsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListObjectsRequest, ListObjectsResponse>
                    handler) {
        LOG.trace("Called async listObjects");
        request = ListObjectsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListObjectsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListObjectsResponse>
                transformer = ListObjectsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<ListPreauthenticatedRequestsResponse>
            listPreauthenticatedRequests(
                    ListPreauthenticatedRequestsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListPreauthenticatedRequestsRequest,
                                    ListPreauthenticatedRequestsResponse>
                            handler) {
        LOG.trace("Called async listPreauthenticatedRequests");
        request = ListPreauthenticatedRequestsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPreauthenticatedRequestsConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListPreauthenticatedRequestsResponse>
                transformer = ListPreauthenticatedRequestsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.get(ib, request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<PutObjectResponse> putObject(
            PutObjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<PutObjectRequest, PutObjectResponse> handler) {
        LOG.trace("Called async putObject");
        request = PutObjectConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutObjectConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, PutObjectResponse> transformer =
                PutObjectConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(ib, request.getPutObjectBody(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<RenameObjectResponse> renameObject(
            RenameObjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<RenameObjectRequest, RenameObjectResponse>
                    handler) {
        LOG.trace("Called async renameObject");
        request = RenameObjectConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RenameObjectConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, RenameObjectResponse>
                transformer = RenameObjectConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request.getRenameObjectDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<RestoreObjectsResponse> restoreObjects(
            RestoreObjectsRequest request,
            com.oracle.bmc.responses.AsyncHandler<RestoreObjectsRequest, RestoreObjectsResponse>
                    handler) {
        LOG.trace("Called async restoreObjects");
        request = RestoreObjectsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RestoreObjectsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, RestoreObjectsResponse>
                transformer = RestoreObjectsConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request.getRestoreObjectsDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<UpdateBucketResponse> updateBucket(
            UpdateBucketRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateBucketRequest, UpdateBucketResponse>
                    handler) {
        LOG.trace("Called async updateBucket");
        request = UpdateBucketConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBucketConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateBucketResponse>
                transformer = UpdateBucketConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.post(ib, request.getUpdateBucketDetails(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<UpdateNamespaceMetadataResponse> updateNamespaceMetadata(
            UpdateNamespaceMetadataRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateNamespaceMetadataRequest, UpdateNamespaceMetadataResponse>
                    handler) {
        LOG.trace("Called async updateNamespaceMetadata");
        request = UpdateNamespaceMetadataConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateNamespaceMetadataConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateNamespaceMetadataResponse>
                transformer = UpdateNamespaceMetadataConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(
                        ib,
                        request.getUpdateNamespaceMetadataDetails(),
                        request,
                        onSuccess,
                        onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }

    @Override
    public java.util.concurrent.Future<UploadPartResponse> uploadPart(
            UploadPartRequest request,
            com.oracle.bmc.responses.AsyncHandler<UploadPartRequest, UploadPartResponse> handler) {
        LOG.trace("Called async uploadPart");
        request = UploadPartConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UploadPartConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UploadPartResponse> transformer =
                UploadPartConverter.fromResponse();

        com.oracle.bmc.util.internal.Consumer<javax.ws.rs.core.Response> onSuccess =
                new com.oracle.bmc.http.internal.SuccessConsumer<>(handler, transformer, request);
        com.oracle.bmc.util.internal.Consumer<Throwable> onError =
                new com.oracle.bmc.http.internal.ErrorConsumer<>(handler, request);

        java.util.concurrent.Future<javax.ws.rs.core.Response> responseFuture =
                client.put(ib, request.getUploadPartBody(), request, onSuccess, onError);
        return new com.oracle.bmc.util.internal.TransformingFuture<>(responseFuture, transformer);
    }
}
