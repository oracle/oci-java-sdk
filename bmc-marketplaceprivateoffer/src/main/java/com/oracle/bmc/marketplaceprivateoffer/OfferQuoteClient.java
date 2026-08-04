/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplaceprivateoffer;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.marketplaceprivateoffer.requests.*;
import com.oracle.bmc.marketplaceprivateoffer.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class OfferQuoteClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements OfferQuote {
    /** Service instance for OfferQuote. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(OfferQuoteClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://private-offer.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OfferQuoteClient.class);

    private final OfferQuoteWaiters waiters;

    private final OfferQuotePaginators paginators;

    OfferQuoteClient(
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
                                    .nameFormat("OfferQuote-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new OfferQuoteWaiters(executorService, this);

        this.paginators = new OfferQuotePaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OfferQuoteClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "marketplaceprivateoffer";
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
        public OfferQuoteClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OfferQuoteClient(this, authenticationDetailsProvider, executorService);
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
    public CreateOfferQuoteResponse createOfferQuote(CreateOfferQuoteRequest request) {
        Objects.requireNonNull(
                request.getCreateOfferQuoteDetails(), "createOfferQuoteDetails is required");

        return clientCall(request, CreateOfferQuoteResponse::builder)
                .logger(LOG, "createOfferQuote")
                .serviceDetails("OfferQuote", "CreateOfferQuote", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOfferQuoteRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offerQuotes")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplaceprivateoffer.model.OfferQuote.class,
                        CreateOfferQuoteResponse.Builder::offerQuote)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOfferQuoteResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateOfferQuoteResponse.Builder::etag)
                .handleResponseHeaderString("location", CreateOfferQuoteResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateOfferQuoteResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateOfferQuoteResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteOfferQuoteResponse deleteOfferQuote(DeleteOfferQuoteRequest request) {

        Validate.notBlank(request.getOfferQuoteId(), "offerQuoteId must not be blank");

        return clientCall(request, DeleteOfferQuoteResponse::builder)
                .logger(LOG, "deleteOfferQuote")
                .serviceDetails("OfferQuote", "DeleteOfferQuote", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOfferQuoteRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offerQuotes")
                .appendPathParam(request.getOfferQuoteId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteOfferQuoteResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOfferQuoteResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOfferQuoteResponse getOfferQuote(GetOfferQuoteRequest request) {

        Validate.notBlank(request.getOfferQuoteId(), "offerQuoteId must not be blank");

        return clientCall(request, GetOfferQuoteResponse::builder)
                .logger(LOG, "getOfferQuote")
                .serviceDetails("OfferQuote", "GetOfferQuote", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOfferQuoteRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offerQuotes")
                .appendPathParam(request.getOfferQuoteId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplaceprivateoffer.model.OfferQuote.class,
                        GetOfferQuoteResponse.Builder::offerQuote)
                .handleResponseHeaderString("etag", GetOfferQuoteResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOfferQuoteResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOfferQuoteInternalDetailResponse getOfferQuoteInternalDetail(
            GetOfferQuoteInternalDetailRequest request) {

        Validate.notBlank(request.getOfferQuoteId(), "offerQuoteId must not be blank");

        return clientCall(request, GetOfferQuoteInternalDetailResponse::builder)
                .logger(LOG, "getOfferQuoteInternalDetail")
                .serviceDetails("OfferQuote", "GetOfferQuoteInternalDetail", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOfferQuoteInternalDetailRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offerQuotes")
                .appendPathParam(request.getOfferQuoteId())
                .appendPathParam("internalDetails")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplaceprivateoffer.model.OfferQuoteInternalDetail.class,
                        GetOfferQuoteInternalDetailResponse.Builder::offerQuoteInternalDetail)
                .handleResponseHeaderString(
                        "etag", GetOfferQuoteInternalDetailResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOfferQuoteInternalDetailResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListOfferQuotesResponse listOfferQuotes(ListOfferQuotesRequest request) {

        return clientCall(request, ListOfferQuotesResponse::builder)
                .logger(LOG, "listOfferQuotes")
                .serviceDetails("OfferQuote", "ListOfferQuotes", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOfferQuotesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offerQuotes")
                .appendQueryParam("resellerCompartmentId", request.getResellerCompartmentId())
                .appendQueryParam("isvCompartmentId", request.getIsvCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.marketplaceprivateoffer.model.OfferQuoteCollection.class,
                        ListOfferQuotesResponse.Builder::offerQuoteCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOfferQuotesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOfferQuotesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RespondToOfferQuoteResponse respondToOfferQuote(RespondToOfferQuoteRequest request) {

        Validate.notBlank(request.getOfferQuoteId(), "offerQuoteId must not be blank");
        Objects.requireNonNull(
                request.getRespondToOfferQuoteDetails(), "respondToOfferQuoteDetails is required");

        return clientCall(request, RespondToOfferQuoteResponse::builder)
                .logger(LOG, "respondToOfferQuote")
                .serviceDetails("OfferQuote", "RespondToOfferQuote", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RespondToOfferQuoteRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offerQuotes")
                .appendPathParam(request.getOfferQuoteId())
                .appendPathParam("actions")
                .appendPathParam("respondToOfferQuote")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RespondToOfferQuoteResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RespondToOfferQuoteResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public SendOfferQuoteResponse sendOfferQuote(SendOfferQuoteRequest request) {

        Validate.notBlank(request.getOfferQuoteId(), "offerQuoteId must not be blank");

        return clientCall(request, SendOfferQuoteResponse::builder)
                .logger(LOG, "sendOfferQuote")
                .serviceDetails("OfferQuote", "SendOfferQuote", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SendOfferQuoteRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offerQuotes")
                .appendPathParam(request.getOfferQuoteId())
                .appendPathParam("actions")
                .appendPathParam("sendOfferQuote")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", SendOfferQuoteResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", SendOfferQuoteResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateOfferQuoteResponse updateOfferQuote(UpdateOfferQuoteRequest request) {

        Validate.notBlank(request.getOfferQuoteId(), "offerQuoteId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOfferQuoteDetails(), "updateOfferQuoteDetails is required");

        return clientCall(request, UpdateOfferQuoteResponse::builder)
                .logger(LOG, "updateOfferQuote")
                .serviceDetails("OfferQuote", "UpdateOfferQuote", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOfferQuoteRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offerQuotes")
                .appendPathParam(request.getOfferQuoteId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplaceprivateoffer.model.OfferQuote.class,
                        UpdateOfferQuoteResponse.Builder::offerQuote)
                .handleResponseHeaderString("etag", UpdateOfferQuoteResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOfferQuoteResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateOfferQuoteResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public WithdrawOfferQuoteResponse withdrawOfferQuote(WithdrawOfferQuoteRequest request) {

        Validate.notBlank(request.getOfferQuoteId(), "offerQuoteId must not be blank");

        return clientCall(request, WithdrawOfferQuoteResponse::builder)
                .logger(LOG, "withdrawOfferQuote")
                .serviceDetails("OfferQuote", "WithdrawOfferQuote", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(WithdrawOfferQuoteRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offerQuotes")
                .appendPathParam(request.getOfferQuoteId())
                .appendPathParam("actions")
                .appendPathParam("withdrawOfferQuote")
                .appendQueryParam("resellerCompartmentId", request.getResellerCompartmentId())
                .appendQueryParam("isvCompartmentId", request.getIsvCompartmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", WithdrawOfferQuoteResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", WithdrawOfferQuoteResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public OfferQuoteWaiters getWaiters() {
        return waiters;
    }

    @Override
    public OfferQuotePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OfferQuoteClient(
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
    public OfferQuoteClient(
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
    public OfferQuoteClient(
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
    public OfferQuoteClient(
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
    public OfferQuoteClient(
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
    public OfferQuoteClient(
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
    public OfferQuoteClient(
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
    public OfferQuoteClient(
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
