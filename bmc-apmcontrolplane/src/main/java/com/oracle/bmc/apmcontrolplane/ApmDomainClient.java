/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmcontrolplane;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.apmcontrolplane.requests.*;
import com.oracle.bmc.apmcontrolplane.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class ApmDomainClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements ApmDomain {
    /** Service instance for ApmDomain. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("APMDOMAIN")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://apm-cp.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ApmDomainClient.class);

    private final ApmDomainWaiters waiters;

    private final ApmDomainPaginators paginators;

    ApmDomainClient(
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
                                    .nameFormat("ApmDomain-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new ApmDomainWaiters(executorService, this);

        this.paginators = new ApmDomainPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ApmDomainClient> {
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
        public ApmDomainClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ApmDomainClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeApmDomainCompartmentResponse changeApmDomainCompartment(
            ChangeApmDomainCompartmentRequest request) {

        Validate.notBlank(request.getApmDomainId(), "apmDomainId must not be blank");
        Objects.requireNonNull(
                request.getChangeApmDomainCompartmentDetails(),
                "changeApmDomainCompartmentDetails is required");

        return clientCall(request, ChangeApmDomainCompartmentResponse::builder)
                .logger(LOG, "changeApmDomainCompartment")
                .serviceDetails(
                        "ApmDomain",
                        "ChangeApmDomainCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/ApmDomain/ChangeApmDomainCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeApmDomainCompartmentRequest::builder)
                .basePath("/20200630")
                .appendPathParam("apmDomains")
                .appendPathParam(request.getApmDomainId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeApmDomainCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeApmDomainCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateApmDomainResponse createApmDomain(CreateApmDomainRequest request) {
        Objects.requireNonNull(
                request.getCreateApmDomainDetails(), "createApmDomainDetails is required");

        return clientCall(request, CreateApmDomainResponse::builder)
                .logger(LOG, "createApmDomain")
                .serviceDetails(
                        "ApmDomain",
                        "CreateApmDomain",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/ApmDomain/CreateApmDomain")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateApmDomainRequest::builder)
                .basePath("/20200630")
                .appendPathParam("apmDomains")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateApmDomainResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateApmDomainResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteApmDomainResponse deleteApmDomain(DeleteApmDomainRequest request) {

        Validate.notBlank(request.getApmDomainId(), "apmDomainId must not be blank");

        return clientCall(request, DeleteApmDomainResponse::builder)
                .logger(LOG, "deleteApmDomain")
                .serviceDetails(
                        "ApmDomain",
                        "DeleteApmDomain",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/ApmDomain/DeleteApmDomain")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteApmDomainRequest::builder)
                .basePath("/20200630")
                .appendPathParam("apmDomains")
                .appendPathParam(request.getApmDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteApmDomainResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteApmDomainResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GenerateDataKeysResponse generateDataKeys(GenerateDataKeysRequest request) {
        Objects.requireNonNull(
                request.getGenerateDataKeysListDetails(),
                "generateDataKeysListDetails is required");

        Validate.notBlank(request.getApmDomainId(), "apmDomainId must not be blank");

        return clientCall(request, GenerateDataKeysResponse::builder)
                .logger(LOG, "generateDataKeys")
                .serviceDetails(
                        "ApmDomain",
                        "GenerateDataKeys",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/DataKey/GenerateDataKeys")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateDataKeysRequest::builder)
                .basePath("/20200630")
                .appendPathParam("apmDomains")
                .appendPathParam(request.getApmDomainId())
                .appendPathParam("actions")
                .appendPathParam("generateDataKeys")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", GenerateDataKeysResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", GenerateDataKeysResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetApmDomainResponse getApmDomain(GetApmDomainRequest request) {

        Validate.notBlank(request.getApmDomainId(), "apmDomainId must not be blank");

        return clientCall(request, GetApmDomainResponse::builder)
                .logger(LOG, "getApmDomain")
                .serviceDetails(
                        "ApmDomain",
                        "GetApmDomain",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/ApmDomain/GetApmDomain")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetApmDomainRequest::builder)
                .basePath("/20200630")
                .appendPathParam("apmDomains")
                .appendPathParam(request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apmcontrolplane.model.ApmDomain.class,
                        GetApmDomainResponse.Builder::apmDomain)
                .handleResponseHeaderString("etag", GetApmDomainResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetApmDomainResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "ApmDomain",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20200630")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apmcontrolplane.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListApmDomainWorkRequestsResponse listApmDomainWorkRequests(
            ListApmDomainWorkRequestsRequest request) {

        Validate.notBlank(request.getApmDomainId(), "apmDomainId must not be blank");

        return clientCall(request, ListApmDomainWorkRequestsResponse::builder)
                .logger(LOG, "listApmDomainWorkRequests")
                .serviceDetails(
                        "ApmDomain",
                        "ListApmDomainWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/WorkRequest/ListApmDomainWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApmDomainWorkRequestsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("apmDomains")
                .appendPathParam(request.getApmDomainId())
                .appendPathParam("workRequests")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.apmcontrolplane.model.WorkRequest.class,
                        ListApmDomainWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListApmDomainWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListApmDomainWorkRequestsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListApmDomainsResponse listApmDomains(ListApmDomainsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListApmDomainsResponse::builder)
                .logger(LOG, "listApmDomains")
                .serviceDetails(
                        "ApmDomain",
                        "ListApmDomains",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/ApmDomainSummary/ListApmDomains")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApmDomainsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("apmDomains")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.apmcontrolplane.model.ApmDomainSummary.class,
                        ListApmDomainsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListApmDomainsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListApmDomainsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListDataKeysResponse listDataKeys(ListDataKeysRequest request) {

        Validate.notBlank(request.getApmDomainId(), "apmDomainId must not be blank");

        return clientCall(request, ListDataKeysResponse::builder)
                .logger(LOG, "listDataKeys")
                .serviceDetails(
                        "ApmDomain",
                        "ListDataKeys",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/DataKeySummary/ListDataKeys")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDataKeysRequest::builder)
                .basePath("/20200630")
                .appendPathParam("apmDomains")
                .appendPathParam(request.getApmDomainId())
                .appendPathParam("dataKeys")
                .appendEnumQueryParam("dataKeyType", request.getDataKeyType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.apmcontrolplane.model.DataKeySummary.class,
                        ListDataKeysResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDataKeysResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "ApmDomain",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.apmcontrolplane.model.WorkRequestError.class,
                        ListWorkRequestErrorsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "ApmDomain",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.apmcontrolplane.model.WorkRequestLogEntry.class,
                        ListWorkRequestLogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "ApmDomain",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.apmcontrolplane.model.WorkRequest.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RemoveDataKeysResponse removeDataKeys(RemoveDataKeysRequest request) {

        Validate.notBlank(request.getApmDomainId(), "apmDomainId must not be blank");
        Objects.requireNonNull(
                request.getRemoveDataKeysListDetails(), "removeDataKeysListDetails is required");

        return clientCall(request, RemoveDataKeysResponse::builder)
                .logger(LOG, "removeDataKeys")
                .serviceDetails(
                        "ApmDomain",
                        "RemoveDataKeys",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/DataKey/RemoveDataKeys")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveDataKeysRequest::builder)
                .basePath("/20200630")
                .appendPathParam("apmDomains")
                .appendPathParam(request.getApmDomainId())
                .appendPathParam("actions")
                .appendPathParam("removeDataKeys")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", RemoveDataKeysResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveDataKeysResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateApmDomainResponse updateApmDomain(UpdateApmDomainRequest request) {

        Validate.notBlank(request.getApmDomainId(), "apmDomainId must not be blank");
        Objects.requireNonNull(
                request.getUpdateApmDomainDetails(), "updateApmDomainDetails is required");

        return clientCall(request, UpdateApmDomainResponse::builder)
                .logger(LOG, "updateApmDomain")
                .serviceDetails(
                        "ApmDomain",
                        "UpdateApmDomain",
                        "https://docs.oracle.com/iaas/api/#/en/apm-control-plane/20200630/ApmDomain/UpdateApmDomain")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateApmDomainRequest::builder)
                .basePath("/20200630")
                .appendPathParam("apmDomains")
                .appendPathParam(request.getApmDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateApmDomainResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateApmDomainResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ApmDomainWaiters getWaiters() {
        return waiters;
    }

    @Override
    public ApmDomainPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ApmDomainClient(
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
    public ApmDomainClient(
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
    public ApmDomainClient(
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
    public ApmDomainClient(
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
    public ApmDomainClient(
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
    public ApmDomainClient(
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
    public ApmDomainClient(
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
    public ApmDomainClient(
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
