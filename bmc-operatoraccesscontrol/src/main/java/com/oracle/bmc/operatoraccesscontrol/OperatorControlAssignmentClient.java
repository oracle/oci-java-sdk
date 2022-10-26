/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.operatoraccesscontrol.requests.*;
import com.oracle.bmc.operatoraccesscontrol.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class OperatorControlAssignmentClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements OperatorControlAssignment {
    /** Service instance for OperatorControlAssignment. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("OPERATORCONTROLASSIGNMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://operator-access-control.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OperatorControlAssignmentAsyncClient.class);

    private final OperatorControlAssignmentWaiters waiters;

    private final OperatorControlAssignmentPaginators paginators;

    private OperatorControlAssignmentClient(
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
                                    .nameFormat("OperatorControlAssignment-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new OperatorControlAssignmentWaiters(executorService, this);

        this.paginators = new OperatorControlAssignmentPaginators(this);
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
                    Builder, OperatorControlAssignmentClient> {
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
        public OperatorControlAssignmentClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OperatorControlAssignmentClient(
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
    public ChangeOperatorControlAssignmentCompartmentResponse
            changeOperatorControlAssignmentCompartment(
                    ChangeOperatorControlAssignmentCompartmentRequest request) {

        Validate.notBlank(
                request.getOperatorControlAssignmentId(),
                "operatorControlAssignmentId must not be blank");
        Objects.requireNonNull(
                request.getChangeOperatorControlAssignmentCompartmentDetails(),
                "changeOperatorControlAssignmentCompartmentDetails is required");

        return clientCall(request, ChangeOperatorControlAssignmentCompartmentResponse::builder)
                .logger(LOG, "changeOperatorControlAssignmentCompartment")
                .serviceDetails(
                        "OperatorControlAssignment",
                        "ChangeOperatorControlAssignmentCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/operatoraccesscontrol/20200630/OperatorControlAssignment/ChangeOperatorControlAssignmentCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOperatorControlAssignmentCompartmentRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControlAssignments")
                .appendPathParam(request.getOperatorControlAssignmentId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOperatorControlAssignmentCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateOperatorControlAssignmentResponse createOperatorControlAssignment(
            CreateOperatorControlAssignmentRequest request) {
        Objects.requireNonNull(
                request.getCreateOperatorControlAssignmentDetails(),
                "createOperatorControlAssignmentDetails is required");

        return clientCall(request, CreateOperatorControlAssignmentResponse::builder)
                .logger(LOG, "createOperatorControlAssignment")
                .serviceDetails(
                        "OperatorControlAssignment",
                        "CreateOperatorControlAssignment",
                        "https://docs.oracle.com/iaas/api/#/en/operatoraccesscontrol/20200630/OperatorControlAssignment/CreateOperatorControlAssignment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOperatorControlAssignmentRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControlAssignments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.operatoraccesscontrol.model.OperatorControlAssignment.class,
                        CreateOperatorControlAssignmentResponse.Builder::operatorControlAssignment)
                .handleResponseHeaderString(
                        "etag", CreateOperatorControlAssignmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOperatorControlAssignmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateOperatorControlAssignmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteOperatorControlAssignmentResponse deleteOperatorControlAssignment(
            DeleteOperatorControlAssignmentRequest request) {

        Validate.notBlank(
                request.getOperatorControlAssignmentId(),
                "operatorControlAssignmentId must not be blank");

        return clientCall(request, DeleteOperatorControlAssignmentResponse::builder)
                .logger(LOG, "deleteOperatorControlAssignment")
                .serviceDetails(
                        "OperatorControlAssignment",
                        "DeleteOperatorControlAssignment",
                        "https://docs.oracle.com/iaas/api/#/en/operatoraccesscontrol/20200630/OperatorControlAssignment/DeleteOperatorControlAssignment")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOperatorControlAssignmentRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControlAssignments")
                .appendPathParam(request.getOperatorControlAssignmentId())
                .appendQueryParam("description", request.getDescription())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteOperatorControlAssignmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOperatorControlAssignmentResponse getOperatorControlAssignment(
            GetOperatorControlAssignmentRequest request) {

        Validate.notBlank(
                request.getOperatorControlAssignmentId(),
                "operatorControlAssignmentId must not be blank");

        return clientCall(request, GetOperatorControlAssignmentResponse::builder)
                .logger(LOG, "getOperatorControlAssignment")
                .serviceDetails(
                        "OperatorControlAssignment",
                        "GetOperatorControlAssignment",
                        "https://docs.oracle.com/iaas/api/#/en/operatoraccesscontrol/20200630/OperatorControlAssignment/GetOperatorControlAssignment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOperatorControlAssignmentRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControlAssignments")
                .appendPathParam(request.getOperatorControlAssignmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.operatoraccesscontrol.model.OperatorControlAssignment.class,
                        GetOperatorControlAssignmentResponse.Builder::operatorControlAssignment)
                .handleResponseHeaderString(
                        "etag", GetOperatorControlAssignmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetOperatorControlAssignmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListOperatorControlAssignmentsResponse listOperatorControlAssignments(
            ListOperatorControlAssignmentsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOperatorControlAssignmentsResponse::builder)
                .logger(LOG, "listOperatorControlAssignments")
                .serviceDetails(
                        "OperatorControlAssignment",
                        "ListOperatorControlAssignments",
                        "https://docs.oracle.com/iaas/api/#/en/operatoraccesscontrol/20200630/OperatorControlAssignment/ListOperatorControlAssignments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOperatorControlAssignmentsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControlAssignments")
                .appendQueryParam("operatorControlName", request.getOperatorControlName())
                .appendQueryParam("resourceName", request.getResourceName())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.operatoraccesscontrol.model
                                .OperatorControlAssignmentCollection.class,
                        ListOperatorControlAssignmentsResponse.Builder
                                ::operatorControlAssignmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOperatorControlAssignmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListOperatorControlAssignmentsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateOperatorControlAssignmentResponse updateOperatorControlAssignment(
            UpdateOperatorControlAssignmentRequest request) {

        Validate.notBlank(
                request.getOperatorControlAssignmentId(),
                "operatorControlAssignmentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOperatorControlAssignmentDetails(),
                "updateOperatorControlAssignmentDetails is required");

        return clientCall(request, UpdateOperatorControlAssignmentResponse::builder)
                .logger(LOG, "updateOperatorControlAssignment")
                .serviceDetails(
                        "OperatorControlAssignment",
                        "UpdateOperatorControlAssignment",
                        "https://docs.oracle.com/iaas/api/#/en/operatoraccesscontrol/20200630/OperatorControlAssignment/UpdateOperatorControlAssignment")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOperatorControlAssignmentRequest::builder)
                .basePath("/20200630")
                .appendPathParam("operatorControlAssignments")
                .appendPathParam(request.getOperatorControlAssignmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.operatoraccesscontrol.model.OperatorControlAssignment.class,
                        UpdateOperatorControlAssignmentResponse.Builder::operatorControlAssignment)
                .handleResponseHeaderString(
                        "etag", UpdateOperatorControlAssignmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateOperatorControlAssignmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public OperatorControlAssignmentWaiters getWaiters() {
        return waiters;
    }

    @Override
    public OperatorControlAssignmentPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OperatorControlAssignmentClient(
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
    public OperatorControlAssignmentClient(
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
    public OperatorControlAssignmentClient(
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
    public OperatorControlAssignmentClient(
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
    public OperatorControlAssignmentClient(
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
    public OperatorControlAssignmentClient(
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
    public OperatorControlAssignmentClient(
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
    public OperatorControlAssignmentClient(
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
