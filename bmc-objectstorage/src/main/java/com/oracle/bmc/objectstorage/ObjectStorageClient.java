/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage;

import java.util.Locale;
import com.oracle.bmc.objectstorage.internal.http.*;
import com.oracle.bmc.objectstorage.requests.*;
import com.oracle.bmc.objectstorage.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.extern.slf4j.Slf4j
public class ObjectStorageClient implements ObjectStorage {
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
    public ObjectStorageClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public ObjectStorageClient(
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
    public ObjectStorageClient(
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
    public ObjectStorageClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory requestSignerFactory) {
        com.oracle.bmc.http.internal.RestClientFactory restClientFactory =
                com.oracle.bmc.http.internal.RestClientFactoryBuilder.builder()
                        .defaultConfigurator(
                                new com.oracle.bmc.http.DefaultConfigurator.NonBuffering())
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
        regionId = regionId.toLowerCase(Locale.ENGLISH);
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
    public AbortMultipartUploadResponse abortMultipartUpload(AbortMultipartUploadRequest request) {
        LOG.trace("Called abortMultipartUpload");
        request = AbortMultipartUploadConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                AbortMultipartUploadConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, AbortMultipartUploadResponse>
                transformer = AbortMultipartUploadConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public CommitMultipartUploadResponse commitMultipartUpload(
            CommitMultipartUploadRequest request) {
        LOG.trace("Called commitMultipartUpload");
        request = CommitMultipartUploadConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CommitMultipartUploadConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CommitMultipartUploadResponse>
                transformer = CommitMultipartUploadConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCommitMultipartUploadDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateBucketResponse createBucket(CreateBucketRequest request) {
        LOG.trace("Called createBucket");
        request = CreateBucketConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateBucketConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateBucketResponse>
                transformer = CreateBucketConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateBucketDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateMultipartUploadResponse createMultipartUpload(
            CreateMultipartUploadRequest request) {
        LOG.trace("Called createMultipartUpload");
        request = CreateMultipartUploadConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreateMultipartUploadConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, CreateMultipartUploadResponse>
                transformer = CreateMultipartUploadConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreateMultipartUploadDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreatePreauthenticatedRequestResponse createPreauthenticatedRequest(
            CreatePreauthenticatedRequestRequest request) {
        LOG.trace("Called createPreauthenticatedRequest");
        request = CreatePreauthenticatedRequestConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                CreatePreauthenticatedRequestConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, CreatePreauthenticatedRequestResponse>
                transformer = CreatePreauthenticatedRequestConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getCreatePreauthenticatedRequestDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public DeleteBucketResponse deleteBucket(DeleteBucketRequest request) {
        LOG.trace("Called deleteBucket");
        request = DeleteBucketConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteBucketConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteBucketResponse>
                transformer = DeleteBucketConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteObjectResponse deleteObject(DeleteObjectRequest request) {
        LOG.trace("Called deleteObject");
        request = DeleteObjectConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeleteObjectConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, DeleteObjectResponse>
                transformer = DeleteObjectConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeletePreauthenticatedRequestResponse deletePreauthenticatedRequest(
            DeletePreauthenticatedRequestRequest request) {
        LOG.trace("Called deletePreauthenticatedRequest");
        request = DeletePreauthenticatedRequestConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                DeletePreauthenticatedRequestConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, DeletePreauthenticatedRequestResponse>
                transformer = DeletePreauthenticatedRequestConverter.fromResponse();

        javax.ws.rs.core.Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetBucketResponse getBucket(GetBucketRequest request) {
        LOG.trace("Called getBucket");
        request = GetBucketConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetBucketConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetBucketResponse> transformer =
                GetBucketConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetNamespaceResponse getNamespace(GetNamespaceRequest request) {
        LOG.trace("Called getNamespace");
        request = GetNamespaceConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNamespaceConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetNamespaceResponse>
                transformer = GetNamespaceConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetNamespaceMetadataResponse getNamespaceMetadata(GetNamespaceMetadataRequest request) {
        LOG.trace("Called getNamespaceMetadata");
        request = GetNamespaceMetadataConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetNamespaceMetadataConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetNamespaceMetadataResponse>
                transformer = GetNamespaceMetadataConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetObjectResponse getObject(GetObjectRequest request) {
        LOG.trace("Called getObject");
        request = GetObjectConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetObjectConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, GetObjectResponse> transformer =
                GetObjectConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetPreauthenticatedRequestResponse getPreauthenticatedRequest(
            GetPreauthenticatedRequestRequest request) {
        LOG.trace("Called getPreauthenticatedRequest");
        request = GetPreauthenticatedRequestConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                GetPreauthenticatedRequestConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, GetPreauthenticatedRequestResponse>
                transformer = GetPreauthenticatedRequestConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public HeadBucketResponse headBucket(HeadBucketRequest request) {
        LOG.trace("Called headBucket");
        request = HeadBucketConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                HeadBucketConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, HeadBucketResponse> transformer =
                HeadBucketConverter.fromResponse();

        javax.ws.rs.core.Response response = client.head(ib, request);
        return transformer.apply(response);
    }

    @Override
    public HeadObjectResponse headObject(HeadObjectRequest request) {
        LOG.trace("Called headObject");
        request = HeadObjectConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                HeadObjectConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, HeadObjectResponse> transformer =
                HeadObjectConverter.fromResponse();

        javax.ws.rs.core.Response response = client.head(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListBucketsResponse listBuckets(ListBucketsRequest request) {
        LOG.trace("Called listBuckets");
        request = ListBucketsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListBucketsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListBucketsResponse>
                transformer = ListBucketsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListMultipartUploadPartsResponse listMultipartUploadParts(
            ListMultipartUploadPartsRequest request) {
        LOG.trace("Called listMultipartUploadParts");
        request = ListMultipartUploadPartsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMultipartUploadPartsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListMultipartUploadPartsResponse>
                transformer = ListMultipartUploadPartsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListMultipartUploadsResponse listMultipartUploads(ListMultipartUploadsRequest request) {
        LOG.trace("Called listMultipartUploads");
        request = ListMultipartUploadsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListMultipartUploadsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListMultipartUploadsResponse>
                transformer = ListMultipartUploadsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListObjectsResponse listObjects(ListObjectsRequest request) {
        LOG.trace("Called listObjects");
        request = ListObjectsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListObjectsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, ListObjectsResponse>
                transformer = ListObjectsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListPreauthenticatedRequestsResponse listPreauthenticatedRequests(
            ListPreauthenticatedRequestsRequest request) {
        LOG.trace("Called listPreauthenticatedRequests");
        request = ListPreauthenticatedRequestsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                ListPreauthenticatedRequestsConverter.fromRequest(client, request);
        com.google.common.base.Function<
                        javax.ws.rs.core.Response, ListPreauthenticatedRequestsResponse>
                transformer = ListPreauthenticatedRequestsConverter.fromResponse();

        javax.ws.rs.core.Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public PutObjectResponse putObject(PutObjectRequest request) {
        LOG.trace("Called putObject");
        request = PutObjectConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                PutObjectConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, PutObjectResponse> transformer =
                PutObjectConverter.fromResponse();

        javax.ws.rs.core.Response response = client.put(ib, request.getPutObjectBody(), request);
        return transformer.apply(response);
    }

    @Override
    public RenameObjectResponse renameObject(RenameObjectRequest request) {
        LOG.trace("Called renameObject");
        request = RenameObjectConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RenameObjectConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, RenameObjectResponse>
                transformer = RenameObjectConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getRenameObjectDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public RestoreObjectsResponse restoreObjects(RestoreObjectsRequest request) {
        LOG.trace("Called restoreObjects");
        request = RestoreObjectsConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                RestoreObjectsConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, RestoreObjectsResponse>
                transformer = RestoreObjectsConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getRestoreObjectsDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateBucketResponse updateBucket(UpdateBucketRequest request) {
        LOG.trace("Called updateBucket");
        request = UpdateBucketConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateBucketConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateBucketResponse>
                transformer = UpdateBucketConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.post(ib, request.getUpdateBucketDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateNamespaceMetadataResponse updateNamespaceMetadata(
            UpdateNamespaceMetadataRequest request) {
        LOG.trace("Called updateNamespaceMetadata");
        request = UpdateNamespaceMetadataConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UpdateNamespaceMetadataConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UpdateNamespaceMetadataResponse>
                transformer = UpdateNamespaceMetadataConverter.fromResponse();

        javax.ws.rs.core.Response response =
                client.put(ib, request.getUpdateNamespaceMetadataDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UploadPartResponse uploadPart(UploadPartRequest request) {
        LOG.trace("Called uploadPart");
        request = UploadPartConverter.interceptRequest(request);
        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib =
                UploadPartConverter.fromRequest(client, request);
        com.google.common.base.Function<javax.ws.rs.core.Response, UploadPartResponse> transformer =
                UploadPartConverter.fromResponse();

        javax.ws.rs.core.Response response = client.put(ib, request.getUploadPartBody(), request);
        return transformer.apply(response);
    }
}
