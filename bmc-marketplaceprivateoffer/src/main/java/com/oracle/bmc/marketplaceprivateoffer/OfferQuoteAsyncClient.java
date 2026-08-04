/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplaceprivateoffer;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.marketplaceprivateoffer.requests.*;
import com.oracle.bmc.marketplaceprivateoffer.responses.*;

import java.util.Objects;

/**
 * Async client implementation for OfferQuote service. <br>
 * There are two ways to use async client: 1. Use AsyncHandler: using AsyncHandler, if the response
 * to the call is an {@link java.io.InputStream}, like getObject Api in object storage service,
 * developers need to process the stream in AsyncHandler, and not anywhere else, because the stream
 * will be closed right after the AsyncHandler is invoked. <br>
 * 2. Use Java Future: using Java Future, developers need to close the stream after they are done
 * with the Java Future.<br>
 * Accessing the result should be done in a mutually exclusive manner, either through the Future or
 * the AsyncHandler, but not both. If the Future is used, the caller should pass in null as the
 * AsyncHandler. If the AsyncHandler is used, it is still safe to use the Future to determine
 * whether or not the request was completed via Future.isDone/isCancelled.<br>
 * Please refer to
 * https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ResteasyClientWithObjectStorageExample.java
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class OfferQuoteAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements OfferQuoteAsync {
    /** Service instance for OfferQuote. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(OfferQuoteClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://private-offer.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OfferQuoteAsyncClient.class);

    OfferQuoteAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(builder, authenticationDetailsProvider);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OfferQuoteAsyncClient> {
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
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public OfferQuoteAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OfferQuoteAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateOfferQuoteResponse> createOfferQuote(
            CreateOfferQuoteRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateOfferQuoteRequest, CreateOfferQuoteResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOfferQuoteResponse> deleteOfferQuote(
            DeleteOfferQuoteRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteOfferQuoteRequest, DeleteOfferQuoteResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteOfferQuoteResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOfferQuoteResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOfferQuoteResponse> getOfferQuote(
            GetOfferQuoteRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetOfferQuoteRequest, GetOfferQuoteResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.marketplaceprivateoffer.model.OfferQuote.class,
                        GetOfferQuoteResponse.Builder::offerQuote)
                .handleResponseHeaderString("etag", GetOfferQuoteResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOfferQuoteResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOfferQuoteInternalDetailResponse>
            getOfferQuoteInternalDetail(
                    GetOfferQuoteInternalDetailRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetOfferQuoteInternalDetailRequest,
                                    GetOfferQuoteInternalDetailResponse>
                            handler) {

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
                .handleBody(
                        com.oracle.bmc.marketplaceprivateoffer.model.OfferQuoteInternalDetail.class,
                        GetOfferQuoteInternalDetailResponse.Builder::offerQuoteInternalDetail)
                .handleResponseHeaderString(
                        "etag", GetOfferQuoteInternalDetailResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOfferQuoteInternalDetailResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOfferQuotesResponse> listOfferQuotes(
            ListOfferQuotesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListOfferQuotesRequest, ListOfferQuotesResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.marketplaceprivateoffer.model.OfferQuoteCollection.class,
                        ListOfferQuotesResponse.Builder::offerQuoteCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOfferQuotesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOfferQuotesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RespondToOfferQuoteResponse> respondToOfferQuote(
            RespondToOfferQuoteRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RespondToOfferQuoteRequest, RespondToOfferQuoteResponse>
                    handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RespondToOfferQuoteResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RespondToOfferQuoteResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SendOfferQuoteResponse> sendOfferQuote(
            SendOfferQuoteRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SendOfferQuoteRequest, SendOfferQuoteResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id", SendOfferQuoteResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", SendOfferQuoteResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOfferQuoteResponse> updateOfferQuote(
            UpdateOfferQuoteRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateOfferQuoteRequest, UpdateOfferQuoteResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplaceprivateoffer.model.OfferQuote.class,
                        UpdateOfferQuoteResponse.Builder::offerQuote)
                .handleResponseHeaderString("etag", UpdateOfferQuoteResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOfferQuoteResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateOfferQuoteResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<WithdrawOfferQuoteResponse> withdrawOfferQuote(
            WithdrawOfferQuoteRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            WithdrawOfferQuoteRequest, WithdrawOfferQuoteResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id", WithdrawOfferQuoteResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", WithdrawOfferQuoteResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OfferQuoteAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OfferQuoteAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider);
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
    public OfferQuoteAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider);
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
    public OfferQuoteAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider);
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
    public OfferQuoteAsyncClient(
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
                authenticationDetailsProvider);
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
    public OfferQuoteAsyncClient(
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
                authenticationDetailsProvider);
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
    public OfferQuoteAsyncClient(
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
                authenticationDetailsProvider);
    }
}
