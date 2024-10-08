/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.zpr;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.zpr.requests.*;
import com.oracle.bmc.zpr.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240301")
public class ZprClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Zpr {
    /** Service instance for Zpr. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ZPR")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://zpr.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ZprClient.class);

    private final ZprWaiters waiters;

    private final ZprPaginators paginators;

    ZprClient(
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
                                    .nameFormat("Zpr-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new ZprWaiters(executorService, this);

        this.paginators = new ZprPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ZprClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "zpr";
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
        public ZprClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ZprClient(this, authenticationDetailsProvider, executorService);
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
    public CreateConfigurationResponse createConfiguration(CreateConfigurationRequest request) {
        Objects.requireNonNull(
                request.getCreateConfigurationDetails(), "createConfigurationDetails is required");

        return clientCall(request, CreateConfigurationResponse::builder)
                .logger(LOG, "createConfiguration")
                .serviceDetails("Zpr", "CreateConfiguration", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateConfigurationRequest::builder)
                .basePath("/20240301")
                .appendPathParam("configuration")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-dry-run", request.getOpcDryRun())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", CreateConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateConfigurationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateZprPolicyResponse createZprPolicy(CreateZprPolicyRequest request) {
        Objects.requireNonNull(
                request.getCreateZprPolicyDetails(), "createZprPolicyDetails is required");

        return clientCall(request, CreateZprPolicyResponse::builder)
                .logger(LOG, "createZprPolicy")
                .serviceDetails("Zpr", "CreateZprPolicy", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateZprPolicyRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprPolicies")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-dry-run", request.getOpcDryRun())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.zpr.model.ZprPolicy.class,
                        CreateZprPolicyResponse.Builder::zprPolicy)
                .handleResponseHeaderString("location", CreateZprPolicyResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateZprPolicyResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "opc-request-id", CreateZprPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateZprPolicyResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteZprPolicyResponse deleteZprPolicy(DeleteZprPolicyRequest request) {

        Validate.notBlank(request.getZprPolicyId(), "zprPolicyId must not be blank");

        return clientCall(request, DeleteZprPolicyResponse::builder)
                .logger(LOG, "deleteZprPolicy")
                .serviceDetails("Zpr", "DeleteZprPolicy", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteZprPolicyRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprPolicies")
                .appendPathParam(request.getZprPolicyId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-dry-run", request.getOpcDryRun())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteZprPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteZprPolicyResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public GetConfigurationResponse getConfiguration(GetConfigurationRequest request) {

        return clientCall(request, GetConfigurationResponse::builder)
                .logger(LOG, "getConfiguration")
                .serviceDetails("Zpr", "GetConfiguration", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConfigurationRequest::builder)
                .basePath("/20240301")
                .appendPathParam("configuration")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.zpr.model.Configuration.class,
                        GetConfigurationResponse.Builder::configuration)
                .handleResponseHeaderString("etag", GetConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConfigurationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetZprConfigurationWorkRequestResponse getZprConfigurationWorkRequest(
            GetZprConfigurationWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetZprConfigurationWorkRequestResponse::builder)
                .logger(LOG, "getZprConfigurationWorkRequest")
                .serviceDetails("Zpr", "GetZprConfigurationWorkRequest", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetZprConfigurationWorkRequestRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprConfigurationWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.zpr.model.WorkRequest.class,
                        GetZprConfigurationWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "etag", GetZprConfigurationWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetZprConfigurationWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetZprConfigurationWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public GetZprPolicyResponse getZprPolicy(GetZprPolicyRequest request) {

        Validate.notBlank(request.getZprPolicyId(), "zprPolicyId must not be blank");

        return clientCall(request, GetZprPolicyResponse::builder)
                .logger(LOG, "getZprPolicy")
                .serviceDetails("Zpr", "GetZprPolicy", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetZprPolicyRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprPolicies")
                .appendPathParam(request.getZprPolicyId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.zpr.model.ZprPolicy.class,
                        GetZprPolicyResponse.Builder::zprPolicy)
                .handleResponseHeaderString("etag", GetZprPolicyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetZprPolicyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetZprPolicyWorkRequestResponse getZprPolicyWorkRequest(
            GetZprPolicyWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetZprPolicyWorkRequestResponse::builder)
                .logger(LOG, "getZprPolicyWorkRequest")
                .serviceDetails("Zpr", "GetZprPolicyWorkRequest", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetZprPolicyWorkRequestRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprPolicyWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.zpr.model.WorkRequest.class,
                        GetZprPolicyWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetZprPolicyWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetZprPolicyWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetZprPolicyWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListZprConfigurationWorkRequestErrorsResponse listZprConfigurationWorkRequestErrors(
            ListZprConfigurationWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListZprConfigurationWorkRequestErrorsResponse::builder)
                .logger(LOG, "listZprConfigurationWorkRequestErrors")
                .serviceDetails("Zpr", "ListZprConfigurationWorkRequestErrors", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListZprConfigurationWorkRequestErrorsRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprConfigurationWorkRequests")
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
                        com.oracle.bmc.zpr.model.WorkRequestErrorCollection.class,
                        ListZprConfigurationWorkRequestErrorsResponse.Builder
                                ::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListZprConfigurationWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListZprConfigurationWorkRequestErrorsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListZprConfigurationWorkRequestLogsResponse listZprConfigurationWorkRequestLogs(
            ListZprConfigurationWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListZprConfigurationWorkRequestLogsResponse::builder)
                .logger(LOG, "listZprConfigurationWorkRequestLogs")
                .serviceDetails("Zpr", "ListZprConfigurationWorkRequestLogs", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListZprConfigurationWorkRequestLogsRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprConfigurationWorkRequests")
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
                        com.oracle.bmc.zpr.model.WorkRequestLogEntryCollection.class,
                        ListZprConfigurationWorkRequestLogsResponse.Builder
                                ::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListZprConfigurationWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListZprConfigurationWorkRequestLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListZprConfigurationWorkRequestsResponse listZprConfigurationWorkRequests(
            ListZprConfigurationWorkRequestsRequest request) {

        return clientCall(request, ListZprConfigurationWorkRequestsResponse::builder)
                .logger(LOG, "listZprConfigurationWorkRequests")
                .serviceDetails("Zpr", "ListZprConfigurationWorkRequests", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListZprConfigurationWorkRequestsRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprConfigurationWorkRequests")
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
                        com.oracle.bmc.zpr.model.WorkRequestSummaryCollection.class,
                        ListZprConfigurationWorkRequestsResponse.Builder
                                ::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListZprConfigurationWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListZprConfigurationWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListZprPoliciesResponse listZprPolicies(ListZprPoliciesRequest request) {

        return clientCall(request, ListZprPoliciesResponse::builder)
                .logger(LOG, "listZprPolicies")
                .serviceDetails("Zpr", "ListZprPolicies", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListZprPoliciesRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprPolicies")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.zpr.model.ZprPolicyCollection.class,
                        ListZprPoliciesResponse.Builder::zprPolicyCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListZprPoliciesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListZprPoliciesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListZprPolicyWorkRequestErrorsResponse listZprPolicyWorkRequestErrors(
            ListZprPolicyWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListZprPolicyWorkRequestErrorsResponse::builder)
                .logger(LOG, "listZprPolicyWorkRequestErrors")
                .serviceDetails("Zpr", "ListZprPolicyWorkRequestErrors", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListZprPolicyWorkRequestErrorsRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprPolicyWorkRequests")
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
                        com.oracle.bmc.zpr.model.WorkRequestErrorCollection.class,
                        ListZprPolicyWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListZprPolicyWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListZprPolicyWorkRequestErrorsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListZprPolicyWorkRequestLogsResponse listZprPolicyWorkRequestLogs(
            ListZprPolicyWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListZprPolicyWorkRequestLogsResponse::builder)
                .logger(LOG, "listZprPolicyWorkRequestLogs")
                .serviceDetails("Zpr", "ListZprPolicyWorkRequestLogs", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListZprPolicyWorkRequestLogsRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprPolicyWorkRequests")
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
                        com.oracle.bmc.zpr.model.WorkRequestLogEntryCollection.class,
                        ListZprPolicyWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListZprPolicyWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListZprPolicyWorkRequestLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListZprPolicyWorkRequestsResponse listZprPolicyWorkRequests(
            ListZprPolicyWorkRequestsRequest request) {

        return clientCall(request, ListZprPolicyWorkRequestsResponse::builder)
                .logger(LOG, "listZprPolicyWorkRequests")
                .serviceDetails("Zpr", "ListZprPolicyWorkRequests", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListZprPolicyWorkRequestsRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprPolicyWorkRequests")
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
                        com.oracle.bmc.zpr.model.WorkRequestSummaryCollection.class,
                        ListZprPolicyWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListZprPolicyWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListZprPolicyWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateZprPolicyResponse updateZprPolicy(UpdateZprPolicyRequest request) {

        Validate.notBlank(request.getZprPolicyId(), "zprPolicyId must not be blank");
        Objects.requireNonNull(
                request.getUpdateZprPolicyDetails(), "updateZprPolicyDetails is required");

        return clientCall(request, UpdateZprPolicyResponse::builder)
                .logger(LOG, "updateZprPolicy")
                .serviceDetails("Zpr", "UpdateZprPolicy", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateZprPolicyRequest::builder)
                .basePath("/20240301")
                .appendPathParam("zprPolicies")
                .appendPathParam(request.getZprPolicyId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-dry-run", request.getOpcDryRun())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateZprPolicyResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateZprPolicyResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ZprWaiters getWaiters() {
        return waiters;
    }

    @Override
    public ZprPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ZprClient(
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
    public ZprClient(
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
    public ZprClient(
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
    public ZprClient(
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
    public ZprClient(
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
    public ZprClient(
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
    public ZprClient(
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
    public ZprClient(
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
