/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dashboardservice;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.dashboardservice.requests.*;
import com.oracle.bmc.dashboardservice.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Dashboard service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210731")
public class DashboardAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DashboardAsync {
    /** Service instance for Dashboard. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DashboardClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://dashboard.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DashboardAsyncClient.class);

    DashboardAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DashboardAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "dashboardservice";
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
        public DashboardAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DashboardAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeDashboardGroupResponse> changeDashboardGroup(
            ChangeDashboardGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeDashboardGroupRequest, ChangeDashboardGroupResponse>
                    handler) {

        Validate.notBlank(request.getDashboardId(), "dashboardId must not be blank");
        Objects.requireNonNull(
                request.getChangeDashboardGroupDetails(),
                "changeDashboardGroupDetails is required");

        return clientCall(request, ChangeDashboardGroupResponse::builder)
                .logger(LOG, "changeDashboardGroup")
                .serviceDetails(
                        "Dashboard",
                        "ChangeDashboardGroup",
                        "https://docs.oracle.com/iaas/api/#/en/dashboard/20210731/Dashboard/ChangeDashboardGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDashboardGroupRequest::builder)
                .basePath("/20210731")
                .appendPathParam("dashboards")
                .appendPathParam(request.getDashboardId())
                .appendPathParam("actions")
                .appendPathParam("changeDashboardGroup")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeDashboardGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDashboardResponse> createDashboard(
            CreateDashboardRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDashboardRequest, CreateDashboardResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateDashboardDetails(), "createDashboardDetails is required");

        return clientCall(request, CreateDashboardResponse::builder)
                .logger(LOG, "createDashboard")
                .serviceDetails(
                        "Dashboard",
                        "CreateDashboard",
                        "https://docs.oracle.com/iaas/api/#/en/dashboard/20210731/Dashboard/CreateDashboard")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDashboardRequest::builder)
                .basePath("/20210731")
                .appendPathParam("dashboards")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-cross-region", request.getOpcCrossRegion())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dashboardservice.model.Dashboard.class,
                        CreateDashboardResponse.Builder::dashboard)
                .handleResponseHeaderString("etag", CreateDashboardResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDashboardResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDashboardResponse> deleteDashboard(
            DeleteDashboardRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDashboardRequest, DeleteDashboardResponse>
                    handler) {

        Validate.notBlank(request.getDashboardId(), "dashboardId must not be blank");

        return clientCall(request, DeleteDashboardResponse::builder)
                .logger(LOG, "deleteDashboard")
                .serviceDetails(
                        "Dashboard",
                        "DeleteDashboard",
                        "https://docs.oracle.com/iaas/api/#/en/dashboard/20210731/Dashboard/DeleteDashboard")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDashboardRequest::builder)
                .basePath("/20210731")
                .appendPathParam("dashboards")
                .appendPathParam(request.getDashboardId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-cross-region", request.getOpcCrossRegion())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDashboardResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDashboardResponse> getDashboard(
            GetDashboardRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDashboardRequest, GetDashboardResponse>
                    handler) {

        Validate.notBlank(request.getDashboardId(), "dashboardId must not be blank");

        return clientCall(request, GetDashboardResponse::builder)
                .logger(LOG, "getDashboard")
                .serviceDetails(
                        "Dashboard",
                        "GetDashboard",
                        "https://docs.oracle.com/iaas/api/#/en/dashboard/20210731/Dashboard/GetDashboard")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDashboardRequest::builder)
                .basePath("/20210731")
                .appendPathParam("dashboards")
                .appendPathParam(request.getDashboardId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-cross-region", request.getOpcCrossRegion())
                .handleBody(
                        com.oracle.bmc.dashboardservice.model.Dashboard.class,
                        GetDashboardResponse.Builder::dashboard)
                .handleResponseHeaderString("etag", GetDashboardResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDashboardResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDashboardsResponse> listDashboards(
            ListDashboardsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDashboardsRequest, ListDashboardsResponse>
                    handler) {
        Objects.requireNonNull(request.getDashboardGroupId(), "dashboardGroupId is required");

        return clientCall(request, ListDashboardsResponse::builder)
                .logger(LOG, "listDashboards")
                .serviceDetails(
                        "Dashboard",
                        "ListDashboards",
                        "https://docs.oracle.com/iaas/api/#/en/dashboard/20210731/DashboardCollection/ListDashboards")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDashboardsRequest::builder)
                .basePath("/20210731")
                .appendPathParam("dashboards")
                .appendQueryParam("dashboardGroupId", request.getDashboardGroupId())
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
                        com.oracle.bmc.dashboardservice.model.DashboardCollection.class,
                        ListDashboardsResponse.Builder::dashboardCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDashboardsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDashboardsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDashboardResponse> updateDashboard(
            UpdateDashboardRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDashboardRequest, UpdateDashboardResponse>
                    handler) {

        Validate.notBlank(request.getDashboardId(), "dashboardId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDashboardDetails(), "updateDashboardDetails is required");

        return clientCall(request, UpdateDashboardResponse::builder)
                .logger(LOG, "updateDashboard")
                .serviceDetails(
                        "Dashboard",
                        "UpdateDashboard",
                        "https://docs.oracle.com/iaas/api/#/en/dashboard/20210731/Dashboard/UpdateDashboard")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDashboardRequest::builder)
                .basePath("/20210731")
                .appendPathParam("dashboards")
                .appendPathParam(request.getDashboardId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-cross-region", request.getOpcCrossRegion())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dashboardservice.model.Dashboard.class,
                        UpdateDashboardResponse.Builder::dashboard)
                .handleResponseHeaderString("etag", UpdateDashboardResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDashboardResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DashboardAsyncClient(
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
    public DashboardAsyncClient(
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
    public DashboardAsyncClient(
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
    public DashboardAsyncClient(
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
    public DashboardAsyncClient(
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
    public DashboardAsyncClient(
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
    public DashboardAsyncClient(
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
