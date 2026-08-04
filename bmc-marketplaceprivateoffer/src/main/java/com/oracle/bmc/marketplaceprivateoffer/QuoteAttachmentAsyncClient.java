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
 * Async client implementation for QuoteAttachment service. <br>
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
public class QuoteAttachmentAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements QuoteAttachmentAsync {
    /** Service instance for QuoteAttachment. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(QuoteAttachmentClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://private-offer.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(QuoteAttachmentAsyncClient.class);

    QuoteAttachmentAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    QuoteAttachmentAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "QuoteAttachmentAsyncClient", "getQuoteAttachmentContent"));
        }
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
                    Builder, QuoteAttachmentAsyncClient> {
        private boolean isStreamWarningEnabled = true;

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
         * Enable/disable the stream warnings for the client
         *
         * @param isStreamWarningEnabled executorService
         * @return this builder
         */
        public Builder isStreamWarningEnabled(boolean isStreamWarningEnabled) {
            this.isStreamWarningEnabled = isStreamWarningEnabled;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public QuoteAttachmentAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new QuoteAttachmentAsyncClient(
                    this, authenticationDetailsProvider, isStreamWarningEnabled);
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
    public java.util.concurrent.Future<CreateQuoteAttachmentResponse> createQuoteAttachment(
            CreateQuoteAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateQuoteAttachmentRequest, CreateQuoteAttachmentResponse>
                    handler) {

        Validate.notBlank(request.getOfferQuoteId(), "offerQuoteId must not be blank");
        Objects.requireNonNull(
                request.getCreateQuoteAttachmentDetails(),
                "createQuoteAttachmentDetails is required");

        return clientCall(request, CreateQuoteAttachmentResponse::builder)
                .logger(LOG, "createQuoteAttachment")
                .serviceDetails("QuoteAttachment", "CreateQuoteAttachment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateQuoteAttachmentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offerQuotes")
                .appendPathParam(request.getOfferQuoteId())
                .appendPathParam("quoteAttachments")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplaceprivateoffer.model.QuoteAttachment.class,
                        CreateQuoteAttachmentResponse.Builder::quoteAttachment)
                .handleResponseHeaderString("etag", CreateQuoteAttachmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateQuoteAttachmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateQuoteAttachmentResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateQuoteAttachmentResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateQuoteAttachmentResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteQuoteAttachmentResponse> deleteQuoteAttachment(
            DeleteQuoteAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteQuoteAttachmentRequest, DeleteQuoteAttachmentResponse>
                    handler) {

        Validate.notBlank(request.getOfferQuoteId(), "offerQuoteId must not be blank");

        Validate.notBlank(request.getQuoteAttachmentId(), "quoteAttachmentId must not be blank");

        return clientCall(request, DeleteQuoteAttachmentResponse::builder)
                .logger(LOG, "deleteQuoteAttachment")
                .serviceDetails("QuoteAttachment", "DeleteQuoteAttachment", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteQuoteAttachmentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offerQuotes")
                .appendPathParam(request.getOfferQuoteId())
                .appendPathParam("quoteAttachments")
                .appendPathParam(request.getQuoteAttachmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteQuoteAttachmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteQuoteAttachmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetQuoteAttachmentResponse> getQuoteAttachment(
            GetQuoteAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetQuoteAttachmentRequest, GetQuoteAttachmentResponse>
                    handler) {

        Validate.notBlank(request.getOfferQuoteId(), "offerQuoteId must not be blank");

        Validate.notBlank(request.getQuoteAttachmentId(), "quoteAttachmentId must not be blank");

        return clientCall(request, GetQuoteAttachmentResponse::builder)
                .logger(LOG, "getQuoteAttachment")
                .serviceDetails("QuoteAttachment", "GetQuoteAttachment", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetQuoteAttachmentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offerQuotes")
                .appendPathParam(request.getOfferQuoteId())
                .appendPathParam("quoteAttachments")
                .appendPathParam(request.getQuoteAttachmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplaceprivateoffer.model.QuoteAttachment.class,
                        GetQuoteAttachmentResponse.Builder::quoteAttachment)
                .handleResponseHeaderString("etag", GetQuoteAttachmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetQuoteAttachmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetQuoteAttachmentContentResponse> getQuoteAttachmentContent(
            GetQuoteAttachmentContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetQuoteAttachmentContentRequest, GetQuoteAttachmentContentResponse>
                    handler) {

        Validate.notBlank(request.getOfferQuoteId(), "offerQuoteId must not be blank");

        Validate.notBlank(request.getQuoteAttachmentId(), "quoteAttachmentId must not be blank");

        return clientCall(request, GetQuoteAttachmentContentResponse::builder)
                .logger(LOG, "getQuoteAttachmentContent")
                .serviceDetails("QuoteAttachment", "GetQuoteAttachmentContent", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetQuoteAttachmentContentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offerQuotes")
                .appendPathParam(request.getOfferQuoteId())
                .appendPathParam("quoteAttachments")
                .appendPathParam(request.getQuoteAttachmentId())
                .appendPathParam("content")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        java.io.InputStream.class,
                        GetQuoteAttachmentContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", GetQuoteAttachmentContentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListQuoteAttachmentsResponse> listQuoteAttachments(
            ListQuoteAttachmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListQuoteAttachmentsRequest, ListQuoteAttachmentsResponse>
                    handler) {

        Validate.notBlank(request.getOfferQuoteId(), "offerQuoteId must not be blank");

        return clientCall(request, ListQuoteAttachmentsResponse::builder)
                .logger(LOG, "listQuoteAttachments")
                .serviceDetails("QuoteAttachment", "ListQuoteAttachments", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListQuoteAttachmentsRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offerQuotes")
                .appendPathParam(request.getOfferQuoteId())
                .appendPathParam("quoteAttachments")
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
                        com.oracle.bmc.marketplaceprivateoffer.model.QuoteAttachmentCollection
                                .class,
                        ListQuoteAttachmentsResponse.Builder::quoteAttachmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListQuoteAttachmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListQuoteAttachmentsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public QuoteAttachmentAsyncClient(
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
    public QuoteAttachmentAsyncClient(
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
    public QuoteAttachmentAsyncClient(
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
    public QuoteAttachmentAsyncClient(
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
    public QuoteAttachmentAsyncClient(
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
    public QuoteAttachmentAsyncClient(
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
    public QuoteAttachmentAsyncClient(
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
