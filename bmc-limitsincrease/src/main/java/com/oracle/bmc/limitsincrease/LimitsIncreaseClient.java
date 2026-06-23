/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limitsincrease;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.limitsincrease.requests.*;
import com.oracle.bmc.limitsincrease.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class LimitsIncreaseClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements LimitsIncrease {
    /** Service instance for LimitsIncrease. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(LimitsIncreaseClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://limits.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(LimitsIncreaseClient.class);

    private final LimitsIncreaseWaiters waiters;

    private final LimitsIncreasePaginators paginators;

    LimitsIncreaseClient(
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
                                    .nameFormat("LimitsIncrease-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new LimitsIncreaseWaiters(executorService, this);

        this.paginators = new LimitsIncreasePaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, LimitsIncreaseClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "limitsincrease";
            com.oracle.bmc.internal.DeveloperToolConfiguration
                    .throwDisabledServiceExceptionIfAppropriate(packageName);
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
        public LimitsIncreaseClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new LimitsIncreaseClient(this, authenticationDetailsProvider, executorService);
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
    public CancelLimitsIncreaseItemRequestResponse cancelLimitsIncreaseItemRequest(
            CancelLimitsIncreaseItemRequestRequest request) {

        Validate.notBlank(
                request.getLimitsIncreaseItemRequestId(),
                "limitsIncreaseItemRequestId must not be blank");

        return clientCall(request, CancelLimitsIncreaseItemRequestResponse::builder)
                .logger(LOG, "cancelLimitsIncreaseItemRequest")
                .serviceDetails(
                        "LimitsIncrease",
                        "CancelLimitsIncreaseItemRequest",
                        "https://docs.oracle.com/iaas/api/#/en/limits-increase/20251101/LimitsIncreaseItemRequest/CancelLimitsIncreaseItemRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelLimitsIncreaseItemRequestRequest::builder)
                .basePath("/20251101")
                .appendPathParam("limitsIncreaseItemRequests")
                .appendPathParam(request.getLimitsIncreaseItemRequestId())
                .appendPathParam("actions")
                .appendPathParam("cancel")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.limitsincrease.model.LimitsIncreaseItemRequest.class,
                        CancelLimitsIncreaseItemRequestResponse.Builder::limitsIncreaseItemRequest)
                .handleResponseHeaderString(
                        "etag", CancelLimitsIncreaseItemRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CancelLimitsIncreaseItemRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CancelLimitsIncreaseRequestResponse cancelLimitsIncreaseRequest(
            CancelLimitsIncreaseRequestRequest request) {

        Validate.notBlank(
                request.getLimitsIncreaseRequestId(), "limitsIncreaseRequestId must not be blank");

        return clientCall(request, CancelLimitsIncreaseRequestResponse::builder)
                .logger(LOG, "cancelLimitsIncreaseRequest")
                .serviceDetails(
                        "LimitsIncrease",
                        "CancelLimitsIncreaseRequest",
                        "https://docs.oracle.com/iaas/api/#/en/limits-increase/20251101/LimitsIncreaseRequest/CancelLimitsIncreaseRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelLimitsIncreaseRequestRequest::builder)
                .basePath("/20251101")
                .appendPathParam("limitsIncreaseRequests")
                .appendPathParam(request.getLimitsIncreaseRequestId())
                .appendPathParam("actions")
                .appendPathParam("cancel")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequest.class,
                        CancelLimitsIncreaseRequestResponse.Builder::limitsIncreaseRequest)
                .handleResponseHeaderString(
                        "etag", CancelLimitsIncreaseRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CancelLimitsIncreaseRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateLimitsIncreaseRequestResponse createLimitsIncreaseRequest(
            CreateLimitsIncreaseRequestRequest request) {
        Objects.requireNonNull(
                request.getCreateLimitsIncreaseRequestDetails(),
                "createLimitsIncreaseRequestDetails is required");

        return clientCall(request, CreateLimitsIncreaseRequestResponse::builder)
                .logger(LOG, "createLimitsIncreaseRequest")
                .serviceDetails(
                        "LimitsIncrease",
                        "CreateLimitsIncreaseRequest",
                        "https://docs.oracle.com/iaas/api/#/en/limits-increase/20251101/LimitsIncreaseRequest/CreateLimitsIncreaseRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateLimitsIncreaseRequestRequest::builder)
                .basePath("/20251101")
                .appendPathParam("limitsIncreaseRequests")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequest.class,
                        CreateLimitsIncreaseRequestResponse.Builder::limitsIncreaseRequest)
                .handleResponseHeaderString(
                        "etag", CreateLimitsIncreaseRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateLimitsIncreaseRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteLimitsIncreaseRequestResponse deleteLimitsIncreaseRequest(
            DeleteLimitsIncreaseRequestRequest request) {

        Validate.notBlank(
                request.getLimitsIncreaseRequestId(), "limitsIncreaseRequestId must not be blank");

        return clientCall(request, DeleteLimitsIncreaseRequestResponse::builder)
                .logger(LOG, "deleteLimitsIncreaseRequest")
                .serviceDetails(
                        "LimitsIncrease",
                        "DeleteLimitsIncreaseRequest",
                        "https://docs.oracle.com/iaas/api/#/en/limits-increase/20251101/LimitsIncreaseRequest/DeleteLimitsIncreaseRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteLimitsIncreaseRequestRequest::builder)
                .basePath("/20251101")
                .appendPathParam("limitsIncreaseRequests")
                .appendPathParam(request.getLimitsIncreaseRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteLimitsIncreaseRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetLimitsIncreaseItemRequestResponse getLimitsIncreaseItemRequest(
            GetLimitsIncreaseItemRequestRequest request) {

        Validate.notBlank(
                request.getLimitsIncreaseItemRequestId(),
                "limitsIncreaseItemRequestId must not be blank");

        return clientCall(request, GetLimitsIncreaseItemRequestResponse::builder)
                .logger(LOG, "getLimitsIncreaseItemRequest")
                .serviceDetails(
                        "LimitsIncrease",
                        "GetLimitsIncreaseItemRequest",
                        "https://docs.oracle.com/iaas/api/#/en/limits-increase/20251101/LimitsIncreaseItemRequest/GetLimitsIncreaseItemRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLimitsIncreaseItemRequestRequest::builder)
                .basePath("/20251101")
                .appendPathParam("limitsIncreaseItemRequests")
                .appendPathParam(request.getLimitsIncreaseItemRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.limitsincrease.model.LimitsIncreaseItemRequest.class,
                        GetLimitsIncreaseItemRequestResponse.Builder::limitsIncreaseItemRequest)
                .handleResponseHeaderString(
                        "etag", GetLimitsIncreaseItemRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetLimitsIncreaseItemRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetLimitsIncreaseRequestResponse getLimitsIncreaseRequest(
            GetLimitsIncreaseRequestRequest request) {

        Validate.notBlank(
                request.getLimitsIncreaseRequestId(), "limitsIncreaseRequestId must not be blank");

        return clientCall(request, GetLimitsIncreaseRequestResponse::builder)
                .logger(LOG, "getLimitsIncreaseRequest")
                .serviceDetails(
                        "LimitsIncrease",
                        "GetLimitsIncreaseRequest",
                        "https://docs.oracle.com/iaas/api/#/en/limits-increase/20251101/LimitsIncreaseRequest/GetLimitsIncreaseRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLimitsIncreaseRequestRequest::builder)
                .basePath("/20251101")
                .appendPathParam("limitsIncreaseRequests")
                .appendPathParam(request.getLimitsIncreaseRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequest.class,
                        GetLimitsIncreaseRequestResponse.Builder::limitsIncreaseRequest)
                .handleResponseHeaderString("etag", GetLimitsIncreaseRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetLimitsIncreaseRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListLimitsIncreaseItemRequestsResponse listLimitsIncreaseItemRequests(
            ListLimitsIncreaseItemRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListLimitsIncreaseItemRequestsResponse::builder)
                .logger(LOG, "listLimitsIncreaseItemRequests")
                .serviceDetails(
                        "LimitsIncrease",
                        "ListLimitsIncreaseItemRequests",
                        "https://docs.oracle.com/iaas/api/#/en/limits-increase/20251101/LimitsIncreaseItemRequestCollection/ListLimitsIncreaseItemRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLimitsIncreaseItemRequestsRequest::builder)
                .basePath("/20251101")
                .appendPathParam("limitsIncreaseItemRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("service", request.getService())
                .appendQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limitsIncreaseRequestId", request.getLimitsIncreaseRequestId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.limitsincrease.model.LimitsIncreaseItemRequestCollection
                                .class,
                        ListLimitsIncreaseItemRequestsResponse.Builder
                                ::limitsIncreaseItemRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListLimitsIncreaseItemRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListLimitsIncreaseItemRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListLimitsIncreaseQuestionsResponse listLimitsIncreaseQuestions(
            ListLimitsIncreaseQuestionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListLimitsIncreaseQuestionsResponse::builder)
                .logger(LOG, "listLimitsIncreaseQuestions")
                .serviceDetails(
                        "LimitsIncrease",
                        "ListLimitsIncreaseQuestions",
                        "https://docs.oracle.com/iaas/api/#/en/limits-increase/20251101/LimitsIncreaseQuestionCollection/ListLimitsIncreaseQuestions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLimitsIncreaseQuestionsRequest::builder)
                .basePath("/20251101")
                .appendPathParam("limitsIncreaseQuestionnaires")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("serviceName", request.getServiceName())
                .appendQueryParam("limitName", request.getLimitName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.limitsincrease.model.LimitsIncreaseQuestionCollection.class,
                        ListLimitsIncreaseQuestionsResponse.Builder
                                ::limitsIncreaseQuestionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListLimitsIncreaseQuestionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListLimitsIncreaseQuestionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListLimitsIncreaseRequestsResponse listLimitsIncreaseRequests(
            ListLimitsIncreaseRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListLimitsIncreaseRequestsResponse::builder)
                .logger(LOG, "listLimitsIncreaseRequests")
                .serviceDetails(
                        "LimitsIncrease",
                        "ListLimitsIncreaseRequests",
                        "https://docs.oracle.com/iaas/api/#/en/limits-increase/20251101/LimitsIncreaseRequest/ListLimitsIncreaseRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLimitsIncreaseRequestsRequest::builder)
                .basePath("/20251101")
                .appendPathParam("limitsIncreaseRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequestCollection.class,
                        ListLimitsIncreaseRequestsResponse.Builder::limitsIncreaseRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListLimitsIncreaseRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListLimitsIncreaseRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public PatchLimitsIncreaseRequestResponse patchLimitsIncreaseRequest(
            PatchLimitsIncreaseRequestRequest request) {
        Objects.requireNonNull(
                request.getPatchLimitsIncreaseRequestDetails(),
                "patchLimitsIncreaseRequestDetails is required");

        Validate.notBlank(
                request.getLimitsIncreaseRequestId(), "limitsIncreaseRequestId must not be blank");

        return clientCall(request, PatchLimitsIncreaseRequestResponse::builder)
                .logger(LOG, "patchLimitsIncreaseRequest")
                .serviceDetails(
                        "LimitsIncrease",
                        "PatchLimitsIncreaseRequest",
                        "https://docs.oracle.com/iaas/api/#/en/limits-increase/20251101/LimitsIncreaseRequest/PatchLimitsIncreaseRequest")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchLimitsIncreaseRequestRequest::builder)
                .basePath("/20251101")
                .appendPathParam("limitsIncreaseRequests")
                .appendPathParam(request.getLimitsIncreaseRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequest.class,
                        PatchLimitsIncreaseRequestResponse.Builder::limitsIncreaseRequest)
                .handleResponseHeaderString(
                        "etag", PatchLimitsIncreaseRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", PatchLimitsIncreaseRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateLimitsIncreaseRequestResponse updateLimitsIncreaseRequest(
            UpdateLimitsIncreaseRequestRequest request) {
        Objects.requireNonNull(
                request.getUpdateLimitsIncreaseRequestDetails(),
                "updateLimitsIncreaseRequestDetails is required");

        Validate.notBlank(
                request.getLimitsIncreaseRequestId(), "limitsIncreaseRequestId must not be blank");

        return clientCall(request, UpdateLimitsIncreaseRequestResponse::builder)
                .logger(LOG, "updateLimitsIncreaseRequest")
                .serviceDetails(
                        "LimitsIncrease",
                        "UpdateLimitsIncreaseRequest",
                        "https://docs.oracle.com/iaas/api/#/en/limits-increase/20251101/LimitsIncreaseRequest/UpdateLimitsIncreaseRequest")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateLimitsIncreaseRequestRequest::builder)
                .basePath("/20251101")
                .appendPathParam("limitsIncreaseRequests")
                .appendPathParam(request.getLimitsIncreaseRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequest.class,
                        UpdateLimitsIncreaseRequestResponse.Builder::limitsIncreaseRequest)
                .handleResponseHeaderString(
                        "etag", UpdateLimitsIncreaseRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateLimitsIncreaseRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public LimitsIncreaseWaiters getWaiters() {
        return waiters;
    }

    @Override
    public LimitsIncreasePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public LimitsIncreaseClient(
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
    public LimitsIncreaseClient(
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
    public LimitsIncreaseClient(
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
    public LimitsIncreaseClient(
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
    public LimitsIncreaseClient(
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
    public LimitsIncreaseClient(
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
    public LimitsIncreaseClient(
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
    public LimitsIncreaseClient(
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
