/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bastion;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.bastion.requests.*;
import com.oracle.bmc.bastion.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210331")
public class BastionClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Bastion {
    /** Service instance for Bastion. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("BASTION")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://bastion.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(BastionClient.class);

    private final BastionWaiters waiters;

    private final BastionPaginators paginators;

    BastionClient(
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
                                    .nameFormat("Bastion-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new BastionWaiters(executorService, this);

        this.paginators = new BastionPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, BastionClient> {
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
        public BastionClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new BastionClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeBastionCompartmentResponse changeBastionCompartment(
            ChangeBastionCompartmentRequest request) {

        Validate.notBlank(request.getBastionId(), "bastionId must not be blank");
        Objects.requireNonNull(
                request.getChangeBastionCompartmentDetails(),
                "changeBastionCompartmentDetails is required");

        return clientCall(request, ChangeBastionCompartmentResponse::builder)
                .logger(LOG, "changeBastionCompartment")
                .serviceDetails(
                        "Bastion",
                        "ChangeBastionCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/bastion/20210331/Bastion/ChangeBastionCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeBastionCompartmentRequest::builder)
                .basePath("/20210331")
                .appendPathParam("bastions")
                .appendPathParam(request.getBastionId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeBastionCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateBastionResponse createBastion(CreateBastionRequest request) {
        Objects.requireNonNull(
                request.getCreateBastionDetails(), "createBastionDetails is required");

        return clientCall(request, CreateBastionResponse::builder)
                .logger(LOG, "createBastion")
                .serviceDetails(
                        "Bastion",
                        "CreateBastion",
                        "https://docs.oracle.com/iaas/api/#/en/bastion/20210331/Bastion/CreateBastion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBastionRequest::builder)
                .basePath("/20210331")
                .appendPathParam("bastions")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.bastion.model.Bastion.class,
                        CreateBastionResponse.Builder::bastion)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateBastionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBastionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", CreateBastionResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateBastionResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateSessionResponse createSession(CreateSessionRequest request) {
        Objects.requireNonNull(
                request.getCreateSessionDetails(), "createSessionDetails is required");

        return clientCall(request, CreateSessionResponse::builder)
                .logger(LOG, "createSession")
                .serviceDetails(
                        "Bastion",
                        "CreateSession",
                        "https://docs.oracle.com/iaas/api/#/en/bastion/20210331/Session/CreateSession")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSessionRequest::builder)
                .basePath("/20210331")
                .appendPathParam("sessions")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.bastion.model.Session.class,
                        CreateSessionResponse.Builder::session)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateSessionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSessionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", CreateSessionResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateSessionResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteBastionResponse deleteBastion(DeleteBastionRequest request) {

        Validate.notBlank(request.getBastionId(), "bastionId must not be blank");

        return clientCall(request, DeleteBastionResponse::builder)
                .logger(LOG, "deleteBastion")
                .serviceDetails(
                        "Bastion",
                        "DeleteBastion",
                        "https://docs.oracle.com/iaas/api/#/en/bastion/20210331/Bastion/DeleteBastion")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBastionRequest::builder)
                .basePath("/20210331")
                .appendPathParam("bastions")
                .appendPathParam(request.getBastionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteBastionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBastionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteSessionResponse deleteSession(DeleteSessionRequest request) {

        Validate.notBlank(request.getSessionId(), "sessionId must not be blank");

        return clientCall(request, DeleteSessionResponse::builder)
                .logger(LOG, "deleteSession")
                .serviceDetails(
                        "Bastion",
                        "DeleteSession",
                        "https://docs.oracle.com/iaas/api/#/en/bastion/20210331/Session/DeleteSession")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSessionRequest::builder)
                .basePath("/20210331")
                .appendPathParam("sessions")
                .appendPathParam(request.getSessionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteSessionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSessionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetBastionResponse getBastion(GetBastionRequest request) {

        Validate.notBlank(request.getBastionId(), "bastionId must not be blank");

        return clientCall(request, GetBastionResponse::builder)
                .logger(LOG, "getBastion")
                .serviceDetails(
                        "Bastion",
                        "GetBastion",
                        "https://docs.oracle.com/iaas/api/#/en/bastion/20210331/Bastion/GetBastion")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBastionRequest::builder)
                .basePath("/20210331")
                .appendPathParam("bastions")
                .appendPathParam(request.getBastionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.bastion.model.Bastion.class,
                        GetBastionResponse.Builder::bastion)
                .handleResponseHeaderString("etag", GetBastionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBastionResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetSessionResponse getSession(GetSessionRequest request) {

        Validate.notBlank(request.getSessionId(), "sessionId must not be blank");

        return clientCall(request, GetSessionResponse::builder)
                .logger(LOG, "getSession")
                .serviceDetails(
                        "Bastion",
                        "GetSession",
                        "https://docs.oracle.com/iaas/api/#/en/bastion/20210331/Session/GetSession")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSessionRequest::builder)
                .basePath("/20210331")
                .appendPathParam("sessions")
                .appendPathParam(request.getSessionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.bastion.model.Session.class,
                        GetSessionResponse.Builder::session)
                .handleResponseHeaderString("etag", GetSessionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSessionResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "Bastion",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/bastion/20210331/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20210331")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.bastion.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListBastionsResponse listBastions(ListBastionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListBastionsResponse::builder)
                .logger(LOG, "listBastions")
                .serviceDetails(
                        "Bastion",
                        "ListBastions",
                        "https://docs.oracle.com/iaas/api/#/en/bastion/20210331/Bastion/ListBastions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBastionsRequest::builder)
                .basePath("/20210331")
                .appendPathParam("bastions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("bastionLifecycleState", request.getBastionLifecycleState())
                .appendQueryParam("bastionId", request.getBastionId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.bastion.model.BastionSummary.class,
                        ListBastionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListBastionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBastionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListSessionsResponse listSessions(ListSessionsRequest request) {
        Objects.requireNonNull(request.getBastionId(), "bastionId is required");

        return clientCall(request, ListSessionsResponse::builder)
                .logger(LOG, "listSessions")
                .serviceDetails(
                        "Bastion",
                        "ListSessions",
                        "https://docs.oracle.com/iaas/api/#/en/bastion/20210331/Session/ListSessions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSessionsRequest::builder)
                .basePath("/20210331")
                .appendPathParam("sessions")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("bastionId", request.getBastionId())
                .appendEnumQueryParam("sessionLifecycleState", request.getSessionLifecycleState())
                .appendQueryParam("sessionId", request.getSessionId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.bastion.model.SessionSummary.class,
                        ListSessionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListSessionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSessionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "Bastion",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/bastion/20210331/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20210331")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.bastion.model.WorkRequestError.class,
                        ListWorkRequestErrorsResponse.Builder::items)
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
                        "Bastion",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/bastion/20210331/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20210331")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.bastion.model.WorkRequestLogEntry.class,
                        ListWorkRequestLogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "Bastion",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/bastion/20210331/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20210331")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.bastion.model.WorkRequestSummary.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateBastionResponse updateBastion(UpdateBastionRequest request) {

        Validate.notBlank(request.getBastionId(), "bastionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateBastionDetails(), "updateBastionDetails is required");

        return clientCall(request, UpdateBastionResponse::builder)
                .logger(LOG, "updateBastion")
                .serviceDetails(
                        "Bastion",
                        "UpdateBastion",
                        "https://docs.oracle.com/iaas/api/#/en/bastion/20210331/Bastion/UpdateBastion")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBastionRequest::builder)
                .basePath("/20210331")
                .appendPathParam("bastions")
                .appendPathParam(request.getBastionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateBastionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBastionResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateSessionResponse updateSession(UpdateSessionRequest request) {

        Validate.notBlank(request.getSessionId(), "sessionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSessionDetails(), "updateSessionDetails is required");

        return clientCall(request, UpdateSessionResponse::builder)
                .logger(LOG, "updateSession")
                .serviceDetails(
                        "Bastion",
                        "UpdateSession",
                        "https://docs.oracle.com/iaas/api/#/en/bastion/20210331/Session/UpdateSession")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSessionRequest::builder)
                .basePath("/20210331")
                .appendPathParam("sessions")
                .appendPathParam(request.getSessionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.bastion.model.Session.class,
                        UpdateSessionResponse.Builder::session)
                .handleResponseHeaderString("etag", UpdateSessionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSessionResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public BastionWaiters getWaiters() {
        return waiters;
    }

    @Override
    public BastionPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public BastionClient(
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
    public BastionClient(
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
    public BastionClient(
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
    public BastionClient(
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
    public BastionClient(
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
    public BastionClient(
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
    public BastionClient(
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
    public BastionClient(
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
