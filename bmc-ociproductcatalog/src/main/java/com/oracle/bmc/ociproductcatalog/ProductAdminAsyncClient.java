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
 * Async client implementation for ProductAdmin service. <br>
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
public class ProductAdminAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ProductAdminAsync {
    /** Service instance for ProductAdmin. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(ProductAdminClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://cp.product-catalog.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ProductAdminAsyncClient.class);

    ProductAdminAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ProductAdminAsyncClient> {
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
        public ProductAdminAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ProductAdminAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeAdminProductCompartmentResponse>
            changeAdminProductCompartment(
                    ChangeAdminProductCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAdminProductCompartmentRequest,
                                    ChangeAdminProductCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getProductId(), "productId must not be blank");
        Objects.requireNonNull(
                request.getChangeProductCompartmentDetails(),
                "changeProductCompartmentDetails is required");

        return clientCall(request, ChangeAdminProductCompartmentResponse::builder)
                .logger(LOG, "changeAdminProductCompartment")
                .serviceDetails("ProductAdmin", "ChangeAdminProductCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAdminProductCompartmentRequest::builder)
                .basePath("/20250610")
                .appendPathParam("internal")
                .appendPathParam("admin")
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
                        ChangeAdminProductCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAdminProductResponse> createAdminProduct(
            CreateAdminProductRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAdminProductRequest, CreateAdminProductResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateProductDetails(), "createProductDetails is required");

        return clientCall(request, CreateAdminProductResponse::builder)
                .logger(LOG, "createAdminProduct")
                .serviceDetails("ProductAdmin", "CreateAdminProduct", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAdminProductRequest::builder)
                .basePath("/20250610")
                .appendPathParam("internal")
                .appendPathParam("admin")
                .appendPathParam("product")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ociproductcatalog.model.Product.class,
                        CreateAdminProductResponse.Builder::product)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAdminProductResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateAdminProductResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAdminProductResponse> deleteAdminProduct(
            DeleteAdminProductRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAdminProductRequest, DeleteAdminProductResponse>
                    handler) {

        Validate.notBlank(request.getProductId(), "productId must not be blank");

        return clientCall(request, DeleteAdminProductResponse::builder)
                .logger(LOG, "deleteAdminProduct")
                .serviceDetails("ProductAdmin", "DeleteAdminProduct", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAdminProductRequest::builder)
                .basePath("/20250610")
                .appendPathParam("internal")
                .appendPathParam("admin")
                .appendPathParam("product")
                .appendPathParam(request.getProductId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAdminProductResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAdminProductResponse> getAdminProduct(
            GetAdminProductRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAdminProductRequest, GetAdminProductResponse>
                    handler) {

        Validate.notBlank(request.getProductId(), "productId must not be blank");

        return clientCall(request, GetAdminProductResponse::builder)
                .logger(LOG, "getAdminProduct")
                .serviceDetails("ProductAdmin", "GetAdminProduct", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAdminProductRequest::builder)
                .basePath("/20250610")
                .appendPathParam("internal")
                .appendPathParam("admin")
                .appendPathParam("product")
                .appendPathParam(request.getProductId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ociproductcatalog.model.AdminProduct.class,
                        GetAdminProductResponse.Builder::adminProduct)
                .handleResponseHeaderString(
                        "opc-request-id", GetAdminProductResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetAdminProductResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAdminProductsResponse> listAdminProducts(
            ListAdminProductsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAdminProductsRequest, ListAdminProductsResponse>
                    handler) {

        return clientCall(request, ListAdminProductsResponse::builder)
                .logger(LOG, "listAdminProducts")
                .serviceDetails("ProductAdmin", "ListAdminProducts", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAdminProductsRequest::builder)
                .basePath("/20250610")
                .appendPathParam("internal")
                .appendPathParam("admin")
                .appendPathParam("products")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ociproductcatalog.model.ProductCollection.class,
                        ListAdminProductsResponse.Builder::productCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAdminProductsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAdminProductsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAdminProductResponse> updateAdminProduct(
            UpdateAdminProductRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAdminProductRequest, UpdateAdminProductResponse>
                    handler) {

        Validate.notBlank(request.getProductId(), "productId must not be blank");
        Objects.requireNonNull(
                request.getUpdateProductDetails(), "updateProductDetails is required");

        return clientCall(request, UpdateAdminProductResponse::builder)
                .logger(LOG, "updateAdminProduct")
                .serviceDetails("ProductAdmin", "UpdateAdminProduct", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAdminProductRequest::builder)
                .basePath("/20250610")
                .appendPathParam("internal")
                .appendPathParam("admin")
                .appendPathParam("product")
                .appendPathParam(request.getProductId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ociproductcatalog.model.Product.class,
                        UpdateAdminProductResponse.Builder::product)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAdminProductResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateAdminProductResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ProductAdminAsyncClient(
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
    public ProductAdminAsyncClient(
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
    public ProductAdminAsyncClient(
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
    public ProductAdminAsyncClient(
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
    public ProductAdminAsyncClient(
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
    public ProductAdminAsyncClient(
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
    public ProductAdminAsyncClient(
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
