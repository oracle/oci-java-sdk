/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.threatintelligence;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.threatintelligence.requests.*;
import com.oracle.bmc.threatintelligence.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Threatintel service. <br>
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
public class ThreatintelAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ThreatintelAsync {
    /** Service instance for Threatintel. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("THREATINTEL")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://api-threatintel.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ThreatintelAsyncClient.class);

    ThreatintelAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ThreatintelAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "threatintelligence";
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
        public ThreatintelAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ThreatintelAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<GetIndicatorResponse> getIndicator(
            GetIndicatorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetIndicatorRequest, GetIndicatorResponse>
                    handler) {

        Validate.notBlank(request.getIndicatorId(), "indicatorId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetIndicatorResponse::builder)
                .logger(LOG, "getIndicator")
                .serviceDetails(
                        "Threatintel",
                        "GetIndicator",
                        "https://docs.oracle.com/iaas/api/#/en/threat-intel/20220901/Indicator/GetIndicator")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIndicatorRequest::builder)
                .basePath("/20220901")
                .appendPathParam("indicators")
                .appendPathParam(request.getIndicatorId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.threatintelligence.model.Indicator.class,
                        GetIndicatorResponse.Builder::indicator)
                .handleResponseHeaderString(
                        "opc-request-id", GetIndicatorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListIndicatorCountsResponse> listIndicatorCounts(
            ListIndicatorCountsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIndicatorCountsRequest, ListIndicatorCountsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListIndicatorCountsResponse::builder)
                .logger(LOG, "listIndicatorCounts")
                .serviceDetails(
                        "Threatintel",
                        "ListIndicatorCounts",
                        "https://docs.oracle.com/iaas/api/#/en/threat-intel/20220901/IndicatorCountCollection/ListIndicatorCounts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIndicatorCountsRequest::builder)
                .basePath("/20220901")
                .appendPathParam("indicatorCounts")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.threatintelligence.model.IndicatorCountCollection.class,
                        ListIndicatorCountsResponse.Builder::indicatorCountCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListIndicatorCountsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListIndicatorsResponse> listIndicators(
            ListIndicatorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIndicatorsRequest, ListIndicatorsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListIndicatorsResponse::builder)
                .logger(LOG, "listIndicators")
                .serviceDetails(
                        "Threatintel",
                        "ListIndicators",
                        "https://docs.oracle.com/iaas/api/#/en/threat-intel/20220901/IndicatorSummaryCollection/ListIndicators")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIndicatorsRequest::builder)
                .basePath("/20220901")
                .appendPathParam("indicators")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "threatTypeName",
                        request.getThreatTypeName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("type", request.getType())
                .appendQueryParam("value", request.getValue())
                .appendQueryParam(
                        "confidenceGreaterThanOrEqualTo",
                        request.getConfidenceGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timeUpdatedGreaterThanOrEqualTo",
                        request.getTimeUpdatedGreaterThanOrEqualTo())
                .appendQueryParam("timeUpdatedLessThan", request.getTimeUpdatedLessThan())
                .appendQueryParam(
                        "timeLastSeenGreaterThanOrEqualTo",
                        request.getTimeLastSeenGreaterThanOrEqualTo())
                .appendQueryParam("timeLastSeenLessThan", request.getTimeLastSeenLessThan())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.threatintelligence.model.IndicatorSummaryCollection.class,
                        ListIndicatorsResponse.Builder::indicatorSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListIndicatorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListIndicatorsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListThreatTypesResponse> listThreatTypes(
            ListThreatTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListThreatTypesRequest, ListThreatTypesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListThreatTypesResponse::builder)
                .logger(LOG, "listThreatTypes")
                .serviceDetails(
                        "Threatintel",
                        "ListThreatTypes",
                        "https://docs.oracle.com/iaas/api/#/en/threat-intel/20220901/ThreatTypesCollection/ListThreatTypes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListThreatTypesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("threatTypes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.threatintelligence.model.ThreatTypesCollection.class,
                        ListThreatTypesResponse.Builder::threatTypesCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListThreatTypesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListThreatTypesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeIndicatorsResponse> summarizeIndicators(
            SummarizeIndicatorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SummarizeIndicatorsRequest, SummarizeIndicatorsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getSummarizeIndicatorsDetails(), "summarizeIndicatorsDetails is required");

        return clientCall(request, SummarizeIndicatorsResponse::builder)
                .logger(LOG, "summarizeIndicators")
                .serviceDetails(
                        "Threatintel",
                        "SummarizeIndicators",
                        "https://docs.oracle.com/iaas/api/#/en/threat-intel/20220901/Indicator/SummarizeIndicators")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SummarizeIndicatorsRequest::builder)
                .basePath("/20220901")
                .appendPathParam("indicators")
                .appendPathParam("actions")
                .appendPathParam("summarize")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.threatintelligence.model.IndicatorSummaryCollection.class,
                        SummarizeIndicatorsResponse.Builder::indicatorSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", SummarizeIndicatorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeIndicatorsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ThreatintelAsyncClient(
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
    public ThreatintelAsyncClient(
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
    public ThreatintelAsyncClient(
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
    public ThreatintelAsyncClient(
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
    public ThreatintelAsyncClient(
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
    public ThreatintelAsyncClient(
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
    public ThreatintelAsyncClient(
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
