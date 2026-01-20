/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.fleetappsmanagement.requests.*;
import com.oracle.bmc.fleetappsmanagement.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public class FleetAppsManagementCatalogClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements FleetAppsManagementCatalog {
    /** Service instance for FleetAppsManagementCatalog. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(FleetAppsManagementCatalogClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://fams.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(FleetAppsManagementCatalogClient.class);

    private final FleetAppsManagementCatalogWaiters waiters;

    private final FleetAppsManagementCatalogPaginators paginators;

    FleetAppsManagementCatalogClient(
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
                                    .nameFormat("FleetAppsManagementCatalog-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new FleetAppsManagementCatalogWaiters(executorService, this);

        this.paginators = new FleetAppsManagementCatalogPaginators(this);
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
                    Builder, FleetAppsManagementCatalogClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "fleetappsmanagement";
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
        public FleetAppsManagementCatalogClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new FleetAppsManagementCatalogClient(
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
    public ChangeCatalogItemCompartmentResponse changeCatalogItemCompartment(
            ChangeCatalogItemCompartmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeCatalogItemCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeCatalogItemCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CloneCatalogItemResponse cloneCatalogItem(CloneCatalogItemRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public ConfigureCatalogItemResponse configureCatalogItem(ConfigureCatalogItemRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public CreateCatalogItemResponse createCatalogItem(CreateCatalogItemRequest request) {
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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public DeleteCatalogItemResponse deleteCatalogItem(DeleteCatalogItemRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteCatalogItemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCatalogItemResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCatalogItemResponse getCatalogItem(GetCatalogItemRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.CatalogItem.class,
                        GetCatalogItemResponse.Builder::catalogItem)
                .handleResponseHeaderString("etag", GetCatalogItemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCatalogItemResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCatalogItemVariablesDefinitionResponse getCatalogItemVariablesDefinition(
            GetCatalogItemVariablesDefinitionRequest request) {

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
                .operationUsesDefaultRetries()
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
                .callSync();
    }

    @Override
    public ListCatalogItemsResponse listCatalogItems(ListCatalogItemsRequest request) {
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.fleetappsmanagement.model.CatalogItemCollection.class,
                        ListCatalogItemsResponse.Builder::catalogItemCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCatalogItemsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCatalogItemsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateCatalogItemResponse updateCatalogItem(UpdateCatalogItemRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateCatalogItemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCatalogItemResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public FleetAppsManagementCatalogWaiters getWaiters() {
        return waiters;
    }

    @Override
    public FleetAppsManagementCatalogPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public FleetAppsManagementCatalogClient(
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
    public FleetAppsManagementCatalogClient(
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
    public FleetAppsManagementCatalogClient(
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
    public FleetAppsManagementCatalogClient(
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
    public FleetAppsManagementCatalogClient(
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
    public FleetAppsManagementCatalogClient(
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
    public FleetAppsManagementCatalogClient(
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
    public FleetAppsManagementCatalogClient(
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
