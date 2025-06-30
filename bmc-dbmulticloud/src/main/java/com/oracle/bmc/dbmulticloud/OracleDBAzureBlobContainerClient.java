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
public class OracleDBAzureBlobContainerClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements OracleDBAzureBlobContainer {
    /** Service instance for OracleDBAzureBlobContainer. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ORACLEDBAZUREBLOBCONTAINER")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://dbmulticloud.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OracleDBAzureBlobContainerClient.class);

    private final OracleDBAzureBlobContainerWaiters waiters;

    private final OracleDBAzureBlobContainerPaginators paginators;

    OracleDBAzureBlobContainerClient(
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
                                    .nameFormat("OracleDBAzureBlobContainer-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new OracleDBAzureBlobContainerWaiters(executorService, this);

        this.paginators = new OracleDBAzureBlobContainerPaginators(this);
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
                    Builder, OracleDBAzureBlobContainerClient> {
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
        public OracleDBAzureBlobContainerClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OracleDBAzureBlobContainerClient(
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
    public ChangeOracleDbAzureBlobContainerCompartmentResponse
            changeOracleDbAzureBlobContainerCompartment(
                    ChangeOracleDbAzureBlobContainerCompartmentRequest request) {

        Validate.notBlank(
                request.getOracleDbAzureBlobContainerId(),
                "oracleDbAzureBlobContainerId must not be blank");
        Objects.requireNonNull(
                request.getChangeOracleDbAzureBlobContainerCompartmentDetails(),
                "changeOracleDbAzureBlobContainerCompartmentDetails is required");

        return clientCall(request, ChangeOracleDbAzureBlobContainerCompartmentResponse::builder)
                .logger(LOG, "changeOracleDbAzureBlobContainerCompartment")
                .serviceDetails(
                        "OracleDBAzureBlobContainer",
                        "ChangeOracleDbAzureBlobContainerCompartment",
                        "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOracleDbAzureBlobContainerCompartmentRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureBlobContainer")
                .appendPathParam(request.getOracleDbAzureBlobContainerId())
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
                        ChangeOracleDbAzureBlobContainerCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOracleDbAzureBlobContainerCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateOracleDbAzureBlobContainerResponse createOracleDbAzureBlobContainer(
            CreateOracleDbAzureBlobContainerRequest request) {
        Objects.requireNonNull(
                request.getCreateOracleDbAzureBlobContainerDetails(),
                "createOracleDbAzureBlobContainerDetails is required");

        return clientCall(request, CreateOracleDbAzureBlobContainerResponse::builder)
                .logger(LOG, "createOracleDbAzureBlobContainer")
                .serviceDetails(
                        "OracleDBAzureBlobContainer", "CreateOracleDbAzureBlobContainer", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOracleDbAzureBlobContainerRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureBlobContainer")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAzureBlobContainer.class,
                        CreateOracleDbAzureBlobContainerResponse.Builder
                                ::oracleDbAzureBlobContainer)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOracleDbAzureBlobContainerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateOracleDbAzureBlobContainerResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateOracleDbAzureBlobContainerResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateOracleDbAzureBlobContainerResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreateOracleDbAzureBlobContainerResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteOracleDbAzureBlobContainerResponse deleteOracleDbAzureBlobContainer(
            DeleteOracleDbAzureBlobContainerRequest request) {

        Validate.notBlank(
                request.getOracleDbAzureBlobContainerId(),
                "oracleDbAzureBlobContainerId must not be blank");

        return clientCall(request, DeleteOracleDbAzureBlobContainerResponse::builder)
                .logger(LOG, "deleteOracleDbAzureBlobContainer")
                .serviceDetails(
                        "OracleDBAzureBlobContainer", "DeleteOracleDbAzureBlobContainer", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOracleDbAzureBlobContainerRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureBlobContainer")
                .appendPathParam(request.getOracleDbAzureBlobContainerId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteOracleDbAzureBlobContainerResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOracleDbAzureBlobContainerResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public GetOracleDbAzureBlobContainerResponse getOracleDbAzureBlobContainer(
            GetOracleDbAzureBlobContainerRequest request) {

        Validate.notBlank(
                request.getOracleDbAzureBlobContainerId(),
                "oracleDbAzureBlobContainerId must not be blank");

        return clientCall(request, GetOracleDbAzureBlobContainerResponse::builder)
                .logger(LOG, "getOracleDbAzureBlobContainer")
                .serviceDetails("OracleDBAzureBlobContainer", "GetOracleDbAzureBlobContainer", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOracleDbAzureBlobContainerRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureBlobContainer")
                .appendPathParam(request.getOracleDbAzureBlobContainerId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAzureBlobContainer.class,
                        GetOracleDbAzureBlobContainerResponse.Builder::oracleDbAzureBlobContainer)
                .handleResponseHeaderString(
                        "etag", GetOracleDbAzureBlobContainerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetOracleDbAzureBlobContainerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListOracleDbAzureBlobContainersResponse listOracleDbAzureBlobContainers(
            ListOracleDbAzureBlobContainersRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOracleDbAzureBlobContainersResponse::builder)
                .logger(LOG, "listOracleDbAzureBlobContainers")
                .serviceDetails("OracleDBAzureBlobContainer", "ListOracleDbAzureBlobContainers", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOracleDbAzureBlobContainersRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureBlobContainer")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam(
                        "oracleDbAzureBlobContainerId", request.getOracleDbAzureBlobContainerId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("azureStorageAccountName", request.getAzureStorageAccountName())
                .appendQueryParam(
                        "azureStorageContainerName", request.getAzureStorageContainerName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model
                                .OracleDbAzureBlobContainerSummaryCollection.class,
                        ListOracleDbAzureBlobContainersResponse.Builder
                                ::oracleDbAzureBlobContainerSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOracleDbAzureBlobContainersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListOracleDbAzureBlobContainersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateOracleDbAzureBlobContainerResponse updateOracleDbAzureBlobContainer(
            UpdateOracleDbAzureBlobContainerRequest request) {

        Validate.notBlank(
                request.getOracleDbAzureBlobContainerId(),
                "oracleDbAzureBlobContainerId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOracleDbAzureBlobContainerDetails(),
                "updateOracleDbAzureBlobContainerDetails is required");

        return clientCall(request, UpdateOracleDbAzureBlobContainerResponse::builder)
                .logger(LOG, "updateOracleDbAzureBlobContainer")
                .serviceDetails(
                        "OracleDBAzureBlobContainer", "UpdateOracleDbAzureBlobContainer", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOracleDbAzureBlobContainerRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureBlobContainer")
                .appendPathParam(request.getOracleDbAzureBlobContainerId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOracleDbAzureBlobContainerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateOracleDbAzureBlobContainerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public OracleDBAzureBlobContainerWaiters getWaiters() {
        return waiters;
    }

    @Override
    public OracleDBAzureBlobContainerPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OracleDBAzureBlobContainerClient(
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
    public OracleDBAzureBlobContainerClient(
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
    public OracleDBAzureBlobContainerClient(
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
    public OracleDBAzureBlobContainerClient(
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
    public OracleDBAzureBlobContainerClient(
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
    public OracleDBAzureBlobContainerClient(
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
    public OracleDBAzureBlobContainerClient(
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
    public OracleDBAzureBlobContainerClient(
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
