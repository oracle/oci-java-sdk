/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.cloudbridge.requests.*;
import com.oracle.bmc.cloudbridge.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
public class DiscoveryClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements Discovery {
    /** Service instance for Discovery. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DISCOVERY")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://cloudbridge.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DiscoveryClient.class);

    private final DiscoveryWaiters waiters;

    private final DiscoveryPaginators paginators;

    DiscoveryClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        if (executorService == null) {
            // up to 50 (core) threads, time out after 60s idle, all daemon
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor =
                    new java.util.concurrent.ThreadPoolExecutor(
                            50,
                            50,
                            60L,
                            java.util.concurrent.TimeUnit.SECONDS,
                            new java.util.concurrent.LinkedBlockingQueue<Runnable>(),
                            com.oracle.bmc.internal.ClientThreadFactory.builder()
                                    .isDaemon(true)
                                    .nameFormat("Discovery-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DiscoveryWaiters(executorService, this);

        this.paginators = new DiscoveryPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DiscoveryClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "cloudbridge";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Set the ExecutorService for the client to be created.
         *
         * @param executorService executorService
         * @return this builder
         */
        public Builder executorService(java.util.concurrent.ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public DiscoveryClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DiscoveryClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeAssetSourceCompartmentResponse changeAssetSourceCompartment(
            ChangeAssetSourceCompartmentRequest request) {

        Validate.notBlank(request.getAssetSourceId(), "assetSourceId must not be blank");
        Objects.requireNonNull(
                request.getChangeAssetSourceCompartmentDetails(),
                "changeAssetSourceCompartmentDetails is required");

        return clientCall(request, ChangeAssetSourceCompartmentResponse::builder)
                .logger(LOG, "changeAssetSourceCompartment")
                .serviceDetails(
                        "Discovery",
                        "ChangeAssetSourceCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AssetSource/ChangeAssetSourceCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAssetSourceCompartmentRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assetSources")
                .appendPathParam(request.getAssetSourceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAssetSourceCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeDiscoveryScheduleCompartmentResponse changeDiscoveryScheduleCompartment(
            ChangeDiscoveryScheduleCompartmentRequest request) {

        Validate.notBlank(
                request.getDiscoveryScheduleId(), "discoveryScheduleId must not be blank");
        Objects.requireNonNull(
                request.getChangeDiscoveryScheduleCompartmentDetails(),
                "changeDiscoveryScheduleCompartmentDetails is required");

        return clientCall(request, ChangeDiscoveryScheduleCompartmentResponse::builder)
                .logger(LOG, "changeDiscoveryScheduleCompartment")
                .serviceDetails(
                        "Discovery",
                        "ChangeDiscoveryScheduleCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/DiscoverySchedule/ChangeDiscoveryScheduleCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDiscoveryScheduleCompartmentRequest::builder)
                .basePath("/20220509")
                .appendPathParam("discoverySchedules")
                .appendPathParam(request.getDiscoveryScheduleId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDiscoveryScheduleCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateAssetSourceResponse createAssetSource(CreateAssetSourceRequest request) {
        Objects.requireNonNull(
                request.getCreateAssetSourceDetails(), "createAssetSourceDetails is required");

        return clientCall(request, CreateAssetSourceResponse::builder)
                .logger(LOG, "createAssetSource")
                .serviceDetails(
                        "Discovery",
                        "CreateAssetSource",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AssetSource/CreateAssetSource")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAssetSourceRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assetSources")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.AssetSource.class,
                        CreateAssetSourceResponse.Builder::assetSource)
                .handleResponseHeaderString("etag", CreateAssetSourceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAssetSourceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateAssetSourceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("Location", CreateAssetSourceResponse.Builder::location)
                .callSync();
    }

    @Override
    public CreateDiscoveryScheduleResponse createDiscoverySchedule(
            CreateDiscoveryScheduleRequest request) {
        Objects.requireNonNull(
                request.getCreateDiscoveryScheduleDetails(),
                "createDiscoveryScheduleDetails is required");

        return clientCall(request, CreateDiscoveryScheduleResponse::builder)
                .logger(LOG, "createDiscoverySchedule")
                .serviceDetails(
                        "Discovery",
                        "CreateDiscoverySchedule",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/DiscoverySchedule/CreateDiscoverySchedule")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDiscoveryScheduleRequest::builder)
                .basePath("/20220509")
                .appendPathParam("discoverySchedules")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.DiscoverySchedule.class,
                        CreateDiscoveryScheduleResponse.Builder::discoverySchedule)
                .handleResponseHeaderString("etag", CreateDiscoveryScheduleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDiscoveryScheduleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteAssetSourceResponse deleteAssetSource(DeleteAssetSourceRequest request) {

        Validate.notBlank(request.getAssetSourceId(), "assetSourceId must not be blank");

        return clientCall(request, DeleteAssetSourceResponse::builder)
                .logger(LOG, "deleteAssetSource")
                .serviceDetails(
                        "Discovery",
                        "DeleteAssetSource",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AssetSource/DeleteAssetSource")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAssetSourceRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assetSources")
                .appendPathParam(request.getAssetSourceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAssetSourceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteAssetSourceResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteDiscoveryScheduleResponse deleteDiscoverySchedule(
            DeleteDiscoveryScheduleRequest request) {

        Validate.notBlank(
                request.getDiscoveryScheduleId(), "discoveryScheduleId must not be blank");

        return clientCall(request, DeleteDiscoveryScheduleResponse::builder)
                .logger(LOG, "deleteDiscoverySchedule")
                .serviceDetails(
                        "Discovery",
                        "DeleteDiscoverySchedule",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/DiscoverySchedule/DeleteDiscoverySchedule")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDiscoveryScheduleRequest::builder)
                .basePath("/20220509")
                .appendPathParam("discoverySchedules")
                .appendPathParam(request.getDiscoveryScheduleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDiscoveryScheduleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAssetSourceResponse getAssetSource(GetAssetSourceRequest request) {

        Validate.notBlank(request.getAssetSourceId(), "assetSourceId must not be blank");

        return clientCall(request, GetAssetSourceResponse::builder)
                .logger(LOG, "getAssetSource")
                .serviceDetails(
                        "Discovery",
                        "GetAssetSource",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AssetSource/GetAssetSource")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAssetSourceRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assetSources")
                .appendPathParam(request.getAssetSourceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.AssetSource.class,
                        GetAssetSourceResponse.Builder::assetSource)
                .handleResponseHeaderString("etag", GetAssetSourceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAssetSourceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDiscoveryScheduleResponse getDiscoverySchedule(GetDiscoveryScheduleRequest request) {

        Validate.notBlank(
                request.getDiscoveryScheduleId(), "discoveryScheduleId must not be blank");

        return clientCall(request, GetDiscoveryScheduleResponse::builder)
                .logger(LOG, "getDiscoverySchedule")
                .serviceDetails(
                        "Discovery",
                        "GetDiscoverySchedule",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/DiscoverySchedule/GetDiscoverySchedule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDiscoveryScheduleRequest::builder)
                .basePath("/20220509")
                .appendPathParam("discoverySchedules")
                .appendPathParam(request.getDiscoveryScheduleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.DiscoverySchedule.class,
                        GetDiscoveryScheduleResponse.Builder::discoverySchedule)
                .handleResponseHeaderString("etag", GetDiscoveryScheduleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDiscoveryScheduleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListAssetSourceConnectionsResponse listAssetSourceConnections(
            ListAssetSourceConnectionsRequest request) {

        Validate.notBlank(request.getAssetSourceId(), "assetSourceId must not be blank");

        return clientCall(request, ListAssetSourceConnectionsResponse::builder)
                .logger(LOG, "listAssetSourceConnections")
                .serviceDetails(
                        "Discovery",
                        "ListAssetSourceConnections",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AssetSource/ListAssetSourceConnections")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ListAssetSourceConnectionsRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assetSources")
                .appendPathParam(request.getAssetSourceId())
                .appendPathParam("actions")
                .appendPathParam("listConnections")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.AssetSourceConnectionCollection.class,
                        ListAssetSourceConnectionsResponse.Builder::assetSourceConnectionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAssetSourceConnectionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAssetSourceConnectionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListAssetSourcesResponse listAssetSources(ListAssetSourcesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAssetSourcesResponse::builder)
                .logger(LOG, "listAssetSources")
                .serviceDetails(
                        "Discovery",
                        "ListAssetSources",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AssetSource/ListAssetSources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAssetSourcesRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assetSources")
                .appendQueryParam("assetSourceId", request.getAssetSourceId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.AssetSourceCollection.class,
                        ListAssetSourcesResponse.Builder::assetSourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAssetSourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAssetSourcesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDiscoverySchedulesResponse listDiscoverySchedules(
            ListDiscoverySchedulesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDiscoverySchedulesResponse::builder)
                .logger(LOG, "listDiscoverySchedules")
                .serviceDetails(
                        "Discovery",
                        "ListDiscoverySchedules",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/DiscoverySchedule/ListDiscoverySchedules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDiscoverySchedulesRequest::builder)
                .basePath("/20220509")
                .appendPathParam("discoverySchedules")
                .appendQueryParam("discoveryScheduleId", request.getDiscoveryScheduleId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.DiscoveryScheduleCollection.class,
                        ListDiscoverySchedulesResponse.Builder::discoveryScheduleCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDiscoverySchedulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDiscoverySchedulesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RefreshAssetSourceResponse refreshAssetSource(RefreshAssetSourceRequest request) {

        Validate.notBlank(request.getAssetSourceId(), "assetSourceId must not be blank");

        return clientCall(request, RefreshAssetSourceResponse::builder)
                .logger(LOG, "refreshAssetSource")
                .serviceDetails(
                        "Discovery",
                        "RefreshAssetSource",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AssetSource/RefreshAssetSource")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshAssetSourceRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assetSources")
                .appendPathParam(request.getAssetSourceId())
                .appendPathParam("actions")
                .appendPathParam("refresh")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", RefreshAssetSourceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", RefreshAssetSourceResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateAssetSourceResponse updateAssetSource(UpdateAssetSourceRequest request) {

        Validate.notBlank(request.getAssetSourceId(), "assetSourceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAssetSourceDetails(), "updateAssetSourceDetails is required");

        return clientCall(request, UpdateAssetSourceResponse::builder)
                .logger(LOG, "updateAssetSource")
                .serviceDetails(
                        "Discovery",
                        "UpdateAssetSource",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/AssetSource/UpdateAssetSource")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAssetSourceRequest::builder)
                .basePath("/20220509")
                .appendPathParam("assetSources")
                .appendPathParam(request.getAssetSourceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAssetSourceResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateAssetSourceResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateDiscoveryScheduleResponse updateDiscoverySchedule(
            UpdateDiscoveryScheduleRequest request) {
        Objects.requireNonNull(
                request.getUpdateDiscoveryScheduleDetails(),
                "updateDiscoveryScheduleDetails is required");

        Validate.notBlank(
                request.getDiscoveryScheduleId(), "discoveryScheduleId must not be blank");

        return clientCall(request, UpdateDiscoveryScheduleResponse::builder)
                .logger(LOG, "updateDiscoverySchedule")
                .serviceDetails(
                        "Discovery",
                        "UpdateDiscoverySchedule",
                        "https://docs.oracle.com/iaas/api/#/en/OCB/20220509/DiscoverySchedule/UpdateDiscoverySchedule")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDiscoveryScheduleRequest::builder)
                .basePath("/20220509")
                .appendPathParam("discoverySchedules")
                .appendPathParam(request.getDiscoveryScheduleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudbridge.model.DiscoverySchedule.class,
                        UpdateDiscoveryScheduleResponse.Builder::discoverySchedule)
                .handleResponseHeaderString("etag", UpdateDiscoveryScheduleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDiscoveryScheduleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DiscoveryWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DiscoveryPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DiscoveryClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider, null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DiscoveryClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider, null);
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
    public DiscoveryClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider,
                null);
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
    public DiscoveryClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider,
                null);
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
    public DiscoveryClient(
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
                authenticationDetailsProvider,
                null);
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
    public DiscoveryClient(
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
                authenticationDetailsProvider,
                null);
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
    public DiscoveryClient(
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
                authenticationDetailsProvider,
                null);
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
     * @param executorService {@link Builder#executorService}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DiscoveryClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint,
            java.util.concurrent.ExecutorService executorService) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider,
                executorService);
    }
}
