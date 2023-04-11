/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computeinstanceagent;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.computeinstanceagent.requests.*;
import com.oracle.bmc.computeinstanceagent.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180530")
public class ComputeInstanceAgentClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements ComputeInstanceAgent {
    /** Service instance for ComputeInstanceAgent. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("COMPUTEINSTANCEAGENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://iaas.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ComputeInstanceAgentClient.class);

    private final ComputeInstanceAgentWaiters waiters;

    private final ComputeInstanceAgentPaginators paginators;

    ComputeInstanceAgentClient(
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
                                    .nameFormat("ComputeInstanceAgent-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new ComputeInstanceAgentWaiters(executorService, this);

        this.paginators = new ComputeInstanceAgentPaginators(this);
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
                    Builder, ComputeInstanceAgentClient> {
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
        public ComputeInstanceAgentClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ComputeInstanceAgentClient(
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
    public CancelInstanceAgentCommandResponse cancelInstanceAgentCommand(
            CancelInstanceAgentCommandRequest request) {

        Validate.notBlank(
                request.getInstanceAgentCommandId(), "instanceAgentCommandId must not be blank");

        return clientCall(request, CancelInstanceAgentCommandResponse::builder)
                .logger(LOG, "cancelInstanceAgentCommand")
                .serviceDetails(
                        "ComputeInstanceAgent",
                        "CancelInstanceAgentCommand",
                        "https://docs.oracle.com/iaas/api/#/en/instanceagent/20180530/InstanceAgentCommand/CancelInstanceAgentCommand")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelInstanceAgentCommandRequest::builder)
                .basePath("/20180530")
                .appendPathParam("instanceAgentCommands")
                .appendPathParam(request.getInstanceAgentCommandId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", CancelInstanceAgentCommandResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateInstanceAgentCommandResponse createInstanceAgentCommand(
            CreateInstanceAgentCommandRequest request) {
        Objects.requireNonNull(
                request.getCreateInstanceAgentCommandDetails(),
                "createInstanceAgentCommandDetails is required");

        return clientCall(request, CreateInstanceAgentCommandResponse::builder)
                .logger(LOG, "createInstanceAgentCommand")
                .serviceDetails(
                        "ComputeInstanceAgent",
                        "CreateInstanceAgentCommand",
                        "https://docs.oracle.com/iaas/api/#/en/instanceagent/20180530/InstanceAgentCommand/CreateInstanceAgentCommand")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateInstanceAgentCommandRequest::builder)
                .basePath("/20180530")
                .appendPathParam("instanceAgentCommands")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.computeinstanceagent.model.InstanceAgentCommand.class,
                        CreateInstanceAgentCommandResponse.Builder::instanceAgentCommand)
                .handleResponseHeaderString(
                        "etag", CreateInstanceAgentCommandResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateInstanceAgentCommandResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetInstanceAgentCommandResponse getInstanceAgentCommand(
            GetInstanceAgentCommandRequest request) {

        Validate.notBlank(
                request.getInstanceAgentCommandId(), "instanceAgentCommandId must not be blank");

        return clientCall(request, GetInstanceAgentCommandResponse::builder)
                .logger(LOG, "getInstanceAgentCommand")
                .serviceDetails(
                        "ComputeInstanceAgent",
                        "GetInstanceAgentCommand",
                        "https://docs.oracle.com/iaas/api/#/en/instanceagent/20180530/InstanceAgentCommand/GetInstanceAgentCommand")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetInstanceAgentCommandRequest::builder)
                .basePath("/20180530")
                .appendPathParam("instanceAgentCommands")
                .appendPathParam(request.getInstanceAgentCommandId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.computeinstanceagent.model.InstanceAgentCommand.class,
                        GetInstanceAgentCommandResponse.Builder::instanceAgentCommand)
                .handleResponseHeaderString("etag", GetInstanceAgentCommandResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetInstanceAgentCommandResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetInstanceAgentCommandExecutionResponse getInstanceAgentCommandExecution(
            GetInstanceAgentCommandExecutionRequest request) {

        Validate.notBlank(
                request.getInstanceAgentCommandId(), "instanceAgentCommandId must not be blank");
        Objects.requireNonNull(request.getInstanceId(), "instanceId is required");

        return clientCall(request, GetInstanceAgentCommandExecutionResponse::builder)
                .logger(LOG, "getInstanceAgentCommandExecution")
                .serviceDetails(
                        "ComputeInstanceAgent",
                        "GetInstanceAgentCommandExecution",
                        "https://docs.oracle.com/iaas/api/#/en/instanceagent/20180530/InstanceAgentCommandExecution/GetInstanceAgentCommandExecution")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetInstanceAgentCommandExecutionRequest::builder)
                .basePath("/20180530")
                .appendPathParam("instanceAgentCommands")
                .appendPathParam(request.getInstanceAgentCommandId())
                .appendPathParam("status")
                .appendQueryParam("instanceId", request.getInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.computeinstanceagent.model.InstanceAgentCommandExecution
                                .class,
                        GetInstanceAgentCommandExecutionResponse.Builder
                                ::instanceAgentCommandExecution)
                .handleResponseHeaderString(
                        "etag", GetInstanceAgentCommandExecutionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetInstanceAgentCommandExecutionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListInstanceAgentCommandExecutionsResponse listInstanceAgentCommandExecutions(
            ListInstanceAgentCommandExecutionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getInstanceId(), "instanceId is required");

        return clientCall(request, ListInstanceAgentCommandExecutionsResponse::builder)
                .logger(LOG, "listInstanceAgentCommandExecutions")
                .serviceDetails(
                        "ComputeInstanceAgent",
                        "ListInstanceAgentCommandExecutions",
                        "https://docs.oracle.com/iaas/api/#/en/instanceagent/20180530/InstanceAgentCommandExecutionSummary/ListInstanceAgentCommandExecutions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInstanceAgentCommandExecutionsRequest::builder)
                .basePath("/20180530")
                .appendPathParam("instanceAgentCommandExecutions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("instanceId", request.getInstanceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.computeinstanceagent.model
                                .InstanceAgentCommandExecutionSummary.class,
                        ListInstanceAgentCommandExecutionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListInstanceAgentCommandExecutionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListInstanceAgentCommandExecutionsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListInstanceAgentCommandsResponse listInstanceAgentCommands(
            ListInstanceAgentCommandsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListInstanceAgentCommandsResponse::builder)
                .logger(LOG, "listInstanceAgentCommands")
                .serviceDetails(
                        "ComputeInstanceAgent",
                        "ListInstanceAgentCommands",
                        "https://docs.oracle.com/iaas/api/#/en/instanceagent/20180530/InstanceAgentCommandSummary/ListInstanceAgentCommands")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInstanceAgentCommandsRequest::builder)
                .basePath("/20180530")
                .appendPathParam("instanceAgentCommands")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.computeinstanceagent.model.InstanceAgentCommandSummary.class,
                        ListInstanceAgentCommandsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListInstanceAgentCommandsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListInstanceAgentCommandsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ComputeInstanceAgentWaiters getWaiters() {
        return waiters;
    }

    @Override
    public ComputeInstanceAgentPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ComputeInstanceAgentClient(
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
    public ComputeInstanceAgentClient(
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
    public ComputeInstanceAgentClient(
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
    public ComputeInstanceAgentClient(
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
    public ComputeInstanceAgentClient(
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
    public ComputeInstanceAgentClient(
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
    public ComputeInstanceAgentClient(
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
    public ComputeInstanceAgentClient(
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
