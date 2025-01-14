/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vault;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.vault.requests.*;
import com.oracle.bmc.vault.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
public class VaultsClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Vaults {
    /** Service instance for Vaults. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("VAULTS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://vaults.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(VaultsClient.class);

    protected final java.util.concurrent.ExecutorService executorService;
    private final VaultsWaiters waiters;

    private final VaultsPaginators paginators;

    VaultsClient(
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
                                    .nameFormat("Vaults-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.executorService = executorService;
        this.waiters = new VaultsWaiters(executorService, this);

        this.paginators = new VaultsPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, VaultsClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "vault";
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
        public VaultsClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new VaultsClient(this, authenticationDetailsProvider, executorService);
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
    public CancelSecretDeletionResponse cancelSecretDeletion(CancelSecretDeletionRequest request) {

        Validate.notBlank(request.getSecretId(), "secretId must not be blank");

        return clientCall(request, CancelSecretDeletionResponse::builder)
                .logger(LOG, "cancelSecretDeletion")
                .serviceDetails(
                        "Vaults",
                        "CancelSecretDeletion",
                        "https://docs.oracle.com/iaas/api/#/en/secretmgmt/20180608/Secret/CancelSecretDeletion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelSecretDeletionRequest::builder)
                .basePath("/20180608")
                .appendPathParam("secrets")
                .appendPathParam(request.getSecretId())
                .appendPathParam("actions")
                .appendPathParam("cancelDeletion")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString("etag", CancelSecretDeletionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CancelSecretDeletionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CancelSecretRotationResponse cancelSecretRotation(CancelSecretRotationRequest request) {

        Validate.notBlank(request.getSecretId(), "secretId must not be blank");

        return clientCall(request, CancelSecretRotationResponse::builder)
                .logger(LOG, "cancelSecretRotation")
                .serviceDetails(
                        "Vaults",
                        "CancelSecretRotation",
                        "https://docs.oracle.com/iaas/api/#/en/secretmgmt/20180608/Secret/CancelSecretRotation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelSecretRotationRequest::builder)
                .basePath("/20180608")
                .appendPathParam("secrets")
                .appendPathParam(request.getSecretId())
                .appendPathParam("actions")
                .appendPathParam("cancelRotation")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", CancelSecretRotationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CancelSecretVersionDeletionResponse cancelSecretVersionDeletion(
            CancelSecretVersionDeletionRequest request) {

        Validate.notBlank(request.getSecretId(), "secretId must not be blank");

        return clientCall(request, CancelSecretVersionDeletionResponse::builder)
                .logger(LOG, "cancelSecretVersionDeletion")
                .serviceDetails(
                        "Vaults",
                        "CancelSecretVersionDeletion",
                        "https://docs.oracle.com/iaas/api/#/en/secretmgmt/20180608/SecretVersion/CancelSecretVersionDeletion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelSecretVersionDeletionRequest::builder)
                .basePath("/20180608")
                .appendPathParam("secrets")
                .appendPathParam(request.getSecretId())
                .appendPathParam("version")
                .appendPathParam(request.getSecretVersionNumber())
                .appendPathParam("actions")
                .appendPathParam("cancelDeletion")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "etag", CancelSecretVersionDeletionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CancelSecretVersionDeletionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeSecretCompartmentResponse changeSecretCompartment(
            ChangeSecretCompartmentRequest request) {

        Validate.notBlank(request.getSecretId(), "secretId must not be blank");
        Objects.requireNonNull(
                request.getChangeSecretCompartmentDetails(),
                "changeSecretCompartmentDetails is required");

        return clientCall(request, ChangeSecretCompartmentResponse::builder)
                .logger(LOG, "changeSecretCompartment")
                .serviceDetails(
                        "Vaults",
                        "ChangeSecretCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/secretmgmt/20180608/Secret/ChangeSecretCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSecretCompartmentRequest::builder)
                .basePath("/20180608")
                .appendPathParam("secrets")
                .appendPathParam(request.getSecretId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString("etag", ChangeSecretCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeSecretCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateSecretResponse createSecret(CreateSecretRequest request) {
        Objects.requireNonNull(request.getCreateSecretDetails(), "createSecretDetails is required");

        return clientCall(request, CreateSecretResponse::builder)
                .logger(LOG, "createSecret")
                .serviceDetails(
                        "Vaults",
                        "CreateSecret",
                        "https://docs.oracle.com/iaas/api/#/en/secretmgmt/20180608/Secret/CreateSecret")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSecretRequest::builder)
                .basePath("/20180608")
                .appendPathParam("secrets")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.vault.model.Secret.class,
                        CreateSecretResponse.Builder::secret)
                .handleResponseHeaderString("etag", CreateSecretResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSecretResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSecretResponse getSecret(GetSecretRequest request) {

        Validate.notBlank(request.getSecretId(), "secretId must not be blank");

        return clientCall(request, GetSecretResponse::builder)
                .logger(LOG, "getSecret")
                .serviceDetails(
                        "Vaults",
                        "GetSecret",
                        "https://docs.oracle.com/iaas/api/#/en/secretmgmt/20180608/Secret/GetSecret")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSecretRequest::builder)
                .basePath("/20180608")
                .appendPathParam("secrets")
                .appendPathParam(request.getSecretId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.vault.model.Secret.class, GetSecretResponse.Builder::secret)
                .handleResponseHeaderString("etag", GetSecretResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSecretResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSecretVersionResponse getSecretVersion(GetSecretVersionRequest request) {

        Validate.notBlank(request.getSecretId(), "secretId must not be blank");

        return clientCall(request, GetSecretVersionResponse::builder)
                .logger(LOG, "getSecretVersion")
                .serviceDetails(
                        "Vaults",
                        "GetSecretVersion",
                        "https://docs.oracle.com/iaas/api/#/en/secretmgmt/20180608/SecretVersion/GetSecretVersion")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSecretVersionRequest::builder)
                .basePath("/20180608")
                .appendPathParam("secrets")
                .appendPathParam(request.getSecretId())
                .appendPathParam("version")
                .appendPathParam(request.getSecretVersionNumber())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.vault.model.SecretVersion.class,
                        GetSecretVersionResponse.Builder::secretVersion)
                .handleResponseHeaderString("etag", GetSecretVersionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSecretVersionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListSecretVersionsResponse listSecretVersions(ListSecretVersionsRequest request) {

        Validate.notBlank(request.getSecretId(), "secretId must not be blank");

        return clientCall(request, ListSecretVersionsResponse::builder)
                .logger(LOG, "listSecretVersions")
                .serviceDetails(
                        "Vaults",
                        "ListSecretVersions",
                        "https://docs.oracle.com/iaas/api/#/en/secretmgmt/20180608/SecretVersionSummary/ListSecretVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSecretVersionsRequest::builder)
                .basePath("/20180608")
                .appendPathParam("secrets")
                .appendPathParam(request.getSecretId())
                .appendPathParam("versions")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.vault.model.SecretVersionSummary.class,
                        ListSecretVersionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListSecretVersionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSecretVersionsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListSecretsResponse listSecrets(ListSecretsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSecretsResponse::builder)
                .logger(LOG, "listSecrets")
                .serviceDetails(
                        "Vaults",
                        "ListSecrets",
                        "https://docs.oracle.com/iaas/api/#/en/secretmgmt/20180608/SecretSummary/ListSecrets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSecretsRequest::builder)
                .basePath("/20180608")
                .appendPathParam("secrets")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("vaultId", request.getVaultId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.vault.model.SecretSummary.class,
                        ListSecretsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListSecretsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSecretsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RotateSecretResponse rotateSecret(RotateSecretRequest request) {

        Validate.notBlank(request.getSecretId(), "secretId must not be blank");

        return clientCall(request, RotateSecretResponse::builder)
                .logger(LOG, "rotateSecret")
                .serviceDetails(
                        "Vaults",
                        "RotateSecret",
                        "https://docs.oracle.com/iaas/api/#/en/secretmgmt/20180608/Secret/RotateSecret")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotateSecretRequest::builder)
                .basePath("/20180608")
                .appendPathParam("secrets")
                .appendPathParam(request.getSecretId())
                .appendPathParam("actions")
                .appendPathParam("rotate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", RotateSecretResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", RotateSecretResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ScheduleSecretDeletionResponse scheduleSecretDeletion(
            ScheduleSecretDeletionRequest request) {

        Validate.notBlank(request.getSecretId(), "secretId must not be blank");
        Objects.requireNonNull(
                request.getScheduleSecretDeletionDetails(),
                "scheduleSecretDeletionDetails is required");

        return clientCall(request, ScheduleSecretDeletionResponse::builder)
                .logger(LOG, "scheduleSecretDeletion")
                .serviceDetails(
                        "Vaults",
                        "ScheduleSecretDeletion",
                        "https://docs.oracle.com/iaas/api/#/en/secretmgmt/20180608/Secret/ScheduleSecretDeletion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScheduleSecretDeletionRequest::builder)
                .basePath("/20180608")
                .appendPathParam("secrets")
                .appendPathParam(request.getSecretId())
                .appendPathParam("actions")
                .appendPathParam("scheduleDeletion")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString("etag", ScheduleSecretDeletionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ScheduleSecretDeletionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ScheduleSecretVersionDeletionResponse scheduleSecretVersionDeletion(
            ScheduleSecretVersionDeletionRequest request) {

        Validate.notBlank(request.getSecretId(), "secretId must not be blank");

        Objects.requireNonNull(
                request.getScheduleSecretVersionDeletionDetails(),
                "scheduleSecretVersionDeletionDetails is required");

        return clientCall(request, ScheduleSecretVersionDeletionResponse::builder)
                .logger(LOG, "scheduleSecretVersionDeletion")
                .serviceDetails(
                        "Vaults",
                        "ScheduleSecretVersionDeletion",
                        "https://docs.oracle.com/iaas/api/#/en/secretmgmt/20180608/SecretVersion/ScheduleSecretVersionDeletion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScheduleSecretVersionDeletionRequest::builder)
                .basePath("/20180608")
                .appendPathParam("secrets")
                .appendPathParam(request.getSecretId())
                .appendPathParam("version")
                .appendPathParam(request.getSecretVersionNumber())
                .appendPathParam("actions")
                .appendPathParam("scheduleDeletion")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ScheduleSecretVersionDeletionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ScheduleSecretVersionDeletionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateSecretResponse updateSecret(UpdateSecretRequest request) {

        Validate.notBlank(request.getSecretId(), "secretId must not be blank");
        Objects.requireNonNull(request.getUpdateSecretDetails(), "updateSecretDetails is required");

        return clientCall(request, UpdateSecretResponse::builder)
                .logger(LOG, "updateSecret")
                .serviceDetails(
                        "Vaults",
                        "UpdateSecret",
                        "https://docs.oracle.com/iaas/api/#/en/secretmgmt/20180608/Secret/UpdateSecret")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSecretRequest::builder)
                .basePath("/20180608")
                .appendPathParam("secrets")
                .appendPathParam(request.getSecretId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.vault.model.Secret.class,
                        UpdateSecretResponse.Builder::secret)
                .handleResponseHeaderString("etag", UpdateSecretResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSecretResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public VaultsWaiters getWaiters() {
        return waiters;
    }

    @Override
    public VaultsWaiters newWaiters(com.oracle.bmc.workrequests.WorkRequest workRequestClient) {
        return new VaultsWaiters(executorService, this, workRequestClient);
    }

    @Override
    public VaultsPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public VaultsClient(
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
    public VaultsClient(
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
    public VaultsClient(
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
    public VaultsClient(
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
    public VaultsClient(
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
    public VaultsClient(
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
    public VaultsClient(
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
    public VaultsClient(
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
