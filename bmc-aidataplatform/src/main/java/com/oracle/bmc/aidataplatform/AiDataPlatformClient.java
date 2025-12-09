/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidataplatform;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.aidataplatform.requests.*;
import com.oracle.bmc.aidataplatform.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240831")
public class AiDataPlatformClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements AiDataPlatform {
    /** Service instance for AiDataPlatform. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(AiDataPlatformClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AiDataPlatformClient.class);

    private final AiDataPlatformWaiters waiters;

    private final AiDataPlatformPaginators paginators;

    AiDataPlatformClient(
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
                                    .nameFormat("AiDataPlatform-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new AiDataPlatformWaiters(executorService, this);

        this.paginators = new AiDataPlatformPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, AiDataPlatformClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "aidataplatform";
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
        public AiDataPlatformClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new AiDataPlatformClient(this, authenticationDetailsProvider, executorService);
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
    public CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, CancelWorkRequestResponse::builder)
                .logger(LOG, "cancelWorkRequest")
                .serviceDetails(
                        "AiDataPlatform",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/ai-data-platform/20240831/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20240831")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeAiDataPlatformCompartmentResponse changeAiDataPlatformCompartment(
            ChangeAiDataPlatformCompartmentRequest request) {

        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(
                request.getChangeAiDataPlatformCompartmentDetails(),
                "changeAiDataPlatformCompartmentDetails is required");

        return clientCall(request, ChangeAiDataPlatformCompartmentResponse::builder)
                .logger(LOG, "changeAiDataPlatformCompartment")
                .serviceDetails(
                        "AiDataPlatform",
                        "ChangeAiDataPlatformCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/ai-data-platform/20240831/AiDataPlatform/ChangeAiDataPlatformCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAiDataPlatformCompartmentRequest::builder)
                .basePath("/20240831")
                .appendPathParam("aiDataPlatforms")
                .appendPathParam(request.getAiDataPlatformId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeAiDataPlatformCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAiDataPlatformCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateAiDataPlatformResponse createAiDataPlatform(CreateAiDataPlatformRequest request) {
        Objects.requireNonNull(
                request.getCreateAiDataPlatformDetails(),
                "createAiDataPlatformDetails is required");

        return clientCall(request, CreateAiDataPlatformResponse::builder)
                .logger(LOG, "createAiDataPlatform")
                .serviceDetails(
                        "AiDataPlatform",
                        "CreateAiDataPlatform",
                        "https://docs.oracle.com/iaas/api/#/en/ai-data-platform/20240831/AiDataPlatform/CreateAiDataPlatform")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAiDataPlatformRequest::builder)
                .basePath("/20240831")
                .appendPathParam("aiDataPlatforms")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aidataplatform.model.AiDataPlatform.class,
                        CreateAiDataPlatformResponse.Builder::aiDataPlatform)
                .handleResponseHeaderString(
                        "location", CreateAiDataPlatformResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateAiDataPlatformResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateAiDataPlatformResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateAiDataPlatformResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAiDataPlatformResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteAiDataPlatformResponse deleteAiDataPlatform(DeleteAiDataPlatformRequest request) {

        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");

        return clientCall(request, DeleteAiDataPlatformResponse::builder)
                .logger(LOG, "deleteAiDataPlatform")
                .serviceDetails(
                        "AiDataPlatform",
                        "DeleteAiDataPlatform",
                        "https://docs.oracle.com/iaas/api/#/en/ai-data-platform/20240831/AiDataPlatform/DeleteAiDataPlatform")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAiDataPlatformRequest::builder)
                .basePath("/20240831")
                .appendPathParam("aiDataPlatforms")
                .appendPathParam(request.getAiDataPlatformId())
                .appendQueryParam("isForceDelete", request.getIsForceDelete())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteAiDataPlatformResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAiDataPlatformResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAiDataPlatformResponse getAiDataPlatform(GetAiDataPlatformRequest request) {

        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");

        return clientCall(request, GetAiDataPlatformResponse::builder)
                .logger(LOG, "getAiDataPlatform")
                .serviceDetails(
                        "AiDataPlatform",
                        "GetAiDataPlatform",
                        "https://docs.oracle.com/iaas/api/#/en/ai-data-platform/20240831/AiDataPlatform/GetAiDataPlatform")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAiDataPlatformRequest::builder)
                .basePath("/20240831")
                .appendPathParam("aiDataPlatforms")
                .appendPathParam(request.getAiDataPlatformId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.aidataplatform.model.AiDataPlatform.class,
                        GetAiDataPlatformResponse.Builder::aiDataPlatform)
                .handleResponseHeaderString("etag", GetAiDataPlatformResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAiDataPlatformResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "AiDataPlatform",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/ai-data-platform/20240831/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20240831")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.aidataplatform.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListAiDataPlatformsResponse listAiDataPlatforms(ListAiDataPlatformsRequest request) {

        return clientCall(request, ListAiDataPlatformsResponse::builder)
                .logger(LOG, "listAiDataPlatforms")
                .serviceDetails(
                        "AiDataPlatform",
                        "ListAiDataPlatforms",
                        "https://docs.oracle.com/iaas/api/#/en/ai-data-platform/20240831/AiDataPlatformCollection/ListAiDataPlatforms")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAiDataPlatformsRequest::builder)
                .basePath("/20240831")
                .appendPathParam("aiDataPlatforms")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("excludeLifecycleState", request.getExcludeLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("includeLegacy", request.getIncludeLegacy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.aidataplatform.model.AiDataPlatformCollection.class,
                        ListAiDataPlatformsResponse.Builder::aiDataPlatformCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAiDataPlatformsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAiDataPlatformsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "AiDataPlatform",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/ai-data-platform/20240831/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20240831")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.aidataplatform.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "AiDataPlatform",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/ai-data-platform/20240831/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20240831")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.aidataplatform.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "AiDataPlatform",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/ai-data-platform/20240831/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20240831")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.aidataplatform.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateAiDataPlatformResponse updateAiDataPlatform(UpdateAiDataPlatformRequest request) {

        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAiDataPlatformDetails(),
                "updateAiDataPlatformDetails is required");

        return clientCall(request, UpdateAiDataPlatformResponse::builder)
                .logger(LOG, "updateAiDataPlatform")
                .serviceDetails(
                        "AiDataPlatform",
                        "UpdateAiDataPlatform",
                        "https://docs.oracle.com/iaas/api/#/en/ai-data-platform/20240831/AiDataPlatform/UpdateAiDataPlatform")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAiDataPlatformRequest::builder)
                .basePath("/20240831")
                .appendPathParam("aiDataPlatforms")
                .appendPathParam(request.getAiDataPlatformId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAiDataPlatformResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAiDataPlatformResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public AiDataPlatformWaiters getWaiters() {
        return waiters;
    }

    @Override
    public AiDataPlatformPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AiDataPlatformClient(
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
    public AiDataPlatformClient(
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
    public AiDataPlatformClient(
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
    public AiDataPlatformClient(
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
    public AiDataPlatformClient(
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
    public AiDataPlatformClient(
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
    public AiDataPlatformClient(
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
    public AiDataPlatformClient(
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
