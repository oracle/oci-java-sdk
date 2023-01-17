/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.certificatesmanagement.requests.*;
import com.oracle.bmc.certificatesmanagement.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public class CertificatesManagementClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements CertificatesManagement {
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

    private final CertificatesManagementWaiters waiters;

    private final CertificatesManagementPaginators paginators;

    private CertificatesManagementClient(
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
                                    .nameFormat("CertificatesManagement-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new CertificatesManagementWaiters(executorService, this);

        this.paginators = new CertificatesManagementPaginators(this);
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
                    Builder, CertificatesManagementClient> {
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
        public CertificatesManagementClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new CertificatesManagementClient(
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
    public CancelCertificateAuthorityDeletionResponse cancelCertificateAuthorityDeletion(
            CancelCertificateAuthorityDeletionRequest request) {

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
                .callSync();
    }

    @Override
    public CancelCertificateAuthorityVersionDeletionResponse
            cancelCertificateAuthorityVersionDeletion(
                    CancelCertificateAuthorityVersionDeletionRequest request) {

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
                .callSync();
    }

    @Override
    public CancelCertificateDeletionResponse cancelCertificateDeletion(
            CancelCertificateDeletionRequest request) {

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
                .callSync();
    }

    @Override
    public CancelCertificateVersionDeletionResponse cancelCertificateVersionDeletion(
            CancelCertificateVersionDeletionRequest request) {

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
                .callSync();
    }

    @Override
    public ChangeCaBundleCompartmentResponse changeCaBundleCompartment(
            ChangeCaBundleCompartmentRequest request) {

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
                .callSync();
    }

    @Override
    public ChangeCertificateAuthorityCompartmentResponse changeCertificateAuthorityCompartment(
            ChangeCertificateAuthorityCompartmentRequest request) {

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
                .callSync();
    }

    @Override
    public ChangeCertificateCompartmentResponse changeCertificateCompartment(
            ChangeCertificateCompartmentRequest request) {

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
                .callSync();
    }

    @Override
    public CreateCaBundleResponse createCaBundle(CreateCaBundleRequest request) {
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
                .callSync();
    }

    @Override
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) {
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
                .callSync();
    }

    @Override
    public CreateCertificateAuthorityResponse createCertificateAuthority(
            CreateCertificateAuthorityRequest request) {
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
                .callSync();
    }

    @Override
    public DeleteCaBundleResponse deleteCaBundle(DeleteCaBundleRequest request) {

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
                .callSync();
    }

    @Override
    public GetAssociationResponse getAssociation(GetAssociationRequest request) {

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
                .callSync();
    }

    @Override
    public GetCaBundleResponse getCaBundle(GetCaBundleRequest request) {

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
                .callSync();
    }

    @Override
    public GetCertificateResponse getCertificate(GetCertificateRequest request) {

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
                .callSync();
    }

    @Override
    public GetCertificateAuthorityResponse getCertificateAuthority(
            GetCertificateAuthorityRequest request) {

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
                .callSync();
    }

    @Override
    public GetCertificateAuthorityVersionResponse getCertificateAuthorityVersion(
            GetCertificateAuthorityVersionRequest request) {

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
                .callSync();
    }

    @Override
    public GetCertificateVersionResponse getCertificateVersion(
            GetCertificateVersionRequest request) {

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
                .callSync();
    }

    @Override
    public ListAssociationsResponse listAssociations(ListAssociationsRequest request) {

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
                .callSync();
    }

    @Override
    public ListCaBundlesResponse listCaBundles(ListCaBundlesRequest request) {

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
                .callSync();
    }

    @Override
    public ListCertificateAuthoritiesResponse listCertificateAuthorities(
            ListCertificateAuthoritiesRequest request) {

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
                .callSync();
    }

    @Override
    public ListCertificateAuthorityVersionsResponse listCertificateAuthorityVersions(
            ListCertificateAuthorityVersionsRequest request) {

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
                .callSync();
    }

    @Override
    public ListCertificateVersionsResponse listCertificateVersions(
            ListCertificateVersionsRequest request) {

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
                .callSync();
    }

    @Override
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {

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
                .callSync();
    }

    @Override
    public RevokeCertificateAuthorityVersionResponse revokeCertificateAuthorityVersion(
            RevokeCertificateAuthorityVersionRequest request) {

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
                .callSync();
    }

    @Override
    public RevokeCertificateVersionResponse revokeCertificateVersion(
            RevokeCertificateVersionRequest request) {

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
                .callSync();
    }

    @Override
    public ScheduleCertificateAuthorityDeletionResponse scheduleCertificateAuthorityDeletion(
            ScheduleCertificateAuthorityDeletionRequest request) {

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
                .callSync();
    }

    @Override
    public ScheduleCertificateAuthorityVersionDeletionResponse
            scheduleCertificateAuthorityVersionDeletion(
                    ScheduleCertificateAuthorityVersionDeletionRequest request) {

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
                .callSync();
    }

    @Override
    public ScheduleCertificateDeletionResponse scheduleCertificateDeletion(
            ScheduleCertificateDeletionRequest request) {

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
                .callSync();
    }

    @Override
    public ScheduleCertificateVersionDeletionResponse scheduleCertificateVersionDeletion(
            ScheduleCertificateVersionDeletionRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateCaBundleResponse updateCaBundle(UpdateCaBundleRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateCertificateResponse updateCertificate(UpdateCertificateRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateCertificateAuthorityResponse updateCertificateAuthority(
            UpdateCertificateAuthorityRequest request) {

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
                .callSync();
    }

    @Override
    public CertificatesManagementWaiters getWaiters() {
        return waiters;
    }

    @Override
    public CertificatesManagementPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public CertificatesManagementClient(
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
    public CertificatesManagementClient(
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
    public CertificatesManagementClient(
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
    public CertificatesManagementClient(
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
    public CertificatesManagementClient(
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
    public CertificatesManagementClient(
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
    public CertificatesManagementClient(
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
    public CertificatesManagementClient(
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
