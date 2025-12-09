/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.redis.requests.*;
import com.oracle.bmc.redis.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220315")
public class OciCacheConfigSetClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements OciCacheConfigSet {
    /** Service instance for OciCacheConfigSet. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(OciCacheConfigSetClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://redis.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OciCacheConfigSetClient.class);

    private final OciCacheConfigSetWaiters waiters;

    private final OciCacheConfigSetPaginators paginators;

    OciCacheConfigSetClient(
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
                                    .nameFormat("OciCacheConfigSet-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new OciCacheConfigSetWaiters(executorService, this);

        this.paginators = new OciCacheConfigSetPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OciCacheConfigSetClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "redis";
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
        public OciCacheConfigSetClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OciCacheConfigSetClient(
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
    public ChangeOciCacheConfigSetCompartmentResponse changeOciCacheConfigSetCompartment(
            ChangeOciCacheConfigSetCompartmentRequest request) {

        Validate.notBlank(
                request.getOciCacheConfigSetId(), "ociCacheConfigSetId must not be blank");
        Objects.requireNonNull(
                request.getChangeOciCacheConfigSetCompartmentDetails(),
                "changeOciCacheConfigSetCompartmentDetails is required");

        return clientCall(request, ChangeOciCacheConfigSetCompartmentResponse::builder)
                .logger(LOG, "changeOciCacheConfigSetCompartment")
                .serviceDetails(
                        "OciCacheConfigSet",
                        "ChangeOciCacheConfigSetCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheConfigSet/ChangeOciCacheConfigSetCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOciCacheConfigSetCompartmentRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheConfigSets")
                .appendPathParam(request.getOciCacheConfigSetId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOciCacheConfigSetCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOciCacheConfigSetCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateOciCacheConfigSetResponse createOciCacheConfigSet(
            CreateOciCacheConfigSetRequest request) {
        Objects.requireNonNull(
                request.getCreateOciCacheConfigSetDetails(),
                "createOciCacheConfigSetDetails is required");

        return clientCall(request, CreateOciCacheConfigSetResponse::builder)
                .logger(LOG, "createOciCacheConfigSet")
                .serviceDetails(
                        "OciCacheConfigSet",
                        "CreateOciCacheConfigSet",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheConfigSet/CreateOciCacheConfigSet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOciCacheConfigSetRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheConfigSets")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.redis.model.OciCacheConfigSet.class,
                        CreateOciCacheConfigSetResponse.Builder::ociCacheConfigSet)
                .handleResponseHeaderString("etag", CreateOciCacheConfigSetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOciCacheConfigSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOciCacheConfigSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteOciCacheConfigSetResponse deleteOciCacheConfigSet(
            DeleteOciCacheConfigSetRequest request) {

        Validate.notBlank(
                request.getOciCacheConfigSetId(), "ociCacheConfigSetId must not be blank");

        return clientCall(request, DeleteOciCacheConfigSetResponse::builder)
                .logger(LOG, "deleteOciCacheConfigSet")
                .serviceDetails(
                        "OciCacheConfigSet",
                        "DeleteOciCacheConfigSet",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheConfigSet/DeleteOciCacheConfigSet")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOciCacheConfigSetRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheConfigSets")
                .appendPathParam(request.getOciCacheConfigSetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOciCacheConfigSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOciCacheConfigSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOciCacheConfigSetResponse getOciCacheConfigSet(GetOciCacheConfigSetRequest request) {

        Validate.notBlank(
                request.getOciCacheConfigSetId(), "ociCacheConfigSetId must not be blank");

        return clientCall(request, GetOciCacheConfigSetResponse::builder)
                .logger(LOG, "getOciCacheConfigSet")
                .serviceDetails(
                        "OciCacheConfigSet",
                        "GetOciCacheConfigSet",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheConfigSet/GetOciCacheConfigSet")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOciCacheConfigSetRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheConfigSets")
                .appendPathParam(request.getOciCacheConfigSetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.redis.model.OciCacheConfigSet.class,
                        GetOciCacheConfigSetResponse.Builder::ociCacheConfigSet)
                .handleResponseHeaderString("etag", GetOciCacheConfigSetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOciCacheConfigSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListAssociatedOciCacheClustersResponse listAssociatedOciCacheClusters(
            ListAssociatedOciCacheClustersRequest request) {

        Validate.notBlank(
                request.getOciCacheConfigSetId(), "ociCacheConfigSetId must not be blank");

        return clientCall(request, ListAssociatedOciCacheClustersResponse::builder)
                .logger(LOG, "listAssociatedOciCacheClusters")
                .serviceDetails(
                        "OciCacheConfigSet",
                        "ListAssociatedOciCacheClusters",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/AssociatedOciCacheClusterSummary/ListAssociatedOciCacheClusters")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ListAssociatedOciCacheClustersRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheConfigSets")
                .appendPathParam(request.getOciCacheConfigSetId())
                .appendPathParam("actions")
                .appendPathParam("listAssociatedOciCacheClusters")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.redis.model.AssociatedOciCacheClusterCollection.class,
                        ListAssociatedOciCacheClustersResponse.Builder
                                ::associatedOciCacheClusterCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAssociatedOciCacheClustersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAssociatedOciCacheClustersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListOciCacheConfigSetsResponse listOciCacheConfigSets(
            ListOciCacheConfigSetsRequest request) {

        return clientCall(request, ListOciCacheConfigSetsResponse::builder)
                .logger(LOG, "listOciCacheConfigSets")
                .serviceDetails(
                        "OciCacheConfigSet",
                        "ListOciCacheConfigSets",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheConfigSetSummary/ListOciCacheConfigSets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOciCacheConfigSetsRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheConfigSets")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("softwareVersion", request.getSoftwareVersion())
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
                        com.oracle.bmc.redis.model.OciCacheConfigSetCollection.class,
                        ListOciCacheConfigSetsResponse.Builder::ociCacheConfigSetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListOciCacheConfigSetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOciCacheConfigSetsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateOciCacheConfigSetResponse updateOciCacheConfigSet(
            UpdateOciCacheConfigSetRequest request) {

        Validate.notBlank(
                request.getOciCacheConfigSetId(), "ociCacheConfigSetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOciCacheConfigSetDetails(),
                "updateOciCacheConfigSetDetails is required");

        return clientCall(request, UpdateOciCacheConfigSetResponse::builder)
                .logger(LOG, "updateOciCacheConfigSet")
                .serviceDetails(
                        "OciCacheConfigSet",
                        "UpdateOciCacheConfigSet",
                        "https://docs.oracle.com/iaas/api/#/en/ocicache/20220315/OciCacheConfigSet/UpdateOciCacheConfigSet")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOciCacheConfigSetRequest::builder)
                .basePath("/20220315")
                .appendPathParam("ociCacheConfigSets")
                .appendPathParam(request.getOciCacheConfigSetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOciCacheConfigSetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOciCacheConfigSetResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public OciCacheConfigSetWaiters getWaiters() {
        return waiters;
    }

    @Override
    public OciCacheConfigSetPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OciCacheConfigSetClient(
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
    public OciCacheConfigSetClient(
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
    public OciCacheConfigSetClient(
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
    public OciCacheConfigSetClient(
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
    public OciCacheConfigSetClient(
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
    public OciCacheConfigSetClient(
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
    public OciCacheConfigSetClient(
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
    public OciCacheConfigSetClient(
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
