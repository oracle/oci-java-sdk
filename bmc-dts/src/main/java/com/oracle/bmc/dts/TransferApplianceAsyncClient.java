/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.dts.requests.*;
import com.oracle.bmc.dts.responses.*;

import java.util.Objects;

/**
 * Async client implementation for TransferAppliance service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
public class TransferApplianceAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements TransferApplianceAsync {
    /** Service instance for TransferAppliance. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("TRANSFERAPPLIANCE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://datatransfer.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(TransferApplianceAsyncClient.class);

    TransferApplianceAsyncClient(
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
                    Builder, TransferApplianceAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "dts";
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
        public TransferApplianceAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new TransferApplianceAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateTransferApplianceResponse> createTransferAppliance(
            CreateTransferApplianceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTransferApplianceRequest, CreateTransferApplianceResponse>
                    handler) {

        Validate.notBlank(request.getId(), "id must not be blank");

        return clientCall(request, CreateTransferApplianceResponse::builder)
                .logger(LOG, "createTransferAppliance")
                .serviceDetails("TransferAppliance", "CreateTransferAppliance", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTransferApplianceRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferAppliances")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dts.model.TransferAppliance.class,
                        CreateTransferApplianceResponse.Builder::transferAppliance)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTransferApplianceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateTransferApplianceResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTransferApplianceAdminCredentialsResponse>
            createTransferApplianceAdminCredentials(
                    CreateTransferApplianceAdminCredentialsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateTransferApplianceAdminCredentialsRequest,
                                    CreateTransferApplianceAdminCredentialsResponse>
                            handler) {

        Validate.notBlank(request.getId(), "id must not be blank");

        Validate.notBlank(
                request.getTransferApplianceLabel(), "transferApplianceLabel must not be blank");
        Objects.requireNonNull(request.getAdminPublicKey(), "adminPublicKey is required");

        return clientCall(request, CreateTransferApplianceAdminCredentialsResponse::builder)
                .logger(LOG, "createTransferApplianceAdminCredentials")
                .serviceDetails("TransferAppliance", "CreateTransferApplianceAdminCredentials", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTransferApplianceAdminCredentialsRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferAppliances")
                .appendPathParam(request.getTransferApplianceLabel())
                .appendPathParam("admin_credentials")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dts.model.TransferApplianceCertificate.class,
                        CreateTransferApplianceAdminCredentialsResponse.Builder
                                ::transferApplianceCertificate)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateTransferApplianceAdminCredentialsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateTransferApplianceAdminCredentialsResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTransferApplianceResponse> deleteTransferAppliance(
            DeleteTransferApplianceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteTransferApplianceRequest, DeleteTransferApplianceResponse>
                    handler) {

        Validate.notBlank(request.getId(), "id must not be blank");

        Validate.notBlank(
                request.getTransferApplianceLabel(), "transferApplianceLabel must not be blank");

        return clientCall(request, DeleteTransferApplianceResponse::builder)
                .logger(LOG, "deleteTransferAppliance")
                .serviceDetails("TransferAppliance", "DeleteTransferAppliance", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTransferApplianceRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferAppliances")
                .appendPathParam(request.getTransferApplianceLabel())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTransferApplianceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTransferApplianceResponse> getTransferAppliance(
            GetTransferApplianceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTransferApplianceRequest, GetTransferApplianceResponse>
                    handler) {

        Validate.notBlank(request.getId(), "id must not be blank");

        Validate.notBlank(
                request.getTransferApplianceLabel(), "transferApplianceLabel must not be blank");

        return clientCall(request, GetTransferApplianceResponse::builder)
                .logger(LOG, "getTransferAppliance")
                .serviceDetails("TransferAppliance", "GetTransferAppliance", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTransferApplianceRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferAppliances")
                .appendPathParam(request.getTransferApplianceLabel())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.dts.model.TransferAppliance.class,
                        GetTransferApplianceResponse.Builder::transferAppliance)
                .handleResponseHeaderString(
                        "opc-request-id", GetTransferApplianceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetTransferApplianceResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTransferApplianceCertificateAuthorityCertificateResponse>
            getTransferApplianceCertificateAuthorityCertificate(
                    GetTransferApplianceCertificateAuthorityCertificateRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetTransferApplianceCertificateAuthorityCertificateRequest,
                                    GetTransferApplianceCertificateAuthorityCertificateResponse>
                            handler) {

        Validate.notBlank(request.getId(), "id must not be blank");

        Validate.notBlank(
                request.getTransferApplianceLabel(), "transferApplianceLabel must not be blank");

        return clientCall(
                        request,
                        GetTransferApplianceCertificateAuthorityCertificateResponse::builder)
                .logger(LOG, "getTransferApplianceCertificateAuthorityCertificate")
                .serviceDetails(
                        "TransferAppliance",
                        "GetTransferApplianceCertificateAuthorityCertificate",
                        "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTransferApplianceCertificateAuthorityCertificateRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferAppliances")
                .appendPathParam(request.getTransferApplianceLabel())
                .appendPathParam("certificate_authority_certificate")
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.dts.model.TransferApplianceCertificate.class,
                        GetTransferApplianceCertificateAuthorityCertificateResponse.Builder
                                ::transferApplianceCertificate)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetTransferApplianceCertificateAuthorityCertificateResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "etag",
                        GetTransferApplianceCertificateAuthorityCertificateResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTransferApplianceEncryptionPassphraseResponse>
            getTransferApplianceEncryptionPassphrase(
                    GetTransferApplianceEncryptionPassphraseRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetTransferApplianceEncryptionPassphraseRequest,
                                    GetTransferApplianceEncryptionPassphraseResponse>
                            handler) {

        Validate.notBlank(request.getId(), "id must not be blank");

        Validate.notBlank(
                request.getTransferApplianceLabel(), "transferApplianceLabel must not be blank");

        return clientCall(request, GetTransferApplianceEncryptionPassphraseResponse::builder)
                .logger(LOG, "getTransferApplianceEncryptionPassphrase")
                .serviceDetails("TransferAppliance", "GetTransferApplianceEncryptionPassphrase", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTransferApplianceEncryptionPassphraseRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferAppliances")
                .appendPathParam(request.getTransferApplianceLabel())
                .appendPathParam("encryptionPassphrase")
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.dts.model.TransferApplianceEncryptionPassphrase.class,
                        GetTransferApplianceEncryptionPassphraseResponse.Builder
                                ::transferApplianceEncryptionPassphrase)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetTransferApplianceEncryptionPassphraseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetTransferApplianceEncryptionPassphraseResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTransferAppliancesResponse> listTransferAppliances(
            ListTransferAppliancesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTransferAppliancesRequest, ListTransferAppliancesResponse>
                    handler) {

        Validate.notBlank(request.getId(), "id must not be blank");

        return clientCall(request, ListTransferAppliancesResponse::builder)
                .logger(LOG, "listTransferAppliances")
                .serviceDetails("TransferAppliance", "ListTransferAppliances", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTransferAppliancesRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferAppliances")
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.dts.model.MultipleTransferAppliances.class,
                        ListTransferAppliancesResponse.Builder::multipleTransferAppliances)
                .handleResponseHeaderString(
                        "opc-request-id", ListTransferAppliancesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTransferApplianceResponse> updateTransferAppliance(
            UpdateTransferApplianceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTransferApplianceRequest, UpdateTransferApplianceResponse>
                    handler) {

        Validate.notBlank(request.getId(), "id must not be blank");

        Validate.notBlank(
                request.getTransferApplianceLabel(), "transferApplianceLabel must not be blank");
        Objects.requireNonNull(
                request.getUpdateTransferApplianceDetails(),
                "updateTransferApplianceDetails is required");

        return clientCall(request, UpdateTransferApplianceResponse::builder)
                .logger(LOG, "updateTransferAppliance")
                .serviceDetails("TransferAppliance", "UpdateTransferAppliance", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTransferApplianceRequest::builder)
                .basePath("/20171001")
                .appendPathParam("transferJobs")
                .appendPathParam(request.getId())
                .appendPathParam("transferAppliances")
                .appendPathParam(request.getTransferApplianceLabel())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dts.model.TransferAppliance.class,
                        UpdateTransferApplianceResponse.Builder::transferAppliance)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTransferApplianceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateTransferApplianceResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public TransferApplianceAsyncClient(
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
    public TransferApplianceAsyncClient(
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
    public TransferApplianceAsyncClient(
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
    public TransferApplianceAsyncClient(
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
    public TransferApplianceAsyncClient(
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
    public TransferApplianceAsyncClient(
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
    public TransferApplianceAsyncClient(
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
