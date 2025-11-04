/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourceanalytics;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.resourceanalytics.requests.*;
import com.oracle.bmc.resourceanalytics.responses.*;

import java.util.Objects;

/**
 * Async client implementation for MonitoredRegion service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241031")
public class MonitoredRegionAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements MonitoredRegionAsync {
    /** Service instance for MonitoredRegion. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("MONITOREDREGION")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://resource-analytics.{region}.ocp.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MonitoredRegionAsyncClient.class);

    MonitoredRegionAsyncClient(
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
                    Builder, MonitoredRegionAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "resourceanalytics";
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
        public MonitoredRegionAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new MonitoredRegionAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateMonitoredRegionResponse> createMonitoredRegion(
            CreateMonitoredRegionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMonitoredRegionRequest, CreateMonitoredRegionResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateMonitoredRegionDetails(),
                "createMonitoredRegionDetails is required");

        return clientCall(request, CreateMonitoredRegionResponse::builder)
                .logger(LOG, "createMonitoredRegion")
                .serviceDetails(
                        "MonitoredRegion",
                        "CreateMonitoredRegion",
                        "https://docs.oracle.com/iaas/api/#/en/resource-analytics/20241031/MonitoredRegion/CreateMonitoredRegion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMonitoredRegionRequest::builder)
                .basePath("/20241031")
                .appendPathParam("monitoredRegions")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.resourceanalytics.model.MonitoredRegion.class,
                        CreateMonitoredRegionResponse.Builder::monitoredRegion)
                .handleResponseHeaderString(
                        "location", CreateMonitoredRegionResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateMonitoredRegionResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateMonitoredRegionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateMonitoredRegionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMonitoredRegionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMonitoredRegionResponse> deleteMonitoredRegion(
            DeleteMonitoredRegionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMonitoredRegionRequest, DeleteMonitoredRegionResponse>
                    handler) {

        Validate.notBlank(request.getMonitoredRegionId(), "monitoredRegionId must not be blank");

        return clientCall(request, DeleteMonitoredRegionResponse::builder)
                .logger(LOG, "deleteMonitoredRegion")
                .serviceDetails(
                        "MonitoredRegion",
                        "DeleteMonitoredRegion",
                        "https://docs.oracle.com/iaas/api/#/en/resource-analytics/20241031/MonitoredRegion/DeleteMonitoredRegion")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMonitoredRegionRequest::builder)
                .basePath("/20241031")
                .appendPathParam("monitoredRegions")
                .appendPathParam(request.getMonitoredRegionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteMonitoredRegionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMonitoredRegionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMonitoredRegionResponse> getMonitoredRegion(
            GetMonitoredRegionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMonitoredRegionRequest, GetMonitoredRegionResponse>
                    handler) {

        Validate.notBlank(request.getMonitoredRegionId(), "monitoredRegionId must not be blank");

        return clientCall(request, GetMonitoredRegionResponse::builder)
                .logger(LOG, "getMonitoredRegion")
                .serviceDetails(
                        "MonitoredRegion",
                        "GetMonitoredRegion",
                        "https://docs.oracle.com/iaas/api/#/en/resource-analytics/20241031/MonitoredRegion/GetMonitoredRegion")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMonitoredRegionRequest::builder)
                .basePath("/20241031")
                .appendPathParam("monitoredRegions")
                .appendPathParam(request.getMonitoredRegionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.resourceanalytics.model.MonitoredRegion.class,
                        GetMonitoredRegionResponse.Builder::monitoredRegion)
                .handleResponseHeaderString("etag", GetMonitoredRegionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMonitoredRegionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMonitoredRegionsResponse> listMonitoredRegions(
            ListMonitoredRegionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMonitoredRegionsRequest, ListMonitoredRegionsResponse>
                    handler) {

        return clientCall(request, ListMonitoredRegionsResponse::builder)
                .logger(LOG, "listMonitoredRegions")
                .serviceDetails(
                        "MonitoredRegion",
                        "ListMonitoredRegions",
                        "https://docs.oracle.com/iaas/api/#/en/resource-analytics/20241031/MonitoredRegionCollection/ListMonitoredRegions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMonitoredRegionsRequest::builder)
                .basePath("/20241031")
                .appendPathParam("monitoredRegions")
                .appendQueryParam(
                        "resourceAnalyticsInstanceId", request.getResourceAnalyticsInstanceId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.resourceanalytics.model.MonitoredRegionCollection.class,
                        ListMonitoredRegionsResponse.Builder::monitoredRegionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMonitoredRegionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMonitoredRegionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MonitoredRegionAsyncClient(
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
    public MonitoredRegionAsyncClient(
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
    public MonitoredRegionAsyncClient(
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
    public MonitoredRegionAsyncClient(
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
    public MonitoredRegionAsyncClient(
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
    public MonitoredRegionAsyncClient(
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
    public MonitoredRegionAsyncClient(
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
