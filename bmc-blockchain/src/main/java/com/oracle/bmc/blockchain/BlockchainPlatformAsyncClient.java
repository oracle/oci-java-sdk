/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.blockchain.requests.*;
import com.oracle.bmc.blockchain.responses.*;

import java.util.Objects;

/**
 * Async client implementation for BlockchainPlatform service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
public class BlockchainPlatformAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements BlockchainPlatformAsync {
    /** Service instance for BlockchainPlatform. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("BLOCKCHAINPLATFORM")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://blockchain.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(BlockchainPlatformAsyncClient.class);

    BlockchainPlatformAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, BlockchainPlatformAsyncClient> {
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
        public BlockchainPlatformAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new BlockchainPlatformAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeBlockchainPlatformCompartmentResponse>
            changeBlockchainPlatformCompartment(
                    ChangeBlockchainPlatformCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeBlockchainPlatformCompartmentRequest,
                                    ChangeBlockchainPlatformCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getBlockchainPlatformId(), "blockchainPlatformId must not be blank");
        Objects.requireNonNull(
                request.getChangeBlockchainPlatformCompartmentDetails(),
                "changeBlockchainPlatformCompartmentDetails is required");

        return clientCall(request, ChangeBlockchainPlatformCompartmentResponse::builder)
                .logger(LOG, "changeBlockchainPlatformCompartment")
                .serviceDetails(
                        "BlockchainPlatform",
                        "ChangeBlockchainPlatformCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/BlockchainPlatform/ChangeBlockchainPlatformCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeBlockchainPlatformCompartmentRequest::builder)
                .basePath("/20191010")
                .appendPathParam("blockchainPlatforms")
                .appendPathParam(request.getBlockchainPlatformId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeBlockchainPlatformCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeBlockchainPlatformCompartmentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateBlockchainPlatformResponse> createBlockchainPlatform(
            CreateBlockchainPlatformRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBlockchainPlatformRequest, CreateBlockchainPlatformResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateBlockchainPlatformDetails(),
                "createBlockchainPlatformDetails is required");

        return clientCall(request, CreateBlockchainPlatformResponse::builder)
                .logger(LOG, "createBlockchainPlatform")
                .serviceDetails(
                        "BlockchainPlatform",
                        "CreateBlockchainPlatform",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/BlockchainPlatform/CreateBlockchainPlatform")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBlockchainPlatformRequest::builder)
                .basePath("/20191010")
                .appendPathParam("blockchainPlatforms")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateBlockchainPlatformResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBlockchainPlatformResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOsnResponse> createOsn(
            CreateOsnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateOsnRequest, CreateOsnResponse>
                    handler) {

        Validate.notBlank(
                request.getBlockchainPlatformId(), "blockchainPlatformId must not be blank");
        Objects.requireNonNull(request.getCreateOsnDetails(), "createOsnDetails is required");

        return clientCall(request, CreateOsnResponse::builder)
                .logger(LOG, "createOsn")
                .serviceDetails(
                        "BlockchainPlatform",
                        "CreateOsn",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/BlockchainPlatform/CreateOsn")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOsnRequest::builder)
                .basePath("/20191010")
                .appendPathParam("blockchainPlatforms")
                .appendPathParam(request.getBlockchainPlatformId())
                .appendPathParam("osns")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", CreateOsnResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateOsnResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePeerResponse> createPeer(
            CreatePeerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreatePeerRequest, CreatePeerResponse>
                    handler) {

        Validate.notBlank(
                request.getBlockchainPlatformId(), "blockchainPlatformId must not be blank");
        Objects.requireNonNull(request.getCreatePeerDetails(), "createPeerDetails is required");

        return clientCall(request, CreatePeerResponse::builder)
                .logger(LOG, "createPeer")
                .serviceDetails(
                        "BlockchainPlatform",
                        "CreatePeer",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/BlockchainPlatform/CreatePeer")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePeerRequest::builder)
                .basePath("/20191010")
                .appendPathParam("blockchainPlatforms")
                .appendPathParam(request.getBlockchainPlatformId())
                .appendPathParam("peers")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", CreatePeerResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreatePeerResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteBlockchainPlatformResponse> deleteBlockchainPlatform(
            DeleteBlockchainPlatformRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBlockchainPlatformRequest, DeleteBlockchainPlatformResponse>
                    handler) {

        Validate.notBlank(
                request.getBlockchainPlatformId(), "blockchainPlatformId must not be blank");

        return clientCall(request, DeleteBlockchainPlatformResponse::builder)
                .logger(LOG, "deleteBlockchainPlatform")
                .serviceDetails(
                        "BlockchainPlatform",
                        "DeleteBlockchainPlatform",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/BlockchainPlatform/DeleteBlockchainPlatform")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBlockchainPlatformRequest::builder)
                .basePath("/20191010")
                .appendPathParam("blockchainPlatforms")
                .appendPathParam(request.getBlockchainPlatformId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteBlockchainPlatformResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBlockchainPlatformResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOsnResponse> deleteOsn(
            DeleteOsnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteOsnRequest, DeleteOsnResponse>
                    handler) {

        Validate.notBlank(
                request.getBlockchainPlatformId(), "blockchainPlatformId must not be blank");

        Validate.notBlank(request.getOsnId(), "osnId must not be blank");

        return clientCall(request, DeleteOsnResponse::builder)
                .logger(LOG, "deleteOsn")
                .serviceDetails(
                        "BlockchainPlatform",
                        "DeleteOsn",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/BlockchainPlatform/DeleteOsn")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOsnRequest::builder)
                .basePath("/20191010")
                .appendPathParam("blockchainPlatforms")
                .appendPathParam(request.getBlockchainPlatformId())
                .appendPathParam("osns")
                .appendPathParam(request.getOsnId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteOsnResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOsnResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePeerResponse> deletePeer(
            DeletePeerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeletePeerRequest, DeletePeerResponse>
                    handler) {

        Validate.notBlank(
                request.getBlockchainPlatformId(), "blockchainPlatformId must not be blank");

        Validate.notBlank(request.getPeerId(), "peerId must not be blank");

        return clientCall(request, DeletePeerResponse::builder)
                .logger(LOG, "deletePeer")
                .serviceDetails(
                        "BlockchainPlatform",
                        "DeletePeer",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/BlockchainPlatform/DeletePeer")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePeerRequest::builder)
                .basePath("/20191010")
                .appendPathParam("blockchainPlatforms")
                .appendPathParam(request.getBlockchainPlatformId())
                .appendPathParam("peers")
                .appendPathParam(request.getPeerId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeletePeerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeletePeerResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkRequestResponse> deleteWorkRequest(
            DeleteWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteWorkRequestRequest, DeleteWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, DeleteWorkRequestResponse::builder)
                .logger(LOG, "deleteWorkRequest")
                .serviceDetails(
                        "BlockchainPlatform",
                        "DeleteWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/WorkRequest/DeleteWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteWorkRequestRequest::builder)
                .basePath("/20191010")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteWorkRequestResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBlockchainPlatformResponse> getBlockchainPlatform(
            GetBlockchainPlatformRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBlockchainPlatformRequest, GetBlockchainPlatformResponse>
                    handler) {

        Validate.notBlank(
                request.getBlockchainPlatformId(), "blockchainPlatformId must not be blank");

        return clientCall(request, GetBlockchainPlatformResponse::builder)
                .logger(LOG, "getBlockchainPlatform")
                .serviceDetails(
                        "BlockchainPlatform",
                        "GetBlockchainPlatform",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/BlockchainPlatform/GetBlockchainPlatform")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBlockchainPlatformRequest::builder)
                .basePath("/20191010")
                .appendPathParam("blockchainPlatforms")
                .appendPathParam(request.getBlockchainPlatformId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.blockchain.model.BlockchainPlatform.class,
                        GetBlockchainPlatformResponse.Builder::blockchainPlatform)
                .handleResponseHeaderString("etag", GetBlockchainPlatformResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBlockchainPlatformResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOsnResponse> getOsn(
            GetOsnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetOsnRequest, GetOsnResponse> handler) {

        Validate.notBlank(
                request.getBlockchainPlatformId(), "blockchainPlatformId must not be blank");

        Validate.notBlank(request.getOsnId(), "osnId must not be blank");

        return clientCall(request, GetOsnResponse::builder)
                .logger(LOG, "getOsn")
                .serviceDetails(
                        "BlockchainPlatform",
                        "GetOsn",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/Osn/GetOsn")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOsnRequest::builder)
                .basePath("/20191010")
                .appendPathParam("blockchainPlatforms")
                .appendPathParam(request.getBlockchainPlatformId())
                .appendPathParam("osns")
                .appendPathParam(request.getOsnId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(com.oracle.bmc.blockchain.model.Osn.class, GetOsnResponse.Builder::osn)
                .handleResponseHeaderString("etag", GetOsnResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetOsnResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPeerResponse> getPeer(
            GetPeerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPeerRequest, GetPeerResponse> handler) {

        Validate.notBlank(
                request.getBlockchainPlatformId(), "blockchainPlatformId must not be blank");

        Validate.notBlank(request.getPeerId(), "peerId must not be blank");

        return clientCall(request, GetPeerResponse::builder)
                .logger(LOG, "getPeer")
                .serviceDetails(
                        "BlockchainPlatform",
                        "GetPeer",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/Peer/GetPeer")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPeerRequest::builder)
                .basePath("/20191010")
                .appendPathParam("blockchainPlatforms")
                .appendPathParam(request.getBlockchainPlatformId())
                .appendPathParam("peers")
                .appendPathParam(request.getPeerId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.blockchain.model.Peer.class, GetPeerResponse.Builder::peer)
                .handleResponseHeaderString("etag", GetPeerResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetPeerResponse.Builder::opcRequestId)
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
                        "BlockchainPlatform",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20191010")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.blockchain.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBlockchainPlatformPatchesResponse>
            listBlockchainPlatformPatches(
                    ListBlockchainPlatformPatchesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListBlockchainPlatformPatchesRequest,
                                    ListBlockchainPlatformPatchesResponse>
                            handler) {

        Validate.notBlank(
                request.getBlockchainPlatformId(), "blockchainPlatformId must not be blank");

        return clientCall(request, ListBlockchainPlatformPatchesResponse::builder)
                .logger(LOG, "listBlockchainPlatformPatches")
                .serviceDetails(
                        "BlockchainPlatform",
                        "ListBlockchainPlatformPatches",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/BlockchainPlatform/ListBlockchainPlatformPatches")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBlockchainPlatformPatchesRequest::builder)
                .basePath("/20191010")
                .appendPathParam("blockchainPlatforms")
                .appendPathParam(request.getBlockchainPlatformId())
                .appendPathParam("patches")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.blockchain.model.BlockchainPlatformPatchCollection.class,
                        ListBlockchainPlatformPatchesResponse.Builder
                                ::blockchainPlatformPatchCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListBlockchainPlatformPatchesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBlockchainPlatformPatchesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBlockchainPlatformsResponse> listBlockchainPlatforms(
            ListBlockchainPlatformsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBlockchainPlatformsRequest, ListBlockchainPlatformsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListBlockchainPlatformsResponse::builder)
                .logger(LOG, "listBlockchainPlatforms")
                .serviceDetails(
                        "BlockchainPlatform",
                        "ListBlockchainPlatforms",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/BlockchainPlatform/ListBlockchainPlatforms")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBlockchainPlatformsRequest::builder)
                .basePath("/20191010")
                .appendPathParam("blockchainPlatforms")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.blockchain.model.BlockchainPlatformCollection.class,
                        ListBlockchainPlatformsResponse.Builder::blockchainPlatformCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBlockchainPlatformsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBlockchainPlatformsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOsnsResponse> listOsns(
            ListOsnsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListOsnsRequest, ListOsnsResponse>
                    handler) {

        Validate.notBlank(
                request.getBlockchainPlatformId(), "blockchainPlatformId must not be blank");

        return clientCall(request, ListOsnsResponse::builder)
                .logger(LOG, "listOsns")
                .serviceDetails(
                        "BlockchainPlatform",
                        "ListOsns",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/Osn/ListOsns")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOsnsRequest::builder)
                .basePath("/20191010")
                .appendPathParam("blockchainPlatforms")
                .appendPathParam(request.getBlockchainPlatformId())
                .appendPathParam("osns")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.blockchain.model.OsnCollection.class,
                        ListOsnsResponse.Builder::osnCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOsnsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListOsnsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPeersResponse> listPeers(
            ListPeersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPeersRequest, ListPeersResponse>
                    handler) {

        Validate.notBlank(
                request.getBlockchainPlatformId(), "blockchainPlatformId must not be blank");

        return clientCall(request, ListPeersResponse::builder)
                .logger(LOG, "listPeers")
                .serviceDetails(
                        "BlockchainPlatform",
                        "ListPeers",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/Peer/ListPeers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPeersRequest::builder)
                .basePath("/20191010")
                .appendPathParam("blockchainPlatforms")
                .appendPathParam(request.getBlockchainPlatformId())
                .appendPathParam("peers")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.blockchain.model.PeerCollection.class,
                        ListPeersResponse.Builder::peerCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPeersResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListPeersResponse.Builder::opcNextPage)
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
                        "BlockchainPlatform",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20191010")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.blockchain.model.WorkRequestErrorCollection.class,
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
                        "BlockchainPlatform",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20191010")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.blockchain.model.WorkRequestLogEntryCollection.class,
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
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getBlockchainPlatformId(), "blockchainPlatformId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "BlockchainPlatform",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20191010")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("blockchainPlatformId", request.getBlockchainPlatformId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.blockchain.model.WorkRequestCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PreviewScaleBlockchainPlatformResponse>
            previewScaleBlockchainPlatform(
                    PreviewScaleBlockchainPlatformRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PreviewScaleBlockchainPlatformRequest,
                                    PreviewScaleBlockchainPlatformResponse>
                            handler) {

        Validate.notBlank(
                request.getBlockchainPlatformId(), "blockchainPlatformId must not be blank");
        Objects.requireNonNull(
                request.getScaleBlockchainPlatformDetails(),
                "scaleBlockchainPlatformDetails is required");

        return clientCall(request, PreviewScaleBlockchainPlatformResponse::builder)
                .logger(LOG, "previewScaleBlockchainPlatform")
                .serviceDetails(
                        "BlockchainPlatform",
                        "PreviewScaleBlockchainPlatform",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/BlockchainPlatform/PreviewScaleBlockchainPlatform")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PreviewScaleBlockchainPlatformRequest::builder)
                .basePath("/20191010")
                .appendPathParam("blockchainPlatforms")
                .appendPathParam(request.getBlockchainPlatformId())
                .appendPathParam("actions")
                .appendPathParam("scale")
                .appendPathParam("preview")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.blockchain.model.ScaledBlockchainPlatformPreview.class,
                        PreviewScaleBlockchainPlatformResponse.Builder
                                ::scaledBlockchainPlatformPreview)
                .handleResponseHeaderString(
                        "etag", PreviewScaleBlockchainPlatformResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        PreviewScaleBlockchainPlatformResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ScaleBlockchainPlatformResponse> scaleBlockchainPlatform(
            ScaleBlockchainPlatformRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ScaleBlockchainPlatformRequest, ScaleBlockchainPlatformResponse>
                    handler) {

        Validate.notBlank(
                request.getBlockchainPlatformId(), "blockchainPlatformId must not be blank");
        Objects.requireNonNull(
                request.getScaleBlockchainPlatformDetails(),
                "scaleBlockchainPlatformDetails is required");

        return clientCall(request, ScaleBlockchainPlatformResponse::builder)
                .logger(LOG, "scaleBlockchainPlatform")
                .serviceDetails(
                        "BlockchainPlatform",
                        "ScaleBlockchainPlatform",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/BlockchainPlatform/ScaleBlockchainPlatform")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScaleBlockchainPlatformRequest::builder)
                .basePath("/20191010")
                .appendPathParam("blockchainPlatforms")
                .appendPathParam(request.getBlockchainPlatformId())
                .appendPathParam("actions")
                .appendPathParam("scale")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ScaleBlockchainPlatformResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ScaleBlockchainPlatformResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartBlockchainPlatformResponse> startBlockchainPlatform(
            StartBlockchainPlatformRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StartBlockchainPlatformRequest, StartBlockchainPlatformResponse>
                    handler) {

        Validate.notBlank(
                request.getBlockchainPlatformId(), "blockchainPlatformId must not be blank");

        return clientCall(request, StartBlockchainPlatformResponse::builder)
                .logger(LOG, "startBlockchainPlatform")
                .serviceDetails(
                        "BlockchainPlatform",
                        "StartBlockchainPlatform",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/BlockchainPlatform/StartBlockchainPlatform")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartBlockchainPlatformRequest::builder)
                .basePath("/20191010")
                .appendPathParam("blockchainPlatforms")
                .appendPathParam(request.getBlockchainPlatformId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StartBlockchainPlatformResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartBlockchainPlatformResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopBlockchainPlatformResponse> stopBlockchainPlatform(
            StopBlockchainPlatformRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            StopBlockchainPlatformRequest, StopBlockchainPlatformResponse>
                    handler) {

        Validate.notBlank(
                request.getBlockchainPlatformId(), "blockchainPlatformId must not be blank");

        return clientCall(request, StopBlockchainPlatformResponse::builder)
                .logger(LOG, "stopBlockchainPlatform")
                .serviceDetails(
                        "BlockchainPlatform",
                        "StopBlockchainPlatform",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/BlockchainPlatform/StopBlockchainPlatform")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopBlockchainPlatformRequest::builder)
                .basePath("/20191010")
                .appendPathParam("blockchainPlatforms")
                .appendPathParam(request.getBlockchainPlatformId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StopBlockchainPlatformResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StopBlockchainPlatformResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateBlockchainPlatformResponse> updateBlockchainPlatform(
            UpdateBlockchainPlatformRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBlockchainPlatformRequest, UpdateBlockchainPlatformResponse>
                    handler) {
        Objects.requireNonNull(
                request.getUpdateBlockchainPlatformDetails(),
                "updateBlockchainPlatformDetails is required");

        Validate.notBlank(
                request.getBlockchainPlatformId(), "blockchainPlatformId must not be blank");

        return clientCall(request, UpdateBlockchainPlatformResponse::builder)
                .logger(LOG, "updateBlockchainPlatform")
                .serviceDetails(
                        "BlockchainPlatform",
                        "UpdateBlockchainPlatform",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/BlockchainPlatform/UpdateBlockchainPlatform")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBlockchainPlatformRequest::builder)
                .basePath("/20191010")
                .appendPathParam("blockchainPlatforms")
                .appendPathParam(request.getBlockchainPlatformId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBlockchainPlatformResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateBlockchainPlatformResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOsnResponse> updateOsn(
            UpdateOsnRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateOsnRequest, UpdateOsnResponse>
                    handler) {

        Validate.notBlank(
                request.getBlockchainPlatformId(), "blockchainPlatformId must not be blank");

        Validate.notBlank(request.getOsnId(), "osnId must not be blank");
        Objects.requireNonNull(request.getUpdateOsnDetails(), "updateOsnDetails is required");

        return clientCall(request, UpdateOsnResponse::builder)
                .logger(LOG, "updateOsn")
                .serviceDetails(
                        "BlockchainPlatform",
                        "UpdateOsn",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/BlockchainPlatform/UpdateOsn")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOsnRequest::builder)
                .basePath("/20191010")
                .appendPathParam("blockchainPlatforms")
                .appendPathParam(request.getBlockchainPlatformId())
                .appendPathParam("osns")
                .appendPathParam(request.getOsnId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOsnResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateOsnResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePeerResponse> updatePeer(
            UpdatePeerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdatePeerRequest, UpdatePeerResponse>
                    handler) {

        Validate.notBlank(
                request.getBlockchainPlatformId(), "blockchainPlatformId must not be blank");

        Validate.notBlank(request.getPeerId(), "peerId must not be blank");
        Objects.requireNonNull(request.getUpdatePeerDetails(), "updatePeerDetails is required");

        return clientCall(request, UpdatePeerResponse::builder)
                .logger(LOG, "updatePeer")
                .serviceDetails(
                        "BlockchainPlatform",
                        "UpdatePeer",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/BlockchainPlatform/UpdatePeer")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePeerRequest::builder)
                .basePath("/20191010")
                .appendPathParam("blockchainPlatforms")
                .appendPathParam(request.getBlockchainPlatformId())
                .appendPathParam("peers")
                .appendPathParam(request.getPeerId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePeerResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdatePeerResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpgradeBlockchainPlatformResponse> upgradeBlockchainPlatform(
            UpgradeBlockchainPlatformRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpgradeBlockchainPlatformRequest, UpgradeBlockchainPlatformResponse>
                    handler) {
        Objects.requireNonNull(
                request.getUpgradeBlockchainPlatformDetails(),
                "upgradeBlockchainPlatformDetails is required");

        Validate.notBlank(
                request.getBlockchainPlatformId(), "blockchainPlatformId must not be blank");

        return clientCall(request, UpgradeBlockchainPlatformResponse::builder)
                .logger(LOG, "upgradeBlockchainPlatform")
                .serviceDetails(
                        "BlockchainPlatform",
                        "UpgradeBlockchainPlatform",
                        "https://docs.oracle.com/iaas/api/#/en/blockchain/20191010/BlockchainPlatform/UpgradeBlockchainPlatform")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpgradeBlockchainPlatformRequest::builder)
                .basePath("/20191010")
                .appendPathParam("blockchainPlatforms")
                .appendPathParam(request.getBlockchainPlatformId())
                .appendPathParam("actions")
                .appendPathParam("upgrade")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpgradeBlockchainPlatformResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpgradeBlockchainPlatformResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public BlockchainPlatformAsyncClient(
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
    public BlockchainPlatformAsyncClient(
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
    public BlockchainPlatformAsyncClient(
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
    public BlockchainPlatformAsyncClient(
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
    public BlockchainPlatformAsyncClient(
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
    public BlockchainPlatformAsyncClient(
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
    public BlockchainPlatformAsyncClient(
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
