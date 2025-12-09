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
public class OracleDBAzureConnectorClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements OracleDBAzureConnector {
    /** Service instance for OracleDBAzureConnector. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(OracleDBAzureConnectorClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://dbmulticloud.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OracleDBAzureConnectorClient.class);

    private final OracleDBAzureConnectorWaiters waiters;

    private final OracleDBAzureConnectorPaginators paginators;

    OracleDBAzureConnectorClient(
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
                                    .nameFormat("OracleDBAzureConnector-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new OracleDBAzureConnectorWaiters(executorService, this);

        this.paginators = new OracleDBAzureConnectorPaginators(this);
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
                    Builder, OracleDBAzureConnectorClient> {
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
        public OracleDBAzureConnectorClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OracleDBAzureConnectorClient(
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
    public ChangeOracleDbAzureConnectorCompartmentResponse changeOracleDbAzureConnectorCompartment(
            ChangeOracleDbAzureConnectorCompartmentRequest request) {

        Validate.notBlank(
                request.getOracleDbAzureConnectorId(),
                "oracleDbAzureConnectorId must not be blank");
        Objects.requireNonNull(
                request.getChangeOracleDbAzureConnectorCompartmentDetails(),
                "changeOracleDbAzureConnectorCompartmentDetails is required");

        return clientCall(request, ChangeOracleDbAzureConnectorCompartmentResponse::builder)
                .logger(LOG, "changeOracleDbAzureConnectorCompartment")
                .serviceDetails(
                        "OracleDBAzureConnector",
                        "ChangeOracleDbAzureConnectorCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureConnector/ChangeOracleDbAzureConnectorCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOracleDbAzureConnectorCompartmentRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureConnector")
                .appendPathParam(request.getOracleDbAzureConnectorId())
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
                        ChangeOracleDbAzureConnectorCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOracleDbAzureConnectorCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateOracleDbAzureConnectorResponse createOracleDbAzureConnector(
            CreateOracleDbAzureConnectorRequest request) {
        Objects.requireNonNull(
                request.getCreateOracleDbAzureConnectorDetails(),
                "createOracleDbAzureConnectorDetails is required");

        return clientCall(request, CreateOracleDbAzureConnectorResponse::builder)
                .logger(LOG, "createOracleDbAzureConnector")
                .serviceDetails(
                        "OracleDBAzureConnector",
                        "CreateOracleDbAzureConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureConnector/CreateOracleDbAzureConnector")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOracleDbAzureConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureConnector")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAzureConnector.class,
                        CreateOracleDbAzureConnectorResponse.Builder::oracleDbAzureConnector)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOracleDbAzureConnectorResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateOracleDbAzureConnectorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateOracleDbAzureConnectorResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateOracleDbAzureConnectorResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreateOracleDbAzureConnectorResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteOracleDbAzureConnectorResponse deleteOracleDbAzureConnector(
            DeleteOracleDbAzureConnectorRequest request) {

        Validate.notBlank(
                request.getOracleDbAzureConnectorId(),
                "oracleDbAzureConnectorId must not be blank");

        return clientCall(request, DeleteOracleDbAzureConnectorResponse::builder)
                .logger(LOG, "deleteOracleDbAzureConnector")
                .serviceDetails(
                        "OracleDBAzureConnector",
                        "DeleteOracleDbAzureConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureConnector/DeleteOracleDbAzureConnector")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOracleDbAzureConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureConnector")
                .appendPathParam(request.getOracleDbAzureConnectorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteOracleDbAzureConnectorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOracleDbAzureConnectorResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public GetOracleDbAzureConnectorResponse getOracleDbAzureConnector(
            GetOracleDbAzureConnectorRequest request) {

        Validate.notBlank(
                request.getOracleDbAzureConnectorId(),
                "oracleDbAzureConnectorId must not be blank");

        return clientCall(request, GetOracleDbAzureConnectorResponse::builder)
                .logger(LOG, "getOracleDbAzureConnector")
                .serviceDetails(
                        "OracleDBAzureConnector",
                        "GetOracleDbAzureConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureConnector/GetOracleDbAzureConnector")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOracleDbAzureConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureConnector")
                .appendPathParam(request.getOracleDbAzureConnectorId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAzureConnector.class,
                        GetOracleDbAzureConnectorResponse.Builder::oracleDbAzureConnector)
                .handleResponseHeaderString("etag", GetOracleDbAzureConnectorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOracleDbAzureConnectorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListOracleDbAzureConnectorsResponse listOracleDbAzureConnectors(
            ListOracleDbAzureConnectorsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOracleDbAzureConnectorsResponse::builder)
                .logger(LOG, "listOracleDbAzureConnectors")
                .serviceDetails(
                        "OracleDBAzureConnector",
                        "ListOracleDbAzureConnectors",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureConnector/ListOracleDbAzureConnectors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOracleDbAzureConnectorsRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureConnector")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("oracleDbAzureConnectorId", request.getOracleDbAzureConnectorId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("dbClusterResourceId", request.getDbClusterResourceId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAzureConnectorSummaryCollection
                                .class,
                        ListOracleDbAzureConnectorsResponse.Builder
                                ::oracleDbAzureConnectorSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOracleDbAzureConnectorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOracleDbAzureConnectorsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public PatchOracleDbAzureConnectorResponse patchOracleDbAzureConnector(
            PatchOracleDbAzureConnectorRequest request) {

        Validate.notBlank(
                request.getOracleDbAzureConnectorId(),
                "oracleDbAzureConnectorId must not be blank");
        Objects.requireNonNull(
                request.getPatchOracleDbAzureConnectorDetails(),
                "patchOracleDbAzureConnectorDetails is required");

        return clientCall(request, PatchOracleDbAzureConnectorResponse::builder)
                .logger(LOG, "patchOracleDbAzureConnector")
                .serviceDetails(
                        "OracleDBAzureConnector",
                        "PatchOracleDbAzureConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureConnector/PatchOracleDbAzureConnector")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchOracleDbAzureConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureConnector")
                .appendPathParam(request.getOracleDbAzureConnectorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", PatchOracleDbAzureConnectorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        PatchOracleDbAzureConnectorResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public RefreshOracleDbAzureConnectorResponse refreshOracleDbAzureConnector(
            RefreshOracleDbAzureConnectorRequest request) {

        Validate.notBlank(
                request.getOracleDbAzureConnectorId(),
                "oracleDbAzureConnectorId must not be blank");

        return clientCall(request, RefreshOracleDbAzureConnectorResponse::builder)
                .logger(LOG, "refreshOracleDbAzureConnector")
                .serviceDetails(
                        "OracleDBAzureConnector",
                        "RefreshOracleDbAzureConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureConnector/RefreshOracleDbAzureConnector")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshOracleDbAzureConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureConnector")
                .appendPathParam(request.getOracleDbAzureConnectorId())
                .appendPathParam("actions")
                .appendPathParam("refresh")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        RefreshOracleDbAzureConnectorResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RefreshOracleDbAzureConnectorResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateOracleDbAzureConnectorResponse updateOracleDbAzureConnector(
            UpdateOracleDbAzureConnectorRequest request) {

        Validate.notBlank(
                request.getOracleDbAzureConnectorId(),
                "oracleDbAzureConnectorId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOracleDbAzureConnectorDetails(),
                "updateOracleDbAzureConnectorDetails is required");

        return clientCall(request, UpdateOracleDbAzureConnectorResponse::builder)
                .logger(LOG, "updateOracleDbAzureConnector")
                .serviceDetails(
                        "OracleDBAzureConnector",
                        "UpdateOracleDbAzureConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureConnector/UpdateOracleDbAzureConnector")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOracleDbAzureConnectorRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureConnector")
                .appendPathParam(request.getOracleDbAzureConnectorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOracleDbAzureConnectorResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateOracleDbAzureConnectorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public OracleDBAzureConnectorWaiters getWaiters() {
        return waiters;
    }

    @Override
    public OracleDBAzureConnectorPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OracleDBAzureConnectorClient(
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
    public OracleDBAzureConnectorClient(
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
    public OracleDBAzureConnectorClient(
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
    public OracleDBAzureConnectorClient(
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
    public OracleDBAzureConnectorClient(
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
    public OracleDBAzureConnectorClient(
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
    public OracleDBAzureConnectorClient(
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
    public OracleDBAzureConnectorClient(
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
