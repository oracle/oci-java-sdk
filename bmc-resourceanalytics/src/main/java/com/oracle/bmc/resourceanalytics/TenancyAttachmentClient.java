/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourceanalytics;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.resourceanalytics.requests.*;
import com.oracle.bmc.resourceanalytics.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241031")
public class TenancyAttachmentClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements TenancyAttachment {
    /** Service instance for TenancyAttachment. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(TenancyAttachmentClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://resource-analytics.{region}.ocp.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(TenancyAttachmentClient.class);

    private final TenancyAttachmentWaiters waiters;

    private final TenancyAttachmentPaginators paginators;

    TenancyAttachmentClient(
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
                                    .nameFormat("TenancyAttachment-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new TenancyAttachmentWaiters(executorService, this);

        this.paginators = new TenancyAttachmentPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, TenancyAttachmentClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "resourceanalytics";
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
        public TenancyAttachmentClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new TenancyAttachmentClient(
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
    public CreateTenancyAttachmentResponse createTenancyAttachment(
            CreateTenancyAttachmentRequest request) {
        Objects.requireNonNull(
                request.getCreateTenancyAttachmentDetails(),
                "createTenancyAttachmentDetails is required");

        return clientCall(request, CreateTenancyAttachmentResponse::builder)
                .logger(LOG, "createTenancyAttachment")
                .serviceDetails(
                        "TenancyAttachment",
                        "CreateTenancyAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/resource-analytics/20241031/TenancyAttachment/CreateTenancyAttachment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTenancyAttachmentRequest::builder)
                .basePath("/20241031")
                .appendPathParam("tenancyAttachments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.resourceanalytics.model.TenancyAttachment.class,
                        CreateTenancyAttachmentResponse.Builder::tenancyAttachment)
                .handleResponseHeaderString(
                        "location", CreateTenancyAttachmentResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateTenancyAttachmentResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateTenancyAttachmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateTenancyAttachmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTenancyAttachmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteTenancyAttachmentResponse deleteTenancyAttachment(
            DeleteTenancyAttachmentRequest request) {

        Validate.notBlank(
                request.getTenancyAttachmentId(), "tenancyAttachmentId must not be blank");

        return clientCall(request, DeleteTenancyAttachmentResponse::builder)
                .logger(LOG, "deleteTenancyAttachment")
                .serviceDetails(
                        "TenancyAttachment",
                        "DeleteTenancyAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/resource-analytics/20241031/TenancyAttachment/DeleteTenancyAttachment")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTenancyAttachmentRequest::builder)
                .basePath("/20241031")
                .appendPathParam("tenancyAttachments")
                .appendPathParam(request.getTenancyAttachmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteTenancyAttachmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTenancyAttachmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetTenancyAttachmentResponse getTenancyAttachment(GetTenancyAttachmentRequest request) {

        Validate.notBlank(
                request.getTenancyAttachmentId(), "tenancyAttachmentId must not be blank");

        return clientCall(request, GetTenancyAttachmentResponse::builder)
                .logger(LOG, "getTenancyAttachment")
                .serviceDetails(
                        "TenancyAttachment",
                        "GetTenancyAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/resource-analytics/20241031/TenancyAttachment/GetTenancyAttachment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTenancyAttachmentRequest::builder)
                .basePath("/20241031")
                .appendPathParam("tenancyAttachments")
                .appendPathParam(request.getTenancyAttachmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.resourceanalytics.model.TenancyAttachment.class,
                        GetTenancyAttachmentResponse.Builder::tenancyAttachment)
                .handleResponseHeaderString("etag", GetTenancyAttachmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTenancyAttachmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListTenancyAttachmentsResponse listTenancyAttachments(
            ListTenancyAttachmentsRequest request) {

        return clientCall(request, ListTenancyAttachmentsResponse::builder)
                .logger(LOG, "listTenancyAttachments")
                .serviceDetails(
                        "TenancyAttachment",
                        "ListTenancyAttachments",
                        "https://docs.oracle.com/iaas/api/#/en/resource-analytics/20241031/TenancyAttachmentCollection/ListTenancyAttachments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTenancyAttachmentsRequest::builder)
                .basePath("/20241031")
                .appendPathParam("tenancyAttachments")
                .appendQueryParam(
                        "resourceAnalyticsInstanceId", request.getResourceAnalyticsInstanceId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.resourceanalytics.model.TenancyAttachmentCollection.class,
                        ListTenancyAttachmentsResponse.Builder::tenancyAttachmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTenancyAttachmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTenancyAttachmentsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateTenancyAttachmentResponse updateTenancyAttachment(
            UpdateTenancyAttachmentRequest request) {

        Validate.notBlank(
                request.getTenancyAttachmentId(), "tenancyAttachmentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateTenancyAttachmentDetails(),
                "updateTenancyAttachmentDetails is required");

        return clientCall(request, UpdateTenancyAttachmentResponse::builder)
                .logger(LOG, "updateTenancyAttachment")
                .serviceDetails(
                        "TenancyAttachment",
                        "UpdateTenancyAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/resource-analytics/20241031/TenancyAttachment/UpdateTenancyAttachment")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTenancyAttachmentRequest::builder)
                .basePath("/20241031")
                .appendPathParam("tenancyAttachments")
                .appendPathParam(request.getTenancyAttachmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateTenancyAttachmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTenancyAttachmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public TenancyAttachmentWaiters getWaiters() {
        return waiters;
    }

    @Override
    public TenancyAttachmentPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public TenancyAttachmentClient(
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
    public TenancyAttachmentClient(
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
    public TenancyAttachmentClient(
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
    public TenancyAttachmentClient(
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
    public TenancyAttachmentClient(
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
    public TenancyAttachmentClient(
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
    public TenancyAttachmentClient(
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
    public TenancyAttachmentClient(
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
