/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.genericartifactscontent;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.genericartifactscontent.requests.*;
import com.oracle.bmc.genericartifactscontent.responses.*;

import java.util.Objects;

/**
 * Async client implementation for GenericArtifactsContent service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GenericArtifactsContentAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements GenericArtifactsContentAsync {
    /** Service instance for GenericArtifactsContent. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("GENERICARTIFACTSCONTENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://generic.artifacts.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GenericArtifactsContentAsyncClient.class);

    GenericArtifactsContentAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    GenericArtifactsContentAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "GenericArtifactsContentAsyncClient",
                            "getGenericArtifactContent,getGenericArtifactContentByPath"));
        }
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
                    Builder, GenericArtifactsContentAsyncClient> {
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "genericartifactscontent";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Enable/disable the stream warnings for the client
         *
         * @param isStreamWarningEnabled executorService
         * @return this builder
         */
        public Builder isStreamWarningEnabled(boolean isStreamWarningEnabled) {
            this.isStreamWarningEnabled = isStreamWarningEnabled;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public GenericArtifactsContentAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new GenericArtifactsContentAsyncClient(
                    this, authenticationDetailsProvider, isStreamWarningEnabled);
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
    public java.util.concurrent.Future<GetGenericArtifactContentResponse> getGenericArtifactContent(
            GetGenericArtifactContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetGenericArtifactContentRequest, GetGenericArtifactContentResponse>
                    handler) {

        Validate.notBlank(request.getArtifactId(), "artifactId must not be blank");

        return clientCall(request, GetGenericArtifactContentResponse::builder)
                .logger(LOG, "getGenericArtifactContent")
                .serviceDetails(
                        "GenericArtifactsContent",
                        "GetGenericArtifactContent",
                        "https://docs.oracle.com/iaas/api/#/en/generic/20160918/GenericArtifact/GetGenericArtifactContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGenericArtifactContentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("generic")
                .appendPathParam("artifacts")
                .appendPathParam(request.getArtifactId())
                .appendPathParam("content")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        java.io.InputStream.class,
                        GetGenericArtifactContentResponse.Builder::inputStream)
                .handleResponseHeaderString("etag", GetGenericArtifactContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetGenericArtifactContentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetGenericArtifactContentByPathResponse>
            getGenericArtifactContentByPath(
                    GetGenericArtifactContentByPathRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetGenericArtifactContentByPathRequest,
                                    GetGenericArtifactContentByPathResponse>
                            handler) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        Validate.notBlank(request.getArtifactPath(), "artifactPath must not be blank");

        Validate.notBlank(request.getVersion(), "version must not be blank");

        return clientCall(request, GetGenericArtifactContentByPathResponse::builder)
                .logger(LOG, "getGenericArtifactContentByPath")
                .serviceDetails(
                        "GenericArtifactsContent",
                        "GetGenericArtifactContentByPath",
                        "https://docs.oracle.com/iaas/api/#/en/generic/20160918/GenericArtifact/GetGenericArtifactContentByPath")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGenericArtifactContentByPathRequest::builder)
                .basePath("/20160918")
                .appendPathParam("generic")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("artifactPaths")
                .appendPathParam(request.getArtifactPath())
                .appendPathParam("versions")
                .appendPathParam(request.getVersion())
                .appendPathParam("content")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        java.io.InputStream.class,
                        GetGenericArtifactContentByPathResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "etag", GetGenericArtifactContentByPathResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetGenericArtifactContentByPathResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PutGenericArtifactContentByPathResponse>
            putGenericArtifactContentByPath(
                    PutGenericArtifactContentByPathRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PutGenericArtifactContentByPathRequest,
                                    PutGenericArtifactContentByPathResponse>
                            handler) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        Validate.notBlank(request.getArtifactPath(), "artifactPath must not be blank");

        Validate.notBlank(request.getVersion(), "version must not be blank");
        Objects.requireNonNull(
                request.getGenericArtifactContentBody(), "genericArtifactContentBody is required");

        return clientCall(request, PutGenericArtifactContentByPathResponse::builder)
                .logger(LOG, "putGenericArtifactContentByPath")
                .serviceDetails(
                        "GenericArtifactsContent",
                        "PutGenericArtifactContentByPath",
                        "https://docs.oracle.com/iaas/api/#/en/generic/20160918/GenericArtifact/PutGenericArtifactContentByPath")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutGenericArtifactContentByPathRequest::builder)
                .obmcsSigningStrategy(com.oracle.bmc.http.signing.SigningStrategy.EXCLUDE_BODY)
                .basePath("/20160918")
                .appendPathParam("generic")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("artifactPaths")
                .appendPathParam(request.getArtifactPath())
                .appendPathParam("versions")
                .appendPathParam(request.getVersion())
                .appendPathParam("content")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBinaryRequestBody()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.genericartifactscontent.model.GenericArtifact.class,
                        PutGenericArtifactContentByPathResponse.Builder::genericArtifact)
                .handleResponseHeaderString(
                        "etag", PutGenericArtifactContentByPathResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        PutGenericArtifactContentByPathResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public GenericArtifactsContentAsyncClient(
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
    public GenericArtifactsContentAsyncClient(
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
    public GenericArtifactsContentAsyncClient(
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
    public GenericArtifactsContentAsyncClient(
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
    public GenericArtifactsContentAsyncClient(
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
    public GenericArtifactsContentAsyncClient(
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
    public GenericArtifactsContentAsyncClient(
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
