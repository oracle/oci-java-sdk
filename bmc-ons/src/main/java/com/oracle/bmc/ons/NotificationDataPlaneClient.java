/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ons;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.ons.requests.*;
import com.oracle.bmc.ons.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class NotificationDataPlaneClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements NotificationDataPlane {
    /** Service instance for NotificationDataPlane. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("NOTIFICATIONDATAPLANE")
                    .serviceEndpointPrefix("notification")
                    .serviceEndpointTemplate("https://notification.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(NotificationDataPlaneAsyncClient.class);

    private final NotificationDataPlaneWaiters waiters;

    private final NotificationDataPlanePaginators paginators;

    private NotificationDataPlaneClient(
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
                                    .nameFormat("NotificationDataPlane-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new NotificationDataPlaneWaiters(executorService, this);

        this.paginators = new NotificationDataPlanePaginators(this);
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
                    Builder, NotificationDataPlaneClient> {
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
        public NotificationDataPlaneClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new NotificationDataPlaneClient(
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
    public ChangeSubscriptionCompartmentResponse changeSubscriptionCompartment(
            ChangeSubscriptionCompartmentRequest request) {

        Validate.notBlank(request.getSubscriptionId(), "subscriptionId must not be blank");
        Objects.requireNonNull(
                request.getChangeSubscriptionCompartmentDetails(),
                "changeSubscriptionCompartmentDetails is required");

        return clientCall(request, ChangeSubscriptionCompartmentResponse::builder)
                .logger(LOG, "changeSubscriptionCompartment")
                .serviceDetails(
                        "NotificationDataPlane",
                        "ChangeSubscriptionCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/notification/20181201/Subscription/ChangeSubscriptionCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeSubscriptionCompartmentRequest::builder)
                .basePath("/20181201")
                .appendPathParam("subscriptions")
                .appendPathParam(request.getSubscriptionId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeSubscriptionCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateSubscriptionResponse createSubscription(CreateSubscriptionRequest request) {
        Objects.requireNonNull(
                request.getCreateSubscriptionDetails(), "createSubscriptionDetails is required");

        return clientCall(request, CreateSubscriptionResponse::builder)
                .logger(LOG, "createSubscription")
                .serviceDetails(
                        "NotificationDataPlane",
                        "CreateSubscription",
                        "https://docs.oracle.com/iaas/api/#/en/notification/20181201/Subscription/CreateSubscription")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSubscriptionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("subscriptions")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ons.model.Subscription.class,
                        CreateSubscriptionResponse.Builder::subscription)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSubscriptionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateSubscriptionResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteSubscriptionResponse deleteSubscription(DeleteSubscriptionRequest request) {

        Validate.notBlank(request.getSubscriptionId(), "subscriptionId must not be blank");

        return clientCall(request, DeleteSubscriptionResponse::builder)
                .logger(LOG, "deleteSubscription")
                .serviceDetails(
                        "NotificationDataPlane",
                        "DeleteSubscription",
                        "https://docs.oracle.com/iaas/api/#/en/notification/20181201/Subscription/DeleteSubscription")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSubscriptionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("subscriptions")
                .appendPathParam(request.getSubscriptionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSubscriptionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetConfirmSubscriptionResponse getConfirmSubscription(
            GetConfirmSubscriptionRequest request) {

        Validate.notBlank(request.getId(), "id must not be blank");
        Objects.requireNonNull(request.getToken(), "token is required");

        Objects.requireNonNull(request.getProtocol(), "protocol is required");

        return clientCall(request, GetConfirmSubscriptionResponse::builder)
                .logger(LOG, "getConfirmSubscription")
                .serviceDetails(
                        "NotificationDataPlane",
                        "GetConfirmSubscription",
                        "https://docs.oracle.com/iaas/api/#/en/notification/20181201/Subscription/GetConfirmSubscription")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConfirmSubscriptionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("subscriptions")
                .appendPathParam(request.getId())
                .appendPathParam("confirmation")
                .appendQueryParam("token", request.getToken())
                .appendQueryParam("protocol", request.getProtocol())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ons.model.ConfirmationResult.class,
                        GetConfirmSubscriptionResponse.Builder::confirmationResult)
                .handleResponseHeaderString(
                        "opc-request-id", GetConfirmSubscriptionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetConfirmSubscriptionResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetSubscriptionResponse getSubscription(GetSubscriptionRequest request) {

        Validate.notBlank(request.getSubscriptionId(), "subscriptionId must not be blank");

        return clientCall(request, GetSubscriptionResponse::builder)
                .logger(LOG, "getSubscription")
                .serviceDetails(
                        "NotificationDataPlane",
                        "GetSubscription",
                        "https://docs.oracle.com/iaas/api/#/en/notification/20181201/Subscription/GetSubscription")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSubscriptionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("subscriptions")
                .appendPathParam(request.getSubscriptionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ons.model.Subscription.class,
                        GetSubscriptionResponse.Builder::subscription)
                .handleResponseHeaderString(
                        "opc-request-id", GetSubscriptionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetSubscriptionResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetUnsubscriptionResponse getUnsubscription(GetUnsubscriptionRequest request) {

        Validate.notBlank(request.getId(), "id must not be blank");
        Objects.requireNonNull(request.getToken(), "token is required");

        Objects.requireNonNull(request.getProtocol(), "protocol is required");

        return clientCall(request, GetUnsubscriptionResponse::builder)
                .logger(LOG, "getUnsubscription")
                .serviceDetails(
                        "NotificationDataPlane",
                        "GetUnsubscription",
                        "https://docs.oracle.com/iaas/api/#/en/notification/20181201/Subscription/GetUnsubscription")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetUnsubscriptionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("subscriptions")
                .appendPathParam(request.getId())
                .appendPathParam("unsubscription")
                .appendQueryParam("token", request.getToken())
                .appendQueryParam("protocol", request.getProtocol())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(String.class, GetUnsubscriptionResponse.Builder::value)
                .handleResponseHeaderString(
                        "opc-request-id", GetUnsubscriptionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListSubscriptionsResponse listSubscriptions(ListSubscriptionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListSubscriptionsResponse::builder)
                .logger(LOG, "listSubscriptions")
                .serviceDetails(
                        "NotificationDataPlane",
                        "ListSubscriptions",
                        "https://docs.oracle.com/iaas/api/#/en/notification/20181201/Subscription/ListSubscriptions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSubscriptionsRequest::builder)
                .basePath("/20181201")
                .appendPathParam("subscriptions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("topicId", request.getTopicId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.ons.model.SubscriptionSummary.class,
                        ListSubscriptionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListSubscriptionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListSubscriptionsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public PublishMessageResponse publishMessage(PublishMessageRequest request) {

        Validate.notBlank(request.getTopicId(), "topicId must not be blank");
        Objects.requireNonNull(request.getMessageDetails(), "messageDetails is required");

        return clientCall(request, PublishMessageResponse::builder)
                .logger(LOG, "publishMessage")
                .serviceDetails(
                        "NotificationDataPlane",
                        "PublishMessage",
                        "https://docs.oracle.com/iaas/api/#/en/notification/20181201/NotificationTopic/PublishMessage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PublishMessageRequest::builder)
                .basePath("/20181201")
                .appendPathParam("topics")
                .appendPathParam(request.getTopicId())
                .appendPathParam("messages")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendEnumHeader("messageType", request.getMessageType())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ons.model.PublishResult.class,
                        PublishMessageResponse.Builder::publishResult)
                .handleResponseHeaderString(
                        "opc-request-id", PublishMessageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ResendSubscriptionConfirmationResponse resendSubscriptionConfirmation(
            ResendSubscriptionConfirmationRequest request) {

        Validate.notBlank(request.getId(), "id must not be blank");

        return clientCall(request, ResendSubscriptionConfirmationResponse::builder)
                .logger(LOG, "resendSubscriptionConfirmation")
                .serviceDetails(
                        "NotificationDataPlane",
                        "ResendSubscriptionConfirmation",
                        "https://docs.oracle.com/iaas/api/#/en/notification/20181201/Subscription/ResendSubscriptionConfirmation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ResendSubscriptionConfirmationRequest::builder)
                .basePath("/20181201")
                .appendPathParam("subscriptions")
                .appendPathParam(request.getId())
                .appendPathParam("resendConfirmation")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ons.model.Subscription.class,
                        ResendSubscriptionConfirmationResponse.Builder::subscription)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ResendSubscriptionConfirmationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateSubscriptionResponse updateSubscription(UpdateSubscriptionRequest request) {

        Validate.notBlank(request.getSubscriptionId(), "subscriptionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateSubscriptionDetails(), "updateSubscriptionDetails is required");

        return clientCall(request, UpdateSubscriptionResponse::builder)
                .logger(LOG, "updateSubscription")
                .serviceDetails(
                        "NotificationDataPlane",
                        "UpdateSubscription",
                        "https://docs.oracle.com/iaas/api/#/en/notification/20181201/Subscription/UpdateSubscription")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSubscriptionRequest::builder)
                .basePath("/20181201")
                .appendPathParam("subscriptions")
                .appendPathParam(request.getSubscriptionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ons.model.UpdateSubscriptionDetails.class,
                        UpdateSubscriptionResponse.Builder::updateSubscriptionDetails)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSubscriptionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateSubscriptionResponse.Builder::etag)
                .callSync();
    }

    @Override
    public NotificationDataPlaneWaiters getWaiters() {
        return waiters;
    }

    @Override
    public NotificationDataPlanePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public NotificationDataPlaneClient(
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
    public NotificationDataPlaneClient(
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
    public NotificationDataPlaneClient(
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
    public NotificationDataPlaneClient(
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
    public NotificationDataPlaneClient(
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
    public NotificationDataPlaneClient(
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
    public NotificationDataPlaneClient(
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
    public NotificationDataPlaneClient(
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
