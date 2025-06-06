/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.demandsignal;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.demandsignal.requests.*;
import com.oracle.bmc.demandsignal.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240430")
public class OccDemandSignalClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements OccDemandSignal {
    /** Service instance for OccDemandSignal. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("OCCDEMANDSIGNAL")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://control-center-ds.{region}.oci.{secondLevelDomain}")
                    .endpointServiceName("control-center-ds")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OccDemandSignalClient.class);

    private final OccDemandSignalWaiters waiters;

    private final OccDemandSignalPaginators paginators;

    OccDemandSignalClient(
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
                                    .nameFormat("OccDemandSignal-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new OccDemandSignalWaiters(executorService, this);

        this.paginators = new OccDemandSignalPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OccDemandSignalClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "demandsignal";
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
        public OccDemandSignalClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OccDemandSignalClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeOccDemandSignalCompartmentResponse changeOccDemandSignalCompartment(
            ChangeOccDemandSignalCompartmentRequest request) {

        Validate.notBlank(request.getOccDemandSignalId(), "occDemandSignalId must not be blank");
        Objects.requireNonNull(
                request.getChangeOccDemandSignalCompartmentDetails(),
                "changeOccDemandSignalCompartmentDetails is required");

        return clientCall(request, ChangeOccDemandSignalCompartmentResponse::builder)
                .logger(LOG, "changeOccDemandSignalCompartment")
                .serviceDetails(
                        "OccDemandSignal",
                        "ChangeOccDemandSignalCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/occds/20240430/OccDemandSignal/ChangeOccDemandSignalCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOccDemandSignalCompartmentRequest::builder)
                .basePath("/20240430")
                .appendPathParam("occDemandSignals")
                .appendPathParam(request.getOccDemandSignalId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOccDemandSignalCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOccDemandSignalCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateOccDemandSignalResponse createOccDemandSignal(
            CreateOccDemandSignalRequest request) {
        Objects.requireNonNull(
                request.getCreateOccDemandSignalDetails(),
                "createOccDemandSignalDetails is required");

        return clientCall(request, CreateOccDemandSignalResponse::builder)
                .logger(LOG, "createOccDemandSignal")
                .serviceDetails(
                        "OccDemandSignal",
                        "CreateOccDemandSignal",
                        "https://docs.oracle.com/iaas/api/#/en/occds/20240430/OccDemandSignal/CreateOccDemandSignal")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOccDemandSignalRequest::builder)
                .basePath("/20240430")
                .appendPathParam("occDemandSignals")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.demandsignal.model.OccDemandSignal.class,
                        CreateOccDemandSignalResponse.Builder::occDemandSignal)
                .handleResponseHeaderInteger(
                        "retry-after", CreateOccDemandSignalResponse.Builder::retryAfter)
                .handleResponseHeaderString("etag", CreateOccDemandSignalResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOccDemandSignalResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteOccDemandSignalResponse deleteOccDemandSignal(
            DeleteOccDemandSignalRequest request) {

        Validate.notBlank(request.getOccDemandSignalId(), "occDemandSignalId must not be blank");

        return clientCall(request, DeleteOccDemandSignalResponse::builder)
                .logger(LOG, "deleteOccDemandSignal")
                .serviceDetails(
                        "OccDemandSignal",
                        "DeleteOccDemandSignal",
                        "https://docs.oracle.com/iaas/api/#/en/occds/20240430/OccDemandSignal/DeleteOccDemandSignal")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOccDemandSignalRequest::builder)
                .basePath("/20240430")
                .appendPathParam("occDemandSignals")
                .appendPathParam(request.getOccDemandSignalId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOccDemandSignalResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOccDemandSignalResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOccDemandSignalResponse getOccDemandSignal(GetOccDemandSignalRequest request) {

        Validate.notBlank(request.getOccDemandSignalId(), "occDemandSignalId must not be blank");

        return clientCall(request, GetOccDemandSignalResponse::builder)
                .logger(LOG, "getOccDemandSignal")
                .serviceDetails(
                        "OccDemandSignal",
                        "GetOccDemandSignal",
                        "https://docs.oracle.com/iaas/api/#/en/occds/20240430/OccDemandSignal/GetOccDemandSignal")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOccDemandSignalRequest::builder)
                .basePath("/20240430")
                .appendPathParam("occDemandSignals")
                .appendPathParam(request.getOccDemandSignalId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.demandsignal.model.OccDemandSignal.class,
                        GetOccDemandSignalResponse.Builder::occDemandSignal)
                .handleResponseHeaderString("etag", GetOccDemandSignalResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOccDemandSignalResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListOccDemandSignalsResponse listOccDemandSignals(ListOccDemandSignalsRequest request) {

        return clientCall(request, ListOccDemandSignalsResponse::builder)
                .logger(LOG, "listOccDemandSignals")
                .serviceDetails(
                        "OccDemandSignal",
                        "ListOccDemandSignals",
                        "https://docs.oracle.com/iaas/api/#/en/occds/20240430/OccDemandSignalCollection/ListOccDemandSignals")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOccDemandSignalsRequest::builder)
                .basePath("/20240430")
                .appendPathParam("occDemandSignals")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.demandsignal.model.OccDemandSignalCollection.class,
                        ListOccDemandSignalsResponse.Builder::occDemandSignalCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOccDemandSignalsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOccDemandSignalsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public PatchOccDemandSignalResponse patchOccDemandSignal(PatchOccDemandSignalRequest request) {

        Validate.notBlank(request.getOccDemandSignalId(), "occDemandSignalId must not be blank");
        Objects.requireNonNull(
                request.getPatchOccDemandSignalDetails(),
                "patchOccDemandSignalDetails is required");

        return clientCall(request, PatchOccDemandSignalResponse::builder)
                .logger(LOG, "patchOccDemandSignal")
                .serviceDetails(
                        "OccDemandSignal",
                        "PatchOccDemandSignal",
                        "https://docs.oracle.com/iaas/api/#/en/occds/20240430/OccDemandSignal/PatchOccDemandSignal")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchOccDemandSignalRequest::builder)
                .basePath("/20240430")
                .appendPathParam("occDemandSignals")
                .appendPathParam(request.getOccDemandSignalId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.demandsignal.model.OccDemandSignal.class,
                        PatchOccDemandSignalResponse.Builder::occDemandSignal)
                .handleResponseHeaderInteger(
                        "retry-after", PatchOccDemandSignalResponse.Builder::retryAfter)
                .handleResponseHeaderString("etag", PatchOccDemandSignalResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", PatchOccDemandSignalResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateOccDemandSignalResponse updateOccDemandSignal(
            UpdateOccDemandSignalRequest request) {

        Validate.notBlank(request.getOccDemandSignalId(), "occDemandSignalId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOccDemandSignalDetails(),
                "updateOccDemandSignalDetails is required");

        return clientCall(request, UpdateOccDemandSignalResponse::builder)
                .logger(LOG, "updateOccDemandSignal")
                .serviceDetails(
                        "OccDemandSignal",
                        "UpdateOccDemandSignal",
                        "https://docs.oracle.com/iaas/api/#/en/occds/20240430/OccDemandSignal/UpdateOccDemandSignal")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOccDemandSignalRequest::builder)
                .basePath("/20240430")
                .appendPathParam("occDemandSignals")
                .appendPathParam(request.getOccDemandSignalId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.demandsignal.model.OccDemandSignal.class,
                        UpdateOccDemandSignalResponse.Builder::occDemandSignal)
                .handleResponseHeaderInteger(
                        "retry-after", UpdateOccDemandSignalResponse.Builder::retryAfter)
                .handleResponseHeaderString("etag", UpdateOccDemandSignalResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOccDemandSignalResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public OccDemandSignalWaiters getWaiters() {
        return waiters;
    }

    @Override
    public OccDemandSignalPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OccDemandSignalClient(
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
    public OccDemandSignalClient(
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
    public OccDemandSignalClient(
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
    public OccDemandSignalClient(
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
    public OccDemandSignalClient(
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
    public OccDemandSignalClient(
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
    public OccDemandSignalClient(
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
    public OccDemandSignalClient(
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
