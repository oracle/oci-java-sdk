/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage;

import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.auth.*;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.internal.*;
import com.oracle.bmc.http.signing.*;
import com.oracle.bmc.http.signing.internal.*;

import com.google.common.base.Function;
import com.google.common.base.Optional;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

import com.oracle.bmc.objectstorage.internal.http.*;
import com.oracle.bmc.objectstorage.requests.*;
import com.oracle.bmc.objectstorage.responses.*;

import com.oracle.bmc.*;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Slf4j
public class ObjectStorageClient implements ObjectStorage {
    /**
     * Service instance for ObjectStorage.
     */
    public static final Service SERVICE = Services.create("OBJECTSTORAGE", "objectstorage");

    @Getter(value = AccessLevel.PACKAGE)
    private final RestClient client;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public ObjectStorageClient(BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public ObjectStorageClient(
            BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            ClientConfiguration configuration) {
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
            BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            ClientConfiguration configuration,
            ClientConfigurator clientConfigurator) {
        this(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                new DefaultRequestSignerFactory(SigningStrategy.OBJECT_STORAGE));
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
            AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            ClientConfiguration configuration,
            ClientConfigurator clientConfigurator,
            RequestSignerFactory requestSignerFactory) {
        RestClientFactory restClientFactory =
                RestClientFactoryBuilder.builder().clientConfigurator(clientConfigurator).build();
        RequestSigner requestSigner =
                requestSignerFactory.createRequestSigner(SERVICE, authenticationDetailsProvider);
        this.client = restClientFactory.create(requestSigner, configuration);
    }

    @Override
    public void setEndpoint(String endpoint) {
        LOG.info("Setting endpoint to {}", endpoint);
        client.setEndpoint(endpoint);
    }

    @Override
    public void setRegion(Region region) {
        Optional<String> endpoint = region.getEndpoint(SERVICE);
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
            Region region = Region.fromRegionId(regionId);
            setRegion(region);
        } catch (IllegalArgumentException e) {
            LOG.info("Unknown regionId '{}', falling back to default endpoint format", regionId);
            String endpoint = Region.formatDefaultRegionEndpoint(SERVICE, regionId);
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
        Invocation.Builder ib = AbortMultipartUploadConverter.fromRequest(client, request);
        Function<Response, AbortMultipartUploadResponse> transformer =
                AbortMultipartUploadConverter.fromResponse();

        Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public CommitMultipartUploadResponse commitMultipartUpload(
            CommitMultipartUploadRequest request) {
        LOG.trace("Called commitMultipartUpload");
        request = CommitMultipartUploadConverter.interceptRequest(request);
        Invocation.Builder ib = CommitMultipartUploadConverter.fromRequest(client, request);
        Function<Response, CommitMultipartUploadResponse> transformer =
                CommitMultipartUploadConverter.fromResponse();

        Response response = client.post(ib, request.getCommitMultipartUploadDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateBucketResponse createBucket(CreateBucketRequest request) {
        LOG.trace("Called createBucket");
        request = CreateBucketConverter.interceptRequest(request);
        Invocation.Builder ib = CreateBucketConverter.fromRequest(client, request);
        Function<Response, CreateBucketResponse> transformer = CreateBucketConverter.fromResponse();

        Response response = client.post(ib, request.getCreateBucketDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreateMultipartUploadResponse createMultipartUpload(
            CreateMultipartUploadRequest request) {
        LOG.trace("Called createMultipartUpload");
        request = CreateMultipartUploadConverter.interceptRequest(request);
        Invocation.Builder ib = CreateMultipartUploadConverter.fromRequest(client, request);
        Function<Response, CreateMultipartUploadResponse> transformer =
                CreateMultipartUploadConverter.fromResponse();

        Response response = client.post(ib, request.getCreateMultipartUploadDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public CreatePreauthenticatedRequestResponse createPreauthenticatedRequest(
            CreatePreauthenticatedRequestRequest request) {
        LOG.trace("Called createPreauthenticatedRequest");
        request = CreatePreauthenticatedRequestConverter.interceptRequest(request);
        Invocation.Builder ib = CreatePreauthenticatedRequestConverter.fromRequest(client, request);
        Function<Response, CreatePreauthenticatedRequestResponse> transformer =
                CreatePreauthenticatedRequestConverter.fromResponse();

        Response response =
                client.post(ib, request.getCreatePreauthenticatedRequestDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public DeleteBucketResponse deleteBucket(DeleteBucketRequest request) {
        LOG.trace("Called deleteBucket");
        request = DeleteBucketConverter.interceptRequest(request);
        Invocation.Builder ib = DeleteBucketConverter.fromRequest(client, request);
        Function<Response, DeleteBucketResponse> transformer = DeleteBucketConverter.fromResponse();

        Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteObjectResponse deleteObject(DeleteObjectRequest request) {
        LOG.trace("Called deleteObject");
        request = DeleteObjectConverter.interceptRequest(request);
        Invocation.Builder ib = DeleteObjectConverter.fromRequest(client, request);
        Function<Response, DeleteObjectResponse> transformer = DeleteObjectConverter.fromResponse();

        Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeletePreauthenticatedRequestResponse deletePreauthenticatedRequest(
            DeletePreauthenticatedRequestRequest request) {
        LOG.trace("Called deletePreauthenticatedRequest");
        request = DeletePreauthenticatedRequestConverter.interceptRequest(request);
        Invocation.Builder ib = DeletePreauthenticatedRequestConverter.fromRequest(client, request);
        Function<Response, DeletePreauthenticatedRequestResponse> transformer =
                DeletePreauthenticatedRequestConverter.fromResponse();

        Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetBucketResponse getBucket(GetBucketRequest request) {
        LOG.trace("Called getBucket");
        request = GetBucketConverter.interceptRequest(request);
        Invocation.Builder ib = GetBucketConverter.fromRequest(client, request);
        Function<Response, GetBucketResponse> transformer = GetBucketConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetNamespaceResponse getNamespace(GetNamespaceRequest request) {
        LOG.trace("Called getNamespace");
        request = GetNamespaceConverter.interceptRequest(request);
        Invocation.Builder ib = GetNamespaceConverter.fromRequest(client, request);
        Function<Response, GetNamespaceResponse> transformer = GetNamespaceConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetObjectResponse getObject(GetObjectRequest request) {
        LOG.trace("Called getObject");
        request = GetObjectConverter.interceptRequest(request);
        Invocation.Builder ib = GetObjectConverter.fromRequest(client, request);
        Function<Response, GetObjectResponse> transformer = GetObjectConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetPreauthenticatedRequestResponse getPreauthenticatedRequest(
            GetPreauthenticatedRequestRequest request) {
        LOG.trace("Called getPreauthenticatedRequest");
        request = GetPreauthenticatedRequestConverter.interceptRequest(request);
        Invocation.Builder ib = GetPreauthenticatedRequestConverter.fromRequest(client, request);
        Function<Response, GetPreauthenticatedRequestResponse> transformer =
                GetPreauthenticatedRequestConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public HeadBucketResponse headBucket(HeadBucketRequest request) {
        LOG.trace("Called headBucket");
        request = HeadBucketConverter.interceptRequest(request);
        Invocation.Builder ib = HeadBucketConverter.fromRequest(client, request);
        Function<Response, HeadBucketResponse> transformer = HeadBucketConverter.fromResponse();

        Response response = client.head(ib, request);
        return transformer.apply(response);
    }

    @Override
    public HeadObjectResponse headObject(HeadObjectRequest request) {
        LOG.trace("Called headObject");
        request = HeadObjectConverter.interceptRequest(request);
        Invocation.Builder ib = HeadObjectConverter.fromRequest(client, request);
        Function<Response, HeadObjectResponse> transformer = HeadObjectConverter.fromResponse();

        Response response = client.head(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListBucketsResponse listBuckets(ListBucketsRequest request) {
        LOG.trace("Called listBuckets");
        request = ListBucketsConverter.interceptRequest(request);
        Invocation.Builder ib = ListBucketsConverter.fromRequest(client, request);
        Function<Response, ListBucketsResponse> transformer = ListBucketsConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListMultipartUploadPartsResponse listMultipartUploadParts(
            ListMultipartUploadPartsRequest request) {
        LOG.trace("Called listMultipartUploadParts");
        request = ListMultipartUploadPartsConverter.interceptRequest(request);
        Invocation.Builder ib = ListMultipartUploadPartsConverter.fromRequest(client, request);
        Function<Response, ListMultipartUploadPartsResponse> transformer =
                ListMultipartUploadPartsConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListMultipartUploadsResponse listMultipartUploads(ListMultipartUploadsRequest request) {
        LOG.trace("Called listMultipartUploads");
        request = ListMultipartUploadsConverter.interceptRequest(request);
        Invocation.Builder ib = ListMultipartUploadsConverter.fromRequest(client, request);
        Function<Response, ListMultipartUploadsResponse> transformer =
                ListMultipartUploadsConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListObjectsResponse listObjects(ListObjectsRequest request) {
        LOG.trace("Called listObjects");
        request = ListObjectsConverter.interceptRequest(request);
        Invocation.Builder ib = ListObjectsConverter.fromRequest(client, request);
        Function<Response, ListObjectsResponse> transformer = ListObjectsConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListPreauthenticatedRequestsResponse listPreauthenticatedRequests(
            ListPreauthenticatedRequestsRequest request) {
        LOG.trace("Called listPreauthenticatedRequests");
        request = ListPreauthenticatedRequestsConverter.interceptRequest(request);
        Invocation.Builder ib = ListPreauthenticatedRequestsConverter.fromRequest(client, request);
        Function<Response, ListPreauthenticatedRequestsResponse> transformer =
                ListPreauthenticatedRequestsConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public PutObjectResponse putObject(PutObjectRequest request) {
        LOG.trace("Called putObject");
        request = PutObjectConverter.interceptRequest(request);
        Invocation.Builder ib = PutObjectConverter.fromRequest(client, request);
        Function<Response, PutObjectResponse> transformer = PutObjectConverter.fromResponse();

        Response response = client.put(ib, request.getPutObjectBody(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateBucketResponse updateBucket(UpdateBucketRequest request) {
        LOG.trace("Called updateBucket");
        request = UpdateBucketConverter.interceptRequest(request);
        Invocation.Builder ib = UpdateBucketConverter.fromRequest(client, request);
        Function<Response, UpdateBucketResponse> transformer = UpdateBucketConverter.fromResponse();

        Response response = client.post(ib, request.getUpdateBucketDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public UploadPartResponse uploadPart(UploadPartRequest request) {
        LOG.trace("Called uploadPart");
        request = UploadPartConverter.interceptRequest(request);
        Invocation.Builder ib = UploadPartConverter.fromRequest(client, request);
        Function<Response, UploadPartResponse> transformer = UploadPartConverter.fromResponse();

        Response response = client.put(ib, request.getUploadPartBody(), request);
        return transformer.apply(response);
    }
}
