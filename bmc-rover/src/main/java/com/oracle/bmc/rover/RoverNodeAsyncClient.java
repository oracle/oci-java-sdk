/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.rover.requests.*;
import com.oracle.bmc.rover.responses.*;

import java.util.Objects;

/**
 * Async client implementation for RoverNode service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
public class RoverNodeAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements RoverNodeAsync {
    /** Service instance for RoverNode. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ROVERNODE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://rover.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(RoverNodeAsyncClient.class);

    RoverNodeAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, RoverNodeAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "rover";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
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
        public RoverNodeAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new RoverNodeAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeRoverNodeCompartmentResponse>
            changeRoverNodeCompartment(
                    ChangeRoverNodeCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeRoverNodeCompartmentRequest,
                                    ChangeRoverNodeCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateRoverNodeResponse> createRoverNode(
            CreateRoverNodeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateRoverNodeRequest, CreateRoverNodeResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteRoverNodeResponse> deleteRoverNode(
            DeleteRoverNodeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteRoverNodeRequest, DeleteRoverNodeResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRoverNodeResponse> getRoverNode(
            GetRoverNodeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetRoverNodeRequest, GetRoverNodeResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRoverNodeCertificateResponse> getRoverNodeCertificate(
            GetRoverNodeCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRoverNodeCertificateRequest, GetRoverNodeCertificateResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRoverNodeEncryptionKeyResponse> getRoverNodeEncryptionKey(
            GetRoverNodeEncryptionKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRoverNodeEncryptionKeyRequest, GetRoverNodeEncryptionKeyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRoverNodeGetRptResponse> getRoverNodeGetRpt(
            GetRoverNodeGetRptRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRoverNodeGetRptRequest, GetRoverNodeGetRptResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRoverNodesResponse> listRoverNodes(
            ListRoverNodesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRoverNodesRequest, ListRoverNodesResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RoverNodeActionRetrieveCaBundleResponse>
            roverNodeActionRetrieveCaBundle(
                    RoverNodeActionRetrieveCaBundleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RoverNodeActionRetrieveCaBundleRequest,
                                    RoverNodeActionRetrieveCaBundleResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RoverNodeActionSetKeyResponse> roverNodeActionSetKey(
            RoverNodeActionSetKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RoverNodeActionSetKeyRequest, RoverNodeActionSetKeyResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RoverNodeGenerateCertificateResponse>
            roverNodeGenerateCertificate(
                    RoverNodeGenerateCertificateRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RoverNodeGenerateCertificateRequest,
                                    RoverNodeGenerateCertificateResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RoverNodeRenewCertificateResponse> roverNodeRenewCertificate(
            RoverNodeRenewCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RoverNodeRenewCertificateRequest, RoverNodeRenewCertificateResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RoverNodeReplaceCertificateAuthorityResponse>
            roverNodeReplaceCertificateAuthority(
                    RoverNodeReplaceCertificateAuthorityRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RoverNodeReplaceCertificateAuthorityRequest,
                                    RoverNodeReplaceCertificateAuthorityResponse>
                            handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RoverNodeRetrieveLeafCertificateResponse>
            roverNodeRetrieveLeafCertificate(
                    RoverNodeRetrieveLeafCertificateRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RoverNodeRetrieveLeafCertificateRequest,
                                    RoverNodeRetrieveLeafCertificateResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoverNodeResponse> updateRoverNode(
            UpdateRoverNodeRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateRoverNodeRequest, UpdateRoverNodeResponse>
                    handler) {

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
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public RoverNodeAsyncClient(
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
    public RoverNodeAsyncClient(
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
    public RoverNodeAsyncClient(
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
    public RoverNodeAsyncClient(
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
    public RoverNodeAsyncClient(
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
    public RoverNodeAsyncClient(
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
    public RoverNodeAsyncClient(
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
