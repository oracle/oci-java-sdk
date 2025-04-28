/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.apmtraces.requests.*;
import com.oracle.bmc.apmtraces.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class TraceClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Trace {
    /** Service instance for Trace. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("TRACE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://apm-trace.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(TraceClient.class);

    TraceClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, TraceClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "apmtraces";
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
        public TraceClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new TraceClient(this, authenticationDetailsProvider);
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
    public GetAggregatedSnapshotResponse getAggregatedSnapshot(
            GetAggregatedSnapshotRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getTraceKey(), "traceKey must not be blank");

        return clientCall(request, GetAggregatedSnapshotResponse::builder)
                .logger(LOG, "getAggregatedSnapshot")
                .serviceDetails(
                        "Trace",
                        "GetAggregatedSnapshot",
                        "https://docs.oracle.com/iaas/api/#/en/apm-trace-explorer/20200630/AggregatedSnapshot/GetAggregatedSnapshot")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAggregatedSnapshotRequest::builder)
                .basePath("/20200630")
                .appendPathParam("traces")
                .appendPathParam(request.getTraceKey())
                .appendPathParam("aggregatedSnapshotData")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .appendQueryParam("serviceName", request.getServiceName())
                .appendQueryParam("serverName", request.getServerName())
                .appendQueryParam("spanKey", request.getSpanKey())
                .appendQueryParam("spanName", request.getSpanName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apmtraces.model.AggregatedSnapshot.class,
                        GetAggregatedSnapshotResponse.Builder::aggregatedSnapshot)
                .handleResponseHeaderString(
                        "opc-request-id", GetAggregatedSnapshotResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSpanResponse getSpan(GetSpanRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getSpanKey(), "spanKey must not be blank");

        Validate.notBlank(request.getTraceKey(), "traceKey must not be blank");

        return clientCall(request, GetSpanResponse::builder)
                .logger(LOG, "getSpan")
                .serviceDetails(
                        "Trace",
                        "GetSpan",
                        "https://docs.oracle.com/iaas/api/#/en/apm-trace-explorer/20200630/Span/GetSpan")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSpanRequest::builder)
                .basePath("/20200630")
                .appendPathParam("spans")
                .appendPathParam(request.getTraceKey())
                .appendPathParam(request.getSpanKey())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .appendQueryParam(
                        "timeSpanStartedGreaterThanOrEqualTo",
                        request.getTimeSpanStartedGreaterThanOrEqualTo())
                .appendQueryParam("timeSpanStartedLessThan", request.getTimeSpanStartedLessThan())
                .appendEnumQueryParam("spanNamespace", request.getSpanNamespace())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apmtraces.model.Span.class, GetSpanResponse.Builder::span)
                .handleResponseHeaderString("opc-request-id", GetSpanResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetTraceResponse getTrace(GetTraceRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getTraceKey(), "traceKey must not be blank");

        return clientCall(request, GetTraceResponse::builder)
                .logger(LOG, "getTrace")
                .serviceDetails(
                        "Trace",
                        "GetTrace",
                        "https://docs.oracle.com/iaas/api/#/en/apm-trace-explorer/20200630/Trace/GetTrace")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTraceRequest::builder)
                .basePath("/20200630")
                .appendPathParam("traces")
                .appendPathParam(request.getTraceKey())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .appendQueryParam(
                        "timeTraceStartedGreaterThanOrEqualTo",
                        request.getTimeTraceStartedGreaterThanOrEqualTo())
                .appendQueryParam("timeTraceStartedLessThan", request.getTimeTraceStartedLessThan())
                .appendEnumQueryParam("traceNamespace", request.getTraceNamespace())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apmtraces.model.Trace.class, GetTraceResponse.Builder::trace)
                .handleResponseHeaderString(
                        "opc-request-id", GetTraceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetTraceSnapshotResponse getTraceSnapshot(GetTraceSnapshotRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getTraceKey(), "traceKey must not be blank");

        return clientCall(request, GetTraceSnapshotResponse::builder)
                .logger(LOG, "getTraceSnapshot")
                .serviceDetails(
                        "Trace",
                        "GetTraceSnapshot",
                        "https://docs.oracle.com/iaas/api/#/en/apm-trace-explorer/20200630/TraceSnapshot/GetTraceSnapshot")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTraceSnapshotRequest::builder)
                .basePath("/20200630")
                .appendPathParam("traces")
                .appendPathParam(request.getTraceKey())
                .appendPathParam("snapshotData")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .appendQueryParam("isSummarized", request.getIsSummarized())
                .appendQueryParam("threadId", request.getThreadId())
                .appendQueryParam("snapshotTime", request.getSnapshotTime())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apmtraces.model.TraceSnapshot.class,
                        GetTraceSnapshotResponse.Builder::traceSnapshot)
                .handleResponseHeaderString(
                        "opc-request-id", GetTraceSnapshotResponse.Builder::opcRequestId)
                .callSync();
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public TraceClient(
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
    public TraceClient(
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
    public TraceClient(
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
    public TraceClient(
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
    public TraceClient(
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
    public TraceClient(
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
    public TraceClient(
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
