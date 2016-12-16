/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage;

import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.internal.*;

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
     * @param authenticationProvider The authentication details provider, required.
     */
    public ObjectStorageClient(AuthenticationDetailsProvider authenticationProvider) {
        this.client = newClientBuilder().build().create(SERVICE, authenticationProvider);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public ObjectStorageClient(
            AuthenticationDetailsProvider authenticationProvider,
            ClientConfiguration configuration) {
        this.client =
                newClientBuilder().build().create(SERVICE, authenticationProvider, configuration);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * @param authenticationProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     */
    public ObjectStorageClient(
            AuthenticationDetailsProvider authenticationProvider,
            ClientConfiguration configuration,
            ClientConfigurator clientConfigurator) {
        this.client =
                newClientBuilder()
                        .clientConfigurator(clientConfigurator)
                        .build()
                        .create(SERVICE, authenticationProvider, configuration);
    }

    private static RestClientFactoryBuilder newClientBuilder() {
        RestClientFactoryBuilder builder = RestClientFactoryBuilder.builder();

        return builder;
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
    public CreateBucketResponse createBucket(CreateBucketRequest request) {
        LOG.trace("Called createBucket");
        Invocation.Builder ib = CreateBucketConverter.fromRequest(client, request);
        Function<Response, CreateBucketResponse> transformer = CreateBucketConverter.fromResponse();

        Response response = client.post(ib, request.getCreateBucketDetails(), request);
        return transformer.apply(response);
    }

    @Override
    public DeleteBucketResponse deleteBucket(DeleteBucketRequest request) {
        LOG.trace("Called deleteBucket");
        Invocation.Builder ib = DeleteBucketConverter.fromRequest(client, request);
        Function<Response, DeleteBucketResponse> transformer = DeleteBucketConverter.fromResponse();

        Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public DeleteObjectResponse deleteObject(DeleteObjectRequest request) {
        LOG.trace("Called deleteObject");
        Invocation.Builder ib = DeleteObjectConverter.fromRequest(client, request);
        Function<Response, DeleteObjectResponse> transformer = DeleteObjectConverter.fromResponse();

        Response response = client.delete(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetBucketResponse getBucket(GetBucketRequest request) {
        LOG.trace("Called getBucket");
        Invocation.Builder ib = GetBucketConverter.fromRequest(client, request);
        Function<Response, GetBucketResponse> transformer = GetBucketConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetNamespaceResponse getNamespace(GetNamespaceRequest request) {
        LOG.trace("Called getNamespace");
        Invocation.Builder ib = GetNamespaceConverter.fromRequest(client, request);
        Function<Response, GetNamespaceResponse> transformer = GetNamespaceConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public GetObjectResponse getObject(GetObjectRequest request) {
        LOG.trace("Called getObject");
        Invocation.Builder ib = GetObjectConverter.fromRequest(client, request);
        Function<Response, GetObjectResponse> transformer = GetObjectConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public HeadBucketResponse headBucket(HeadBucketRequest request) {
        LOG.trace("Called headBucket");
        Invocation.Builder ib = HeadBucketConverter.fromRequest(client, request);
        Function<Response, HeadBucketResponse> transformer = HeadBucketConverter.fromResponse();

        Response response = client.head(ib, request);
        return transformer.apply(response);
    }

    @Override
    public HeadObjectResponse headObject(HeadObjectRequest request) {
        LOG.trace("Called headObject");
        Invocation.Builder ib = HeadObjectConverter.fromRequest(client, request);
        Function<Response, HeadObjectResponse> transformer = HeadObjectConverter.fromResponse();

        Response response = client.head(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListBucketsResponse listBuckets(ListBucketsRequest request) {
        LOG.trace("Called listBuckets");
        Invocation.Builder ib = ListBucketsConverter.fromRequest(client, request);
        Function<Response, ListBucketsResponse> transformer = ListBucketsConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public ListObjectsResponse listObjects(ListObjectsRequest request) {
        LOG.trace("Called listObjects");
        Invocation.Builder ib = ListObjectsConverter.fromRequest(client, request);
        Function<Response, ListObjectsResponse> transformer = ListObjectsConverter.fromResponse();

        Response response = client.get(ib, request);
        return transformer.apply(response);
    }

    @Override
    public PutObjectResponse putObject(PutObjectRequest request) {
        LOG.trace("Called putObject");
        Invocation.Builder ib = PutObjectConverter.fromRequest(client, request);
        Function<Response, PutObjectResponse> transformer = PutObjectConverter.fromResponse();

        Response response = client.put(ib, request.getPutObjectBody(), request);
        return transformer.apply(response);
    }

    @Override
    public UpdateBucketResponse updateBucket(UpdateBucketRequest request) {
        LOG.trace("Called updateBucket");
        Invocation.Builder ib = UpdateBucketConverter.fromRequest(client, request);
        Function<Response, UpdateBucketResponse> transformer = UpdateBucketConverter.fromResponse();

        Response response = client.post(ib, request.getUpdateBucketDetails(), request);
        return transformer.apply(response);
    }
}
