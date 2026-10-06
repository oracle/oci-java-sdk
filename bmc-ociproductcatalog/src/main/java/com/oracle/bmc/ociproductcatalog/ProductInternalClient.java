/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ociproductcatalog;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.ociproductcatalog.requests.*;
import com.oracle.bmc.ociproductcatalog.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250610")
public class ProductInternalClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements ProductInternal {
    /** Service instance for ProductInternal. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(ProductInternalClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://cp.product-catalog.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ProductInternalClient.class);

    private final ProductInternalPaginators paginators;

    ProductInternalClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        this.paginators = new ProductInternalPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ProductInternalClient> {
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
        public ProductInternalClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ProductInternalClient(this, authenticationDetailsProvider);
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
    public ChangeInternalProductCompartmentResponse changeInternalProductCompartment(
            ChangeInternalProductCompartmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeInternalProductCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateInternalProductResponse createInternalProduct(
            CreateInternalProductRequest request) {
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ociproductcatalog.model.Product.class,
                        CreateInternalProductResponse.Builder::product)
                .handleResponseHeaderString(
                        "opc-request-id", CreateInternalProductResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateInternalProductResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteInternalProductResponse deleteInternalProduct(
            DeleteInternalProductRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteInternalProductResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetInternalProductResponse getInternalProduct(GetInternalProductRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ociproductcatalog.model.Product.class,
                        GetInternalProductResponse.Builder::product)
                .handleResponseHeaderString(
                        "opc-request-id", GetInternalProductResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetInternalProductResponse.Builder::etag)
                .callSync();
    }

    @Override
    public ListInternalProductsResponse listInternalProducts(ListInternalProductsRequest request) {
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ociproductcatalog.model.ProductCollection.class,
                        ListInternalProductsResponse.Builder::productCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListInternalProductsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListInternalProductsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateInternalProductResponse updateInternalProduct(
            UpdateInternalProductRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ociproductcatalog.model.Product.class,
                        UpdateInternalProductResponse.Builder::product)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateInternalProductResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateInternalProductResponse.Builder::etag)
                .callSync();
    }

    @Override
    public ProductInternalPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ProductInternalClient(
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
    public ProductInternalClient(
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
    public ProductInternalClient(
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
    public ProductInternalClient(
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
    public ProductInternalClient(
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
    public ProductInternalClient(
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
    public ProductInternalClient(
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
