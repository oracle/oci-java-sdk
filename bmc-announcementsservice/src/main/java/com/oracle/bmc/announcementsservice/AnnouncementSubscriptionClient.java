/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.announcementsservice.requests.*;
import com.oracle.bmc.announcementsservice.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
public class AnnouncementSubscriptionClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements AnnouncementSubscription {
    /** Service instance for AnnouncementSubscription. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ANNOUNCEMENTSUBSCRIPTION")
                    .serviceEndpointPrefix("announcements")
                    .serviceEndpointTemplate("https://announcements.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AnnouncementSubscriptionClient.class);

    private final AnnouncementSubscriptionWaiters waiters;

    private final AnnouncementSubscriptionPaginators paginators;

    private AnnouncementSubscriptionClient(
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
                                    .nameFormat("AnnouncementSubscription-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new AnnouncementSubscriptionWaiters(executorService, this);

        this.paginators = new AnnouncementSubscriptionPaginators(this);
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
                    Builder, AnnouncementSubscriptionClient> {
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
        public AnnouncementSubscriptionClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new AnnouncementSubscriptionClient(
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
    public ChangeAnnouncementSubscriptionCompartmentResponse
            changeAnnouncementSubscriptionCompartment(
                    ChangeAnnouncementSubscriptionCompartmentRequest request) {

        Validate.notBlank(
                request.getAnnouncementSubscriptionId(),
                "announcementSubscriptionId must not be blank");
        Objects.requireNonNull(
                request.getChangeAnnouncementSubscriptionCompartmentDetails(),
                "changeAnnouncementSubscriptionCompartmentDetails is required");

        return clientCall(request, ChangeAnnouncementSubscriptionCompartmentResponse::builder)
                .logger(LOG, "changeAnnouncementSubscriptionCompartment")
                .serviceDetails(
                        "AnnouncementSubscription",
                        "ChangeAnnouncementSubscriptionCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementSubscription/ChangeAnnouncementSubscriptionCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAnnouncementSubscriptionCompartmentRequest::builder)
                .basePath("/20180904")
                .appendPathParam("announcementSubscriptions")
                .appendPathParam(request.getAnnouncementSubscriptionId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAnnouncementSubscriptionCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", ChangeAnnouncementSubscriptionCompartmentResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateAnnouncementSubscriptionResponse createAnnouncementSubscription(
            CreateAnnouncementSubscriptionRequest request) {
        Objects.requireNonNull(
                request.getCreateAnnouncementSubscriptionDetails(),
                "createAnnouncementSubscriptionDetails is required");

        return clientCall(request, CreateAnnouncementSubscriptionResponse::builder)
                .logger(LOG, "createAnnouncementSubscription")
                .serviceDetails(
                        "AnnouncementSubscription",
                        "CreateAnnouncementSubscription",
                        "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementSubscription/CreateAnnouncementSubscription")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAnnouncementSubscriptionRequest::builder)
                .basePath("/20180904")
                .appendPathParam("announcementSubscriptions")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.announcementsservice.model.AnnouncementSubscription.class,
                        CreateAnnouncementSubscriptionResponse.Builder::announcementSubscription)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateAnnouncementSubscriptionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateAnnouncementSubscriptionResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateFilterGroupResponse createFilterGroup(CreateFilterGroupRequest request) {

        Validate.notBlank(
                request.getAnnouncementSubscriptionId(),
                "announcementSubscriptionId must not be blank");
        Objects.requireNonNull(
                request.getCreateFilterGroupDetails(), "createFilterGroupDetails is required");

        return clientCall(request, CreateFilterGroupResponse::builder)
                .logger(LOG, "createFilterGroup")
                .serviceDetails(
                        "AnnouncementSubscription",
                        "CreateFilterGroup",
                        "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementSubscription/CreateFilterGroup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateFilterGroupRequest::builder)
                .basePath("/20180904")
                .appendPathParam("announcementSubscriptions")
                .appendPathParam(request.getAnnouncementSubscriptionId())
                .appendPathParam("filterGroups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.announcementsservice.model.FilterGroup.class,
                        CreateFilterGroupResponse.Builder::filterGroup)
                .handleResponseHeaderString(
                        "opc-request-id", CreateFilterGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateFilterGroupResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteAnnouncementSubscriptionResponse deleteAnnouncementSubscription(
            DeleteAnnouncementSubscriptionRequest request) {

        Validate.notBlank(
                request.getAnnouncementSubscriptionId(),
                "announcementSubscriptionId must not be blank");

        return clientCall(request, DeleteAnnouncementSubscriptionResponse::builder)
                .logger(LOG, "deleteAnnouncementSubscription")
                .serviceDetails(
                        "AnnouncementSubscription",
                        "DeleteAnnouncementSubscription",
                        "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementSubscription/DeleteAnnouncementSubscription")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAnnouncementSubscriptionRequest::builder)
                .basePath("/20180904")
                .appendPathParam("announcementSubscriptions")
                .appendPathParam(request.getAnnouncementSubscriptionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteAnnouncementSubscriptionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteFilterGroupResponse deleteFilterGroup(DeleteFilterGroupRequest request) {

        Validate.notBlank(
                request.getAnnouncementSubscriptionId(),
                "announcementSubscriptionId must not be blank");

        Validate.notBlank(request.getFilterGroupName(), "filterGroupName must not be blank");

        return clientCall(request, DeleteFilterGroupResponse::builder)
                .logger(LOG, "deleteFilterGroup")
                .serviceDetails(
                        "AnnouncementSubscription",
                        "DeleteFilterGroup",
                        "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementSubscription/DeleteFilterGroup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteFilterGroupRequest::builder)
                .basePath("/20180904")
                .appendPathParam("announcementSubscriptions")
                .appendPathParam(request.getAnnouncementSubscriptionId())
                .appendPathParam("filterGroups")
                .appendPathParam(request.getFilterGroupName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteFilterGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", DeleteFilterGroupResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetAnnouncementSubscriptionResponse getAnnouncementSubscription(
            GetAnnouncementSubscriptionRequest request) {

        Validate.notBlank(
                request.getAnnouncementSubscriptionId(),
                "announcementSubscriptionId must not be blank");

        return clientCall(request, GetAnnouncementSubscriptionResponse::builder)
                .logger(LOG, "getAnnouncementSubscription")
                .serviceDetails(
                        "AnnouncementSubscription",
                        "GetAnnouncementSubscription",
                        "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementSubscription/GetAnnouncementSubscription")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAnnouncementSubscriptionRequest::builder)
                .basePath("/20180904")
                .appendPathParam("announcementSubscriptions")
                .appendPathParam(request.getAnnouncementSubscriptionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.announcementsservice.model.AnnouncementSubscription.class,
                        GetAnnouncementSubscriptionResponse.Builder::announcementSubscription)
                .handleResponseHeaderString(
                        "etag", GetAnnouncementSubscriptionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAnnouncementSubscriptionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListAnnouncementSubscriptionsResponse listAnnouncementSubscriptions(
            ListAnnouncementSubscriptionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAnnouncementSubscriptionsResponse::builder)
                .logger(LOG, "listAnnouncementSubscriptions")
                .serviceDetails(
                        "AnnouncementSubscription",
                        "ListAnnouncementSubscriptions",
                        "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementSubscriptionCollection/ListAnnouncementSubscriptions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAnnouncementSubscriptionsRequest::builder)
                .basePath("/20180904")
                .appendPathParam("announcementSubscriptions")
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
                .handleBody(
                        com.oracle.bmc.announcementsservice.model.AnnouncementSubscriptionCollection
                                .class,
                        ListAnnouncementSubscriptionsResponse.Builder
                                ::announcementSubscriptionCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAnnouncementSubscriptionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAnnouncementSubscriptionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateAnnouncementSubscriptionResponse updateAnnouncementSubscription(
            UpdateAnnouncementSubscriptionRequest request) {

        Validate.notBlank(
                request.getAnnouncementSubscriptionId(),
                "announcementSubscriptionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAnnouncementSubscriptionDetails(),
                "updateAnnouncementSubscriptionDetails is required");

        return clientCall(request, UpdateAnnouncementSubscriptionResponse::builder)
                .logger(LOG, "updateAnnouncementSubscription")
                .serviceDetails(
                        "AnnouncementSubscription",
                        "UpdateAnnouncementSubscription",
                        "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementSubscription/UpdateAnnouncementSubscription")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAnnouncementSubscriptionRequest::builder)
                .basePath("/20180904")
                .appendPathParam("announcementSubscriptions")
                .appendPathParam(request.getAnnouncementSubscriptionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.announcementsservice.model.AnnouncementSubscription.class,
                        UpdateAnnouncementSubscriptionResponse.Builder::announcementSubscription)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateAnnouncementSubscriptionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateAnnouncementSubscriptionResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateFilterGroupResponse updateFilterGroup(UpdateFilterGroupRequest request) {

        Validate.notBlank(
                request.getAnnouncementSubscriptionId(),
                "announcementSubscriptionId must not be blank");

        Validate.notBlank(request.getFilterGroupName(), "filterGroupName must not be blank");
        Objects.requireNonNull(
                request.getUpdateFilterGroupDetails(), "updateFilterGroupDetails is required");

        return clientCall(request, UpdateFilterGroupResponse::builder)
                .logger(LOG, "updateFilterGroup")
                .serviceDetails(
                        "AnnouncementSubscription",
                        "UpdateFilterGroup",
                        "https://docs.oracle.com/iaas/api/#/en/announcements/0.0.1/AnnouncementSubscription/UpdateFilterGroup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateFilterGroupRequest::builder)
                .basePath("/20180904")
                .appendPathParam("announcementSubscriptions")
                .appendPathParam(request.getAnnouncementSubscriptionId())
                .appendPathParam("filterGroups")
                .appendPathParam(request.getFilterGroupName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.announcementsservice.model.FilterGroup.class,
                        UpdateFilterGroupResponse.Builder::filterGroup)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateFilterGroupResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateFilterGroupResponse.Builder::etag)
                .callSync();
    }

    @Override
    public AnnouncementSubscriptionWaiters getWaiters() {
        return waiters;
    }

    @Override
    public AnnouncementSubscriptionPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AnnouncementSubscriptionClient(
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
    public AnnouncementSubscriptionClient(
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
    public AnnouncementSubscriptionClient(
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
    public AnnouncementSubscriptionClient(
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
    public AnnouncementSubscriptionClient(
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
    public AnnouncementSubscriptionClient(
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
    public AnnouncementSubscriptionClient(
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
    public AnnouncementSubscriptionClient(
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
