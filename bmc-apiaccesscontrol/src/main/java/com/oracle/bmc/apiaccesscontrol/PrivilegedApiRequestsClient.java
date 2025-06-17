/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apiaccesscontrol;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.apiaccesscontrol.requests.*;
import com.oracle.bmc.apiaccesscontrol.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241130")
public class PrivilegedApiRequestsClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements PrivilegedApiRequests {
    /** Service instance for PrivilegedApiRequests. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("PRIVILEGEDAPIREQUESTS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://pactl.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(PrivilegedApiRequestsClient.class);

    private final PrivilegedApiRequestsWaiters waiters;

    private final PrivilegedApiRequestsPaginators paginators;

    PrivilegedApiRequestsClient(
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
                                    .nameFormat("PrivilegedApiRequests-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new PrivilegedApiRequestsWaiters(executorService, this);

        this.paginators = new PrivilegedApiRequestsPaginators(this);
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
                    Builder, PrivilegedApiRequestsClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "apiaccesscontrol";
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
        public PrivilegedApiRequestsClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new PrivilegedApiRequestsClient(
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
    public ApprovePrivilegedApiRequestResponse approvePrivilegedApiRequest(
            ApprovePrivilegedApiRequestRequest request) {

        Validate.notBlank(
                request.getPrivilegedApiRequestId(), "privilegedApiRequestId must not be blank");
        Objects.requireNonNull(
                request.getApprovePrivilegedApiRequestDetails(),
                "approvePrivilegedApiRequestDetails is required");

        return clientCall(request, ApprovePrivilegedApiRequestResponse::builder)
                .logger(LOG, "approvePrivilegedApiRequest")
                .serviceDetails("PrivilegedApiRequests", "ApprovePrivilegedApiRequest", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ApprovePrivilegedApiRequestRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiRequests")
                .appendPathParam(request.getPrivilegedApiRequestId())
                .appendPathParam("actions")
                .appendPathParam("approve")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ApprovePrivilegedApiRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ApprovePrivilegedApiRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ClosePrivilegedApiRequestResponse closePrivilegedApiRequest(
            ClosePrivilegedApiRequestRequest request) {

        Validate.notBlank(
                request.getPrivilegedApiRequestId(), "privilegedApiRequestId must not be blank");
        Objects.requireNonNull(
                request.getClosePrivilegedApiRequestDetails(),
                "closePrivilegedApiRequestDetails is required");

        return clientCall(request, ClosePrivilegedApiRequestResponse::builder)
                .logger(LOG, "closePrivilegedApiRequest")
                .serviceDetails("PrivilegedApiRequests", "ClosePrivilegedApiRequest", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ClosePrivilegedApiRequestRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiRequests")
                .appendPathParam(request.getPrivilegedApiRequestId())
                .appendPathParam("actions")
                .appendPathParam("close")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ClosePrivilegedApiRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ClosePrivilegedApiRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreatePrivilegedApiRequestResponse createPrivilegedApiRequest(
            CreatePrivilegedApiRequestRequest request) {
        Objects.requireNonNull(
                request.getCreatePrivilegedApiRequestDetails(),
                "createPrivilegedApiRequestDetails is required");

        return clientCall(request, CreatePrivilegedApiRequestResponse::builder)
                .logger(LOG, "createPrivilegedApiRequest")
                .serviceDetails("PrivilegedApiRequests", "CreatePrivilegedApiRequest", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePrivilegedApiRequestRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiRequests")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apiaccesscontrol.model.PrivilegedApiRequest.class,
                        CreatePrivilegedApiRequestResponse.Builder::privilegedApiRequest)
                .handleResponseHeaderString(
                        "location", CreatePrivilegedApiRequestResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreatePrivilegedApiRequestResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreatePrivilegedApiRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreatePrivilegedApiRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePrivilegedApiRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPrivilegedApiRequestResponse getPrivilegedApiRequest(
            GetPrivilegedApiRequestRequest request) {

        Validate.notBlank(
                request.getPrivilegedApiRequestId(), "privilegedApiRequestId must not be blank");

        return clientCall(request, GetPrivilegedApiRequestResponse::builder)
                .logger(LOG, "getPrivilegedApiRequest")
                .serviceDetails("PrivilegedApiRequests", "GetPrivilegedApiRequest", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPrivilegedApiRequestRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiRequests")
                .appendPathParam(request.getPrivilegedApiRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.apiaccesscontrol.model.PrivilegedApiRequest.class,
                        GetPrivilegedApiRequestResponse.Builder::privilegedApiRequest)
                .handleResponseHeaderString("etag", GetPrivilegedApiRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPrivilegedApiRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListPrivilegedApiRequestsResponse listPrivilegedApiRequests(
            ListPrivilegedApiRequestsRequest request) {

        return clientCall(request, ListPrivilegedApiRequestsResponse::builder)
                .logger(LOG, "listPrivilegedApiRequests")
                .serviceDetails("PrivilegedApiRequests", "ListPrivilegedApiRequests", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPrivilegedApiRequestsRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("state", request.getState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.apiaccesscontrol.model.PrivilegedApiRequestCollection.class,
                        ListPrivilegedApiRequestsResponse.Builder::privilegedApiRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPrivilegedApiRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPrivilegedApiRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RejectPrivilegedApiRequestResponse rejectPrivilegedApiRequest(
            RejectPrivilegedApiRequestRequest request) {

        Validate.notBlank(
                request.getPrivilegedApiRequestId(), "privilegedApiRequestId must not be blank");
        Objects.requireNonNull(
                request.getRejectPrivilegedApiRequestDetails(),
                "rejectPrivilegedApiRequestDetails is required");

        return clientCall(request, RejectPrivilegedApiRequestResponse::builder)
                .logger(LOG, "rejectPrivilegedApiRequest")
                .serviceDetails("PrivilegedApiRequests", "RejectPrivilegedApiRequest", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RejectPrivilegedApiRequestRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiRequests")
                .appendPathParam(request.getPrivilegedApiRequestId())
                .appendPathParam("actions")
                .appendPathParam("reject")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RejectPrivilegedApiRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RejectPrivilegedApiRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RevokePrivilegedApiRequestResponse revokePrivilegedApiRequest(
            RevokePrivilegedApiRequestRequest request) {

        Validate.notBlank(
                request.getPrivilegedApiRequestId(), "privilegedApiRequestId must not be blank");
        Objects.requireNonNull(
                request.getRevokePrivilegedApiRequestDetails(),
                "revokePrivilegedApiRequestDetails is required");

        return clientCall(request, RevokePrivilegedApiRequestResponse::builder)
                .logger(LOG, "revokePrivilegedApiRequest")
                .serviceDetails("PrivilegedApiRequests", "RevokePrivilegedApiRequest", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RevokePrivilegedApiRequestRequest::builder)
                .basePath("/20241130")
                .appendPathParam("privilegedApiRequests")
                .appendPathParam(request.getPrivilegedApiRequestId())
                .appendPathParam("actions")
                .appendPathParam("revoke")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RevokePrivilegedApiRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RevokePrivilegedApiRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public PrivilegedApiRequestsWaiters getWaiters() {
        return waiters;
    }

    @Override
    public PrivilegedApiRequestsPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public PrivilegedApiRequestsClient(
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
    public PrivilegedApiRequestsClient(
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
    public PrivilegedApiRequestsClient(
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
    public PrivilegedApiRequestsClient(
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
    public PrivilegedApiRequestsClient(
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
    public PrivilegedApiRequestsClient(
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
    public PrivilegedApiRequestsClient(
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
    public PrivilegedApiRequestsClient(
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
