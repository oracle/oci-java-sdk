/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.apigateway.requests.*;
import com.oracle.bmc.apigateway.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
public class SubscribersClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements Subscribers {
    /** Service instance for Subscribers. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("SUBSCRIBERS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://apigateway.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SubscribersClient.class);

    private final SubscribersWaiters waiters;

    private final SubscribersPaginators paginators;

    SubscribersClient(
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
                                    .nameFormat("Subscribers-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new SubscribersWaiters(executorService, this);

        this.paginators = new SubscribersPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, SubscribersClient> {
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
        public SubscribersClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new SubscribersClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeSubscriberCompartmentResponse changeSubscriberCompartment(
            ChangeSubscriberCompartmentRequest request) {

        Validate.notBlank(request.getSubscriberId(), "subscriberId must not be blank");
        Objects.requireNonNull(
                request.getChangeSubscriberCompartmentDetails(),
                "changeSubscriberCompartmentDetails is required");

        return clientCall(request, ChangeSubscriberCompartmentResponse::builder)
                .logger(LOG, "changeSubscriberCompartment")
                .serviceDetails(
                        "Subscribers",
                        "ChangeSubscriberCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Subscriber/ChangeSubscriberCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSubscriberCompartmentRequest::builder)
                .basePath("/20190501")
                .appendPathParam("subscribers")
                .appendPathParam(request.getSubscriberId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeSubscriberCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeSubscriberCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateSubscriberResponse createSubscriber(CreateSubscriberRequest request) {
        Objects.requireNonNull(
                request.getCreateSubscriberDetails(), "createSubscriberDetails is required");

        return clientCall(request, CreateSubscriberResponse::builder)
                .logger(LOG, "createSubscriber")
                .serviceDetails("Subscribers", "CreateSubscriber", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSubscriberRequest::builder)
                .basePath("/20190501")
                .appendPathParam("subscribers")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apigateway.model.Subscriber.class,
                        CreateSubscriberResponse.Builder::subscriber)
                .handleResponseHeaderString("etag", CreateSubscriberResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateSubscriberResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSubscriberResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", CreateSubscriberResponse.Builder::location)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteSubscriberResponse deleteSubscriber(DeleteSubscriberRequest request) {

        Validate.notBlank(request.getSubscriberId(), "subscriberId must not be blank");

        return clientCall(request, DeleteSubscriberResponse::builder)
                .logger(LOG, "deleteSubscriber")
                .serviceDetails(
                        "Subscribers",
                        "DeleteSubscriber",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Subscriber/DeleteSubscriber")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSubscriberRequest::builder)
                .basePath("/20190501")
                .appendPathParam("subscribers")
                .appendPathParam(request.getSubscriberId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteSubscriberResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSubscriberResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetSubscriberResponse getSubscriber(GetSubscriberRequest request) {

        Validate.notBlank(request.getSubscriberId(), "subscriberId must not be blank");

        return clientCall(request, GetSubscriberResponse::builder)
                .logger(LOG, "getSubscriber")
                .serviceDetails(
                        "Subscribers",
                        "GetSubscriber",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Subscriber/GetSubscriber")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSubscriberRequest::builder)
                .basePath("/20190501")
                .appendPathParam("subscribers")
                .appendPathParam(request.getSubscriberId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apigateway.model.Subscriber.class,
                        GetSubscriberResponse.Builder::subscriber)
                .handleResponseHeaderString("etag", GetSubscriberResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSubscriberResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListSubscribersResponse listSubscribers(ListSubscribersRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSubscribersResponse::builder)
                .logger(LOG, "listSubscribers")
                .serviceDetails(
                        "Subscribers",
                        "ListSubscribers",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Subscriber/ListSubscribers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSubscribersRequest::builder)
                .basePath("/20190501")
                .appendPathParam("subscribers")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apigateway.model.SubscriberCollection.class,
                        ListSubscribersResponse.Builder::subscriberCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSubscribersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSubscribersResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListSubscribersResponse.Builder::opcPrevPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateSubscriberResponse updateSubscriber(UpdateSubscriberRequest request) {

        Validate.notBlank(request.getSubscriberId(), "subscriberId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSubscriberDetails(), "updateSubscriberDetails is required");

        return clientCall(request, UpdateSubscriberResponse::builder)
                .logger(LOG, "updateSubscriber")
                .serviceDetails(
                        "Subscribers",
                        "UpdateSubscriber",
                        "https://docs.oracle.com/iaas/api/#/en/api-gateway/20190501/Subscriber/UpdateSubscriber")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSubscriberRequest::builder)
                .basePath("/20190501")
                .appendPathParam("subscribers")
                .appendPathParam(request.getSubscriberId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateSubscriberResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSubscriberResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public SubscribersWaiters getWaiters() {
        return waiters;
    }

    @Override
    public SubscribersPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public SubscribersClient(
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
    public SubscribersClient(
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
    public SubscribersClient(
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
    public SubscribersClient(
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
    public SubscribersClient(
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
    public SubscribersClient(
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
    public SubscribersClient(
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
    public SubscribersClient(
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
