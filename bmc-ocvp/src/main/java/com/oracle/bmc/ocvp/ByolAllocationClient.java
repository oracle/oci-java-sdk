/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.ocvp.requests.*;
import com.oracle.bmc.ocvp.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
public class ByolAllocationClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements ByolAllocation {
    /** Service instance for ByolAllocation. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(ByolAllocationClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://ocvps.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ByolAllocationClient.class);

    private final ByolAllocationWaiters waiters;

    private final ByolAllocationPaginators paginators;

    ByolAllocationClient(
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
                                    .nameFormat("ByolAllocation-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new ByolAllocationWaiters(executorService, this);

        this.paginators = new ByolAllocationPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ByolAllocationClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "ocvp";
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
        public ByolAllocationClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ByolAllocationClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeByolAllocationCompartmentResponse changeByolAllocationCompartment(
            ChangeByolAllocationCompartmentRequest request) {

        Validate.notBlank(request.getByolAllocationId(), "byolAllocationId must not be blank");
        Objects.requireNonNull(
                request.getChangeByolAllocationCompartmentDetails(),
                "changeByolAllocationCompartmentDetails is required");

        return clientCall(request, ChangeByolAllocationCompartmentResponse::builder)
                .logger(LOG, "changeByolAllocationCompartment")
                .serviceDetails(
                        "ByolAllocation",
                        "ChangeByolAllocationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/ByolAllocation/ChangeByolAllocationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeByolAllocationCompartmentRequest::builder)
                .basePath("/20230701")
                .appendPathParam("byolAllocations")
                .appendPathParam(request.getByolAllocationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeByolAllocationCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateByolAllocationResponse createByolAllocation(CreateByolAllocationRequest request) {
        Objects.requireNonNull(
                request.getCreateByolAllocationDetails(),
                "createByolAllocationDetails is required");

        return clientCall(request, CreateByolAllocationResponse::builder)
                .logger(LOG, "createByolAllocation")
                .serviceDetails(
                        "ByolAllocation",
                        "CreateByolAllocation",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/ByolAllocation/CreateByolAllocation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateByolAllocationRequest::builder)
                .basePath("/20230701")
                .appendPathParam("byolAllocations")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateByolAllocationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateByolAllocationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteByolAllocationResponse deleteByolAllocation(DeleteByolAllocationRequest request) {

        Validate.notBlank(request.getByolAllocationId(), "byolAllocationId must not be blank");

        return clientCall(request, DeleteByolAllocationResponse::builder)
                .logger(LOG, "deleteByolAllocation")
                .serviceDetails(
                        "ByolAllocation",
                        "DeleteByolAllocation",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/ByolAllocation/DeleteByolAllocation")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteByolAllocationRequest::builder)
                .basePath("/20230701")
                .appendPathParam("byolAllocations")
                .appendPathParam(request.getByolAllocationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteByolAllocationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteByolAllocationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetByolAllocationResponse getByolAllocation(GetByolAllocationRequest request) {

        Validate.notBlank(request.getByolAllocationId(), "byolAllocationId must not be blank");

        return clientCall(request, GetByolAllocationResponse::builder)
                .logger(LOG, "getByolAllocation")
                .serviceDetails(
                        "ByolAllocation",
                        "GetByolAllocation",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/ByolAllocation/GetByolAllocation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetByolAllocationRequest::builder)
                .basePath("/20230701")
                .appendPathParam("byolAllocations")
                .appendPathParam(request.getByolAllocationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ocvp.model.ByolAllocation.class,
                        GetByolAllocationResponse.Builder::byolAllocation)
                .handleResponseHeaderString("etag", GetByolAllocationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetByolAllocationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListByolAllocationsResponse listByolAllocations(ListByolAllocationsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListByolAllocationsResponse::builder)
                .logger(LOG, "listByolAllocations")
                .serviceDetails(
                        "ByolAllocation",
                        "ListByolAllocations",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/ByolAllocationSummary/ListByolAllocations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListByolAllocationsRequest::builder)
                .basePath("/20230701")
                .appendPathParam("byolAllocations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("byolAllocationId", request.getByolAllocationId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("softwareType", request.getSoftwareType())
                .appendQueryParam(
                        "availableUnitsGreaterThanOrEqualTo",
                        request.getAvailableUnitsGreaterThanOrEqualTo())
                .appendQueryParam("byolId", request.getByolId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ocvp.model.ByolAllocationCollection.class,
                        ListByolAllocationsResponse.Builder::byolAllocationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListByolAllocationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListByolAllocationsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateByolAllocationResponse updateByolAllocation(UpdateByolAllocationRequest request) {

        Validate.notBlank(request.getByolAllocationId(), "byolAllocationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateByolAllocationDetails(),
                "updateByolAllocationDetails is required");

        return clientCall(request, UpdateByolAllocationResponse::builder)
                .logger(LOG, "updateByolAllocation")
                .serviceDetails(
                        "ByolAllocation",
                        "UpdateByolAllocation",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/ByolAllocation/UpdateByolAllocation")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateByolAllocationRequest::builder)
                .basePath("/20230701")
                .appendPathParam("byolAllocations")
                .appendPathParam(request.getByolAllocationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateByolAllocationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateByolAllocationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ByolAllocationWaiters getWaiters() {
        return waiters;
    }

    @Override
    public ByolAllocationPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ByolAllocationClient(
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
    public ByolAllocationClient(
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
    public ByolAllocationClient(
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
    public ByolAllocationClient(
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
    public ByolAllocationClient(
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
    public ByolAllocationClient(
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
    public ByolAllocationClient(
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
    public ByolAllocationClient(
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
