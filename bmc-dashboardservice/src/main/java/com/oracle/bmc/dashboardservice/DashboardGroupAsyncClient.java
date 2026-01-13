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
 * Async client implementation for DashboardGroup service. <br>
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
public class DashboardGroupAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DashboardGroupAsync {
    /** Service instance for DashboardGroup. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DashboardGroupClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://dashboard.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DashboardGroupAsyncClient.class);

    DashboardGroupAsyncClient(
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
                    Builder, DashboardGroupAsyncClient> {
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
        public DashboardGroupAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DashboardGroupAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeDashboardGroupCompartmentResponse>
            changeDashboardGroupCompartment(
                    ChangeDashboardGroupCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDashboardGroupCompartmentRequest,
                                    ChangeDashboardGroupCompartmentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDashboardGroupResponse> createDashboardGroup(
            CreateDashboardGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDashboardGroupRequest, CreateDashboardGroupResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDashboardGroupResponse> deleteDashboardGroup(
            DeleteDashboardGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDashboardGroupRequest, DeleteDashboardGroupResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDashboardGroupResponse> getDashboardGroup(
            GetDashboardGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDashboardGroupRequest, GetDashboardGroupResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDashboardGroupsResponse> listDashboardGroups(
            ListDashboardGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDashboardGroupsRequest, ListDashboardGroupsResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDashboardGroupResponse> updateDashboardGroup(
            UpdateDashboardGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDashboardGroupRequest, UpdateDashboardGroupResponse>
                    handler) {

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
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DashboardGroupAsyncClient(
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
    public DashboardGroupAsyncClient(
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
    public DashboardGroupAsyncClient(
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
    public DashboardGroupAsyncClient(
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
    public DashboardGroupAsyncClient(
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
    public DashboardGroupAsyncClient(
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
    public DashboardGroupAsyncClient(
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
