/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaidata;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.generativeaidata.requests.*;
import com.oracle.bmc.generativeaidata.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260325")
public class EnrichmentJobClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements EnrichmentJob {
    /** Service instance for EnrichmentJob. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(EnrichmentJobClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://inference.generativeai.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(EnrichmentJobClient.class);

    private final EnrichmentJobWaiters waiters;

    private final EnrichmentJobPaginators paginators;

    EnrichmentJobClient(
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
                                    .nameFormat("EnrichmentJob-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new EnrichmentJobWaiters(executorService, this);

        this.paginators = new EnrichmentJobPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, EnrichmentJobClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "generativeaidata";
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
        public EnrichmentJobClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new EnrichmentJobClient(this, authenticationDetailsProvider, executorService);
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
    public CancelEnrichmentJobResponse cancelEnrichmentJob(CancelEnrichmentJobRequest request) {

        Validate.notBlank(request.getSemanticStoreId(), "semanticStoreId must not be blank");

        Validate.notBlank(request.getEnrichmentJobId(), "enrichmentJobId must not be blank");

        return clientCall(request, CancelEnrichmentJobResponse::builder)
                .logger(LOG, "cancelEnrichmentJob")
                .serviceDetails(
                        "EnrichmentJob",
                        "CancelEnrichmentJob",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-nl2sql/20260325/EnrichmentJob/CancelEnrichmentJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelEnrichmentJobRequest::builder)
                .basePath("/20260325")
                .appendPathParam("semanticStores")
                .appendPathParam(request.getSemanticStoreId())
                .appendPathParam("enrichmentJobs")
                .appendPathParam(request.getEnrichmentJobId())
                .appendPathParam("actions")
                .appendPathParam("cancel")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeaidata.model.EnrichmentJob.class,
                        CancelEnrichmentJobResponse.Builder::enrichmentJob)
                .handleResponseHeaderString("etag", CancelEnrichmentJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CancelEnrichmentJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CancelEnrichmentJobResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public GenerateEnrichmentJobResponse generateEnrichmentJob(
            GenerateEnrichmentJobRequest request) {
        Objects.requireNonNull(
                request.getGenerateEnrichmentJobDetails(),
                "generateEnrichmentJobDetails is required");

        Validate.notBlank(request.getSemanticStoreId(), "semanticStoreId must not be blank");

        return clientCall(request, GenerateEnrichmentJobResponse::builder)
                .logger(LOG, "generateEnrichmentJob")
                .serviceDetails(
                        "EnrichmentJob",
                        "GenerateEnrichmentJob",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-nl2sql/20260325/EnrichmentJob/GenerateEnrichmentJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateEnrichmentJobRequest::builder)
                .basePath("/20260325")
                .appendPathParam("semanticStores")
                .appendPathParam(request.getSemanticStoreId())
                .appendPathParam("actions")
                .appendPathParam("enrich")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaidata.model.EnrichmentJob.class,
                        GenerateEnrichmentJobResponse.Builder::enrichmentJob)
                .handleResponseHeaderString("etag", GenerateEnrichmentJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GenerateEnrichmentJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        GenerateEnrichmentJobResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public GetEnrichmentJobResponse getEnrichmentJob(GetEnrichmentJobRequest request) {

        Validate.notBlank(request.getSemanticStoreId(), "semanticStoreId must not be blank");

        Validate.notBlank(request.getEnrichmentJobId(), "enrichmentJobId must not be blank");

        return clientCall(request, GetEnrichmentJobResponse::builder)
                .logger(LOG, "getEnrichmentJob")
                .serviceDetails(
                        "EnrichmentJob",
                        "GetEnrichmentJob",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-nl2sql/20260325/EnrichmentJob/GetEnrichmentJob")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEnrichmentJobRequest::builder)
                .basePath("/20260325")
                .appendPathParam("semanticStores")
                .appendPathParam(request.getSemanticStoreId())
                .appendPathParam("enrichmentJobs")
                .appendPathParam(request.getEnrichmentJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeaidata.model.EnrichmentJob.class,
                        GetEnrichmentJobResponse.Builder::enrichmentJob)
                .handleResponseHeaderString("etag", GetEnrichmentJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetEnrichmentJobResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListEnrichmentJobsResponse listEnrichmentJobs(ListEnrichmentJobsRequest request) {

        Validate.notBlank(request.getSemanticStoreId(), "semanticStoreId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListEnrichmentJobsResponse::builder)
                .logger(LOG, "listEnrichmentJobs")
                .serviceDetails(
                        "EnrichmentJob",
                        "ListEnrichmentJobs",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-nl2sql/20260325/EnrichmentJobCollection/ListEnrichmentJobs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEnrichmentJobsRequest::builder)
                .basePath("/20260325")
                .appendPathParam("semanticStores")
                .appendPathParam(request.getSemanticStoreId())
                .appendPathParam("enrichmentJobs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.generativeaidata.model.EnrichmentJobCollection.class,
                        ListEnrichmentJobsResponse.Builder::enrichmentJobCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListEnrichmentJobsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListEnrichmentJobsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListEnrichmentJobsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public EnrichmentJobWaiters getWaiters() {
        return waiters;
    }

    @Override
    public EnrichmentJobPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public EnrichmentJobClient(
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
    public EnrichmentJobClient(
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
    public EnrichmentJobClient(
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
    public EnrichmentJobClient(
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
    public EnrichmentJobClient(
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
    public EnrichmentJobClient(
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
    public EnrichmentJobClient(
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
    public EnrichmentJobClient(
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
