/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.tenantmanagercontrolplane.requests.*;
import com.oracle.bmc.tenantmanagercontrolplane.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230401")
public class DomainGovernanceClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements DomainGovernance {
    /** Service instance for DomainGovernance. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DOMAINGOVERNANCE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://organizations.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DomainGovernanceClient.class);

    private final DomainGovernanceWaiters waiters;

    private final DomainGovernancePaginators paginators;

    DomainGovernanceClient(
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
                                    .nameFormat("DomainGovernance-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DomainGovernanceWaiters(executorService, this);

        this.paginators = new DomainGovernancePaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DomainGovernanceClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "tenantmanagercontrolplane";
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
        public DomainGovernanceClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DomainGovernanceClient(this, authenticationDetailsProvider, executorService);
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
    public CreateDomainGovernanceResponse createDomainGovernance(
            CreateDomainGovernanceRequest request) {
        Objects.requireNonNull(
                request.getCreateDomainGovernanceDetails(),
                "createDomainGovernanceDetails is required");

        return clientCall(request, CreateDomainGovernanceResponse::builder)
                .logger(LOG, "createDomainGovernance")
                .serviceDetails(
                        "DomainGovernance",
                        "CreateDomainGovernance",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20230401/DomainGovernance/CreateDomainGovernance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDomainGovernanceRequest::builder)
                .basePath("/20230401")
                .appendPathParam("domainGovernances")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.DomainGovernance.class,
                        CreateDomainGovernanceResponse.Builder::domainGovernance)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDomainGovernanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateDomainGovernanceResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteDomainGovernanceResponse deleteDomainGovernance(
            DeleteDomainGovernanceRequest request) {

        Validate.notBlank(request.getDomainGovernanceId(), "domainGovernanceId must not be blank");

        return clientCall(request, DeleteDomainGovernanceResponse::builder)
                .logger(LOG, "deleteDomainGovernance")
                .serviceDetails(
                        "DomainGovernance",
                        "DeleteDomainGovernance",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20230401/DomainGovernance/DeleteDomainGovernance")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDomainGovernanceRequest::builder)
                .basePath("/20230401")
                .appendPathParam("domainGovernances")
                .appendPathParam(request.getDomainGovernanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDomainGovernanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDomainGovernanceResponse getDomainGovernance(GetDomainGovernanceRequest request) {

        Validate.notBlank(request.getDomainGovernanceId(), "domainGovernanceId must not be blank");

        return clientCall(request, GetDomainGovernanceResponse::builder)
                .logger(LOG, "getDomainGovernance")
                .serviceDetails(
                        "DomainGovernance",
                        "GetDomainGovernance",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20230401/DomainGovernance/GetDomainGovernance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDomainGovernanceRequest::builder)
                .basePath("/20230401")
                .appendPathParam("domainGovernances")
                .appendPathParam(request.getDomainGovernanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.DomainGovernance.class,
                        GetDomainGovernanceResponse.Builder::domainGovernance)
                .handleResponseHeaderString("etag", GetDomainGovernanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDomainGovernanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListDomainGovernancesResponse listDomainGovernances(
            ListDomainGovernancesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDomainGovernancesResponse::builder)
                .logger(LOG, "listDomainGovernances")
                .serviceDetails(
                        "DomainGovernance",
                        "ListDomainGovernances",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20230401/DomainGovernance/ListDomainGovernances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDomainGovernancesRequest::builder)
                .basePath("/20230401")
                .appendPathParam("domainGovernances")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("domainId", request.getDomainId())
                .appendQueryParam("domainGovernanceId", request.getDomainGovernanceId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.DomainGovernanceCollection
                                .class,
                        ListDomainGovernancesResponse.Builder::domainGovernanceCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListDomainGovernancesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListDomainGovernancesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDomainGovernanceResponse updateDomainGovernance(
            UpdateDomainGovernanceRequest request) {

        Validate.notBlank(request.getDomainGovernanceId(), "domainGovernanceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDomainGovernanceDetails(),
                "updateDomainGovernanceDetails is required");

        return clientCall(request, UpdateDomainGovernanceResponse::builder)
                .logger(LOG, "updateDomainGovernance")
                .serviceDetails(
                        "DomainGovernance",
                        "UpdateDomainGovernance",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20230401/DomainGovernance/UpdateDomainGovernance")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDomainGovernanceRequest::builder)
                .basePath("/20230401")
                .appendPathParam("domainGovernances")
                .appendPathParam(request.getDomainGovernanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.DomainGovernance.class,
                        UpdateDomainGovernanceResponse.Builder::domainGovernance)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDomainGovernanceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateDomainGovernanceResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DomainGovernanceWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DomainGovernancePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DomainGovernanceClient(
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
    public DomainGovernanceClient(
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
    public DomainGovernanceClient(
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
    public DomainGovernanceClient(
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
    public DomainGovernanceClient(
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
    public DomainGovernanceClient(
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
    public DomainGovernanceClient(
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
    public DomainGovernanceClient(
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
