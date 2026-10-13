/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ccdoffers;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.ccdoffers.requests.*;
import com.oracle.bmc.ccdoffers.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240601")
public class CcdCommitmentsClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements CcdCommitments {
    /** Service instance for CcdCommitments. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(CcdCommitmentsClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://ccdOffers.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CcdCommitmentsClient.class);

    private final CcdCommitmentsWaiters waiters;

    private final CcdCommitmentsPaginators paginators;

    CcdCommitmentsClient(
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
                                    .nameFormat("CcdCommitments-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new CcdCommitmentsWaiters(executorService, this);

        this.paginators = new CcdCommitmentsPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, CcdCommitmentsClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "ccdoffers";
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
        public CcdCommitmentsClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new CcdCommitmentsClient(this, authenticationDetailsProvider, executorService);
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
    public CreateCcdCommitmentResponse createCcdCommitment(CreateCcdCommitmentRequest request) {
        Objects.requireNonNull(request.getCcdOfferId(), "ccdOfferId is required");

        Objects.requireNonNull(
                request.getCreateCcdCommitmentDetails(), "createCcdCommitmentDetails is required");

        return clientCall(request, CreateCcdCommitmentResponse::builder)
                .logger(LOG, "createCcdCommitment")
                .serviceDetails("CcdCommitments", "CreateCcdCommitment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCcdCommitmentRequest::builder)
                .basePath("/20240601")
                .appendPathParam("ccdCommitments")
                .appendQueryParam("ccdOfferId", request.getCcdOfferId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ccdoffers.model.CcdCommitment.class,
                        CreateCcdCommitmentResponse.Builder::ccdCommitment)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCcdCommitmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateCcdCommitmentResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteCcdCommitmentResponse deleteCcdCommitment(DeleteCcdCommitmentRequest request) {

        Validate.notBlank(request.getCcdCommitmentId(), "ccdCommitmentId must not be blank");

        return clientCall(request, DeleteCcdCommitmentResponse::builder)
                .logger(LOG, "deleteCcdCommitment")
                .serviceDetails("CcdCommitments", "DeleteCcdCommitment", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCcdCommitmentRequest::builder)
                .basePath("/20240601")
                .appendPathParam("ccdCommitments")
                .appendPathParam(request.getCcdCommitmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCcdCommitmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCcdCommitmentResponse getCcdCommitment(GetCcdCommitmentRequest request) {

        Validate.notBlank(request.getCcdCommitmentId(), "ccdCommitmentId must not be blank");

        return clientCall(request, GetCcdCommitmentResponse::builder)
                .logger(LOG, "getCcdCommitment")
                .serviceDetails("CcdCommitments", "GetCcdCommitment", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCcdCommitmentRequest::builder)
                .basePath("/20240601")
                .appendPathParam("ccdCommitments")
                .appendPathParam(request.getCcdCommitmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ccdoffers.model.CcdCommitment.class,
                        GetCcdCommitmentResponse.Builder::ccdCommitment)
                .handleResponseHeaderString(
                        "opc-request-id", GetCcdCommitmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetCcdCommitmentResponse.Builder::etag)
                .callSync();
    }

    @Override
    public ListCcdCommitmentsResponse listCcdCommitments(ListCcdCommitmentsRequest request) {
        Objects.requireNonNull(request.getSubscriptionId(), "subscriptionId is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCcdCommitmentsResponse::builder)
                .logger(LOG, "listCcdCommitments")
                .serviceDetails("CcdCommitments", "ListCcdCommitments", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCcdCommitmentsRequest::builder)
                .basePath("/20240601")
                .appendPathParam("ccdCommitments")
                .appendQueryParam("subscriptionId", request.getSubscriptionId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("lifecycleDetails", request.getLifecycleDetails())
                .appendEnumQueryParam("sourceType", request.getSourceType())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ccdoffers.model.CcdCommitmentCollection.class,
                        ListCcdCommitmentsResponse.Builder::ccdCommitmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCcdCommitmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCcdCommitmentsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateCcdCommitmentResponse updateCcdCommitment(UpdateCcdCommitmentRequest request) {

        Validate.notBlank(request.getCcdCommitmentId(), "ccdCommitmentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCcdCommitmentDetails(), "updateCcdCommitmentDetails is required");

        return clientCall(request, UpdateCcdCommitmentResponse::builder)
                .logger(LOG, "updateCcdCommitment")
                .serviceDetails("CcdCommitments", "UpdateCcdCommitment", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCcdCommitmentRequest::builder)
                .basePath("/20240601")
                .appendPathParam("ccdCommitments")
                .appendPathParam(request.getCcdCommitmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ccdoffers.model.CcdCommitment.class,
                        UpdateCcdCommitmentResponse.Builder::ccdCommitment)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCcdCommitmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateCcdCommitmentResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CcdCommitmentsWaiters getWaiters() {
        return waiters;
    }

    @Override
    public CcdCommitmentsPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public CcdCommitmentsClient(
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
    public CcdCommitmentsClient(
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
    public CcdCommitmentsClient(
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
    public CcdCommitmentsClient(
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
    public CcdCommitmentsClient(
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
    public CcdCommitmentsClient(
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
    public CcdCommitmentsClient(
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
    public CcdCommitmentsClient(
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
