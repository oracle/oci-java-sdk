/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.artifacts.requests.*;
import com.oracle.bmc.artifacts.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ArtifactsClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements Artifacts {
    /** Service instance for Artifacts. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ARTIFACTS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://artifacts.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ArtifactsClient.class);

    private final ArtifactsWaiters waiters;

    private final ArtifactsPaginators paginators;

    ArtifactsClient(
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
                                    .nameFormat("Artifacts-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new ArtifactsWaiters(executorService, this);

        this.paginators = new ArtifactsPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ArtifactsClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "artifacts";
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
        public ArtifactsClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ArtifactsClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeContainerRepositoryCompartmentResponse changeContainerRepositoryCompartment(
            ChangeContainerRepositoryCompartmentRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");
        Objects.requireNonNull(
                request.getChangeContainerRepositoryCompartmentDetails(),
                "changeContainerRepositoryCompartmentDetails is required");

        return clientCall(request, ChangeContainerRepositoryCompartmentResponse::builder)
                .logger(LOG, "changeContainerRepositoryCompartment")
                .serviceDetails(
                        "Artifacts",
                        "ChangeContainerRepositoryCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/ContainerRepository/ChangeContainerRepositoryCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeContainerRepositoryCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("container")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeContainerRepositoryCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeRepositoryCompartmentResponse changeRepositoryCompartment(
            ChangeRepositoryCompartmentRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");
        Objects.requireNonNull(
                request.getChangeRepositoryCompartmentDetails(),
                "changeRepositoryCompartmentDetails is required");

        return clientCall(request, ChangeRepositoryCompartmentResponse::builder)
                .logger(LOG, "changeRepositoryCompartment")
                .serviceDetails(
                        "Artifacts",
                        "ChangeRepositoryCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/Repository/ChangeRepositoryCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeRepositoryCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeRepositoryCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateContainerImageSignatureResponse createContainerImageSignature(
            CreateContainerImageSignatureRequest request) {
        Objects.requireNonNull(
                request.getCreateContainerImageSignatureDetails(),
                "createContainerImageSignatureDetails is required");

        return clientCall(request, CreateContainerImageSignatureResponse::builder)
                .logger(LOG, "createContainerImageSignature")
                .serviceDetails(
                        "Artifacts",
                        "CreateContainerImageSignature",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/ContainerImageSignature/CreateContainerImageSignature")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateContainerImageSignatureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("container")
                .appendPathParam("imageSignatures")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.artifacts.model.ContainerImageSignature.class,
                        CreateContainerImageSignatureResponse.Builder::containerImageSignature)
                .handleResponseHeaderString(
                        "etag", CreateContainerImageSignatureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateContainerImageSignatureResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateContainerRepositoryResponse createContainerRepository(
            CreateContainerRepositoryRequest request) {
        Objects.requireNonNull(
                request.getCreateContainerRepositoryDetails(),
                "createContainerRepositoryDetails is required");

        return clientCall(request, CreateContainerRepositoryResponse::builder)
                .logger(LOG, "createContainerRepository")
                .serviceDetails(
                        "Artifacts",
                        "CreateContainerRepository",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/ContainerRepository/CreateContainerRepository")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateContainerRepositoryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("container")
                .appendPathParam("repositories")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.artifacts.model.ContainerRepository.class,
                        CreateContainerRepositoryResponse.Builder::containerRepository)
                .handleResponseHeaderString("etag", CreateContainerRepositoryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateContainerRepositoryResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateRepositoryResponse createRepository(CreateRepositoryRequest request) {
        Objects.requireNonNull(
                request.getCreateRepositoryDetails(), "createRepositoryDetails is required");

        return clientCall(request, CreateRepositoryResponse::builder)
                .logger(LOG, "createRepository")
                .serviceDetails(
                        "Artifacts",
                        "CreateRepository",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/Repository/CreateRepository")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRepositoryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("repositories")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.artifacts.model.Repository.class,
                        CreateRepositoryResponse.Builder::repository)
                .handleResponseHeaderString("etag", CreateRepositoryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRepositoryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteContainerImageResponse deleteContainerImage(DeleteContainerImageRequest request) {

        Validate.notBlank(request.getImageId(), "imageId must not be blank");

        return clientCall(request, DeleteContainerImageResponse::builder)
                .logger(LOG, "deleteContainerImage")
                .serviceDetails(
                        "Artifacts",
                        "DeleteContainerImage",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/ContainerImage/DeleteContainerImage")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteContainerImageRequest::builder)
                .basePath("/20160918")
                .appendPathParam("container")
                .appendPathParam("images")
                .appendPathParam(request.getImageId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteContainerImageResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteContainerImageSignatureResponse deleteContainerImageSignature(
            DeleteContainerImageSignatureRequest request) {

        Validate.notBlank(request.getImageSignatureId(), "imageSignatureId must not be blank");

        return clientCall(request, DeleteContainerImageSignatureResponse::builder)
                .logger(LOG, "deleteContainerImageSignature")
                .serviceDetails(
                        "Artifacts",
                        "DeleteContainerImageSignature",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/ContainerImageSignature/DeleteContainerImageSignature")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteContainerImageSignatureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("container")
                .appendPathParam("imageSignatures")
                .appendPathParam(request.getImageSignatureId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteContainerImageSignatureResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteContainerRepositoryResponse deleteContainerRepository(
            DeleteContainerRepositoryRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        return clientCall(request, DeleteContainerRepositoryResponse::builder)
                .logger(LOG, "deleteContainerRepository")
                .serviceDetails(
                        "Artifacts",
                        "DeleteContainerRepository",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/ContainerRepository/DeleteContainerRepository")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteContainerRepositoryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("container")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteContainerRepositoryResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteGenericArtifactResponse deleteGenericArtifact(
            DeleteGenericArtifactRequest request) {

        Validate.notBlank(request.getArtifactId(), "artifactId must not be blank");

        return clientCall(request, DeleteGenericArtifactResponse::builder)
                .logger(LOG, "deleteGenericArtifact")
                .serviceDetails(
                        "Artifacts",
                        "DeleteGenericArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/GenericArtifact/DeleteGenericArtifact")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteGenericArtifactRequest::builder)
                .basePath("/20160918")
                .appendPathParam("generic")
                .appendPathParam("artifacts")
                .appendPathParam(request.getArtifactId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteGenericArtifactResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteGenericArtifactByPathResponse deleteGenericArtifactByPath(
            DeleteGenericArtifactByPathRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        Validate.notBlank(request.getArtifactPath(), "artifactPath must not be blank");

        Validate.notBlank(request.getVersion(), "version must not be blank");

        return clientCall(request, DeleteGenericArtifactByPathResponse::builder)
                .logger(LOG, "deleteGenericArtifactByPath")
                .serviceDetails(
                        "Artifacts",
                        "DeleteGenericArtifactByPath",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/GenericArtifact/DeleteGenericArtifactByPath")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteGenericArtifactByPathRequest::builder)
                .basePath("/20160918")
                .appendPathParam("generic")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("artifactPaths")
                .appendPathParam(request.getArtifactPath())
                .appendPathParam("versions")
                .appendPathParam(request.getVersion())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteGenericArtifactByPathResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteRepositoryResponse deleteRepository(DeleteRepositoryRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        return clientCall(request, DeleteRepositoryResponse::builder)
                .logger(LOG, "deleteRepository")
                .serviceDetails(
                        "Artifacts",
                        "DeleteRepository",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/Repository/DeleteRepository")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRepositoryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRepositoryResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetContainerConfigurationResponse getContainerConfiguration(
            GetContainerConfigurationRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetContainerConfigurationResponse::builder)
                .logger(LOG, "getContainerConfiguration")
                .serviceDetails(
                        "Artifacts",
                        "GetContainerConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/ContainerConfiguration/GetContainerConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetContainerConfigurationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("container")
                .appendPathParam("configuration")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.artifacts.model.ContainerConfiguration.class,
                        GetContainerConfigurationResponse.Builder::containerConfiguration)
                .handleResponseHeaderString("etag", GetContainerConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetContainerConfigurationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetContainerImageResponse getContainerImage(GetContainerImageRequest request) {

        Validate.notBlank(request.getImageId(), "imageId must not be blank");

        return clientCall(request, GetContainerImageResponse::builder)
                .logger(LOG, "getContainerImage")
                .serviceDetails(
                        "Artifacts",
                        "GetContainerImage",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/ContainerImage/GetContainerImage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetContainerImageRequest::builder)
                .basePath("/20160918")
                .appendPathParam("container")
                .appendPathParam("images")
                .appendPathParam(request.getImageId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.artifacts.model.ContainerImage.class,
                        GetContainerImageResponse.Builder::containerImage)
                .handleResponseHeaderString("etag", GetContainerImageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetContainerImageResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetContainerImageSignatureResponse getContainerImageSignature(
            GetContainerImageSignatureRequest request) {

        Validate.notBlank(request.getImageSignatureId(), "imageSignatureId must not be blank");

        return clientCall(request, GetContainerImageSignatureResponse::builder)
                .logger(LOG, "getContainerImageSignature")
                .serviceDetails(
                        "Artifacts",
                        "GetContainerImageSignature",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/ContainerImageSignature/GetContainerImageSignature")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetContainerImageSignatureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("container")
                .appendPathParam("imageSignatures")
                .appendPathParam(request.getImageSignatureId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.artifacts.model.ContainerImageSignature.class,
                        GetContainerImageSignatureResponse.Builder::containerImageSignature)
                .handleResponseHeaderString(
                        "etag", GetContainerImageSignatureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetContainerImageSignatureResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetContainerRepositoryResponse getContainerRepository(
            GetContainerRepositoryRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        return clientCall(request, GetContainerRepositoryResponse::builder)
                .logger(LOG, "getContainerRepository")
                .serviceDetails(
                        "Artifacts",
                        "GetContainerRepository",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/ContainerRepository/GetContainerRepository")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetContainerRepositoryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("container")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.artifacts.model.ContainerRepository.class,
                        GetContainerRepositoryResponse.Builder::containerRepository)
                .handleResponseHeaderString("etag", GetContainerRepositoryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetContainerRepositoryResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetGenericArtifactResponse getGenericArtifact(GetGenericArtifactRequest request) {

        Validate.notBlank(request.getArtifactId(), "artifactId must not be blank");

        return clientCall(request, GetGenericArtifactResponse::builder)
                .logger(LOG, "getGenericArtifact")
                .serviceDetails(
                        "Artifacts",
                        "GetGenericArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/GenericArtifact/GetGenericArtifact")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGenericArtifactRequest::builder)
                .basePath("/20160918")
                .appendPathParam("generic")
                .appendPathParam("artifacts")
                .appendPathParam(request.getArtifactId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.artifacts.model.GenericArtifact.class,
                        GetGenericArtifactResponse.Builder::genericArtifact)
                .handleResponseHeaderString("etag", GetGenericArtifactResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetGenericArtifactResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetGenericArtifactByPathResponse getGenericArtifactByPath(
            GetGenericArtifactByPathRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        Validate.notBlank(request.getArtifactPath(), "artifactPath must not be blank");

        Validate.notBlank(request.getVersion(), "version must not be blank");

        return clientCall(request, GetGenericArtifactByPathResponse::builder)
                .logger(LOG, "getGenericArtifactByPath")
                .serviceDetails(
                        "Artifacts",
                        "GetGenericArtifactByPath",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/GenericArtifact/GetGenericArtifactByPath")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGenericArtifactByPathRequest::builder)
                .basePath("/20160918")
                .appendPathParam("generic")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("artifactPaths")
                .appendPathParam(request.getArtifactPath())
                .appendPathParam("versions")
                .appendPathParam(request.getVersion())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.artifacts.model.GenericArtifact.class,
                        GetGenericArtifactByPathResponse.Builder::genericArtifact)
                .handleResponseHeaderString("etag", GetGenericArtifactByPathResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetGenericArtifactByPathResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetRepositoryResponse getRepository(GetRepositoryRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        return clientCall(request, GetRepositoryResponse::builder)
                .logger(LOG, "getRepository")
                .serviceDetails(
                        "Artifacts",
                        "GetRepository",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/Repository/GetRepository")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRepositoryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.artifacts.model.Repository.class,
                        GetRepositoryResponse.Builder::repository)
                .handleResponseHeaderString("etag", GetRepositoryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRepositoryResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListContainerImageSignaturesResponse listContainerImageSignatures(
            ListContainerImageSignaturesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListContainerImageSignaturesResponse::builder)
                .logger(LOG, "listContainerImageSignatures")
                .serviceDetails(
                        "Artifacts",
                        "ListContainerImageSignatures",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/ContainerImageSignatureSummary/ListContainerImageSignatures")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListContainerImageSignaturesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("container")
                .appendPathParam("imageSignatures")
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("imageId", request.getImageId())
                .appendQueryParam("repositoryId", request.getRepositoryId())
                .appendQueryParam("repositoryName", request.getRepositoryName())
                .appendQueryParam("imageDigest", request.getImageDigest())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("kmsKeyId", request.getKmsKeyId())
                .appendQueryParam("kmsKeyVersionId", request.getKmsKeyVersionId())
                .appendEnumQueryParam("signingAlgorithm", request.getSigningAlgorithm())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.artifacts.model.ContainerImageSignatureCollection.class,
                        ListContainerImageSignaturesResponse.Builder
                                ::containerImageSignatureCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListContainerImageSignaturesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListContainerImageSignaturesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListContainerImagesResponse listContainerImages(ListContainerImagesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListContainerImagesResponse::builder)
                .logger(LOG, "listContainerImages")
                .serviceDetails(
                        "Artifacts",
                        "ListContainerImages",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/ContainerImageSummary/ListContainerImages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListContainerImagesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("container")
                .appendPathParam("images")
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("imageId", request.getImageId())
                .appendQueryParam("isVersioned", request.getIsVersioned())
                .appendQueryParam("repositoryId", request.getRepositoryId())
                .appendQueryParam("repositoryName", request.getRepositoryName())
                .appendQueryParam("version", request.getVersion())
                .appendQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.artifacts.model.ContainerImageCollection.class,
                        ListContainerImagesResponse.Builder::containerImageCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListContainerImagesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListContainerImagesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListContainerRepositoriesResponse listContainerRepositories(
            ListContainerRepositoriesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListContainerRepositoriesResponse::builder)
                .logger(LOG, "listContainerRepositories")
                .serviceDetails(
                        "Artifacts",
                        "ListContainerRepositories",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/ContainerRepository/ListContainerRepositories")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListContainerRepositoriesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("container")
                .appendPathParam("repositories")
                .appendQueryParam("compartmentIdInSubtree", request.getCompartmentIdInSubtree())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("repositoryId", request.getRepositoryId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("isPublic", request.getIsPublic())
                .appendQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.artifacts.model.ContainerRepositoryCollection.class,
                        ListContainerRepositoriesResponse.Builder::containerRepositoryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListContainerRepositoriesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListContainerRepositoriesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListGenericArtifactsResponse listGenericArtifacts(ListGenericArtifactsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getRepositoryId(), "repositoryId is required");

        return clientCall(request, ListGenericArtifactsResponse::builder)
                .logger(LOG, "listGenericArtifacts")
                .serviceDetails(
                        "Artifacts",
                        "ListGenericArtifacts",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/GenericArtifact/ListGenericArtifacts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGenericArtifactsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("generic")
                .appendPathParam("artifacts")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("repositoryId", request.getRepositoryId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("artifactPath", request.getArtifactPath())
                .appendQueryParam("version", request.getVersion())
                .appendQueryParam("sha256", request.getSha256())
                .appendQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.artifacts.model.GenericArtifactCollection.class,
                        ListGenericArtifactsResponse.Builder::genericArtifactCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListGenericArtifactsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListGenericArtifactsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListRepositoriesResponse listRepositories(ListRepositoriesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListRepositoriesResponse::builder)
                .logger(LOG, "listRepositories")
                .serviceDetails(
                        "Artifacts",
                        "ListRepositories",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/Repository/ListRepositories")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRepositoriesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("repositories")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("isImmutable", request.getIsImmutable())
                .appendQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.artifacts.model.RepositoryCollection.class,
                        ListRepositoriesResponse.Builder::repositoryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListRepositoriesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListRepositoriesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RemoveContainerVersionResponse removeContainerVersion(
            RemoveContainerVersionRequest request) {

        Validate.notBlank(request.getImageId(), "imageId must not be blank");
        Objects.requireNonNull(
                request.getRemoveContainerVersionDetails(),
                "removeContainerVersionDetails is required");

        return clientCall(request, RemoveContainerVersionResponse::builder)
                .logger(LOG, "removeContainerVersion")
                .serviceDetails(
                        "Artifacts",
                        "RemoveContainerVersion",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/ContainerImage/RemoveContainerVersion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveContainerVersionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("container")
                .appendPathParam("images")
                .appendPathParam(request.getImageId())
                .appendPathParam("actions")
                .appendPathParam("removeVersion")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.artifacts.model.ContainerImage.class,
                        RemoveContainerVersionResponse.Builder::containerImage)
                .handleResponseHeaderString("etag", RemoveContainerVersionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveContainerVersionResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RestoreContainerImageResponse restoreContainerImage(
            RestoreContainerImageRequest request) {

        Validate.notBlank(request.getImageId(), "imageId must not be blank");
        Objects.requireNonNull(
                request.getRestoreContainerImageDetails(),
                "restoreContainerImageDetails is required");

        return clientCall(request, RestoreContainerImageResponse::builder)
                .logger(LOG, "restoreContainerImage")
                .serviceDetails(
                        "Artifacts",
                        "RestoreContainerImage",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/ContainerImage/RestoreContainerImage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestoreContainerImageRequest::builder)
                .basePath("/20160918")
                .appendPathParam("container")
                .appendPathParam("images")
                .appendPathParam(request.getImageId())
                .appendPathParam("actions")
                .appendPathParam("restore")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.artifacts.model.ContainerImage.class,
                        RestoreContainerImageResponse.Builder::containerImage)
                .handleResponseHeaderString("etag", RestoreContainerImageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RestoreContainerImageResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateContainerConfigurationResponse updateContainerConfiguration(
            UpdateContainerConfigurationRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getUpdateContainerConfigurationDetails(),
                "updateContainerConfigurationDetails is required");

        return clientCall(request, UpdateContainerConfigurationResponse::builder)
                .logger(LOG, "updateContainerConfiguration")
                .serviceDetails(
                        "Artifacts",
                        "UpdateContainerConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/ContainerConfiguration/UpdateContainerConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateContainerConfigurationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("container")
                .appendPathParam("configuration")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.artifacts.model.ContainerConfiguration.class,
                        UpdateContainerConfigurationResponse.Builder::containerConfiguration)
                .handleResponseHeaderString(
                        "etag", UpdateContainerConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateContainerConfigurationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateContainerImageResponse updateContainerImage(UpdateContainerImageRequest request) {

        Validate.notBlank(request.getImageId(), "imageId must not be blank");
        Objects.requireNonNull(
                request.getUpdateContainerImageDetails(),
                "updateContainerImageDetails is required");

        return clientCall(request, UpdateContainerImageResponse::builder)
                .logger(LOG, "updateContainerImage")
                .serviceDetails(
                        "Artifacts",
                        "UpdateContainerImage",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/ContainerImage/UpdateContainerImage")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateContainerImageRequest::builder)
                .basePath("/20160918")
                .appendPathParam("container")
                .appendPathParam("images")
                .appendPathParam(request.getImageId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.artifacts.model.ContainerImage.class,
                        UpdateContainerImageResponse.Builder::containerImage)
                .handleResponseHeaderString("etag", UpdateContainerImageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateContainerImageResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateContainerImageSignatureResponse updateContainerImageSignature(
            UpdateContainerImageSignatureRequest request) {

        Validate.notBlank(request.getImageSignatureId(), "imageSignatureId must not be blank");
        Objects.requireNonNull(
                request.getUpdateContainerImageSignatureDetails(),
                "updateContainerImageSignatureDetails is required");

        return clientCall(request, UpdateContainerImageSignatureResponse::builder)
                .logger(LOG, "updateContainerImageSignature")
                .serviceDetails(
                        "Artifacts",
                        "UpdateContainerImageSignature",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/ContainerImageSignature/UpdateContainerImageSignature")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateContainerImageSignatureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("container")
                .appendPathParam("imageSignatures")
                .appendPathParam(request.getImageSignatureId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.artifacts.model.ContainerImageSignature.class,
                        UpdateContainerImageSignatureResponse.Builder::containerImageSignature)
                .handleResponseHeaderString(
                        "etag", UpdateContainerImageSignatureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateContainerImageSignatureResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateContainerRepositoryResponse updateContainerRepository(
            UpdateContainerRepositoryRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");
        Objects.requireNonNull(
                request.getUpdateContainerRepositoryDetails(),
                "updateContainerRepositoryDetails is required");

        return clientCall(request, UpdateContainerRepositoryResponse::builder)
                .logger(LOG, "updateContainerRepository")
                .serviceDetails(
                        "Artifacts",
                        "UpdateContainerRepository",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/ContainerRepository/UpdateContainerRepository")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateContainerRepositoryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("container")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.artifacts.model.ContainerRepository.class,
                        UpdateContainerRepositoryResponse.Builder::containerRepository)
                .handleResponseHeaderString("etag", UpdateContainerRepositoryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateContainerRepositoryResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateGenericArtifactResponse updateGenericArtifact(
            UpdateGenericArtifactRequest request) {

        Validate.notBlank(request.getArtifactId(), "artifactId must not be blank");
        Objects.requireNonNull(
                request.getUpdateGenericArtifactDetails(),
                "updateGenericArtifactDetails is required");

        return clientCall(request, UpdateGenericArtifactResponse::builder)
                .logger(LOG, "updateGenericArtifact")
                .serviceDetails(
                        "Artifacts",
                        "UpdateGenericArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/GenericArtifact/UpdateGenericArtifact")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateGenericArtifactRequest::builder)
                .basePath("/20160918")
                .appendPathParam("generic")
                .appendPathParam("artifacts")
                .appendPathParam(request.getArtifactId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.artifacts.model.GenericArtifact.class,
                        UpdateGenericArtifactResponse.Builder::genericArtifact)
                .handleResponseHeaderString("etag", UpdateGenericArtifactResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateGenericArtifactResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateGenericArtifactByPathResponse updateGenericArtifactByPath(
            UpdateGenericArtifactByPathRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        Validate.notBlank(request.getArtifactPath(), "artifactPath must not be blank");

        Validate.notBlank(request.getVersion(), "version must not be blank");
        Objects.requireNonNull(
                request.getUpdateGenericArtifactByPathDetails(),
                "updateGenericArtifactByPathDetails is required");

        return clientCall(request, UpdateGenericArtifactByPathResponse::builder)
                .logger(LOG, "updateGenericArtifactByPath")
                .serviceDetails(
                        "Artifacts",
                        "UpdateGenericArtifactByPath",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/GenericArtifact/UpdateGenericArtifactByPath")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateGenericArtifactByPathRequest::builder)
                .basePath("/20160918")
                .appendPathParam("generic")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("artifactPaths")
                .appendPathParam(request.getArtifactPath())
                .appendPathParam("versions")
                .appendPathParam(request.getVersion())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.artifacts.model.GenericArtifact.class,
                        UpdateGenericArtifactByPathResponse.Builder::genericArtifact)
                .handleResponseHeaderString(
                        "etag", UpdateGenericArtifactByPathResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateGenericArtifactByPathResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateRepositoryResponse updateRepository(UpdateRepositoryRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");
        Objects.requireNonNull(
                request.getUpdateRepositoryDetails(), "updateRepositoryDetails is required");

        return clientCall(request, UpdateRepositoryResponse::builder)
                .logger(LOG, "updateRepository")
                .serviceDetails(
                        "Artifacts",
                        "UpdateRepository",
                        "https://docs.oracle.com/iaas/api/#/en/registry/20160918/Repository/UpdateRepository")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRepositoryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.artifacts.model.Repository.class,
                        UpdateRepositoryResponse.Builder::repository)
                .handleResponseHeaderString("etag", UpdateRepositoryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRepositoryResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ArtifactsWaiters getWaiters() {
        return waiters;
    }

    @Override
    public ArtifactsPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ArtifactsClient(
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
    public ArtifactsClient(
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
    public ArtifactsClient(
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
    public ArtifactsClient(
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
    public ArtifactsClient(
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
    public ArtifactsClient(
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
    public ArtifactsClient(
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
    public ArtifactsClient(
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
