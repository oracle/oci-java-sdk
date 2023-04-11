/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.certificatesmanagement.requests.*;
import com.oracle.bmc.certificatesmanagement.responses.*;

import java.util.Objects;

/**
 * Async client implementation for CertificatesManagement service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public class CertificatesManagementAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements CertificatesManagementAsync {
    /** Service instance for CertificatesManagement. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("CERTIFICATESMANAGEMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://certificatesmanagement.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CertificatesManagementAsyncClient.class);

    CertificatesManagementAsyncClient(
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
                    Builder, CertificatesManagementAsyncClient> {
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
        public CertificatesManagementAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new CertificatesManagementAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CancelCertificateAuthorityDeletionResponse>
            cancelCertificateAuthorityDeletion(
                    CancelCertificateAuthorityDeletionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CancelCertificateAuthorityDeletionRequest,
                                    CancelCertificateAuthorityDeletionResponse>
                            handler) {

        Validate.notBlank(
                request.getCertificateAuthorityId(), "certificateAuthorityId must not be blank");

        return clientCall(request, CancelCertificateAuthorityDeletionResponse::builder)
                .logger(LOG, "cancelCertificateAuthorityDeletion")
                .serviceDetails(
                        "CertificatesManagement",
                        "CancelCertificateAuthorityDeletion",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateAuthority/CancelCertificateAuthorityDeletion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelCertificateAuthorityDeletionRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificateAuthorities")
                .appendPathParam(request.getCertificateAuthorityId())
                .appendPathParam("actions")
                .appendPathParam("cancelDeletion")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "etag", CancelCertificateAuthorityDeletionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CancelCertificateAuthorityDeletionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CancelCertificateAuthorityVersionDeletionResponse>
            cancelCertificateAuthorityVersionDeletion(
                    CancelCertificateAuthorityVersionDeletionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CancelCertificateAuthorityVersionDeletionRequest,
                                    CancelCertificateAuthorityVersionDeletionResponse>
                            handler) {

        Validate.notBlank(
                request.getCertificateAuthorityId(), "certificateAuthorityId must not be blank");

        return clientCall(request, CancelCertificateAuthorityVersionDeletionResponse::builder)
                .logger(LOG, "cancelCertificateAuthorityVersionDeletion")
                .serviceDetails(
                        "CertificatesManagement",
                        "CancelCertificateAuthorityVersionDeletion",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateAuthorityVersion/CancelCertificateAuthorityVersionDeletion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelCertificateAuthorityVersionDeletionRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificateAuthorities")
                .appendPathParam(request.getCertificateAuthorityId())
                .appendPathParam("version")
                .appendPathParam(request.getCertificateAuthorityVersionNumber())
                .appendPathParam("actions")
                .appendPathParam("cancelDeletion")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "etag", CancelCertificateAuthorityVersionDeletionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CancelCertificateAuthorityVersionDeletionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CancelCertificateDeletionResponse> cancelCertificateDeletion(
            CancelCertificateDeletionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelCertificateDeletionRequest, CancelCertificateDeletionResponse>
                    handler) {

        Validate.notBlank(request.getCertificateId(), "certificateId must not be blank");

        return clientCall(request, CancelCertificateDeletionResponse::builder)
                .logger(LOG, "cancelCertificateDeletion")
                .serviceDetails(
                        "CertificatesManagement",
                        "CancelCertificateDeletion",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/Certificate/CancelCertificateDeletion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelCertificateDeletionRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificates")
                .appendPathParam(request.getCertificateId())
                .appendPathParam("actions")
                .appendPathParam("cancelDeletion")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString("etag", CancelCertificateDeletionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CancelCertificateDeletionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CancelCertificateVersionDeletionResponse>
            cancelCertificateVersionDeletion(
                    CancelCertificateVersionDeletionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CancelCertificateVersionDeletionRequest,
                                    CancelCertificateVersionDeletionResponse>
                            handler) {

        Validate.notBlank(request.getCertificateId(), "certificateId must not be blank");

        return clientCall(request, CancelCertificateVersionDeletionResponse::builder)
                .logger(LOG, "cancelCertificateVersionDeletion")
                .serviceDetails(
                        "CertificatesManagement",
                        "CancelCertificateVersionDeletion",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateVersion/CancelCertificateVersionDeletion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelCertificateVersionDeletionRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificates")
                .appendPathParam(request.getCertificateId())
                .appendPathParam("version")
                .appendPathParam(request.getCertificateVersionNumber())
                .appendPathParam("actions")
                .appendPathParam("cancelDeletion")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "etag", CancelCertificateVersionDeletionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CancelCertificateVersionDeletionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeCaBundleCompartmentResponse> changeCaBundleCompartment(
            ChangeCaBundleCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeCaBundleCompartmentRequest, ChangeCaBundleCompartmentResponse>
                    handler) {

        Validate.notBlank(request.getCaBundleId(), "caBundleId must not be blank");
        Objects.requireNonNull(
                request.getChangeCaBundleCompartmentDetails(),
                "changeCaBundleCompartmentDetails is required");

        return clientCall(request, ChangeCaBundleCompartmentResponse::builder)
                .logger(LOG, "changeCaBundleCompartment")
                .serviceDetails(
                        "CertificatesManagement",
                        "ChangeCaBundleCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CaBundle/ChangeCaBundleCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeCaBundleCompartmentRequest::builder)
                .basePath("/20210224")
                .appendPathParam("caBundles")
                .appendPathParam(request.getCaBundleId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeCaBundleCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeCertificateAuthorityCompartmentResponse>
            changeCertificateAuthorityCompartment(
                    ChangeCertificateAuthorityCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCertificateAuthorityCompartmentRequest,
                                    ChangeCertificateAuthorityCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getCertificateAuthorityId(), "certificateAuthorityId must not be blank");
        Objects.requireNonNull(
                request.getChangeCertificateAuthorityCompartmentDetails(),
                "changeCertificateAuthorityCompartmentDetails is required");

        return clientCall(request, ChangeCertificateAuthorityCompartmentResponse::builder)
                .logger(LOG, "changeCertificateAuthorityCompartment")
                .serviceDetails(
                        "CertificatesManagement",
                        "ChangeCertificateAuthorityCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateAuthority/ChangeCertificateAuthorityCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeCertificateAuthorityCompartmentRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificateAuthorities")
                .appendPathParam(request.getCertificateAuthorityId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeCertificateAuthorityCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeCertificateCompartmentResponse>
            changeCertificateCompartment(
                    ChangeCertificateCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCertificateCompartmentRequest,
                                    ChangeCertificateCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getCertificateId(), "certificateId must not be blank");
        Objects.requireNonNull(
                request.getChangeCertificateCompartmentDetails(),
                "changeCertificateCompartmentDetails is required");

        return clientCall(request, ChangeCertificateCompartmentResponse::builder)
                .logger(LOG, "changeCertificateCompartment")
                .serviceDetails(
                        "CertificatesManagement",
                        "ChangeCertificateCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/Certificate/ChangeCertificateCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeCertificateCompartmentRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificates")
                .appendPathParam(request.getCertificateId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeCertificateCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateCaBundleResponse> createCaBundle(
            CreateCaBundleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCaBundleRequest, CreateCaBundleResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateCaBundleDetails(), "createCaBundleDetails is required");

        return clientCall(request, CreateCaBundleResponse::builder)
                .logger(LOG, "createCaBundle")
                .serviceDetails(
                        "CertificatesManagement",
                        "CreateCaBundle",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CaBundle/CreateCaBundle")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCaBundleRequest::builder)
                .basePath("/20210224")
                .appendPathParam("caBundles")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.certificatesmanagement.model.CaBundle.class,
                        CreateCaBundleResponse.Builder::caBundle)
                .handleResponseHeaderString("etag", CreateCaBundleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCaBundleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateCertificateResponse> createCertificate(
            CreateCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCertificateRequest, CreateCertificateResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateCertificateDetails(), "createCertificateDetails is required");

        return clientCall(request, CreateCertificateResponse::builder)
                .logger(LOG, "createCertificate")
                .serviceDetails(
                        "CertificatesManagement",
                        "CreateCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/Certificate/CreateCertificate")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCertificateRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificates")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.certificatesmanagement.model.Certificate.class,
                        CreateCertificateResponse.Builder::certificate)
                .handleResponseHeaderString("etag", CreateCertificateResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCertificateResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateCertificateAuthorityResponse>
            createCertificateAuthority(
                    CreateCertificateAuthorityRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateCertificateAuthorityRequest,
                                    CreateCertificateAuthorityResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateCertificateAuthorityDetails(),
                "createCertificateAuthorityDetails is required");

        return clientCall(request, CreateCertificateAuthorityResponse::builder)
                .logger(LOG, "createCertificateAuthority")
                .serviceDetails(
                        "CertificatesManagement",
                        "CreateCertificateAuthority",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateAuthority/CreateCertificateAuthority")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCertificateAuthorityRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificateAuthorities")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.certificatesmanagement.model.CertificateAuthority.class,
                        CreateCertificateAuthorityResponse.Builder::certificateAuthority)
                .handleResponseHeaderString(
                        "etag", CreateCertificateAuthorityResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCertificateAuthorityResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteCaBundleResponse> deleteCaBundle(
            DeleteCaBundleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCaBundleRequest, DeleteCaBundleResponse>
                    handler) {

        Validate.notBlank(request.getCaBundleId(), "caBundleId must not be blank");

        return clientCall(request, DeleteCaBundleResponse::builder)
                .logger(LOG, "deleteCaBundle")
                .serviceDetails(
                        "CertificatesManagement",
                        "DeleteCaBundle",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CaBundle/DeleteCaBundle")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCaBundleRequest::builder)
                .basePath("/20210224")
                .appendPathParam("caBundles")
                .appendPathParam(request.getCaBundleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCaBundleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAssociationResponse> getAssociation(
            GetAssociationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAssociationRequest, GetAssociationResponse>
                    handler) {

        Validate.notBlank(request.getAssociationId(), "associationId must not be blank");

        return clientCall(request, GetAssociationResponse::builder)
                .logger(LOG, "getAssociation")
                .serviceDetails(
                        "CertificatesManagement",
                        "GetAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/Association/GetAssociation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAssociationRequest::builder)
                .basePath("/20210224")
                .appendPathParam("associations")
                .appendPathParam(request.getAssociationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.certificatesmanagement.model.Association.class,
                        GetAssociationResponse.Builder::association)
                .handleResponseHeaderString("etag", GetAssociationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAssociationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCaBundleResponse> getCaBundle(
            GetCaBundleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetCaBundleRequest, GetCaBundleResponse>
                    handler) {

        Validate.notBlank(request.getCaBundleId(), "caBundleId must not be blank");

        return clientCall(request, GetCaBundleResponse::builder)
                .logger(LOG, "getCaBundle")
                .serviceDetails(
                        "CertificatesManagement",
                        "GetCaBundle",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CaBundle/GetCaBundle")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCaBundleRequest::builder)
                .basePath("/20210224")
                .appendPathParam("caBundles")
                .appendPathParam(request.getCaBundleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.certificatesmanagement.model.CaBundle.class,
                        GetCaBundleResponse.Builder::caBundle)
                .handleResponseHeaderString("etag", GetCaBundleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCaBundleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCertificateResponse> getCertificate(
            GetCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCertificateRequest, GetCertificateResponse>
                    handler) {

        Validate.notBlank(request.getCertificateId(), "certificateId must not be blank");

        return clientCall(request, GetCertificateResponse::builder)
                .logger(LOG, "getCertificate")
                .serviceDetails(
                        "CertificatesManagement",
                        "GetCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/Certificate/GetCertificate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCertificateRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificates")
                .appendPathParam(request.getCertificateId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.certificatesmanagement.model.Certificate.class,
                        GetCertificateResponse.Builder::certificate)
                .handleResponseHeaderString("etag", GetCertificateResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCertificateResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCertificateAuthorityResponse> getCertificateAuthority(
            GetCertificateAuthorityRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCertificateAuthorityRequest, GetCertificateAuthorityResponse>
                    handler) {

        Validate.notBlank(
                request.getCertificateAuthorityId(), "certificateAuthorityId must not be blank");

        return clientCall(request, GetCertificateAuthorityResponse::builder)
                .logger(LOG, "getCertificateAuthority")
                .serviceDetails(
                        "CertificatesManagement",
                        "GetCertificateAuthority",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateAuthority/GetCertificateAuthority")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCertificateAuthorityRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificateAuthorities")
                .appendPathParam(request.getCertificateAuthorityId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.certificatesmanagement.model.CertificateAuthority.class,
                        GetCertificateAuthorityResponse.Builder::certificateAuthority)
                .handleResponseHeaderString("etag", GetCertificateAuthorityResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCertificateAuthorityResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCertificateAuthorityVersionResponse>
            getCertificateAuthorityVersion(
                    GetCertificateAuthorityVersionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetCertificateAuthorityVersionRequest,
                                    GetCertificateAuthorityVersionResponse>
                            handler) {

        Validate.notBlank(
                request.getCertificateAuthorityId(), "certificateAuthorityId must not be blank");

        return clientCall(request, GetCertificateAuthorityVersionResponse::builder)
                .logger(LOG, "getCertificateAuthorityVersion")
                .serviceDetails(
                        "CertificatesManagement",
                        "GetCertificateAuthorityVersion",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateAuthorityVersion/GetCertificateAuthorityVersion")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCertificateAuthorityVersionRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificateAuthorities")
                .appendPathParam(request.getCertificateAuthorityId())
                .appendPathParam("version")
                .appendPathParam(request.getCertificateAuthorityVersionNumber())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.certificatesmanagement.model.CertificateAuthorityVersion
                                .class,
                        GetCertificateAuthorityVersionResponse.Builder::certificateAuthorityVersion)
                .handleResponseHeaderString(
                        "etag", GetCertificateAuthorityVersionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetCertificateAuthorityVersionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCertificateVersionResponse> getCertificateVersion(
            GetCertificateVersionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCertificateVersionRequest, GetCertificateVersionResponse>
                    handler) {

        Validate.notBlank(request.getCertificateId(), "certificateId must not be blank");

        return clientCall(request, GetCertificateVersionResponse::builder)
                .logger(LOG, "getCertificateVersion")
                .serviceDetails(
                        "CertificatesManagement",
                        "GetCertificateVersion",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateVersion/GetCertificateVersion")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCertificateVersionRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificates")
                .appendPathParam(request.getCertificateId())
                .appendPathParam("version")
                .appendPathParam(request.getCertificateVersionNumber())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.certificatesmanagement.model.CertificateVersion.class,
                        GetCertificateVersionResponse.Builder::certificateVersion)
                .handleResponseHeaderString("etag", GetCertificateVersionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCertificateVersionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAssociationsResponse> listAssociations(
            ListAssociationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAssociationsRequest, ListAssociationsResponse>
                    handler) {

        return clientCall(request, ListAssociationsResponse::builder)
                .logger(LOG, "listAssociations")
                .serviceDetails(
                        "CertificatesManagement",
                        "ListAssociations",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/AssociationSummary/ListAssociations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAssociationsRequest::builder)
                .basePath("/20210224")
                .appendPathParam("associations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("certificatesResourceId", request.getCertificatesResourceId())
                .appendQueryParam("associatedResourceId", request.getAssociatedResourceId())
                .appendQueryParam("associationId", request.getAssociationId())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("associationType", request.getAssociationType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.certificatesmanagement.model.AssociationCollection.class,
                        ListAssociationsResponse.Builder::associationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAssociationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAssociationsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCaBundlesResponse> listCaBundles(
            ListCaBundlesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListCaBundlesRequest, ListCaBundlesResponse>
                    handler) {

        return clientCall(request, ListCaBundlesResponse::builder)
                .logger(LOG, "listCaBundles")
                .serviceDetails(
                        "CertificatesManagement",
                        "ListCaBundles",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CaBundleSummary/ListCaBundles")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCaBundlesRequest::builder)
                .basePath("/20210224")
                .appendPathParam("caBundles")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("caBundleId", request.getCaBundleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.certificatesmanagement.model.CaBundleCollection.class,
                        ListCaBundlesResponse.Builder::caBundleCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCaBundlesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCaBundlesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCertificateAuthoritiesResponse>
            listCertificateAuthorities(
                    ListCertificateAuthoritiesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListCertificateAuthoritiesRequest,
                                    ListCertificateAuthoritiesResponse>
                            handler) {

        return clientCall(request, ListCertificateAuthoritiesResponse::builder)
                .logger(LOG, "listCertificateAuthorities")
                .serviceDetails(
                        "CertificatesManagement",
                        "ListCertificateAuthorities",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateAuthoritySummary/ListCertificateAuthorities")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCertificateAuthoritiesRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificateAuthorities")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("name", request.getName())
                .appendQueryParam(
                        "issuerCertificateAuthorityId", request.getIssuerCertificateAuthorityId())
                .appendQueryParam("certificateAuthorityId", request.getCertificateAuthorityId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.certificatesmanagement.model.CertificateAuthorityCollection
                                .class,
                        ListCertificateAuthoritiesResponse.Builder::certificateAuthorityCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCertificateAuthoritiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCertificateAuthoritiesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCertificateAuthorityVersionsResponse>
            listCertificateAuthorityVersions(
                    ListCertificateAuthorityVersionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListCertificateAuthorityVersionsRequest,
                                    ListCertificateAuthorityVersionsResponse>
                            handler) {

        Validate.notBlank(
                request.getCertificateAuthorityId(), "certificateAuthorityId must not be blank");

        return clientCall(request, ListCertificateAuthorityVersionsResponse::builder)
                .logger(LOG, "listCertificateAuthorityVersions")
                .serviceDetails(
                        "CertificatesManagement",
                        "ListCertificateAuthorityVersions",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateAuthorityVersionSummary/ListCertificateAuthorityVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCertificateAuthorityVersionsRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificateAuthorities")
                .appendPathParam(request.getCertificateAuthorityId())
                .appendPathParam("versions")
                .appendQueryParam("versionNumber", request.getVersionNumber())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.certificatesmanagement.model
                                .CertificateAuthorityVersionCollection.class,
                        ListCertificateAuthorityVersionsResponse.Builder
                                ::certificateAuthorityVersionCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListCertificateAuthorityVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListCertificateAuthorityVersionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCertificateVersionsResponse> listCertificateVersions(
            ListCertificateVersionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCertificateVersionsRequest, ListCertificateVersionsResponse>
                    handler) {

        Validate.notBlank(request.getCertificateId(), "certificateId must not be blank");

        return clientCall(request, ListCertificateVersionsResponse::builder)
                .logger(LOG, "listCertificateVersions")
                .serviceDetails(
                        "CertificatesManagement",
                        "ListCertificateVersions",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateVersionSummary/ListCertificateVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCertificateVersionsRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificates")
                .appendPathParam(request.getCertificateId())
                .appendPathParam("versions")
                .appendQueryParam("versionNumber", request.getVersionNumber())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.certificatesmanagement.model.CertificateVersionCollection
                                .class,
                        ListCertificateVersionsResponse.Builder::certificateVersionCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListCertificateVersionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListCertificateVersionsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCertificatesResponse> listCertificates(
            ListCertificatesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCertificatesRequest, ListCertificatesResponse>
                    handler) {

        return clientCall(request, ListCertificatesResponse::builder)
                .logger(LOG, "listCertificates")
                .serviceDetails(
                        "CertificatesManagement",
                        "ListCertificates",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateSummary/ListCertificates")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCertificatesRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificates")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam(
                        "issuerCertificateAuthorityId", request.getIssuerCertificateAuthorityId())
                .appendQueryParam("certificateId", request.getCertificateId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.certificatesmanagement.model.CertificateCollection.class,
                        ListCertificatesResponse.Builder::certificateCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCertificatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCertificatesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RevokeCertificateAuthorityVersionResponse>
            revokeCertificateAuthorityVersion(
                    RevokeCertificateAuthorityVersionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    RevokeCertificateAuthorityVersionRequest,
                                    RevokeCertificateAuthorityVersionResponse>
                            handler) {

        Validate.notBlank(
                request.getCertificateAuthorityId(), "certificateAuthorityId must not be blank");

        Objects.requireNonNull(
                request.getRevokeCertificateAuthorityVersionDetails(),
                "revokeCertificateAuthorityVersionDetails is required");

        return clientCall(request, RevokeCertificateAuthorityVersionResponse::builder)
                .logger(LOG, "revokeCertificateAuthorityVersion")
                .serviceDetails(
                        "CertificatesManagement",
                        "RevokeCertificateAuthorityVersion",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateAuthorityVersion/RevokeCertificateAuthorityVersion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RevokeCertificateAuthorityVersionRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificateAuthorities")
                .appendPathParam(request.getCertificateAuthorityId())
                .appendPathParam("version")
                .appendPathParam(request.getCertificateAuthorityVersionNumber())
                .appendPathParam("actions")
                .appendPathParam("revoke")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", RevokeCertificateAuthorityVersionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RevokeCertificateAuthorityVersionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RevokeCertificateVersionResponse> revokeCertificateVersion(
            RevokeCertificateVersionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RevokeCertificateVersionRequest, RevokeCertificateVersionResponse>
                    handler) {

        Validate.notBlank(request.getCertificateId(), "certificateId must not be blank");

        Objects.requireNonNull(
                request.getRevokeCertificateVersionDetails(),
                "revokeCertificateVersionDetails is required");

        return clientCall(request, RevokeCertificateVersionResponse::builder)
                .logger(LOG, "revokeCertificateVersion")
                .serviceDetails(
                        "CertificatesManagement",
                        "RevokeCertificateVersion",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateVersion/RevokeCertificateVersion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RevokeCertificateVersionRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificates")
                .appendPathParam(request.getCertificateId())
                .appendPathParam("version")
                .appendPathParam(request.getCertificateVersionNumber())
                .appendPathParam("actions")
                .appendPathParam("revoke")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString("etag", RevokeCertificateVersionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RevokeCertificateVersionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ScheduleCertificateAuthorityDeletionResponse>
            scheduleCertificateAuthorityDeletion(
                    ScheduleCertificateAuthorityDeletionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ScheduleCertificateAuthorityDeletionRequest,
                                    ScheduleCertificateAuthorityDeletionResponse>
                            handler) {

        Validate.notBlank(
                request.getCertificateAuthorityId(), "certificateAuthorityId must not be blank");
        Objects.requireNonNull(
                request.getScheduleCertificateAuthorityDeletionDetails(),
                "scheduleCertificateAuthorityDeletionDetails is required");

        return clientCall(request, ScheduleCertificateAuthorityDeletionResponse::builder)
                .logger(LOG, "scheduleCertificateAuthorityDeletion")
                .serviceDetails(
                        "CertificatesManagement",
                        "ScheduleCertificateAuthorityDeletion",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateAuthority/ScheduleCertificateAuthorityDeletion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScheduleCertificateAuthorityDeletionRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificateAuthorities")
                .appendPathParam(request.getCertificateAuthorityId())
                .appendPathParam("actions")
                .appendPathParam("scheduleDeletion")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ScheduleCertificateAuthorityDeletionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ScheduleCertificateAuthorityDeletionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ScheduleCertificateAuthorityVersionDeletionResponse>
            scheduleCertificateAuthorityVersionDeletion(
                    ScheduleCertificateAuthorityVersionDeletionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ScheduleCertificateAuthorityVersionDeletionRequest,
                                    ScheduleCertificateAuthorityVersionDeletionResponse>
                            handler) {

        Validate.notBlank(
                request.getCertificateAuthorityId(), "certificateAuthorityId must not be blank");

        Objects.requireNonNull(
                request.getScheduleCertificateAuthorityVersionDeletionDetails(),
                "scheduleCertificateAuthorityVersionDeletionDetails is required");

        return clientCall(request, ScheduleCertificateAuthorityVersionDeletionResponse::builder)
                .logger(LOG, "scheduleCertificateAuthorityVersionDeletion")
                .serviceDetails(
                        "CertificatesManagement",
                        "ScheduleCertificateAuthorityVersionDeletion",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateAuthorityVersion/ScheduleCertificateAuthorityVersionDeletion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScheduleCertificateAuthorityVersionDeletionRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificateAuthorities")
                .appendPathParam(request.getCertificateAuthorityId())
                .appendPathParam("version")
                .appendPathParam(request.getCertificateAuthorityVersionNumber())
                .appendPathParam("actions")
                .appendPathParam("scheduleDeletion")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ScheduleCertificateAuthorityVersionDeletionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ScheduleCertificateAuthorityVersionDeletionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ScheduleCertificateDeletionResponse>
            scheduleCertificateDeletion(
                    ScheduleCertificateDeletionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ScheduleCertificateDeletionRequest,
                                    ScheduleCertificateDeletionResponse>
                            handler) {

        Validate.notBlank(request.getCertificateId(), "certificateId must not be blank");
        Objects.requireNonNull(
                request.getScheduleCertificateDeletionDetails(),
                "scheduleCertificateDeletionDetails is required");

        return clientCall(request, ScheduleCertificateDeletionResponse::builder)
                .logger(LOG, "scheduleCertificateDeletion")
                .serviceDetails(
                        "CertificatesManagement",
                        "ScheduleCertificateDeletion",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/Certificate/ScheduleCertificateDeletion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScheduleCertificateDeletionRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificates")
                .appendPathParam(request.getCertificateId())
                .appendPathParam("actions")
                .appendPathParam("scheduleDeletion")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ScheduleCertificateDeletionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ScheduleCertificateDeletionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ScheduleCertificateVersionDeletionResponse>
            scheduleCertificateVersionDeletion(
                    ScheduleCertificateVersionDeletionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ScheduleCertificateVersionDeletionRequest,
                                    ScheduleCertificateVersionDeletionResponse>
                            handler) {

        Validate.notBlank(request.getCertificateId(), "certificateId must not be blank");

        Objects.requireNonNull(
                request.getScheduleCertificateVersionDeletionDetails(),
                "scheduleCertificateVersionDeletionDetails is required");

        return clientCall(request, ScheduleCertificateVersionDeletionResponse::builder)
                .logger(LOG, "scheduleCertificateVersionDeletion")
                .serviceDetails(
                        "CertificatesManagement",
                        "ScheduleCertificateVersionDeletion",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateVersion/ScheduleCertificateVersionDeletion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScheduleCertificateVersionDeletionRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificates")
                .appendPathParam(request.getCertificateId())
                .appendPathParam("version")
                .appendPathParam(request.getCertificateVersionNumber())
                .appendPathParam("actions")
                .appendPathParam("scheduleDeletion")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ScheduleCertificateVersionDeletionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ScheduleCertificateVersionDeletionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCaBundleResponse> updateCaBundle(
            UpdateCaBundleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCaBundleRequest, UpdateCaBundleResponse>
                    handler) {

        Validate.notBlank(request.getCaBundleId(), "caBundleId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCaBundleDetails(), "updateCaBundleDetails is required");

        return clientCall(request, UpdateCaBundleResponse::builder)
                .logger(LOG, "updateCaBundle")
                .serviceDetails(
                        "CertificatesManagement",
                        "UpdateCaBundle",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CaBundle/UpdateCaBundle")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCaBundleRequest::builder)
                .basePath("/20210224")
                .appendPathParam("caBundles")
                .appendPathParam(request.getCaBundleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.certificatesmanagement.model.CaBundle.class,
                        UpdateCaBundleResponse.Builder::caBundle)
                .handleResponseHeaderString("etag", UpdateCaBundleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCaBundleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCertificateResponse> updateCertificate(
            UpdateCertificateRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCertificateRequest, UpdateCertificateResponse>
                    handler) {

        Validate.notBlank(request.getCertificateId(), "certificateId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCertificateDetails(), "updateCertificateDetails is required");

        return clientCall(request, UpdateCertificateResponse::builder)
                .logger(LOG, "updateCertificate")
                .serviceDetails(
                        "CertificatesManagement",
                        "UpdateCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/Certificate/UpdateCertificate")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCertificateRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificates")
                .appendPathParam(request.getCertificateId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.certificatesmanagement.model.Certificate.class,
                        UpdateCertificateResponse.Builder::certificate)
                .handleResponseHeaderString("etag", UpdateCertificateResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCertificateResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCertificateAuthorityResponse>
            updateCertificateAuthority(
                    UpdateCertificateAuthorityRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateCertificateAuthorityRequest,
                                    UpdateCertificateAuthorityResponse>
                            handler) {

        Validate.notBlank(
                request.getCertificateAuthorityId(), "certificateAuthorityId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCertificateAuthorityDetails(),
                "updateCertificateAuthorityDetails is required");

        return clientCall(request, UpdateCertificateAuthorityResponse::builder)
                .logger(LOG, "updateCertificateAuthority")
                .serviceDetails(
                        "CertificatesManagement",
                        "UpdateCertificateAuthority",
                        "https://docs.oracle.com/iaas/api/#/en/certificatesmgmt/20210224/CertificateAuthority/UpdateCertificateAuthority")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCertificateAuthorityRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificateAuthorities")
                .appendPathParam(request.getCertificateAuthorityId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.certificatesmanagement.model.CertificateAuthority.class,
                        UpdateCertificateAuthorityResponse.Builder::certificateAuthority)
                .handleResponseHeaderString(
                        "etag", UpdateCertificateAuthorityResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCertificateAuthorityResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public CertificatesManagementAsyncClient(
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
    public CertificatesManagementAsyncClient(
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
    public CertificatesManagementAsyncClient(
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
    public CertificatesManagementAsyncClient(
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
    public CertificatesManagementAsyncClient(
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
    public CertificatesManagementAsyncClient(
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
    public CertificatesManagementAsyncClient(
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
