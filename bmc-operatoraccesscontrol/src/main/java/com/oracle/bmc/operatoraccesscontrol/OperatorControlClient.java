/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.operatoraccesscontrol.requests.*;
import com.oracle.bmc.operatoraccesscontrol.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class OperatorControlClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements OperatorControl {
    /** Service instance for OperatorControl. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("OPERATORCONTROL")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://operator-access-control.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OperatorControlClient.class);

    private final OperatorControlWaiters waiters;

    private final OperatorControlPaginators paginators;

    OperatorControlClient(
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
                                    .nameFormat("OperatorControl-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new OperatorControlWaiters(executorService, this);

        this.paginators = new OperatorControlPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OperatorControlClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
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
        public OperatorControlClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OperatorControlClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeOperatorControlCompartmentResponse changeOperatorControlCompartment(
            ChangeOperatorControlCompartmentRequest request) {

        Validate.notBlank(request.getOperatorControlId(), "operatorControlId must not be blank");
        Objects.requireNonNull(
                request.getChangeOperatorControlCompartmentDetails(),
                "changeOperatorControlCompartmentDetails is required");

        return clientCall(request, ChangeOperatorControlCompartmentResponse::builder)
                .logger(LOG, "changeOperatorControlCompartment")
                .serviceDetails(
                        "OperatorControl",
                        "ChangeOperatorControlCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/operatoraccesscontrol/20200630/OperatorControl/ChangeOperatorControlCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOperatorControlCompartmentRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControls")
                .appendPathParam(request.getOperatorControlId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOperatorControlCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateOperatorControlResponse createOperatorControl(
            CreateOperatorControlRequest request) {
        Objects.requireNonNull(
                request.getCreateOperatorControlDetails(),
                "createOperatorControlDetails is required");

        return clientCall(request, CreateOperatorControlResponse::builder)
                .logger(LOG, "createOperatorControl")
                .serviceDetails(
                        "OperatorControl",
                        "CreateOperatorControl",
                        "https://docs.oracle.com/iaas/api/#/en/operatoraccesscontrol/20200630/OperatorControl/CreateOperatorControl")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOperatorControlRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControls")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.operatoraccesscontrol.model.OperatorControl.class,
                        CreateOperatorControlResponse.Builder::operatorControl)
                .handleResponseHeaderString("etag", CreateOperatorControlResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOperatorControlResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteOperatorControlResponse deleteOperatorControl(
            DeleteOperatorControlRequest request) {

        Validate.notBlank(request.getOperatorControlId(), "operatorControlId must not be blank");

        return clientCall(request, DeleteOperatorControlResponse::builder)
                .logger(LOG, "deleteOperatorControl")
                .serviceDetails(
                        "OperatorControl",
                        "DeleteOperatorControl",
                        "https://docs.oracle.com/iaas/api/#/en/operatoraccesscontrol/20200630/OperatorControl/DeleteOperatorControl")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOperatorControlRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControls")
                .appendPathParam(request.getOperatorControlId())
                .appendQueryParam("description", request.getDescription())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOperatorControlResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOperatorControlResponse getOperatorControl(GetOperatorControlRequest request) {

        Validate.notBlank(request.getOperatorControlId(), "operatorControlId must not be blank");

        return clientCall(request, GetOperatorControlResponse::builder)
                .logger(LOG, "getOperatorControl")
                .serviceDetails(
                        "OperatorControl",
                        "GetOperatorControl",
                        "https://docs.oracle.com/iaas/api/#/en/operatoraccesscontrol/20200630/OperatorControl/GetOperatorControl")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOperatorControlRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControls")
                .appendPathParam(request.getOperatorControlId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.operatoraccesscontrol.model.OperatorControl.class,
                        GetOperatorControlResponse.Builder::operatorControl)
                .handleResponseHeaderString("etag", GetOperatorControlResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOperatorControlResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListOperatorControlsResponse listOperatorControls(ListOperatorControlsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOperatorControlsResponse::builder)
                .logger(LOG, "listOperatorControls")
                .serviceDetails(
                        "OperatorControl",
                        "ListOperatorControls",
                        "https://docs.oracle.com/iaas/api/#/en/operatoraccesscontrol/20200630/OperatorControl/ListOperatorControls")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOperatorControlsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControls")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.operatoraccesscontrol.model.OperatorControlCollection.class,
                        ListOperatorControlsResponse.Builder::operatorControlCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOperatorControlsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOperatorControlsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateOperatorControlResponse updateOperatorControl(
            UpdateOperatorControlRequest request) {

        Validate.notBlank(request.getOperatorControlId(), "operatorControlId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOperatorControlDetails(),
                "updateOperatorControlDetails is required");

        return clientCall(request, UpdateOperatorControlResponse::builder)
                .logger(LOG, "updateOperatorControl")
                .serviceDetails(
                        "OperatorControl",
                        "UpdateOperatorControl",
                        "https://docs.oracle.com/iaas/api/#/en/operatoraccesscontrol/20200630/OperatorControl/UpdateOperatorControl")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOperatorControlRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControls")
                .appendPathParam(request.getOperatorControlId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.operatoraccesscontrol.model.OperatorControl.class,
                        UpdateOperatorControlResponse.Builder::operatorControl)
                .handleResponseHeaderString("etag", UpdateOperatorControlResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOperatorControlResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public OperatorControlWaiters getWaiters() {
        return waiters;
    }

    @Override
    public OperatorControlPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OperatorControlClient(
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
    public OperatorControlClient(
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
    public OperatorControlClient(
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
    public OperatorControlClient(
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
    public OperatorControlClient(
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
    public OperatorControlClient(
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
    public OperatorControlClient(
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
    public OperatorControlClient(
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
