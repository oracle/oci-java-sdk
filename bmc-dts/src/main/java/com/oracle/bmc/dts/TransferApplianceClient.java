/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.dts.requests.*;
import com.oracle.bmc.dts.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
public class TransferApplianceClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements TransferAppliance {
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

    private final TransferApplianceWaiters waiters;

    private TransferApplianceClient(
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
                                    .nameFormat("TransferAppliance-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new TransferApplianceWaiters(executorService, this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, TransferApplianceClient> {
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
        public TransferApplianceClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new TransferApplianceClient(
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
    public CreateTransferApplianceResponse createTransferAppliance(
            CreateTransferApplianceRequest request) {

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
                .callSync();
    }

    @Override
    public CreateTransferApplianceAdminCredentialsResponse createTransferApplianceAdminCredentials(
            CreateTransferApplianceAdminCredentialsRequest request) {

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
                .callSync();
    }

    @Override
    public DeleteTransferApplianceResponse deleteTransferAppliance(
            DeleteTransferApplianceRequest request) {

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
                .callSync();
    }

    @Override
    public GetTransferApplianceResponse getTransferAppliance(GetTransferApplianceRequest request) {

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
                .callSync();
    }

    @Override
    public GetTransferApplianceCertificateAuthorityCertificateResponse
            getTransferApplianceCertificateAuthorityCertificate(
                    GetTransferApplianceCertificateAuthorityCertificateRequest request) {

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
                .callSync();
    }

    @Override
    public GetTransferApplianceEncryptionPassphraseResponse
            getTransferApplianceEncryptionPassphrase(
                    GetTransferApplianceEncryptionPassphraseRequest request) {

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
                .callSync();
    }

    @Override
    public ListTransferAppliancesResponse listTransferAppliances(
            ListTransferAppliancesRequest request) {

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
                .callSync();
    }

    @Override
    public UpdateTransferApplianceResponse updateTransferAppliance(
            UpdateTransferApplianceRequest request) {

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
                .callSync();
    }

    @Override
    public TransferApplianceWaiters getWaiters() {
        return waiters;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public TransferApplianceClient(
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
    public TransferApplianceClient(
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
    public TransferApplianceClient(
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
    public TransferApplianceClient(
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
    public TransferApplianceClient(
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
    public TransferApplianceClient(
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
    public TransferApplianceClient(
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
    public TransferApplianceClient(
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
