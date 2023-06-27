/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;

import java.util.Objects;

/**
 * Async client implementation for ReportingManagedInstance service. <br>
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
public class ReportingManagedInstanceAsyncClient
        extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ReportingManagedInstanceAsync {
    /** Service instance for ReportingManagedInstance. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("REPORTINGMANAGEDINSTANCE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://osmh.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ReportingManagedInstanceAsyncClient.class);

    ReportingManagedInstanceAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    ReportingManagedInstanceAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "ReportingManagedInstanceAsyncClient",
                            "getManagedInstanceAnalyticContent,getManagedInstanceContent"));
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
                    Builder, ReportingManagedInstanceAsyncClient> {
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
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
        public ReportingManagedInstanceAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ReportingManagedInstanceAsyncClient(
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
    public java.util.concurrent.Future<GetManagedInstanceAnalyticContentResponse>
            getManagedInstanceAnalyticContent(
                    GetManagedInstanceAnalyticContentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetManagedInstanceAnalyticContentRequest,
                                    GetManagedInstanceAnalyticContentResponse>
                            handler) {

        return clientCall(request, GetManagedInstanceAnalyticContentResponse::builder)
                .logger(LOG, "getManagedInstanceAnalyticContent")
                .serviceDetails("ReportingManagedInstance", "GetManagedInstanceAnalyticContent", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetManagedInstanceAnalyticContentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceAnalytics")
                .appendPathParam("content")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("managedInstanceGroupId", request.getManagedInstanceGroupId())
                .appendQueryParam("lifecycleEnvironmentId", request.getLifecycleEnvironmentId())
                .appendQueryParam("lifecycleStageId", request.getLifecycleStageId())
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "displayName",
                        request.getDisplayName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendEnumQueryParam("instanceLocation", request.getInstanceLocation())
                .appendQueryParam(
                        "securityUpdatesAvailableEqualsTo",
                        request.getSecurityUpdatesAvailableEqualsTo())
                .appendQueryParam(
                        "bugUpdatesAvailableEqualsTo", request.getBugUpdatesAvailableEqualsTo())
                .appendQueryParam(
                        "securityUpdatesAvailableGreaterThan",
                        request.getSecurityUpdatesAvailableGreaterThan())
                .appendQueryParam(
                        "bugUpdatesAvailableGreaterThan",
                        request.getBugUpdatesAvailableGreaterThan())
                .accept("application/x-yaml")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        java.io.InputStream.class,
                        GetManagedInstanceAnalyticContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "etag", GetManagedInstanceAnalyticContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetManagedInstanceAnalyticContentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetManagedInstanceContentResponse> getManagedInstanceContent(
            GetManagedInstanceContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetManagedInstanceContentRequest, GetManagedInstanceContentResponse>
                    handler) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, GetManagedInstanceContentResponse::builder)
                .logger(LOG, "getManagedInstanceContent")
                .serviceDetails("ReportingManagedInstance", "GetManagedInstanceContent", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetManagedInstanceContentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("content")
                .appendListQueryParam(
                        "advisoryName",
                        request.getAdvisoryName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("advisoryNameContains", request.getAdvisoryNameContains())
                .appendListQueryParam(
                        "advisoryType",
                        request.getAdvisoryType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/x-yaml")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        java.io.InputStream.class,
                        GetManagedInstanceContentResponse.Builder::inputStream)
                .handleResponseHeaderString("etag", GetManagedInstanceContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetManagedInstanceContentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeManagedInstanceAnalyticsResponse>
            summarizeManagedInstanceAnalytics(
                    SummarizeManagedInstanceAnalyticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeManagedInstanceAnalyticsRequest,
                                    SummarizeManagedInstanceAnalyticsResponse>
                            handler) {
        Objects.requireNonNull(request.getMetricNames(), "metricNames is required");

        return clientCall(request, SummarizeManagedInstanceAnalyticsResponse::builder)
                .logger(LOG, "summarizeManagedInstanceAnalytics")
                .serviceDetails("ReportingManagedInstance", "SummarizeManagedInstanceAnalytics", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(SummarizeManagedInstanceAnalyticsRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstanceAnalytics")
                .appendListQueryParam(
                        "metricNames",
                        request.getMetricNames(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("managedInstanceGroupId", request.getManagedInstanceGroupId())
                .appendQueryParam("lifecycleEnvironmentId", request.getLifecycleEnvironmentId())
                .appendQueryParam("lifecycleStageId", request.getLifecycleStageId())
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "displayName",
                        request.getDisplayName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendEnumQueryParam("instanceLocation", request.getInstanceLocation())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ManagedInstanceAnalyticCollection
                                .class,
                        SummarizeManagedInstanceAnalyticsResponse.Builder
                                ::managedInstanceAnalyticCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeManagedInstanceAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeManagedInstanceAnalyticsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ReportingManagedInstanceAsyncClient(
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
    public ReportingManagedInstanceAsyncClient(
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
    public ReportingManagedInstanceAsyncClient(
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
    public ReportingManagedInstanceAsyncClient(
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
    public ReportingManagedInstanceAsyncClient(
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
    public ReportingManagedInstanceAsyncClient(
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
    public ReportingManagedInstanceAsyncClient(
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
