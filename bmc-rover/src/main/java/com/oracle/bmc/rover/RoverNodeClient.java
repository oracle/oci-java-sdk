/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.rover.requests.*;
import com.oracle.bmc.rover.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
public class RoverNodeClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements RoverNode {
    /** Service instance for RoverNode. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ROVERNODE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://rover.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(RoverNodeClient.class);

    private final RoverNodeWaiters waiters;

    private final RoverNodePaginators paginators;

    RoverNodeClient(
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
                                    .nameFormat("RoverNode-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new RoverNodeWaiters(executorService, this);

        this.paginators = new RoverNodePaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, RoverNodeClient> {
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
        public RoverNodeClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new RoverNodeClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeRoverNodeCompartmentResponse changeRoverNodeCompartment(
            ChangeRoverNodeCompartmentRequest request) {

        Validate.notBlank(request.getRoverNodeId(), "roverNodeId must not be blank");
        Objects.requireNonNull(
                request.getChangeRoverNodeCompartmentDetails(),
                "changeRoverNodeCompartmentDetails is required");

        return clientCall(request, ChangeRoverNodeCompartmentResponse::builder)
                .logger(LOG, "changeRoverNodeCompartment")
                .serviceDetails(
                        "RoverNode",
                        "ChangeRoverNodeCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverNode/ChangeRoverNodeCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeRoverNodeCompartmentRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverNodes")
                .appendPathParam(request.getRoverNodeId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeRoverNodeCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateRoverNodeResponse createRoverNode(CreateRoverNodeRequest request) {
        Objects.requireNonNull(
                request.getCreateRoverNodeDetails(), "createRoverNodeDetails is required");

        return clientCall(request, CreateRoverNodeResponse::builder)
                .logger(LOG, "createRoverNode")
                .serviceDetails(
                        "RoverNode",
                        "CreateRoverNode",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverNode/CreateRoverNode")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRoverNodeRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverNodes")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.rover.model.RoverNode.class,
                        CreateRoverNodeResponse.Builder::roverNode)
                .handleResponseHeaderString("etag", CreateRoverNodeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRoverNodeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteRoverNodeResponse deleteRoverNode(DeleteRoverNodeRequest request) {

        Validate.notBlank(request.getRoverNodeId(), "roverNodeId must not be blank");

        return clientCall(request, DeleteRoverNodeResponse::builder)
                .logger(LOG, "deleteRoverNode")
                .serviceDetails(
                        "RoverNode",
                        "DeleteRoverNode",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverNode/DeleteRoverNode")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRoverNodeRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverNodes")
                .appendPathParam(request.getRoverNodeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRoverNodeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetRoverNodeResponse getRoverNode(GetRoverNodeRequest request) {

        Validate.notBlank(request.getRoverNodeId(), "roverNodeId must not be blank");

        return clientCall(request, GetRoverNodeResponse::builder)
                .logger(LOG, "getRoverNode")
                .serviceDetails(
                        "RoverNode",
                        "GetRoverNode",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverNode/GetRoverNode")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRoverNodeRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverNodes")
                .appendPathParam(request.getRoverNodeId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.rover.model.RoverNode.class,
                        GetRoverNodeResponse.Builder::roverNode)
                .handleResponseHeaderString("etag", GetRoverNodeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRoverNodeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetRoverNodeCertificateResponse getRoverNodeCertificate(
            GetRoverNodeCertificateRequest request) {

        Validate.notBlank(request.getRoverNodeId(), "roverNodeId must not be blank");

        return clientCall(request, GetRoverNodeCertificateResponse::builder)
                .logger(LOG, "getRoverNodeCertificate")
                .serviceDetails(
                        "RoverNode",
                        "GetRoverNodeCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverNodeCertificate/GetRoverNodeCertificate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRoverNodeCertificateRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverNodes")
                .appendPathParam(request.getRoverNodeId())
                .appendPathParam("certificate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.rover.model.RoverNodeCertificate.class,
                        GetRoverNodeCertificateResponse.Builder::roverNodeCertificate)
                .handleResponseHeaderString("etag", GetRoverNodeCertificateResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRoverNodeCertificateResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetRoverNodeEncryptionKeyResponse getRoverNodeEncryptionKey(
            GetRoverNodeEncryptionKeyRequest request) {

        Validate.notBlank(request.getRoverNodeId(), "roverNodeId must not be blank");

        return clientCall(request, GetRoverNodeEncryptionKeyResponse::builder)
                .logger(LOG, "getRoverNodeEncryptionKey")
                .serviceDetails(
                        "RoverNode",
                        "GetRoverNodeEncryptionKey",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverNodeEncryptionKey/GetRoverNodeEncryptionKey")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRoverNodeEncryptionKeyRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverNodes")
                .appendPathParam(request.getRoverNodeId())
                .appendPathParam("encryptionKey")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.rover.model.RoverNodeEncryptionKey.class,
                        GetRoverNodeEncryptionKeyResponse.Builder::roverNodeEncryptionKey)
                .handleResponseHeaderString("etag", GetRoverNodeEncryptionKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRoverNodeEncryptionKeyResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetRoverNodeGetRptResponse getRoverNodeGetRpt(GetRoverNodeGetRptRequest request) {

        Validate.notBlank(request.getRoverNodeId(), "roverNodeId must not be blank");
        Objects.requireNonNull(request.getJwt(), "jwt is required");

        return clientCall(request, GetRoverNodeGetRptResponse::builder)
                .logger(LOG, "getRoverNodeGetRpt")
                .serviceDetails(
                        "RoverNode",
                        "GetRoverNodeGetRpt",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverNodeGetRpt/GetRoverNodeGetRpt")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRoverNodeGetRptRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverNodes")
                .appendPathParam(request.getRoverNodeId())
                .appendPathParam("getRpt")
                .accept("application/json")
                .appendHeader("jwt", request.getJwt())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.rover.model.RoverNodeGetRpt.class,
                        GetRoverNodeGetRptResponse.Builder::roverNodeGetRpt)
                .handleResponseHeaderString("etag", GetRoverNodeGetRptResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRoverNodeGetRptResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListRoverNodesResponse listRoverNodes(ListRoverNodesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListRoverNodesResponse::builder)
                .logger(LOG, "listRoverNodes")
                .serviceDetails(
                        "RoverNode",
                        "ListRoverNodes",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverNode/ListRoverNodes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRoverNodesRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverNodes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("nodeType", request.getNodeType())
                .appendQueryParam("shape", request.getShape())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.rover.model.RoverNodeCollection.class,
                        ListRoverNodesResponse.Builder::roverNodeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRoverNodesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRoverNodesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListRoverNodesResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RoverNodeActionRetrieveCaBundleResponse roverNodeActionRetrieveCaBundle(
            RoverNodeActionRetrieveCaBundleRequest request) {

        Validate.notBlank(request.getRoverNodeId(), "roverNodeId must not be blank");

        return clientCall(request, RoverNodeActionRetrieveCaBundleResponse::builder)
                .logger(LOG, "roverNodeActionRetrieveCaBundle")
                .serviceDetails(
                        "RoverNode",
                        "RoverNodeActionRetrieveCaBundle",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverNode/RoverNodeActionRetrieveCaBundle")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RoverNodeActionRetrieveCaBundleRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverNodes")
                .appendPathParam(request.getRoverNodeId())
                .appendPathParam("actions")
                .appendPathParam("retrieveCaBundle")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.rover.model.CaBundleResponse.class,
                        RoverNodeActionRetrieveCaBundleResponse.Builder::caBundleResponse)
                .handleResponseHeaderString(
                        "etag", RoverNodeActionRetrieveCaBundleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RoverNodeActionRetrieveCaBundleResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RoverNodeActionSetKeyResponse roverNodeActionSetKey(
            RoverNodeActionSetKeyRequest request) {

        Validate.notBlank(request.getRoverNodeId(), "roverNodeId must not be blank");
        Objects.requireNonNull(request.getJwt(), "jwt is required");

        Objects.requireNonNull(
                request.getRoverNodeActionSetKeyDetails(),
                "roverNodeActionSetKeyDetails is required");

        return clientCall(request, RoverNodeActionSetKeyResponse::builder)
                .logger(LOG, "roverNodeActionSetKey")
                .serviceDetails(
                        "RoverNode",
                        "RoverNodeActionSetKey",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverNodeSetKey/RoverNodeActionSetKey")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RoverNodeActionSetKeyRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverNodes")
                .appendPathParam(request.getRoverNodeId())
                .appendPathParam("actions")
                .appendPathParam("setKey")
                .accept("application/json")
                .appendHeader("jwt", request.getJwt())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.rover.model.RoverNodeSetKey.class,
                        RoverNodeActionSetKeyResponse.Builder::roverNodeSetKey)
                .handleResponseHeaderString("etag", RoverNodeActionSetKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RoverNodeActionSetKeyResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RoverNodeGenerateCertificateResponse roverNodeGenerateCertificate(
            RoverNodeGenerateCertificateRequest request) {
        Objects.requireNonNull(
                request.getRoverNodeGenerateCertificateDetails(),
                "roverNodeGenerateCertificateDetails is required");

        Validate.notBlank(request.getRoverNodeId(), "roverNodeId must not be blank");

        return clientCall(request, RoverNodeGenerateCertificateResponse::builder)
                .logger(LOG, "roverNodeGenerateCertificate")
                .serviceDetails(
                        "RoverNode",
                        "RoverNodeGenerateCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverNode/RoverNodeGenerateCertificate")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RoverNodeGenerateCertificateRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverNodes")
                .appendPathParam(request.getRoverNodeId())
                .appendPathParam("actions")
                .appendPathParam("generateCertificate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.rover.model.GenerateCertificateResponse.class,
                        RoverNodeGenerateCertificateResponse.Builder::generateCertificateResponse)
                .handleResponseHeaderString(
                        "etag", RoverNodeGenerateCertificateResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RoverNodeGenerateCertificateResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RoverNodeRenewCertificateResponse roverNodeRenewCertificate(
            RoverNodeRenewCertificateRequest request) {
        Objects.requireNonNull(
                request.getRoverNodeRenewCertificateDetails(),
                "roverNodeRenewCertificateDetails is required");

        Validate.notBlank(request.getRoverNodeId(), "roverNodeId must not be blank");

        return clientCall(request, RoverNodeRenewCertificateResponse::builder)
                .logger(LOG, "roverNodeRenewCertificate")
                .serviceDetails(
                        "RoverNode",
                        "RoverNodeRenewCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverNode/RoverNodeRenewCertificate")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RoverNodeRenewCertificateRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverNodes")
                .appendPathParam(request.getRoverNodeId())
                .appendPathParam("actions")
                .appendPathParam("renewCertificate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.rover.model.RenewCertificateResponse.class,
                        RoverNodeRenewCertificateResponse.Builder::renewCertificateResponse)
                .handleResponseHeaderString("etag", RoverNodeRenewCertificateResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RoverNodeRenewCertificateResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RoverNodeReplaceCertificateAuthorityResponse roverNodeReplaceCertificateAuthority(
            RoverNodeReplaceCertificateAuthorityRequest request) {
        Objects.requireNonNull(
                request.getRoverNodeReplaceCertificateAuthorityDetails(),
                "roverNodeReplaceCertificateAuthorityDetails is required");

        Validate.notBlank(request.getRoverNodeId(), "roverNodeId must not be blank");

        return clientCall(request, RoverNodeReplaceCertificateAuthorityResponse::builder)
                .logger(LOG, "roverNodeReplaceCertificateAuthority")
                .serviceDetails(
                        "RoverNode",
                        "RoverNodeReplaceCertificateAuthority",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverNode/RoverNodeReplaceCertificateAuthority")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RoverNodeReplaceCertificateAuthorityRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverNodes")
                .appendPathParam(request.getRoverNodeId())
                .appendPathParam("actions")
                .appendPathParam("replaceCertificateAuthority")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.rover.model.ReplaceCertificateAuthorityResponse.class,
                        RoverNodeReplaceCertificateAuthorityResponse.Builder
                                ::replaceCertificateAuthorityResponse)
                .handleResponseHeaderString(
                        "etag", RoverNodeReplaceCertificateAuthorityResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RoverNodeReplaceCertificateAuthorityResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RoverNodeRetrieveLeafCertificateResponse roverNodeRetrieveLeafCertificate(
            RoverNodeRetrieveLeafCertificateRequest request) {

        Validate.notBlank(request.getRoverNodeId(), "roverNodeId must not be blank");

        return clientCall(request, RoverNodeRetrieveLeafCertificateResponse::builder)
                .logger(LOG, "roverNodeRetrieveLeafCertificate")
                .serviceDetails(
                        "RoverNode",
                        "RoverNodeRetrieveLeafCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverNode/RoverNodeRetrieveLeafCertificate")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RoverNodeRetrieveLeafCertificateRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverNodes")
                .appendPathParam(request.getRoverNodeId())
                .appendPathParam("actions")
                .appendPathParam("retrieveLeafCertificate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.rover.model.LeafCertificateResponse.class,
                        RoverNodeRetrieveLeafCertificateResponse.Builder::leafCertificateResponse)
                .handleResponseHeaderString(
                        "etag", RoverNodeRetrieveLeafCertificateResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RoverNodeRetrieveLeafCertificateResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateRoverNodeResponse updateRoverNode(UpdateRoverNodeRequest request) {

        Validate.notBlank(request.getRoverNodeId(), "roverNodeId must not be blank");
        Objects.requireNonNull(
                request.getUpdateRoverNodeDetails(), "updateRoverNodeDetails is required");

        return clientCall(request, UpdateRoverNodeResponse::builder)
                .logger(LOG, "updateRoverNode")
                .serviceDetails(
                        "RoverNode",
                        "UpdateRoverNode",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverNode/UpdateRoverNode")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRoverNodeRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverNodes")
                .appendPathParam(request.getRoverNodeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.rover.model.RoverNode.class,
                        UpdateRoverNodeResponse.Builder::roverNode)
                .handleResponseHeaderString("etag", UpdateRoverNodeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRoverNodeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RoverNodeWaiters getWaiters() {
        return waiters;
    }

    @Override
    public RoverNodePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public RoverNodeClient(
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
    public RoverNodeClient(
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
    public RoverNodeClient(
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
    public RoverNodeClient(
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
    public RoverNodeClient(
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
    public RoverNodeClient(
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
    public RoverNodeClient(
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
    public RoverNodeClient(
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
