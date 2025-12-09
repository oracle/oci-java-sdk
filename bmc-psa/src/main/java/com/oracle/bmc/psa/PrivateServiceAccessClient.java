/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psa;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.psa.requests.*;
import com.oracle.bmc.psa.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240301")
public class PrivateServiceAccessClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements PrivateServiceAccess {
    /** Service instance for PrivateServiceAccess. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(PrivateServiceAccessClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://psasvc.{region}.oci.{secondLevelDomain}")
                    .endpointServiceName("psasvc")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(PrivateServiceAccessClient.class);

    private final PrivateServiceAccessWaiters waiters;

    private final PrivateServiceAccessPaginators paginators;

    PrivateServiceAccessClient(
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
                                    .nameFormat("PrivateServiceAccess-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new PrivateServiceAccessWaiters(executorService, this);

        this.paginators = new PrivateServiceAccessPaginators(this);
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
                    Builder, PrivateServiceAccessClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "psa";
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
        public PrivateServiceAccessClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new PrivateServiceAccessClient(
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
    public CancelPsaWorkRequestResponse cancelPsaWorkRequest(CancelPsaWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, CancelPsaWorkRequestResponse::builder)
                .logger(LOG, "cancelPsaWorkRequest")
                .serviceDetails("PrivateServiceAccess", "CancelPsaWorkRequest", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelPsaWorkRequestRequest::builder)
                .basePath("/20240301")
                .appendPathParam("psaWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", CancelPsaWorkRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangePrivateServiceAccessCompartmentResponse changePrivateServiceAccessCompartment(
            ChangePrivateServiceAccessCompartmentRequest request) {

        Validate.notBlank(
                request.getPrivateServiceAccessId(), "privateServiceAccessId must not be blank");
        Objects.requireNonNull(
                request.getChangePrivateServiceAccessCompartmentDetails(),
                "changePrivateServiceAccessCompartmentDetails is required");

        return clientCall(request, ChangePrivateServiceAccessCompartmentResponse::builder)
                .logger(LOG, "changePrivateServiceAccessCompartment")
                .serviceDetails("PrivateServiceAccess", "ChangePrivateServiceAccessCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangePrivateServiceAccessCompartmentRequest::builder)
                .basePath("/20240301")
                .appendPathParam("privateServiceAccess")
                .appendPathParam(request.getPrivateServiceAccessId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangePrivateServiceAccessCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangePrivateServiceAccessCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreatePrivateServiceAccessResponse createPrivateServiceAccess(
            CreatePrivateServiceAccessRequest request) {
        Objects.requireNonNull(
                request.getCreatePrivateServiceAccessDetails(),
                "createPrivateServiceAccessDetails is required");

        return clientCall(request, CreatePrivateServiceAccessResponse::builder)
                .logger(LOG, "createPrivateServiceAccess")
                .serviceDetails("PrivateServiceAccess", "CreatePrivateServiceAccess", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePrivateServiceAccessRequest::builder)
                .basePath("/20240301")
                .appendPathParam("privateServiceAccess")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.psa.model.PrivateServiceAccess.class,
                        CreatePrivateServiceAccessResponse.Builder::privateServiceAccess)
                .handleResponseHeaderString(
                        "location", CreatePrivateServiceAccessResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreatePrivateServiceAccessResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreatePrivateServiceAccessResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreatePrivateServiceAccessResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePrivateServiceAccessResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeletePrivateServiceAccessResponse deletePrivateServiceAccess(
            DeletePrivateServiceAccessRequest request) {

        Validate.notBlank(
                request.getPrivateServiceAccessId(), "privateServiceAccessId must not be blank");

        return clientCall(request, DeletePrivateServiceAccessResponse::builder)
                .logger(LOG, "deletePrivateServiceAccess")
                .serviceDetails("PrivateServiceAccess", "DeletePrivateServiceAccess", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePrivateServiceAccessRequest::builder)
                .basePath("/20240301")
                .appendPathParam("privateServiceAccess")
                .appendPathParam(request.getPrivateServiceAccessId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeletePrivateServiceAccessResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeletePrivateServiceAccessResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPrivateServiceAccessResponse getPrivateServiceAccess(
            GetPrivateServiceAccessRequest request) {

        Validate.notBlank(
                request.getPrivateServiceAccessId(), "privateServiceAccessId must not be blank");

        return clientCall(request, GetPrivateServiceAccessResponse::builder)
                .logger(LOG, "getPrivateServiceAccess")
                .serviceDetails("PrivateServiceAccess", "GetPrivateServiceAccess", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPrivateServiceAccessRequest::builder)
                .basePath("/20240301")
                .appendPathParam("privateServiceAccess")
                .appendPathParam(request.getPrivateServiceAccessId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.psa.model.PrivateServiceAccess.class,
                        GetPrivateServiceAccessResponse.Builder::privateServiceAccess)
                .handleResponseHeaderString("etag", GetPrivateServiceAccessResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPrivateServiceAccessResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPsaWorkRequestResponse getPsaWorkRequest(GetPsaWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetPsaWorkRequestResponse::builder)
                .logger(LOG, "getPsaWorkRequest")
                .serviceDetails("PrivateServiceAccess", "GetPsaWorkRequest", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPsaWorkRequestRequest::builder)
                .basePath("/20240301")
                .appendPathParam("psaWorkRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.psa.model.WorkRequest.class,
                        GetPsaWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetPsaWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPsaWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetPsaWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListPrivateServiceAccessesResponse listPrivateServiceAccesses(
            ListPrivateServiceAccessesRequest request) {

        return clientCall(request, ListPrivateServiceAccessesResponse::builder)
                .logger(LOG, "listPrivateServiceAccesses")
                .serviceDetails("PrivateServiceAccess", "ListPrivateServiceAccesses", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPrivateServiceAccessesRequest::builder)
                .basePath("/20240301")
                .appendPathParam("privateServiceAccess")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("vcnId", request.getVcnId())
                .appendQueryParam("serviceId", request.getServiceId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.psa.model.PrivateServiceAccessCollection.class,
                        ListPrivateServiceAccessesResponse.Builder::privateServiceAccessCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPrivateServiceAccessesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPrivateServiceAccessesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListPsaServicesResponse listPsaServices(ListPsaServicesRequest request) {

        return clientCall(request, ListPsaServicesResponse::builder)
                .logger(LOG, "listPsaServices")
                .serviceDetails("PrivateServiceAccess", "ListPsaServices", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPsaServicesRequest::builder)
                .basePath("/20240301")
                .appendPathParam("psaServices")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("serviceId", request.getServiceId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.psa.model.PsaServiceCollection.class,
                        ListPsaServicesResponse.Builder::psaServiceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPsaServicesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPsaServicesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListPsaWorkRequestErrorsResponse listPsaWorkRequestErrors(
            ListPsaWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListPsaWorkRequestErrorsResponse::builder)
                .logger(LOG, "listPsaWorkRequestErrors")
                .serviceDetails("PrivateServiceAccess", "ListPsaWorkRequestErrors", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPsaWorkRequestErrorsRequest::builder)
                .basePath("/20240301")
                .appendPathParam("psaWorkRequests")
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
                        com.oracle.bmc.psa.model.WorkRequestErrorCollection.class,
                        ListPsaWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListPsaWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListPsaWorkRequestErrorsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListPsaWorkRequestLogsResponse listPsaWorkRequestLogs(
            ListPsaWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListPsaWorkRequestLogsResponse::builder)
                .logger(LOG, "listPsaWorkRequestLogs")
                .serviceDetails("PrivateServiceAccess", "ListPsaWorkRequestLogs", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPsaWorkRequestLogsRequest::builder)
                .basePath("/20240301")
                .appendPathParam("psaWorkRequests")
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
                        com.oracle.bmc.psa.model.WorkRequestLogEntryCollection.class,
                        ListPsaWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListPsaWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListPsaWorkRequestLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListPsaWorkRequestsResponse listPsaWorkRequests(ListPsaWorkRequestsRequest request) {

        return clientCall(request, ListPsaWorkRequestsResponse::builder)
                .logger(LOG, "listPsaWorkRequests")
                .serviceDetails("PrivateServiceAccess", "ListPsaWorkRequests", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPsaWorkRequestsRequest::builder)
                .basePath("/20240301")
                .appendPathParam("psaWorkRequests")
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
                        com.oracle.bmc.psa.model.WorkRequestSummaryCollection.class,
                        ListPsaWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPsaWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPsaWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdatePrivateServiceAccessResponse updatePrivateServiceAccess(
            UpdatePrivateServiceAccessRequest request) {

        Validate.notBlank(
                request.getPrivateServiceAccessId(), "privateServiceAccessId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePrivateServiceAccessDetails(),
                "updatePrivateServiceAccessDetails is required");

        return clientCall(request, UpdatePrivateServiceAccessResponse::builder)
                .logger(LOG, "updatePrivateServiceAccess")
                .serviceDetails("PrivateServiceAccess", "UpdatePrivateServiceAccess", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePrivateServiceAccessRequest::builder)
                .basePath("/20240301")
                .appendPathParam("privateServiceAccess")
                .appendPathParam(request.getPrivateServiceAccessId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdatePrivateServiceAccessResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePrivateServiceAccessResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public PrivateServiceAccessWaiters getWaiters() {
        return waiters;
    }

    @Override
    public PrivateServiceAccessPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public PrivateServiceAccessClient(
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
    public PrivateServiceAccessClient(
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
    public PrivateServiceAccessClient(
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
    public PrivateServiceAccessClient(
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
    public PrivateServiceAccessClient(
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
    public PrivateServiceAccessClient(
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
    public PrivateServiceAccessClient(
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
    public PrivateServiceAccessClient(
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
