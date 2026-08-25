/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.mysql.requests.*;
import com.oracle.bmc.mysql.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public class BlueGreenDeploymentsClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements BlueGreenDeployments {
    /** Service instance for BlueGreenDeployments. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(BlueGreenDeploymentsClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://mysql.{region}.ocp.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(BlueGreenDeploymentsClient.class);

    private final BlueGreenDeploymentsWaiters waiters;

    private final BlueGreenDeploymentsPaginators paginators;

    BlueGreenDeploymentsClient(
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
                                    .nameFormat("BlueGreenDeployments-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new BlueGreenDeploymentsWaiters(executorService, this);

        this.paginators = new BlueGreenDeploymentsPaginators(this);
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
                    Builder, BlueGreenDeploymentsClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "mysql";
            com.oracle.bmc.internal.DeveloperToolConfiguration
                    .throwDisabledServiceExceptionIfAppropriate(packageName);
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
        public BlueGreenDeploymentsClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new BlueGreenDeploymentsClient(
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
    public ChangeBlueGreenDeploymentCompartmentResponse changeBlueGreenDeploymentCompartment(
            ChangeBlueGreenDeploymentCompartmentRequest request) {

        Validate.notBlank(
                request.getBlueGreenDeploymentId(), "blueGreenDeploymentId must not be blank");
        Objects.requireNonNull(
                request.getChangeBlueGreenDeploymentCompartmentDetails(),
                "changeBlueGreenDeploymentCompartmentDetails is required");

        return clientCall(request, ChangeBlueGreenDeploymentCompartmentResponse::builder)
                .logger(LOG, "changeBlueGreenDeploymentCompartment")
                .serviceDetails(
                        "BlueGreenDeployments",
                        "ChangeBlueGreenDeploymentCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/BlueGreenDeployment/ChangeBlueGreenDeploymentCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeBlueGreenDeploymentCompartmentRequest::builder)
                .basePath("/20190415")
                .appendPathParam("blueGreenDeployments")
                .appendPathParam(request.getBlueGreenDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeBlueGreenDeploymentCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeBlueGreenDeploymentCompartmentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateBlueGreenDeploymentResponse createBlueGreenDeployment(
            CreateBlueGreenDeploymentRequest request) {
        Objects.requireNonNull(
                request.getCreateBlueGreenDeploymentDetails(),
                "createBlueGreenDeploymentDetails is required");

        return clientCall(request, CreateBlueGreenDeploymentResponse::builder)
                .logger(LOG, "createBlueGreenDeployment")
                .serviceDetails("BlueGreenDeployments", "CreateBlueGreenDeployment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBlueGreenDeploymentRequest::builder)
                .basePath("/20190415")
                .appendPathParam("blueGreenDeployments")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mysql.model.BlueGreenDeployment.class,
                        CreateBlueGreenDeploymentResponse.Builder::blueGreenDeployment)
                .handleResponseHeaderString("etag", CreateBlueGreenDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBlueGreenDeploymentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateBlueGreenDeploymentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteBlueGreenDeploymentResponse deleteBlueGreenDeployment(
            DeleteBlueGreenDeploymentRequest request) {

        Validate.notBlank(
                request.getBlueGreenDeploymentId(), "blueGreenDeploymentId must not be blank");

        return clientCall(request, DeleteBlueGreenDeploymentResponse::builder)
                .logger(LOG, "deleteBlueGreenDeployment")
                .serviceDetails(
                        "BlueGreenDeployments",
                        "DeleteBlueGreenDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/BlueGreenDeployment/DeleteBlueGreenDeployment")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBlueGreenDeploymentRequest::builder)
                .basePath("/20190415")
                .appendPathParam("blueGreenDeployments")
                .appendPathParam(request.getBlueGreenDeploymentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBlueGreenDeploymentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteBlueGreenDeploymentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public GetBlueGreenDeploymentResponse getBlueGreenDeployment(
            GetBlueGreenDeploymentRequest request) {

        Validate.notBlank(
                request.getBlueGreenDeploymentId(), "blueGreenDeploymentId must not be blank");

        return clientCall(request, GetBlueGreenDeploymentResponse::builder)
                .logger(LOG, "getBlueGreenDeployment")
                .serviceDetails(
                        "BlueGreenDeployments",
                        "GetBlueGreenDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/BlueGreenDeployment/GetBlueGreenDeployment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBlueGreenDeploymentRequest::builder)
                .basePath("/20190415")
                .appendPathParam("blueGreenDeployments")
                .appendPathParam(request.getBlueGreenDeploymentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-none-match", request.getIfNoneMatch())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.mysql.model.BlueGreenDeployment.class,
                        GetBlueGreenDeploymentResponse.Builder::blueGreenDeployment)
                .handleResponseHeaderString("etag", GetBlueGreenDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBlueGreenDeploymentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListBlueGreenDeploymentsResponse listBlueGreenDeployments(
            ListBlueGreenDeploymentsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListBlueGreenDeploymentsResponse::builder)
                .logger(LOG, "listBlueGreenDeployments")
                .serviceDetails(
                        "BlueGreenDeployments",
                        "ListBlueGreenDeployments",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/BlueGreenDeploymentCollection/ListBlueGreenDeployments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBlueGreenDeploymentsRequest::builder)
                .basePath("/20190415")
                .appendPathParam("blueGreenDeployments")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("sourceDbSystemId", request.getSourceDbSystemId())
                .appendQueryParam("targetDbSystemId", request.getTargetDbSystemId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.mysql.model.BlueGreenDeploymentCollection.class,
                        ListBlueGreenDeploymentsResponse.Builder::blueGreenDeploymentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBlueGreenDeploymentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBlueGreenDeploymentsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public SwitchoverBlueGreenDeploymentResponse switchoverBlueGreenDeployment(
            SwitchoverBlueGreenDeploymentRequest request) {

        Validate.notBlank(
                request.getBlueGreenDeploymentId(), "blueGreenDeploymentId must not be blank");
        Objects.requireNonNull(
                request.getSwitchoverBlueGreenDeploymentDetails(),
                "switchoverBlueGreenDeploymentDetails is required");

        return clientCall(request, SwitchoverBlueGreenDeploymentResponse::builder)
                .logger(LOG, "switchoverBlueGreenDeployment")
                .serviceDetails(
                        "BlueGreenDeployments",
                        "SwitchoverBlueGreenDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/BlueGreenDeployment/SwitchoverBlueGreenDeployment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SwitchoverBlueGreenDeploymentRequest::builder)
                .basePath("/20190415")
                .appendPathParam("blueGreenDeployments")
                .appendPathParam(request.getBlueGreenDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("switchover")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.mysql.model.BlueGreenDeployment.class,
                        SwitchoverBlueGreenDeploymentResponse.Builder::blueGreenDeployment)
                .handleResponseHeaderString(
                        "etag", SwitchoverBlueGreenDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SwitchoverBlueGreenDeploymentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        SwitchoverBlueGreenDeploymentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateBlueGreenDeploymentResponse updateBlueGreenDeployment(
            UpdateBlueGreenDeploymentRequest request) {

        Validate.notBlank(
                request.getBlueGreenDeploymentId(), "blueGreenDeploymentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateBlueGreenDeploymentDetails(),
                "updateBlueGreenDeploymentDetails is required");

        return clientCall(request, UpdateBlueGreenDeploymentResponse::builder)
                .logger(LOG, "updateBlueGreenDeployment")
                .serviceDetails(
                        "BlueGreenDeployments",
                        "UpdateBlueGreenDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/mysql/20190415/BlueGreenDeployment/UpdateBlueGreenDeployment")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBlueGreenDeploymentRequest::builder)
                .basePath("/20190415")
                .appendPathParam("blueGreenDeployments")
                .appendPathParam(request.getBlueGreenDeploymentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBlueGreenDeploymentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateBlueGreenDeploymentResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public BlueGreenDeploymentsWaiters getWaiters() {
        return waiters;
    }

    @Override
    public BlueGreenDeploymentsPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public BlueGreenDeploymentsClient(
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
    public BlueGreenDeploymentsClient(
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
    public BlueGreenDeploymentsClient(
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
    public BlueGreenDeploymentsClient(
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
    public BlueGreenDeploymentsClient(
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
    public BlueGreenDeploymentsClient(
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
    public BlueGreenDeploymentsClient(
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
    public BlueGreenDeploymentsClient(
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
