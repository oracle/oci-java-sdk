/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificates;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.certificates.requests.*;
import com.oracle.bmc.certificates.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Certificates service. <br>
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
public class CertificatesAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements CertificatesAsync {
    /** Service instance for Certificates. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("CERTIFICATES")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://certificates.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CertificatesAsyncClient.class);

    CertificatesAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, CertificatesAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "certificates";
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
        public CertificatesAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new CertificatesAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<GetCaBundleResponse> getCaBundle(
            GetCaBundleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetCaBundleRequest, GetCaBundleResponse>
                    handler) {

        Validate.notBlank(request.getCaBundleId(), "caBundleId must not be blank");

        return clientCall(request, GetCaBundleResponse::builder)
                .logger(LOG, "getCaBundle")
                .serviceDetails(
                        "Certificates",
                        "GetCaBundle",
                        "https://docs.oracle.com/iaas/api/#/en/certificates/20210224/CaBundle/GetCaBundle")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCaBundleRequest::builder)
                .basePath("/20210224")
                .appendPathParam("caBundles")
                .appendPathParam(request.getCaBundleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.certificates.model.CaBundle.class,
                        GetCaBundleResponse.Builder::caBundle)
                .handleResponseHeaderString("etag", GetCaBundleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCaBundleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCertificateAuthorityBundleResponse>
            getCertificateAuthorityBundle(
                    GetCertificateAuthorityBundleRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetCertificateAuthorityBundleRequest,
                                    GetCertificateAuthorityBundleResponse>
                            handler) {

        Validate.notBlank(
                request.getCertificateAuthorityId(), "certificateAuthorityId must not be blank");

        return clientCall(request, GetCertificateAuthorityBundleResponse::builder)
                .logger(LOG, "getCertificateAuthorityBundle")
                .serviceDetails(
                        "Certificates",
                        "GetCertificateAuthorityBundle",
                        "https://docs.oracle.com/iaas/api/#/en/certificates/20210224/CertificateAuthorityBundle/GetCertificateAuthorityBundle")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCertificateAuthorityBundleRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificateAuthorityBundles")
                .appendPathParam(request.getCertificateAuthorityId())
                .appendQueryParam("versionNumber", request.getVersionNumber())
                .appendQueryParam(
                        "certificateAuthorityVersionName",
                        request.getCertificateAuthorityVersionName())
                .appendEnumQueryParam("stage", request.getStage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.certificates.model.CertificateAuthorityBundle.class,
                        GetCertificateAuthorityBundleResponse.Builder::certificateAuthorityBundle)
                .handleResponseHeaderString(
                        "etag", GetCertificateAuthorityBundleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetCertificateAuthorityBundleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCertificateBundleResponse> getCertificateBundle(
            GetCertificateBundleRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCertificateBundleRequest, GetCertificateBundleResponse>
                    handler) {

        Validate.notBlank(request.getCertificateId(), "certificateId must not be blank");

        return clientCall(request, GetCertificateBundleResponse::builder)
                .logger(LOG, "getCertificateBundle")
                .serviceDetails(
                        "Certificates",
                        "GetCertificateBundle",
                        "https://docs.oracle.com/iaas/api/#/en/certificates/20210224/CertificateBundle/GetCertificateBundle")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCertificateBundleRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificateBundles")
                .appendPathParam(request.getCertificateId())
                .appendQueryParam("versionNumber", request.getVersionNumber())
                .appendQueryParam("certificateVersionName", request.getCertificateVersionName())
                .appendEnumQueryParam("stage", request.getStage())
                .appendEnumQueryParam("certificateBundleType", request.getCertificateBundleType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.certificates.model.CertificateBundle.class,
                        GetCertificateBundleResponse.Builder::certificateBundle)
                .handleResponseHeaderString("etag", GetCertificateBundleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCertificateBundleResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCertificateAuthorityBundleVersionsResponse>
            listCertificateAuthorityBundleVersions(
                    ListCertificateAuthorityBundleVersionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListCertificateAuthorityBundleVersionsRequest,
                                    ListCertificateAuthorityBundleVersionsResponse>
                            handler) {

        Validate.notBlank(
                request.getCertificateAuthorityId(), "certificateAuthorityId must not be blank");

        return clientCall(request, ListCertificateAuthorityBundleVersionsResponse::builder)
                .logger(LOG, "listCertificateAuthorityBundleVersions")
                .serviceDetails(
                        "Certificates",
                        "ListCertificateAuthorityBundleVersions",
                        "https://docs.oracle.com/iaas/api/#/en/certificates/20210224/CertificateAuthorityBundleVersionSummary/ListCertificateAuthorityBundleVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCertificateAuthorityBundleVersionsRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificateAuthorityBundles")
                .appendPathParam(request.getCertificateAuthorityId())
                .appendPathParam("versions")
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.certificates.model
                                .CertificateAuthorityBundleVersionCollection.class,
                        ListCertificateAuthorityBundleVersionsResponse.Builder
                                ::certificateAuthorityBundleVersionCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListCertificateAuthorityBundleVersionsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCertificateBundleVersionsResponse>
            listCertificateBundleVersions(
                    ListCertificateBundleVersionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListCertificateBundleVersionsRequest,
                                    ListCertificateBundleVersionsResponse>
                            handler) {

        Validate.notBlank(request.getCertificateId(), "certificateId must not be blank");

        return clientCall(request, ListCertificateBundleVersionsResponse::builder)
                .logger(LOG, "listCertificateBundleVersions")
                .serviceDetails(
                        "Certificates",
                        "ListCertificateBundleVersions",
                        "https://docs.oracle.com/iaas/api/#/en/certificates/20210224/CertificateBundleVersionSummary/ListCertificateBundleVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCertificateBundleVersionsRequest::builder)
                .basePath("/20210224")
                .appendPathParam("certificateBundles")
                .appendPathParam(request.getCertificateId())
                .appendPathParam("versions")
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.certificates.model.CertificateBundleVersionCollection.class,
                        ListCertificateBundleVersionsResponse.Builder
                                ::certificateBundleVersionCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListCertificateBundleVersionsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public CertificatesAsyncClient(
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
    public CertificatesAsyncClient(
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
    public CertificatesAsyncClient(
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
    public CertificatesAsyncClient(
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
    public CertificatesAsyncClient(
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
    public CertificatesAsyncClient(
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
    public CertificatesAsyncClient(
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
