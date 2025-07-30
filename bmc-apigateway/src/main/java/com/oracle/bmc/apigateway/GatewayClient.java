/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.apigateway.requests.*;
import com.oracle.bmc.apigateway.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
public class GatewayClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Gateway {
    /** Service instance for Gateway. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("GATEWAY")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://apigateway.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GatewayClient.class);

    private final GatewayWaiters waiters;

    private final GatewayPaginators paginators;

    GatewayClient(
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
                                    .nameFormat("Gateway-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new GatewayWaiters(executorService, this);

        this.paginators = new GatewayPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, GatewayClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "apigateway";
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
        public GatewayClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new GatewayClient(this, authenticationDetailsProvider, executorService);
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
    public AddGatewayLockResponse addGatewayLock(AddGatewayLockRequest request) {

        Validate.notBlank(request.getGatewayId(), "gatewayId must not be blank");
        Objects.requireNonNull(
                request.getAddResourceLockDetails(), "addResourceLockDetails is required");

        return clientCall(request, AddGatewayLockResponse::builder)
                .logger(LOG, "addGatewayLock")
                .serviceDetails(
                        "Gateway",
                        "AddGatewayLock",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Gateway/AddGatewayLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddGatewayLockRequest::builder)
                .basePath("/20190501")
                .appendPathParam("gateways")
                .appendPathParam(request.getGatewayId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apigateway.model.Gateway.class,
                        AddGatewayLockResponse.Builder::gateway)
                .handleResponseHeaderString(
                        "opc-request-id", AddGatewayLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", AddGatewayLockResponse.Builder::etag)
                .callSync();
    }

    @Override
    public ChangeGatewayCompartmentResponse changeGatewayCompartment(
            ChangeGatewayCompartmentRequest request) {

        Validate.notBlank(request.getGatewayId(), "gatewayId must not be blank");
        Objects.requireNonNull(
                request.getChangeGatewayCompartmentDetails(),
                "changeGatewayCompartmentDetails is required");

        return clientCall(request, ChangeGatewayCompartmentResponse::builder)
                .logger(LOG, "changeGatewayCompartment")
                .serviceDetails(
                        "Gateway",
                        "ChangeGatewayCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Gateway/ChangeGatewayCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeGatewayCompartmentRequest::builder)
                .basePath("/20190501")
                .appendPathParam("gateways")
                .appendPathParam(request.getGatewayId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeGatewayCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeGatewayCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateGatewayResponse createGateway(CreateGatewayRequest request) {
        Objects.requireNonNull(
                request.getCreateGatewayDetails(), "createGatewayDetails is required");

        return clientCall(request, CreateGatewayResponse::builder)
                .logger(LOG, "createGateway")
                .serviceDetails("Gateway", "CreateGateway", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateGatewayRequest::builder)
                .basePath("/20190501")
                .appendPathParam("gateways")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apigateway.model.Gateway.class,
                        CreateGatewayResponse.Builder::gateway)
                .handleResponseHeaderString("etag", CreateGatewayResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateGatewayResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateGatewayResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", CreateGatewayResponse.Builder::location)
                .callSync();
    }

    @Override
    public DeleteGatewayResponse deleteGateway(DeleteGatewayRequest request) {

        Validate.notBlank(request.getGatewayId(), "gatewayId must not be blank");

        return clientCall(request, DeleteGatewayResponse::builder)
                .logger(LOG, "deleteGateway")
                .serviceDetails(
                        "Gateway",
                        "DeleteGateway",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Gateway/DeleteGateway")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteGatewayRequest::builder)
                .basePath("/20190501")
                .appendPathParam("gateways")
                .appendPathParam(request.getGatewayId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteGatewayResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteGatewayResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetGatewayResponse getGateway(GetGatewayRequest request) {

        Validate.notBlank(request.getGatewayId(), "gatewayId must not be blank");

        return clientCall(request, GetGatewayResponse::builder)
                .logger(LOG, "getGateway")
                .serviceDetails(
                        "Gateway",
                        "GetGateway",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Gateway/GetGateway")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGatewayRequest::builder)
                .basePath("/20190501")
                .appendPathParam("gateways")
                .appendPathParam(request.getGatewayId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.apigateway.model.Gateway.class,
                        GetGatewayResponse.Builder::gateway)
                .handleResponseHeaderString("etag", GetGatewayResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetGatewayResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListGatewaysResponse listGateways(ListGatewaysRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListGatewaysResponse::builder)
                .logger(LOG, "listGateways")
                .serviceDetails(
                        "Gateway",
                        "ListGateways",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/GatewaySummary/ListGateways")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGatewaysRequest::builder)
                .basePath("/20190501")
                .appendPathParam("gateways")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("certificateId", request.getCertificateId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.apigateway.model.GatewayCollection.class,
                        ListGatewaysResponse.Builder::gatewayCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListGatewaysResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListGatewaysResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListGatewaysResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public RemoveGatewayLockResponse removeGatewayLock(RemoveGatewayLockRequest request) {

        Validate.notBlank(request.getGatewayId(), "gatewayId must not be blank");
        Objects.requireNonNull(
                request.getRemoveResourceLockDetails(), "removeResourceLockDetails is required");

        return clientCall(request, RemoveGatewayLockResponse::builder)
                .logger(LOG, "removeGatewayLock")
                .serviceDetails(
                        "Gateway",
                        "RemoveGatewayLock",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Gateway/RemoveGatewayLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveGatewayLockRequest::builder)
                .basePath("/20190501")
                .appendPathParam("gateways")
                .appendPathParam(request.getGatewayId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apigateway.model.Gateway.class,
                        RemoveGatewayLockResponse.Builder::gateway)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveGatewayLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", RemoveGatewayLockResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateGatewayResponse updateGateway(UpdateGatewayRequest request) {

        Validate.notBlank(request.getGatewayId(), "gatewayId must not be blank");
        Objects.requireNonNull(
                request.getUpdateGatewayDetails(), "updateGatewayDetails is required");

        return clientCall(request, UpdateGatewayResponse::builder)
                .logger(LOG, "updateGateway")
                .serviceDetails(
                        "Gateway",
                        "UpdateGateway",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Gateway/UpdateGateway")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateGatewayRequest::builder)
                .basePath("/20190501")
                .appendPathParam("gateways")
                .appendPathParam(request.getGatewayId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateGatewayResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateGatewayResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GatewayWaiters getWaiters() {
        return waiters;
    }

    @Override
    public GatewayPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public GatewayClient(
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
    public GatewayClient(
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
    public GatewayClient(
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
    public GatewayClient(
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
    public GatewayClient(
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
    public GatewayClient(
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
    public GatewayClient(
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
    public GatewayClient(
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
