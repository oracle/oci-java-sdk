/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;

import java.util.Objects;

/**
 * Async client implementation for KmsCrypto service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public class KmsCryptoAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements KmsCryptoAsync {
    /** Service instance for KmsCrypto. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("KMSCRYPTO")
                    .serviceEndpointPrefix("kms")
                    .serviceEndpointTemplate("https://kms.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(KmsCryptoAsyncClient.class);

    KmsCryptoAsyncClient(
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
    public static com.oracle.bmc.keymanagement.KmsCryptoAsyncClientBuilder builder() {
        return new com.oracle.bmc.keymanagement.KmsCryptoAsyncClientBuilder(SERVICE);
    }

    @Override
    public java.util.concurrent.Future<DecryptResponse> decrypt(
            DecryptRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DecryptRequest, DecryptResponse> handler) {
        Objects.requireNonNull(request.getDecryptDataDetails(), "decryptDataDetails is required");

        return clientCall(request, DecryptResponse::builder)
                .logger(LOG, "decrypt")
                .serviceDetails(
                        "KmsCrypto",
                        "Decrypt",
                        "https://docs.oracle.com/iaas/api/#/en/key/release/DecryptedData/Decrypt")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DecryptRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("decrypt")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.DecryptedData.class,
                        DecryptResponse.Builder::decryptedData)
                .handleResponseHeaderString("opc-request-id", DecryptResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<EncryptResponse> encrypt(
            EncryptRequest request,
            final com.oracle.bmc.responses.AsyncHandler<EncryptRequest, EncryptResponse> handler) {
        Objects.requireNonNull(request.getEncryptDataDetails(), "encryptDataDetails is required");

        return clientCall(request, EncryptResponse::builder)
                .logger(LOG, "encrypt")
                .serviceDetails(
                        "KmsCrypto",
                        "Encrypt",
                        "https://docs.oracle.com/iaas/api/#/en/key/release/EncryptedData/Encrypt")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EncryptRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("encrypt")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.EncryptedData.class,
                        EncryptResponse.Builder::encryptedData)
                .handleResponseHeaderString("opc-request-id", EncryptResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ExportKeyResponse> exportKey(
            ExportKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ExportKeyRequest, ExportKeyResponse>
                    handler) {
        Objects.requireNonNull(request.getExportKeyDetails(), "exportKeyDetails is required");

        return clientCall(request, ExportKeyResponse::builder)
                .logger(LOG, "exportKey")
                .serviceDetails(
                        "KmsCrypto",
                        "ExportKey",
                        "https://docs.oracle.com/iaas/api/#/en/key/release/ExportedKeyData/ExportKey")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExportKeyRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("exportKey")
                .accept("application/json")
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.ExportedKeyData.class,
                        ExportKeyResponse.Builder::exportedKeyData)
                .handleResponseHeaderString(
                        "opc-request-id", ExportKeyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateDataEncryptionKeyResponse> generateDataEncryptionKey(
            GenerateDataEncryptionKeyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GenerateDataEncryptionKeyRequest, GenerateDataEncryptionKeyResponse>
                    handler) {
        Objects.requireNonNull(request.getGenerateKeyDetails(), "generateKeyDetails is required");

        return clientCall(request, GenerateDataEncryptionKeyResponse::builder)
                .logger(LOG, "generateDataEncryptionKey")
                .serviceDetails(
                        "KmsCrypto",
                        "GenerateDataEncryptionKey",
                        "https://docs.oracle.com/iaas/api/#/en/key/release/GeneratedKey/GenerateDataEncryptionKey")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateDataEncryptionKeyRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("generateDataEncryptionKey")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.GeneratedKey.class,
                        GenerateDataEncryptionKeyResponse.Builder::generatedKey)
                .handleResponseHeaderString(
                        "opc-request-id", GenerateDataEncryptionKeyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SignResponse> sign(
            SignRequest request,
            final com.oracle.bmc.responses.AsyncHandler<SignRequest, SignResponse> handler) {
        Objects.requireNonNull(request.getSignDataDetails(), "signDataDetails is required");

        return clientCall(request, SignResponse::builder)
                .logger(LOG, "sign")
                .serviceDetails(
                        "KmsCrypto",
                        "Sign",
                        "https://docs.oracle.com/iaas/api/#/en/key/release/SignedData/Sign")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SignRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("sign")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.SignedData.class,
                        SignResponse.Builder::signedData)
                .handleResponseHeaderString("opc-request-id", SignResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<VerifyResponse> verify(
            VerifyRequest request,
            final com.oracle.bmc.responses.AsyncHandler<VerifyRequest, VerifyResponse> handler) {
        Objects.requireNonNull(request.getVerifyDataDetails(), "verifyDataDetails is required");

        return clientCall(request, VerifyResponse::builder)
                .logger(LOG, "verify")
                .serviceDetails(
                        "KmsCrypto",
                        "Verify",
                        "https://docs.oracle.com/iaas/api/#/en/key/release/VerifiedData/Verify")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(VerifyRequest::builder)
                .basePath("/")
                .appendPathParam("20180608")
                .appendPathParam("verify")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.keymanagement.model.VerifiedData.class,
                        VerifyResponse.Builder::verifiedData)
                .handleResponseHeaderString("opc-request-id", VerifyResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public KmsCryptoAsyncClient(
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
    public KmsCryptoAsyncClient(
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
    public KmsCryptoAsyncClient(
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
    public KmsCryptoAsyncClient(
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
    public KmsCryptoAsyncClient(
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
    public KmsCryptoAsyncClient(
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
    public KmsCryptoAsyncClient(
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
