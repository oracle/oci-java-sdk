/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.accessgovernancecp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.accessgovernancecp.requests.*;
import com.oracle.bmc.accessgovernancecp.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220518")
public class AccessGovernanceCPClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements AccessGovernanceCP {
    /** Service instance for AccessGovernanceCP. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ACCESSGOVERNANCECP")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://cp-prod.access-governance.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AccessGovernanceCPClient.class);

    private final AccessGovernanceCPWaiters waiters;

    private final AccessGovernanceCPPaginators paginators;

    AccessGovernanceCPClient(
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
                                    .nameFormat("AccessGovernanceCP-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new AccessGovernanceCPWaiters(executorService, this);

        this.paginators = new AccessGovernanceCPPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, AccessGovernanceCPClient> {
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
        public AccessGovernanceCPClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new AccessGovernanceCPClient(
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
    public ChangeGovernanceInstanceCompartmentResponse changeGovernanceInstanceCompartment(
            ChangeGovernanceInstanceCompartmentRequest request) {

        Validate.notBlank(
                request.getGovernanceInstanceId(), "governanceInstanceId must not be blank");
        Objects.requireNonNull(
                request.getChangeGovernanceInstanceCompartmentDetails(),
                "changeGovernanceInstanceCompartmentDetails is required");

        return clientCall(request, ChangeGovernanceInstanceCompartmentResponse::builder)
                .logger(LOG, "changeGovernanceInstanceCompartment")
                .serviceDetails(
                        "AccessGovernanceCP",
                        "ChangeGovernanceInstanceCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/access-governance-cp/20220518/GovernanceInstance/ChangeGovernanceInstanceCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeGovernanceInstanceCompartmentRequest::builder)
                .basePath("/20220518")
                .appendPathParam("governanceInstances")
                .appendPathParam(request.getGovernanceInstanceId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeGovernanceInstanceCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateGovernanceInstanceResponse createGovernanceInstance(
            CreateGovernanceInstanceRequest request) {
        Objects.requireNonNull(
                request.getCreateGovernanceInstanceDetails(),
                "createGovernanceInstanceDetails is required");

        return clientCall(request, CreateGovernanceInstanceResponse::builder)
                .logger(LOG, "createGovernanceInstance")
                .serviceDetails(
                        "AccessGovernanceCP",
                        "CreateGovernanceInstance",
                        "https://docs.oracle.com/iaas/api/#/en/access-governance-cp/20220518/GovernanceInstance/CreateGovernanceInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateGovernanceInstanceRequest::builder)
                .basePath("/20220518")
                .appendPathParam("governanceInstances")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.accessgovernancecp.model.GovernanceInstance.class,
                        CreateGovernanceInstanceResponse.Builder::governanceInstance)
                .handleResponseHeaderString("etag", CreateGovernanceInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateGovernanceInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateGovernanceInstanceResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteGovernanceInstanceResponse deleteGovernanceInstance(
            DeleteGovernanceInstanceRequest request) {

        Validate.notBlank(
                request.getGovernanceInstanceId(), "governanceInstanceId must not be blank");

        return clientCall(request, DeleteGovernanceInstanceResponse::builder)
                .logger(LOG, "deleteGovernanceInstance")
                .serviceDetails(
                        "AccessGovernanceCP",
                        "DeleteGovernanceInstance",
                        "https://docs.oracle.com/iaas/api/#/en/access-governance-cp/20220518/GovernanceInstance/DeleteGovernanceInstance")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteGovernanceInstanceRequest::builder)
                .basePath("/20220518")
                .appendPathParam("governanceInstances")
                .appendPathParam(request.getGovernanceInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteGovernanceInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteGovernanceInstanceResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetGovernanceInstanceResponse getGovernanceInstance(
            GetGovernanceInstanceRequest request) {

        Validate.notBlank(
                request.getGovernanceInstanceId(), "governanceInstanceId must not be blank");

        return clientCall(request, GetGovernanceInstanceResponse::builder)
                .logger(LOG, "getGovernanceInstance")
                .serviceDetails(
                        "AccessGovernanceCP",
                        "GetGovernanceInstance",
                        "https://docs.oracle.com/iaas/api/#/en/access-governance-cp/20220518/GovernanceInstance/GetGovernanceInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGovernanceInstanceRequest::builder)
                .basePath("/20220518")
                .appendPathParam("governanceInstances")
                .appendPathParam(request.getGovernanceInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.accessgovernancecp.model.GovernanceInstance.class,
                        GetGovernanceInstanceResponse.Builder::governanceInstance)
                .handleResponseHeaderString("etag", GetGovernanceInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetGovernanceInstanceResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetGovernanceInstanceConfigurationResponse getGovernanceInstanceConfiguration(
            GetGovernanceInstanceConfigurationRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetGovernanceInstanceConfigurationResponse::builder)
                .logger(LOG, "getGovernanceInstanceConfiguration")
                .serviceDetails(
                        "AccessGovernanceCP",
                        "GetGovernanceInstanceConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/access-governance-cp/20220518/GovernanceInstanceConfiguration/GetGovernanceInstanceConfiguration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetGovernanceInstanceConfigurationRequest::builder)
                .basePath("/20220518")
                .appendPathParam("governanceInstances")
                .appendPathParam("configuration")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.accessgovernancecp.model.GovernanceInstanceConfiguration
                                .class,
                        GetGovernanceInstanceConfigurationResponse.Builder
                                ::governanceInstanceConfiguration)
                .handleResponseHeaderString(
                        "etag", GetGovernanceInstanceConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetGovernanceInstanceConfigurationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListGovernanceInstancesResponse listGovernanceInstances(
            ListGovernanceInstancesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListGovernanceInstancesResponse::builder)
                .logger(LOG, "listGovernanceInstances")
                .serviceDetails(
                        "AccessGovernanceCP",
                        "ListGovernanceInstances",
                        "https://docs.oracle.com/iaas/api/#/en/access-governance-cp/20220518/GovernanceInstanceCollection/ListGovernanceInstances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGovernanceInstancesRequest::builder)
                .basePath("/20220518")
                .appendPathParam("governanceInstances")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.accessgovernancecp.model.GovernanceInstanceCollection.class,
                        ListGovernanceInstancesResponse.Builder::governanceInstanceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListGovernanceInstancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListGovernanceInstancesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateGovernanceInstanceResponse updateGovernanceInstance(
            UpdateGovernanceInstanceRequest request) {
        Objects.requireNonNull(
                request.getUpdateGovernanceInstanceDetails(),
                "updateGovernanceInstanceDetails is required");

        Validate.notBlank(
                request.getGovernanceInstanceId(), "governanceInstanceId must not be blank");

        return clientCall(request, UpdateGovernanceInstanceResponse::builder)
                .logger(LOG, "updateGovernanceInstance")
                .serviceDetails(
                        "AccessGovernanceCP",
                        "UpdateGovernanceInstance",
                        "https://docs.oracle.com/iaas/api/#/en/access-governance-cp/20220518/GovernanceInstance/UpdateGovernanceInstance")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateGovernanceInstanceRequest::builder)
                .basePath("/20220518")
                .appendPathParam("governanceInstances")
                .appendPathParam(request.getGovernanceInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.accessgovernancecp.model.GovernanceInstance.class,
                        UpdateGovernanceInstanceResponse.Builder::governanceInstance)
                .handleResponseHeaderString("etag", UpdateGovernanceInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateGovernanceInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateGovernanceInstanceResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateGovernanceInstanceConfigurationResponse updateGovernanceInstanceConfiguration(
            UpdateGovernanceInstanceConfigurationRequest request) {
        Objects.requireNonNull(
                request.getUpdateGovernanceInstanceConfigurationDetails(),
                "updateGovernanceInstanceConfigurationDetails is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, UpdateGovernanceInstanceConfigurationResponse::builder)
                .logger(LOG, "updateGovernanceInstanceConfiguration")
                .serviceDetails(
                        "AccessGovernanceCP",
                        "UpdateGovernanceInstanceConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/access-governance-cp/20220518/GovernanceInstance/UpdateGovernanceInstanceConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateGovernanceInstanceConfigurationRequest::builder)
                .basePath("/20220518")
                .appendPathParam("governanceInstances")
                .appendPathParam("configuration")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.accessgovernancecp.model.GovernanceInstanceConfiguration
                                .class,
                        UpdateGovernanceInstanceConfigurationResponse.Builder
                                ::governanceInstanceConfiguration)
                .handleResponseHeaderString(
                        "etag", UpdateGovernanceInstanceConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateGovernanceInstanceConfigurationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateGovernanceInstanceConfigurationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public AccessGovernanceCPWaiters getWaiters() {
        return waiters;
    }

    @Override
    public AccessGovernanceCPPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AccessGovernanceCPClient(
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
    public AccessGovernanceCPClient(
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
    public AccessGovernanceCPClient(
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
    public AccessGovernanceCPClient(
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
    public AccessGovernanceCPClient(
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
    public AccessGovernanceCPClient(
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
    public AccessGovernanceCPClient(
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
    public AccessGovernanceCPClient(
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
