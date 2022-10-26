/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dashboardservice;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.dashboardservice.requests.*;
import com.oracle.bmc.dashboardservice.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210731")
public class DashboardGroupClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements DashboardGroup {
    /** Service instance for DashboardGroup. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DASHBOARDGROUP")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://dashboard.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DashboardGroupAsyncClient.class);

    private final DashboardGroupWaiters waiters;

    private final DashboardGroupPaginators paginators;

    private DashboardGroupClient(
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
                                    .nameFormat("DashboardGroup-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DashboardGroupWaiters(executorService, this);

        this.paginators = new DashboardGroupPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DashboardGroupClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
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
        public DashboardGroupClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DashboardGroupClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeDashboardGroupCompartmentResponse changeDashboardGroupCompartment(
            ChangeDashboardGroupCompartmentRequest request) {

        Validate.notBlank(request.getDashboardGroupId(), "dashboardGroupId must not be blank");
        Objects.requireNonNull(
                request.getChangeDashboardGroupCompartmentDetails(),
                "changeDashboardGroupCompartmentDetails is required");

        return clientCall(request, ChangeDashboardGroupCompartmentResponse::builder)
                .logger(LOG, "changeDashboardGroupCompartment")
                .serviceDetails(
                        "DashboardGroup",
                        "ChangeDashboardGroupCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/dashboard/20210731/DashboardGroup/ChangeDashboardGroupCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDashboardGroupCompartmentRequest::builder)
                .basePath("/20210731")
                .appendPathParam("dashboardGroups")
                .appendPathParam(request.getDashboardGroupId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDashboardGroupCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDashboardGroupResponse createDashboardGroup(CreateDashboardGroupRequest request) {
        Objects.requireNonNull(
                request.getCreateDashboardGroupDetails(),
                "createDashboardGroupDetails is required");

        return clientCall(request, CreateDashboardGroupResponse::builder)
                .logger(LOG, "createDashboardGroup")
                .serviceDetails(
                        "DashboardGroup",
                        "CreateDashboardGroup",
                        "https://docs.oracle.com/iaas/api/#/en/dashboard/20210731/DashboardGroup/CreateDashboardGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDashboardGroupRequest::builder)
                .basePath("/20210731")
                .appendPathParam("dashboardGroups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-cross-region", request.getOpcCrossRegion())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dashboardservice.model.DashboardGroup.class,
                        CreateDashboardGroupResponse.Builder::dashboardGroup)
                .handleResponseHeaderString("etag", CreateDashboardGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDashboardGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDashboardGroupResponse deleteDashboardGroup(DeleteDashboardGroupRequest request) {

        Validate.notBlank(request.getDashboardGroupId(), "dashboardGroupId must not be blank");

        return clientCall(request, DeleteDashboardGroupResponse::builder)
                .logger(LOG, "deleteDashboardGroup")
                .serviceDetails(
                        "DashboardGroup",
                        "DeleteDashboardGroup",
                        "https://docs.oracle.com/iaas/api/#/en/dashboard/20210731/DashboardGroup/DeleteDashboardGroup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDashboardGroupRequest::builder)
                .basePath("/20210731")
                .appendPathParam("dashboardGroups")
                .appendPathParam(request.getDashboardGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-cross-region", request.getOpcCrossRegion())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDashboardGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDashboardGroupResponse getDashboardGroup(GetDashboardGroupRequest request) {

        Validate.notBlank(request.getDashboardGroupId(), "dashboardGroupId must not be blank");

        return clientCall(request, GetDashboardGroupResponse::builder)
                .logger(LOG, "getDashboardGroup")
                .serviceDetails(
                        "DashboardGroup",
                        "GetDashboardGroup",
                        "https://docs.oracle.com/iaas/api/#/en/dashboard/20210731/DashboardGroup/GetDashboardGroup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDashboardGroupRequest::builder)
                .basePath("/20210731")
                .appendPathParam("dashboardGroups")
                .appendPathParam(request.getDashboardGroupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-cross-region", request.getOpcCrossRegion())
                .handleBody(
                        com.oracle.bmc.dashboardservice.model.DashboardGroup.class,
                        GetDashboardGroupResponse.Builder::dashboardGroup)
                .handleResponseHeaderString("etag", GetDashboardGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDashboardGroupResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListDashboardGroupsResponse listDashboardGroups(ListDashboardGroupsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDashboardGroupsResponse::builder)
                .logger(LOG, "listDashboardGroups")
                .serviceDetails(
                        "DashboardGroup",
                        "ListDashboardGroups",
                        "https://docs.oracle.com/iaas/api/#/en/dashboard/20210731/DashboardGroupCollection/ListDashboardGroups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDashboardGroupsRequest::builder)
                .basePath("/20210731")
                .appendPathParam("dashboardGroups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-cross-region", request.getOpcCrossRegion())
                .handleBody(
                        com.oracle.bmc.dashboardservice.model.DashboardGroupCollection.class,
                        ListDashboardGroupsResponse.Builder::dashboardGroupCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDashboardGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDashboardGroupsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateDashboardGroupResponse updateDashboardGroup(UpdateDashboardGroupRequest request) {

        Validate.notBlank(request.getDashboardGroupId(), "dashboardGroupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDashboardGroupDetails(),
                "updateDashboardGroupDetails is required");

        return clientCall(request, UpdateDashboardGroupResponse::builder)
                .logger(LOG, "updateDashboardGroup")
                .serviceDetails(
                        "DashboardGroup",
                        "UpdateDashboardGroup",
                        "https://docs.oracle.com/iaas/api/#/en/dashboard/20210731/DashboardGroup/UpdateDashboardGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDashboardGroupRequest::builder)
                .basePath("/20210731")
                .appendPathParam("dashboardGroups")
                .appendPathParam(request.getDashboardGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-cross-region", request.getOpcCrossRegion())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dashboardservice.model.DashboardGroup.class,
                        UpdateDashboardGroupResponse.Builder::dashboardGroup)
                .handleResponseHeaderString("etag", UpdateDashboardGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDashboardGroupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DashboardGroupWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DashboardGroupPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DashboardGroupClient(
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
    public DashboardGroupClient(
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
    public DashboardGroupClient(
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
    public DashboardGroupClient(
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
    public DashboardGroupClient(
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
    public DashboardGroupClient(
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
    public DashboardGroupClient(
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
    public DashboardGroupClient(
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
