/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.keymanagement.requests.*;
import com.oracle.bmc.keymanagement.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public class KmsCryptoClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements KmsCrypto {
    /** Service instance for KmsCrypto. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(KmsCryptoClient.class.getName())
                    .serviceEndpointPrefix("kms")
                    .serviceEndpointTemplate("https://kms.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(KmsCryptoClient.class);

    KmsCryptoClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);
    }

    /**
     * Create a builder for this client.
     *
     * @return builder
     */
    public static com.oracle.bmc.keymanagement.KmsCryptoClientBuilder builder() {
        return new com.oracle.bmc.keymanagement.KmsCryptoClientBuilder(SERVICE);
    }

    @Override
    public DecryptResponse decrypt(DecryptRequest request) {
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
                .callSync();
    }

    @Override
    public EncryptResponse encrypt(EncryptRequest request) {
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
                .callSync();
    }

    @Override
    public ExportKeyResponse exportKey(ExportKeyRequest request) {
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
                .callSync();
    }

    @Override
    public GenerateDataEncryptionKeyResponse generateDataEncryptionKey(
            GenerateDataEncryptionKeyRequest request) {
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
                .callSync();
    }

    @Override
    public SignResponse sign(SignRequest request) {
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
                .callSync();
    }

    @Override
    public VerifyResponse verify(VerifyRequest request) {
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
                .callSync();
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public KmsCryptoClient(
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
    public KmsCryptoClient(
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
    public KmsCryptoClient(
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
    public KmsCryptoClient(
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
    public KmsCryptoClient(
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
    public KmsCryptoClient(
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
    public KmsCryptoClient(
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
