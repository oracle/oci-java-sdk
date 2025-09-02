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
public class OracleDBAzureBlobMountClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements OracleDBAzureBlobMount {
    /** Service instance for OracleDBAzureBlobMount. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ORACLEDBAZUREBLOBMOUNT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://dbmulticloud.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OracleDBAzureBlobMountClient.class);

    private final OracleDBAzureBlobMountWaiters waiters;

    private final OracleDBAzureBlobMountPaginators paginators;

    OracleDBAzureBlobMountClient(
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
                                    .nameFormat("OracleDBAzureBlobMount-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new OracleDBAzureBlobMountWaiters(executorService, this);

        this.paginators = new OracleDBAzureBlobMountPaginators(this);
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
                    Builder, OracleDBAzureBlobMountClient> {
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
        public OracleDBAzureBlobMountClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OracleDBAzureBlobMountClient(
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
    public ChangeOracleDbAzureBlobMountCompartmentResponse changeOracleDbAzureBlobMountCompartment(
            ChangeOracleDbAzureBlobMountCompartmentRequest request) {

        Validate.notBlank(
                request.getOracleDbAzureBlobMountId(),
                "oracleDbAzureBlobMountId must not be blank");
        Objects.requireNonNull(
                request.getChangeOracleDbAzureBlobMountCompartmentDetails(),
                "changeOracleDbAzureBlobMountCompartmentDetails is required");

        return clientCall(request, ChangeOracleDbAzureBlobMountCompartmentResponse::builder)
                .logger(LOG, "changeOracleDbAzureBlobMountCompartment")
                .serviceDetails(
                        "OracleDBAzureBlobMount", "ChangeOracleDbAzureBlobMountCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOracleDbAzureBlobMountCompartmentRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureBlobMount")
                .appendPathParam(request.getOracleDbAzureBlobMountId())
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
                        ChangeOracleDbAzureBlobMountCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOracleDbAzureBlobMountCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateOracleDbAzureBlobMountResponse createOracleDbAzureBlobMount(
            CreateOracleDbAzureBlobMountRequest request) {
        Objects.requireNonNull(
                request.getCreateOracleDbAzureBlobMountDetails(),
                "createOracleDbAzureBlobMountDetails is required");

        return clientCall(request, CreateOracleDbAzureBlobMountResponse::builder)
                .logger(LOG, "createOracleDbAzureBlobMount")
                .serviceDetails("OracleDBAzureBlobMount", "CreateOracleDbAzureBlobMount", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOracleDbAzureBlobMountRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureBlobMount")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAzureBlobMount.class,
                        CreateOracleDbAzureBlobMountResponse.Builder::oracleDbAzureBlobMount)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOracleDbAzureBlobMountResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateOracleDbAzureBlobMountResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateOracleDbAzureBlobMountResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateOracleDbAzureBlobMountResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreateOracleDbAzureBlobMountResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteOracleDbAzureBlobMountResponse deleteOracleDbAzureBlobMount(
            DeleteOracleDbAzureBlobMountRequest request) {

        Validate.notBlank(
                request.getOracleDbAzureBlobMountId(),
                "oracleDbAzureBlobMountId must not be blank");

        return clientCall(request, DeleteOracleDbAzureBlobMountResponse::builder)
                .logger(LOG, "deleteOracleDbAzureBlobMount")
                .serviceDetails("OracleDBAzureBlobMount", "DeleteOracleDbAzureBlobMount", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOracleDbAzureBlobMountRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureBlobMount")
                .appendPathParam(request.getOracleDbAzureBlobMountId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteOracleDbAzureBlobMountResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOracleDbAzureBlobMountResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public GetOracleDbAzureBlobMountResponse getOracleDbAzureBlobMount(
            GetOracleDbAzureBlobMountRequest request) {

        Validate.notBlank(
                request.getOracleDbAzureBlobMountId(),
                "oracleDbAzureBlobMountId must not be blank");

        return clientCall(request, GetOracleDbAzureBlobMountResponse::builder)
                .logger(LOG, "getOracleDbAzureBlobMount")
                .serviceDetails("OracleDBAzureBlobMount", "GetOracleDbAzureBlobMount", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOracleDbAzureBlobMountRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureBlobMount")
                .appendPathParam(request.getOracleDbAzureBlobMountId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAzureBlobMount.class,
                        GetOracleDbAzureBlobMountResponse.Builder::oracleDbAzureBlobMount)
                .handleResponseHeaderString("etag", GetOracleDbAzureBlobMountResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOracleDbAzureBlobMountResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListOracleDbAzureBlobMountsResponse listOracleDbAzureBlobMounts(
            ListOracleDbAzureBlobMountsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOracleDbAzureBlobMountsResponse::builder)
                .logger(LOG, "listOracleDbAzureBlobMounts")
                .serviceDetails("OracleDBAzureBlobMount", "ListOracleDbAzureBlobMounts", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOracleDbAzureBlobMountsRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureBlobMount")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("oracleDbAzureBlobMountId", request.getOracleDbAzureBlobMountId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam(
                        "oracleDbAzureBlobContainerId", request.getOracleDbAzureBlobContainerId())
                .appendQueryParam("oracleDbAzureConnectorId", request.getOracleDbAzureConnectorId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAzureBlobMountSummaryCollection
                                .class,
                        ListOracleDbAzureBlobMountsResponse.Builder
                                ::oracleDbAzureBlobMountSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOracleDbAzureBlobMountsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOracleDbAzureBlobMountsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateOracleDbAzureBlobMountResponse updateOracleDbAzureBlobMount(
            UpdateOracleDbAzureBlobMountRequest request) {

        Validate.notBlank(
                request.getOracleDbAzureBlobMountId(),
                "oracleDbAzureBlobMountId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOracleDbAzureBlobMountDetails(),
                "updateOracleDbAzureBlobMountDetails is required");

        return clientCall(request, UpdateOracleDbAzureBlobMountResponse::builder)
                .logger(LOG, "updateOracleDbAzureBlobMount")
                .serviceDetails("OracleDBAzureBlobMount", "UpdateOracleDbAzureBlobMount", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOracleDbAzureBlobMountRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureBlobMount")
                .appendPathParam(request.getOracleDbAzureBlobMountId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOracleDbAzureBlobMountResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateOracleDbAzureBlobMountResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public OracleDBAzureBlobMountWaiters getWaiters() {
        return waiters;
    }

    @Override
    public OracleDBAzureBlobMountPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OracleDBAzureBlobMountClient(
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
    public OracleDBAzureBlobMountClient(
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
    public OracleDBAzureBlobMountClient(
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
    public OracleDBAzureBlobMountClient(
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
    public OracleDBAzureBlobMountClient(
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
    public OracleDBAzureBlobMountClient(
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
    public OracleDBAzureBlobMountClient(
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
    public OracleDBAzureBlobMountClient(
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
