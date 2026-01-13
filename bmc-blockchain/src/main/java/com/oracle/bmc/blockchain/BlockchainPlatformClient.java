/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.blockchain.requests.*;
import com.oracle.bmc.blockchain.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
public class BlockchainPlatformClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements BlockchainPlatform {
    /** Service instance for BlockchainPlatform. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(BlockchainPlatformClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://blockchain.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(BlockchainPlatformClient.class);

    private final BlockchainPlatformWaiters waiters;

    private final BlockchainPlatformPaginators paginators;

    BlockchainPlatformClient(
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
                                    .nameFormat("BlockchainPlatform-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new BlockchainPlatformWaiters(executorService, this);

        this.paginators = new BlockchainPlatformPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, BlockchainPlatformClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "blockchain";
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
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public BlockchainPlatformClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new BlockchainPlatformClient(
                    this, authenticationDetailsProvider, executorService);
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
    public ChangeBlockchainPlatformCompartmentResponse changeBlockchainPlatformCompartment(
            ChangeBlockchainPlatformCompartmentRequest request) {

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
                .callSync();
    }

    @Override
    public CreateBlockchainPlatformResponse createBlockchainPlatform(
            CreateBlockchainPlatformRequest request) {
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
                .callSync();
    }

    @Override
    public CreateOsnResponse createOsn(CreateOsnRequest request) {

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
                .callSync();
    }

    @Override
    public CreatePeerResponse createPeer(CreatePeerRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteBlockchainPlatformResponse deleteBlockchainPlatform(
            DeleteBlockchainPlatformRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteOsnResponse deleteOsn(DeleteOsnRequest request) {

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
                .callSync();
    }

    @Override
    public DeletePeerResponse deletePeer(DeletePeerRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteWorkRequestResponse deleteWorkRequest(DeleteWorkRequestRequest request) {

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
                .callSync();
    }

    @Override
    public GetBlockchainPlatformResponse getBlockchainPlatform(
            GetBlockchainPlatformRequest request) {

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
                .callSync();
    }

    @Override
    public GetOsnResponse getOsn(GetOsnRequest request) {

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
                .callSync();
    }

    @Override
    public GetPeerResponse getPeer(GetPeerRequest request) {

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
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

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
                .callSync();
    }

    @Override
    public ListBlockchainPlatformPatchesResponse listBlockchainPlatformPatches(
            ListBlockchainPlatformPatchesRequest request) {

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
                .callSync();
    }

    @Override
    public ListBlockchainPlatformsResponse listBlockchainPlatforms(
            ListBlockchainPlatformsRequest request) {
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
                .callSync();
    }

    @Override
    public ListOsnsResponse listOsns(ListOsnsRequest request) {

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
                .callSync();
    }

    @Override
    public ListPeersResponse listPeers(ListPeersRequest request) {

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
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

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
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

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
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
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
                .callSync();
    }

    @Override
    public PreviewScaleBlockchainPlatformResponse previewScaleBlockchainPlatform(
            PreviewScaleBlockchainPlatformRequest request) {

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
                .callSync();
    }

    @Override
    public ScaleBlockchainPlatformResponse scaleBlockchainPlatform(
            ScaleBlockchainPlatformRequest request) {

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
                .callSync();
    }

    @Override
    public StartBlockchainPlatformResponse startBlockchainPlatform(
            StartBlockchainPlatformRequest request) {

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
                .callSync();
    }

    @Override
    public StopBlockchainPlatformResponse stopBlockchainPlatform(
            StopBlockchainPlatformRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateBlockchainPlatformResponse updateBlockchainPlatform(
            UpdateBlockchainPlatformRequest request) {
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
                .callSync();
    }

    @Override
    public UpdateOsnResponse updateOsn(UpdateOsnRequest request) {

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
                .callSync();
    }

    @Override
    public UpdatePeerResponse updatePeer(UpdatePeerRequest request) {

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
                .callSync();
    }

    @Override
    public UpgradeBlockchainPlatformResponse upgradeBlockchainPlatform(
            UpgradeBlockchainPlatformRequest request) {
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
                .callSync();
    }

    @Override
    public BlockchainPlatformWaiters getWaiters() {
        return waiters;
    }

    @Override
    public BlockchainPlatformPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public BlockchainPlatformClient(
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
    public BlockchainPlatformClient(
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
    public BlockchainPlatformClient(
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
    public BlockchainPlatformClient(
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
    public BlockchainPlatformClient(
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
    public BlockchainPlatformClient(
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
    public BlockchainPlatformClient(
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
    public BlockchainPlatformClient(
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
