/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.gdp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.gdp.requests.*;
import com.oracle.bmc.gdp.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230301")
public class GuardedDataPipelineClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements GuardedDataPipeline {
    /** Service instance for GuardedDataPipeline. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(GuardedDataPipelineClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://gdp.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GuardedDataPipelineClient.class);

    private final GuardedDataPipelineWaiters waiters;

    private final GuardedDataPipelinePaginators paginators;

    GuardedDataPipelineClient(
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
                                    .nameFormat("GuardedDataPipeline-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new GuardedDataPipelineWaiters(executorService, this);

        this.paginators = new GuardedDataPipelinePaginators(this);
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
                    Builder, GuardedDataPipelineClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "gdp";
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
        public GuardedDataPipelineClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new GuardedDataPipelineClient(
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
    public ChangeGdpPipelineCompartmentResponse changeGdpPipelineCompartment(
            ChangeGdpPipelineCompartmentRequest request) {

        Validate.notBlank(request.getGdpPipelineId(), "gdpPipelineId must not be blank");
        Objects.requireNonNull(
                request.getChangeGdpPipelineCompartmentDetails(),
                "changeGdpPipelineCompartmentDetails is required");

        return clientCall(request, ChangeGdpPipelineCompartmentResponse::builder)
                .logger(LOG, "changeGdpPipelineCompartment")
                .serviceDetails("GuardedDataPipeline", "ChangeGdpPipelineCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeGdpPipelineCompartmentRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpPipelines")
                .appendPathParam(request.getGdpPipelineId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeGdpPipelineCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeGdpPipelineCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateGdpPipelineResponse createGdpPipeline(CreateGdpPipelineRequest request) {
        Objects.requireNonNull(
                request.getCreateGdpPipelineDetails(), "createGdpPipelineDetails is required");

        return clientCall(request, CreateGdpPipelineResponse::builder)
                .logger(LOG, "createGdpPipeline")
                .serviceDetails("GuardedDataPipeline", "CreateGdpPipeline", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateGdpPipelineRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpPipelines")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateGdpPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateGdpPipelineResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteGdpPipelineResponse deleteGdpPipeline(DeleteGdpPipelineRequest request) {

        Validate.notBlank(request.getGdpPipelineId(), "gdpPipelineId must not be blank");

        return clientCall(request, DeleteGdpPipelineResponse::builder)
                .logger(LOG, "deleteGdpPipeline")
                .serviceDetails("GuardedDataPipeline", "DeleteGdpPipeline", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteGdpPipelineRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpPipelines")
                .appendPathParam(request.getGdpPipelineId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteGdpPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteGdpPipelineResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetGdpPipelineResponse getGdpPipeline(GetGdpPipelineRequest request) {

        Validate.notBlank(request.getGdpPipelineId(), "gdpPipelineId must not be blank");

        return clientCall(request, GetGdpPipelineResponse::builder)
                .logger(LOG, "getGdpPipeline")
                .serviceDetails("GuardedDataPipeline", "GetGdpPipeline", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGdpPipelineRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpPipelines")
                .appendPathParam(request.getGdpPipelineId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.gdp.model.GdpPipeline.class,
                        GetGdpPipelineResponse.Builder::gdpPipeline)
                .handleResponseHeaderString("etag", GetGdpPipelineResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetGdpPipelineResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetGdpWorkRequestResponse getGdpWorkRequest(GetGdpWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetGdpWorkRequestResponse::builder)
                .logger(LOG, "getGdpWorkRequest")
                .serviceDetails("GuardedDataPipeline", "GetGdpWorkRequest", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGdpWorkRequestRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.gdp.model.GdpWorkRequest.class,
                        GetGdpWorkRequestResponse.Builder::gdpWorkRequest)
                .handleResponseHeaderString("etag", GetGdpWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetGdpWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetGdpWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListGdpPipelinesResponse listGdpPipelines(ListGdpPipelinesRequest request) {

        return clientCall(request, ListGdpPipelinesResponse::builder)
                .logger(LOG, "listGdpPipelines")
                .serviceDetails("GuardedDataPipeline", "ListGdpPipelines", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGdpPipelinesRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpPipelines")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("gdpPipelineId", request.getGdpPipelineId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.gdp.model.GdpPipelineCollection.class,
                        ListGdpPipelinesResponse.Builder::gdpPipelineCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListGdpPipelinesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListGdpPipelinesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListGdpWorkRequestErrorsResponse listGdpWorkRequestErrors(
            ListGdpWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListGdpWorkRequestErrorsResponse::builder)
                .logger(LOG, "listGdpWorkRequestErrors")
                .serviceDetails("GuardedDataPipeline", "ListGdpWorkRequestErrors", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGdpWorkRequestErrorsRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpWorkRequests")
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
                        com.oracle.bmc.gdp.model.WorkRequestErrorCollection.class,
                        ListGdpWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListGdpWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListGdpWorkRequestErrorsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListGdpWorkRequestLogsResponse listGdpWorkRequestLogs(
            ListGdpWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListGdpWorkRequestLogsResponse::builder)
                .logger(LOG, "listGdpWorkRequestLogs")
                .serviceDetails("GuardedDataPipeline", "ListGdpWorkRequestLogs", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGdpWorkRequestLogsRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpWorkRequests")
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
                        com.oracle.bmc.gdp.model.WorkRequestLogEntryCollection.class,
                        ListGdpWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListGdpWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListGdpWorkRequestLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListGdpWorkRequestsResponse listGdpWorkRequests(ListGdpWorkRequestsRequest request) {

        return clientCall(request, ListGdpWorkRequestsResponse::builder)
                .logger(LOG, "listGdpWorkRequests")
                .serviceDetails("GuardedDataPipeline", "ListGdpWorkRequests", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGdpWorkRequestsRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpWorkRequests")
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
                        com.oracle.bmc.gdp.model.GdpWorkRequestSummaryCollection.class,
                        ListGdpWorkRequestsResponse.Builder::gdpWorkRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListGdpWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListGdpWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public PeerGdpPipelineResponse peerGdpPipeline(PeerGdpPipelineRequest request) {
        Objects.requireNonNull(
                request.getPeerGdpPipelineDetails(), "peerGdpPipelineDetails is required");

        Validate.notBlank(request.getGdpPipelineId(), "gdpPipelineId must not be blank");

        return clientCall(request, PeerGdpPipelineResponse::builder)
                .logger(LOG, "peerGdpPipeline")
                .serviceDetails("GuardedDataPipeline", "PeerGdpPipeline", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PeerGdpPipelineRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpPipelines")
                .appendPathParam(request.getGdpPipelineId())
                .appendPathParam("actions")
                .appendPathParam("peer")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", PeerGdpPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PeerGdpPipelineResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RotateGdpPipelineKeysResponse rotateGdpPipelineKeys(
            RotateGdpPipelineKeysRequest request) {

        Validate.notBlank(request.getGdpPipelineId(), "gdpPipelineId must not be blank");

        return clientCall(request, RotateGdpPipelineKeysResponse::builder)
                .logger(LOG, "rotateGdpPipelineKeys")
                .serviceDetails("GuardedDataPipeline", "RotateGdpPipelineKeys", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotateGdpPipelineKeysRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpPipelines")
                .appendPathParam(request.getGdpPipelineId())
                .appendPathParam("actions")
                .appendPathParam("rotateKeys")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RotateGdpPipelineKeysResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RotateGdpPipelineKeysResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StartGdpPipelineResponse startGdpPipeline(StartGdpPipelineRequest request) {

        Validate.notBlank(request.getGdpPipelineId(), "gdpPipelineId must not be blank");

        return clientCall(request, StartGdpPipelineResponse::builder)
                .logger(LOG, "startGdpPipeline")
                .serviceDetails("GuardedDataPipeline", "StartGdpPipeline", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartGdpPipelineRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpPipelines")
                .appendPathParam(request.getGdpPipelineId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", StartGdpPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartGdpPipelineResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StopGdpPipelineResponse stopGdpPipeline(StopGdpPipelineRequest request) {

        Validate.notBlank(request.getGdpPipelineId(), "gdpPipelineId must not be blank");

        return clientCall(request, StopGdpPipelineResponse::builder)
                .logger(LOG, "stopGdpPipeline")
                .serviceDetails("GuardedDataPipeline", "StopGdpPipeline", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopGdpPipelineRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpPipelines")
                .appendPathParam(request.getGdpPipelineId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", StopGdpPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StopGdpPipelineResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateGdpPipelineResponse updateGdpPipeline(UpdateGdpPipelineRequest request) {

        Validate.notBlank(request.getGdpPipelineId(), "gdpPipelineId must not be blank");
        Objects.requireNonNull(
                request.getUpdateGdpPipelineDetails(), "updateGdpPipelineDetails is required");

        return clientCall(request, UpdateGdpPipelineResponse::builder)
                .logger(LOG, "updateGdpPipeline")
                .serviceDetails("GuardedDataPipeline", "UpdateGdpPipeline", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateGdpPipelineRequest::builder)
                .basePath("/20230301")
                .appendPathParam("gdpPipelines")
                .appendPathParam(request.getGdpPipelineId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateGdpPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateGdpPipelineResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GuardedDataPipelineWaiters getWaiters() {
        return waiters;
    }

    @Override
    public GuardedDataPipelinePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public GuardedDataPipelineClient(
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
    public GuardedDataPipelineClient(
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
    public GuardedDataPipelineClient(
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
    public GuardedDataPipelineClient(
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
    public GuardedDataPipelineClient(
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
    public GuardedDataPipelineClient(
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
    public GuardedDataPipelineClient(
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
    public GuardedDataPipelineClient(
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
