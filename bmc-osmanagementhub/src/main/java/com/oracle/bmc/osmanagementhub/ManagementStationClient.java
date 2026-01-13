/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class ManagementStationClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements ManagementStation {
    /** Service instance for ManagementStation. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(ManagementStationClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://osmh.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ManagementStationClient.class);

    private final ManagementStationWaiters waiters;

    private final ManagementStationPaginators paginators;

    ManagementStationClient(
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
                                    .nameFormat("ManagementStation-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new ManagementStationWaiters(executorService, this);

        this.paginators = new ManagementStationPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ManagementStationClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "osmanagementhub";
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
        public ManagementStationClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ManagementStationClient(
                    this, authenticationDetailsProvider, executorService);
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
    public ChangeManagementStationCompartmentResponse changeManagementStationCompartment(
            ChangeManagementStationCompartmentRequest request) {

        Validate.notBlank(
                request.getManagementStationId(), "managementStationId must not be blank");
        Objects.requireNonNull(
                request.getChangeManagementStationCompartmentDetails(),
                "changeManagementStationCompartmentDetails is required");

        return clientCall(request, ChangeManagementStationCompartmentResponse::builder)
                .logger(LOG, "changeManagementStationCompartment")
                .serviceDetails(
                        "ManagementStation",
                        "ChangeManagementStationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagementStation/ChangeManagementStationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeManagementStationCompartmentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managementStations")
                .appendPathParam(request.getManagementStationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeManagementStationCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateManagementStationResponse createManagementStation(
            CreateManagementStationRequest request) {
        Objects.requireNonNull(
                request.getCreateManagementStationDetails(),
                "createManagementStationDetails is required");

        return clientCall(request, CreateManagementStationResponse::builder)
                .logger(LOG, "createManagementStation")
                .serviceDetails(
                        "ManagementStation",
                        "CreateManagementStation",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagementStation/CreateManagementStation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateManagementStationRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managementStations")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ManagementStation.class,
                        CreateManagementStationResponse.Builder::managementStation)
                .handleResponseHeaderString(
                        "opc-request-id", CreateManagementStationResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateManagementStationResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteManagementStationResponse deleteManagementStation(
            DeleteManagementStationRequest request) {

        Validate.notBlank(
                request.getManagementStationId(), "managementStationId must not be blank");

        return clientCall(request, DeleteManagementStationResponse::builder)
                .logger(LOG, "deleteManagementStation")
                .serviceDetails(
                        "ManagementStation",
                        "DeleteManagementStation",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagementStation/DeleteManagementStation")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteManagementStationRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managementStations")
                .appendPathParam(request.getManagementStationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteManagementStationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetManagementStationResponse getManagementStation(GetManagementStationRequest request) {

        Validate.notBlank(
                request.getManagementStationId(), "managementStationId must not be blank");

        return clientCall(request, GetManagementStationResponse::builder)
                .logger(LOG, "getManagementStation")
                .serviceDetails(
                        "ManagementStation",
                        "GetManagementStation",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagementStation/GetManagementStation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetManagementStationRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managementStations")
                .appendPathParam(request.getManagementStationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ManagementStation.class,
                        GetManagementStationResponse.Builder::managementStation)
                .handleResponseHeaderString("etag", GetManagementStationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetManagementStationResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetManagementStationResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListManagementStationsResponse listManagementStations(
            ListManagementStationsRequest request) {

        return clientCall(request, ListManagementStationsResponse::builder)
                .logger(LOG, "listManagementStations")
                .serviceDetails(
                        "ManagementStation",
                        "ListManagementStations",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagementStation/ListManagementStations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagementStationsRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managementStations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("managedInstanceId", request.getManagedInstanceId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendListQueryParam(
                        "location",
                        request.getLocation(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "locationNotEqualTo",
                        request.getLocationNotEqualTo(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("id", request.getId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ManagementStationCollection.class,
                        ListManagementStationsResponse.Builder::managementStationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListManagementStationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListManagementStationsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMirrorsResponse listMirrors(ListMirrorsRequest request) {

        Validate.notBlank(
                request.getManagementStationId(), "managementStationId must not be blank");

        return clientCall(request, ListMirrorsResponse::builder)
                .logger(LOG, "listMirrors")
                .serviceDetails(
                        "ManagementStation",
                        "ListMirrors",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/MirrorsCollection/ListMirrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMirrorsRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managementStations")
                .appendPathParam(request.getManagementStationId())
                .appendPathParam("mirrors")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "mirrorStates",
                        request.getMirrorStates(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.MirrorsCollection.class,
                        ListMirrorsResponse.Builder::mirrorsCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMirrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMirrorsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RefreshManagementStationConfigResponse refreshManagementStationConfig(
            RefreshManagementStationConfigRequest request) {

        Validate.notBlank(
                request.getManagementStationId(), "managementStationId must not be blank");

        return clientCall(request, RefreshManagementStationConfigResponse::builder)
                .logger(LOG, "refreshManagementStationConfig")
                .serviceDetails(
                        "ManagementStation",
                        "RefreshManagementStationConfig",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagementStation/RefreshManagementStationConfig")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshManagementStationConfigRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managementStations")
                .appendPathParam(request.getManagementStationId())
                .appendPathParam("actions")
                .appendPathParam("refresh")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RefreshManagementStationConfigResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RefreshManagementStationConfigResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public SynchronizeMirrorsResponse synchronizeMirrors(SynchronizeMirrorsRequest request) {

        Validate.notBlank(
                request.getManagementStationId(), "managementStationId must not be blank");
        Objects.requireNonNull(
                request.getSynchronizeMirrorsDetails(), "synchronizeMirrorsDetails is required");

        return clientCall(request, SynchronizeMirrorsResponse::builder)
                .logger(LOG, "synchronizeMirrors")
                .serviceDetails(
                        "ManagementStation",
                        "SynchronizeMirrors",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagementStation/SynchronizeMirrors")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SynchronizeMirrorsRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managementStations")
                .appendPathParam(request.getManagementStationId())
                .appendPathParam("actions")
                .appendPathParam("synchronizeMirrors")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", SynchronizeMirrorsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", SynchronizeMirrorsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public SynchronizeSingleMirrorsResponse synchronizeSingleMirrors(
            SynchronizeSingleMirrorsRequest request) {

        Validate.notBlank(
                request.getManagementStationId(), "managementStationId must not be blank");

        Validate.notBlank(request.getMirrorId(), "mirrorId must not be blank");

        return clientCall(request, SynchronizeSingleMirrorsResponse::builder)
                .logger(LOG, "synchronizeSingleMirrors")
                .serviceDetails(
                        "ManagementStation",
                        "SynchronizeSingleMirrors",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagementStation/SynchronizeSingleMirrors")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SynchronizeSingleMirrorsRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managementStations")
                .appendPathParam(request.getManagementStationId())
                .appendPathParam("mirrors")
                .appendPathParam(request.getMirrorId())
                .appendPathParam("actions")
                .appendPathParam("synchronize")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        SynchronizeSingleMirrorsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", SynchronizeSingleMirrorsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateManagementStationResponse updateManagementStation(
            UpdateManagementStationRequest request) {

        Validate.notBlank(
                request.getManagementStationId(), "managementStationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateManagementStationDetails(),
                "updateManagementStationDetails is required");

        return clientCall(request, UpdateManagementStationResponse::builder)
                .logger(LOG, "updateManagementStation")
                .serviceDetails(
                        "ManagementStation",
                        "UpdateManagementStation",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagementStation/UpdateManagementStation")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateManagementStationRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managementStations")
                .appendPathParam(request.getManagementStationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ManagementStation.class,
                        UpdateManagementStationResponse.Builder::managementStation)
                .handleResponseHeaderString("etag", UpdateManagementStationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateManagementStationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ManagementStationWaiters getWaiters() {
        return waiters;
    }

    @Override
    public ManagementStationPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ManagementStationClient(
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
    public ManagementStationClient(
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
    public ManagementStationClient(
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
    public ManagementStationClient(
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
    public ManagementStationClient(
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
    public ManagementStationClient(
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
    public ManagementStationClient(
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
    public ManagementStationClient(
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
