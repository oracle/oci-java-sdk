/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.dbmulticloud.requests.*;
import com.oracle.bmc.dbmulticloud.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
public class MultiCloudResourceDiscoveryClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements MultiCloudResourceDiscovery {
    /** Service instance for MultiCloudResourceDiscovery. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("MULTICLOUDRESOURCEDISCOVERY")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://dbmulticloud.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MultiCloudResourceDiscoveryClient.class);

    private final MultiCloudResourceDiscoveryWaiters waiters;

    private final MultiCloudResourceDiscoveryPaginators paginators;

    MultiCloudResourceDiscoveryClient(
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
                                    .nameFormat("MultiCloudResourceDiscovery-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new MultiCloudResourceDiscoveryWaiters(executorService, this);

        this.paginators = new MultiCloudResourceDiscoveryPaginators(this);
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
                    Builder, MultiCloudResourceDiscoveryClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "dbmulticloud";
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
        public MultiCloudResourceDiscoveryClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new MultiCloudResourceDiscoveryClient(
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
    public ChangeMultiCloudResourceDiscoveryCompartmentResponse
            changeMultiCloudResourceDiscoveryCompartment(
                    ChangeMultiCloudResourceDiscoveryCompartmentRequest request) {

        Validate.notBlank(
                request.getMultiCloudResourceDiscoveryId(),
                "multiCloudResourceDiscoveryId must not be blank");
        Objects.requireNonNull(
                request.getChangeMultiCloudResourceDiscoveryCompartmentDetails(),
                "changeMultiCloudResourceDiscoveryCompartmentDetails is required");

        return clientCall(request, ChangeMultiCloudResourceDiscoveryCompartmentResponse::builder)
                .logger(LOG, "changeMultiCloudResourceDiscoveryCompartment")
                .serviceDetails(
                        "MultiCloudResourceDiscovery",
                        "ChangeMultiCloudResourceDiscoveryCompartment",
                        "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeMultiCloudResourceDiscoveryCompartmentRequest::builder)
                .basePath("/20240501")
                .appendPathParam("multiCloudResourceDiscovery")
                .appendPathParam(request.getMultiCloudResourceDiscoveryId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeMultiCloudResourceDiscoveryCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeMultiCloudResourceDiscoveryCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateMultiCloudResourceDiscoveryResponse createMultiCloudResourceDiscovery(
            CreateMultiCloudResourceDiscoveryRequest request) {
        Objects.requireNonNull(
                request.getCreateMultiCloudResourceDiscoveryDetails(),
                "createMultiCloudResourceDiscoveryDetails is required");

        return clientCall(request, CreateMultiCloudResourceDiscoveryResponse::builder)
                .logger(LOG, "createMultiCloudResourceDiscovery")
                .serviceDetails(
                        "MultiCloudResourceDiscovery", "CreateMultiCloudResourceDiscovery", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMultiCloudResourceDiscoveryRequest::builder)
                .basePath("/20240501")
                .appendPathParam("multiCloudResourceDiscovery")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.MultiCloudResourceDiscovery.class,
                        CreateMultiCloudResourceDiscoveryResponse.Builder
                                ::multiCloudResourceDiscovery)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateMultiCloudResourceDiscoveryResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateMultiCloudResourceDiscoveryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateMultiCloudResourceDiscoveryResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateMultiCloudResourceDiscoveryResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreateMultiCloudResourceDiscoveryResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteMultiCloudResourceDiscoveryResponse deleteMultiCloudResourceDiscovery(
            DeleteMultiCloudResourceDiscoveryRequest request) {

        Validate.notBlank(
                request.getMultiCloudResourceDiscoveryId(),
                "multiCloudResourceDiscoveryId must not be blank");

        return clientCall(request, DeleteMultiCloudResourceDiscoveryResponse::builder)
                .logger(LOG, "deleteMultiCloudResourceDiscovery")
                .serviceDetails(
                        "MultiCloudResourceDiscovery", "DeleteMultiCloudResourceDiscovery", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMultiCloudResourceDiscoveryRequest::builder)
                .basePath("/20240501")
                .appendPathParam("multiCloudResourceDiscovery")
                .appendPathParam(request.getMultiCloudResourceDiscoveryId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteMultiCloudResourceDiscoveryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteMultiCloudResourceDiscoveryResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public GetMultiCloudResourceDiscoveryResponse getMultiCloudResourceDiscovery(
            GetMultiCloudResourceDiscoveryRequest request) {

        Validate.notBlank(
                request.getMultiCloudResourceDiscoveryId(),
                "multiCloudResourceDiscoveryId must not be blank");

        return clientCall(request, GetMultiCloudResourceDiscoveryResponse::builder)
                .logger(LOG, "getMultiCloudResourceDiscovery")
                .serviceDetails("MultiCloudResourceDiscovery", "GetMultiCloudResourceDiscovery", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMultiCloudResourceDiscoveryRequest::builder)
                .basePath("/20240501")
                .appendPathParam("multiCloudResourceDiscovery")
                .appendPathParam(request.getMultiCloudResourceDiscoveryId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.MultiCloudResourceDiscovery.class,
                        GetMultiCloudResourceDiscoveryResponse.Builder::multiCloudResourceDiscovery)
                .handleResponseHeaderString(
                        "etag", GetMultiCloudResourceDiscoveryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetMultiCloudResourceDiscoveryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListMultiCloudResourceDiscoveriesResponse listMultiCloudResourceDiscoveries(
            ListMultiCloudResourceDiscoveriesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListMultiCloudResourceDiscoveriesResponse::builder)
                .logger(LOG, "listMultiCloudResourceDiscoveries")
                .serviceDetails(
                        "MultiCloudResourceDiscovery", "ListMultiCloudResourceDiscoveries", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMultiCloudResourceDiscoveriesRequest::builder)
                .basePath("/20240501")
                .appendPathParam("multiCloudResourceDiscovery")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam(
                        "multiCloudResourceDiscoveryId", request.getMultiCloudResourceDiscoveryId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("oracleDbAzureConnectorId", request.getOracleDbAzureConnectorId())
                .appendEnumQueryParam("resourceType", request.getResourceType())
                .appendListQueryParam(
                        "resourcesFilter",
                        request.getResourcesFilter(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model
                                .MultiCloudResourceDiscoverySummaryCollection.class,
                        ListMultiCloudResourceDiscoveriesResponse.Builder
                                ::multiCloudResourceDiscoverySummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListMultiCloudResourceDiscoveriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListMultiCloudResourceDiscoveriesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateMultiCloudResourceDiscoveryResponse updateMultiCloudResourceDiscovery(
            UpdateMultiCloudResourceDiscoveryRequest request) {

        Validate.notBlank(
                request.getMultiCloudResourceDiscoveryId(),
                "multiCloudResourceDiscoveryId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMultiCloudResourceDiscoveryDetails(),
                "updateMultiCloudResourceDiscoveryDetails is required");

        return clientCall(request, UpdateMultiCloudResourceDiscoveryResponse::builder)
                .logger(LOG, "updateMultiCloudResourceDiscovery")
                .serviceDetails(
                        "MultiCloudResourceDiscovery", "UpdateMultiCloudResourceDiscovery", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMultiCloudResourceDiscoveryRequest::builder)
                .basePath("/20240501")
                .appendPathParam("multiCloudResourceDiscovery")
                .appendPathParam(request.getMultiCloudResourceDiscoveryId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateMultiCloudResourceDiscoveryResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateMultiCloudResourceDiscoveryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public MultiCloudResourceDiscoveryWaiters getWaiters() {
        return waiters;
    }

    @Override
    public MultiCloudResourceDiscoveryPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MultiCloudResourceDiscoveryClient(
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
    public MultiCloudResourceDiscoveryClient(
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
    public MultiCloudResourceDiscoveryClient(
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
    public MultiCloudResourceDiscoveryClient(
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
    public MultiCloudResourceDiscoveryClient(
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
    public MultiCloudResourceDiscoveryClient(
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
    public MultiCloudResourceDiscoveryClient(
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
    public MultiCloudResourceDiscoveryClient(
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
