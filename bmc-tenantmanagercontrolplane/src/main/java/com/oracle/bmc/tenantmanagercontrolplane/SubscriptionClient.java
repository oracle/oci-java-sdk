/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.tenantmanagercontrolplane.requests.*;
import com.oracle.bmc.tenantmanagercontrolplane.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
public class SubscriptionClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements Subscription {
    /** Service instance for Subscription. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("SUBSCRIPTION")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://organizations.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SubscriptionAsyncClient.class);

    private final SubscriptionWaiters waiters;

    private final SubscriptionPaginators paginators;

    private SubscriptionClient(
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
                                    .nameFormat("Subscription-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new SubscriptionWaiters(executorService, this);

        this.paginators = new SubscriptionPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, SubscriptionClient> {
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
        public SubscriptionClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new SubscriptionClient(this, authenticationDetailsProvider, executorService);
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
    public CreateSubscriptionMappingResponse createSubscriptionMapping(
            CreateSubscriptionMappingRequest request) {
        Objects.requireNonNull(
                request.getCreateSubscriptionMappingDetails(),
                "createSubscriptionMappingDetails is required");

        return clientCall(request, CreateSubscriptionMappingResponse::builder)
                .logger(LOG, "createSubscriptionMapping")
                .serviceDetails(
                        "Subscription",
                        "CreateSubscriptionMapping",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20200801/SubscriptionMapping/CreateSubscriptionMapping")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSubscriptionMappingRequest::builder)
                .basePath("/20200801")
                .appendPathParam("subscriptionMappings")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.SubscriptionMapping.class,
                        CreateSubscriptionMappingResponse.Builder::subscriptionMapping)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSubscriptionMappingResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateSubscriptionMappingResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreateSubscriptionMappingResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteSubscriptionMappingResponse deleteSubscriptionMapping(
            DeleteSubscriptionMappingRequest request) {

        Validate.notBlank(
                request.getSubscriptionMappingId(), "subscriptionMappingId must not be blank");

        return clientCall(request, DeleteSubscriptionMappingResponse::builder)
                .logger(LOG, "deleteSubscriptionMapping")
                .serviceDetails(
                        "Subscription",
                        "DeleteSubscriptionMapping",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20200801/SubscriptionMapping/DeleteSubscriptionMapping")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSubscriptionMappingRequest::builder)
                .basePath("/20200801")
                .appendPathParam("subscriptionMappings")
                .appendPathParam(request.getSubscriptionMappingId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSubscriptionMappingResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAssignedSubscriptionResponse getAssignedSubscription(
            GetAssignedSubscriptionRequest request) {

        Validate.notBlank(
                request.getAssignedSubscriptionId(), "assignedSubscriptionId must not be blank");

        return clientCall(request, GetAssignedSubscriptionResponse::builder)
                .logger(LOG, "getAssignedSubscription")
                .serviceDetails(
                        "Subscription",
                        "GetAssignedSubscription",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20200801/AssignedSubscription/GetAssignedSubscription")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAssignedSubscriptionRequest::builder)
                .basePath("/20200801")
                .appendPathParam("assignedSubscriptions")
                .appendPathParam(request.getAssignedSubscriptionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.AssignedSubscription.class,
                        GetAssignedSubscriptionResponse.Builder::assignedSubscription)
                .handleResponseHeaderString(
                        "opc-request-id", GetAssignedSubscriptionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetAssignedSubscriptionResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetSubscriptionResponse getSubscription(GetSubscriptionRequest request) {

        Validate.notBlank(request.getSubscriptionId(), "subscriptionId must not be blank");

        return clientCall(request, GetSubscriptionResponse::builder)
                .logger(LOG, "getSubscription")
                .serviceDetails(
                        "Subscription",
                        "GetSubscription",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20200801/Subscription/GetSubscription")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSubscriptionRequest::builder)
                .basePath("/20200801")
                .appendPathParam("subscriptions")
                .appendPathParam(request.getSubscriptionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.Subscription.class,
                        GetSubscriptionResponse.Builder::subscription)
                .handleResponseHeaderString(
                        "opc-request-id", GetSubscriptionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetSubscriptionResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetSubscriptionMappingResponse getSubscriptionMapping(
            GetSubscriptionMappingRequest request) {

        Validate.notBlank(
                request.getSubscriptionMappingId(), "subscriptionMappingId must not be blank");

        return clientCall(request, GetSubscriptionMappingResponse::builder)
                .logger(LOG, "getSubscriptionMapping")
                .serviceDetails(
                        "Subscription",
                        "GetSubscriptionMapping",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20200801/SubscriptionMapping/GetSubscriptionMapping")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSubscriptionMappingRequest::builder)
                .basePath("/20200801")
                .appendPathParam("subscriptionMappings")
                .appendPathParam(request.getSubscriptionMappingId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.SubscriptionMapping.class,
                        GetSubscriptionMappingResponse.Builder::subscriptionMapping)
                .handleResponseHeaderString(
                        "opc-request-id", GetSubscriptionMappingResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetSubscriptionMappingResponse.Builder::etag)
                .callSync();
    }

    @Override
    public ListAssignedSubscriptionsResponse listAssignedSubscriptions(
            ListAssignedSubscriptionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAssignedSubscriptionsResponse::builder)
                .logger(LOG, "listAssignedSubscriptions")
                .serviceDetails(
                        "Subscription",
                        "ListAssignedSubscriptions",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20200801/AssignedSubscription/ListAssignedSubscriptions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAssignedSubscriptionsRequest::builder)
                .basePath("/20200801")
                .appendPathParam("assignedSubscriptions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("subscriptionId", request.getSubscriptionId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model
                                .AssignedSubscriptionCollection.class,
                        ListAssignedSubscriptionsResponse.Builder::assignedSubscriptionCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListAssignedSubscriptionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListAssignedSubscriptionsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListAvailableRegionsResponse listAvailableRegions(ListAvailableRegionsRequest request) {

        Validate.notBlank(request.getSubscriptionId(), "subscriptionId must not be blank");

        return clientCall(request, ListAvailableRegionsResponse::builder)
                .logger(LOG, "listAvailableRegions")
                .serviceDetails(
                        "Subscription",
                        "ListAvailableRegions",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20200801/Subscription/ListAvailableRegions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAvailableRegionsRequest::builder)
                .basePath("/20200801")
                .appendPathParam("subscriptions")
                .appendPathParam(request.getSubscriptionId())
                .appendPathParam("availableRegions")
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.AvailableRegionCollection
                                .class,
                        ListAvailableRegionsResponse.Builder::availableRegionCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListAvailableRegionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListAvailableRegionsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListSubscriptionMappingsResponse listSubscriptionMappings(
            ListSubscriptionMappingsRequest request) {
        Objects.requireNonNull(request.getSubscriptionId(), "subscriptionId is required");

        return clientCall(request, ListSubscriptionMappingsResponse::builder)
                .logger(LOG, "listSubscriptionMappings")
                .serviceDetails(
                        "Subscription",
                        "ListSubscriptionMappings",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20200801/SubscriptionMapping/ListSubscriptionMappings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSubscriptionMappingsRequest::builder)
                .basePath("/20200801")
                .appendPathParam("subscriptionMappings")
                .appendQueryParam("subscriptionId", request.getSubscriptionId())
                .appendQueryParam("subscriptionMappingId", request.getSubscriptionMappingId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.SubscriptionMappingCollection
                                .class,
                        ListSubscriptionMappingsResponse.Builder::subscriptionMappingCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListSubscriptionMappingsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSubscriptionMappingsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListSubscriptionsResponse listSubscriptions(ListSubscriptionsRequest request) {

        return clientCall(request, ListSubscriptionsResponse::builder)
                .logger(LOG, "listSubscriptions")
                .serviceDetails(
                        "Subscription",
                        "ListSubscriptions",
                        "https://docs.oracle.com/iaas/api/#/en/organizations/20200801/Subscription/ListSubscriptions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSubscriptionsRequest::builder)
                .basePath("/20200801")
                .appendPathParam("subscriptions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("subscriptionId", request.getSubscriptionId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.tenantmanagercontrolplane.model.SubscriptionCollection.class,
                        ListSubscriptionsResponse.Builder::subscriptionCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListSubscriptionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSubscriptionsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public SubscriptionWaiters getWaiters() {
        return waiters;
    }

    @Override
    public SubscriptionPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public SubscriptionClient(
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
    public SubscriptionClient(
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
    public SubscriptionClient(
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
    public SubscriptionClient(
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
    public SubscriptionClient(
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
    public SubscriptionClient(
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
    public SubscriptionClient(
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
    public SubscriptionClient(
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
