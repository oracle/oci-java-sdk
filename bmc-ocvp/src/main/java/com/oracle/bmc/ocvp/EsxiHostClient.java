/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.ocvp.requests.*;
import com.oracle.bmc.ocvp.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
public class EsxiHostClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements EsxiHost {
    /** Service instance for EsxiHost. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ESXIHOST")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://ocvps.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(EsxiHostClient.class);

    private final EsxiHostWaiters waiters;

    private final EsxiHostPaginators paginators;

    EsxiHostClient(
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
                                    .nameFormat("EsxiHost-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new EsxiHostWaiters(executorService, this);

        this.paginators = new EsxiHostPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, EsxiHostClient> {
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
        public EsxiHostClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new EsxiHostClient(this, authenticationDetailsProvider, executorService);
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
    public CreateEsxiHostResponse createEsxiHost(CreateEsxiHostRequest request) {
        Objects.requireNonNull(
                request.getCreateEsxiHostDetails(), "createEsxiHostDetails is required");

        return clientCall(request, CreateEsxiHostResponse::builder)
                .logger(LOG, "createEsxiHost")
                .serviceDetails(
                        "EsxiHost",
                        "CreateEsxiHost",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20200501/EsxiHost/CreateEsxiHost")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateEsxiHostRequest::builder)
                .basePath("/20200501")
                .appendPathParam("esxiHosts")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateEsxiHostResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateEsxiHostResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteEsxiHostResponse deleteEsxiHost(DeleteEsxiHostRequest request) {

        Validate.notBlank(request.getEsxiHostId(), "esxiHostId must not be blank");

        return clientCall(request, DeleteEsxiHostResponse::builder)
                .logger(LOG, "deleteEsxiHost")
                .serviceDetails(
                        "EsxiHost",
                        "DeleteEsxiHost",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20200501/EsxiHost/DeleteEsxiHost")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteEsxiHostRequest::builder)
                .basePath("/20200501")
                .appendPathParam("esxiHosts")
                .appendPathParam(request.getEsxiHostId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteEsxiHostResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteEsxiHostResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetEsxiHostResponse getEsxiHost(GetEsxiHostRequest request) {

        Validate.notBlank(request.getEsxiHostId(), "esxiHostId must not be blank");

        return clientCall(request, GetEsxiHostResponse::builder)
                .logger(LOG, "getEsxiHost")
                .serviceDetails(
                        "EsxiHost",
                        "GetEsxiHost",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20200501/EsxiHost/GetEsxiHost")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEsxiHostRequest::builder)
                .basePath("/20200501")
                .appendPathParam("esxiHosts")
                .appendPathParam(request.getEsxiHostId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ocvp.model.EsxiHost.class,
                        GetEsxiHostResponse.Builder::esxiHost)
                .handleResponseHeaderString("etag", GetEsxiHostResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetEsxiHostResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListEsxiHostsResponse listEsxiHosts(ListEsxiHostsRequest request) {

        return clientCall(request, ListEsxiHostsResponse::builder)
                .logger(LOG, "listEsxiHosts")
                .serviceDetails(
                        "EsxiHost",
                        "ListEsxiHosts",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20200501/EsxiHostSummary/ListEsxiHosts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEsxiHostsRequest::builder)
                .basePath("/20200501")
                .appendPathParam("esxiHosts")
                .appendQueryParam("sddcId", request.getSddcId())
                .appendQueryParam("computeInstanceId", request.getComputeInstanceId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("isBillingDonorsOnly", request.getIsBillingDonorsOnly())
                .appendQueryParam("isSwapBillingOnly", request.getIsSwapBillingOnly())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ocvp.model.EsxiHostCollection.class,
                        ListEsxiHostsResponse.Builder::esxiHostCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListEsxiHostsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListEsxiHostsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SwapBillingResponse swapBilling(SwapBillingRequest request) {

        Validate.notBlank(request.getEsxiHostId(), "esxiHostId must not be blank");
        Objects.requireNonNull(request.getSwapBillingHostId(), "swapBillingHostId is required");

        return clientCall(request, SwapBillingResponse::builder)
                .logger(LOG, "swapBilling")
                .serviceDetails(
                        "EsxiHost",
                        "SwapBilling",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20200501/EsxiHost/SwapBilling")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SwapBillingRequest::builder)
                .basePath("/20200501")
                .appendPathParam("esxiHosts")
                .appendPathParam(request.getEsxiHostId())
                .appendPathParam("actions")
                .appendPathParam("swapBilling")
                .appendQueryParam("swapBillingHostId", request.getSwapBillingHostId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", SwapBillingResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", SwapBillingResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateEsxiHostResponse updateEsxiHost(UpdateEsxiHostRequest request) {

        Validate.notBlank(request.getEsxiHostId(), "esxiHostId must not be blank");
        Objects.requireNonNull(
                request.getUpdateEsxiHostDetails(), "updateEsxiHostDetails is required");

        return clientCall(request, UpdateEsxiHostResponse::builder)
                .logger(LOG, "updateEsxiHost")
                .serviceDetails(
                        "EsxiHost",
                        "UpdateEsxiHost",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20200501/EsxiHost/UpdateEsxiHost")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateEsxiHostRequest::builder)
                .basePath("/20200501")
                .appendPathParam("esxiHosts")
                .appendPathParam(request.getEsxiHostId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ocvp.model.EsxiHost.class,
                        UpdateEsxiHostResponse.Builder::esxiHost)
                .handleResponseHeaderString("etag", UpdateEsxiHostResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateEsxiHostResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public EsxiHostWaiters getWaiters() {
        return waiters;
    }

    @Override
    public EsxiHostPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public EsxiHostClient(
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
    public EsxiHostClient(
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
    public EsxiHostClient(
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
    public EsxiHostClient(
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
    public EsxiHostClient(
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
    public EsxiHostClient(
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
    public EsxiHostClient(
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
    public EsxiHostClient(
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
