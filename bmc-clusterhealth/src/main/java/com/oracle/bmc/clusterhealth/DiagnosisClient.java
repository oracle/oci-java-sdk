/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.clusterhealth;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.clusterhealth.requests.*;
import com.oracle.bmc.clusterhealth.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260331")
public class DiagnosisClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements Diagnosis {
    /** Service instance for Diagnosis. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DiagnosisClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://iaas.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DiagnosisClient.class);

    private final DiagnosisWaiters waiters;

    private final DiagnosisPaginators paginators;

    DiagnosisClient(
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
                                    .nameFormat("Diagnosis-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DiagnosisWaiters(executorService, this);

        this.paginators = new DiagnosisPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DiagnosisClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "clusterhealth";
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
        public DiagnosisClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DiagnosisClient(this, authenticationDetailsProvider, executorService);
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
                .serviceDetails("Diagnosis", "CancelWorkRequest", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20260331")
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
    public ChangeDiagnosisStoreCompartmentResponse changeDiagnosisStoreCompartment(
            ChangeDiagnosisStoreCompartmentRequest request) {

        Validate.notBlank(request.getDiagnosisStoreId(), "diagnosisStoreId must not be blank");
        Objects.requireNonNull(
                request.getChangeDiagnosisStoreCompartmentDetails(),
                "changeDiagnosisStoreCompartmentDetails is required");

        return clientCall(request, ChangeDiagnosisStoreCompartmentResponse::builder)
                .logger(LOG, "changeDiagnosisStoreCompartment")
                .serviceDetails("Diagnosis", "ChangeDiagnosisStoreCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDiagnosisStoreCompartmentRequest::builder)
                .basePath("/20260331")
                .appendPathParam("diagnosisStores")
                .appendPathParam(request.getDiagnosisStoreId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDiagnosisStoreCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDiagnosisStoreCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDiagnosisStoreResponse createDiagnosisStore(CreateDiagnosisStoreRequest request) {
        Objects.requireNonNull(
                request.getCreateDiagnosisStoreDetails(),
                "createDiagnosisStoreDetails is required");

        return clientCall(request, CreateDiagnosisStoreResponse::builder)
                .logger(LOG, "createDiagnosisStore")
                .serviceDetails("Diagnosis", "CreateDiagnosisStore", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDiagnosisStoreRequest::builder)
                .basePath("/20260331")
                .appendPathParam("diagnosisStores")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.clusterhealth.model.DiagnosisStore.class,
                        CreateDiagnosisStoreResponse.Builder::diagnosisStore)
                .handleResponseHeaderString(
                        "location", CreateDiagnosisStoreResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateDiagnosisStoreResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateDiagnosisStoreResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDiagnosisStoreResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDiagnosisStoreResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDiagnosisStoreResponse deleteDiagnosisStore(DeleteDiagnosisStoreRequest request) {

        Validate.notBlank(request.getDiagnosisStoreId(), "diagnosisStoreId must not be blank");

        return clientCall(request, DeleteDiagnosisStoreResponse::builder)
                .logger(LOG, "deleteDiagnosisStore")
                .serviceDetails("Diagnosis", "DeleteDiagnosisStore", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDiagnosisStoreRequest::builder)
                .basePath("/20260331")
                .appendPathParam("diagnosisStores")
                .appendPathParam(request.getDiagnosisStoreId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDiagnosisStoreResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDiagnosisStoreResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDiagnosisStoreResponse getDiagnosisStore(GetDiagnosisStoreRequest request) {

        Validate.notBlank(request.getDiagnosisStoreId(), "diagnosisStoreId must not be blank");

        return clientCall(request, GetDiagnosisStoreResponse::builder)
                .logger(LOG, "getDiagnosisStore")
                .serviceDetails("Diagnosis", "GetDiagnosisStore", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDiagnosisStoreRequest::builder)
                .basePath("/20260331")
                .appendPathParam("diagnosisStores")
                .appendPathParam(request.getDiagnosisStoreId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.clusterhealth.model.DiagnosisStore.class,
                        GetDiagnosisStoreResponse.Builder::diagnosisStore)
                .handleResponseHeaderString("etag", GetDiagnosisStoreResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDiagnosisStoreResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails("Diagnosis", "GetWorkRequest", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20260331")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.clusterhealth.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListDiagnosisStoresResponse listDiagnosisStores(ListDiagnosisStoresRequest request) {

        return clientCall(request, ListDiagnosisStoresResponse::builder)
                .logger(LOG, "listDiagnosisStores")
                .serviceDetails("Diagnosis", "ListDiagnosisStores", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDiagnosisStoresRequest::builder)
                .basePath("/20260331")
                .appendPathParam("diagnosisStores")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("diagnosisStoreId", request.getDiagnosisStoreId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.clusterhealth.model.DiagnosisStoreCollection.class,
                        ListDiagnosisStoresResponse.Builder::diagnosisStoreCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDiagnosisStoresResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDiagnosisStoresResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails("Diagnosis", "ListWorkRequestErrors", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20260331")
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
                        com.oracle.bmc.clusterhealth.model.WorkRequestErrorCollection.class,
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
                .serviceDetails("Diagnosis", "ListWorkRequestLogs", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20260331")
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
                        com.oracle.bmc.clusterhealth.model.WorkRequestLogEntryCollection.class,
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
                .serviceDetails("Diagnosis", "ListWorkRequests", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20260331")
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
                        com.oracle.bmc.clusterhealth.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public QueryDiagnosisByHealthCheckKeyResponse queryDiagnosisByHealthCheckKey(
            QueryDiagnosisByHealthCheckKeyRequest request) {

        Validate.notBlank(request.getDiagnosisStoreId(), "diagnosisStoreId must not be blank");
        Objects.requireNonNull(
                request.getQueryDiagnosisByHealthCheckKeyDetails(),
                "queryDiagnosisByHealthCheckKeyDetails is required");

        return clientCall(request, QueryDiagnosisByHealthCheckKeyResponse::builder)
                .logger(LOG, "queryDiagnosisByHealthCheckKey")
                .serviceDetails("Diagnosis", "QueryDiagnosisByHealthCheckKey", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(QueryDiagnosisByHealthCheckKeyRequest::builder)
                .basePath("/20260331")
                .appendPathParam("diagnosisStores")
                .appendPathParam(request.getDiagnosisStoreId())
                .appendPathParam("actions")
                .appendPathParam("queryDiagnosisByHealthCheckKey")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.clusterhealth.model.RecommendationReport.class,
                        QueryDiagnosisByHealthCheckKeyResponse.Builder::recommendationReport)
                .handleResponseHeaderString(
                        "etag", QueryDiagnosisByHealthCheckKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        QueryDiagnosisByHealthCheckKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public QueryDiagnosisSummaryResponse queryDiagnosisSummary(
            QueryDiagnosisSummaryRequest request) {

        Validate.notBlank(request.getDiagnosisStoreId(), "diagnosisStoreId must not be blank");
        Objects.requireNonNull(
                request.getQueryDiagnosisSummaryDetails(),
                "queryDiagnosisSummaryDetails is required");

        return clientCall(request, QueryDiagnosisSummaryResponse::builder)
                .logger(LOG, "queryDiagnosisSummary")
                .serviceDetails("Diagnosis", "QueryDiagnosisSummary", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(QueryDiagnosisSummaryRequest::builder)
                .basePath("/20260331")
                .appendPathParam("diagnosisStores")
                .appendPathParam(request.getDiagnosisStoreId())
                .appendPathParam("actions")
                .appendPathParam("queryDiagnosisSummary")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.clusterhealth.model.DiagnosisSummaryCollection.class,
                        QueryDiagnosisSummaryResponse.Builder::diagnosisSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", QueryDiagnosisSummaryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", QueryDiagnosisSummaryResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RequestDiagnosisResponse requestDiagnosis(RequestDiagnosisRequest request) {

        Validate.notBlank(request.getDiagnosisStoreId(), "diagnosisStoreId must not be blank");
        Objects.requireNonNull(
                request.getRequestDiagnosisDetails(), "requestDiagnosisDetails is required");

        return clientCall(request, RequestDiagnosisResponse::builder)
                .logger(LOG, "requestDiagnosis")
                .serviceDetails("Diagnosis", "RequestDiagnosis", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestDiagnosisRequest::builder)
                .basePath("/20260331")
                .appendPathParam("diagnosisStores")
                .appendPathParam(request.getDiagnosisStoreId())
                .appendPathParam("actions")
                .appendPathParam("requestDiagnosis")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.clusterhealth.model.DiagnosisResults.class,
                        RequestDiagnosisResponse.Builder::diagnosisResults)
                .handleResponseHeaderString("etag", RequestDiagnosisResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RequestDiagnosisResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDiagnosisStoreResponse updateDiagnosisStore(UpdateDiagnosisStoreRequest request) {

        Validate.notBlank(request.getDiagnosisStoreId(), "diagnosisStoreId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDiagnosisStoreDetails(),
                "updateDiagnosisStoreDetails is required");

        return clientCall(request, UpdateDiagnosisStoreResponse::builder)
                .logger(LOG, "updateDiagnosisStore")
                .serviceDetails("Diagnosis", "UpdateDiagnosisStore", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDiagnosisStoreRequest::builder)
                .basePath("/20260331")
                .appendPathParam("diagnosisStores")
                .appendPathParam(request.getDiagnosisStoreId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDiagnosisStoreResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDiagnosisStoreResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DiagnosisWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DiagnosisPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DiagnosisClient(
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
    public DiagnosisClient(
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
    public DiagnosisClient(
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
    public DiagnosisClient(
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
    public DiagnosisClient(
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
    public DiagnosisClient(
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
    public DiagnosisClient(
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
    public DiagnosisClient(
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
