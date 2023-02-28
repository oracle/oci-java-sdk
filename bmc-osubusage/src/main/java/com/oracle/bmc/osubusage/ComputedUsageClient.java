/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osubusage;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.osubusage.requests.*;
import com.oracle.bmc.osubusage.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210501")
public class ComputedUsageClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements ComputedUsage {
    /** Service instance for ComputedUsage. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("COMPUTEDUSAGE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://csaap-e.oracle.com")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ComputedUsageClient.class);

    private final ComputedUsagePaginators paginators;

    private ComputedUsageClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        this.paginators = new ComputedUsagePaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ComputedUsageClient> {
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
        public ComputedUsageClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ComputedUsageClient(this, authenticationDetailsProvider);
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
    public GetComputedUsageResponse getComputedUsage(GetComputedUsageRequest request) {

        Validate.notBlank(request.getComputedUsageId(), "computedUsageId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetComputedUsageResponse::builder)
                .logger(LOG, "getComputedUsage")
                .serviceDetails("ComputedUsage", "GetComputedUsage", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetComputedUsageRequest::builder)
                .basePath("/oalapp/service/onesubs/proxy/20210501")
                .appendPathParam("computedUsages")
                .appendPathParam(request.getComputedUsageId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("x-one-origin-region", request.getXOneOriginRegion())
                .handleBody(
                        com.oracle.bmc.osubusage.model.ComputedUsage.class,
                        GetComputedUsageResponse.Builder::computedUsage)
                .handleResponseHeaderString(
                        "opc-request-id", GetComputedUsageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListComputedUsageAggregatedsResponse listComputedUsageAggregateds(
            ListComputedUsageAggregatedsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getSubscriptionId(), "subscriptionId is required");

        Objects.requireNonNull(request.getTimeFrom(), "timeFrom is required");

        Objects.requireNonNull(request.getTimeTo(), "timeTo is required");

        return clientCall(request, ListComputedUsageAggregatedsResponse::builder)
                .logger(LOG, "listComputedUsageAggregateds")
                .serviceDetails("ComputedUsage", "ListComputedUsageAggregateds", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListComputedUsageAggregatedsRequest::builder)
                .basePath("/oalapp/service/onesubs/proxy/20210501")
                .appendPathParam("computedUsages")
                .appendPathParam("aggregated")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("subscriptionId", request.getSubscriptionId())
                .appendQueryParam("timeFrom", request.getTimeFrom())
                .appendQueryParam("timeTo", request.getTimeTo())
                .appendQueryParam("parentProduct", request.getParentProduct())
                .appendEnumQueryParam("grouping", request.getGrouping())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("x-one-origin-region", request.getXOneOriginRegion())
                .handleBodyList(
                        com.oracle.bmc.osubusage.model.ComputedUsageAggregatedSummary.class,
                        ListComputedUsageAggregatedsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListComputedUsageAggregatedsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListComputedUsageAggregatedsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListComputedUsagesResponse listComputedUsages(ListComputedUsagesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getSubscriptionId(), "subscriptionId is required");

        Objects.requireNonNull(request.getTimeFrom(), "timeFrom is required");

        Objects.requireNonNull(request.getTimeTo(), "timeTo is required");

        return clientCall(request, ListComputedUsagesResponse::builder)
                .logger(LOG, "listComputedUsages")
                .serviceDetails("ComputedUsage", "ListComputedUsages", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListComputedUsagesRequest::builder)
                .basePath("/oalapp/service/onesubs/proxy/20210501")
                .appendPathParam("computedUsages")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("subscriptionId", request.getSubscriptionId())
                .appendQueryParam("timeFrom", request.getTimeFrom())
                .appendQueryParam("timeTo", request.getTimeTo())
                .appendQueryParam("parentProduct", request.getParentProduct())
                .appendQueryParam("computedProduct", request.getComputedProduct())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("x-one-origin-region", request.getXOneOriginRegion())
                .handleBodyList(
                        com.oracle.bmc.osubusage.model.ComputedUsageSummary.class,
                        ListComputedUsagesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListComputedUsagesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListComputedUsagesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ComputedUsagePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ComputedUsageClient(
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
    public ComputedUsageClient(
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
    public ComputedUsageClient(
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
    public ComputedUsageClient(
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
    public ComputedUsageClient(
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
    public ComputedUsageClient(
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
    public ComputedUsageClient(
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
