/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limits;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.limits.requests.*;
import com.oracle.bmc.limits.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181025")
public class QuotasClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Quotas {
    /** Service instance for Quotas. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("QUOTAS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://limits.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(QuotasClient.class);

    private final QuotasWaiters waiters;

    private final QuotasPaginators paginators;

    QuotasClient(
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
                                    .nameFormat("Quotas-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new QuotasWaiters(executorService, this);

        this.paginators = new QuotasPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, QuotasClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "limits";
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
        public QuotasClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new QuotasClient(this, authenticationDetailsProvider, executorService);
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
    public AddQuotaLockResponse addQuotaLock(AddQuotaLockRequest request) {

        Validate.notBlank(request.getQuotaId(), "quotaId must not be blank");
        Objects.requireNonNull(request.getAddLockDetails(), "addLockDetails is required");

        return clientCall(request, AddQuotaLockResponse::builder)
                .logger(LOG, "addQuotaLock")
                .serviceDetails(
                        "Quotas",
                        "AddQuotaLock",
                        "https://docs.oracle.com/iaas/api/#/en/limits/20181025/Quota/AddQuotaLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddQuotaLockRequest::builder)
                .basePath("/")
                .appendPathParam("20181025")
                .appendPathParam("quotas")
                .appendPathParam(request.getQuotaId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.limits.model.Quota.class,
                        AddQuotaLockResponse.Builder::quota)
                .handleResponseHeaderString("etag", AddQuotaLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AddQuotaLockResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateQuotaResponse createQuota(CreateQuotaRequest request) {
        Objects.requireNonNull(request.getCreateQuotaDetails(), "createQuotaDetails is required");

        return clientCall(request, CreateQuotaResponse::builder)
                .logger(LOG, "createQuota")
                .serviceDetails(
                        "Quotas",
                        "CreateQuota",
                        "https://docs.oracle.com/iaas/api/#/en/limits/20181025/Quota/CreateQuota")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateQuotaRequest::builder)
                .basePath("/")
                .appendPathParam("20181025")
                .appendPathParam("quotas")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.limits.model.Quota.class, CreateQuotaResponse.Builder::quota)
                .handleResponseHeaderString(
                        "opc-request-id", CreateQuotaResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateQuotaResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteQuotaResponse deleteQuota(DeleteQuotaRequest request) {

        Validate.notBlank(request.getQuotaId(), "quotaId must not be blank");

        return clientCall(request, DeleteQuotaResponse::builder)
                .logger(LOG, "deleteQuota")
                .serviceDetails(
                        "Quotas",
                        "DeleteQuota",
                        "https://docs.oracle.com/iaas/api/#/en/limits/20181025/Quota/DeleteQuota")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteQuotaRequest::builder)
                .basePath("/")
                .appendPathParam("20181025")
                .appendPathParam("quotas")
                .appendPathParam(request.getQuotaId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteQuotaResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetQuotaResponse getQuota(GetQuotaRequest request) {

        Validate.notBlank(request.getQuotaId(), "quotaId must not be blank");

        return clientCall(request, GetQuotaResponse::builder)
                .logger(LOG, "getQuota")
                .serviceDetails(
                        "Quotas",
                        "GetQuota",
                        "https://docs.oracle.com/iaas/api/#/en/limits/20181025/Quota/GetQuota")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetQuotaRequest::builder)
                .basePath("/")
                .appendPathParam("20181025")
                .appendPathParam("quotas")
                .appendPathParam(request.getQuotaId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.limits.model.Quota.class, GetQuotaResponse.Builder::quota)
                .handleResponseHeaderString(
                        "opc-request-id", GetQuotaResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetQuotaResponse.Builder::etag)
                .callSync();
    }

    @Override
    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListQuotasResponse::builder)
                .logger(LOG, "listQuotas")
                .serviceDetails(
                        "Quotas",
                        "ListQuotas",
                        "https://docs.oracle.com/iaas/api/#/en/limits/20181025/QuotaSummary/ListQuotas")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListQuotasRequest::builder)
                .basePath("/")
                .appendPathParam("20181025")
                .appendPathParam("quotas")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.limits.model.QuotaSummary.class,
                        ListQuotasResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListQuotasResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListQuotasResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RemoveQuotaLockResponse removeQuotaLock(RemoveQuotaLockRequest request) {

        Validate.notBlank(request.getQuotaId(), "quotaId must not be blank");
        Objects.requireNonNull(request.getRemoveLockDetails(), "removeLockDetails is required");

        return clientCall(request, RemoveQuotaLockResponse::builder)
                .logger(LOG, "removeQuotaLock")
                .serviceDetails(
                        "Quotas",
                        "RemoveQuotaLock",
                        "https://docs.oracle.com/iaas/api/#/en/limits/20181025/Quota/RemoveQuotaLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveQuotaLockRequest::builder)
                .basePath("/")
                .appendPathParam("20181025")
                .appendPathParam("quotas")
                .appendPathParam(request.getQuotaId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.limits.model.Quota.class,
                        RemoveQuotaLockResponse.Builder::quota)
                .handleResponseHeaderString("etag", RemoveQuotaLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveQuotaLockResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateQuotaResponse updateQuota(UpdateQuotaRequest request) {

        Validate.notBlank(request.getQuotaId(), "quotaId must not be blank");
        Objects.requireNonNull(request.getUpdateQuotaDetails(), "updateQuotaDetails is required");

        return clientCall(request, UpdateQuotaResponse::builder)
                .logger(LOG, "updateQuota")
                .serviceDetails(
                        "Quotas",
                        "UpdateQuota",
                        "https://docs.oracle.com/iaas/api/#/en/limits/20181025/Quota/UpdateQuota")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateQuotaRequest::builder)
                .basePath("/")
                .appendPathParam("20181025")
                .appendPathParam("quotas")
                .appendPathParam(request.getQuotaId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.limits.model.Quota.class, UpdateQuotaResponse.Builder::quota)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateQuotaResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateQuotaResponse.Builder::etag)
                .callSync();
    }

    @Override
    public QuotasWaiters getWaiters() {
        return waiters;
    }

    @Override
    public QuotasPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public QuotasClient(
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
    public QuotasClient(
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
    public QuotasClient(
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
    public QuotasClient(
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
    public QuotasClient(
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
    public QuotasClient(
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
    public QuotasClient(
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
    public QuotasClient(
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
