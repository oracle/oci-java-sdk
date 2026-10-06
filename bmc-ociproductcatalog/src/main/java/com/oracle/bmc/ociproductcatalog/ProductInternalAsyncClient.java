/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ociproductcatalog;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.ociproductcatalog.requests.*;
import com.oracle.bmc.ociproductcatalog.responses.*;

import java.util.Objects;

/**
 * Async client implementation for ProductInternal service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250610")
public class ProductInternalAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ProductInternalAsync {
    /** Service instance for ProductInternal. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(ProductInternalClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://cp.product-catalog.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ProductInternalAsyncClient.class);

    ProductInternalAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, ProductInternalAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "ociproductcatalog";
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
        public ProductInternalAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ProductInternalAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeInternalProductCompartmentResponse>
            changeInternalProductCompartment(
                    ChangeInternalProductCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeInternalProductCompartmentRequest,
                                    ChangeInternalProductCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getProductId(), "productId must not be blank");
        Objects.requireNonNull(
                request.getChangeProductCompartmentDetails(),
                "changeProductCompartmentDetails is required");

        return clientCall(request, ChangeInternalProductCompartmentResponse::builder)
                .logger(LOG, "changeInternalProductCompartment")
                .serviceDetails("ProductInternal", "ChangeInternalProductCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeInternalProductCompartmentRequest::builder)
                .basePath("/20250610")
                .appendPathParam("internal")
                .appendPathParam("product")
                .appendPathParam(request.getProductId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeInternalProductCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateInternalProductResponse> createInternalProduct(
            CreateInternalProductRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateInternalProductRequest, CreateInternalProductResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateProductDetails(), "createProductDetails is required");

        return clientCall(request, CreateInternalProductResponse::builder)
                .logger(LOG, "createInternalProduct")
                .serviceDetails("ProductInternal", "CreateInternalProduct", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateInternalProductRequest::builder)
                .basePath("/20250610")
                .appendPathParam("internal")
                .appendPathParam("product")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ociproductcatalog.model.Product.class,
                        CreateInternalProductResponse.Builder::product)
                .handleResponseHeaderString(
                        "opc-request-id", CreateInternalProductResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateInternalProductResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteInternalProductResponse> deleteInternalProduct(
            DeleteInternalProductRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteInternalProductRequest, DeleteInternalProductResponse>
                    handler) {

        Validate.notBlank(request.getProductId(), "productId must not be blank");

        return clientCall(request, DeleteInternalProductResponse::builder)
                .logger(LOG, "deleteInternalProduct")
                .serviceDetails("ProductInternal", "DeleteInternalProduct", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteInternalProductRequest::builder)
                .basePath("/20250610")
                .appendPathParam("internal")
                .appendPathParam("product")
                .appendPathParam(request.getProductId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteInternalProductResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetInternalProductResponse> getInternalProduct(
            GetInternalProductRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetInternalProductRequest, GetInternalProductResponse>
                    handler) {

        Validate.notBlank(request.getProductId(), "productId must not be blank");

        return clientCall(request, GetInternalProductResponse::builder)
                .logger(LOG, "getInternalProduct")
                .serviceDetails("ProductInternal", "GetInternalProduct", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetInternalProductRequest::builder)
                .basePath("/20250610")
                .appendPathParam("internal")
                .appendPathParam("product")
                .appendPathParam(request.getProductId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ociproductcatalog.model.Product.class,
                        GetInternalProductResponse.Builder::product)
                .handleResponseHeaderString(
                        "opc-request-id", GetInternalProductResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetInternalProductResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListInternalProductsResponse> listInternalProducts(
            ListInternalProductsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListInternalProductsRequest, ListInternalProductsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListInternalProductsResponse::builder)
                .logger(LOG, "listInternalProducts")
                .serviceDetails("ProductInternal", "ListInternalProducts", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInternalProductsRequest::builder)
                .basePath("/20250610")
                .appendPathParam("internal")
                .appendPathParam("products")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ociproductcatalog.model.ProductCollection.class,
                        ListInternalProductsResponse.Builder::productCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListInternalProductsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListInternalProductsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateInternalProductResponse> updateInternalProduct(
            UpdateInternalProductRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateInternalProductRequest, UpdateInternalProductResponse>
                    handler) {

        Validate.notBlank(request.getProductId(), "productId must not be blank");
        Objects.requireNonNull(
                request.getUpdateProductDetails(), "updateProductDetails is required");

        return clientCall(request, UpdateInternalProductResponse::builder)
                .logger(LOG, "updateInternalProduct")
                .serviceDetails("ProductInternal", "UpdateInternalProduct", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateInternalProductRequest::builder)
                .basePath("/20250610")
                .appendPathParam("internal")
                .appendPathParam("product")
                .appendPathParam(request.getProductId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ociproductcatalog.model.Product.class,
                        UpdateInternalProductResponse.Builder::product)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateInternalProductResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateInternalProductResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ProductInternalAsyncClient(
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
    public ProductInternalAsyncClient(
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
    public ProductInternalAsyncClient(
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
    public ProductInternalAsyncClient(
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
    public ProductInternalAsyncClient(
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
    public ProductInternalAsyncClient(
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
    public ProductInternalAsyncClient(
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
