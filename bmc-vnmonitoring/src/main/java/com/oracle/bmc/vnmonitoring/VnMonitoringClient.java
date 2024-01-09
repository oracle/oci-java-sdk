/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.vnmonitoring.requests.*;
import com.oracle.bmc.vnmonitoring.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class VnMonitoringClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements VnMonitoring {
    /** Service instance for VnMonitoring. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("VNMONITORING")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://vnca-api.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(VnMonitoringClient.class);

    private final VnMonitoringWaiters waiters;

    private final VnMonitoringPaginators paginators;

    VnMonitoringClient(
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
                                    .nameFormat("VnMonitoring-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new VnMonitoringWaiters(executorService, this);

        this.paginators = new VnMonitoringPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, VnMonitoringClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "vnmonitoring";
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
        public VnMonitoringClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new VnMonitoringClient(this, authenticationDetailsProvider, executorService);
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
    public ChangePathAnalyzerTestCompartmentResponse changePathAnalyzerTestCompartment(
            ChangePathAnalyzerTestCompartmentRequest request) {

        Validate.notBlank(request.getPathAnalyzerTestId(), "pathAnalyzerTestId must not be blank");
        Objects.requireNonNull(
                request.getChangePathAnalyzerTestCompartmentDetails(),
                "changePathAnalyzerTestCompartmentDetails is required");

        return clientCall(request, ChangePathAnalyzerTestCompartmentResponse::builder)
                .logger(LOG, "changePathAnalyzerTestCompartment")
                .serviceDetails(
                        "VnMonitoring",
                        "ChangePathAnalyzerTestCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/NetMonitor/20160918/PathAnalyzerTest/ChangePathAnalyzerTestCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangePathAnalyzerTestCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pathAnalyzerTests")
                .appendPathParam(request.getPathAnalyzerTestId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangePathAnalyzerTestCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangePathAnalyzerTestCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreatePathAnalyzerTestResponse createPathAnalyzerTest(
            CreatePathAnalyzerTestRequest request) {
        Objects.requireNonNull(
                request.getCreatePathAnalyzerTestDetails(),
                "createPathAnalyzerTestDetails is required");

        return clientCall(request, CreatePathAnalyzerTestResponse::builder)
                .logger(LOG, "createPathAnalyzerTest")
                .serviceDetails(
                        "VnMonitoring",
                        "CreatePathAnalyzerTest",
                        "https://docs.oracle.com/iaas/api/#/en/NetMonitor/20160918/PathAnalyzerTest/CreatePathAnalyzerTest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePathAnalyzerTestRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pathAnalyzerTests")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.vnmonitoring.model.PathAnalyzerTest.class,
                        CreatePathAnalyzerTestResponse.Builder::pathAnalyzerTest)
                .handleResponseHeaderString("etag", CreatePathAnalyzerTestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePathAnalyzerTestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeletePathAnalyzerTestResponse deletePathAnalyzerTest(
            DeletePathAnalyzerTestRequest request) {

        Validate.notBlank(request.getPathAnalyzerTestId(), "pathAnalyzerTestId must not be blank");

        return clientCall(request, DeletePathAnalyzerTestResponse::builder)
                .logger(LOG, "deletePathAnalyzerTest")
                .serviceDetails(
                        "VnMonitoring",
                        "DeletePathAnalyzerTest",
                        "https://docs.oracle.com/iaas/api/#/en/NetMonitor/20160918/PathAnalyzerTest/DeletePathAnalyzerTest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePathAnalyzerTestRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pathAnalyzerTests")
                .appendPathParam(request.getPathAnalyzerTestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePathAnalyzerTestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPathAnalysisResponse getPathAnalysis(GetPathAnalysisRequest request) {
        Objects.requireNonNull(
                request.getGetPathAnalysisDetails(), "getPathAnalysisDetails is required");

        return clientCall(request, GetPathAnalysisResponse::builder)
                .logger(LOG, "getPathAnalysis")
                .serviceDetails(
                        "VnMonitoring",
                        "GetPathAnalysis",
                        "https://docs.oracle.com/iaas/api/#/en/NetMonitor/20160918/PathAnalysisWorkRequestResult/GetPathAnalysis")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GetPathAnalysisRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pathAnalysis")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("cache-control", request.getCacheControl())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", GetPathAnalysisResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", GetPathAnalysisResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public GetPathAnalyzerTestResponse getPathAnalyzerTest(GetPathAnalyzerTestRequest request) {

        Validate.notBlank(request.getPathAnalyzerTestId(), "pathAnalyzerTestId must not be blank");

        return clientCall(request, GetPathAnalyzerTestResponse::builder)
                .logger(LOG, "getPathAnalyzerTest")
                .serviceDetails(
                        "VnMonitoring",
                        "GetPathAnalyzerTest",
                        "https://docs.oracle.com/iaas/api/#/en/NetMonitor/20160918/PathAnalyzerTest/GetPathAnalyzerTest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPathAnalyzerTestRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pathAnalyzerTests")
                .appendPathParam(request.getPathAnalyzerTestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.vnmonitoring.model.PathAnalyzerTest.class,
                        GetPathAnalyzerTestResponse.Builder::pathAnalyzerTest)
                .handleResponseHeaderString("etag", GetPathAnalyzerTestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPathAnalyzerTestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "VnMonitoring",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/NetMonitor/20160918/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20160918")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.vnmonitoring.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListPathAnalyzerTestsResponse listPathAnalyzerTests(
            ListPathAnalyzerTestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListPathAnalyzerTestsResponse::builder)
                .logger(LOG, "listPathAnalyzerTests")
                .serviceDetails(
                        "VnMonitoring",
                        "ListPathAnalyzerTests",
                        "https://docs.oracle.com/iaas/api/#/en/NetMonitor/20160918/PathAnalyzerTestCollection/ListPathAnalyzerTests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPathAnalyzerTestsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pathAnalyzerTests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.vnmonitoring.model.PathAnalyzerTestCollection.class,
                        ListPathAnalyzerTestsResponse.Builder::pathAnalyzerTestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPathAnalyzerTestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPathAnalyzerTestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "VnMonitoring",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/NetMonitor/20160918/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.vnmonitoring.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "VnMonitoring",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/NetMonitor/20160918/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.vnmonitoring.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestResultsResponse listWorkRequestResults(
            ListWorkRequestResultsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestResultsResponse::builder)
                .logger(LOG, "listWorkRequestResults")
                .serviceDetails(
                        "VnMonitoring",
                        "ListWorkRequestResults",
                        "https://docs.oracle.com/iaas/api/#/en/NetMonitor/20160918/WorkRequestResult/ListWorkRequestResults")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestResultsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("results")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("resultType", request.getResultType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.vnmonitoring.model.WorkRequestResultCollection.class,
                        ListWorkRequestResultsResponse.Builder::workRequestResultCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestResultsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestResultsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "VnMonitoring",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/NetMonitor/20160918/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("resourceId", request.getResourceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.vnmonitoring.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdatePathAnalyzerTestResponse updatePathAnalyzerTest(
            UpdatePathAnalyzerTestRequest request) {

        Validate.notBlank(request.getPathAnalyzerTestId(), "pathAnalyzerTestId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePathAnalyzerTestDetails(),
                "updatePathAnalyzerTestDetails is required");

        return clientCall(request, UpdatePathAnalyzerTestResponse::builder)
                .logger(LOG, "updatePathAnalyzerTest")
                .serviceDetails(
                        "VnMonitoring",
                        "UpdatePathAnalyzerTest",
                        "https://docs.oracle.com/iaas/api/#/en/NetMonitor/20160918/PathAnalyzerTest/UpdatePathAnalyzerTest")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePathAnalyzerTestRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pathAnalyzerTests")
                .appendPathParam(request.getPathAnalyzerTestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.vnmonitoring.model.PathAnalyzerTest.class,
                        UpdatePathAnalyzerTestResponse.Builder::pathAnalyzerTest)
                .handleResponseHeaderString("etag", UpdatePathAnalyzerTestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePathAnalyzerTestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public VnMonitoringWaiters getWaiters() {
        return waiters;
    }

    @Override
    public VnMonitoringPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public VnMonitoringClient(
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
    public VnMonitoringClient(
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
    public VnMonitoringClient(
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
    public VnMonitoringClient(
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
    public VnMonitoringClient(
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
    public VnMonitoringClient(
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
    public VnMonitoringClient(
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
    public VnMonitoringClient(
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
