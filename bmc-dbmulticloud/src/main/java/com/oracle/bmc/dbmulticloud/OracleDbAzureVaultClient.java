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
public class OracleDbAzureVaultClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements OracleDbAzureVault {
    /** Service instance for OracleDbAzureVault. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ORACLEDBAZUREVAULT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://dbmulticloud.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OracleDbAzureVaultClient.class);

    private final OracleDbAzureVaultWaiters waiters;

    private final OracleDbAzureVaultPaginators paginators;

    OracleDbAzureVaultClient(
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
                                    .nameFormat("OracleDbAzureVault-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new OracleDbAzureVaultWaiters(executorService, this);

        this.paginators = new OracleDbAzureVaultPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OracleDbAzureVaultClient> {
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
        public OracleDbAzureVaultClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OracleDbAzureVaultClient(
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
    public ChangeOracleDbAzureVaultCompartmentResponse changeOracleDbAzureVaultCompartment(
            ChangeOracleDbAzureVaultCompartmentRequest request) {

        Validate.notBlank(
                request.getOracleDbAzureVaultId(), "oracleDbAzureVaultId must not be blank");
        Objects.requireNonNull(
                request.getChangeOracleDbAzureVaultCompartmentDetails(),
                "changeOracleDbAzureVaultCompartmentDetails is required");

        return clientCall(request, ChangeOracleDbAzureVaultCompartmentResponse::builder)
                .logger(LOG, "changeOracleDbAzureVaultCompartment")
                .serviceDetails("OracleDbAzureVault", "ChangeOracleDbAzureVaultCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOracleDbAzureVaultCompartmentRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureVault")
                .appendPathParam(request.getOracleDbAzureVaultId())
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
                        ChangeOracleDbAzureVaultCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOracleDbAzureVaultCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateOracleDbAzureVaultResponse createOracleDbAzureVault(
            CreateOracleDbAzureVaultRequest request) {
        Objects.requireNonNull(
                request.getCreateOracleDbAzureVaultDetails(),
                "createOracleDbAzureVaultDetails is required");

        return clientCall(request, CreateOracleDbAzureVaultResponse::builder)
                .logger(LOG, "createOracleDbAzureVault")
                .serviceDetails("OracleDbAzureVault", "CreateOracleDbAzureVault", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOracleDbAzureVaultRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureVault")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAzureVault.class,
                        CreateOracleDbAzureVaultResponse.Builder::oracleDbAzureVault)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOracleDbAzureVaultResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOracleDbAzureVaultResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateOracleDbAzureVaultResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateOracleDbAzureVaultResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateOracleDbAzureVaultResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteOracleDbAzureVaultResponse deleteOracleDbAzureVault(
            DeleteOracleDbAzureVaultRequest request) {

        Validate.notBlank(
                request.getOracleDbAzureVaultId(), "oracleDbAzureVaultId must not be blank");

        return clientCall(request, DeleteOracleDbAzureVaultResponse::builder)
                .logger(LOG, "deleteOracleDbAzureVault")
                .serviceDetails("OracleDbAzureVault", "DeleteOracleDbAzureVault", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOracleDbAzureVaultRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureVault")
                .appendPathParam(request.getOracleDbAzureVaultId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOracleDbAzureVaultResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOracleDbAzureVaultResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public GetOracleDbAzureVaultResponse getOracleDbAzureVault(
            GetOracleDbAzureVaultRequest request) {

        Validate.notBlank(
                request.getOracleDbAzureVaultId(), "oracleDbAzureVaultId must not be blank");

        return clientCall(request, GetOracleDbAzureVaultResponse::builder)
                .logger(LOG, "getOracleDbAzureVault")
                .serviceDetails("OracleDbAzureVault", "GetOracleDbAzureVault", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOracleDbAzureVaultRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureVault")
                .appendPathParam(request.getOracleDbAzureVaultId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAzureVault.class,
                        GetOracleDbAzureVaultResponse.Builder::oracleDbAzureVault)
                .handleResponseHeaderString("etag", GetOracleDbAzureVaultResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOracleDbAzureVaultResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListOracleDbAzureVaultsResponse listOracleDbAzureVaults(
            ListOracleDbAzureVaultsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOracleDbAzureVaultsResponse::builder)
                .logger(LOG, "listOracleDbAzureVaults")
                .serviceDetails("OracleDbAzureVault", "ListOracleDbAzureVaults", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOracleDbAzureVaultsRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureVault")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("oracleDbAzureVaultId", request.getOracleDbAzureVaultId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam(
                        "oracleDbAzureResourceGroup", request.getOracleDbAzureResourceGroup())
                .appendQueryParam("oracleDbAzureConnectorId", request.getOracleDbAzureConnectorId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAzureVaultSummaryCollection.class,
                        ListOracleDbAzureVaultsResponse.Builder
                                ::oracleDbAzureVaultSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOracleDbAzureVaultsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOracleDbAzureVaultsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RefreshOracleDbAzureVaultResponse refreshOracleDbAzureVault(
            RefreshOracleDbAzureVaultRequest request) {

        Validate.notBlank(
                request.getOracleDbAzureVaultId(), "oracleDbAzureVaultId must not be blank");

        return clientCall(request, RefreshOracleDbAzureVaultResponse::builder)
                .logger(LOG, "refreshOracleDbAzureVault")
                .serviceDetails("OracleDbAzureVault", "RefreshOracleDbAzureVault", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshOracleDbAzureVaultRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureVault")
                .appendPathParam(request.getOracleDbAzureVaultId())
                .appendPathParam("actions")
                .appendPathParam("refresh")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", RefreshOracleDbAzureVaultResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RefreshOracleDbAzureVaultResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateOracleDbAzureVaultResponse updateOracleDbAzureVault(
            UpdateOracleDbAzureVaultRequest request) {

        Validate.notBlank(
                request.getOracleDbAzureVaultId(), "oracleDbAzureVaultId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOracleDbAzureVaultDetails(),
                "updateOracleDbAzureVaultDetails is required");

        return clientCall(request, UpdateOracleDbAzureVaultResponse::builder)
                .logger(LOG, "updateOracleDbAzureVault")
                .serviceDetails("OracleDbAzureVault", "UpdateOracleDbAzureVault", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOracleDbAzureVaultRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureVault")
                .appendPathParam(request.getOracleDbAzureVaultId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOracleDbAzureVaultResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOracleDbAzureVaultResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public OracleDbAzureVaultWaiters getWaiters() {
        return waiters;
    }

    @Override
    public OracleDbAzureVaultPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OracleDbAzureVaultClient(
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
    public OracleDbAzureVaultClient(
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
    public OracleDbAzureVaultClient(
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
    public OracleDbAzureVaultClient(
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
    public OracleDbAzureVaultClient(
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
    public OracleDbAzureVaultClient(
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
    public OracleDbAzureVaultClient(
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
    public OracleDbAzureVaultClient(
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
