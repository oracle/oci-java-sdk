/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
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
public class OracleDbAzureVaultAssociationClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements OracleDbAzureVaultAssociation {
    /** Service instance for OracleDbAzureVaultAssociation. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(OracleDbAzureVaultAssociationClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://dbmulticloud.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OracleDbAzureVaultAssociationClient.class);

    private final OracleDbAzureVaultAssociationWaiters waiters;

    private final OracleDbAzureVaultAssociationPaginators paginators;

    OracleDbAzureVaultAssociationClient(
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
                                    .nameFormat("OracleDbAzureVaultAssociation-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new OracleDbAzureVaultAssociationWaiters(executorService, this);

        this.paginators = new OracleDbAzureVaultAssociationPaginators(this);
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
                    Builder, OracleDbAzureVaultAssociationClient> {
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
        public OracleDbAzureVaultAssociationClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OracleDbAzureVaultAssociationClient(
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
    public CascadingDeleteOracleDbAzureVaultAssociationResponse
            cascadingDeleteOracleDbAzureVaultAssociation(
                    CascadingDeleteOracleDbAzureVaultAssociationRequest request) {

        Validate.notBlank(
                request.getOracleDbAzureVaultAssociationId(),
                "oracleDbAzureVaultAssociationId must not be blank");

        return clientCall(request, CascadingDeleteOracleDbAzureVaultAssociationResponse::builder)
                .logger(LOG, "cascadingDeleteOracleDbAzureVaultAssociation")
                .serviceDetails(
                        "OracleDbAzureVaultAssociation",
                        "CascadingDeleteOracleDbAzureVaultAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureVaultAssociation/CascadingDeleteOracleDbAzureVaultAssociation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CascadingDeleteOracleDbAzureVaultAssociationRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureVaultAssociation")
                .appendPathParam(request.getOracleDbAzureVaultAssociationId())
                .appendPathParam("actions")
                .appendPathParam("cascadingDelete")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        CascadingDeleteOracleDbAzureVaultAssociationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CascadingDeleteOracleDbAzureVaultAssociationResponse.Builder
                                ::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ChangeOracleDbAzureVaultAssociationCompartmentResponse
            changeOracleDbAzureVaultAssociationCompartment(
                    ChangeOracleDbAzureVaultAssociationCompartmentRequest request) {

        Validate.notBlank(
                request.getOracleDbAzureVaultAssociationId(),
                "oracleDbAzureVaultAssociationId must not be blank");
        Objects.requireNonNull(
                request.getChangeOracleDbAzureVaultAssociationCompartmentDetails(),
                "changeOracleDbAzureVaultAssociationCompartmentDetails is required");

        return clientCall(request, ChangeOracleDbAzureVaultAssociationCompartmentResponse::builder)
                .logger(LOG, "changeOracleDbAzureVaultAssociationCompartment")
                .serviceDetails(
                        "OracleDbAzureVaultAssociation",
                        "ChangeOracleDbAzureVaultAssociationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureVaultAssociation/ChangeOracleDbAzureVaultAssociationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOracleDbAzureVaultAssociationCompartmentRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureVaultAssociation")
                .appendPathParam(request.getOracleDbAzureVaultAssociationId())
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
                        ChangeOracleDbAzureVaultAssociationCompartmentResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOracleDbAzureVaultAssociationCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateOracleDbAzureVaultAssociationResponse createOracleDbAzureVaultAssociation(
            CreateOracleDbAzureVaultAssociationRequest request) {
        Objects.requireNonNull(
                request.getCreateOracleDbAzureVaultAssociationDetails(),
                "createOracleDbAzureVaultAssociationDetails is required");

        return clientCall(request, CreateOracleDbAzureVaultAssociationResponse::builder)
                .logger(LOG, "createOracleDbAzureVaultAssociation")
                .serviceDetails(
                        "OracleDbAzureVaultAssociation",
                        "CreateOracleDbAzureVaultAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureVaultAssociation/CreateOracleDbAzureVaultAssociation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOracleDbAzureVaultAssociationRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureVaultAssociation")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAzureVaultAssociation.class,
                        CreateOracleDbAzureVaultAssociationResponse.Builder
                                ::oracleDbAzureVaultAssociation)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOracleDbAzureVaultAssociationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateOracleDbAzureVaultAssociationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateOracleDbAzureVaultAssociationResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateOracleDbAzureVaultAssociationResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreateOracleDbAzureVaultAssociationResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteOracleDbAzureVaultAssociationResponse deleteOracleDbAzureVaultAssociation(
            DeleteOracleDbAzureVaultAssociationRequest request) {

        Validate.notBlank(
                request.getOracleDbAzureVaultAssociationId(),
                "oracleDbAzureVaultAssociationId must not be blank");

        return clientCall(request, DeleteOracleDbAzureVaultAssociationResponse::builder)
                .logger(LOG, "deleteOracleDbAzureVaultAssociation")
                .serviceDetails(
                        "OracleDbAzureVaultAssociation",
                        "DeleteOracleDbAzureVaultAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureVaultAssociation/DeleteOracleDbAzureVaultAssociation")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOracleDbAzureVaultAssociationRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureVaultAssociation")
                .appendPathParam(request.getOracleDbAzureVaultAssociationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteOracleDbAzureVaultAssociationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOracleDbAzureVaultAssociationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public GetOracleDbAzureVaultAssociationResponse getOracleDbAzureVaultAssociation(
            GetOracleDbAzureVaultAssociationRequest request) {

        Validate.notBlank(
                request.getOracleDbAzureVaultAssociationId(),
                "oracleDbAzureVaultAssociationId must not be blank");

        return clientCall(request, GetOracleDbAzureVaultAssociationResponse::builder)
                .logger(LOG, "getOracleDbAzureVaultAssociation")
                .serviceDetails(
                        "OracleDbAzureVaultAssociation",
                        "GetOracleDbAzureVaultAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureVaultAssociation/GetOracleDbAzureVaultAssociation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOracleDbAzureVaultAssociationRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureVaultAssociation")
                .appendPathParam(request.getOracleDbAzureVaultAssociationId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.OracleDbAzureVaultAssociation.class,
                        GetOracleDbAzureVaultAssociationResponse.Builder
                                ::oracleDbAzureVaultAssociation)
                .handleResponseHeaderString(
                        "etag", GetOracleDbAzureVaultAssociationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetOracleDbAzureVaultAssociationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListOracleDbAzureVaultAssociationsResponse listOracleDbAzureVaultAssociations(
            ListOracleDbAzureVaultAssociationsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOracleDbAzureVaultAssociationsResponse::builder)
                .logger(LOG, "listOracleDbAzureVaultAssociations")
                .serviceDetails(
                        "OracleDbAzureVaultAssociation",
                        "ListOracleDbAzureVaultAssociations",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureVaultAssociation/ListOracleDbAzureVaultAssociations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOracleDbAzureVaultAssociationsRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureVaultAssociation")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("oracleDbAzureVaultId", request.getOracleDbAzureVaultId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam(
                        "oracleDbAzureVaultAssociationId",
                        request.getOracleDbAzureVaultAssociationId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("oracleDbAzureConnectorId", request.getOracleDbAzureConnectorId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model
                                .OracleDbAzureVaultAssociationSummaryCollection.class,
                        ListOracleDbAzureVaultAssociationsResponse.Builder
                                ::oracleDbAzureVaultAssociationSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOracleDbAzureVaultAssociationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListOracleDbAzureVaultAssociationsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateOracleDbAzureVaultAssociationResponse updateOracleDbAzureVaultAssociation(
            UpdateOracleDbAzureVaultAssociationRequest request) {

        Validate.notBlank(
                request.getOracleDbAzureVaultAssociationId(),
                "oracleDbAzureVaultAssociationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOracleDbAzureVaultAssociationDetails(),
                "updateOracleDbAzureVaultAssociationDetails is required");

        return clientCall(request, UpdateOracleDbAzureVaultAssociationResponse::builder)
                .logger(LOG, "updateOracleDbAzureVaultAssociation")
                .serviceDetails(
                        "OracleDbAzureVaultAssociation",
                        "UpdateOracleDbAzureVaultAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/OracleDbAzureVaultAssociation/UpdateOracleDbAzureVaultAssociation")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOracleDbAzureVaultAssociationRequest::builder)
                .basePath("/20240501")
                .appendPathParam("oracleDbAzureVaultAssociation")
                .appendPathParam(request.getOracleDbAzureVaultAssociationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOracleDbAzureVaultAssociationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateOracleDbAzureVaultAssociationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public OracleDbAzureVaultAssociationWaiters getWaiters() {
        return waiters;
    }

    @Override
    public OracleDbAzureVaultAssociationPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OracleDbAzureVaultAssociationClient(
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
    public OracleDbAzureVaultAssociationClient(
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
    public OracleDbAzureVaultAssociationClient(
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
    public OracleDbAzureVaultAssociationClient(
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
    public OracleDbAzureVaultAssociationClient(
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
    public OracleDbAzureVaultAssociationClient(
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
    public OracleDbAzureVaultAssociationClient(
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
    public OracleDbAzureVaultAssociationClient(
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
