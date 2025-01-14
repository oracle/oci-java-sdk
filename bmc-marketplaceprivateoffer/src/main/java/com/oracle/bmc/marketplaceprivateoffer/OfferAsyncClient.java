/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplaceprivateoffer;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.marketplaceprivateoffer.requests.*;
import com.oracle.bmc.marketplaceprivateoffer.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Offer service. <br>
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
public class OfferAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements OfferAsync {
    /** Service instance for Offer. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("OFFER")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://private-offer.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OfferAsyncClient.class);

    OfferAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OfferAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "marketplaceprivateoffer";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
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
        public OfferAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OfferAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateOfferResponse> createOffer(
            CreateOfferRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateOfferRequest, CreateOfferResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateOfferDetails(), "createOfferDetails is required");

        return clientCall(request, CreateOfferResponse::builder)
                .logger(LOG, "createOffer")
                .serviceDetails("Offer", "CreateOffer", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOfferRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offers")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplaceprivateoffer.model.Offer.class,
                        CreateOfferResponse.Builder::offer)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOfferResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateOfferResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOfferResponse> deleteOffer(
            DeleteOfferRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteOfferRequest, DeleteOfferResponse>
                    handler) {

        Validate.notBlank(request.getOfferId(), "offerId must not be blank");

        return clientCall(request, DeleteOfferResponse::builder)
                .logger(LOG, "deleteOffer")
                .serviceDetails("Offer", "DeleteOffer", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOfferRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offers")
                .appendPathParam(request.getOfferId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteOfferResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOfferResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOfferResponse> getOffer(
            GetOfferRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetOfferRequest, GetOfferResponse>
                    handler) {

        Validate.notBlank(request.getOfferId(), "offerId must not be blank");

        return clientCall(request, GetOfferResponse::builder)
                .logger(LOG, "getOffer")
                .serviceDetails("Offer", "GetOffer", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOfferRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offers")
                .appendPathParam(request.getOfferId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplaceprivateoffer.model.Offer.class,
                        GetOfferResponse.Builder::offer)
                .handleResponseHeaderString("etag", GetOfferResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOfferResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOfferInternalDetailResponse> getOfferInternalDetail(
            GetOfferInternalDetailRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetOfferInternalDetailRequest, GetOfferInternalDetailResponse>
                    handler) {

        Validate.notBlank(request.getOfferId(), "offerId must not be blank");

        return clientCall(request, GetOfferInternalDetailResponse::builder)
                .logger(LOG, "getOfferInternalDetail")
                .serviceDetails("Offer", "GetOfferInternalDetail", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOfferInternalDetailRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offers")
                .appendPathParam(request.getOfferId())
                .appendPathParam("internalDetails")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplaceprivateoffer.model.OfferInternalDetail.class,
                        GetOfferInternalDetailResponse.Builder::offerInternalDetail)
                .handleResponseHeaderString("etag", GetOfferInternalDetailResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOfferInternalDetailResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOffersResponse> listOffers(
            ListOffersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListOffersRequest, ListOffersResponse>
                    handler) {

        return clientCall(request, ListOffersResponse::builder)
                .logger(LOG, "listOffers")
                .serviceDetails("Offer", "ListOffers", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOffersRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offers")
                .appendQueryParam("buyerCompartmentId", request.getBuyerCompartmentId())
                .appendQueryParam("sellerCompartmentId", request.getSellerCompartmentId())
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
                        com.oracle.bmc.marketplaceprivateoffer.model.OfferCollection.class,
                        ListOffersResponse.Builder::offerCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOffersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOffersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOfferResponse> updateOffer(
            UpdateOfferRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateOfferRequest, UpdateOfferResponse>
                    handler) {

        Validate.notBlank(request.getOfferId(), "offerId must not be blank");
        Objects.requireNonNull(request.getUpdateOfferDetails(), "updateOfferDetails is required");

        return clientCall(request, UpdateOfferResponse::builder)
                .logger(LOG, "updateOffer")
                .serviceDetails("Offer", "UpdateOffer", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOfferRequest::builder)
                .basePath("/20220901")
                .appendPathParam("offers")
                .appendPathParam(request.getOfferId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplaceprivateoffer.model.Offer.class,
                        UpdateOfferResponse.Builder::offer)
                .handleResponseHeaderString("etag", UpdateOfferResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOfferResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OfferAsyncClient(
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
    public OfferAsyncClient(
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
    public OfferAsyncClient(
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
    public OfferAsyncClient(
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
    public OfferAsyncClient(
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
    public OfferAsyncClient(
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
    public OfferAsyncClient(
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
