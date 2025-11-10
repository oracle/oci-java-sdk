/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.fleetappsmanagement.requests.*;
import com.oracle.bmc.fleetappsmanagement.responses.*;

import java.util.Objects;

/**
 * Async client implementation for FleetAppsManagementCatalog service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public class FleetAppsManagementCatalogAsyncClient
        extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements FleetAppsManagementCatalogAsync {
    /** Service instance for FleetAppsManagementCatalog. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("FLEETAPPSMANAGEMENTCATALOG")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://fams.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(FleetAppsManagementCatalogAsyncClient.class);

    FleetAppsManagementCatalogAsyncClient(
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
                    Builder, FleetAppsManagementCatalogAsyncClient> {
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
        public FleetAppsManagementCatalogAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new FleetAppsManagementCatalogAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeCatalogItemCompartmentResponse>
            changeCatalogItemCompartment(
                    ChangeCatalogItemCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCatalogItemCompartmentRequest,
                                    ChangeCatalogItemCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getCatalogItemId(), "catalogItemId must not be blank");
        Objects.requireNonNull(
                request.getChangeCatalogItemCompartmentDetails(),
                "changeCatalogItemCompartmentDetails is required");

        return clientCall(request, ChangeCatalogItemCompartmentResponse::builder)
                .logger(LOG, "changeCatalogItemCompartment")
                .serviceDetails(
                        "FleetAppsManagementCatalog",
                        "ChangeCatalogItemCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/CatalogItem/ChangeCatalogItemCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeCatalogItemCompartmentRequest::builder)
                .basePath("/20250228")
                .appendPathParam("catalogItems")
                .appendPathParam(request.getCatalogItemId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeCatalogItemCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeCatalogItemCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CloneCatalogItemResponse> cloneCatalogItem(
            CloneCatalogItemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CloneCatalogItemRequest, CloneCatalogItemResponse>
                    handler) {

        Validate.notBlank(request.getCatalogItemId(), "catalogItemId must not be blank");
        Objects.requireNonNull(
                request.getCloneCatalogItemDetails(), "cloneCatalogItemDetails is required");

        return clientCall(request, CloneCatalogItemResponse::builder)
                .logger(LOG, "cloneCatalogItem")
                .serviceDetails(
                        "FleetAppsManagementCatalog",
                        "CloneCatalogItem",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/CatalogItem/CloneCatalogItem")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CloneCatalogItemRequest::builder)
                .basePath("/20250228")
                .appendPathParam("catalogItems")
                .appendPathParam(request.getCatalogItemId())
                .appendPathParam("actions")
                .appendPathParam("cloneCatalogItem")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.CatalogItem.class,
                        CloneCatalogItemResponse.Builder::catalogItem)
                .handleResponseHeaderString("location", CloneCatalogItemResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CloneCatalogItemResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CloneCatalogItemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CloneCatalogItemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CloneCatalogItemResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ConfigureCatalogItemResponse> configureCatalogItem(
            ConfigureCatalogItemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ConfigureCatalogItemRequest, ConfigureCatalogItemResponse>
                    handler) {

        Validate.notBlank(request.getCatalogItemId(), "catalogItemId must not be blank");
        Objects.requireNonNull(
                request.getConfigureCatalogItemDetails(),
                "configureCatalogItemDetails is required");

        return clientCall(request, ConfigureCatalogItemResponse::builder)
                .logger(LOG, "configureCatalogItem")
                .serviceDetails(
                        "FleetAppsManagementCatalog",
                        "ConfigureCatalogItem",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/CatalogItem/ConfigureCatalogItem")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConfigureCatalogItemRequest::builder)
                .basePath("/20250228")
                .appendPathParam("catalogItems")
                .appendPathParam(request.getCatalogItemId())
                .appendPathParam("actions")
                .appendPathParam("configure")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.CatalogItem.class,
                        ConfigureCatalogItemResponse.Builder::catalogItem)
                .handleResponseHeaderString(
                        "location", ConfigureCatalogItemResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", ConfigureCatalogItemResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", ConfigureCatalogItemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ConfigureCatalogItemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ConfigureCatalogItemResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateCatalogItemResponse> createCatalogItem(
            CreateCatalogItemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCatalogItemRequest, CreateCatalogItemResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateCatalogItemDetails(), "createCatalogItemDetails is required");

        return clientCall(request, CreateCatalogItemResponse::builder)
                .logger(LOG, "createCatalogItem")
                .serviceDetails(
                        "FleetAppsManagementCatalog",
                        "CreateCatalogItem",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/CatalogItem/CreateCatalogItem")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCatalogItemRequest::builder)
                .basePath("/20250228")
                .appendPathParam("catalogItems")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.CatalogItem.class,
                        CreateCatalogItemResponse.Builder::catalogItem)
                .handleResponseHeaderString("location", CreateCatalogItemResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateCatalogItemResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateCatalogItemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateCatalogItemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCatalogItemResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteCatalogItemResponse> deleteCatalogItem(
            DeleteCatalogItemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCatalogItemRequest, DeleteCatalogItemResponse>
                    handler) {

        Validate.notBlank(request.getCatalogItemId(), "catalogItemId must not be blank");

        return clientCall(request, DeleteCatalogItemResponse::builder)
                .logger(LOG, "deleteCatalogItem")
                .serviceDetails(
                        "FleetAppsManagementCatalog",
                        "DeleteCatalogItem",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/CatalogItem/DeleteCatalogItem")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCatalogItemRequest::builder)
                .basePath("/20250228")
                .appendPathParam("catalogItems")
                .appendPathParam(request.getCatalogItemId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteCatalogItemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCatalogItemResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCatalogItemResponse> getCatalogItem(
            GetCatalogItemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCatalogItemRequest, GetCatalogItemResponse>
                    handler) {

        Validate.notBlank(request.getCatalogItemId(), "catalogItemId must not be blank");

        return clientCall(request, GetCatalogItemResponse::builder)
                .logger(LOG, "getCatalogItem")
                .serviceDetails(
                        "FleetAppsManagementCatalog",
                        "GetCatalogItem",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/CatalogItem/GetCatalogItem")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCatalogItemRequest::builder)
                .basePath("/20250228")
                .appendPathParam("catalogItems")
                .appendPathParam(request.getCatalogItemId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.CatalogItem.class,
                        GetCatalogItemResponse.Builder::catalogItem)
                .handleResponseHeaderString("etag", GetCatalogItemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCatalogItemResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCatalogItemVariablesDefinitionResponse>
            getCatalogItemVariablesDefinition(
                    GetCatalogItemVariablesDefinitionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetCatalogItemVariablesDefinitionRequest,
                                    GetCatalogItemVariablesDefinitionResponse>
                            handler) {

        Validate.notBlank(request.getCatalogItemId(), "catalogItemId must not be blank");

        return clientCall(request, GetCatalogItemVariablesDefinitionResponse::builder)
                .logger(LOG, "getCatalogItemVariablesDefinition")
                .serviceDetails(
                        "FleetAppsManagementCatalog",
                        "GetCatalogItemVariablesDefinition",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/CatalogItemVariablesDefinition/GetCatalogItemVariablesDefinition")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCatalogItemVariablesDefinitionRequest::builder)
                .basePath("/20250228")
                .appendPathParam("catalogItems")
                .appendPathParam(request.getCatalogItemId())
                .appendPathParam("variablesDefinitions")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.CatalogItemVariablesDefinition
                                .class,
                        GetCatalogItemVariablesDefinitionResponse.Builder
                                ::catalogItemVariablesDefinition)
                .handleResponseHeaderString(
                        "etag", GetCatalogItemVariablesDefinitionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetCatalogItemVariablesDefinitionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCatalogItemsResponse> listCatalogItems(
            ListCatalogItemsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCatalogItemsRequest, ListCatalogItemsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCatalogItemsResponse::builder)
                .logger(LOG, "listCatalogItems")
                .serviceDetails(
                        "FleetAppsManagementCatalog",
                        "ListCatalogItems",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/CatalogItemCollection/ListCatalogItems")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCatalogItemsRequest::builder)
                .basePath("/20250228")
                .appendPathParam("catalogItems")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("configSourceType", request.getConfigSourceType())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("catalogListingId", request.getCatalogListingId())
                .appendEnumQueryParam(
                        "catalogListingVersionCriteria", request.getCatalogListingVersionCriteria())
                .appendEnumQueryParam("packageType", request.getPackageType())
                .appendQueryParam("shouldListPublicItems", request.getShouldListPublicItems())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.CatalogItemCollection.class,
                        ListCatalogItemsResponse.Builder::catalogItemCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCatalogItemsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCatalogItemsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCatalogItemResponse> updateCatalogItem(
            UpdateCatalogItemRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCatalogItemRequest, UpdateCatalogItemResponse>
                    handler) {

        Validate.notBlank(request.getCatalogItemId(), "catalogItemId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCatalogItemDetails(), "updateCatalogItemDetails is required");

        return clientCall(request, UpdateCatalogItemResponse::builder)
                .logger(LOG, "updateCatalogItem")
                .serviceDetails(
                        "FleetAppsManagementCatalog",
                        "UpdateCatalogItem",
                        "https://docs.oracle.com/iaas/api/#/en/fleet-management/20250228/CatalogItem/UpdateCatalogItem")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCatalogItemRequest::builder)
                .basePath("/20250228")
                .appendPathParam("catalogItems")
                .appendPathParam(request.getCatalogItemId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateCatalogItemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCatalogItemResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public FleetAppsManagementCatalogAsyncClient(
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
    public FleetAppsManagementCatalogAsyncClient(
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
    public FleetAppsManagementCatalogAsyncClient(
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
    public FleetAppsManagementCatalogAsyncClient(
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
    public FleetAppsManagementCatalogAsyncClient(
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
    public FleetAppsManagementCatalogAsyncClient(
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
    public FleetAppsManagementCatalogAsyncClient(
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
