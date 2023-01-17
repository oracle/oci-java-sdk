/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.ospgateway.requests.*;
import com.oracle.bmc.ospgateway.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
public class InvoiceServiceClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements InvoiceService {
    /** Service instance for InvoiceService. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("INVOICESERVICE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://ospap.oracle.com")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(InvoiceServiceAsyncClient.class);

    private final InvoiceServicePaginators paginators;

    private InvoiceServiceClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        this.paginators = new InvoiceServicePaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, InvoiceServiceClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
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
        public InvoiceServiceClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new InvoiceServiceClient(this, authenticationDetailsProvider);
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
    public DownloadPdfContentResponse downloadPdfContent(DownloadPdfContentRequest request) {
        Objects.requireNonNull(request.getOspHomeRegion(), "ospHomeRegion is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(request.getInternalInvoiceId(), "internalInvoiceId must not be blank");

        return clientCall(request, DownloadPdfContentResponse::builder)
                .logger(LOG, "downloadPdfContent")
                .serviceDetails("InvoiceService", "DownloadPdfContent", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DownloadPdfContentRequest::builder)
                .basePath("/20191001")
                .appendPathParam("invoices")
                .appendPathParam(request.getInternalInvoiceId())
                .appendPathParam("actions")
                .appendPathParam("downloadPdfContent")
                .appendQueryParam("ospHomeRegion", request.getOspHomeRegion())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/pdf")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        java.io.InputStream.class, DownloadPdfContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", DownloadPdfContentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "Content-Disposition",
                        DownloadPdfContentResponse.Builder::contentDisposition)
                .handleResponseHeaderString(
                        "Content-Type", DownloadPdfContentResponse.Builder::contentType)
                .handleResponseHeaderInteger(
                        "Content-Length", DownloadPdfContentResponse.Builder::contentLength)
                .callSync();
    }

    @Override
    public GetInvoiceResponse getInvoice(GetInvoiceRequest request) {
        Objects.requireNonNull(request.getOspHomeRegion(), "ospHomeRegion is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(request.getInternalInvoiceId(), "internalInvoiceId must not be blank");

        return clientCall(request, GetInvoiceResponse::builder)
                .logger(LOG, "getInvoice")
                .serviceDetails("InvoiceService", "GetInvoice", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetInvoiceRequest::builder)
                .basePath("/20191001")
                .appendPathParam("invoices")
                .appendPathParam(request.getInternalInvoiceId())
                .appendQueryParam("ospHomeRegion", request.getOspHomeRegion())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ospgateway.model.Invoice.class,
                        GetInvoiceResponse.Builder::invoice)
                .handleResponseHeaderString("etag", GetInvoiceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetInvoiceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListInvoiceLinesResponse listInvoiceLines(ListInvoiceLinesRequest request) {
        Objects.requireNonNull(request.getOspHomeRegion(), "ospHomeRegion is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(request.getInternalInvoiceId(), "internalInvoiceId must not be blank");

        return clientCall(request, ListInvoiceLinesResponse::builder)
                .logger(LOG, "listInvoiceLines")
                .serviceDetails("InvoiceService", "ListInvoiceLines", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInvoiceLinesRequest::builder)
                .basePath("/20191001")
                .appendPathParam("invoices")
                .appendPathParam(request.getInternalInvoiceId())
                .appendPathParam("invoiceLines")
                .appendQueryParam("ospHomeRegion", request.getOspHomeRegion())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ospgateway.model.InvoiceLineCollection.class,
                        ListInvoiceLinesResponse.Builder::invoiceLineCollection)
                .handleResponseHeaderString("etag", ListInvoiceLinesResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ListInvoiceLinesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListInvoiceLinesResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListInvoiceLinesResponse.Builder::opcTotalItems)
                .callSync();
    }

    @Override
    public ListInvoicesResponse listInvoices(ListInvoicesRequest request) {
        Objects.requireNonNull(request.getOspHomeRegion(), "ospHomeRegion is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListInvoicesResponse::builder)
                .logger(LOG, "listInvoices")
                .serviceDetails("InvoiceService", "ListInvoices", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInvoicesRequest::builder)
                .basePath("/20191001")
                .appendPathParam("invoices")
                .appendQueryParam("ospHomeRegion", request.getOspHomeRegion())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("invoiceId", request.getInvoiceId())
                .appendListQueryParam(
                        "type",
                        request.getType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("searchText", request.getSearchText())
                .appendQueryParam("timeInvoiceStart", request.getTimeInvoiceStart())
                .appendQueryParam("timeInvoiceEnd", request.getTimeInvoiceEnd())
                .appendQueryParam("timePaymentStart", request.getTimePaymentStart())
                .appendQueryParam("timePaymentEnd", request.getTimePaymentEnd())
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ospgateway.model.InvoiceCollection.class,
                        ListInvoicesResponse.Builder::invoiceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListInvoicesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListInvoicesResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListInvoicesResponse.Builder::opcTotalItems)
                .callSync();
    }

    @Override
    public PayInvoiceResponse payInvoice(PayInvoiceRequest request) {
        Objects.requireNonNull(request.getOspHomeRegion(), "ospHomeRegion is required");

        Validate.notBlank(request.getInternalInvoiceId(), "internalInvoiceId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getPayInvoiceDetails(), "payInvoiceDetails is required");

        return clientCall(request, PayInvoiceResponse::builder)
                .logger(LOG, "payInvoice")
                .serviceDetails("InvoiceService", "PayInvoice", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PayInvoiceRequest::builder)
                .basePath("/20191001")
                .appendPathParam("invoices")
                .appendPathParam(request.getInternalInvoiceId())
                .appendPathParam("actions")
                .appendPathParam("pay")
                .appendQueryParam("ospHomeRegion", request.getOspHomeRegion())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ospgateway.model.PayInvoiceReceipt.class,
                        PayInvoiceResponse.Builder::payInvoiceReceipt)
                .handleResponseHeaderString(
                        "opc-request-id", PayInvoiceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PayInvoiceResponse.Builder::etag)
                .callSync();
    }

    @Override
    public InvoiceServicePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public InvoiceServiceClient(
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
    public InvoiceServiceClient(
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
    public InvoiceServiceClient(
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
    public InvoiceServiceClient(
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
    public InvoiceServiceClient(
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
    public InvoiceServiceClient(
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
    public InvoiceServiceClient(
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
