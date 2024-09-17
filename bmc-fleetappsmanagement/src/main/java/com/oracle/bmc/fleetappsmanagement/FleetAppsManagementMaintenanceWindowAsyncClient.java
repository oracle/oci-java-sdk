/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.fleetappsmanagement.requests.*;
import com.oracle.bmc.fleetappsmanagement.responses.*;

import java.util.Objects;

/**
 * Async client implementation for FleetAppsManagementMaintenanceWindow service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
public class FleetAppsManagementMaintenanceWindowAsyncClient
        extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements FleetAppsManagementMaintenanceWindowAsync {
    /** Service instance for FleetAppsManagementMaintenanceWindow. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("FLEETAPPSMANAGEMENTMAINTENANCEWINDOW")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://fams.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(
                    FleetAppsManagementMaintenanceWindowAsyncClient.class);

    FleetAppsManagementMaintenanceWindowAsyncClient(
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
                    Builder, FleetAppsManagementMaintenanceWindowAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "fleetappsmanagement";
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
        public FleetAppsManagementMaintenanceWindowAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new FleetAppsManagementMaintenanceWindowAsyncClient(
                    this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateMaintenanceWindowResponse> createMaintenanceWindow(
            CreateMaintenanceWindowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateMaintenanceWindowRequest, CreateMaintenanceWindowResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateMaintenanceWindowDetails(),
                "createMaintenanceWindowDetails is required");

        return clientCall(request, CreateMaintenanceWindowResponse::builder)
                .logger(LOG, "createMaintenanceWindow")
                .serviceDetails(
                        "FleetAppsManagementMaintenanceWindow",
                        "CreateMaintenanceWindow",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/MaintenanceWindow/CreateMaintenanceWindow")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMaintenanceWindowRequest::builder)
                .basePath("/20230831")
                .appendPathParam("maintenanceWindows")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.MaintenanceWindow.class,
                        CreateMaintenanceWindowResponse.Builder::maintenanceWindow)
                .handleResponseHeaderString("etag", CreateMaintenanceWindowResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMaintenanceWindowResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMaintenanceWindowResponse> deleteMaintenanceWindow(
            DeleteMaintenanceWindowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteMaintenanceWindowRequest, DeleteMaintenanceWindowResponse>
                    handler) {

        Validate.notBlank(
                request.getMaintenanceWindowId(), "maintenanceWindowId must not be blank");

        return clientCall(request, DeleteMaintenanceWindowResponse::builder)
                .logger(LOG, "deleteMaintenanceWindow")
                .serviceDetails(
                        "FleetAppsManagementMaintenanceWindow",
                        "DeleteMaintenanceWindow",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/MaintenanceWindow/DeleteMaintenanceWindow")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMaintenanceWindowRequest::builder)
                .basePath("/20230831")
                .appendPathParam("maintenanceWindows")
                .appendPathParam(request.getMaintenanceWindowId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteMaintenanceWindowResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMaintenanceWindowResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMaintenanceWindowResponse> getMaintenanceWindow(
            GetMaintenanceWindowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMaintenanceWindowRequest, GetMaintenanceWindowResponse>
                    handler) {

        Validate.notBlank(
                request.getMaintenanceWindowId(), "maintenanceWindowId must not be blank");

        return clientCall(request, GetMaintenanceWindowResponse::builder)
                .logger(LOG, "getMaintenanceWindow")
                .serviceDetails(
                        "FleetAppsManagementMaintenanceWindow",
                        "GetMaintenanceWindow",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/MaintenanceWindow/GetMaintenanceWindow")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMaintenanceWindowRequest::builder)
                .basePath("/20230831")
                .appendPathParam("maintenanceWindows")
                .appendPathParam(request.getMaintenanceWindowId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.MaintenanceWindow.class,
                        GetMaintenanceWindowResponse.Builder::maintenanceWindow)
                .handleResponseHeaderString("etag", GetMaintenanceWindowResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMaintenanceWindowResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMaintenanceWindowsResponse> listMaintenanceWindows(
            ListMaintenanceWindowsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMaintenanceWindowsRequest, ListMaintenanceWindowsResponse>
                    handler) {

        return clientCall(request, ListMaintenanceWindowsResponse::builder)
                .logger(LOG, "listMaintenanceWindows")
                .serviceDetails(
                        "FleetAppsManagementMaintenanceWindow",
                        "ListMaintenanceWindows",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/MaintenanceWindowCollection/ListMaintenanceWindows")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMaintenanceWindowsRequest::builder)
                .basePath("/20230831")
                .appendPathParam("maintenanceWindows")
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
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.MaintenanceWindowCollection.class,
                        ListMaintenanceWindowsResponse.Builder::maintenanceWindowCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMaintenanceWindowsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMaintenanceWindowsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListMaintenanceWindowsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateMaintenanceWindowResponse> updateMaintenanceWindow(
            UpdateMaintenanceWindowRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResponse>
                    handler) {

        Validate.notBlank(
                request.getMaintenanceWindowId(), "maintenanceWindowId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMaintenanceWindowDetails(),
                "updateMaintenanceWindowDetails is required");

        return clientCall(request, UpdateMaintenanceWindowResponse::builder)
                .logger(LOG, "updateMaintenanceWindow")
                .serviceDetails(
                        "FleetAppsManagementMaintenanceWindow",
                        "UpdateMaintenanceWindow",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20230831/MaintenanceWindow/UpdateMaintenanceWindow")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMaintenanceWindowRequest::builder)
                .basePath("/20230831")
                .appendPathParam("maintenanceWindows")
                .appendPathParam(request.getMaintenanceWindowId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateMaintenanceWindowResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMaintenanceWindowResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public FleetAppsManagementMaintenanceWindowAsyncClient(
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
    public FleetAppsManagementMaintenanceWindowAsyncClient(
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
    public FleetAppsManagementMaintenanceWindowAsyncClient(
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
    public FleetAppsManagementMaintenanceWindowAsyncClient(
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
    public FleetAppsManagementMaintenanceWindowAsyncClient(
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
    public FleetAppsManagementMaintenanceWindowAsyncClient(
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
    public FleetAppsManagementMaintenanceWindowAsyncClient(
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
